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

public class StdValueInstantiator_init_1394365189260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term274031;

    public StdValueInstantiator_init_1394365189260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term273927 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term274067 = Class.forName((String) "com.fasterxml.jackson.databind.type.SimpleType");
        Class<? extends Object> term274233 = Class.forName((String) "com.fasterxml.jackson.databind.type.MapType");
        Class<? extends Object> term274399 = Class.forName((String) "kex.java.lang.StringBuilder");
        term274031 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term274197 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term274363 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term274541 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term274031, term274031.getClass(), "_class", term274067);
        setField(term274197, term274197.getClass(), "_canonicalName", null);
        setField(term274197, term274197.getClass(), "_class", term274233);
        setField(term274363, term274363.getClass(), "_canonicalName", null);
        setField(term274363, term274363.getClass(), "_class", term274399);
        setField(term274541, term274541.getClass(), "_canonicalName", "kex.java.lang.StringBuilder");
        setField(term274363, term274363.getClass(), "_keyType", term274541);
        setField(term274197, term274197.getClass(), "_keyType", term274363);
        setField(term274031, term274031.getClass(), "_referencedType", term274197);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term274031;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


