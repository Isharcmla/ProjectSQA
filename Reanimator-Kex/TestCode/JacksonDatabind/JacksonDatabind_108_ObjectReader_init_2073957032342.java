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

public class ObjectReader_init_2073957032342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118863;
     Object term118973;
     Object term119217;

    public ObjectReader_init_2073957032342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term118661 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term118771 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term118661, term118661.getClass(), "_config", term118771);
        setField(term118661, term118661.getClass(), "_context", null);
        setField(term118661, term118661.getClass(), "_rootDeserializers", null);
        setField(term118661, term118661.getClass(), "_parserFactory", null);
        setField(term118661, term118661.getClass(), "_valueType", null);
        setField(term118661, term118661.getClass(), "_valueToUpdate", null);
        setField(term118661, term118661.getClass(), "_schema", null);
        setField(term118661, term118661.getClass(), "_injectableValues", null);
        setBooleanField(term118661, term118661.getClass(), "_unwrapRoot", false);
        term118863 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        setField(term118863, term118863.getClass(), "_deserializationContext", null);
        setField(term118863, term118863.getClass(), "_rootDeserializers", null);
        setField(term118863, term118863.getClass(), "_jsonFactory", null);
        term118973 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term119065 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term119065, term119065.getClass(), "_namespace", null);
        setField(term119065, term119065.getClass(), "_simpleName", "                                                                                                                                                                                                                                          ");
        setField(term118973, term118973.getClass(), "_rootName", term119065);
        setIntField(term118973, term118973.getClass(), "_deserFeatures", -1);
        term119217 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
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
        args[0] = term118863;
        args[1] = term118973;
        args[2] = term119217;
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


