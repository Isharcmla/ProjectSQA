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

public class EnumSerializer_isShapeWrittenUsingIndex_188624666845 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15086;
     Object term15580;
     Object term15577;

    public EnumSerializer_isShapeWrittenUsingIndex_188624666845() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15585 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term15584 = ((Class) term15585).getDeclaredField((String) "NUMBER_FLOAT");
        ((Field) term15584).setAccessible(true);
        Object enum19 = ((Field) term15584).get((Object) null);
        term15086 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        setField(term15086, term15086.getClass(), "_shape", enum19);
        Class<? extends Object> term15873 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term15872 = ((Class) term15873).getDeclaredField((String) "NUMBER_FLOAT");
        ((Field) term15872).setAccessible(true);
        Object enum20 = ((Field) term15872).get((Object) null);
        term15580 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        setField(term15580, term15580.getClass(), "_pattern", null);
        setField(term15580, term15580.getClass(), "_shape", enum20);
        setField(term15580, term15580.getClass(), "_locale", null);
        setField(term15580, term15580.getClass(), "_timezoneStr", null);
        setField(term15580, term15580.getClass(), "_features", null);
        setField(term15580, term15580.getClass(), "_timezone", null);
        term15577 = new Boolean(true);
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
        args[1] = term15086;
        args[2] = false;
        Object retValue = callMethod(klass, "_isShapeWrittenUsingIndex", argTypes, null, args);
        assertTrue(recursiveEquals(term15086, null));
        assertTrue(recursiveEquals(retValue, term15577));
    }

};


