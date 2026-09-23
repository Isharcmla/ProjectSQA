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
import java.lang.Object;

public class OpenMapRealVector_projection_63952051147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8867;
     Object term8974;

    public OpenMapRealVector_projection_63952051147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8867 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term8868 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term8869 = (int[]) newIntArray(32);
        double[] term8902 = (double[]) newDoubleArray(32);
        byte[] term8935 = (byte[]) newByteArray(32);
        setField(term8868, term8868.getClass(), "keys", term8869);
        setField(term8868, term8868.getClass(), "values", term8902);
        setField(term8868, term8868.getClass(), "states", term8935);
        setDoubleField(term8868, term8868.getClass(), "missingEntries", 0.0);
        setIntField(term8868, term8868.getClass(), "size", 0);
        setIntField(term8868, term8868.getClass(), "mask", 31);
        setIntField(term8868, term8868.getClass(), "count", 0);
        setField(term8867, term8867.getClass(), "entries", term8868);
        setIntField(term8867, term8867.getClass(), "virtualSize", 2055867847);
        setDoubleField(term8867, term8867.getClass(), "epsilon", 1.0E-12);
        term8974 = (double[]) newDoubleArray(5);
        setDoubleElement(term8974, 0, 0.8823181080774973);
        setDoubleElement(term8974, 1, 0.2192450926212024);
        setDoubleElement(term8974, 2, 0.7591353014991907);
        setDoubleElement(term8974, 3, 0.791695029600875);
        setDoubleElement(term8974, 4, 0.6862221294683138);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term8974;
        callMethod(klass, "projection", argTypes, term8867, args);
    }

};


