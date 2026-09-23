package com.fasterxml.jackson.databind.ser.std;

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
import static com.fasterxml.jackson.databind.ser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.ser.std.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;

public class EnumSerializer_isShapeWrittenUsingIndex_188624666839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11153;
     Object term11601;
     Object term11598;

    public EnumSerializer_isShapeWrittenUsingIndex_188624666839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11606 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term11605 = ((Class) term11606).getDeclaredField((String) "NATURAL");
        ((Field) term11605).setAccessible(true);
        Object enum10 = ((Field) term11605).get((Object) null);
        term11153 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        setField(term11153, term11153.getClass(), "_shape", enum10);
        Class<? extends Object> term11879 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term11878 = ((Class) term11879).getDeclaredField((String) "NATURAL");
        ((Field) term11878).setAccessible(true);
        Object enum11 = ((Field) term11878).get((Object) null);
        term11601 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        setField(term11601, term11601.getClass(), "_pattern", null);
        setField(term11601, term11601.getClass(), "_shape", enum11);
        setField(term11601, term11601.getClass(), "_locale", null);
        setField(term11601, term11601.getClass(), "_timezoneStr", null);
        setField(term11601, term11601.getClass(), "_features", null);
        setField(term11601, term11601.getClass(), "_timezone", null);
        term11598 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.EnumSerializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Value");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term11153;
        args[2] = false;
        Object retValue = callMethod(klass, "_isShapeWrittenUsingIndex", argTypes, null, args);
        assertTrue(recursiveEquals(term11153, null));
        assertTrue(recursiveEquals(retValue, term11598));
    }

};


