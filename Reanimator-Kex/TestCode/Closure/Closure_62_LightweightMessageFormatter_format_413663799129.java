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

public class LightweightMessageFormatter_format_413663799129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95111;
     Object term95189;
     Object term96216;
     Object term96217;

    public LightweightMessageFormatter_format_413663799129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95111 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term95111, term95111.getClass(), "source", null);
        setBooleanField(term95111, term95111.getClass(), "colorize", true);
        term95189 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term95189, term95189.getClass(), "sourceName", "");
        setIntField(term95189, term95189.getClass(), "lineNumber", 1);
        term96216 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term96216, term96216.getClass(), "excerpt", null);
        setField(term96216, term96216.getClass(), "source", null);
        setBooleanField(term96216, term96216.getClass(), "colorize", true);
        term96217 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term96217, term96217.getClass(), "type", null);
        setField(term96217, term96217.getClass(), "description", null);
        setField(term96217, term96217.getClass(), "sourceName", "");
        setField(term96217, term96217.getClass(), "node", null);
        setIntField(term96217, term96217.getClass(), "lineNumber", 1);
        setField(term96217, term96217.getClass(), "level", null);
        setIntField(term96217, term96217.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term95189;
        args[1] = false;
        Object retValue = callMethod(klass, "format", argTypes, term95111, args);
        assertTrue(recursiveEquals(term95111, term96216));
        assertTrue(recursiveEquals(term95189, term96217));
        assertTrue(recursiveEquals(retValue, ":1: \u001B[31mERROR\u001B[39m - null\n"));
    }

};


