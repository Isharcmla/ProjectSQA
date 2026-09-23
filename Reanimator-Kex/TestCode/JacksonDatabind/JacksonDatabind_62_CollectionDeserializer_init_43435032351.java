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

public class CollectionDeserializer_init_43435032351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15269;
     Object term15329;
     Object term15331;

    public CollectionDeserializer_init_43435032351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15269 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Object term15319 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term15269, term15269.getClass(), "_collectionType", term15319);
        term15329 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Object term15330 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term15330, term15330.getClass(), "_keyType", null);
        setField(term15330, term15330.getClass(), "_valueType", null);
        setField(term15330, term15330.getClass(), "_superClass", null);
        setField(term15330, term15330.getClass(), "_superInterfaces", null);
        setField(term15330, term15330.getClass(), "_bindings", null);
        setField(term15330, term15330.getClass(), "_canonicalName", null);
        setField(term15330, term15330.getClass(), "_class", null);
        setIntField(term15330, term15330.getClass(), "_hash", 0);
        setField(term15330, term15330.getClass(), "_valueHandler", null);
        setField(term15330, term15330.getClass(), "_typeHandler", null);
        setBooleanField(term15330, term15330.getClass(), "_asStatic", false);
        setField(term15329, term15329.getClass(), "_collectionType", term15330);
        setField(term15329, term15329.getClass(), "_valueDeserializer", null);
        setField(term15329, term15329.getClass(), "_valueTypeDeserializer", null);
        setField(term15329, term15329.getClass(), "_valueInstantiator", null);
        setField(term15329, term15329.getClass(), "_delegateDeserializer", null);
        setField(term15329, term15329.getClass(), "_unwrapSingle", null);
        setField(term15329, term15329.getClass(), "_valueClass", null);
        term15331 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Object term15332 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term15332, term15332.getClass(), "_keyType", null);
        setField(term15332, term15332.getClass(), "_valueType", null);
        setField(term15332, term15332.getClass(), "_superClass", null);
        setField(term15332, term15332.getClass(), "_superInterfaces", null);
        setField(term15332, term15332.getClass(), "_bindings", null);
        setField(term15332, term15332.getClass(), "_canonicalName", null);
        setField(term15332, term15332.getClass(), "_class", null);
        setIntField(term15332, term15332.getClass(), "_hash", 0);
        setField(term15332, term15332.getClass(), "_valueHandler", null);
        setField(term15332, term15332.getClass(), "_typeHandler", null);
        setBooleanField(term15332, term15332.getClass(), "_asStatic", false);
        setField(term15331, term15331.getClass(), "_collectionType", term15332);
        setField(term15331, term15331.getClass(), "_valueDeserializer", null);
        setField(term15331, term15331.getClass(), "_valueTypeDeserializer", null);
        setField(term15331, term15331.getClass(), "_valueInstantiator", null);
        setField(term15331, term15331.getClass(), "_delegateDeserializer", null);
        setField(term15331, term15331.getClass(), "_unwrapSingle", null);
        setField(term15331, term15331.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Object[] args = new Object[1];
        args[0] = term15269;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term15329));
        assertTrue(recursiveEquals(term15269, term15331));
    }

};


