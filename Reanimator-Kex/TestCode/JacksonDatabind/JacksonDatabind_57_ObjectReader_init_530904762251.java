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
import static com.fasterxml.jackson.databind.EqualityUtils.*;

public class ObjectReader_init_530904762251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34390;
     Object term34501;
     Object term34502;

    public ObjectReader_init_530904762251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34390 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        term34501 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        setField(term34501, term34501.getClass(), "_config", null);
        setField(term34501, term34501.getClass(), "_context", null);
        setField(term34501, term34501.getClass(), "_parserFactory", null);
        setBooleanField(term34501, term34501.getClass(), "_unwrapRoot", false);
        setField(term34501, term34501.getClass(), "_filter", null);
        setField(term34501, term34501.getClass(), "_valueType", null);
        setField(term34501, term34501.getClass(), "_rootDeserializer", null);
        setField(term34501, term34501.getClass(), "_valueToUpdate", null);
        setField(term34501, term34501.getClass(), "_schema", null);
        setField(term34501, term34501.getClass(), "_injectableValues", null);
        setField(term34501, term34501.getClass(), "_dataFormatReaders", null);
        setField(term34501, term34501.getClass(), "_rootDeserializers", null);
        term34502 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        setField(term34502, term34502.getClass(), "_config", null);
        setField(term34502, term34502.getClass(), "_context", null);
        setField(term34502, term34502.getClass(), "_parserFactory", null);
        setBooleanField(term34502, term34502.getClass(), "_unwrapRoot", false);
        setField(term34502, term34502.getClass(), "_filter", null);
        setField(term34502, term34502.getClass(), "_valueType", null);
        setField(term34502, term34502.getClass(), "_rootDeserializer", null);
        setField(term34502, term34502.getClass(), "_valueToUpdate", null);
        setField(term34502, term34502.getClass(), "_schema", null);
        setField(term34502, term34502.getClass(), "_injectableValues", null);
        setField(term34502, term34502.getClass(), "_dataFormatReaders", null);
        setField(term34502, term34502.getClass(), "_rootDeserializers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.core.filter.TokenFilter");
        Object[] args = new Object[2];
        args[0] = term34390;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term34501));
        assertTrue(recursiveEquals(term34390, term34502));
    }

};


