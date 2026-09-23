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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_5916220911054 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4490523;
     Object term4490609;
     Object term4491146;
     Object term4491147;
     Object term4490935;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_5916220911054() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4490523 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term4490609 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term4490701 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4490793 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4490901 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4490609, term4490609.getClass(), "type", 37);
        setIntField(term4490701, term4490701.getClass(), "type", 35);
        setField(term4490793, term4490793.getClass(), "next", term4490793);
        setIntField(term4490793, term4490793.getClass(), "type", 40);
        setField(term4490793, term4490793.getClass(), "str", "charCodeAt");
        setField(term4490701, term4490701.getClass(), "first", term4490793);
        setIntField(term4490901, term4490901.getClass(), "type", 41);
        setField(term4490701, term4490701.getClass(), "next", term4490901);
        setField(term4490609, term4490609.getClass(), "first", term4490701);
        term4491146 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term4491146, term4491146.getClass(), "currentTraversal", null);
        term4491147 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term4491148 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4491149 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4491150 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term4491147, term4491147.getClass(), "functionName", null);
        setBooleanField(term4491147, term4491147.getClass(), "itsNeedsActivation", false);
        setIntField(term4491147, term4491147.getClass(), "itsFunctionType", 0);
        setBooleanField(term4491147, term4491147.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term4491147, term4491147.getClass(), "encodedSourceStart", 0);
        setIntField(term4491147, term4491147.getClass(), "encodedSourceEnd", 0);
        setField(term4491147, term4491147.getClass(), "sourceName", null);
        setIntField(term4491147, term4491147.getClass(), "baseLineno", 0);
        setIntField(term4491147, term4491147.getClass(), "endLineno", 0);
        setField(term4491147, term4491147.getClass(), "functions", null);
        setField(term4491147, term4491147.getClass(), "regexps", null);
        setField(term4491147, term4491147.getClass(), "itsVariables", null);
        setField(term4491147, term4491147.getClass(), "itsConst", null);
        setField(term4491147, term4491147.getClass(), "itsVariableNames", null);
        setIntField(term4491147, term4491147.getClass(), "varStart", 0);
        setField(term4491147, term4491147.getClass(), "compilerData", null);
        setIntField(term4491147, term4491147.getClass(), "type", 37);
        setField(term4491147, term4491147.getClass(), "next", null);
        setField(term4491148, term4491148.getClass(), "str", null);
        setIntField(term4491148, term4491148.getClass(), "type", 35);
        setIntField(term4491149, term4491149.getClass(), "type", 41);
        setField(term4491149, term4491149.getClass(), "next", null);
        setField(term4491149, term4491149.getClass(), "first", null);
        setField(term4491149, term4491149.getClass(), "last", null);
        setField(term4491149, term4491149.getClass(), "propListHead", null);
        setIntField(term4491149, term4491149.getClass(), "sourcePosition", 0);
        setField(term4491149, term4491149.getClass(), "jsType", null);
        setField(term4491149, term4491149.getClass(), "parent", null);
        setField(term4491148, term4491148.getClass(), "next", term4491149);
        setField(term4491150, term4491150.getClass(), "str", "charCodeAt");
        setIntField(term4491150, term4491150.getClass(), "type", 40);
        setField(term4491150, term4491150.getClass(), "next", term4491150);
        setField(term4491150, term4491150.getClass(), "first", null);
        setField(term4491150, term4491150.getClass(), "last", null);
        setField(term4491150, term4491150.getClass(), "propListHead", null);
        setIntField(term4491150, term4491150.getClass(), "sourcePosition", 0);
        setField(term4491150, term4491150.getClass(), "jsType", null);
        setField(term4491150, term4491150.getClass(), "parent", null);
        setField(term4491148, term4491148.getClass(), "first", term4491150);
        setField(term4491148, term4491148.getClass(), "last", null);
        setField(term4491148, term4491148.getClass(), "propListHead", null);
        setIntField(term4491148, term4491148.getClass(), "sourcePosition", 0);
        setField(term4491148, term4491148.getClass(), "jsType", null);
        setField(term4491148, term4491148.getClass(), "parent", null);
        setField(term4491147, term4491147.getClass(), "first", term4491148);
        setField(term4491147, term4491147.getClass(), "last", null);
        setField(term4491147, term4491147.getClass(), "propListHead", null);
        setIntField(term4491147, term4491147.getClass(), "sourcePosition", 0);
        setField(term4491147, term4491147.getClass(), "jsType", null);
        setField(term4491147, term4491147.getClass(), "parent", null);
        term4490935 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term4490945 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4490947 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4490950 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term4490935, term4490935.getClass(), "functionName", null);
        setBooleanField(term4490935, term4490935.getClass(), "itsNeedsActivation", false);
        setIntField(term4490935, term4490935.getClass(), "itsFunctionType", 0);
        setBooleanField(term4490935, term4490935.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term4490935, term4490935.getClass(), "encodedSourceStart", 0);
        setIntField(term4490935, term4490935.getClass(), "encodedSourceEnd", 0);
        setField(term4490935, term4490935.getClass(), "sourceName", null);
        setIntField(term4490935, term4490935.getClass(), "baseLineno", 0);
        setIntField(term4490935, term4490935.getClass(), "endLineno", 0);
        setField(term4490935, term4490935.getClass(), "functions", null);
        setField(term4490935, term4490935.getClass(), "regexps", null);
        setField(term4490935, term4490935.getClass(), "itsVariables", null);
        setField(term4490935, term4490935.getClass(), "itsConst", null);
        setField(term4490935, term4490935.getClass(), "itsVariableNames", null);
        setIntField(term4490935, term4490935.getClass(), "varStart", 0);
        setField(term4490935, term4490935.getClass(), "compilerData", null);
        setIntField(term4490935, term4490935.getClass(), "type", 37);
        setField(term4490935, term4490935.getClass(), "next", null);
        setField(term4490945, term4490945.getClass(), "str", null);
        setIntField(term4490945, term4490945.getClass(), "type", 35);
        setIntField(term4490947, term4490947.getClass(), "type", 41);
        setField(term4490947, term4490947.getClass(), "next", null);
        setField(term4490947, term4490947.getClass(), "first", null);
        setField(term4490947, term4490947.getClass(), "last", null);
        setField(term4490947, term4490947.getClass(), "propListHead", null);
        setIntField(term4490947, term4490947.getClass(), "sourcePosition", 0);
        setField(term4490947, term4490947.getClass(), "jsType", null);
        setField(term4490947, term4490947.getClass(), "parent", null);
        setField(term4490945, term4490945.getClass(), "next", term4490947);
        setField(term4490950, term4490950.getClass(), "str", "charCodeAt");
        setIntField(term4490950, term4490950.getClass(), "type", 40);
        setField(term4490950, term4490950.getClass(), "next", term4490950);
        setField(term4490950, term4490950.getClass(), "first", null);
        setField(term4490950, term4490950.getClass(), "last", null);
        setField(term4490950, term4490950.getClass(), "propListHead", null);
        setIntField(term4490950, term4490950.getClass(), "sourcePosition", 0);
        setField(term4490950, term4490950.getClass(), "jsType", null);
        setField(term4490950, term4490950.getClass(), "parent", null);
        setField(term4490945, term4490945.getClass(), "first", term4490950);
        setField(term4490945, term4490945.getClass(), "last", null);
        setField(term4490945, term4490945.getClass(), "propListHead", null);
        setIntField(term4490945, term4490945.getClass(), "sourcePosition", 0);
        setField(term4490945, term4490945.getClass(), "jsType", null);
        setField(term4490945, term4490945.getClass(), "parent", null);
        setField(term4490935, term4490935.getClass(), "first", term4490945);
        setField(term4490935, term4490935.getClass(), "last", null);
        setField(term4490935, term4490935.getClass(), "propListHead", null);
        setIntField(term4490935, term4490935.getClass(), "sourcePosition", 0);
        setField(term4490935, term4490935.getClass(), "jsType", null);
        setField(term4490935, term4490935.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4490609;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term4490523, args);
        assertTrue(recursiveEquals(term4490523, term4491146));
        assertTrue(recursiveEquals(term4490609, term4491147));
        assertTrue(recursiveEquals(retValue, term4490935));
    }

};


