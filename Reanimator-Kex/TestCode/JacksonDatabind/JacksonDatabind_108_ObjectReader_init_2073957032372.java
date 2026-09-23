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

public class ObjectReader_init_2073957032372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163325;
     Object term163517;
     Object term163745;
     Object term163783;
     Object term161756;

    public ObjectReader_init_2073957032372() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term163041 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term163151 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term163233 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term163041, term163041.getClass(), "_config", term163151);
        setField(term163041, term163041.getClass(), "_context", null);
        setField(term163041, term163041.getClass(), "_rootDeserializers", term163233);
        setField(term163041, term163041.getClass(), "_parserFactory", null);
        setField(term163041, term163041.getClass(), "_valueType", null);
        setField(term163041, term163041.getClass(), "_valueToUpdate", null);
        setField(term163041, term163041.getClass(), "_schema", null);
        setField(term163041, term163041.getClass(), "_injectableValues", null);
        setBooleanField(term163041, term163041.getClass(), "_unwrapRoot", false);
        term163325 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term163407 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term163325, term163325.getClass(), "_deserializationContext", null);
        setField(term163325, term163325.getClass(), "_rootDeserializers", term163407);
        setField(term163325, term163325.getClass(), "_jsonFactory", null);
        term163517 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term163609 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term163609, term163609.getClass(), "_namespace", null);
        setField(term163609, term163609.getClass(), "_simpleName", "          ");
        setField(term163517, term163517.getClass(), "_rootName", term163609);
        setIntField(term163517, term163517.getClass(), "_deserFeatures", -1);
        term163745 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        term163783 = newInstance(Class.forName("java.lang.Object"));
        term161756 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
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
        args[0] = term163325;
        args[1] = term163517;
        args[2] = term163745;
        args[3] = term163783;
        args[4] = term161756;
        args[5] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


