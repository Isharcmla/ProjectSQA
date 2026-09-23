package org.apache.commons.math.linear;

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
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ArrayRealVector_ebeMultiply_33841785953 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222;
     Object term224;

    public ArrayRealVector_ebeMultiply_33841785953() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term222 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term223 = (double[]) newDoubleArray(0);
        setField(term222, term222.getClass(), "data", term223);
        term224 = (double[]) newDoubleArray(5);
        setDoubleElement(term224, 0, 0.8823181080774973);
        setDoubleElement(term224, 1, 0.2192450926212024);
        setDoubleElement(term224, 2, 0.7591353014991907);
        setDoubleElement(term224, 3, 0.791695029600875);
        setDoubleElement(term224, 4, 0.6862221294683138);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term224;
        callMethod(klass, "ebeMultiply", argTypes, term222, args);
    }

};


