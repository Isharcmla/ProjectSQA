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

public class BeanSerializerBase_rename_1325899260269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103827;
     Object term104299;
     Object term104592;
     Object term104593;
     Object term104589;

    public BeanSerializerBase_rename_1325899260269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103827 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 65);
        term104299 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$Chained"));
        term104592 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 65);
        term104593 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$Chained"));
        setField(term104593, term104593.getClass(), "_t1", null);
        setField(term104593, term104593.getClass(), "_t2", null);
        term104589 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 65);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"), 0).getClass();
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term103827;
        args[1] = term104299;
        Object retValue = callMethod(klass, "rename", argTypes, null, args);
        assertTrue(recursiveEquals(term103827, term104592));
        assertTrue(recursiveEquals(term104299, term104593));
        assertTrue(recursiveEquals(retValue, term104589));
    }

};


