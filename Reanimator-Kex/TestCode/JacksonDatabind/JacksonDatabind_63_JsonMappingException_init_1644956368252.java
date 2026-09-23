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

public class JsonMappingException_init_1644956368252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term409966;

    public JsonMappingException_init_1644956368252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term409762 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object term409806 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term409620 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term409846 = newInstance(Class.forName("java.util.Scanner"));
        setField(term409762, term409762.getClass(), "cause", term409806);
        setField(term409762, term409762.getClass(), "stackTrace", term409620);
        setField(term409762, term409762.getClass(), "suppressedExceptions", null);
        setField(term409762, term409762.getClass(), "detailMessage", null);
        setField(term409762, term409762.getClass(), "_processor", term409846);
        term409966 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object term410076 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(term409966, term409966.getClass(), "delegate", term410076);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.Closeable");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term409966;
        args[1] = "";
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


