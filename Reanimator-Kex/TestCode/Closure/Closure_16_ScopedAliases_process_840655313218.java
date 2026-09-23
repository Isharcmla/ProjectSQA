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

public class ScopedAliases_process_840655313218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134512;
     Object term134604;
     Object term136516;
     Object term136517;

    public ScopedAliases_process_840655313218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134512 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term134512, term134512.getClass(), "compiler", null);
        term134604 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term134696 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term134788 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term134880 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term134950 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term134604, term134604.getClass(), "type", 0);
        setField(term134604, term134604.getClass(), "parent", null);
        setField(term134788, term134788.getClass(), "next", null);
        setIntField(term134788, term134788.getClass(), "type", 0);
        setField(term134788, term134788.getClass(), "first", null);
        setField(term134696, term134696.getClass(), "next", term134788);
        setIntField(term134696, term134696.getClass(), "type", 0);
        setField(term134950, term134950.getClass(), "next", null);
        setIntField(term134950, term134950.getClass(), "type", 0);
        setField(term134950, term134950.getClass(), "first", null);
        setField(term134880, term134880.getClass(), "next", term134950);
        setIntField(term134880, term134880.getClass(), "type", 105);
        setField(term134696, term134696.getClass(), "first", term134880);
        setField(term134604, term134604.getClass(), "first", term134696);
        term136516 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term136516, term136516.getClass(), "compiler", null);
        setField(term136516, term136516.getClass(), "preprocessorSymbolTable", null);
        setField(term136516, term136516.getClass(), "transformationHandler", null);
        term136517 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term136518 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term136519 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term136520 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term136521 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term136517, term136517.getClass(), "number", 0.0);
        setIntField(term136517, term136517.getClass(), "type", 0);
        setField(term136517, term136517.getClass(), "next", null);
        setDoubleField(term136518, term136518.getClass(), "number", 0.0);
        setIntField(term136518, term136518.getClass(), "type", 0);
        setDoubleField(term136519, term136519.getClass(), "number", 0.0);
        setIntField(term136519, term136519.getClass(), "type", 0);
        setField(term136519, term136519.getClass(), "next", null);
        setField(term136519, term136519.getClass(), "first", null);
        setField(term136519, term136519.getClass(), "last", null);
        setField(term136519, term136519.getClass(), "propListHead", null);
        setIntField(term136519, term136519.getClass(), "sourcePosition", 0);
        setField(term136519, term136519.getClass(), "jsType", null);
        setField(term136519, term136519.getClass(), "parent", null);
        setField(term136518, term136518.getClass(), "next", term136519);
        setDoubleField(term136520, term136520.getClass(), "number", 0.0);
        setIntField(term136520, term136520.getClass(), "type", 105);
        setIntField(term136521, term136521.getClass(), "type", 0);
        setField(term136521, term136521.getClass(), "next", null);
        setField(term136521, term136521.getClass(), "first", null);
        setField(term136521, term136521.getClass(), "last", null);
        setField(term136521, term136521.getClass(), "propListHead", null);
        setIntField(term136521, term136521.getClass(), "sourcePosition", 0);
        setField(term136521, term136521.getClass(), "jsType", null);
        setField(term136521, term136521.getClass(), "parent", null);
        setField(term136520, term136520.getClass(), "next", term136521);
        setField(term136520, term136520.getClass(), "first", null);
        setField(term136520, term136520.getClass(), "last", null);
        setField(term136520, term136520.getClass(), "propListHead", null);
        setIntField(term136520, term136520.getClass(), "sourcePosition", 0);
        setField(term136520, term136520.getClass(), "jsType", null);
        setField(term136520, term136520.getClass(), "parent", null);
        setField(term136518, term136518.getClass(), "first", term136520);
        setField(term136518, term136518.getClass(), "last", null);
        setField(term136518, term136518.getClass(), "propListHead", null);
        setIntField(term136518, term136518.getClass(), "sourcePosition", 0);
        setField(term136518, term136518.getClass(), "jsType", null);
        setField(term136518, term136518.getClass(), "parent", null);
        setField(term136517, term136517.getClass(), "first", term136518);
        setField(term136517, term136517.getClass(), "last", null);
        setField(term136517, term136517.getClass(), "propListHead", null);
        setIntField(term136517, term136517.getClass(), "sourcePosition", 0);
        setField(term136517, term136517.getClass(), "jsType", null);
        setField(term136517, term136517.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term134604;
        callMethod(klass, "process", argTypes, term134512, args);
        assertTrue(recursiveEquals(term134512, term136516));
        assertTrue(recursiveEquals(term134604, null));
    }

};


