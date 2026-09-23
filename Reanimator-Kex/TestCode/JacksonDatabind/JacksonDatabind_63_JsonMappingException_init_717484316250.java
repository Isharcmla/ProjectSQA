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

public class JsonMappingException_init_717484316250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term406017;
     Object term406061;

    public JsonMappingException_init_717484316250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term405817 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term405673 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term405901 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonLocation"));
        setField(term405817, term405817.getClass(), "cause", null);
        setField(term405817, term405817.getClass(), "stackTrace", term405673);
        setField(term405817, term405817.getClass(), "suppressedExceptions", null);
        setField(term405817, term405817.getClass(), "detailMessage", null);
        setField(term405817, term405817.getClass(), "_location", term405901);
        setField(term405817, term405817.getClass(), "_processor", null);
        term406017 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        term406061 = newInstance(Class.forName("java.io.IOException"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.Closeable");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.Throwable");
        Object[] args = new Object[3];
        args[0] = term406017;
        args[1] = null;
        args[2] = term406061;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


