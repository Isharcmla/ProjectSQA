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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term708196;
     Object term708288;
     Object term708598;
     Object term708599;
     Object term708512;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term708196 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term708288 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term708374 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term708464 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term708374, term708374.getClass(), "next", term708464);
        setIntField(term708374, term708374.getClass(), "type", 0);
        setField(term708288, term708288.getClass(), "first", term708374);
        setIntField(term708288, term708288.getClass(), "type", 101);
        setField(term708288, term708288.getClass(), "parent", null);
        term708598 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term708598, term708598.getClass(), "currentTraversal", null);
        term708599 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term708600 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term708601 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setDoubleField(term708599, term708599.getClass(), "number", 0.0);
        setIntField(term708599, term708599.getClass(), "type", 101);
        setField(term708599, term708599.getClass(), "next", null);
        setField(term708600, term708600.getClass(), "functionName", null);
        setBooleanField(term708600, term708600.getClass(), "itsNeedsActivation", false);
        setIntField(term708600, term708600.getClass(), "itsFunctionType", 0);
        setBooleanField(term708600, term708600.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term708600, term708600.getClass(), "encodedSourceStart", 0);
        setIntField(term708600, term708600.getClass(), "encodedSourceEnd", 0);
        setField(term708600, term708600.getClass(), "sourceName", null);
        setIntField(term708600, term708600.getClass(), "baseLineno", 0);
        setIntField(term708600, term708600.getClass(), "endLineno", 0);
        setField(term708600, term708600.getClass(), "functions", null);
        setField(term708600, term708600.getClass(), "regexps", null);
        setField(term708600, term708600.getClass(), "itsVariables", null);
        setField(term708600, term708600.getClass(), "itsConst", null);
        setField(term708600, term708600.getClass(), "itsVariableNames", null);
        setIntField(term708600, term708600.getClass(), "varStart", 0);
        setField(term708600, term708600.getClass(), "compilerData", null);
        setIntField(term708600, term708600.getClass(), "type", 0);
        setIntField(term708601, term708601.getClass(), "encodedSourceStart", 0);
        setIntField(term708601, term708601.getClass(), "encodedSourceEnd", 0);
        setField(term708601, term708601.getClass(), "sourceName", null);
        setIntField(term708601, term708601.getClass(), "baseLineno", 0);
        setIntField(term708601, term708601.getClass(), "endLineno", 0);
        setField(term708601, term708601.getClass(), "functions", null);
        setField(term708601, term708601.getClass(), "regexps", null);
        setField(term708601, term708601.getClass(), "itsVariables", null);
        setField(term708601, term708601.getClass(), "itsConst", null);
        setField(term708601, term708601.getClass(), "itsVariableNames", null);
        setIntField(term708601, term708601.getClass(), "varStart", 0);
        setField(term708601, term708601.getClass(), "compilerData", null);
        setIntField(term708601, term708601.getClass(), "type", 0);
        setField(term708601, term708601.getClass(), "next", null);
        setField(term708601, term708601.getClass(), "first", null);
        setField(term708601, term708601.getClass(), "last", null);
        setField(term708601, term708601.getClass(), "propListHead", null);
        setIntField(term708601, term708601.getClass(), "sourcePosition", 0);
        setField(term708601, term708601.getClass(), "jsType", null);
        setField(term708601, term708601.getClass(), "parent", null);
        setField(term708600, term708600.getClass(), "next", term708601);
        setField(term708600, term708600.getClass(), "first", null);
        setField(term708600, term708600.getClass(), "last", null);
        setField(term708600, term708600.getClass(), "propListHead", null);
        setIntField(term708600, term708600.getClass(), "sourcePosition", 0);
        setField(term708600, term708600.getClass(), "jsType", null);
        setField(term708600, term708600.getClass(), "parent", null);
        setField(term708599, term708599.getClass(), "first", term708600);
        setField(term708599, term708599.getClass(), "last", null);
        setField(term708599, term708599.getClass(), "propListHead", null);
        setIntField(term708599, term708599.getClass(), "sourcePosition", 0);
        setField(term708599, term708599.getClass(), "jsType", null);
        setField(term708599, term708599.getClass(), "parent", null);
        term708512 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term708515 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term708525 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setDoubleField(term708512, term708512.getClass(), "number", 0.0);
        setIntField(term708512, term708512.getClass(), "type", 101);
        setField(term708512, term708512.getClass(), "next", null);
        setField(term708515, term708515.getClass(), "functionName", null);
        setBooleanField(term708515, term708515.getClass(), "itsNeedsActivation", false);
        setIntField(term708515, term708515.getClass(), "itsFunctionType", 0);
        setBooleanField(term708515, term708515.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term708515, term708515.getClass(), "encodedSourceStart", 0);
        setIntField(term708515, term708515.getClass(), "encodedSourceEnd", 0);
        setField(term708515, term708515.getClass(), "sourceName", null);
        setIntField(term708515, term708515.getClass(), "baseLineno", 0);
        setIntField(term708515, term708515.getClass(), "endLineno", 0);
        setField(term708515, term708515.getClass(), "functions", null);
        setField(term708515, term708515.getClass(), "regexps", null);
        setField(term708515, term708515.getClass(), "itsVariables", null);
        setField(term708515, term708515.getClass(), "itsConst", null);
        setField(term708515, term708515.getClass(), "itsVariableNames", null);
        setIntField(term708515, term708515.getClass(), "varStart", 0);
        setField(term708515, term708515.getClass(), "compilerData", null);
        setIntField(term708515, term708515.getClass(), "type", 0);
        setIntField(term708525, term708525.getClass(), "encodedSourceStart", 0);
        setIntField(term708525, term708525.getClass(), "encodedSourceEnd", 0);
        setField(term708525, term708525.getClass(), "sourceName", null);
        setIntField(term708525, term708525.getClass(), "baseLineno", 0);
        setIntField(term708525, term708525.getClass(), "endLineno", 0);
        setField(term708525, term708525.getClass(), "functions", null);
        setField(term708525, term708525.getClass(), "regexps", null);
        setField(term708525, term708525.getClass(), "itsVariables", null);
        setField(term708525, term708525.getClass(), "itsConst", null);
        setField(term708525, term708525.getClass(), "itsVariableNames", null);
        setIntField(term708525, term708525.getClass(), "varStart", 0);
        setField(term708525, term708525.getClass(), "compilerData", null);
        setIntField(term708525, term708525.getClass(), "type", 0);
        setField(term708525, term708525.getClass(), "next", null);
        setField(term708525, term708525.getClass(), "first", null);
        setField(term708525, term708525.getClass(), "last", null);
        setField(term708525, term708525.getClass(), "propListHead", null);
        setIntField(term708525, term708525.getClass(), "sourcePosition", 0);
        setField(term708525, term708525.getClass(), "jsType", null);
        setField(term708525, term708525.getClass(), "parent", null);
        setField(term708515, term708515.getClass(), "next", term708525);
        setField(term708515, term708515.getClass(), "first", null);
        setField(term708515, term708515.getClass(), "last", null);
        setField(term708515, term708515.getClass(), "propListHead", null);
        setIntField(term708515, term708515.getClass(), "sourcePosition", 0);
        setField(term708515, term708515.getClass(), "jsType", null);
        setField(term708515, term708515.getClass(), "parent", null);
        setField(term708512, term708512.getClass(), "first", term708515);
        setField(term708512, term708512.getClass(), "last", null);
        setField(term708512, term708512.getClass(), "propListHead", null);
        setIntField(term708512, term708512.getClass(), "sourcePosition", 0);
        setField(term708512, term708512.getClass(), "jsType", null);
        setField(term708512, term708512.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term708288;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term708196, args);
        assertTrue(recursiveEquals(term708196, term708598));
        assertTrue(recursiveEquals(term708288, term708599));
        assertTrue(recursiveEquals(retValue, term708512));
    }

};


