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

public class CollectionDeserializer_init_49897962537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5157;
     Object term5262;
     Object term5264;

    public CollectionDeserializer_init_49897962537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5059 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        term5157 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        term5262 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Object term5263 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term5263, term5263.getClass(), "_superClass", null);
        setField(term5263, term5263.getClass(), "_superInterfaces", null);
        setField(term5263, term5263.getClass(), "_bindings", null);
        setField(term5263, term5263.getClass(), "_canonicalName", null);
        setField(term5263, term5263.getClass(), "_class", null);
        setIntField(term5263, term5263.getClass(), "_hash", 0);
        setField(term5263, term5263.getClass(), "_valueHandler", null);
        setField(term5263, term5263.getClass(), "_typeHandler", null);
        setBooleanField(term5263, term5263.getClass(), "_asStatic", false);
        setField(term5262, term5262.getClass(), "_collectionType", term5263);
        setField(term5262, term5262.getClass(), "_valueDeserializer", null);
        setField(term5262, term5262.getClass(), "_valueTypeDeserializer", null);
        setField(term5262, term5262.getClass(), "_valueInstantiator", null);
        setField(term5262, term5262.getClass(), "_delegateDeserializer", null);
        setField(term5262, term5262.getClass(), "_unwrapSingle", null);
        setField(term5262, term5262.getClass(), "_valueClass", null);
        term5264 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term5264, term5264.getClass(), "_superClass", null);
        setField(term5264, term5264.getClass(), "_superInterfaces", null);
        setField(term5264, term5264.getClass(), "_bindings", null);
        setField(term5264, term5264.getClass(), "_canonicalName", null);
        setField(term5264, term5264.getClass(), "_class", null);
        setIntField(term5264, term5264.getClass(), "_hash", 0);
        setField(term5264, term5264.getClass(), "_valueHandler", null);
        setField(term5264, term5264.getClass(), "_typeHandler", null);
        setBooleanField(term5264, term5264.getClass(), "_asStatic", false);
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
        args[0] = term5157;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term5262));
        assertTrue(recursiveEquals(term5157, term5264));
    }

};


