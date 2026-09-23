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

public class MathArrays_checkOrder_312726083114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43483;
     Object enum19;

    public MathArrays_checkOrder_312726083114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43483 = (double[]) newDoubleArray(490);
        Class<? extends Object> term45179 = Class.forName((String) "org.apache.commons.math3.util.MathArrays$OrderDirection");
        Field term45178 = ((Class) term45179).getDeclaredField((String) "DECREASING");
        ((Field) term45178).setAccessible(true);
        enum19 = ((Field) term45178).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.util.MathArrays");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Class.forName("org.apache.commons.math3.util.MathArrays$OrderDirection");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term43483;
        args[1] = enum19;
        args[2] = false;
        callMethod(klass, "checkOrder", argTypes, null, args);
    }

};


