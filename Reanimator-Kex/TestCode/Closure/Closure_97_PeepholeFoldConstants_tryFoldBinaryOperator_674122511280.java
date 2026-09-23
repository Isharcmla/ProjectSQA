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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55409;
     Object term55495;
     Object term55820;
     Object term55821;
     Object term55727;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55409 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term55495 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term55565 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term55651 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term55565, term55565.getClass(), "next", term55651);
        setIntField(term55565, term55565.getClass(), "type", 0);
        setField(term55495, term55495.getClass(), "first", term55565);
        setIntField(term55495, term55495.getClass(), "type", 100);
        setField(term55495, term55495.getClass(), "parent", null);
        term55820 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term55820, term55820.getClass(), "currentTraversal", null);
        term55821 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term55822 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term55823 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term55821, term55821.getClass(), "functionName", null);
        setBooleanField(term55821, term55821.getClass(), "itsNeedsActivation", false);
        setIntField(term55821, term55821.getClass(), "itsFunctionType", 0);
        setBooleanField(term55821, term55821.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term55821, term55821.getClass(), "encodedSourceStart", 0);
        setIntField(term55821, term55821.getClass(), "encodedSourceEnd", 0);
        setField(term55821, term55821.getClass(), "sourceName", null);
        setIntField(term55821, term55821.getClass(), "baseLineno", 0);
        setIntField(term55821, term55821.getClass(), "endLineno", 0);
        setField(term55821, term55821.getClass(), "functions", null);
        setField(term55821, term55821.getClass(), "regexps", null);
        setField(term55821, term55821.getClass(), "itsVariables", null);
        setField(term55821, term55821.getClass(), "itsConst", null);
        setField(term55821, term55821.getClass(), "itsVariableNames", null);
        setIntField(term55821, term55821.getClass(), "varStart", 0);
        setField(term55821, term55821.getClass(), "compilerData", null);
        setIntField(term55821, term55821.getClass(), "type", 100);
        setField(term55821, term55821.getClass(), "next", null);
        setIntField(term55822, term55822.getClass(), "type", 0);
        setField(term55823, term55823.getClass(), "functionName", null);
        setBooleanField(term55823, term55823.getClass(), "itsNeedsActivation", false);
        setIntField(term55823, term55823.getClass(), "itsFunctionType", 0);
        setBooleanField(term55823, term55823.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term55823, term55823.getClass(), "encodedSourceStart", 0);
        setIntField(term55823, term55823.getClass(), "encodedSourceEnd", 0);
        setField(term55823, term55823.getClass(), "sourceName", null);
        setIntField(term55823, term55823.getClass(), "baseLineno", 0);
        setIntField(term55823, term55823.getClass(), "endLineno", 0);
        setField(term55823, term55823.getClass(), "functions", null);
        setField(term55823, term55823.getClass(), "regexps", null);
        setField(term55823, term55823.getClass(), "itsVariables", null);
        setField(term55823, term55823.getClass(), "itsConst", null);
        setField(term55823, term55823.getClass(), "itsVariableNames", null);
        setIntField(term55823, term55823.getClass(), "varStart", 0);
        setField(term55823, term55823.getClass(), "compilerData", null);
        setIntField(term55823, term55823.getClass(), "type", 0);
        setField(term55823, term55823.getClass(), "next", null);
        setField(term55823, term55823.getClass(), "first", null);
        setField(term55823, term55823.getClass(), "last", null);
        setField(term55823, term55823.getClass(), "propListHead", null);
        setIntField(term55823, term55823.getClass(), "sourcePosition", 0);
        setField(term55823, term55823.getClass(), "jsType", null);
        setField(term55823, term55823.getClass(), "parent", null);
        setField(term55822, term55822.getClass(), "next", term55823);
        setField(term55822, term55822.getClass(), "first", null);
        setField(term55822, term55822.getClass(), "last", null);
        setField(term55822, term55822.getClass(), "propListHead", null);
        setIntField(term55822, term55822.getClass(), "sourcePosition", 0);
        setField(term55822, term55822.getClass(), "jsType", null);
        setField(term55822, term55822.getClass(), "parent", null);
        setField(term55821, term55821.getClass(), "first", term55822);
        setField(term55821, term55821.getClass(), "last", null);
        setField(term55821, term55821.getClass(), "propListHead", null);
        setIntField(term55821, term55821.getClass(), "sourcePosition", 0);
        setField(term55821, term55821.getClass(), "jsType", null);
        setField(term55821, term55821.getClass(), "parent", null);
        term55727 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term55737 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term55739 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term55727, term55727.getClass(), "functionName", null);
        setBooleanField(term55727, term55727.getClass(), "itsNeedsActivation", false);
        setIntField(term55727, term55727.getClass(), "itsFunctionType", 0);
        setBooleanField(term55727, term55727.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term55727, term55727.getClass(), "encodedSourceStart", 0);
        setIntField(term55727, term55727.getClass(), "encodedSourceEnd", 0);
        setField(term55727, term55727.getClass(), "sourceName", null);
        setIntField(term55727, term55727.getClass(), "baseLineno", 0);
        setIntField(term55727, term55727.getClass(), "endLineno", 0);
        setField(term55727, term55727.getClass(), "functions", null);
        setField(term55727, term55727.getClass(), "regexps", null);
        setField(term55727, term55727.getClass(), "itsVariables", null);
        setField(term55727, term55727.getClass(), "itsConst", null);
        setField(term55727, term55727.getClass(), "itsVariableNames", null);
        setIntField(term55727, term55727.getClass(), "varStart", 0);
        setField(term55727, term55727.getClass(), "compilerData", null);
        setIntField(term55727, term55727.getClass(), "type", 100);
        setField(term55727, term55727.getClass(), "next", null);
        setIntField(term55737, term55737.getClass(), "type", 0);
        setField(term55739, term55739.getClass(), "functionName", null);
        setBooleanField(term55739, term55739.getClass(), "itsNeedsActivation", false);
        setIntField(term55739, term55739.getClass(), "itsFunctionType", 0);
        setBooleanField(term55739, term55739.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term55739, term55739.getClass(), "encodedSourceStart", 0);
        setIntField(term55739, term55739.getClass(), "encodedSourceEnd", 0);
        setField(term55739, term55739.getClass(), "sourceName", null);
        setIntField(term55739, term55739.getClass(), "baseLineno", 0);
        setIntField(term55739, term55739.getClass(), "endLineno", 0);
        setField(term55739, term55739.getClass(), "functions", null);
        setField(term55739, term55739.getClass(), "regexps", null);
        setField(term55739, term55739.getClass(), "itsVariables", null);
        setField(term55739, term55739.getClass(), "itsConst", null);
        setField(term55739, term55739.getClass(), "itsVariableNames", null);
        setIntField(term55739, term55739.getClass(), "varStart", 0);
        setField(term55739, term55739.getClass(), "compilerData", null);
        setIntField(term55739, term55739.getClass(), "type", 0);
        setField(term55739, term55739.getClass(), "next", null);
        setField(term55739, term55739.getClass(), "first", null);
        setField(term55739, term55739.getClass(), "last", null);
        setField(term55739, term55739.getClass(), "propListHead", null);
        setIntField(term55739, term55739.getClass(), "sourcePosition", 0);
        setField(term55739, term55739.getClass(), "jsType", null);
        setField(term55739, term55739.getClass(), "parent", null);
        setField(term55737, term55737.getClass(), "next", term55739);
        setField(term55737, term55737.getClass(), "first", null);
        setField(term55737, term55737.getClass(), "last", null);
        setField(term55737, term55737.getClass(), "propListHead", null);
        setIntField(term55737, term55737.getClass(), "sourcePosition", 0);
        setField(term55737, term55737.getClass(), "jsType", null);
        setField(term55737, term55737.getClass(), "parent", null);
        setField(term55727, term55727.getClass(), "first", term55737);
        setField(term55727, term55727.getClass(), "last", null);
        setField(term55727, term55727.getClass(), "propListHead", null);
        setIntField(term55727, term55727.getClass(), "sourcePosition", 0);
        setField(term55727, term55727.getClass(), "jsType", null);
        setField(term55727, term55727.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term55495;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term55409, args);
        assertTrue(recursiveEquals(term55409, term55820));
        assertTrue(recursiveEquals(term55495, term55821));
        assertTrue(recursiveEquals(retValue, term55727));
    }

};


