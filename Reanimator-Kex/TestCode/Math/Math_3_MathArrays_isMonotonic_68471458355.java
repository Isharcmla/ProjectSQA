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
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;

public class MathArrays_isMonotonic_68471458355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term544;
     Object enum6;
     Object term568;
     Object term8111;
     Object enum7;

    public MathArrays_isMonotonic_68471458355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term544 = (double[]) newDoubleArray(9);
        setDoubleElement(term544, 0, 0.7154795600170818);
        setDoubleElement(term544, 1, 0.6355029654528058);
        setDoubleElement(term544, 2, 0.0022646783892913414);
        setDoubleElement(term544, 3, 0.36226058076369927);
        setDoubleElement(term544, 4, 0.03699061125289671);
        setDoubleElement(term544, 5, 0.6047137830113202);
        setDoubleElement(term544, 6, 0.6767213143579776);
        setDoubleElement(term544, 7, 0.48862955528902696);
        setDoubleElement(term544, 8, 0.426231085465289);
        Class<? extends Object> term8125 = Class.forName((String) "org.apache.commons.math3.util.MathArrays$OrderDirection");
        Field term8124 = ((Class) term8125).getDeclaredField((String) "INCREASING");
        ((Field) term8124).setAccessible(true);
        enum6 = ((Field) term8124).get((Object) null);
        term568 = new Boolean(false);
        term8111 = (double[]) newDoubleArray(9);
        setDoubleElement(term8111, 0, 0.7154795600170818);
        setDoubleElement(term8111, 1, 0.6355029654528058);
        setDoubleElement(term8111, 2, 0.0022646783892913414);
        setDoubleElement(term8111, 3, 0.36226058076369927);
        setDoubleElement(term8111, 4, 0.03699061125289671);
        setDoubleElement(term8111, 5, 0.6047137830113202);
        setDoubleElement(term8111, 6, 0.6767213143579776);
        setDoubleElement(term8111, 7, 0.48862955528902696);
        setDoubleElement(term8111, 8, 0.426231085465289);
        Class<? extends Object> term8446 = Class.forName((String) "org.apache.commons.math3.util.MathArrays$OrderDirection");
        Field term8445 = ((Class) term8446).getDeclaredField((String) "INCREASING");
        ((Field) term8445).setAccessible(true);
        enum7 = ((Field) term8445).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.util.MathArrays");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Class.forName("org.apache.commons.math3.util.MathArrays$OrderDirection");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term544;
        args[1] = enum6;
        args[2] = term568;
        callMethod(klass, "isMonotonic", argTypes, null, args);
        assertTrue(recursiveEquals(term544, term8111));
        assertTrue(recursiveEquals(enum6, enum7));
        assertTrue(recursiveEquals(term568, false));
    }

};


