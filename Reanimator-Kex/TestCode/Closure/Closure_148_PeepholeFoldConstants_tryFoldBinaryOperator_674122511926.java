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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511926 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term215554;
     Object term215640;
     Object term215825;
     Object term215826;
     Object term215749;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511926() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term215554 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term215640 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term215726 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term215640, term215640.getClass(), "first", term215640);
        setField(term215640, term215640.getClass(), "next", term215726);
        setIntField(term215640, term215640.getClass(), "type", 16);
        term215825 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term215825, term215825.getClass(), "currentTraversal", null);
        term215826 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term215827 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term215826, term215826.getClass(), "functionName", null);
        setBooleanField(term215826, term215826.getClass(), "itsNeedsActivation", false);
        setIntField(term215826, term215826.getClass(), "itsFunctionType", 0);
        setBooleanField(term215826, term215826.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term215826, term215826.getClass(), "encodedSourceStart", 0);
        setIntField(term215826, term215826.getClass(), "encodedSourceEnd", 0);
        setField(term215826, term215826.getClass(), "sourceName", null);
        setIntField(term215826, term215826.getClass(), "baseLineno", 0);
        setIntField(term215826, term215826.getClass(), "endLineno", 0);
        setField(term215826, term215826.getClass(), "functions", null);
        setField(term215826, term215826.getClass(), "regexps", null);
        setField(term215826, term215826.getClass(), "itsVariables", null);
        setField(term215826, term215826.getClass(), "itsConst", null);
        setField(term215826, term215826.getClass(), "itsVariableNames", null);
        setIntField(term215826, term215826.getClass(), "varStart", 0);
        setField(term215826, term215826.getClass(), "compilerData", null);
        setIntField(term215826, term215826.getClass(), "type", 16);
        setField(term215827, term215827.getClass(), "functionName", null);
        setBooleanField(term215827, term215827.getClass(), "itsNeedsActivation", false);
        setIntField(term215827, term215827.getClass(), "itsFunctionType", 0);
        setBooleanField(term215827, term215827.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term215827, term215827.getClass(), "encodedSourceStart", 0);
        setIntField(term215827, term215827.getClass(), "encodedSourceEnd", 0);
        setField(term215827, term215827.getClass(), "sourceName", null);
        setIntField(term215827, term215827.getClass(), "baseLineno", 0);
        setIntField(term215827, term215827.getClass(), "endLineno", 0);
        setField(term215827, term215827.getClass(), "functions", null);
        setField(term215827, term215827.getClass(), "regexps", null);
        setField(term215827, term215827.getClass(), "itsVariables", null);
        setField(term215827, term215827.getClass(), "itsConst", null);
        setField(term215827, term215827.getClass(), "itsVariableNames", null);
        setIntField(term215827, term215827.getClass(), "varStart", 0);
        setField(term215827, term215827.getClass(), "compilerData", null);
        setIntField(term215827, term215827.getClass(), "type", 0);
        setField(term215827, term215827.getClass(), "next", null);
        setField(term215827, term215827.getClass(), "first", null);
        setField(term215827, term215827.getClass(), "last", null);
        setField(term215827, term215827.getClass(), "propListHead", null);
        setIntField(term215827, term215827.getClass(), "sourcePosition", 0);
        setField(term215827, term215827.getClass(), "jsType", null);
        setField(term215827, term215827.getClass(), "parent", null);
        setField(term215826, term215826.getClass(), "next", term215827);
        setField(term215826, term215826.getClass(), "first", term215826);
        setField(term215826, term215826.getClass(), "last", null);
        setField(term215826, term215826.getClass(), "propListHead", null);
        setIntField(term215826, term215826.getClass(), "sourcePosition", 0);
        setField(term215826, term215826.getClass(), "jsType", null);
        setField(term215826, term215826.getClass(), "parent", null);
        term215749 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term215759 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term215749, term215749.getClass(), "functionName", null);
        setBooleanField(term215749, term215749.getClass(), "itsNeedsActivation", false);
        setIntField(term215749, term215749.getClass(), "itsFunctionType", 0);
        setBooleanField(term215749, term215749.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term215749, term215749.getClass(), "encodedSourceStart", 0);
        setIntField(term215749, term215749.getClass(), "encodedSourceEnd", 0);
        setField(term215749, term215749.getClass(), "sourceName", null);
        setIntField(term215749, term215749.getClass(), "baseLineno", 0);
        setIntField(term215749, term215749.getClass(), "endLineno", 0);
        setField(term215749, term215749.getClass(), "functions", null);
        setField(term215749, term215749.getClass(), "regexps", null);
        setField(term215749, term215749.getClass(), "itsVariables", null);
        setField(term215749, term215749.getClass(), "itsConst", null);
        setField(term215749, term215749.getClass(), "itsVariableNames", null);
        setIntField(term215749, term215749.getClass(), "varStart", 0);
        setField(term215749, term215749.getClass(), "compilerData", null);
        setIntField(term215749, term215749.getClass(), "type", 16);
        setField(term215759, term215759.getClass(), "functionName", null);
        setBooleanField(term215759, term215759.getClass(), "itsNeedsActivation", false);
        setIntField(term215759, term215759.getClass(), "itsFunctionType", 0);
        setBooleanField(term215759, term215759.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term215759, term215759.getClass(), "encodedSourceStart", 0);
        setIntField(term215759, term215759.getClass(), "encodedSourceEnd", 0);
        setField(term215759, term215759.getClass(), "sourceName", null);
        setIntField(term215759, term215759.getClass(), "baseLineno", 0);
        setIntField(term215759, term215759.getClass(), "endLineno", 0);
        setField(term215759, term215759.getClass(), "functions", null);
        setField(term215759, term215759.getClass(), "regexps", null);
        setField(term215759, term215759.getClass(), "itsVariables", null);
        setField(term215759, term215759.getClass(), "itsConst", null);
        setField(term215759, term215759.getClass(), "itsVariableNames", null);
        setIntField(term215759, term215759.getClass(), "varStart", 0);
        setField(term215759, term215759.getClass(), "compilerData", null);
        setIntField(term215759, term215759.getClass(), "type", 0);
        setField(term215759, term215759.getClass(), "next", null);
        setField(term215759, term215759.getClass(), "first", null);
        setField(term215759, term215759.getClass(), "last", null);
        setField(term215759, term215759.getClass(), "propListHead", null);
        setIntField(term215759, term215759.getClass(), "sourcePosition", 0);
        setField(term215759, term215759.getClass(), "jsType", null);
        setField(term215759, term215759.getClass(), "parent", null);
        setField(term215749, term215749.getClass(), "next", term215759);
        setField(term215749, term215749.getClass(), "first", term215749);
        setField(term215749, term215749.getClass(), "last", null);
        setField(term215749, term215749.getClass(), "propListHead", null);
        setIntField(term215749, term215749.getClass(), "sourcePosition", 0);
        setField(term215749, term215749.getClass(), "jsType", null);
        setField(term215749, term215749.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term215640;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term215554, args);
        assertTrue(recursiveEquals(term215554, term215825));
        assertTrue(recursiveEquals(term215640, term215826));
        assertTrue(recursiveEquals(retValue, term215749));
    }

};


