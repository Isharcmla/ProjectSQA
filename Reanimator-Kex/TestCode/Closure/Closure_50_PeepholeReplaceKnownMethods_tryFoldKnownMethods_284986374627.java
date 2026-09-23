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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374627 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3563318;
     Object term3563410;
     Object term3565097;
     Object term3565098;
     Object term3564730;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374627() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3563318 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3563410 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3563502 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3563594 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3563686 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3563810 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3563502, term3563502.getClass(), "type", 35);
        setIntField(term3563686, term3563686.getClass(), "type", 40);
        setField(term3563686, term3563686.getClass(), "str", "charCodeAt");
        setField(term3563594, term3563594.getClass(), "next", term3563686);
        setIntField(term3563594, term3563594.getClass(), "type", 40);
        setField(term3563502, term3563502.getClass(), "first", term3563594);
        setIntField(term3563810, term3563810.getClass(), "type", 41);
        setField(term3563502, term3563502.getClass(), "next", term3563810);
        setField(term3563410, term3563410.getClass(), "first", term3563502);
        setIntField(term3563410, term3563410.getClass(), "type", 37);
        term3565097 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3565097, term3565097.getClass(), "currentTraversal", null);
        term3565098 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3565099 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3565100 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3565101 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3565102 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3565098, term3565098.getClass(), "str", null);
        setIntField(term3565098, term3565098.getClass(), "type", 37);
        setField(term3565098, term3565098.getClass(), "next", null);
        setField(term3565099, term3565099.getClass(), "str", null);
        setIntField(term3565099, term3565099.getClass(), "type", 35);
        setField(term3565100, term3565100.getClass(), "functionName", null);
        setBooleanField(term3565100, term3565100.getClass(), "itsNeedsActivation", false);
        setIntField(term3565100, term3565100.getClass(), "itsFunctionType", 0);
        setBooleanField(term3565100, term3565100.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3565100, term3565100.getClass(), "encodedSourceStart", 0);
        setIntField(term3565100, term3565100.getClass(), "encodedSourceEnd", 0);
        setField(term3565100, term3565100.getClass(), "sourceName", null);
        setIntField(term3565100, term3565100.getClass(), "baseLineno", 0);
        setIntField(term3565100, term3565100.getClass(), "endLineno", 0);
        setField(term3565100, term3565100.getClass(), "functions", null);
        setField(term3565100, term3565100.getClass(), "regexps", null);
        setField(term3565100, term3565100.getClass(), "itsVariables", null);
        setField(term3565100, term3565100.getClass(), "itsConst", null);
        setField(term3565100, term3565100.getClass(), "itsVariableNames", null);
        setIntField(term3565100, term3565100.getClass(), "varStart", 0);
        setField(term3565100, term3565100.getClass(), "compilerData", null);
        setIntField(term3565100, term3565100.getClass(), "type", 41);
        setField(term3565100, term3565100.getClass(), "next", null);
        setField(term3565100, term3565100.getClass(), "first", null);
        setField(term3565100, term3565100.getClass(), "last", null);
        setField(term3565100, term3565100.getClass(), "propListHead", null);
        setIntField(term3565100, term3565100.getClass(), "sourcePosition", 0);
        setField(term3565100, term3565100.getClass(), "jsType", null);
        setField(term3565100, term3565100.getClass(), "parent", null);
        setField(term3565099, term3565099.getClass(), "next", term3565100);
        setField(term3565101, term3565101.getClass(), "str", null);
        setIntField(term3565101, term3565101.getClass(), "type", 40);
        setField(term3565102, term3565102.getClass(), "str", "");
        setIntField(term3565102, term3565102.getClass(), "type", 40);
        setField(term3565102, term3565102.getClass(), "next", null);
        setField(term3565102, term3565102.getClass(), "first", null);
        setField(term3565102, term3565102.getClass(), "last", null);
        setField(term3565102, term3565102.getClass(), "propListHead", null);
        setIntField(term3565102, term3565102.getClass(), "sourcePosition", 0);
        setField(term3565102, term3565102.getClass(), "jsType", null);
        setField(term3565102, term3565102.getClass(), "parent", null);
        setField(term3565101, term3565101.getClass(), "next", term3565102);
        setField(term3565101, term3565101.getClass(), "first", null);
        setField(term3565101, term3565101.getClass(), "last", null);
        setField(term3565101, term3565101.getClass(), "propListHead", null);
        setIntField(term3565101, term3565101.getClass(), "sourcePosition", 0);
        setField(term3565101, term3565101.getClass(), "jsType", null);
        setField(term3565101, term3565101.getClass(), "parent", null);
        setField(term3565099, term3565099.getClass(), "first", term3565101);
        setField(term3565099, term3565099.getClass(), "last", null);
        setField(term3565099, term3565099.getClass(), "propListHead", null);
        setIntField(term3565099, term3565099.getClass(), "sourcePosition", 0);
        setField(term3565099, term3565099.getClass(), "jsType", null);
        setField(term3565099, term3565099.getClass(), "parent", null);
        setField(term3565098, term3565098.getClass(), "first", term3565099);
        setField(term3565098, term3565098.getClass(), "last", null);
        setField(term3565098, term3565098.getClass(), "propListHead", null);
        setIntField(term3565098, term3565098.getClass(), "sourcePosition", 0);
        setField(term3565098, term3565098.getClass(), "jsType", null);
        setField(term3565098, term3565098.getClass(), "parent", null);
        term3564730 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3564732 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3564734 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3564745 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3564747 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3564730, term3564730.getClass(), "str", null);
        setIntField(term3564730, term3564730.getClass(), "type", 37);
        setField(term3564730, term3564730.getClass(), "next", null);
        setField(term3564732, term3564732.getClass(), "str", null);
        setIntField(term3564732, term3564732.getClass(), "type", 35);
        setField(term3564734, term3564734.getClass(), "functionName", null);
        setBooleanField(term3564734, term3564734.getClass(), "itsNeedsActivation", false);
        setIntField(term3564734, term3564734.getClass(), "itsFunctionType", 0);
        setBooleanField(term3564734, term3564734.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3564734, term3564734.getClass(), "encodedSourceStart", 0);
        setIntField(term3564734, term3564734.getClass(), "encodedSourceEnd", 0);
        setField(term3564734, term3564734.getClass(), "sourceName", null);
        setIntField(term3564734, term3564734.getClass(), "baseLineno", 0);
        setIntField(term3564734, term3564734.getClass(), "endLineno", 0);
        setField(term3564734, term3564734.getClass(), "functions", null);
        setField(term3564734, term3564734.getClass(), "regexps", null);
        setField(term3564734, term3564734.getClass(), "itsVariables", null);
        setField(term3564734, term3564734.getClass(), "itsConst", null);
        setField(term3564734, term3564734.getClass(), "itsVariableNames", null);
        setIntField(term3564734, term3564734.getClass(), "varStart", 0);
        setField(term3564734, term3564734.getClass(), "compilerData", null);
        setIntField(term3564734, term3564734.getClass(), "type", 41);
        setField(term3564734, term3564734.getClass(), "next", null);
        setField(term3564734, term3564734.getClass(), "first", null);
        setField(term3564734, term3564734.getClass(), "last", null);
        setField(term3564734, term3564734.getClass(), "propListHead", null);
        setIntField(term3564734, term3564734.getClass(), "sourcePosition", 0);
        setField(term3564734, term3564734.getClass(), "jsType", null);
        setField(term3564734, term3564734.getClass(), "parent", null);
        setField(term3564732, term3564732.getClass(), "next", term3564734);
        setField(term3564745, term3564745.getClass(), "str", null);
        setIntField(term3564745, term3564745.getClass(), "type", 40);
        setField(term3564747, term3564747.getClass(), "str", "");
        setIntField(term3564747, term3564747.getClass(), "type", 40);
        setField(term3564747, term3564747.getClass(), "next", null);
        setField(term3564747, term3564747.getClass(), "first", null);
        setField(term3564747, term3564747.getClass(), "last", null);
        setField(term3564747, term3564747.getClass(), "propListHead", null);
        setIntField(term3564747, term3564747.getClass(), "sourcePosition", 0);
        setField(term3564747, term3564747.getClass(), "jsType", null);
        setField(term3564747, term3564747.getClass(), "parent", null);
        setField(term3564745, term3564745.getClass(), "next", term3564747);
        setField(term3564745, term3564745.getClass(), "first", null);
        setField(term3564745, term3564745.getClass(), "last", null);
        setField(term3564745, term3564745.getClass(), "propListHead", null);
        setIntField(term3564745, term3564745.getClass(), "sourcePosition", 0);
        setField(term3564745, term3564745.getClass(), "jsType", null);
        setField(term3564745, term3564745.getClass(), "parent", null);
        setField(term3564732, term3564732.getClass(), "first", term3564745);
        setField(term3564732, term3564732.getClass(), "last", null);
        setField(term3564732, term3564732.getClass(), "propListHead", null);
        setIntField(term3564732, term3564732.getClass(), "sourcePosition", 0);
        setField(term3564732, term3564732.getClass(), "jsType", null);
        setField(term3564732, term3564732.getClass(), "parent", null);
        setField(term3564730, term3564730.getClass(), "first", term3564732);
        setField(term3564730, term3564730.getClass(), "last", null);
        setField(term3564730, term3564730.getClass(), "propListHead", null);
        setIntField(term3564730, term3564730.getClass(), "sourcePosition", 0);
        setField(term3564730, term3564730.getClass(), "jsType", null);
        setField(term3564730, term3564730.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3563410;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3563318, args);
        assertTrue(recursiveEquals(term3563318, term3565097));
        assertTrue(recursiveEquals(term3563410, term3565098));
        assertTrue(recursiveEquals(retValue, term3564730));
    }

};


