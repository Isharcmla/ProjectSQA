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

public class ObjectReader_init_2073957032336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137236;
     Object term137428;
     Object term137520;
     Object term137612;
     Object term135848;
     Object term137720;

    public ObjectReader_init_2073957032336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term136766 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term136876 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term137024 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term137106 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term136504 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        setField(term136766, term136766.getClass(), "_config", term136876);
        setField(term136766, term136766.getClass(), "_context", term137024);
        setField(term136766, term136766.getClass(), "_rootDeserializers", null);
        setField(term136766, term136766.getClass(), "_parserFactory", term137106);
        setField(term136766, term136766.getClass(), "_rootNames", null);
        setField(term136766, term136766.getClass(), "_valueType", null);
        setField(term136766, term136766.getClass(), "_valueToUpdate", "ACCEPT_EMPTY_STRING_AS_NULL_OBJECT");
        setField(term136766, term136766.getClass(), "_schema", term136504);
        setField(term136766, term136766.getClass(), "_injectableValues", null);
        term137236 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term137318 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        setField(term137236, term137236.getClass(), "_deserializationContext", null);
        setField(term137236, term137236.getClass(), "_rootDeserializers", null);
        setField(term137236, term137236.getClass(), "_jsonFactory", term137318);
        setField(term137236, term137236.getClass(), "_rootNames", null);
        term137428 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term137428, term137428.getClass(), "_rootName", null);
        setIntField(term137428, term137428.getClass(), "_deserFeatures", -1);
        term137520 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        term137612 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        term135848 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        term137720 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
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
        args[0] = term137236;
        args[1] = term137428;
        args[2] = term137520;
        args[3] = term137612;
        args[4] = term135848;
        args[5] = term137720;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


