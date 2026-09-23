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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term934895;
     Object term934965;
     Object term935910;
     Object term935911;
     Object term935791;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term934895 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term934965 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term935055 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term935147 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term935233 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term935147, term935147.getClass(), "type", 47);
        setField(term935055, term935055.getClass(), "next", term935147);
        setIntField(term935055, term935055.getClass(), "type", 0);
        setField(term934965, term934965.getClass(), "first", term935055);
        setIntField(term934965, term934965.getClass(), "type", 101);
        setField(term934965, term934965.getClass(), "parent", term935233);
        term935910 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term935910, term935910.getClass(), "currentTraversal", null);
        term935911 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term935912 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term935913 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term935914 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term935911, term935911.getClass(), "type", 101);
        setField(term935911, term935911.getClass(), "next", null);
        setIntField(term935912, term935912.getClass(), "encodedSourceStart", 0);
        setIntField(term935912, term935912.getClass(), "encodedSourceEnd", 0);
        setField(term935912, term935912.getClass(), "sourceName", null);
        setIntField(term935912, term935912.getClass(), "baseLineno", 0);
        setIntField(term935912, term935912.getClass(), "endLineno", 0);
        setField(term935912, term935912.getClass(), "functions", null);
        setField(term935912, term935912.getClass(), "regexps", null);
        setField(term935912, term935912.getClass(), "itsVariables", null);
        setField(term935912, term935912.getClass(), "itsConst", null);
        setField(term935912, term935912.getClass(), "itsVariableNames", null);
        setIntField(term935912, term935912.getClass(), "varStart", 0);
        setField(term935912, term935912.getClass(), "compilerData", null);
        setIntField(term935912, term935912.getClass(), "type", 0);
        setDoubleField(term935913, term935913.getClass(), "number", 0.0);
        setIntField(term935913, term935913.getClass(), "type", 47);
        setField(term935913, term935913.getClass(), "next", null);
        setField(term935913, term935913.getClass(), "first", null);
        setField(term935913, term935913.getClass(), "last", null);
        setField(term935913, term935913.getClass(), "propListHead", null);
        setIntField(term935913, term935913.getClass(), "sourcePosition", 0);
        setField(term935913, term935913.getClass(), "jsType", null);
        setField(term935913, term935913.getClass(), "parent", null);
        setField(term935912, term935912.getClass(), "next", term935913);
        setField(term935912, term935912.getClass(), "first", null);
        setField(term935912, term935912.getClass(), "last", null);
        setField(term935912, term935912.getClass(), "propListHead", null);
        setIntField(term935912, term935912.getClass(), "sourcePosition", 0);
        setField(term935912, term935912.getClass(), "jsType", null);
        setField(term935912, term935912.getClass(), "parent", null);
        setField(term935911, term935911.getClass(), "first", term935912);
        setField(term935911, term935911.getClass(), "last", null);
        setField(term935911, term935911.getClass(), "propListHead", null);
        setIntField(term935911, term935911.getClass(), "sourcePosition", 0);
        setField(term935911, term935911.getClass(), "jsType", null);
        setField(term935914, term935914.getClass(), "functionName", null);
        setBooleanField(term935914, term935914.getClass(), "itsNeedsActivation", false);
        setIntField(term935914, term935914.getClass(), "itsFunctionType", 0);
        setBooleanField(term935914, term935914.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term935914, term935914.getClass(), "encodedSourceStart", 0);
        setIntField(term935914, term935914.getClass(), "encodedSourceEnd", 0);
        setField(term935914, term935914.getClass(), "sourceName", null);
        setIntField(term935914, term935914.getClass(), "baseLineno", 0);
        setIntField(term935914, term935914.getClass(), "endLineno", 0);
        setField(term935914, term935914.getClass(), "functions", null);
        setField(term935914, term935914.getClass(), "regexps", null);
        setField(term935914, term935914.getClass(), "itsVariables", null);
        setField(term935914, term935914.getClass(), "itsConst", null);
        setField(term935914, term935914.getClass(), "itsVariableNames", null);
        setIntField(term935914, term935914.getClass(), "varStart", 0);
        setField(term935914, term935914.getClass(), "compilerData", null);
        setIntField(term935914, term935914.getClass(), "type", 0);
        setField(term935914, term935914.getClass(), "next", null);
        setField(term935914, term935914.getClass(), "first", null);
        setField(term935914, term935914.getClass(), "last", null);
        setField(term935914, term935914.getClass(), "propListHead", null);
        setIntField(term935914, term935914.getClass(), "sourcePosition", 0);
        setField(term935914, term935914.getClass(), "jsType", null);
        setField(term935914, term935914.getClass(), "parent", null);
        setField(term935911, term935911.getClass(), "parent", term935914);
        term935791 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term935793 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term935800 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term935806 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term935791, term935791.getClass(), "type", 101);
        setField(term935791, term935791.getClass(), "next", null);
        setIntField(term935793, term935793.getClass(), "encodedSourceStart", 0);
        setIntField(term935793, term935793.getClass(), "encodedSourceEnd", 0);
        setField(term935793, term935793.getClass(), "sourceName", null);
        setIntField(term935793, term935793.getClass(), "baseLineno", 0);
        setIntField(term935793, term935793.getClass(), "endLineno", 0);
        setField(term935793, term935793.getClass(), "functions", null);
        setField(term935793, term935793.getClass(), "regexps", null);
        setField(term935793, term935793.getClass(), "itsVariables", null);
        setField(term935793, term935793.getClass(), "itsConst", null);
        setField(term935793, term935793.getClass(), "itsVariableNames", null);
        setIntField(term935793, term935793.getClass(), "varStart", 0);
        setField(term935793, term935793.getClass(), "compilerData", null);
        setIntField(term935793, term935793.getClass(), "type", 0);
        setDoubleField(term935800, term935800.getClass(), "number", 0.0);
        setIntField(term935800, term935800.getClass(), "type", 47);
        setField(term935800, term935800.getClass(), "next", null);
        setField(term935800, term935800.getClass(), "first", null);
        setField(term935800, term935800.getClass(), "last", null);
        setField(term935800, term935800.getClass(), "propListHead", null);
        setIntField(term935800, term935800.getClass(), "sourcePosition", 0);
        setField(term935800, term935800.getClass(), "jsType", null);
        setField(term935800, term935800.getClass(), "parent", null);
        setField(term935793, term935793.getClass(), "next", term935800);
        setField(term935793, term935793.getClass(), "first", null);
        setField(term935793, term935793.getClass(), "last", null);
        setField(term935793, term935793.getClass(), "propListHead", null);
        setIntField(term935793, term935793.getClass(), "sourcePosition", 0);
        setField(term935793, term935793.getClass(), "jsType", null);
        setField(term935793, term935793.getClass(), "parent", null);
        setField(term935791, term935791.getClass(), "first", term935793);
        setField(term935791, term935791.getClass(), "last", null);
        setField(term935791, term935791.getClass(), "propListHead", null);
        setIntField(term935791, term935791.getClass(), "sourcePosition", 0);
        setField(term935791, term935791.getClass(), "jsType", null);
        setField(term935806, term935806.getClass(), "functionName", null);
        setBooleanField(term935806, term935806.getClass(), "itsNeedsActivation", false);
        setIntField(term935806, term935806.getClass(), "itsFunctionType", 0);
        setBooleanField(term935806, term935806.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term935806, term935806.getClass(), "encodedSourceStart", 0);
        setIntField(term935806, term935806.getClass(), "encodedSourceEnd", 0);
        setField(term935806, term935806.getClass(), "sourceName", null);
        setIntField(term935806, term935806.getClass(), "baseLineno", 0);
        setIntField(term935806, term935806.getClass(), "endLineno", 0);
        setField(term935806, term935806.getClass(), "functions", null);
        setField(term935806, term935806.getClass(), "regexps", null);
        setField(term935806, term935806.getClass(), "itsVariables", null);
        setField(term935806, term935806.getClass(), "itsConst", null);
        setField(term935806, term935806.getClass(), "itsVariableNames", null);
        setIntField(term935806, term935806.getClass(), "varStart", 0);
        setField(term935806, term935806.getClass(), "compilerData", null);
        setIntField(term935806, term935806.getClass(), "type", 0);
        setField(term935806, term935806.getClass(), "next", null);
        setField(term935806, term935806.getClass(), "first", null);
        setField(term935806, term935806.getClass(), "last", null);
        setField(term935806, term935806.getClass(), "propListHead", null);
        setIntField(term935806, term935806.getClass(), "sourcePosition", 0);
        setField(term935806, term935806.getClass(), "jsType", null);
        setField(term935806, term935806.getClass(), "parent", null);
        setField(term935791, term935791.getClass(), "parent", term935806);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term934965;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term934895, args);
        assertTrue(recursiveEquals(term934895, term935910));
        assertTrue(recursiveEquals(term934965, term935911));
        assertTrue(recursiveEquals(retValue, term935791));
    }

};


