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

public class ObjectReader_init_2073957032360 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145965;
     Object term146157;
     Object term146401;

    public ObjectReader_init_2073957032360() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term145533 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term145643 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term145791 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term145873 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term145533, term145533.getClass(), "_config", term145643);
        setField(term145533, term145533.getClass(), "_context", term145791);
        setField(term145533, term145533.getClass(), "_rootDeserializers", term145873);
        setField(term145533, term145533.getClass(), "_parserFactory", null);
        setField(term145533, term145533.getClass(), "_valueType", null);
        setField(term145533, term145533.getClass(), "_valueToUpdate", null);
        setField(term145533, term145533.getClass(), "_schema", null);
        setField(term145533, term145533.getClass(), "_injectableValues", null);
        setBooleanField(term145533, term145533.getClass(), "_unwrapRoot", false);
        term145965 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term146047 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term145965, term145965.getClass(), "_deserializationContext", null);
        setField(term145965, term145965.getClass(), "_rootDeserializers", term146047);
        setField(term145965, term145965.getClass(), "_jsonFactory", null);
        term146157 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term146249 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term146249, term146249.getClass(), "_namespace", null);
        setField(term146249, term146249.getClass(), "_simpleName", "");
        setField(term146157, term146157.getClass(), "_rootName", term146249);
        setIntField(term146157, term146157.getClass(), "_deserFeatures", -1);
        term146401 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
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
        args[0] = term145965;
        args[1] = term146157;
        args[2] = term146401;
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


