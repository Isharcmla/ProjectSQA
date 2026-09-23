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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374558 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3522024;
     Object term3522116;
     Object term3523164;
     Object term3523165;
     Object term3522903;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374558() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3522024 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3522116 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3522208 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3522300 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3522392 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3522516 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3522208, term3522208.getClass(), "type", 35);
        setIntField(term3522392, term3522392.getClass(), "type", 40);
        setField(term3522392, term3522392.getClass(), "str", "");
        setField(term3522300, term3522300.getClass(), "next", term3522392);
        setIntField(term3522300, term3522300.getClass(), "type", 40);
        setField(term3522208, term3522208.getClass(), "first", term3522300);
        setIntField(term3522516, term3522516.getClass(), "type", 39);
        setField(term3522208, term3522208.getClass(), "next", term3522516);
        setField(term3522116, term3522116.getClass(), "first", term3522208);
        setIntField(term3522116, term3522116.getClass(), "type", 37);
        term3523164 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3523164, term3523164.getClass(), "currentTraversal", null);
        term3523165 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3523166 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3523167 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3523168 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3523169 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3523165, term3523165.getClass(), "str", null);
        setIntField(term3523165, term3523165.getClass(), "type", 37);
        setField(term3523165, term3523165.getClass(), "next", null);
        setField(term3523166, term3523166.getClass(), "str", null);
        setIntField(term3523166, term3523166.getClass(), "type", 35);
        setField(term3523167, term3523167.getClass(), "functionName", null);
        setBooleanField(term3523167, term3523167.getClass(), "itsNeedsActivation", false);
        setIntField(term3523167, term3523167.getClass(), "itsFunctionType", 0);
        setBooleanField(term3523167, term3523167.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3523167, term3523167.getClass(), "encodedSourceStart", 0);
        setIntField(term3523167, term3523167.getClass(), "encodedSourceEnd", 0);
        setField(term3523167, term3523167.getClass(), "sourceName", null);
        setIntField(term3523167, term3523167.getClass(), "baseLineno", 0);
        setIntField(term3523167, term3523167.getClass(), "endLineno", 0);
        setField(term3523167, term3523167.getClass(), "functions", null);
        setField(term3523167, term3523167.getClass(), "regexps", null);
        setField(term3523167, term3523167.getClass(), "itsVariables", null);
        setField(term3523167, term3523167.getClass(), "itsConst", null);
        setField(term3523167, term3523167.getClass(), "itsVariableNames", null);
        setIntField(term3523167, term3523167.getClass(), "varStart", 0);
        setField(term3523167, term3523167.getClass(), "compilerData", null);
        setIntField(term3523167, term3523167.getClass(), "type", 39);
        setField(term3523167, term3523167.getClass(), "next", null);
        setField(term3523167, term3523167.getClass(), "first", null);
        setField(term3523167, term3523167.getClass(), "last", null);
        setField(term3523167, term3523167.getClass(), "propListHead", null);
        setIntField(term3523167, term3523167.getClass(), "sourcePosition", 0);
        setField(term3523167, term3523167.getClass(), "jsType", null);
        setField(term3523167, term3523167.getClass(), "parent", null);
        setField(term3523166, term3523166.getClass(), "next", term3523167);
        setField(term3523168, term3523168.getClass(), "str", null);
        setIntField(term3523168, term3523168.getClass(), "type", 40);
        setField(term3523169, term3523169.getClass(), "str", "");
        setIntField(term3523169, term3523169.getClass(), "type", 40);
        setField(term3523169, term3523169.getClass(), "next", null);
        setField(term3523169, term3523169.getClass(), "first", null);
        setField(term3523169, term3523169.getClass(), "last", null);
        setField(term3523169, term3523169.getClass(), "propListHead", null);
        setIntField(term3523169, term3523169.getClass(), "sourcePosition", 0);
        setField(term3523169, term3523169.getClass(), "jsType", null);
        setField(term3523169, term3523169.getClass(), "parent", null);
        setField(term3523168, term3523168.getClass(), "next", term3523169);
        setField(term3523168, term3523168.getClass(), "first", null);
        setField(term3523168, term3523168.getClass(), "last", null);
        setField(term3523168, term3523168.getClass(), "propListHead", null);
        setIntField(term3523168, term3523168.getClass(), "sourcePosition", 0);
        setField(term3523168, term3523168.getClass(), "jsType", null);
        setField(term3523168, term3523168.getClass(), "parent", null);
        setField(term3523166, term3523166.getClass(), "first", term3523168);
        setField(term3523166, term3523166.getClass(), "last", null);
        setField(term3523166, term3523166.getClass(), "propListHead", null);
        setIntField(term3523166, term3523166.getClass(), "sourcePosition", 0);
        setField(term3523166, term3523166.getClass(), "jsType", null);
        setField(term3523166, term3523166.getClass(), "parent", null);
        setField(term3523165, term3523165.getClass(), "first", term3523166);
        setField(term3523165, term3523165.getClass(), "last", null);
        setField(term3523165, term3523165.getClass(), "propListHead", null);
        setIntField(term3523165, term3523165.getClass(), "sourcePosition", 0);
        setField(term3523165, term3523165.getClass(), "jsType", null);
        setField(term3523165, term3523165.getClass(), "parent", null);
        term3522903 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3522905 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3522907 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3522918 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3522920 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3522903, term3522903.getClass(), "str", null);
        setIntField(term3522903, term3522903.getClass(), "type", 37);
        setField(term3522903, term3522903.getClass(), "next", null);
        setField(term3522905, term3522905.getClass(), "str", null);
        setIntField(term3522905, term3522905.getClass(), "type", 35);
        setField(term3522907, term3522907.getClass(), "functionName", null);
        setBooleanField(term3522907, term3522907.getClass(), "itsNeedsActivation", false);
        setIntField(term3522907, term3522907.getClass(), "itsFunctionType", 0);
        setBooleanField(term3522907, term3522907.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3522907, term3522907.getClass(), "encodedSourceStart", 0);
        setIntField(term3522907, term3522907.getClass(), "encodedSourceEnd", 0);
        setField(term3522907, term3522907.getClass(), "sourceName", null);
        setIntField(term3522907, term3522907.getClass(), "baseLineno", 0);
        setIntField(term3522907, term3522907.getClass(), "endLineno", 0);
        setField(term3522907, term3522907.getClass(), "functions", null);
        setField(term3522907, term3522907.getClass(), "regexps", null);
        setField(term3522907, term3522907.getClass(), "itsVariables", null);
        setField(term3522907, term3522907.getClass(), "itsConst", null);
        setField(term3522907, term3522907.getClass(), "itsVariableNames", null);
        setIntField(term3522907, term3522907.getClass(), "varStart", 0);
        setField(term3522907, term3522907.getClass(), "compilerData", null);
        setIntField(term3522907, term3522907.getClass(), "type", 39);
        setField(term3522907, term3522907.getClass(), "next", null);
        setField(term3522907, term3522907.getClass(), "first", null);
        setField(term3522907, term3522907.getClass(), "last", null);
        setField(term3522907, term3522907.getClass(), "propListHead", null);
        setIntField(term3522907, term3522907.getClass(), "sourcePosition", 0);
        setField(term3522907, term3522907.getClass(), "jsType", null);
        setField(term3522907, term3522907.getClass(), "parent", null);
        setField(term3522905, term3522905.getClass(), "next", term3522907);
        setField(term3522918, term3522918.getClass(), "str", null);
        setIntField(term3522918, term3522918.getClass(), "type", 40);
        setField(term3522920, term3522920.getClass(), "str", "");
        setIntField(term3522920, term3522920.getClass(), "type", 40);
        setField(term3522920, term3522920.getClass(), "next", null);
        setField(term3522920, term3522920.getClass(), "first", null);
        setField(term3522920, term3522920.getClass(), "last", null);
        setField(term3522920, term3522920.getClass(), "propListHead", null);
        setIntField(term3522920, term3522920.getClass(), "sourcePosition", 0);
        setField(term3522920, term3522920.getClass(), "jsType", null);
        setField(term3522920, term3522920.getClass(), "parent", null);
        setField(term3522918, term3522918.getClass(), "next", term3522920);
        setField(term3522918, term3522918.getClass(), "first", null);
        setField(term3522918, term3522918.getClass(), "last", null);
        setField(term3522918, term3522918.getClass(), "propListHead", null);
        setIntField(term3522918, term3522918.getClass(), "sourcePosition", 0);
        setField(term3522918, term3522918.getClass(), "jsType", null);
        setField(term3522918, term3522918.getClass(), "parent", null);
        setField(term3522905, term3522905.getClass(), "first", term3522918);
        setField(term3522905, term3522905.getClass(), "last", null);
        setField(term3522905, term3522905.getClass(), "propListHead", null);
        setIntField(term3522905, term3522905.getClass(), "sourcePosition", 0);
        setField(term3522905, term3522905.getClass(), "jsType", null);
        setField(term3522905, term3522905.getClass(), "parent", null);
        setField(term3522903, term3522903.getClass(), "first", term3522905);
        setField(term3522903, term3522903.getClass(), "last", null);
        setField(term3522903, term3522903.getClass(), "propListHead", null);
        setIntField(term3522903, term3522903.getClass(), "sourcePosition", 0);
        setField(term3522903, term3522903.getClass(), "jsType", null);
        setField(term3522903, term3522903.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3522116;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3522024, args);
        assertTrue(recursiveEquals(term3522024, term3523164));
        assertTrue(recursiveEquals(term3522116, term3523165));
        assertTrue(recursiveEquals(retValue, term3522903));
    }

};


