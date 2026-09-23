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

public class ObjectReader_init_2073957032387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160908;
     Object term161165;
     Object term161110;
     Object term161252;
     Object term161255;
     Object term161256;
     Object term161257;
     Object term161258;

    public ObjectReader_init_2073957032387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term160634 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term160716 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term160816 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term160634, term160634.getClass(), "_config", null);
        setField(term160634, term160634.getClass(), "_context", null);
        setField(term160634, term160634.getClass(), "_rootDeserializers", null);
        setField(term160634, term160634.getClass(), "_parserFactory", term160716);
        setField(term160634, term160634.getClass(), "_valueType", term160816);
        setField(term160634, term160634.getClass(), "_valueToUpdate", term160816);
        setField(term160634, term160634.getClass(), "_schema", null);
        setField(term160634, term160634.getClass(), "_injectableValues", null);
        term160908 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        setField(term160908, term160908.getClass(), "_deserializationContext", null);
        setField(term160908, term160908.getClass(), "_rootDeserializers", null);
        setField(term160908, term160908.getClass(), "_jsonFactory", null);
        term161165 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        term161110 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        term161252 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term161253 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term161254 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term161253, term161253.getClass(), "_problemHandlers", null);
        setField(term161253, term161253.getClass(), "_nodeFactory", null);
        setIntField(term161253, term161253.getClass(), "_deserFeatures", 0);
        setIntField(term161253, term161253.getClass(), "_parserFeatures", 0);
        setIntField(term161253, term161253.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term161253, term161253.getClass(), "_formatReadFeatures", 0);
        setIntField(term161253, term161253.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term161253, term161253.getClass(), "_mixIns", null);
        setField(term161253, term161253.getClass(), "_subtypeResolver", null);
        setField(term161253, term161253.getClass(), "_rootName", null);
        setField(term161253, term161253.getClass(), "_view", null);
        setField(term161253, term161253.getClass(), "_attributes", null);
        setField(term161253, term161253.getClass(), "_rootNames", null);
        setIntField(term161253, term161253.getClass(), "_mapperFeatures", 0);
        setField(term161253, term161253.getClass(), "_base", null);
        setField(term161252, term161252.getClass(), "_config", term161253);
        setField(term161252, term161252.getClass(), "_context", null);
        setField(term161252, term161252.getClass(), "_parserFactory", null);
        setBooleanField(term161252, term161252.getClass(), "_unwrapRoot", false);
        setField(term161252, term161252.getClass(), "_filter", null);
        setField(term161254, term161254.getClass(), "_keyType", null);
        setField(term161254, term161254.getClass(), "_valueType", null);
        setField(term161254, term161254.getClass(), "_superClass", null);
        setField(term161254, term161254.getClass(), "_superInterfaces", null);
        setField(term161254, term161254.getClass(), "_bindings", null);
        setField(term161254, term161254.getClass(), "_canonicalName", null);
        setField(term161254, term161254.getClass(), "_class", null);
        setIntField(term161254, term161254.getClass(), "_hash", 0);
        setField(term161254, term161254.getClass(), "_valueHandler", null);
        setField(term161254, term161254.getClass(), "_typeHandler", null);
        setBooleanField(term161254, term161254.getClass(), "_asStatic", false);
        setField(term161252, term161252.getClass(), "_valueType", term161254);
        setField(term161252, term161252.getClass(), "_rootDeserializer", null);
        setField(term161252, term161252.getClass(), "_valueToUpdate", term161253);
        setField(term161252, term161252.getClass(), "_schema", null);
        setField(term161252, term161252.getClass(), "_injectableValues", null);
        setField(term161252, term161252.getClass(), "_dataFormatReaders", null);
        setField(term161252, term161252.getClass(), "_rootDeserializers", null);
        term161255 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term161255, term161255.getClass(), "_keyType", null);
        setField(term161255, term161255.getClass(), "_valueType", null);
        setField(term161255, term161255.getClass(), "_superClass", null);
        setField(term161255, term161255.getClass(), "_superInterfaces", null);
        setField(term161255, term161255.getClass(), "_bindings", null);
        setField(term161255, term161255.getClass(), "_canonicalName", null);
        setField(term161255, term161255.getClass(), "_class", null);
        setIntField(term161255, term161255.getClass(), "_hash", 0);
        setField(term161255, term161255.getClass(), "_valueHandler", null);
        setField(term161255, term161255.getClass(), "_typeHandler", null);
        setBooleanField(term161255, term161255.getClass(), "_asStatic", false);
        term161256 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term161256, term161256.getClass(), "_problemHandlers", null);
        setField(term161256, term161256.getClass(), "_nodeFactory", null);
        setIntField(term161256, term161256.getClass(), "_deserFeatures", 0);
        setIntField(term161256, term161256.getClass(), "_parserFeatures", 0);
        setIntField(term161256, term161256.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term161256, term161256.getClass(), "_formatReadFeatures", 0);
        setIntField(term161256, term161256.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term161256, term161256.getClass(), "_mixIns", null);
        setField(term161256, term161256.getClass(), "_subtypeResolver", null);
        setField(term161256, term161256.getClass(), "_rootName", null);
        setField(term161256, term161256.getClass(), "_view", null);
        setField(term161256, term161256.getClass(), "_attributes", null);
        setField(term161256, term161256.getClass(), "_rootNames", null);
        setIntField(term161256, term161256.getClass(), "_mapperFeatures", 0);
        setField(term161256, term161256.getClass(), "_base", null);
        term161257 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        setField(term161257, term161257.getClass(), "_jsonFactory", null);
        setField(term161257, term161257.getClass(), "_typeFactory", null);
        setField(term161257, term161257.getClass(), "_injectableValues", null);
        setField(term161257, term161257.getClass(), "_subtypeResolver", null);
        setField(term161257, term161257.getClass(), "_mixIns", null);
        setField(term161257, term161257.getClass(), "_serializationConfig", null);
        setField(term161257, term161257.getClass(), "_serializerProvider", null);
        setField(term161257, term161257.getClass(), "_serializerFactory", null);
        setField(term161257, term161257.getClass(), "_deserializationConfig", null);
        setField(term161257, term161257.getClass(), "_deserializationContext", null);
        setField(term161257, term161257.getClass(), "_registeredModuleTypes", null);
        setField(term161257, term161257.getClass(), "_rootDeserializers", null);
        term161258 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term161258, term161258.getClass(), "_problemHandlers", null);
        setField(term161258, term161258.getClass(), "_nodeFactory", null);
        setIntField(term161258, term161258.getClass(), "_deserFeatures", 0);
        setIntField(term161258, term161258.getClass(), "_parserFeatures", 0);
        setIntField(term161258, term161258.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term161258, term161258.getClass(), "_formatReadFeatures", 0);
        setIntField(term161258, term161258.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term161258, term161258.getClass(), "_mixIns", null);
        setField(term161258, term161258.getClass(), "_subtypeResolver", null);
        setField(term161258, term161258.getClass(), "_rootName", null);
        setField(term161258, term161258.getClass(), "_view", null);
        setField(term161258, term161258.getClass(), "_attributes", null);
        setField(term161258, term161258.getClass(), "_rootNames", null);
        setIntField(term161258, term161258.getClass(), "_mapperFeatures", 0);
        setField(term161258, term161258.getClass(), "_base", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[3] = Class.forName("java.lang.Object");
        argTypes[4] = Class.forName("com.fasterxml.jackson.core.FormatSchema");
        argTypes[5] = Class.forName("com.fasterxml.jackson.databind.InjectableValues");
        Object[] args = new Object[6];
        args[0] = term160908;
        args[1] = term161165;
        args[2] = term161110;
        args[3] = term161165;
        args[4] = null;
        args[5] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term161252));
        assertTrue(recursiveEquals(term160908, term161255));
        assertTrue(recursiveEquals(term161165, term161256));
        assertTrue(recursiveEquals(term161110, term161257));
        assertTrue(recursiveEquals(term161165, term161258));
    }

};


