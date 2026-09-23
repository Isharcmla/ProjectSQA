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

public class CollectionDeserializer_init_249369253123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64930;
     Object term64936;
     Object term64938;

    public CollectionDeserializer_init_249369253123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term64826 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        term64930 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        term64936 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Object term64937 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term64937, term64937.getClass(), "_referencedType", null);
        setField(term64937, term64937.getClass(), "_superClass", null);
        setField(term64937, term64937.getClass(), "_superInterfaces", null);
        setField(term64937, term64937.getClass(), "_bindings", null);
        setField(term64937, term64937.getClass(), "_canonicalName", null);
        setField(term64937, term64937.getClass(), "_class", null);
        setIntField(term64937, term64937.getClass(), "_hash", 0);
        setField(term64937, term64937.getClass(), "_valueHandler", null);
        setField(term64937, term64937.getClass(), "_typeHandler", null);
        setBooleanField(term64937, term64937.getClass(), "_asStatic", false);
        setField(term64936, term64936.getClass(), "_collectionType", term64937);
        setField(term64936, term64936.getClass(), "_valueDeserializer", null);
        setField(term64936, term64936.getClass(), "_valueTypeDeserializer", null);
        setField(term64936, term64936.getClass(), "_valueInstantiator", null);
        setField(term64936, term64936.getClass(), "_delegateDeserializer", null);
        setField(term64936, term64936.getClass(), "_unwrapSingle", null);
        setField(term64936, term64936.getClass(), "_valueClass", null);
        term64938 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term64938, term64938.getClass(), "_referencedType", null);
        setField(term64938, term64938.getClass(), "_superClass", null);
        setField(term64938, term64938.getClass(), "_superInterfaces", null);
        setField(term64938, term64938.getClass(), "_bindings", null);
        setField(term64938, term64938.getClass(), "_canonicalName", null);
        setField(term64938, term64938.getClass(), "_class", null);
        setIntField(term64938, term64938.getClass(), "_hash", 0);
        setField(term64938, term64938.getClass(), "_valueHandler", null);
        setField(term64938, term64938.getClass(), "_typeHandler", null);
        setBooleanField(term64938, term64938.getClass(), "_asStatic", false);
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
        args[0] = term64930;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term64936));
        assertTrue(recursiveEquals(term64930, term64938));
    }

};


