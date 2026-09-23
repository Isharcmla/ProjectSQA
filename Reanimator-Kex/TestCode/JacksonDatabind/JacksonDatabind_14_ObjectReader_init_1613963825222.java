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

public class ObjectReader_init_1613963825222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29784;
     Object term29894;
     Object term30392;
     Object term30394;
     Object term30395;

    public ObjectReader_init_1613963825222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term29582 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term29692 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term29582, term29582.getClass(), "_config", term29692);
        term29784 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        term29894 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        term30392 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term30393 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setIntField(term30393, term30393.getClass(), "_deserFeatures", 0);
        setField(term30393, term30393.getClass(), "_problemHandlers", null);
        setField(term30393, term30393.getClass(), "_nodeFactory", null);
        setIntField(term30393, term30393.getClass(), "_parserFeatures", 0);
        setIntField(term30393, term30393.getClass(), "_parserFeaturesToChange", 0);
        setField(term30393, term30393.getClass(), "_mixInAnnotations", null);
        setField(term30393, term30393.getClass(), "_subtypeResolver", null);
        setField(term30393, term30393.getClass(), "_rootName", null);
        setField(term30393, term30393.getClass(), "_view", null);
        setField(term30393, term30393.getClass(), "_attributes", null);
        setIntField(term30393, term30393.getClass(), "_mapperFeatures", 0);
        setField(term30393, term30393.getClass(), "_base", null);
        setField(term30392, term30392.getClass(), "_config", term30393);
        setField(term30392, term30392.getClass(), "_context", null);
        setField(term30392, term30392.getClass(), "_parserFactory", null);
        setBooleanField(term30392, term30392.getClass(), "_unwrapRoot", false);
        setField(term30392, term30392.getClass(), "_valueType", null);
        setField(term30392, term30392.getClass(), "_rootDeserializer", null);
        setField(term30392, term30392.getClass(), "_valueToUpdate", null);
        setField(term30392, term30392.getClass(), "_schema", null);
        setField(term30392, term30392.getClass(), "_injectableValues", null);
        setField(term30392, term30392.getClass(), "_dataFormatReaders", null);
        setField(term30392, term30392.getClass(), "_rootDeserializers", null);
        setField(term30392, term30392.getClass(), "_rootNames", null);
        term30394 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setIntField(term30394, term30394.getClass(), "_deserFeatures", 0);
        setField(term30394, term30394.getClass(), "_problemHandlers", null);
        setField(term30394, term30394.getClass(), "_nodeFactory", null);
        setIntField(term30394, term30394.getClass(), "_parserFeatures", 0);
        setIntField(term30394, term30394.getClass(), "_parserFeaturesToChange", 0);
        setField(term30394, term30394.getClass(), "_mixInAnnotations", null);
        setField(term30394, term30394.getClass(), "_subtypeResolver", null);
        setField(term30394, term30394.getClass(), "_rootName", null);
        setField(term30394, term30394.getClass(), "_view", null);
        setField(term30394, term30394.getClass(), "_attributes", null);
        setIntField(term30394, term30394.getClass(), "_mapperFeatures", 0);
        setField(term30394, term30394.getClass(), "_base", null);
        term30395 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        setField(term30395, term30395.getClass(), "_jsonFactory", null);
        setField(term30395, term30395.getClass(), "_typeFactory", null);
        setField(term30395, term30395.getClass(), "_injectableValues", null);
        setField(term30395, term30395.getClass(), "_subtypeResolver", null);
        setField(term30395, term30395.getClass(), "_rootNames", null);
        setField(term30395, term30395.getClass(), "_mixInAnnotations", null);
        setField(term30395, term30395.getClass(), "_serializationConfig", null);
        setField(term30395, term30395.getClass(), "_serializerProvider", null);
        setField(term30395, term30395.getClass(), "_serializerFactory", null);
        setField(term30395, term30395.getClass(), "_deserializationConfig", null);
        setField(term30395, term30395.getClass(), "_deserializationContext", null);
        setField(term30395, term30395.getClass(), "_registeredModuleTypes", null);
        setField(term30395, term30395.getClass(), "_rootDeserializers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        Object[] args = new Object[2];
        args[0] = term29784;
        args[1] = term29894;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term30392));
        assertTrue(recursiveEquals(term29784, term30394));
        assertTrue(recursiveEquals(term29894, term30395));
    }

};


