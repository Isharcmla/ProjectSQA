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
import java.util.ArrayList;

public class JsonMappingException_init_1644956368236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term439432;

    public JsonMappingException_init_1644956368236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term439212 = new ArrayList();
        Object term439160 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object term439308 = newInstance(Class.forName("com.fasterxml.jackson.databind.SequenceWriter"));
        setField(term439160, term439160.getClass(), "cause", null);
        setField(term439160, term439160.getClass(), "stackTrace", null);
        setField(term439160, term439160.getClass(), "suppressedExceptions", term439212);
        setField(term439160, term439160.getClass(), "detailMessage", null);
        setField(term439160, term439160.getClass(), "_processor", term439308);
        term439432 = newInstance(Class.forName("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        setIntField(term439432, term439432.getClass(), "_features", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.Closeable");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term439432;
        args[1] = "INCLUDE_SOURCE_IN_LOCATION";
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


