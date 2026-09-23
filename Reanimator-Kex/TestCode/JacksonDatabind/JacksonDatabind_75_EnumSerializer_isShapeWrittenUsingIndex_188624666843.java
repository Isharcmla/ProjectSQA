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

public class EnumSerializer_isShapeWrittenUsingIndex_188624666843 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13722;
     Object term14203;
     Object term14200;

    public EnumSerializer_isShapeWrittenUsingIndex_188624666843() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14208 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term14207 = ((Class) term14208).getDeclaredField((String) "NUMBER_INT");
        ((Field) term14207).setAccessible(true);
        Object enum16 = ((Field) term14207).get((Object) null);
        term13722 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        setField(term13722, term13722.getClass(), "_shape", enum16);
        Class<? extends Object> term14490 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term14489 = ((Class) term14490).getDeclaredField((String) "NUMBER_INT");
        ((Field) term14489).setAccessible(true);
        Object enum17 = ((Field) term14489).get((Object) null);
        term14203 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        setField(term14203, term14203.getClass(), "_pattern", null);
        setField(term14203, term14203.getClass(), "_shape", enum17);
        setField(term14203, term14203.getClass(), "_locale", null);
        setField(term14203, term14203.getClass(), "_timezoneStr", null);
        setField(term14203, term14203.getClass(), "_features", null);
        setField(term14203, term14203.getClass(), "_timezone", null);
        term14200 = new Boolean(true);
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
        args[1] = term13722;
        args[2] = false;
        Object retValue = callMethod(klass, "_isShapeWrittenUsingIndex", argTypes, null, args);
        assertTrue(recursiveEquals(term13722, null));
        assertTrue(recursiveEquals(retValue, term14200));
    }

};


