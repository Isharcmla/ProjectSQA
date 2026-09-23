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

public class MathArrays_distance_63266471351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143;
     Object term144;
     Object term6814;
     Object term6815;

    public MathArrays_distance_63266471351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143 = (int[]) newIntArray(0);
        term144 = (int[]) newIntArray(2);
        setIntElement(term144, 0, -2038273078);
        setIntElement(term144, 1, 1227103734);
        term6814 = (int[]) newIntArray(0);
        term6815 = (int[]) newIntArray(2);
        setIntElement(term6815, 0, -2038273078);
        setIntElement(term6815, 1, 1227103734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.util.MathArrays");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term143;
        args[1] = term144;
        Object retValue = callMethod(klass, "distance", argTypes, null, args);
        assertTrue(recursiveEquals(term143, term6814));
        assertTrue(recursiveEquals(term144, term6815));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


