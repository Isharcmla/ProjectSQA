package org.apache.commons.math.util;

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
import static org.apache.commons.math.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;

public class FastMath_exp_175800352912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21;
     Object term23;
     Object term25;

    public FastMath_exp_175800352912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21 = new Double(0.8474802076607362);
        term23 = new Double(0.5183269973490326);
        term25 = (double[]) newDoubleArray(5);
        setDoubleElement(term25, 0, 0.7655020693602768);
        setDoubleElement(term25, 1, 0.1374549299694151);
        setDoubleElement(term25, 2, 0.7031006357544823);
        setDoubleElement(term25, 3, 0.9527281779865117);
        setDoubleElement(term25, 4, 0.9828442029246764);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.util.FastMath");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        argTypes[2] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term21;
        args[1] = term23;
        args[2] = term25;
        callMethod(klass, "exp", argTypes, null, args);
    }

};


