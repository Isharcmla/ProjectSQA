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

public class JsonMappingException_init_717484316286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term462802;
     Object term462846;

    public JsonMappingException_init_717484316286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term462606 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term462462 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term462690 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonLocation"));
        setField(term462606, term462606.getClass(), "cause", null);
        setField(term462606, term462606.getClass(), "stackTrace", term462462);
        setField(term462606, term462606.getClass(), "suppressedExceptions", null);
        setField(term462606, term462606.getClass(), "detailMessage", null);
        setField(term462606, term462606.getClass(), "_location", term462690);
        setField(term462606, term462606.getClass(), "_processor", null);
        term462802 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        term462846 = newInstance(Class.forName("java.io.IOException"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.Closeable");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.Throwable");
        Object[] args = new Object[3];
        args[0] = term462802;
        args[1] = null;
        args[2] = term462846;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


