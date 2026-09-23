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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2642668;
     Object term2642754;
     Object term2643251;
     Object term2643252;
     Object term2643188;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2642668 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term2642754 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2642846 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2642916 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2643008 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term2642754, term2642754.getClass(), "type", 37);
        setIntField(term2642846, term2642846.getClass(), "type", 33);
        setField(term2642916, term2642916.getClass(), "next", term2643008);
        setIntField(term2642916, term2642916.getClass(), "type", 40);
        setField(term2642846, term2642846.getClass(), "first", term2642916);
        setField(term2642754, term2642754.getClass(), "first", term2642846);
        term2643251 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term2643251, term2643251.getClass(), "currentTraversal", null);
        term2643252 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2643253 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2643254 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2643255 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term2643252, term2643252.getClass(), "functionName", null);
        setBooleanField(term2643252, term2643252.getClass(), "itsNeedsActivation", false);
        setIntField(term2643252, term2643252.getClass(), "itsFunctionType", 0);
        setBooleanField(term2643252, term2643252.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term2643252, term2643252.getClass(), "encodedSourceStart", 0);
        setIntField(term2643252, term2643252.getClass(), "encodedSourceEnd", 0);
        setField(term2643252, term2643252.getClass(), "sourceName", null);
        setIntField(term2643252, term2643252.getClass(), "baseLineno", 0);
        setIntField(term2643252, term2643252.getClass(), "endLineno", 0);
        setField(term2643252, term2643252.getClass(), "functions", null);
        setField(term2643252, term2643252.getClass(), "regexps", null);
        setField(term2643252, term2643252.getClass(), "itsVariables", null);
        setField(term2643252, term2643252.getClass(), "itsConst", null);
        setField(term2643252, term2643252.getClass(), "itsVariableNames", null);
        setIntField(term2643252, term2643252.getClass(), "varStart", 0);
        setField(term2643252, term2643252.getClass(), "compilerData", null);
        setIntField(term2643252, term2643252.getClass(), "type", 37);
        setField(term2643252, term2643252.getClass(), "next", null);
        setField(term2643253, term2643253.getClass(), "str", null);
        setIntField(term2643253, term2643253.getClass(), "type", 33);
        setField(term2643253, term2643253.getClass(), "next", null);
        setIntField(term2643254, term2643254.getClass(), "type", 40);
        setField(term2643255, term2643255.getClass(), "str", null);
        setIntField(term2643255, term2643255.getClass(), "type", 0);
        setField(term2643255, term2643255.getClass(), "next", null);
        setField(term2643255, term2643255.getClass(), "first", null);
        setField(term2643255, term2643255.getClass(), "last", null);
        setField(term2643255, term2643255.getClass(), "propListHead", null);
        setIntField(term2643255, term2643255.getClass(), "sourcePosition", 0);
        setField(term2643255, term2643255.getClass(), "jsType", null);
        setField(term2643255, term2643255.getClass(), "parent", null);
        setField(term2643254, term2643254.getClass(), "next", term2643255);
        setField(term2643254, term2643254.getClass(), "first", null);
        setField(term2643254, term2643254.getClass(), "last", null);
        setField(term2643254, term2643254.getClass(), "propListHead", null);
        setIntField(term2643254, term2643254.getClass(), "sourcePosition", 0);
        setField(term2643254, term2643254.getClass(), "jsType", null);
        setField(term2643254, term2643254.getClass(), "parent", null);
        setField(term2643253, term2643253.getClass(), "first", term2643254);
        setField(term2643253, term2643253.getClass(), "last", null);
        setField(term2643253, term2643253.getClass(), "propListHead", null);
        setIntField(term2643253, term2643253.getClass(), "sourcePosition", 0);
        setField(term2643253, term2643253.getClass(), "jsType", null);
        setField(term2643253, term2643253.getClass(), "parent", null);
        setField(term2643252, term2643252.getClass(), "first", term2643253);
        setField(term2643252, term2643252.getClass(), "last", null);
        setField(term2643252, term2643252.getClass(), "propListHead", null);
        setIntField(term2643252, term2643252.getClass(), "sourcePosition", 0);
        setField(term2643252, term2643252.getClass(), "jsType", null);
        setField(term2643252, term2643252.getClass(), "parent", null);
        term2643188 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2643198 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2643200 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2643202 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term2643188, term2643188.getClass(), "functionName", null);
        setBooleanField(term2643188, term2643188.getClass(), "itsNeedsActivation", false);
        setIntField(term2643188, term2643188.getClass(), "itsFunctionType", 0);
        setBooleanField(term2643188, term2643188.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term2643188, term2643188.getClass(), "encodedSourceStart", 0);
        setIntField(term2643188, term2643188.getClass(), "encodedSourceEnd", 0);
        setField(term2643188, term2643188.getClass(), "sourceName", null);
        setIntField(term2643188, term2643188.getClass(), "baseLineno", 0);
        setIntField(term2643188, term2643188.getClass(), "endLineno", 0);
        setField(term2643188, term2643188.getClass(), "functions", null);
        setField(term2643188, term2643188.getClass(), "regexps", null);
        setField(term2643188, term2643188.getClass(), "itsVariables", null);
        setField(term2643188, term2643188.getClass(), "itsConst", null);
        setField(term2643188, term2643188.getClass(), "itsVariableNames", null);
        setIntField(term2643188, term2643188.getClass(), "varStart", 0);
        setField(term2643188, term2643188.getClass(), "compilerData", null);
        setIntField(term2643188, term2643188.getClass(), "type", 37);
        setField(term2643188, term2643188.getClass(), "next", null);
        setField(term2643198, term2643198.getClass(), "str", null);
        setIntField(term2643198, term2643198.getClass(), "type", 33);
        setField(term2643198, term2643198.getClass(), "next", null);
        setIntField(term2643200, term2643200.getClass(), "type", 40);
        setField(term2643202, term2643202.getClass(), "str", null);
        setIntField(term2643202, term2643202.getClass(), "type", 0);
        setField(term2643202, term2643202.getClass(), "next", null);
        setField(term2643202, term2643202.getClass(), "first", null);
        setField(term2643202, term2643202.getClass(), "last", null);
        setField(term2643202, term2643202.getClass(), "propListHead", null);
        setIntField(term2643202, term2643202.getClass(), "sourcePosition", 0);
        setField(term2643202, term2643202.getClass(), "jsType", null);
        setField(term2643202, term2643202.getClass(), "parent", null);
        setField(term2643200, term2643200.getClass(), "next", term2643202);
        setField(term2643200, term2643200.getClass(), "first", null);
        setField(term2643200, term2643200.getClass(), "last", null);
        setField(term2643200, term2643200.getClass(), "propListHead", null);
        setIntField(term2643200, term2643200.getClass(), "sourcePosition", 0);
        setField(term2643200, term2643200.getClass(), "jsType", null);
        setField(term2643200, term2643200.getClass(), "parent", null);
        setField(term2643198, term2643198.getClass(), "first", term2643200);
        setField(term2643198, term2643198.getClass(), "last", null);
        setField(term2643198, term2643198.getClass(), "propListHead", null);
        setIntField(term2643198, term2643198.getClass(), "sourcePosition", 0);
        setField(term2643198, term2643198.getClass(), "jsType", null);
        setField(term2643198, term2643198.getClass(), "parent", null);
        setField(term2643188, term2643188.getClass(), "first", term2643198);
        setField(term2643188, term2643188.getClass(), "last", null);
        setField(term2643188, term2643188.getClass(), "propListHead", null);
        setIntField(term2643188, term2643188.getClass(), "sourcePosition", 0);
        setField(term2643188, term2643188.getClass(), "jsType", null);
        setField(term2643188, term2643188.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2642754;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term2642668, args);
        assertTrue(recursiveEquals(term2642668, term2643251));
        assertTrue(recursiveEquals(term2642754, term2643252));
        assertTrue(recursiveEquals(retValue, term2643188));
    }

};


