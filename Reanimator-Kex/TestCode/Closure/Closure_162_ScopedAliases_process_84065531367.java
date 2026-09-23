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

public class ScopedAliases_process_84065531367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31659;
     Object term31729;
     Object term32082;
     Object term32083;

    public ScopedAliases_process_84065531367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31659 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term31659, term31659.getClass(), "compiler", null);
        term31729 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31799 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term31729, term31729.getClass(), "type", 0);
        setIntField(term31799, term31799.getClass(), "type", 0);
        setField(term31799, term31799.getClass(), "parent", null);
        setField(term31729, term31729.getClass(), "parent", term31799);
        setField(term31729, term31729.getClass(), "first", null);
        term32082 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term32082, term32082.getClass(), "compiler", null);
        setField(term32082, term32082.getClass(), "preprocessorSymbolTable", null);
        setField(term32082, term32082.getClass(), "transformationHandler", null);
        term32083 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32084 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32083, term32083.getClass(), "type", 0);
        setField(term32083, term32083.getClass(), "next", null);
        setField(term32083, term32083.getClass(), "first", null);
        setField(term32083, term32083.getClass(), "last", null);
        setField(term32083, term32083.getClass(), "propListHead", null);
        setIntField(term32083, term32083.getClass(), "sourcePosition", 0);
        setField(term32083, term32083.getClass(), "jsType", null);
        setIntField(term32084, term32084.getClass(), "type", 0);
        setField(term32084, term32084.getClass(), "next", null);
        setField(term32084, term32084.getClass(), "first", null);
        setField(term32084, term32084.getClass(), "last", null);
        setField(term32084, term32084.getClass(), "propListHead", null);
        setIntField(term32084, term32084.getClass(), "sourcePosition", 0);
        setField(term32084, term32084.getClass(), "jsType", null);
        setField(term32084, term32084.getClass(), "parent", null);
        setField(term32083, term32083.getClass(), "parent", term32084);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term31729;
        callMethod(klass, "process", argTypes, term31659, args);
        assertTrue(recursiveEquals(term31659, term32082));
        assertTrue(recursiveEquals(term31729, null));
    }

};


