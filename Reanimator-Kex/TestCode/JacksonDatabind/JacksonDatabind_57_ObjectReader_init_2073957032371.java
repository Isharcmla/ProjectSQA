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

public class ObjectReader_init_2073957032371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143760;
     Object term144018;
     Object term144252;

    public ObjectReader_init_2073957032371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term143558 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term143668 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term143558, term143558.getClass(), "_config", term143668);
        setField(term143558, term143558.getClass(), "_context", null);
        setField(term143558, term143558.getClass(), "_rootDeserializers", null);
        setField(term143558, term143558.getClass(), "_parserFactory", null);
        setField(term143558, term143558.getClass(), "_valueType", null);
        setField(term143558, term143558.getClass(), "_valueToUpdate", null);
        setField(term143558, term143558.getClass(), "_schema", null);
        setField(term143558, term143558.getClass(), "_injectableValues", null);
        setBooleanField(term143558, term143558.getClass(), "_unwrapRoot", false);
        term143760 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term143908 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term143760, term143760.getClass(), "_deserializationContext", term143908);
        setField(term143760, term143760.getClass(), "_rootDeserializers", null);
        setField(term143760, term143760.getClass(), "_jsonFactory", null);
        term144018 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term144110 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term144110, term144110.getClass(), "_namespace", null);
        setField(term144110, term144110.getClass(), "_simpleName", "");
        setField(term144018, term144018.getClass(), "_rootName", term144110);
        setIntField(term144018, term144018.getClass(), "_deserFeatures", -1);
        term144252 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
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
        args[0] = term143760;
        args[1] = term144018;
        args[2] = term144252;
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


