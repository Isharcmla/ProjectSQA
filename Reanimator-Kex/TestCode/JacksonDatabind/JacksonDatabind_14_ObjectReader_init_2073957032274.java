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

public class ObjectReader_init_2073957032274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73104;
     Object term73296;
     Object term73410;

    public ObjectReader_init_2073957032274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term72718 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term72866 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term72904 = newInstance(Class.forName("java.lang.Object"));
        Object term73012 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term72718, term72718.getClass(), "_config", null);
        setField(term72718, term72718.getClass(), "_context", term72866);
        setField(term72718, term72718.getClass(), "_rootDeserializers", null);
        setField(term72718, term72718.getClass(), "_parserFactory", null);
        setField(term72718, term72718.getClass(), "_rootNames", null);
        setField(term72718, term72718.getClass(), "_valueType", null);
        setField(term72718, term72718.getClass(), "_valueToUpdate", term72904);
        setField(term72718, term72718.getClass(), "_schema", null);
        setField(term72718, term72718.getClass(), "_injectableValues", term73012);
        setBooleanField(term72718, term72718.getClass(), "_unwrapRoot", false);
        term73104 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term73186 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term73104, term73104.getClass(), "_deserializationContext", null);
        setField(term73104, term73104.getClass(), "_rootDeserializers", term73186);
        setField(term73104, term73104.getClass(), "_jsonFactory", null);
        setField(term73104, term73104.getClass(), "_rootNames", null);
        term73296 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term73296, term73296.getClass(), "_rootName", null);
        setIntField(term73296, term73296.getClass(), "_deserFeatures", -1);
        term73410 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
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
        args[0] = term73104;
        args[1] = term73296;
        args[2] = term73410;
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


