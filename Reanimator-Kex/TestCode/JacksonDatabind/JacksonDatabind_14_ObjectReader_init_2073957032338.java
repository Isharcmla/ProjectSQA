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

public class ObjectReader_init_2073957032338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139227;
     Object term139745;
     Object term138317;
     Object term139853;

    public ObjectReader_init_2073957032338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term138447 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term138557 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term138705 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term138787 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term138893 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        Object term138989 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term139027 = newInstance(Class.forName("java.lang.Object"));
        Object term139135 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term138447, term138447.getClass(), "_config", term138557);
        setField(term138447, term138447.getClass(), "_context", term138705);
        setField(term138447, term138447.getClass(), "_rootDeserializers", null);
        setField(term138447, term138447.getClass(), "_parserFactory", term138787);
        setField(term138447, term138447.getClass(), "_rootNames", term138893);
        setField(term138447, term138447.getClass(), "_valueType", term138989);
        setField(term138447, term138447.getClass(), "_valueToUpdate", term139027);
        setField(term138447, term138447.getClass(), "_schema", null);
        setField(term138447, term138447.getClass(), "_injectableValues", term139135);
        term139227 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term139375 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term139457 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term139539 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term139645 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        setField(term139227, term139227.getClass(), "_deserializationContext", term139375);
        setField(term139227, term139227.getClass(), "_rootDeserializers", term139457);
        setField(term139227, term139227.getClass(), "_jsonFactory", term139539);
        setField(term139227, term139227.getClass(), "_rootNames", term139645);
        term139745 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        term138317 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        term139853 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
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
        args[0] = term139227;
        args[1] = null;
        args[2] = term139745;
        args[3] = null;
        args[4] = term138317;
        args[5] = term139853;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


