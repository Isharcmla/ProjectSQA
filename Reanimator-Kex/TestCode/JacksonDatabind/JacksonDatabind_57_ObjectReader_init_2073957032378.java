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

public class ObjectReader_init_2073957032378 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150439;
     Object term150697;
     Object term150801;

    public ObjectReader_init_2073957032378() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term150237 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term150347 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term150237, term150237.getClass(), "_config", term150347);
        setField(term150237, term150237.getClass(), "_context", null);
        setField(term150237, term150237.getClass(), "_rootDeserializers", null);
        setField(term150237, term150237.getClass(), "_parserFactory", null);
        setField(term150237, term150237.getClass(), "_valueType", null);
        setField(term150237, term150237.getClass(), "_valueToUpdate", null);
        setField(term150237, term150237.getClass(), "_schema", null);
        setField(term150237, term150237.getClass(), "_injectableValues", null);
        setBooleanField(term150237, term150237.getClass(), "_unwrapRoot", false);
        term150439 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term150587 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term150439, term150439.getClass(), "_deserializationContext", term150587);
        setField(term150439, term150439.getClass(), "_rootDeserializers", null);
        setField(term150439, term150439.getClass(), "_jsonFactory", null);
        term150697 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term150697, term150697.getClass(), "_rootName", null);
        setIntField(term150697, term150697.getClass(), "_deserFeatures", -1);
        term150801 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
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
        args[0] = term150439;
        args[1] = term150697;
        args[2] = term150801;
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


