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

public class JsonMappingException_init_717484316234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term381231;
     Object term381377;

    public JsonMappingException_init_717484316234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term380917 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object term381025 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object term381111 = newInstance(Class.forName("java.util.zip.ZipFile"));
        setField(term380917, term380917.getClass(), "cause", term381025);
        setField(term380917, term380917.getClass(), "stackTrace", null);
        setField(term380917, term380917.getClass(), "suppressedExceptions", null);
        setField(term380917, term380917.getClass(), "detailMessage", "");
        setField(term380917, term380917.getClass(), "_location", null);
        setField(term380917, term380917.getClass(), "_processor", term381111);
        term381231 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        term381377 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.Closeable");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.Throwable");
        Object[] args = new Object[3];
        args[0] = term381231;
        args[1] = "";
        args[2] = term381377;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


