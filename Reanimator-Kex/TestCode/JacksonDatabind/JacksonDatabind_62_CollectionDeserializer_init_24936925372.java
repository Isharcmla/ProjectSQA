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

public class CollectionDeserializer_init_24936925372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29288;
     Object term29604;
     Object term29606;

    public CollectionDeserializer_init_24936925372() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term29184 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        term29288 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        term29604 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Object term29605 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term29605, term29605.getClass(), "_referencedType", null);
        setField(term29605, term29605.getClass(), "_superClass", null);
        setField(term29605, term29605.getClass(), "_superInterfaces", null);
        setField(term29605, term29605.getClass(), "_bindings", null);
        setField(term29605, term29605.getClass(), "_canonicalName", null);
        setField(term29605, term29605.getClass(), "_class", null);
        setIntField(term29605, term29605.getClass(), "_hash", 0);
        setField(term29605, term29605.getClass(), "_valueHandler", null);
        setField(term29605, term29605.getClass(), "_typeHandler", null);
        setBooleanField(term29605, term29605.getClass(), "_asStatic", false);
        setField(term29604, term29604.getClass(), "_collectionType", term29605);
        setField(term29604, term29604.getClass(), "_valueDeserializer", null);
        setField(term29604, term29604.getClass(), "_valueTypeDeserializer", null);
        setField(term29604, term29604.getClass(), "_valueInstantiator", null);
        setField(term29604, term29604.getClass(), "_delegateDeserializer", null);
        setField(term29604, term29604.getClass(), "_unwrapSingle", null);
        setField(term29604, term29604.getClass(), "_valueClass", null);
        term29606 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term29606, term29606.getClass(), "_referencedType", null);
        setField(term29606, term29606.getClass(), "_superClass", null);
        setField(term29606, term29606.getClass(), "_superInterfaces", null);
        setField(term29606, term29606.getClass(), "_bindings", null);
        setField(term29606, term29606.getClass(), "_canonicalName", null);
        setField(term29606, term29606.getClass(), "_class", null);
        setIntField(term29606, term29606.getClass(), "_hash", 0);
        setField(term29606, term29606.getClass(), "_valueHandler", null);
        setField(term29606, term29606.getClass(), "_typeHandler", null);
        setBooleanField(term29606, term29606.getClass(), "_asStatic", false);
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
        args[0] = term29288;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term29604));
        assertTrue(recursiveEquals(term29288, term29606));
    }

};


