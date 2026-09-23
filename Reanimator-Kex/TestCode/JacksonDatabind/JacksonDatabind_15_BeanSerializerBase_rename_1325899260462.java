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

public class BeanSerializerBase_rename_1325899260462 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term240400;
     Object term240625;
     Object term241211;
     Object term241212;
     Object term241208;

    public BeanSerializerBase_rename_1325899260462() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term240400 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 18);
        term240625 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$1"));
        term241211 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 18);
        term241212 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$1"));
        term241208 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"), 0).getClass();
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term240400;
        args[1] = term240625;
        Object retValue = callMethod(klass, "rename", argTypes, null, args);
        assertTrue(recursiveEquals(term240400, term241211));
        assertTrue(recursiveEquals(term240625, term241212));
        assertTrue(recursiveEquals(retValue, term241208));
    }

};


