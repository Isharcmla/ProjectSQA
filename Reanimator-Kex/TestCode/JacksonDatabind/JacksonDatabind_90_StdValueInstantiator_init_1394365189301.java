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

public class StdValueInstantiator_init_1394365189301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term350929;

    public StdValueInstantiator_init_1394365189301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term350825 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term350965 = Class.forName((String) "java.lang.Class");
        Class<? extends Object> term351143 = Class.forName((String) "java.lang.String");
        Class<? extends Object> term351309 = Class.forName((String) "com.fasterxml.jackson.databind.type.MapType");
        term350929 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term351107 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term351273 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term351461 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setField(term350929, term350929.getClass(), "_class", term350965);
        setField(term351107, term351107.getClass(), "_canonicalName", null);
        setField(term351107, term351107.getClass(), "_class", term351143);
        setField(term351273, term351273.getClass(), "_canonicalName", null);
        setField(term351273, term351273.getClass(), "_class", term351309);
        setField(term351273, term351273.getClass(), "_keyType", term351461);
        setField(term351107, term351107.getClass(), "_referencedType", term351273);
        setField(term350929, term350929.getClass(), "_referencedType", term351107);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term350929;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


