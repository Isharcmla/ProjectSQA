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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111761 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term457354;
     Object term457446;
     Object term458245;
     Object term458246;
     Object term458156;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111761() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term457354 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term457446 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term457536 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term457622 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term457536, term457536.getClass(), "next", term457622);
        setIntField(term457536, term457536.getClass(), "type", 0);
        setField(term457446, term457446.getClass(), "first", term457536);
        setIntField(term457446, term457446.getClass(), "type", 101);
        setField(term457446, term457446.getClass(), "parent", null);
        term458245 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term458245, term458245.getClass(), "currentTraversal", null);
        term458246 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term458247 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term458248 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term458246, term458246.getClass(), "number", 0.0);
        setIntField(term458246, term458246.getClass(), "type", 101);
        setField(term458246, term458246.getClass(), "next", null);
        setIntField(term458247, term458247.getClass(), "encodedSourceStart", 0);
        setIntField(term458247, term458247.getClass(), "encodedSourceEnd", 0);
        setField(term458247, term458247.getClass(), "sourceName", null);
        setIntField(term458247, term458247.getClass(), "baseLineno", 0);
        setIntField(term458247, term458247.getClass(), "endLineno", 0);
        setField(term458247, term458247.getClass(), "functions", null);
        setField(term458247, term458247.getClass(), "regexps", null);
        setField(term458247, term458247.getClass(), "itsVariables", null);
        setField(term458247, term458247.getClass(), "itsConst", null);
        setField(term458247, term458247.getClass(), "itsVariableNames", null);
        setIntField(term458247, term458247.getClass(), "varStart", 0);
        setField(term458247, term458247.getClass(), "compilerData", null);
        setIntField(term458247, term458247.getClass(), "type", 0);
        setField(term458248, term458248.getClass(), "functionName", null);
        setBooleanField(term458248, term458248.getClass(), "itsNeedsActivation", false);
        setIntField(term458248, term458248.getClass(), "itsFunctionType", 0);
        setBooleanField(term458248, term458248.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term458248, term458248.getClass(), "encodedSourceStart", 0);
        setIntField(term458248, term458248.getClass(), "encodedSourceEnd", 0);
        setField(term458248, term458248.getClass(), "sourceName", null);
        setIntField(term458248, term458248.getClass(), "baseLineno", 0);
        setIntField(term458248, term458248.getClass(), "endLineno", 0);
        setField(term458248, term458248.getClass(), "functions", null);
        setField(term458248, term458248.getClass(), "regexps", null);
        setField(term458248, term458248.getClass(), "itsVariables", null);
        setField(term458248, term458248.getClass(), "itsConst", null);
        setField(term458248, term458248.getClass(), "itsVariableNames", null);
        setIntField(term458248, term458248.getClass(), "varStart", 0);
        setField(term458248, term458248.getClass(), "compilerData", null);
        setIntField(term458248, term458248.getClass(), "type", 0);
        setField(term458248, term458248.getClass(), "next", null);
        setField(term458248, term458248.getClass(), "first", null);
        setField(term458248, term458248.getClass(), "last", null);
        setField(term458248, term458248.getClass(), "propListHead", null);
        setIntField(term458248, term458248.getClass(), "sourcePosition", 0);
        setField(term458248, term458248.getClass(), "jsType", null);
        setField(term458248, term458248.getClass(), "parent", null);
        setField(term458247, term458247.getClass(), "next", term458248);
        setField(term458247, term458247.getClass(), "first", null);
        setField(term458247, term458247.getClass(), "last", null);
        setField(term458247, term458247.getClass(), "propListHead", null);
        setIntField(term458247, term458247.getClass(), "sourcePosition", 0);
        setField(term458247, term458247.getClass(), "jsType", null);
        setField(term458247, term458247.getClass(), "parent", null);
        setField(term458246, term458246.getClass(), "first", term458247);
        setField(term458246, term458246.getClass(), "last", null);
        setField(term458246, term458246.getClass(), "propListHead", null);
        setIntField(term458246, term458246.getClass(), "sourcePosition", 0);
        setField(term458246, term458246.getClass(), "jsType", null);
        setField(term458246, term458246.getClass(), "parent", null);
        term458156 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term458159 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term458166 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term458156, term458156.getClass(), "number", 0.0);
        setIntField(term458156, term458156.getClass(), "type", 101);
        setField(term458156, term458156.getClass(), "next", null);
        setIntField(term458159, term458159.getClass(), "encodedSourceStart", 0);
        setIntField(term458159, term458159.getClass(), "encodedSourceEnd", 0);
        setField(term458159, term458159.getClass(), "sourceName", null);
        setIntField(term458159, term458159.getClass(), "baseLineno", 0);
        setIntField(term458159, term458159.getClass(), "endLineno", 0);
        setField(term458159, term458159.getClass(), "functions", null);
        setField(term458159, term458159.getClass(), "regexps", null);
        setField(term458159, term458159.getClass(), "itsVariables", null);
        setField(term458159, term458159.getClass(), "itsConst", null);
        setField(term458159, term458159.getClass(), "itsVariableNames", null);
        setIntField(term458159, term458159.getClass(), "varStart", 0);
        setField(term458159, term458159.getClass(), "compilerData", null);
        setIntField(term458159, term458159.getClass(), "type", 0);
        setField(term458166, term458166.getClass(), "functionName", null);
        setBooleanField(term458166, term458166.getClass(), "itsNeedsActivation", false);
        setIntField(term458166, term458166.getClass(), "itsFunctionType", 0);
        setBooleanField(term458166, term458166.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term458166, term458166.getClass(), "encodedSourceStart", 0);
        setIntField(term458166, term458166.getClass(), "encodedSourceEnd", 0);
        setField(term458166, term458166.getClass(), "sourceName", null);
        setIntField(term458166, term458166.getClass(), "baseLineno", 0);
        setIntField(term458166, term458166.getClass(), "endLineno", 0);
        setField(term458166, term458166.getClass(), "functions", null);
        setField(term458166, term458166.getClass(), "regexps", null);
        setField(term458166, term458166.getClass(), "itsVariables", null);
        setField(term458166, term458166.getClass(), "itsConst", null);
        setField(term458166, term458166.getClass(), "itsVariableNames", null);
        setIntField(term458166, term458166.getClass(), "varStart", 0);
        setField(term458166, term458166.getClass(), "compilerData", null);
        setIntField(term458166, term458166.getClass(), "type", 0);
        setField(term458166, term458166.getClass(), "next", null);
        setField(term458166, term458166.getClass(), "first", null);
        setField(term458166, term458166.getClass(), "last", null);
        setField(term458166, term458166.getClass(), "propListHead", null);
        setIntField(term458166, term458166.getClass(), "sourcePosition", 0);
        setField(term458166, term458166.getClass(), "jsType", null);
        setField(term458166, term458166.getClass(), "parent", null);
        setField(term458159, term458159.getClass(), "next", term458166);
        setField(term458159, term458159.getClass(), "first", null);
        setField(term458159, term458159.getClass(), "last", null);
        setField(term458159, term458159.getClass(), "propListHead", null);
        setIntField(term458159, term458159.getClass(), "sourcePosition", 0);
        setField(term458159, term458159.getClass(), "jsType", null);
        setField(term458159, term458159.getClass(), "parent", null);
        setField(term458156, term458156.getClass(), "first", term458159);
        setField(term458156, term458156.getClass(), "last", null);
        setField(term458156, term458156.getClass(), "propListHead", null);
        setIntField(term458156, term458156.getClass(), "sourcePosition", 0);
        setField(term458156, term458156.getClass(), "jsType", null);
        setField(term458156, term458156.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term457446;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term457354, args);
        assertTrue(recursiveEquals(term457354, term458245));
        assertTrue(recursiveEquals(term457446, term458246));
        assertTrue(recursiveEquals(retValue, term458156));
    }

};


