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

public class CollectionDeserializer_init_49897962580 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31060;
     Object term31320;
     Object term31322;

    public CollectionDeserializer_init_49897962580() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term30956 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        term31060 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        term31320 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Object term31321 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term31321, term31321.getClass(), "_referencedType", null);
        setField(term31321, term31321.getClass(), "_superClass", null);
        setField(term31321, term31321.getClass(), "_superInterfaces", null);
        setField(term31321, term31321.getClass(), "_bindings", null);
        setField(term31321, term31321.getClass(), "_canonicalName", null);
        setField(term31321, term31321.getClass(), "_class", null);
        setIntField(term31321, term31321.getClass(), "_hash", 0);
        setField(term31321, term31321.getClass(), "_valueHandler", null);
        setField(term31321, term31321.getClass(), "_typeHandler", null);
        setBooleanField(term31321, term31321.getClass(), "_asStatic", false);
        setField(term31320, term31320.getClass(), "_collectionType", term31321);
        setField(term31320, term31320.getClass(), "_valueDeserializer", null);
        setField(term31320, term31320.getClass(), "_valueTypeDeserializer", null);
        setField(term31320, term31320.getClass(), "_valueInstantiator", null);
        setField(term31320, term31320.getClass(), "_delegateDeserializer", null);
        setField(term31320, term31320.getClass(), "_unwrapSingle", null);
        setField(term31320, term31320.getClass(), "_valueClass", null);
        term31322 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term31322, term31322.getClass(), "_referencedType", null);
        setField(term31322, term31322.getClass(), "_superClass", null);
        setField(term31322, term31322.getClass(), "_superInterfaces", null);
        setField(term31322, term31322.getClass(), "_bindings", null);
        setField(term31322, term31322.getClass(), "_canonicalName", null);
        setField(term31322, term31322.getClass(), "_class", null);
        setIntField(term31322, term31322.getClass(), "_hash", 0);
        setField(term31322, term31322.getClass(), "_valueHandler", null);
        setField(term31322, term31322.getClass(), "_typeHandler", null);
        setBooleanField(term31322, term31322.getClass(), "_asStatic", false);
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
        args[0] = term31060;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term31320));
        assertTrue(recursiveEquals(term31060, term31322));
    }

};


