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

public class ObjectReader_init_2073957032321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94253;
     Object term94511;
     Object term94617;

    public ObjectReader_init_2073957032321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term93903 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term94013 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term94161 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term93903, term93903.getClass(), "_config", term94013);
        setField(term93903, term93903.getClass(), "_context", term94161);
        setField(term93903, term93903.getClass(), "_rootDeserializers", null);
        setField(term93903, term93903.getClass(), "_parserFactory", null);
        setField(term93903, term93903.getClass(), "_valueType", null);
        setField(term93903, term93903.getClass(), "_valueToUpdate", null);
        setField(term93903, term93903.getClass(), "_schema", null);
        setField(term93903, term93903.getClass(), "_injectableValues", null);
        setBooleanField(term93903, term93903.getClass(), "_unwrapRoot", false);
        term94253 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term94401 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term94253, term94253.getClass(), "_deserializationContext", term94401);
        setField(term94253, term94253.getClass(), "_rootDeserializers", null);
        setField(term94253, term94253.getClass(), "_jsonFactory", null);
        term94511 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term94511, term94511.getClass(), "_rootName", null);
        setIntField(term94511, term94511.getClass(), "_deserFeatures", -1);
        term94617 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
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
        args[0] = term94253;
        args[1] = term94511;
        args[2] = term94617;
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


