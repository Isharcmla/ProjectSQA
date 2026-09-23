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

public class ScopedAliases_process_840655313159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96626;
     Object term96718;
     Object term97136;
     Object term97137;

    public ScopedAliases_process_840655313159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96626 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term96626, term96626.getClass(), "compiler", null);
        term96718 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term96810 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term96718, term96718.getClass(), "type", 0);
        setIntField(term96810, term96810.getClass(), "type", 0);
        setField(term96810, term96810.getClass(), "parent", null);
        setField(term96718, term96718.getClass(), "parent", term96810);
        setField(term96718, term96718.getClass(), "first", null);
        term97136 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term97136, term97136.getClass(), "compiler", null);
        setField(term97136, term97136.getClass(), "preprocessorSymbolTable", null);
        setField(term97136, term97136.getClass(), "transformationHandler", null);
        term97137 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term97138 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term97137, term97137.getClass(), "str", null);
        setIntField(term97137, term97137.getClass(), "type", 0);
        setField(term97137, term97137.getClass(), "next", null);
        setField(term97137, term97137.getClass(), "first", null);
        setField(term97137, term97137.getClass(), "last", null);
        setField(term97137, term97137.getClass(), "propListHead", null);
        setIntField(term97137, term97137.getClass(), "sourcePosition", 0);
        setField(term97137, term97137.getClass(), "jsType", null);
        setField(term97138, term97138.getClass(), "str", null);
        setIntField(term97138, term97138.getClass(), "type", 0);
        setField(term97138, term97138.getClass(), "next", null);
        setField(term97138, term97138.getClass(), "first", null);
        setField(term97138, term97138.getClass(), "last", null);
        setField(term97138, term97138.getClass(), "propListHead", null);
        setIntField(term97138, term97138.getClass(), "sourcePosition", 0);
        setField(term97138, term97138.getClass(), "jsType", null);
        setField(term97138, term97138.getClass(), "parent", null);
        setField(term97137, term97137.getClass(), "parent", term97138);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term96718;
        callMethod(klass, "process", argTypes, term96626, args);
        assertTrue(recursiveEquals(term96626, term97136));
        assertTrue(recursiveEquals(term96718, null));
    }

};


