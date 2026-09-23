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

public class ObjectReader_init_1619648465250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33704;
     Object term33814;
     Object term34430;
     Object term34432;
     Object term34433;

    public ObjectReader_init_1619648465250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term33502 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term33612 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term33502, term33502.getClass(), "_config", term33612);
        term33704 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        term33814 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        term34430 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term34431 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term34431, term34431.getClass(), "_problemHandlers", null);
        setField(term34431, term34431.getClass(), "_nodeFactory", null);
        setIntField(term34431, term34431.getClass(), "_deserFeatures", 0);
        setIntField(term34431, term34431.getClass(), "_parserFeatures", 0);
        setIntField(term34431, term34431.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term34431, term34431.getClass(), "_formatReadFeatures", 0);
        setIntField(term34431, term34431.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term34431, term34431.getClass(), "_mixIns", null);
        setField(term34431, term34431.getClass(), "_subtypeResolver", null);
        setField(term34431, term34431.getClass(), "_rootName", null);
        setField(term34431, term34431.getClass(), "_view", null);
        setField(term34431, term34431.getClass(), "_attributes", null);
        setField(term34431, term34431.getClass(), "_rootNames", null);
        setIntField(term34431, term34431.getClass(), "_mapperFeatures", 0);
        setField(term34431, term34431.getClass(), "_base", null);
        setField(term34430, term34430.getClass(), "_config", term34431);
        setField(term34430, term34430.getClass(), "_context", null);
        setField(term34430, term34430.getClass(), "_parserFactory", null);
        setBooleanField(term34430, term34430.getClass(), "_unwrapRoot", false);
        setField(term34430, term34430.getClass(), "_filter", null);
        setField(term34430, term34430.getClass(), "_valueType", null);
        setField(term34430, term34430.getClass(), "_rootDeserializer", null);
        setField(term34430, term34430.getClass(), "_valueToUpdate", null);
        setField(term34430, term34430.getClass(), "_schema", null);
        setField(term34430, term34430.getClass(), "_injectableValues", null);
        setField(term34430, term34430.getClass(), "_dataFormatReaders", null);
        setField(term34430, term34430.getClass(), "_rootDeserializers", null);
        term34432 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term34432, term34432.getClass(), "_problemHandlers", null);
        setField(term34432, term34432.getClass(), "_nodeFactory", null);
        setIntField(term34432, term34432.getClass(), "_deserFeatures", 0);
        setIntField(term34432, term34432.getClass(), "_parserFeatures", 0);
        setIntField(term34432, term34432.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term34432, term34432.getClass(), "_formatReadFeatures", 0);
        setIntField(term34432, term34432.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term34432, term34432.getClass(), "_mixIns", null);
        setField(term34432, term34432.getClass(), "_subtypeResolver", null);
        setField(term34432, term34432.getClass(), "_rootName", null);
        setField(term34432, term34432.getClass(), "_view", null);
        setField(term34432, term34432.getClass(), "_attributes", null);
        setField(term34432, term34432.getClass(), "_rootNames", null);
        setIntField(term34432, term34432.getClass(), "_mapperFeatures", 0);
        setField(term34432, term34432.getClass(), "_base", null);
        term34433 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        setField(term34433, term34433.getClass(), "_config", null);
        setField(term34433, term34433.getClass(), "_context", null);
        setField(term34433, term34433.getClass(), "_parserFactory", null);
        setBooleanField(term34433, term34433.getClass(), "_unwrapRoot", false);
        setField(term34433, term34433.getClass(), "_filter", null);
        setField(term34433, term34433.getClass(), "_valueType", null);
        setField(term34433, term34433.getClass(), "_rootDeserializer", null);
        setField(term34433, term34433.getClass(), "_valueToUpdate", null);
        setField(term34433, term34433.getClass(), "_schema", null);
        setField(term34433, term34433.getClass(), "_injectableValues", null);
        setField(term34433, term34433.getClass(), "_dataFormatReaders", null);
        setField(term34433, term34433.getClass(), "_rootDeserializers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        Object[] args = new Object[2];
        args[0] = term33704;
        args[1] = term33814;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term34430));
        assertTrue(recursiveEquals(term33704, term34432));
        assertTrue(recursiveEquals(term33814, term34433));
    }

};


