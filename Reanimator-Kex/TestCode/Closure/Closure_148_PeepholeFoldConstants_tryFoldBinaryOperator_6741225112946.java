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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112946 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term863427;
     Object term863519;
     Object term864231;
     Object term864232;
     Object term864160;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112946() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term863427 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term863519 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term863605 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term863675 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term863605, term863605.getClass(), "next", term863675);
        setField(term863519, term863519.getClass(), "first", term863605);
        setIntField(term863519, term863519.getClass(), "type", 100);
        term864231 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term864231, term864231.getClass(), "currentTraversal", null);
        term864232 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term864233 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term864234 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term864232, term864232.getClass(), "number", 0.0);
        setIntField(term864232, term864232.getClass(), "type", 100);
        setField(term864232, term864232.getClass(), "next", null);
        setField(term864233, term864233.getClass(), "functionName", null);
        setBooleanField(term864233, term864233.getClass(), "itsNeedsActivation", false);
        setIntField(term864233, term864233.getClass(), "itsFunctionType", 0);
        setBooleanField(term864233, term864233.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term864233, term864233.getClass(), "encodedSourceStart", 0);
        setIntField(term864233, term864233.getClass(), "encodedSourceEnd", 0);
        setField(term864233, term864233.getClass(), "sourceName", null);
        setIntField(term864233, term864233.getClass(), "baseLineno", 0);
        setIntField(term864233, term864233.getClass(), "endLineno", 0);
        setField(term864233, term864233.getClass(), "functions", null);
        setField(term864233, term864233.getClass(), "regexps", null);
        setField(term864233, term864233.getClass(), "itsVariables", null);
        setField(term864233, term864233.getClass(), "itsConst", null);
        setField(term864233, term864233.getClass(), "itsVariableNames", null);
        setIntField(term864233, term864233.getClass(), "varStart", 0);
        setField(term864233, term864233.getClass(), "compilerData", null);
        setIntField(term864233, term864233.getClass(), "type", 0);
        setIntField(term864234, term864234.getClass(), "type", 0);
        setField(term864234, term864234.getClass(), "next", null);
        setField(term864234, term864234.getClass(), "first", null);
        setField(term864234, term864234.getClass(), "last", null);
        setField(term864234, term864234.getClass(), "propListHead", null);
        setIntField(term864234, term864234.getClass(), "sourcePosition", 0);
        setField(term864234, term864234.getClass(), "jsType", null);
        setField(term864234, term864234.getClass(), "parent", null);
        setField(term864233, term864233.getClass(), "next", term864234);
        setField(term864233, term864233.getClass(), "first", null);
        setField(term864233, term864233.getClass(), "last", null);
        setField(term864233, term864233.getClass(), "propListHead", null);
        setIntField(term864233, term864233.getClass(), "sourcePosition", 0);
        setField(term864233, term864233.getClass(), "jsType", null);
        setField(term864233, term864233.getClass(), "parent", null);
        setField(term864232, term864232.getClass(), "first", term864233);
        setField(term864232, term864232.getClass(), "last", null);
        setField(term864232, term864232.getClass(), "propListHead", null);
        setIntField(term864232, term864232.getClass(), "sourcePosition", 0);
        setField(term864232, term864232.getClass(), "jsType", null);
        setField(term864232, term864232.getClass(), "parent", null);
        term864160 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term864163 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term864173 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term864160, term864160.getClass(), "number", 0.0);
        setIntField(term864160, term864160.getClass(), "type", 100);
        setField(term864160, term864160.getClass(), "next", null);
        setField(term864163, term864163.getClass(), "functionName", null);
        setBooleanField(term864163, term864163.getClass(), "itsNeedsActivation", false);
        setIntField(term864163, term864163.getClass(), "itsFunctionType", 0);
        setBooleanField(term864163, term864163.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term864163, term864163.getClass(), "encodedSourceStart", 0);
        setIntField(term864163, term864163.getClass(), "encodedSourceEnd", 0);
        setField(term864163, term864163.getClass(), "sourceName", null);
        setIntField(term864163, term864163.getClass(), "baseLineno", 0);
        setIntField(term864163, term864163.getClass(), "endLineno", 0);
        setField(term864163, term864163.getClass(), "functions", null);
        setField(term864163, term864163.getClass(), "regexps", null);
        setField(term864163, term864163.getClass(), "itsVariables", null);
        setField(term864163, term864163.getClass(), "itsConst", null);
        setField(term864163, term864163.getClass(), "itsVariableNames", null);
        setIntField(term864163, term864163.getClass(), "varStart", 0);
        setField(term864163, term864163.getClass(), "compilerData", null);
        setIntField(term864163, term864163.getClass(), "type", 0);
        setIntField(term864173, term864173.getClass(), "type", 0);
        setField(term864173, term864173.getClass(), "next", null);
        setField(term864173, term864173.getClass(), "first", null);
        setField(term864173, term864173.getClass(), "last", null);
        setField(term864173, term864173.getClass(), "propListHead", null);
        setIntField(term864173, term864173.getClass(), "sourcePosition", 0);
        setField(term864173, term864173.getClass(), "jsType", null);
        setField(term864173, term864173.getClass(), "parent", null);
        setField(term864163, term864163.getClass(), "next", term864173);
        setField(term864163, term864163.getClass(), "first", null);
        setField(term864163, term864163.getClass(), "last", null);
        setField(term864163, term864163.getClass(), "propListHead", null);
        setIntField(term864163, term864163.getClass(), "sourcePosition", 0);
        setField(term864163, term864163.getClass(), "jsType", null);
        setField(term864163, term864163.getClass(), "parent", null);
        setField(term864160, term864160.getClass(), "first", term864163);
        setField(term864160, term864160.getClass(), "last", null);
        setField(term864160, term864160.getClass(), "propListHead", null);
        setIntField(term864160, term864160.getClass(), "sourcePosition", 0);
        setField(term864160, term864160.getClass(), "jsType", null);
        setField(term864160, term864160.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term863519;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term863427, args);
        assertTrue(recursiveEquals(term863427, term864231));
        assertTrue(recursiveEquals(term863519, term864232));
        assertTrue(recursiveEquals(retValue, term864160));
    }

};


