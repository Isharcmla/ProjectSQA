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

public class PeepholeFoldConstants_tryFoldComparison_848443179336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64294;
     Object term64380;
     Object term64466;
     Object term64552;
     Object term80908;
     Object term80909;
     Object term80910;
     Object term80911;
     Object term80826;

    public PeepholeFoldConstants_tryFoldComparison_848443179336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64294 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term64380 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term64380, term64380.getClass(), "type", 16);
        term64466 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term64466, term64466.getClass(), "type", 42);
        term64552 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term64552, term64552.getClass(), "type", 16);
        term80908 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term80908, term80908.getClass(), "currentTraversal", null);
        term80909 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term80909, term80909.getClass(), "functionName", null);
        setBooleanField(term80909, term80909.getClass(), "itsNeedsActivation", false);
        setIntField(term80909, term80909.getClass(), "itsFunctionType", 0);
        setBooleanField(term80909, term80909.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term80909, term80909.getClass(), "encodedSourceStart", 0);
        setIntField(term80909, term80909.getClass(), "encodedSourceEnd", 0);
        setField(term80909, term80909.getClass(), "sourceName", null);
        setIntField(term80909, term80909.getClass(), "baseLineno", 0);
        setIntField(term80909, term80909.getClass(), "endLineno", 0);
        setField(term80909, term80909.getClass(), "functions", null);
        setField(term80909, term80909.getClass(), "regexps", null);
        setField(term80909, term80909.getClass(), "itsVariables", null);
        setField(term80909, term80909.getClass(), "itsConst", null);
        setField(term80909, term80909.getClass(), "itsVariableNames", null);
        setIntField(term80909, term80909.getClass(), "varStart", 0);
        setField(term80909, term80909.getClass(), "compilerData", null);
        setIntField(term80909, term80909.getClass(), "type", 42);
        setField(term80909, term80909.getClass(), "next", null);
        setField(term80909, term80909.getClass(), "first", null);
        setField(term80909, term80909.getClass(), "last", null);
        setField(term80909, term80909.getClass(), "propListHead", null);
        setIntField(term80909, term80909.getClass(), "sourcePosition", 0);
        setField(term80909, term80909.getClass(), "jsType", null);
        setField(term80909, term80909.getClass(), "parent", null);
        term80910 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term80910, term80910.getClass(), "functionName", null);
        setBooleanField(term80910, term80910.getClass(), "itsNeedsActivation", false);
        setIntField(term80910, term80910.getClass(), "itsFunctionType", 0);
        setBooleanField(term80910, term80910.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term80910, term80910.getClass(), "encodedSourceStart", 0);
        setIntField(term80910, term80910.getClass(), "encodedSourceEnd", 0);
        setField(term80910, term80910.getClass(), "sourceName", null);
        setIntField(term80910, term80910.getClass(), "baseLineno", 0);
        setIntField(term80910, term80910.getClass(), "endLineno", 0);
        setField(term80910, term80910.getClass(), "functions", null);
        setField(term80910, term80910.getClass(), "regexps", null);
        setField(term80910, term80910.getClass(), "itsVariables", null);
        setField(term80910, term80910.getClass(), "itsConst", null);
        setField(term80910, term80910.getClass(), "itsVariableNames", null);
        setIntField(term80910, term80910.getClass(), "varStart", 0);
        setField(term80910, term80910.getClass(), "compilerData", null);
        setIntField(term80910, term80910.getClass(), "type", 16);
        setField(term80910, term80910.getClass(), "next", null);
        setField(term80910, term80910.getClass(), "first", null);
        setField(term80910, term80910.getClass(), "last", null);
        setField(term80910, term80910.getClass(), "propListHead", null);
        setIntField(term80910, term80910.getClass(), "sourcePosition", 0);
        setField(term80910, term80910.getClass(), "jsType", null);
        setField(term80910, term80910.getClass(), "parent", null);
        term80911 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term80911, term80911.getClass(), "functionName", null);
        setBooleanField(term80911, term80911.getClass(), "itsNeedsActivation", false);
        setIntField(term80911, term80911.getClass(), "itsFunctionType", 0);
        setBooleanField(term80911, term80911.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term80911, term80911.getClass(), "encodedSourceStart", 0);
        setIntField(term80911, term80911.getClass(), "encodedSourceEnd", 0);
        setField(term80911, term80911.getClass(), "sourceName", null);
        setIntField(term80911, term80911.getClass(), "baseLineno", 0);
        setIntField(term80911, term80911.getClass(), "endLineno", 0);
        setField(term80911, term80911.getClass(), "functions", null);
        setField(term80911, term80911.getClass(), "regexps", null);
        setField(term80911, term80911.getClass(), "itsVariables", null);
        setField(term80911, term80911.getClass(), "itsConst", null);
        setField(term80911, term80911.getClass(), "itsVariableNames", null);
        setIntField(term80911, term80911.getClass(), "varStart", 0);
        setField(term80911, term80911.getClass(), "compilerData", null);
        setIntField(term80911, term80911.getClass(), "type", 16);
        setField(term80911, term80911.getClass(), "next", null);
        setField(term80911, term80911.getClass(), "first", null);
        setField(term80911, term80911.getClass(), "last", null);
        setField(term80911, term80911.getClass(), "propListHead", null);
        setIntField(term80911, term80911.getClass(), "sourcePosition", 0);
        setField(term80911, term80911.getClass(), "jsType", null);
        setField(term80911, term80911.getClass(), "parent", null);
        term80826 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term80826, term80826.getClass(), "functionName", null);
        setBooleanField(term80826, term80826.getClass(), "itsNeedsActivation", false);
        setIntField(term80826, term80826.getClass(), "itsFunctionType", 0);
        setBooleanField(term80826, term80826.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term80826, term80826.getClass(), "encodedSourceStart", 0);
        setIntField(term80826, term80826.getClass(), "encodedSourceEnd", 0);
        setField(term80826, term80826.getClass(), "sourceName", null);
        setIntField(term80826, term80826.getClass(), "baseLineno", 0);
        setIntField(term80826, term80826.getClass(), "endLineno", 0);
        setField(term80826, term80826.getClass(), "functions", null);
        setField(term80826, term80826.getClass(), "regexps", null);
        setField(term80826, term80826.getClass(), "itsVariables", null);
        setField(term80826, term80826.getClass(), "itsConst", null);
        setField(term80826, term80826.getClass(), "itsVariableNames", null);
        setIntField(term80826, term80826.getClass(), "varStart", 0);
        setField(term80826, term80826.getClass(), "compilerData", null);
        setIntField(term80826, term80826.getClass(), "type", 16);
        setField(term80826, term80826.getClass(), "next", null);
        setField(term80826, term80826.getClass(), "first", null);
        setField(term80826, term80826.getClass(), "last", null);
        setField(term80826, term80826.getClass(), "propListHead", null);
        setIntField(term80826, term80826.getClass(), "sourcePosition", 0);
        setField(term80826, term80826.getClass(), "jsType", null);
        setField(term80826, term80826.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term64380;
        args[1] = term64466;
        args[2] = term64552;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term64294, args);
        assertTrue(recursiveEquals(term64294, term80908));
        assertTrue(recursiveEquals(term64380, term80909));
        assertTrue(recursiveEquals(term64466, term80910));
        assertTrue(recursiveEquals(term64552, term80911));
        assertTrue(recursiveEquals(retValue, term80826));
    }

};


