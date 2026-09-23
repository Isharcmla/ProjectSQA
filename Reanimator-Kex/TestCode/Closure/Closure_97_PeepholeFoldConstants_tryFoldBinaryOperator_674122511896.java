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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511896 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term252925;
     Object term253017;
     Object term253331;
     Object term253332;
     Object term253250;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511896() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term252925 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term253017 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term253109 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term253195 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term253109, term253109.getClass(), "next", term253195);
        setIntField(term253109, term253109.getClass(), "type", 0);
        setField(term253017, term253017.getClass(), "first", term253109);
        setIntField(term253017, term253017.getClass(), "type", 100);
        setField(term253017, term253017.getClass(), "parent", null);
        term253331 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term253331, term253331.getClass(), "currentTraversal", null);
        term253332 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term253333 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term253334 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term253332, term253332.getClass(), "number", 0.0);
        setIntField(term253332, term253332.getClass(), "type", 100);
        setField(term253332, term253332.getClass(), "next", null);
        setDoubleField(term253333, term253333.getClass(), "number", 0.0);
        setIntField(term253333, term253333.getClass(), "type", 0);
        setField(term253334, term253334.getClass(), "functionName", null);
        setBooleanField(term253334, term253334.getClass(), "itsNeedsActivation", false);
        setIntField(term253334, term253334.getClass(), "itsFunctionType", 0);
        setBooleanField(term253334, term253334.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term253334, term253334.getClass(), "encodedSourceStart", 0);
        setIntField(term253334, term253334.getClass(), "encodedSourceEnd", 0);
        setField(term253334, term253334.getClass(), "sourceName", null);
        setIntField(term253334, term253334.getClass(), "baseLineno", 0);
        setIntField(term253334, term253334.getClass(), "endLineno", 0);
        setField(term253334, term253334.getClass(), "functions", null);
        setField(term253334, term253334.getClass(), "regexps", null);
        setField(term253334, term253334.getClass(), "itsVariables", null);
        setField(term253334, term253334.getClass(), "itsConst", null);
        setField(term253334, term253334.getClass(), "itsVariableNames", null);
        setIntField(term253334, term253334.getClass(), "varStart", 0);
        setField(term253334, term253334.getClass(), "compilerData", null);
        setIntField(term253334, term253334.getClass(), "type", 0);
        setField(term253334, term253334.getClass(), "next", null);
        setField(term253334, term253334.getClass(), "first", null);
        setField(term253334, term253334.getClass(), "last", null);
        setField(term253334, term253334.getClass(), "propListHead", null);
        setIntField(term253334, term253334.getClass(), "sourcePosition", 0);
        setField(term253334, term253334.getClass(), "jsType", null);
        setField(term253334, term253334.getClass(), "parent", null);
        setField(term253333, term253333.getClass(), "next", term253334);
        setField(term253333, term253333.getClass(), "first", null);
        setField(term253333, term253333.getClass(), "last", null);
        setField(term253333, term253333.getClass(), "propListHead", null);
        setIntField(term253333, term253333.getClass(), "sourcePosition", 0);
        setField(term253333, term253333.getClass(), "jsType", null);
        setField(term253333, term253333.getClass(), "parent", null);
        setField(term253332, term253332.getClass(), "first", term253333);
        setField(term253332, term253332.getClass(), "last", null);
        setField(term253332, term253332.getClass(), "propListHead", null);
        setIntField(term253332, term253332.getClass(), "sourcePosition", 0);
        setField(term253332, term253332.getClass(), "jsType", null);
        setField(term253332, term253332.getClass(), "parent", null);
        term253250 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term253253 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term253256 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term253250, term253250.getClass(), "number", 0.0);
        setIntField(term253250, term253250.getClass(), "type", 100);
        setField(term253250, term253250.getClass(), "next", null);
        setDoubleField(term253253, term253253.getClass(), "number", 0.0);
        setIntField(term253253, term253253.getClass(), "type", 0);
        setField(term253256, term253256.getClass(), "functionName", null);
        setBooleanField(term253256, term253256.getClass(), "itsNeedsActivation", false);
        setIntField(term253256, term253256.getClass(), "itsFunctionType", 0);
        setBooleanField(term253256, term253256.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term253256, term253256.getClass(), "encodedSourceStart", 0);
        setIntField(term253256, term253256.getClass(), "encodedSourceEnd", 0);
        setField(term253256, term253256.getClass(), "sourceName", null);
        setIntField(term253256, term253256.getClass(), "baseLineno", 0);
        setIntField(term253256, term253256.getClass(), "endLineno", 0);
        setField(term253256, term253256.getClass(), "functions", null);
        setField(term253256, term253256.getClass(), "regexps", null);
        setField(term253256, term253256.getClass(), "itsVariables", null);
        setField(term253256, term253256.getClass(), "itsConst", null);
        setField(term253256, term253256.getClass(), "itsVariableNames", null);
        setIntField(term253256, term253256.getClass(), "varStart", 0);
        setField(term253256, term253256.getClass(), "compilerData", null);
        setIntField(term253256, term253256.getClass(), "type", 0);
        setField(term253256, term253256.getClass(), "next", null);
        setField(term253256, term253256.getClass(), "first", null);
        setField(term253256, term253256.getClass(), "last", null);
        setField(term253256, term253256.getClass(), "propListHead", null);
        setIntField(term253256, term253256.getClass(), "sourcePosition", 0);
        setField(term253256, term253256.getClass(), "jsType", null);
        setField(term253256, term253256.getClass(), "parent", null);
        setField(term253253, term253253.getClass(), "next", term253256);
        setField(term253253, term253253.getClass(), "first", null);
        setField(term253253, term253253.getClass(), "last", null);
        setField(term253253, term253253.getClass(), "propListHead", null);
        setIntField(term253253, term253253.getClass(), "sourcePosition", 0);
        setField(term253253, term253253.getClass(), "jsType", null);
        setField(term253253, term253253.getClass(), "parent", null);
        setField(term253250, term253250.getClass(), "first", term253253);
        setField(term253250, term253250.getClass(), "last", null);
        setField(term253250, term253250.getClass(), "propListHead", null);
        setIntField(term253250, term253250.getClass(), "sourcePosition", 0);
        setField(term253250, term253250.getClass(), "jsType", null);
        setField(term253250, term253250.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term253017;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term252925, args);
        assertTrue(recursiveEquals(term252925, term253331));
        assertTrue(recursiveEquals(term253017, term253332));
        assertTrue(recursiveEquals(retValue, term253250));
    }

};


