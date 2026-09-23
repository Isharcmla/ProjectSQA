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

public class PeepholeFoldConstants_tryFoldComparison_8484431791466 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term546987;
     Object term547073;
     Object term547159;
     Object term547251;
     Object term547298;
     Object term547299;
     Object term547300;
     Object term547301;
     Object term547269;

    public PeepholeFoldConstants_tryFoldComparison_8484431791466() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term546987 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term547073 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term547073, term547073.getClass(), "type", 16);
        term547159 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term547159, term547159.getClass(), "type", 42);
        term547251 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term547251, term547251.getClass(), "type", 42);
        term547298 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term547298, term547298.getClass(), "currentTraversal", null);
        term547299 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term547299, term547299.getClass(), "functionName", null);
        setBooleanField(term547299, term547299.getClass(), "itsNeedsActivation", false);
        setIntField(term547299, term547299.getClass(), "itsFunctionType", 0);
        setBooleanField(term547299, term547299.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term547299, term547299.getClass(), "encodedSourceStart", 0);
        setIntField(term547299, term547299.getClass(), "encodedSourceEnd", 0);
        setField(term547299, term547299.getClass(), "sourceName", null);
        setIntField(term547299, term547299.getClass(), "baseLineno", 0);
        setIntField(term547299, term547299.getClass(), "endLineno", 0);
        setField(term547299, term547299.getClass(), "functions", null);
        setField(term547299, term547299.getClass(), "regexps", null);
        setField(term547299, term547299.getClass(), "itsVariables", null);
        setField(term547299, term547299.getClass(), "itsConst", null);
        setField(term547299, term547299.getClass(), "itsVariableNames", null);
        setIntField(term547299, term547299.getClass(), "varStart", 0);
        setField(term547299, term547299.getClass(), "compilerData", null);
        setIntField(term547299, term547299.getClass(), "type", 42);
        setField(term547299, term547299.getClass(), "next", null);
        setField(term547299, term547299.getClass(), "first", null);
        setField(term547299, term547299.getClass(), "last", null);
        setField(term547299, term547299.getClass(), "propListHead", null);
        setIntField(term547299, term547299.getClass(), "sourcePosition", 0);
        setField(term547299, term547299.getClass(), "jsType", null);
        setField(term547299, term547299.getClass(), "parent", null);
        term547300 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term547300, term547300.getClass(), "functionName", null);
        setBooleanField(term547300, term547300.getClass(), "itsNeedsActivation", false);
        setIntField(term547300, term547300.getClass(), "itsFunctionType", 0);
        setBooleanField(term547300, term547300.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term547300, term547300.getClass(), "encodedSourceStart", 0);
        setIntField(term547300, term547300.getClass(), "encodedSourceEnd", 0);
        setField(term547300, term547300.getClass(), "sourceName", null);
        setIntField(term547300, term547300.getClass(), "baseLineno", 0);
        setIntField(term547300, term547300.getClass(), "endLineno", 0);
        setField(term547300, term547300.getClass(), "functions", null);
        setField(term547300, term547300.getClass(), "regexps", null);
        setField(term547300, term547300.getClass(), "itsVariables", null);
        setField(term547300, term547300.getClass(), "itsConst", null);
        setField(term547300, term547300.getClass(), "itsVariableNames", null);
        setIntField(term547300, term547300.getClass(), "varStart", 0);
        setField(term547300, term547300.getClass(), "compilerData", null);
        setIntField(term547300, term547300.getClass(), "type", 16);
        setField(term547300, term547300.getClass(), "next", null);
        setField(term547300, term547300.getClass(), "first", null);
        setField(term547300, term547300.getClass(), "last", null);
        setField(term547300, term547300.getClass(), "propListHead", null);
        setIntField(term547300, term547300.getClass(), "sourcePosition", 0);
        setField(term547300, term547300.getClass(), "jsType", null);
        setField(term547300, term547300.getClass(), "parent", null);
        term547301 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term547301, term547301.getClass(), "number", 0.0);
        setIntField(term547301, term547301.getClass(), "type", 42);
        setField(term547301, term547301.getClass(), "next", null);
        setField(term547301, term547301.getClass(), "first", null);
        setField(term547301, term547301.getClass(), "last", null);
        setField(term547301, term547301.getClass(), "propListHead", null);
        setIntField(term547301, term547301.getClass(), "sourcePosition", 0);
        setField(term547301, term547301.getClass(), "jsType", null);
        setField(term547301, term547301.getClass(), "parent", null);
        term547269 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term547269, term547269.getClass(), "functionName", null);
        setBooleanField(term547269, term547269.getClass(), "itsNeedsActivation", false);
        setIntField(term547269, term547269.getClass(), "itsFunctionType", 0);
        setBooleanField(term547269, term547269.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term547269, term547269.getClass(), "encodedSourceStart", 0);
        setIntField(term547269, term547269.getClass(), "encodedSourceEnd", 0);
        setField(term547269, term547269.getClass(), "sourceName", null);
        setIntField(term547269, term547269.getClass(), "baseLineno", 0);
        setIntField(term547269, term547269.getClass(), "endLineno", 0);
        setField(term547269, term547269.getClass(), "functions", null);
        setField(term547269, term547269.getClass(), "regexps", null);
        setField(term547269, term547269.getClass(), "itsVariables", null);
        setField(term547269, term547269.getClass(), "itsConst", null);
        setField(term547269, term547269.getClass(), "itsVariableNames", null);
        setIntField(term547269, term547269.getClass(), "varStart", 0);
        setField(term547269, term547269.getClass(), "compilerData", null);
        setIntField(term547269, term547269.getClass(), "type", 16);
        setField(term547269, term547269.getClass(), "next", null);
        setField(term547269, term547269.getClass(), "first", null);
        setField(term547269, term547269.getClass(), "last", null);
        setField(term547269, term547269.getClass(), "propListHead", null);
        setIntField(term547269, term547269.getClass(), "sourcePosition", 0);
        setField(term547269, term547269.getClass(), "jsType", null);
        setField(term547269, term547269.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term547073;
        args[1] = term547159;
        args[2] = term547251;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term546987, args);
        assertTrue(recursiveEquals(term546987, term547298));
        assertTrue(recursiveEquals(term547073, term547299));
        assertTrue(recursiveEquals(term547159, term547300));
        assertTrue(recursiveEquals(term547251, term547301));
        assertTrue(recursiveEquals(retValue, term547269));
    }

};


