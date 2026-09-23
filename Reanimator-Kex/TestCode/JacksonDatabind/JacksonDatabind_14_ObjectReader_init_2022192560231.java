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
import java.lang.IllegalArgumentException;
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ObjectReader_init_2022192560231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34265;
     Object term34711;
     Object term34807;
     Object term34951;
     Object term35115;

    public ObjectReader_init_2022192560231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term33517 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term33627 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term34454 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term34495 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term33897 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        Object term33995 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        Object term34135 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.FromStringDeserializer$Std"));
        Object term34173 = newInstance(Class.forName("java.lang.Object"));
        setField(term33517, term33517.getClass(), "_config", term33627);
        setField(term33517, term33517.getClass(), "_context", null);
        setField(term33517, term33517.getClass(), "_rootDeserializers", term34454);
        setField(term33517, term33517.getClass(), "_parserFactory", term34495);
        setField(term33517, term33517.getClass(), "_rootNames", term33897);
        setField(term33517, term33517.getClass(), "_valueType", term33995);
        setField(term33517, term33517.getClass(), "_rootDeserializer", term34135);
        setField(term33517, term33517.getClass(), "_valueToUpdate", term34173);
        term34265 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term34413 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term34601 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        setField(term34265, term34265.getClass(), "_context", term34413);
        setField(term34265, term34265.getClass(), "_rootDeserializers", term34454);
        setField(term34265, term34265.getClass(), "_parserFactory", term34495);
        setField(term34265, term34265.getClass(), "_rootNames", term34601);
        term34711 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        term34807 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        term34951 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        term35115 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$NumberDeserializer"));
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
        args[0] = term34265;
        args[1] = term34711;
        args[2] = term34807;
        args[3] = term34951;
        args[4] = term35115;
        args[5] = null;
        args[6] = null;
        args[7] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


