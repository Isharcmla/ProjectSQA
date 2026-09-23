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

public class EnumSerializer_isShapeWrittenUsingIndex_188624666849 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17843;
     Object term18285;
     Object term18282;

    public EnumSerializer_isShapeWrittenUsingIndex_188624666849() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18290 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term18289 = ((Class) term18290).getDeclaredField((String) "STRING");
        ((Field) term18289).setAccessible(true);
        Object enum25 = ((Field) term18289).get((Object) null);
        term17843 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        setField(term17843, term17843.getClass(), "_shape", enum25);
        Class<? extends Object> term18560 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term18559 = ((Class) term18560).getDeclaredField((String) "STRING");
        ((Field) term18559).setAccessible(true);
        Object enum26 = ((Field) term18559).get((Object) null);
        term18285 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        setField(term18285, term18285.getClass(), "_pattern", null);
        setField(term18285, term18285.getClass(), "_shape", enum26);
        setField(term18285, term18285.getClass(), "_locale", null);
        setField(term18285, term18285.getClass(), "_timezoneStr", null);
        setField(term18285, term18285.getClass(), "_features", null);
        setField(term18285, term18285.getClass(), "_timezone", null);
        term18282 = new Boolean(false);
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
        args[1] = term17843;
        args[2] = false;
        Object retValue = callMethod(klass, "_isShapeWrittenUsingIndex", argTypes, null, args);
        assertTrue(recursiveEquals(term17843, null));
        assertTrue(recursiveEquals(retValue, term18282));
    }

};


