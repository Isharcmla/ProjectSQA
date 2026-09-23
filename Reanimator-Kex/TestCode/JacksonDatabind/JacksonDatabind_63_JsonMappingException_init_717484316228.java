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

public class JsonMappingException_init_717484316228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term370639;

    public JsonMappingException_init_717484316228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term370397 = new ArrayList();
        Object term370301 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object term370345 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term370153 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term370519 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonLocation"));
        setField(term370301, term370301.getClass(), "cause", term370345);
        setField(term370301, term370301.getClass(), "stackTrace", term370153);
        setField(term370301, term370301.getClass(), "suppressedExceptions", term370397);
        setField(term370301, term370301.getClass(), "detailMessage", "");
        setField(term370301, term370301.getClass(), "_location", term370519);
        setField(term370301, term370301.getClass(), "_processor", null);
        term370639 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.Closeable");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.Throwable");
        Object[] args = new Object[3];
        args[0] = term370639;
        args[1] = "";
        args[2] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


