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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111728 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term681378;
     Object term681470;
     Object term681716;
     Object term681717;
     Object term681641;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111728() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term681378 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term681470 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term681556 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term681626 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term681556, term681556.getClass(), "next", term681626);
        setField(term681470, term681470.getClass(), "first", term681556);
        setIntField(term681470, term681470.getClass(), "type", 21);
        term681716 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term681716, term681716.getClass(), "currentTraversal", null);
        term681717 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term681718 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term681719 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term681717, term681717.getClass(), "number", 0.0);
        setIntField(term681717, term681717.getClass(), "type", 21);
        setField(term681717, term681717.getClass(), "next", null);
        setField(term681718, term681718.getClass(), "functionName", null);
        setBooleanField(term681718, term681718.getClass(), "itsNeedsActivation", false);
        setIntField(term681718, term681718.getClass(), "itsFunctionType", 0);
        setBooleanField(term681718, term681718.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term681718, term681718.getClass(), "encodedSourceStart", 0);
        setIntField(term681718, term681718.getClass(), "encodedSourceEnd", 0);
        setField(term681718, term681718.getClass(), "sourceName", null);
        setIntField(term681718, term681718.getClass(), "baseLineno", 0);
        setIntField(term681718, term681718.getClass(), "endLineno", 0);
        setField(term681718, term681718.getClass(), "functions", null);
        setField(term681718, term681718.getClass(), "regexps", null);
        setField(term681718, term681718.getClass(), "itsVariables", null);
        setField(term681718, term681718.getClass(), "itsConst", null);
        setField(term681718, term681718.getClass(), "itsVariableNames", null);
        setIntField(term681718, term681718.getClass(), "varStart", 0);
        setField(term681718, term681718.getClass(), "compilerData", null);
        setIntField(term681718, term681718.getClass(), "type", 0);
        setIntField(term681719, term681719.getClass(), "type", 0);
        setField(term681719, term681719.getClass(), "next", null);
        setField(term681719, term681719.getClass(), "first", null);
        setField(term681719, term681719.getClass(), "last", null);
        setField(term681719, term681719.getClass(), "propListHead", null);
        setIntField(term681719, term681719.getClass(), "sourcePosition", 0);
        setField(term681719, term681719.getClass(), "jsType", null);
        setField(term681719, term681719.getClass(), "parent", null);
        setField(term681718, term681718.getClass(), "next", term681719);
        setField(term681718, term681718.getClass(), "first", null);
        setField(term681718, term681718.getClass(), "last", null);
        setField(term681718, term681718.getClass(), "propListHead", null);
        setIntField(term681718, term681718.getClass(), "sourcePosition", 0);
        setField(term681718, term681718.getClass(), "jsType", null);
        setField(term681718, term681718.getClass(), "parent", null);
        setField(term681717, term681717.getClass(), "first", term681718);
        setField(term681717, term681717.getClass(), "last", null);
        setField(term681717, term681717.getClass(), "propListHead", null);
        setIntField(term681717, term681717.getClass(), "sourcePosition", 0);
        setField(term681717, term681717.getClass(), "jsType", null);
        setField(term681717, term681717.getClass(), "parent", null);
        term681641 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term681644 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term681654 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term681641, term681641.getClass(), "number", 0.0);
        setIntField(term681641, term681641.getClass(), "type", 21);
        setField(term681641, term681641.getClass(), "next", null);
        setField(term681644, term681644.getClass(), "functionName", null);
        setBooleanField(term681644, term681644.getClass(), "itsNeedsActivation", false);
        setIntField(term681644, term681644.getClass(), "itsFunctionType", 0);
        setBooleanField(term681644, term681644.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term681644, term681644.getClass(), "encodedSourceStart", 0);
        setIntField(term681644, term681644.getClass(), "encodedSourceEnd", 0);
        setField(term681644, term681644.getClass(), "sourceName", null);
        setIntField(term681644, term681644.getClass(), "baseLineno", 0);
        setIntField(term681644, term681644.getClass(), "endLineno", 0);
        setField(term681644, term681644.getClass(), "functions", null);
        setField(term681644, term681644.getClass(), "regexps", null);
        setField(term681644, term681644.getClass(), "itsVariables", null);
        setField(term681644, term681644.getClass(), "itsConst", null);
        setField(term681644, term681644.getClass(), "itsVariableNames", null);
        setIntField(term681644, term681644.getClass(), "varStart", 0);
        setField(term681644, term681644.getClass(), "compilerData", null);
        setIntField(term681644, term681644.getClass(), "type", 0);
        setIntField(term681654, term681654.getClass(), "type", 0);
        setField(term681654, term681654.getClass(), "next", null);
        setField(term681654, term681654.getClass(), "first", null);
        setField(term681654, term681654.getClass(), "last", null);
        setField(term681654, term681654.getClass(), "propListHead", null);
        setIntField(term681654, term681654.getClass(), "sourcePosition", 0);
        setField(term681654, term681654.getClass(), "jsType", null);
        setField(term681654, term681654.getClass(), "parent", null);
        setField(term681644, term681644.getClass(), "next", term681654);
        setField(term681644, term681644.getClass(), "first", null);
        setField(term681644, term681644.getClass(), "last", null);
        setField(term681644, term681644.getClass(), "propListHead", null);
        setIntField(term681644, term681644.getClass(), "sourcePosition", 0);
        setField(term681644, term681644.getClass(), "jsType", null);
        setField(term681644, term681644.getClass(), "parent", null);
        setField(term681641, term681641.getClass(), "first", term681644);
        setField(term681641, term681641.getClass(), "last", null);
        setField(term681641, term681641.getClass(), "propListHead", null);
        setIntField(term681641, term681641.getClass(), "sourcePosition", 0);
        setField(term681641, term681641.getClass(), "jsType", null);
        setField(term681641, term681641.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term681470;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term681378, args);
        assertTrue(recursiveEquals(term681378, term681716));
        assertTrue(recursiveEquals(term681470, term681717));
        assertTrue(recursiveEquals(retValue, term681641));
    }

};


