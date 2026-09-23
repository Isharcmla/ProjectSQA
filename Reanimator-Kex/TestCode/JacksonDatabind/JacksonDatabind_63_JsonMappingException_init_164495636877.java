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

public class JsonMappingException_init_164495636877 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term162687;

    public JsonMappingException_init_164495636877() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term162491 = new ArrayList();
        Object term162395 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object term162439 = newInstance(Class.forName("java.lang.Throwable"));
        Object term162581 = newInstance(Class.forName("java.io.CharArrayReader"));
        setField(term162395, term162395.getClass(), "cause", term162439);
        setField(term162395, term162395.getClass(), "stackTrace", null);
        setField(term162395, term162395.getClass(), "suppressedExceptions", term162491);
        setField(term162395, term162395.getClass(), "detailMessage", "");
        setField(term162395, term162395.getClass(), "_processor", term162581);
        term162687 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserDelegate"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.Closeable");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term162687;
        args[1] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


