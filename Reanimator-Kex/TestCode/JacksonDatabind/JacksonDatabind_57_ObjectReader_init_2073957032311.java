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

public class ObjectReader_init_2073957032311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83969;
     Object term84227;
     Object term84270;
     Object term84273;
     Object term84274;

    public ObjectReader_init_2073957032311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term83767 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term83877 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term83767, term83767.getClass(), "_config", term83877);
        setField(term83767, term83767.getClass(), "_context", null);
        setField(term83767, term83767.getClass(), "_rootDeserializers", null);
        setField(term83767, term83767.getClass(), "_parserFactory", null);
        setField(term83767, term83767.getClass(), "_valueType", null);
        setField(term83767, term83767.getClass(), "_valueToUpdate", null);
        setField(term83767, term83767.getClass(), "_schema", null);
        setField(term83767, term83767.getClass(), "_injectableValues", null);
        term83969 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term84117 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term83969, term83969.getClass(), "_deserializationContext", term84117);
        setField(term83969, term83969.getClass(), "_rootDeserializers", null);
        setField(term83969, term83969.getClass(), "_jsonFactory", null);
        term84227 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term84227, term84227.getClass(), "_rootName", null);
        setIntField(term84227, term84227.getClass(), "_deserFeatures", -1);
        term84270 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term84271 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term84272 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term84271, term84271.getClass(), "_problemHandlers", null);
        setField(term84271, term84271.getClass(), "_nodeFactory", null);
        setIntField(term84271, term84271.getClass(), "_deserFeatures", -1);
        setIntField(term84271, term84271.getClass(), "_parserFeatures", 0);
        setIntField(term84271, term84271.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term84271, term84271.getClass(), "_formatReadFeatures", 0);
        setIntField(term84271, term84271.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term84271, term84271.getClass(), "_mixIns", null);
        setField(term84271, term84271.getClass(), "_subtypeResolver", null);
        setField(term84271, term84271.getClass(), "_rootName", null);
        setField(term84271, term84271.getClass(), "_view", null);
        setField(term84271, term84271.getClass(), "_attributes", null);
        setField(term84271, term84271.getClass(), "_rootNames", null);
        setIntField(term84271, term84271.getClass(), "_mapperFeatures", 0);
        setField(term84271, term84271.getClass(), "_base", null);
        setField(term84270, term84270.getClass(), "_config", term84271);
        setField(term84272, term84272.getClass(), "_objectIds", null);
        setField(term84272, term84272.getClass(), "_objectIdResolvers", null);
        setField(term84272, term84272.getClass(), "_cache", null);
        setField(term84272, term84272.getClass(), "_factory", null);
        setField(term84272, term84272.getClass(), "_config", null);
        setIntField(term84272, term84272.getClass(), "_featureFlags", 0);
        setField(term84272, term84272.getClass(), "_view", null);
        setField(term84272, term84272.getClass(), "_parser", null);
        setField(term84272, term84272.getClass(), "_injectableValues", null);
        setField(term84272, term84272.getClass(), "_arrayBuilders", null);
        setField(term84272, term84272.getClass(), "_objectBuffer", null);
        setField(term84272, term84272.getClass(), "_dateFormat", null);
        setField(term84272, term84272.getClass(), "_attributes", null);
        setField(term84272, term84272.getClass(), "_currentType", null);
        setField(term84270, term84270.getClass(), "_context", term84272);
        setField(term84270, term84270.getClass(), "_parserFactory", null);
        setBooleanField(term84270, term84270.getClass(), "_unwrapRoot", true);
        setField(term84270, term84270.getClass(), "_filter", null);
        setField(term84270, term84270.getClass(), "_valueType", null);
        setField(term84270, term84270.getClass(), "_rootDeserializer", null);
        setField(term84270, term84270.getClass(), "_valueToUpdate", null);
        setField(term84270, term84270.getClass(), "_schema", null);
        setField(term84270, term84270.getClass(), "_injectableValues", null);
        setField(term84270, term84270.getClass(), "_dataFormatReaders", null);
        setField(term84270, term84270.getClass(), "_rootDeserializers", null);
        term84273 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term84273, term84273.getClass(), "_problemHandlers", null);
        setField(term84273, term84273.getClass(), "_nodeFactory", null);
        setIntField(term84273, term84273.getClass(), "_deserFeatures", -1);
        setIntField(term84273, term84273.getClass(), "_parserFeatures", 0);
        setIntField(term84273, term84273.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term84273, term84273.getClass(), "_formatReadFeatures", 0);
        setIntField(term84273, term84273.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term84273, term84273.getClass(), "_mixIns", null);
        setField(term84273, term84273.getClass(), "_subtypeResolver", null);
        setField(term84273, term84273.getClass(), "_rootName", null);
        setField(term84273, term84273.getClass(), "_view", null);
        setField(term84273, term84273.getClass(), "_attributes", null);
        setField(term84273, term84273.getClass(), "_rootNames", null);
        setIntField(term84273, term84273.getClass(), "_mapperFeatures", 0);
        setField(term84273, term84273.getClass(), "_base", null);
        term84274 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term84275 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term84274, term84274.getClass(), "_jsonFactory", null);
        setField(term84274, term84274.getClass(), "_typeFactory", null);
        setField(term84274, term84274.getClass(), "_injectableValues", null);
        setField(term84274, term84274.getClass(), "_subtypeResolver", null);
        setField(term84274, term84274.getClass(), "_mixIns", null);
        setField(term84274, term84274.getClass(), "_serializationConfig", null);
        setField(term84274, term84274.getClass(), "_serializerProvider", null);
        setField(term84274, term84274.getClass(), "_serializerFactory", null);
        setField(term84274, term84274.getClass(), "_deserializationConfig", null);
        setField(term84275, term84275.getClass(), "_objectIds", null);
        setField(term84275, term84275.getClass(), "_objectIdResolvers", null);
        setField(term84275, term84275.getClass(), "_cache", null);
        setField(term84275, term84275.getClass(), "_factory", null);
        setField(term84275, term84275.getClass(), "_config", null);
        setIntField(term84275, term84275.getClass(), "_featureFlags", 0);
        setField(term84275, term84275.getClass(), "_view", null);
        setField(term84275, term84275.getClass(), "_parser", null);
        setField(term84275, term84275.getClass(), "_injectableValues", null);
        setField(term84275, term84275.getClass(), "_arrayBuilders", null);
        setField(term84275, term84275.getClass(), "_objectBuffer", null);
        setField(term84275, term84275.getClass(), "_dateFormat", null);
        setField(term84275, term84275.getClass(), "_attributes", null);
        setField(term84275, term84275.getClass(), "_currentType", null);
        setField(term84274, term84274.getClass(), "_deserializationContext", term84275);
        setField(term84274, term84274.getClass(), "_registeredModuleTypes", null);
        setField(term84274, term84274.getClass(), "_rootDeserializers", null);
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
        args[0] = term83969;
        args[1] = term84227;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term84270));
        assertTrue(recursiveEquals(term83969, term84273));
        assertTrue(recursiveEquals(term84227, null));
    }

};


