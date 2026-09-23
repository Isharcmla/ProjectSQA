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

public class StringCollectionDeserializer_init_190405741332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4512;
     Object term5875;
     Object term5877;

    public StringCollectionDeserializer_init_190405741332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4416 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        term4512 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        term5875 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        Object term5876 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term5875, term5875.getClass(), "_valueDeserializer", null);
        setField(term5875, term5875.getClass(), "_valueInstantiator", null);
        setField(term5875, term5875.getClass(), "_delegateDeserializer", null);
        setField(term5876, term5876.getClass(), "_componentType", null);
        setField(term5876, term5876.getClass(), "_emptyArray", null);
        setField(term5876, term5876.getClass(), "_superClass", null);
        setField(term5876, term5876.getClass(), "_superInterfaces", null);
        setField(term5876, term5876.getClass(), "_bindings", null);
        setField(term5876, term5876.getClass(), "_canonicalName", null);
        setField(term5876, term5876.getClass(), "_class", null);
        setIntField(term5876, term5876.getClass(), "_hash", 0);
        setField(term5876, term5876.getClass(), "_valueHandler", null);
        setField(term5876, term5876.getClass(), "_typeHandler", null);
        setBooleanField(term5876, term5876.getClass(), "_asStatic", false);
        setField(term5875, term5875.getClass(), "_containerType", term5876);
        setField(term5875, term5875.getClass(), "_nullProvider", null);
        setField(term5875, term5875.getClass(), "_unwrapSingle", null);
        setBooleanField(term5875, term5875.getClass(), "_skipNullValues", false);
        setField(term5875, term5875.getClass(), "_valueClass", null);
        term5877 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term5877, term5877.getClass(), "_componentType", null);
        setField(term5877, term5877.getClass(), "_emptyArray", null);
        setField(term5877, term5877.getClass(), "_superClass", null);
        setField(term5877, term5877.getClass(), "_superInterfaces", null);
        setField(term5877, term5877.getClass(), "_bindings", null);
        setField(term5877, term5877.getClass(), "_canonicalName", null);
        setField(term5877, term5877.getClass(), "_class", null);
        setIntField(term5877, term5877.getClass(), "_hash", 0);
        setField(term5877, term5877.getClass(), "_valueHandler", null);
        setField(term5877, term5877.getClass(), "_typeHandler", null);
        setBooleanField(term5877, term5877.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.ValueInstantiator");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.deser.NullValueProvider");
        argTypes[5] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[6];
        args[0] = term4512;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term5875));
        assertTrue(recursiveEquals(term4512, term5877));
    }

};


