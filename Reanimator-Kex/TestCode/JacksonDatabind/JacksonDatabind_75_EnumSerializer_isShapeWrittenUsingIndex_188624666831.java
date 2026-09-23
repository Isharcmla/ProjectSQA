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

public class EnumSerializer_isShapeWrittenUsingIndex_188624666831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4629;
     Object term6290;

    public EnumSerializer_isShapeWrittenUsingIndex_188624666831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6295 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term6294 = ((Class) term6295).getDeclaredField((String) "SCALAR");
        ((Field) term6294).setAccessible(true);
        Object enum1 = ((Field) term6294).get((Object) null);
        term4629 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        setField(term4629, term4629.getClass(), "_shape", enum1);
        Class<? extends Object> term6565 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term6564 = ((Class) term6565).getDeclaredField((String) "SCALAR");
        ((Field) term6564).setAccessible(true);
        Object enum2 = ((Field) term6564).get((Object) null);
        term6290 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        setField(term6290, term6290.getClass(), "_pattern", null);
        setField(term6290, term6290.getClass(), "_shape", enum2);
        setField(term6290, term6290.getClass(), "_locale", null);
        setField(term6290, term6290.getClass(), "_timezoneStr", null);
        setField(term6290, term6290.getClass(), "_features", null);
        setField(term6290, term6290.getClass(), "_timezone", null);
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
        args[1] = term4629;
        args[2] = false;
        Object retValue = callMethod(klass, "_isShapeWrittenUsingIndex", argTypes, null, args);
        assertTrue(recursiveEquals(term4629, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


