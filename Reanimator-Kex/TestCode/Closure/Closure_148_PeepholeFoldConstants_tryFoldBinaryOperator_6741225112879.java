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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112879 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term838912;
     Object term839004;
     Object term839720;
     Object term839721;
     Object term839643;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112879() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term838912 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term839004 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term839090 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term839176 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term839090, term839090.getClass(), "next", term839176);
        setIntField(term839090, term839090.getClass(), "type", 39);
        setField(term839004, term839004.getClass(), "first", term839090);
        setIntField(term839004, term839004.getClass(), "type", 9);
        term839720 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term839720, term839720.getClass(), "currentTraversal", null);
        term839721 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term839722 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term839723 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term839721, term839721.getClass(), "number", 0.0);
        setIntField(term839721, term839721.getClass(), "type", 9);
        setField(term839721, term839721.getClass(), "next", null);
        setField(term839722, term839722.getClass(), "functionName", null);
        setBooleanField(term839722, term839722.getClass(), "itsNeedsActivation", false);
        setIntField(term839722, term839722.getClass(), "itsFunctionType", 0);
        setBooleanField(term839722, term839722.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term839722, term839722.getClass(), "encodedSourceStart", 0);
        setIntField(term839722, term839722.getClass(), "encodedSourceEnd", 0);
        setField(term839722, term839722.getClass(), "sourceName", null);
        setIntField(term839722, term839722.getClass(), "baseLineno", 0);
        setIntField(term839722, term839722.getClass(), "endLineno", 0);
        setField(term839722, term839722.getClass(), "functions", null);
        setField(term839722, term839722.getClass(), "regexps", null);
        setField(term839722, term839722.getClass(), "itsVariables", null);
        setField(term839722, term839722.getClass(), "itsConst", null);
        setField(term839722, term839722.getClass(), "itsVariableNames", null);
        setIntField(term839722, term839722.getClass(), "varStart", 0);
        setField(term839722, term839722.getClass(), "compilerData", null);
        setIntField(term839722, term839722.getClass(), "type", 39);
        setField(term839723, term839723.getClass(), "functionName", null);
        setBooleanField(term839723, term839723.getClass(), "itsNeedsActivation", false);
        setIntField(term839723, term839723.getClass(), "itsFunctionType", 0);
        setBooleanField(term839723, term839723.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term839723, term839723.getClass(), "encodedSourceStart", 0);
        setIntField(term839723, term839723.getClass(), "encodedSourceEnd", 0);
        setField(term839723, term839723.getClass(), "sourceName", null);
        setIntField(term839723, term839723.getClass(), "baseLineno", 0);
        setIntField(term839723, term839723.getClass(), "endLineno", 0);
        setField(term839723, term839723.getClass(), "functions", null);
        setField(term839723, term839723.getClass(), "regexps", null);
        setField(term839723, term839723.getClass(), "itsVariables", null);
        setField(term839723, term839723.getClass(), "itsConst", null);
        setField(term839723, term839723.getClass(), "itsVariableNames", null);
        setIntField(term839723, term839723.getClass(), "varStart", 0);
        setField(term839723, term839723.getClass(), "compilerData", null);
        setIntField(term839723, term839723.getClass(), "type", 0);
        setField(term839723, term839723.getClass(), "next", null);
        setField(term839723, term839723.getClass(), "first", null);
        setField(term839723, term839723.getClass(), "last", null);
        setField(term839723, term839723.getClass(), "propListHead", null);
        setIntField(term839723, term839723.getClass(), "sourcePosition", 0);
        setField(term839723, term839723.getClass(), "jsType", null);
        setField(term839723, term839723.getClass(), "parent", null);
        setField(term839722, term839722.getClass(), "next", term839723);
        setField(term839722, term839722.getClass(), "first", null);
        setField(term839722, term839722.getClass(), "last", null);
        setField(term839722, term839722.getClass(), "propListHead", null);
        setIntField(term839722, term839722.getClass(), "sourcePosition", 0);
        setField(term839722, term839722.getClass(), "jsType", null);
        setField(term839722, term839722.getClass(), "parent", null);
        setField(term839721, term839721.getClass(), "first", term839722);
        setField(term839721, term839721.getClass(), "last", null);
        setField(term839721, term839721.getClass(), "propListHead", null);
        setIntField(term839721, term839721.getClass(), "sourcePosition", 0);
        setField(term839721, term839721.getClass(), "jsType", null);
        setField(term839721, term839721.getClass(), "parent", null);
        term839643 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term839646 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term839656 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term839643, term839643.getClass(), "number", 0.0);
        setIntField(term839643, term839643.getClass(), "type", 9);
        setField(term839643, term839643.getClass(), "next", null);
        setField(term839646, term839646.getClass(), "functionName", null);
        setBooleanField(term839646, term839646.getClass(), "itsNeedsActivation", false);
        setIntField(term839646, term839646.getClass(), "itsFunctionType", 0);
        setBooleanField(term839646, term839646.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term839646, term839646.getClass(), "encodedSourceStart", 0);
        setIntField(term839646, term839646.getClass(), "encodedSourceEnd", 0);
        setField(term839646, term839646.getClass(), "sourceName", null);
        setIntField(term839646, term839646.getClass(), "baseLineno", 0);
        setIntField(term839646, term839646.getClass(), "endLineno", 0);
        setField(term839646, term839646.getClass(), "functions", null);
        setField(term839646, term839646.getClass(), "regexps", null);
        setField(term839646, term839646.getClass(), "itsVariables", null);
        setField(term839646, term839646.getClass(), "itsConst", null);
        setField(term839646, term839646.getClass(), "itsVariableNames", null);
        setIntField(term839646, term839646.getClass(), "varStart", 0);
        setField(term839646, term839646.getClass(), "compilerData", null);
        setIntField(term839646, term839646.getClass(), "type", 39);
        setField(term839656, term839656.getClass(), "functionName", null);
        setBooleanField(term839656, term839656.getClass(), "itsNeedsActivation", false);
        setIntField(term839656, term839656.getClass(), "itsFunctionType", 0);
        setBooleanField(term839656, term839656.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term839656, term839656.getClass(), "encodedSourceStart", 0);
        setIntField(term839656, term839656.getClass(), "encodedSourceEnd", 0);
        setField(term839656, term839656.getClass(), "sourceName", null);
        setIntField(term839656, term839656.getClass(), "baseLineno", 0);
        setIntField(term839656, term839656.getClass(), "endLineno", 0);
        setField(term839656, term839656.getClass(), "functions", null);
        setField(term839656, term839656.getClass(), "regexps", null);
        setField(term839656, term839656.getClass(), "itsVariables", null);
        setField(term839656, term839656.getClass(), "itsConst", null);
        setField(term839656, term839656.getClass(), "itsVariableNames", null);
        setIntField(term839656, term839656.getClass(), "varStart", 0);
        setField(term839656, term839656.getClass(), "compilerData", null);
        setIntField(term839656, term839656.getClass(), "type", 0);
        setField(term839656, term839656.getClass(), "next", null);
        setField(term839656, term839656.getClass(), "first", null);
        setField(term839656, term839656.getClass(), "last", null);
        setField(term839656, term839656.getClass(), "propListHead", null);
        setIntField(term839656, term839656.getClass(), "sourcePosition", 0);
        setField(term839656, term839656.getClass(), "jsType", null);
        setField(term839656, term839656.getClass(), "parent", null);
        setField(term839646, term839646.getClass(), "next", term839656);
        setField(term839646, term839646.getClass(), "first", null);
        setField(term839646, term839646.getClass(), "last", null);
        setField(term839646, term839646.getClass(), "propListHead", null);
        setIntField(term839646, term839646.getClass(), "sourcePosition", 0);
        setField(term839646, term839646.getClass(), "jsType", null);
        setField(term839646, term839646.getClass(), "parent", null);
        setField(term839643, term839643.getClass(), "first", term839646);
        setField(term839643, term839643.getClass(), "last", null);
        setField(term839643, term839643.getClass(), "propListHead", null);
        setIntField(term839643, term839643.getClass(), "sourcePosition", 0);
        setField(term839643, term839643.getClass(), "jsType", null);
        setField(term839643, term839643.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term839004;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term838912, args);
        assertTrue(recursiveEquals(term838912, term839720));
        assertTrue(recursiveEquals(term839004, term839721));
        assertTrue(recursiveEquals(retValue, term839643));
    }

};


