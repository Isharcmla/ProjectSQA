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
import java.lang.reflect.InaccessibleObjectException;
import static com.fasterxml.jackson.databind.deser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class StdValueInstantiator_init_1394365189249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term255297;

    public StdValueInstantiator_init_1394365189249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term255193 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term255333 = Class.forName((String) "kex.java.lang.AbstractStringBuilder");
        Class<? extends Object> term255499 = Class.forName((String) "com.fasterxml.jackson.databind.type.CollectionType");
        Class<? extends Object> term255679 = Class.forName((String) "java.util.ArrayDeque$DescendingIterator");
        term255297 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term255463 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term255643 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term255297, term255297.getClass(), "_class", term255333);
        setField(term255463, term255463.getClass(), "_canonicalName", null);
        setField(term255463, term255463.getClass(), "_class", term255499);
        setField(term255643, term255643.getClass(), "_canonicalName", null);
        setField(term255643, term255643.getClass(), "_class", term255679);
        setField(term255463, term255463.getClass(), "_keyType", term255643);
        setField(term255297, term255297.getClass(), "_referencedType", term255463);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term255297;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


