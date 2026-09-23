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

public class JsonMappingException_init_717484316207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term389663;
     Object term389807;

    public JsonMappingException_init_717484316207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term389391 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object term389475 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonLocation"));
        Object term389557 = newInstance(Class.forName("java.util.jar.Manifest$FastInputStream"));
        setField(term389391, term389391.getClass(), "cause", null);
        setField(term389391, term389391.getClass(), "stackTrace", null);
        setField(term389391, term389391.getClass(), "suppressedExceptions", null);
        setField(term389391, term389391.getClass(), "detailMessage", null);
        setField(term389391, term389391.getClass(), "_location", term389475);
        setField(term389391, term389391.getClass(), "_processor", term389557);
        term389663 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        term389807 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonProcessingException"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.Closeable");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.Throwable");
        Object[] args = new Object[3];
        args[0] = term389663;
        args[1] = "";
        args[2] = term389807;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


