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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_5916220911076 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4510525;
     Object term4510611;
     Object term4511126;
     Object term4511127;
     Object term4510915;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_5916220911076() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4510525 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term4510611 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term4510703 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4510795 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4510903 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4510611, term4510611.getClass(), "type", 37);
        setIntField(term4510703, term4510703.getClass(), "type", 35);
        setField(term4510795, term4510795.getClass(), "next", term4510795);
        setIntField(term4510795, term4510795.getClass(), "type", 40);
        setField(term4510795, term4510795.getClass(), "str", "charCodeAt");
        setField(term4510703, term4510703.getClass(), "first", term4510795);
        setIntField(term4510903, term4510903.getClass(), "type", 44);
        setField(term4510703, term4510703.getClass(), "next", term4510903);
        setField(term4510611, term4510611.getClass(), "first", term4510703);
        term4511126 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term4511126, term4511126.getClass(), "currentTraversal", null);
        term4511127 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term4511128 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4511129 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4511130 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term4511127, term4511127.getClass(), "functionName", null);
        setBooleanField(term4511127, term4511127.getClass(), "itsNeedsActivation", false);
        setIntField(term4511127, term4511127.getClass(), "itsFunctionType", 0);
        setBooleanField(term4511127, term4511127.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term4511127, term4511127.getClass(), "encodedSourceStart", 0);
        setIntField(term4511127, term4511127.getClass(), "encodedSourceEnd", 0);
        setField(term4511127, term4511127.getClass(), "sourceName", null);
        setIntField(term4511127, term4511127.getClass(), "baseLineno", 0);
        setIntField(term4511127, term4511127.getClass(), "endLineno", 0);
        setField(term4511127, term4511127.getClass(), "functions", null);
        setField(term4511127, term4511127.getClass(), "regexps", null);
        setField(term4511127, term4511127.getClass(), "itsVariables", null);
        setField(term4511127, term4511127.getClass(), "itsConst", null);
        setField(term4511127, term4511127.getClass(), "itsVariableNames", null);
        setIntField(term4511127, term4511127.getClass(), "varStart", 0);
        setField(term4511127, term4511127.getClass(), "compilerData", null);
        setIntField(term4511127, term4511127.getClass(), "type", 37);
        setField(term4511127, term4511127.getClass(), "next", null);
        setField(term4511128, term4511128.getClass(), "str", null);
        setIntField(term4511128, term4511128.getClass(), "type", 35);
        setIntField(term4511129, term4511129.getClass(), "type", 44);
        setField(term4511129, term4511129.getClass(), "next", null);
        setField(term4511129, term4511129.getClass(), "first", null);
        setField(term4511129, term4511129.getClass(), "last", null);
        setField(term4511129, term4511129.getClass(), "propListHead", null);
        setIntField(term4511129, term4511129.getClass(), "sourcePosition", 0);
        setField(term4511129, term4511129.getClass(), "jsType", null);
        setField(term4511129, term4511129.getClass(), "parent", null);
        setField(term4511128, term4511128.getClass(), "next", term4511129);
        setField(term4511130, term4511130.getClass(), "str", "charCodeAt");
        setIntField(term4511130, term4511130.getClass(), "type", 40);
        setField(term4511130, term4511130.getClass(), "next", term4511130);
        setField(term4511130, term4511130.getClass(), "first", null);
        setField(term4511130, term4511130.getClass(), "last", null);
        setField(term4511130, term4511130.getClass(), "propListHead", null);
        setIntField(term4511130, term4511130.getClass(), "sourcePosition", 0);
        setField(term4511130, term4511130.getClass(), "jsType", null);
        setField(term4511130, term4511130.getClass(), "parent", null);
        setField(term4511128, term4511128.getClass(), "first", term4511130);
        setField(term4511128, term4511128.getClass(), "last", null);
        setField(term4511128, term4511128.getClass(), "propListHead", null);
        setIntField(term4511128, term4511128.getClass(), "sourcePosition", 0);
        setField(term4511128, term4511128.getClass(), "jsType", null);
        setField(term4511128, term4511128.getClass(), "parent", null);
        setField(term4511127, term4511127.getClass(), "first", term4511128);
        setField(term4511127, term4511127.getClass(), "last", null);
        setField(term4511127, term4511127.getClass(), "propListHead", null);
        setIntField(term4511127, term4511127.getClass(), "sourcePosition", 0);
        setField(term4511127, term4511127.getClass(), "jsType", null);
        setField(term4511127, term4511127.getClass(), "parent", null);
        term4510915 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term4510925 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4510927 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4510930 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term4510915, term4510915.getClass(), "functionName", null);
        setBooleanField(term4510915, term4510915.getClass(), "itsNeedsActivation", false);
        setIntField(term4510915, term4510915.getClass(), "itsFunctionType", 0);
        setBooleanField(term4510915, term4510915.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term4510915, term4510915.getClass(), "encodedSourceStart", 0);
        setIntField(term4510915, term4510915.getClass(), "encodedSourceEnd", 0);
        setField(term4510915, term4510915.getClass(), "sourceName", null);
        setIntField(term4510915, term4510915.getClass(), "baseLineno", 0);
        setIntField(term4510915, term4510915.getClass(), "endLineno", 0);
        setField(term4510915, term4510915.getClass(), "functions", null);
        setField(term4510915, term4510915.getClass(), "regexps", null);
        setField(term4510915, term4510915.getClass(), "itsVariables", null);
        setField(term4510915, term4510915.getClass(), "itsConst", null);
        setField(term4510915, term4510915.getClass(), "itsVariableNames", null);
        setIntField(term4510915, term4510915.getClass(), "varStart", 0);
        setField(term4510915, term4510915.getClass(), "compilerData", null);
        setIntField(term4510915, term4510915.getClass(), "type", 37);
        setField(term4510915, term4510915.getClass(), "next", null);
        setField(term4510925, term4510925.getClass(), "str", null);
        setIntField(term4510925, term4510925.getClass(), "type", 35);
        setIntField(term4510927, term4510927.getClass(), "type", 44);
        setField(term4510927, term4510927.getClass(), "next", null);
        setField(term4510927, term4510927.getClass(), "first", null);
        setField(term4510927, term4510927.getClass(), "last", null);
        setField(term4510927, term4510927.getClass(), "propListHead", null);
        setIntField(term4510927, term4510927.getClass(), "sourcePosition", 0);
        setField(term4510927, term4510927.getClass(), "jsType", null);
        setField(term4510927, term4510927.getClass(), "parent", null);
        setField(term4510925, term4510925.getClass(), "next", term4510927);
        setField(term4510930, term4510930.getClass(), "str", "charCodeAt");
        setIntField(term4510930, term4510930.getClass(), "type", 40);
        setField(term4510930, term4510930.getClass(), "next", term4510930);
        setField(term4510930, term4510930.getClass(), "first", null);
        setField(term4510930, term4510930.getClass(), "last", null);
        setField(term4510930, term4510930.getClass(), "propListHead", null);
        setIntField(term4510930, term4510930.getClass(), "sourcePosition", 0);
        setField(term4510930, term4510930.getClass(), "jsType", null);
        setField(term4510930, term4510930.getClass(), "parent", null);
        setField(term4510925, term4510925.getClass(), "first", term4510930);
        setField(term4510925, term4510925.getClass(), "last", null);
        setField(term4510925, term4510925.getClass(), "propListHead", null);
        setIntField(term4510925, term4510925.getClass(), "sourcePosition", 0);
        setField(term4510925, term4510925.getClass(), "jsType", null);
        setField(term4510925, term4510925.getClass(), "parent", null);
        setField(term4510915, term4510915.getClass(), "first", term4510925);
        setField(term4510915, term4510915.getClass(), "last", null);
        setField(term4510915, term4510915.getClass(), "propListHead", null);
        setIntField(term4510915, term4510915.getClass(), "sourcePosition", 0);
        setField(term4510915, term4510915.getClass(), "jsType", null);
        setField(term4510915, term4510915.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4510611;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term4510525, args);
        assertTrue(recursiveEquals(term4510525, term4511126));
        assertTrue(recursiveEquals(term4510611, term4511127));
        assertTrue(recursiveEquals(retValue, term4510915));
    }

};


