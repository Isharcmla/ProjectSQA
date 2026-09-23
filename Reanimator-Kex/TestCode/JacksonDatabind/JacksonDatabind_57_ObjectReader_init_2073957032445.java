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

public class ObjectReader_init_2073957032445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term232798;
     Object term233148;
     Object term233252;

    public ObjectReader_init_2073957032445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term232596 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term232706 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term232596, term232596.getClass(), "_config", term232706);
        setField(term232596, term232596.getClass(), "_context", null);
        setField(term232596, term232596.getClass(), "_rootDeserializers", null);
        setField(term232596, term232596.getClass(), "_parserFactory", null);
        setField(term232596, term232596.getClass(), "_valueType", null);
        setField(term232596, term232596.getClass(), "_valueToUpdate", null);
        setField(term232596, term232596.getClass(), "_schema", null);
        setField(term232596, term232596.getClass(), "_injectableValues", null);
        setBooleanField(term232596, term232596.getClass(), "_unwrapRoot", false);
        term232798 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term232946 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term233038 = newInstance(Class.forName("com.fasterxml.jackson.core.util.InternCache"));
        setField(term232798, term232798.getClass(), "_deserializationContext", term232946);
        setField(term232798, term232798.getClass(), "_rootDeserializers", term233038);
        setField(term232798, term232798.getClass(), "_jsonFactory", null);
        term233148 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term233148, term233148.getClass(), "_rootName", null);
        setIntField(term233148, term233148.getClass(), "_deserFeatures", -1);
        term233252 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
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
        args[0] = term232798;
        args[1] = term233148;
        args[2] = term233252;
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


