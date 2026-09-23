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

public class ObjectReader_init_2073957032285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60229;
     Object term60339;
     Object term60431;

    public ObjectReader_init_2073957032285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term59989 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term60137 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term59989, term59989.getClass(), "_config", null);
        setField(term59989, term59989.getClass(), "_context", term60137);
        setField(term59989, term59989.getClass(), "_rootDeserializers", null);
        setField(term59989, term59989.getClass(), "_parserFactory", null);
        setField(term59989, term59989.getClass(), "_valueType", null);
        setField(term59989, term59989.getClass(), "_valueToUpdate", null);
        setField(term59989, term59989.getClass(), "_schema", null);
        setField(term59989, term59989.getClass(), "_injectableValues", null);
        setBooleanField(term59989, term59989.getClass(), "_unwrapRoot", false);
        term60229 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        setField(term60229, term60229.getClass(), "_deserializationContext", null);
        setField(term60229, term60229.getClass(), "_rootDeserializers", null);
        setField(term60229, term60229.getClass(), "_jsonFactory", null);
        term60339 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term60339, term60339.getClass(), "_rootName", null);
        setIntField(term60339, term60339.getClass(), "_deserFeatures", -1);
        term60431 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
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
        args[0] = term60229;
        args[1] = term60339;
        args[2] = term60431;
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


