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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091886 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3741116;
     Object term3741202;
     Object term3741809;
     Object term3741810;
     Object term3741694;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091886() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3741116 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3741202 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3741294 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3741386 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3741478 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3741608 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3741202, term3741202.getClass(), "type", 37);
        setIntField(term3741294, term3741294.getClass(), "type", 35);
        setIntField(term3741478, term3741478.getClass(), "type", 40);
        setField(term3741478, term3741478.getClass(), "str", " ");
        setField(term3741386, term3741386.getClass(), "next", term3741478);
        setIntField(term3741386, term3741386.getClass(), "type", 40);
        setField(term3741294, term3741294.getClass(), "first", term3741386);
        setIntField(term3741608, term3741608.getClass(), "type", 39);
        setField(term3741294, term3741294.getClass(), "next", term3741608);
        setField(term3741202, term3741202.getClass(), "first", term3741294);
        term3741809 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3741809, term3741809.getClass(), "currentTraversal", null);
        term3741810 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3741811 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3741812 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3741813 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3741814 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3741810, term3741810.getClass(), "functionName", null);
        setBooleanField(term3741810, term3741810.getClass(), "itsNeedsActivation", false);
        setIntField(term3741810, term3741810.getClass(), "itsFunctionType", 0);
        setBooleanField(term3741810, term3741810.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3741810, term3741810.getClass(), "encodedSourceStart", 0);
        setIntField(term3741810, term3741810.getClass(), "encodedSourceEnd", 0);
        setField(term3741810, term3741810.getClass(), "sourceName", null);
        setIntField(term3741810, term3741810.getClass(), "baseLineno", 0);
        setIntField(term3741810, term3741810.getClass(), "endLineno", 0);
        setField(term3741810, term3741810.getClass(), "functions", null);
        setField(term3741810, term3741810.getClass(), "regexps", null);
        setField(term3741810, term3741810.getClass(), "itsVariables", null);
        setField(term3741810, term3741810.getClass(), "itsConst", null);
        setField(term3741810, term3741810.getClass(), "itsVariableNames", null);
        setIntField(term3741810, term3741810.getClass(), "varStart", 0);
        setField(term3741810, term3741810.getClass(), "compilerData", null);
        setIntField(term3741810, term3741810.getClass(), "type", 37);
        setField(term3741810, term3741810.getClass(), "next", null);
        setField(term3741811, term3741811.getClass(), "str", null);
        setIntField(term3741811, term3741811.getClass(), "type", 35);
        setField(term3741812, term3741812.getClass(), "str", null);
        setIntField(term3741812, term3741812.getClass(), "type", 39);
        setField(term3741812, term3741812.getClass(), "next", null);
        setField(term3741812, term3741812.getClass(), "first", null);
        setField(term3741812, term3741812.getClass(), "last", null);
        setField(term3741812, term3741812.getClass(), "propListHead", null);
        setIntField(term3741812, term3741812.getClass(), "sourcePosition", 0);
        setField(term3741812, term3741812.getClass(), "jsType", null);
        setField(term3741812, term3741812.getClass(), "parent", null);
        setField(term3741811, term3741811.getClass(), "next", term3741812);
        setField(term3741813, term3741813.getClass(), "str", null);
        setIntField(term3741813, term3741813.getClass(), "type", 40);
        setField(term3741814, term3741814.getClass(), "str", "");
        setIntField(term3741814, term3741814.getClass(), "type", 40);
        setField(term3741814, term3741814.getClass(), "next", null);
        setField(term3741814, term3741814.getClass(), "first", null);
        setField(term3741814, term3741814.getClass(), "last", null);
        setField(term3741814, term3741814.getClass(), "propListHead", null);
        setIntField(term3741814, term3741814.getClass(), "sourcePosition", 0);
        setField(term3741814, term3741814.getClass(), "jsType", null);
        setField(term3741814, term3741814.getClass(), "parent", null);
        setField(term3741813, term3741813.getClass(), "next", term3741814);
        setField(term3741813, term3741813.getClass(), "first", null);
        setField(term3741813, term3741813.getClass(), "last", null);
        setField(term3741813, term3741813.getClass(), "propListHead", null);
        setIntField(term3741813, term3741813.getClass(), "sourcePosition", 0);
        setField(term3741813, term3741813.getClass(), "jsType", null);
        setField(term3741813, term3741813.getClass(), "parent", null);
        setField(term3741811, term3741811.getClass(), "first", term3741813);
        setField(term3741811, term3741811.getClass(), "last", null);
        setField(term3741811, term3741811.getClass(), "propListHead", null);
        setIntField(term3741811, term3741811.getClass(), "sourcePosition", 0);
        setField(term3741811, term3741811.getClass(), "jsType", null);
        setField(term3741811, term3741811.getClass(), "parent", null);
        setField(term3741810, term3741810.getClass(), "first", term3741811);
        setField(term3741810, term3741810.getClass(), "last", null);
        setField(term3741810, term3741810.getClass(), "propListHead", null);
        setIntField(term3741810, term3741810.getClass(), "sourcePosition", 0);
        setField(term3741810, term3741810.getClass(), "jsType", null);
        setField(term3741810, term3741810.getClass(), "parent", null);
        term3741694 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3741704 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3741706 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3741709 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3741711 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3741694, term3741694.getClass(), "functionName", null);
        setBooleanField(term3741694, term3741694.getClass(), "itsNeedsActivation", false);
        setIntField(term3741694, term3741694.getClass(), "itsFunctionType", 0);
        setBooleanField(term3741694, term3741694.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3741694, term3741694.getClass(), "encodedSourceStart", 0);
        setIntField(term3741694, term3741694.getClass(), "encodedSourceEnd", 0);
        setField(term3741694, term3741694.getClass(), "sourceName", null);
        setIntField(term3741694, term3741694.getClass(), "baseLineno", 0);
        setIntField(term3741694, term3741694.getClass(), "endLineno", 0);
        setField(term3741694, term3741694.getClass(), "functions", null);
        setField(term3741694, term3741694.getClass(), "regexps", null);
        setField(term3741694, term3741694.getClass(), "itsVariables", null);
        setField(term3741694, term3741694.getClass(), "itsConst", null);
        setField(term3741694, term3741694.getClass(), "itsVariableNames", null);
        setIntField(term3741694, term3741694.getClass(), "varStart", 0);
        setField(term3741694, term3741694.getClass(), "compilerData", null);
        setIntField(term3741694, term3741694.getClass(), "type", 37);
        setField(term3741694, term3741694.getClass(), "next", null);
        setField(term3741704, term3741704.getClass(), "str", null);
        setIntField(term3741704, term3741704.getClass(), "type", 35);
        setField(term3741706, term3741706.getClass(), "str", null);
        setIntField(term3741706, term3741706.getClass(), "type", 39);
        setField(term3741706, term3741706.getClass(), "next", null);
        setField(term3741706, term3741706.getClass(), "first", null);
        setField(term3741706, term3741706.getClass(), "last", null);
        setField(term3741706, term3741706.getClass(), "propListHead", null);
        setIntField(term3741706, term3741706.getClass(), "sourcePosition", 0);
        setField(term3741706, term3741706.getClass(), "jsType", null);
        setField(term3741706, term3741706.getClass(), "parent", null);
        setField(term3741704, term3741704.getClass(), "next", term3741706);
        setField(term3741709, term3741709.getClass(), "str", null);
        setIntField(term3741709, term3741709.getClass(), "type", 40);
        setField(term3741711, term3741711.getClass(), "str", "");
        setIntField(term3741711, term3741711.getClass(), "type", 40);
        setField(term3741711, term3741711.getClass(), "next", null);
        setField(term3741711, term3741711.getClass(), "first", null);
        setField(term3741711, term3741711.getClass(), "last", null);
        setField(term3741711, term3741711.getClass(), "propListHead", null);
        setIntField(term3741711, term3741711.getClass(), "sourcePosition", 0);
        setField(term3741711, term3741711.getClass(), "jsType", null);
        setField(term3741711, term3741711.getClass(), "parent", null);
        setField(term3741709, term3741709.getClass(), "next", term3741711);
        setField(term3741709, term3741709.getClass(), "first", null);
        setField(term3741709, term3741709.getClass(), "last", null);
        setField(term3741709, term3741709.getClass(), "propListHead", null);
        setIntField(term3741709, term3741709.getClass(), "sourcePosition", 0);
        setField(term3741709, term3741709.getClass(), "jsType", null);
        setField(term3741709, term3741709.getClass(), "parent", null);
        setField(term3741704, term3741704.getClass(), "first", term3741709);
        setField(term3741704, term3741704.getClass(), "last", null);
        setField(term3741704, term3741704.getClass(), "propListHead", null);
        setIntField(term3741704, term3741704.getClass(), "sourcePosition", 0);
        setField(term3741704, term3741704.getClass(), "jsType", null);
        setField(term3741704, term3741704.getClass(), "parent", null);
        setField(term3741694, term3741694.getClass(), "first", term3741704);
        setField(term3741694, term3741694.getClass(), "last", null);
        setField(term3741694, term3741694.getClass(), "propListHead", null);
        setIntField(term3741694, term3741694.getClass(), "sourcePosition", 0);
        setField(term3741694, term3741694.getClass(), "jsType", null);
        setField(term3741694, term3741694.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3741202;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3741116, args);
        assertTrue(recursiveEquals(term3741116, term3741809));
        assertTrue(recursiveEquals(term3741202, term3741810));
        assertTrue(recursiveEquals(retValue, term3741694));
    }

};


