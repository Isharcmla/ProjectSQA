package org.apache.commons.math.stat.descriptive.moment;

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
import org.apache.commons.math.exception.DimensionMismatchException;
import static org.apache.commons.math.stat.descriptive.moment.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;

public class Variance_evaluate_122677449933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227;
     Object term240;
     Object term242;

    public Variance_evaluate_122677449933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term227 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        Object term228 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        double[] term236 = (double[]) newDoubleArray(3);
        setDoubleField(term228, term228.getClass(), "m2", Double.NaN);
        setLongField(term228, term228.getClass(), "n", 0L);
        setDoubleField(term228, term228.getClass(), "m1", Double.NaN);
        setDoubleField(term228, term228.getClass(), "dev", Double.NaN);
        setDoubleField(term228, term228.getClass(), "nDev", Double.NaN);
        setField(term228, term228.getClass(), "storedData", null);
        setField(term227, term227.getClass(), "moment", term228);
        setBooleanField(term227, term227.getClass(), "incMoment", true);
        setBooleanField(term227, term227.getClass(), "isBiasCorrected", true);
        setDoubleElement(term236, 0, 0.7919370314903882);
        setDoubleElement(term236, 1, 0.2109867221632754);
        setDoubleElement(term236, 2, 0.3227335400819148);
        setField(term227, term227.getClass(), "storedData", term236);
        term240 = (double[]) newDoubleArray(1);
        setDoubleElement(term240, 0, 0.43337207054070237);
        term242 = (double[]) newDoubleArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term240;
        args[1] = term242;
        try {
            callMethod(klass, "evaluate", argTypes, term227, args);
            assertTrue(false);
        }
        catch (DimensionMismatchException e) {
        }

    }

};


