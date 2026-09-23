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

public class ObjectIdValueProperty_init_189141968739 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9395;
     Object term9717;
     Object term10336;
     Object term10343;
     Object term10348;

    public ObjectIdValueProperty_init_189141968739() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term9177 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term9277 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term9177, term9177.getClass(), "_metadata", term9277);
        setIntField(term9177, term9177.getClass(), "_propertyIndex", 0);
        term9395 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term9487 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term9617 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term9487, term9487.getClass(), "_simpleName", "");
        setField(term9395, term9395.getClass(), "propertyName", term9487);
        setField(term9395, term9395.getClass(), "_idType", term9617);
        setField(term9395, term9395.getClass(), "_deserializer", null);
        term9717 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        term10336 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term10337 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term10338 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term10339 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term10342 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term10338, term10338.getClass(), "_keyType", null);
        setField(term10338, term10338.getClass(), "_valueType", null);
        setField(term10338, term10338.getClass(), "_superClass", null);
        setField(term10338, term10338.getClass(), "_superInterfaces", null);
        setField(term10338, term10338.getClass(), "_bindings", null);
        setField(term10338, term10338.getClass(), "_canonicalName", null);
        setField(term10338, term10338.getClass(), "_class", null);
        setIntField(term10338, term10338.getClass(), "_hash", 0);
        setField(term10338, term10338.getClass(), "_valueHandler", null);
        setField(term10338, term10338.getClass(), "_typeHandler", null);
        setBooleanField(term10338, term10338.getClass(), "_asStatic", false);
        setField(term10337, term10337.getClass(), "_idType", term10338);
        setField(term10339, term10339.getClass(), "_simpleName", "");
        setField(term10339, term10339.getClass(), "_namespace", null);
        setField(term10339, term10339.getClass(), "_encodedSimple", null);
        setField(term10337, term10337.getClass(), "propertyName", term10339);
        setField(term10337, term10337.getClass(), "generator", null);
        setField(term10337, term10337.getClass(), "resolver", null);
        setField(term10337, term10337.getClass(), "_deserializer", null);
        setField(term10337, term10337.getClass(), "idProperty", null);
        setField(term10336, term10336.getClass(), "_objectIdReader", term10337);
        setField(term10336, term10336.getClass(), "_propName", term10339);
        setField(term10336, term10336.getClass(), "_type", term10338);
        setField(term10336, term10336.getClass(), "_wrapperName", null);
        setField(term10336, term10336.getClass(), "_contextAnnotations", null);
        setField(term10336, term10336.getClass(), "_valueDeserializer", null);
        setField(term10336, term10336.getClass(), "_valueTypeDeserializer", null);
        setField(term10336, term10336.getClass(), "_nullProvider", null);
        setField(term10336, term10336.getClass(), "_managedReferenceName", null);
        setField(term10336, term10336.getClass(), "_objectIdInfo", null);
        setField(term10336, term10336.getClass(), "_viewMatcher", null);
        setIntField(term10336, term10336.getClass(), "_propertyIndex", -1);
        setField(term10342, term10342.getClass(), "_required", null);
        setField(term10342, term10342.getClass(), "_description", null);
        setField(term10342, term10342.getClass(), "_index", null);
        setField(term10342, term10342.getClass(), "_defaultValue", null);
        setField(term10342, term10342.getClass(), "_mergeInfo", null);
        setField(term10342, term10342.getClass(), "_valueNulls", null);
        setField(term10342, term10342.getClass(), "_contentNulls", null);
        setField(term10336, term10336.getClass(), "_metadata", term10342);
        setField(term10336, term10336.getClass(), "_propertyFormat", null);
        setField(term10336, term10336.getClass(), "_aliases", null);
        term10343 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term10344 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term10345 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term10344, term10344.getClass(), "_keyType", null);
        setField(term10344, term10344.getClass(), "_valueType", null);
        setField(term10344, term10344.getClass(), "_superClass", null);
        setField(term10344, term10344.getClass(), "_superInterfaces", null);
        setField(term10344, term10344.getClass(), "_bindings", null);
        setField(term10344, term10344.getClass(), "_canonicalName", null);
        setField(term10344, term10344.getClass(), "_class", null);
        setIntField(term10344, term10344.getClass(), "_hash", 0);
        setField(term10344, term10344.getClass(), "_valueHandler", null);
        setField(term10344, term10344.getClass(), "_typeHandler", null);
        setBooleanField(term10344, term10344.getClass(), "_asStatic", false);
        setField(term10343, term10343.getClass(), "_idType", term10344);
        setField(term10345, term10345.getClass(), "_simpleName", "");
        setField(term10345, term10345.getClass(), "_namespace", null);
        setField(term10345, term10345.getClass(), "_encodedSimple", null);
        setField(term10343, term10343.getClass(), "propertyName", term10345);
        setField(term10343, term10343.getClass(), "generator", null);
        setField(term10343, term10343.getClass(), "resolver", null);
        setField(term10343, term10343.getClass(), "_deserializer", null);
        setField(term10343, term10343.getClass(), "idProperty", null);
        term10348 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term10348, term10348.getClass(), "_required", null);
        setField(term10348, term10348.getClass(), "_description", null);
        setField(term10348, term10348.getClass(), "_index", null);
        setField(term10348, term10348.getClass(), "_defaultValue", null);
        setField(term10348, term10348.getClass(), "_mergeInfo", null);
        setField(term10348, term10348.getClass(), "_valueNulls", null);
        setField(term10348, term10348.getClass(), "_contentNulls", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
        Object[] args = new Object[2];
        args[0] = term9395;
        args[1] = term9717;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term10336));
        assertTrue(recursiveEquals(term9395, term10343));
        assertTrue(recursiveEquals(term9717, term10348));
    }

};


