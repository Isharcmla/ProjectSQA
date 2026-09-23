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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091952 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3796403;
     Object term3796489;
     Object term3797827;
     Object term3797828;
     Object term3797635;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091952() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3796403 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3796489 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3796581 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3796673 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3796765 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3796873 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3796489, term3796489.getClass(), "type", 37);
        setIntField(term3796581, term3796581.getClass(), "type", 35);
        setIntField(term3796765, term3796765.getClass(), "type", 40);
        setField(term3796765, term3796765.getClass(), "str", "charCodeAt");
        setField(term3796673, term3796673.getClass(), "next", term3796765);
        setIntField(term3796673, term3796673.getClass(), "type", 40);
        setField(term3796581, term3796581.getClass(), "first", term3796673);
        setIntField(term3796873, term3796873.getClass(), "type", 40);
        setField(term3796581, term3796581.getClass(), "next", term3796873);
        setField(term3796489, term3796489.getClass(), "first", term3796581);
        term3797827 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3797827, term3797827.getClass(), "currentTraversal", null);
        term3797828 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3797829 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3797830 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3797831 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3797832 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3797828, term3797828.getClass(), "functionName", null);
        setBooleanField(term3797828, term3797828.getClass(), "itsNeedsActivation", false);
        setIntField(term3797828, term3797828.getClass(), "itsFunctionType", 0);
        setBooleanField(term3797828, term3797828.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3797828, term3797828.getClass(), "encodedSourceStart", 0);
        setIntField(term3797828, term3797828.getClass(), "encodedSourceEnd", 0);
        setField(term3797828, term3797828.getClass(), "sourceName", null);
        setIntField(term3797828, term3797828.getClass(), "baseLineno", 0);
        setIntField(term3797828, term3797828.getClass(), "endLineno", 0);
        setField(term3797828, term3797828.getClass(), "functions", null);
        setField(term3797828, term3797828.getClass(), "regexps", null);
        setField(term3797828, term3797828.getClass(), "itsVariables", null);
        setField(term3797828, term3797828.getClass(), "itsConst", null);
        setField(term3797828, term3797828.getClass(), "itsVariableNames", null);
        setIntField(term3797828, term3797828.getClass(), "varStart", 0);
        setField(term3797828, term3797828.getClass(), "compilerData", null);
        setIntField(term3797828, term3797828.getClass(), "type", 37);
        setField(term3797828, term3797828.getClass(), "next", null);
        setField(term3797829, term3797829.getClass(), "str", null);
        setIntField(term3797829, term3797829.getClass(), "type", 35);
        setIntField(term3797830, term3797830.getClass(), "type", 40);
        setField(term3797830, term3797830.getClass(), "next", null);
        setField(term3797830, term3797830.getClass(), "first", null);
        setField(term3797830, term3797830.getClass(), "last", null);
        setField(term3797830, term3797830.getClass(), "propListHead", null);
        setIntField(term3797830, term3797830.getClass(), "sourcePosition", 0);
        setField(term3797830, term3797830.getClass(), "jsType", null);
        setField(term3797830, term3797830.getClass(), "parent", null);
        setField(term3797829, term3797829.getClass(), "next", term3797830);
        setField(term3797831, term3797831.getClass(), "str", null);
        setIntField(term3797831, term3797831.getClass(), "type", 40);
        setField(term3797832, term3797832.getClass(), "str", "");
        setIntField(term3797832, term3797832.getClass(), "type", 40);
        setField(term3797832, term3797832.getClass(), "next", null);
        setField(term3797832, term3797832.getClass(), "first", null);
        setField(term3797832, term3797832.getClass(), "last", null);
        setField(term3797832, term3797832.getClass(), "propListHead", null);
        setIntField(term3797832, term3797832.getClass(), "sourcePosition", 0);
        setField(term3797832, term3797832.getClass(), "jsType", null);
        setField(term3797832, term3797832.getClass(), "parent", null);
        setField(term3797831, term3797831.getClass(), "next", term3797832);
        setField(term3797831, term3797831.getClass(), "first", null);
        setField(term3797831, term3797831.getClass(), "last", null);
        setField(term3797831, term3797831.getClass(), "propListHead", null);
        setIntField(term3797831, term3797831.getClass(), "sourcePosition", 0);
        setField(term3797831, term3797831.getClass(), "jsType", null);
        setField(term3797831, term3797831.getClass(), "parent", null);
        setField(term3797829, term3797829.getClass(), "first", term3797831);
        setField(term3797829, term3797829.getClass(), "last", null);
        setField(term3797829, term3797829.getClass(), "propListHead", null);
        setIntField(term3797829, term3797829.getClass(), "sourcePosition", 0);
        setField(term3797829, term3797829.getClass(), "jsType", null);
        setField(term3797829, term3797829.getClass(), "parent", null);
        setField(term3797828, term3797828.getClass(), "first", term3797829);
        setField(term3797828, term3797828.getClass(), "last", null);
        setField(term3797828, term3797828.getClass(), "propListHead", null);
        setIntField(term3797828, term3797828.getClass(), "sourcePosition", 0);
        setField(term3797828, term3797828.getClass(), "jsType", null);
        setField(term3797828, term3797828.getClass(), "parent", null);
        term3797635 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3797645 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3797647 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3797650 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3797652 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3797635, term3797635.getClass(), "functionName", null);
        setBooleanField(term3797635, term3797635.getClass(), "itsNeedsActivation", false);
        setIntField(term3797635, term3797635.getClass(), "itsFunctionType", 0);
        setBooleanField(term3797635, term3797635.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3797635, term3797635.getClass(), "encodedSourceStart", 0);
        setIntField(term3797635, term3797635.getClass(), "encodedSourceEnd", 0);
        setField(term3797635, term3797635.getClass(), "sourceName", null);
        setIntField(term3797635, term3797635.getClass(), "baseLineno", 0);
        setIntField(term3797635, term3797635.getClass(), "endLineno", 0);
        setField(term3797635, term3797635.getClass(), "functions", null);
        setField(term3797635, term3797635.getClass(), "regexps", null);
        setField(term3797635, term3797635.getClass(), "itsVariables", null);
        setField(term3797635, term3797635.getClass(), "itsConst", null);
        setField(term3797635, term3797635.getClass(), "itsVariableNames", null);
        setIntField(term3797635, term3797635.getClass(), "varStart", 0);
        setField(term3797635, term3797635.getClass(), "compilerData", null);
        setIntField(term3797635, term3797635.getClass(), "type", 37);
        setField(term3797635, term3797635.getClass(), "next", null);
        setField(term3797645, term3797645.getClass(), "str", null);
        setIntField(term3797645, term3797645.getClass(), "type", 35);
        setIntField(term3797647, term3797647.getClass(), "type", 40);
        setField(term3797647, term3797647.getClass(), "next", null);
        setField(term3797647, term3797647.getClass(), "first", null);
        setField(term3797647, term3797647.getClass(), "last", null);
        setField(term3797647, term3797647.getClass(), "propListHead", null);
        setIntField(term3797647, term3797647.getClass(), "sourcePosition", 0);
        setField(term3797647, term3797647.getClass(), "jsType", null);
        setField(term3797647, term3797647.getClass(), "parent", null);
        setField(term3797645, term3797645.getClass(), "next", term3797647);
        setField(term3797650, term3797650.getClass(), "str", null);
        setIntField(term3797650, term3797650.getClass(), "type", 40);
        setField(term3797652, term3797652.getClass(), "str", "");
        setIntField(term3797652, term3797652.getClass(), "type", 40);
        setField(term3797652, term3797652.getClass(), "next", null);
        setField(term3797652, term3797652.getClass(), "first", null);
        setField(term3797652, term3797652.getClass(), "last", null);
        setField(term3797652, term3797652.getClass(), "propListHead", null);
        setIntField(term3797652, term3797652.getClass(), "sourcePosition", 0);
        setField(term3797652, term3797652.getClass(), "jsType", null);
        setField(term3797652, term3797652.getClass(), "parent", null);
        setField(term3797650, term3797650.getClass(), "next", term3797652);
        setField(term3797650, term3797650.getClass(), "first", null);
        setField(term3797650, term3797650.getClass(), "last", null);
        setField(term3797650, term3797650.getClass(), "propListHead", null);
        setIntField(term3797650, term3797650.getClass(), "sourcePosition", 0);
        setField(term3797650, term3797650.getClass(), "jsType", null);
        setField(term3797650, term3797650.getClass(), "parent", null);
        setField(term3797645, term3797645.getClass(), "first", term3797650);
        setField(term3797645, term3797645.getClass(), "last", null);
        setField(term3797645, term3797645.getClass(), "propListHead", null);
        setIntField(term3797645, term3797645.getClass(), "sourcePosition", 0);
        setField(term3797645, term3797645.getClass(), "jsType", null);
        setField(term3797645, term3797645.getClass(), "parent", null);
        setField(term3797635, term3797635.getClass(), "first", term3797645);
        setField(term3797635, term3797635.getClass(), "last", null);
        setField(term3797635, term3797635.getClass(), "propListHead", null);
        setIntField(term3797635, term3797635.getClass(), "sourcePosition", 0);
        setField(term3797635, term3797635.getClass(), "jsType", null);
        setField(term3797635, term3797635.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3796489;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3796403, args);
        assertTrue(recursiveEquals(term3796403, term3797827));
        assertTrue(recursiveEquals(term3796489, term3797828));
        assertTrue(recursiveEquals(retValue, term3797635));
    }

};


