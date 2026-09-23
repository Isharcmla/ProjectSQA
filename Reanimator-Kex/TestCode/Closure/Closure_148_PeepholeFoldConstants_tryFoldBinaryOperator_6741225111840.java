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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111840 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term482549;
     Object term482641;
     Object term483408;
     Object term483409;
     Object term483331;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111840() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term482549 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term482641 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term482733 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term482819 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term482819, term482819.getClass(), "type", 106);
        setField(term482733, term482733.getClass(), "next", term482819);
        setIntField(term482733, term482733.getClass(), "type", 42);
        setField(term482641, term482641.getClass(), "first", term482733);
        setIntField(term482641, term482641.getClass(), "type", 14);
        term483408 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term483408, term483408.getClass(), "currentTraversal", null);
        term483409 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term483410 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term483411 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term483409, term483409.getClass(), "number", 0.0);
        setIntField(term483409, term483409.getClass(), "type", 14);
        setField(term483409, term483409.getClass(), "next", null);
        setDoubleField(term483410, term483410.getClass(), "number", 0.0);
        setIntField(term483410, term483410.getClass(), "type", 42);
        setField(term483411, term483411.getClass(), "functionName", null);
        setBooleanField(term483411, term483411.getClass(), "itsNeedsActivation", false);
        setIntField(term483411, term483411.getClass(), "itsFunctionType", 0);
        setBooleanField(term483411, term483411.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term483411, term483411.getClass(), "encodedSourceStart", 0);
        setIntField(term483411, term483411.getClass(), "encodedSourceEnd", 0);
        setField(term483411, term483411.getClass(), "sourceName", null);
        setIntField(term483411, term483411.getClass(), "baseLineno", 0);
        setIntField(term483411, term483411.getClass(), "endLineno", 0);
        setField(term483411, term483411.getClass(), "functions", null);
        setField(term483411, term483411.getClass(), "regexps", null);
        setField(term483411, term483411.getClass(), "itsVariables", null);
        setField(term483411, term483411.getClass(), "itsConst", null);
        setField(term483411, term483411.getClass(), "itsVariableNames", null);
        setIntField(term483411, term483411.getClass(), "varStart", 0);
        setField(term483411, term483411.getClass(), "compilerData", null);
        setIntField(term483411, term483411.getClass(), "type", 106);
        setField(term483411, term483411.getClass(), "next", null);
        setField(term483411, term483411.getClass(), "first", null);
        setField(term483411, term483411.getClass(), "last", null);
        setField(term483411, term483411.getClass(), "propListHead", null);
        setIntField(term483411, term483411.getClass(), "sourcePosition", 0);
        setField(term483411, term483411.getClass(), "jsType", null);
        setField(term483411, term483411.getClass(), "parent", null);
        setField(term483410, term483410.getClass(), "next", term483411);
        setField(term483410, term483410.getClass(), "first", null);
        setField(term483410, term483410.getClass(), "last", null);
        setField(term483410, term483410.getClass(), "propListHead", null);
        setIntField(term483410, term483410.getClass(), "sourcePosition", 0);
        setField(term483410, term483410.getClass(), "jsType", null);
        setField(term483410, term483410.getClass(), "parent", null);
        setField(term483409, term483409.getClass(), "first", term483410);
        setField(term483409, term483409.getClass(), "last", null);
        setField(term483409, term483409.getClass(), "propListHead", null);
        setIntField(term483409, term483409.getClass(), "sourcePosition", 0);
        setField(term483409, term483409.getClass(), "jsType", null);
        setField(term483409, term483409.getClass(), "parent", null);
        term483331 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term483334 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term483337 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term483331, term483331.getClass(), "number", 0.0);
        setIntField(term483331, term483331.getClass(), "type", 14);
        setField(term483331, term483331.getClass(), "next", null);
        setDoubleField(term483334, term483334.getClass(), "number", 0.0);
        setIntField(term483334, term483334.getClass(), "type", 42);
        setField(term483337, term483337.getClass(), "functionName", null);
        setBooleanField(term483337, term483337.getClass(), "itsNeedsActivation", false);
        setIntField(term483337, term483337.getClass(), "itsFunctionType", 0);
        setBooleanField(term483337, term483337.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term483337, term483337.getClass(), "encodedSourceStart", 0);
        setIntField(term483337, term483337.getClass(), "encodedSourceEnd", 0);
        setField(term483337, term483337.getClass(), "sourceName", null);
        setIntField(term483337, term483337.getClass(), "baseLineno", 0);
        setIntField(term483337, term483337.getClass(), "endLineno", 0);
        setField(term483337, term483337.getClass(), "functions", null);
        setField(term483337, term483337.getClass(), "regexps", null);
        setField(term483337, term483337.getClass(), "itsVariables", null);
        setField(term483337, term483337.getClass(), "itsConst", null);
        setField(term483337, term483337.getClass(), "itsVariableNames", null);
        setIntField(term483337, term483337.getClass(), "varStart", 0);
        setField(term483337, term483337.getClass(), "compilerData", null);
        setIntField(term483337, term483337.getClass(), "type", 106);
        setField(term483337, term483337.getClass(), "next", null);
        setField(term483337, term483337.getClass(), "first", null);
        setField(term483337, term483337.getClass(), "last", null);
        setField(term483337, term483337.getClass(), "propListHead", null);
        setIntField(term483337, term483337.getClass(), "sourcePosition", 0);
        setField(term483337, term483337.getClass(), "jsType", null);
        setField(term483337, term483337.getClass(), "parent", null);
        setField(term483334, term483334.getClass(), "next", term483337);
        setField(term483334, term483334.getClass(), "first", null);
        setField(term483334, term483334.getClass(), "last", null);
        setField(term483334, term483334.getClass(), "propListHead", null);
        setIntField(term483334, term483334.getClass(), "sourcePosition", 0);
        setField(term483334, term483334.getClass(), "jsType", null);
        setField(term483334, term483334.getClass(), "parent", null);
        setField(term483331, term483331.getClass(), "first", term483334);
        setField(term483331, term483331.getClass(), "last", null);
        setField(term483331, term483331.getClass(), "propListHead", null);
        setIntField(term483331, term483331.getClass(), "sourcePosition", 0);
        setField(term483331, term483331.getClass(), "jsType", null);
        setField(term483331, term483331.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term482641;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term482549, args);
        assertTrue(recursiveEquals(term482549, term483408));
        assertTrue(recursiveEquals(term482641, term483409));
        assertTrue(recursiveEquals(retValue, term483331));
    }

};


