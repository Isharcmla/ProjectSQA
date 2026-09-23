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

public class ObjectReader_init_530904762263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35648;
     Object term36068;
     Object term36069;

    public ObjectReader_init_530904762263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35648 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        term36068 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        setField(term36068, term36068.getClass(), "_config", null);
        setField(term36068, term36068.getClass(), "_context", null);
        setField(term36068, term36068.getClass(), "_parserFactory", null);
        setBooleanField(term36068, term36068.getClass(), "_unwrapRoot", false);
        setField(term36068, term36068.getClass(), "_filter", null);
        setField(term36068, term36068.getClass(), "_valueType", null);
        setField(term36068, term36068.getClass(), "_rootDeserializer", null);
        setField(term36068, term36068.getClass(), "_valueToUpdate", null);
        setField(term36068, term36068.getClass(), "_schema", null);
        setField(term36068, term36068.getClass(), "_injectableValues", null);
        setField(term36068, term36068.getClass(), "_dataFormatReaders", null);
        setField(term36068, term36068.getClass(), "_rootDeserializers", null);
        term36069 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        setField(term36069, term36069.getClass(), "_config", null);
        setField(term36069, term36069.getClass(), "_context", null);
        setField(term36069, term36069.getClass(), "_parserFactory", null);
        setBooleanField(term36069, term36069.getClass(), "_unwrapRoot", false);
        setField(term36069, term36069.getClass(), "_filter", null);
        setField(term36069, term36069.getClass(), "_valueType", null);
        setField(term36069, term36069.getClass(), "_rootDeserializer", null);
        setField(term36069, term36069.getClass(), "_valueToUpdate", null);
        setField(term36069, term36069.getClass(), "_schema", null);
        setField(term36069, term36069.getClass(), "_injectableValues", null);
        setField(term36069, term36069.getClass(), "_dataFormatReaders", null);
        setField(term36069, term36069.getClass(), "_rootDeserializers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.core.filter.TokenFilter");
        Object[] args = new Object[2];
        args[0] = term35648;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term36068));
        assertTrue(recursiveEquals(term35648, term36069));
    }

};


