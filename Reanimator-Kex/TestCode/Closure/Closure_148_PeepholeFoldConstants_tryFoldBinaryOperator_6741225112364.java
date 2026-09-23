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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term655857;
     Object term655949;
     Object term656175;
     Object term656176;
     Object term656126;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term655857 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term655949 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term656035 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term656105 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term656035, term656035.getClass(), "next", term656105);
        setField(term655949, term655949.getClass(), "first", term656035);
        setIntField(term655949, term655949.getClass(), "type", 11);
        term656175 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term656175, term656175.getClass(), "currentTraversal", null);
        term656176 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term656177 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term656178 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term656176, term656176.getClass(), "number", 0.0);
        setIntField(term656176, term656176.getClass(), "type", 11);
        setField(term656176, term656176.getClass(), "next", null);
        setField(term656177, term656177.getClass(), "functionName", null);
        setBooleanField(term656177, term656177.getClass(), "itsNeedsActivation", false);
        setIntField(term656177, term656177.getClass(), "itsFunctionType", 0);
        setBooleanField(term656177, term656177.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term656177, term656177.getClass(), "encodedSourceStart", 0);
        setIntField(term656177, term656177.getClass(), "encodedSourceEnd", 0);
        setField(term656177, term656177.getClass(), "sourceName", null);
        setIntField(term656177, term656177.getClass(), "baseLineno", 0);
        setIntField(term656177, term656177.getClass(), "endLineno", 0);
        setField(term656177, term656177.getClass(), "functions", null);
        setField(term656177, term656177.getClass(), "regexps", null);
        setField(term656177, term656177.getClass(), "itsVariables", null);
        setField(term656177, term656177.getClass(), "itsConst", null);
        setField(term656177, term656177.getClass(), "itsVariableNames", null);
        setIntField(term656177, term656177.getClass(), "varStart", 0);
        setField(term656177, term656177.getClass(), "compilerData", null);
        setIntField(term656177, term656177.getClass(), "type", 0);
        setIntField(term656178, term656178.getClass(), "type", 0);
        setField(term656178, term656178.getClass(), "next", null);
        setField(term656178, term656178.getClass(), "first", null);
        setField(term656178, term656178.getClass(), "last", null);
        setField(term656178, term656178.getClass(), "propListHead", null);
        setIntField(term656178, term656178.getClass(), "sourcePosition", 0);
        setField(term656178, term656178.getClass(), "jsType", null);
        setField(term656178, term656178.getClass(), "parent", null);
        setField(term656177, term656177.getClass(), "next", term656178);
        setField(term656177, term656177.getClass(), "first", null);
        setField(term656177, term656177.getClass(), "last", null);
        setField(term656177, term656177.getClass(), "propListHead", null);
        setIntField(term656177, term656177.getClass(), "sourcePosition", 0);
        setField(term656177, term656177.getClass(), "jsType", null);
        setField(term656177, term656177.getClass(), "parent", null);
        setField(term656176, term656176.getClass(), "first", term656177);
        setField(term656176, term656176.getClass(), "last", null);
        setField(term656176, term656176.getClass(), "propListHead", null);
        setIntField(term656176, term656176.getClass(), "sourcePosition", 0);
        setField(term656176, term656176.getClass(), "jsType", null);
        setField(term656176, term656176.getClass(), "parent", null);
        term656126 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term656129 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term656139 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term656126, term656126.getClass(), "number", 0.0);
        setIntField(term656126, term656126.getClass(), "type", 11);
        setField(term656126, term656126.getClass(), "next", null);
        setField(term656129, term656129.getClass(), "functionName", null);
        setBooleanField(term656129, term656129.getClass(), "itsNeedsActivation", false);
        setIntField(term656129, term656129.getClass(), "itsFunctionType", 0);
        setBooleanField(term656129, term656129.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term656129, term656129.getClass(), "encodedSourceStart", 0);
        setIntField(term656129, term656129.getClass(), "encodedSourceEnd", 0);
        setField(term656129, term656129.getClass(), "sourceName", null);
        setIntField(term656129, term656129.getClass(), "baseLineno", 0);
        setIntField(term656129, term656129.getClass(), "endLineno", 0);
        setField(term656129, term656129.getClass(), "functions", null);
        setField(term656129, term656129.getClass(), "regexps", null);
        setField(term656129, term656129.getClass(), "itsVariables", null);
        setField(term656129, term656129.getClass(), "itsConst", null);
        setField(term656129, term656129.getClass(), "itsVariableNames", null);
        setIntField(term656129, term656129.getClass(), "varStart", 0);
        setField(term656129, term656129.getClass(), "compilerData", null);
        setIntField(term656129, term656129.getClass(), "type", 0);
        setIntField(term656139, term656139.getClass(), "type", 0);
        setField(term656139, term656139.getClass(), "next", null);
        setField(term656139, term656139.getClass(), "first", null);
        setField(term656139, term656139.getClass(), "last", null);
        setField(term656139, term656139.getClass(), "propListHead", null);
        setIntField(term656139, term656139.getClass(), "sourcePosition", 0);
        setField(term656139, term656139.getClass(), "jsType", null);
        setField(term656139, term656139.getClass(), "parent", null);
        setField(term656129, term656129.getClass(), "next", term656139);
        setField(term656129, term656129.getClass(), "first", null);
        setField(term656129, term656129.getClass(), "last", null);
        setField(term656129, term656129.getClass(), "propListHead", null);
        setIntField(term656129, term656129.getClass(), "sourcePosition", 0);
        setField(term656129, term656129.getClass(), "jsType", null);
        setField(term656129, term656129.getClass(), "parent", null);
        setField(term656126, term656126.getClass(), "first", term656129);
        setField(term656126, term656126.getClass(), "last", null);
        setField(term656126, term656126.getClass(), "propListHead", null);
        setIntField(term656126, term656126.getClass(), "sourcePosition", 0);
        setField(term656126, term656126.getClass(), "jsType", null);
        setField(term656126, term656126.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term655949;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term655857, args);
        assertTrue(recursiveEquals(term655857, term656175));
        assertTrue(recursiveEquals(term655949, term656176));
        assertTrue(recursiveEquals(retValue, term656126));
    }

};


