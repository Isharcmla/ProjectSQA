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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111792 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term698499;
     Object term698591;
     Object term698861;
     Object term698862;
     Object term698784;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111792() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term698499 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term698591 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term698683 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term698769 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term698683, term698683.getClass(), "next", term698769);
        setIntField(term698683, term698683.getClass(), "type", 0);
        setField(term698591, term698591.getClass(), "first", term698683);
        setIntField(term698591, term698591.getClass(), "type", 101);
        setField(term698591, term698591.getClass(), "parent", null);
        term698861 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term698861, term698861.getClass(), "currentTraversal", null);
        term698862 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term698863 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term698864 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term698862, term698862.getClass(), "str", null);
        setIntField(term698862, term698862.getClass(), "type", 101);
        setField(term698862, term698862.getClass(), "next", null);
        setField(term698863, term698863.getClass(), "str", null);
        setIntField(term698863, term698863.getClass(), "type", 0);
        setField(term698864, term698864.getClass(), "functionName", null);
        setBooleanField(term698864, term698864.getClass(), "itsNeedsActivation", false);
        setIntField(term698864, term698864.getClass(), "itsFunctionType", 0);
        setBooleanField(term698864, term698864.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term698864, term698864.getClass(), "encodedSourceStart", 0);
        setIntField(term698864, term698864.getClass(), "encodedSourceEnd", 0);
        setField(term698864, term698864.getClass(), "sourceName", null);
        setIntField(term698864, term698864.getClass(), "baseLineno", 0);
        setIntField(term698864, term698864.getClass(), "endLineno", 0);
        setField(term698864, term698864.getClass(), "functions", null);
        setField(term698864, term698864.getClass(), "regexps", null);
        setField(term698864, term698864.getClass(), "itsVariables", null);
        setField(term698864, term698864.getClass(), "itsConst", null);
        setField(term698864, term698864.getClass(), "itsVariableNames", null);
        setIntField(term698864, term698864.getClass(), "varStart", 0);
        setField(term698864, term698864.getClass(), "compilerData", null);
        setIntField(term698864, term698864.getClass(), "type", 0);
        setField(term698864, term698864.getClass(), "next", null);
        setField(term698864, term698864.getClass(), "first", null);
        setField(term698864, term698864.getClass(), "last", null);
        setField(term698864, term698864.getClass(), "propListHead", null);
        setIntField(term698864, term698864.getClass(), "sourcePosition", 0);
        setField(term698864, term698864.getClass(), "jsType", null);
        setField(term698864, term698864.getClass(), "parent", null);
        setField(term698863, term698863.getClass(), "next", term698864);
        setField(term698863, term698863.getClass(), "first", null);
        setField(term698863, term698863.getClass(), "last", null);
        setField(term698863, term698863.getClass(), "propListHead", null);
        setIntField(term698863, term698863.getClass(), "sourcePosition", 0);
        setField(term698863, term698863.getClass(), "jsType", null);
        setField(term698863, term698863.getClass(), "parent", null);
        setField(term698862, term698862.getClass(), "first", term698863);
        setField(term698862, term698862.getClass(), "last", null);
        setField(term698862, term698862.getClass(), "propListHead", null);
        setIntField(term698862, term698862.getClass(), "sourcePosition", 0);
        setField(term698862, term698862.getClass(), "jsType", null);
        setField(term698862, term698862.getClass(), "parent", null);
        term698784 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term698786 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term698788 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term698784, term698784.getClass(), "str", null);
        setIntField(term698784, term698784.getClass(), "type", 101);
        setField(term698784, term698784.getClass(), "next", null);
        setField(term698786, term698786.getClass(), "str", null);
        setIntField(term698786, term698786.getClass(), "type", 0);
        setField(term698788, term698788.getClass(), "functionName", null);
        setBooleanField(term698788, term698788.getClass(), "itsNeedsActivation", false);
        setIntField(term698788, term698788.getClass(), "itsFunctionType", 0);
        setBooleanField(term698788, term698788.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term698788, term698788.getClass(), "encodedSourceStart", 0);
        setIntField(term698788, term698788.getClass(), "encodedSourceEnd", 0);
        setField(term698788, term698788.getClass(), "sourceName", null);
        setIntField(term698788, term698788.getClass(), "baseLineno", 0);
        setIntField(term698788, term698788.getClass(), "endLineno", 0);
        setField(term698788, term698788.getClass(), "functions", null);
        setField(term698788, term698788.getClass(), "regexps", null);
        setField(term698788, term698788.getClass(), "itsVariables", null);
        setField(term698788, term698788.getClass(), "itsConst", null);
        setField(term698788, term698788.getClass(), "itsVariableNames", null);
        setIntField(term698788, term698788.getClass(), "varStart", 0);
        setField(term698788, term698788.getClass(), "compilerData", null);
        setIntField(term698788, term698788.getClass(), "type", 0);
        setField(term698788, term698788.getClass(), "next", null);
        setField(term698788, term698788.getClass(), "first", null);
        setField(term698788, term698788.getClass(), "last", null);
        setField(term698788, term698788.getClass(), "propListHead", null);
        setIntField(term698788, term698788.getClass(), "sourcePosition", 0);
        setField(term698788, term698788.getClass(), "jsType", null);
        setField(term698788, term698788.getClass(), "parent", null);
        setField(term698786, term698786.getClass(), "next", term698788);
        setField(term698786, term698786.getClass(), "first", null);
        setField(term698786, term698786.getClass(), "last", null);
        setField(term698786, term698786.getClass(), "propListHead", null);
        setIntField(term698786, term698786.getClass(), "sourcePosition", 0);
        setField(term698786, term698786.getClass(), "jsType", null);
        setField(term698786, term698786.getClass(), "parent", null);
        setField(term698784, term698784.getClass(), "first", term698786);
        setField(term698784, term698784.getClass(), "last", null);
        setField(term698784, term698784.getClass(), "propListHead", null);
        setIntField(term698784, term698784.getClass(), "sourcePosition", 0);
        setField(term698784, term698784.getClass(), "jsType", null);
        setField(term698784, term698784.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term698591;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term698499, args);
        assertTrue(recursiveEquals(term698499, term698861));
        assertTrue(recursiveEquals(term698591, term698862));
        assertTrue(recursiveEquals(retValue, term698784));
    }

};


