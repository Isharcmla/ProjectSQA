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

public class ScopedAliases_hotSwapScript_88341709202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113536;
     Object term113628;
     Object term114202;
     Object term114203;

    public ScopedAliases_hotSwapScript_88341709202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113536 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term113536, term113536.getClass(), "compiler", null);
        term113628 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term113720 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term113790 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term113628, term113628.getClass(), "type", 0);
        setField(term113628, term113628.getClass(), "parent", null);
        setField(term113720, term113720.getClass(), "next", null);
        setIntField(term113720, term113720.getClass(), "type", 0);
        setField(term113720, term113720.getClass(), "first", term113790);
        setField(term113628, term113628.getClass(), "first", term113720);
        term114202 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term114202, term114202.getClass(), "compiler", null);
        setField(term114202, term114202.getClass(), "preprocessorSymbolTable", null);
        setField(term114202, term114202.getClass(), "transformationHandler", null);
        term114203 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term114204 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term114205 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term114203, term114203.getClass(), "number", 0.0);
        setIntField(term114203, term114203.getClass(), "type", 0);
        setField(term114203, term114203.getClass(), "next", null);
        setDoubleField(term114204, term114204.getClass(), "number", 0.0);
        setIntField(term114204, term114204.getClass(), "type", 0);
        setField(term114204, term114204.getClass(), "next", null);
        setIntField(term114205, term114205.getClass(), "type", 0);
        setField(term114205, term114205.getClass(), "next", null);
        setField(term114205, term114205.getClass(), "first", null);
        setField(term114205, term114205.getClass(), "last", null);
        setField(term114205, term114205.getClass(), "propListHead", null);
        setIntField(term114205, term114205.getClass(), "sourcePosition", 0);
        setField(term114205, term114205.getClass(), "jsType", null);
        setField(term114205, term114205.getClass(), "parent", null);
        setField(term114204, term114204.getClass(), "first", term114205);
        setField(term114204, term114204.getClass(), "last", null);
        setField(term114204, term114204.getClass(), "propListHead", null);
        setIntField(term114204, term114204.getClass(), "sourcePosition", 0);
        setField(term114204, term114204.getClass(), "jsType", null);
        setField(term114204, term114204.getClass(), "parent", null);
        setField(term114203, term114203.getClass(), "first", term114204);
        setField(term114203, term114203.getClass(), "last", null);
        setField(term114203, term114203.getClass(), "propListHead", null);
        setIntField(term114203, term114203.getClass(), "sourcePosition", 0);
        setField(term114203, term114203.getClass(), "jsType", null);
        setField(term114203, term114203.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term113628;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term113536, args);
        assertTrue(recursiveEquals(term113536, term114202));
        assertTrue(recursiveEquals(term113628, term114203));
    }

};


