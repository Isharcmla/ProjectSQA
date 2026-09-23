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

public class JsonMappingException_init_71748431686 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178612;
     Object term178694;

    public JsonMappingException_init_71748431686() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term178318 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object term178362 = newInstance(Class.forName("java.lang.Throwable"));
        Object term178446 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonLocation"));
        Object term178506 = newInstance(Class.forName("java.io.BufferedInputStream"));
        setField(term178318, term178318.getClass(), "cause", term178362);
        setField(term178318, term178318.getClass(), "stackTrace", null);
        setField(term178318, term178318.getClass(), "suppressedExceptions", null);
        setField(term178318, term178318.getClass(), "detailMessage", null);
        setField(term178318, term178318.getClass(), "_location", term178446);
        setField(term178318, term178318.getClass(), "_processor", term178506);
        term178612 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        term178694 = newInstance(Class.forName("java.io.IOException"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.Closeable");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.Throwable");
        Object[] args = new Object[3];
        args[0] = term178612;
        args[1] = "";
        args[2] = term178694;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


