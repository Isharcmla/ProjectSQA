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
import java.lang.UnsupportedOperationException;
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MappingIterator_readAll_1504926291230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term187262;

    public MappingIterator_readAll_1504926291230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term187262 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term187372 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        Object term187402 = newInstance(Class.forName("java.lang.invoke.LambdaForm"));
        Object term187462 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.AbstractDeserializer"));
        setField(term187262, term187262.getClass(), "_parser", term187372);
        setBooleanField(term187262, term187262.getClass(), "_hasNextChecked", true);
        setField(term187262, term187262.getClass(), "_updatedValue", term187402);
        setField(term187262, term187262.getClass(), "_deserializer", term187462);
        setField(term187262, term187262.getClass(), "_context", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term187262, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


