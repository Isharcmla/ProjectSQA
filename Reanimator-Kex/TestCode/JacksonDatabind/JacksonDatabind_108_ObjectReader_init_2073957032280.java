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

public class ObjectReader_init_2073957032280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50347;
     Object term50605;
     Object term52350;
     Object term52353;
     Object term52354;

    public ObjectReader_init_2073957032280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term50145 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term50255 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term50145, term50145.getClass(), "_config", term50255);
        setField(term50145, term50145.getClass(), "_context", null);
        setField(term50145, term50145.getClass(), "_rootDeserializers", null);
        setField(term50145, term50145.getClass(), "_parserFactory", null);
        setField(term50145, term50145.getClass(), "_valueType", null);
        setField(term50145, term50145.getClass(), "_valueToUpdate", null);
        setField(term50145, term50145.getClass(), "_schema", null);
        setField(term50145, term50145.getClass(), "_injectableValues", null);
        term50347 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term50495 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term50347, term50347.getClass(), "_deserializationContext", term50495);
        setField(term50347, term50347.getClass(), "_rootDeserializers", null);
        setField(term50347, term50347.getClass(), "_jsonFactory", null);
        term50605 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term50605, term50605.getClass(), "_rootName", null);
        setIntField(term50605, term50605.getClass(), "_deserFeatures", -1);
        term52350 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term52351 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term52352 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term52351, term52351.getClass(), "_problemHandlers", null);
        setField(term52351, term52351.getClass(), "_nodeFactory", null);
        setIntField(term52351, term52351.getClass(), "_deserFeatures", -1);
        setIntField(term52351, term52351.getClass(), "_parserFeatures", 0);
        setIntField(term52351, term52351.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term52351, term52351.getClass(), "_formatReadFeatures", 0);
        setIntField(term52351, term52351.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term52351, term52351.getClass(), "_mixIns", null);
        setField(term52351, term52351.getClass(), "_subtypeResolver", null);
        setField(term52351, term52351.getClass(), "_rootName", null);
        setField(term52351, term52351.getClass(), "_view", null);
        setField(term52351, term52351.getClass(), "_attributes", null);
        setField(term52351, term52351.getClass(), "_rootNames", null);
        setField(term52351, term52351.getClass(), "_configOverrides", null);
        setIntField(term52351, term52351.getClass(), "_mapperFeatures", 0);
        setField(term52351, term52351.getClass(), "_base", null);
        setField(term52350, term52350.getClass(), "_config", term52351);
        setField(term52352, term52352.getClass(), "_objectIds", null);
        setField(term52352, term52352.getClass(), "_objectIdResolvers", null);
        setField(term52352, term52352.getClass(), "_cache", null);
        setField(term52352, term52352.getClass(), "_factory", null);
        setField(term52352, term52352.getClass(), "_config", null);
        setIntField(term52352, term52352.getClass(), "_featureFlags", 0);
        setField(term52352, term52352.getClass(), "_view", null);
        setField(term52352, term52352.getClass(), "_parser", null);
        setField(term52352, term52352.getClass(), "_injectableValues", null);
        setField(term52352, term52352.getClass(), "_arrayBuilders", null);
        setField(term52352, term52352.getClass(), "_objectBuffer", null);
        setField(term52352, term52352.getClass(), "_dateFormat", null);
        setField(term52352, term52352.getClass(), "_attributes", null);
        setField(term52352, term52352.getClass(), "_currentType", null);
        setField(term52350, term52350.getClass(), "_context", term52352);
        setField(term52350, term52350.getClass(), "_parserFactory", null);
        setBooleanField(term52350, term52350.getClass(), "_unwrapRoot", true);
        setField(term52350, term52350.getClass(), "_filter", null);
        setField(term52350, term52350.getClass(), "_valueType", null);
        setField(term52350, term52350.getClass(), "_rootDeserializer", null);
        setField(term52350, term52350.getClass(), "_valueToUpdate", null);
        setField(term52350, term52350.getClass(), "_schema", null);
        setField(term52350, term52350.getClass(), "_injectableValues", null);
        setField(term52350, term52350.getClass(), "_dataFormatReaders", null);
        setField(term52350, term52350.getClass(), "_rootDeserializers", null);
        term52353 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term52353, term52353.getClass(), "_problemHandlers", null);
        setField(term52353, term52353.getClass(), "_nodeFactory", null);
        setIntField(term52353, term52353.getClass(), "_deserFeatures", -1);
        setIntField(term52353, term52353.getClass(), "_parserFeatures", 0);
        setIntField(term52353, term52353.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term52353, term52353.getClass(), "_formatReadFeatures", 0);
        setIntField(term52353, term52353.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term52353, term52353.getClass(), "_mixIns", null);
        setField(term52353, term52353.getClass(), "_subtypeResolver", null);
        setField(term52353, term52353.getClass(), "_rootName", null);
        setField(term52353, term52353.getClass(), "_view", null);
        setField(term52353, term52353.getClass(), "_attributes", null);
        setField(term52353, term52353.getClass(), "_rootNames", null);
        setField(term52353, term52353.getClass(), "_configOverrides", null);
        setIntField(term52353, term52353.getClass(), "_mapperFeatures", 0);
        setField(term52353, term52353.getClass(), "_base", null);
        term52354 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term52355 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term52354, term52354.getClass(), "_jsonFactory", null);
        setField(term52354, term52354.getClass(), "_typeFactory", null);
        setField(term52354, term52354.getClass(), "_injectableValues", null);
        setField(term52354, term52354.getClass(), "_subtypeResolver", null);
        setField(term52354, term52354.getClass(), "_configOverrides", null);
        setField(term52354, term52354.getClass(), "_mixIns", null);
        setField(term52354, term52354.getClass(), "_serializationConfig", null);
        setField(term52354, term52354.getClass(), "_serializerProvider", null);
        setField(term52354, term52354.getClass(), "_serializerFactory", null);
        setField(term52354, term52354.getClass(), "_deserializationConfig", null);
        setField(term52355, term52355.getClass(), "_objectIds", null);
        setField(term52355, term52355.getClass(), "_objectIdResolvers", null);
        setField(term52355, term52355.getClass(), "_cache", null);
        setField(term52355, term52355.getClass(), "_factory", null);
        setField(term52355, term52355.getClass(), "_config", null);
        setIntField(term52355, term52355.getClass(), "_featureFlags", 0);
        setField(term52355, term52355.getClass(), "_view", null);
        setField(term52355, term52355.getClass(), "_parser", null);
        setField(term52355, term52355.getClass(), "_injectableValues", null);
        setField(term52355, term52355.getClass(), "_arrayBuilders", null);
        setField(term52355, term52355.getClass(), "_objectBuffer", null);
        setField(term52355, term52355.getClass(), "_dateFormat", null);
        setField(term52355, term52355.getClass(), "_attributes", null);
        setField(term52355, term52355.getClass(), "_currentType", null);
        setField(term52354, term52354.getClass(), "_deserializationContext", term52355);
        setField(term52354, term52354.getClass(), "_registeredModuleTypes", null);
        setField(term52354, term52354.getClass(), "_rootDeserializers", null);
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
        args[0] = term50347;
        args[1] = term50605;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term52350));
        assertTrue(recursiveEquals(term50347, term52353));
        assertTrue(recursiveEquals(term50605, null));
    }

};


