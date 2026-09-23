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

public class ObjectReader_init_2073957032451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term240180;
     Object term240454;
     Object term240574;
     Object term238657;
     Object term240682;

    public ObjectReader_init_2073957032451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term239750 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term239860 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term239942 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term239980 = newInstance(Class.forName("java.lang.Object"));
        Object term240088 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term239750, term239750.getClass(), "_config", term239860);
        setField(term239750, term239750.getClass(), "_context", null);
        setField(term239750, term239750.getClass(), "_rootDeserializers", term239942);
        setField(term239750, term239750.getClass(), "_parserFactory", null);
        setField(term239750, term239750.getClass(), "_valueType", null);
        setField(term239750, term239750.getClass(), "_valueToUpdate", term239980);
        setField(term239750, term239750.getClass(), "_schema", null);
        setField(term239750, term239750.getClass(), "_injectableValues", term240088);
        setBooleanField(term239750, term239750.getClass(), "_unwrapRoot", false);
        term240180 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term240262 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term240344 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        setField(term240180, term240180.getClass(), "_deserializationContext", null);
        setField(term240180, term240180.getClass(), "_rootDeserializers", term240262);
        setField(term240180, term240180.getClass(), "_jsonFactory", term240344);
        term240454 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term240454, term240454.getClass(), "_rootName", null);
        setIntField(term240454, term240454.getClass(), "_deserFeatures", -1);
        term240574 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        term238657 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        term240682 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
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
        args[0] = term240180;
        args[1] = term240454;
        args[2] = term240574;
        args[3] = null;
        args[4] = term238657;
        args[5] = term240682;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


