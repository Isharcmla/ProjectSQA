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

public class JsonMappingException_init_717484316346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term546912;

    public JsonMappingException_init_717484316346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term546806 = new ArrayList();
        Object term546710 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object term546754 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term546571 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        setField(term546710, term546710.getClass(), "cause", term546754);
        setField(term546710, term546710.getClass(), "stackTrace", term546571);
        setField(term546710, term546710.getClass(), "suppressedExceptions", term546806);
        setField(term546710, term546710.getClass(), "detailMessage", null);
        setField(term546710, term546710.getClass(), "_location", null);
        setField(term546710, term546710.getClass(), "_processor", null);
        term546912 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.Closeable");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.Throwable");
        Object[] args = new Object[3];
        args[0] = term546912;
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


