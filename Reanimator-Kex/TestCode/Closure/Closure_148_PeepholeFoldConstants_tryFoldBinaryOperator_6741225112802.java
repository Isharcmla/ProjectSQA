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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112802 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term812883;
     Object term812975;
     Object term813260;
     Object term813261;
     Object term813176;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112802() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term812883 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term812975 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term813061 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term813147 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term813061, term813061.getClass(), "next", term813147);
        setIntField(term813061, term813061.getClass(), "type", 0);
        setField(term812975, term812975.getClass(), "first", term813061);
        setIntField(term812975, term812975.getClass(), "type", 16);
        term813260 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term813260, term813260.getClass(), "currentTraversal", null);
        term813261 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term813262 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term813263 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term813261, term813261.getClass(), "number", 0.0);
        setIntField(term813261, term813261.getClass(), "type", 16);
        setField(term813261, term813261.getClass(), "next", null);
        setField(term813262, term813262.getClass(), "functionName", null);
        setBooleanField(term813262, term813262.getClass(), "itsNeedsActivation", false);
        setIntField(term813262, term813262.getClass(), "itsFunctionType", 0);
        setBooleanField(term813262, term813262.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term813262, term813262.getClass(), "encodedSourceStart", 0);
        setIntField(term813262, term813262.getClass(), "encodedSourceEnd", 0);
        setField(term813262, term813262.getClass(), "sourceName", null);
        setIntField(term813262, term813262.getClass(), "baseLineno", 0);
        setIntField(term813262, term813262.getClass(), "endLineno", 0);
        setField(term813262, term813262.getClass(), "functions", null);
        setField(term813262, term813262.getClass(), "regexps", null);
        setField(term813262, term813262.getClass(), "itsVariables", null);
        setField(term813262, term813262.getClass(), "itsConst", null);
        setField(term813262, term813262.getClass(), "itsVariableNames", null);
        setIntField(term813262, term813262.getClass(), "varStart", 0);
        setField(term813262, term813262.getClass(), "compilerData", null);
        setIntField(term813262, term813262.getClass(), "type", 0);
        setField(term813263, term813263.getClass(), "functionName", null);
        setBooleanField(term813263, term813263.getClass(), "itsNeedsActivation", false);
        setIntField(term813263, term813263.getClass(), "itsFunctionType", 0);
        setBooleanField(term813263, term813263.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term813263, term813263.getClass(), "encodedSourceStart", 0);
        setIntField(term813263, term813263.getClass(), "encodedSourceEnd", 0);
        setField(term813263, term813263.getClass(), "sourceName", null);
        setIntField(term813263, term813263.getClass(), "baseLineno", 0);
        setIntField(term813263, term813263.getClass(), "endLineno", 0);
        setField(term813263, term813263.getClass(), "functions", null);
        setField(term813263, term813263.getClass(), "regexps", null);
        setField(term813263, term813263.getClass(), "itsVariables", null);
        setField(term813263, term813263.getClass(), "itsConst", null);
        setField(term813263, term813263.getClass(), "itsVariableNames", null);
        setIntField(term813263, term813263.getClass(), "varStart", 0);
        setField(term813263, term813263.getClass(), "compilerData", null);
        setIntField(term813263, term813263.getClass(), "type", 0);
        setField(term813263, term813263.getClass(), "next", null);
        setField(term813263, term813263.getClass(), "first", null);
        setField(term813263, term813263.getClass(), "last", null);
        setField(term813263, term813263.getClass(), "propListHead", null);
        setIntField(term813263, term813263.getClass(), "sourcePosition", 0);
        setField(term813263, term813263.getClass(), "jsType", null);
        setField(term813263, term813263.getClass(), "parent", null);
        setField(term813262, term813262.getClass(), "next", term813263);
        setField(term813262, term813262.getClass(), "first", null);
        setField(term813262, term813262.getClass(), "last", null);
        setField(term813262, term813262.getClass(), "propListHead", null);
        setIntField(term813262, term813262.getClass(), "sourcePosition", 0);
        setField(term813262, term813262.getClass(), "jsType", null);
        setField(term813262, term813262.getClass(), "parent", null);
        setField(term813261, term813261.getClass(), "first", term813262);
        setField(term813261, term813261.getClass(), "last", null);
        setField(term813261, term813261.getClass(), "propListHead", null);
        setIntField(term813261, term813261.getClass(), "sourcePosition", 0);
        setField(term813261, term813261.getClass(), "jsType", null);
        setField(term813261, term813261.getClass(), "parent", null);
        term813176 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term813179 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term813189 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term813176, term813176.getClass(), "number", 0.0);
        setIntField(term813176, term813176.getClass(), "type", 16);
        setField(term813176, term813176.getClass(), "next", null);
        setField(term813179, term813179.getClass(), "functionName", null);
        setBooleanField(term813179, term813179.getClass(), "itsNeedsActivation", false);
        setIntField(term813179, term813179.getClass(), "itsFunctionType", 0);
        setBooleanField(term813179, term813179.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term813179, term813179.getClass(), "encodedSourceStart", 0);
        setIntField(term813179, term813179.getClass(), "encodedSourceEnd", 0);
        setField(term813179, term813179.getClass(), "sourceName", null);
        setIntField(term813179, term813179.getClass(), "baseLineno", 0);
        setIntField(term813179, term813179.getClass(), "endLineno", 0);
        setField(term813179, term813179.getClass(), "functions", null);
        setField(term813179, term813179.getClass(), "regexps", null);
        setField(term813179, term813179.getClass(), "itsVariables", null);
        setField(term813179, term813179.getClass(), "itsConst", null);
        setField(term813179, term813179.getClass(), "itsVariableNames", null);
        setIntField(term813179, term813179.getClass(), "varStart", 0);
        setField(term813179, term813179.getClass(), "compilerData", null);
        setIntField(term813179, term813179.getClass(), "type", 0);
        setField(term813189, term813189.getClass(), "functionName", null);
        setBooleanField(term813189, term813189.getClass(), "itsNeedsActivation", false);
        setIntField(term813189, term813189.getClass(), "itsFunctionType", 0);
        setBooleanField(term813189, term813189.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term813189, term813189.getClass(), "encodedSourceStart", 0);
        setIntField(term813189, term813189.getClass(), "encodedSourceEnd", 0);
        setField(term813189, term813189.getClass(), "sourceName", null);
        setIntField(term813189, term813189.getClass(), "baseLineno", 0);
        setIntField(term813189, term813189.getClass(), "endLineno", 0);
        setField(term813189, term813189.getClass(), "functions", null);
        setField(term813189, term813189.getClass(), "regexps", null);
        setField(term813189, term813189.getClass(), "itsVariables", null);
        setField(term813189, term813189.getClass(), "itsConst", null);
        setField(term813189, term813189.getClass(), "itsVariableNames", null);
        setIntField(term813189, term813189.getClass(), "varStart", 0);
        setField(term813189, term813189.getClass(), "compilerData", null);
        setIntField(term813189, term813189.getClass(), "type", 0);
        setField(term813189, term813189.getClass(), "next", null);
        setField(term813189, term813189.getClass(), "first", null);
        setField(term813189, term813189.getClass(), "last", null);
        setField(term813189, term813189.getClass(), "propListHead", null);
        setIntField(term813189, term813189.getClass(), "sourcePosition", 0);
        setField(term813189, term813189.getClass(), "jsType", null);
        setField(term813189, term813189.getClass(), "parent", null);
        setField(term813179, term813179.getClass(), "next", term813189);
        setField(term813179, term813179.getClass(), "first", null);
        setField(term813179, term813179.getClass(), "last", null);
        setField(term813179, term813179.getClass(), "propListHead", null);
        setIntField(term813179, term813179.getClass(), "sourcePosition", 0);
        setField(term813179, term813179.getClass(), "jsType", null);
        setField(term813179, term813179.getClass(), "parent", null);
        setField(term813176, term813176.getClass(), "first", term813179);
        setField(term813176, term813176.getClass(), "last", null);
        setField(term813176, term813176.getClass(), "propListHead", null);
        setIntField(term813176, term813176.getClass(), "sourcePosition", 0);
        setField(term813176, term813176.getClass(), "jsType", null);
        setField(term813176, term813176.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term812975;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term812883, args);
        assertTrue(recursiveEquals(term812883, term813260));
        assertTrue(recursiveEquals(term812975, term813261));
        assertTrue(recursiveEquals(retValue, term813176));
    }

};


