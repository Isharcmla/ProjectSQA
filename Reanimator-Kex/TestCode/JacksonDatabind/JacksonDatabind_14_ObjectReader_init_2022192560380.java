package com.fasterxml.jackson.databind;

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
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.EqualityUtils.*;
import java.lang.Object;

public class ObjectReader_init_2022192560380 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185731;
     Object term185989;
     Object term186095;
     Object term186183;
     Object term186189;
     Object term186190;
     Object term186191;

    public ObjectReader_init_2022192560380() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term185491 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term185639 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term185491, term185491.getClass(), "_config", null);
        setField(term185491, term185491.getClass(), "_context", term185639);
        setField(term185491, term185491.getClass(), "_rootDeserializers", null);
        setField(term185491, term185491.getClass(), "_parserFactory", null);
        setField(term185491, term185491.getClass(), "_rootNames", null);
        setField(term185491, term185491.getClass(), "_valueType", null);
        setField(term185491, term185491.getClass(), "_rootDeserializer", null);
        setField(term185491, term185491.getClass(), "_valueToUpdate", null);
        setField(term185491, term185491.getClass(), "_schema", null);
        setField(term185491, term185491.getClass(), "_injectableValues", null);
        term185731 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term185879 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term185731, term185731.getClass(), "_context", term185879);
        setField(term185731, term185731.getClass(), "_rootDeserializers", null);
        setField(term185731, term185731.getClass(), "_parserFactory", null);
        setField(term185731, term185731.getClass(), "_rootNames", null);
        term185989 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term185989, term185989.getClass(), "_rootName", null);
        setIntField(term185989, term185989.getClass(), "_deserFeatures", -1);
        term186095 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        term186183 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term186184 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term186185 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term186186 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setIntField(term186184, term186184.getClass(), "_deserFeatures", -1);
        setField(term186184, term186184.getClass(), "_problemHandlers", null);
        setField(term186184, term186184.getClass(), "_nodeFactory", null);
        setIntField(term186184, term186184.getClass(), "_parserFeatures", 0);
        setIntField(term186184, term186184.getClass(), "_parserFeaturesToChange", 0);
        setField(term186184, term186184.getClass(), "_mixInAnnotations", null);
        setField(term186184, term186184.getClass(), "_subtypeResolver", null);
        setField(term186184, term186184.getClass(), "_rootName", null);
        setField(term186184, term186184.getClass(), "_view", null);
        setField(term186184, term186184.getClass(), "_attributes", null);
        setIntField(term186184, term186184.getClass(), "_mapperFeatures", 0);
        setField(term186184, term186184.getClass(), "_base", null);
        setField(term186183, term186183.getClass(), "_config", term186184);
        setField(term186185, term186185.getClass(), "_objectIds", null);
        setField(term186185, term186185.getClass(), "_objectIdResolvers", null);
        setField(term186185, term186185.getClass(), "_cache", null);
        setField(term186185, term186185.getClass(), "_factory", null);
        setField(term186185, term186185.getClass(), "_config", null);
        setIntField(term186185, term186185.getClass(), "_featureFlags", 0);
        setField(term186185, term186185.getClass(), "_view", null);
        setField(term186185, term186185.getClass(), "_parser", null);
        setField(term186185, term186185.getClass(), "_injectableValues", null);
        setField(term186185, term186185.getClass(), "_arrayBuilders", null);
        setField(term186185, term186185.getClass(), "_objectBuffer", null);
        setField(term186185, term186185.getClass(), "_dateFormat", null);
        setField(term186185, term186185.getClass(), "_attributes", null);
        setField(term186185, term186185.getClass(), "_currentType", null);
        setField(term186183, term186183.getClass(), "_context", term186185);
        setField(term186183, term186183.getClass(), "_parserFactory", null);
        setBooleanField(term186183, term186183.getClass(), "_unwrapRoot", true);
        setField(term186186, term186186.getClass(), "_elementType", null);
        setField(term186186, term186186.getClass(), "_canonicalName", null);
        setField(term186186, term186186.getClass(), "_class", null);
        setIntField(term186186, term186186.getClass(), "_hash", 0);
        setField(term186186, term186186.getClass(), "_valueHandler", null);
        setField(term186186, term186186.getClass(), "_typeHandler", null);
        setBooleanField(term186186, term186186.getClass(), "_asStatic", false);
        setField(term186183, term186183.getClass(), "_valueType", term186186);
        setField(term186183, term186183.getClass(), "_rootDeserializer", null);
        setField(term186183, term186183.getClass(), "_valueToUpdate", "");
        setField(term186183, term186183.getClass(), "_schema", null);
        setField(term186183, term186183.getClass(), "_injectableValues", null);
        setField(term186183, term186183.getClass(), "_dataFormatReaders", null);
        setField(term186183, term186183.getClass(), "_rootDeserializers", null);
        setField(term186183, term186183.getClass(), "_rootNames", null);
        term186189 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term186189, term186189.getClass(), "_elementType", null);
        setField(term186189, term186189.getClass(), "_canonicalName", null);
        setField(term186189, term186189.getClass(), "_class", null);
        setIntField(term186189, term186189.getClass(), "_hash", 0);
        setField(term186189, term186189.getClass(), "_valueHandler", null);
        setField(term186189, term186189.getClass(), "_typeHandler", null);
        setBooleanField(term186189, term186189.getClass(), "_asStatic", false);
        term186190 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setIntField(term186190, term186190.getClass(), "_deserFeatures", -1);
        setField(term186190, term186190.getClass(), "_problemHandlers", null);
        setField(term186190, term186190.getClass(), "_nodeFactory", null);
        setIntField(term186190, term186190.getClass(), "_parserFeatures", 0);
        setIntField(term186190, term186190.getClass(), "_parserFeaturesToChange", 0);
        setField(term186190, term186190.getClass(), "_mixInAnnotations", null);
        setField(term186190, term186190.getClass(), "_subtypeResolver", null);
        setField(term186190, term186190.getClass(), "_rootName", null);
        setField(term186190, term186190.getClass(), "_view", null);
        setField(term186190, term186190.getClass(), "_attributes", null);
        setIntField(term186190, term186190.getClass(), "_mapperFeatures", 0);
        setField(term186190, term186190.getClass(), "_base", null);
        term186191 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term186192 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term186191, term186191.getClass(), "_config", null);
        setField(term186192, term186192.getClass(), "_objectIds", null);
        setField(term186192, term186192.getClass(), "_objectIdResolvers", null);
        setField(term186192, term186192.getClass(), "_cache", null);
        setField(term186192, term186192.getClass(), "_factory", null);
        setField(term186192, term186192.getClass(), "_config", null);
        setIntField(term186192, term186192.getClass(), "_featureFlags", 0);
        setField(term186192, term186192.getClass(), "_view", null);
        setField(term186192, term186192.getClass(), "_parser", null);
        setField(term186192, term186192.getClass(), "_injectableValues", null);
        setField(term186192, term186192.getClass(), "_arrayBuilders", null);
        setField(term186192, term186192.getClass(), "_objectBuffer", null);
        setField(term186192, term186192.getClass(), "_dateFormat", null);
        setField(term186192, term186192.getClass(), "_attributes", null);
        setField(term186192, term186192.getClass(), "_currentType", null);
        setField(term186191, term186191.getClass(), "_context", term186192);
        setField(term186191, term186191.getClass(), "_parserFactory", null);
        setBooleanField(term186191, term186191.getClass(), "_unwrapRoot", false);
        setField(term186191, term186191.getClass(), "_valueType", null);
        setField(term186191, term186191.getClass(), "_rootDeserializer", null);
        setField(term186191, term186191.getClass(), "_valueToUpdate", null);
        setField(term186191, term186191.getClass(), "_schema", null);
        setField(term186191, term186191.getClass(), "_injectableValues", null);
        setField(term186191, term186191.getClass(), "_dataFormatReaders", null);
        setField(term186191, term186191.getClass(), "_rootDeserializers", null);
        setField(term186191, term186191.getClass(), "_rootNames", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        argTypes[4] = Class.forName("java.lang.Object");
        argTypes[5] = Class.forName("com.fasterxml.jackson.core.FormatSchema");
        argTypes[6] = Class.forName("com.fasterxml.jackson.databind.InjectableValues");
        argTypes[7] = Class.forName("com.fasterxml.jackson.databind.deser.DataFormatReaders");
        Object[] args = new Object[8];
        args[0] = term185731;
        args[1] = term185989;
        args[2] = term186095;
        args[3] = null;
        args[4] = "";
        args[5] = null;
        args[6] = null;
        args[7] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term186183));
        assertTrue(recursiveEquals(term185731, term186189));
        assertTrue(recursiveEquals(term185989, term186190));
        assertTrue(recursiveEquals(term186095, term186191));
    }

};


