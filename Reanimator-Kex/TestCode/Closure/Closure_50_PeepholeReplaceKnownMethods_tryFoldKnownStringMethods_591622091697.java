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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091697 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3607607;
     Object term3607693;
     Object term3609211;
     Object term3609212;
     Object term3609103;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091697() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3607607 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3607693 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3607785 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3607877 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3607969 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3608077 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3607693, term3607693.getClass(), "type", 37);
        setIntField(term3607785, term3607785.getClass(), "type", 35);
        setIntField(term3607969, term3607969.getClass(), "type", 40);
        setField(term3607969, term3607969.getClass(), "str", "");
        setField(term3607877, term3607877.getClass(), "next", term3607969);
        setIntField(term3607877, term3607877.getClass(), "type", 40);
        setField(term3607785, term3607785.getClass(), "first", term3607877);
        setIntField(term3608077, term3608077.getClass(), "type", 43);
        setField(term3607785, term3607785.getClass(), "next", term3608077);
        setField(term3607693, term3607693.getClass(), "first", term3607785);
        term3609211 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3609211, term3609211.getClass(), "currentTraversal", null);
        term3609212 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3609213 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3609214 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3609215 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3609216 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3609212, term3609212.getClass(), "functionName", null);
        setBooleanField(term3609212, term3609212.getClass(), "itsNeedsActivation", false);
        setIntField(term3609212, term3609212.getClass(), "itsFunctionType", 0);
        setBooleanField(term3609212, term3609212.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3609212, term3609212.getClass(), "encodedSourceStart", 0);
        setIntField(term3609212, term3609212.getClass(), "encodedSourceEnd", 0);
        setField(term3609212, term3609212.getClass(), "sourceName", null);
        setIntField(term3609212, term3609212.getClass(), "baseLineno", 0);
        setIntField(term3609212, term3609212.getClass(), "endLineno", 0);
        setField(term3609212, term3609212.getClass(), "functions", null);
        setField(term3609212, term3609212.getClass(), "regexps", null);
        setField(term3609212, term3609212.getClass(), "itsVariables", null);
        setField(term3609212, term3609212.getClass(), "itsConst", null);
        setField(term3609212, term3609212.getClass(), "itsVariableNames", null);
        setIntField(term3609212, term3609212.getClass(), "varStart", 0);
        setField(term3609212, term3609212.getClass(), "compilerData", null);
        setIntField(term3609212, term3609212.getClass(), "type", 37);
        setField(term3609212, term3609212.getClass(), "next", null);
        setField(term3609213, term3609213.getClass(), "str", null);
        setIntField(term3609213, term3609213.getClass(), "type", 35);
        setIntField(term3609214, term3609214.getClass(), "type", 43);
        setField(term3609214, term3609214.getClass(), "next", null);
        setField(term3609214, term3609214.getClass(), "first", null);
        setField(term3609214, term3609214.getClass(), "last", null);
        setField(term3609214, term3609214.getClass(), "propListHead", null);
        setIntField(term3609214, term3609214.getClass(), "sourcePosition", 0);
        setField(term3609214, term3609214.getClass(), "jsType", null);
        setField(term3609214, term3609214.getClass(), "parent", null);
        setField(term3609213, term3609213.getClass(), "next", term3609214);
        setField(term3609215, term3609215.getClass(), "str", null);
        setIntField(term3609215, term3609215.getClass(), "type", 40);
        setField(term3609216, term3609216.getClass(), "str", "");
        setIntField(term3609216, term3609216.getClass(), "type", 40);
        setField(term3609216, term3609216.getClass(), "next", null);
        setField(term3609216, term3609216.getClass(), "first", null);
        setField(term3609216, term3609216.getClass(), "last", null);
        setField(term3609216, term3609216.getClass(), "propListHead", null);
        setIntField(term3609216, term3609216.getClass(), "sourcePosition", 0);
        setField(term3609216, term3609216.getClass(), "jsType", null);
        setField(term3609216, term3609216.getClass(), "parent", null);
        setField(term3609215, term3609215.getClass(), "next", term3609216);
        setField(term3609215, term3609215.getClass(), "first", null);
        setField(term3609215, term3609215.getClass(), "last", null);
        setField(term3609215, term3609215.getClass(), "propListHead", null);
        setIntField(term3609215, term3609215.getClass(), "sourcePosition", 0);
        setField(term3609215, term3609215.getClass(), "jsType", null);
        setField(term3609215, term3609215.getClass(), "parent", null);
        setField(term3609213, term3609213.getClass(), "first", term3609215);
        setField(term3609213, term3609213.getClass(), "last", null);
        setField(term3609213, term3609213.getClass(), "propListHead", null);
        setIntField(term3609213, term3609213.getClass(), "sourcePosition", 0);
        setField(term3609213, term3609213.getClass(), "jsType", null);
        setField(term3609213, term3609213.getClass(), "parent", null);
        setField(term3609212, term3609212.getClass(), "first", term3609213);
        setField(term3609212, term3609212.getClass(), "last", null);
        setField(term3609212, term3609212.getClass(), "propListHead", null);
        setIntField(term3609212, term3609212.getClass(), "sourcePosition", 0);
        setField(term3609212, term3609212.getClass(), "jsType", null);
        setField(term3609212, term3609212.getClass(), "parent", null);
        term3609103 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3609113 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3609115 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3609118 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3609120 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3609103, term3609103.getClass(), "functionName", null);
        setBooleanField(term3609103, term3609103.getClass(), "itsNeedsActivation", false);
        setIntField(term3609103, term3609103.getClass(), "itsFunctionType", 0);
        setBooleanField(term3609103, term3609103.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3609103, term3609103.getClass(), "encodedSourceStart", 0);
        setIntField(term3609103, term3609103.getClass(), "encodedSourceEnd", 0);
        setField(term3609103, term3609103.getClass(), "sourceName", null);
        setIntField(term3609103, term3609103.getClass(), "baseLineno", 0);
        setIntField(term3609103, term3609103.getClass(), "endLineno", 0);
        setField(term3609103, term3609103.getClass(), "functions", null);
        setField(term3609103, term3609103.getClass(), "regexps", null);
        setField(term3609103, term3609103.getClass(), "itsVariables", null);
        setField(term3609103, term3609103.getClass(), "itsConst", null);
        setField(term3609103, term3609103.getClass(), "itsVariableNames", null);
        setIntField(term3609103, term3609103.getClass(), "varStart", 0);
        setField(term3609103, term3609103.getClass(), "compilerData", null);
        setIntField(term3609103, term3609103.getClass(), "type", 37);
        setField(term3609103, term3609103.getClass(), "next", null);
        setField(term3609113, term3609113.getClass(), "str", null);
        setIntField(term3609113, term3609113.getClass(), "type", 35);
        setIntField(term3609115, term3609115.getClass(), "type", 43);
        setField(term3609115, term3609115.getClass(), "next", null);
        setField(term3609115, term3609115.getClass(), "first", null);
        setField(term3609115, term3609115.getClass(), "last", null);
        setField(term3609115, term3609115.getClass(), "propListHead", null);
        setIntField(term3609115, term3609115.getClass(), "sourcePosition", 0);
        setField(term3609115, term3609115.getClass(), "jsType", null);
        setField(term3609115, term3609115.getClass(), "parent", null);
        setField(term3609113, term3609113.getClass(), "next", term3609115);
        setField(term3609118, term3609118.getClass(), "str", null);
        setIntField(term3609118, term3609118.getClass(), "type", 40);
        setField(term3609120, term3609120.getClass(), "str", "");
        setIntField(term3609120, term3609120.getClass(), "type", 40);
        setField(term3609120, term3609120.getClass(), "next", null);
        setField(term3609120, term3609120.getClass(), "first", null);
        setField(term3609120, term3609120.getClass(), "last", null);
        setField(term3609120, term3609120.getClass(), "propListHead", null);
        setIntField(term3609120, term3609120.getClass(), "sourcePosition", 0);
        setField(term3609120, term3609120.getClass(), "jsType", null);
        setField(term3609120, term3609120.getClass(), "parent", null);
        setField(term3609118, term3609118.getClass(), "next", term3609120);
        setField(term3609118, term3609118.getClass(), "first", null);
        setField(term3609118, term3609118.getClass(), "last", null);
        setField(term3609118, term3609118.getClass(), "propListHead", null);
        setIntField(term3609118, term3609118.getClass(), "sourcePosition", 0);
        setField(term3609118, term3609118.getClass(), "jsType", null);
        setField(term3609118, term3609118.getClass(), "parent", null);
        setField(term3609113, term3609113.getClass(), "first", term3609118);
        setField(term3609113, term3609113.getClass(), "last", null);
        setField(term3609113, term3609113.getClass(), "propListHead", null);
        setIntField(term3609113, term3609113.getClass(), "sourcePosition", 0);
        setField(term3609113, term3609113.getClass(), "jsType", null);
        setField(term3609113, term3609113.getClass(), "parent", null);
        setField(term3609103, term3609103.getClass(), "first", term3609113);
        setField(term3609103, term3609103.getClass(), "last", null);
        setField(term3609103, term3609103.getClass(), "propListHead", null);
        setIntField(term3609103, term3609103.getClass(), "sourcePosition", 0);
        setField(term3609103, term3609103.getClass(), "jsType", null);
        setField(term3609103, term3609103.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3607693;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3607607, args);
        assertTrue(recursiveEquals(term3607607, term3609211));
        assertTrue(recursiveEquals(term3607693, term3609212));
        assertTrue(recursiveEquals(retValue, term3609103));
    }

};


