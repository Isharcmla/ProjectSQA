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

public class BeanSerializerBase_rename_1325899260552 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term302023;
     Object term302371;
     Object term303053;
     Object term303054;
     Object term303050;

    public BeanSerializerBase_rename_1325899260552() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term302023 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 43);
        term302371 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$3"));
        term303053 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 43);
        term303054 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$3"));
        setField(term303054, term303054.getClass(), "val$prefix", null);
        term303050 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 43);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"), 0).getClass();
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term302023;
        args[1] = term302371;
        Object retValue = callMethod(klass, "rename", argTypes, null, args);
        assertTrue(recursiveEquals(term302023, term303053));
        assertTrue(recursiveEquals(term302371, term303054));
        assertTrue(recursiveEquals(retValue, term303050));
    }

};


