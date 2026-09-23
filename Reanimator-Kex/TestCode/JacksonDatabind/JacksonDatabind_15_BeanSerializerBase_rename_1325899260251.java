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

public class BeanSerializerBase_rename_1325899260251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97089;
     Object term97648;
     Object term97945;
     Object term97946;
     Object term97942;

    public BeanSerializerBase_rename_1325899260251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97089 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 85);
        term97648 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$3"));
        term97945 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 85);
        term97946 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$3"));
        setField(term97946, term97946.getClass(), "val$prefix", null);
        term97942 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 85);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"), 0).getClass();
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term97089;
        args[1] = term97648;
        Object retValue = callMethod(klass, "rename", argTypes, null, args);
        assertTrue(recursiveEquals(term97089, term97945));
        assertTrue(recursiveEquals(term97648, term97946));
        assertTrue(recursiveEquals(retValue, term97942));
    }

};


