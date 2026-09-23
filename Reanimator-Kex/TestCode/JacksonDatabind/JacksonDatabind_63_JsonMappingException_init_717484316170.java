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

public class JsonMappingException_init_717484316170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term292940;
     Object term293090;

    public JsonMappingException_init_717484316170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term292796 = new ArrayList();
        Object term292700 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object term292744 = newInstance(Class.forName("java.lang.Throwable"));
        setField(term292700, term292700.getClass(), "cause", term292744);
        setField(term292700, term292700.getClass(), "stackTrace", null);
        setField(term292700, term292700.getClass(), "suppressedExceptions", term292796);
        setField(term292700, term292700.getClass(), "detailMessage", "");
        setField(term292700, term292700.getClass(), "_location", null);
        setField(term292700, term292700.getClass(), "_processor", null);
        term292940 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term293046 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(term292940, term292940.getClass(), "delegate", term293046);
        term293090 = newInstance(Class.forName("java.lang.Throwable"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.Closeable");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.Throwable");
        Object[] args = new Object[3];
        args[0] = term292940;
        args[1] = null;
        args[2] = term293090;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


