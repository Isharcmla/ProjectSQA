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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2618672;
     Object term2618758;
     Object term2619557;
     Object term2619558;
     Object term2619492;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2618672 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term2618758 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2618850 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2618920 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2619012 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term2618758, term2618758.getClass(), "type", 37);
        setIntField(term2618850, term2618850.getClass(), "type", 35);
        setField(term2618920, term2618920.getClass(), "next", term2619012);
        setIntField(term2618920, term2618920.getClass(), "type", 40);
        setField(term2618850, term2618850.getClass(), "first", term2618920);
        setField(term2618758, term2618758.getClass(), "first", term2618850);
        term2619557 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term2619557, term2619557.getClass(), "currentTraversal", null);
        term2619558 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2619559 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2619560 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2619561 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term2619558, term2619558.getClass(), "functionName", null);
        setBooleanField(term2619558, term2619558.getClass(), "itsNeedsActivation", false);
        setIntField(term2619558, term2619558.getClass(), "itsFunctionType", 0);
        setBooleanField(term2619558, term2619558.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term2619558, term2619558.getClass(), "encodedSourceStart", 0);
        setIntField(term2619558, term2619558.getClass(), "encodedSourceEnd", 0);
        setField(term2619558, term2619558.getClass(), "sourceName", null);
        setIntField(term2619558, term2619558.getClass(), "baseLineno", 0);
        setIntField(term2619558, term2619558.getClass(), "endLineno", 0);
        setField(term2619558, term2619558.getClass(), "functions", null);
        setField(term2619558, term2619558.getClass(), "regexps", null);
        setField(term2619558, term2619558.getClass(), "itsVariables", null);
        setField(term2619558, term2619558.getClass(), "itsConst", null);
        setField(term2619558, term2619558.getClass(), "itsVariableNames", null);
        setIntField(term2619558, term2619558.getClass(), "varStart", 0);
        setField(term2619558, term2619558.getClass(), "compilerData", null);
        setIntField(term2619558, term2619558.getClass(), "type", 37);
        setField(term2619558, term2619558.getClass(), "next", null);
        setField(term2619559, term2619559.getClass(), "str", null);
        setIntField(term2619559, term2619559.getClass(), "type", 35);
        setField(term2619559, term2619559.getClass(), "next", null);
        setIntField(term2619560, term2619560.getClass(), "type", 40);
        setField(term2619561, term2619561.getClass(), "str", null);
        setIntField(term2619561, term2619561.getClass(), "type", 0);
        setField(term2619561, term2619561.getClass(), "next", null);
        setField(term2619561, term2619561.getClass(), "first", null);
        setField(term2619561, term2619561.getClass(), "last", null);
        setField(term2619561, term2619561.getClass(), "propListHead", null);
        setIntField(term2619561, term2619561.getClass(), "sourcePosition", 0);
        setField(term2619561, term2619561.getClass(), "jsType", null);
        setField(term2619561, term2619561.getClass(), "parent", null);
        setField(term2619560, term2619560.getClass(), "next", term2619561);
        setField(term2619560, term2619560.getClass(), "first", null);
        setField(term2619560, term2619560.getClass(), "last", null);
        setField(term2619560, term2619560.getClass(), "propListHead", null);
        setIntField(term2619560, term2619560.getClass(), "sourcePosition", 0);
        setField(term2619560, term2619560.getClass(), "jsType", null);
        setField(term2619560, term2619560.getClass(), "parent", null);
        setField(term2619559, term2619559.getClass(), "first", term2619560);
        setField(term2619559, term2619559.getClass(), "last", null);
        setField(term2619559, term2619559.getClass(), "propListHead", null);
        setIntField(term2619559, term2619559.getClass(), "sourcePosition", 0);
        setField(term2619559, term2619559.getClass(), "jsType", null);
        setField(term2619559, term2619559.getClass(), "parent", null);
        setField(term2619558, term2619558.getClass(), "first", term2619559);
        setField(term2619558, term2619558.getClass(), "last", null);
        setField(term2619558, term2619558.getClass(), "propListHead", null);
        setIntField(term2619558, term2619558.getClass(), "sourcePosition", 0);
        setField(term2619558, term2619558.getClass(), "jsType", null);
        setField(term2619558, term2619558.getClass(), "parent", null);
        term2619492 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2619502 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2619504 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2619506 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term2619492, term2619492.getClass(), "functionName", null);
        setBooleanField(term2619492, term2619492.getClass(), "itsNeedsActivation", false);
        setIntField(term2619492, term2619492.getClass(), "itsFunctionType", 0);
        setBooleanField(term2619492, term2619492.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term2619492, term2619492.getClass(), "encodedSourceStart", 0);
        setIntField(term2619492, term2619492.getClass(), "encodedSourceEnd", 0);
        setField(term2619492, term2619492.getClass(), "sourceName", null);
        setIntField(term2619492, term2619492.getClass(), "baseLineno", 0);
        setIntField(term2619492, term2619492.getClass(), "endLineno", 0);
        setField(term2619492, term2619492.getClass(), "functions", null);
        setField(term2619492, term2619492.getClass(), "regexps", null);
        setField(term2619492, term2619492.getClass(), "itsVariables", null);
        setField(term2619492, term2619492.getClass(), "itsConst", null);
        setField(term2619492, term2619492.getClass(), "itsVariableNames", null);
        setIntField(term2619492, term2619492.getClass(), "varStart", 0);
        setField(term2619492, term2619492.getClass(), "compilerData", null);
        setIntField(term2619492, term2619492.getClass(), "type", 37);
        setField(term2619492, term2619492.getClass(), "next", null);
        setField(term2619502, term2619502.getClass(), "str", null);
        setIntField(term2619502, term2619502.getClass(), "type", 35);
        setField(term2619502, term2619502.getClass(), "next", null);
        setIntField(term2619504, term2619504.getClass(), "type", 40);
        setField(term2619506, term2619506.getClass(), "str", null);
        setIntField(term2619506, term2619506.getClass(), "type", 0);
        setField(term2619506, term2619506.getClass(), "next", null);
        setField(term2619506, term2619506.getClass(), "first", null);
        setField(term2619506, term2619506.getClass(), "last", null);
        setField(term2619506, term2619506.getClass(), "propListHead", null);
        setIntField(term2619506, term2619506.getClass(), "sourcePosition", 0);
        setField(term2619506, term2619506.getClass(), "jsType", null);
        setField(term2619506, term2619506.getClass(), "parent", null);
        setField(term2619504, term2619504.getClass(), "next", term2619506);
        setField(term2619504, term2619504.getClass(), "first", null);
        setField(term2619504, term2619504.getClass(), "last", null);
        setField(term2619504, term2619504.getClass(), "propListHead", null);
        setIntField(term2619504, term2619504.getClass(), "sourcePosition", 0);
        setField(term2619504, term2619504.getClass(), "jsType", null);
        setField(term2619504, term2619504.getClass(), "parent", null);
        setField(term2619502, term2619502.getClass(), "first", term2619504);
        setField(term2619502, term2619502.getClass(), "last", null);
        setField(term2619502, term2619502.getClass(), "propListHead", null);
        setIntField(term2619502, term2619502.getClass(), "sourcePosition", 0);
        setField(term2619502, term2619502.getClass(), "jsType", null);
        setField(term2619502, term2619502.getClass(), "parent", null);
        setField(term2619492, term2619492.getClass(), "first", term2619502);
        setField(term2619492, term2619492.getClass(), "last", null);
        setField(term2619492, term2619492.getClass(), "propListHead", null);
        setIntField(term2619492, term2619492.getClass(), "sourcePosition", 0);
        setField(term2619492, term2619492.getClass(), "jsType", null);
        setField(term2619492, term2619492.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2618758;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term2618672, args);
        assertTrue(recursiveEquals(term2618672, term2619557));
        assertTrue(recursiveEquals(term2618758, term2619558));
        assertTrue(recursiveEquals(retValue, term2619492));
    }

};


