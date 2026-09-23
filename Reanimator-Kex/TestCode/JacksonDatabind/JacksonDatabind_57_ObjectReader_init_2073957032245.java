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

public class ObjectReader_init_2073957032245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33010;
     Object term33120;
     Object term33249;
     Object term33251;
     Object term33252;

    public ObjectReader_init_2073957032245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term32808 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term32918 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term32808, term32808.getClass(), "_config", term32918);
        term33010 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        term33120 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        term33249 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term33250 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term33250, term33250.getClass(), "_problemHandlers", null);
        setField(term33250, term33250.getClass(), "_nodeFactory", null);
        setIntField(term33250, term33250.getClass(), "_deserFeatures", 0);
        setIntField(term33250, term33250.getClass(), "_parserFeatures", 0);
        setIntField(term33250, term33250.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term33250, term33250.getClass(), "_formatReadFeatures", 0);
        setIntField(term33250, term33250.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term33250, term33250.getClass(), "_mixIns", null);
        setField(term33250, term33250.getClass(), "_subtypeResolver", null);
        setField(term33250, term33250.getClass(), "_rootName", null);
        setField(term33250, term33250.getClass(), "_view", null);
        setField(term33250, term33250.getClass(), "_attributes", null);
        setField(term33250, term33250.getClass(), "_rootNames", null);
        setIntField(term33250, term33250.getClass(), "_mapperFeatures", 0);
        setField(term33250, term33250.getClass(), "_base", null);
        setField(term33249, term33249.getClass(), "_config", term33250);
        setField(term33249, term33249.getClass(), "_context", null);
        setField(term33249, term33249.getClass(), "_parserFactory", null);
        setBooleanField(term33249, term33249.getClass(), "_unwrapRoot", false);
        setField(term33249, term33249.getClass(), "_filter", null);
        setField(term33249, term33249.getClass(), "_valueType", null);
        setField(term33249, term33249.getClass(), "_rootDeserializer", null);
        setField(term33249, term33249.getClass(), "_valueToUpdate", null);
        setField(term33249, term33249.getClass(), "_schema", null);
        setField(term33249, term33249.getClass(), "_injectableValues", null);
        setField(term33249, term33249.getClass(), "_dataFormatReaders", null);
        setField(term33249, term33249.getClass(), "_rootDeserializers", null);
        term33251 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term33251, term33251.getClass(), "_problemHandlers", null);
        setField(term33251, term33251.getClass(), "_nodeFactory", null);
        setIntField(term33251, term33251.getClass(), "_deserFeatures", 0);
        setIntField(term33251, term33251.getClass(), "_parserFeatures", 0);
        setIntField(term33251, term33251.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term33251, term33251.getClass(), "_formatReadFeatures", 0);
        setIntField(term33251, term33251.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term33251, term33251.getClass(), "_mixIns", null);
        setField(term33251, term33251.getClass(), "_subtypeResolver", null);
        setField(term33251, term33251.getClass(), "_rootName", null);
        setField(term33251, term33251.getClass(), "_view", null);
        setField(term33251, term33251.getClass(), "_attributes", null);
        setField(term33251, term33251.getClass(), "_rootNames", null);
        setIntField(term33251, term33251.getClass(), "_mapperFeatures", 0);
        setField(term33251, term33251.getClass(), "_base", null);
        term33252 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        setField(term33252, term33252.getClass(), "_jsonFactory", null);
        setField(term33252, term33252.getClass(), "_typeFactory", null);
        setField(term33252, term33252.getClass(), "_injectableValues", null);
        setField(term33252, term33252.getClass(), "_subtypeResolver", null);
        setField(term33252, term33252.getClass(), "_mixIns", null);
        setField(term33252, term33252.getClass(), "_serializationConfig", null);
        setField(term33252, term33252.getClass(), "_serializerProvider", null);
        setField(term33252, term33252.getClass(), "_serializerFactory", null);
        setField(term33252, term33252.getClass(), "_deserializationConfig", null);
        setField(term33252, term33252.getClass(), "_deserializationContext", null);
        setField(term33252, term33252.getClass(), "_registeredModuleTypes", null);
        setField(term33252, term33252.getClass(), "_rootDeserializers", null);
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
        args[0] = term33010;
        args[1] = term33120;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term33249));
        assertTrue(recursiveEquals(term33010, term33251));
        assertTrue(recursiveEquals(term33120, null));
    }

};


