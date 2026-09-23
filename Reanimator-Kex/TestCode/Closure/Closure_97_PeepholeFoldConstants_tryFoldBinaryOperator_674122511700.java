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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511700 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180032;
     Object term180124;
     Object term180453;
     Object term180454;
     Object term180372;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511700() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term180032 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term180124 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term180216 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term180302 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term180216, term180216.getClass(), "next", term180302);
        setIntField(term180216, term180216.getClass(), "type", 0);
        setField(term180124, term180124.getClass(), "first", term180216);
        setIntField(term180124, term180124.getClass(), "type", 101);
        setField(term180124, term180124.getClass(), "parent", null);
        term180453 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term180453, term180453.getClass(), "currentTraversal", null);
        term180454 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term180455 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term180456 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term180454, term180454.getClass(), "number", 0.0);
        setIntField(term180454, term180454.getClass(), "type", 101);
        setField(term180454, term180454.getClass(), "next", null);
        setDoubleField(term180455, term180455.getClass(), "number", 0.0);
        setIntField(term180455, term180455.getClass(), "type", 0);
        setField(term180456, term180456.getClass(), "functionName", null);
        setBooleanField(term180456, term180456.getClass(), "itsNeedsActivation", false);
        setIntField(term180456, term180456.getClass(), "itsFunctionType", 0);
        setBooleanField(term180456, term180456.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term180456, term180456.getClass(), "encodedSourceStart", 0);
        setIntField(term180456, term180456.getClass(), "encodedSourceEnd", 0);
        setField(term180456, term180456.getClass(), "sourceName", null);
        setIntField(term180456, term180456.getClass(), "baseLineno", 0);
        setIntField(term180456, term180456.getClass(), "endLineno", 0);
        setField(term180456, term180456.getClass(), "functions", null);
        setField(term180456, term180456.getClass(), "regexps", null);
        setField(term180456, term180456.getClass(), "itsVariables", null);
        setField(term180456, term180456.getClass(), "itsConst", null);
        setField(term180456, term180456.getClass(), "itsVariableNames", null);
        setIntField(term180456, term180456.getClass(), "varStart", 0);
        setField(term180456, term180456.getClass(), "compilerData", null);
        setIntField(term180456, term180456.getClass(), "type", 0);
        setField(term180456, term180456.getClass(), "next", null);
        setField(term180456, term180456.getClass(), "first", null);
        setField(term180456, term180456.getClass(), "last", null);
        setField(term180456, term180456.getClass(), "propListHead", null);
        setIntField(term180456, term180456.getClass(), "sourcePosition", 0);
        setField(term180456, term180456.getClass(), "jsType", null);
        setField(term180456, term180456.getClass(), "parent", null);
        setField(term180455, term180455.getClass(), "next", term180456);
        setField(term180455, term180455.getClass(), "first", null);
        setField(term180455, term180455.getClass(), "last", null);
        setField(term180455, term180455.getClass(), "propListHead", null);
        setIntField(term180455, term180455.getClass(), "sourcePosition", 0);
        setField(term180455, term180455.getClass(), "jsType", null);
        setField(term180455, term180455.getClass(), "parent", null);
        setField(term180454, term180454.getClass(), "first", term180455);
        setField(term180454, term180454.getClass(), "last", null);
        setField(term180454, term180454.getClass(), "propListHead", null);
        setIntField(term180454, term180454.getClass(), "sourcePosition", 0);
        setField(term180454, term180454.getClass(), "jsType", null);
        setField(term180454, term180454.getClass(), "parent", null);
        term180372 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term180375 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term180378 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term180372, term180372.getClass(), "number", 0.0);
        setIntField(term180372, term180372.getClass(), "type", 101);
        setField(term180372, term180372.getClass(), "next", null);
        setDoubleField(term180375, term180375.getClass(), "number", 0.0);
        setIntField(term180375, term180375.getClass(), "type", 0);
        setField(term180378, term180378.getClass(), "functionName", null);
        setBooleanField(term180378, term180378.getClass(), "itsNeedsActivation", false);
        setIntField(term180378, term180378.getClass(), "itsFunctionType", 0);
        setBooleanField(term180378, term180378.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term180378, term180378.getClass(), "encodedSourceStart", 0);
        setIntField(term180378, term180378.getClass(), "encodedSourceEnd", 0);
        setField(term180378, term180378.getClass(), "sourceName", null);
        setIntField(term180378, term180378.getClass(), "baseLineno", 0);
        setIntField(term180378, term180378.getClass(), "endLineno", 0);
        setField(term180378, term180378.getClass(), "functions", null);
        setField(term180378, term180378.getClass(), "regexps", null);
        setField(term180378, term180378.getClass(), "itsVariables", null);
        setField(term180378, term180378.getClass(), "itsConst", null);
        setField(term180378, term180378.getClass(), "itsVariableNames", null);
        setIntField(term180378, term180378.getClass(), "varStart", 0);
        setField(term180378, term180378.getClass(), "compilerData", null);
        setIntField(term180378, term180378.getClass(), "type", 0);
        setField(term180378, term180378.getClass(), "next", null);
        setField(term180378, term180378.getClass(), "first", null);
        setField(term180378, term180378.getClass(), "last", null);
        setField(term180378, term180378.getClass(), "propListHead", null);
        setIntField(term180378, term180378.getClass(), "sourcePosition", 0);
        setField(term180378, term180378.getClass(), "jsType", null);
        setField(term180378, term180378.getClass(), "parent", null);
        setField(term180375, term180375.getClass(), "next", term180378);
        setField(term180375, term180375.getClass(), "first", null);
        setField(term180375, term180375.getClass(), "last", null);
        setField(term180375, term180375.getClass(), "propListHead", null);
        setIntField(term180375, term180375.getClass(), "sourcePosition", 0);
        setField(term180375, term180375.getClass(), "jsType", null);
        setField(term180375, term180375.getClass(), "parent", null);
        setField(term180372, term180372.getClass(), "first", term180375);
        setField(term180372, term180372.getClass(), "last", null);
        setField(term180372, term180372.getClass(), "propListHead", null);
        setIntField(term180372, term180372.getClass(), "sourcePosition", 0);
        setField(term180372, term180372.getClass(), "jsType", null);
        setField(term180372, term180372.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term180124;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term180032, args);
        assertTrue(recursiveEquals(term180032, term180453));
        assertTrue(recursiveEquals(term180124, term180454));
        assertTrue(recursiveEquals(retValue, term180372));
    }

};


