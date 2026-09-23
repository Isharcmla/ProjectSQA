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

public class ObjectReader_init_2073957032467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term261108;
     Object term261448;
     Object term261552;
     Object term261598;
     Object term259694;

    public ObjectReader_init_2073957032467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term261598 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term261653 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term261727 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term261746 = newInstance(Class.forName("java.lang.Object"));
        setField(term261598, term261598.getClass(), "_config", term261653);
        setField(term261598, term261598.getClass(), "_context", term261727);
        setField(term261598, term261598.getClass(), "_rootDeserializers", null);
        setField(term261598, term261598.getClass(), "_parserFactory", null);
        setField(term261598, term261598.getClass(), "_valueType", null);
        setField(term261598, term261598.getClass(), "_valueToUpdate", term261746);
        setField(term261598, term261598.getClass(), "_schema", null);
        setField(term261598, term261598.getClass(), "_injectableValues", null);
        setBooleanField(term261598, term261598.getClass(), "_unwrapRoot", false);
        term261108 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term261256 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term261338 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        setField(term261108, term261108.getClass(), "_deserializationContext", term261256);
        setField(term261108, term261108.getClass(), "_rootDeserializers", null);
        setField(term261108, term261108.getClass(), "_jsonFactory", term261338);
        term261448 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term261448, term261448.getClass(), "_rootName", null);
        setIntField(term261448, term261448.getClass(), "_deserFeatures", -1);
        term261552 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        term259694 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
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
        args[0] = term261108;
        args[1] = term261448;
        args[2] = term261552;
        args[3] = term261598;
        args[4] = term259694;
        args[5] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


