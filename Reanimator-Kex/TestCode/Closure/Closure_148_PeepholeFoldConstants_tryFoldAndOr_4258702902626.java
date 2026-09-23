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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term748122;
     Object term748214;
     Object term748392;
     Object term748484;
     Object term748674;
     Object term748675;
     Object term748677;
     Object term748678;
     Object term748615;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term748122 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term748214 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term748306 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term748214, term748214.getClass(), "parent", term748306);
        setIntField(term748214, term748214.getClass(), "type", 0);
        term748392 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term748392, term748392.getClass(), "type", 0);
        term748484 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term748484, term748484.getClass(), "type", 64);
        term748674 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term748674, term748674.getClass(), "currentTraversal", null);
        term748675 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term748676 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term748675, term748675.getClass(), "number", 0.0);
        setIntField(term748675, term748675.getClass(), "type", 0);
        setField(term748675, term748675.getClass(), "next", null);
        setField(term748675, term748675.getClass(), "first", null);
        setField(term748675, term748675.getClass(), "last", null);
        setField(term748675, term748675.getClass(), "propListHead", null);
        setIntField(term748675, term748675.getClass(), "sourcePosition", 0);
        setField(term748675, term748675.getClass(), "jsType", null);
        setDoubleField(term748676, term748676.getClass(), "number", 0.0);
        setIntField(term748676, term748676.getClass(), "type", 0);
        setField(term748676, term748676.getClass(), "next", null);
        setField(term748676, term748676.getClass(), "first", null);
        setField(term748676, term748676.getClass(), "last", null);
        setField(term748676, term748676.getClass(), "propListHead", null);
        setIntField(term748676, term748676.getClass(), "sourcePosition", 0);
        setField(term748676, term748676.getClass(), "jsType", null);
        setField(term748676, term748676.getClass(), "parent", null);
        setField(term748675, term748675.getClass(), "parent", term748676);
        term748677 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term748677, term748677.getClass(), "functionName", null);
        setBooleanField(term748677, term748677.getClass(), "itsNeedsActivation", false);
        setIntField(term748677, term748677.getClass(), "itsFunctionType", 0);
        setBooleanField(term748677, term748677.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term748677, term748677.getClass(), "encodedSourceStart", 0);
        setIntField(term748677, term748677.getClass(), "encodedSourceEnd", 0);
        setField(term748677, term748677.getClass(), "sourceName", null);
        setIntField(term748677, term748677.getClass(), "baseLineno", 0);
        setIntField(term748677, term748677.getClass(), "endLineno", 0);
        setField(term748677, term748677.getClass(), "functions", null);
        setField(term748677, term748677.getClass(), "regexps", null);
        setField(term748677, term748677.getClass(), "itsVariables", null);
        setField(term748677, term748677.getClass(), "itsConst", null);
        setField(term748677, term748677.getClass(), "itsVariableNames", null);
        setIntField(term748677, term748677.getClass(), "varStart", 0);
        setField(term748677, term748677.getClass(), "compilerData", null);
        setIntField(term748677, term748677.getClass(), "type", 0);
        setField(term748677, term748677.getClass(), "next", null);
        setField(term748677, term748677.getClass(), "first", null);
        setField(term748677, term748677.getClass(), "last", null);
        setField(term748677, term748677.getClass(), "propListHead", null);
        setIntField(term748677, term748677.getClass(), "sourcePosition", 0);
        setField(term748677, term748677.getClass(), "jsType", null);
        setField(term748677, term748677.getClass(), "parent", null);
        term748678 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term748678, term748678.getClass(), "number", 0.0);
        setIntField(term748678, term748678.getClass(), "type", 64);
        setField(term748678, term748678.getClass(), "next", null);
        setField(term748678, term748678.getClass(), "first", null);
        setField(term748678, term748678.getClass(), "last", null);
        setField(term748678, term748678.getClass(), "propListHead", null);
        setIntField(term748678, term748678.getClass(), "sourcePosition", 0);
        setField(term748678, term748678.getClass(), "jsType", null);
        setField(term748678, term748678.getClass(), "parent", null);
        term748615 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term748619 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term748615, term748615.getClass(), "number", 0.0);
        setIntField(term748615, term748615.getClass(), "type", 0);
        setField(term748615, term748615.getClass(), "next", null);
        setField(term748615, term748615.getClass(), "first", null);
        setField(term748615, term748615.getClass(), "last", null);
        setField(term748615, term748615.getClass(), "propListHead", null);
        setIntField(term748615, term748615.getClass(), "sourcePosition", 0);
        setField(term748615, term748615.getClass(), "jsType", null);
        setDoubleField(term748619, term748619.getClass(), "number", 0.0);
        setIntField(term748619, term748619.getClass(), "type", 0);
        setField(term748619, term748619.getClass(), "next", null);
        setField(term748619, term748619.getClass(), "first", null);
        setField(term748619, term748619.getClass(), "last", null);
        setField(term748619, term748619.getClass(), "propListHead", null);
        setIntField(term748619, term748619.getClass(), "sourcePosition", 0);
        setField(term748619, term748619.getClass(), "jsType", null);
        setField(term748619, term748619.getClass(), "parent", null);
        setField(term748615, term748615.getClass(), "parent", term748619);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term748214;
        args[1] = term748392;
        args[2] = term748484;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term748122, args);
        assertTrue(recursiveEquals(term748122, term748674));
        assertTrue(recursiveEquals(term748214, term748675));
        assertTrue(recursiveEquals(term748392, term748677));
        assertTrue(recursiveEquals(term748484, term748678));
        assertTrue(recursiveEquals(retValue, term748615));
    }

};


