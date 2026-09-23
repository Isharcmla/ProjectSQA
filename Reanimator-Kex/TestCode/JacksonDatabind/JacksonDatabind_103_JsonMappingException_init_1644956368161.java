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

public class JsonMappingException_init_1644956368161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term307062;

    public JsonMappingException_init_1644956368161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term306840 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object term306884 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term306698 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term306942 = newInstance(Class.forName("java.io.OutputStreamWriter"));
        setField(term306840, term306840.getClass(), "cause", term306884);
        setField(term306840, term306840.getClass(), "stackTrace", term306698);
        setField(term306840, term306840.getClass(), "suppressedExceptions", null);
        setField(term306840, term306840.getClass(), "detailMessage", null);
        setField(term306840, term306840.getClass(), "_processor", term306942);
        term307062 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.Closeable");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term307062;
        args[1] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


