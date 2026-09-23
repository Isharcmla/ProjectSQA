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

public class ObjectReader_init_1619648465227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30952;
     Object term31062;
     Object term31513;
     Object term31515;
     Object term31516;

    public ObjectReader_init_1619648465227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term30750 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term30860 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term30750, term30750.getClass(), "_config", term30860);
        term30952 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        term31062 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        term31513 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term31514 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setIntField(term31514, term31514.getClass(), "_deserFeatures", 0);
        setField(term31514, term31514.getClass(), "_problemHandlers", null);
        setField(term31514, term31514.getClass(), "_nodeFactory", null);
        setIntField(term31514, term31514.getClass(), "_parserFeatures", 0);
        setIntField(term31514, term31514.getClass(), "_parserFeaturesToChange", 0);
        setField(term31514, term31514.getClass(), "_mixInAnnotations", null);
        setField(term31514, term31514.getClass(), "_subtypeResolver", null);
        setField(term31514, term31514.getClass(), "_rootName", null);
        setField(term31514, term31514.getClass(), "_view", null);
        setField(term31514, term31514.getClass(), "_attributes", null);
        setIntField(term31514, term31514.getClass(), "_mapperFeatures", 0);
        setField(term31514, term31514.getClass(), "_base", null);
        setField(term31513, term31513.getClass(), "_config", term31514);
        setField(term31513, term31513.getClass(), "_context", null);
        setField(term31513, term31513.getClass(), "_parserFactory", null);
        setBooleanField(term31513, term31513.getClass(), "_unwrapRoot", false);
        setField(term31513, term31513.getClass(), "_valueType", null);
        setField(term31513, term31513.getClass(), "_rootDeserializer", null);
        setField(term31513, term31513.getClass(), "_valueToUpdate", null);
        setField(term31513, term31513.getClass(), "_schema", null);
        setField(term31513, term31513.getClass(), "_injectableValues", null);
        setField(term31513, term31513.getClass(), "_dataFormatReaders", null);
        setField(term31513, term31513.getClass(), "_rootDeserializers", null);
        setField(term31513, term31513.getClass(), "_rootNames", null);
        term31515 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setIntField(term31515, term31515.getClass(), "_deserFeatures", 0);
        setField(term31515, term31515.getClass(), "_problemHandlers", null);
        setField(term31515, term31515.getClass(), "_nodeFactory", null);
        setIntField(term31515, term31515.getClass(), "_parserFeatures", 0);
        setIntField(term31515, term31515.getClass(), "_parserFeaturesToChange", 0);
        setField(term31515, term31515.getClass(), "_mixInAnnotations", null);
        setField(term31515, term31515.getClass(), "_subtypeResolver", null);
        setField(term31515, term31515.getClass(), "_rootName", null);
        setField(term31515, term31515.getClass(), "_view", null);
        setField(term31515, term31515.getClass(), "_attributes", null);
        setIntField(term31515, term31515.getClass(), "_mapperFeatures", 0);
        setField(term31515, term31515.getClass(), "_base", null);
        term31516 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        setField(term31516, term31516.getClass(), "_config", null);
        setField(term31516, term31516.getClass(), "_context", null);
        setField(term31516, term31516.getClass(), "_parserFactory", null);
        setBooleanField(term31516, term31516.getClass(), "_unwrapRoot", false);
        setField(term31516, term31516.getClass(), "_valueType", null);
        setField(term31516, term31516.getClass(), "_rootDeserializer", null);
        setField(term31516, term31516.getClass(), "_valueToUpdate", null);
        setField(term31516, term31516.getClass(), "_schema", null);
        setField(term31516, term31516.getClass(), "_injectableValues", null);
        setField(term31516, term31516.getClass(), "_dataFormatReaders", null);
        setField(term31516, term31516.getClass(), "_rootDeserializers", null);
        setField(term31516, term31516.getClass(), "_rootNames", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        Object[] args = new Object[2];
        args[0] = term30952;
        args[1] = term31062;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term31513));
        assertTrue(recursiveEquals(term30952, term31515));
        assertTrue(recursiveEquals(term31062, term31516));
    }

};


