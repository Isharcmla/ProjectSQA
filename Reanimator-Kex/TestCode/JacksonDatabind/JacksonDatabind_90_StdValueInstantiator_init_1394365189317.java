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

public class StdValueInstantiator_init_1394365189317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term379454;

    public StdValueInstantiator_init_1394365189317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term379350 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term379490 = Class.forName((String) "java.lang.Class");
        Class<? extends Object> term379668 = Class.forName((String) "com.fasterxml.jackson.databind.type.CollectionLikeType");
        Class<? extends Object> term379834 = Class.forName((String) "com.fasterxml.jackson.databind.type.CollectionType");
        term379454 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term379632 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term379798 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term379986 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term379454, term379454.getClass(), "_class", term379490);
        setField(term379632, term379632.getClass(), "_canonicalName", null);
        setField(term379632, term379632.getClass(), "_class", term379668);
        setField(term379798, term379798.getClass(), "_canonicalName", null);
        setField(term379798, term379798.getClass(), "_class", term379834);
        setField(term379798, term379798.getClass(), "_keyType", term379986);
        setField(term379632, term379632.getClass(), "_referencedType", term379798);
        setField(term379454, term379454.getClass(), "_referencedType", term379632);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term379454;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


