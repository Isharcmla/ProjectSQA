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

public class JsonMappingException_init_717484316452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term698074;
     Object term698358;

    public JsonMappingException_init_717484316452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term697930 = new ArrayList();
        Object term697772 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object term697878 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonProcessingException"));
        setField(term697772, term697772.getClass(), "cause", term697878);
        setField(term697772, term697772.getClass(), "stackTrace", null);
        setField(term697772, term697772.getClass(), "suppressedExceptions", term697930);
        setField(term697772, term697772.getClass(), "detailMessage", "");
        setField(term697772, term697772.getClass(), "_location", null);
        setField(term697772, term697772.getClass(), "_processor", null);
        term698074 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term698194 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object term698314 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(term698194, term698194.getClass(), "delegate", term698314);
        setField(term698074, term698074.getClass(), "delegate", term698194);
        term698358 = newInstance(Class.forName("java.lang.Exception"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.Closeable");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.Throwable");
        Object[] args = new Object[3];
        args[0] = term698074;
        args[1] = null;
        args[2] = term698358;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


