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
import org.mockito.Mockito;

public class ObjectReader_init_2073957032324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125918;
     Object term126226;
     Object term126324;
     Object term124648;

    public ObjectReader_init_2073957032324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term125572 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term125720 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term125826 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        setField(term125572, term125572.getClass(), "_config", null);
        setField(term125572, term125572.getClass(), "_context", term125720);
        setField(term125572, term125572.getClass(), "_rootDeserializers", null);
        setField(term125572, term125572.getClass(), "_parserFactory", null);
        setField(term125572, term125572.getClass(), "_rootNames", term125826);
        setField(term125572, term125572.getClass(), "_valueType", null);
        setField(term125572, term125572.getClass(), "_valueToUpdate", null);
        setField(term125572, term125572.getClass(), "_schema", null);
        setField(term125572, term125572.getClass(), "_injectableValues", null);
        setBooleanField(term125572, term125572.getClass(), "_unwrapRoot", false);
        term125918 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term126010 = newInstance(Class.forName("com.fasterxml.jackson.core.util.InternCache"));
        Object term126116 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        setField(term125918, term125918.getClass(), "_deserializationContext", null);
        setField(term125918, term125918.getClass(), "_rootDeserializers", term126010);
        setField(term125918, term125918.getClass(), "_jsonFactory", null);
        setField(term125918, term125918.getClass(), "_rootNames", term126116);
        term126226 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term126226, term126226.getClass(), "_rootName", null);
        setIntField(term126226, term126226.getClass(), "_deserFeatures", -1);
        term126324 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        term124648 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
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
        args[0] = term125918;
        args[1] = term126226;
        args[2] = term126324;
        args[3] = null;
        args[4] = term124648;
        args[5] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


