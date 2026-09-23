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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1211611;
     Object term1211697;
     Object term1211906;
     Object term1211907;
     Object term1211861;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1211611 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term1211697 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term1211789 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term1211859 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1211697, term1211697.getClass(), "type", 37);
        setIntField(term1211789, term1211789.getClass(), "type", 35);
        setField(term1211789, term1211789.getClass(), "first", term1211859);
        setField(term1211697, term1211697.getClass(), "first", term1211789);
        term1211906 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term1211906, term1211906.getClass(), "currentTraversal", null);
        term1211907 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term1211908 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term1211909 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1211907, term1211907.getClass(), "functionName", null);
        setBooleanField(term1211907, term1211907.getClass(), "itsNeedsActivation", false);
        setIntField(term1211907, term1211907.getClass(), "itsFunctionType", 0);
        setBooleanField(term1211907, term1211907.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term1211907, term1211907.getClass(), "encodedSourceStart", 0);
        setIntField(term1211907, term1211907.getClass(), "encodedSourceEnd", 0);
        setField(term1211907, term1211907.getClass(), "sourceName", null);
        setIntField(term1211907, term1211907.getClass(), "baseLineno", 0);
        setIntField(term1211907, term1211907.getClass(), "endLineno", 0);
        setField(term1211907, term1211907.getClass(), "functions", null);
        setField(term1211907, term1211907.getClass(), "regexps", null);
        setField(term1211907, term1211907.getClass(), "itsVariables", null);
        setField(term1211907, term1211907.getClass(), "itsConst", null);
        setField(term1211907, term1211907.getClass(), "itsVariableNames", null);
        setIntField(term1211907, term1211907.getClass(), "varStart", 0);
        setField(term1211907, term1211907.getClass(), "compilerData", null);
        setIntField(term1211907, term1211907.getClass(), "type", 37);
        setField(term1211907, term1211907.getClass(), "next", null);
        setField(term1211908, term1211908.getClass(), "str", null);
        setIntField(term1211908, term1211908.getClass(), "type", 35);
        setField(term1211908, term1211908.getClass(), "next", null);
        setIntField(term1211909, term1211909.getClass(), "type", 0);
        setField(term1211909, term1211909.getClass(), "next", null);
        setField(term1211909, term1211909.getClass(), "first", null);
        setField(term1211909, term1211909.getClass(), "last", null);
        setField(term1211909, term1211909.getClass(), "propListHead", null);
        setIntField(term1211909, term1211909.getClass(), "sourcePosition", 0);
        setField(term1211909, term1211909.getClass(), "jsType", null);
        setField(term1211909, term1211909.getClass(), "parent", null);
        setField(term1211908, term1211908.getClass(), "first", term1211909);
        setField(term1211908, term1211908.getClass(), "last", null);
        setField(term1211908, term1211908.getClass(), "propListHead", null);
        setIntField(term1211908, term1211908.getClass(), "sourcePosition", 0);
        setField(term1211908, term1211908.getClass(), "jsType", null);
        setField(term1211908, term1211908.getClass(), "parent", null);
        setField(term1211907, term1211907.getClass(), "first", term1211908);
        setField(term1211907, term1211907.getClass(), "last", null);
        setField(term1211907, term1211907.getClass(), "propListHead", null);
        setIntField(term1211907, term1211907.getClass(), "sourcePosition", 0);
        setField(term1211907, term1211907.getClass(), "jsType", null);
        setField(term1211907, term1211907.getClass(), "parent", null);
        term1211861 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term1211871 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term1211873 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1211861, term1211861.getClass(), "functionName", null);
        setBooleanField(term1211861, term1211861.getClass(), "itsNeedsActivation", false);
        setIntField(term1211861, term1211861.getClass(), "itsFunctionType", 0);
        setBooleanField(term1211861, term1211861.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term1211861, term1211861.getClass(), "encodedSourceStart", 0);
        setIntField(term1211861, term1211861.getClass(), "encodedSourceEnd", 0);
        setField(term1211861, term1211861.getClass(), "sourceName", null);
        setIntField(term1211861, term1211861.getClass(), "baseLineno", 0);
        setIntField(term1211861, term1211861.getClass(), "endLineno", 0);
        setField(term1211861, term1211861.getClass(), "functions", null);
        setField(term1211861, term1211861.getClass(), "regexps", null);
        setField(term1211861, term1211861.getClass(), "itsVariables", null);
        setField(term1211861, term1211861.getClass(), "itsConst", null);
        setField(term1211861, term1211861.getClass(), "itsVariableNames", null);
        setIntField(term1211861, term1211861.getClass(), "varStart", 0);
        setField(term1211861, term1211861.getClass(), "compilerData", null);
        setIntField(term1211861, term1211861.getClass(), "type", 37);
        setField(term1211861, term1211861.getClass(), "next", null);
        setField(term1211871, term1211871.getClass(), "str", null);
        setIntField(term1211871, term1211871.getClass(), "type", 35);
        setField(term1211871, term1211871.getClass(), "next", null);
        setIntField(term1211873, term1211873.getClass(), "type", 0);
        setField(term1211873, term1211873.getClass(), "next", null);
        setField(term1211873, term1211873.getClass(), "first", null);
        setField(term1211873, term1211873.getClass(), "last", null);
        setField(term1211873, term1211873.getClass(), "propListHead", null);
        setIntField(term1211873, term1211873.getClass(), "sourcePosition", 0);
        setField(term1211873, term1211873.getClass(), "jsType", null);
        setField(term1211873, term1211873.getClass(), "parent", null);
        setField(term1211871, term1211871.getClass(), "first", term1211873);
        setField(term1211871, term1211871.getClass(), "last", null);
        setField(term1211871, term1211871.getClass(), "propListHead", null);
        setIntField(term1211871, term1211871.getClass(), "sourcePosition", 0);
        setField(term1211871, term1211871.getClass(), "jsType", null);
        setField(term1211871, term1211871.getClass(), "parent", null);
        setField(term1211861, term1211861.getClass(), "first", term1211871);
        setField(term1211861, term1211861.getClass(), "last", null);
        setField(term1211861, term1211861.getClass(), "propListHead", null);
        setIntField(term1211861, term1211861.getClass(), "sourcePosition", 0);
        setField(term1211861, term1211861.getClass(), "jsType", null);
        setField(term1211861, term1211861.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1211697;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term1211611, args);
        assertTrue(recursiveEquals(term1211611, term1211906));
        assertTrue(recursiveEquals(term1211697, term1211907));
        assertTrue(recursiveEquals(retValue, term1211861));
    }

};


