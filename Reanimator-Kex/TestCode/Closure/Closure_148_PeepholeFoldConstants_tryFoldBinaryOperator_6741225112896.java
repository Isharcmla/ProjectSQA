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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112896 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term845410;
     Object term845502;
     Object term845855;
     Object term845856;
     Object term845786;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112896() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term845410 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term845502 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term845588 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term845680 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term845588, term845588.getClass(), "next", term845680);
        setIntField(term845588, term845588.getClass(), "type", 0);
        setField(term845502, term845502.getClass(), "first", term845588);
        setIntField(term845502, term845502.getClass(), "type", 101);
        setField(term845502, term845502.getClass(), "parent", null);
        term845855 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term845855, term845855.getClass(), "currentTraversal", null);
        term845856 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term845857 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term845858 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term845856, term845856.getClass(), "str", null);
        setIntField(term845856, term845856.getClass(), "type", 101);
        setField(term845856, term845856.getClass(), "next", null);
        setField(term845857, term845857.getClass(), "functionName", null);
        setBooleanField(term845857, term845857.getClass(), "itsNeedsActivation", false);
        setIntField(term845857, term845857.getClass(), "itsFunctionType", 0);
        setBooleanField(term845857, term845857.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term845857, term845857.getClass(), "encodedSourceStart", 0);
        setIntField(term845857, term845857.getClass(), "encodedSourceEnd", 0);
        setField(term845857, term845857.getClass(), "sourceName", null);
        setIntField(term845857, term845857.getClass(), "baseLineno", 0);
        setIntField(term845857, term845857.getClass(), "endLineno", 0);
        setField(term845857, term845857.getClass(), "functions", null);
        setField(term845857, term845857.getClass(), "regexps", null);
        setField(term845857, term845857.getClass(), "itsVariables", null);
        setField(term845857, term845857.getClass(), "itsConst", null);
        setField(term845857, term845857.getClass(), "itsVariableNames", null);
        setIntField(term845857, term845857.getClass(), "varStart", 0);
        setField(term845857, term845857.getClass(), "compilerData", null);
        setIntField(term845857, term845857.getClass(), "type", 0);
        setField(term845858, term845858.getClass(), "str", null);
        setIntField(term845858, term845858.getClass(), "type", 0);
        setField(term845858, term845858.getClass(), "next", null);
        setField(term845858, term845858.getClass(), "first", null);
        setField(term845858, term845858.getClass(), "last", null);
        setField(term845858, term845858.getClass(), "propListHead", null);
        setIntField(term845858, term845858.getClass(), "sourcePosition", 0);
        setField(term845858, term845858.getClass(), "jsType", null);
        setField(term845858, term845858.getClass(), "parent", null);
        setField(term845857, term845857.getClass(), "next", term845858);
        setField(term845857, term845857.getClass(), "first", null);
        setField(term845857, term845857.getClass(), "last", null);
        setField(term845857, term845857.getClass(), "propListHead", null);
        setIntField(term845857, term845857.getClass(), "sourcePosition", 0);
        setField(term845857, term845857.getClass(), "jsType", null);
        setField(term845857, term845857.getClass(), "parent", null);
        setField(term845856, term845856.getClass(), "first", term845857);
        setField(term845856, term845856.getClass(), "last", null);
        setField(term845856, term845856.getClass(), "propListHead", null);
        setIntField(term845856, term845856.getClass(), "sourcePosition", 0);
        setField(term845856, term845856.getClass(), "jsType", null);
        setField(term845856, term845856.getClass(), "parent", null);
        term845786 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term845788 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term845798 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term845786, term845786.getClass(), "str", null);
        setIntField(term845786, term845786.getClass(), "type", 101);
        setField(term845786, term845786.getClass(), "next", null);
        setField(term845788, term845788.getClass(), "functionName", null);
        setBooleanField(term845788, term845788.getClass(), "itsNeedsActivation", false);
        setIntField(term845788, term845788.getClass(), "itsFunctionType", 0);
        setBooleanField(term845788, term845788.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term845788, term845788.getClass(), "encodedSourceStart", 0);
        setIntField(term845788, term845788.getClass(), "encodedSourceEnd", 0);
        setField(term845788, term845788.getClass(), "sourceName", null);
        setIntField(term845788, term845788.getClass(), "baseLineno", 0);
        setIntField(term845788, term845788.getClass(), "endLineno", 0);
        setField(term845788, term845788.getClass(), "functions", null);
        setField(term845788, term845788.getClass(), "regexps", null);
        setField(term845788, term845788.getClass(), "itsVariables", null);
        setField(term845788, term845788.getClass(), "itsConst", null);
        setField(term845788, term845788.getClass(), "itsVariableNames", null);
        setIntField(term845788, term845788.getClass(), "varStart", 0);
        setField(term845788, term845788.getClass(), "compilerData", null);
        setIntField(term845788, term845788.getClass(), "type", 0);
        setField(term845798, term845798.getClass(), "str", null);
        setIntField(term845798, term845798.getClass(), "type", 0);
        setField(term845798, term845798.getClass(), "next", null);
        setField(term845798, term845798.getClass(), "first", null);
        setField(term845798, term845798.getClass(), "last", null);
        setField(term845798, term845798.getClass(), "propListHead", null);
        setIntField(term845798, term845798.getClass(), "sourcePosition", 0);
        setField(term845798, term845798.getClass(), "jsType", null);
        setField(term845798, term845798.getClass(), "parent", null);
        setField(term845788, term845788.getClass(), "next", term845798);
        setField(term845788, term845788.getClass(), "first", null);
        setField(term845788, term845788.getClass(), "last", null);
        setField(term845788, term845788.getClass(), "propListHead", null);
        setIntField(term845788, term845788.getClass(), "sourcePosition", 0);
        setField(term845788, term845788.getClass(), "jsType", null);
        setField(term845788, term845788.getClass(), "parent", null);
        setField(term845786, term845786.getClass(), "first", term845788);
        setField(term845786, term845786.getClass(), "last", null);
        setField(term845786, term845786.getClass(), "propListHead", null);
        setIntField(term845786, term845786.getClass(), "sourcePosition", 0);
        setField(term845786, term845786.getClass(), "jsType", null);
        setField(term845786, term845786.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term845502;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term845410, args);
        assertTrue(recursiveEquals(term845410, term845855));
        assertTrue(recursiveEquals(term845502, term845856));
        assertTrue(recursiveEquals(retValue, term845786));
    }

};


