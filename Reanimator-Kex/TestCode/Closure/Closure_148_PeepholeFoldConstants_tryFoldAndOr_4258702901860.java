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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901860 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term490290;
     Object term490376;
     Object term490560;
     Object term490652;
     Object term490736;
     Object term490737;
     Object term490739;
     Object term490740;
     Object term490657;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901860() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term490290 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term490376 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term490468 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term490468, term490468.getClass(), "type", 108);
        setField(term490376, term490376.getClass(), "parent", term490468);
        setIntField(term490376, term490376.getClass(), "type", 100);
        term490560 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term490560, term490560.getClass(), "type", 57);
        term490652 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term490652, term490652.getClass(), "type", 44);
        term490736 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term490736, term490736.getClass(), "currentTraversal", null);
        term490737 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term490738 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term490737, term490737.getClass(), "functionName", null);
        setBooleanField(term490737, term490737.getClass(), "itsNeedsActivation", false);
        setIntField(term490737, term490737.getClass(), "itsFunctionType", 0);
        setBooleanField(term490737, term490737.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term490737, term490737.getClass(), "encodedSourceStart", 0);
        setIntField(term490737, term490737.getClass(), "encodedSourceEnd", 0);
        setField(term490737, term490737.getClass(), "sourceName", null);
        setIntField(term490737, term490737.getClass(), "baseLineno", 0);
        setIntField(term490737, term490737.getClass(), "endLineno", 0);
        setField(term490737, term490737.getClass(), "functions", null);
        setField(term490737, term490737.getClass(), "regexps", null);
        setField(term490737, term490737.getClass(), "itsVariables", null);
        setField(term490737, term490737.getClass(), "itsConst", null);
        setField(term490737, term490737.getClass(), "itsVariableNames", null);
        setIntField(term490737, term490737.getClass(), "varStart", 0);
        setField(term490737, term490737.getClass(), "compilerData", null);
        setIntField(term490737, term490737.getClass(), "type", 100);
        setField(term490737, term490737.getClass(), "next", null);
        setField(term490737, term490737.getClass(), "first", null);
        setField(term490737, term490737.getClass(), "last", null);
        setField(term490737, term490737.getClass(), "propListHead", null);
        setIntField(term490737, term490737.getClass(), "sourcePosition", 0);
        setField(term490737, term490737.getClass(), "jsType", null);
        setDoubleField(term490738, term490738.getClass(), "number", 0.0);
        setIntField(term490738, term490738.getClass(), "type", 108);
        setField(term490738, term490738.getClass(), "next", null);
        setField(term490738, term490738.getClass(), "first", null);
        setField(term490738, term490738.getClass(), "last", null);
        setField(term490738, term490738.getClass(), "propListHead", null);
        setIntField(term490738, term490738.getClass(), "sourcePosition", 0);
        setField(term490738, term490738.getClass(), "jsType", null);
        setField(term490738, term490738.getClass(), "parent", null);
        setField(term490737, term490737.getClass(), "parent", term490738);
        term490739 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term490739, term490739.getClass(), "number", 0.0);
        setIntField(term490739, term490739.getClass(), "type", 57);
        setField(term490739, term490739.getClass(), "next", null);
        setField(term490739, term490739.getClass(), "first", null);
        setField(term490739, term490739.getClass(), "last", null);
        setField(term490739, term490739.getClass(), "propListHead", null);
        setIntField(term490739, term490739.getClass(), "sourcePosition", 0);
        setField(term490739, term490739.getClass(), "jsType", null);
        setField(term490739, term490739.getClass(), "parent", null);
        term490740 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term490740, term490740.getClass(), "str", null);
        setIntField(term490740, term490740.getClass(), "type", 44);
        setField(term490740, term490740.getClass(), "next", null);
        setField(term490740, term490740.getClass(), "first", null);
        setField(term490740, term490740.getClass(), "last", null);
        setField(term490740, term490740.getClass(), "propListHead", null);
        setIntField(term490740, term490740.getClass(), "sourcePosition", 0);
        setField(term490740, term490740.getClass(), "jsType", null);
        setField(term490740, term490740.getClass(), "parent", null);
        term490657 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term490668 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term490657, term490657.getClass(), "functionName", null);
        setBooleanField(term490657, term490657.getClass(), "itsNeedsActivation", false);
        setIntField(term490657, term490657.getClass(), "itsFunctionType", 0);
        setBooleanField(term490657, term490657.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term490657, term490657.getClass(), "encodedSourceStart", 0);
        setIntField(term490657, term490657.getClass(), "encodedSourceEnd", 0);
        setField(term490657, term490657.getClass(), "sourceName", null);
        setIntField(term490657, term490657.getClass(), "baseLineno", 0);
        setIntField(term490657, term490657.getClass(), "endLineno", 0);
        setField(term490657, term490657.getClass(), "functions", null);
        setField(term490657, term490657.getClass(), "regexps", null);
        setField(term490657, term490657.getClass(), "itsVariables", null);
        setField(term490657, term490657.getClass(), "itsConst", null);
        setField(term490657, term490657.getClass(), "itsVariableNames", null);
        setIntField(term490657, term490657.getClass(), "varStart", 0);
        setField(term490657, term490657.getClass(), "compilerData", null);
        setIntField(term490657, term490657.getClass(), "type", 100);
        setField(term490657, term490657.getClass(), "next", null);
        setField(term490657, term490657.getClass(), "first", null);
        setField(term490657, term490657.getClass(), "last", null);
        setField(term490657, term490657.getClass(), "propListHead", null);
        setIntField(term490657, term490657.getClass(), "sourcePosition", 0);
        setField(term490657, term490657.getClass(), "jsType", null);
        setDoubleField(term490668, term490668.getClass(), "number", 0.0);
        setIntField(term490668, term490668.getClass(), "type", 108);
        setField(term490668, term490668.getClass(), "next", null);
        setField(term490668, term490668.getClass(), "first", null);
        setField(term490668, term490668.getClass(), "last", null);
        setField(term490668, term490668.getClass(), "propListHead", null);
        setIntField(term490668, term490668.getClass(), "sourcePosition", 0);
        setField(term490668, term490668.getClass(), "jsType", null);
        setField(term490668, term490668.getClass(), "parent", null);
        setField(term490657, term490657.getClass(), "parent", term490668);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term490376;
        args[1] = term490560;
        args[2] = term490652;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term490290, args);
        assertTrue(recursiveEquals(term490290, term490736));
        assertTrue(recursiveEquals(term490376, term490737));
        assertTrue(recursiveEquals(term490560, term490739));
        assertTrue(recursiveEquals(term490652, term490740));
        assertTrue(recursiveEquals(retValue, term490657));
    }

};


