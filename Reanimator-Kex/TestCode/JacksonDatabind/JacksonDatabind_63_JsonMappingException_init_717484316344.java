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

public class JsonMappingException_init_717484316344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term543056;
     Object term543100;

    public JsonMappingException_init_717484316344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term542852 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term542708 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term542936 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonLocation"));
        setField(term542852, term542852.getClass(), "cause", null);
        setField(term542852, term542852.getClass(), "stackTrace", term542708);
        setField(term542852, term542852.getClass(), "suppressedExceptions", null);
        setField(term542852, term542852.getClass(), "detailMessage", null);
        setField(term542852, term542852.getClass(), "_location", term542936);
        setField(term542852, term542852.getClass(), "_processor", null);
        term543056 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        term543100 = newInstance(Class.forName("java.io.IOException"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.Closeable");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.Throwable");
        Object[] args = new Object[3];
        args[0] = term543056;
        args[1] = null;
        args[2] = term543100;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


