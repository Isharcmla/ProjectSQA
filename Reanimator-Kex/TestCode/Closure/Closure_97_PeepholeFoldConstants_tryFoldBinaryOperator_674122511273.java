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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53807;
     Object term53893;
     Object term54650;
     Object term54651;
     Object term54584;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53807 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term53893 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term53979 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term54049 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term53979, term53979.getClass(), "next", term54049);
        setField(term53893, term53893.getClass(), "first", term53979);
        setIntField(term53893, term53893.getClass(), "type", 12);
        term54650 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term54650, term54650.getClass(), "currentTraversal", null);
        term54651 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term54652 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term54653 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term54651, term54651.getClass(), "functionName", null);
        setBooleanField(term54651, term54651.getClass(), "itsNeedsActivation", false);
        setIntField(term54651, term54651.getClass(), "itsFunctionType", 0);
        setBooleanField(term54651, term54651.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term54651, term54651.getClass(), "encodedSourceStart", 0);
        setIntField(term54651, term54651.getClass(), "encodedSourceEnd", 0);
        setField(term54651, term54651.getClass(), "sourceName", null);
        setIntField(term54651, term54651.getClass(), "baseLineno", 0);
        setIntField(term54651, term54651.getClass(), "endLineno", 0);
        setField(term54651, term54651.getClass(), "functions", null);
        setField(term54651, term54651.getClass(), "regexps", null);
        setField(term54651, term54651.getClass(), "itsVariables", null);
        setField(term54651, term54651.getClass(), "itsConst", null);
        setField(term54651, term54651.getClass(), "itsVariableNames", null);
        setIntField(term54651, term54651.getClass(), "varStart", 0);
        setField(term54651, term54651.getClass(), "compilerData", null);
        setIntField(term54651, term54651.getClass(), "type", 12);
        setField(term54651, term54651.getClass(), "next", null);
        setField(term54652, term54652.getClass(), "functionName", null);
        setBooleanField(term54652, term54652.getClass(), "itsNeedsActivation", false);
        setIntField(term54652, term54652.getClass(), "itsFunctionType", 0);
        setBooleanField(term54652, term54652.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term54652, term54652.getClass(), "encodedSourceStart", 0);
        setIntField(term54652, term54652.getClass(), "encodedSourceEnd", 0);
        setField(term54652, term54652.getClass(), "sourceName", null);
        setIntField(term54652, term54652.getClass(), "baseLineno", 0);
        setIntField(term54652, term54652.getClass(), "endLineno", 0);
        setField(term54652, term54652.getClass(), "functions", null);
        setField(term54652, term54652.getClass(), "regexps", null);
        setField(term54652, term54652.getClass(), "itsVariables", null);
        setField(term54652, term54652.getClass(), "itsConst", null);
        setField(term54652, term54652.getClass(), "itsVariableNames", null);
        setIntField(term54652, term54652.getClass(), "varStart", 0);
        setField(term54652, term54652.getClass(), "compilerData", null);
        setIntField(term54652, term54652.getClass(), "type", 0);
        setIntField(term54653, term54653.getClass(), "type", 0);
        setField(term54653, term54653.getClass(), "next", null);
        setField(term54653, term54653.getClass(), "first", null);
        setField(term54653, term54653.getClass(), "last", null);
        setField(term54653, term54653.getClass(), "propListHead", null);
        setIntField(term54653, term54653.getClass(), "sourcePosition", 0);
        setField(term54653, term54653.getClass(), "jsType", null);
        setField(term54653, term54653.getClass(), "parent", null);
        setField(term54652, term54652.getClass(), "next", term54653);
        setField(term54652, term54652.getClass(), "first", null);
        setField(term54652, term54652.getClass(), "last", null);
        setField(term54652, term54652.getClass(), "propListHead", null);
        setIntField(term54652, term54652.getClass(), "sourcePosition", 0);
        setField(term54652, term54652.getClass(), "jsType", null);
        setField(term54652, term54652.getClass(), "parent", null);
        setField(term54651, term54651.getClass(), "first", term54652);
        setField(term54651, term54651.getClass(), "last", null);
        setField(term54651, term54651.getClass(), "propListHead", null);
        setIntField(term54651, term54651.getClass(), "sourcePosition", 0);
        setField(term54651, term54651.getClass(), "jsType", null);
        setField(term54651, term54651.getClass(), "parent", null);
        term54584 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term54594 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term54604 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term54584, term54584.getClass(), "functionName", null);
        setBooleanField(term54584, term54584.getClass(), "itsNeedsActivation", false);
        setIntField(term54584, term54584.getClass(), "itsFunctionType", 0);
        setBooleanField(term54584, term54584.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term54584, term54584.getClass(), "encodedSourceStart", 0);
        setIntField(term54584, term54584.getClass(), "encodedSourceEnd", 0);
        setField(term54584, term54584.getClass(), "sourceName", null);
        setIntField(term54584, term54584.getClass(), "baseLineno", 0);
        setIntField(term54584, term54584.getClass(), "endLineno", 0);
        setField(term54584, term54584.getClass(), "functions", null);
        setField(term54584, term54584.getClass(), "regexps", null);
        setField(term54584, term54584.getClass(), "itsVariables", null);
        setField(term54584, term54584.getClass(), "itsConst", null);
        setField(term54584, term54584.getClass(), "itsVariableNames", null);
        setIntField(term54584, term54584.getClass(), "varStart", 0);
        setField(term54584, term54584.getClass(), "compilerData", null);
        setIntField(term54584, term54584.getClass(), "type", 12);
        setField(term54584, term54584.getClass(), "next", null);
        setField(term54594, term54594.getClass(), "functionName", null);
        setBooleanField(term54594, term54594.getClass(), "itsNeedsActivation", false);
        setIntField(term54594, term54594.getClass(), "itsFunctionType", 0);
        setBooleanField(term54594, term54594.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term54594, term54594.getClass(), "encodedSourceStart", 0);
        setIntField(term54594, term54594.getClass(), "encodedSourceEnd", 0);
        setField(term54594, term54594.getClass(), "sourceName", null);
        setIntField(term54594, term54594.getClass(), "baseLineno", 0);
        setIntField(term54594, term54594.getClass(), "endLineno", 0);
        setField(term54594, term54594.getClass(), "functions", null);
        setField(term54594, term54594.getClass(), "regexps", null);
        setField(term54594, term54594.getClass(), "itsVariables", null);
        setField(term54594, term54594.getClass(), "itsConst", null);
        setField(term54594, term54594.getClass(), "itsVariableNames", null);
        setIntField(term54594, term54594.getClass(), "varStart", 0);
        setField(term54594, term54594.getClass(), "compilerData", null);
        setIntField(term54594, term54594.getClass(), "type", 0);
        setIntField(term54604, term54604.getClass(), "type", 0);
        setField(term54604, term54604.getClass(), "next", null);
        setField(term54604, term54604.getClass(), "first", null);
        setField(term54604, term54604.getClass(), "last", null);
        setField(term54604, term54604.getClass(), "propListHead", null);
        setIntField(term54604, term54604.getClass(), "sourcePosition", 0);
        setField(term54604, term54604.getClass(), "jsType", null);
        setField(term54604, term54604.getClass(), "parent", null);
        setField(term54594, term54594.getClass(), "next", term54604);
        setField(term54594, term54594.getClass(), "first", null);
        setField(term54594, term54594.getClass(), "last", null);
        setField(term54594, term54594.getClass(), "propListHead", null);
        setIntField(term54594, term54594.getClass(), "sourcePosition", 0);
        setField(term54594, term54594.getClass(), "jsType", null);
        setField(term54594, term54594.getClass(), "parent", null);
        setField(term54584, term54584.getClass(), "first", term54594);
        setField(term54584, term54584.getClass(), "last", null);
        setField(term54584, term54584.getClass(), "propListHead", null);
        setIntField(term54584, term54584.getClass(), "sourcePosition", 0);
        setField(term54584, term54584.getClass(), "jsType", null);
        setField(term54584, term54584.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term53893;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term53807, args);
        assertTrue(recursiveEquals(term53807, term54650));
        assertTrue(recursiveEquals(term53893, term54651));
        assertTrue(recursiveEquals(retValue, term54584));
    }

};


