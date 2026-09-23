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

public class EnumSerializer_isShapeWrittenUsingIndex_188624666836 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8730;
     Object term9509;
     Object term9506;

    public EnumSerializer_isShapeWrittenUsingIndex_188624666836() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9514 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term9513 = ((Class) term9514).getDeclaredField((String) "ARRAY");
        ((Field) term9513).setAccessible(true);
        Object enum7 = ((Field) term9513).get((Object) null);
        term8730 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        setField(term8730, term8730.getClass(), "_shape", enum7);
        Class<? extends Object> term9781 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term9780 = ((Class) term9781).getDeclaredField((String) "ARRAY");
        ((Field) term9780).setAccessible(true);
        Object enum8 = ((Field) term9780).get((Object) null);
        term9509 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        setField(term9509, term9509.getClass(), "_pattern", null);
        setField(term9509, term9509.getClass(), "_shape", enum8);
        setField(term9509, term9509.getClass(), "_locale", null);
        setField(term9509, term9509.getClass(), "_timezoneStr", null);
        setField(term9509, term9509.getClass(), "_features", null);
        setField(term9509, term9509.getClass(), "_timezone", null);
        term9506 = new Boolean(true);
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
        args[1] = term8730;
        args[2] = false;
        Object retValue = callMethod(klass, "_isShapeWrittenUsingIndex", argTypes, null, args);
        assertTrue(recursiveEquals(term8730, null));
        assertTrue(recursiveEquals(retValue, term9506));
    }

};


