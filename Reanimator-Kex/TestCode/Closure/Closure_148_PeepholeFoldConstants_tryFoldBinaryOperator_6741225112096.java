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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112096 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term567918;
     Object term568010;
     Object term568709;
     Object term568710;
     Object term568602;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112096() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term567918 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term568010 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term568102 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term568194 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term568280 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term568194, term568194.getClass(), "type", 64);
        setField(term568102, term568102.getClass(), "next", term568194);
        setIntField(term568102, term568102.getClass(), "type", 0);
        setField(term568010, term568010.getClass(), "first", term568102);
        setIntField(term568010, term568010.getClass(), "type", 101);
        setField(term568010, term568010.getClass(), "parent", term568280);
        term568709 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term568709, term568709.getClass(), "currentTraversal", null);
        term568710 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term568711 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term568712 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term568713 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term568710, term568710.getClass(), "number", 0.0);
        setIntField(term568710, term568710.getClass(), "type", 101);
        setField(term568710, term568710.getClass(), "next", null);
        setDoubleField(term568711, term568711.getClass(), "number", 0.0);
        setIntField(term568711, term568711.getClass(), "type", 0);
        setDoubleField(term568712, term568712.getClass(), "number", 0.0);
        setIntField(term568712, term568712.getClass(), "type", 64);
        setField(term568712, term568712.getClass(), "next", null);
        setField(term568712, term568712.getClass(), "first", null);
        setField(term568712, term568712.getClass(), "last", null);
        setField(term568712, term568712.getClass(), "propListHead", null);
        setIntField(term568712, term568712.getClass(), "sourcePosition", 0);
        setField(term568712, term568712.getClass(), "jsType", null);
        setField(term568712, term568712.getClass(), "parent", null);
        setField(term568711, term568711.getClass(), "next", term568712);
        setField(term568711, term568711.getClass(), "first", null);
        setField(term568711, term568711.getClass(), "last", null);
        setField(term568711, term568711.getClass(), "propListHead", null);
        setIntField(term568711, term568711.getClass(), "sourcePosition", 0);
        setField(term568711, term568711.getClass(), "jsType", null);
        setField(term568711, term568711.getClass(), "parent", null);
        setField(term568710, term568710.getClass(), "first", term568711);
        setField(term568710, term568710.getClass(), "last", null);
        setField(term568710, term568710.getClass(), "propListHead", null);
        setIntField(term568710, term568710.getClass(), "sourcePosition", 0);
        setField(term568710, term568710.getClass(), "jsType", null);
        setField(term568713, term568713.getClass(), "functionName", null);
        setBooleanField(term568713, term568713.getClass(), "itsNeedsActivation", false);
        setIntField(term568713, term568713.getClass(), "itsFunctionType", 0);
        setBooleanField(term568713, term568713.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term568713, term568713.getClass(), "encodedSourceStart", 0);
        setIntField(term568713, term568713.getClass(), "encodedSourceEnd", 0);
        setField(term568713, term568713.getClass(), "sourceName", null);
        setIntField(term568713, term568713.getClass(), "baseLineno", 0);
        setIntField(term568713, term568713.getClass(), "endLineno", 0);
        setField(term568713, term568713.getClass(), "functions", null);
        setField(term568713, term568713.getClass(), "regexps", null);
        setField(term568713, term568713.getClass(), "itsVariables", null);
        setField(term568713, term568713.getClass(), "itsConst", null);
        setField(term568713, term568713.getClass(), "itsVariableNames", null);
        setIntField(term568713, term568713.getClass(), "varStart", 0);
        setField(term568713, term568713.getClass(), "compilerData", null);
        setIntField(term568713, term568713.getClass(), "type", 0);
        setField(term568713, term568713.getClass(), "next", null);
        setField(term568713, term568713.getClass(), "first", null);
        setField(term568713, term568713.getClass(), "last", null);
        setField(term568713, term568713.getClass(), "propListHead", null);
        setIntField(term568713, term568713.getClass(), "sourcePosition", 0);
        setField(term568713, term568713.getClass(), "jsType", null);
        setField(term568713, term568713.getClass(), "parent", null);
        setField(term568710, term568710.getClass(), "parent", term568713);
        term568602 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term568605 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term568608 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term568614 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term568602, term568602.getClass(), "number", 0.0);
        setIntField(term568602, term568602.getClass(), "type", 101);
        setField(term568602, term568602.getClass(), "next", null);
        setDoubleField(term568605, term568605.getClass(), "number", 0.0);
        setIntField(term568605, term568605.getClass(), "type", 0);
        setDoubleField(term568608, term568608.getClass(), "number", 0.0);
        setIntField(term568608, term568608.getClass(), "type", 64);
        setField(term568608, term568608.getClass(), "next", null);
        setField(term568608, term568608.getClass(), "first", null);
        setField(term568608, term568608.getClass(), "last", null);
        setField(term568608, term568608.getClass(), "propListHead", null);
        setIntField(term568608, term568608.getClass(), "sourcePosition", 0);
        setField(term568608, term568608.getClass(), "jsType", null);
        setField(term568608, term568608.getClass(), "parent", null);
        setField(term568605, term568605.getClass(), "next", term568608);
        setField(term568605, term568605.getClass(), "first", null);
        setField(term568605, term568605.getClass(), "last", null);
        setField(term568605, term568605.getClass(), "propListHead", null);
        setIntField(term568605, term568605.getClass(), "sourcePosition", 0);
        setField(term568605, term568605.getClass(), "jsType", null);
        setField(term568605, term568605.getClass(), "parent", null);
        setField(term568602, term568602.getClass(), "first", term568605);
        setField(term568602, term568602.getClass(), "last", null);
        setField(term568602, term568602.getClass(), "propListHead", null);
        setIntField(term568602, term568602.getClass(), "sourcePosition", 0);
        setField(term568602, term568602.getClass(), "jsType", null);
        setField(term568614, term568614.getClass(), "functionName", null);
        setBooleanField(term568614, term568614.getClass(), "itsNeedsActivation", false);
        setIntField(term568614, term568614.getClass(), "itsFunctionType", 0);
        setBooleanField(term568614, term568614.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term568614, term568614.getClass(), "encodedSourceStart", 0);
        setIntField(term568614, term568614.getClass(), "encodedSourceEnd", 0);
        setField(term568614, term568614.getClass(), "sourceName", null);
        setIntField(term568614, term568614.getClass(), "baseLineno", 0);
        setIntField(term568614, term568614.getClass(), "endLineno", 0);
        setField(term568614, term568614.getClass(), "functions", null);
        setField(term568614, term568614.getClass(), "regexps", null);
        setField(term568614, term568614.getClass(), "itsVariables", null);
        setField(term568614, term568614.getClass(), "itsConst", null);
        setField(term568614, term568614.getClass(), "itsVariableNames", null);
        setIntField(term568614, term568614.getClass(), "varStart", 0);
        setField(term568614, term568614.getClass(), "compilerData", null);
        setIntField(term568614, term568614.getClass(), "type", 0);
        setField(term568614, term568614.getClass(), "next", null);
        setField(term568614, term568614.getClass(), "first", null);
        setField(term568614, term568614.getClass(), "last", null);
        setField(term568614, term568614.getClass(), "propListHead", null);
        setIntField(term568614, term568614.getClass(), "sourcePosition", 0);
        setField(term568614, term568614.getClass(), "jsType", null);
        setField(term568614, term568614.getClass(), "parent", null);
        setField(term568602, term568602.getClass(), "parent", term568614);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term568010;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term567918, args);
        assertTrue(recursiveEquals(term567918, term568709));
        assertTrue(recursiveEquals(term568010, term568710));
        assertTrue(recursiveEquals(retValue, term568602));
    }

};


