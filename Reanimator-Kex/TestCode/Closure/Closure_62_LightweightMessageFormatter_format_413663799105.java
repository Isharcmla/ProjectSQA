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

public class LightweightMessageFormatter_format_413663799105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72107;
     Object term72185;
     Object term72284;
     Object term72285;

    public LightweightMessageFormatter_format_413663799105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72107 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term72107, term72107.getClass(), "source", null);
        term72185 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term72185, term72185.getClass(), "sourceName", null);
        term72284 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term72284, term72284.getClass(), "excerpt", null);
        setField(term72284, term72284.getClass(), "source", null);
        setBooleanField(term72284, term72284.getClass(), "colorize", false);
        term72285 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term72285, term72285.getClass(), "type", null);
        setField(term72285, term72285.getClass(), "description", null);
        setField(term72285, term72285.getClass(), "sourceName", null);
        setField(term72285, term72285.getClass(), "node", null);
        setIntField(term72285, term72285.getClass(), "lineNumber", 0);
        setField(term72285, term72285.getClass(), "level", null);
        setIntField(term72285, term72285.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term72185;
        args[1] = true;
        Object retValue = callMethod(klass, "format", argTypes, term72107, args);
        assertTrue(recursiveEquals(term72107, term72284));
        assertTrue(recursiveEquals(term72185, term72285));
        assertTrue(recursiveEquals(retValue, "WARNING - null\n"));
    }

};


