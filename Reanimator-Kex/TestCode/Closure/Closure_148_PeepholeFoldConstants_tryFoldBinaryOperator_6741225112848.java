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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112848 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term828465;
     Object term828557;
     Object term829772;
     Object term829773;
     Object term829720;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112848() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term828465 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term828557 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term828643 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term828713 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term828643, term828643.getClass(), "next", term828713);
        setField(term828557, term828557.getClass(), "first", term828643);
        setIntField(term828557, term828557.getClass(), "type", 46);
        term829772 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term829772, term829772.getClass(), "currentTraversal", null);
        term829773 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term829774 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term829775 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term829773, term829773.getClass(), "number", 0.0);
        setIntField(term829773, term829773.getClass(), "type", 46);
        setField(term829773, term829773.getClass(), "next", null);
        setField(term829774, term829774.getClass(), "functionName", null);
        setBooleanField(term829774, term829774.getClass(), "itsNeedsActivation", false);
        setIntField(term829774, term829774.getClass(), "itsFunctionType", 0);
        setBooleanField(term829774, term829774.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term829774, term829774.getClass(), "encodedSourceStart", 0);
        setIntField(term829774, term829774.getClass(), "encodedSourceEnd", 0);
        setField(term829774, term829774.getClass(), "sourceName", null);
        setIntField(term829774, term829774.getClass(), "baseLineno", 0);
        setIntField(term829774, term829774.getClass(), "endLineno", 0);
        setField(term829774, term829774.getClass(), "functions", null);
        setField(term829774, term829774.getClass(), "regexps", null);
        setField(term829774, term829774.getClass(), "itsVariables", null);
        setField(term829774, term829774.getClass(), "itsConst", null);
        setField(term829774, term829774.getClass(), "itsVariableNames", null);
        setIntField(term829774, term829774.getClass(), "varStart", 0);
        setField(term829774, term829774.getClass(), "compilerData", null);
        setIntField(term829774, term829774.getClass(), "type", 0);
        setIntField(term829775, term829775.getClass(), "type", 0);
        setField(term829775, term829775.getClass(), "next", null);
        setField(term829775, term829775.getClass(), "first", null);
        setField(term829775, term829775.getClass(), "last", null);
        setField(term829775, term829775.getClass(), "propListHead", null);
        setIntField(term829775, term829775.getClass(), "sourcePosition", 0);
        setField(term829775, term829775.getClass(), "jsType", null);
        setField(term829775, term829775.getClass(), "parent", null);
        setField(term829774, term829774.getClass(), "next", term829775);
        setField(term829774, term829774.getClass(), "first", null);
        setField(term829774, term829774.getClass(), "last", null);
        setField(term829774, term829774.getClass(), "propListHead", null);
        setIntField(term829774, term829774.getClass(), "sourcePosition", 0);
        setField(term829774, term829774.getClass(), "jsType", null);
        setField(term829774, term829774.getClass(), "parent", null);
        setField(term829773, term829773.getClass(), "first", term829774);
        setField(term829773, term829773.getClass(), "last", null);
        setField(term829773, term829773.getClass(), "propListHead", null);
        setIntField(term829773, term829773.getClass(), "sourcePosition", 0);
        setField(term829773, term829773.getClass(), "jsType", null);
        setField(term829773, term829773.getClass(), "parent", null);
        term829720 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term829723 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term829733 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term829720, term829720.getClass(), "number", 0.0);
        setIntField(term829720, term829720.getClass(), "type", 46);
        setField(term829720, term829720.getClass(), "next", null);
        setField(term829723, term829723.getClass(), "functionName", null);
        setBooleanField(term829723, term829723.getClass(), "itsNeedsActivation", false);
        setIntField(term829723, term829723.getClass(), "itsFunctionType", 0);
        setBooleanField(term829723, term829723.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term829723, term829723.getClass(), "encodedSourceStart", 0);
        setIntField(term829723, term829723.getClass(), "encodedSourceEnd", 0);
        setField(term829723, term829723.getClass(), "sourceName", null);
        setIntField(term829723, term829723.getClass(), "baseLineno", 0);
        setIntField(term829723, term829723.getClass(), "endLineno", 0);
        setField(term829723, term829723.getClass(), "functions", null);
        setField(term829723, term829723.getClass(), "regexps", null);
        setField(term829723, term829723.getClass(), "itsVariables", null);
        setField(term829723, term829723.getClass(), "itsConst", null);
        setField(term829723, term829723.getClass(), "itsVariableNames", null);
        setIntField(term829723, term829723.getClass(), "varStart", 0);
        setField(term829723, term829723.getClass(), "compilerData", null);
        setIntField(term829723, term829723.getClass(), "type", 0);
        setIntField(term829733, term829733.getClass(), "type", 0);
        setField(term829733, term829733.getClass(), "next", null);
        setField(term829733, term829733.getClass(), "first", null);
        setField(term829733, term829733.getClass(), "last", null);
        setField(term829733, term829733.getClass(), "propListHead", null);
        setIntField(term829733, term829733.getClass(), "sourcePosition", 0);
        setField(term829733, term829733.getClass(), "jsType", null);
        setField(term829733, term829733.getClass(), "parent", null);
        setField(term829723, term829723.getClass(), "next", term829733);
        setField(term829723, term829723.getClass(), "first", null);
        setField(term829723, term829723.getClass(), "last", null);
        setField(term829723, term829723.getClass(), "propListHead", null);
        setIntField(term829723, term829723.getClass(), "sourcePosition", 0);
        setField(term829723, term829723.getClass(), "jsType", null);
        setField(term829723, term829723.getClass(), "parent", null);
        setField(term829720, term829720.getClass(), "first", term829723);
        setField(term829720, term829720.getClass(), "last", null);
        setField(term829720, term829720.getClass(), "propListHead", null);
        setIntField(term829720, term829720.getClass(), "sourcePosition", 0);
        setField(term829720, term829720.getClass(), "jsType", null);
        setField(term829720, term829720.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term828557;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term828465, args);
        assertTrue(recursiveEquals(term828465, term829772));
        assertTrue(recursiveEquals(term828557, term829773));
        assertTrue(recursiveEquals(retValue, term829720));
    }

};


