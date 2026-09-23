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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term258551;
     Object term258637;
     Object term258979;
     Object term258980;
     Object term258894;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term258551 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term258637 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term258723 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term258815 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term258723, term258723.getClass(), "next", term258815);
        setIntField(term258723, term258723.getClass(), "type", 0);
        setField(term258637, term258637.getClass(), "first", term258723);
        setIntField(term258637, term258637.getClass(), "type", 100);
        setField(term258637, term258637.getClass(), "parent", null);
        term258979 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term258979, term258979.getClass(), "currentTraversal", null);
        term258980 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term258981 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term258982 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term258980, term258980.getClass(), "functionName", null);
        setBooleanField(term258980, term258980.getClass(), "itsNeedsActivation", false);
        setIntField(term258980, term258980.getClass(), "itsFunctionType", 0);
        setBooleanField(term258980, term258980.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term258980, term258980.getClass(), "encodedSourceStart", 0);
        setIntField(term258980, term258980.getClass(), "encodedSourceEnd", 0);
        setField(term258980, term258980.getClass(), "sourceName", null);
        setIntField(term258980, term258980.getClass(), "baseLineno", 0);
        setIntField(term258980, term258980.getClass(), "endLineno", 0);
        setField(term258980, term258980.getClass(), "functions", null);
        setField(term258980, term258980.getClass(), "regexps", null);
        setField(term258980, term258980.getClass(), "itsVariables", null);
        setField(term258980, term258980.getClass(), "itsConst", null);
        setField(term258980, term258980.getClass(), "itsVariableNames", null);
        setIntField(term258980, term258980.getClass(), "varStart", 0);
        setField(term258980, term258980.getClass(), "compilerData", null);
        setIntField(term258980, term258980.getClass(), "type", 100);
        setField(term258980, term258980.getClass(), "next", null);
        setField(term258981, term258981.getClass(), "functionName", null);
        setBooleanField(term258981, term258981.getClass(), "itsNeedsActivation", false);
        setIntField(term258981, term258981.getClass(), "itsFunctionType", 0);
        setBooleanField(term258981, term258981.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term258981, term258981.getClass(), "encodedSourceStart", 0);
        setIntField(term258981, term258981.getClass(), "encodedSourceEnd", 0);
        setField(term258981, term258981.getClass(), "sourceName", null);
        setIntField(term258981, term258981.getClass(), "baseLineno", 0);
        setIntField(term258981, term258981.getClass(), "endLineno", 0);
        setField(term258981, term258981.getClass(), "functions", null);
        setField(term258981, term258981.getClass(), "regexps", null);
        setField(term258981, term258981.getClass(), "itsVariables", null);
        setField(term258981, term258981.getClass(), "itsConst", null);
        setField(term258981, term258981.getClass(), "itsVariableNames", null);
        setIntField(term258981, term258981.getClass(), "varStart", 0);
        setField(term258981, term258981.getClass(), "compilerData", null);
        setIntField(term258981, term258981.getClass(), "type", 0);
        setField(term258982, term258982.getClass(), "str", null);
        setIntField(term258982, term258982.getClass(), "type", 0);
        setField(term258982, term258982.getClass(), "next", null);
        setField(term258982, term258982.getClass(), "first", null);
        setField(term258982, term258982.getClass(), "last", null);
        setField(term258982, term258982.getClass(), "propListHead", null);
        setIntField(term258982, term258982.getClass(), "sourcePosition", 0);
        setField(term258982, term258982.getClass(), "jsType", null);
        setField(term258982, term258982.getClass(), "parent", null);
        setField(term258981, term258981.getClass(), "next", term258982);
        setField(term258981, term258981.getClass(), "first", null);
        setField(term258981, term258981.getClass(), "last", null);
        setField(term258981, term258981.getClass(), "propListHead", null);
        setIntField(term258981, term258981.getClass(), "sourcePosition", 0);
        setField(term258981, term258981.getClass(), "jsType", null);
        setField(term258981, term258981.getClass(), "parent", null);
        setField(term258980, term258980.getClass(), "first", term258981);
        setField(term258980, term258980.getClass(), "last", null);
        setField(term258980, term258980.getClass(), "propListHead", null);
        setIntField(term258980, term258980.getClass(), "sourcePosition", 0);
        setField(term258980, term258980.getClass(), "jsType", null);
        setField(term258980, term258980.getClass(), "parent", null);
        term258894 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term258904 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term258914 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term258894, term258894.getClass(), "functionName", null);
        setBooleanField(term258894, term258894.getClass(), "itsNeedsActivation", false);
        setIntField(term258894, term258894.getClass(), "itsFunctionType", 0);
        setBooleanField(term258894, term258894.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term258894, term258894.getClass(), "encodedSourceStart", 0);
        setIntField(term258894, term258894.getClass(), "encodedSourceEnd", 0);
        setField(term258894, term258894.getClass(), "sourceName", null);
        setIntField(term258894, term258894.getClass(), "baseLineno", 0);
        setIntField(term258894, term258894.getClass(), "endLineno", 0);
        setField(term258894, term258894.getClass(), "functions", null);
        setField(term258894, term258894.getClass(), "regexps", null);
        setField(term258894, term258894.getClass(), "itsVariables", null);
        setField(term258894, term258894.getClass(), "itsConst", null);
        setField(term258894, term258894.getClass(), "itsVariableNames", null);
        setIntField(term258894, term258894.getClass(), "varStart", 0);
        setField(term258894, term258894.getClass(), "compilerData", null);
        setIntField(term258894, term258894.getClass(), "type", 100);
        setField(term258894, term258894.getClass(), "next", null);
        setField(term258904, term258904.getClass(), "functionName", null);
        setBooleanField(term258904, term258904.getClass(), "itsNeedsActivation", false);
        setIntField(term258904, term258904.getClass(), "itsFunctionType", 0);
        setBooleanField(term258904, term258904.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term258904, term258904.getClass(), "encodedSourceStart", 0);
        setIntField(term258904, term258904.getClass(), "encodedSourceEnd", 0);
        setField(term258904, term258904.getClass(), "sourceName", null);
        setIntField(term258904, term258904.getClass(), "baseLineno", 0);
        setIntField(term258904, term258904.getClass(), "endLineno", 0);
        setField(term258904, term258904.getClass(), "functions", null);
        setField(term258904, term258904.getClass(), "regexps", null);
        setField(term258904, term258904.getClass(), "itsVariables", null);
        setField(term258904, term258904.getClass(), "itsConst", null);
        setField(term258904, term258904.getClass(), "itsVariableNames", null);
        setIntField(term258904, term258904.getClass(), "varStart", 0);
        setField(term258904, term258904.getClass(), "compilerData", null);
        setIntField(term258904, term258904.getClass(), "type", 0);
        setField(term258914, term258914.getClass(), "str", null);
        setIntField(term258914, term258914.getClass(), "type", 0);
        setField(term258914, term258914.getClass(), "next", null);
        setField(term258914, term258914.getClass(), "first", null);
        setField(term258914, term258914.getClass(), "last", null);
        setField(term258914, term258914.getClass(), "propListHead", null);
        setIntField(term258914, term258914.getClass(), "sourcePosition", 0);
        setField(term258914, term258914.getClass(), "jsType", null);
        setField(term258914, term258914.getClass(), "parent", null);
        setField(term258904, term258904.getClass(), "next", term258914);
        setField(term258904, term258904.getClass(), "first", null);
        setField(term258904, term258904.getClass(), "last", null);
        setField(term258904, term258904.getClass(), "propListHead", null);
        setIntField(term258904, term258904.getClass(), "sourcePosition", 0);
        setField(term258904, term258904.getClass(), "jsType", null);
        setField(term258904, term258904.getClass(), "parent", null);
        setField(term258894, term258894.getClass(), "first", term258904);
        setField(term258894, term258894.getClass(), "last", null);
        setField(term258894, term258894.getClass(), "propListHead", null);
        setIntField(term258894, term258894.getClass(), "sourcePosition", 0);
        setField(term258894, term258894.getClass(), "jsType", null);
        setField(term258894, term258894.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term258637;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term258551, args);
        assertTrue(recursiveEquals(term258551, term258979));
        assertTrue(recursiveEquals(term258637, term258980));
        assertTrue(recursiveEquals(retValue, term258894));
    }

};


