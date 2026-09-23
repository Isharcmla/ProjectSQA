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

public class ObjectReader_init_2022192560360 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term161707;
     Object term162216;
     Object term162352;
     Object term160715;

    public ObjectReader_init_2022192560360() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term161707 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term161762 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term161836 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term161877 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term161930 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        Object term161983 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term162064 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers$CharDeser"));
        Object term160722 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        Object term162118 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term161707, term161707.getClass(), "_config", term161762);
        setField(term161707, term161707.getClass(), "_context", term161836);
        setField(term161707, term161707.getClass(), "_rootDeserializers", null);
        setField(term161707, term161707.getClass(), "_parserFactory", term161877);
        setField(term161707, term161707.getClass(), "_rootNames", term161930);
        setField(term161707, term161707.getClass(), "_valueType", term161983);
        setField(term161707, term161707.getClass(), "_rootDeserializer", term162064);
        setField(term161707, term161707.getClass(), "_valueToUpdate", term161836);
        setField(term161707, term161707.getClass(), "_schema", term160722);
        setField(term161707, term161707.getClass(), "_injectableValues", term162118);
        term162216 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        term162352 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        term160715 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
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
        args[0] = term161707;
        args[1] = null;
        args[2] = term162216;
        args[3] = term162352;
        args[4] = null;
        args[5] = term160715;
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


