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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374687 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3601934;
     Object term3602026;
     Object term3603752;
     Object term3603753;
     Object term3603385;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374687() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3601934 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3602026 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3602118 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3602210 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3602302 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3602426 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3602118, term3602118.getClass(), "type", 35);
        setIntField(term3602302, term3602302.getClass(), "type", 40);
        setField(term3602302, term3602302.getClass(), "str", "charCodeAt");
        setField(term3602210, term3602210.getClass(), "next", term3602302);
        setIntField(term3602210, term3602210.getClass(), "type", 40);
        setField(term3602118, term3602118.getClass(), "first", term3602210);
        setIntField(term3602426, term3602426.getClass(), "type", 44);
        setField(term3602118, term3602118.getClass(), "next", term3602426);
        setField(term3602026, term3602026.getClass(), "first", term3602118);
        setIntField(term3602026, term3602026.getClass(), "type", 37);
        term3603752 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3603752, term3603752.getClass(), "currentTraversal", null);
        term3603753 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3603754 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3603755 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3603756 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3603757 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3603753, term3603753.getClass(), "str", null);
        setIntField(term3603753, term3603753.getClass(), "type", 37);
        setField(term3603753, term3603753.getClass(), "next", null);
        setField(term3603754, term3603754.getClass(), "str", null);
        setIntField(term3603754, term3603754.getClass(), "type", 35);
        setField(term3603755, term3603755.getClass(), "functionName", null);
        setBooleanField(term3603755, term3603755.getClass(), "itsNeedsActivation", false);
        setIntField(term3603755, term3603755.getClass(), "itsFunctionType", 0);
        setBooleanField(term3603755, term3603755.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3603755, term3603755.getClass(), "encodedSourceStart", 0);
        setIntField(term3603755, term3603755.getClass(), "encodedSourceEnd", 0);
        setField(term3603755, term3603755.getClass(), "sourceName", null);
        setIntField(term3603755, term3603755.getClass(), "baseLineno", 0);
        setIntField(term3603755, term3603755.getClass(), "endLineno", 0);
        setField(term3603755, term3603755.getClass(), "functions", null);
        setField(term3603755, term3603755.getClass(), "regexps", null);
        setField(term3603755, term3603755.getClass(), "itsVariables", null);
        setField(term3603755, term3603755.getClass(), "itsConst", null);
        setField(term3603755, term3603755.getClass(), "itsVariableNames", null);
        setIntField(term3603755, term3603755.getClass(), "varStart", 0);
        setField(term3603755, term3603755.getClass(), "compilerData", null);
        setIntField(term3603755, term3603755.getClass(), "type", 44);
        setField(term3603755, term3603755.getClass(), "next", null);
        setField(term3603755, term3603755.getClass(), "first", null);
        setField(term3603755, term3603755.getClass(), "last", null);
        setField(term3603755, term3603755.getClass(), "propListHead", null);
        setIntField(term3603755, term3603755.getClass(), "sourcePosition", 0);
        setField(term3603755, term3603755.getClass(), "jsType", null);
        setField(term3603755, term3603755.getClass(), "parent", null);
        setField(term3603754, term3603754.getClass(), "next", term3603755);
        setField(term3603756, term3603756.getClass(), "str", null);
        setIntField(term3603756, term3603756.getClass(), "type", 40);
        setField(term3603757, term3603757.getClass(), "str", "");
        setIntField(term3603757, term3603757.getClass(), "type", 40);
        setField(term3603757, term3603757.getClass(), "next", null);
        setField(term3603757, term3603757.getClass(), "first", null);
        setField(term3603757, term3603757.getClass(), "last", null);
        setField(term3603757, term3603757.getClass(), "propListHead", null);
        setIntField(term3603757, term3603757.getClass(), "sourcePosition", 0);
        setField(term3603757, term3603757.getClass(), "jsType", null);
        setField(term3603757, term3603757.getClass(), "parent", null);
        setField(term3603756, term3603756.getClass(), "next", term3603757);
        setField(term3603756, term3603756.getClass(), "first", null);
        setField(term3603756, term3603756.getClass(), "last", null);
        setField(term3603756, term3603756.getClass(), "propListHead", null);
        setIntField(term3603756, term3603756.getClass(), "sourcePosition", 0);
        setField(term3603756, term3603756.getClass(), "jsType", null);
        setField(term3603756, term3603756.getClass(), "parent", null);
        setField(term3603754, term3603754.getClass(), "first", term3603756);
        setField(term3603754, term3603754.getClass(), "last", null);
        setField(term3603754, term3603754.getClass(), "propListHead", null);
        setIntField(term3603754, term3603754.getClass(), "sourcePosition", 0);
        setField(term3603754, term3603754.getClass(), "jsType", null);
        setField(term3603754, term3603754.getClass(), "parent", null);
        setField(term3603753, term3603753.getClass(), "first", term3603754);
        setField(term3603753, term3603753.getClass(), "last", null);
        setField(term3603753, term3603753.getClass(), "propListHead", null);
        setIntField(term3603753, term3603753.getClass(), "sourcePosition", 0);
        setField(term3603753, term3603753.getClass(), "jsType", null);
        setField(term3603753, term3603753.getClass(), "parent", null);
        term3603385 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3603387 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3603389 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3603400 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3603402 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3603385, term3603385.getClass(), "str", null);
        setIntField(term3603385, term3603385.getClass(), "type", 37);
        setField(term3603385, term3603385.getClass(), "next", null);
        setField(term3603387, term3603387.getClass(), "str", null);
        setIntField(term3603387, term3603387.getClass(), "type", 35);
        setField(term3603389, term3603389.getClass(), "functionName", null);
        setBooleanField(term3603389, term3603389.getClass(), "itsNeedsActivation", false);
        setIntField(term3603389, term3603389.getClass(), "itsFunctionType", 0);
        setBooleanField(term3603389, term3603389.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3603389, term3603389.getClass(), "encodedSourceStart", 0);
        setIntField(term3603389, term3603389.getClass(), "encodedSourceEnd", 0);
        setField(term3603389, term3603389.getClass(), "sourceName", null);
        setIntField(term3603389, term3603389.getClass(), "baseLineno", 0);
        setIntField(term3603389, term3603389.getClass(), "endLineno", 0);
        setField(term3603389, term3603389.getClass(), "functions", null);
        setField(term3603389, term3603389.getClass(), "regexps", null);
        setField(term3603389, term3603389.getClass(), "itsVariables", null);
        setField(term3603389, term3603389.getClass(), "itsConst", null);
        setField(term3603389, term3603389.getClass(), "itsVariableNames", null);
        setIntField(term3603389, term3603389.getClass(), "varStart", 0);
        setField(term3603389, term3603389.getClass(), "compilerData", null);
        setIntField(term3603389, term3603389.getClass(), "type", 44);
        setField(term3603389, term3603389.getClass(), "next", null);
        setField(term3603389, term3603389.getClass(), "first", null);
        setField(term3603389, term3603389.getClass(), "last", null);
        setField(term3603389, term3603389.getClass(), "propListHead", null);
        setIntField(term3603389, term3603389.getClass(), "sourcePosition", 0);
        setField(term3603389, term3603389.getClass(), "jsType", null);
        setField(term3603389, term3603389.getClass(), "parent", null);
        setField(term3603387, term3603387.getClass(), "next", term3603389);
        setField(term3603400, term3603400.getClass(), "str", null);
        setIntField(term3603400, term3603400.getClass(), "type", 40);
        setField(term3603402, term3603402.getClass(), "str", "");
        setIntField(term3603402, term3603402.getClass(), "type", 40);
        setField(term3603402, term3603402.getClass(), "next", null);
        setField(term3603402, term3603402.getClass(), "first", null);
        setField(term3603402, term3603402.getClass(), "last", null);
        setField(term3603402, term3603402.getClass(), "propListHead", null);
        setIntField(term3603402, term3603402.getClass(), "sourcePosition", 0);
        setField(term3603402, term3603402.getClass(), "jsType", null);
        setField(term3603402, term3603402.getClass(), "parent", null);
        setField(term3603400, term3603400.getClass(), "next", term3603402);
        setField(term3603400, term3603400.getClass(), "first", null);
        setField(term3603400, term3603400.getClass(), "last", null);
        setField(term3603400, term3603400.getClass(), "propListHead", null);
        setIntField(term3603400, term3603400.getClass(), "sourcePosition", 0);
        setField(term3603400, term3603400.getClass(), "jsType", null);
        setField(term3603400, term3603400.getClass(), "parent", null);
        setField(term3603387, term3603387.getClass(), "first", term3603400);
        setField(term3603387, term3603387.getClass(), "last", null);
        setField(term3603387, term3603387.getClass(), "propListHead", null);
        setIntField(term3603387, term3603387.getClass(), "sourcePosition", 0);
        setField(term3603387, term3603387.getClass(), "jsType", null);
        setField(term3603387, term3603387.getClass(), "parent", null);
        setField(term3603385, term3603385.getClass(), "first", term3603387);
        setField(term3603385, term3603385.getClass(), "last", null);
        setField(term3603385, term3603385.getClass(), "propListHead", null);
        setIntField(term3603385, term3603385.getClass(), "sourcePosition", 0);
        setField(term3603385, term3603385.getClass(), "jsType", null);
        setField(term3603385, term3603385.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3602026;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3601934, args);
        assertTrue(recursiveEquals(term3601934, term3603752));
        assertTrue(recursiveEquals(term3602026, term3603753));
        assertTrue(recursiveEquals(retValue, term3603385));
    }

};


