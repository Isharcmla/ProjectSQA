package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

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
import static org.apache.commons.math3.optim.nonlinear.scalar.noderiv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CMAESOptimizer_min_101719430034 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term611;

    public CMAESOptimizer_min_101719430034() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term611 = (double[]) newDoubleArray(9);
        setDoubleElement(term611, 0, 0.6782349539183316);
        setDoubleElement(term611, 1, 0.6464654528667407);
        setDoubleElement(term611, 2, 0.6416885379658445);
        setDoubleElement(term611, 3, 0.604465128384297);
        setDoubleElement(term611, 4, 0.5180566811475131);
        setDoubleElement(term611, 5, 0.6773553630262286);
        setDoubleElement(term611, 6, 0.0416412064984476);
        setDoubleElement(term611, 7, 0.9188322321077216);
        setDoubleElement(term611, 8, 0.8046904246652031);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term611;
        callMethod(klass, "min", argTypes, null, args);
    }

};


