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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3699844;
     Object term3699936;
     Object term3700663;
     Object term3700664;
     Object term3700290;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3699844 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3699936 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3700028 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3700120 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3700244 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3700028, term3700028.getClass(), "type", 35);
        setField(term3700120, term3700120.getClass(), "next", term3700120);
        setIntField(term3700120, term3700120.getClass(), "type", 40);
        setField(term3700120, term3700120.getClass(), "str", "indexOf");
        setField(term3700028, term3700028.getClass(), "first", term3700120);
        setIntField(term3700244, term3700244.getClass(), "type", 44);
        setField(term3700244, term3700244.getClass(), "next", term3700120);
        setField(term3700028, term3700028.getClass(), "next", term3700244);
        setField(term3699936, term3699936.getClass(), "first", term3700028);
        setIntField(term3699936, term3699936.getClass(), "type", 37);
        term3700663 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3700663, term3700663.getClass(), "currentTraversal", null);
        term3700664 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3700665 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3700666 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3700667 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3700664, term3700664.getClass(), "str", null);
        setIntField(term3700664, term3700664.getClass(), "type", 37);
        setField(term3700664, term3700664.getClass(), "next", null);
        setField(term3700665, term3700665.getClass(), "str", null);
        setIntField(term3700665, term3700665.getClass(), "type", 35);
        setField(term3700666, term3700666.getClass(), "functionName", null);
        setBooleanField(term3700666, term3700666.getClass(), "itsNeedsActivation", false);
        setIntField(term3700666, term3700666.getClass(), "itsFunctionType", 0);
        setBooleanField(term3700666, term3700666.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3700666, term3700666.getClass(), "encodedSourceStart", 0);
        setIntField(term3700666, term3700666.getClass(), "encodedSourceEnd", 0);
        setField(term3700666, term3700666.getClass(), "sourceName", null);
        setIntField(term3700666, term3700666.getClass(), "baseLineno", 0);
        setIntField(term3700666, term3700666.getClass(), "endLineno", 0);
        setField(term3700666, term3700666.getClass(), "functions", null);
        setField(term3700666, term3700666.getClass(), "regexps", null);
        setField(term3700666, term3700666.getClass(), "itsVariables", null);
        setField(term3700666, term3700666.getClass(), "itsConst", null);
        setField(term3700666, term3700666.getClass(), "itsVariableNames", null);
        setIntField(term3700666, term3700666.getClass(), "varStart", 0);
        setField(term3700666, term3700666.getClass(), "compilerData", null);
        setIntField(term3700666, term3700666.getClass(), "type", 44);
        setField(term3700667, term3700667.getClass(), "str", "");
        setIntField(term3700667, term3700667.getClass(), "type", 40);
        setField(term3700667, term3700667.getClass(), "next", term3700667);
        setField(term3700667, term3700667.getClass(), "first", null);
        setField(term3700667, term3700667.getClass(), "last", null);
        setField(term3700667, term3700667.getClass(), "propListHead", null);
        setIntField(term3700667, term3700667.getClass(), "sourcePosition", 0);
        setField(term3700667, term3700667.getClass(), "jsType", null);
        setField(term3700667, term3700667.getClass(), "parent", null);
        setField(term3700666, term3700666.getClass(), "next", term3700667);
        setField(term3700666, term3700666.getClass(), "first", null);
        setField(term3700666, term3700666.getClass(), "last", null);
        setField(term3700666, term3700666.getClass(), "propListHead", null);
        setIntField(term3700666, term3700666.getClass(), "sourcePosition", 0);
        setField(term3700666, term3700666.getClass(), "jsType", null);
        setField(term3700666, term3700666.getClass(), "parent", null);
        setField(term3700665, term3700665.getClass(), "next", term3700666);
        setField(term3700665, term3700665.getClass(), "first", term3700667);
        setField(term3700665, term3700665.getClass(), "last", null);
        setField(term3700665, term3700665.getClass(), "propListHead", null);
        setIntField(term3700665, term3700665.getClass(), "sourcePosition", 0);
        setField(term3700665, term3700665.getClass(), "jsType", null);
        setField(term3700665, term3700665.getClass(), "parent", null);
        setField(term3700664, term3700664.getClass(), "first", term3700665);
        setField(term3700664, term3700664.getClass(), "last", null);
        setField(term3700664, term3700664.getClass(), "propListHead", null);
        setIntField(term3700664, term3700664.getClass(), "sourcePosition", 0);
        setField(term3700664, term3700664.getClass(), "jsType", null);
        setField(term3700664, term3700664.getClass(), "parent", null);
        term3700290 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3700292 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3700294 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3700304 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3700290, term3700290.getClass(), "str", null);
        setIntField(term3700290, term3700290.getClass(), "type", 37);
        setField(term3700290, term3700290.getClass(), "next", null);
        setField(term3700292, term3700292.getClass(), "str", null);
        setIntField(term3700292, term3700292.getClass(), "type", 35);
        setField(term3700294, term3700294.getClass(), "functionName", null);
        setBooleanField(term3700294, term3700294.getClass(), "itsNeedsActivation", false);
        setIntField(term3700294, term3700294.getClass(), "itsFunctionType", 0);
        setBooleanField(term3700294, term3700294.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3700294, term3700294.getClass(), "encodedSourceStart", 0);
        setIntField(term3700294, term3700294.getClass(), "encodedSourceEnd", 0);
        setField(term3700294, term3700294.getClass(), "sourceName", null);
        setIntField(term3700294, term3700294.getClass(), "baseLineno", 0);
        setIntField(term3700294, term3700294.getClass(), "endLineno", 0);
        setField(term3700294, term3700294.getClass(), "functions", null);
        setField(term3700294, term3700294.getClass(), "regexps", null);
        setField(term3700294, term3700294.getClass(), "itsVariables", null);
        setField(term3700294, term3700294.getClass(), "itsConst", null);
        setField(term3700294, term3700294.getClass(), "itsVariableNames", null);
        setIntField(term3700294, term3700294.getClass(), "varStart", 0);
        setField(term3700294, term3700294.getClass(), "compilerData", null);
        setIntField(term3700294, term3700294.getClass(), "type", 44);
        setField(term3700304, term3700304.getClass(), "str", "");
        setIntField(term3700304, term3700304.getClass(), "type", 40);
        setField(term3700304, term3700304.getClass(), "next", term3700304);
        setField(term3700304, term3700304.getClass(), "first", null);
        setField(term3700304, term3700304.getClass(), "last", null);
        setField(term3700304, term3700304.getClass(), "propListHead", null);
        setIntField(term3700304, term3700304.getClass(), "sourcePosition", 0);
        setField(term3700304, term3700304.getClass(), "jsType", null);
        setField(term3700304, term3700304.getClass(), "parent", null);
        setField(term3700294, term3700294.getClass(), "next", term3700304);
        setField(term3700294, term3700294.getClass(), "first", null);
        setField(term3700294, term3700294.getClass(), "last", null);
        setField(term3700294, term3700294.getClass(), "propListHead", null);
        setIntField(term3700294, term3700294.getClass(), "sourcePosition", 0);
        setField(term3700294, term3700294.getClass(), "jsType", null);
        setField(term3700294, term3700294.getClass(), "parent", null);
        setField(term3700292, term3700292.getClass(), "next", term3700294);
        setField(term3700292, term3700292.getClass(), "first", term3700304);
        setField(term3700292, term3700292.getClass(), "last", null);
        setField(term3700292, term3700292.getClass(), "propListHead", null);
        setIntField(term3700292, term3700292.getClass(), "sourcePosition", 0);
        setField(term3700292, term3700292.getClass(), "jsType", null);
        setField(term3700292, term3700292.getClass(), "parent", null);
        setField(term3700290, term3700290.getClass(), "first", term3700292);
        setField(term3700290, term3700290.getClass(), "last", null);
        setField(term3700290, term3700290.getClass(), "propListHead", null);
        setIntField(term3700290, term3700290.getClass(), "sourcePosition", 0);
        setField(term3700290, term3700290.getClass(), "jsType", null);
        setField(term3700290, term3700290.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3699936;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3699844, args);
        assertTrue(recursiveEquals(term3699844, term3700663));
        assertTrue(recursiveEquals(term3699936, term3700664));
        assertTrue(recursiveEquals(retValue, term3700290));
    }

};


