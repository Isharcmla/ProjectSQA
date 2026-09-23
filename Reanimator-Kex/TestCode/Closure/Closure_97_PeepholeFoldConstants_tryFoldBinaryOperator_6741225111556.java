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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111556 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term569937;
     Object term570029;
     Object term570245;
     Object term570246;
     Object term570200;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111556() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term569937 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term570029 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term570115 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term570185 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term570115, term570115.getClass(), "next", term570185);
        setField(term570029, term570029.getClass(), "first", term570115);
        setIntField(term570029, term570029.getClass(), "type", 22);
        term570245 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term570245, term570245.getClass(), "currentTraversal", null);
        term570246 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term570247 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term570248 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term570246, term570246.getClass(), "number", 0.0);
        setIntField(term570246, term570246.getClass(), "type", 22);
        setField(term570246, term570246.getClass(), "next", null);
        setField(term570247, term570247.getClass(), "functionName", null);
        setBooleanField(term570247, term570247.getClass(), "itsNeedsActivation", false);
        setIntField(term570247, term570247.getClass(), "itsFunctionType", 0);
        setBooleanField(term570247, term570247.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term570247, term570247.getClass(), "encodedSourceStart", 0);
        setIntField(term570247, term570247.getClass(), "encodedSourceEnd", 0);
        setField(term570247, term570247.getClass(), "sourceName", null);
        setIntField(term570247, term570247.getClass(), "baseLineno", 0);
        setIntField(term570247, term570247.getClass(), "endLineno", 0);
        setField(term570247, term570247.getClass(), "functions", null);
        setField(term570247, term570247.getClass(), "regexps", null);
        setField(term570247, term570247.getClass(), "itsVariables", null);
        setField(term570247, term570247.getClass(), "itsConst", null);
        setField(term570247, term570247.getClass(), "itsVariableNames", null);
        setIntField(term570247, term570247.getClass(), "varStart", 0);
        setField(term570247, term570247.getClass(), "compilerData", null);
        setIntField(term570247, term570247.getClass(), "type", 0);
        setIntField(term570248, term570248.getClass(), "type", 0);
        setField(term570248, term570248.getClass(), "next", null);
        setField(term570248, term570248.getClass(), "first", null);
        setField(term570248, term570248.getClass(), "last", null);
        setField(term570248, term570248.getClass(), "propListHead", null);
        setIntField(term570248, term570248.getClass(), "sourcePosition", 0);
        setField(term570248, term570248.getClass(), "jsType", null);
        setField(term570248, term570248.getClass(), "parent", null);
        setField(term570247, term570247.getClass(), "next", term570248);
        setField(term570247, term570247.getClass(), "first", null);
        setField(term570247, term570247.getClass(), "last", null);
        setField(term570247, term570247.getClass(), "propListHead", null);
        setIntField(term570247, term570247.getClass(), "sourcePosition", 0);
        setField(term570247, term570247.getClass(), "jsType", null);
        setField(term570247, term570247.getClass(), "parent", null);
        setField(term570246, term570246.getClass(), "first", term570247);
        setField(term570246, term570246.getClass(), "last", null);
        setField(term570246, term570246.getClass(), "propListHead", null);
        setIntField(term570246, term570246.getClass(), "sourcePosition", 0);
        setField(term570246, term570246.getClass(), "jsType", null);
        setField(term570246, term570246.getClass(), "parent", null);
        term570200 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term570203 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term570213 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term570200, term570200.getClass(), "number", 0.0);
        setIntField(term570200, term570200.getClass(), "type", 22);
        setField(term570200, term570200.getClass(), "next", null);
        setField(term570203, term570203.getClass(), "functionName", null);
        setBooleanField(term570203, term570203.getClass(), "itsNeedsActivation", false);
        setIntField(term570203, term570203.getClass(), "itsFunctionType", 0);
        setBooleanField(term570203, term570203.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term570203, term570203.getClass(), "encodedSourceStart", 0);
        setIntField(term570203, term570203.getClass(), "encodedSourceEnd", 0);
        setField(term570203, term570203.getClass(), "sourceName", null);
        setIntField(term570203, term570203.getClass(), "baseLineno", 0);
        setIntField(term570203, term570203.getClass(), "endLineno", 0);
        setField(term570203, term570203.getClass(), "functions", null);
        setField(term570203, term570203.getClass(), "regexps", null);
        setField(term570203, term570203.getClass(), "itsVariables", null);
        setField(term570203, term570203.getClass(), "itsConst", null);
        setField(term570203, term570203.getClass(), "itsVariableNames", null);
        setIntField(term570203, term570203.getClass(), "varStart", 0);
        setField(term570203, term570203.getClass(), "compilerData", null);
        setIntField(term570203, term570203.getClass(), "type", 0);
        setIntField(term570213, term570213.getClass(), "type", 0);
        setField(term570213, term570213.getClass(), "next", null);
        setField(term570213, term570213.getClass(), "first", null);
        setField(term570213, term570213.getClass(), "last", null);
        setField(term570213, term570213.getClass(), "propListHead", null);
        setIntField(term570213, term570213.getClass(), "sourcePosition", 0);
        setField(term570213, term570213.getClass(), "jsType", null);
        setField(term570213, term570213.getClass(), "parent", null);
        setField(term570203, term570203.getClass(), "next", term570213);
        setField(term570203, term570203.getClass(), "first", null);
        setField(term570203, term570203.getClass(), "last", null);
        setField(term570203, term570203.getClass(), "propListHead", null);
        setIntField(term570203, term570203.getClass(), "sourcePosition", 0);
        setField(term570203, term570203.getClass(), "jsType", null);
        setField(term570203, term570203.getClass(), "parent", null);
        setField(term570200, term570200.getClass(), "first", term570203);
        setField(term570200, term570200.getClass(), "last", null);
        setField(term570200, term570200.getClass(), "propListHead", null);
        setIntField(term570200, term570200.getClass(), "sourcePosition", 0);
        setField(term570200, term570200.getClass(), "jsType", null);
        setField(term570200, term570200.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term570029;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term569937, args);
        assertTrue(recursiveEquals(term569937, term570245));
        assertTrue(recursiveEquals(term570029, term570246));
        assertTrue(recursiveEquals(retValue, term570200));
    }

};


