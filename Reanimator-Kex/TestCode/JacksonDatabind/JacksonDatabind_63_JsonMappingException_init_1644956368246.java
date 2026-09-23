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

public class JsonMappingException_init_1644956368246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term401365;

    public JsonMappingException_init_1644956368246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term401145 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object term401189 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term401001 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term401245 = newInstance(Class.forName("java.io.InputStreamReader"));
        setField(term401145, term401145.getClass(), "cause", term401189);
        setField(term401145, term401145.getClass(), "stackTrace", term401001);
        setField(term401145, term401145.getClass(), "suppressedExceptions", null);
        setField(term401145, term401145.getClass(), "detailMessage", null);
        setField(term401145, term401145.getClass(), "_processor", term401245);
        term401365 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object term401477 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(term401365, term401365.getClass(), "delegate", term401477);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.Closeable");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term401365;
        args[1] = "";
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


