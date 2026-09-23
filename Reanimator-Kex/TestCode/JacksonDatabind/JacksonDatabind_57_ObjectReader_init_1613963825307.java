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

public class ObjectReader_init_1613963825307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78426;
     Object term78684;
     Object term78727;
     Object term78730;
     Object term78731;

    public ObjectReader_init_1613963825307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term78224 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term78334 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term78224, term78224.getClass(), "_config", term78334);
        setField(term78224, term78224.getClass(), "_context", null);
        setField(term78224, term78224.getClass(), "_rootDeserializers", null);
        setField(term78224, term78224.getClass(), "_parserFactory", null);
        setField(term78224, term78224.getClass(), "_valueType", null);
        setField(term78224, term78224.getClass(), "_valueToUpdate", null);
        setField(term78224, term78224.getClass(), "_schema", null);
        setField(term78224, term78224.getClass(), "_injectableValues", null);
        term78426 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term78574 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term78426, term78426.getClass(), "_deserializationContext", term78574);
        setField(term78426, term78426.getClass(), "_rootDeserializers", null);
        setField(term78426, term78426.getClass(), "_jsonFactory", null);
        term78684 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term78684, term78684.getClass(), "_rootName", null);
        setIntField(term78684, term78684.getClass(), "_deserFeatures", -1);
        term78727 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term78728 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term78729 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term78728, term78728.getClass(), "_problemHandlers", null);
        setField(term78728, term78728.getClass(), "_nodeFactory", null);
        setIntField(term78728, term78728.getClass(), "_deserFeatures", -1);
        setIntField(term78728, term78728.getClass(), "_parserFeatures", 0);
        setIntField(term78728, term78728.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term78728, term78728.getClass(), "_formatReadFeatures", 0);
        setIntField(term78728, term78728.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term78728, term78728.getClass(), "_mixIns", null);
        setField(term78728, term78728.getClass(), "_subtypeResolver", null);
        setField(term78728, term78728.getClass(), "_rootName", null);
        setField(term78728, term78728.getClass(), "_view", null);
        setField(term78728, term78728.getClass(), "_attributes", null);
        setField(term78728, term78728.getClass(), "_rootNames", null);
        setIntField(term78728, term78728.getClass(), "_mapperFeatures", 0);
        setField(term78728, term78728.getClass(), "_base", null);
        setField(term78727, term78727.getClass(), "_config", term78728);
        setField(term78729, term78729.getClass(), "_objectIds", null);
        setField(term78729, term78729.getClass(), "_objectIdResolvers", null);
        setField(term78729, term78729.getClass(), "_cache", null);
        setField(term78729, term78729.getClass(), "_factory", null);
        setField(term78729, term78729.getClass(), "_config", null);
        setIntField(term78729, term78729.getClass(), "_featureFlags", 0);
        setField(term78729, term78729.getClass(), "_view", null);
        setField(term78729, term78729.getClass(), "_parser", null);
        setField(term78729, term78729.getClass(), "_injectableValues", null);
        setField(term78729, term78729.getClass(), "_arrayBuilders", null);
        setField(term78729, term78729.getClass(), "_objectBuffer", null);
        setField(term78729, term78729.getClass(), "_dateFormat", null);
        setField(term78729, term78729.getClass(), "_attributes", null);
        setField(term78729, term78729.getClass(), "_currentType", null);
        setField(term78727, term78727.getClass(), "_context", term78729);
        setField(term78727, term78727.getClass(), "_parserFactory", null);
        setBooleanField(term78727, term78727.getClass(), "_unwrapRoot", true);
        setField(term78727, term78727.getClass(), "_filter", null);
        setField(term78727, term78727.getClass(), "_valueType", null);
        setField(term78727, term78727.getClass(), "_rootDeserializer", null);
        setField(term78727, term78727.getClass(), "_valueToUpdate", null);
        setField(term78727, term78727.getClass(), "_schema", null);
        setField(term78727, term78727.getClass(), "_injectableValues", null);
        setField(term78727, term78727.getClass(), "_dataFormatReaders", null);
        setField(term78727, term78727.getClass(), "_rootDeserializers", null);
        term78730 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term78730, term78730.getClass(), "_problemHandlers", null);
        setField(term78730, term78730.getClass(), "_nodeFactory", null);
        setIntField(term78730, term78730.getClass(), "_deserFeatures", -1);
        setIntField(term78730, term78730.getClass(), "_parserFeatures", 0);
        setIntField(term78730, term78730.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term78730, term78730.getClass(), "_formatReadFeatures", 0);
        setIntField(term78730, term78730.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term78730, term78730.getClass(), "_mixIns", null);
        setField(term78730, term78730.getClass(), "_subtypeResolver", null);
        setField(term78730, term78730.getClass(), "_rootName", null);
        setField(term78730, term78730.getClass(), "_view", null);
        setField(term78730, term78730.getClass(), "_attributes", null);
        setField(term78730, term78730.getClass(), "_rootNames", null);
        setIntField(term78730, term78730.getClass(), "_mapperFeatures", 0);
        setField(term78730, term78730.getClass(), "_base", null);
        term78731 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term78732 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term78731, term78731.getClass(), "_jsonFactory", null);
        setField(term78731, term78731.getClass(), "_typeFactory", null);
        setField(term78731, term78731.getClass(), "_injectableValues", null);
        setField(term78731, term78731.getClass(), "_subtypeResolver", null);
        setField(term78731, term78731.getClass(), "_mixIns", null);
        setField(term78731, term78731.getClass(), "_serializationConfig", null);
        setField(term78731, term78731.getClass(), "_serializerProvider", null);
        setField(term78731, term78731.getClass(), "_serializerFactory", null);
        setField(term78731, term78731.getClass(), "_deserializationConfig", null);
        setField(term78732, term78732.getClass(), "_objectIds", null);
        setField(term78732, term78732.getClass(), "_objectIdResolvers", null);
        setField(term78732, term78732.getClass(), "_cache", null);
        setField(term78732, term78732.getClass(), "_factory", null);
        setField(term78732, term78732.getClass(), "_config", null);
        setIntField(term78732, term78732.getClass(), "_featureFlags", 0);
        setField(term78732, term78732.getClass(), "_view", null);
        setField(term78732, term78732.getClass(), "_parser", null);
        setField(term78732, term78732.getClass(), "_injectableValues", null);
        setField(term78732, term78732.getClass(), "_arrayBuilders", null);
        setField(term78732, term78732.getClass(), "_objectBuffer", null);
        setField(term78732, term78732.getClass(), "_dateFormat", null);
        setField(term78732, term78732.getClass(), "_attributes", null);
        setField(term78732, term78732.getClass(), "_currentType", null);
        setField(term78731, term78731.getClass(), "_deserializationContext", term78732);
        setField(term78731, term78731.getClass(), "_registeredModuleTypes", null);
        setField(term78731, term78731.getClass(), "_rootDeserializers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        Object[] args = new Object[2];
        args[0] = term78426;
        args[1] = term78684;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term78727));
        assertTrue(recursiveEquals(term78426, term78730));
        assertTrue(recursiveEquals(term78684, term78731));
    }

};


