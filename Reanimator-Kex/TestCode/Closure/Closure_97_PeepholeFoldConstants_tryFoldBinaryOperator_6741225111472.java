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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term548326;
     Object term548412;
     Object term548674;
     Object term548675;
     Object term548606;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term548326 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term548412 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term548498 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term548590 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term548498, term548498.getClass(), "next", term548590);
        setIntField(term548498, term548498.getClass(), "type", 63);
        setField(term548412, term548412.getClass(), "first", term548498);
        setIntField(term548412, term548412.getClass(), "type", 35);
        term548674 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term548674, term548674.getClass(), "currentTraversal", null);
        term548675 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term548676 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term548677 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term548675, term548675.getClass(), "functionName", null);
        setBooleanField(term548675, term548675.getClass(), "itsNeedsActivation", false);
        setIntField(term548675, term548675.getClass(), "itsFunctionType", 0);
        setBooleanField(term548675, term548675.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term548675, term548675.getClass(), "encodedSourceStart", 0);
        setIntField(term548675, term548675.getClass(), "encodedSourceEnd", 0);
        setField(term548675, term548675.getClass(), "sourceName", null);
        setIntField(term548675, term548675.getClass(), "baseLineno", 0);
        setIntField(term548675, term548675.getClass(), "endLineno", 0);
        setField(term548675, term548675.getClass(), "functions", null);
        setField(term548675, term548675.getClass(), "regexps", null);
        setField(term548675, term548675.getClass(), "itsVariables", null);
        setField(term548675, term548675.getClass(), "itsConst", null);
        setField(term548675, term548675.getClass(), "itsVariableNames", null);
        setIntField(term548675, term548675.getClass(), "varStart", 0);
        setField(term548675, term548675.getClass(), "compilerData", null);
        setIntField(term548675, term548675.getClass(), "type", 35);
        setField(term548675, term548675.getClass(), "next", null);
        setField(term548676, term548676.getClass(), "functionName", null);
        setBooleanField(term548676, term548676.getClass(), "itsNeedsActivation", false);
        setIntField(term548676, term548676.getClass(), "itsFunctionType", 0);
        setBooleanField(term548676, term548676.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term548676, term548676.getClass(), "encodedSourceStart", 0);
        setIntField(term548676, term548676.getClass(), "encodedSourceEnd", 0);
        setField(term548676, term548676.getClass(), "sourceName", null);
        setIntField(term548676, term548676.getClass(), "baseLineno", 0);
        setIntField(term548676, term548676.getClass(), "endLineno", 0);
        setField(term548676, term548676.getClass(), "functions", null);
        setField(term548676, term548676.getClass(), "regexps", null);
        setField(term548676, term548676.getClass(), "itsVariables", null);
        setField(term548676, term548676.getClass(), "itsConst", null);
        setField(term548676, term548676.getClass(), "itsVariableNames", null);
        setIntField(term548676, term548676.getClass(), "varStart", 0);
        setField(term548676, term548676.getClass(), "compilerData", null);
        setIntField(term548676, term548676.getClass(), "type", 63);
        setDoubleField(term548677, term548677.getClass(), "number", 0.0);
        setIntField(term548677, term548677.getClass(), "type", 0);
        setField(term548677, term548677.getClass(), "next", null);
        setField(term548677, term548677.getClass(), "first", null);
        setField(term548677, term548677.getClass(), "last", null);
        setField(term548677, term548677.getClass(), "propListHead", null);
        setIntField(term548677, term548677.getClass(), "sourcePosition", 0);
        setField(term548677, term548677.getClass(), "jsType", null);
        setField(term548677, term548677.getClass(), "parent", null);
        setField(term548676, term548676.getClass(), "next", term548677);
        setField(term548676, term548676.getClass(), "first", null);
        setField(term548676, term548676.getClass(), "last", null);
        setField(term548676, term548676.getClass(), "propListHead", null);
        setIntField(term548676, term548676.getClass(), "sourcePosition", 0);
        setField(term548676, term548676.getClass(), "jsType", null);
        setField(term548676, term548676.getClass(), "parent", null);
        setField(term548675, term548675.getClass(), "first", term548676);
        setField(term548675, term548675.getClass(), "last", null);
        setField(term548675, term548675.getClass(), "propListHead", null);
        setIntField(term548675, term548675.getClass(), "sourcePosition", 0);
        setField(term548675, term548675.getClass(), "jsType", null);
        setField(term548675, term548675.getClass(), "parent", null);
        term548606 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term548616 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term548626 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term548606, term548606.getClass(), "functionName", null);
        setBooleanField(term548606, term548606.getClass(), "itsNeedsActivation", false);
        setIntField(term548606, term548606.getClass(), "itsFunctionType", 0);
        setBooleanField(term548606, term548606.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term548606, term548606.getClass(), "encodedSourceStart", 0);
        setIntField(term548606, term548606.getClass(), "encodedSourceEnd", 0);
        setField(term548606, term548606.getClass(), "sourceName", null);
        setIntField(term548606, term548606.getClass(), "baseLineno", 0);
        setIntField(term548606, term548606.getClass(), "endLineno", 0);
        setField(term548606, term548606.getClass(), "functions", null);
        setField(term548606, term548606.getClass(), "regexps", null);
        setField(term548606, term548606.getClass(), "itsVariables", null);
        setField(term548606, term548606.getClass(), "itsConst", null);
        setField(term548606, term548606.getClass(), "itsVariableNames", null);
        setIntField(term548606, term548606.getClass(), "varStart", 0);
        setField(term548606, term548606.getClass(), "compilerData", null);
        setIntField(term548606, term548606.getClass(), "type", 35);
        setField(term548606, term548606.getClass(), "next", null);
        setField(term548616, term548616.getClass(), "functionName", null);
        setBooleanField(term548616, term548616.getClass(), "itsNeedsActivation", false);
        setIntField(term548616, term548616.getClass(), "itsFunctionType", 0);
        setBooleanField(term548616, term548616.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term548616, term548616.getClass(), "encodedSourceStart", 0);
        setIntField(term548616, term548616.getClass(), "encodedSourceEnd", 0);
        setField(term548616, term548616.getClass(), "sourceName", null);
        setIntField(term548616, term548616.getClass(), "baseLineno", 0);
        setIntField(term548616, term548616.getClass(), "endLineno", 0);
        setField(term548616, term548616.getClass(), "functions", null);
        setField(term548616, term548616.getClass(), "regexps", null);
        setField(term548616, term548616.getClass(), "itsVariables", null);
        setField(term548616, term548616.getClass(), "itsConst", null);
        setField(term548616, term548616.getClass(), "itsVariableNames", null);
        setIntField(term548616, term548616.getClass(), "varStart", 0);
        setField(term548616, term548616.getClass(), "compilerData", null);
        setIntField(term548616, term548616.getClass(), "type", 63);
        setDoubleField(term548626, term548626.getClass(), "number", 0.0);
        setIntField(term548626, term548626.getClass(), "type", 0);
        setField(term548626, term548626.getClass(), "next", null);
        setField(term548626, term548626.getClass(), "first", null);
        setField(term548626, term548626.getClass(), "last", null);
        setField(term548626, term548626.getClass(), "propListHead", null);
        setIntField(term548626, term548626.getClass(), "sourcePosition", 0);
        setField(term548626, term548626.getClass(), "jsType", null);
        setField(term548626, term548626.getClass(), "parent", null);
        setField(term548616, term548616.getClass(), "next", term548626);
        setField(term548616, term548616.getClass(), "first", null);
        setField(term548616, term548616.getClass(), "last", null);
        setField(term548616, term548616.getClass(), "propListHead", null);
        setIntField(term548616, term548616.getClass(), "sourcePosition", 0);
        setField(term548616, term548616.getClass(), "jsType", null);
        setField(term548616, term548616.getClass(), "parent", null);
        setField(term548606, term548606.getClass(), "first", term548616);
        setField(term548606, term548606.getClass(), "last", null);
        setField(term548606, term548606.getClass(), "propListHead", null);
        setIntField(term548606, term548606.getClass(), "sourcePosition", 0);
        setField(term548606, term548606.getClass(), "jsType", null);
        setField(term548606, term548606.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term548412;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term548326, args);
        assertTrue(recursiveEquals(term548326, term548674));
        assertTrue(recursiveEquals(term548412, term548675));
        assertTrue(recursiveEquals(retValue, term548606));
    }

};


