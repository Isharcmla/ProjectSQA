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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54081;
     Object term54173;
     Object term57103;
     Object term57104;
     Object term57056;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54081 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term54173 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term54259 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term54173, term54173.getClass(), "type", 37);
        setField(term54173, term54173.getClass(), "first", term54259);
        term57103 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term57103, term57103.getClass(), "currentTraversal", null);
        term57104 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term57105 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term57104, term57104.getClass(), "str", null);
        setIntField(term57104, term57104.getClass(), "type", 37);
        setField(term57104, term57104.getClass(), "next", null);
        setField(term57105, term57105.getClass(), "functionName", null);
        setBooleanField(term57105, term57105.getClass(), "itsNeedsActivation", false);
        setIntField(term57105, term57105.getClass(), "itsFunctionType", 0);
        setBooleanField(term57105, term57105.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term57105, term57105.getClass(), "encodedSourceStart", 0);
        setIntField(term57105, term57105.getClass(), "encodedSourceEnd", 0);
        setField(term57105, term57105.getClass(), "sourceName", null);
        setIntField(term57105, term57105.getClass(), "baseLineno", 0);
        setIntField(term57105, term57105.getClass(), "endLineno", 0);
        setField(term57105, term57105.getClass(), "functions", null);
        setField(term57105, term57105.getClass(), "regexps", null);
        setField(term57105, term57105.getClass(), "itsVariables", null);
        setField(term57105, term57105.getClass(), "itsConst", null);
        setField(term57105, term57105.getClass(), "itsVariableNames", null);
        setIntField(term57105, term57105.getClass(), "varStart", 0);
        setField(term57105, term57105.getClass(), "compilerData", null);
        setIntField(term57105, term57105.getClass(), "type", 0);
        setField(term57105, term57105.getClass(), "next", null);
        setField(term57105, term57105.getClass(), "first", null);
        setField(term57105, term57105.getClass(), "last", null);
        setField(term57105, term57105.getClass(), "propListHead", null);
        setIntField(term57105, term57105.getClass(), "sourcePosition", 0);
        setField(term57105, term57105.getClass(), "jsType", null);
        setField(term57105, term57105.getClass(), "parent", null);
        setField(term57104, term57104.getClass(), "first", term57105);
        setField(term57104, term57104.getClass(), "last", null);
        setField(term57104, term57104.getClass(), "propListHead", null);
        setIntField(term57104, term57104.getClass(), "sourcePosition", 0);
        setField(term57104, term57104.getClass(), "jsType", null);
        setField(term57104, term57104.getClass(), "parent", null);
        term57056 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term57058 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term57056, term57056.getClass(), "str", null);
        setIntField(term57056, term57056.getClass(), "type", 37);
        setField(term57056, term57056.getClass(), "next", null);
        setField(term57058, term57058.getClass(), "functionName", null);
        setBooleanField(term57058, term57058.getClass(), "itsNeedsActivation", false);
        setIntField(term57058, term57058.getClass(), "itsFunctionType", 0);
        setBooleanField(term57058, term57058.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term57058, term57058.getClass(), "encodedSourceStart", 0);
        setIntField(term57058, term57058.getClass(), "encodedSourceEnd", 0);
        setField(term57058, term57058.getClass(), "sourceName", null);
        setIntField(term57058, term57058.getClass(), "baseLineno", 0);
        setIntField(term57058, term57058.getClass(), "endLineno", 0);
        setField(term57058, term57058.getClass(), "functions", null);
        setField(term57058, term57058.getClass(), "regexps", null);
        setField(term57058, term57058.getClass(), "itsVariables", null);
        setField(term57058, term57058.getClass(), "itsConst", null);
        setField(term57058, term57058.getClass(), "itsVariableNames", null);
        setIntField(term57058, term57058.getClass(), "varStart", 0);
        setField(term57058, term57058.getClass(), "compilerData", null);
        setIntField(term57058, term57058.getClass(), "type", 0);
        setField(term57058, term57058.getClass(), "next", null);
        setField(term57058, term57058.getClass(), "first", null);
        setField(term57058, term57058.getClass(), "last", null);
        setField(term57058, term57058.getClass(), "propListHead", null);
        setIntField(term57058, term57058.getClass(), "sourcePosition", 0);
        setField(term57058, term57058.getClass(), "jsType", null);
        setField(term57058, term57058.getClass(), "parent", null);
        setField(term57056, term57056.getClass(), "first", term57058);
        setField(term57056, term57056.getClass(), "last", null);
        setField(term57056, term57056.getClass(), "propListHead", null);
        setIntField(term57056, term57056.getClass(), "sourcePosition", 0);
        setField(term57056, term57056.getClass(), "jsType", null);
        setField(term57056, term57056.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term54173;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term54081, args);
        assertTrue(recursiveEquals(term54081, term57103));
        assertTrue(recursiveEquals(term54173, term57104));
        assertTrue(recursiveEquals(retValue, term57056));
    }

};


