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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111874 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term719344;
     Object term719436;
     Object term719777;
     Object term719778;
     Object term719708;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111874() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term719344 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term719436 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term719522 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term719614 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term719522, term719522.getClass(), "next", term719614);
        setIntField(term719522, term719522.getClass(), "type", 0);
        setField(term719436, term719436.getClass(), "first", term719522);
        setIntField(term719436, term719436.getClass(), "type", 100);
        setField(term719436, term719436.getClass(), "parent", null);
        term719777 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term719777, term719777.getClass(), "currentTraversal", null);
        term719778 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term719779 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term719780 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term719778, term719778.getClass(), "str", null);
        setIntField(term719778, term719778.getClass(), "type", 100);
        setField(term719778, term719778.getClass(), "next", null);
        setField(term719779, term719779.getClass(), "functionName", null);
        setBooleanField(term719779, term719779.getClass(), "itsNeedsActivation", false);
        setIntField(term719779, term719779.getClass(), "itsFunctionType", 0);
        setBooleanField(term719779, term719779.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term719779, term719779.getClass(), "encodedSourceStart", 0);
        setIntField(term719779, term719779.getClass(), "encodedSourceEnd", 0);
        setField(term719779, term719779.getClass(), "sourceName", null);
        setIntField(term719779, term719779.getClass(), "baseLineno", 0);
        setIntField(term719779, term719779.getClass(), "endLineno", 0);
        setField(term719779, term719779.getClass(), "functions", null);
        setField(term719779, term719779.getClass(), "regexps", null);
        setField(term719779, term719779.getClass(), "itsVariables", null);
        setField(term719779, term719779.getClass(), "itsConst", null);
        setField(term719779, term719779.getClass(), "itsVariableNames", null);
        setIntField(term719779, term719779.getClass(), "varStart", 0);
        setField(term719779, term719779.getClass(), "compilerData", null);
        setIntField(term719779, term719779.getClass(), "type", 0);
        setField(term719780, term719780.getClass(), "str", null);
        setIntField(term719780, term719780.getClass(), "type", 0);
        setField(term719780, term719780.getClass(), "next", null);
        setField(term719780, term719780.getClass(), "first", null);
        setField(term719780, term719780.getClass(), "last", null);
        setField(term719780, term719780.getClass(), "propListHead", null);
        setIntField(term719780, term719780.getClass(), "sourcePosition", 0);
        setField(term719780, term719780.getClass(), "jsType", null);
        setField(term719780, term719780.getClass(), "parent", null);
        setField(term719779, term719779.getClass(), "next", term719780);
        setField(term719779, term719779.getClass(), "first", null);
        setField(term719779, term719779.getClass(), "last", null);
        setField(term719779, term719779.getClass(), "propListHead", null);
        setIntField(term719779, term719779.getClass(), "sourcePosition", 0);
        setField(term719779, term719779.getClass(), "jsType", null);
        setField(term719779, term719779.getClass(), "parent", null);
        setField(term719778, term719778.getClass(), "first", term719779);
        setField(term719778, term719778.getClass(), "last", null);
        setField(term719778, term719778.getClass(), "propListHead", null);
        setIntField(term719778, term719778.getClass(), "sourcePosition", 0);
        setField(term719778, term719778.getClass(), "jsType", null);
        setField(term719778, term719778.getClass(), "parent", null);
        term719708 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term719710 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term719720 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term719708, term719708.getClass(), "str", null);
        setIntField(term719708, term719708.getClass(), "type", 100);
        setField(term719708, term719708.getClass(), "next", null);
        setField(term719710, term719710.getClass(), "functionName", null);
        setBooleanField(term719710, term719710.getClass(), "itsNeedsActivation", false);
        setIntField(term719710, term719710.getClass(), "itsFunctionType", 0);
        setBooleanField(term719710, term719710.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term719710, term719710.getClass(), "encodedSourceStart", 0);
        setIntField(term719710, term719710.getClass(), "encodedSourceEnd", 0);
        setField(term719710, term719710.getClass(), "sourceName", null);
        setIntField(term719710, term719710.getClass(), "baseLineno", 0);
        setIntField(term719710, term719710.getClass(), "endLineno", 0);
        setField(term719710, term719710.getClass(), "functions", null);
        setField(term719710, term719710.getClass(), "regexps", null);
        setField(term719710, term719710.getClass(), "itsVariables", null);
        setField(term719710, term719710.getClass(), "itsConst", null);
        setField(term719710, term719710.getClass(), "itsVariableNames", null);
        setIntField(term719710, term719710.getClass(), "varStart", 0);
        setField(term719710, term719710.getClass(), "compilerData", null);
        setIntField(term719710, term719710.getClass(), "type", 0);
        setField(term719720, term719720.getClass(), "str", null);
        setIntField(term719720, term719720.getClass(), "type", 0);
        setField(term719720, term719720.getClass(), "next", null);
        setField(term719720, term719720.getClass(), "first", null);
        setField(term719720, term719720.getClass(), "last", null);
        setField(term719720, term719720.getClass(), "propListHead", null);
        setIntField(term719720, term719720.getClass(), "sourcePosition", 0);
        setField(term719720, term719720.getClass(), "jsType", null);
        setField(term719720, term719720.getClass(), "parent", null);
        setField(term719710, term719710.getClass(), "next", term719720);
        setField(term719710, term719710.getClass(), "first", null);
        setField(term719710, term719710.getClass(), "last", null);
        setField(term719710, term719710.getClass(), "propListHead", null);
        setIntField(term719710, term719710.getClass(), "sourcePosition", 0);
        setField(term719710, term719710.getClass(), "jsType", null);
        setField(term719710, term719710.getClass(), "parent", null);
        setField(term719708, term719708.getClass(), "first", term719710);
        setField(term719708, term719708.getClass(), "last", null);
        setField(term719708, term719708.getClass(), "propListHead", null);
        setIntField(term719708, term719708.getClass(), "sourcePosition", 0);
        setField(term719708, term719708.getClass(), "jsType", null);
        setField(term719708, term719708.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term719436;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term719344, args);
        assertTrue(recursiveEquals(term719344, term719777));
        assertTrue(recursiveEquals(term719436, term719778));
        assertTrue(recursiveEquals(retValue, term719708));
    }

};


