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

public class ObjectReader_init_2073957032375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147684;
     Object term147942;
     Object term148178;

    public ObjectReader_init_2073957032375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term147482 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term147592 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term147482, term147482.getClass(), "_config", term147592);
        setField(term147482, term147482.getClass(), "_context", null);
        setField(term147482, term147482.getClass(), "_rootDeserializers", null);
        setField(term147482, term147482.getClass(), "_parserFactory", null);
        setField(term147482, term147482.getClass(), "_valueType", null);
        setField(term147482, term147482.getClass(), "_valueToUpdate", null);
        setField(term147482, term147482.getClass(), "_schema", null);
        setField(term147482, term147482.getClass(), "_injectableValues", null);
        setBooleanField(term147482, term147482.getClass(), "_unwrapRoot", false);
        term147684 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term147832 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term147684, term147684.getClass(), "_deserializationContext", term147832);
        setField(term147684, term147684.getClass(), "_rootDeserializers", null);
        setField(term147684, term147684.getClass(), "_jsonFactory", null);
        term147942 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term148034 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term148034, term148034.getClass(), "_namespace", null);
        setField(term148034, term148034.getClass(), "_simpleName", "");
        setField(term147942, term147942.getClass(), "_rootName", term148034);
        setIntField(term147942, term147942.getClass(), "_deserFeatures", -1);
        term148178 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
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
        args[0] = term147684;
        args[1] = term147942;
        args[2] = term148178;
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


