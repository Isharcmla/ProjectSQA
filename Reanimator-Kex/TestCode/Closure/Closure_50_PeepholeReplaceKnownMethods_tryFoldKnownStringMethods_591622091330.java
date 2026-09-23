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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2628390;
     Object term2628476;
     Object term2629545;
     Object term2629546;
     Object term2629502;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2628390 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term2628476 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2628568 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2628638 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2628476, term2628476.getClass(), "type", 37);
        setIntField(term2628568, term2628568.getClass(), "type", 33);
        setField(term2628568, term2628568.getClass(), "first", term2628638);
        setField(term2628476, term2628476.getClass(), "first", term2628568);
        term2629545 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term2629545, term2629545.getClass(), "currentTraversal", null);
        term2629546 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2629547 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2629548 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term2629546, term2629546.getClass(), "functionName", null);
        setBooleanField(term2629546, term2629546.getClass(), "itsNeedsActivation", false);
        setIntField(term2629546, term2629546.getClass(), "itsFunctionType", 0);
        setBooleanField(term2629546, term2629546.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term2629546, term2629546.getClass(), "encodedSourceStart", 0);
        setIntField(term2629546, term2629546.getClass(), "encodedSourceEnd", 0);
        setField(term2629546, term2629546.getClass(), "sourceName", null);
        setIntField(term2629546, term2629546.getClass(), "baseLineno", 0);
        setIntField(term2629546, term2629546.getClass(), "endLineno", 0);
        setField(term2629546, term2629546.getClass(), "functions", null);
        setField(term2629546, term2629546.getClass(), "regexps", null);
        setField(term2629546, term2629546.getClass(), "itsVariables", null);
        setField(term2629546, term2629546.getClass(), "itsConst", null);
        setField(term2629546, term2629546.getClass(), "itsVariableNames", null);
        setIntField(term2629546, term2629546.getClass(), "varStart", 0);
        setField(term2629546, term2629546.getClass(), "compilerData", null);
        setIntField(term2629546, term2629546.getClass(), "type", 37);
        setField(term2629546, term2629546.getClass(), "next", null);
        setField(term2629547, term2629547.getClass(), "str", null);
        setIntField(term2629547, term2629547.getClass(), "type", 33);
        setField(term2629547, term2629547.getClass(), "next", null);
        setIntField(term2629548, term2629548.getClass(), "type", 0);
        setField(term2629548, term2629548.getClass(), "next", null);
        setField(term2629548, term2629548.getClass(), "first", null);
        setField(term2629548, term2629548.getClass(), "last", null);
        setField(term2629548, term2629548.getClass(), "propListHead", null);
        setIntField(term2629548, term2629548.getClass(), "sourcePosition", 0);
        setField(term2629548, term2629548.getClass(), "jsType", null);
        setField(term2629548, term2629548.getClass(), "parent", null);
        setField(term2629547, term2629547.getClass(), "first", term2629548);
        setField(term2629547, term2629547.getClass(), "last", null);
        setField(term2629547, term2629547.getClass(), "propListHead", null);
        setIntField(term2629547, term2629547.getClass(), "sourcePosition", 0);
        setField(term2629547, term2629547.getClass(), "jsType", null);
        setField(term2629547, term2629547.getClass(), "parent", null);
        setField(term2629546, term2629546.getClass(), "first", term2629547);
        setField(term2629546, term2629546.getClass(), "last", null);
        setField(term2629546, term2629546.getClass(), "propListHead", null);
        setIntField(term2629546, term2629546.getClass(), "sourcePosition", 0);
        setField(term2629546, term2629546.getClass(), "jsType", null);
        setField(term2629546, term2629546.getClass(), "parent", null);
        term2629502 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2629512 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2629514 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term2629502, term2629502.getClass(), "functionName", null);
        setBooleanField(term2629502, term2629502.getClass(), "itsNeedsActivation", false);
        setIntField(term2629502, term2629502.getClass(), "itsFunctionType", 0);
        setBooleanField(term2629502, term2629502.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term2629502, term2629502.getClass(), "encodedSourceStart", 0);
        setIntField(term2629502, term2629502.getClass(), "encodedSourceEnd", 0);
        setField(term2629502, term2629502.getClass(), "sourceName", null);
        setIntField(term2629502, term2629502.getClass(), "baseLineno", 0);
        setIntField(term2629502, term2629502.getClass(), "endLineno", 0);
        setField(term2629502, term2629502.getClass(), "functions", null);
        setField(term2629502, term2629502.getClass(), "regexps", null);
        setField(term2629502, term2629502.getClass(), "itsVariables", null);
        setField(term2629502, term2629502.getClass(), "itsConst", null);
        setField(term2629502, term2629502.getClass(), "itsVariableNames", null);
        setIntField(term2629502, term2629502.getClass(), "varStart", 0);
        setField(term2629502, term2629502.getClass(), "compilerData", null);
        setIntField(term2629502, term2629502.getClass(), "type", 37);
        setField(term2629502, term2629502.getClass(), "next", null);
        setField(term2629512, term2629512.getClass(), "str", null);
        setIntField(term2629512, term2629512.getClass(), "type", 33);
        setField(term2629512, term2629512.getClass(), "next", null);
        setIntField(term2629514, term2629514.getClass(), "type", 0);
        setField(term2629514, term2629514.getClass(), "next", null);
        setField(term2629514, term2629514.getClass(), "first", null);
        setField(term2629514, term2629514.getClass(), "last", null);
        setField(term2629514, term2629514.getClass(), "propListHead", null);
        setIntField(term2629514, term2629514.getClass(), "sourcePosition", 0);
        setField(term2629514, term2629514.getClass(), "jsType", null);
        setField(term2629514, term2629514.getClass(), "parent", null);
        setField(term2629512, term2629512.getClass(), "first", term2629514);
        setField(term2629512, term2629512.getClass(), "last", null);
        setField(term2629512, term2629512.getClass(), "propListHead", null);
        setIntField(term2629512, term2629512.getClass(), "sourcePosition", 0);
        setField(term2629512, term2629512.getClass(), "jsType", null);
        setField(term2629512, term2629512.getClass(), "parent", null);
        setField(term2629502, term2629502.getClass(), "first", term2629512);
        setField(term2629502, term2629502.getClass(), "last", null);
        setField(term2629502, term2629502.getClass(), "propListHead", null);
        setIntField(term2629502, term2629502.getClass(), "sourcePosition", 0);
        setField(term2629502, term2629502.getClass(), "jsType", null);
        setField(term2629502, term2629502.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2628476;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term2628390, args);
        assertTrue(recursiveEquals(term2628390, term2629545));
        assertTrue(recursiveEquals(term2628476, term2629546));
        assertTrue(recursiveEquals(retValue, term2629502));
    }

};


