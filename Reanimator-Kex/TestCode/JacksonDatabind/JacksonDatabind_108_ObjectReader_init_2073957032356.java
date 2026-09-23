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

public class ObjectReader_init_2073957032356 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140152;
     Object term140492;
     Object term140728;

    public ObjectReader_init_2073957032356() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term139874 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term140022 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term140060 = newInstance(Class.forName("java.lang.Object"));
        setField(term139874, term139874.getClass(), "_config", null);
        setField(term139874, term139874.getClass(), "_context", term140022);
        setField(term139874, term139874.getClass(), "_rootDeserializers", null);
        setField(term139874, term139874.getClass(), "_parserFactory", null);
        setField(term139874, term139874.getClass(), "_valueType", null);
        setField(term139874, term139874.getClass(), "_valueToUpdate", term140060);
        setField(term139874, term139874.getClass(), "_schema", null);
        setField(term139874, term139874.getClass(), "_injectableValues", null);
        setBooleanField(term139874, term139874.getClass(), "_unwrapRoot", false);
        term140152 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term140300 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term140382 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term140152, term140152.getClass(), "_deserializationContext", term140300);
        setField(term140152, term140152.getClass(), "_rootDeserializers", term140382);
        setField(term140152, term140152.getClass(), "_jsonFactory", null);
        term140492 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term140584 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term140584, term140584.getClass(), "_namespace", null);
        setField(term140584, term140584.getClass(), "_simpleName", "          ");
        setField(term140492, term140492.getClass(), "_rootName", term140584);
        setIntField(term140492, term140492.getClass(), "_deserFeatures", -1);
        term140728 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
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
        args[0] = term140152;
        args[1] = term140492;
        args[2] = term140728;
        args[3] = null;
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


