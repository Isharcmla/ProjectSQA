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
import static com.fasterxml.jackson.databind.deser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.deser.std.EqualityUtils.*;

public class CollectionDeserializer_init_43435032334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4410;
     Object term4916;
     Object term4917;

    public CollectionDeserializer_init_43435032334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4410 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        term4916 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        setField(term4916, term4916.getClass(), "_collectionType", null);
        setField(term4916, term4916.getClass(), "_valueDeserializer", null);
        setField(term4916, term4916.getClass(), "_valueTypeDeserializer", null);
        setField(term4916, term4916.getClass(), "_valueInstantiator", null);
        setField(term4916, term4916.getClass(), "_delegateDeserializer", null);
        setField(term4916, term4916.getClass(), "_unwrapSingle", null);
        setField(term4916, term4916.getClass(), "_valueClass", null);
        term4917 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        setField(term4917, term4917.getClass(), "_collectionType", null);
        setField(term4917, term4917.getClass(), "_valueDeserializer", null);
        setField(term4917, term4917.getClass(), "_valueTypeDeserializer", null);
        setField(term4917, term4917.getClass(), "_valueInstantiator", null);
        setField(term4917, term4917.getClass(), "_delegateDeserializer", null);
        setField(term4917, term4917.getClass(), "_unwrapSingle", null);
        setField(term4917, term4917.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Object[] args = new Object[1];
        args[0] = term4410;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term4916));
        assertTrue(recursiveEquals(term4410, term4917));
    }

};


