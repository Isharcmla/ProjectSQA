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

public class ObjectReader_init_2073957032381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154816;
     Object term155156;
     Object term155270;

    public ObjectReader_init_2073957032381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term154614 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term154724 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term154614, term154614.getClass(), "_config", term154724);
        setField(term154614, term154614.getClass(), "_context", null);
        setField(term154614, term154614.getClass(), "_rootDeserializers", null);
        setField(term154614, term154614.getClass(), "_parserFactory", null);
        setField(term154614, term154614.getClass(), "_valueType", null);
        setField(term154614, term154614.getClass(), "_valueToUpdate", null);
        setField(term154614, term154614.getClass(), "_schema", null);
        setField(term154614, term154614.getClass(), "_injectableValues", null);
        setBooleanField(term154614, term154614.getClass(), "_unwrapRoot", false);
        term154816 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term154964 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term155046 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term154816, term154816.getClass(), "_deserializationContext", term154964);
        setField(term154816, term154816.getClass(), "_rootDeserializers", term155046);
        setField(term154816, term154816.getClass(), "_jsonFactory", null);
        term155156 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term155156, term155156.getClass(), "_rootName", null);
        setIntField(term155156, term155156.getClass(), "_deserFeatures", -1);
        term155270 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
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
        args[0] = term154816;
        args[1] = term155156;
        args[2] = term155270;
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


