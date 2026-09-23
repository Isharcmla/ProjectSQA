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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374946 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3792921;
     Object term3793013;
     Object term3793823;
     Object term3793824;
     Object term3793456;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374946() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3792921 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3793013 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3793105 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3793197 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3793289 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3793413 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3793105, term3793105.getClass(), "type", 35);
        setIntField(term3793289, term3793289.getClass(), "type", 40);
        setField(term3793289, term3793289.getClass(), "str", "charCodeAt");
        setField(term3793197, term3793197.getClass(), "next", term3793289);
        setIntField(term3793197, term3793197.getClass(), "type", 40);
        setField(term3793105, term3793105.getClass(), "first", term3793197);
        setIntField(term3793413, term3793413.getClass(), "type", 43);
        setField(term3793105, term3793105.getClass(), "next", term3793413);
        setField(term3793013, term3793013.getClass(), "first", term3793105);
        setIntField(term3793013, term3793013.getClass(), "type", 37);
        term3793823 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3793823, term3793823.getClass(), "currentTraversal", null);
        term3793824 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3793825 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3793826 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3793827 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3793828 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3793824, term3793824.getClass(), "str", null);
        setIntField(term3793824, term3793824.getClass(), "type", 37);
        setField(term3793824, term3793824.getClass(), "next", null);
        setField(term3793825, term3793825.getClass(), "str", null);
        setIntField(term3793825, term3793825.getClass(), "type", 35);
        setField(term3793826, term3793826.getClass(), "functionName", null);
        setBooleanField(term3793826, term3793826.getClass(), "itsNeedsActivation", false);
        setIntField(term3793826, term3793826.getClass(), "itsFunctionType", 0);
        setBooleanField(term3793826, term3793826.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3793826, term3793826.getClass(), "encodedSourceStart", 0);
        setIntField(term3793826, term3793826.getClass(), "encodedSourceEnd", 0);
        setField(term3793826, term3793826.getClass(), "sourceName", null);
        setIntField(term3793826, term3793826.getClass(), "baseLineno", 0);
        setIntField(term3793826, term3793826.getClass(), "endLineno", 0);
        setField(term3793826, term3793826.getClass(), "functions", null);
        setField(term3793826, term3793826.getClass(), "regexps", null);
        setField(term3793826, term3793826.getClass(), "itsVariables", null);
        setField(term3793826, term3793826.getClass(), "itsConst", null);
        setField(term3793826, term3793826.getClass(), "itsVariableNames", null);
        setIntField(term3793826, term3793826.getClass(), "varStart", 0);
        setField(term3793826, term3793826.getClass(), "compilerData", null);
        setIntField(term3793826, term3793826.getClass(), "type", 43);
        setField(term3793826, term3793826.getClass(), "next", null);
        setField(term3793826, term3793826.getClass(), "first", null);
        setField(term3793826, term3793826.getClass(), "last", null);
        setField(term3793826, term3793826.getClass(), "propListHead", null);
        setIntField(term3793826, term3793826.getClass(), "sourcePosition", 0);
        setField(term3793826, term3793826.getClass(), "jsType", null);
        setField(term3793826, term3793826.getClass(), "parent", null);
        setField(term3793825, term3793825.getClass(), "next", term3793826);
        setField(term3793827, term3793827.getClass(), "str", null);
        setIntField(term3793827, term3793827.getClass(), "type", 40);
        setField(term3793828, term3793828.getClass(), "str", "");
        setIntField(term3793828, term3793828.getClass(), "type", 40);
        setField(term3793828, term3793828.getClass(), "next", null);
        setField(term3793828, term3793828.getClass(), "first", null);
        setField(term3793828, term3793828.getClass(), "last", null);
        setField(term3793828, term3793828.getClass(), "propListHead", null);
        setIntField(term3793828, term3793828.getClass(), "sourcePosition", 0);
        setField(term3793828, term3793828.getClass(), "jsType", null);
        setField(term3793828, term3793828.getClass(), "parent", null);
        setField(term3793827, term3793827.getClass(), "next", term3793828);
        setField(term3793827, term3793827.getClass(), "first", null);
        setField(term3793827, term3793827.getClass(), "last", null);
        setField(term3793827, term3793827.getClass(), "propListHead", null);
        setIntField(term3793827, term3793827.getClass(), "sourcePosition", 0);
        setField(term3793827, term3793827.getClass(), "jsType", null);
        setField(term3793827, term3793827.getClass(), "parent", null);
        setField(term3793825, term3793825.getClass(), "first", term3793827);
        setField(term3793825, term3793825.getClass(), "last", null);
        setField(term3793825, term3793825.getClass(), "propListHead", null);
        setIntField(term3793825, term3793825.getClass(), "sourcePosition", 0);
        setField(term3793825, term3793825.getClass(), "jsType", null);
        setField(term3793825, term3793825.getClass(), "parent", null);
        setField(term3793824, term3793824.getClass(), "first", term3793825);
        setField(term3793824, term3793824.getClass(), "last", null);
        setField(term3793824, term3793824.getClass(), "propListHead", null);
        setIntField(term3793824, term3793824.getClass(), "sourcePosition", 0);
        setField(term3793824, term3793824.getClass(), "jsType", null);
        setField(term3793824, term3793824.getClass(), "parent", null);
        term3793456 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3793458 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3793460 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3793471 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3793473 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3793456, term3793456.getClass(), "str", null);
        setIntField(term3793456, term3793456.getClass(), "type", 37);
        setField(term3793456, term3793456.getClass(), "next", null);
        setField(term3793458, term3793458.getClass(), "str", null);
        setIntField(term3793458, term3793458.getClass(), "type", 35);
        setField(term3793460, term3793460.getClass(), "functionName", null);
        setBooleanField(term3793460, term3793460.getClass(), "itsNeedsActivation", false);
        setIntField(term3793460, term3793460.getClass(), "itsFunctionType", 0);
        setBooleanField(term3793460, term3793460.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3793460, term3793460.getClass(), "encodedSourceStart", 0);
        setIntField(term3793460, term3793460.getClass(), "encodedSourceEnd", 0);
        setField(term3793460, term3793460.getClass(), "sourceName", null);
        setIntField(term3793460, term3793460.getClass(), "baseLineno", 0);
        setIntField(term3793460, term3793460.getClass(), "endLineno", 0);
        setField(term3793460, term3793460.getClass(), "functions", null);
        setField(term3793460, term3793460.getClass(), "regexps", null);
        setField(term3793460, term3793460.getClass(), "itsVariables", null);
        setField(term3793460, term3793460.getClass(), "itsConst", null);
        setField(term3793460, term3793460.getClass(), "itsVariableNames", null);
        setIntField(term3793460, term3793460.getClass(), "varStart", 0);
        setField(term3793460, term3793460.getClass(), "compilerData", null);
        setIntField(term3793460, term3793460.getClass(), "type", 43);
        setField(term3793460, term3793460.getClass(), "next", null);
        setField(term3793460, term3793460.getClass(), "first", null);
        setField(term3793460, term3793460.getClass(), "last", null);
        setField(term3793460, term3793460.getClass(), "propListHead", null);
        setIntField(term3793460, term3793460.getClass(), "sourcePosition", 0);
        setField(term3793460, term3793460.getClass(), "jsType", null);
        setField(term3793460, term3793460.getClass(), "parent", null);
        setField(term3793458, term3793458.getClass(), "next", term3793460);
        setField(term3793471, term3793471.getClass(), "str", null);
        setIntField(term3793471, term3793471.getClass(), "type", 40);
        setField(term3793473, term3793473.getClass(), "str", "");
        setIntField(term3793473, term3793473.getClass(), "type", 40);
        setField(term3793473, term3793473.getClass(), "next", null);
        setField(term3793473, term3793473.getClass(), "first", null);
        setField(term3793473, term3793473.getClass(), "last", null);
        setField(term3793473, term3793473.getClass(), "propListHead", null);
        setIntField(term3793473, term3793473.getClass(), "sourcePosition", 0);
        setField(term3793473, term3793473.getClass(), "jsType", null);
        setField(term3793473, term3793473.getClass(), "parent", null);
        setField(term3793471, term3793471.getClass(), "next", term3793473);
        setField(term3793471, term3793471.getClass(), "first", null);
        setField(term3793471, term3793471.getClass(), "last", null);
        setField(term3793471, term3793471.getClass(), "propListHead", null);
        setIntField(term3793471, term3793471.getClass(), "sourcePosition", 0);
        setField(term3793471, term3793471.getClass(), "jsType", null);
        setField(term3793471, term3793471.getClass(), "parent", null);
        setField(term3793458, term3793458.getClass(), "first", term3793471);
        setField(term3793458, term3793458.getClass(), "last", null);
        setField(term3793458, term3793458.getClass(), "propListHead", null);
        setIntField(term3793458, term3793458.getClass(), "sourcePosition", 0);
        setField(term3793458, term3793458.getClass(), "jsType", null);
        setField(term3793458, term3793458.getClass(), "parent", null);
        setField(term3793456, term3793456.getClass(), "first", term3793458);
        setField(term3793456, term3793456.getClass(), "last", null);
        setField(term3793456, term3793456.getClass(), "propListHead", null);
        setIntField(term3793456, term3793456.getClass(), "sourcePosition", 0);
        setField(term3793456, term3793456.getClass(), "jsType", null);
        setField(term3793456, term3793456.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3793013;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3792921, args);
        assertTrue(recursiveEquals(term3792921, term3793823));
        assertTrue(recursiveEquals(term3793013, term3793824));
        assertTrue(recursiveEquals(retValue, term3793456));
    }

};


