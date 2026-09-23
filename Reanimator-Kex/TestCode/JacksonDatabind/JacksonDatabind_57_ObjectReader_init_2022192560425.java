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

public class ObjectReader_init_2022192560425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term208346;
     Object term208631;
     Object term208797;
     Object term208933;
     Object term209053;
     Object term207193;
     Object term209161;

    public ObjectReader_init_2022192560425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term207332 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        term208631 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term208677 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term207682 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term207764 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term207846 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term207942 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term208108 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers$DoubleDeser"));
        Object term208146 = newInstance(Class.forName("java.lang.Object"));
        Object term207203 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        Object term208254 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term208631, term208631.getClass(), "_rootName", term208677);
        setField(term207332, term207332.getClass(), "_config", term208631);
        setField(term207332, term207332.getClass(), "_context", term207682);
        setField(term207332, term207332.getClass(), "_rootDeserializers", term207764);
        setField(term207332, term207332.getClass(), "_parserFactory", term207846);
        setField(term207332, term207332.getClass(), "_valueType", term207942);
        setField(term207332, term207332.getClass(), "_rootDeserializer", term208108);
        setField(term207332, term207332.getClass(), "_valueToUpdate", term208146);
        setField(term207332, term207332.getClass(), "_schema", term207203);
        setField(term207332, term207332.getClass(), "_injectableValues", term208254);
        term208346 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term208494 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term208576 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        setField(term208346, term208346.getClass(), "_context", term208494);
        setField(term208346, term208346.getClass(), "_rootDeserializers", null);
        setField(term208346, term208346.getClass(), "_parserFactory", term208576);
        term208797 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        term208933 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        term209053 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        term207193 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        term209161 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
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
        args[0] = term208346;
        args[1] = term208631;
        args[2] = term208797;
        args[3] = term208933;
        args[4] = term209053;
        args[5] = term207193;
        args[6] = term209161;
        args[7] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


