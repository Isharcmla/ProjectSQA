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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111002 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term234498;
     Object term234584;
     Object term234820;
     Object term234821;
     Object term234755;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111002() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term234498 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term234584 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term234670 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term234740 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term234670, term234670.getClass(), "next", term234740);
        setField(term234584, term234584.getClass(), "first", term234670);
        setIntField(term234584, term234584.getClass(), "type", 9);
        term234820 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term234820, term234820.getClass(), "currentTraversal", null);
        term234821 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term234822 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term234823 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term234821, term234821.getClass(), "functionName", null);
        setBooleanField(term234821, term234821.getClass(), "itsNeedsActivation", false);
        setIntField(term234821, term234821.getClass(), "itsFunctionType", 0);
        setBooleanField(term234821, term234821.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term234821, term234821.getClass(), "encodedSourceStart", 0);
        setIntField(term234821, term234821.getClass(), "encodedSourceEnd", 0);
        setField(term234821, term234821.getClass(), "sourceName", null);
        setIntField(term234821, term234821.getClass(), "baseLineno", 0);
        setIntField(term234821, term234821.getClass(), "endLineno", 0);
        setField(term234821, term234821.getClass(), "functions", null);
        setField(term234821, term234821.getClass(), "regexps", null);
        setField(term234821, term234821.getClass(), "itsVariables", null);
        setField(term234821, term234821.getClass(), "itsConst", null);
        setField(term234821, term234821.getClass(), "itsVariableNames", null);
        setIntField(term234821, term234821.getClass(), "varStart", 0);
        setField(term234821, term234821.getClass(), "compilerData", null);
        setIntField(term234821, term234821.getClass(), "type", 9);
        setField(term234821, term234821.getClass(), "next", null);
        setField(term234822, term234822.getClass(), "functionName", null);
        setBooleanField(term234822, term234822.getClass(), "itsNeedsActivation", false);
        setIntField(term234822, term234822.getClass(), "itsFunctionType", 0);
        setBooleanField(term234822, term234822.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term234822, term234822.getClass(), "encodedSourceStart", 0);
        setIntField(term234822, term234822.getClass(), "encodedSourceEnd", 0);
        setField(term234822, term234822.getClass(), "sourceName", null);
        setIntField(term234822, term234822.getClass(), "baseLineno", 0);
        setIntField(term234822, term234822.getClass(), "endLineno", 0);
        setField(term234822, term234822.getClass(), "functions", null);
        setField(term234822, term234822.getClass(), "regexps", null);
        setField(term234822, term234822.getClass(), "itsVariables", null);
        setField(term234822, term234822.getClass(), "itsConst", null);
        setField(term234822, term234822.getClass(), "itsVariableNames", null);
        setIntField(term234822, term234822.getClass(), "varStart", 0);
        setField(term234822, term234822.getClass(), "compilerData", null);
        setIntField(term234822, term234822.getClass(), "type", 0);
        setIntField(term234823, term234823.getClass(), "type", 0);
        setField(term234823, term234823.getClass(), "next", null);
        setField(term234823, term234823.getClass(), "first", null);
        setField(term234823, term234823.getClass(), "last", null);
        setField(term234823, term234823.getClass(), "propListHead", null);
        setIntField(term234823, term234823.getClass(), "sourcePosition", 0);
        setField(term234823, term234823.getClass(), "jsType", null);
        setField(term234823, term234823.getClass(), "parent", null);
        setField(term234822, term234822.getClass(), "next", term234823);
        setField(term234822, term234822.getClass(), "first", null);
        setField(term234822, term234822.getClass(), "last", null);
        setField(term234822, term234822.getClass(), "propListHead", null);
        setIntField(term234822, term234822.getClass(), "sourcePosition", 0);
        setField(term234822, term234822.getClass(), "jsType", null);
        setField(term234822, term234822.getClass(), "parent", null);
        setField(term234821, term234821.getClass(), "first", term234822);
        setField(term234821, term234821.getClass(), "last", null);
        setField(term234821, term234821.getClass(), "propListHead", null);
        setIntField(term234821, term234821.getClass(), "sourcePosition", 0);
        setField(term234821, term234821.getClass(), "jsType", null);
        setField(term234821, term234821.getClass(), "parent", null);
        term234755 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term234765 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term234775 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term234755, term234755.getClass(), "functionName", null);
        setBooleanField(term234755, term234755.getClass(), "itsNeedsActivation", false);
        setIntField(term234755, term234755.getClass(), "itsFunctionType", 0);
        setBooleanField(term234755, term234755.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term234755, term234755.getClass(), "encodedSourceStart", 0);
        setIntField(term234755, term234755.getClass(), "encodedSourceEnd", 0);
        setField(term234755, term234755.getClass(), "sourceName", null);
        setIntField(term234755, term234755.getClass(), "baseLineno", 0);
        setIntField(term234755, term234755.getClass(), "endLineno", 0);
        setField(term234755, term234755.getClass(), "functions", null);
        setField(term234755, term234755.getClass(), "regexps", null);
        setField(term234755, term234755.getClass(), "itsVariables", null);
        setField(term234755, term234755.getClass(), "itsConst", null);
        setField(term234755, term234755.getClass(), "itsVariableNames", null);
        setIntField(term234755, term234755.getClass(), "varStart", 0);
        setField(term234755, term234755.getClass(), "compilerData", null);
        setIntField(term234755, term234755.getClass(), "type", 9);
        setField(term234755, term234755.getClass(), "next", null);
        setField(term234765, term234765.getClass(), "functionName", null);
        setBooleanField(term234765, term234765.getClass(), "itsNeedsActivation", false);
        setIntField(term234765, term234765.getClass(), "itsFunctionType", 0);
        setBooleanField(term234765, term234765.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term234765, term234765.getClass(), "encodedSourceStart", 0);
        setIntField(term234765, term234765.getClass(), "encodedSourceEnd", 0);
        setField(term234765, term234765.getClass(), "sourceName", null);
        setIntField(term234765, term234765.getClass(), "baseLineno", 0);
        setIntField(term234765, term234765.getClass(), "endLineno", 0);
        setField(term234765, term234765.getClass(), "functions", null);
        setField(term234765, term234765.getClass(), "regexps", null);
        setField(term234765, term234765.getClass(), "itsVariables", null);
        setField(term234765, term234765.getClass(), "itsConst", null);
        setField(term234765, term234765.getClass(), "itsVariableNames", null);
        setIntField(term234765, term234765.getClass(), "varStart", 0);
        setField(term234765, term234765.getClass(), "compilerData", null);
        setIntField(term234765, term234765.getClass(), "type", 0);
        setIntField(term234775, term234775.getClass(), "type", 0);
        setField(term234775, term234775.getClass(), "next", null);
        setField(term234775, term234775.getClass(), "first", null);
        setField(term234775, term234775.getClass(), "last", null);
        setField(term234775, term234775.getClass(), "propListHead", null);
        setIntField(term234775, term234775.getClass(), "sourcePosition", 0);
        setField(term234775, term234775.getClass(), "jsType", null);
        setField(term234775, term234775.getClass(), "parent", null);
        setField(term234765, term234765.getClass(), "next", term234775);
        setField(term234765, term234765.getClass(), "first", null);
        setField(term234765, term234765.getClass(), "last", null);
        setField(term234765, term234765.getClass(), "propListHead", null);
        setIntField(term234765, term234765.getClass(), "sourcePosition", 0);
        setField(term234765, term234765.getClass(), "jsType", null);
        setField(term234765, term234765.getClass(), "parent", null);
        setField(term234755, term234755.getClass(), "first", term234765);
        setField(term234755, term234755.getClass(), "last", null);
        setField(term234755, term234755.getClass(), "propListHead", null);
        setIntField(term234755, term234755.getClass(), "sourcePosition", 0);
        setField(term234755, term234755.getClass(), "jsType", null);
        setField(term234755, term234755.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term234584;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term234498, args);
        assertTrue(recursiveEquals(term234498, term234820));
        assertTrue(recursiveEquals(term234584, term234821));
        assertTrue(recursiveEquals(retValue, term234755));
    }

};


