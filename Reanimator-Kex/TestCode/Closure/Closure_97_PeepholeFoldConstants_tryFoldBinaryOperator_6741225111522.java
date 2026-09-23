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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term561481;
     Object term561573;
     Object term561793;
     Object term561794;
     Object term561744;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term561481 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term561573 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term561659 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term561729 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term561659, term561659.getClass(), "next", term561729);
        setField(term561573, term561573.getClass(), "first", term561659);
        setIntField(term561573, term561573.getClass(), "type", 35);
        term561793 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term561793, term561793.getClass(), "currentTraversal", null);
        term561794 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term561795 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term561796 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term561794, term561794.getClass(), "number", 0.0);
        setIntField(term561794, term561794.getClass(), "type", 35);
        setField(term561794, term561794.getClass(), "next", null);
        setField(term561795, term561795.getClass(), "functionName", null);
        setBooleanField(term561795, term561795.getClass(), "itsNeedsActivation", false);
        setIntField(term561795, term561795.getClass(), "itsFunctionType", 0);
        setBooleanField(term561795, term561795.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term561795, term561795.getClass(), "encodedSourceStart", 0);
        setIntField(term561795, term561795.getClass(), "encodedSourceEnd", 0);
        setField(term561795, term561795.getClass(), "sourceName", null);
        setIntField(term561795, term561795.getClass(), "baseLineno", 0);
        setIntField(term561795, term561795.getClass(), "endLineno", 0);
        setField(term561795, term561795.getClass(), "functions", null);
        setField(term561795, term561795.getClass(), "regexps", null);
        setField(term561795, term561795.getClass(), "itsVariables", null);
        setField(term561795, term561795.getClass(), "itsConst", null);
        setField(term561795, term561795.getClass(), "itsVariableNames", null);
        setIntField(term561795, term561795.getClass(), "varStart", 0);
        setField(term561795, term561795.getClass(), "compilerData", null);
        setIntField(term561795, term561795.getClass(), "type", 0);
        setIntField(term561796, term561796.getClass(), "type", 0);
        setField(term561796, term561796.getClass(), "next", null);
        setField(term561796, term561796.getClass(), "first", null);
        setField(term561796, term561796.getClass(), "last", null);
        setField(term561796, term561796.getClass(), "propListHead", null);
        setIntField(term561796, term561796.getClass(), "sourcePosition", 0);
        setField(term561796, term561796.getClass(), "jsType", null);
        setField(term561796, term561796.getClass(), "parent", null);
        setField(term561795, term561795.getClass(), "next", term561796);
        setField(term561795, term561795.getClass(), "first", null);
        setField(term561795, term561795.getClass(), "last", null);
        setField(term561795, term561795.getClass(), "propListHead", null);
        setIntField(term561795, term561795.getClass(), "sourcePosition", 0);
        setField(term561795, term561795.getClass(), "jsType", null);
        setField(term561795, term561795.getClass(), "parent", null);
        setField(term561794, term561794.getClass(), "first", term561795);
        setField(term561794, term561794.getClass(), "last", null);
        setField(term561794, term561794.getClass(), "propListHead", null);
        setIntField(term561794, term561794.getClass(), "sourcePosition", 0);
        setField(term561794, term561794.getClass(), "jsType", null);
        setField(term561794, term561794.getClass(), "parent", null);
        term561744 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term561747 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term561757 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term561744, term561744.getClass(), "number", 0.0);
        setIntField(term561744, term561744.getClass(), "type", 35);
        setField(term561744, term561744.getClass(), "next", null);
        setField(term561747, term561747.getClass(), "functionName", null);
        setBooleanField(term561747, term561747.getClass(), "itsNeedsActivation", false);
        setIntField(term561747, term561747.getClass(), "itsFunctionType", 0);
        setBooleanField(term561747, term561747.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term561747, term561747.getClass(), "encodedSourceStart", 0);
        setIntField(term561747, term561747.getClass(), "encodedSourceEnd", 0);
        setField(term561747, term561747.getClass(), "sourceName", null);
        setIntField(term561747, term561747.getClass(), "baseLineno", 0);
        setIntField(term561747, term561747.getClass(), "endLineno", 0);
        setField(term561747, term561747.getClass(), "functions", null);
        setField(term561747, term561747.getClass(), "regexps", null);
        setField(term561747, term561747.getClass(), "itsVariables", null);
        setField(term561747, term561747.getClass(), "itsConst", null);
        setField(term561747, term561747.getClass(), "itsVariableNames", null);
        setIntField(term561747, term561747.getClass(), "varStart", 0);
        setField(term561747, term561747.getClass(), "compilerData", null);
        setIntField(term561747, term561747.getClass(), "type", 0);
        setIntField(term561757, term561757.getClass(), "type", 0);
        setField(term561757, term561757.getClass(), "next", null);
        setField(term561757, term561757.getClass(), "first", null);
        setField(term561757, term561757.getClass(), "last", null);
        setField(term561757, term561757.getClass(), "propListHead", null);
        setIntField(term561757, term561757.getClass(), "sourcePosition", 0);
        setField(term561757, term561757.getClass(), "jsType", null);
        setField(term561757, term561757.getClass(), "parent", null);
        setField(term561747, term561747.getClass(), "next", term561757);
        setField(term561747, term561747.getClass(), "first", null);
        setField(term561747, term561747.getClass(), "last", null);
        setField(term561747, term561747.getClass(), "propListHead", null);
        setIntField(term561747, term561747.getClass(), "sourcePosition", 0);
        setField(term561747, term561747.getClass(), "jsType", null);
        setField(term561747, term561747.getClass(), "parent", null);
        setField(term561744, term561744.getClass(), "first", term561747);
        setField(term561744, term561744.getClass(), "last", null);
        setField(term561744, term561744.getClass(), "propListHead", null);
        setIntField(term561744, term561744.getClass(), "sourcePosition", 0);
        setField(term561744, term561744.getClass(), "jsType", null);
        setField(term561744, term561744.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term561573;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term561481, args);
        assertTrue(recursiveEquals(term561481, term561793));
        assertTrue(recursiveEquals(term561573, term561794));
        assertTrue(recursiveEquals(retValue, term561744));
    }

};


