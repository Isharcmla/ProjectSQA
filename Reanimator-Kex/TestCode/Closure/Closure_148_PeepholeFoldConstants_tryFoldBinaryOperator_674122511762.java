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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511762 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171784;
     Object term171876;
     Object term172226;
     Object term172227;
     Object term172139;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511762() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term171784 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term171876 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term171966 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term172052 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term171966, term171966.getClass(), "next", term172052);
        setIntField(term171966, term171966.getClass(), "type", 0);
        setField(term171876, term171876.getClass(), "first", term171966);
        setIntField(term171876, term171876.getClass(), "type", 101);
        setField(term171876, term171876.getClass(), "parent", null);
        term172226 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term172226, term172226.getClass(), "currentTraversal", null);
        term172227 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term172228 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term172229 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term172227, term172227.getClass(), "str", null);
        setIntField(term172227, term172227.getClass(), "type", 101);
        setField(term172227, term172227.getClass(), "next", null);
        setIntField(term172228, term172228.getClass(), "encodedSourceStart", 0);
        setIntField(term172228, term172228.getClass(), "encodedSourceEnd", 0);
        setField(term172228, term172228.getClass(), "sourceName", null);
        setIntField(term172228, term172228.getClass(), "baseLineno", 0);
        setIntField(term172228, term172228.getClass(), "endLineno", 0);
        setField(term172228, term172228.getClass(), "functions", null);
        setField(term172228, term172228.getClass(), "regexps", null);
        setField(term172228, term172228.getClass(), "itsVariables", null);
        setField(term172228, term172228.getClass(), "itsConst", null);
        setField(term172228, term172228.getClass(), "itsVariableNames", null);
        setIntField(term172228, term172228.getClass(), "varStart", 0);
        setField(term172228, term172228.getClass(), "compilerData", null);
        setIntField(term172228, term172228.getClass(), "type", 0);
        setField(term172229, term172229.getClass(), "functionName", null);
        setBooleanField(term172229, term172229.getClass(), "itsNeedsActivation", false);
        setIntField(term172229, term172229.getClass(), "itsFunctionType", 0);
        setBooleanField(term172229, term172229.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term172229, term172229.getClass(), "encodedSourceStart", 0);
        setIntField(term172229, term172229.getClass(), "encodedSourceEnd", 0);
        setField(term172229, term172229.getClass(), "sourceName", null);
        setIntField(term172229, term172229.getClass(), "baseLineno", 0);
        setIntField(term172229, term172229.getClass(), "endLineno", 0);
        setField(term172229, term172229.getClass(), "functions", null);
        setField(term172229, term172229.getClass(), "regexps", null);
        setField(term172229, term172229.getClass(), "itsVariables", null);
        setField(term172229, term172229.getClass(), "itsConst", null);
        setField(term172229, term172229.getClass(), "itsVariableNames", null);
        setIntField(term172229, term172229.getClass(), "varStart", 0);
        setField(term172229, term172229.getClass(), "compilerData", null);
        setIntField(term172229, term172229.getClass(), "type", 0);
        setField(term172229, term172229.getClass(), "next", null);
        setField(term172229, term172229.getClass(), "first", null);
        setField(term172229, term172229.getClass(), "last", null);
        setField(term172229, term172229.getClass(), "propListHead", null);
        setIntField(term172229, term172229.getClass(), "sourcePosition", 0);
        setField(term172229, term172229.getClass(), "jsType", null);
        setField(term172229, term172229.getClass(), "parent", null);
        setField(term172228, term172228.getClass(), "next", term172229);
        setField(term172228, term172228.getClass(), "first", null);
        setField(term172228, term172228.getClass(), "last", null);
        setField(term172228, term172228.getClass(), "propListHead", null);
        setIntField(term172228, term172228.getClass(), "sourcePosition", 0);
        setField(term172228, term172228.getClass(), "jsType", null);
        setField(term172228, term172228.getClass(), "parent", null);
        setField(term172227, term172227.getClass(), "first", term172228);
        setField(term172227, term172227.getClass(), "last", null);
        setField(term172227, term172227.getClass(), "propListHead", null);
        setIntField(term172227, term172227.getClass(), "sourcePosition", 0);
        setField(term172227, term172227.getClass(), "jsType", null);
        setField(term172227, term172227.getClass(), "parent", null);
        term172139 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term172141 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term172148 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term172139, term172139.getClass(), "str", null);
        setIntField(term172139, term172139.getClass(), "type", 101);
        setField(term172139, term172139.getClass(), "next", null);
        setIntField(term172141, term172141.getClass(), "encodedSourceStart", 0);
        setIntField(term172141, term172141.getClass(), "encodedSourceEnd", 0);
        setField(term172141, term172141.getClass(), "sourceName", null);
        setIntField(term172141, term172141.getClass(), "baseLineno", 0);
        setIntField(term172141, term172141.getClass(), "endLineno", 0);
        setField(term172141, term172141.getClass(), "functions", null);
        setField(term172141, term172141.getClass(), "regexps", null);
        setField(term172141, term172141.getClass(), "itsVariables", null);
        setField(term172141, term172141.getClass(), "itsConst", null);
        setField(term172141, term172141.getClass(), "itsVariableNames", null);
        setIntField(term172141, term172141.getClass(), "varStart", 0);
        setField(term172141, term172141.getClass(), "compilerData", null);
        setIntField(term172141, term172141.getClass(), "type", 0);
        setField(term172148, term172148.getClass(), "functionName", null);
        setBooleanField(term172148, term172148.getClass(), "itsNeedsActivation", false);
        setIntField(term172148, term172148.getClass(), "itsFunctionType", 0);
        setBooleanField(term172148, term172148.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term172148, term172148.getClass(), "encodedSourceStart", 0);
        setIntField(term172148, term172148.getClass(), "encodedSourceEnd", 0);
        setField(term172148, term172148.getClass(), "sourceName", null);
        setIntField(term172148, term172148.getClass(), "baseLineno", 0);
        setIntField(term172148, term172148.getClass(), "endLineno", 0);
        setField(term172148, term172148.getClass(), "functions", null);
        setField(term172148, term172148.getClass(), "regexps", null);
        setField(term172148, term172148.getClass(), "itsVariables", null);
        setField(term172148, term172148.getClass(), "itsConst", null);
        setField(term172148, term172148.getClass(), "itsVariableNames", null);
        setIntField(term172148, term172148.getClass(), "varStart", 0);
        setField(term172148, term172148.getClass(), "compilerData", null);
        setIntField(term172148, term172148.getClass(), "type", 0);
        setField(term172148, term172148.getClass(), "next", null);
        setField(term172148, term172148.getClass(), "first", null);
        setField(term172148, term172148.getClass(), "last", null);
        setField(term172148, term172148.getClass(), "propListHead", null);
        setIntField(term172148, term172148.getClass(), "sourcePosition", 0);
        setField(term172148, term172148.getClass(), "jsType", null);
        setField(term172148, term172148.getClass(), "parent", null);
        setField(term172141, term172141.getClass(), "next", term172148);
        setField(term172141, term172141.getClass(), "first", null);
        setField(term172141, term172141.getClass(), "last", null);
        setField(term172141, term172141.getClass(), "propListHead", null);
        setIntField(term172141, term172141.getClass(), "sourcePosition", 0);
        setField(term172141, term172141.getClass(), "jsType", null);
        setField(term172141, term172141.getClass(), "parent", null);
        setField(term172139, term172139.getClass(), "first", term172141);
        setField(term172139, term172139.getClass(), "last", null);
        setField(term172139, term172139.getClass(), "propListHead", null);
        setIntField(term172139, term172139.getClass(), "sourcePosition", 0);
        setField(term172139, term172139.getClass(), "jsType", null);
        setField(term172139, term172139.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term171876;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term171784, args);
        assertTrue(recursiveEquals(term171784, term172226));
        assertTrue(recursiveEquals(term171876, term172227));
        assertTrue(recursiveEquals(retValue, term172139));
    }

};


