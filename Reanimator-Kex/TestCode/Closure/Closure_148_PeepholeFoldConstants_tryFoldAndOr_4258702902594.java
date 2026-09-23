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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902594 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term736908;
     Object term736994;
     Object term737172;
     Object term737264;
     Object term737376;
     Object term737377;
     Object term737379;
     Object term737380;
     Object term737282;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902594() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term736908 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term736994 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term737080 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term737080, term737080.getClass(), "type", 113);
        setField(term736994, term736994.getClass(), "parent", term737080);
        setIntField(term736994, term736994.getClass(), "type", 0);
        term737172 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term737172, term737172.getClass(), "type", 84);
        term737264 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term737264, term737264.getClass(), "type", 63);
        term737376 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term737376, term737376.getClass(), "currentTraversal", null);
        term737377 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term737378 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term737377, term737377.getClass(), "functionName", null);
        setBooleanField(term737377, term737377.getClass(), "itsNeedsActivation", false);
        setIntField(term737377, term737377.getClass(), "itsFunctionType", 0);
        setBooleanField(term737377, term737377.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term737377, term737377.getClass(), "encodedSourceStart", 0);
        setIntField(term737377, term737377.getClass(), "encodedSourceEnd", 0);
        setField(term737377, term737377.getClass(), "sourceName", null);
        setIntField(term737377, term737377.getClass(), "baseLineno", 0);
        setIntField(term737377, term737377.getClass(), "endLineno", 0);
        setField(term737377, term737377.getClass(), "functions", null);
        setField(term737377, term737377.getClass(), "regexps", null);
        setField(term737377, term737377.getClass(), "itsVariables", null);
        setField(term737377, term737377.getClass(), "itsConst", null);
        setField(term737377, term737377.getClass(), "itsVariableNames", null);
        setIntField(term737377, term737377.getClass(), "varStart", 0);
        setField(term737377, term737377.getClass(), "compilerData", null);
        setIntField(term737377, term737377.getClass(), "type", 0);
        setField(term737377, term737377.getClass(), "next", null);
        setField(term737377, term737377.getClass(), "first", null);
        setField(term737377, term737377.getClass(), "last", null);
        setField(term737377, term737377.getClass(), "propListHead", null);
        setIntField(term737377, term737377.getClass(), "sourcePosition", 0);
        setField(term737377, term737377.getClass(), "jsType", null);
        setField(term737378, term737378.getClass(), "functionName", null);
        setBooleanField(term737378, term737378.getClass(), "itsNeedsActivation", false);
        setIntField(term737378, term737378.getClass(), "itsFunctionType", 0);
        setBooleanField(term737378, term737378.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term737378, term737378.getClass(), "encodedSourceStart", 0);
        setIntField(term737378, term737378.getClass(), "encodedSourceEnd", 0);
        setField(term737378, term737378.getClass(), "sourceName", null);
        setIntField(term737378, term737378.getClass(), "baseLineno", 0);
        setIntField(term737378, term737378.getClass(), "endLineno", 0);
        setField(term737378, term737378.getClass(), "functions", null);
        setField(term737378, term737378.getClass(), "regexps", null);
        setField(term737378, term737378.getClass(), "itsVariables", null);
        setField(term737378, term737378.getClass(), "itsConst", null);
        setField(term737378, term737378.getClass(), "itsVariableNames", null);
        setIntField(term737378, term737378.getClass(), "varStart", 0);
        setField(term737378, term737378.getClass(), "compilerData", null);
        setIntField(term737378, term737378.getClass(), "type", 113);
        setField(term737378, term737378.getClass(), "next", null);
        setField(term737378, term737378.getClass(), "first", null);
        setField(term737378, term737378.getClass(), "last", null);
        setField(term737378, term737378.getClass(), "propListHead", null);
        setIntField(term737378, term737378.getClass(), "sourcePosition", 0);
        setField(term737378, term737378.getClass(), "jsType", null);
        setField(term737378, term737378.getClass(), "parent", null);
        setField(term737377, term737377.getClass(), "parent", term737378);
        term737379 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term737379, term737379.getClass(), "number", 0.0);
        setIntField(term737379, term737379.getClass(), "type", 84);
        setField(term737379, term737379.getClass(), "next", null);
        setField(term737379, term737379.getClass(), "first", null);
        setField(term737379, term737379.getClass(), "last", null);
        setField(term737379, term737379.getClass(), "propListHead", null);
        setIntField(term737379, term737379.getClass(), "sourcePosition", 0);
        setField(term737379, term737379.getClass(), "jsType", null);
        setField(term737379, term737379.getClass(), "parent", null);
        term737380 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term737380, term737380.getClass(), "number", 0.0);
        setIntField(term737380, term737380.getClass(), "type", 63);
        setField(term737380, term737380.getClass(), "next", null);
        setField(term737380, term737380.getClass(), "first", null);
        setField(term737380, term737380.getClass(), "last", null);
        setField(term737380, term737380.getClass(), "propListHead", null);
        setIntField(term737380, term737380.getClass(), "sourcePosition", 0);
        setField(term737380, term737380.getClass(), "jsType", null);
        setField(term737380, term737380.getClass(), "parent", null);
        term737282 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term737293 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term737282, term737282.getClass(), "functionName", null);
        setBooleanField(term737282, term737282.getClass(), "itsNeedsActivation", false);
        setIntField(term737282, term737282.getClass(), "itsFunctionType", 0);
        setBooleanField(term737282, term737282.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term737282, term737282.getClass(), "encodedSourceStart", 0);
        setIntField(term737282, term737282.getClass(), "encodedSourceEnd", 0);
        setField(term737282, term737282.getClass(), "sourceName", null);
        setIntField(term737282, term737282.getClass(), "baseLineno", 0);
        setIntField(term737282, term737282.getClass(), "endLineno", 0);
        setField(term737282, term737282.getClass(), "functions", null);
        setField(term737282, term737282.getClass(), "regexps", null);
        setField(term737282, term737282.getClass(), "itsVariables", null);
        setField(term737282, term737282.getClass(), "itsConst", null);
        setField(term737282, term737282.getClass(), "itsVariableNames", null);
        setIntField(term737282, term737282.getClass(), "varStart", 0);
        setField(term737282, term737282.getClass(), "compilerData", null);
        setIntField(term737282, term737282.getClass(), "type", 0);
        setField(term737282, term737282.getClass(), "next", null);
        setField(term737282, term737282.getClass(), "first", null);
        setField(term737282, term737282.getClass(), "last", null);
        setField(term737282, term737282.getClass(), "propListHead", null);
        setIntField(term737282, term737282.getClass(), "sourcePosition", 0);
        setField(term737282, term737282.getClass(), "jsType", null);
        setField(term737293, term737293.getClass(), "functionName", null);
        setBooleanField(term737293, term737293.getClass(), "itsNeedsActivation", false);
        setIntField(term737293, term737293.getClass(), "itsFunctionType", 0);
        setBooleanField(term737293, term737293.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term737293, term737293.getClass(), "encodedSourceStart", 0);
        setIntField(term737293, term737293.getClass(), "encodedSourceEnd", 0);
        setField(term737293, term737293.getClass(), "sourceName", null);
        setIntField(term737293, term737293.getClass(), "baseLineno", 0);
        setIntField(term737293, term737293.getClass(), "endLineno", 0);
        setField(term737293, term737293.getClass(), "functions", null);
        setField(term737293, term737293.getClass(), "regexps", null);
        setField(term737293, term737293.getClass(), "itsVariables", null);
        setField(term737293, term737293.getClass(), "itsConst", null);
        setField(term737293, term737293.getClass(), "itsVariableNames", null);
        setIntField(term737293, term737293.getClass(), "varStart", 0);
        setField(term737293, term737293.getClass(), "compilerData", null);
        setIntField(term737293, term737293.getClass(), "type", 113);
        setField(term737293, term737293.getClass(), "next", null);
        setField(term737293, term737293.getClass(), "first", null);
        setField(term737293, term737293.getClass(), "last", null);
        setField(term737293, term737293.getClass(), "propListHead", null);
        setIntField(term737293, term737293.getClass(), "sourcePosition", 0);
        setField(term737293, term737293.getClass(), "jsType", null);
        setField(term737293, term737293.getClass(), "parent", null);
        setField(term737282, term737282.getClass(), "parent", term737293);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term736994;
        args[1] = term737172;
        args[2] = term737264;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term736908, args);
        assertTrue(recursiveEquals(term736908, term737376));
        assertTrue(recursiveEquals(term736994, term737377));
        assertTrue(recursiveEquals(term737172, term737379));
        assertTrue(recursiveEquals(term737264, term737380));
        assertTrue(recursiveEquals(retValue, term737282));
    }

};


