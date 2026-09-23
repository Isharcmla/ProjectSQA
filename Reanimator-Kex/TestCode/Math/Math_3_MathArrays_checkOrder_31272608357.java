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
import org.apache.commons.math3.exception.NonMonotonicSequenceException;
import static org.apache.commons.math3.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;

public class MathArrays_checkOrder_31272608357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1228;
     Object enum10;
     Object term1248;

    public MathArrays_checkOrder_31272608357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1228 = (double[]) newDoubleArray(5);
        setDoubleElement(term1228, 0, 0.8924855581421237);
        setDoubleElement(term1228, 1, 0.32237559209193944);
        setDoubleElement(term1228, 2, 0.53094494792755);
        setDoubleElement(term1228, 3, 0.146431486357265);
        setDoubleElement(term1228, 4, 0.24259014218848696);
        Class<? extends Object> term10346 = Class.forName((String) "org.apache.commons.math3.util.MathArrays$OrderDirection");
        Field term10345 = ((Class) term10346).getDeclaredField((String) "INCREASING");
        ((Field) term10345).setAccessible(true);
        enum10 = ((Field) term10345).get((Object) null);
        term1248 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.util.MathArrays");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Class.forName("org.apache.commons.math3.util.MathArrays$OrderDirection");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term1228;
        args[1] = enum10;
        args[2] = term1248;
        try {
            callMethod(klass, "checkOrder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NonMonotonicSequenceException e) {
        }

    }

};


