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

public class PeepholeFoldConstants_optimizeSubtree_16065069932241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term614735;
     Object term614821;
     Object term615565;
     Object term615566;
     Object term615456;

    public PeepholeFoldConstants_optimizeSubtree_16065069932241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term614735 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term614821 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term614907 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term614821, term614821.getClass(), "type", 33);
        setField(term614821, term614821.getClass(), "first", term614821);
        setField(term614821, term614821.getClass(), "next", term614907);
        term615565 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term615565, term615565.getClass(), "currentTraversal", null);
        term615566 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term615567 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term615566, term615566.getClass(), "functionName", null);
        setBooleanField(term615566, term615566.getClass(), "itsNeedsActivation", false);
        setIntField(term615566, term615566.getClass(), "itsFunctionType", 0);
        setBooleanField(term615566, term615566.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term615566, term615566.getClass(), "encodedSourceStart", 0);
        setIntField(term615566, term615566.getClass(), "encodedSourceEnd", 0);
        setField(term615566, term615566.getClass(), "sourceName", null);
        setIntField(term615566, term615566.getClass(), "baseLineno", 0);
        setIntField(term615566, term615566.getClass(), "endLineno", 0);
        setField(term615566, term615566.getClass(), "functions", null);
        setField(term615566, term615566.getClass(), "regexps", null);
        setField(term615566, term615566.getClass(), "itsVariables", null);
        setField(term615566, term615566.getClass(), "itsConst", null);
        setField(term615566, term615566.getClass(), "itsVariableNames", null);
        setIntField(term615566, term615566.getClass(), "varStart", 0);
        setField(term615566, term615566.getClass(), "compilerData", null);
        setIntField(term615566, term615566.getClass(), "type", 33);
        setField(term615567, term615567.getClass(), "functionName", null);
        setBooleanField(term615567, term615567.getClass(), "itsNeedsActivation", false);
        setIntField(term615567, term615567.getClass(), "itsFunctionType", 0);
        setBooleanField(term615567, term615567.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term615567, term615567.getClass(), "encodedSourceStart", 0);
        setIntField(term615567, term615567.getClass(), "encodedSourceEnd", 0);
        setField(term615567, term615567.getClass(), "sourceName", null);
        setIntField(term615567, term615567.getClass(), "baseLineno", 0);
        setIntField(term615567, term615567.getClass(), "endLineno", 0);
        setField(term615567, term615567.getClass(), "functions", null);
        setField(term615567, term615567.getClass(), "regexps", null);
        setField(term615567, term615567.getClass(), "itsVariables", null);
        setField(term615567, term615567.getClass(), "itsConst", null);
        setField(term615567, term615567.getClass(), "itsVariableNames", null);
        setIntField(term615567, term615567.getClass(), "varStart", 0);
        setField(term615567, term615567.getClass(), "compilerData", null);
        setIntField(term615567, term615567.getClass(), "type", 0);
        setField(term615567, term615567.getClass(), "next", null);
        setField(term615567, term615567.getClass(), "first", null);
        setField(term615567, term615567.getClass(), "last", null);
        setField(term615567, term615567.getClass(), "propListHead", null);
        setIntField(term615567, term615567.getClass(), "sourcePosition", 0);
        setField(term615567, term615567.getClass(), "jsType", null);
        setField(term615567, term615567.getClass(), "parent", null);
        setField(term615566, term615566.getClass(), "next", term615567);
        setField(term615566, term615566.getClass(), "first", term615566);
        setField(term615566, term615566.getClass(), "last", null);
        setField(term615566, term615566.getClass(), "propListHead", null);
        setIntField(term615566, term615566.getClass(), "sourcePosition", 0);
        setField(term615566, term615566.getClass(), "jsType", null);
        setField(term615566, term615566.getClass(), "parent", null);
        term615456 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term615466 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term615456, term615456.getClass(), "functionName", null);
        setBooleanField(term615456, term615456.getClass(), "itsNeedsActivation", false);
        setIntField(term615456, term615456.getClass(), "itsFunctionType", 0);
        setBooleanField(term615456, term615456.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term615456, term615456.getClass(), "encodedSourceStart", 0);
        setIntField(term615456, term615456.getClass(), "encodedSourceEnd", 0);
        setField(term615456, term615456.getClass(), "sourceName", null);
        setIntField(term615456, term615456.getClass(), "baseLineno", 0);
        setIntField(term615456, term615456.getClass(), "endLineno", 0);
        setField(term615456, term615456.getClass(), "functions", null);
        setField(term615456, term615456.getClass(), "regexps", null);
        setField(term615456, term615456.getClass(), "itsVariables", null);
        setField(term615456, term615456.getClass(), "itsConst", null);
        setField(term615456, term615456.getClass(), "itsVariableNames", null);
        setIntField(term615456, term615456.getClass(), "varStart", 0);
        setField(term615456, term615456.getClass(), "compilerData", null);
        setIntField(term615456, term615456.getClass(), "type", 33);
        setField(term615466, term615466.getClass(), "functionName", null);
        setBooleanField(term615466, term615466.getClass(), "itsNeedsActivation", false);
        setIntField(term615466, term615466.getClass(), "itsFunctionType", 0);
        setBooleanField(term615466, term615466.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term615466, term615466.getClass(), "encodedSourceStart", 0);
        setIntField(term615466, term615466.getClass(), "encodedSourceEnd", 0);
        setField(term615466, term615466.getClass(), "sourceName", null);
        setIntField(term615466, term615466.getClass(), "baseLineno", 0);
        setIntField(term615466, term615466.getClass(), "endLineno", 0);
        setField(term615466, term615466.getClass(), "functions", null);
        setField(term615466, term615466.getClass(), "regexps", null);
        setField(term615466, term615466.getClass(), "itsVariables", null);
        setField(term615466, term615466.getClass(), "itsConst", null);
        setField(term615466, term615466.getClass(), "itsVariableNames", null);
        setIntField(term615466, term615466.getClass(), "varStart", 0);
        setField(term615466, term615466.getClass(), "compilerData", null);
        setIntField(term615466, term615466.getClass(), "type", 0);
        setField(term615466, term615466.getClass(), "next", null);
        setField(term615466, term615466.getClass(), "first", null);
        setField(term615466, term615466.getClass(), "last", null);
        setField(term615466, term615466.getClass(), "propListHead", null);
        setIntField(term615466, term615466.getClass(), "sourcePosition", 0);
        setField(term615466, term615466.getClass(), "jsType", null);
        setField(term615466, term615466.getClass(), "parent", null);
        setField(term615456, term615456.getClass(), "next", term615466);
        setField(term615456, term615456.getClass(), "first", term615456);
        setField(term615456, term615456.getClass(), "last", null);
        setField(term615456, term615456.getClass(), "propListHead", null);
        setIntField(term615456, term615456.getClass(), "sourcePosition", 0);
        setField(term615456, term615456.getClass(), "jsType", null);
        setField(term615456, term615456.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term614821;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term614735, args);
        assertTrue(recursiveEquals(term614735, term615565));
        assertTrue(recursiveEquals(term614821, term615566));
        assertTrue(recursiveEquals(retValue, term615456));
    }

};


