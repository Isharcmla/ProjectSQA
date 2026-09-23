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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111786 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term465163;
     Object term465255;
     Object term465651;
     Object term465652;
     Object term465536;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111786() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term465163 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term465255 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term465345 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term465437 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term465523 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term465437, term465437.getClass(), "type", 44);
        setField(term465345, term465345.getClass(), "next", term465437);
        setIntField(term465345, term465345.getClass(), "type", 0);
        setField(term465255, term465255.getClass(), "first", term465345);
        setIntField(term465255, term465255.getClass(), "type", 101);
        setField(term465255, term465255.getClass(), "parent", term465523);
        term465651 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term465651, term465651.getClass(), "currentTraversal", null);
        term465652 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term465653 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term465654 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term465655 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term465652, term465652.getClass(), "number", 0.0);
        setIntField(term465652, term465652.getClass(), "type", 101);
        setField(term465652, term465652.getClass(), "next", null);
        setIntField(term465653, term465653.getClass(), "encodedSourceStart", 0);
        setIntField(term465653, term465653.getClass(), "encodedSourceEnd", 0);
        setField(term465653, term465653.getClass(), "sourceName", null);
        setIntField(term465653, term465653.getClass(), "baseLineno", 0);
        setIntField(term465653, term465653.getClass(), "endLineno", 0);
        setField(term465653, term465653.getClass(), "functions", null);
        setField(term465653, term465653.getClass(), "regexps", null);
        setField(term465653, term465653.getClass(), "itsVariables", null);
        setField(term465653, term465653.getClass(), "itsConst", null);
        setField(term465653, term465653.getClass(), "itsVariableNames", null);
        setIntField(term465653, term465653.getClass(), "varStart", 0);
        setField(term465653, term465653.getClass(), "compilerData", null);
        setIntField(term465653, term465653.getClass(), "type", 0);
        setDoubleField(term465654, term465654.getClass(), "number", 0.0);
        setIntField(term465654, term465654.getClass(), "type", 44);
        setField(term465654, term465654.getClass(), "next", null);
        setField(term465654, term465654.getClass(), "first", null);
        setField(term465654, term465654.getClass(), "last", null);
        setField(term465654, term465654.getClass(), "propListHead", null);
        setIntField(term465654, term465654.getClass(), "sourcePosition", 0);
        setField(term465654, term465654.getClass(), "jsType", null);
        setField(term465654, term465654.getClass(), "parent", null);
        setField(term465653, term465653.getClass(), "next", term465654);
        setField(term465653, term465653.getClass(), "first", null);
        setField(term465653, term465653.getClass(), "last", null);
        setField(term465653, term465653.getClass(), "propListHead", null);
        setIntField(term465653, term465653.getClass(), "sourcePosition", 0);
        setField(term465653, term465653.getClass(), "jsType", null);
        setField(term465653, term465653.getClass(), "parent", null);
        setField(term465652, term465652.getClass(), "first", term465653);
        setField(term465652, term465652.getClass(), "last", null);
        setField(term465652, term465652.getClass(), "propListHead", null);
        setIntField(term465652, term465652.getClass(), "sourcePosition", 0);
        setField(term465652, term465652.getClass(), "jsType", null);
        setField(term465655, term465655.getClass(), "functionName", null);
        setBooleanField(term465655, term465655.getClass(), "itsNeedsActivation", false);
        setIntField(term465655, term465655.getClass(), "itsFunctionType", 0);
        setBooleanField(term465655, term465655.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term465655, term465655.getClass(), "encodedSourceStart", 0);
        setIntField(term465655, term465655.getClass(), "encodedSourceEnd", 0);
        setField(term465655, term465655.getClass(), "sourceName", null);
        setIntField(term465655, term465655.getClass(), "baseLineno", 0);
        setIntField(term465655, term465655.getClass(), "endLineno", 0);
        setField(term465655, term465655.getClass(), "functions", null);
        setField(term465655, term465655.getClass(), "regexps", null);
        setField(term465655, term465655.getClass(), "itsVariables", null);
        setField(term465655, term465655.getClass(), "itsConst", null);
        setField(term465655, term465655.getClass(), "itsVariableNames", null);
        setIntField(term465655, term465655.getClass(), "varStart", 0);
        setField(term465655, term465655.getClass(), "compilerData", null);
        setIntField(term465655, term465655.getClass(), "type", 0);
        setField(term465655, term465655.getClass(), "next", null);
        setField(term465655, term465655.getClass(), "first", null);
        setField(term465655, term465655.getClass(), "last", null);
        setField(term465655, term465655.getClass(), "propListHead", null);
        setIntField(term465655, term465655.getClass(), "sourcePosition", 0);
        setField(term465655, term465655.getClass(), "jsType", null);
        setField(term465655, term465655.getClass(), "parent", null);
        setField(term465652, term465652.getClass(), "parent", term465655);
        term465536 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term465539 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term465546 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term465552 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term465536, term465536.getClass(), "number", 0.0);
        setIntField(term465536, term465536.getClass(), "type", 101);
        setField(term465536, term465536.getClass(), "next", null);
        setIntField(term465539, term465539.getClass(), "encodedSourceStart", 0);
        setIntField(term465539, term465539.getClass(), "encodedSourceEnd", 0);
        setField(term465539, term465539.getClass(), "sourceName", null);
        setIntField(term465539, term465539.getClass(), "baseLineno", 0);
        setIntField(term465539, term465539.getClass(), "endLineno", 0);
        setField(term465539, term465539.getClass(), "functions", null);
        setField(term465539, term465539.getClass(), "regexps", null);
        setField(term465539, term465539.getClass(), "itsVariables", null);
        setField(term465539, term465539.getClass(), "itsConst", null);
        setField(term465539, term465539.getClass(), "itsVariableNames", null);
        setIntField(term465539, term465539.getClass(), "varStart", 0);
        setField(term465539, term465539.getClass(), "compilerData", null);
        setIntField(term465539, term465539.getClass(), "type", 0);
        setDoubleField(term465546, term465546.getClass(), "number", 0.0);
        setIntField(term465546, term465546.getClass(), "type", 44);
        setField(term465546, term465546.getClass(), "next", null);
        setField(term465546, term465546.getClass(), "first", null);
        setField(term465546, term465546.getClass(), "last", null);
        setField(term465546, term465546.getClass(), "propListHead", null);
        setIntField(term465546, term465546.getClass(), "sourcePosition", 0);
        setField(term465546, term465546.getClass(), "jsType", null);
        setField(term465546, term465546.getClass(), "parent", null);
        setField(term465539, term465539.getClass(), "next", term465546);
        setField(term465539, term465539.getClass(), "first", null);
        setField(term465539, term465539.getClass(), "last", null);
        setField(term465539, term465539.getClass(), "propListHead", null);
        setIntField(term465539, term465539.getClass(), "sourcePosition", 0);
        setField(term465539, term465539.getClass(), "jsType", null);
        setField(term465539, term465539.getClass(), "parent", null);
        setField(term465536, term465536.getClass(), "first", term465539);
        setField(term465536, term465536.getClass(), "last", null);
        setField(term465536, term465536.getClass(), "propListHead", null);
        setIntField(term465536, term465536.getClass(), "sourcePosition", 0);
        setField(term465536, term465536.getClass(), "jsType", null);
        setField(term465552, term465552.getClass(), "functionName", null);
        setBooleanField(term465552, term465552.getClass(), "itsNeedsActivation", false);
        setIntField(term465552, term465552.getClass(), "itsFunctionType", 0);
        setBooleanField(term465552, term465552.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term465552, term465552.getClass(), "encodedSourceStart", 0);
        setIntField(term465552, term465552.getClass(), "encodedSourceEnd", 0);
        setField(term465552, term465552.getClass(), "sourceName", null);
        setIntField(term465552, term465552.getClass(), "baseLineno", 0);
        setIntField(term465552, term465552.getClass(), "endLineno", 0);
        setField(term465552, term465552.getClass(), "functions", null);
        setField(term465552, term465552.getClass(), "regexps", null);
        setField(term465552, term465552.getClass(), "itsVariables", null);
        setField(term465552, term465552.getClass(), "itsConst", null);
        setField(term465552, term465552.getClass(), "itsVariableNames", null);
        setIntField(term465552, term465552.getClass(), "varStart", 0);
        setField(term465552, term465552.getClass(), "compilerData", null);
        setIntField(term465552, term465552.getClass(), "type", 0);
        setField(term465552, term465552.getClass(), "next", null);
        setField(term465552, term465552.getClass(), "first", null);
        setField(term465552, term465552.getClass(), "last", null);
        setField(term465552, term465552.getClass(), "propListHead", null);
        setIntField(term465552, term465552.getClass(), "sourcePosition", 0);
        setField(term465552, term465552.getClass(), "jsType", null);
        setField(term465552, term465552.getClass(), "parent", null);
        setField(term465536, term465536.getClass(), "parent", term465552);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term465255;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term465163, args);
        assertTrue(recursiveEquals(term465163, term465651));
        assertTrue(recursiveEquals(term465255, term465652));
        assertTrue(recursiveEquals(retValue, term465536));
    }

};


