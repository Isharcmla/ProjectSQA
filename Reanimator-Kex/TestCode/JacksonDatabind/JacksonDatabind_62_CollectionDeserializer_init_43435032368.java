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

public class CollectionDeserializer_init_43435032368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27104;
     Object term28739;
     Object term28741;

    public CollectionDeserializer_init_43435032368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27104 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Object term27157 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term27104, term27104.getClass(), "_collectionType", term27157);
        term28739 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Object term28740 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term28740, term28740.getClass(), "_elementType", null);
        setField(term28740, term28740.getClass(), "_superClass", null);
        setField(term28740, term28740.getClass(), "_superInterfaces", null);
        setField(term28740, term28740.getClass(), "_bindings", null);
        setField(term28740, term28740.getClass(), "_canonicalName", null);
        setField(term28740, term28740.getClass(), "_class", null);
        setIntField(term28740, term28740.getClass(), "_hash", 0);
        setField(term28740, term28740.getClass(), "_valueHandler", null);
        setField(term28740, term28740.getClass(), "_typeHandler", null);
        setBooleanField(term28740, term28740.getClass(), "_asStatic", false);
        setField(term28739, term28739.getClass(), "_collectionType", term28740);
        setField(term28739, term28739.getClass(), "_valueDeserializer", null);
        setField(term28739, term28739.getClass(), "_valueTypeDeserializer", null);
        setField(term28739, term28739.getClass(), "_valueInstantiator", null);
        setField(term28739, term28739.getClass(), "_delegateDeserializer", null);
        setField(term28739, term28739.getClass(), "_unwrapSingle", null);
        setField(term28739, term28739.getClass(), "_valueClass", null);
        term28741 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Object term28742 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term28742, term28742.getClass(), "_elementType", null);
        setField(term28742, term28742.getClass(), "_superClass", null);
        setField(term28742, term28742.getClass(), "_superInterfaces", null);
        setField(term28742, term28742.getClass(), "_bindings", null);
        setField(term28742, term28742.getClass(), "_canonicalName", null);
        setField(term28742, term28742.getClass(), "_class", null);
        setIntField(term28742, term28742.getClass(), "_hash", 0);
        setField(term28742, term28742.getClass(), "_valueHandler", null);
        setField(term28742, term28742.getClass(), "_typeHandler", null);
        setBooleanField(term28742, term28742.getClass(), "_asStatic", false);
        setField(term28741, term28741.getClass(), "_collectionType", term28742);
        setField(term28741, term28741.getClass(), "_valueDeserializer", null);
        setField(term28741, term28741.getClass(), "_valueTypeDeserializer", null);
        setField(term28741, term28741.getClass(), "_valueInstantiator", null);
        setField(term28741, term28741.getClass(), "_delegateDeserializer", null);
        setField(term28741, term28741.getClass(), "_unwrapSingle", null);
        setField(term28741, term28741.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Object[] args = new Object[1];
        args[0] = term27104;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term28739));
        assertTrue(recursiveEquals(term27104, term28741));
    }

};


