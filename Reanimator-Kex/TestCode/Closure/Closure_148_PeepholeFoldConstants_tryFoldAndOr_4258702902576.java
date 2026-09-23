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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902576 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term730284;
     Object term730370;
     Object term730548;
     Object term730640;
     Object term730753;
     Object term730754;
     Object term730756;
     Object term730757;
     Object term730658;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902576() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term730284 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term730370 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term730456 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term730456, term730456.getClass(), "type", 114);
        setField(term730370, term730370.getClass(), "parent", term730456);
        setIntField(term730370, term730370.getClass(), "type", 0);
        term730548 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term730548, term730548.getClass(), "type", 127);
        term730640 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term730640, term730640.getClass(), "type", 63);
        term730753 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term730753, term730753.getClass(), "currentTraversal", null);
        term730754 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term730755 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term730754, term730754.getClass(), "functionName", null);
        setBooleanField(term730754, term730754.getClass(), "itsNeedsActivation", false);
        setIntField(term730754, term730754.getClass(), "itsFunctionType", 0);
        setBooleanField(term730754, term730754.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term730754, term730754.getClass(), "encodedSourceStart", 0);
        setIntField(term730754, term730754.getClass(), "encodedSourceEnd", 0);
        setField(term730754, term730754.getClass(), "sourceName", null);
        setIntField(term730754, term730754.getClass(), "baseLineno", 0);
        setIntField(term730754, term730754.getClass(), "endLineno", 0);
        setField(term730754, term730754.getClass(), "functions", null);
        setField(term730754, term730754.getClass(), "regexps", null);
        setField(term730754, term730754.getClass(), "itsVariables", null);
        setField(term730754, term730754.getClass(), "itsConst", null);
        setField(term730754, term730754.getClass(), "itsVariableNames", null);
        setIntField(term730754, term730754.getClass(), "varStart", 0);
        setField(term730754, term730754.getClass(), "compilerData", null);
        setIntField(term730754, term730754.getClass(), "type", 0);
        setField(term730754, term730754.getClass(), "next", null);
        setField(term730754, term730754.getClass(), "first", null);
        setField(term730754, term730754.getClass(), "last", null);
        setField(term730754, term730754.getClass(), "propListHead", null);
        setIntField(term730754, term730754.getClass(), "sourcePosition", 0);
        setField(term730754, term730754.getClass(), "jsType", null);
        setField(term730755, term730755.getClass(), "functionName", null);
        setBooleanField(term730755, term730755.getClass(), "itsNeedsActivation", false);
        setIntField(term730755, term730755.getClass(), "itsFunctionType", 0);
        setBooleanField(term730755, term730755.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term730755, term730755.getClass(), "encodedSourceStart", 0);
        setIntField(term730755, term730755.getClass(), "encodedSourceEnd", 0);
        setField(term730755, term730755.getClass(), "sourceName", null);
        setIntField(term730755, term730755.getClass(), "baseLineno", 0);
        setIntField(term730755, term730755.getClass(), "endLineno", 0);
        setField(term730755, term730755.getClass(), "functions", null);
        setField(term730755, term730755.getClass(), "regexps", null);
        setField(term730755, term730755.getClass(), "itsVariables", null);
        setField(term730755, term730755.getClass(), "itsConst", null);
        setField(term730755, term730755.getClass(), "itsVariableNames", null);
        setIntField(term730755, term730755.getClass(), "varStart", 0);
        setField(term730755, term730755.getClass(), "compilerData", null);
        setIntField(term730755, term730755.getClass(), "type", 114);
        setField(term730755, term730755.getClass(), "next", null);
        setField(term730755, term730755.getClass(), "first", null);
        setField(term730755, term730755.getClass(), "last", null);
        setField(term730755, term730755.getClass(), "propListHead", null);
        setIntField(term730755, term730755.getClass(), "sourcePosition", 0);
        setField(term730755, term730755.getClass(), "jsType", null);
        setField(term730755, term730755.getClass(), "parent", null);
        setField(term730754, term730754.getClass(), "parent", term730755);
        term730756 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term730756, term730756.getClass(), "number", 0.0);
        setIntField(term730756, term730756.getClass(), "type", 127);
        setField(term730756, term730756.getClass(), "next", null);
        setField(term730756, term730756.getClass(), "first", null);
        setField(term730756, term730756.getClass(), "last", null);
        setField(term730756, term730756.getClass(), "propListHead", null);
        setIntField(term730756, term730756.getClass(), "sourcePosition", 0);
        setField(term730756, term730756.getClass(), "jsType", null);
        setField(term730756, term730756.getClass(), "parent", null);
        term730757 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term730757, term730757.getClass(), "number", 0.0);
        setIntField(term730757, term730757.getClass(), "type", 63);
        setField(term730757, term730757.getClass(), "next", null);
        setField(term730757, term730757.getClass(), "first", null);
        setField(term730757, term730757.getClass(), "last", null);
        setField(term730757, term730757.getClass(), "propListHead", null);
        setIntField(term730757, term730757.getClass(), "sourcePosition", 0);
        setField(term730757, term730757.getClass(), "jsType", null);
        setField(term730757, term730757.getClass(), "parent", null);
        term730658 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term730669 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term730658, term730658.getClass(), "functionName", null);
        setBooleanField(term730658, term730658.getClass(), "itsNeedsActivation", false);
        setIntField(term730658, term730658.getClass(), "itsFunctionType", 0);
        setBooleanField(term730658, term730658.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term730658, term730658.getClass(), "encodedSourceStart", 0);
        setIntField(term730658, term730658.getClass(), "encodedSourceEnd", 0);
        setField(term730658, term730658.getClass(), "sourceName", null);
        setIntField(term730658, term730658.getClass(), "baseLineno", 0);
        setIntField(term730658, term730658.getClass(), "endLineno", 0);
        setField(term730658, term730658.getClass(), "functions", null);
        setField(term730658, term730658.getClass(), "regexps", null);
        setField(term730658, term730658.getClass(), "itsVariables", null);
        setField(term730658, term730658.getClass(), "itsConst", null);
        setField(term730658, term730658.getClass(), "itsVariableNames", null);
        setIntField(term730658, term730658.getClass(), "varStart", 0);
        setField(term730658, term730658.getClass(), "compilerData", null);
        setIntField(term730658, term730658.getClass(), "type", 0);
        setField(term730658, term730658.getClass(), "next", null);
        setField(term730658, term730658.getClass(), "first", null);
        setField(term730658, term730658.getClass(), "last", null);
        setField(term730658, term730658.getClass(), "propListHead", null);
        setIntField(term730658, term730658.getClass(), "sourcePosition", 0);
        setField(term730658, term730658.getClass(), "jsType", null);
        setField(term730669, term730669.getClass(), "functionName", null);
        setBooleanField(term730669, term730669.getClass(), "itsNeedsActivation", false);
        setIntField(term730669, term730669.getClass(), "itsFunctionType", 0);
        setBooleanField(term730669, term730669.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term730669, term730669.getClass(), "encodedSourceStart", 0);
        setIntField(term730669, term730669.getClass(), "encodedSourceEnd", 0);
        setField(term730669, term730669.getClass(), "sourceName", null);
        setIntField(term730669, term730669.getClass(), "baseLineno", 0);
        setIntField(term730669, term730669.getClass(), "endLineno", 0);
        setField(term730669, term730669.getClass(), "functions", null);
        setField(term730669, term730669.getClass(), "regexps", null);
        setField(term730669, term730669.getClass(), "itsVariables", null);
        setField(term730669, term730669.getClass(), "itsConst", null);
        setField(term730669, term730669.getClass(), "itsVariableNames", null);
        setIntField(term730669, term730669.getClass(), "varStart", 0);
        setField(term730669, term730669.getClass(), "compilerData", null);
        setIntField(term730669, term730669.getClass(), "type", 114);
        setField(term730669, term730669.getClass(), "next", null);
        setField(term730669, term730669.getClass(), "first", null);
        setField(term730669, term730669.getClass(), "last", null);
        setField(term730669, term730669.getClass(), "propListHead", null);
        setIntField(term730669, term730669.getClass(), "sourcePosition", 0);
        setField(term730669, term730669.getClass(), "jsType", null);
        setField(term730669, term730669.getClass(), "parent", null);
        setField(term730658, term730658.getClass(), "parent", term730669);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term730370;
        args[1] = term730548;
        args[2] = term730640;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term730284, args);
        assertTrue(recursiveEquals(term730284, term730753));
        assertTrue(recursiveEquals(term730370, term730754));
        assertTrue(recursiveEquals(term730548, term730756));
        assertTrue(recursiveEquals(term730640, term730757));
        assertTrue(recursiveEquals(retValue, term730658));
    }

};


