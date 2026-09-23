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

public class LightweightMessageFormatter_format_41366379995 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62908;
     Object term62986;
     Object term63162;
     Object term63163;

    public LightweightMessageFormatter_format_41366379995() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62908 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term62908, term62908.getClass(), "source", null);
        setBooleanField(term62908, term62908.getClass(), "colorize", true);
        term62986 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term62986, term62986.getClass(), "sourceName", "");
        setIntField(term62986, term62986.getClass(), "lineNumber", 0);
        term63162 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term63162, term63162.getClass(), "excerpt", null);
        setField(term63162, term63162.getClass(), "source", null);
        setBooleanField(term63162, term63162.getClass(), "colorize", true);
        term63163 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term63163, term63163.getClass(), "type", null);
        setField(term63163, term63163.getClass(), "description", null);
        setField(term63163, term63163.getClass(), "sourceName", "");
        setField(term63163, term63163.getClass(), "node", null);
        setIntField(term63163, term63163.getClass(), "lineNumber", 0);
        setField(term63163, term63163.getClass(), "level", null);
        setIntField(term63163, term63163.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term62986;
        args[1] = false;
        Object retValue = callMethod(klass, "format", argTypes, term62908, args);
        assertTrue(recursiveEquals(term62908, term63162));
        assertTrue(recursiveEquals(term62986, term63163));
        assertTrue(recursiveEquals(retValue, ": \u001B[31mERROR\u001B[39m - null\n"));
    }

};


