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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term589778;
     Object term589870;
     Object term590238;
     Object term590239;
     Object term590128;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term589778 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term589870 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term589960 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term590030 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term590116 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term590030, term590030.getClass(), "type", 63);
        setField(term589960, term589960.getClass(), "next", term590030);
        setIntField(term589960, term589960.getClass(), "type", 0);
        setField(term589870, term589870.getClass(), "first", term589960);
        setIntField(term589870, term589870.getClass(), "type", 101);
        setField(term589870, term589870.getClass(), "parent", term590116);
        term590238 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term590238, term590238.getClass(), "currentTraversal", null);
        term590239 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term590240 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term590241 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term590242 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term590239, term590239.getClass(), "str", null);
        setIntField(term590239, term590239.getClass(), "type", 101);
        setField(term590239, term590239.getClass(), "next", null);
        setIntField(term590240, term590240.getClass(), "encodedSourceStart", 0);
        setIntField(term590240, term590240.getClass(), "encodedSourceEnd", 0);
        setField(term590240, term590240.getClass(), "sourceName", null);
        setIntField(term590240, term590240.getClass(), "baseLineno", 0);
        setIntField(term590240, term590240.getClass(), "endLineno", 0);
        setField(term590240, term590240.getClass(), "functions", null);
        setField(term590240, term590240.getClass(), "regexps", null);
        setField(term590240, term590240.getClass(), "itsVariables", null);
        setField(term590240, term590240.getClass(), "itsConst", null);
        setField(term590240, term590240.getClass(), "itsVariableNames", null);
        setIntField(term590240, term590240.getClass(), "varStart", 0);
        setField(term590240, term590240.getClass(), "compilerData", null);
        setIntField(term590240, term590240.getClass(), "type", 0);
        setIntField(term590241, term590241.getClass(), "type", 63);
        setField(term590241, term590241.getClass(), "next", null);
        setField(term590241, term590241.getClass(), "first", null);
        setField(term590241, term590241.getClass(), "last", null);
        setField(term590241, term590241.getClass(), "propListHead", null);
        setIntField(term590241, term590241.getClass(), "sourcePosition", 0);
        setField(term590241, term590241.getClass(), "jsType", null);
        setField(term590241, term590241.getClass(), "parent", null);
        setField(term590240, term590240.getClass(), "next", term590241);
        setField(term590240, term590240.getClass(), "first", null);
        setField(term590240, term590240.getClass(), "last", null);
        setField(term590240, term590240.getClass(), "propListHead", null);
        setIntField(term590240, term590240.getClass(), "sourcePosition", 0);
        setField(term590240, term590240.getClass(), "jsType", null);
        setField(term590240, term590240.getClass(), "parent", null);
        setField(term590239, term590239.getClass(), "first", term590240);
        setField(term590239, term590239.getClass(), "last", null);
        setField(term590239, term590239.getClass(), "propListHead", null);
        setIntField(term590239, term590239.getClass(), "sourcePosition", 0);
        setField(term590239, term590239.getClass(), "jsType", null);
        setField(term590242, term590242.getClass(), "functionName", null);
        setBooleanField(term590242, term590242.getClass(), "itsNeedsActivation", false);
        setIntField(term590242, term590242.getClass(), "itsFunctionType", 0);
        setBooleanField(term590242, term590242.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term590242, term590242.getClass(), "encodedSourceStart", 0);
        setIntField(term590242, term590242.getClass(), "encodedSourceEnd", 0);
        setField(term590242, term590242.getClass(), "sourceName", null);
        setIntField(term590242, term590242.getClass(), "baseLineno", 0);
        setIntField(term590242, term590242.getClass(), "endLineno", 0);
        setField(term590242, term590242.getClass(), "functions", null);
        setField(term590242, term590242.getClass(), "regexps", null);
        setField(term590242, term590242.getClass(), "itsVariables", null);
        setField(term590242, term590242.getClass(), "itsConst", null);
        setField(term590242, term590242.getClass(), "itsVariableNames", null);
        setIntField(term590242, term590242.getClass(), "varStart", 0);
        setField(term590242, term590242.getClass(), "compilerData", null);
        setIntField(term590242, term590242.getClass(), "type", 0);
        setField(term590242, term590242.getClass(), "next", null);
        setField(term590242, term590242.getClass(), "first", null);
        setField(term590242, term590242.getClass(), "last", null);
        setField(term590242, term590242.getClass(), "propListHead", null);
        setIntField(term590242, term590242.getClass(), "sourcePosition", 0);
        setField(term590242, term590242.getClass(), "jsType", null);
        setField(term590242, term590242.getClass(), "parent", null);
        setField(term590239, term590239.getClass(), "parent", term590242);
        term590128 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term590130 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term590137 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term590142 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term590128, term590128.getClass(), "str", null);
        setIntField(term590128, term590128.getClass(), "type", 101);
        setField(term590128, term590128.getClass(), "next", null);
        setIntField(term590130, term590130.getClass(), "encodedSourceStart", 0);
        setIntField(term590130, term590130.getClass(), "encodedSourceEnd", 0);
        setField(term590130, term590130.getClass(), "sourceName", null);
        setIntField(term590130, term590130.getClass(), "baseLineno", 0);
        setIntField(term590130, term590130.getClass(), "endLineno", 0);
        setField(term590130, term590130.getClass(), "functions", null);
        setField(term590130, term590130.getClass(), "regexps", null);
        setField(term590130, term590130.getClass(), "itsVariables", null);
        setField(term590130, term590130.getClass(), "itsConst", null);
        setField(term590130, term590130.getClass(), "itsVariableNames", null);
        setIntField(term590130, term590130.getClass(), "varStart", 0);
        setField(term590130, term590130.getClass(), "compilerData", null);
        setIntField(term590130, term590130.getClass(), "type", 0);
        setIntField(term590137, term590137.getClass(), "type", 63);
        setField(term590137, term590137.getClass(), "next", null);
        setField(term590137, term590137.getClass(), "first", null);
        setField(term590137, term590137.getClass(), "last", null);
        setField(term590137, term590137.getClass(), "propListHead", null);
        setIntField(term590137, term590137.getClass(), "sourcePosition", 0);
        setField(term590137, term590137.getClass(), "jsType", null);
        setField(term590137, term590137.getClass(), "parent", null);
        setField(term590130, term590130.getClass(), "next", term590137);
        setField(term590130, term590130.getClass(), "first", null);
        setField(term590130, term590130.getClass(), "last", null);
        setField(term590130, term590130.getClass(), "propListHead", null);
        setIntField(term590130, term590130.getClass(), "sourcePosition", 0);
        setField(term590130, term590130.getClass(), "jsType", null);
        setField(term590130, term590130.getClass(), "parent", null);
        setField(term590128, term590128.getClass(), "first", term590130);
        setField(term590128, term590128.getClass(), "last", null);
        setField(term590128, term590128.getClass(), "propListHead", null);
        setIntField(term590128, term590128.getClass(), "sourcePosition", 0);
        setField(term590128, term590128.getClass(), "jsType", null);
        setField(term590142, term590142.getClass(), "functionName", null);
        setBooleanField(term590142, term590142.getClass(), "itsNeedsActivation", false);
        setIntField(term590142, term590142.getClass(), "itsFunctionType", 0);
        setBooleanField(term590142, term590142.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term590142, term590142.getClass(), "encodedSourceStart", 0);
        setIntField(term590142, term590142.getClass(), "encodedSourceEnd", 0);
        setField(term590142, term590142.getClass(), "sourceName", null);
        setIntField(term590142, term590142.getClass(), "baseLineno", 0);
        setIntField(term590142, term590142.getClass(), "endLineno", 0);
        setField(term590142, term590142.getClass(), "functions", null);
        setField(term590142, term590142.getClass(), "regexps", null);
        setField(term590142, term590142.getClass(), "itsVariables", null);
        setField(term590142, term590142.getClass(), "itsConst", null);
        setField(term590142, term590142.getClass(), "itsVariableNames", null);
        setIntField(term590142, term590142.getClass(), "varStart", 0);
        setField(term590142, term590142.getClass(), "compilerData", null);
        setIntField(term590142, term590142.getClass(), "type", 0);
        setField(term590142, term590142.getClass(), "next", null);
        setField(term590142, term590142.getClass(), "first", null);
        setField(term590142, term590142.getClass(), "last", null);
        setField(term590142, term590142.getClass(), "propListHead", null);
        setIntField(term590142, term590142.getClass(), "sourcePosition", 0);
        setField(term590142, term590142.getClass(), "jsType", null);
        setField(term590142, term590142.getClass(), "parent", null);
        setField(term590128, term590128.getClass(), "parent", term590142);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term589870;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term589778, args);
        assertTrue(recursiveEquals(term589778, term590238));
        assertTrue(recursiveEquals(term589870, term590239));
        assertTrue(recursiveEquals(retValue, term590128));
    }

};


