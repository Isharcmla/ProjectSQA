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

public class EnumSerializer_isShapeWrittenUsingIndex_188624666847 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16473;
     Object term16929;
     Object term16926;

    public EnumSerializer_isShapeWrittenUsingIndex_188624666847() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16934 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term16933 = ((Class) term16934).getDeclaredField((String) "NUMBER");
        ((Field) term16933).setAccessible(true);
        Object enum22 = ((Field) term16933).get((Object) null);
        term16473 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        setField(term16473, term16473.getClass(), "_shape", enum22);
        Class<? extends Object> term17204 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term17203 = ((Class) term17204).getDeclaredField((String) "NUMBER");
        ((Field) term17203).setAccessible(true);
        Object enum23 = ((Field) term17203).get((Object) null);
        term16929 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        setField(term16929, term16929.getClass(), "_pattern", null);
        setField(term16929, term16929.getClass(), "_shape", enum23);
        setField(term16929, term16929.getClass(), "_locale", null);
        setField(term16929, term16929.getClass(), "_timezoneStr", null);
        setField(term16929, term16929.getClass(), "_features", null);
        setField(term16929, term16929.getClass(), "_timezone", null);
        term16926 = new Boolean(true);
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
        args[1] = term16473;
        args[2] = false;
        Object retValue = callMethod(klass, "_isShapeWrittenUsingIndex", argTypes, null, args);
        assertTrue(recursiveEquals(term16473, null));
        assertTrue(recursiveEquals(retValue, term16926));
    }

};


