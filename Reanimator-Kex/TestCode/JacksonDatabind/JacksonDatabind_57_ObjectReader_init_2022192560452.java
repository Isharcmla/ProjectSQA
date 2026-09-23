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

public class ObjectReader_init_2022192560452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term242346;
     Object term242686;
     Object term242908;
     Object term242946;
     Object term241279;
     Object term243054;

    public ObjectReader_init_2022192560452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term241422 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term241532 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term241680 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term241762 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term241844 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term241942 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        Object term242108 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BooleanDeserializer"));
        Object term242146 = newInstance(Class.forName("java.lang.Object"));
        Object term241290 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        Object term242254 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term241422, term241422.getClass(), "_config", term241532);
        setField(term241422, term241422.getClass(), "_context", term241680);
        setField(term241422, term241422.getClass(), "_rootDeserializers", term241762);
        setField(term241422, term241422.getClass(), "_parserFactory", term241844);
        setField(term241422, term241422.getClass(), "_valueType", term241942);
        setField(term241422, term241422.getClass(), "_rootDeserializer", term242108);
        setField(term241422, term241422.getClass(), "_valueToUpdate", term242146);
        setField(term241422, term241422.getClass(), "_schema", term241290);
        setField(term241422, term241422.getClass(), "_injectableValues", term242254);
        term242346 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term242494 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term242576 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        setField(term242346, term242346.getClass(), "_context", term242494);
        setField(term242346, term242346.getClass(), "_rootDeserializers", null);
        setField(term242346, term242346.getClass(), "_parserFactory", term242576);
        term242686 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term242778 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term242778, term242778.getClass(), "_namespace", "");
        setField(term242686, term242686.getClass(), "_rootName", term242778);
        term242908 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        term242946 = newInstance(Class.forName("java.lang.Object"));
        term241279 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        term243054 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
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
        args[0] = term242346;
        args[1] = term242686;
        args[2] = term242908;
        args[3] = null;
        args[4] = term242946;
        args[5] = term241279;
        args[6] = term243054;
        args[7] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


