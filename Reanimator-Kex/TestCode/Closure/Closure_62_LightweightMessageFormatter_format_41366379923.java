package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;

public class LightweightMessageFormatter_format_41366379923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15281;
     Object term15359;
     Object term15477;
     Object term15478;

    public LightweightMessageFormatter_format_41366379923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15281 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term15281, term15281.getClass(), "source", null);
        term15359 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term15359, term15359.getClass(), "sourceName", "");
        setIntField(term15359, term15359.getClass(), "lineNumber", 1);
        term15477 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term15477, term15477.getClass(), "excerpt", null);
        setField(term15477, term15477.getClass(), "source", null);
        setBooleanField(term15477, term15477.getClass(), "colorize", false);
        term15478 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term15478, term15478.getClass(), "type", null);
        setField(term15478, term15478.getClass(), "description", null);
        setField(term15478, term15478.getClass(), "sourceName", "");
        setField(term15478, term15478.getClass(), "node", null);
        setIntField(term15478, term15478.getClass(), "lineNumber", 1);
        setField(term15478, term15478.getClass(), "level", null);
        setIntField(term15478, term15478.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term15359;
        args[1] = false;
        Object retValue = callMethod(klass, "format", argTypes, term15281, args);
        assertTrue(recursiveEquals(term15281, term15477));
        assertTrue(recursiveEquals(term15359, term15478));
        assertTrue(recursiveEquals(retValue, ":1: ERROR - null\n"));
    }

};


