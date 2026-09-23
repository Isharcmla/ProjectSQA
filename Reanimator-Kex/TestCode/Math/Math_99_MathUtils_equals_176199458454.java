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
import static org.apache.commons.math.util.EqualityUtils.*;

public class MathUtils_equals_176199458454 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59;
     Object term65;
     Object term2128;
     Object term2129;

    public MathUtils_equals_176199458454() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59 = (double[]) newDoubleArray(5);
        setDoubleElement(term59, 0, 0.2641345529914265);
        setDoubleElement(term59, 1, 0.36923381893433327);
        setDoubleElement(term59, 2, 0.6076495596892013);
        setDoubleElement(term59, 3, 0.37773193782763337);
        setDoubleElement(term59, 4, 0.8474802076607362);
        term65 = (double[]) newDoubleArray(4);
        setDoubleElement(term65, 0, 0.5183269973490326);
        setDoubleElement(term65, 1, 0.7655020693602768);
        setDoubleElement(term65, 2, 0.1374549299694151);
        setDoubleElement(term65, 3, 0.7031006357544823);
        term2128 = (double[]) newDoubleArray(5);
        setDoubleElement(term2128, 0, 0.2641345529914265);
        setDoubleElement(term2128, 1, 0.36923381893433327);
        setDoubleElement(term2128, 2, 0.6076495596892013);
        setDoubleElement(term2128, 3, 0.37773193782763337);
        setDoubleElement(term2128, 4, 0.8474802076607362);
        term2129 = (double[]) newDoubleArray(4);
        setDoubleElement(term2129, 0, 0.5183269973490326);
        setDoubleElement(term2129, 1, 0.7655020693602768);
        setDoubleElement(term2129, 2, 0.1374549299694151);
        setDoubleElement(term2129, 3, 0.7031006357544823);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.util.MathUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term59;
        args[1] = term65;
        Object retValue = callMethod(klass, "equals", argTypes, null, args);
        assertTrue(recursiveEquals(term59, term2128));
        assertTrue(recursiveEquals(term65, term2129));
        assertTrue(recursiveEquals(retValue, false));
    }

};


