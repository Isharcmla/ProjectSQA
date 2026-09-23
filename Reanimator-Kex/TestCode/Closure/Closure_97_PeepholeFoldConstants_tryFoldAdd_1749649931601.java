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

public class PeepholeFoldConstants_tryFoldAdd_1749649931601 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157466;
     Object term157552;
     Object term157644;
     Object term157730;
     Object term158199;
     Object term158200;
     Object term158201;
     Object term158202;
     Object term158148;

    public PeepholeFoldConstants_tryFoldAdd_1749649931601() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157466 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term157552 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term157552, term157552.getClass(), "type", 21);
        term157644 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term157644, term157644.getClass(), "type", 21);
        term157730 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term158199 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term158199, term158199.getClass(), "currentTraversal", null);
        term158200 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term158200, term158200.getClass(), "functionName", null);
        setBooleanField(term158200, term158200.getClass(), "itsNeedsActivation", false);
        setIntField(term158200, term158200.getClass(), "itsFunctionType", 0);
        setBooleanField(term158200, term158200.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term158200, term158200.getClass(), "encodedSourceStart", 0);
        setIntField(term158200, term158200.getClass(), "encodedSourceEnd", 0);
        setField(term158200, term158200.getClass(), "sourceName", null);
        setIntField(term158200, term158200.getClass(), "baseLineno", 0);
        setIntField(term158200, term158200.getClass(), "endLineno", 0);
        setField(term158200, term158200.getClass(), "functions", null);
        setField(term158200, term158200.getClass(), "regexps", null);
        setField(term158200, term158200.getClass(), "itsVariables", null);
        setField(term158200, term158200.getClass(), "itsConst", null);
        setField(term158200, term158200.getClass(), "itsVariableNames", null);
        setIntField(term158200, term158200.getClass(), "varStart", 0);
        setField(term158200, term158200.getClass(), "compilerData", null);
        setIntField(term158200, term158200.getClass(), "type", 21);
        setField(term158200, term158200.getClass(), "next", null);
        setField(term158200, term158200.getClass(), "first", null);
        setField(term158200, term158200.getClass(), "last", null);
        setField(term158200, term158200.getClass(), "propListHead", null);
        setIntField(term158200, term158200.getClass(), "sourcePosition", 0);
        setField(term158200, term158200.getClass(), "jsType", null);
        setField(term158200, term158200.getClass(), "parent", null);
        term158201 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term158201, term158201.getClass(), "number", 0.0);
        setIntField(term158201, term158201.getClass(), "type", 21);
        setField(term158201, term158201.getClass(), "next", null);
        setField(term158201, term158201.getClass(), "first", null);
        setField(term158201, term158201.getClass(), "last", null);
        setField(term158201, term158201.getClass(), "propListHead", null);
        setIntField(term158201, term158201.getClass(), "sourcePosition", 0);
        setField(term158201, term158201.getClass(), "jsType", null);
        setField(term158201, term158201.getClass(), "parent", null);
        term158202 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term158202, term158202.getClass(), "functionName", null);
        setBooleanField(term158202, term158202.getClass(), "itsNeedsActivation", false);
        setIntField(term158202, term158202.getClass(), "itsFunctionType", 0);
        setBooleanField(term158202, term158202.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term158202, term158202.getClass(), "encodedSourceStart", 0);
        setIntField(term158202, term158202.getClass(), "encodedSourceEnd", 0);
        setField(term158202, term158202.getClass(), "sourceName", null);
        setIntField(term158202, term158202.getClass(), "baseLineno", 0);
        setIntField(term158202, term158202.getClass(), "endLineno", 0);
        setField(term158202, term158202.getClass(), "functions", null);
        setField(term158202, term158202.getClass(), "regexps", null);
        setField(term158202, term158202.getClass(), "itsVariables", null);
        setField(term158202, term158202.getClass(), "itsConst", null);
        setField(term158202, term158202.getClass(), "itsVariableNames", null);
        setIntField(term158202, term158202.getClass(), "varStart", 0);
        setField(term158202, term158202.getClass(), "compilerData", null);
        setIntField(term158202, term158202.getClass(), "type", 0);
        setField(term158202, term158202.getClass(), "next", null);
        setField(term158202, term158202.getClass(), "first", null);
        setField(term158202, term158202.getClass(), "last", null);
        setField(term158202, term158202.getClass(), "propListHead", null);
        setIntField(term158202, term158202.getClass(), "sourcePosition", 0);
        setField(term158202, term158202.getClass(), "jsType", null);
        setField(term158202, term158202.getClass(), "parent", null);
        term158148 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term158148, term158148.getClass(), "functionName", null);
        setBooleanField(term158148, term158148.getClass(), "itsNeedsActivation", false);
        setIntField(term158148, term158148.getClass(), "itsFunctionType", 0);
        setBooleanField(term158148, term158148.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term158148, term158148.getClass(), "encodedSourceStart", 0);
        setIntField(term158148, term158148.getClass(), "encodedSourceEnd", 0);
        setField(term158148, term158148.getClass(), "sourceName", null);
        setIntField(term158148, term158148.getClass(), "baseLineno", 0);
        setIntField(term158148, term158148.getClass(), "endLineno", 0);
        setField(term158148, term158148.getClass(), "functions", null);
        setField(term158148, term158148.getClass(), "regexps", null);
        setField(term158148, term158148.getClass(), "itsVariables", null);
        setField(term158148, term158148.getClass(), "itsConst", null);
        setField(term158148, term158148.getClass(), "itsVariableNames", null);
        setIntField(term158148, term158148.getClass(), "varStart", 0);
        setField(term158148, term158148.getClass(), "compilerData", null);
        setIntField(term158148, term158148.getClass(), "type", 21);
        setField(term158148, term158148.getClass(), "next", null);
        setField(term158148, term158148.getClass(), "first", null);
        setField(term158148, term158148.getClass(), "last", null);
        setField(term158148, term158148.getClass(), "propListHead", null);
        setIntField(term158148, term158148.getClass(), "sourcePosition", 0);
        setField(term158148, term158148.getClass(), "jsType", null);
        setField(term158148, term158148.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term157552;
        args[1] = term157644;
        args[2] = term157730;
        Object retValue = callMethod(klass, "tryFoldAdd", argTypes, term157466, args);
        assertTrue(recursiveEquals(term157466, term158199));
        assertTrue(recursiveEquals(term157552, term158200));
        assertTrue(recursiveEquals(term157644, term158201));
        assertTrue(recursiveEquals(term157730, term158202));
        assertTrue(recursiveEquals(retValue, term158148));
    }

};


