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

public class ObjectReader_init_1613963825232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36328;
     Object term36774;

    public ObjectReader_init_1613963825232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term35644 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term35754 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term35902 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term35984 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term36090 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term36128 = newInstance(Class.forName("java.lang.Object"));
        Object term36236 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term35644, term35644.getClass(), "_config", term35754);
        setField(term35644, term35644.getClass(), "_context", term35902);
        setField(term35644, term35644.getClass(), "_rootDeserializers", null);
        setField(term35644, term35644.getClass(), "_parserFactory", term35984);
        setField(term35644, term35644.getClass(), "_rootNames", null);
        setField(term35644, term35644.getClass(), "_valueType", term36090);
        setField(term35644, term35644.getClass(), "_valueToUpdate", term36128);
        setField(term35644, term35644.getClass(), "_schema", term36128);
        setField(term35644, term35644.getClass(), "_injectableValues", term36236);
        term36328 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term36476 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term36558 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term36664 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        setField(term36328, term36328.getClass(), "_deserializationContext", term36476);
        setField(term36328, term36328.getClass(), "_rootDeserializers", null);
        setField(term36328, term36328.getClass(), "_jsonFactory", term36558);
        setField(term36328, term36328.getClass(), "_rootNames", term36664);
        term36774 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term36774, term36774.getClass(), "_rootName", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        Object[] args = new Object[2];
        args[0] = term36328;
        args[1] = term36774;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


