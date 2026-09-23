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

public class BeanSerializerBase_rename_1325899260275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106698;
     Object term107546;
     Object term108387;
     Object term108388;
     Object term108384;

    public BeanSerializerBase_rename_1325899260275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106698 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 168);
        term107546 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$1"));
        term108387 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 168);
        term108388 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$1"));
        term108384 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 168);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"), 0).getClass();
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term106698;
        args[1] = term107546;
        Object retValue = callMethod(klass, "rename", argTypes, null, args);
        assertTrue(recursiveEquals(term106698, term108387));
        assertTrue(recursiveEquals(term107546, term108388));
        assertTrue(recursiveEquals(retValue, term108384));
    }

};


