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

public class BeanSerializerBase_rename_1325899260319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126229;
     Object term127053;
     Object term127338;
     Object term127339;
     Object term127335;

    public BeanSerializerBase_rename_1325899260319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term126229 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 138);
        term127053 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$2"));
        term127338 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 138);
        term127339 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$2"));
        setField(term127339, term127339.getClass(), "val$prefix", null);
        term127335 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 138);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"), 0).getClass();
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term126229;
        args[1] = term127053;
        Object retValue = callMethod(klass, "rename", argTypes, null, args);
        assertTrue(recursiveEquals(term126229, term127338));
        assertTrue(recursiveEquals(term127053, term127339));
        assertTrue(recursiveEquals(retValue, term127335));
    }

};


