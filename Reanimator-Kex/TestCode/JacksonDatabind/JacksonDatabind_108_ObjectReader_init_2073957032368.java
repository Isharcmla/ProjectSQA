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

public class ObjectReader_init_2073957032368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157506;
     Object term157856;
     Object term158106;

    public ObjectReader_init_2073957032368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term157304 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term157414 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term157304, term157304.getClass(), "_config", term157414);
        setField(term157304, term157304.getClass(), "_context", null);
        setField(term157304, term157304.getClass(), "_rootDeserializers", null);
        setField(term157304, term157304.getClass(), "_parserFactory", null);
        setField(term157304, term157304.getClass(), "_valueType", null);
        setField(term157304, term157304.getClass(), "_valueToUpdate", null);
        setField(term157304, term157304.getClass(), "_schema", null);
        setField(term157304, term157304.getClass(), "_injectableValues", null);
        setBooleanField(term157304, term157304.getClass(), "_unwrapRoot", false);
        term157506 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term157654 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term157746 = newInstance(Class.forName("com.fasterxml.jackson.core.util.InternCache"));
        setField(term157506, term157506.getClass(), "_deserializationContext", term157654);
        setField(term157506, term157506.getClass(), "_rootDeserializers", term157746);
        setField(term157506, term157506.getClass(), "_jsonFactory", null);
        term157856 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term157948 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term157948, term157948.getClass(), "_namespace", "");
        setField(term157856, term157856.getClass(), "_rootName", term157948);
        setIntField(term157856, term157856.getClass(), "_deserFeatures", -1);
        term158106 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
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
        args[0] = term157506;
        args[1] = term157856;
        args[2] = term158106;
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


