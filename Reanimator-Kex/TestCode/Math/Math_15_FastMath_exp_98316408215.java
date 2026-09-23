package org.apache.commons.math3.util;

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
import static org.apache.commons.math3.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;

public class FastMath_exp_98316408215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27;
     Object term29;
     Object term31;

    public FastMath_exp_98316408215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27 = new Double(0.5183269973490326);
        term29 = new Double(0.7655020693602768);
        term31 = (double[]) newDoubleArray(5);
        setDoubleElement(term31, 0, 0.1374549299694151);
        setDoubleElement(term31, 1, 0.7031006357544823);
        setDoubleElement(term31, 2, 0.9527281779865117);
        setDoubleElement(term31, 3, 0.9828442029246764);
        setDoubleElement(term31, 4, 0.2779719046761513);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.util.FastMath");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        argTypes[2] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term27;
        args[1] = term29;
        args[2] = term31;
        callMethod(klass, "exp", argTypes, null, args);
    }

};


