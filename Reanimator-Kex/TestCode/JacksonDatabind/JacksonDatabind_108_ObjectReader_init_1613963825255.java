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

public class ObjectReader_init_1613963825255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33684;
     Object term33794;
     Object term34668;
     Object term34670;
     Object term34671;

    public ObjectReader_init_1613963825255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term33482 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term33592 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term33482, term33482.getClass(), "_config", term33592);
        term33684 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        term33794 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        term34668 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term34669 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term34669, term34669.getClass(), "_problemHandlers", null);
        setField(term34669, term34669.getClass(), "_nodeFactory", null);
        setIntField(term34669, term34669.getClass(), "_deserFeatures", 0);
        setIntField(term34669, term34669.getClass(), "_parserFeatures", 0);
        setIntField(term34669, term34669.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term34669, term34669.getClass(), "_formatReadFeatures", 0);
        setIntField(term34669, term34669.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term34669, term34669.getClass(), "_mixIns", null);
        setField(term34669, term34669.getClass(), "_subtypeResolver", null);
        setField(term34669, term34669.getClass(), "_rootName", null);
        setField(term34669, term34669.getClass(), "_view", null);
        setField(term34669, term34669.getClass(), "_attributes", null);
        setField(term34669, term34669.getClass(), "_rootNames", null);
        setField(term34669, term34669.getClass(), "_configOverrides", null);
        setIntField(term34669, term34669.getClass(), "_mapperFeatures", 0);
        setField(term34669, term34669.getClass(), "_base", null);
        setField(term34668, term34668.getClass(), "_config", term34669);
        setField(term34668, term34668.getClass(), "_context", null);
        setField(term34668, term34668.getClass(), "_parserFactory", null);
        setBooleanField(term34668, term34668.getClass(), "_unwrapRoot", false);
        setField(term34668, term34668.getClass(), "_filter", null);
        setField(term34668, term34668.getClass(), "_valueType", null);
        setField(term34668, term34668.getClass(), "_rootDeserializer", null);
        setField(term34668, term34668.getClass(), "_valueToUpdate", null);
        setField(term34668, term34668.getClass(), "_schema", null);
        setField(term34668, term34668.getClass(), "_injectableValues", null);
        setField(term34668, term34668.getClass(), "_dataFormatReaders", null);
        setField(term34668, term34668.getClass(), "_rootDeserializers", null);
        term34670 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term34670, term34670.getClass(), "_problemHandlers", null);
        setField(term34670, term34670.getClass(), "_nodeFactory", null);
        setIntField(term34670, term34670.getClass(), "_deserFeatures", 0);
        setIntField(term34670, term34670.getClass(), "_parserFeatures", 0);
        setIntField(term34670, term34670.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term34670, term34670.getClass(), "_formatReadFeatures", 0);
        setIntField(term34670, term34670.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term34670, term34670.getClass(), "_mixIns", null);
        setField(term34670, term34670.getClass(), "_subtypeResolver", null);
        setField(term34670, term34670.getClass(), "_rootName", null);
        setField(term34670, term34670.getClass(), "_view", null);
        setField(term34670, term34670.getClass(), "_attributes", null);
        setField(term34670, term34670.getClass(), "_rootNames", null);
        setField(term34670, term34670.getClass(), "_configOverrides", null);
        setIntField(term34670, term34670.getClass(), "_mapperFeatures", 0);
        setField(term34670, term34670.getClass(), "_base", null);
        term34671 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        setField(term34671, term34671.getClass(), "_jsonFactory", null);
        setField(term34671, term34671.getClass(), "_typeFactory", null);
        setField(term34671, term34671.getClass(), "_injectableValues", null);
        setField(term34671, term34671.getClass(), "_subtypeResolver", null);
        setField(term34671, term34671.getClass(), "_configOverrides", null);
        setField(term34671, term34671.getClass(), "_mixIns", null);
        setField(term34671, term34671.getClass(), "_serializationConfig", null);
        setField(term34671, term34671.getClass(), "_serializerProvider", null);
        setField(term34671, term34671.getClass(), "_serializerFactory", null);
        setField(term34671, term34671.getClass(), "_deserializationConfig", null);
        setField(term34671, term34671.getClass(), "_deserializationContext", null);
        setField(term34671, term34671.getClass(), "_registeredModuleTypes", null);
        setField(term34671, term34671.getClass(), "_rootDeserializers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        Object[] args = new Object[2];
        args[0] = term33684;
        args[1] = term33794;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term34668));
        assertTrue(recursiveEquals(term33684, term34670));
        assertTrue(recursiveEquals(term33794, term34671));
    }

};


