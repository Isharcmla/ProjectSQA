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

public class CollectionDeserializer_init_49897962577 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30455;
     Object term30785;
     Object term30787;

    public CollectionDeserializer_init_49897962577() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term30363 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        term30455 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        term30785 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Object term30786 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term30786, term30786.getClass(), "_keyType", null);
        setField(term30786, term30786.getClass(), "_valueType", null);
        setField(term30786, term30786.getClass(), "_superClass", null);
        setField(term30786, term30786.getClass(), "_superInterfaces", null);
        setField(term30786, term30786.getClass(), "_bindings", null);
        setField(term30786, term30786.getClass(), "_canonicalName", null);
        setField(term30786, term30786.getClass(), "_class", null);
        setIntField(term30786, term30786.getClass(), "_hash", 0);
        setField(term30786, term30786.getClass(), "_valueHandler", null);
        setField(term30786, term30786.getClass(), "_typeHandler", null);
        setBooleanField(term30786, term30786.getClass(), "_asStatic", false);
        setField(term30785, term30785.getClass(), "_collectionType", term30786);
        setField(term30785, term30785.getClass(), "_valueDeserializer", null);
        setField(term30785, term30785.getClass(), "_valueTypeDeserializer", null);
        setField(term30785, term30785.getClass(), "_valueInstantiator", null);
        setField(term30785, term30785.getClass(), "_delegateDeserializer", null);
        setField(term30785, term30785.getClass(), "_unwrapSingle", null);
        setField(term30785, term30785.getClass(), "_valueClass", null);
        term30787 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term30787, term30787.getClass(), "_keyType", null);
        setField(term30787, term30787.getClass(), "_valueType", null);
        setField(term30787, term30787.getClass(), "_superClass", null);
        setField(term30787, term30787.getClass(), "_superInterfaces", null);
        setField(term30787, term30787.getClass(), "_bindings", null);
        setField(term30787, term30787.getClass(), "_canonicalName", null);
        setField(term30787, term30787.getClass(), "_class", null);
        setIntField(term30787, term30787.getClass(), "_hash", 0);
        setField(term30787, term30787.getClass(), "_valueHandler", null);
        setField(term30787, term30787.getClass(), "_typeHandler", null);
        setBooleanField(term30787, term30787.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.deser.ValueInstantiator");
        Object[] args = new Object[4];
        args[0] = term30455;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term30785));
        assertTrue(recursiveEquals(term30455, term30787));
    }

};


