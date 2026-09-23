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

public class LightweightMessageFormatter_format_413663799353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term300789;
     Object term300867;
     Object term300952;
     Object term300953;

    public LightweightMessageFormatter_format_413663799353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term300789 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term300789, term300789.getClass(), "source", null);
        term300867 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term300867, term300867.getClass(), "sourceName", null);
        term300952 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term300952, term300952.getClass(), "excerpt", null);
        setField(term300952, term300952.getClass(), "source", null);
        setBooleanField(term300952, term300952.getClass(), "colorize", false);
        term300953 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term300953, term300953.getClass(), "type", null);
        setField(term300953, term300953.getClass(), "description", null);
        setField(term300953, term300953.getClass(), "sourceName", null);
        setField(term300953, term300953.getClass(), "node", null);
        setIntField(term300953, term300953.getClass(), "lineNumber", 0);
        setField(term300953, term300953.getClass(), "level", null);
        setIntField(term300953, term300953.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term300867;
        args[1] = true;
        Object retValue = callMethod(klass, "format", argTypes, term300789, args);
        assertTrue(recursiveEquals(term300789, term300952));
        assertTrue(recursiveEquals(term300867, term300953));
        assertTrue(recursiveEquals(retValue, "WARNING - null\n"));
    }

};


