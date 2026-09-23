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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term472753;
     Object term472845;
     Object term473776;
     Object term473777;
     Object term473660;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term472753 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term472845 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term472935 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term473027 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term473113 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term473027, term473027.getClass(), "type", 44);
        setField(term472935, term472935.getClass(), "next", term473027);
        setIntField(term472935, term472935.getClass(), "type", 0);
        setField(term472845, term472845.getClass(), "first", term472935);
        setIntField(term472845, term472845.getClass(), "type", 101);
        setIntField(term473113, term473113.getClass(), "type", 98);
        setField(term472845, term472845.getClass(), "parent", term473113);
        term473776 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term473776, term473776.getClass(), "currentTraversal", null);
        term473777 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term473778 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term473779 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term473780 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term473777, term473777.getClass(), "number", 0.0);
        setIntField(term473777, term473777.getClass(), "type", 101);
        setField(term473777, term473777.getClass(), "next", null);
        setIntField(term473778, term473778.getClass(), "encodedSourceStart", 0);
        setIntField(term473778, term473778.getClass(), "encodedSourceEnd", 0);
        setField(term473778, term473778.getClass(), "sourceName", null);
        setIntField(term473778, term473778.getClass(), "baseLineno", 0);
        setIntField(term473778, term473778.getClass(), "endLineno", 0);
        setField(term473778, term473778.getClass(), "functions", null);
        setField(term473778, term473778.getClass(), "regexps", null);
        setField(term473778, term473778.getClass(), "itsVariables", null);
        setField(term473778, term473778.getClass(), "itsConst", null);
        setField(term473778, term473778.getClass(), "itsVariableNames", null);
        setIntField(term473778, term473778.getClass(), "varStart", 0);
        setField(term473778, term473778.getClass(), "compilerData", null);
        setIntField(term473778, term473778.getClass(), "type", 0);
        setDoubleField(term473779, term473779.getClass(), "number", 0.0);
        setIntField(term473779, term473779.getClass(), "type", 44);
        setField(term473779, term473779.getClass(), "next", null);
        setField(term473779, term473779.getClass(), "first", null);
        setField(term473779, term473779.getClass(), "last", null);
        setField(term473779, term473779.getClass(), "propListHead", null);
        setIntField(term473779, term473779.getClass(), "sourcePosition", 0);
        setField(term473779, term473779.getClass(), "jsType", null);
        setField(term473779, term473779.getClass(), "parent", null);
        setField(term473778, term473778.getClass(), "next", term473779);
        setField(term473778, term473778.getClass(), "first", null);
        setField(term473778, term473778.getClass(), "last", null);
        setField(term473778, term473778.getClass(), "propListHead", null);
        setIntField(term473778, term473778.getClass(), "sourcePosition", 0);
        setField(term473778, term473778.getClass(), "jsType", null);
        setField(term473778, term473778.getClass(), "parent", null);
        setField(term473777, term473777.getClass(), "first", term473778);
        setField(term473777, term473777.getClass(), "last", null);
        setField(term473777, term473777.getClass(), "propListHead", null);
        setIntField(term473777, term473777.getClass(), "sourcePosition", 0);
        setField(term473777, term473777.getClass(), "jsType", null);
        setField(term473780, term473780.getClass(), "functionName", null);
        setBooleanField(term473780, term473780.getClass(), "itsNeedsActivation", false);
        setIntField(term473780, term473780.getClass(), "itsFunctionType", 0);
        setBooleanField(term473780, term473780.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term473780, term473780.getClass(), "encodedSourceStart", 0);
        setIntField(term473780, term473780.getClass(), "encodedSourceEnd", 0);
        setField(term473780, term473780.getClass(), "sourceName", null);
        setIntField(term473780, term473780.getClass(), "baseLineno", 0);
        setIntField(term473780, term473780.getClass(), "endLineno", 0);
        setField(term473780, term473780.getClass(), "functions", null);
        setField(term473780, term473780.getClass(), "regexps", null);
        setField(term473780, term473780.getClass(), "itsVariables", null);
        setField(term473780, term473780.getClass(), "itsConst", null);
        setField(term473780, term473780.getClass(), "itsVariableNames", null);
        setIntField(term473780, term473780.getClass(), "varStart", 0);
        setField(term473780, term473780.getClass(), "compilerData", null);
        setIntField(term473780, term473780.getClass(), "type", 98);
        setField(term473780, term473780.getClass(), "next", null);
        setField(term473780, term473780.getClass(), "first", null);
        setField(term473780, term473780.getClass(), "last", null);
        setField(term473780, term473780.getClass(), "propListHead", null);
        setIntField(term473780, term473780.getClass(), "sourcePosition", 0);
        setField(term473780, term473780.getClass(), "jsType", null);
        setField(term473780, term473780.getClass(), "parent", null);
        setField(term473777, term473777.getClass(), "parent", term473780);
        term473660 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term473663 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term473670 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term473676 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term473660, term473660.getClass(), "number", 0.0);
        setIntField(term473660, term473660.getClass(), "type", 101);
        setField(term473660, term473660.getClass(), "next", null);
        setIntField(term473663, term473663.getClass(), "encodedSourceStart", 0);
        setIntField(term473663, term473663.getClass(), "encodedSourceEnd", 0);
        setField(term473663, term473663.getClass(), "sourceName", null);
        setIntField(term473663, term473663.getClass(), "baseLineno", 0);
        setIntField(term473663, term473663.getClass(), "endLineno", 0);
        setField(term473663, term473663.getClass(), "functions", null);
        setField(term473663, term473663.getClass(), "regexps", null);
        setField(term473663, term473663.getClass(), "itsVariables", null);
        setField(term473663, term473663.getClass(), "itsConst", null);
        setField(term473663, term473663.getClass(), "itsVariableNames", null);
        setIntField(term473663, term473663.getClass(), "varStart", 0);
        setField(term473663, term473663.getClass(), "compilerData", null);
        setIntField(term473663, term473663.getClass(), "type", 0);
        setDoubleField(term473670, term473670.getClass(), "number", 0.0);
        setIntField(term473670, term473670.getClass(), "type", 44);
        setField(term473670, term473670.getClass(), "next", null);
        setField(term473670, term473670.getClass(), "first", null);
        setField(term473670, term473670.getClass(), "last", null);
        setField(term473670, term473670.getClass(), "propListHead", null);
        setIntField(term473670, term473670.getClass(), "sourcePosition", 0);
        setField(term473670, term473670.getClass(), "jsType", null);
        setField(term473670, term473670.getClass(), "parent", null);
        setField(term473663, term473663.getClass(), "next", term473670);
        setField(term473663, term473663.getClass(), "first", null);
        setField(term473663, term473663.getClass(), "last", null);
        setField(term473663, term473663.getClass(), "propListHead", null);
        setIntField(term473663, term473663.getClass(), "sourcePosition", 0);
        setField(term473663, term473663.getClass(), "jsType", null);
        setField(term473663, term473663.getClass(), "parent", null);
        setField(term473660, term473660.getClass(), "first", term473663);
        setField(term473660, term473660.getClass(), "last", null);
        setField(term473660, term473660.getClass(), "propListHead", null);
        setIntField(term473660, term473660.getClass(), "sourcePosition", 0);
        setField(term473660, term473660.getClass(), "jsType", null);
        setField(term473676, term473676.getClass(), "functionName", null);
        setBooleanField(term473676, term473676.getClass(), "itsNeedsActivation", false);
        setIntField(term473676, term473676.getClass(), "itsFunctionType", 0);
        setBooleanField(term473676, term473676.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term473676, term473676.getClass(), "encodedSourceStart", 0);
        setIntField(term473676, term473676.getClass(), "encodedSourceEnd", 0);
        setField(term473676, term473676.getClass(), "sourceName", null);
        setIntField(term473676, term473676.getClass(), "baseLineno", 0);
        setIntField(term473676, term473676.getClass(), "endLineno", 0);
        setField(term473676, term473676.getClass(), "functions", null);
        setField(term473676, term473676.getClass(), "regexps", null);
        setField(term473676, term473676.getClass(), "itsVariables", null);
        setField(term473676, term473676.getClass(), "itsConst", null);
        setField(term473676, term473676.getClass(), "itsVariableNames", null);
        setIntField(term473676, term473676.getClass(), "varStart", 0);
        setField(term473676, term473676.getClass(), "compilerData", null);
        setIntField(term473676, term473676.getClass(), "type", 98);
        setField(term473676, term473676.getClass(), "next", null);
        setField(term473676, term473676.getClass(), "first", null);
        setField(term473676, term473676.getClass(), "last", null);
        setField(term473676, term473676.getClass(), "propListHead", null);
        setIntField(term473676, term473676.getClass(), "sourcePosition", 0);
        setField(term473676, term473676.getClass(), "jsType", null);
        setField(term473676, term473676.getClass(), "parent", null);
        setField(term473660, term473660.getClass(), "parent", term473676);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term472845;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term472753, args);
        assertTrue(recursiveEquals(term472753, term473776));
        assertTrue(recursiveEquals(term472845, term473777));
        assertTrue(recursiveEquals(retValue, term473660));
    }

};


