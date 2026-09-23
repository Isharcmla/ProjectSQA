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
import java.lang.Object;
import java.lang.String;

public class MathArrays_isMonotonic_1203949196124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46652;
     Object enum21;

    public MathArrays_isMonotonic_1203949196124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term47029 = Class.forName((String) "org.apache.commons.math3.util.MathArrays$OrderDirection");
        Field term47028 = ((Class) term47029).getDeclaredField((String) "INCREASING");
        ((Field) term47028).setAccessible(true);
        Object enum20 = ((Field) term47028).get((Object) null);
        term46652 = (Object[]) newArray("java.lang.Comparable", 8);
        setElement(term46652, 0, enum20);
        setElement(term46652, 1, enum20);
        setElement(term46652, 2, enum20);
        setElement(term46652, 3, enum20);
        setElement(term46652, 4, enum20);
        setElement(term46652, 5, enum20);
        setElement(term46652, 6, enum20);
        setElement(term46652, 7, enum20);
        Class<? extends Object> term47341 = Class.forName((String) "org.apache.commons.math3.util.MathArrays$OrderDirection");
        Field term47340 = ((Class) term47341).getDeclaredField((String) "DECREASING");
        ((Field) term47340).setAccessible(true);
        enum21 = ((Field) term47340).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.util.MathArrays");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Comparable"), 0).getClass();
        argTypes[1] = Class.forName("org.apache.commons.math3.util.MathArrays$OrderDirection");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term46652;
        args[1] = enum21;
        args[2] = false;
        callMethod(klass, "isMonotonic", argTypes, null, args);
    }

};


