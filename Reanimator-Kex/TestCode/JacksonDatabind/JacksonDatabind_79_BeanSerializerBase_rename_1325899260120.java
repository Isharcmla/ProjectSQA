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

public class BeanSerializerBase_rename_1325899260120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39656;
     Object term40315;
     Object term41377;
     Object term41378;
     Object term41374;

    public BeanSerializerBase_rename_1325899260120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39656 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 143);
        term40315 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$2"));
        term41377 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 143);
        term41378 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$2"));
        setField(term41378, term41378.getClass(), "val$prefix", null);
        term41374 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 143);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"), 0).getClass();
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term39656;
        args[1] = term40315;
        Object retValue = callMethod(klass, "rename", argTypes, null, args);
        assertTrue(recursiveEquals(term39656, term41377));
        assertTrue(recursiveEquals(term40315, term41378));
        assertTrue(recursiveEquals(retValue, term41374));
    }

};


