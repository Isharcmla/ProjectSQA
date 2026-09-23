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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111671 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term664972;
     Object term665064;
     Object term665738;
     Object term665739;
     Object term665686;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111671() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term664972 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term665064 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term665150 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term665220 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term665150, term665150.getClass(), "next", term665220);
        setField(term665064, term665064.getClass(), "first", term665150);
        setIntField(term665064, term665064.getClass(), "type", 46);
        term665738 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term665738, term665738.getClass(), "currentTraversal", null);
        term665739 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term665740 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term665741 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term665739, term665739.getClass(), "number", 0.0);
        setIntField(term665739, term665739.getClass(), "type", 46);
        setField(term665739, term665739.getClass(), "next", null);
        setField(term665740, term665740.getClass(), "functionName", null);
        setBooleanField(term665740, term665740.getClass(), "itsNeedsActivation", false);
        setIntField(term665740, term665740.getClass(), "itsFunctionType", 0);
        setBooleanField(term665740, term665740.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term665740, term665740.getClass(), "encodedSourceStart", 0);
        setIntField(term665740, term665740.getClass(), "encodedSourceEnd", 0);
        setField(term665740, term665740.getClass(), "sourceName", null);
        setIntField(term665740, term665740.getClass(), "baseLineno", 0);
        setIntField(term665740, term665740.getClass(), "endLineno", 0);
        setField(term665740, term665740.getClass(), "functions", null);
        setField(term665740, term665740.getClass(), "regexps", null);
        setField(term665740, term665740.getClass(), "itsVariables", null);
        setField(term665740, term665740.getClass(), "itsConst", null);
        setField(term665740, term665740.getClass(), "itsVariableNames", null);
        setIntField(term665740, term665740.getClass(), "varStart", 0);
        setField(term665740, term665740.getClass(), "compilerData", null);
        setIntField(term665740, term665740.getClass(), "type", 0);
        setIntField(term665741, term665741.getClass(), "type", 0);
        setField(term665741, term665741.getClass(), "next", null);
        setField(term665741, term665741.getClass(), "first", null);
        setField(term665741, term665741.getClass(), "last", null);
        setField(term665741, term665741.getClass(), "propListHead", null);
        setIntField(term665741, term665741.getClass(), "sourcePosition", 0);
        setField(term665741, term665741.getClass(), "jsType", null);
        setField(term665741, term665741.getClass(), "parent", null);
        setField(term665740, term665740.getClass(), "next", term665741);
        setField(term665740, term665740.getClass(), "first", null);
        setField(term665740, term665740.getClass(), "last", null);
        setField(term665740, term665740.getClass(), "propListHead", null);
        setIntField(term665740, term665740.getClass(), "sourcePosition", 0);
        setField(term665740, term665740.getClass(), "jsType", null);
        setField(term665740, term665740.getClass(), "parent", null);
        setField(term665739, term665739.getClass(), "first", term665740);
        setField(term665739, term665739.getClass(), "last", null);
        setField(term665739, term665739.getClass(), "propListHead", null);
        setIntField(term665739, term665739.getClass(), "sourcePosition", 0);
        setField(term665739, term665739.getClass(), "jsType", null);
        setField(term665739, term665739.getClass(), "parent", null);
        term665686 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term665689 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term665699 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term665686, term665686.getClass(), "number", 0.0);
        setIntField(term665686, term665686.getClass(), "type", 46);
        setField(term665686, term665686.getClass(), "next", null);
        setField(term665689, term665689.getClass(), "functionName", null);
        setBooleanField(term665689, term665689.getClass(), "itsNeedsActivation", false);
        setIntField(term665689, term665689.getClass(), "itsFunctionType", 0);
        setBooleanField(term665689, term665689.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term665689, term665689.getClass(), "encodedSourceStart", 0);
        setIntField(term665689, term665689.getClass(), "encodedSourceEnd", 0);
        setField(term665689, term665689.getClass(), "sourceName", null);
        setIntField(term665689, term665689.getClass(), "baseLineno", 0);
        setIntField(term665689, term665689.getClass(), "endLineno", 0);
        setField(term665689, term665689.getClass(), "functions", null);
        setField(term665689, term665689.getClass(), "regexps", null);
        setField(term665689, term665689.getClass(), "itsVariables", null);
        setField(term665689, term665689.getClass(), "itsConst", null);
        setField(term665689, term665689.getClass(), "itsVariableNames", null);
        setIntField(term665689, term665689.getClass(), "varStart", 0);
        setField(term665689, term665689.getClass(), "compilerData", null);
        setIntField(term665689, term665689.getClass(), "type", 0);
        setIntField(term665699, term665699.getClass(), "type", 0);
        setField(term665699, term665699.getClass(), "next", null);
        setField(term665699, term665699.getClass(), "first", null);
        setField(term665699, term665699.getClass(), "last", null);
        setField(term665699, term665699.getClass(), "propListHead", null);
        setIntField(term665699, term665699.getClass(), "sourcePosition", 0);
        setField(term665699, term665699.getClass(), "jsType", null);
        setField(term665699, term665699.getClass(), "parent", null);
        setField(term665689, term665689.getClass(), "next", term665699);
        setField(term665689, term665689.getClass(), "first", null);
        setField(term665689, term665689.getClass(), "last", null);
        setField(term665689, term665689.getClass(), "propListHead", null);
        setIntField(term665689, term665689.getClass(), "sourcePosition", 0);
        setField(term665689, term665689.getClass(), "jsType", null);
        setField(term665689, term665689.getClass(), "parent", null);
        setField(term665686, term665686.getClass(), "first", term665689);
        setField(term665686, term665686.getClass(), "last", null);
        setField(term665686, term665686.getClass(), "propListHead", null);
        setIntField(term665686, term665686.getClass(), "sourcePosition", 0);
        setField(term665686, term665686.getClass(), "jsType", null);
        setField(term665686, term665686.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term665064;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term664972, args);
        assertTrue(recursiveEquals(term664972, term665738));
        assertTrue(recursiveEquals(term665064, term665739));
        assertTrue(recursiveEquals(retValue, term665686));
    }

};


