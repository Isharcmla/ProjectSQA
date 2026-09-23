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

public class ObjectReader_init_2022192560252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50974;
     Object term51342;
     Object term51424;

    public ObjectReader_init_2022192560252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term50380 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term50528 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term50610 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term50716 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        Object term50882 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer"));
        setField(term50380, term50380.getClass(), "_config", null);
        setField(term50380, term50380.getClass(), "_context", term50528);
        setField(term50380, term50380.getClass(), "_rootDeserializers", term50610);
        setField(term50380, term50380.getClass(), "_parserFactory", null);
        setField(term50380, term50380.getClass(), "_rootNames", term50716);
        setField(term50380, term50380.getClass(), "_valueType", null);
        setField(term50380, term50380.getClass(), "_rootDeserializer", term50882);
        setField(term50380, term50380.getClass(), "_valueToUpdate", null);
        term50974 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term51056 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term51138 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term51244 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        setField(term50974, term50974.getClass(), "_context", null);
        setField(term50974, term50974.getClass(), "_rootDeserializers", term51056);
        setField(term50974, term50974.getClass(), "_parserFactory", term51138);
        setField(term50974, term50974.getClass(), "_rootNames", term51244);
        term51342 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        term51424 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
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
        args[0] = term50974;
        args[1] = null;
        args[2] = term51342;
        args[3] = null;
        args[4] = term51424;
        args[5] = null;
        args[6] = null;
        args[7] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


