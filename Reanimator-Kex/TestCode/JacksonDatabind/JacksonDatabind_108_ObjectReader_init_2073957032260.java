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

public class ObjectReader_init_2073957032260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35205;
     Object term35315;
     Object term35500;
     Object term35502;
     Object term35503;

    public ObjectReader_init_2073957032260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term35003 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term35113 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term35003, term35003.getClass(), "_config", term35113);
        term35205 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        term35315 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        term35500 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term35501 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term35501, term35501.getClass(), "_problemHandlers", null);
        setField(term35501, term35501.getClass(), "_nodeFactory", null);
        setIntField(term35501, term35501.getClass(), "_deserFeatures", 0);
        setIntField(term35501, term35501.getClass(), "_parserFeatures", 0);
        setIntField(term35501, term35501.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term35501, term35501.getClass(), "_formatReadFeatures", 0);
        setIntField(term35501, term35501.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term35501, term35501.getClass(), "_mixIns", null);
        setField(term35501, term35501.getClass(), "_subtypeResolver", null);
        setField(term35501, term35501.getClass(), "_rootName", null);
        setField(term35501, term35501.getClass(), "_view", null);
        setField(term35501, term35501.getClass(), "_attributes", null);
        setField(term35501, term35501.getClass(), "_rootNames", null);
        setField(term35501, term35501.getClass(), "_configOverrides", null);
        setIntField(term35501, term35501.getClass(), "_mapperFeatures", 0);
        setField(term35501, term35501.getClass(), "_base", null);
        setField(term35500, term35500.getClass(), "_config", term35501);
        setField(term35500, term35500.getClass(), "_context", null);
        setField(term35500, term35500.getClass(), "_parserFactory", null);
        setBooleanField(term35500, term35500.getClass(), "_unwrapRoot", false);
        setField(term35500, term35500.getClass(), "_filter", null);
        setField(term35500, term35500.getClass(), "_valueType", null);
        setField(term35500, term35500.getClass(), "_rootDeserializer", null);
        setField(term35500, term35500.getClass(), "_valueToUpdate", null);
        setField(term35500, term35500.getClass(), "_schema", null);
        setField(term35500, term35500.getClass(), "_injectableValues", null);
        setField(term35500, term35500.getClass(), "_dataFormatReaders", null);
        setField(term35500, term35500.getClass(), "_rootDeserializers", null);
        term35502 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term35502, term35502.getClass(), "_problemHandlers", null);
        setField(term35502, term35502.getClass(), "_nodeFactory", null);
        setIntField(term35502, term35502.getClass(), "_deserFeatures", 0);
        setIntField(term35502, term35502.getClass(), "_parserFeatures", 0);
        setIntField(term35502, term35502.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term35502, term35502.getClass(), "_formatReadFeatures", 0);
        setIntField(term35502, term35502.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term35502, term35502.getClass(), "_mixIns", null);
        setField(term35502, term35502.getClass(), "_subtypeResolver", null);
        setField(term35502, term35502.getClass(), "_rootName", null);
        setField(term35502, term35502.getClass(), "_view", null);
        setField(term35502, term35502.getClass(), "_attributes", null);
        setField(term35502, term35502.getClass(), "_rootNames", null);
        setField(term35502, term35502.getClass(), "_configOverrides", null);
        setIntField(term35502, term35502.getClass(), "_mapperFeatures", 0);
        setField(term35502, term35502.getClass(), "_base", null);
        term35503 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        setField(term35503, term35503.getClass(), "_jsonFactory", null);
        setField(term35503, term35503.getClass(), "_typeFactory", null);
        setField(term35503, term35503.getClass(), "_injectableValues", null);
        setField(term35503, term35503.getClass(), "_subtypeResolver", null);
        setField(term35503, term35503.getClass(), "_configOverrides", null);
        setField(term35503, term35503.getClass(), "_mixIns", null);
        setField(term35503, term35503.getClass(), "_serializationConfig", null);
        setField(term35503, term35503.getClass(), "_serializerProvider", null);
        setField(term35503, term35503.getClass(), "_serializerFactory", null);
        setField(term35503, term35503.getClass(), "_deserializationConfig", null);
        setField(term35503, term35503.getClass(), "_deserializationContext", null);
        setField(term35503, term35503.getClass(), "_registeredModuleTypes", null);
        setField(term35503, term35503.getClass(), "_rootDeserializers", null);
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
        args[0] = term35205;
        args[1] = term35315;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term35500));
        assertTrue(recursiveEquals(term35205, term35502));
        assertTrue(recursiveEquals(term35315, null));
    }

};


