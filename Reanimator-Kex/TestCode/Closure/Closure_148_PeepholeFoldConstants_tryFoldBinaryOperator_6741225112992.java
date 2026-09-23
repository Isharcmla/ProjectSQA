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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112992 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term879425;
     Object term879517;
     Object term879785;
     Object term879786;
     Object term879712;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112992() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term879425 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term879517 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term879603 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term879689 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term879603, term879603.getClass(), "next", term879689);
        setField(term879517, term879517.getClass(), "first", term879603);
        setIntField(term879517, term879517.getClass(), "type", 33);
        term879785 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term879785, term879785.getClass(), "currentTraversal", null);
        term879786 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term879787 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term879788 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term879786, term879786.getClass(), "number", 0.0);
        setIntField(term879786, term879786.getClass(), "type", 33);
        setField(term879786, term879786.getClass(), "next", null);
        setField(term879787, term879787.getClass(), "functionName", null);
        setBooleanField(term879787, term879787.getClass(), "itsNeedsActivation", false);
        setIntField(term879787, term879787.getClass(), "itsFunctionType", 0);
        setBooleanField(term879787, term879787.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term879787, term879787.getClass(), "encodedSourceStart", 0);
        setIntField(term879787, term879787.getClass(), "encodedSourceEnd", 0);
        setField(term879787, term879787.getClass(), "sourceName", null);
        setIntField(term879787, term879787.getClass(), "baseLineno", 0);
        setIntField(term879787, term879787.getClass(), "endLineno", 0);
        setField(term879787, term879787.getClass(), "functions", null);
        setField(term879787, term879787.getClass(), "regexps", null);
        setField(term879787, term879787.getClass(), "itsVariables", null);
        setField(term879787, term879787.getClass(), "itsConst", null);
        setField(term879787, term879787.getClass(), "itsVariableNames", null);
        setIntField(term879787, term879787.getClass(), "varStart", 0);
        setField(term879787, term879787.getClass(), "compilerData", null);
        setIntField(term879787, term879787.getClass(), "type", 0);
        setField(term879788, term879788.getClass(), "functionName", null);
        setBooleanField(term879788, term879788.getClass(), "itsNeedsActivation", false);
        setIntField(term879788, term879788.getClass(), "itsFunctionType", 0);
        setBooleanField(term879788, term879788.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term879788, term879788.getClass(), "encodedSourceStart", 0);
        setIntField(term879788, term879788.getClass(), "encodedSourceEnd", 0);
        setField(term879788, term879788.getClass(), "sourceName", null);
        setIntField(term879788, term879788.getClass(), "baseLineno", 0);
        setIntField(term879788, term879788.getClass(), "endLineno", 0);
        setField(term879788, term879788.getClass(), "functions", null);
        setField(term879788, term879788.getClass(), "regexps", null);
        setField(term879788, term879788.getClass(), "itsVariables", null);
        setField(term879788, term879788.getClass(), "itsConst", null);
        setField(term879788, term879788.getClass(), "itsVariableNames", null);
        setIntField(term879788, term879788.getClass(), "varStart", 0);
        setField(term879788, term879788.getClass(), "compilerData", null);
        setIntField(term879788, term879788.getClass(), "type", 0);
        setField(term879788, term879788.getClass(), "next", null);
        setField(term879788, term879788.getClass(), "first", null);
        setField(term879788, term879788.getClass(), "last", null);
        setField(term879788, term879788.getClass(), "propListHead", null);
        setIntField(term879788, term879788.getClass(), "sourcePosition", 0);
        setField(term879788, term879788.getClass(), "jsType", null);
        setField(term879788, term879788.getClass(), "parent", null);
        setField(term879787, term879787.getClass(), "next", term879788);
        setField(term879787, term879787.getClass(), "first", null);
        setField(term879787, term879787.getClass(), "last", null);
        setField(term879787, term879787.getClass(), "propListHead", null);
        setIntField(term879787, term879787.getClass(), "sourcePosition", 0);
        setField(term879787, term879787.getClass(), "jsType", null);
        setField(term879787, term879787.getClass(), "parent", null);
        setField(term879786, term879786.getClass(), "first", term879787);
        setField(term879786, term879786.getClass(), "last", null);
        setField(term879786, term879786.getClass(), "propListHead", null);
        setIntField(term879786, term879786.getClass(), "sourcePosition", 0);
        setField(term879786, term879786.getClass(), "jsType", null);
        setField(term879786, term879786.getClass(), "parent", null);
        term879712 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term879715 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term879725 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term879712, term879712.getClass(), "number", 0.0);
        setIntField(term879712, term879712.getClass(), "type", 33);
        setField(term879712, term879712.getClass(), "next", null);
        setField(term879715, term879715.getClass(), "functionName", null);
        setBooleanField(term879715, term879715.getClass(), "itsNeedsActivation", false);
        setIntField(term879715, term879715.getClass(), "itsFunctionType", 0);
        setBooleanField(term879715, term879715.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term879715, term879715.getClass(), "encodedSourceStart", 0);
        setIntField(term879715, term879715.getClass(), "encodedSourceEnd", 0);
        setField(term879715, term879715.getClass(), "sourceName", null);
        setIntField(term879715, term879715.getClass(), "baseLineno", 0);
        setIntField(term879715, term879715.getClass(), "endLineno", 0);
        setField(term879715, term879715.getClass(), "functions", null);
        setField(term879715, term879715.getClass(), "regexps", null);
        setField(term879715, term879715.getClass(), "itsVariables", null);
        setField(term879715, term879715.getClass(), "itsConst", null);
        setField(term879715, term879715.getClass(), "itsVariableNames", null);
        setIntField(term879715, term879715.getClass(), "varStart", 0);
        setField(term879715, term879715.getClass(), "compilerData", null);
        setIntField(term879715, term879715.getClass(), "type", 0);
        setField(term879725, term879725.getClass(), "functionName", null);
        setBooleanField(term879725, term879725.getClass(), "itsNeedsActivation", false);
        setIntField(term879725, term879725.getClass(), "itsFunctionType", 0);
        setBooleanField(term879725, term879725.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term879725, term879725.getClass(), "encodedSourceStart", 0);
        setIntField(term879725, term879725.getClass(), "encodedSourceEnd", 0);
        setField(term879725, term879725.getClass(), "sourceName", null);
        setIntField(term879725, term879725.getClass(), "baseLineno", 0);
        setIntField(term879725, term879725.getClass(), "endLineno", 0);
        setField(term879725, term879725.getClass(), "functions", null);
        setField(term879725, term879725.getClass(), "regexps", null);
        setField(term879725, term879725.getClass(), "itsVariables", null);
        setField(term879725, term879725.getClass(), "itsConst", null);
        setField(term879725, term879725.getClass(), "itsVariableNames", null);
        setIntField(term879725, term879725.getClass(), "varStart", 0);
        setField(term879725, term879725.getClass(), "compilerData", null);
        setIntField(term879725, term879725.getClass(), "type", 0);
        setField(term879725, term879725.getClass(), "next", null);
        setField(term879725, term879725.getClass(), "first", null);
        setField(term879725, term879725.getClass(), "last", null);
        setField(term879725, term879725.getClass(), "propListHead", null);
        setIntField(term879725, term879725.getClass(), "sourcePosition", 0);
        setField(term879725, term879725.getClass(), "jsType", null);
        setField(term879725, term879725.getClass(), "parent", null);
        setField(term879715, term879715.getClass(), "next", term879725);
        setField(term879715, term879715.getClass(), "first", null);
        setField(term879715, term879715.getClass(), "last", null);
        setField(term879715, term879715.getClass(), "propListHead", null);
        setIntField(term879715, term879715.getClass(), "sourcePosition", 0);
        setField(term879715, term879715.getClass(), "jsType", null);
        setField(term879715, term879715.getClass(), "parent", null);
        setField(term879712, term879712.getClass(), "first", term879715);
        setField(term879712, term879712.getClass(), "last", null);
        setField(term879712, term879712.getClass(), "propListHead", null);
        setIntField(term879712, term879712.getClass(), "sourcePosition", 0);
        setField(term879712, term879712.getClass(), "jsType", null);
        setField(term879712, term879712.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term879517;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term879425, args);
        assertTrue(recursiveEquals(term879425, term879785));
        assertTrue(recursiveEquals(term879517, term879786));
        assertTrue(recursiveEquals(retValue, term879712));
    }

};


