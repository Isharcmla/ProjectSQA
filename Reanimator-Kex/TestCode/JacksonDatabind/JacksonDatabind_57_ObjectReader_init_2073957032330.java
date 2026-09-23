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
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import org.mockito.Mockito;

public class ObjectReader_init_2073957032330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101706;
     Object term102005;
     Object term102241;
     Object term102279;
     Object term100979;
     Object term102387;

    public ObjectReader_init_2073957032330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term101118 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term101266 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term101895 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term101468 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term101506 = newInstance(Class.forName("java.lang.Object"));
        Object term100986 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        Object term101614 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term101118, term101118.getClass(), "_config", null);
        setField(term101118, term101118.getClass(), "_context", term101266);
        setField(term101118, term101118.getClass(), "_rootDeserializers", null);
        setField(term101118, term101118.getClass(), "_parserFactory", term101895);
        setField(term101118, term101118.getClass(), "_valueType", term101468);
        setField(term101118, term101118.getClass(), "_valueToUpdate", term101506);
        setField(term101118, term101118.getClass(), "_schema", term100986);
        setField(term101118, term101118.getClass(), "_injectableValues", term101614);
        term101706 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term101854 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term101706, term101706.getClass(), "_deserializationContext", term101854);
        setField(term101706, term101706.getClass(), "_rootDeserializers", null);
        setField(term101706, term101706.getClass(), "_jsonFactory", term101895);
        term102005 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term102097 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term102097, term102097.getClass(), "_namespace", "");
        setField(term102005, term102005.getClass(), "_rootName", term102097);
        term102241 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        term102279 = newInstance(Class.forName("java.lang.Object"));
        term100979 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        term102387 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
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
        args[0] = term101706;
        args[1] = term102005;
        args[2] = term102241;
        args[3] = term102279;
        args[4] = term100979;
        args[5] = term102387;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


