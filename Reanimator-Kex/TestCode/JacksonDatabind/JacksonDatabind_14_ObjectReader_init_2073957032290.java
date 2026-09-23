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

public class ObjectReader_init_2073957032290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88907;
     Object term89312;
     Object term89448;
     Object term89548;

    public ObjectReader_init_2073957032290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term88411 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term88559 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term88641 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term89096 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term88815 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term88137 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        setField(term88411, term88411.getClass(), "_config", null);
        setField(term88411, term88411.getClass(), "_context", term88559);
        setField(term88411, term88411.getClass(), "_rootDeserializers", term88641);
        setField(term88411, term88411.getClass(), "_parserFactory", term89096);
        setField(term88411, term88411.getClass(), "_rootNames", null);
        setField(term88411, term88411.getClass(), "_valueType", term88815);
        setField(term88411, term88411.getClass(), "_valueToUpdate", null);
        setField(term88411, term88411.getClass(), "_schema", term88137);
        setField(term88411, term88411.getClass(), "_injectableValues", null);
        setBooleanField(term88411, term88411.getClass(), "_unwrapRoot", false);
        term88907 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term89055 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term89202 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        setField(term88907, term88907.getClass(), "_deserializationContext", term89055);
        setField(term88907, term88907.getClass(), "_rootDeserializers", null);
        setField(term88907, term88907.getClass(), "_jsonFactory", term89096);
        setField(term88907, term88907.getClass(), "_rootNames", term89202);
        term89312 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term89312, term89312.getClass(), "_rootName", "");
        setIntField(term89312, term89312.getClass(), "_deserFeatures", -1);
        term89448 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        term89548 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
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
        args[0] = term88907;
        args[1] = term89312;
        args[2] = term89448;
        args[3] = term89548;
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


