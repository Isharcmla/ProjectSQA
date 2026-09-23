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

public class JsonMappingException_init_1644956368132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term237245;

    public JsonMappingException_init_1644956368132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term237033 = new ArrayList();
        Object term236937 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object term236981 = newInstance(Class.forName("java.lang.Throwable"));
        Object term237125 = newInstance(Class.forName("java.io.LineNumberReader"));
        setField(term236937, term236937.getClass(), "cause", term236981);
        setField(term236937, term236937.getClass(), "stackTrace", null);
        setField(term236937, term236937.getClass(), "suppressedExceptions", term237033);
        setField(term236937, term236937.getClass(), "detailMessage", "");
        setField(term236937, term236937.getClass(), "_processor", term237125);
        term237245 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.Closeable");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term237245;
        args[1] = "";
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


