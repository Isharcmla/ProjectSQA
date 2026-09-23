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

public class CollectionDeserializer_init_24936925384 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31585;
     Object term32147;
     Object term32149;

    public CollectionDeserializer_init_24936925384() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term31493 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        term31585 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        term32147 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Object term32148 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term32148, term32148.getClass(), "_keyType", null);
        setField(term32148, term32148.getClass(), "_valueType", null);
        setField(term32148, term32148.getClass(), "_superClass", null);
        setField(term32148, term32148.getClass(), "_superInterfaces", null);
        setField(term32148, term32148.getClass(), "_bindings", null);
        setField(term32148, term32148.getClass(), "_canonicalName", null);
        setField(term32148, term32148.getClass(), "_class", null);
        setIntField(term32148, term32148.getClass(), "_hash", 0);
        setField(term32148, term32148.getClass(), "_valueHandler", null);
        setField(term32148, term32148.getClass(), "_typeHandler", null);
        setBooleanField(term32148, term32148.getClass(), "_asStatic", false);
        setField(term32147, term32147.getClass(), "_collectionType", term32148);
        setField(term32147, term32147.getClass(), "_valueDeserializer", null);
        setField(term32147, term32147.getClass(), "_valueTypeDeserializer", null);
        setField(term32147, term32147.getClass(), "_valueInstantiator", null);
        setField(term32147, term32147.getClass(), "_delegateDeserializer", null);
        setField(term32147, term32147.getClass(), "_unwrapSingle", null);
        setField(term32147, term32147.getClass(), "_valueClass", null);
        term32149 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term32149, term32149.getClass(), "_keyType", null);
        setField(term32149, term32149.getClass(), "_valueType", null);
        setField(term32149, term32149.getClass(), "_superClass", null);
        setField(term32149, term32149.getClass(), "_superInterfaces", null);
        setField(term32149, term32149.getClass(), "_bindings", null);
        setField(term32149, term32149.getClass(), "_canonicalName", null);
        setField(term32149, term32149.getClass(), "_class", null);
        setIntField(term32149, term32149.getClass(), "_hash", 0);
        setField(term32149, term32149.getClass(), "_valueHandler", null);
        setField(term32149, term32149.getClass(), "_typeHandler", null);
        setBooleanField(term32149, term32149.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.deser.ValueInstantiator");
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        argTypes[5] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[6];
        args[0] = term31585;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term32147));
        assertTrue(recursiveEquals(term31585, term32149));
    }

};


