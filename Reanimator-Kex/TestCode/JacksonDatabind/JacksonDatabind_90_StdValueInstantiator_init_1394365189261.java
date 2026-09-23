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

public class StdValueInstantiator_init_1394365189261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term276976;

    public StdValueInstantiator_init_1394365189261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term276872 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term277012 = Class.forName((String) "com.fasterxml.jackson.databind.type.CollectionType");
        Class<? extends Object> term277178 = Class.forName((String) "com.fasterxml.jackson.databind.type.CollectionType");
        term276976 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term277142 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term277270 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term277414 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term276976, term276976.getClass(), "_class", term277012);
        setField(term277142, term277142.getClass(), "_canonicalName", null);
        setField(term277142, term277142.getClass(), "_class", term277178);
        setField(term277270, term277270.getClass(), "_canonicalName", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        setField(term277142, term277142.getClass(), "_keyType", term277270);
        setField(term277414, term277414.getClass(), "_canonicalName", null);
        setField(term277142, term277142.getClass(), "_valueType", term277414);
        setField(term276976, term276976.getClass(), "_referencedType", term277142);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term276976;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


