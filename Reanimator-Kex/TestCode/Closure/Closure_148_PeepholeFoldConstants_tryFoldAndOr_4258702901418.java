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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term349549;
     Object term349635;
     Object term349727;
     Object term350069;
     Object term350070;
     Object term350071;
     Object term350029;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term349549 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term349635 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term349635, term349635.getClass(), "parent", null);
        setIntField(term349635, term349635.getClass(), "type", 64);
        term349727 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term349727, term349727.getClass(), "type", 64);
        term350069 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term350069, term350069.getClass(), "currentTraversal", null);
        term350070 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term350070, term350070.getClass(), "functionName", null);
        setBooleanField(term350070, term350070.getClass(), "itsNeedsActivation", false);
        setIntField(term350070, term350070.getClass(), "itsFunctionType", 0);
        setBooleanField(term350070, term350070.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term350070, term350070.getClass(), "encodedSourceStart", 0);
        setIntField(term350070, term350070.getClass(), "encodedSourceEnd", 0);
        setField(term350070, term350070.getClass(), "sourceName", null);
        setIntField(term350070, term350070.getClass(), "baseLineno", 0);
        setIntField(term350070, term350070.getClass(), "endLineno", 0);
        setField(term350070, term350070.getClass(), "functions", null);
        setField(term350070, term350070.getClass(), "regexps", null);
        setField(term350070, term350070.getClass(), "itsVariables", null);
        setField(term350070, term350070.getClass(), "itsConst", null);
        setField(term350070, term350070.getClass(), "itsVariableNames", null);
        setIntField(term350070, term350070.getClass(), "varStart", 0);
        setField(term350070, term350070.getClass(), "compilerData", null);
        setIntField(term350070, term350070.getClass(), "type", 64);
        setField(term350070, term350070.getClass(), "next", null);
        setField(term350070, term350070.getClass(), "first", null);
        setField(term350070, term350070.getClass(), "last", null);
        setField(term350070, term350070.getClass(), "propListHead", null);
        setIntField(term350070, term350070.getClass(), "sourcePosition", 0);
        setField(term350070, term350070.getClass(), "jsType", null);
        setField(term350070, term350070.getClass(), "parent", null);
        term350071 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term350071, term350071.getClass(), "number", 0.0);
        setIntField(term350071, term350071.getClass(), "type", 64);
        setField(term350071, term350071.getClass(), "next", null);
        setField(term350071, term350071.getClass(), "first", null);
        setField(term350071, term350071.getClass(), "last", null);
        setField(term350071, term350071.getClass(), "propListHead", null);
        setIntField(term350071, term350071.getClass(), "sourcePosition", 0);
        setField(term350071, term350071.getClass(), "jsType", null);
        setField(term350071, term350071.getClass(), "parent", null);
        term350029 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term350029, term350029.getClass(), "functionName", null);
        setBooleanField(term350029, term350029.getClass(), "itsNeedsActivation", false);
        setIntField(term350029, term350029.getClass(), "itsFunctionType", 0);
        setBooleanField(term350029, term350029.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term350029, term350029.getClass(), "encodedSourceStart", 0);
        setIntField(term350029, term350029.getClass(), "encodedSourceEnd", 0);
        setField(term350029, term350029.getClass(), "sourceName", null);
        setIntField(term350029, term350029.getClass(), "baseLineno", 0);
        setIntField(term350029, term350029.getClass(), "endLineno", 0);
        setField(term350029, term350029.getClass(), "functions", null);
        setField(term350029, term350029.getClass(), "regexps", null);
        setField(term350029, term350029.getClass(), "itsVariables", null);
        setField(term350029, term350029.getClass(), "itsConst", null);
        setField(term350029, term350029.getClass(), "itsVariableNames", null);
        setIntField(term350029, term350029.getClass(), "varStart", 0);
        setField(term350029, term350029.getClass(), "compilerData", null);
        setIntField(term350029, term350029.getClass(), "type", 64);
        setField(term350029, term350029.getClass(), "next", null);
        setField(term350029, term350029.getClass(), "first", null);
        setField(term350029, term350029.getClass(), "last", null);
        setField(term350029, term350029.getClass(), "propListHead", null);
        setIntField(term350029, term350029.getClass(), "sourcePosition", 0);
        setField(term350029, term350029.getClass(), "jsType", null);
        setField(term350029, term350029.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term349635;
        args[1] = term349727;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term349549, args);
        assertTrue(recursiveEquals(term349549, term350069));
        assertTrue(recursiveEquals(term349635, term350070));
        assertTrue(recursiveEquals(term349727, term350071));
        assertTrue(recursiveEquals(retValue, term350029));
    }

};


