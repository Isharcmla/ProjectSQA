package org.apache.commons.math3.distribution;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import org.apache.commons.math3.exception.DimensionMismatchException;
import static org.apache.commons.math3.distribution.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MultivariateNormalDistribution_init_13906776429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45;
     Object term48;

    public MultivariateNormalDistribution_init_13906776429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45 = (double[]) newDoubleArray(2);
        setDoubleElement(term45, 0, 0.7332741045694002);
        setDoubleElement(term45, 1, 0.4569171842750229);
        term48 = (Object[]) newArray("[D", 6);
        double[] term49 = (double[]) newDoubleArray(7);
        double[] term57 = (double[]) newDoubleArray(1);
        double[] term59 = (double[]) newDoubleArray(6);
        double[] term66 = (double[]) newDoubleArray(5);
        double[] term72 = (double[]) newDoubleArray(5);
        double[] term78 = (double[]) newDoubleArray(2);
        setDoubleElement(term49, 0, 0.8598297828918529);
        setDoubleElement(term49, 1, 0.43692187681405226);
        setDoubleElement(term49, 2, 0.7633268466829064);
        setDoubleElement(term49, 3, 0.13481025392611334);
        setDoubleElement(term49, 4, 0.3800088629986428);
        setDoubleElement(term49, 5, 0.5840714198152577);
        setDoubleElement(term49, 6, 0.7559240768573477);
        setElement(term48, 0, term49);
        setDoubleElement(term57, 0, 0.10667076642995188);
        setElement(term48, 1, term57);
        setDoubleElement(term59, 0, 0.11493000848982304);
        setDoubleElement(term59, 1, 0.37161417339133307);
        setDoubleElement(term59, 2, 0.6805867182029153);
        setDoubleElement(term59, 3, 0.2852810965221698);
        setDoubleElement(term59, 4, 0.6300849762307866);
        setDoubleElement(term59, 5, 0.9737083944266686);
        setElement(term48, 2, term59);
        setDoubleElement(term66, 0, 0.0668892744806211);
        setDoubleElement(term66, 1, 0.3587267442738795);
        setDoubleElement(term66, 2, 0.07802449704920456);
        setDoubleElement(term66, 3, 0.5279279537140873);
        setDoubleElement(term66, 4, 0.3202192021706908);
        setElement(term48, 3, term66);
        setDoubleElement(term72, 0, 0.22651340641904605);
        setDoubleElement(term72, 1, 0.8878841294187743);
        setDoubleElement(term72, 2, 0.6588948704887806);
        setDoubleElement(term72, 3, 0.6397214730945112);
        setDoubleElement(term72, 4, 0.25937345430928016);
        setElement(term48, 4, term72);
        setDoubleElement(term78, 0, 0.5873228247510078);
        setDoubleElement(term78, 1, 0.8823181080774973);
        setElement(term48, 5, term78);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.MultivariateNormalDistribution");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.math3.random.RandomGenerator");
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        argTypes[2] = Array.newInstance(Array.newInstance(double.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term45;
        args[2] = term48;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (DimensionMismatchException e) {
        }

    }

};


