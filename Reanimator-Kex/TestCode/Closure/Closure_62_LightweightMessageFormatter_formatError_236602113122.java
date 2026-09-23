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

public class LightweightMessageFormatter_formatError_236602113122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87180;
     Object term87258;
     Object term89613;
     Object term89614;

    public LightweightMessageFormatter_formatError_236602113122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87180 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term87180, term87180.getClass(), "source", null);
        setBooleanField(term87180, term87180.getClass(), "colorize", true);
        term87258 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term87258, term87258.getClass(), "sourceName", "");
        setIntField(term87258, term87258.getClass(), "lineNumber", 0);
        term89613 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term89613, term89613.getClass(), "excerpt", null);
        setField(term89613, term89613.getClass(), "source", null);
        setBooleanField(term89613, term89613.getClass(), "colorize", true);
        term89614 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term89614, term89614.getClass(), "type", null);
        setField(term89614, term89614.getClass(), "description", null);
        setField(term89614, term89614.getClass(), "sourceName", "");
        setField(term89614, term89614.getClass(), "node", null);
        setIntField(term89614, term89614.getClass(), "lineNumber", 0);
        setField(term89614, term89614.getClass(), "level", null);
        setIntField(term89614, term89614.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term87258;
        Object retValue = callMethod(klass, "formatError", argTypes, term87180, args);
        assertTrue(recursiveEquals(term87180, term89613));
        assertTrue(recursiveEquals(term87258, term89614));
        assertTrue(recursiveEquals(retValue, ": \u001B[31mERROR\u001B[39m - null\n"));
    }

};


