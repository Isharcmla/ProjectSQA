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

public class EnumSerializer_isShapeWrittenUsingIndex_188624666841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12459;
     Object term12882;

    public EnumSerializer_isShapeWrittenUsingIndex_188624666841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12887 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term12886 = ((Class) term12887).getDeclaredField((String) "ANY");
        ((Field) term12886).setAccessible(true);
        Object enum13 = ((Field) term12886).get((Object) null);
        term12459 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        setField(term12459, term12459.getClass(), "_shape", enum13);
        Class<? extends Object> term13148 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term13147 = ((Class) term13148).getDeclaredField((String) "ANY");
        ((Field) term13147).setAccessible(true);
        Object enum14 = ((Field) term13147).get((Object) null);
        term12882 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        setField(term12882, term12882.getClass(), "_pattern", null);
        setField(term12882, term12882.getClass(), "_shape", enum14);
        setField(term12882, term12882.getClass(), "_locale", null);
        setField(term12882, term12882.getClass(), "_timezoneStr", null);
        setField(term12882, term12882.getClass(), "_features", null);
        setField(term12882, term12882.getClass(), "_timezone", null);
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
        args[1] = term12459;
        args[2] = false;
        Object retValue = callMethod(klass, "_isShapeWrittenUsingIndex", argTypes, null, args);
        assertTrue(recursiveEquals(term12459, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


