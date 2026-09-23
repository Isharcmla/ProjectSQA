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

public class ObjectReader_init_2073957032363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132506;
     Object term132856;
     Object term132960;

    public ObjectReader_init_2073957032363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term132304 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term132414 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term132304, term132304.getClass(), "_config", term132414);
        setField(term132304, term132304.getClass(), "_context", null);
        setField(term132304, term132304.getClass(), "_rootDeserializers", null);
        setField(term132304, term132304.getClass(), "_parserFactory", null);
        setField(term132304, term132304.getClass(), "_valueType", null);
        setField(term132304, term132304.getClass(), "_valueToUpdate", null);
        setField(term132304, term132304.getClass(), "_schema", null);
        setField(term132304, term132304.getClass(), "_injectableValues", null);
        setBooleanField(term132304, term132304.getClass(), "_unwrapRoot", false);
        term132506 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term132654 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term132746 = newInstance(Class.forName("com.fasterxml.jackson.core.util.InternCache"));
        setField(term132506, term132506.getClass(), "_deserializationContext", term132654);
        setField(term132506, term132506.getClass(), "_rootDeserializers", term132746);
        setField(term132506, term132506.getClass(), "_jsonFactory", null);
        term132856 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term132856, term132856.getClass(), "_rootName", null);
        setIntField(term132856, term132856.getClass(), "_deserFeatures", -1);
        term132960 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
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
        args[0] = term132506;
        args[1] = term132856;
        args[2] = term132960;
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


