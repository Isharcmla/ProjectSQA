package com.fasterxml.jackson.databind.util;

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
import static com.fasterxml.jackson.databind.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TokenBuffer_init_1753724878169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26639;

    public TokenBuffer_init_1753724878169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term26533 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        setBooleanField(term26533, term26533.getClass(), "_hasNativeId", false);
        term26639 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term26745 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term26851 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term26957 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(term26851, term26851.getClass(), "delegate", term26957);
        setField(term26745, term26745.getClass(), "delegate", term26851);
        setField(term26639, term26639.getClass(), "delegate", term26745);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Object[] args = new Object[1];
        args[0] = term26639;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


