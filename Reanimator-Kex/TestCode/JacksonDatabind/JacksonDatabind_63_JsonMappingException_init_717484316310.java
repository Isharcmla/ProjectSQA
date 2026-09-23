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

public class JsonMappingException_init_717484316310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term485263;
     Object term485475;

    public JsonMappingException_init_717484316310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term485035 = new ArrayList();
        Object term484983 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object term485157 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonLocation"));
        setField(term484983, term484983.getClass(), "cause", null);
        setField(term484983, term484983.getClass(), "stackTrace", null);
        setField(term484983, term484983.getClass(), "suppressedExceptions", term485035);
        setField(term484983, term484983.getClass(), "detailMessage", "");
        setField(term484983, term484983.getClass(), "_location", term485157);
        setField(term484983, term484983.getClass(), "_processor", null);
        term485263 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term485369 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(term485263, term485263.getClass(), "delegate", term485369);
        term485475 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonProcessingException"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.Closeable");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.Throwable");
        Object[] args = new Object[3];
        args[0] = term485263;
        args[1] = null;
        args[2] = term485475;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


