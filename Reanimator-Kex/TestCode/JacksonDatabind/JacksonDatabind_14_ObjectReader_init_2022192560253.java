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

public class ObjectReader_init_2022192560253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52364;
     Object term52663;
     Object term51794;
     Object term52809;

    public ObjectReader_init_2022192560253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term51920 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term52553 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term52164 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ShortDeserializer"));
        Object term52272 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term51920, term51920.getClass(), "_config", null);
        setField(term51920, term51920.getClass(), "_context", null);
        setField(term51920, term51920.getClass(), "_rootDeserializers", term52553);
        setField(term51920, term51920.getClass(), "_parserFactory", null);
        setField(term51920, term51920.getClass(), "_rootNames", null);
        setField(term51920, term51920.getClass(), "_valueType", null);
        setField(term51920, term51920.getClass(), "_rootDeserializer", term52164);
        setField(term51920, term51920.getClass(), "_valueToUpdate", null);
        setField(term51920, term51920.getClass(), "_schema", null);
        setField(term51920, term51920.getClass(), "_injectableValues", term52272);
        term52364 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term52512 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term52364, term52364.getClass(), "_context", term52512);
        setField(term52364, term52364.getClass(), "_rootDeserializers", term52553);
        setField(term52364, term52364.getClass(), "_parserFactory", null);
        setField(term52364, term52364.getClass(), "_rootNames", null);
        term52663 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term52663, term52663.getClass(), "_rootName", "");
        term51794 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        term52809 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
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
        args[0] = term52364;
        args[1] = term52663;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = term51794;
        args[6] = term52809;
        args[7] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


