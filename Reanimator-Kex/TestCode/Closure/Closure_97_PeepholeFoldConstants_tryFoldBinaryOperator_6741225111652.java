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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term660076;
     Object term660168;
     Object term660547;
     Object term660548;
     Object term660470;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term660076 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term660168 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term660260 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term660346 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term660260, term660260.getClass(), "next", term660346);
        setIntField(term660260, term660260.getClass(), "type", 0);
        setField(term660168, term660168.getClass(), "first", term660260);
        setIntField(term660168, term660168.getClass(), "type", 101);
        setField(term660168, term660168.getClass(), "parent", null);
        term660547 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term660547, term660547.getClass(), "currentTraversal", null);
        term660548 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term660549 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term660550 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term660548, term660548.getClass(), "str", null);
        setIntField(term660548, term660548.getClass(), "type", 101);
        setField(term660548, term660548.getClass(), "next", null);
        setField(term660549, term660549.getClass(), "str", null);
        setIntField(term660549, term660549.getClass(), "type", 0);
        setField(term660550, term660550.getClass(), "functionName", null);
        setBooleanField(term660550, term660550.getClass(), "itsNeedsActivation", false);
        setIntField(term660550, term660550.getClass(), "itsFunctionType", 0);
        setBooleanField(term660550, term660550.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term660550, term660550.getClass(), "encodedSourceStart", 0);
        setIntField(term660550, term660550.getClass(), "encodedSourceEnd", 0);
        setField(term660550, term660550.getClass(), "sourceName", null);
        setIntField(term660550, term660550.getClass(), "baseLineno", 0);
        setIntField(term660550, term660550.getClass(), "endLineno", 0);
        setField(term660550, term660550.getClass(), "functions", null);
        setField(term660550, term660550.getClass(), "regexps", null);
        setField(term660550, term660550.getClass(), "itsVariables", null);
        setField(term660550, term660550.getClass(), "itsConst", null);
        setField(term660550, term660550.getClass(), "itsVariableNames", null);
        setIntField(term660550, term660550.getClass(), "varStart", 0);
        setField(term660550, term660550.getClass(), "compilerData", null);
        setIntField(term660550, term660550.getClass(), "type", 0);
        setField(term660550, term660550.getClass(), "next", null);
        setField(term660550, term660550.getClass(), "first", null);
        setField(term660550, term660550.getClass(), "last", null);
        setField(term660550, term660550.getClass(), "propListHead", null);
        setIntField(term660550, term660550.getClass(), "sourcePosition", 0);
        setField(term660550, term660550.getClass(), "jsType", null);
        setField(term660550, term660550.getClass(), "parent", null);
        setField(term660549, term660549.getClass(), "next", term660550);
        setField(term660549, term660549.getClass(), "first", null);
        setField(term660549, term660549.getClass(), "last", null);
        setField(term660549, term660549.getClass(), "propListHead", null);
        setIntField(term660549, term660549.getClass(), "sourcePosition", 0);
        setField(term660549, term660549.getClass(), "jsType", null);
        setField(term660549, term660549.getClass(), "parent", null);
        setField(term660548, term660548.getClass(), "first", term660549);
        setField(term660548, term660548.getClass(), "last", null);
        setField(term660548, term660548.getClass(), "propListHead", null);
        setIntField(term660548, term660548.getClass(), "sourcePosition", 0);
        setField(term660548, term660548.getClass(), "jsType", null);
        setField(term660548, term660548.getClass(), "parent", null);
        term660470 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term660472 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term660474 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term660470, term660470.getClass(), "str", null);
        setIntField(term660470, term660470.getClass(), "type", 101);
        setField(term660470, term660470.getClass(), "next", null);
        setField(term660472, term660472.getClass(), "str", null);
        setIntField(term660472, term660472.getClass(), "type", 0);
        setField(term660474, term660474.getClass(), "functionName", null);
        setBooleanField(term660474, term660474.getClass(), "itsNeedsActivation", false);
        setIntField(term660474, term660474.getClass(), "itsFunctionType", 0);
        setBooleanField(term660474, term660474.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term660474, term660474.getClass(), "encodedSourceStart", 0);
        setIntField(term660474, term660474.getClass(), "encodedSourceEnd", 0);
        setField(term660474, term660474.getClass(), "sourceName", null);
        setIntField(term660474, term660474.getClass(), "baseLineno", 0);
        setIntField(term660474, term660474.getClass(), "endLineno", 0);
        setField(term660474, term660474.getClass(), "functions", null);
        setField(term660474, term660474.getClass(), "regexps", null);
        setField(term660474, term660474.getClass(), "itsVariables", null);
        setField(term660474, term660474.getClass(), "itsConst", null);
        setField(term660474, term660474.getClass(), "itsVariableNames", null);
        setIntField(term660474, term660474.getClass(), "varStart", 0);
        setField(term660474, term660474.getClass(), "compilerData", null);
        setIntField(term660474, term660474.getClass(), "type", 0);
        setField(term660474, term660474.getClass(), "next", null);
        setField(term660474, term660474.getClass(), "first", null);
        setField(term660474, term660474.getClass(), "last", null);
        setField(term660474, term660474.getClass(), "propListHead", null);
        setIntField(term660474, term660474.getClass(), "sourcePosition", 0);
        setField(term660474, term660474.getClass(), "jsType", null);
        setField(term660474, term660474.getClass(), "parent", null);
        setField(term660472, term660472.getClass(), "next", term660474);
        setField(term660472, term660472.getClass(), "first", null);
        setField(term660472, term660472.getClass(), "last", null);
        setField(term660472, term660472.getClass(), "propListHead", null);
        setIntField(term660472, term660472.getClass(), "sourcePosition", 0);
        setField(term660472, term660472.getClass(), "jsType", null);
        setField(term660472, term660472.getClass(), "parent", null);
        setField(term660470, term660470.getClass(), "first", term660472);
        setField(term660470, term660470.getClass(), "last", null);
        setField(term660470, term660470.getClass(), "propListHead", null);
        setIntField(term660470, term660470.getClass(), "sourcePosition", 0);
        setField(term660470, term660470.getClass(), "jsType", null);
        setField(term660470, term660470.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term660168;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term660076, args);
        assertTrue(recursiveEquals(term660076, term660547));
        assertTrue(recursiveEquals(term660168, term660548));
        assertTrue(recursiveEquals(retValue, term660470));
    }

};


