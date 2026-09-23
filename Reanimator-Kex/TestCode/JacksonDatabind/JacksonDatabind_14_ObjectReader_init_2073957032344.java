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

public class ObjectReader_init_2073957032344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146011;
     Object term146351;
     Object term146489;
     Object term146597;

    public ObjectReader_init_2073957032344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term145623 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term145733 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term145881 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term145919 = newInstance(Class.forName("java.lang.Object"));
        Object term145345 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        setField(term145623, term145623.getClass(), "_config", term145733);
        setField(term145623, term145623.getClass(), "_context", term145881);
        setField(term145623, term145623.getClass(), "_rootDeserializers", null);
        setField(term145623, term145623.getClass(), "_parserFactory", null);
        setField(term145623, term145623.getClass(), "_rootNames", null);
        setField(term145623, term145623.getClass(), "_valueType", null);
        setField(term145623, term145623.getClass(), "_valueToUpdate", term145919);
        setField(term145623, term145623.getClass(), "_schema", term145345);
        setField(term145623, term145623.getClass(), "_injectableValues", null);
        setBooleanField(term145623, term145623.getClass(), "_unwrapRoot", false);
        term146011 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term146159 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term146241 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        setField(term146011, term146011.getClass(), "_deserializationContext", term146159);
        setField(term146011, term146011.getClass(), "_rootDeserializers", null);
        setField(term146011, term146011.getClass(), "_jsonFactory", term146241);
        setField(term146011, term146011.getClass(), "_rootNames", null);
        term146351 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term146351, term146351.getClass(), "_rootName", "FAIL_ON_");
        setIntField(term146351, term146351.getClass(), "_deserFeatures", -1);
        term146489 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        term146597 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
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
        args[0] = term146011;
        args[1] = term146351;
        args[2] = term146489;
        args[3] = null;
        args[4] = null;
        args[5] = term146597;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


