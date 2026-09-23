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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term286285;
     Object term286377;
     Object term286697;
     Object term286698;
     Object term286632;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term286285 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term286377 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term286467 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term286559 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term286467, term286467.getClass(), "next", term286559);
        setIntField(term286467, term286467.getClass(), "type", 0);
        setField(term286377, term286377.getClass(), "first", term286467);
        setIntField(term286377, term286377.getClass(), "type", 101);
        setField(term286377, term286377.getClass(), "parent", null);
        term286697 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term286697, term286697.getClass(), "currentTraversal", null);
        term286698 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term286699 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term286700 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term286698, term286698.getClass(), "number", 0.0);
        setIntField(term286698, term286698.getClass(), "type", 101);
        setField(term286698, term286698.getClass(), "next", null);
        setIntField(term286699, term286699.getClass(), "encodedSourceStart", 0);
        setIntField(term286699, term286699.getClass(), "encodedSourceEnd", 0);
        setField(term286699, term286699.getClass(), "sourceName", null);
        setIntField(term286699, term286699.getClass(), "baseLineno", 0);
        setIntField(term286699, term286699.getClass(), "endLineno", 0);
        setField(term286699, term286699.getClass(), "functions", null);
        setField(term286699, term286699.getClass(), "regexps", null);
        setField(term286699, term286699.getClass(), "itsVariables", null);
        setField(term286699, term286699.getClass(), "itsConst", null);
        setField(term286699, term286699.getClass(), "itsVariableNames", null);
        setIntField(term286699, term286699.getClass(), "varStart", 0);
        setField(term286699, term286699.getClass(), "compilerData", null);
        setIntField(term286699, term286699.getClass(), "type", 0);
        setField(term286700, term286700.getClass(), "str", null);
        setIntField(term286700, term286700.getClass(), "type", 0);
        setField(term286700, term286700.getClass(), "next", null);
        setField(term286700, term286700.getClass(), "first", null);
        setField(term286700, term286700.getClass(), "last", null);
        setField(term286700, term286700.getClass(), "propListHead", null);
        setIntField(term286700, term286700.getClass(), "sourcePosition", 0);
        setField(term286700, term286700.getClass(), "jsType", null);
        setField(term286700, term286700.getClass(), "parent", null);
        setField(term286699, term286699.getClass(), "next", term286700);
        setField(term286699, term286699.getClass(), "first", null);
        setField(term286699, term286699.getClass(), "last", null);
        setField(term286699, term286699.getClass(), "propListHead", null);
        setIntField(term286699, term286699.getClass(), "sourcePosition", 0);
        setField(term286699, term286699.getClass(), "jsType", null);
        setField(term286699, term286699.getClass(), "parent", null);
        setField(term286698, term286698.getClass(), "first", term286699);
        setField(term286698, term286698.getClass(), "last", null);
        setField(term286698, term286698.getClass(), "propListHead", null);
        setIntField(term286698, term286698.getClass(), "sourcePosition", 0);
        setField(term286698, term286698.getClass(), "jsType", null);
        setField(term286698, term286698.getClass(), "parent", null);
        term286632 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term286635 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term286642 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term286632, term286632.getClass(), "number", 0.0);
        setIntField(term286632, term286632.getClass(), "type", 101);
        setField(term286632, term286632.getClass(), "next", null);
        setIntField(term286635, term286635.getClass(), "encodedSourceStart", 0);
        setIntField(term286635, term286635.getClass(), "encodedSourceEnd", 0);
        setField(term286635, term286635.getClass(), "sourceName", null);
        setIntField(term286635, term286635.getClass(), "baseLineno", 0);
        setIntField(term286635, term286635.getClass(), "endLineno", 0);
        setField(term286635, term286635.getClass(), "functions", null);
        setField(term286635, term286635.getClass(), "regexps", null);
        setField(term286635, term286635.getClass(), "itsVariables", null);
        setField(term286635, term286635.getClass(), "itsConst", null);
        setField(term286635, term286635.getClass(), "itsVariableNames", null);
        setIntField(term286635, term286635.getClass(), "varStart", 0);
        setField(term286635, term286635.getClass(), "compilerData", null);
        setIntField(term286635, term286635.getClass(), "type", 0);
        setField(term286642, term286642.getClass(), "str", null);
        setIntField(term286642, term286642.getClass(), "type", 0);
        setField(term286642, term286642.getClass(), "next", null);
        setField(term286642, term286642.getClass(), "first", null);
        setField(term286642, term286642.getClass(), "last", null);
        setField(term286642, term286642.getClass(), "propListHead", null);
        setIntField(term286642, term286642.getClass(), "sourcePosition", 0);
        setField(term286642, term286642.getClass(), "jsType", null);
        setField(term286642, term286642.getClass(), "parent", null);
        setField(term286635, term286635.getClass(), "next", term286642);
        setField(term286635, term286635.getClass(), "first", null);
        setField(term286635, term286635.getClass(), "last", null);
        setField(term286635, term286635.getClass(), "propListHead", null);
        setIntField(term286635, term286635.getClass(), "sourcePosition", 0);
        setField(term286635, term286635.getClass(), "jsType", null);
        setField(term286635, term286635.getClass(), "parent", null);
        setField(term286632, term286632.getClass(), "first", term286635);
        setField(term286632, term286632.getClass(), "last", null);
        setField(term286632, term286632.getClass(), "propListHead", null);
        setIntField(term286632, term286632.getClass(), "sourcePosition", 0);
        setField(term286632, term286632.getClass(), "jsType", null);
        setField(term286632, term286632.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term286377;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term286285, args);
        assertTrue(recursiveEquals(term286285, term286697));
        assertTrue(recursiveEquals(term286377, term286698));
        assertTrue(recursiveEquals(retValue, term286632));
    }

};


