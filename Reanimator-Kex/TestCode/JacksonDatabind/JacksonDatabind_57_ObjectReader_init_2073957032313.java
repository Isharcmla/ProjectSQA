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

public class ObjectReader_init_2073957032313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85643;
     Object term85901;
     Object term85993;

    public ObjectReader_init_2073957032313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term85441 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term85551 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term85441, term85441.getClass(), "_config", term85551);
        setField(term85441, term85441.getClass(), "_context", null);
        setField(term85441, term85441.getClass(), "_rootDeserializers", null);
        setField(term85441, term85441.getClass(), "_parserFactory", null);
        setField(term85441, term85441.getClass(), "_valueType", null);
        setField(term85441, term85441.getClass(), "_valueToUpdate", null);
        setField(term85441, term85441.getClass(), "_schema", null);
        setField(term85441, term85441.getClass(), "_injectableValues", null);
        setBooleanField(term85441, term85441.getClass(), "_unwrapRoot", false);
        term85643 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term85791 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term85643, term85643.getClass(), "_deserializationContext", term85791);
        setField(term85643, term85643.getClass(), "_rootDeserializers", null);
        setField(term85643, term85643.getClass(), "_jsonFactory", null);
        term85901 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term85901, term85901.getClass(), "_rootName", null);
        setIntField(term85901, term85901.getClass(), "_deserFeatures", -1);
        term85993 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
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
        args[0] = term85643;
        args[1] = term85901;
        args[2] = term85993;
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


