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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_5916220911070 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4502917;
     Object term4503003;
     Object term4503300;
     Object term4503301;
     Object term4503227;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_5916220911070() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4502917 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term4503003 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term4503095 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4503187 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term4503003, term4503003.getClass(), "type", 37);
        setIntField(term4503095, term4503095.getClass(), "type", 33);
        setField(term4503187, term4503187.getClass(), "next", term4503187);
        setIntField(term4503187, term4503187.getClass(), "type", 40);
        setField(term4503187, term4503187.getClass(), "str", "");
        setField(term4503095, term4503095.getClass(), "first", term4503187);
        setField(term4503095, term4503095.getClass(), "next", null);
        setField(term4503003, term4503003.getClass(), "first", term4503095);
        term4503300 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term4503300, term4503300.getClass(), "currentTraversal", null);
        term4503301 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term4503302 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4503303 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term4503301, term4503301.getClass(), "functionName", null);
        setBooleanField(term4503301, term4503301.getClass(), "itsNeedsActivation", false);
        setIntField(term4503301, term4503301.getClass(), "itsFunctionType", 0);
        setBooleanField(term4503301, term4503301.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term4503301, term4503301.getClass(), "encodedSourceStart", 0);
        setIntField(term4503301, term4503301.getClass(), "encodedSourceEnd", 0);
        setField(term4503301, term4503301.getClass(), "sourceName", null);
        setIntField(term4503301, term4503301.getClass(), "baseLineno", 0);
        setIntField(term4503301, term4503301.getClass(), "endLineno", 0);
        setField(term4503301, term4503301.getClass(), "functions", null);
        setField(term4503301, term4503301.getClass(), "regexps", null);
        setField(term4503301, term4503301.getClass(), "itsVariables", null);
        setField(term4503301, term4503301.getClass(), "itsConst", null);
        setField(term4503301, term4503301.getClass(), "itsVariableNames", null);
        setIntField(term4503301, term4503301.getClass(), "varStart", 0);
        setField(term4503301, term4503301.getClass(), "compilerData", null);
        setIntField(term4503301, term4503301.getClass(), "type", 37);
        setField(term4503301, term4503301.getClass(), "next", null);
        setField(term4503302, term4503302.getClass(), "str", null);
        setIntField(term4503302, term4503302.getClass(), "type", 33);
        setField(term4503302, term4503302.getClass(), "next", null);
        setField(term4503303, term4503303.getClass(), "str", "");
        setIntField(term4503303, term4503303.getClass(), "type", 40);
        setField(term4503303, term4503303.getClass(), "next", term4503303);
        setField(term4503303, term4503303.getClass(), "first", null);
        setField(term4503303, term4503303.getClass(), "last", null);
        setField(term4503303, term4503303.getClass(), "propListHead", null);
        setIntField(term4503303, term4503303.getClass(), "sourcePosition", 0);
        setField(term4503303, term4503303.getClass(), "jsType", null);
        setField(term4503303, term4503303.getClass(), "parent", null);
        setField(term4503302, term4503302.getClass(), "first", term4503303);
        setField(term4503302, term4503302.getClass(), "last", null);
        setField(term4503302, term4503302.getClass(), "propListHead", null);
        setIntField(term4503302, term4503302.getClass(), "sourcePosition", 0);
        setField(term4503302, term4503302.getClass(), "jsType", null);
        setField(term4503302, term4503302.getClass(), "parent", null);
        setField(term4503301, term4503301.getClass(), "first", term4503302);
        setField(term4503301, term4503301.getClass(), "last", null);
        setField(term4503301, term4503301.getClass(), "propListHead", null);
        setIntField(term4503301, term4503301.getClass(), "sourcePosition", 0);
        setField(term4503301, term4503301.getClass(), "jsType", null);
        setField(term4503301, term4503301.getClass(), "parent", null);
        term4503227 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term4503237 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4503239 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term4503227, term4503227.getClass(), "functionName", null);
        setBooleanField(term4503227, term4503227.getClass(), "itsNeedsActivation", false);
        setIntField(term4503227, term4503227.getClass(), "itsFunctionType", 0);
        setBooleanField(term4503227, term4503227.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term4503227, term4503227.getClass(), "encodedSourceStart", 0);
        setIntField(term4503227, term4503227.getClass(), "encodedSourceEnd", 0);
        setField(term4503227, term4503227.getClass(), "sourceName", null);
        setIntField(term4503227, term4503227.getClass(), "baseLineno", 0);
        setIntField(term4503227, term4503227.getClass(), "endLineno", 0);
        setField(term4503227, term4503227.getClass(), "functions", null);
        setField(term4503227, term4503227.getClass(), "regexps", null);
        setField(term4503227, term4503227.getClass(), "itsVariables", null);
        setField(term4503227, term4503227.getClass(), "itsConst", null);
        setField(term4503227, term4503227.getClass(), "itsVariableNames", null);
        setIntField(term4503227, term4503227.getClass(), "varStart", 0);
        setField(term4503227, term4503227.getClass(), "compilerData", null);
        setIntField(term4503227, term4503227.getClass(), "type", 37);
        setField(term4503227, term4503227.getClass(), "next", null);
        setField(term4503237, term4503237.getClass(), "str", null);
        setIntField(term4503237, term4503237.getClass(), "type", 33);
        setField(term4503237, term4503237.getClass(), "next", null);
        setField(term4503239, term4503239.getClass(), "str", "");
        setIntField(term4503239, term4503239.getClass(), "type", 40);
        setField(term4503239, term4503239.getClass(), "next", term4503239);
        setField(term4503239, term4503239.getClass(), "first", null);
        setField(term4503239, term4503239.getClass(), "last", null);
        setField(term4503239, term4503239.getClass(), "propListHead", null);
        setIntField(term4503239, term4503239.getClass(), "sourcePosition", 0);
        setField(term4503239, term4503239.getClass(), "jsType", null);
        setField(term4503239, term4503239.getClass(), "parent", null);
        setField(term4503237, term4503237.getClass(), "first", term4503239);
        setField(term4503237, term4503237.getClass(), "last", null);
        setField(term4503237, term4503237.getClass(), "propListHead", null);
        setIntField(term4503237, term4503237.getClass(), "sourcePosition", 0);
        setField(term4503237, term4503237.getClass(), "jsType", null);
        setField(term4503237, term4503237.getClass(), "parent", null);
        setField(term4503227, term4503227.getClass(), "first", term4503237);
        setField(term4503227, term4503227.getClass(), "last", null);
        setField(term4503227, term4503227.getClass(), "propListHead", null);
        setIntField(term4503227, term4503227.getClass(), "sourcePosition", 0);
        setField(term4503227, term4503227.getClass(), "jsType", null);
        setField(term4503227, term4503227.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4503003;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term4502917, args);
        assertTrue(recursiveEquals(term4502917, term4503300));
        assertTrue(recursiveEquals(term4503003, term4503301));
        assertTrue(recursiveEquals(retValue, term4503227));
    }

};


