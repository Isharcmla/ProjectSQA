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
import java.lang.Object;

public class CollectionDeserializer_init_434350323133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70362;
     Object term70424;
     Object term70426;

    public CollectionDeserializer_init_434350323133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70362 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Object term70414 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term70362, term70362.getClass(), "_collectionType", term70414);
        term70424 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Object term70425 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term70425, term70425.getClass(), "_referencedType", null);
        setField(term70425, term70425.getClass(), "_superClass", null);
        setField(term70425, term70425.getClass(), "_superInterfaces", null);
        setField(term70425, term70425.getClass(), "_bindings", null);
        setField(term70425, term70425.getClass(), "_canonicalName", null);
        setField(term70425, term70425.getClass(), "_class", null);
        setIntField(term70425, term70425.getClass(), "_hash", 0);
        setField(term70425, term70425.getClass(), "_valueHandler", null);
        setField(term70425, term70425.getClass(), "_typeHandler", null);
        setBooleanField(term70425, term70425.getClass(), "_asStatic", false);
        setField(term70424, term70424.getClass(), "_collectionType", term70425);
        setField(term70424, term70424.getClass(), "_valueDeserializer", null);
        setField(term70424, term70424.getClass(), "_valueTypeDeserializer", null);
        setField(term70424, term70424.getClass(), "_valueInstantiator", null);
        setField(term70424, term70424.getClass(), "_delegateDeserializer", null);
        setField(term70424, term70424.getClass(), "_unwrapSingle", null);
        setField(term70424, term70424.getClass(), "_valueClass", null);
        term70426 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Object term70427 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term70427, term70427.getClass(), "_referencedType", null);
        setField(term70427, term70427.getClass(), "_superClass", null);
        setField(term70427, term70427.getClass(), "_superInterfaces", null);
        setField(term70427, term70427.getClass(), "_bindings", null);
        setField(term70427, term70427.getClass(), "_canonicalName", null);
        setField(term70427, term70427.getClass(), "_class", null);
        setIntField(term70427, term70427.getClass(), "_hash", 0);
        setField(term70427, term70427.getClass(), "_valueHandler", null);
        setField(term70427, term70427.getClass(), "_typeHandler", null);
        setBooleanField(term70427, term70427.getClass(), "_asStatic", false);
        setField(term70426, term70426.getClass(), "_collectionType", term70427);
        setField(term70426, term70426.getClass(), "_valueDeserializer", null);
        setField(term70426, term70426.getClass(), "_valueTypeDeserializer", null);
        setField(term70426, term70426.getClass(), "_valueInstantiator", null);
        setField(term70426, term70426.getClass(), "_delegateDeserializer", null);
        setField(term70426, term70426.getClass(), "_unwrapSingle", null);
        setField(term70426, term70426.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Object[] args = new Object[1];
        args[0] = term70362;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term70424));
        assertTrue(recursiveEquals(term70362, term70426));
    }

};


