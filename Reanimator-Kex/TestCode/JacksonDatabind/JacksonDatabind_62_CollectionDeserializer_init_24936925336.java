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

public class CollectionDeserializer_init_24936925336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4652;
     Object term5228;
     Object term5230;

    public CollectionDeserializer_init_24936925336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4552 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        term4652 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        term5228 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Object term5229 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term5229, term5229.getClass(), "_keyType", null);
        setField(term5229, term5229.getClass(), "_valueType", null);
        setField(term5229, term5229.getClass(), "_superClass", null);
        setField(term5229, term5229.getClass(), "_superInterfaces", null);
        setField(term5229, term5229.getClass(), "_bindings", null);
        setField(term5229, term5229.getClass(), "_canonicalName", null);
        setField(term5229, term5229.getClass(), "_class", null);
        setIntField(term5229, term5229.getClass(), "_hash", 0);
        setField(term5229, term5229.getClass(), "_valueHandler", null);
        setField(term5229, term5229.getClass(), "_typeHandler", null);
        setBooleanField(term5229, term5229.getClass(), "_asStatic", false);
        setField(term5228, term5228.getClass(), "_collectionType", term5229);
        setField(term5228, term5228.getClass(), "_valueDeserializer", null);
        setField(term5228, term5228.getClass(), "_valueTypeDeserializer", null);
        setField(term5228, term5228.getClass(), "_valueInstantiator", null);
        setField(term5228, term5228.getClass(), "_delegateDeserializer", null);
        setField(term5228, term5228.getClass(), "_unwrapSingle", null);
        setField(term5228, term5228.getClass(), "_valueClass", null);
        term5230 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term5230, term5230.getClass(), "_keyType", null);
        setField(term5230, term5230.getClass(), "_valueType", null);
        setField(term5230, term5230.getClass(), "_superClass", null);
        setField(term5230, term5230.getClass(), "_superInterfaces", null);
        setField(term5230, term5230.getClass(), "_bindings", null);
        setField(term5230, term5230.getClass(), "_canonicalName", null);
        setField(term5230, term5230.getClass(), "_class", null);
        setIntField(term5230, term5230.getClass(), "_hash", 0);
        setField(term5230, term5230.getClass(), "_valueHandler", null);
        setField(term5230, term5230.getClass(), "_typeHandler", null);
        setBooleanField(term5230, term5230.getClass(), "_asStatic", false);
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
        args[0] = term4652;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term5228));
        assertTrue(recursiveEquals(term4652, term5230));
    }

};


