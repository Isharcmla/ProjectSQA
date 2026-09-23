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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111494 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term553703;
     Object term553795;
     Object term554146;
     Object term554147;
     Object term554075;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111494() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term553703 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term553795 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term553881 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term553951 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term553881, term553881.getClass(), "next", term553951);
        setField(term553795, term553795.getClass(), "first", term553881);
        setIntField(term553795, term553795.getClass(), "type", 101);
        term554146 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term554146, term554146.getClass(), "currentTraversal", null);
        term554147 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term554148 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term554149 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term554147, term554147.getClass(), "number", 0.0);
        setIntField(term554147, term554147.getClass(), "type", 101);
        setField(term554147, term554147.getClass(), "next", null);
        setField(term554148, term554148.getClass(), "functionName", null);
        setBooleanField(term554148, term554148.getClass(), "itsNeedsActivation", false);
        setIntField(term554148, term554148.getClass(), "itsFunctionType", 0);
        setBooleanField(term554148, term554148.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term554148, term554148.getClass(), "encodedSourceStart", 0);
        setIntField(term554148, term554148.getClass(), "encodedSourceEnd", 0);
        setField(term554148, term554148.getClass(), "sourceName", null);
        setIntField(term554148, term554148.getClass(), "baseLineno", 0);
        setIntField(term554148, term554148.getClass(), "endLineno", 0);
        setField(term554148, term554148.getClass(), "functions", null);
        setField(term554148, term554148.getClass(), "regexps", null);
        setField(term554148, term554148.getClass(), "itsVariables", null);
        setField(term554148, term554148.getClass(), "itsConst", null);
        setField(term554148, term554148.getClass(), "itsVariableNames", null);
        setIntField(term554148, term554148.getClass(), "varStart", 0);
        setField(term554148, term554148.getClass(), "compilerData", null);
        setIntField(term554148, term554148.getClass(), "type", 0);
        setIntField(term554149, term554149.getClass(), "type", 0);
        setField(term554149, term554149.getClass(), "next", null);
        setField(term554149, term554149.getClass(), "first", null);
        setField(term554149, term554149.getClass(), "last", null);
        setField(term554149, term554149.getClass(), "propListHead", null);
        setIntField(term554149, term554149.getClass(), "sourcePosition", 0);
        setField(term554149, term554149.getClass(), "jsType", null);
        setField(term554149, term554149.getClass(), "parent", null);
        setField(term554148, term554148.getClass(), "next", term554149);
        setField(term554148, term554148.getClass(), "first", null);
        setField(term554148, term554148.getClass(), "last", null);
        setField(term554148, term554148.getClass(), "propListHead", null);
        setIntField(term554148, term554148.getClass(), "sourcePosition", 0);
        setField(term554148, term554148.getClass(), "jsType", null);
        setField(term554148, term554148.getClass(), "parent", null);
        setField(term554147, term554147.getClass(), "first", term554148);
        setField(term554147, term554147.getClass(), "last", null);
        setField(term554147, term554147.getClass(), "propListHead", null);
        setIntField(term554147, term554147.getClass(), "sourcePosition", 0);
        setField(term554147, term554147.getClass(), "jsType", null);
        setField(term554147, term554147.getClass(), "parent", null);
        term554075 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term554078 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term554088 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term554075, term554075.getClass(), "number", 0.0);
        setIntField(term554075, term554075.getClass(), "type", 101);
        setField(term554075, term554075.getClass(), "next", null);
        setField(term554078, term554078.getClass(), "functionName", null);
        setBooleanField(term554078, term554078.getClass(), "itsNeedsActivation", false);
        setIntField(term554078, term554078.getClass(), "itsFunctionType", 0);
        setBooleanField(term554078, term554078.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term554078, term554078.getClass(), "encodedSourceStart", 0);
        setIntField(term554078, term554078.getClass(), "encodedSourceEnd", 0);
        setField(term554078, term554078.getClass(), "sourceName", null);
        setIntField(term554078, term554078.getClass(), "baseLineno", 0);
        setIntField(term554078, term554078.getClass(), "endLineno", 0);
        setField(term554078, term554078.getClass(), "functions", null);
        setField(term554078, term554078.getClass(), "regexps", null);
        setField(term554078, term554078.getClass(), "itsVariables", null);
        setField(term554078, term554078.getClass(), "itsConst", null);
        setField(term554078, term554078.getClass(), "itsVariableNames", null);
        setIntField(term554078, term554078.getClass(), "varStart", 0);
        setField(term554078, term554078.getClass(), "compilerData", null);
        setIntField(term554078, term554078.getClass(), "type", 0);
        setIntField(term554088, term554088.getClass(), "type", 0);
        setField(term554088, term554088.getClass(), "next", null);
        setField(term554088, term554088.getClass(), "first", null);
        setField(term554088, term554088.getClass(), "last", null);
        setField(term554088, term554088.getClass(), "propListHead", null);
        setIntField(term554088, term554088.getClass(), "sourcePosition", 0);
        setField(term554088, term554088.getClass(), "jsType", null);
        setField(term554088, term554088.getClass(), "parent", null);
        setField(term554078, term554078.getClass(), "next", term554088);
        setField(term554078, term554078.getClass(), "first", null);
        setField(term554078, term554078.getClass(), "last", null);
        setField(term554078, term554078.getClass(), "propListHead", null);
        setIntField(term554078, term554078.getClass(), "sourcePosition", 0);
        setField(term554078, term554078.getClass(), "jsType", null);
        setField(term554078, term554078.getClass(), "parent", null);
        setField(term554075, term554075.getClass(), "first", term554078);
        setField(term554075, term554075.getClass(), "last", null);
        setField(term554075, term554075.getClass(), "propListHead", null);
        setIntField(term554075, term554075.getClass(), "sourcePosition", 0);
        setField(term554075, term554075.getClass(), "jsType", null);
        setField(term554075, term554075.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term553795;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term553703, args);
        assertTrue(recursiveEquals(term553703, term554146));
        assertTrue(recursiveEquals(term553795, term554147));
        assertTrue(recursiveEquals(retValue, term554075));
    }

};


