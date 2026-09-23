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

public class ObjectReader_init_1613963825311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78245;
     Object term78355;
     Object term80045;
     Object term80050;
     Object term80054;

    public ObjectReader_init_1613963825311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term78071 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term78153 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term78071, term78071.getClass(), "_config", null);
        setField(term78071, term78071.getClass(), "_context", null);
        setField(term78071, term78071.getClass(), "_rootDeserializers", term78153);
        setField(term78071, term78071.getClass(), "_parserFactory", null);
        setField(term78071, term78071.getClass(), "_valueType", null);
        setField(term78071, term78071.getClass(), "_valueToUpdate", null);
        setField(term78071, term78071.getClass(), "_schema", null);
        setField(term78071, term78071.getClass(), "_injectableValues", null);
        term78245 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        setField(term78245, term78245.getClass(), "_deserializationContext", null);
        setField(term78245, term78245.getClass(), "_rootDeserializers", null);
        setField(term78245, term78245.getClass(), "_jsonFactory", null);
        term78355 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term78447 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term78447, term78447.getClass(), "_namespace", null);
        setField(term78447, term78447.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setField(term78355, term78355.getClass(), "_rootName", term78447);
        term80045 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term80046 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term80047 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term80046, term80046.getClass(), "_problemHandlers", null);
        setField(term80046, term80046.getClass(), "_nodeFactory", null);
        setIntField(term80046, term80046.getClass(), "_deserFeatures", 0);
        setIntField(term80046, term80046.getClass(), "_parserFeatures", 0);
        setIntField(term80046, term80046.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term80046, term80046.getClass(), "_formatReadFeatures", 0);
        setIntField(term80046, term80046.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term80046, term80046.getClass(), "_mixIns", null);
        setField(term80046, term80046.getClass(), "_subtypeResolver", null);
        setField(term80047, term80047.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setField(term80047, term80047.getClass(), "_namespace", null);
        setField(term80047, term80047.getClass(), "_encodedSimple", null);
        setField(term80046, term80046.getClass(), "_rootName", term80047);
        setField(term80046, term80046.getClass(), "_view", null);
        setField(term80046, term80046.getClass(), "_attributes", null);
        setField(term80046, term80046.getClass(), "_rootNames", null);
        setField(term80046, term80046.getClass(), "_configOverrides", null);
        setIntField(term80046, term80046.getClass(), "_mapperFeatures", 0);
        setField(term80046, term80046.getClass(), "_base", null);
        setField(term80045, term80045.getClass(), "_config", term80046);
        setField(term80045, term80045.getClass(), "_context", null);
        setField(term80045, term80045.getClass(), "_parserFactory", null);
        setBooleanField(term80045, term80045.getClass(), "_unwrapRoot", true);
        setField(term80045, term80045.getClass(), "_filter", null);
        setField(term80045, term80045.getClass(), "_valueType", null);
        setField(term80045, term80045.getClass(), "_rootDeserializer", null);
        setField(term80045, term80045.getClass(), "_valueToUpdate", null);
        setField(term80045, term80045.getClass(), "_schema", null);
        setField(term80045, term80045.getClass(), "_injectableValues", null);
        setField(term80045, term80045.getClass(), "_dataFormatReaders", null);
        setField(term80045, term80045.getClass(), "_rootDeserializers", null);
        term80050 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term80051 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term80050, term80050.getClass(), "_problemHandlers", null);
        setField(term80050, term80050.getClass(), "_nodeFactory", null);
        setIntField(term80050, term80050.getClass(), "_deserFeatures", 0);
        setIntField(term80050, term80050.getClass(), "_parserFeatures", 0);
        setIntField(term80050, term80050.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term80050, term80050.getClass(), "_formatReadFeatures", 0);
        setIntField(term80050, term80050.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term80050, term80050.getClass(), "_mixIns", null);
        setField(term80050, term80050.getClass(), "_subtypeResolver", null);
        setField(term80051, term80051.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setField(term80051, term80051.getClass(), "_namespace", null);
        setField(term80051, term80051.getClass(), "_encodedSimple", null);
        setField(term80050, term80050.getClass(), "_rootName", term80051);
        setField(term80050, term80050.getClass(), "_view", null);
        setField(term80050, term80050.getClass(), "_attributes", null);
        setField(term80050, term80050.getClass(), "_rootNames", null);
        setField(term80050, term80050.getClass(), "_configOverrides", null);
        setIntField(term80050, term80050.getClass(), "_mapperFeatures", 0);
        setField(term80050, term80050.getClass(), "_base", null);
        term80054 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        setField(term80054, term80054.getClass(), "_jsonFactory", null);
        setField(term80054, term80054.getClass(), "_typeFactory", null);
        setField(term80054, term80054.getClass(), "_injectableValues", null);
        setField(term80054, term80054.getClass(), "_subtypeResolver", null);
        setField(term80054, term80054.getClass(), "_configOverrides", null);
        setField(term80054, term80054.getClass(), "_mixIns", null);
        setField(term80054, term80054.getClass(), "_serializationConfig", null);
        setField(term80054, term80054.getClass(), "_serializerProvider", null);
        setField(term80054, term80054.getClass(), "_serializerFactory", null);
        setField(term80054, term80054.getClass(), "_deserializationConfig", null);
        setField(term80054, term80054.getClass(), "_deserializationContext", null);
        setField(term80054, term80054.getClass(), "_registeredModuleTypes", null);
        setField(term80054, term80054.getClass(), "_rootDeserializers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        Object[] args = new Object[2];
        args[0] = term78245;
        args[1] = term78355;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term80045));
        assertTrue(recursiveEquals(term78245, term80050));
        assertTrue(recursiveEquals(term78355, term80054));
    }

};


