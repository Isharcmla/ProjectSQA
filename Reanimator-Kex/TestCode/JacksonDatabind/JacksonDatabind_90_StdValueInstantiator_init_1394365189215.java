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

public class StdValueInstantiator_init_1394365189215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term193189;

    public StdValueInstantiator_init_1394365189215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term193085 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term193225 = Class.forName((String) "com.fasterxml.jackson.databind.type.PlaceholderForType");
        Class<? extends Object> term193391 = Class.forName((String) "com.fasterxml.jackson.databind.type.PlaceholderForType");
        term193189 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term193355 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term193483 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term193635 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setField(term193189, term193189.getClass(), "_class", term193225);
        setField(term193355, term193355.getClass(), "_canonicalName", null);
        setField(term193355, term193355.getClass(), "_class", term193391);
        setField(term193483, term193483.getClass(), "_canonicalName", "");
        setField(term193355, term193355.getClass(), "_keyType", term193483);
        setField(term193355, term193355.getClass(), "_valueType", term193635);
        setField(term193189, term193189.getClass(), "_referencedType", term193355);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term193189;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


