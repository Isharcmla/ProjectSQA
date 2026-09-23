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

public class ObjectReader_init_2073957032369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141370;
     Object term141710;
     Object term141954;

    public ObjectReader_init_2073957032369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term140938 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term141048 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term141196 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term141278 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term140938, term140938.getClass(), "_config", term141048);
        setField(term140938, term140938.getClass(), "_context", term141196);
        setField(term140938, term140938.getClass(), "_rootDeserializers", term141278);
        setField(term140938, term140938.getClass(), "_parserFactory", null);
        setField(term140938, term140938.getClass(), "_valueType", null);
        setField(term140938, term140938.getClass(), "_valueToUpdate", null);
        setField(term140938, term140938.getClass(), "_schema", null);
        setField(term140938, term140938.getClass(), "_injectableValues", null);
        setBooleanField(term140938, term140938.getClass(), "_unwrapRoot", false);
        term141370 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term141518 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term141600 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term141370, term141370.getClass(), "_deserializationContext", term141518);
        setField(term141370, term141370.getClass(), "_rootDeserializers", term141600);
        setField(term141370, term141370.getClass(), "_jsonFactory", null);
        term141710 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term141802 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term141802, term141802.getClass(), "_namespace", null);
        setField(term141802, term141802.getClass(), "_simpleName", "");
        setField(term141710, term141710.getClass(), "_rootName", term141802);
        setIntField(term141710, term141710.getClass(), "_deserFeatures", -1);
        term141954 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
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
        args[0] = term141370;
        args[1] = term141710;
        args[2] = term141954;
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


