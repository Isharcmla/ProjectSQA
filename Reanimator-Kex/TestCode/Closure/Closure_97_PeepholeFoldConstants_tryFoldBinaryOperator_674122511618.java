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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term161702;
     Object term161794;
     Object term162069;
     Object term162070;
     Object term161988;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term161702 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term161794 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term161886 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term161972 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term161886, term161886.getClass(), "next", term161972);
        setIntField(term161886, term161886.getClass(), "type", 0);
        setField(term161794, term161794.getClass(), "first", term161886);
        setIntField(term161794, term161794.getClass(), "type", 101);
        setField(term161794, term161794.getClass(), "parent", null);
        term162069 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term162069, term162069.getClass(), "currentTraversal", null);
        term162070 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term162071 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term162072 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term162070, term162070.getClass(), "number", 0.0);
        setIntField(term162070, term162070.getClass(), "type", 101);
        setField(term162070, term162070.getClass(), "next", null);
        setDoubleField(term162071, term162071.getClass(), "number", 0.0);
        setIntField(term162071, term162071.getClass(), "type", 0);
        setField(term162072, term162072.getClass(), "functionName", null);
        setBooleanField(term162072, term162072.getClass(), "itsNeedsActivation", false);
        setIntField(term162072, term162072.getClass(), "itsFunctionType", 0);
        setBooleanField(term162072, term162072.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term162072, term162072.getClass(), "encodedSourceStart", 0);
        setIntField(term162072, term162072.getClass(), "encodedSourceEnd", 0);
        setField(term162072, term162072.getClass(), "sourceName", null);
        setIntField(term162072, term162072.getClass(), "baseLineno", 0);
        setIntField(term162072, term162072.getClass(), "endLineno", 0);
        setField(term162072, term162072.getClass(), "functions", null);
        setField(term162072, term162072.getClass(), "regexps", null);
        setField(term162072, term162072.getClass(), "itsVariables", null);
        setField(term162072, term162072.getClass(), "itsConst", null);
        setField(term162072, term162072.getClass(), "itsVariableNames", null);
        setIntField(term162072, term162072.getClass(), "varStart", 0);
        setField(term162072, term162072.getClass(), "compilerData", null);
        setIntField(term162072, term162072.getClass(), "type", 0);
        setField(term162072, term162072.getClass(), "next", null);
        setField(term162072, term162072.getClass(), "first", null);
        setField(term162072, term162072.getClass(), "last", null);
        setField(term162072, term162072.getClass(), "propListHead", null);
        setIntField(term162072, term162072.getClass(), "sourcePosition", 0);
        setField(term162072, term162072.getClass(), "jsType", null);
        setField(term162072, term162072.getClass(), "parent", null);
        setField(term162071, term162071.getClass(), "next", term162072);
        setField(term162071, term162071.getClass(), "first", null);
        setField(term162071, term162071.getClass(), "last", null);
        setField(term162071, term162071.getClass(), "propListHead", null);
        setIntField(term162071, term162071.getClass(), "sourcePosition", 0);
        setField(term162071, term162071.getClass(), "jsType", null);
        setField(term162071, term162071.getClass(), "parent", null);
        setField(term162070, term162070.getClass(), "first", term162071);
        setField(term162070, term162070.getClass(), "last", null);
        setField(term162070, term162070.getClass(), "propListHead", null);
        setIntField(term162070, term162070.getClass(), "sourcePosition", 0);
        setField(term162070, term162070.getClass(), "jsType", null);
        setField(term162070, term162070.getClass(), "parent", null);
        term161988 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term161991 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term161994 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term161988, term161988.getClass(), "number", 0.0);
        setIntField(term161988, term161988.getClass(), "type", 101);
        setField(term161988, term161988.getClass(), "next", null);
        setDoubleField(term161991, term161991.getClass(), "number", 0.0);
        setIntField(term161991, term161991.getClass(), "type", 0);
        setField(term161994, term161994.getClass(), "functionName", null);
        setBooleanField(term161994, term161994.getClass(), "itsNeedsActivation", false);
        setIntField(term161994, term161994.getClass(), "itsFunctionType", 0);
        setBooleanField(term161994, term161994.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term161994, term161994.getClass(), "encodedSourceStart", 0);
        setIntField(term161994, term161994.getClass(), "encodedSourceEnd", 0);
        setField(term161994, term161994.getClass(), "sourceName", null);
        setIntField(term161994, term161994.getClass(), "baseLineno", 0);
        setIntField(term161994, term161994.getClass(), "endLineno", 0);
        setField(term161994, term161994.getClass(), "functions", null);
        setField(term161994, term161994.getClass(), "regexps", null);
        setField(term161994, term161994.getClass(), "itsVariables", null);
        setField(term161994, term161994.getClass(), "itsConst", null);
        setField(term161994, term161994.getClass(), "itsVariableNames", null);
        setIntField(term161994, term161994.getClass(), "varStart", 0);
        setField(term161994, term161994.getClass(), "compilerData", null);
        setIntField(term161994, term161994.getClass(), "type", 0);
        setField(term161994, term161994.getClass(), "next", null);
        setField(term161994, term161994.getClass(), "first", null);
        setField(term161994, term161994.getClass(), "last", null);
        setField(term161994, term161994.getClass(), "propListHead", null);
        setIntField(term161994, term161994.getClass(), "sourcePosition", 0);
        setField(term161994, term161994.getClass(), "jsType", null);
        setField(term161994, term161994.getClass(), "parent", null);
        setField(term161991, term161991.getClass(), "next", term161994);
        setField(term161991, term161991.getClass(), "first", null);
        setField(term161991, term161991.getClass(), "last", null);
        setField(term161991, term161991.getClass(), "propListHead", null);
        setIntField(term161991, term161991.getClass(), "sourcePosition", 0);
        setField(term161991, term161991.getClass(), "jsType", null);
        setField(term161991, term161991.getClass(), "parent", null);
        setField(term161988, term161988.getClass(), "first", term161991);
        setField(term161988, term161988.getClass(), "last", null);
        setField(term161988, term161988.getClass(), "propListHead", null);
        setIntField(term161988, term161988.getClass(), "sourcePosition", 0);
        setField(term161988, term161988.getClass(), "jsType", null);
        setField(term161988, term161988.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term161794;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term161702, args);
        assertTrue(recursiveEquals(term161702, term162069));
        assertTrue(recursiveEquals(term161794, term162070));
        assertTrue(recursiveEquals(retValue, term161988));
    }

};


