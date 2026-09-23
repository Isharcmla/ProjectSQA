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

public class JsonMappingException_init_71748431683 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181649;
     Object term181793;

    public JsonMappingException_init_71748431683() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term181427 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object term181471 = newInstance(Class.forName("java.lang.Throwable"));
        Object term181529 = newInstance(Class.forName("java.io.FileOutputStream$1"));
        setField(term181427, term181427.getClass(), "cause", term181471);
        setField(term181427, term181427.getClass(), "stackTrace", null);
        setField(term181427, term181427.getClass(), "suppressedExceptions", null);
        setField(term181427, term181427.getClass(), "detailMessage", null);
        setField(term181427, term181427.getClass(), "_location", null);
        setField(term181427, term181427.getClass(), "_processor", term181529);
        term181649 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        term181793 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonProcessingException"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.Closeable");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.Throwable");
        Object[] args = new Object[3];
        args[0] = term181649;
        args[1] = "";
        args[2] = term181793;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


