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

public class ObjectReader_init_2073957032358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142867;
     Object term143141;
     Object term143385;
     Object term143467;

    public ObjectReader_init_2073957032358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term142557 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term142667 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term142775 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term142557, term142557.getClass(), "_config", term142667);
        setField(term142557, term142557.getClass(), "_context", null);
        setField(term142557, term142557.getClass(), "_rootDeserializers", null);
        setField(term142557, term142557.getClass(), "_parserFactory", null);
        setField(term142557, term142557.getClass(), "_valueType", null);
        setField(term142557, term142557.getClass(), "_valueToUpdate", null);
        setField(term142557, term142557.getClass(), "_schema", null);
        setField(term142557, term142557.getClass(), "_injectableValues", term142775);
        setBooleanField(term142557, term142557.getClass(), "_unwrapRoot", false);
        term142867 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term142949 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term143031 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        setField(term142867, term142867.getClass(), "_deserializationContext", null);
        setField(term142867, term142867.getClass(), "_rootDeserializers", term142949);
        setField(term142867, term142867.getClass(), "_jsonFactory", term143031);
        term143141 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term143233 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term143233, term143233.getClass(), "_namespace", null);
        setField(term143233, term143233.getClass(), "_simpleName", "");
        setField(term143141, term143141.getClass(), "_rootName", term143233);
        setIntField(term143141, term143141.getClass(), "_deserFeatures", -1);
        term143385 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        term143467 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
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
        args[0] = term142867;
        args[1] = term143141;
        args[2] = term143385;
        args[3] = term143467;
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


