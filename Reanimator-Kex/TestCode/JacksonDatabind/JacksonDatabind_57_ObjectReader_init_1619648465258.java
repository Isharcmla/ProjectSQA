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

public class ObjectReader_init_1619648465258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38251;
     Object term38779;

    public ObjectReader_init_1619648465258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term37499 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term37609 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term37757 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term37839 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term38615 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term38669 = newInstance(Class.forName("com.fasterxml.jackson.databind.ext.PathDeserializer"));
        Object term37378 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        Object term38159 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term37499, term37499.getClass(), "_config", term37609);
        setField(term37499, term37499.getClass(), "_context", term37757);
        setField(term37499, term37499.getClass(), "_rootDeserializers", null);
        setField(term37499, term37499.getClass(), "_parserFactory", term37839);
        setField(term37499, term37499.getClass(), "_valueType", term38615);
        setField(term37499, term37499.getClass(), "_rootDeserializer", term38669);
        setField(term37499, term37499.getClass(), "_valueToUpdate", term38615);
        setField(term37499, term37499.getClass(), "_schema", term37378);
        setField(term37499, term37499.getClass(), "_injectableValues", term38159);
        term38251 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term38399 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term38481 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term38563 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        setField(term38251, term38251.getClass(), "_context", term38399);
        setField(term38251, term38251.getClass(), "_rootDeserializers", term38481);
        setField(term38251, term38251.getClass(), "_parserFactory", term38563);
        setField(term38251, term38251.getClass(), "_valueType", term38615);
        setField(term38251, term38251.getClass(), "_rootDeserializer", term38669);
        setField(term38251, term38251.getClass(), "_valueToUpdate", term38615);
        setField(term38251, term38251.getClass(), "_schema", term37378);
        setField(term38251, term38251.getClass(), "_injectableValues", null);
        term38779 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term38871 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term38779, term38779.getClass(), "_rootName", term38871);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        Object[] args = new Object[2];
        args[0] = term38251;
        args[1] = term38779;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


