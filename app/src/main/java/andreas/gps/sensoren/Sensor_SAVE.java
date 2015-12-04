package andreas.gps.sensoren;

import android.util.Log;

/**
 * Created by Andreas on 10/11/2015.
 */
public class Sensor_SAVE extends SensorActor {
    private float magnx;
    private float magny;
    private float magnz;
    private float accelerox;
    private float acceleroy;
    private float acceleroz;
    private float gyroscoopx;
    private float gyroscoopy;
    private float gyroscoopz;
    private float prox;
    private float rotx;
    private float roty;
    private float rotz;
    private float licht;

    public float getMagnx() {
        return magnx;
    }

    public float getMagny() {
        return magny;
    }

    public float getMagnz() {
        return magnz;
    }

    public float getGyroscoopx() {
        return gyroscoopx;
    }

    public float getGyroscoopy() {
        return gyroscoopy;
    }

    public float getGyroscoopz() {
        return gyroscoopz;
    }

    public float getProx() {
        return prox;
    }

    public float getRotx() {
        return rotx;
    }

    public float getRoty() {
        return roty;
    }

    public float getRotz() {
        return rotz;
    }

    public float getLicht() {
        return licht;
    }

    public float getAccelerox() {
        return accelerox;
    }

    public float getAcceleroy() {
        return acceleroy;
    }

    public float getAcceleroz() {
        return acceleroz;
    }

    @Override
    public void Verwerk_Magn(float x, float y, float z, float timenu) {
        magnx=x;
        magny=y;
        magnz=z;
    }

    @Override
    public void Verwerk_Accelerometer(float x, float y, float z, float timenu) {
        accelerox=x;
        acceleroy=y;
        acceleroz=z;
    }

    @Override
    public void Verwerk_Gyroscoop(float x, float y, float z, float timenu) {
        gyroscoopx=x;
        gyroscoopy=y;
        gyroscoopz=z;
    }

    @Override
    public void verwerk_Prox(float x, float timenu) {
        prox=x;
    }

    @Override
    public void Verwerk_rot(float x, float y, float z, float timenu) {
        rotx=x;
        roty=y;
        rotz=z;
    }

    @Override
    public void Verwerk_licht(float x, float timenu) {
        licht=x;
    }
}
