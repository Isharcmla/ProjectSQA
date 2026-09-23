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
import static org.apache.commons.math.linear.EqualityUtils.*;

public class ArrayRealVector_init_562471668117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70;
     Object term72;
     Object term3992;
     Object term3994;
     Object term3996;

    public ArrayRealVector_init_562471668117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term71 = (double[]) newDoubleArray(0);
        setField(term70, term70.getClass(), "data", term71);
        term72 = (double[]) newDoubleArray(6);
        setDoubleElement(term72, 0, 0.1374549299694151);
        setDoubleElement(term72, 1, 0.7031006357544823);
        setDoubleElement(term72, 2, 0.9527281779865117);
        setDoubleElement(term72, 3, 0.9828442029246764);
        setDoubleElement(term72, 4, 0.2779719046761513);
        setDoubleElement(term72, 5, 0.6436713023569729);
        term3992 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term3993 = (double[]) newDoubleArray(6);
        setDoubleElement(term3993, 0, 0.1374549299694151);
        setDoubleElement(term3993, 1, 0.7031006357544823);
        setDoubleElement(term3993, 2, 0.9527281779865117);
        setDoubleElement(term3993, 3, 0.9828442029246764);
        setDoubleElement(term3993, 4, 0.2779719046761513);
        setDoubleElement(term3993, 5, 0.6436713023569729);
        setField(term3992, term3992.getClass(), "data", term3993);
        term3994 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term3995 = (double[]) newDoubleArray(0);
        setField(term3994, term3994.getClass(), "data", term3995);
        term3996 = (double[]) newDoubleArray(6);
        setDoubleElement(term3996, 0, 0.1374549299694151);
        setDoubleElement(term3996, 1, 0.7031006357544823);
        setDoubleElement(term3996, 2, 0.9527281779865117);
        setDoubleElement(term3996, 3, 0.9828442029246764);
        setDoubleElement(term3996, 4, 0.2779719046761513);
        setDoubleElement(term3996, 5, 0.6436713023569729);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term70;
        args[1] = term72;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term3992));
        assertTrue(recursiveEquals(term70, term3994));
        assertTrue(recursiveEquals(term72, term3996));
    }

};


