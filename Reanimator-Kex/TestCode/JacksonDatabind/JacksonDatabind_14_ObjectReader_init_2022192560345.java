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

public class ObjectReader_init_2022192560345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148281;
     Object term148754;
     Object term148871;
     Object term149003;
     Object term149041;
     Object term147101;
     Object term149149;

    public ObjectReader_init_2022192560345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term147243 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term147353 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term147501 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term147583 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term147689 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        Object term147789 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term147933 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.NoClassDefFoundDeserializer"));
        term148754 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term148189 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term147243, term147243.getClass(), "_config", term147353);
        setField(term147243, term147243.getClass(), "_context", term147501);
        setField(term147243, term147243.getClass(), "_rootDeserializers", null);
        setField(term147243, term147243.getClass(), "_parserFactory", term147583);
        setField(term147243, term147243.getClass(), "_rootNames", term147689);
        setField(term147243, term147243.getClass(), "_valueType", term147789);
        setField(term147243, term147243.getClass(), "_rootDeserializer", term147933);
        setField(term148754, term148754.getClass(), "_rootName", "");
        setField(term147243, term147243.getClass(), "_valueToUpdate", term148754);
        setField(term147243, term147243.getClass(), "_schema", null);
        setField(term147243, term147243.getClass(), "_injectableValues", term148189);
        term148281 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term148429 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term148511 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term148593 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term148699 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        setField(term148281, term148281.getClass(), "_context", term148429);
        setField(term148281, term148281.getClass(), "_rootDeserializers", term148511);
        setField(term148281, term148281.getClass(), "_parserFactory", term148593);
        setField(term148281, term148281.getClass(), "_rootNames", term148699);
        term148871 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        term149003 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer"));
        term149041 = newInstance(Class.forName("java.lang.Object"));
        term147101 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        term149149 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
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
        args[0] = term148281;
        args[1] = term148754;
        args[2] = term148871;
        args[3] = term149003;
        args[4] = term149041;
        args[5] = term147101;
        args[6] = term149149;
        args[7] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


