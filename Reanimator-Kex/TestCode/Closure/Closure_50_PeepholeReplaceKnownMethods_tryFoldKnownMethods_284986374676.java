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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374676 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3594298;
     Object term3594390;
     Object term3596940;
     Object term3596941;
     Object term3596584;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374676() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3594298 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3594390 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3594482 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3594574 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3594666 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3594790 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3594482, term3594482.getClass(), "type", 35);
        setIntField(term3594666, term3594666.getClass(), "type", 40);
        setField(term3594666, term3594666.getClass(), "str", "substring");
        setField(term3594574, term3594574.getClass(), "next", term3594666);
        setIntField(term3594574, term3594574.getClass(), "type", 40);
        setField(term3594482, term3594482.getClass(), "first", term3594574);
        setIntField(term3594790, term3594790.getClass(), "type", 43);
        setField(term3594482, term3594482.getClass(), "next", term3594790);
        setField(term3594390, term3594390.getClass(), "first", term3594482);
        setIntField(term3594390, term3594390.getClass(), "type", 37);
        term3596940 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3596940, term3596940.getClass(), "currentTraversal", null);
        term3596941 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3596942 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3596943 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3596944 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3596945 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3596941, term3596941.getClass(), "str", null);
        setIntField(term3596941, term3596941.getClass(), "type", 37);
        setField(term3596941, term3596941.getClass(), "next", null);
        setField(term3596942, term3596942.getClass(), "str", null);
        setIntField(term3596942, term3596942.getClass(), "type", 35);
        setField(term3596943, term3596943.getClass(), "functionName", null);
        setBooleanField(term3596943, term3596943.getClass(), "itsNeedsActivation", false);
        setIntField(term3596943, term3596943.getClass(), "itsFunctionType", 0);
        setBooleanField(term3596943, term3596943.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3596943, term3596943.getClass(), "encodedSourceStart", 0);
        setIntField(term3596943, term3596943.getClass(), "encodedSourceEnd", 0);
        setField(term3596943, term3596943.getClass(), "sourceName", null);
        setIntField(term3596943, term3596943.getClass(), "baseLineno", 0);
        setIntField(term3596943, term3596943.getClass(), "endLineno", 0);
        setField(term3596943, term3596943.getClass(), "functions", null);
        setField(term3596943, term3596943.getClass(), "regexps", null);
        setField(term3596943, term3596943.getClass(), "itsVariables", null);
        setField(term3596943, term3596943.getClass(), "itsConst", null);
        setField(term3596943, term3596943.getClass(), "itsVariableNames", null);
        setIntField(term3596943, term3596943.getClass(), "varStart", 0);
        setField(term3596943, term3596943.getClass(), "compilerData", null);
        setIntField(term3596943, term3596943.getClass(), "type", 43);
        setField(term3596943, term3596943.getClass(), "next", null);
        setField(term3596943, term3596943.getClass(), "first", null);
        setField(term3596943, term3596943.getClass(), "last", null);
        setField(term3596943, term3596943.getClass(), "propListHead", null);
        setIntField(term3596943, term3596943.getClass(), "sourcePosition", 0);
        setField(term3596943, term3596943.getClass(), "jsType", null);
        setField(term3596943, term3596943.getClass(), "parent", null);
        setField(term3596942, term3596942.getClass(), "next", term3596943);
        setField(term3596944, term3596944.getClass(), "str", null);
        setIntField(term3596944, term3596944.getClass(), "type", 40);
        setField(term3596945, term3596945.getClass(), "str", "");
        setIntField(term3596945, term3596945.getClass(), "type", 40);
        setField(term3596945, term3596945.getClass(), "next", null);
        setField(term3596945, term3596945.getClass(), "first", null);
        setField(term3596945, term3596945.getClass(), "last", null);
        setField(term3596945, term3596945.getClass(), "propListHead", null);
        setIntField(term3596945, term3596945.getClass(), "sourcePosition", 0);
        setField(term3596945, term3596945.getClass(), "jsType", null);
        setField(term3596945, term3596945.getClass(), "parent", null);
        setField(term3596944, term3596944.getClass(), "next", term3596945);
        setField(term3596944, term3596944.getClass(), "first", null);
        setField(term3596944, term3596944.getClass(), "last", null);
        setField(term3596944, term3596944.getClass(), "propListHead", null);
        setIntField(term3596944, term3596944.getClass(), "sourcePosition", 0);
        setField(term3596944, term3596944.getClass(), "jsType", null);
        setField(term3596944, term3596944.getClass(), "parent", null);
        setField(term3596942, term3596942.getClass(), "first", term3596944);
        setField(term3596942, term3596942.getClass(), "last", null);
        setField(term3596942, term3596942.getClass(), "propListHead", null);
        setIntField(term3596942, term3596942.getClass(), "sourcePosition", 0);
        setField(term3596942, term3596942.getClass(), "jsType", null);
        setField(term3596942, term3596942.getClass(), "parent", null);
        setField(term3596941, term3596941.getClass(), "first", term3596942);
        setField(term3596941, term3596941.getClass(), "last", null);
        setField(term3596941, term3596941.getClass(), "propListHead", null);
        setIntField(term3596941, term3596941.getClass(), "sourcePosition", 0);
        setField(term3596941, term3596941.getClass(), "jsType", null);
        setField(term3596941, term3596941.getClass(), "parent", null);
        term3596584 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3596586 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3596588 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3596599 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3596601 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3596584, term3596584.getClass(), "str", null);
        setIntField(term3596584, term3596584.getClass(), "type", 37);
        setField(term3596584, term3596584.getClass(), "next", null);
        setField(term3596586, term3596586.getClass(), "str", null);
        setIntField(term3596586, term3596586.getClass(), "type", 35);
        setField(term3596588, term3596588.getClass(), "functionName", null);
        setBooleanField(term3596588, term3596588.getClass(), "itsNeedsActivation", false);
        setIntField(term3596588, term3596588.getClass(), "itsFunctionType", 0);
        setBooleanField(term3596588, term3596588.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3596588, term3596588.getClass(), "encodedSourceStart", 0);
        setIntField(term3596588, term3596588.getClass(), "encodedSourceEnd", 0);
        setField(term3596588, term3596588.getClass(), "sourceName", null);
        setIntField(term3596588, term3596588.getClass(), "baseLineno", 0);
        setIntField(term3596588, term3596588.getClass(), "endLineno", 0);
        setField(term3596588, term3596588.getClass(), "functions", null);
        setField(term3596588, term3596588.getClass(), "regexps", null);
        setField(term3596588, term3596588.getClass(), "itsVariables", null);
        setField(term3596588, term3596588.getClass(), "itsConst", null);
        setField(term3596588, term3596588.getClass(), "itsVariableNames", null);
        setIntField(term3596588, term3596588.getClass(), "varStart", 0);
        setField(term3596588, term3596588.getClass(), "compilerData", null);
        setIntField(term3596588, term3596588.getClass(), "type", 43);
        setField(term3596588, term3596588.getClass(), "next", null);
        setField(term3596588, term3596588.getClass(), "first", null);
        setField(term3596588, term3596588.getClass(), "last", null);
        setField(term3596588, term3596588.getClass(), "propListHead", null);
        setIntField(term3596588, term3596588.getClass(), "sourcePosition", 0);
        setField(term3596588, term3596588.getClass(), "jsType", null);
        setField(term3596588, term3596588.getClass(), "parent", null);
        setField(term3596586, term3596586.getClass(), "next", term3596588);
        setField(term3596599, term3596599.getClass(), "str", null);
        setIntField(term3596599, term3596599.getClass(), "type", 40);
        setField(term3596601, term3596601.getClass(), "str", "");
        setIntField(term3596601, term3596601.getClass(), "type", 40);
        setField(term3596601, term3596601.getClass(), "next", null);
        setField(term3596601, term3596601.getClass(), "first", null);
        setField(term3596601, term3596601.getClass(), "last", null);
        setField(term3596601, term3596601.getClass(), "propListHead", null);
        setIntField(term3596601, term3596601.getClass(), "sourcePosition", 0);
        setField(term3596601, term3596601.getClass(), "jsType", null);
        setField(term3596601, term3596601.getClass(), "parent", null);
        setField(term3596599, term3596599.getClass(), "next", term3596601);
        setField(term3596599, term3596599.getClass(), "first", null);
        setField(term3596599, term3596599.getClass(), "last", null);
        setField(term3596599, term3596599.getClass(), "propListHead", null);
        setIntField(term3596599, term3596599.getClass(), "sourcePosition", 0);
        setField(term3596599, term3596599.getClass(), "jsType", null);
        setField(term3596599, term3596599.getClass(), "parent", null);
        setField(term3596586, term3596586.getClass(), "first", term3596599);
        setField(term3596586, term3596586.getClass(), "last", null);
        setField(term3596586, term3596586.getClass(), "propListHead", null);
        setIntField(term3596586, term3596586.getClass(), "sourcePosition", 0);
        setField(term3596586, term3596586.getClass(), "jsType", null);
        setField(term3596586, term3596586.getClass(), "parent", null);
        setField(term3596584, term3596584.getClass(), "first", term3596586);
        setField(term3596584, term3596584.getClass(), "last", null);
        setField(term3596584, term3596584.getClass(), "propListHead", null);
        setIntField(term3596584, term3596584.getClass(), "sourcePosition", 0);
        setField(term3596584, term3596584.getClass(), "jsType", null);
        setField(term3596584, term3596584.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3594390;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3594298, args);
        assertTrue(recursiveEquals(term3594298, term3596940));
        assertTrue(recursiveEquals(term3594390, term3596941));
        assertTrue(recursiveEquals(retValue, term3596584));
    }

};


