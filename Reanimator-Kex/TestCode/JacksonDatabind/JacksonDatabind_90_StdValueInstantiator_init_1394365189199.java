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

public class StdValueInstantiator_init_1394365189199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165909;

    public StdValueInstantiator_init_1394365189199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term165805 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term165945 = Class.forName((String) "com.fasterxml.jackson.databind.type.CollectionLikeType");
        Class term166111 = char.class;
        term165909 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term166075 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term166241 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term166385 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term165909, term165909.getClass(), "_class", term165945);
        setField(term166075, term166075.getClass(), "_canonicalName", null);
        setField(term166075, term166075.getClass(), "_class", term166111);
        setField(term166241, term166241.getClass(), "_canonicalName", "");
        setField(term166075, term166075.getClass(), "_keyType", term166241);
        setField(term166385, term166385.getClass(), "_canonicalName", "java.lang.Object");
        setField(term166075, term166075.getClass(), "_valueType", term166385);
        setField(term165909, term165909.getClass(), "_referencedType", term166075);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term165909;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


