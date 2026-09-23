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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374482 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3470989;
     Object term3471081;
     Object term3472148;
     Object term3472149;
     Object term3471887;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374482() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3470989 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3471081 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3471173 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3471265 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3471357 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3471481 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3471173, term3471173.getClass(), "type", 35);
        setIntField(term3471357, term3471357.getClass(), "type", 40);
        setField(term3471357, term3471357.getClass(), "str", "");
        setField(term3471265, term3471265.getClass(), "next", term3471357);
        setIntField(term3471265, term3471265.getClass(), "type", 40);
        setField(term3471173, term3471173.getClass(), "first", term3471265);
        setIntField(term3471481, term3471481.getClass(), "type", 40);
        setField(term3471173, term3471173.getClass(), "next", term3471481);
        setField(term3471081, term3471081.getClass(), "first", term3471173);
        setIntField(term3471081, term3471081.getClass(), "type", 37);
        term3472148 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3472148, term3472148.getClass(), "currentTraversal", null);
        term3472149 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3472150 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3472151 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3472152 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3472153 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3472149, term3472149.getClass(), "str", null);
        setIntField(term3472149, term3472149.getClass(), "type", 37);
        setField(term3472149, term3472149.getClass(), "next", null);
        setField(term3472150, term3472150.getClass(), "str", null);
        setIntField(term3472150, term3472150.getClass(), "type", 35);
        setField(term3472151, term3472151.getClass(), "functionName", null);
        setBooleanField(term3472151, term3472151.getClass(), "itsNeedsActivation", false);
        setIntField(term3472151, term3472151.getClass(), "itsFunctionType", 0);
        setBooleanField(term3472151, term3472151.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3472151, term3472151.getClass(), "encodedSourceStart", 0);
        setIntField(term3472151, term3472151.getClass(), "encodedSourceEnd", 0);
        setField(term3472151, term3472151.getClass(), "sourceName", null);
        setIntField(term3472151, term3472151.getClass(), "baseLineno", 0);
        setIntField(term3472151, term3472151.getClass(), "endLineno", 0);
        setField(term3472151, term3472151.getClass(), "functions", null);
        setField(term3472151, term3472151.getClass(), "regexps", null);
        setField(term3472151, term3472151.getClass(), "itsVariables", null);
        setField(term3472151, term3472151.getClass(), "itsConst", null);
        setField(term3472151, term3472151.getClass(), "itsVariableNames", null);
        setIntField(term3472151, term3472151.getClass(), "varStart", 0);
        setField(term3472151, term3472151.getClass(), "compilerData", null);
        setIntField(term3472151, term3472151.getClass(), "type", 40);
        setField(term3472151, term3472151.getClass(), "next", null);
        setField(term3472151, term3472151.getClass(), "first", null);
        setField(term3472151, term3472151.getClass(), "last", null);
        setField(term3472151, term3472151.getClass(), "propListHead", null);
        setIntField(term3472151, term3472151.getClass(), "sourcePosition", 0);
        setField(term3472151, term3472151.getClass(), "jsType", null);
        setField(term3472151, term3472151.getClass(), "parent", null);
        setField(term3472150, term3472150.getClass(), "next", term3472151);
        setField(term3472152, term3472152.getClass(), "str", null);
        setIntField(term3472152, term3472152.getClass(), "type", 40);
        setField(term3472153, term3472153.getClass(), "str", "");
        setIntField(term3472153, term3472153.getClass(), "type", 40);
        setField(term3472153, term3472153.getClass(), "next", null);
        setField(term3472153, term3472153.getClass(), "first", null);
        setField(term3472153, term3472153.getClass(), "last", null);
        setField(term3472153, term3472153.getClass(), "propListHead", null);
        setIntField(term3472153, term3472153.getClass(), "sourcePosition", 0);
        setField(term3472153, term3472153.getClass(), "jsType", null);
        setField(term3472153, term3472153.getClass(), "parent", null);
        setField(term3472152, term3472152.getClass(), "next", term3472153);
        setField(term3472152, term3472152.getClass(), "first", null);
        setField(term3472152, term3472152.getClass(), "last", null);
        setField(term3472152, term3472152.getClass(), "propListHead", null);
        setIntField(term3472152, term3472152.getClass(), "sourcePosition", 0);
        setField(term3472152, term3472152.getClass(), "jsType", null);
        setField(term3472152, term3472152.getClass(), "parent", null);
        setField(term3472150, term3472150.getClass(), "first", term3472152);
        setField(term3472150, term3472150.getClass(), "last", null);
        setField(term3472150, term3472150.getClass(), "propListHead", null);
        setIntField(term3472150, term3472150.getClass(), "sourcePosition", 0);
        setField(term3472150, term3472150.getClass(), "jsType", null);
        setField(term3472150, term3472150.getClass(), "parent", null);
        setField(term3472149, term3472149.getClass(), "first", term3472150);
        setField(term3472149, term3472149.getClass(), "last", null);
        setField(term3472149, term3472149.getClass(), "propListHead", null);
        setIntField(term3472149, term3472149.getClass(), "sourcePosition", 0);
        setField(term3472149, term3472149.getClass(), "jsType", null);
        setField(term3472149, term3472149.getClass(), "parent", null);
        term3471887 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3471889 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3471891 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3471902 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3471904 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3471887, term3471887.getClass(), "str", null);
        setIntField(term3471887, term3471887.getClass(), "type", 37);
        setField(term3471887, term3471887.getClass(), "next", null);
        setField(term3471889, term3471889.getClass(), "str", null);
        setIntField(term3471889, term3471889.getClass(), "type", 35);
        setField(term3471891, term3471891.getClass(), "functionName", null);
        setBooleanField(term3471891, term3471891.getClass(), "itsNeedsActivation", false);
        setIntField(term3471891, term3471891.getClass(), "itsFunctionType", 0);
        setBooleanField(term3471891, term3471891.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3471891, term3471891.getClass(), "encodedSourceStart", 0);
        setIntField(term3471891, term3471891.getClass(), "encodedSourceEnd", 0);
        setField(term3471891, term3471891.getClass(), "sourceName", null);
        setIntField(term3471891, term3471891.getClass(), "baseLineno", 0);
        setIntField(term3471891, term3471891.getClass(), "endLineno", 0);
        setField(term3471891, term3471891.getClass(), "functions", null);
        setField(term3471891, term3471891.getClass(), "regexps", null);
        setField(term3471891, term3471891.getClass(), "itsVariables", null);
        setField(term3471891, term3471891.getClass(), "itsConst", null);
        setField(term3471891, term3471891.getClass(), "itsVariableNames", null);
        setIntField(term3471891, term3471891.getClass(), "varStart", 0);
        setField(term3471891, term3471891.getClass(), "compilerData", null);
        setIntField(term3471891, term3471891.getClass(), "type", 40);
        setField(term3471891, term3471891.getClass(), "next", null);
        setField(term3471891, term3471891.getClass(), "first", null);
        setField(term3471891, term3471891.getClass(), "last", null);
        setField(term3471891, term3471891.getClass(), "propListHead", null);
        setIntField(term3471891, term3471891.getClass(), "sourcePosition", 0);
        setField(term3471891, term3471891.getClass(), "jsType", null);
        setField(term3471891, term3471891.getClass(), "parent", null);
        setField(term3471889, term3471889.getClass(), "next", term3471891);
        setField(term3471902, term3471902.getClass(), "str", null);
        setIntField(term3471902, term3471902.getClass(), "type", 40);
        setField(term3471904, term3471904.getClass(), "str", "");
        setIntField(term3471904, term3471904.getClass(), "type", 40);
        setField(term3471904, term3471904.getClass(), "next", null);
        setField(term3471904, term3471904.getClass(), "first", null);
        setField(term3471904, term3471904.getClass(), "last", null);
        setField(term3471904, term3471904.getClass(), "propListHead", null);
        setIntField(term3471904, term3471904.getClass(), "sourcePosition", 0);
        setField(term3471904, term3471904.getClass(), "jsType", null);
        setField(term3471904, term3471904.getClass(), "parent", null);
        setField(term3471902, term3471902.getClass(), "next", term3471904);
        setField(term3471902, term3471902.getClass(), "first", null);
        setField(term3471902, term3471902.getClass(), "last", null);
        setField(term3471902, term3471902.getClass(), "propListHead", null);
        setIntField(term3471902, term3471902.getClass(), "sourcePosition", 0);
        setField(term3471902, term3471902.getClass(), "jsType", null);
        setField(term3471902, term3471902.getClass(), "parent", null);
        setField(term3471889, term3471889.getClass(), "first", term3471902);
        setField(term3471889, term3471889.getClass(), "last", null);
        setField(term3471889, term3471889.getClass(), "propListHead", null);
        setIntField(term3471889, term3471889.getClass(), "sourcePosition", 0);
        setField(term3471889, term3471889.getClass(), "jsType", null);
        setField(term3471889, term3471889.getClass(), "parent", null);
        setField(term3471887, term3471887.getClass(), "first", term3471889);
        setField(term3471887, term3471887.getClass(), "last", null);
        setField(term3471887, term3471887.getClass(), "propListHead", null);
        setIntField(term3471887, term3471887.getClass(), "sourcePosition", 0);
        setField(term3471887, term3471887.getClass(), "jsType", null);
        setField(term3471887, term3471887.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3471081;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3470989, args);
        assertTrue(recursiveEquals(term3470989, term3472148));
        assertTrue(recursiveEquals(term3471081, term3472149));
        assertTrue(recursiveEquals(retValue, term3471887));
    }

};


