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

public class ObjectReader_init_1613963825297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69356;
     Object term69559;

    public ObjectReader_init_1613963825297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term69024 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        term69559 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term69605 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term69264 = newInstance(Class.forName("java.lang.Object"));
        Object term68907 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        setField(term69559, term69559.getClass(), "_rootName", term69605);
        setField(term69024, term69024.getClass(), "_config", term69559);
        setField(term69024, term69024.getClass(), "_context", null);
        setField(term69024, term69024.getClass(), "_rootDeserializers", null);
        setField(term69024, term69024.getClass(), "_parserFactory", null);
        setField(term69024, term69024.getClass(), "_valueType", null);
        setField(term69024, term69024.getClass(), "_valueToUpdate", term69264);
        setField(term69024, term69024.getClass(), "_schema", term68907);
        setField(term69024, term69024.getClass(), "_injectableValues", null);
        term69356 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term69504 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term69356, term69356.getClass(), "_deserializationContext", term69504);
        setField(term69356, term69356.getClass(), "_rootDeserializers", null);
        setField(term69356, term69356.getClass(), "_jsonFactory", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        Object[] args = new Object[2];
        args[0] = term69356;
        args[1] = term69559;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


