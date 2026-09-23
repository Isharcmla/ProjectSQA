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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111627 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term414664;
     Object term414756;
     Object term415369;
     Object term415370;
     Object term415324;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111627() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term414664 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term414756 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term414842 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term414912 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term414842, term414842.getClass(), "next", term414912);
        setField(term414756, term414756.getClass(), "first", term414842);
        setIntField(term414756, term414756.getClass(), "type", 23);
        term415369 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term415369, term415369.getClass(), "currentTraversal", null);
        term415370 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term415371 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term415372 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term415370, term415370.getClass(), "number", 0.0);
        setIntField(term415370, term415370.getClass(), "type", 23);
        setField(term415370, term415370.getClass(), "next", null);
        setField(term415371, term415371.getClass(), "functionName", null);
        setBooleanField(term415371, term415371.getClass(), "itsNeedsActivation", false);
        setIntField(term415371, term415371.getClass(), "itsFunctionType", 0);
        setBooleanField(term415371, term415371.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term415371, term415371.getClass(), "encodedSourceStart", 0);
        setIntField(term415371, term415371.getClass(), "encodedSourceEnd", 0);
        setField(term415371, term415371.getClass(), "sourceName", null);
        setIntField(term415371, term415371.getClass(), "baseLineno", 0);
        setIntField(term415371, term415371.getClass(), "endLineno", 0);
        setField(term415371, term415371.getClass(), "functions", null);
        setField(term415371, term415371.getClass(), "regexps", null);
        setField(term415371, term415371.getClass(), "itsVariables", null);
        setField(term415371, term415371.getClass(), "itsConst", null);
        setField(term415371, term415371.getClass(), "itsVariableNames", null);
        setIntField(term415371, term415371.getClass(), "varStart", 0);
        setField(term415371, term415371.getClass(), "compilerData", null);
        setIntField(term415371, term415371.getClass(), "type", 0);
        setIntField(term415372, term415372.getClass(), "type", 0);
        setField(term415372, term415372.getClass(), "next", null);
        setField(term415372, term415372.getClass(), "first", null);
        setField(term415372, term415372.getClass(), "last", null);
        setField(term415372, term415372.getClass(), "propListHead", null);
        setIntField(term415372, term415372.getClass(), "sourcePosition", 0);
        setField(term415372, term415372.getClass(), "jsType", null);
        setField(term415372, term415372.getClass(), "parent", null);
        setField(term415371, term415371.getClass(), "next", term415372);
        setField(term415371, term415371.getClass(), "first", null);
        setField(term415371, term415371.getClass(), "last", null);
        setField(term415371, term415371.getClass(), "propListHead", null);
        setIntField(term415371, term415371.getClass(), "sourcePosition", 0);
        setField(term415371, term415371.getClass(), "jsType", null);
        setField(term415371, term415371.getClass(), "parent", null);
        setField(term415370, term415370.getClass(), "first", term415371);
        setField(term415370, term415370.getClass(), "last", null);
        setField(term415370, term415370.getClass(), "propListHead", null);
        setIntField(term415370, term415370.getClass(), "sourcePosition", 0);
        setField(term415370, term415370.getClass(), "jsType", null);
        setField(term415370, term415370.getClass(), "parent", null);
        term415324 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term415327 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term415337 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term415324, term415324.getClass(), "number", 0.0);
        setIntField(term415324, term415324.getClass(), "type", 23);
        setField(term415324, term415324.getClass(), "next", null);
        setField(term415327, term415327.getClass(), "functionName", null);
        setBooleanField(term415327, term415327.getClass(), "itsNeedsActivation", false);
        setIntField(term415327, term415327.getClass(), "itsFunctionType", 0);
        setBooleanField(term415327, term415327.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term415327, term415327.getClass(), "encodedSourceStart", 0);
        setIntField(term415327, term415327.getClass(), "encodedSourceEnd", 0);
        setField(term415327, term415327.getClass(), "sourceName", null);
        setIntField(term415327, term415327.getClass(), "baseLineno", 0);
        setIntField(term415327, term415327.getClass(), "endLineno", 0);
        setField(term415327, term415327.getClass(), "functions", null);
        setField(term415327, term415327.getClass(), "regexps", null);
        setField(term415327, term415327.getClass(), "itsVariables", null);
        setField(term415327, term415327.getClass(), "itsConst", null);
        setField(term415327, term415327.getClass(), "itsVariableNames", null);
        setIntField(term415327, term415327.getClass(), "varStart", 0);
        setField(term415327, term415327.getClass(), "compilerData", null);
        setIntField(term415327, term415327.getClass(), "type", 0);
        setIntField(term415337, term415337.getClass(), "type", 0);
        setField(term415337, term415337.getClass(), "next", null);
        setField(term415337, term415337.getClass(), "first", null);
        setField(term415337, term415337.getClass(), "last", null);
        setField(term415337, term415337.getClass(), "propListHead", null);
        setIntField(term415337, term415337.getClass(), "sourcePosition", 0);
        setField(term415337, term415337.getClass(), "jsType", null);
        setField(term415337, term415337.getClass(), "parent", null);
        setField(term415327, term415327.getClass(), "next", term415337);
        setField(term415327, term415327.getClass(), "first", null);
        setField(term415327, term415327.getClass(), "last", null);
        setField(term415327, term415327.getClass(), "propListHead", null);
        setIntField(term415327, term415327.getClass(), "sourcePosition", 0);
        setField(term415327, term415327.getClass(), "jsType", null);
        setField(term415327, term415327.getClass(), "parent", null);
        setField(term415324, term415324.getClass(), "first", term415327);
        setField(term415324, term415324.getClass(), "last", null);
        setField(term415324, term415324.getClass(), "propListHead", null);
        setIntField(term415324, term415324.getClass(), "sourcePosition", 0);
        setField(term415324, term415324.getClass(), "jsType", null);
        setField(term415324, term415324.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term414756;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term414664, args);
        assertTrue(recursiveEquals(term414664, term415369));
        assertTrue(recursiveEquals(term414756, term415370));
        assertTrue(recursiveEquals(retValue, term415324));
    }

};


