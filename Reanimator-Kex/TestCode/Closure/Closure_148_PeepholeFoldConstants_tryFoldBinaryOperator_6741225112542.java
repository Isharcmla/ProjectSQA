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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112542 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term718065;
     Object term718151;
     Object term718508;
     Object term718509;
     Object term718440;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112542() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term718065 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term718151 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term718237 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term718329 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term718237, term718237.getClass(), "next", term718329);
        setIntField(term718237, term718237.getClass(), "type", 63);
        setField(term718151, term718151.getClass(), "first", term718237);
        setIntField(term718151, term718151.getClass(), "type", 35);
        term718508 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term718508, term718508.getClass(), "currentTraversal", null);
        term718509 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term718510 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term718511 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term718509, term718509.getClass(), "functionName", null);
        setBooleanField(term718509, term718509.getClass(), "itsNeedsActivation", false);
        setIntField(term718509, term718509.getClass(), "itsFunctionType", 0);
        setBooleanField(term718509, term718509.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term718509, term718509.getClass(), "encodedSourceStart", 0);
        setIntField(term718509, term718509.getClass(), "encodedSourceEnd", 0);
        setField(term718509, term718509.getClass(), "sourceName", null);
        setIntField(term718509, term718509.getClass(), "baseLineno", 0);
        setIntField(term718509, term718509.getClass(), "endLineno", 0);
        setField(term718509, term718509.getClass(), "functions", null);
        setField(term718509, term718509.getClass(), "regexps", null);
        setField(term718509, term718509.getClass(), "itsVariables", null);
        setField(term718509, term718509.getClass(), "itsConst", null);
        setField(term718509, term718509.getClass(), "itsVariableNames", null);
        setIntField(term718509, term718509.getClass(), "varStart", 0);
        setField(term718509, term718509.getClass(), "compilerData", null);
        setIntField(term718509, term718509.getClass(), "type", 35);
        setField(term718509, term718509.getClass(), "next", null);
        setField(term718510, term718510.getClass(), "functionName", null);
        setBooleanField(term718510, term718510.getClass(), "itsNeedsActivation", false);
        setIntField(term718510, term718510.getClass(), "itsFunctionType", 0);
        setBooleanField(term718510, term718510.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term718510, term718510.getClass(), "encodedSourceStart", 0);
        setIntField(term718510, term718510.getClass(), "encodedSourceEnd", 0);
        setField(term718510, term718510.getClass(), "sourceName", null);
        setIntField(term718510, term718510.getClass(), "baseLineno", 0);
        setIntField(term718510, term718510.getClass(), "endLineno", 0);
        setField(term718510, term718510.getClass(), "functions", null);
        setField(term718510, term718510.getClass(), "regexps", null);
        setField(term718510, term718510.getClass(), "itsVariables", null);
        setField(term718510, term718510.getClass(), "itsConst", null);
        setField(term718510, term718510.getClass(), "itsVariableNames", null);
        setIntField(term718510, term718510.getClass(), "varStart", 0);
        setField(term718510, term718510.getClass(), "compilerData", null);
        setIntField(term718510, term718510.getClass(), "type", 63);
        setDoubleField(term718511, term718511.getClass(), "number", 0.0);
        setIntField(term718511, term718511.getClass(), "type", 0);
        setField(term718511, term718511.getClass(), "next", null);
        setField(term718511, term718511.getClass(), "first", null);
        setField(term718511, term718511.getClass(), "last", null);
        setField(term718511, term718511.getClass(), "propListHead", null);
        setIntField(term718511, term718511.getClass(), "sourcePosition", 0);
        setField(term718511, term718511.getClass(), "jsType", null);
        setField(term718511, term718511.getClass(), "parent", null);
        setField(term718510, term718510.getClass(), "next", term718511);
        setField(term718510, term718510.getClass(), "first", null);
        setField(term718510, term718510.getClass(), "last", null);
        setField(term718510, term718510.getClass(), "propListHead", null);
        setIntField(term718510, term718510.getClass(), "sourcePosition", 0);
        setField(term718510, term718510.getClass(), "jsType", null);
        setField(term718510, term718510.getClass(), "parent", null);
        setField(term718509, term718509.getClass(), "first", term718510);
        setField(term718509, term718509.getClass(), "last", null);
        setField(term718509, term718509.getClass(), "propListHead", null);
        setIntField(term718509, term718509.getClass(), "sourcePosition", 0);
        setField(term718509, term718509.getClass(), "jsType", null);
        setField(term718509, term718509.getClass(), "parent", null);
        term718440 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term718450 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term718460 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term718440, term718440.getClass(), "functionName", null);
        setBooleanField(term718440, term718440.getClass(), "itsNeedsActivation", false);
        setIntField(term718440, term718440.getClass(), "itsFunctionType", 0);
        setBooleanField(term718440, term718440.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term718440, term718440.getClass(), "encodedSourceStart", 0);
        setIntField(term718440, term718440.getClass(), "encodedSourceEnd", 0);
        setField(term718440, term718440.getClass(), "sourceName", null);
        setIntField(term718440, term718440.getClass(), "baseLineno", 0);
        setIntField(term718440, term718440.getClass(), "endLineno", 0);
        setField(term718440, term718440.getClass(), "functions", null);
        setField(term718440, term718440.getClass(), "regexps", null);
        setField(term718440, term718440.getClass(), "itsVariables", null);
        setField(term718440, term718440.getClass(), "itsConst", null);
        setField(term718440, term718440.getClass(), "itsVariableNames", null);
        setIntField(term718440, term718440.getClass(), "varStart", 0);
        setField(term718440, term718440.getClass(), "compilerData", null);
        setIntField(term718440, term718440.getClass(), "type", 35);
        setField(term718440, term718440.getClass(), "next", null);
        setField(term718450, term718450.getClass(), "functionName", null);
        setBooleanField(term718450, term718450.getClass(), "itsNeedsActivation", false);
        setIntField(term718450, term718450.getClass(), "itsFunctionType", 0);
        setBooleanField(term718450, term718450.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term718450, term718450.getClass(), "encodedSourceStart", 0);
        setIntField(term718450, term718450.getClass(), "encodedSourceEnd", 0);
        setField(term718450, term718450.getClass(), "sourceName", null);
        setIntField(term718450, term718450.getClass(), "baseLineno", 0);
        setIntField(term718450, term718450.getClass(), "endLineno", 0);
        setField(term718450, term718450.getClass(), "functions", null);
        setField(term718450, term718450.getClass(), "regexps", null);
        setField(term718450, term718450.getClass(), "itsVariables", null);
        setField(term718450, term718450.getClass(), "itsConst", null);
        setField(term718450, term718450.getClass(), "itsVariableNames", null);
        setIntField(term718450, term718450.getClass(), "varStart", 0);
        setField(term718450, term718450.getClass(), "compilerData", null);
        setIntField(term718450, term718450.getClass(), "type", 63);
        setDoubleField(term718460, term718460.getClass(), "number", 0.0);
        setIntField(term718460, term718460.getClass(), "type", 0);
        setField(term718460, term718460.getClass(), "next", null);
        setField(term718460, term718460.getClass(), "first", null);
        setField(term718460, term718460.getClass(), "last", null);
        setField(term718460, term718460.getClass(), "propListHead", null);
        setIntField(term718460, term718460.getClass(), "sourcePosition", 0);
        setField(term718460, term718460.getClass(), "jsType", null);
        setField(term718460, term718460.getClass(), "parent", null);
        setField(term718450, term718450.getClass(), "next", term718460);
        setField(term718450, term718450.getClass(), "first", null);
        setField(term718450, term718450.getClass(), "last", null);
        setField(term718450, term718450.getClass(), "propListHead", null);
        setIntField(term718450, term718450.getClass(), "sourcePosition", 0);
        setField(term718450, term718450.getClass(), "jsType", null);
        setField(term718450, term718450.getClass(), "parent", null);
        setField(term718440, term718440.getClass(), "first", term718450);
        setField(term718440, term718440.getClass(), "last", null);
        setField(term718440, term718440.getClass(), "propListHead", null);
        setIntField(term718440, term718440.getClass(), "sourcePosition", 0);
        setField(term718440, term718440.getClass(), "jsType", null);
        setField(term718440, term718440.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term718151;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term718065, args);
        assertTrue(recursiveEquals(term718065, term718508));
        assertTrue(recursiveEquals(term718151, term718509));
        assertTrue(recursiveEquals(retValue, term718440));
    }

};


