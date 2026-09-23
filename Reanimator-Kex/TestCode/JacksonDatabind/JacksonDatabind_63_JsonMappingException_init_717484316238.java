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

public class JsonMappingException_init_717484316238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term389090;
     Object term389292;

    public JsonMappingException_init_717484316238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term388928 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object term388984 = newInstance(Class.forName("java.io.ObjectInputStream"));
        setField(term388928, term388928.getClass(), "cause", null);
        setField(term388928, term388928.getClass(), "stackTrace", null);
        setField(term388928, term388928.getClass(), "suppressedExceptions", null);
        setField(term388928, term388928.getClass(), "detailMessage", null);
        setField(term388928, term388928.getClass(), "_location", null);
        setField(term388928, term388928.getClass(), "_processor", term388984);
        term389090 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term389210 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(term389090, term389090.getClass(), "delegate", term389210);
        term389292 = newInstance(Class.forName("java.lang.Throwable"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.Closeable");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.Throwable");
        Object[] args = new Object[3];
        args[0] = term389090;
        args[1] = "";
        args[2] = term389292;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


