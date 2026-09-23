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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_5916220911121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5761704;
     Object term5761790;
     Object term5767872;
     Object term5767873;
     Object term5767792;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_5916220911121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5761704 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term5761790 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term5761882 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term5761968 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term5761790, term5761790.getClass(), "type", 37);
        setIntField(term5761882, term5761882.getClass(), "type", 35);
        setField(term5761882, term5761882.getClass(), "first", term5761968);
        setField(term5761790, term5761790.getClass(), "first", term5761882);
        term5767872 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term5767872, term5767872.getClass(), "currentTraversal", null);
        term5767873 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term5767874 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term5767875 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term5767873, term5767873.getClass(), "functionName", null);
        setBooleanField(term5767873, term5767873.getClass(), "itsNeedsActivation", false);
        setIntField(term5767873, term5767873.getClass(), "itsFunctionType", 0);
        setBooleanField(term5767873, term5767873.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term5767873, term5767873.getClass(), "encodedSourceStart", 0);
        setIntField(term5767873, term5767873.getClass(), "encodedSourceEnd", 0);
        setField(term5767873, term5767873.getClass(), "sourceName", null);
        setIntField(term5767873, term5767873.getClass(), "baseLineno", 0);
        setIntField(term5767873, term5767873.getClass(), "endLineno", 0);
        setField(term5767873, term5767873.getClass(), "functions", null);
        setField(term5767873, term5767873.getClass(), "regexps", null);
        setField(term5767873, term5767873.getClass(), "itsVariables", null);
        setField(term5767873, term5767873.getClass(), "itsConst", null);
        setField(term5767873, term5767873.getClass(), "itsVariableNames", null);
        setIntField(term5767873, term5767873.getClass(), "varStart", 0);
        setField(term5767873, term5767873.getClass(), "compilerData", null);
        setIntField(term5767873, term5767873.getClass(), "type", 37);
        setField(term5767873, term5767873.getClass(), "next", null);
        setDoubleField(term5767874, term5767874.getClass(), "number", 0.0);
        setIntField(term5767874, term5767874.getClass(), "type", 35);
        setField(term5767874, term5767874.getClass(), "next", null);
        setField(term5767875, term5767875.getClass(), "functionName", null);
        setBooleanField(term5767875, term5767875.getClass(), "itsNeedsActivation", false);
        setIntField(term5767875, term5767875.getClass(), "itsFunctionType", 0);
        setBooleanField(term5767875, term5767875.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term5767875, term5767875.getClass(), "encodedSourceStart", 0);
        setIntField(term5767875, term5767875.getClass(), "encodedSourceEnd", 0);
        setField(term5767875, term5767875.getClass(), "sourceName", null);
        setIntField(term5767875, term5767875.getClass(), "baseLineno", 0);
        setIntField(term5767875, term5767875.getClass(), "endLineno", 0);
        setField(term5767875, term5767875.getClass(), "functions", null);
        setField(term5767875, term5767875.getClass(), "regexps", null);
        setField(term5767875, term5767875.getClass(), "itsVariables", null);
        setField(term5767875, term5767875.getClass(), "itsConst", null);
        setField(term5767875, term5767875.getClass(), "itsVariableNames", null);
        setIntField(term5767875, term5767875.getClass(), "varStart", 0);
        setField(term5767875, term5767875.getClass(), "compilerData", null);
        setIntField(term5767875, term5767875.getClass(), "type", 0);
        setField(term5767875, term5767875.getClass(), "next", null);
        setField(term5767875, term5767875.getClass(), "first", null);
        setField(term5767875, term5767875.getClass(), "last", null);
        setField(term5767875, term5767875.getClass(), "propListHead", null);
        setIntField(term5767875, term5767875.getClass(), "sourcePosition", 0);
        setField(term5767875, term5767875.getClass(), "jsType", null);
        setField(term5767875, term5767875.getClass(), "parent", null);
        setField(term5767874, term5767874.getClass(), "first", term5767875);
        setField(term5767874, term5767874.getClass(), "last", null);
        setField(term5767874, term5767874.getClass(), "propListHead", null);
        setIntField(term5767874, term5767874.getClass(), "sourcePosition", 0);
        setField(term5767874, term5767874.getClass(), "jsType", null);
        setField(term5767874, term5767874.getClass(), "parent", null);
        setField(term5767873, term5767873.getClass(), "first", term5767874);
        setField(term5767873, term5767873.getClass(), "last", null);
        setField(term5767873, term5767873.getClass(), "propListHead", null);
        setIntField(term5767873, term5767873.getClass(), "sourcePosition", 0);
        setField(term5767873, term5767873.getClass(), "jsType", null);
        setField(term5767873, term5767873.getClass(), "parent", null);
        term5767792 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term5767802 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term5767805 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term5767792, term5767792.getClass(), "functionName", null);
        setBooleanField(term5767792, term5767792.getClass(), "itsNeedsActivation", false);
        setIntField(term5767792, term5767792.getClass(), "itsFunctionType", 0);
        setBooleanField(term5767792, term5767792.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term5767792, term5767792.getClass(), "encodedSourceStart", 0);
        setIntField(term5767792, term5767792.getClass(), "encodedSourceEnd", 0);
        setField(term5767792, term5767792.getClass(), "sourceName", null);
        setIntField(term5767792, term5767792.getClass(), "baseLineno", 0);
        setIntField(term5767792, term5767792.getClass(), "endLineno", 0);
        setField(term5767792, term5767792.getClass(), "functions", null);
        setField(term5767792, term5767792.getClass(), "regexps", null);
        setField(term5767792, term5767792.getClass(), "itsVariables", null);
        setField(term5767792, term5767792.getClass(), "itsConst", null);
        setField(term5767792, term5767792.getClass(), "itsVariableNames", null);
        setIntField(term5767792, term5767792.getClass(), "varStart", 0);
        setField(term5767792, term5767792.getClass(), "compilerData", null);
        setIntField(term5767792, term5767792.getClass(), "type", 37);
        setField(term5767792, term5767792.getClass(), "next", null);
        setDoubleField(term5767802, term5767802.getClass(), "number", 0.0);
        setIntField(term5767802, term5767802.getClass(), "type", 35);
        setField(term5767802, term5767802.getClass(), "next", null);
        setField(term5767805, term5767805.getClass(), "functionName", null);
        setBooleanField(term5767805, term5767805.getClass(), "itsNeedsActivation", false);
        setIntField(term5767805, term5767805.getClass(), "itsFunctionType", 0);
        setBooleanField(term5767805, term5767805.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term5767805, term5767805.getClass(), "encodedSourceStart", 0);
        setIntField(term5767805, term5767805.getClass(), "encodedSourceEnd", 0);
        setField(term5767805, term5767805.getClass(), "sourceName", null);
        setIntField(term5767805, term5767805.getClass(), "baseLineno", 0);
        setIntField(term5767805, term5767805.getClass(), "endLineno", 0);
        setField(term5767805, term5767805.getClass(), "functions", null);
        setField(term5767805, term5767805.getClass(), "regexps", null);
        setField(term5767805, term5767805.getClass(), "itsVariables", null);
        setField(term5767805, term5767805.getClass(), "itsConst", null);
        setField(term5767805, term5767805.getClass(), "itsVariableNames", null);
        setIntField(term5767805, term5767805.getClass(), "varStart", 0);
        setField(term5767805, term5767805.getClass(), "compilerData", null);
        setIntField(term5767805, term5767805.getClass(), "type", 0);
        setField(term5767805, term5767805.getClass(), "next", null);
        setField(term5767805, term5767805.getClass(), "first", null);
        setField(term5767805, term5767805.getClass(), "last", null);
        setField(term5767805, term5767805.getClass(), "propListHead", null);
        setIntField(term5767805, term5767805.getClass(), "sourcePosition", 0);
        setField(term5767805, term5767805.getClass(), "jsType", null);
        setField(term5767805, term5767805.getClass(), "parent", null);
        setField(term5767802, term5767802.getClass(), "first", term5767805);
        setField(term5767802, term5767802.getClass(), "last", null);
        setField(term5767802, term5767802.getClass(), "propListHead", null);
        setIntField(term5767802, term5767802.getClass(), "sourcePosition", 0);
        setField(term5767802, term5767802.getClass(), "jsType", null);
        setField(term5767802, term5767802.getClass(), "parent", null);
        setField(term5767792, term5767792.getClass(), "first", term5767802);
        setField(term5767792, term5767792.getClass(), "last", null);
        setField(term5767792, term5767792.getClass(), "propListHead", null);
        setIntField(term5767792, term5767792.getClass(), "sourcePosition", 0);
        setField(term5767792, term5767792.getClass(), "jsType", null);
        setField(term5767792, term5767792.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term5761790;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term5761704, args);
        assertTrue(recursiveEquals(term5761704, term5767872));
        assertTrue(recursiveEquals(term5761790, term5767873));
        assertTrue(recursiveEquals(retValue, term5767792));
    }

};


