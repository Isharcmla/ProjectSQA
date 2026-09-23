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

public class ObjectReader_init_2073957032317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89945;
     Object term90055;
     Object term90283;

    public ObjectReader_init_2073957032317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term89743 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term89853 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term89743, term89743.getClass(), "_config", term89853);
        setField(term89743, term89743.getClass(), "_context", null);
        setField(term89743, term89743.getClass(), "_rootDeserializers", null);
        setField(term89743, term89743.getClass(), "_parserFactory", null);
        setField(term89743, term89743.getClass(), "_valueType", null);
        setField(term89743, term89743.getClass(), "_valueToUpdate", null);
        setField(term89743, term89743.getClass(), "_schema", null);
        setField(term89743, term89743.getClass(), "_injectableValues", null);
        setBooleanField(term89743, term89743.getClass(), "_unwrapRoot", false);
        term89945 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        setField(term89945, term89945.getClass(), "_deserializationContext", null);
        setField(term89945, term89945.getClass(), "_rootDeserializers", null);
        setField(term89945, term89945.getClass(), "_jsonFactory", null);
        term90055 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term90147 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term90147, term90147.getClass(), "_namespace", "");
        setField(term90055, term90055.getClass(), "_rootName", term90147);
        setIntField(term90055, term90055.getClass(), "_deserFeatures", -1);
        term90283 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
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
        args[0] = term89945;
        args[1] = term90055;
        args[2] = term90283;
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


