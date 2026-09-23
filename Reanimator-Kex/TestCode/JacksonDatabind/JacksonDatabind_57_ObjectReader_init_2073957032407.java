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

public class ObjectReader_init_2073957032407 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188965;
     Object term189315;
     Object term189413;

    public ObjectReader_init_2073957032407() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term188763 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term188873 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term188763, term188763.getClass(), "_config", term188873);
        setField(term188763, term188763.getClass(), "_context", null);
        setField(term188763, term188763.getClass(), "_rootDeserializers", null);
        setField(term188763, term188763.getClass(), "_parserFactory", null);
        setField(term188763, term188763.getClass(), "_valueType", null);
        setField(term188763, term188763.getClass(), "_valueToUpdate", null);
        setField(term188763, term188763.getClass(), "_schema", null);
        setField(term188763, term188763.getClass(), "_injectableValues", null);
        setBooleanField(term188763, term188763.getClass(), "_unwrapRoot", false);
        term188965 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term189113 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term189205 = newInstance(Class.forName("com.fasterxml.jackson.core.util.InternCache"));
        setField(term188965, term188965.getClass(), "_deserializationContext", term189113);
        setField(term188965, term188965.getClass(), "_rootDeserializers", term189205);
        setField(term188965, term188965.getClass(), "_jsonFactory", null);
        term189315 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term189315, term189315.getClass(), "_rootName", null);
        setIntField(term189315, term189315.getClass(), "_deserFeatures", -1);
        term189413 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
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
        args[0] = term188965;
        args[1] = term189315;
        args[2] = term189413;
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


