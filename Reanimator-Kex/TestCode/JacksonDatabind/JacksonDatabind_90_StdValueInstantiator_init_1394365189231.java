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

public class StdValueInstantiator_init_1394365189231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221913;

    public StdValueInstantiator_init_1394365189231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term221809 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term221949 = Class.forName((String) "com.fasterxml.jackson.databind.type.MapType");
        Class<? extends Object> term222127 = Class.forName((String) "java.lang.Class");
        Class<? extends Object> term222293 = Class.forName((String) "com.fasterxml.jackson.databind.type.MapType");
        term221913 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term222091 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term222257 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term222397 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term221913, term221913.getClass(), "_class", term221949);
        setField(term222091, term222091.getClass(), "_canonicalName", null);
        setField(term222091, term222091.getClass(), "_class", term222127);
        setField(term222257, term222257.getClass(), "_canonicalName", null);
        setField(term222257, term222257.getClass(), "_class", term222293);
        setField(term222257, term222257.getClass(), "_keyType", term222397);
        setField(term222091, term222091.getClass(), "_referencedType", term222257);
        setField(term221913, term221913.getClass(), "_referencedType", term222091);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term221913;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


