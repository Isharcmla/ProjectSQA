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

public class ScopedAliases_process_840655313154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85646;
     Object term85716;
     Object term86103;
     Object term86104;

    public ScopedAliases_process_840655313154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85646 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term85646, term85646.getClass(), "compiler", null);
        term85716 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term85786 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term85716, term85716.getClass(), "type", 37);
        setField(term85716, term85716.getClass(), "parent", null);
        setField(term85786, term85786.getClass(), "next", null);
        setIntField(term85786, term85786.getClass(), "type", 105);
        setField(term85716, term85716.getClass(), "first", term85786);
        term86103 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term86103, term86103.getClass(), "compiler", null);
        setField(term86103, term86103.getClass(), "preprocessorSymbolTable", null);
        setField(term86103, term86103.getClass(), "transformationHandler", null);
        term86104 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term86105 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term86104, term86104.getClass(), "type", 37);
        setField(term86104, term86104.getClass(), "next", null);
        setIntField(term86105, term86105.getClass(), "type", 105);
        setField(term86105, term86105.getClass(), "next", null);
        setField(term86105, term86105.getClass(), "first", null);
        setField(term86105, term86105.getClass(), "last", null);
        setField(term86105, term86105.getClass(), "propListHead", null);
        setIntField(term86105, term86105.getClass(), "sourcePosition", 0);
        setField(term86105, term86105.getClass(), "jsType", null);
        setField(term86105, term86105.getClass(), "parent", null);
        setField(term86104, term86104.getClass(), "first", term86105);
        setField(term86104, term86104.getClass(), "last", null);
        setField(term86104, term86104.getClass(), "propListHead", null);
        setIntField(term86104, term86104.getClass(), "sourcePosition", 0);
        setField(term86104, term86104.getClass(), "jsType", null);
        setField(term86104, term86104.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term85716;
        callMethod(klass, "process", argTypes, term85646, args);
        assertTrue(recursiveEquals(term85646, term86103));
        assertTrue(recursiveEquals(term85716, null));
    }

};


