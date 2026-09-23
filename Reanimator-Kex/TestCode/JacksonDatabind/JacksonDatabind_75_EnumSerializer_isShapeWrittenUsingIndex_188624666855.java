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
import java.lang.IllegalArgumentException;
import static com.fasterxml.jackson.databind.ser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class EnumSerializer_isShapeWrittenUsingIndex_188624666855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22792;
     Object term22934;

    public EnumSerializer_isShapeWrittenUsingIndex_188624666855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22792 = Class.forName((String) "java.lang.Class");
        Class<? extends Object> term23826 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term23825 = ((Class) term23826).getDeclaredField((String) "OBJECT");
        ((Field) term23825).setAccessible(true);
        Object enum31 = ((Field) term23825).get((Object) null);
        term22934 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        setField(term22934, term22934.getClass(), "_shape", enum31);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.EnumSerializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Value");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term22792;
        args[1] = term22934;
        args[2] = true;
        try {
            callMethod(klass, "_isShapeWrittenUsingIndex", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


