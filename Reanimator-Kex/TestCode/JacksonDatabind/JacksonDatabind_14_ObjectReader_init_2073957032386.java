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

public class ObjectReader_init_2073957032386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term192641;
     Object term192843;
     Object term192949;
     Object term193031;

    public ObjectReader_init_2073957032386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term192363 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term192511 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term192549 = newInstance(Class.forName("java.lang.Object"));
        setField(term192363, term192363.getClass(), "_config", null);
        setField(term192363, term192363.getClass(), "_context", term192511);
        setField(term192363, term192363.getClass(), "_rootDeserializers", null);
        setField(term192363, term192363.getClass(), "_parserFactory", null);
        setField(term192363, term192363.getClass(), "_rootNames", null);
        setField(term192363, term192363.getClass(), "_valueType", null);
        setField(term192363, term192363.getClass(), "_valueToUpdate", term192549);
        setField(term192363, term192363.getClass(), "_schema", null);
        setField(term192363, term192363.getClass(), "_injectableValues", null);
        setBooleanField(term192363, term192363.getClass(), "_unwrapRoot", false);
        term192641 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term192733 = newInstance(Class.forName("com.fasterxml.jackson.core.util.InternCache"));
        setField(term192641, term192641.getClass(), "_deserializationContext", null);
        setField(term192641, term192641.getClass(), "_rootDeserializers", term192733);
        setField(term192641, term192641.getClass(), "_jsonFactory", null);
        setField(term192641, term192641.getClass(), "_rootNames", null);
        term192843 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term192843, term192843.getClass(), "_rootName", null);
        setIntField(term192843, term192843.getClass(), "_deserFeatures", -1);
        term192949 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        term193031 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
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
        args[0] = term192641;
        args[1] = term192843;
        args[2] = term192949;
        args[3] = term193031;
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


