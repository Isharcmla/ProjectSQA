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

public class ScopedAliases_process_840655313102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53307;
     Object term53377;
     Object term53720;
     Object term53721;

    public ScopedAliases_process_840655313102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53307 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term53307, term53307.getClass(), "compiler", null);
        term53377 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term53447 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term53377, term53377.getClass(), "type", 0);
        setIntField(term53447, term53447.getClass(), "type", 132);
        setField(term53377, term53377.getClass(), "parent", term53447);
        term53720 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term53720, term53720.getClass(), "compiler", null);
        setField(term53720, term53720.getClass(), "preprocessorSymbolTable", null);
        setField(term53720, term53720.getClass(), "transformationHandler", null);
        term53721 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term53722 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term53721, term53721.getClass(), "type", 0);
        setField(term53721, term53721.getClass(), "next", null);
        setField(term53721, term53721.getClass(), "first", null);
        setField(term53721, term53721.getClass(), "last", null);
        setField(term53721, term53721.getClass(), "propListHead", null);
        setIntField(term53721, term53721.getClass(), "sourcePosition", 0);
        setField(term53721, term53721.getClass(), "jsType", null);
        setIntField(term53722, term53722.getClass(), "type", 132);
        setField(term53722, term53722.getClass(), "next", null);
        setField(term53722, term53722.getClass(), "first", null);
        setField(term53722, term53722.getClass(), "last", null);
        setField(term53722, term53722.getClass(), "propListHead", null);
        setIntField(term53722, term53722.getClass(), "sourcePosition", 0);
        setField(term53722, term53722.getClass(), "jsType", null);
        setField(term53722, term53722.getClass(), "parent", null);
        setField(term53721, term53721.getClass(), "parent", term53722);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term53377;
        callMethod(klass, "process", argTypes, term53307, args);
        assertTrue(recursiveEquals(term53307, term53720));
        assertTrue(recursiveEquals(term53377, null));
    }

};


