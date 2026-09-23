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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ObjectReader_init_2073957032349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117931;
     Object term118189;
     Object term118295;

    public ObjectReader_init_2073957032349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term117729 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term117839 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term117729, term117729.getClass(), "_config", term117839);
        setField(term117729, term117729.getClass(), "_context", null);
        setField(term117729, term117729.getClass(), "_rootDeserializers", null);
        setField(term117729, term117729.getClass(), "_parserFactory", null);
        setField(term117729, term117729.getClass(), "_valueType", null);
        setField(term117729, term117729.getClass(), "_valueToUpdate", null);
        setField(term117729, term117729.getClass(), "_schema", null);
        setField(term117729, term117729.getClass(), "_injectableValues", null);
        term117931 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term118079 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term117931, term117931.getClass(), "_deserializationContext", term118079);
        setField(term117931, term117931.getClass(), "_rootDeserializers", null);
        setField(term117931, term117931.getClass(), "_jsonFactory", null);
        term118189 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term118189, term118189.getClass(), "_rootName", null);
        setIntField(term118189, term118189.getClass(), "_deserFeatures", -1);
        term118295 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
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
        args[0] = term117931;
        args[1] = term118189;
        args[2] = term118295;
        args[3] = "";
        args[4] = null;
        args[5] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


