package com.fasterxml.jackson.databind.deser.std;

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
import static com.fasterxml.jackson.databind.deser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class StdValueInstantiator_init_1394365189313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term371856;

    public StdValueInstantiator_init_1394365189313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term371752 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class term371892 = char.class;
        Class<? extends Object> term372058 = Class.forName((String) "java.lang.String");
        term371856 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term372022 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term372192 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term371856, term371856.getClass(), "_class", term371892);
        setField(term372022, term372022.getClass(), "_canonicalName", null);
        setField(term372022, term372022.getClass(), "_class", term372058);
        setField(term372192, term372192.getClass(), "_canonicalName", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        setField(term372022, term372022.getClass(), "_keyType", term372192);
        setField(term371856, term371856.getClass(), "_referencedType", term372022);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term371856;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


