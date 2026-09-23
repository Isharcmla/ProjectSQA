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

public class ObjectReader_init_2022192560447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term234727;
     Object term235131;
     Object term235293;
     Object term235389;
     Object term235497;

    public ObjectReader_init_2022192560447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term233967 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term234077 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term234225 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term234307 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term234389 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term234509 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term234635 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer"));
        Object term233844 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        setField(term233967, term233967.getClass(), "_config", term234077);
        setField(term233967, term233967.getClass(), "_context", term234225);
        setField(term233967, term233967.getClass(), "_rootDeserializers", term234307);
        setField(term233967, term233967.getClass(), "_parserFactory", term234389);
        setField(term233967, term233967.getClass(), "_valueType", term234509);
        setField(term233967, term233967.getClass(), "_rootDeserializer", term234635);
        setField(term233967, term233967.getClass(), "_valueToUpdate", term234077);
        setField(term233967, term233967.getClass(), "_schema", term233844);
        setField(term233967, term233967.getClass(), "_injectableValues", null);
        term234727 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term234875 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term234957 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term235039 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        setField(term234727, term234727.getClass(), "_context", term234875);
        setField(term234727, term234727.getClass(), "_rootDeserializers", term234957);
        setField(term234727, term234727.getClass(), "_parserFactory", term235039);
        term235131 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        term235293 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers$LongDeser"));
        term235389 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        term235497 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
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
        args[0] = term234727;
        args[1] = null;
        args[2] = term235131;
        args[3] = term235293;
        args[4] = term235389;
        args[5] = null;
        args[6] = term235497;
        args[7] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


