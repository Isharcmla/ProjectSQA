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

public class EnumSerializer_init_184117791327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4048;
     Object term4052;
     Object term4054;

    public EnumSerializer_init_184117791327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3950 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
        term4048 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.EnumValues"));
        term4052 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
        Object term4053 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.EnumValues"));
        setField(term4053, term4053.getClass(), "_enumClass", null);
        setField(term4053, term4053.getClass(), "_values", null);
        setField(term4053, term4053.getClass(), "_textual", null);
        setField(term4053, term4053.getClass(), "_asMap", null);
        setField(term4052, term4052.getClass(), "_values", term4053);
        setField(term4052, term4052.getClass(), "_serializeAsIndex", null);
        setField(term4052, term4052.getClass(), "_handledType", null);
        term4054 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.EnumValues"));
        setField(term4054, term4054.getClass(), "_enumClass", null);
        setField(term4054, term4054.getClass(), "_values", null);
        setField(term4054, term4054.getClass(), "_textual", null);
        setField(term4054, term4054.getClass(), "_asMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.EnumSerializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.util.EnumValues");
        argTypes[1] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[2];
        args[0] = term4048;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term4052));
        assertTrue(recursiveEquals(term4048, term4054));
    }

};


