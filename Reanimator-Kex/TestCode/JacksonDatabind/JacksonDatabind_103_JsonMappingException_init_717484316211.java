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
import java.lang.StackOverflowError;
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class JsonMappingException_init_717484316211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term397264;
     Object term397410;

    public JsonMappingException_init_717484316211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term397106 = new ArrayList();
        Object term397054 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term396907 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        setField(term397054, term397054.getClass(), "cause", null);
        setField(term397054, term397054.getClass(), "stackTrace", term396907);
        setField(term397054, term397054.getClass(), "suppressedExceptions", term397106);
        setField(term397054, term397054.getClass(), "detailMessage", "");
        setField(term397054, term397054.getClass(), "_location", null);
        setField(term397054, term397054.getClass(), "_processor", null);
        term397264 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(term397264, term397264.getClass(), "delegate", term397264);
        term397410 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.Closeable");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.Throwable");
        Object[] args = new Object[3];
        args[0] = term397264;
        args[1] = "";
        args[2] = term397410;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


