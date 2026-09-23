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

public class ObjectReader_init_2073957032221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29366;
     Object term29476;
     Object term30350;
     Object term30352;
     Object term30353;

    public ObjectReader_init_2073957032221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term29164 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term29274 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term29164, term29164.getClass(), "_config", term29274);
        term29366 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        term29476 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        term30350 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term30351 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setIntField(term30351, term30351.getClass(), "_deserFeatures", 0);
        setField(term30351, term30351.getClass(), "_problemHandlers", null);
        setField(term30351, term30351.getClass(), "_nodeFactory", null);
        setIntField(term30351, term30351.getClass(), "_parserFeatures", 0);
        setIntField(term30351, term30351.getClass(), "_parserFeaturesToChange", 0);
        setField(term30351, term30351.getClass(), "_mixInAnnotations", null);
        setField(term30351, term30351.getClass(), "_subtypeResolver", null);
        setField(term30351, term30351.getClass(), "_rootName", null);
        setField(term30351, term30351.getClass(), "_view", null);
        setField(term30351, term30351.getClass(), "_attributes", null);
        setIntField(term30351, term30351.getClass(), "_mapperFeatures", 0);
        setField(term30351, term30351.getClass(), "_base", null);
        setField(term30350, term30350.getClass(), "_config", term30351);
        setField(term30350, term30350.getClass(), "_context", null);
        setField(term30350, term30350.getClass(), "_parserFactory", null);
        setBooleanField(term30350, term30350.getClass(), "_unwrapRoot", false);
        setField(term30350, term30350.getClass(), "_valueType", null);
        setField(term30350, term30350.getClass(), "_rootDeserializer", null);
        setField(term30350, term30350.getClass(), "_valueToUpdate", null);
        setField(term30350, term30350.getClass(), "_schema", null);
        setField(term30350, term30350.getClass(), "_injectableValues", null);
        setField(term30350, term30350.getClass(), "_dataFormatReaders", null);
        setField(term30350, term30350.getClass(), "_rootDeserializers", null);
        setField(term30350, term30350.getClass(), "_rootNames", null);
        term30352 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setIntField(term30352, term30352.getClass(), "_deserFeatures", 0);
        setField(term30352, term30352.getClass(), "_problemHandlers", null);
        setField(term30352, term30352.getClass(), "_nodeFactory", null);
        setIntField(term30352, term30352.getClass(), "_parserFeatures", 0);
        setIntField(term30352, term30352.getClass(), "_parserFeaturesToChange", 0);
        setField(term30352, term30352.getClass(), "_mixInAnnotations", null);
        setField(term30352, term30352.getClass(), "_subtypeResolver", null);
        setField(term30352, term30352.getClass(), "_rootName", null);
        setField(term30352, term30352.getClass(), "_view", null);
        setField(term30352, term30352.getClass(), "_attributes", null);
        setIntField(term30352, term30352.getClass(), "_mapperFeatures", 0);
        setField(term30352, term30352.getClass(), "_base", null);
        term30353 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        setField(term30353, term30353.getClass(), "_jsonFactory", null);
        setField(term30353, term30353.getClass(), "_typeFactory", null);
        setField(term30353, term30353.getClass(), "_injectableValues", null);
        setField(term30353, term30353.getClass(), "_subtypeResolver", null);
        setField(term30353, term30353.getClass(), "_rootNames", null);
        setField(term30353, term30353.getClass(), "_mixInAnnotations", null);
        setField(term30353, term30353.getClass(), "_serializationConfig", null);
        setField(term30353, term30353.getClass(), "_serializerProvider", null);
        setField(term30353, term30353.getClass(), "_serializerFactory", null);
        setField(term30353, term30353.getClass(), "_deserializationConfig", null);
        setField(term30353, term30353.getClass(), "_deserializationContext", null);
        setField(term30353, term30353.getClass(), "_registeredModuleTypes", null);
        setField(term30353, term30353.getClass(), "_rootDeserializers", null);
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
        args[0] = term29366;
        args[1] = term29476;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term30350));
        assertTrue(recursiveEquals(term29366, term30352));
        assertTrue(recursiveEquals(term29476, null));
    }

};


