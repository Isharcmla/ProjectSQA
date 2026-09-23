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

public class JsonMappingException_init_717484316306 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term480631;

    public JsonMappingException_init_717484316306() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term480511 = new ArrayList();
        Object term480415 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object term480459 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term480276 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        setField(term480415, term480415.getClass(), "cause", term480459);
        setField(term480415, term480415.getClass(), "stackTrace", term480276);
        setField(term480415, term480415.getClass(), "suppressedExceptions", term480511);
        setField(term480415, term480415.getClass(), "detailMessage", null);
        setField(term480415, term480415.getClass(), "_location", null);
        setField(term480415, term480415.getClass(), "_processor", null);
        term480631 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.Closeable");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.Throwable");
        Object[] args = new Object[3];
        args[0] = term480631;
        args[1] = null;
        args[2] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


