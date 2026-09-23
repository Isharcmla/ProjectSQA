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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.ser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class EnumSerializer_isShapeWrittenUsingIndex_188624666833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7163;

    public EnumSerializer_isShapeWrittenUsingIndex_188624666833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7867 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term7866 = ((Class) term7867).getDeclaredField((String) "BOOLEAN");
        ((Field) term7866).setAccessible(true);
        Object enum4 = ((Field) term7866).get((Object) null);
        term7163 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        setField(term7163, term7163.getClass(), "_shape", enum4);
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
        args[1] = term7163;
        args[2] = false;
        try {
            callMethod(klass, "_isShapeWrittenUsingIndex", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


