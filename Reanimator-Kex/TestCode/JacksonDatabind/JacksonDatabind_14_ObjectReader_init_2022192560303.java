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

public class ObjectReader_init_2022192560303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101990;
     Object term102370;
     Object term102476;
     Object term102588;
     Object term102694;
     Object term100863;

    public ObjectReader_init_2022192560303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term101000 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term101110 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term101258 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term101340 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term101422 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term101528 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        Object term101628 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term101752 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StringDeserializer"));
        Object term101790 = newInstance(Class.forName("java.lang.Object"));
        Object term100875 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        Object term101898 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term101000, term101000.getClass(), "_config", term101110);
        setField(term101000, term101000.getClass(), "_context", term101258);
        setField(term101000, term101000.getClass(), "_rootDeserializers", term101340);
        setField(term101000, term101000.getClass(), "_parserFactory", term101422);
        setField(term101000, term101000.getClass(), "_rootNames", term101528);
        setField(term101000, term101000.getClass(), "_valueType", term101628);
        setField(term101000, term101000.getClass(), "_rootDeserializer", term101752);
        setField(term101000, term101000.getClass(), "_valueToUpdate", term101790);
        setField(term101000, term101000.getClass(), "_schema", term100875);
        setField(term101000, term101000.getClass(), "_injectableValues", term101898);
        term101990 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term102072 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term102154 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term102260 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        setField(term101990, term101990.getClass(), "_context", null);
        setField(term101990, term101990.getClass(), "_rootDeserializers", term102072);
        setField(term101990, term101990.getClass(), "_parserFactory", term102154);
        setField(term101990, term101990.getClass(), "_rootNames", term102260);
        term102370 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        term102476 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        term102588 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term102694 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        term100863 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        argTypes[4] = Class.forName("java.lang.Object");
        argTypes[5] = Class.forName("com.fasterxml.jackson.core.FormatSchema");
        argTypes[6] = Class.forName("com.fasterxml.jackson.databind.InjectableValues");
        argTypes[7] = Class.forName("com.fasterxml.jackson.databind.deser.DataFormatReaders");
        Object[] args = new Object[8];
        args[0] = term101990;
        args[1] = term102370;
        args[2] = term102476;
        args[3] = term102588;
        args[4] = term102694;
        args[5] = term100863;
        args[6] = null;
        args[7] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


