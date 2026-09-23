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

public class ObjectReader_init_2073957032333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135131;
     Object term135323;
     Object term135467;
     Object term135505;
     Object term134215;
     Object term135613;

    public ObjectReader_init_2073957032333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term134351 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term134461 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term134609 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term134691 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term134797 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        Object term134893 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term134931 = newInstance(Class.forName("java.lang.Object"));
        Object term134224 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        Object term135039 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term134351, term134351.getClass(), "_config", term134461);
        setField(term134351, term134351.getClass(), "_context", term134609);
        setField(term134351, term134351.getClass(), "_rootDeserializers", null);
        setField(term134351, term134351.getClass(), "_parserFactory", term134691);
        setField(term134351, term134351.getClass(), "_rootNames", term134797);
        setField(term134351, term134351.getClass(), "_valueType", term134893);
        setField(term134351, term134351.getClass(), "_valueToUpdate", term134931);
        setField(term134351, term134351.getClass(), "_schema", term134224);
        setField(term134351, term134351.getClass(), "_injectableValues", term135039);
        term135131 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term135213 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        setField(term135131, term135131.getClass(), "_deserializationContext", null);
        setField(term135131, term135131.getClass(), "_rootDeserializers", null);
        setField(term135131, term135131.getClass(), "_jsonFactory", term135213);
        setField(term135131, term135131.getClass(), "_rootNames", null);
        term135323 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term135323, term135323.getClass(), "_rootName", "");
        term135467 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        term135505 = newInstance(Class.forName("java.lang.Object"));
        term134215 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        term135613 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
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
        args[0] = term135131;
        args[1] = term135323;
        args[2] = term135467;
        args[3] = term135505;
        args[4] = term134215;
        args[5] = term135613;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


