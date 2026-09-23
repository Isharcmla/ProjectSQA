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
import java.lang.String;
import java.lang.Object;

public class MathArrays_checkOrder_200823023990 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25669;
     Object enum13;

    public MathArrays_checkOrder_200823023990() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25669 = (double[]) newDoubleArray(490);
        Class<? extends Object> term27366 = Class.forName((String) "org.apache.commons.math3.util.MathArrays$OrderDirection");
        Field term27365 = ((Class) term27366).getDeclaredField((String) "DECREASING");
        ((Field) term27365).setAccessible(true);
        enum13 = ((Field) term27365).get((Object) null);
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
        args[0] = term25669;
        args[1] = enum13;
        args[2] = false;
        args[3] = false;
        callMethod(klass, "checkOrder", argTypes, null, args);
    }

};


