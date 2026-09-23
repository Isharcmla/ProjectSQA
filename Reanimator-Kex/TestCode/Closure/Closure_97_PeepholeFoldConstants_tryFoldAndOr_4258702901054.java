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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901054 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term328250;
     Object term328342;
     Object term328428;
     Object term328520;
     Object term328574;
     Object term328575;
     Object term328576;
     Object term328577;
     Object term328527;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901054() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term328250 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term328342 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term328342, term328342.getClass(), "parent", null);
        setIntField(term328342, term328342.getClass(), "type", 0);
        term328428 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term328428, term328428.getClass(), "type", 0);
        term328520 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term328574 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term328574, term328574.getClass(), "currentTraversal", null);
        term328575 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term328575, term328575.getClass(), "str", null);
        setIntField(term328575, term328575.getClass(), "type", 0);
        setField(term328575, term328575.getClass(), "next", null);
        setField(term328575, term328575.getClass(), "first", null);
        setField(term328575, term328575.getClass(), "last", null);
        setField(term328575, term328575.getClass(), "propListHead", null);
        setIntField(term328575, term328575.getClass(), "sourcePosition", 0);
        setField(term328575, term328575.getClass(), "jsType", null);
        setField(term328575, term328575.getClass(), "parent", null);
        term328576 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term328576, term328576.getClass(), "functionName", null);
        setBooleanField(term328576, term328576.getClass(), "itsNeedsActivation", false);
        setIntField(term328576, term328576.getClass(), "itsFunctionType", 0);
        setBooleanField(term328576, term328576.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term328576, term328576.getClass(), "encodedSourceStart", 0);
        setIntField(term328576, term328576.getClass(), "encodedSourceEnd", 0);
        setField(term328576, term328576.getClass(), "sourceName", null);
        setIntField(term328576, term328576.getClass(), "baseLineno", 0);
        setIntField(term328576, term328576.getClass(), "endLineno", 0);
        setField(term328576, term328576.getClass(), "functions", null);
        setField(term328576, term328576.getClass(), "regexps", null);
        setField(term328576, term328576.getClass(), "itsVariables", null);
        setField(term328576, term328576.getClass(), "itsConst", null);
        setField(term328576, term328576.getClass(), "itsVariableNames", null);
        setIntField(term328576, term328576.getClass(), "varStart", 0);
        setField(term328576, term328576.getClass(), "compilerData", null);
        setIntField(term328576, term328576.getClass(), "type", 0);
        setField(term328576, term328576.getClass(), "next", null);
        setField(term328576, term328576.getClass(), "first", null);
        setField(term328576, term328576.getClass(), "last", null);
        setField(term328576, term328576.getClass(), "propListHead", null);
        setIntField(term328576, term328576.getClass(), "sourcePosition", 0);
        setField(term328576, term328576.getClass(), "jsType", null);
        setField(term328576, term328576.getClass(), "parent", null);
        term328577 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term328577, term328577.getClass(), "number", 0.0);
        setIntField(term328577, term328577.getClass(), "type", 0);
        setField(term328577, term328577.getClass(), "next", null);
        setField(term328577, term328577.getClass(), "first", null);
        setField(term328577, term328577.getClass(), "last", null);
        setField(term328577, term328577.getClass(), "propListHead", null);
        setIntField(term328577, term328577.getClass(), "sourcePosition", 0);
        setField(term328577, term328577.getClass(), "jsType", null);
        setField(term328577, term328577.getClass(), "parent", null);
        term328527 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term328527, term328527.getClass(), "str", null);
        setIntField(term328527, term328527.getClass(), "type", 0);
        setField(term328527, term328527.getClass(), "next", null);
        setField(term328527, term328527.getClass(), "first", null);
        setField(term328527, term328527.getClass(), "last", null);
        setField(term328527, term328527.getClass(), "propListHead", null);
        setIntField(term328527, term328527.getClass(), "sourcePosition", 0);
        setField(term328527, term328527.getClass(), "jsType", null);
        setField(term328527, term328527.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term328342;
        args[1] = term328428;
        args[2] = term328520;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term328250, args);
        assertTrue(recursiveEquals(term328250, term328574));
        assertTrue(recursiveEquals(term328342, term328575));
        assertTrue(recursiveEquals(term328428, term328576));
        assertTrue(recursiveEquals(term328520, term328577));
        assertTrue(recursiveEquals(retValue, term328527));
    }

};


