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

public class ReferenceCollectingCallback_visit_872273174530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134646;
     Object term134861;
     Object term134818;
     Object term135177;
     Object term135178;
     Object term135179;

    public ReferenceCollectingCallback_visit_872273174530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134646 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term134861 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term134861, term134861.getClass(), "type", 101);
        term134818 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term134818, term134818.getClass(), "type", 101);
        setField(term134818, term134818.getClass(), "first", term134861);
        term135177 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term135177, term135177.getClass(), "referenceMap", null);
        setField(term135177, term135177.getClass(), "blockStack", null);
        setField(term135177, term135177.getClass(), "behavior", null);
        setField(term135177, term135177.getClass(), "compiler", null);
        setField(term135177, term135177.getClass(), "varFilter", null);
        term135178 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term135178, term135178.getClass(), "functionName", null);
        setBooleanField(term135178, term135178.getClass(), "itsNeedsActivation", false);
        setIntField(term135178, term135178.getClass(), "itsFunctionType", 0);
        setBooleanField(term135178, term135178.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term135178, term135178.getClass(), "encodedSourceStart", 0);
        setIntField(term135178, term135178.getClass(), "encodedSourceEnd", 0);
        setField(term135178, term135178.getClass(), "sourceName", null);
        setIntField(term135178, term135178.getClass(), "baseLineno", 0);
        setIntField(term135178, term135178.getClass(), "endLineno", 0);
        setField(term135178, term135178.getClass(), "functions", null);
        setField(term135178, term135178.getClass(), "regexps", null);
        setField(term135178, term135178.getClass(), "itsVariables", null);
        setField(term135178, term135178.getClass(), "itsConst", null);
        setField(term135178, term135178.getClass(), "itsVariableNames", null);
        setIntField(term135178, term135178.getClass(), "varStart", 0);
        setField(term135178, term135178.getClass(), "compilerData", null);
        setIntField(term135178, term135178.getClass(), "type", 101);
        setField(term135178, term135178.getClass(), "next", null);
        setField(term135178, term135178.getClass(), "first", null);
        setField(term135178, term135178.getClass(), "last", null);
        setField(term135178, term135178.getClass(), "propListHead", null);
        setIntField(term135178, term135178.getClass(), "sourcePosition", 0);
        setField(term135178, term135178.getClass(), "jsType", null);
        setField(term135178, term135178.getClass(), "parent", null);
        term135179 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term135180 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term135179, term135179.getClass(), "functionName", null);
        setBooleanField(term135179, term135179.getClass(), "itsNeedsActivation", false);
        setIntField(term135179, term135179.getClass(), "itsFunctionType", 0);
        setBooleanField(term135179, term135179.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term135179, term135179.getClass(), "encodedSourceStart", 0);
        setIntField(term135179, term135179.getClass(), "encodedSourceEnd", 0);
        setField(term135179, term135179.getClass(), "sourceName", null);
        setIntField(term135179, term135179.getClass(), "baseLineno", 0);
        setIntField(term135179, term135179.getClass(), "endLineno", 0);
        setField(term135179, term135179.getClass(), "functions", null);
        setField(term135179, term135179.getClass(), "regexps", null);
        setField(term135179, term135179.getClass(), "itsVariables", null);
        setField(term135179, term135179.getClass(), "itsConst", null);
        setField(term135179, term135179.getClass(), "itsVariableNames", null);
        setIntField(term135179, term135179.getClass(), "varStart", 0);
        setField(term135179, term135179.getClass(), "compilerData", null);
        setIntField(term135179, term135179.getClass(), "type", 101);
        setField(term135179, term135179.getClass(), "next", null);
        setField(term135180, term135180.getClass(), "functionName", null);
        setBooleanField(term135180, term135180.getClass(), "itsNeedsActivation", false);
        setIntField(term135180, term135180.getClass(), "itsFunctionType", 0);
        setBooleanField(term135180, term135180.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term135180, term135180.getClass(), "encodedSourceStart", 0);
        setIntField(term135180, term135180.getClass(), "encodedSourceEnd", 0);
        setField(term135180, term135180.getClass(), "sourceName", null);
        setIntField(term135180, term135180.getClass(), "baseLineno", 0);
        setIntField(term135180, term135180.getClass(), "endLineno", 0);
        setField(term135180, term135180.getClass(), "functions", null);
        setField(term135180, term135180.getClass(), "regexps", null);
        setField(term135180, term135180.getClass(), "itsVariables", null);
        setField(term135180, term135180.getClass(), "itsConst", null);
        setField(term135180, term135180.getClass(), "itsVariableNames", null);
        setIntField(term135180, term135180.getClass(), "varStart", 0);
        setField(term135180, term135180.getClass(), "compilerData", null);
        setIntField(term135180, term135180.getClass(), "type", 101);
        setField(term135180, term135180.getClass(), "next", null);
        setField(term135180, term135180.getClass(), "first", null);
        setField(term135180, term135180.getClass(), "last", null);
        setField(term135180, term135180.getClass(), "propListHead", null);
        setIntField(term135180, term135180.getClass(), "sourcePosition", 0);
        setField(term135180, term135180.getClass(), "jsType", null);
        setField(term135180, term135180.getClass(), "parent", null);
        setField(term135179, term135179.getClass(), "first", term135180);
        setField(term135179, term135179.getClass(), "last", null);
        setField(term135179, term135179.getClass(), "propListHead", null);
        setIntField(term135179, term135179.getClass(), "sourcePosition", 0);
        setField(term135179, term135179.getClass(), "jsType", null);
        setField(term135179, term135179.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term134861;
        args[2] = term134818;
        callMethod(klass, "visit", argTypes, term134646, args);
        assertTrue(recursiveEquals(term134646, term135177));
        assertTrue(recursiveEquals(term134861, term135179));
        assertTrue(recursiveEquals(term134818, null));
    }

};


