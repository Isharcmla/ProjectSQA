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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2643411;
     Object term2643503;
     Object term2644379;
     Object term2644380;
     Object term2644251;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2643411 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term2643503 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2643589 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2643659 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2643745 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term2643503, term2643503.getClass(), "type", 37);
        setIntField(term2643589, term2643589.getClass(), "type", 33);
        setField(term2643659, term2643659.getClass(), "next", term2643745);
        setIntField(term2643659, term2643659.getClass(), "type", 40);
        setField(term2643589, term2643589.getClass(), "first", term2643659);
        setField(term2643503, term2643503.getClass(), "first", term2643589);
        term2644379 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term2644379, term2644379.getClass(), "currentTraversal", null);
        term2644380 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2644381 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2644382 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2644383 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term2644380, term2644380.getClass(), "number", 0.0);
        setIntField(term2644380, term2644380.getClass(), "type", 37);
        setField(term2644380, term2644380.getClass(), "next", null);
        setField(term2644381, term2644381.getClass(), "functionName", null);
        setBooleanField(term2644381, term2644381.getClass(), "itsNeedsActivation", false);
        setIntField(term2644381, term2644381.getClass(), "itsFunctionType", 0);
        setBooleanField(term2644381, term2644381.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term2644381, term2644381.getClass(), "encodedSourceStart", 0);
        setIntField(term2644381, term2644381.getClass(), "encodedSourceEnd", 0);
        setField(term2644381, term2644381.getClass(), "sourceName", null);
        setIntField(term2644381, term2644381.getClass(), "baseLineno", 0);
        setIntField(term2644381, term2644381.getClass(), "endLineno", 0);
        setField(term2644381, term2644381.getClass(), "functions", null);
        setField(term2644381, term2644381.getClass(), "regexps", null);
        setField(term2644381, term2644381.getClass(), "itsVariables", null);
        setField(term2644381, term2644381.getClass(), "itsConst", null);
        setField(term2644381, term2644381.getClass(), "itsVariableNames", null);
        setIntField(term2644381, term2644381.getClass(), "varStart", 0);
        setField(term2644381, term2644381.getClass(), "compilerData", null);
        setIntField(term2644381, term2644381.getClass(), "type", 33);
        setField(term2644381, term2644381.getClass(), "next", null);
        setIntField(term2644382, term2644382.getClass(), "type", 40);
        setField(term2644383, term2644383.getClass(), "functionName", null);
        setBooleanField(term2644383, term2644383.getClass(), "itsNeedsActivation", false);
        setIntField(term2644383, term2644383.getClass(), "itsFunctionType", 0);
        setBooleanField(term2644383, term2644383.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term2644383, term2644383.getClass(), "encodedSourceStart", 0);
        setIntField(term2644383, term2644383.getClass(), "encodedSourceEnd", 0);
        setField(term2644383, term2644383.getClass(), "sourceName", null);
        setIntField(term2644383, term2644383.getClass(), "baseLineno", 0);
        setIntField(term2644383, term2644383.getClass(), "endLineno", 0);
        setField(term2644383, term2644383.getClass(), "functions", null);
        setField(term2644383, term2644383.getClass(), "regexps", null);
        setField(term2644383, term2644383.getClass(), "itsVariables", null);
        setField(term2644383, term2644383.getClass(), "itsConst", null);
        setField(term2644383, term2644383.getClass(), "itsVariableNames", null);
        setIntField(term2644383, term2644383.getClass(), "varStart", 0);
        setField(term2644383, term2644383.getClass(), "compilerData", null);
        setIntField(term2644383, term2644383.getClass(), "type", 0);
        setField(term2644383, term2644383.getClass(), "next", null);
        setField(term2644383, term2644383.getClass(), "first", null);
        setField(term2644383, term2644383.getClass(), "last", null);
        setField(term2644383, term2644383.getClass(), "propListHead", null);
        setIntField(term2644383, term2644383.getClass(), "sourcePosition", 0);
        setField(term2644383, term2644383.getClass(), "jsType", null);
        setField(term2644383, term2644383.getClass(), "parent", null);
        setField(term2644382, term2644382.getClass(), "next", term2644383);
        setField(term2644382, term2644382.getClass(), "first", null);
        setField(term2644382, term2644382.getClass(), "last", null);
        setField(term2644382, term2644382.getClass(), "propListHead", null);
        setIntField(term2644382, term2644382.getClass(), "sourcePosition", 0);
        setField(term2644382, term2644382.getClass(), "jsType", null);
        setField(term2644382, term2644382.getClass(), "parent", null);
        setField(term2644381, term2644381.getClass(), "first", term2644382);
        setField(term2644381, term2644381.getClass(), "last", null);
        setField(term2644381, term2644381.getClass(), "propListHead", null);
        setIntField(term2644381, term2644381.getClass(), "sourcePosition", 0);
        setField(term2644381, term2644381.getClass(), "jsType", null);
        setField(term2644381, term2644381.getClass(), "parent", null);
        setField(term2644380, term2644380.getClass(), "first", term2644381);
        setField(term2644380, term2644380.getClass(), "last", null);
        setField(term2644380, term2644380.getClass(), "propListHead", null);
        setIntField(term2644380, term2644380.getClass(), "sourcePosition", 0);
        setField(term2644380, term2644380.getClass(), "jsType", null);
        setField(term2644380, term2644380.getClass(), "parent", null);
        term2644251 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2644254 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2644264 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2644266 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term2644251, term2644251.getClass(), "number", 0.0);
        setIntField(term2644251, term2644251.getClass(), "type", 37);
        setField(term2644251, term2644251.getClass(), "next", null);
        setField(term2644254, term2644254.getClass(), "functionName", null);
        setBooleanField(term2644254, term2644254.getClass(), "itsNeedsActivation", false);
        setIntField(term2644254, term2644254.getClass(), "itsFunctionType", 0);
        setBooleanField(term2644254, term2644254.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term2644254, term2644254.getClass(), "encodedSourceStart", 0);
        setIntField(term2644254, term2644254.getClass(), "encodedSourceEnd", 0);
        setField(term2644254, term2644254.getClass(), "sourceName", null);
        setIntField(term2644254, term2644254.getClass(), "baseLineno", 0);
        setIntField(term2644254, term2644254.getClass(), "endLineno", 0);
        setField(term2644254, term2644254.getClass(), "functions", null);
        setField(term2644254, term2644254.getClass(), "regexps", null);
        setField(term2644254, term2644254.getClass(), "itsVariables", null);
        setField(term2644254, term2644254.getClass(), "itsConst", null);
        setField(term2644254, term2644254.getClass(), "itsVariableNames", null);
        setIntField(term2644254, term2644254.getClass(), "varStart", 0);
        setField(term2644254, term2644254.getClass(), "compilerData", null);
        setIntField(term2644254, term2644254.getClass(), "type", 33);
        setField(term2644254, term2644254.getClass(), "next", null);
        setIntField(term2644264, term2644264.getClass(), "type", 40);
        setField(term2644266, term2644266.getClass(), "functionName", null);
        setBooleanField(term2644266, term2644266.getClass(), "itsNeedsActivation", false);
        setIntField(term2644266, term2644266.getClass(), "itsFunctionType", 0);
        setBooleanField(term2644266, term2644266.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term2644266, term2644266.getClass(), "encodedSourceStart", 0);
        setIntField(term2644266, term2644266.getClass(), "encodedSourceEnd", 0);
        setField(term2644266, term2644266.getClass(), "sourceName", null);
        setIntField(term2644266, term2644266.getClass(), "baseLineno", 0);
        setIntField(term2644266, term2644266.getClass(), "endLineno", 0);
        setField(term2644266, term2644266.getClass(), "functions", null);
        setField(term2644266, term2644266.getClass(), "regexps", null);
        setField(term2644266, term2644266.getClass(), "itsVariables", null);
        setField(term2644266, term2644266.getClass(), "itsConst", null);
        setField(term2644266, term2644266.getClass(), "itsVariableNames", null);
        setIntField(term2644266, term2644266.getClass(), "varStart", 0);
        setField(term2644266, term2644266.getClass(), "compilerData", null);
        setIntField(term2644266, term2644266.getClass(), "type", 0);
        setField(term2644266, term2644266.getClass(), "next", null);
        setField(term2644266, term2644266.getClass(), "first", null);
        setField(term2644266, term2644266.getClass(), "last", null);
        setField(term2644266, term2644266.getClass(), "propListHead", null);
        setIntField(term2644266, term2644266.getClass(), "sourcePosition", 0);
        setField(term2644266, term2644266.getClass(), "jsType", null);
        setField(term2644266, term2644266.getClass(), "parent", null);
        setField(term2644264, term2644264.getClass(), "next", term2644266);
        setField(term2644264, term2644264.getClass(), "first", null);
        setField(term2644264, term2644264.getClass(), "last", null);
        setField(term2644264, term2644264.getClass(), "propListHead", null);
        setIntField(term2644264, term2644264.getClass(), "sourcePosition", 0);
        setField(term2644264, term2644264.getClass(), "jsType", null);
        setField(term2644264, term2644264.getClass(), "parent", null);
        setField(term2644254, term2644254.getClass(), "first", term2644264);
        setField(term2644254, term2644254.getClass(), "last", null);
        setField(term2644254, term2644254.getClass(), "propListHead", null);
        setIntField(term2644254, term2644254.getClass(), "sourcePosition", 0);
        setField(term2644254, term2644254.getClass(), "jsType", null);
        setField(term2644254, term2644254.getClass(), "parent", null);
        setField(term2644251, term2644251.getClass(), "first", term2644254);
        setField(term2644251, term2644251.getClass(), "last", null);
        setField(term2644251, term2644251.getClass(), "propListHead", null);
        setIntField(term2644251, term2644251.getClass(), "sourcePosition", 0);
        setField(term2644251, term2644251.getClass(), "jsType", null);
        setField(term2644251, term2644251.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2643503;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term2643411, args);
        assertTrue(recursiveEquals(term2643411, term2644379));
        assertTrue(recursiveEquals(term2643503, term2644380));
        assertTrue(recursiveEquals(retValue, term2644251));
    }

};


