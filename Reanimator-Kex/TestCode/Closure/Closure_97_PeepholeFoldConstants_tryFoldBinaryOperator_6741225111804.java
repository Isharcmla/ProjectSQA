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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111804 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term701159;
     Object term701251;
     Object term701519;
     Object term701520;
     Object term701445;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111804() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term701159 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term701251 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term701343 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term701429 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term701429, term701429.getClass(), "type", 42);
        setField(term701343, term701343.getClass(), "next", term701429);
        setIntField(term701343, term701343.getClass(), "type", 42);
        setField(term701251, term701251.getClass(), "first", term701343);
        setIntField(term701251, term701251.getClass(), "type", 14);
        term701519 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term701519, term701519.getClass(), "currentTraversal", null);
        term701520 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term701521 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term701522 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term701520, term701520.getClass(), "number", 0.0);
        setIntField(term701520, term701520.getClass(), "type", 14);
        setField(term701520, term701520.getClass(), "next", null);
        setDoubleField(term701521, term701521.getClass(), "number", 0.0);
        setIntField(term701521, term701521.getClass(), "type", 42);
        setField(term701522, term701522.getClass(), "functionName", null);
        setBooleanField(term701522, term701522.getClass(), "itsNeedsActivation", false);
        setIntField(term701522, term701522.getClass(), "itsFunctionType", 0);
        setBooleanField(term701522, term701522.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term701522, term701522.getClass(), "encodedSourceStart", 0);
        setIntField(term701522, term701522.getClass(), "encodedSourceEnd", 0);
        setField(term701522, term701522.getClass(), "sourceName", null);
        setIntField(term701522, term701522.getClass(), "baseLineno", 0);
        setIntField(term701522, term701522.getClass(), "endLineno", 0);
        setField(term701522, term701522.getClass(), "functions", null);
        setField(term701522, term701522.getClass(), "regexps", null);
        setField(term701522, term701522.getClass(), "itsVariables", null);
        setField(term701522, term701522.getClass(), "itsConst", null);
        setField(term701522, term701522.getClass(), "itsVariableNames", null);
        setIntField(term701522, term701522.getClass(), "varStart", 0);
        setField(term701522, term701522.getClass(), "compilerData", null);
        setIntField(term701522, term701522.getClass(), "type", 42);
        setField(term701522, term701522.getClass(), "next", null);
        setField(term701522, term701522.getClass(), "first", null);
        setField(term701522, term701522.getClass(), "last", null);
        setField(term701522, term701522.getClass(), "propListHead", null);
        setIntField(term701522, term701522.getClass(), "sourcePosition", 0);
        setField(term701522, term701522.getClass(), "jsType", null);
        setField(term701522, term701522.getClass(), "parent", null);
        setField(term701521, term701521.getClass(), "next", term701522);
        setField(term701521, term701521.getClass(), "first", null);
        setField(term701521, term701521.getClass(), "last", null);
        setField(term701521, term701521.getClass(), "propListHead", null);
        setIntField(term701521, term701521.getClass(), "sourcePosition", 0);
        setField(term701521, term701521.getClass(), "jsType", null);
        setField(term701521, term701521.getClass(), "parent", null);
        setField(term701520, term701520.getClass(), "first", term701521);
        setField(term701520, term701520.getClass(), "last", null);
        setField(term701520, term701520.getClass(), "propListHead", null);
        setIntField(term701520, term701520.getClass(), "sourcePosition", 0);
        setField(term701520, term701520.getClass(), "jsType", null);
        setField(term701520, term701520.getClass(), "parent", null);
        term701445 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term701448 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term701451 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term701445, term701445.getClass(), "number", 0.0);
        setIntField(term701445, term701445.getClass(), "type", 14);
        setField(term701445, term701445.getClass(), "next", null);
        setDoubleField(term701448, term701448.getClass(), "number", 0.0);
        setIntField(term701448, term701448.getClass(), "type", 42);
        setField(term701451, term701451.getClass(), "functionName", null);
        setBooleanField(term701451, term701451.getClass(), "itsNeedsActivation", false);
        setIntField(term701451, term701451.getClass(), "itsFunctionType", 0);
        setBooleanField(term701451, term701451.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term701451, term701451.getClass(), "encodedSourceStart", 0);
        setIntField(term701451, term701451.getClass(), "encodedSourceEnd", 0);
        setField(term701451, term701451.getClass(), "sourceName", null);
        setIntField(term701451, term701451.getClass(), "baseLineno", 0);
        setIntField(term701451, term701451.getClass(), "endLineno", 0);
        setField(term701451, term701451.getClass(), "functions", null);
        setField(term701451, term701451.getClass(), "regexps", null);
        setField(term701451, term701451.getClass(), "itsVariables", null);
        setField(term701451, term701451.getClass(), "itsConst", null);
        setField(term701451, term701451.getClass(), "itsVariableNames", null);
        setIntField(term701451, term701451.getClass(), "varStart", 0);
        setField(term701451, term701451.getClass(), "compilerData", null);
        setIntField(term701451, term701451.getClass(), "type", 42);
        setField(term701451, term701451.getClass(), "next", null);
        setField(term701451, term701451.getClass(), "first", null);
        setField(term701451, term701451.getClass(), "last", null);
        setField(term701451, term701451.getClass(), "propListHead", null);
        setIntField(term701451, term701451.getClass(), "sourcePosition", 0);
        setField(term701451, term701451.getClass(), "jsType", null);
        setField(term701451, term701451.getClass(), "parent", null);
        setField(term701448, term701448.getClass(), "next", term701451);
        setField(term701448, term701448.getClass(), "first", null);
        setField(term701448, term701448.getClass(), "last", null);
        setField(term701448, term701448.getClass(), "propListHead", null);
        setIntField(term701448, term701448.getClass(), "sourcePosition", 0);
        setField(term701448, term701448.getClass(), "jsType", null);
        setField(term701448, term701448.getClass(), "parent", null);
        setField(term701445, term701445.getClass(), "first", term701448);
        setField(term701445, term701445.getClass(), "last", null);
        setField(term701445, term701445.getClass(), "propListHead", null);
        setIntField(term701445, term701445.getClass(), "sourcePosition", 0);
        setField(term701445, term701445.getClass(), "jsType", null);
        setField(term701445, term701445.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term701251;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term701159, args);
        assertTrue(recursiveEquals(term701159, term701519));
        assertTrue(recursiveEquals(term701251, term701520));
        assertTrue(recursiveEquals(retValue, term701445));
    }

};


