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
import static org.apache.commons.math3.util.EqualityUtils.*;

public class MathArrays_equalsIncludingNaN_202022940275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2279;
     Object term2287;
     Object term19560;
     Object term19561;

    public MathArrays_equalsIncludingNaN_202022940275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2279 = (float[]) newFloatArray(7);
        setFloatElement(term2279, 0, 0.7944024F);
        setFloatElement(term2279, 1, 0.3692338F);
        setFloatElement(term2279, 2, 0.13906479F);
        setFloatElement(term2279, 3, 0.6076495F);
        setFloatElement(term2279, 4, 0.6608425F);
        setFloatElement(term2279, 5, 0.37773192F);
        setFloatElement(term2279, 6, 0.24413109F);
        term2287 = (float[]) newFloatArray(9);
        setFloatElement(term2287, 0, 0.8474802F);
        setFloatElement(term2287, 1, 0.9985961F);
        setFloatElement(term2287, 2, 0.51832694F);
        setFloatElement(term2287, 3, 0.97262454F);
        setFloatElement(term2287, 4, 0.76550204F);
        setFloatElement(term2287, 5, 0.26441735F);
        setFloatElement(term2287, 6, 0.13745493F);
        setFloatElement(term2287, 7, 0.20144695F);
        setFloatElement(term2287, 8, 0.7031006F);
        term19560 = (float[]) newFloatArray(7);
        setFloatElement(term19560, 0, 0.7944024F);
        setFloatElement(term19560, 1, 0.3692338F);
        setFloatElement(term19560, 2, 0.13906479F);
        setFloatElement(term19560, 3, 0.6076495F);
        setFloatElement(term19560, 4, 0.6608425F);
        setFloatElement(term19560, 5, 0.37773192F);
        setFloatElement(term19560, 6, 0.24413109F);
        term19561 = (float[]) newFloatArray(9);
        setFloatElement(term19561, 0, 0.8474802F);
        setFloatElement(term19561, 1, 0.9985961F);
        setFloatElement(term19561, 2, 0.51832694F);
        setFloatElement(term19561, 3, 0.97262454F);
        setFloatElement(term19561, 4, 0.76550204F);
        setFloatElement(term19561, 5, 0.26441735F);
        setFloatElement(term19561, 6, 0.13745493F);
        setFloatElement(term19561, 7, 0.20144695F);
        setFloatElement(term19561, 8, 0.7031006F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.util.MathArrays");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(float.class, 0).getClass();
        argTypes[1] = Array.newInstance(float.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term2279;
        args[1] = term2287;
        Object retValue = callMethod(klass, "equalsIncludingNaN", argTypes, null, args);
        assertTrue(recursiveEquals(term2279, term19560));
        assertTrue(recursiveEquals(term2287, term19561));
        assertTrue(recursiveEquals(retValue, false));
    }

};


