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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term332262;
     Object term332348;
     Object term333082;
     Object term333083;
     Object term332998;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term332262 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term332348 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term332434 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term332526 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term332526, term332526.getClass(), "type", 106);
        setField(term332434, term332434.getClass(), "next", term332526);
        setIntField(term332434, term332434.getClass(), "type", 42);
        setField(term332348, term332348.getClass(), "first", term332434);
        setIntField(term332348, term332348.getClass(), "type", 14);
        term333082 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term333082, term333082.getClass(), "currentTraversal", null);
        term333083 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term333084 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term333085 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term333083, term333083.getClass(), "functionName", null);
        setBooleanField(term333083, term333083.getClass(), "itsNeedsActivation", false);
        setIntField(term333083, term333083.getClass(), "itsFunctionType", 0);
        setBooleanField(term333083, term333083.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term333083, term333083.getClass(), "encodedSourceStart", 0);
        setIntField(term333083, term333083.getClass(), "encodedSourceEnd", 0);
        setField(term333083, term333083.getClass(), "sourceName", null);
        setIntField(term333083, term333083.getClass(), "baseLineno", 0);
        setIntField(term333083, term333083.getClass(), "endLineno", 0);
        setField(term333083, term333083.getClass(), "functions", null);
        setField(term333083, term333083.getClass(), "regexps", null);
        setField(term333083, term333083.getClass(), "itsVariables", null);
        setField(term333083, term333083.getClass(), "itsConst", null);
        setField(term333083, term333083.getClass(), "itsVariableNames", null);
        setIntField(term333083, term333083.getClass(), "varStart", 0);
        setField(term333083, term333083.getClass(), "compilerData", null);
        setIntField(term333083, term333083.getClass(), "type", 14);
        setField(term333083, term333083.getClass(), "next", null);
        setField(term333084, term333084.getClass(), "functionName", null);
        setBooleanField(term333084, term333084.getClass(), "itsNeedsActivation", false);
        setIntField(term333084, term333084.getClass(), "itsFunctionType", 0);
        setBooleanField(term333084, term333084.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term333084, term333084.getClass(), "encodedSourceStart", 0);
        setIntField(term333084, term333084.getClass(), "encodedSourceEnd", 0);
        setField(term333084, term333084.getClass(), "sourceName", null);
        setIntField(term333084, term333084.getClass(), "baseLineno", 0);
        setIntField(term333084, term333084.getClass(), "endLineno", 0);
        setField(term333084, term333084.getClass(), "functions", null);
        setField(term333084, term333084.getClass(), "regexps", null);
        setField(term333084, term333084.getClass(), "itsVariables", null);
        setField(term333084, term333084.getClass(), "itsConst", null);
        setField(term333084, term333084.getClass(), "itsVariableNames", null);
        setIntField(term333084, term333084.getClass(), "varStart", 0);
        setField(term333084, term333084.getClass(), "compilerData", null);
        setIntField(term333084, term333084.getClass(), "type", 42);
        setDoubleField(term333085, term333085.getClass(), "number", 0.0);
        setIntField(term333085, term333085.getClass(), "type", 106);
        setField(term333085, term333085.getClass(), "next", null);
        setField(term333085, term333085.getClass(), "first", null);
        setField(term333085, term333085.getClass(), "last", null);
        setField(term333085, term333085.getClass(), "propListHead", null);
        setIntField(term333085, term333085.getClass(), "sourcePosition", 0);
        setField(term333085, term333085.getClass(), "jsType", null);
        setField(term333085, term333085.getClass(), "parent", null);
        setField(term333084, term333084.getClass(), "next", term333085);
        setField(term333084, term333084.getClass(), "first", null);
        setField(term333084, term333084.getClass(), "last", null);
        setField(term333084, term333084.getClass(), "propListHead", null);
        setIntField(term333084, term333084.getClass(), "sourcePosition", 0);
        setField(term333084, term333084.getClass(), "jsType", null);
        setField(term333084, term333084.getClass(), "parent", null);
        setField(term333083, term333083.getClass(), "first", term333084);
        setField(term333083, term333083.getClass(), "last", null);
        setField(term333083, term333083.getClass(), "propListHead", null);
        setIntField(term333083, term333083.getClass(), "sourcePosition", 0);
        setField(term333083, term333083.getClass(), "jsType", null);
        setField(term333083, term333083.getClass(), "parent", null);
        term332998 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term333008 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term333018 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term332998, term332998.getClass(), "functionName", null);
        setBooleanField(term332998, term332998.getClass(), "itsNeedsActivation", false);
        setIntField(term332998, term332998.getClass(), "itsFunctionType", 0);
        setBooleanField(term332998, term332998.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term332998, term332998.getClass(), "encodedSourceStart", 0);
        setIntField(term332998, term332998.getClass(), "encodedSourceEnd", 0);
        setField(term332998, term332998.getClass(), "sourceName", null);
        setIntField(term332998, term332998.getClass(), "baseLineno", 0);
        setIntField(term332998, term332998.getClass(), "endLineno", 0);
        setField(term332998, term332998.getClass(), "functions", null);
        setField(term332998, term332998.getClass(), "regexps", null);
        setField(term332998, term332998.getClass(), "itsVariables", null);
        setField(term332998, term332998.getClass(), "itsConst", null);
        setField(term332998, term332998.getClass(), "itsVariableNames", null);
        setIntField(term332998, term332998.getClass(), "varStart", 0);
        setField(term332998, term332998.getClass(), "compilerData", null);
        setIntField(term332998, term332998.getClass(), "type", 14);
        setField(term332998, term332998.getClass(), "next", null);
        setField(term333008, term333008.getClass(), "functionName", null);
        setBooleanField(term333008, term333008.getClass(), "itsNeedsActivation", false);
        setIntField(term333008, term333008.getClass(), "itsFunctionType", 0);
        setBooleanField(term333008, term333008.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term333008, term333008.getClass(), "encodedSourceStart", 0);
        setIntField(term333008, term333008.getClass(), "encodedSourceEnd", 0);
        setField(term333008, term333008.getClass(), "sourceName", null);
        setIntField(term333008, term333008.getClass(), "baseLineno", 0);
        setIntField(term333008, term333008.getClass(), "endLineno", 0);
        setField(term333008, term333008.getClass(), "functions", null);
        setField(term333008, term333008.getClass(), "regexps", null);
        setField(term333008, term333008.getClass(), "itsVariables", null);
        setField(term333008, term333008.getClass(), "itsConst", null);
        setField(term333008, term333008.getClass(), "itsVariableNames", null);
        setIntField(term333008, term333008.getClass(), "varStart", 0);
        setField(term333008, term333008.getClass(), "compilerData", null);
        setIntField(term333008, term333008.getClass(), "type", 42);
        setDoubleField(term333018, term333018.getClass(), "number", 0.0);
        setIntField(term333018, term333018.getClass(), "type", 106);
        setField(term333018, term333018.getClass(), "next", null);
        setField(term333018, term333018.getClass(), "first", null);
        setField(term333018, term333018.getClass(), "last", null);
        setField(term333018, term333018.getClass(), "propListHead", null);
        setIntField(term333018, term333018.getClass(), "sourcePosition", 0);
        setField(term333018, term333018.getClass(), "jsType", null);
        setField(term333018, term333018.getClass(), "parent", null);
        setField(term333008, term333008.getClass(), "next", term333018);
        setField(term333008, term333008.getClass(), "first", null);
        setField(term333008, term333008.getClass(), "last", null);
        setField(term333008, term333008.getClass(), "propListHead", null);
        setIntField(term333008, term333008.getClass(), "sourcePosition", 0);
        setField(term333008, term333008.getClass(), "jsType", null);
        setField(term333008, term333008.getClass(), "parent", null);
        setField(term332998, term332998.getClass(), "first", term333008);
        setField(term332998, term332998.getClass(), "last", null);
        setField(term332998, term332998.getClass(), "propListHead", null);
        setIntField(term332998, term332998.getClass(), "sourcePosition", 0);
        setField(term332998, term332998.getClass(), "jsType", null);
        setField(term332998, term332998.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term332348;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term332262, args);
        assertTrue(recursiveEquals(term332262, term333082));
        assertTrue(recursiveEquals(term332348, term333083));
        assertTrue(recursiveEquals(retValue, term332998));
    }

};


