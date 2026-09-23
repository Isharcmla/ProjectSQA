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
import java.lang.Object;

public class ScopedAliases_process_840655313271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173598;
     Object term173668;
     Object term174500;
     Object term174501;

    public ScopedAliases_process_840655313271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173598 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term173598, term173598.getClass(), "compiler", null);
        term173668 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term173738 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term173808 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term173878 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term173668, term173668.getClass(), "type", 37);
        setField(term173668, term173668.getClass(), "parent", null);
        setField(term173808, term173808.getClass(), "next", null);
        setIntField(term173808, term173808.getClass(), "type", 0);
        setField(term173808, term173808.getClass(), "first", null);
        setField(term173738, term173738.getClass(), "next", term173808);
        setIntField(term173738, term173738.getClass(), "type", 0);
        setField(term173878, term173878.getClass(), "next", null);
        setIntField(term173878, term173878.getClass(), "type", 0);
        setField(term173878, term173878.getClass(), "first", null);
        setField(term173738, term173738.getClass(), "first", term173878);
        setField(term173668, term173668.getClass(), "first", term173738);
        term174500 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term174500, term174500.getClass(), "compiler", null);
        setField(term174500, term174500.getClass(), "preprocessorSymbolTable", null);
        setField(term174500, term174500.getClass(), "transformationHandler", null);
        term174501 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term174502 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term174503 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term174504 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term174501, term174501.getClass(), "type", 37);
        setField(term174501, term174501.getClass(), "next", null);
        setIntField(term174502, term174502.getClass(), "type", 0);
        setIntField(term174503, term174503.getClass(), "type", 0);
        setField(term174503, term174503.getClass(), "next", null);
        setField(term174503, term174503.getClass(), "first", null);
        setField(term174503, term174503.getClass(), "last", null);
        setField(term174503, term174503.getClass(), "propListHead", null);
        setIntField(term174503, term174503.getClass(), "sourcePosition", 0);
        setField(term174503, term174503.getClass(), "jsType", null);
        setField(term174503, term174503.getClass(), "parent", null);
        setField(term174502, term174502.getClass(), "next", term174503);
        setIntField(term174504, term174504.getClass(), "type", 0);
        setField(term174504, term174504.getClass(), "next", null);
        setField(term174504, term174504.getClass(), "first", null);
        setField(term174504, term174504.getClass(), "last", null);
        setField(term174504, term174504.getClass(), "propListHead", null);
        setIntField(term174504, term174504.getClass(), "sourcePosition", 0);
        setField(term174504, term174504.getClass(), "jsType", null);
        setField(term174504, term174504.getClass(), "parent", null);
        setField(term174502, term174502.getClass(), "first", term174504);
        setField(term174502, term174502.getClass(), "last", null);
        setField(term174502, term174502.getClass(), "propListHead", null);
        setIntField(term174502, term174502.getClass(), "sourcePosition", 0);
        setField(term174502, term174502.getClass(), "jsType", null);
        setField(term174502, term174502.getClass(), "parent", null);
        setField(term174501, term174501.getClass(), "first", term174502);
        setField(term174501, term174501.getClass(), "last", null);
        setField(term174501, term174501.getClass(), "propListHead", null);
        setIntField(term174501, term174501.getClass(), "sourcePosition", 0);
        setField(term174501, term174501.getClass(), "jsType", null);
        setField(term174501, term174501.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term173668;
        callMethod(klass, "process", argTypes, term173598, args);
        assertTrue(recursiveEquals(term173598, term174500));
        assertTrue(recursiveEquals(term173668, null));
    }

};


