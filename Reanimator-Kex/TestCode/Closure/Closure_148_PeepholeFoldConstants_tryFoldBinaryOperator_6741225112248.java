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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term616603;
     Object term616695;
     Object term617263;
     Object term617264;
     Object term617227;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term616603 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term616695 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term616781 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term616851 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term616781, term616781.getClass(), "next", term616851);
        setField(term616695, term616695.getClass(), "first", term616781);
        setIntField(term616695, term616695.getClass(), "type", 85);
        term617263 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term617263, term617263.getClass(), "currentTraversal", null);
        term617264 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term617265 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term617266 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term617264, term617264.getClass(), "number", 0.0);
        setIntField(term617264, term617264.getClass(), "type", 85);
        setField(term617264, term617264.getClass(), "next", null);
        setField(term617265, term617265.getClass(), "functionName", null);
        setBooleanField(term617265, term617265.getClass(), "itsNeedsActivation", false);
        setIntField(term617265, term617265.getClass(), "itsFunctionType", 0);
        setBooleanField(term617265, term617265.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term617265, term617265.getClass(), "encodedSourceStart", 0);
        setIntField(term617265, term617265.getClass(), "encodedSourceEnd", 0);
        setField(term617265, term617265.getClass(), "sourceName", null);
        setIntField(term617265, term617265.getClass(), "baseLineno", 0);
        setIntField(term617265, term617265.getClass(), "endLineno", 0);
        setField(term617265, term617265.getClass(), "functions", null);
        setField(term617265, term617265.getClass(), "regexps", null);
        setField(term617265, term617265.getClass(), "itsVariables", null);
        setField(term617265, term617265.getClass(), "itsConst", null);
        setField(term617265, term617265.getClass(), "itsVariableNames", null);
        setIntField(term617265, term617265.getClass(), "varStart", 0);
        setField(term617265, term617265.getClass(), "compilerData", null);
        setIntField(term617265, term617265.getClass(), "type", 0);
        setIntField(term617266, term617266.getClass(), "type", 0);
        setField(term617266, term617266.getClass(), "next", null);
        setField(term617266, term617266.getClass(), "first", null);
        setField(term617266, term617266.getClass(), "last", null);
        setField(term617266, term617266.getClass(), "propListHead", null);
        setIntField(term617266, term617266.getClass(), "sourcePosition", 0);
        setField(term617266, term617266.getClass(), "jsType", null);
        setField(term617266, term617266.getClass(), "parent", null);
        setField(term617265, term617265.getClass(), "next", term617266);
        setField(term617265, term617265.getClass(), "first", null);
        setField(term617265, term617265.getClass(), "last", null);
        setField(term617265, term617265.getClass(), "propListHead", null);
        setIntField(term617265, term617265.getClass(), "sourcePosition", 0);
        setField(term617265, term617265.getClass(), "jsType", null);
        setField(term617265, term617265.getClass(), "parent", null);
        setField(term617264, term617264.getClass(), "first", term617265);
        setField(term617264, term617264.getClass(), "last", null);
        setField(term617264, term617264.getClass(), "propListHead", null);
        setIntField(term617264, term617264.getClass(), "sourcePosition", 0);
        setField(term617264, term617264.getClass(), "jsType", null);
        setField(term617264, term617264.getClass(), "parent", null);
        term617227 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term617230 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term617240 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term617227, term617227.getClass(), "number", 0.0);
        setIntField(term617227, term617227.getClass(), "type", 85);
        setField(term617227, term617227.getClass(), "next", null);
        setField(term617230, term617230.getClass(), "functionName", null);
        setBooleanField(term617230, term617230.getClass(), "itsNeedsActivation", false);
        setIntField(term617230, term617230.getClass(), "itsFunctionType", 0);
        setBooleanField(term617230, term617230.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term617230, term617230.getClass(), "encodedSourceStart", 0);
        setIntField(term617230, term617230.getClass(), "encodedSourceEnd", 0);
        setField(term617230, term617230.getClass(), "sourceName", null);
        setIntField(term617230, term617230.getClass(), "baseLineno", 0);
        setIntField(term617230, term617230.getClass(), "endLineno", 0);
        setField(term617230, term617230.getClass(), "functions", null);
        setField(term617230, term617230.getClass(), "regexps", null);
        setField(term617230, term617230.getClass(), "itsVariables", null);
        setField(term617230, term617230.getClass(), "itsConst", null);
        setField(term617230, term617230.getClass(), "itsVariableNames", null);
        setIntField(term617230, term617230.getClass(), "varStart", 0);
        setField(term617230, term617230.getClass(), "compilerData", null);
        setIntField(term617230, term617230.getClass(), "type", 0);
        setIntField(term617240, term617240.getClass(), "type", 0);
        setField(term617240, term617240.getClass(), "next", null);
        setField(term617240, term617240.getClass(), "first", null);
        setField(term617240, term617240.getClass(), "last", null);
        setField(term617240, term617240.getClass(), "propListHead", null);
        setIntField(term617240, term617240.getClass(), "sourcePosition", 0);
        setField(term617240, term617240.getClass(), "jsType", null);
        setField(term617240, term617240.getClass(), "parent", null);
        setField(term617230, term617230.getClass(), "next", term617240);
        setField(term617230, term617230.getClass(), "first", null);
        setField(term617230, term617230.getClass(), "last", null);
        setField(term617230, term617230.getClass(), "propListHead", null);
        setIntField(term617230, term617230.getClass(), "sourcePosition", 0);
        setField(term617230, term617230.getClass(), "jsType", null);
        setField(term617230, term617230.getClass(), "parent", null);
        setField(term617227, term617227.getClass(), "first", term617230);
        setField(term617227, term617227.getClass(), "last", null);
        setField(term617227, term617227.getClass(), "propListHead", null);
        setIntField(term617227, term617227.getClass(), "sourcePosition", 0);
        setField(term617227, term617227.getClass(), "jsType", null);
        setField(term617227, term617227.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term616695;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term616603, args);
        assertTrue(recursiveEquals(term616603, term617263));
        assertTrue(recursiveEquals(term616695, term617264));
        assertTrue(recursiveEquals(retValue, term617227));
    }

};


