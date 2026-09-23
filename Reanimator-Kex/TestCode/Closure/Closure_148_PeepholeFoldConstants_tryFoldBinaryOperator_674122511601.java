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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511601 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130736;
     Object term130828;
     Object term131496;
     Object term131497;
     Object term131439;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511601() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term130736 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term130828 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term130920 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term131006 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term130920, term130920.getClass(), "next", term131006);
        setIntField(term130920, term130920.getClass(), "type", 39);
        setField(term130828, term130828.getClass(), "first", term130920);
        setIntField(term130828, term130828.getClass(), "type", 11);
        term131496 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term131496, term131496.getClass(), "currentTraversal", null);
        term131497 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term131498 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term131499 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term131497, term131497.getClass(), "str", null);
        setIntField(term131497, term131497.getClass(), "type", 11);
        setField(term131497, term131497.getClass(), "next", null);
        setField(term131498, term131498.getClass(), "str", null);
        setIntField(term131498, term131498.getClass(), "type", 39);
        setField(term131499, term131499.getClass(), "functionName", null);
        setBooleanField(term131499, term131499.getClass(), "itsNeedsActivation", false);
        setIntField(term131499, term131499.getClass(), "itsFunctionType", 0);
        setBooleanField(term131499, term131499.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term131499, term131499.getClass(), "encodedSourceStart", 0);
        setIntField(term131499, term131499.getClass(), "encodedSourceEnd", 0);
        setField(term131499, term131499.getClass(), "sourceName", null);
        setIntField(term131499, term131499.getClass(), "baseLineno", 0);
        setIntField(term131499, term131499.getClass(), "endLineno", 0);
        setField(term131499, term131499.getClass(), "functions", null);
        setField(term131499, term131499.getClass(), "regexps", null);
        setField(term131499, term131499.getClass(), "itsVariables", null);
        setField(term131499, term131499.getClass(), "itsConst", null);
        setField(term131499, term131499.getClass(), "itsVariableNames", null);
        setIntField(term131499, term131499.getClass(), "varStart", 0);
        setField(term131499, term131499.getClass(), "compilerData", null);
        setIntField(term131499, term131499.getClass(), "type", 0);
        setField(term131499, term131499.getClass(), "next", null);
        setField(term131499, term131499.getClass(), "first", null);
        setField(term131499, term131499.getClass(), "last", null);
        setField(term131499, term131499.getClass(), "propListHead", null);
        setIntField(term131499, term131499.getClass(), "sourcePosition", 0);
        setField(term131499, term131499.getClass(), "jsType", null);
        setField(term131499, term131499.getClass(), "parent", null);
        setField(term131498, term131498.getClass(), "next", term131499);
        setField(term131498, term131498.getClass(), "first", null);
        setField(term131498, term131498.getClass(), "last", null);
        setField(term131498, term131498.getClass(), "propListHead", null);
        setIntField(term131498, term131498.getClass(), "sourcePosition", 0);
        setField(term131498, term131498.getClass(), "jsType", null);
        setField(term131498, term131498.getClass(), "parent", null);
        setField(term131497, term131497.getClass(), "first", term131498);
        setField(term131497, term131497.getClass(), "last", null);
        setField(term131497, term131497.getClass(), "propListHead", null);
        setIntField(term131497, term131497.getClass(), "sourcePosition", 0);
        setField(term131497, term131497.getClass(), "jsType", null);
        setField(term131497, term131497.getClass(), "parent", null);
        term131439 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term131441 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term131443 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term131439, term131439.getClass(), "str", null);
        setIntField(term131439, term131439.getClass(), "type", 11);
        setField(term131439, term131439.getClass(), "next", null);
        setField(term131441, term131441.getClass(), "str", null);
        setIntField(term131441, term131441.getClass(), "type", 39);
        setField(term131443, term131443.getClass(), "functionName", null);
        setBooleanField(term131443, term131443.getClass(), "itsNeedsActivation", false);
        setIntField(term131443, term131443.getClass(), "itsFunctionType", 0);
        setBooleanField(term131443, term131443.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term131443, term131443.getClass(), "encodedSourceStart", 0);
        setIntField(term131443, term131443.getClass(), "encodedSourceEnd", 0);
        setField(term131443, term131443.getClass(), "sourceName", null);
        setIntField(term131443, term131443.getClass(), "baseLineno", 0);
        setIntField(term131443, term131443.getClass(), "endLineno", 0);
        setField(term131443, term131443.getClass(), "functions", null);
        setField(term131443, term131443.getClass(), "regexps", null);
        setField(term131443, term131443.getClass(), "itsVariables", null);
        setField(term131443, term131443.getClass(), "itsConst", null);
        setField(term131443, term131443.getClass(), "itsVariableNames", null);
        setIntField(term131443, term131443.getClass(), "varStart", 0);
        setField(term131443, term131443.getClass(), "compilerData", null);
        setIntField(term131443, term131443.getClass(), "type", 0);
        setField(term131443, term131443.getClass(), "next", null);
        setField(term131443, term131443.getClass(), "first", null);
        setField(term131443, term131443.getClass(), "last", null);
        setField(term131443, term131443.getClass(), "propListHead", null);
        setIntField(term131443, term131443.getClass(), "sourcePosition", 0);
        setField(term131443, term131443.getClass(), "jsType", null);
        setField(term131443, term131443.getClass(), "parent", null);
        setField(term131441, term131441.getClass(), "next", term131443);
        setField(term131441, term131441.getClass(), "first", null);
        setField(term131441, term131441.getClass(), "last", null);
        setField(term131441, term131441.getClass(), "propListHead", null);
        setIntField(term131441, term131441.getClass(), "sourcePosition", 0);
        setField(term131441, term131441.getClass(), "jsType", null);
        setField(term131441, term131441.getClass(), "parent", null);
        setField(term131439, term131439.getClass(), "first", term131441);
        setField(term131439, term131439.getClass(), "last", null);
        setField(term131439, term131439.getClass(), "propListHead", null);
        setIntField(term131439, term131439.getClass(), "sourcePosition", 0);
        setField(term131439, term131439.getClass(), "jsType", null);
        setField(term131439, term131439.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term130828;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term130736, args);
        assertTrue(recursiveEquals(term130736, term131496));
        assertTrue(recursiveEquals(term130828, term131497));
        assertTrue(recursiveEquals(retValue, term131439));
    }

};


