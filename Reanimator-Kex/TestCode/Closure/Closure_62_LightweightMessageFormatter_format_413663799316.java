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

public class LightweightMessageFormatter_format_413663799316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term267482;
     Object term267560;
     Object term268534;
     Object term268535;

    public LightweightMessageFormatter_format_413663799316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term267482 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term267482, term267482.getClass(), "source", null);
        term267560 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term267560, term267560.getClass(), "sourceName", ": ");
        setIntField(term267560, term267560.getClass(), "lineNumber", 0);
        term268534 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term268534, term268534.getClass(), "excerpt", null);
        setField(term268534, term268534.getClass(), "source", null);
        setBooleanField(term268534, term268534.getClass(), "colorize", false);
        term268535 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term268535, term268535.getClass(), "type", null);
        setField(term268535, term268535.getClass(), "description", null);
        setField(term268535, term268535.getClass(), "sourceName", ": ");
        setField(term268535, term268535.getClass(), "node", null);
        setIntField(term268535, term268535.getClass(), "lineNumber", 0);
        setField(term268535, term268535.getClass(), "level", null);
        setIntField(term268535, term268535.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term267560;
        args[1] = false;
        Object retValue = callMethod(klass, "format", argTypes, term267482, args);
        assertTrue(recursiveEquals(term267482, term268534));
        assertTrue(recursiveEquals(term267560, term268535));
        assertTrue(recursiveEquals(retValue, ": : ERROR - null\n"));
    }

};


