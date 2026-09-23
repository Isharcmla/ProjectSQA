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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374772 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3659162;
     Object term3659254;
     Object term3660112;
     Object term3660113;
     Object term3659725;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374772() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3659162 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3659254 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3659346 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3659438 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3659530 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3659654 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3659346, term3659346.getClass(), "type", 35);
        setIntField(term3659530, term3659530.getClass(), "type", 40);
        setField(term3659530, term3659530.getClass(), "str", "indexOf");
        setField(term3659438, term3659438.getClass(), "next", term3659530);
        setIntField(term3659438, term3659438.getClass(), "type", 40);
        setField(term3659438, term3659438.getClass(), "str", null);
        setField(term3659346, term3659346.getClass(), "first", term3659438);
        setIntField(term3659654, term3659654.getClass(), "type", 41);
        setField(term3659654, term3659654.getClass(), "next", term3659530);
        setField(term3659346, term3659346.getClass(), "next", term3659654);
        setField(term3659254, term3659254.getClass(), "first", term3659346);
        setIntField(term3659254, term3659254.getClass(), "type", 37);
        term3660112 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3660112, term3660112.getClass(), "currentTraversal", null);
        term3660113 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3660114 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3660115 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3660116 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3660118 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3660113, term3660113.getClass(), "str", null);
        setIntField(term3660113, term3660113.getClass(), "type", 37);
        setField(term3660113, term3660113.getClass(), "next", null);
        setField(term3660114, term3660114.getClass(), "str", null);
        setIntField(term3660114, term3660114.getClass(), "type", 35);
        setField(term3660115, term3660115.getClass(), "functionName", null);
        setBooleanField(term3660115, term3660115.getClass(), "itsNeedsActivation", false);
        setIntField(term3660115, term3660115.getClass(), "itsFunctionType", 0);
        setBooleanField(term3660115, term3660115.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3660115, term3660115.getClass(), "encodedSourceStart", 0);
        setIntField(term3660115, term3660115.getClass(), "encodedSourceEnd", 0);
        setField(term3660115, term3660115.getClass(), "sourceName", null);
        setIntField(term3660115, term3660115.getClass(), "baseLineno", 0);
        setIntField(term3660115, term3660115.getClass(), "endLineno", 0);
        setField(term3660115, term3660115.getClass(), "functions", null);
        setField(term3660115, term3660115.getClass(), "regexps", null);
        setField(term3660115, term3660115.getClass(), "itsVariables", null);
        setField(term3660115, term3660115.getClass(), "itsConst", null);
        setField(term3660115, term3660115.getClass(), "itsVariableNames", null);
        setIntField(term3660115, term3660115.getClass(), "varStart", 0);
        setField(term3660115, term3660115.getClass(), "compilerData", null);
        setIntField(term3660115, term3660115.getClass(), "type", 41);
        setField(term3660116, term3660116.getClass(), "str", "");
        setIntField(term3660116, term3660116.getClass(), "type", 40);
        setField(term3660116, term3660116.getClass(), "next", null);
        setField(term3660116, term3660116.getClass(), "first", null);
        setField(term3660116, term3660116.getClass(), "last", null);
        setField(term3660116, term3660116.getClass(), "propListHead", null);
        setIntField(term3660116, term3660116.getClass(), "sourcePosition", 0);
        setField(term3660116, term3660116.getClass(), "jsType", null);
        setField(term3660116, term3660116.getClass(), "parent", null);
        setField(term3660115, term3660115.getClass(), "next", term3660116);
        setField(term3660115, term3660115.getClass(), "first", null);
        setField(term3660115, term3660115.getClass(), "last", null);
        setField(term3660115, term3660115.getClass(), "propListHead", null);
        setIntField(term3660115, term3660115.getClass(), "sourcePosition", 0);
        setField(term3660115, term3660115.getClass(), "jsType", null);
        setField(term3660115, term3660115.getClass(), "parent", null);
        setField(term3660114, term3660114.getClass(), "next", term3660115);
        setField(term3660118, term3660118.getClass(), "str", null);
        setIntField(term3660118, term3660118.getClass(), "type", 40);
        setField(term3660118, term3660118.getClass(), "next", term3660116);
        setField(term3660118, term3660118.getClass(), "first", null);
        setField(term3660118, term3660118.getClass(), "last", null);
        setField(term3660118, term3660118.getClass(), "propListHead", null);
        setIntField(term3660118, term3660118.getClass(), "sourcePosition", 0);
        setField(term3660118, term3660118.getClass(), "jsType", null);
        setField(term3660118, term3660118.getClass(), "parent", null);
        setField(term3660114, term3660114.getClass(), "first", term3660118);
        setField(term3660114, term3660114.getClass(), "last", null);
        setField(term3660114, term3660114.getClass(), "propListHead", null);
        setIntField(term3660114, term3660114.getClass(), "sourcePosition", 0);
        setField(term3660114, term3660114.getClass(), "jsType", null);
        setField(term3660114, term3660114.getClass(), "parent", null);
        setField(term3660113, term3660113.getClass(), "first", term3660114);
        setField(term3660113, term3660113.getClass(), "last", null);
        setField(term3660113, term3660113.getClass(), "propListHead", null);
        setIntField(term3660113, term3660113.getClass(), "sourcePosition", 0);
        setField(term3660113, term3660113.getClass(), "jsType", null);
        setField(term3660113, term3660113.getClass(), "parent", null);
        term3659725 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3659727 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3659729 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3659739 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3659744 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3659725, term3659725.getClass(), "str", null);
        setIntField(term3659725, term3659725.getClass(), "type", 37);
        setField(term3659725, term3659725.getClass(), "next", null);
        setField(term3659727, term3659727.getClass(), "str", null);
        setIntField(term3659727, term3659727.getClass(), "type", 35);
        setField(term3659729, term3659729.getClass(), "functionName", null);
        setBooleanField(term3659729, term3659729.getClass(), "itsNeedsActivation", false);
        setIntField(term3659729, term3659729.getClass(), "itsFunctionType", 0);
        setBooleanField(term3659729, term3659729.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3659729, term3659729.getClass(), "encodedSourceStart", 0);
        setIntField(term3659729, term3659729.getClass(), "encodedSourceEnd", 0);
        setField(term3659729, term3659729.getClass(), "sourceName", null);
        setIntField(term3659729, term3659729.getClass(), "baseLineno", 0);
        setIntField(term3659729, term3659729.getClass(), "endLineno", 0);
        setField(term3659729, term3659729.getClass(), "functions", null);
        setField(term3659729, term3659729.getClass(), "regexps", null);
        setField(term3659729, term3659729.getClass(), "itsVariables", null);
        setField(term3659729, term3659729.getClass(), "itsConst", null);
        setField(term3659729, term3659729.getClass(), "itsVariableNames", null);
        setIntField(term3659729, term3659729.getClass(), "varStart", 0);
        setField(term3659729, term3659729.getClass(), "compilerData", null);
        setIntField(term3659729, term3659729.getClass(), "type", 41);
        setField(term3659739, term3659739.getClass(), "str", "");
        setIntField(term3659739, term3659739.getClass(), "type", 40);
        setField(term3659739, term3659739.getClass(), "next", null);
        setField(term3659739, term3659739.getClass(), "first", null);
        setField(term3659739, term3659739.getClass(), "last", null);
        setField(term3659739, term3659739.getClass(), "propListHead", null);
        setIntField(term3659739, term3659739.getClass(), "sourcePosition", 0);
        setField(term3659739, term3659739.getClass(), "jsType", null);
        setField(term3659739, term3659739.getClass(), "parent", null);
        setField(term3659729, term3659729.getClass(), "next", term3659739);
        setField(term3659729, term3659729.getClass(), "first", null);
        setField(term3659729, term3659729.getClass(), "last", null);
        setField(term3659729, term3659729.getClass(), "propListHead", null);
        setIntField(term3659729, term3659729.getClass(), "sourcePosition", 0);
        setField(term3659729, term3659729.getClass(), "jsType", null);
        setField(term3659729, term3659729.getClass(), "parent", null);
        setField(term3659727, term3659727.getClass(), "next", term3659729);
        setField(term3659744, term3659744.getClass(), "str", null);
        setIntField(term3659744, term3659744.getClass(), "type", 40);
        setField(term3659744, term3659744.getClass(), "next", term3659739);
        setField(term3659744, term3659744.getClass(), "first", null);
        setField(term3659744, term3659744.getClass(), "last", null);
        setField(term3659744, term3659744.getClass(), "propListHead", null);
        setIntField(term3659744, term3659744.getClass(), "sourcePosition", 0);
        setField(term3659744, term3659744.getClass(), "jsType", null);
        setField(term3659744, term3659744.getClass(), "parent", null);
        setField(term3659727, term3659727.getClass(), "first", term3659744);
        setField(term3659727, term3659727.getClass(), "last", null);
        setField(term3659727, term3659727.getClass(), "propListHead", null);
        setIntField(term3659727, term3659727.getClass(), "sourcePosition", 0);
        setField(term3659727, term3659727.getClass(), "jsType", null);
        setField(term3659727, term3659727.getClass(), "parent", null);
        setField(term3659725, term3659725.getClass(), "first", term3659727);
        setField(term3659725, term3659725.getClass(), "last", null);
        setField(term3659725, term3659725.getClass(), "propListHead", null);
        setIntField(term3659725, term3659725.getClass(), "sourcePosition", 0);
        setField(term3659725, term3659725.getClass(), "jsType", null);
        setField(term3659725, term3659725.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3659254;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3659162, args);
        assertTrue(recursiveEquals(term3659162, term3660112));
        assertTrue(recursiveEquals(term3659254, term3660113));
        assertTrue(recursiveEquals(retValue, term3659725));
    }

};


