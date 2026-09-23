package org.apache.commons.lang3;

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
import static org.apache.commons.lang3.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.EqualityUtils.*;
import java.lang.Float;

public class ArrayUtils_contains_1870992159261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1015;
     Object term1022;
     Object term13849;

    public ArrayUtils_contains_1870992159261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1015 = (float[]) newFloatArray(6);
        setFloatElement(term1015, 0, 0.541592F);
        setFloatElement(term1015, 1, 0.13481021F);
        setFloatElement(term1015, 2, 0.996533F);
        setFloatElement(term1015, 3, 0.38000882F);
        setFloatElement(term1015, 4, 0.10577053F);
        setFloatElement(term1015, 5, 0.5840714F);
        term1022 = new Float(0.478669F);
        term13849 = (float[]) newFloatArray(6);
        setFloatElement(term13849, 0, 0.541592F);
        setFloatElement(term13849, 1, 0.13481021F);
        setFloatElement(term13849, 2, 0.996533F);
        setFloatElement(term13849, 3, 0.38000882F);
        setFloatElement(term13849, 4, 0.10577053F);
        setFloatElement(term13849, 5, 0.5840714F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(float.class, 0).getClass();
        argTypes[1] = float.class;
        Object[] args = new Object[2];
        args[0] = term1015;
        args[1] = term1022;
        Object retValue = callMethod(klass, "contains", argTypes, null, args);
        assertTrue(recursiveEquals(term1015, term13849));
        assertTrue(recursiveEquals(term1022, 0.478669F));
        assertTrue(recursiveEquals(retValue, false));
    }

};


