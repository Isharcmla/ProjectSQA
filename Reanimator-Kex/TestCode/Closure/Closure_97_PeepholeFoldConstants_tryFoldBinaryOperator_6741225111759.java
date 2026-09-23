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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111759 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term689495;
     Object term689587;
     Object term690268;
     Object term690269;
     Object term690194;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111759() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term689495 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term689587 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term689673 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term689765 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term689673, term689673.getClass(), "next", term689765);
        setIntField(term689673, term689673.getClass(), "type", 0);
        setField(term689587, term689587.getClass(), "first", term689673);
        setIntField(term689587, term689587.getClass(), "type", 101);
        setField(term689587, term689587.getClass(), "parent", null);
        term690268 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term690268, term690268.getClass(), "currentTraversal", null);
        term690269 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term690270 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term690271 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term690269, term690269.getClass(), "number", 0.0);
        setIntField(term690269, term690269.getClass(), "type", 101);
        setField(term690269, term690269.getClass(), "next", null);
        setField(term690270, term690270.getClass(), "functionName", null);
        setBooleanField(term690270, term690270.getClass(), "itsNeedsActivation", false);
        setIntField(term690270, term690270.getClass(), "itsFunctionType", 0);
        setBooleanField(term690270, term690270.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term690270, term690270.getClass(), "encodedSourceStart", 0);
        setIntField(term690270, term690270.getClass(), "encodedSourceEnd", 0);
        setField(term690270, term690270.getClass(), "sourceName", null);
        setIntField(term690270, term690270.getClass(), "baseLineno", 0);
        setIntField(term690270, term690270.getClass(), "endLineno", 0);
        setField(term690270, term690270.getClass(), "functions", null);
        setField(term690270, term690270.getClass(), "regexps", null);
        setField(term690270, term690270.getClass(), "itsVariables", null);
        setField(term690270, term690270.getClass(), "itsConst", null);
        setField(term690270, term690270.getClass(), "itsVariableNames", null);
        setIntField(term690270, term690270.getClass(), "varStart", 0);
        setField(term690270, term690270.getClass(), "compilerData", null);
        setIntField(term690270, term690270.getClass(), "type", 0);
        setDoubleField(term690271, term690271.getClass(), "number", 0.0);
        setIntField(term690271, term690271.getClass(), "type", 0);
        setField(term690271, term690271.getClass(), "next", null);
        setField(term690271, term690271.getClass(), "first", null);
        setField(term690271, term690271.getClass(), "last", null);
        setField(term690271, term690271.getClass(), "propListHead", null);
        setIntField(term690271, term690271.getClass(), "sourcePosition", 0);
        setField(term690271, term690271.getClass(), "jsType", null);
        setField(term690271, term690271.getClass(), "parent", null);
        setField(term690270, term690270.getClass(), "next", term690271);
        setField(term690270, term690270.getClass(), "first", null);
        setField(term690270, term690270.getClass(), "last", null);
        setField(term690270, term690270.getClass(), "propListHead", null);
        setIntField(term690270, term690270.getClass(), "sourcePosition", 0);
        setField(term690270, term690270.getClass(), "jsType", null);
        setField(term690270, term690270.getClass(), "parent", null);
        setField(term690269, term690269.getClass(), "first", term690270);
        setField(term690269, term690269.getClass(), "last", null);
        setField(term690269, term690269.getClass(), "propListHead", null);
        setIntField(term690269, term690269.getClass(), "sourcePosition", 0);
        setField(term690269, term690269.getClass(), "jsType", null);
        setField(term690269, term690269.getClass(), "parent", null);
        term690194 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term690197 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term690207 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term690194, term690194.getClass(), "number", 0.0);
        setIntField(term690194, term690194.getClass(), "type", 101);
        setField(term690194, term690194.getClass(), "next", null);
        setField(term690197, term690197.getClass(), "functionName", null);
        setBooleanField(term690197, term690197.getClass(), "itsNeedsActivation", false);
        setIntField(term690197, term690197.getClass(), "itsFunctionType", 0);
        setBooleanField(term690197, term690197.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term690197, term690197.getClass(), "encodedSourceStart", 0);
        setIntField(term690197, term690197.getClass(), "encodedSourceEnd", 0);
        setField(term690197, term690197.getClass(), "sourceName", null);
        setIntField(term690197, term690197.getClass(), "baseLineno", 0);
        setIntField(term690197, term690197.getClass(), "endLineno", 0);
        setField(term690197, term690197.getClass(), "functions", null);
        setField(term690197, term690197.getClass(), "regexps", null);
        setField(term690197, term690197.getClass(), "itsVariables", null);
        setField(term690197, term690197.getClass(), "itsConst", null);
        setField(term690197, term690197.getClass(), "itsVariableNames", null);
        setIntField(term690197, term690197.getClass(), "varStart", 0);
        setField(term690197, term690197.getClass(), "compilerData", null);
        setIntField(term690197, term690197.getClass(), "type", 0);
        setDoubleField(term690207, term690207.getClass(), "number", 0.0);
        setIntField(term690207, term690207.getClass(), "type", 0);
        setField(term690207, term690207.getClass(), "next", null);
        setField(term690207, term690207.getClass(), "first", null);
        setField(term690207, term690207.getClass(), "last", null);
        setField(term690207, term690207.getClass(), "propListHead", null);
        setIntField(term690207, term690207.getClass(), "sourcePosition", 0);
        setField(term690207, term690207.getClass(), "jsType", null);
        setField(term690207, term690207.getClass(), "parent", null);
        setField(term690197, term690197.getClass(), "next", term690207);
        setField(term690197, term690197.getClass(), "first", null);
        setField(term690197, term690197.getClass(), "last", null);
        setField(term690197, term690197.getClass(), "propListHead", null);
        setIntField(term690197, term690197.getClass(), "sourcePosition", 0);
        setField(term690197, term690197.getClass(), "jsType", null);
        setField(term690197, term690197.getClass(), "parent", null);
        setField(term690194, term690194.getClass(), "first", term690197);
        setField(term690194, term690194.getClass(), "last", null);
        setField(term690194, term690194.getClass(), "propListHead", null);
        setIntField(term690194, term690194.getClass(), "sourcePosition", 0);
        setField(term690194, term690194.getClass(), "jsType", null);
        setField(term690194, term690194.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term689587;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term689495, args);
        assertTrue(recursiveEquals(term689495, term690268));
        assertTrue(recursiveEquals(term689587, term690269));
        assertTrue(recursiveEquals(retValue, term690194));
    }

};


