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

public class JsonMappingException_init_717484316424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term644725;
     Object term645101;

    public JsonMappingException_init_717484316424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term644569 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object term644619 = newInstance(Class.forName("java.io.OutputStream$1"));
        setField(term644569, term644569.getClass(), "cause", null);
        setField(term644569, term644569.getClass(), "stackTrace", null);
        setField(term644569, term644569.getClass(), "suppressedExceptions", null);
        setField(term644569, term644569.getClass(), "detailMessage", null);
        setField(term644569, term644569.getClass(), "_location", null);
        setField(term644569, term644569.getClass(), "_processor", term644619);
        term644725 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term644845 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object term644957 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(term644845, term644845.getClass(), "delegate", term644957);
        setField(term644725, term644725.getClass(), "delegate", term644845);
        term645101 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonProcessingException"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.Closeable");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.Throwable");
        Object[] args = new Object[3];
        args[0] = term644725;
        args[1] = "";
        args[2] = term645101;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


