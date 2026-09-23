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
import java.lang.Object;

public class EnumSerializer_init_158974298525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3077;
     Object term3827;
     Object term3829;

    public EnumSerializer_init_158974298525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2979 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
        term3077 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.EnumValues"));
        term3827 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
        Object term3828 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.EnumValues"));
        setField(term3828, term3828.getClass(), "_enumClass", null);
        setField(term3828, term3828.getClass(), "_values", null);
        setField(term3828, term3828.getClass(), "_textual", null);
        setField(term3828, term3828.getClass(), "_asMap", null);
        setField(term3827, term3827.getClass(), "_values", term3828);
        setField(term3827, term3827.getClass(), "_serializeAsIndex", null);
        setField(term3827, term3827.getClass(), "_handledType", null);
        term3829 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.EnumValues"));
        setField(term3829, term3829.getClass(), "_enumClass", null);
        setField(term3829, term3829.getClass(), "_values", null);
        setField(term3829, term3829.getClass(), "_textual", null);
        setField(term3829, term3829.getClass(), "_asMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.EnumSerializer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.util.EnumValues");
        Object[] args = new Object[1];
        args[0] = term3077;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term3827));
        assertTrue(recursiveEquals(term3077, term3829));
    }

};


