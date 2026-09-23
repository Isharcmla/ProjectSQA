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

public class ObjectReader_init_1619648465283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58816;
     Object term58926;
     Object term58966;
     Object term58968;
     Object term58969;

    public ObjectReader_init_1619648465283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term58614 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term58724 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term58614, term58614.getClass(), "_config", term58724);
        setField(term58614, term58614.getClass(), "_context", null);
        setField(term58614, term58614.getClass(), "_rootDeserializers", null);
        setField(term58614, term58614.getClass(), "_parserFactory", null);
        setField(term58614, term58614.getClass(), "_valueType", null);
        setField(term58614, term58614.getClass(), "_rootDeserializer", null);
        setField(term58614, term58614.getClass(), "_valueToUpdate", null);
        setField(term58614, term58614.getClass(), "_schema", null);
        setField(term58614, term58614.getClass(), "_injectableValues", null);
        term58816 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        setField(term58816, term58816.getClass(), "_context", null);
        setField(term58816, term58816.getClass(), "_rootDeserializers", null);
        setField(term58816, term58816.getClass(), "_parserFactory", null);
        setField(term58816, term58816.getClass(), "_valueType", null);
        setField(term58816, term58816.getClass(), "_rootDeserializer", null);
        setField(term58816, term58816.getClass(), "_valueToUpdate", null);
        setField(term58816, term58816.getClass(), "_schema", null);
        setField(term58816, term58816.getClass(), "_injectableValues", null);
        term58926 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term58926, term58926.getClass(), "_rootName", null);
        setIntField(term58926, term58926.getClass(), "_deserFeatures", -1);
        term58966 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term58967 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term58967, term58967.getClass(), "_problemHandlers", null);
        setField(term58967, term58967.getClass(), "_nodeFactory", null);
        setIntField(term58967, term58967.getClass(), "_deserFeatures", -1);
        setIntField(term58967, term58967.getClass(), "_parserFeatures", 0);
        setIntField(term58967, term58967.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term58967, term58967.getClass(), "_formatReadFeatures", 0);
        setIntField(term58967, term58967.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term58967, term58967.getClass(), "_mixIns", null);
        setField(term58967, term58967.getClass(), "_subtypeResolver", null);
        setField(term58967, term58967.getClass(), "_rootName", null);
        setField(term58967, term58967.getClass(), "_view", null);
        setField(term58967, term58967.getClass(), "_attributes", null);
        setField(term58967, term58967.getClass(), "_rootNames", null);
        setIntField(term58967, term58967.getClass(), "_mapperFeatures", 0);
        setField(term58967, term58967.getClass(), "_base", null);
        setField(term58966, term58966.getClass(), "_config", term58967);
        setField(term58966, term58966.getClass(), "_context", null);
        setField(term58966, term58966.getClass(), "_parserFactory", null);
        setBooleanField(term58966, term58966.getClass(), "_unwrapRoot", true);
        setField(term58966, term58966.getClass(), "_filter", null);
        setField(term58966, term58966.getClass(), "_valueType", null);
        setField(term58966, term58966.getClass(), "_rootDeserializer", null);
        setField(term58966, term58966.getClass(), "_valueToUpdate", null);
        setField(term58966, term58966.getClass(), "_schema", null);
        setField(term58966, term58966.getClass(), "_injectableValues", null);
        setField(term58966, term58966.getClass(), "_dataFormatReaders", null);
        setField(term58966, term58966.getClass(), "_rootDeserializers", null);
        term58968 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term58968, term58968.getClass(), "_problemHandlers", null);
        setField(term58968, term58968.getClass(), "_nodeFactory", null);
        setIntField(term58968, term58968.getClass(), "_deserFeatures", -1);
        setIntField(term58968, term58968.getClass(), "_parserFeatures", 0);
        setIntField(term58968, term58968.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term58968, term58968.getClass(), "_formatReadFeatures", 0);
        setIntField(term58968, term58968.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term58968, term58968.getClass(), "_mixIns", null);
        setField(term58968, term58968.getClass(), "_subtypeResolver", null);
        setField(term58968, term58968.getClass(), "_rootName", null);
        setField(term58968, term58968.getClass(), "_view", null);
        setField(term58968, term58968.getClass(), "_attributes", null);
        setField(term58968, term58968.getClass(), "_rootNames", null);
        setIntField(term58968, term58968.getClass(), "_mapperFeatures", 0);
        setField(term58968, term58968.getClass(), "_base", null);
        term58969 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        setField(term58969, term58969.getClass(), "_config", null);
        setField(term58969, term58969.getClass(), "_context", null);
        setField(term58969, term58969.getClass(), "_parserFactory", null);
        setBooleanField(term58969, term58969.getClass(), "_unwrapRoot", false);
        setField(term58969, term58969.getClass(), "_filter", null);
        setField(term58969, term58969.getClass(), "_valueType", null);
        setField(term58969, term58969.getClass(), "_rootDeserializer", null);
        setField(term58969, term58969.getClass(), "_valueToUpdate", null);
        setField(term58969, term58969.getClass(), "_schema", null);
        setField(term58969, term58969.getClass(), "_injectableValues", null);
        setField(term58969, term58969.getClass(), "_dataFormatReaders", null);
        setField(term58969, term58969.getClass(), "_rootDeserializers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        Object[] args = new Object[2];
        args[0] = term58816;
        args[1] = term58926;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term58966));
        assertTrue(recursiveEquals(term58816, term58968));
        assertTrue(recursiveEquals(term58926, term58969));
    }

};


