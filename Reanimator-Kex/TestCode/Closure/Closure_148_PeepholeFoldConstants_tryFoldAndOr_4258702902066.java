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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902066 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term557426;
     Object term557518;
     Object term557604;
     Object term557644;
     Object term557645;
     Object term557646;
     Object term557605;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902066() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term557426 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term557518 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term557518, term557518.getClass(), "parent", null);
        setIntField(term557518, term557518.getClass(), "type", 44);
        term557604 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term557604, term557604.getClass(), "type", 44);
        term557644 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term557644, term557644.getClass(), "currentTraversal", null);
        term557645 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term557645, term557645.getClass(), "str", null);
        setIntField(term557645, term557645.getClass(), "type", 44);
        setField(term557645, term557645.getClass(), "next", null);
        setField(term557645, term557645.getClass(), "first", null);
        setField(term557645, term557645.getClass(), "last", null);
        setField(term557645, term557645.getClass(), "propListHead", null);
        setIntField(term557645, term557645.getClass(), "sourcePosition", 0);
        setField(term557645, term557645.getClass(), "jsType", null);
        setField(term557645, term557645.getClass(), "parent", null);
        term557646 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term557646, term557646.getClass(), "functionName", null);
        setBooleanField(term557646, term557646.getClass(), "itsNeedsActivation", false);
        setIntField(term557646, term557646.getClass(), "itsFunctionType", 0);
        setBooleanField(term557646, term557646.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term557646, term557646.getClass(), "encodedSourceStart", 0);
        setIntField(term557646, term557646.getClass(), "encodedSourceEnd", 0);
        setField(term557646, term557646.getClass(), "sourceName", null);
        setIntField(term557646, term557646.getClass(), "baseLineno", 0);
        setIntField(term557646, term557646.getClass(), "endLineno", 0);
        setField(term557646, term557646.getClass(), "functions", null);
        setField(term557646, term557646.getClass(), "regexps", null);
        setField(term557646, term557646.getClass(), "itsVariables", null);
        setField(term557646, term557646.getClass(), "itsConst", null);
        setField(term557646, term557646.getClass(), "itsVariableNames", null);
        setIntField(term557646, term557646.getClass(), "varStart", 0);
        setField(term557646, term557646.getClass(), "compilerData", null);
        setIntField(term557646, term557646.getClass(), "type", 44);
        setField(term557646, term557646.getClass(), "next", null);
        setField(term557646, term557646.getClass(), "first", null);
        setField(term557646, term557646.getClass(), "last", null);
        setField(term557646, term557646.getClass(), "propListHead", null);
        setIntField(term557646, term557646.getClass(), "sourcePosition", 0);
        setField(term557646, term557646.getClass(), "jsType", null);
        setField(term557646, term557646.getClass(), "parent", null);
        term557605 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term557605, term557605.getClass(), "str", null);
        setIntField(term557605, term557605.getClass(), "type", 44);
        setField(term557605, term557605.getClass(), "next", null);
        setField(term557605, term557605.getClass(), "first", null);
        setField(term557605, term557605.getClass(), "last", null);
        setField(term557605, term557605.getClass(), "propListHead", null);
        setIntField(term557605, term557605.getClass(), "sourcePosition", 0);
        setField(term557605, term557605.getClass(), "jsType", null);
        setField(term557605, term557605.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term557518;
        args[1] = term557604;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term557426, args);
        assertTrue(recursiveEquals(term557426, term557644));
        assertTrue(recursiveEquals(term557518, term557645));
        assertTrue(recursiveEquals(term557604, term557646));
        assertTrue(recursiveEquals(retValue, term557605));
    }

};


