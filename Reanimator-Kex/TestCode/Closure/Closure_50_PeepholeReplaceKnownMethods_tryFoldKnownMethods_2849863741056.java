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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_2849863741056 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4491544;
     Object term4491636;
     Object term4492411;
     Object term4492412;
     Object term4492083;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_2849863741056() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4491544 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term4491636 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4491728 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4491820 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4491912 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4492036 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term4491728, term4491728.getClass(), "type", 35);
        setIntField(term4491912, term4491912.getClass(), "type", 40);
        setField(term4491912, term4491912.getClass(), "str", "substr");
        setField(term4491820, term4491820.getClass(), "next", term4491912);
        setIntField(term4491820, term4491820.getClass(), "type", 40);
        setField(term4491728, term4491728.getClass(), "first", term4491820);
        setIntField(term4492036, term4492036.getClass(), "type", 43);
        setField(term4491728, term4491728.getClass(), "next", term4492036);
        setField(term4491636, term4491636.getClass(), "first", term4491728);
        setIntField(term4491636, term4491636.getClass(), "type", 37);
        term4492411 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term4492411, term4492411.getClass(), "currentTraversal", null);
        term4492412 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4492413 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4492414 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term4492415 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4492416 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term4492412, term4492412.getClass(), "str", null);
        setIntField(term4492412, term4492412.getClass(), "type", 37);
        setField(term4492412, term4492412.getClass(), "next", null);
        setField(term4492413, term4492413.getClass(), "str", null);
        setIntField(term4492413, term4492413.getClass(), "type", 35);
        setField(term4492414, term4492414.getClass(), "functionName", null);
        setBooleanField(term4492414, term4492414.getClass(), "itsNeedsActivation", false);
        setIntField(term4492414, term4492414.getClass(), "itsFunctionType", 0);
        setBooleanField(term4492414, term4492414.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term4492414, term4492414.getClass(), "encodedSourceStart", 0);
        setIntField(term4492414, term4492414.getClass(), "encodedSourceEnd", 0);
        setField(term4492414, term4492414.getClass(), "sourceName", null);
        setIntField(term4492414, term4492414.getClass(), "baseLineno", 0);
        setIntField(term4492414, term4492414.getClass(), "endLineno", 0);
        setField(term4492414, term4492414.getClass(), "functions", null);
        setField(term4492414, term4492414.getClass(), "regexps", null);
        setField(term4492414, term4492414.getClass(), "itsVariables", null);
        setField(term4492414, term4492414.getClass(), "itsConst", null);
        setField(term4492414, term4492414.getClass(), "itsVariableNames", null);
        setIntField(term4492414, term4492414.getClass(), "varStart", 0);
        setField(term4492414, term4492414.getClass(), "compilerData", null);
        setIntField(term4492414, term4492414.getClass(), "type", 43);
        setField(term4492414, term4492414.getClass(), "next", null);
        setField(term4492414, term4492414.getClass(), "first", null);
        setField(term4492414, term4492414.getClass(), "last", null);
        setField(term4492414, term4492414.getClass(), "propListHead", null);
        setIntField(term4492414, term4492414.getClass(), "sourcePosition", 0);
        setField(term4492414, term4492414.getClass(), "jsType", null);
        setField(term4492414, term4492414.getClass(), "parent", null);
        setField(term4492413, term4492413.getClass(), "next", term4492414);
        setField(term4492415, term4492415.getClass(), "str", null);
        setIntField(term4492415, term4492415.getClass(), "type", 40);
        setField(term4492416, term4492416.getClass(), "str", "");
        setIntField(term4492416, term4492416.getClass(), "type", 40);
        setField(term4492416, term4492416.getClass(), "next", null);
        setField(term4492416, term4492416.getClass(), "first", null);
        setField(term4492416, term4492416.getClass(), "last", null);
        setField(term4492416, term4492416.getClass(), "propListHead", null);
        setIntField(term4492416, term4492416.getClass(), "sourcePosition", 0);
        setField(term4492416, term4492416.getClass(), "jsType", null);
        setField(term4492416, term4492416.getClass(), "parent", null);
        setField(term4492415, term4492415.getClass(), "next", term4492416);
        setField(term4492415, term4492415.getClass(), "first", null);
        setField(term4492415, term4492415.getClass(), "last", null);
        setField(term4492415, term4492415.getClass(), "propListHead", null);
        setIntField(term4492415, term4492415.getClass(), "sourcePosition", 0);
        setField(term4492415, term4492415.getClass(), "jsType", null);
        setField(term4492415, term4492415.getClass(), "parent", null);
        setField(term4492413, term4492413.getClass(), "first", term4492415);
        setField(term4492413, term4492413.getClass(), "last", null);
        setField(term4492413, term4492413.getClass(), "propListHead", null);
        setIntField(term4492413, term4492413.getClass(), "sourcePosition", 0);
        setField(term4492413, term4492413.getClass(), "jsType", null);
        setField(term4492413, term4492413.getClass(), "parent", null);
        setField(term4492412, term4492412.getClass(), "first", term4492413);
        setField(term4492412, term4492412.getClass(), "last", null);
        setField(term4492412, term4492412.getClass(), "propListHead", null);
        setIntField(term4492412, term4492412.getClass(), "sourcePosition", 0);
        setField(term4492412, term4492412.getClass(), "jsType", null);
        setField(term4492412, term4492412.getClass(), "parent", null);
        term4492083 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4492085 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4492087 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term4492098 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4492100 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term4492083, term4492083.getClass(), "str", null);
        setIntField(term4492083, term4492083.getClass(), "type", 37);
        setField(term4492083, term4492083.getClass(), "next", null);
        setField(term4492085, term4492085.getClass(), "str", null);
        setIntField(term4492085, term4492085.getClass(), "type", 35);
        setField(term4492087, term4492087.getClass(), "functionName", null);
        setBooleanField(term4492087, term4492087.getClass(), "itsNeedsActivation", false);
        setIntField(term4492087, term4492087.getClass(), "itsFunctionType", 0);
        setBooleanField(term4492087, term4492087.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term4492087, term4492087.getClass(), "encodedSourceStart", 0);
        setIntField(term4492087, term4492087.getClass(), "encodedSourceEnd", 0);
        setField(term4492087, term4492087.getClass(), "sourceName", null);
        setIntField(term4492087, term4492087.getClass(), "baseLineno", 0);
        setIntField(term4492087, term4492087.getClass(), "endLineno", 0);
        setField(term4492087, term4492087.getClass(), "functions", null);
        setField(term4492087, term4492087.getClass(), "regexps", null);
        setField(term4492087, term4492087.getClass(), "itsVariables", null);
        setField(term4492087, term4492087.getClass(), "itsConst", null);
        setField(term4492087, term4492087.getClass(), "itsVariableNames", null);
        setIntField(term4492087, term4492087.getClass(), "varStart", 0);
        setField(term4492087, term4492087.getClass(), "compilerData", null);
        setIntField(term4492087, term4492087.getClass(), "type", 43);
        setField(term4492087, term4492087.getClass(), "next", null);
        setField(term4492087, term4492087.getClass(), "first", null);
        setField(term4492087, term4492087.getClass(), "last", null);
        setField(term4492087, term4492087.getClass(), "propListHead", null);
        setIntField(term4492087, term4492087.getClass(), "sourcePosition", 0);
        setField(term4492087, term4492087.getClass(), "jsType", null);
        setField(term4492087, term4492087.getClass(), "parent", null);
        setField(term4492085, term4492085.getClass(), "next", term4492087);
        setField(term4492098, term4492098.getClass(), "str", null);
        setIntField(term4492098, term4492098.getClass(), "type", 40);
        setField(term4492100, term4492100.getClass(), "str", "");
        setIntField(term4492100, term4492100.getClass(), "type", 40);
        setField(term4492100, term4492100.getClass(), "next", null);
        setField(term4492100, term4492100.getClass(), "first", null);
        setField(term4492100, term4492100.getClass(), "last", null);
        setField(term4492100, term4492100.getClass(), "propListHead", null);
        setIntField(term4492100, term4492100.getClass(), "sourcePosition", 0);
        setField(term4492100, term4492100.getClass(), "jsType", null);
        setField(term4492100, term4492100.getClass(), "parent", null);
        setField(term4492098, term4492098.getClass(), "next", term4492100);
        setField(term4492098, term4492098.getClass(), "first", null);
        setField(term4492098, term4492098.getClass(), "last", null);
        setField(term4492098, term4492098.getClass(), "propListHead", null);
        setIntField(term4492098, term4492098.getClass(), "sourcePosition", 0);
        setField(term4492098, term4492098.getClass(), "jsType", null);
        setField(term4492098, term4492098.getClass(), "parent", null);
        setField(term4492085, term4492085.getClass(), "first", term4492098);
        setField(term4492085, term4492085.getClass(), "last", null);
        setField(term4492085, term4492085.getClass(), "propListHead", null);
        setIntField(term4492085, term4492085.getClass(), "sourcePosition", 0);
        setField(term4492085, term4492085.getClass(), "jsType", null);
        setField(term4492085, term4492085.getClass(), "parent", null);
        setField(term4492083, term4492083.getClass(), "first", term4492085);
        setField(term4492083, term4492083.getClass(), "last", null);
        setField(term4492083, term4492083.getClass(), "propListHead", null);
        setIntField(term4492083, term4492083.getClass(), "sourcePosition", 0);
        setField(term4492083, term4492083.getClass(), "jsType", null);
        setField(term4492083, term4492083.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4491636;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term4491544, args);
        assertTrue(recursiveEquals(term4491544, term4492411));
        assertTrue(recursiveEquals(term4491636, term4492412));
        assertTrue(recursiveEquals(retValue, term4492083));
    }

};


