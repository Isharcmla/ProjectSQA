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

public class ObjectReader_init_2073957032419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201871;
     Object term202221;
     Object term202327;

    public ObjectReader_init_2073957032419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term201669 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term201779 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term201669, term201669.getClass(), "_config", term201779);
        setField(term201669, term201669.getClass(), "_context", null);
        setField(term201669, term201669.getClass(), "_rootDeserializers", null);
        setField(term201669, term201669.getClass(), "_parserFactory", null);
        setField(term201669, term201669.getClass(), "_valueType", null);
        setField(term201669, term201669.getClass(), "_valueToUpdate", null);
        setField(term201669, term201669.getClass(), "_schema", null);
        setField(term201669, term201669.getClass(), "_injectableValues", null);
        setBooleanField(term201669, term201669.getClass(), "_unwrapRoot", false);
        term201871 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term202019 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term202111 = newInstance(Class.forName("com.fasterxml.jackson.core.util.InternCache"));
        setField(term201871, term201871.getClass(), "_deserializationContext", term202019);
        setField(term201871, term201871.getClass(), "_rootDeserializers", term202111);
        setField(term201871, term201871.getClass(), "_jsonFactory", null);
        term202221 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term202221, term202221.getClass(), "_rootName", null);
        setIntField(term202221, term202221.getClass(), "_deserFeatures", -1);
        term202327 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
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
        args[0] = term201871;
        args[1] = term202221;
        args[2] = term202327;
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


