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

public class MathArrays_checkOrder_200823023956 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term891;
     Object enum8;
     Object term909;
     Object term911;
     Object term8788;
     Object enum9;

    public MathArrays_checkOrder_200823023956() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term891 = (double[]) newDoubleArray(3);
        setDoubleElement(term891, 0, 0.0027299293098262956);
        setDoubleElement(term891, 1, 0.29874017652881824);
        setDoubleElement(term891, 2, 0.32554480512985284);
        Class<? extends Object> term8797 = Class.forName((String) "org.apache.commons.math3.util.MathArrays$OrderDirection");
        Field term8796 = ((Class) term8797).getDeclaredField((String) "INCREASING");
        ((Field) term8796).setAccessible(true);
        enum8 = ((Field) term8796).get((Object) null);
        term909 = new Boolean(false);
        term911 = new Boolean(false);
        term8788 = (double[]) newDoubleArray(3);
        setDoubleElement(term8788, 0, 0.0027299293098262956);
        setDoubleElement(term8788, 1, 0.29874017652881824);
        setDoubleElement(term8788, 2, 0.32554480512985284);
        Class<? extends Object> term9112 = Class.forName((String) "org.apache.commons.math3.util.MathArrays$OrderDirection");
        Field term9111 = ((Class) term9112).getDeclaredField((String) "INCREASING");
        ((Field) term9111).setAccessible(true);
        enum9 = ((Field) term9111).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.util.MathArrays");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Class.forName("org.apache.commons.math3.util.MathArrays$OrderDirection");
        argTypes[2] = boolean.class;
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = term891;
        args[1] = enum8;
        args[2] = term909;
        args[3] = term911;
        Object retValue = callMethod(klass, "checkOrder", argTypes, null, args);
        assertTrue(recursiveEquals(term891, term8788));
        assertTrue(recursiveEquals(enum8, enum9));
        assertTrue(recursiveEquals(term909, false));
        assertTrue(recursiveEquals(term911, false));
        assertTrue(recursiveEquals(retValue, true));
    }

};


