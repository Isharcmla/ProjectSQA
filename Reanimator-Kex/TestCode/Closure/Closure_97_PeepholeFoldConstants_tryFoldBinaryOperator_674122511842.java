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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511842 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term240706;
     Object term240792;
     Object term241050;
     Object term241051;
     Object term240986;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511842() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term240706 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term240792 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term240878 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term240970 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term240878, term240878.getClass(), "next", term240970);
        setIntField(term240878, term240878.getClass(), "type", 39);
        setField(term240792, term240792.getClass(), "first", term240878);
        setIntField(term240792, term240792.getClass(), "type", 18);
        term241050 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term241050, term241050.getClass(), "currentTraversal", null);
        term241051 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term241052 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term241053 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term241051, term241051.getClass(), "functionName", null);
        setBooleanField(term241051, term241051.getClass(), "itsNeedsActivation", false);
        setIntField(term241051, term241051.getClass(), "itsFunctionType", 0);
        setBooleanField(term241051, term241051.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term241051, term241051.getClass(), "encodedSourceStart", 0);
        setIntField(term241051, term241051.getClass(), "encodedSourceEnd", 0);
        setField(term241051, term241051.getClass(), "sourceName", null);
        setIntField(term241051, term241051.getClass(), "baseLineno", 0);
        setIntField(term241051, term241051.getClass(), "endLineno", 0);
        setField(term241051, term241051.getClass(), "functions", null);
        setField(term241051, term241051.getClass(), "regexps", null);
        setField(term241051, term241051.getClass(), "itsVariables", null);
        setField(term241051, term241051.getClass(), "itsConst", null);
        setField(term241051, term241051.getClass(), "itsVariableNames", null);
        setIntField(term241051, term241051.getClass(), "varStart", 0);
        setField(term241051, term241051.getClass(), "compilerData", null);
        setIntField(term241051, term241051.getClass(), "type", 18);
        setField(term241051, term241051.getClass(), "next", null);
        setField(term241052, term241052.getClass(), "functionName", null);
        setBooleanField(term241052, term241052.getClass(), "itsNeedsActivation", false);
        setIntField(term241052, term241052.getClass(), "itsFunctionType", 0);
        setBooleanField(term241052, term241052.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term241052, term241052.getClass(), "encodedSourceStart", 0);
        setIntField(term241052, term241052.getClass(), "encodedSourceEnd", 0);
        setField(term241052, term241052.getClass(), "sourceName", null);
        setIntField(term241052, term241052.getClass(), "baseLineno", 0);
        setIntField(term241052, term241052.getClass(), "endLineno", 0);
        setField(term241052, term241052.getClass(), "functions", null);
        setField(term241052, term241052.getClass(), "regexps", null);
        setField(term241052, term241052.getClass(), "itsVariables", null);
        setField(term241052, term241052.getClass(), "itsConst", null);
        setField(term241052, term241052.getClass(), "itsVariableNames", null);
        setIntField(term241052, term241052.getClass(), "varStart", 0);
        setField(term241052, term241052.getClass(), "compilerData", null);
        setIntField(term241052, term241052.getClass(), "type", 39);
        setDoubleField(term241053, term241053.getClass(), "number", 0.0);
        setIntField(term241053, term241053.getClass(), "type", 0);
        setField(term241053, term241053.getClass(), "next", null);
        setField(term241053, term241053.getClass(), "first", null);
        setField(term241053, term241053.getClass(), "last", null);
        setField(term241053, term241053.getClass(), "propListHead", null);
        setIntField(term241053, term241053.getClass(), "sourcePosition", 0);
        setField(term241053, term241053.getClass(), "jsType", null);
        setField(term241053, term241053.getClass(), "parent", null);
        setField(term241052, term241052.getClass(), "next", term241053);
        setField(term241052, term241052.getClass(), "first", null);
        setField(term241052, term241052.getClass(), "last", null);
        setField(term241052, term241052.getClass(), "propListHead", null);
        setIntField(term241052, term241052.getClass(), "sourcePosition", 0);
        setField(term241052, term241052.getClass(), "jsType", null);
        setField(term241052, term241052.getClass(), "parent", null);
        setField(term241051, term241051.getClass(), "first", term241052);
        setField(term241051, term241051.getClass(), "last", null);
        setField(term241051, term241051.getClass(), "propListHead", null);
        setIntField(term241051, term241051.getClass(), "sourcePosition", 0);
        setField(term241051, term241051.getClass(), "jsType", null);
        setField(term241051, term241051.getClass(), "parent", null);
        term240986 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term240996 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term241006 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term240986, term240986.getClass(), "functionName", null);
        setBooleanField(term240986, term240986.getClass(), "itsNeedsActivation", false);
        setIntField(term240986, term240986.getClass(), "itsFunctionType", 0);
        setBooleanField(term240986, term240986.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term240986, term240986.getClass(), "encodedSourceStart", 0);
        setIntField(term240986, term240986.getClass(), "encodedSourceEnd", 0);
        setField(term240986, term240986.getClass(), "sourceName", null);
        setIntField(term240986, term240986.getClass(), "baseLineno", 0);
        setIntField(term240986, term240986.getClass(), "endLineno", 0);
        setField(term240986, term240986.getClass(), "functions", null);
        setField(term240986, term240986.getClass(), "regexps", null);
        setField(term240986, term240986.getClass(), "itsVariables", null);
        setField(term240986, term240986.getClass(), "itsConst", null);
        setField(term240986, term240986.getClass(), "itsVariableNames", null);
        setIntField(term240986, term240986.getClass(), "varStart", 0);
        setField(term240986, term240986.getClass(), "compilerData", null);
        setIntField(term240986, term240986.getClass(), "type", 18);
        setField(term240986, term240986.getClass(), "next", null);
        setField(term240996, term240996.getClass(), "functionName", null);
        setBooleanField(term240996, term240996.getClass(), "itsNeedsActivation", false);
        setIntField(term240996, term240996.getClass(), "itsFunctionType", 0);
        setBooleanField(term240996, term240996.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term240996, term240996.getClass(), "encodedSourceStart", 0);
        setIntField(term240996, term240996.getClass(), "encodedSourceEnd", 0);
        setField(term240996, term240996.getClass(), "sourceName", null);
        setIntField(term240996, term240996.getClass(), "baseLineno", 0);
        setIntField(term240996, term240996.getClass(), "endLineno", 0);
        setField(term240996, term240996.getClass(), "functions", null);
        setField(term240996, term240996.getClass(), "regexps", null);
        setField(term240996, term240996.getClass(), "itsVariables", null);
        setField(term240996, term240996.getClass(), "itsConst", null);
        setField(term240996, term240996.getClass(), "itsVariableNames", null);
        setIntField(term240996, term240996.getClass(), "varStart", 0);
        setField(term240996, term240996.getClass(), "compilerData", null);
        setIntField(term240996, term240996.getClass(), "type", 39);
        setDoubleField(term241006, term241006.getClass(), "number", 0.0);
        setIntField(term241006, term241006.getClass(), "type", 0);
        setField(term241006, term241006.getClass(), "next", null);
        setField(term241006, term241006.getClass(), "first", null);
        setField(term241006, term241006.getClass(), "last", null);
        setField(term241006, term241006.getClass(), "propListHead", null);
        setIntField(term241006, term241006.getClass(), "sourcePosition", 0);
        setField(term241006, term241006.getClass(), "jsType", null);
        setField(term241006, term241006.getClass(), "parent", null);
        setField(term240996, term240996.getClass(), "next", term241006);
        setField(term240996, term240996.getClass(), "first", null);
        setField(term240996, term240996.getClass(), "last", null);
        setField(term240996, term240996.getClass(), "propListHead", null);
        setIntField(term240996, term240996.getClass(), "sourcePosition", 0);
        setField(term240996, term240996.getClass(), "jsType", null);
        setField(term240996, term240996.getClass(), "parent", null);
        setField(term240986, term240986.getClass(), "first", term240996);
        setField(term240986, term240986.getClass(), "last", null);
        setField(term240986, term240986.getClass(), "propListHead", null);
        setIntField(term240986, term240986.getClass(), "sourcePosition", 0);
        setField(term240986, term240986.getClass(), "jsType", null);
        setField(term240986, term240986.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term240792;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term240706, args);
        assertTrue(recursiveEquals(term240706, term241050));
        assertTrue(recursiveEquals(term240792, term241051));
        assertTrue(recursiveEquals(retValue, term240986));
    }

};


