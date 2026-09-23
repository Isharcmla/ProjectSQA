package com.fasterxml.jackson.core.util;

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
import static com.fasterxml.jackson.core.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.core.util.EqualityUtils.*;
import java.lang.Object;

public class JsonParserSequence_init_12463185817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term11;
     Object term13;

    public JsonParserSequence_init_12463185817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = (Object[]) newArray("com.fasterxml.jackson.core.JsonParser", 5);
        term11 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object[] term12 = (Object[]) newArray("com.fasterxml.jackson.core.JsonParser", 5);
        setField(term11, term11.getClass(), "_parsers", term12);
        setIntField(term11, term11.getClass(), "_nextParser", 1);
        setField(term11, term11.getClass(), "delegate", null);
        setIntField(term11, term11.getClass(), "_features", 0);
        setField(term11, term11.getClass(), "_requestPayload", null);
        term13 = (Object[]) newArray("com.fasterxml.jackson.core.JsonParser", 5);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("com.fasterxml.jackson.core.JsonParser"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term11));
        assertTrue(recursiveEquals(term1, term13));
    }

};


