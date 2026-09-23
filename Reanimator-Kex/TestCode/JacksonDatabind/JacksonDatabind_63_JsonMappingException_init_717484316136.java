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

public class JsonMappingException_init_717484316136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term244242;

    public JsonMappingException_init_717484316136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term244094 = new ArrayList();
        Object term243998 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object term244042 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term243855 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        setField(term243998, term243998.getClass(), "cause", term244042);
        setField(term243998, term243998.getClass(), "stackTrace", term243855);
        setField(term243998, term243998.getClass(), "suppressedExceptions", term244094);
        setField(term243998, term243998.getClass(), "detailMessage", "");
        setField(term243998, term243998.getClass(), "_location", null);
        setField(term243998, term243998.getClass(), "_processor", null);
        term244242 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.Closeable");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.Throwable");
        Object[] args = new Object[3];
        args[0] = term244242;
        args[1] = null;
        args[2] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


