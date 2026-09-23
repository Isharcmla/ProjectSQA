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

public class PeepholeFoldConstants_tryFoldComparison_848443179297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58998;
     Object term59090;
     Object term59182;
     Object term59274;
     Object term60016;
     Object term60017;
     Object term60018;
     Object term60019;
     Object term59992;

    public PeepholeFoldConstants_tryFoldComparison_848443179297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58998 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term59090 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term59090, term59090.getClass(), "type", 14);
        term59182 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term59182, term59182.getClass(), "type", 42);
        term59274 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term59274, term59274.getClass(), "type", 42);
        term60016 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term60016, term60016.getClass(), "currentTraversal", null);
        term60017 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term60017, term60017.getClass(), "number", 0.0);
        setIntField(term60017, term60017.getClass(), "type", 42);
        setField(term60017, term60017.getClass(), "next", null);
        setField(term60017, term60017.getClass(), "first", null);
        setField(term60017, term60017.getClass(), "last", null);
        setField(term60017, term60017.getClass(), "propListHead", null);
        setIntField(term60017, term60017.getClass(), "sourcePosition", 0);
        setField(term60017, term60017.getClass(), "jsType", null);
        setField(term60017, term60017.getClass(), "parent", null);
        term60018 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term60018, term60018.getClass(), "number", 0.0);
        setIntField(term60018, term60018.getClass(), "type", 14);
        setField(term60018, term60018.getClass(), "next", null);
        setField(term60018, term60018.getClass(), "first", null);
        setField(term60018, term60018.getClass(), "last", null);
        setField(term60018, term60018.getClass(), "propListHead", null);
        setIntField(term60018, term60018.getClass(), "sourcePosition", 0);
        setField(term60018, term60018.getClass(), "jsType", null);
        setField(term60018, term60018.getClass(), "parent", null);
        term60019 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term60019, term60019.getClass(), "number", 0.0);
        setIntField(term60019, term60019.getClass(), "type", 42);
        setField(term60019, term60019.getClass(), "next", null);
        setField(term60019, term60019.getClass(), "first", null);
        setField(term60019, term60019.getClass(), "last", null);
        setField(term60019, term60019.getClass(), "propListHead", null);
        setIntField(term60019, term60019.getClass(), "sourcePosition", 0);
        setField(term60019, term60019.getClass(), "jsType", null);
        setField(term60019, term60019.getClass(), "parent", null);
        term59992 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term59992, term59992.getClass(), "number", 0.0);
        setIntField(term59992, term59992.getClass(), "type", 14);
        setField(term59992, term59992.getClass(), "next", null);
        setField(term59992, term59992.getClass(), "first", null);
        setField(term59992, term59992.getClass(), "last", null);
        setField(term59992, term59992.getClass(), "propListHead", null);
        setIntField(term59992, term59992.getClass(), "sourcePosition", 0);
        setField(term59992, term59992.getClass(), "jsType", null);
        setField(term59992, term59992.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term59090;
        args[1] = term59182;
        args[2] = term59274;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term58998, args);
        assertTrue(recursiveEquals(term58998, term60016));
        assertTrue(recursiveEquals(term59090, term60017));
        assertTrue(recursiveEquals(term59182, term60018));
        assertTrue(recursiveEquals(term59274, term60019));
        assertTrue(recursiveEquals(retValue, term59992));
    }

};


