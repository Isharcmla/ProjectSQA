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

public class ObjectReader_init_2073957032345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122335;
     Object term122675;
     Object term122911;

    public ObjectReader_init_2073957032345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term122133 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term122243 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term122133, term122133.getClass(), "_config", term122243);
        setField(term122133, term122133.getClass(), "_context", null);
        setField(term122133, term122133.getClass(), "_rootDeserializers", null);
        setField(term122133, term122133.getClass(), "_parserFactory", null);
        setField(term122133, term122133.getClass(), "_valueType", null);
        setField(term122133, term122133.getClass(), "_valueToUpdate", null);
        setField(term122133, term122133.getClass(), "_schema", null);
        setField(term122133, term122133.getClass(), "_injectableValues", null);
        setBooleanField(term122133, term122133.getClass(), "_unwrapRoot", false);
        term122335 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term122483 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term122565 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term122335, term122335.getClass(), "_deserializationContext", term122483);
        setField(term122335, term122335.getClass(), "_rootDeserializers", term122565);
        setField(term122335, term122335.getClass(), "_jsonFactory", null);
        term122675 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term122767 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term122767, term122767.getClass(), "_namespace", "");
        setField(term122675, term122675.getClass(), "_rootName", term122767);
        setIntField(term122675, term122675.getClass(), "_deserFeatures", -1);
        term122911 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
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
        args[0] = term122335;
        args[1] = term122675;
        args[2] = term122911;
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


