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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374865 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3721432;
     Object term3721524;
     Object term3723061;
     Object term3723062;
     Object term3722827;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374865() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3721432 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3721524 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3721616 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3721708 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3721800 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3721928 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term3721616, term3721616.getClass(), "type", 35);
        setIntField(term3721800, term3721800.getClass(), "type", 40);
        setField(term3721800, term3721800.getClass(), "str", "");
        setField(term3721708, term3721708.getClass(), "next", term3721800);
        setIntField(term3721708, term3721708.getClass(), "type", 40);
        setField(term3721616, term3721616.getClass(), "first", term3721708);
        setIntField(term3721928, term3721928.getClass(), "type", 44);
        setField(term3721616, term3721616.getClass(), "next", term3721928);
        setField(term3721524, term3721524.getClass(), "first", term3721616);
        setIntField(term3721524, term3721524.getClass(), "type", 37);
        term3723061 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3723061, term3723061.getClass(), "currentTraversal", null);
        term3723062 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3723063 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3723064 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term3723065 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3723066 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3723062, term3723062.getClass(), "str", null);
        setIntField(term3723062, term3723062.getClass(), "type", 37);
        setField(term3723062, term3723062.getClass(), "next", null);
        setField(term3723063, term3723063.getClass(), "str", null);
        setIntField(term3723063, term3723063.getClass(), "type", 35);
        setIntField(term3723064, term3723064.getClass(), "encodedSourceStart", 0);
        setIntField(term3723064, term3723064.getClass(), "encodedSourceEnd", 0);
        setField(term3723064, term3723064.getClass(), "sourceName", null);
        setIntField(term3723064, term3723064.getClass(), "baseLineno", 0);
        setIntField(term3723064, term3723064.getClass(), "endLineno", 0);
        setField(term3723064, term3723064.getClass(), "functions", null);
        setField(term3723064, term3723064.getClass(), "regexps", null);
        setField(term3723064, term3723064.getClass(), "itsVariables", null);
        setField(term3723064, term3723064.getClass(), "itsConst", null);
        setField(term3723064, term3723064.getClass(), "itsVariableNames", null);
        setIntField(term3723064, term3723064.getClass(), "varStart", 0);
        setField(term3723064, term3723064.getClass(), "compilerData", null);
        setIntField(term3723064, term3723064.getClass(), "type", 44);
        setField(term3723064, term3723064.getClass(), "next", null);
        setField(term3723064, term3723064.getClass(), "first", null);
        setField(term3723064, term3723064.getClass(), "last", null);
        setField(term3723064, term3723064.getClass(), "propListHead", null);
        setIntField(term3723064, term3723064.getClass(), "sourcePosition", 0);
        setField(term3723064, term3723064.getClass(), "jsType", null);
        setField(term3723064, term3723064.getClass(), "parent", null);
        setField(term3723063, term3723063.getClass(), "next", term3723064);
        setField(term3723065, term3723065.getClass(), "str", null);
        setIntField(term3723065, term3723065.getClass(), "type", 40);
        setField(term3723066, term3723066.getClass(), "str", "");
        setIntField(term3723066, term3723066.getClass(), "type", 40);
        setField(term3723066, term3723066.getClass(), "next", null);
        setField(term3723066, term3723066.getClass(), "first", null);
        setField(term3723066, term3723066.getClass(), "last", null);
        setField(term3723066, term3723066.getClass(), "propListHead", null);
        setIntField(term3723066, term3723066.getClass(), "sourcePosition", 0);
        setField(term3723066, term3723066.getClass(), "jsType", null);
        setField(term3723066, term3723066.getClass(), "parent", null);
        setField(term3723065, term3723065.getClass(), "next", term3723066);
        setField(term3723065, term3723065.getClass(), "first", null);
        setField(term3723065, term3723065.getClass(), "last", null);
        setField(term3723065, term3723065.getClass(), "propListHead", null);
        setIntField(term3723065, term3723065.getClass(), "sourcePosition", 0);
        setField(term3723065, term3723065.getClass(), "jsType", null);
        setField(term3723065, term3723065.getClass(), "parent", null);
        setField(term3723063, term3723063.getClass(), "first", term3723065);
        setField(term3723063, term3723063.getClass(), "last", null);
        setField(term3723063, term3723063.getClass(), "propListHead", null);
        setIntField(term3723063, term3723063.getClass(), "sourcePosition", 0);
        setField(term3723063, term3723063.getClass(), "jsType", null);
        setField(term3723063, term3723063.getClass(), "parent", null);
        setField(term3723062, term3723062.getClass(), "first", term3723063);
        setField(term3723062, term3723062.getClass(), "last", null);
        setField(term3723062, term3723062.getClass(), "propListHead", null);
        setIntField(term3723062, term3723062.getClass(), "sourcePosition", 0);
        setField(term3723062, term3723062.getClass(), "jsType", null);
        setField(term3723062, term3723062.getClass(), "parent", null);
        term3722827 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3722829 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3722831 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term3722839 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3722841 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3722827, term3722827.getClass(), "str", null);
        setIntField(term3722827, term3722827.getClass(), "type", 37);
        setField(term3722827, term3722827.getClass(), "next", null);
        setField(term3722829, term3722829.getClass(), "str", null);
        setIntField(term3722829, term3722829.getClass(), "type", 35);
        setIntField(term3722831, term3722831.getClass(), "encodedSourceStart", 0);
        setIntField(term3722831, term3722831.getClass(), "encodedSourceEnd", 0);
        setField(term3722831, term3722831.getClass(), "sourceName", null);
        setIntField(term3722831, term3722831.getClass(), "baseLineno", 0);
        setIntField(term3722831, term3722831.getClass(), "endLineno", 0);
        setField(term3722831, term3722831.getClass(), "functions", null);
        setField(term3722831, term3722831.getClass(), "regexps", null);
        setField(term3722831, term3722831.getClass(), "itsVariables", null);
        setField(term3722831, term3722831.getClass(), "itsConst", null);
        setField(term3722831, term3722831.getClass(), "itsVariableNames", null);
        setIntField(term3722831, term3722831.getClass(), "varStart", 0);
        setField(term3722831, term3722831.getClass(), "compilerData", null);
        setIntField(term3722831, term3722831.getClass(), "type", 44);
        setField(term3722831, term3722831.getClass(), "next", null);
        setField(term3722831, term3722831.getClass(), "first", null);
        setField(term3722831, term3722831.getClass(), "last", null);
        setField(term3722831, term3722831.getClass(), "propListHead", null);
        setIntField(term3722831, term3722831.getClass(), "sourcePosition", 0);
        setField(term3722831, term3722831.getClass(), "jsType", null);
        setField(term3722831, term3722831.getClass(), "parent", null);
        setField(term3722829, term3722829.getClass(), "next", term3722831);
        setField(term3722839, term3722839.getClass(), "str", null);
        setIntField(term3722839, term3722839.getClass(), "type", 40);
        setField(term3722841, term3722841.getClass(), "str", "");
        setIntField(term3722841, term3722841.getClass(), "type", 40);
        setField(term3722841, term3722841.getClass(), "next", null);
        setField(term3722841, term3722841.getClass(), "first", null);
        setField(term3722841, term3722841.getClass(), "last", null);
        setField(term3722841, term3722841.getClass(), "propListHead", null);
        setIntField(term3722841, term3722841.getClass(), "sourcePosition", 0);
        setField(term3722841, term3722841.getClass(), "jsType", null);
        setField(term3722841, term3722841.getClass(), "parent", null);
        setField(term3722839, term3722839.getClass(), "next", term3722841);
        setField(term3722839, term3722839.getClass(), "first", null);
        setField(term3722839, term3722839.getClass(), "last", null);
        setField(term3722839, term3722839.getClass(), "propListHead", null);
        setIntField(term3722839, term3722839.getClass(), "sourcePosition", 0);
        setField(term3722839, term3722839.getClass(), "jsType", null);
        setField(term3722839, term3722839.getClass(), "parent", null);
        setField(term3722829, term3722829.getClass(), "first", term3722839);
        setField(term3722829, term3722829.getClass(), "last", null);
        setField(term3722829, term3722829.getClass(), "propListHead", null);
        setIntField(term3722829, term3722829.getClass(), "sourcePosition", 0);
        setField(term3722829, term3722829.getClass(), "jsType", null);
        setField(term3722829, term3722829.getClass(), "parent", null);
        setField(term3722827, term3722827.getClass(), "first", term3722829);
        setField(term3722827, term3722827.getClass(), "last", null);
        setField(term3722827, term3722827.getClass(), "propListHead", null);
        setIntField(term3722827, term3722827.getClass(), "sourcePosition", 0);
        setField(term3722827, term3722827.getClass(), "jsType", null);
        setField(term3722827, term3722827.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3721524;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3721432, args);
        assertTrue(recursiveEquals(term3721432, term3723061));
        assertTrue(recursiveEquals(term3721524, term3723062));
        assertTrue(recursiveEquals(retValue, term3722827));
    }

};


