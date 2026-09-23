package com.fasterxml.jackson.databind.deser.impl;

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
import static com.fasterxml.jackson.databind.deser.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.deser.impl.EqualityUtils.*;
import java.lang.Object;

public class ObjectIdValueProperty_init_189141968743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10726;
     Object term10932;
     Object term14114;
     Object term14121;
     Object term14123;

    public ObjectIdValueProperty_init_189141968743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term10508 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term10608 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term10508, term10508.getClass(), "_metadata", term10608);
        setIntField(term10508, term10508.getClass(), "_propertyIndex", 0);
        term10726 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term10832 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term10726, term10726.getClass(), "propertyName", null);
        setField(term10726, term10726.getClass(), "_idType", term10832);
        setField(term10726, term10726.getClass(), "_deserializer", null);
        term10932 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        term14114 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term14115 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term14116 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term14117 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term14120 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term14116, term14116.getClass(), "_elementType", null);
        setField(term14116, term14116.getClass(), "_superClass", null);
        setField(term14116, term14116.getClass(), "_superInterfaces", null);
        setField(term14116, term14116.getClass(), "_bindings", null);
        setField(term14116, term14116.getClass(), "_canonicalName", null);
        setField(term14116, term14116.getClass(), "_class", null);
        setIntField(term14116, term14116.getClass(), "_hash", 0);
        setField(term14116, term14116.getClass(), "_valueHandler", null);
        setField(term14116, term14116.getClass(), "_typeHandler", null);
        setBooleanField(term14116, term14116.getClass(), "_asStatic", false);
        setField(term14115, term14115.getClass(), "_idType", term14116);
        setField(term14115, term14115.getClass(), "propertyName", null);
        setField(term14115, term14115.getClass(), "generator", null);
        setField(term14115, term14115.getClass(), "resolver", null);
        setField(term14115, term14115.getClass(), "_deserializer", null);
        setField(term14115, term14115.getClass(), "idProperty", null);
        setField(term14114, term14114.getClass(), "_objectIdReader", term14115);
        setField(term14117, term14117.getClass(), "_simpleName", "");
        setField(term14117, term14117.getClass(), "_namespace", null);
        setField(term14117, term14117.getClass(), "_encodedSimple", null);
        setField(term14114, term14114.getClass(), "_propName", term14117);
        setField(term14114, term14114.getClass(), "_type", term14116);
        setField(term14114, term14114.getClass(), "_wrapperName", null);
        setField(term14114, term14114.getClass(), "_contextAnnotations", null);
        setField(term14114, term14114.getClass(), "_valueDeserializer", null);
        setField(term14114, term14114.getClass(), "_valueTypeDeserializer", null);
        setField(term14114, term14114.getClass(), "_nullProvider", null);
        setField(term14114, term14114.getClass(), "_managedReferenceName", null);
        setField(term14114, term14114.getClass(), "_objectIdInfo", null);
        setField(term14114, term14114.getClass(), "_viewMatcher", null);
        setIntField(term14114, term14114.getClass(), "_propertyIndex", -1);
        setField(term14120, term14120.getClass(), "_required", null);
        setField(term14120, term14120.getClass(), "_description", null);
        setField(term14120, term14120.getClass(), "_index", null);
        setField(term14120, term14120.getClass(), "_defaultValue", null);
        setField(term14120, term14120.getClass(), "_mergeInfo", null);
        setField(term14120, term14120.getClass(), "_valueNulls", null);
        setField(term14120, term14120.getClass(), "_contentNulls", null);
        setField(term14114, term14114.getClass(), "_metadata", term14120);
        setField(term14114, term14114.getClass(), "_propertyFormat", null);
        setField(term14114, term14114.getClass(), "_aliases", null);
        term14121 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term14122 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term14122, term14122.getClass(), "_elementType", null);
        setField(term14122, term14122.getClass(), "_superClass", null);
        setField(term14122, term14122.getClass(), "_superInterfaces", null);
        setField(term14122, term14122.getClass(), "_bindings", null);
        setField(term14122, term14122.getClass(), "_canonicalName", null);
        setField(term14122, term14122.getClass(), "_class", null);
        setIntField(term14122, term14122.getClass(), "_hash", 0);
        setField(term14122, term14122.getClass(), "_valueHandler", null);
        setField(term14122, term14122.getClass(), "_typeHandler", null);
        setBooleanField(term14122, term14122.getClass(), "_asStatic", false);
        setField(term14121, term14121.getClass(), "_idType", term14122);
        setField(term14121, term14121.getClass(), "propertyName", null);
        setField(term14121, term14121.getClass(), "generator", null);
        setField(term14121, term14121.getClass(), "resolver", null);
        setField(term14121, term14121.getClass(), "_deserializer", null);
        setField(term14121, term14121.getClass(), "idProperty", null);
        term14123 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term14123, term14123.getClass(), "_required", null);
        setField(term14123, term14123.getClass(), "_description", null);
        setField(term14123, term14123.getClass(), "_index", null);
        setField(term14123, term14123.getClass(), "_defaultValue", null);
        setField(term14123, term14123.getClass(), "_mergeInfo", null);
        setField(term14123, term14123.getClass(), "_valueNulls", null);
        setField(term14123, term14123.getClass(), "_contentNulls", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
        Object[] args = new Object[2];
        args[0] = term10726;
        args[1] = term10932;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term14114));
        assertTrue(recursiveEquals(term10726, term14121));
        assertTrue(recursiveEquals(term10932, term14123));
    }

};


