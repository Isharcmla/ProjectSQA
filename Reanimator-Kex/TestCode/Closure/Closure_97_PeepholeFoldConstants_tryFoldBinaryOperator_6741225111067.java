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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111067 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term331460;
     Object term331546;
     Object term332205;
     Object term332206;
     Object term332126;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111067() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term331460 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term331546 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term331632 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term331724 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term331632, term331632.getClass(), "next", term331724);
        setIntField(term331632, term331632.getClass(), "type", 14);
        setField(term331546, term331546.getClass(), "first", term331632);
        setIntField(term331546, term331546.getClass(), "type", 14);
        term332205 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term332205, term332205.getClass(), "currentTraversal", null);
        term332206 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term332207 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term332208 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term332206, term332206.getClass(), "functionName", null);
        setBooleanField(term332206, term332206.getClass(), "itsNeedsActivation", false);
        setIntField(term332206, term332206.getClass(), "itsFunctionType", 0);
        setBooleanField(term332206, term332206.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term332206, term332206.getClass(), "encodedSourceStart", 0);
        setIntField(term332206, term332206.getClass(), "encodedSourceEnd", 0);
        setField(term332206, term332206.getClass(), "sourceName", null);
        setIntField(term332206, term332206.getClass(), "baseLineno", 0);
        setIntField(term332206, term332206.getClass(), "endLineno", 0);
        setField(term332206, term332206.getClass(), "functions", null);
        setField(term332206, term332206.getClass(), "regexps", null);
        setField(term332206, term332206.getClass(), "itsVariables", null);
        setField(term332206, term332206.getClass(), "itsConst", null);
        setField(term332206, term332206.getClass(), "itsVariableNames", null);
        setIntField(term332206, term332206.getClass(), "varStart", 0);
        setField(term332206, term332206.getClass(), "compilerData", null);
        setIntField(term332206, term332206.getClass(), "type", 14);
        setField(term332206, term332206.getClass(), "next", null);
        setField(term332207, term332207.getClass(), "functionName", null);
        setBooleanField(term332207, term332207.getClass(), "itsNeedsActivation", false);
        setIntField(term332207, term332207.getClass(), "itsFunctionType", 0);
        setBooleanField(term332207, term332207.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term332207, term332207.getClass(), "encodedSourceStart", 0);
        setIntField(term332207, term332207.getClass(), "encodedSourceEnd", 0);
        setField(term332207, term332207.getClass(), "sourceName", null);
        setIntField(term332207, term332207.getClass(), "baseLineno", 0);
        setIntField(term332207, term332207.getClass(), "endLineno", 0);
        setField(term332207, term332207.getClass(), "functions", null);
        setField(term332207, term332207.getClass(), "regexps", null);
        setField(term332207, term332207.getClass(), "itsVariables", null);
        setField(term332207, term332207.getClass(), "itsConst", null);
        setField(term332207, term332207.getClass(), "itsVariableNames", null);
        setIntField(term332207, term332207.getClass(), "varStart", 0);
        setField(term332207, term332207.getClass(), "compilerData", null);
        setIntField(term332207, term332207.getClass(), "type", 14);
        setDoubleField(term332208, term332208.getClass(), "number", 0.0);
        setIntField(term332208, term332208.getClass(), "type", 0);
        setField(term332208, term332208.getClass(), "next", null);
        setField(term332208, term332208.getClass(), "first", null);
        setField(term332208, term332208.getClass(), "last", null);
        setField(term332208, term332208.getClass(), "propListHead", null);
        setIntField(term332208, term332208.getClass(), "sourcePosition", 0);
        setField(term332208, term332208.getClass(), "jsType", null);
        setField(term332208, term332208.getClass(), "parent", null);
        setField(term332207, term332207.getClass(), "next", term332208);
        setField(term332207, term332207.getClass(), "first", null);
        setField(term332207, term332207.getClass(), "last", null);
        setField(term332207, term332207.getClass(), "propListHead", null);
        setIntField(term332207, term332207.getClass(), "sourcePosition", 0);
        setField(term332207, term332207.getClass(), "jsType", null);
        setField(term332207, term332207.getClass(), "parent", null);
        setField(term332206, term332206.getClass(), "first", term332207);
        setField(term332206, term332206.getClass(), "last", null);
        setField(term332206, term332206.getClass(), "propListHead", null);
        setIntField(term332206, term332206.getClass(), "sourcePosition", 0);
        setField(term332206, term332206.getClass(), "jsType", null);
        setField(term332206, term332206.getClass(), "parent", null);
        term332126 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term332136 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term332146 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term332126, term332126.getClass(), "functionName", null);
        setBooleanField(term332126, term332126.getClass(), "itsNeedsActivation", false);
        setIntField(term332126, term332126.getClass(), "itsFunctionType", 0);
        setBooleanField(term332126, term332126.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term332126, term332126.getClass(), "encodedSourceStart", 0);
        setIntField(term332126, term332126.getClass(), "encodedSourceEnd", 0);
        setField(term332126, term332126.getClass(), "sourceName", null);
        setIntField(term332126, term332126.getClass(), "baseLineno", 0);
        setIntField(term332126, term332126.getClass(), "endLineno", 0);
        setField(term332126, term332126.getClass(), "functions", null);
        setField(term332126, term332126.getClass(), "regexps", null);
        setField(term332126, term332126.getClass(), "itsVariables", null);
        setField(term332126, term332126.getClass(), "itsConst", null);
        setField(term332126, term332126.getClass(), "itsVariableNames", null);
        setIntField(term332126, term332126.getClass(), "varStart", 0);
        setField(term332126, term332126.getClass(), "compilerData", null);
        setIntField(term332126, term332126.getClass(), "type", 14);
        setField(term332126, term332126.getClass(), "next", null);
        setField(term332136, term332136.getClass(), "functionName", null);
        setBooleanField(term332136, term332136.getClass(), "itsNeedsActivation", false);
        setIntField(term332136, term332136.getClass(), "itsFunctionType", 0);
        setBooleanField(term332136, term332136.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term332136, term332136.getClass(), "encodedSourceStart", 0);
        setIntField(term332136, term332136.getClass(), "encodedSourceEnd", 0);
        setField(term332136, term332136.getClass(), "sourceName", null);
        setIntField(term332136, term332136.getClass(), "baseLineno", 0);
        setIntField(term332136, term332136.getClass(), "endLineno", 0);
        setField(term332136, term332136.getClass(), "functions", null);
        setField(term332136, term332136.getClass(), "regexps", null);
        setField(term332136, term332136.getClass(), "itsVariables", null);
        setField(term332136, term332136.getClass(), "itsConst", null);
        setField(term332136, term332136.getClass(), "itsVariableNames", null);
        setIntField(term332136, term332136.getClass(), "varStart", 0);
        setField(term332136, term332136.getClass(), "compilerData", null);
        setIntField(term332136, term332136.getClass(), "type", 14);
        setDoubleField(term332146, term332146.getClass(), "number", 0.0);
        setIntField(term332146, term332146.getClass(), "type", 0);
        setField(term332146, term332146.getClass(), "next", null);
        setField(term332146, term332146.getClass(), "first", null);
        setField(term332146, term332146.getClass(), "last", null);
        setField(term332146, term332146.getClass(), "propListHead", null);
        setIntField(term332146, term332146.getClass(), "sourcePosition", 0);
        setField(term332146, term332146.getClass(), "jsType", null);
        setField(term332146, term332146.getClass(), "parent", null);
        setField(term332136, term332136.getClass(), "next", term332146);
        setField(term332136, term332136.getClass(), "first", null);
        setField(term332136, term332136.getClass(), "last", null);
        setField(term332136, term332136.getClass(), "propListHead", null);
        setIntField(term332136, term332136.getClass(), "sourcePosition", 0);
        setField(term332136, term332136.getClass(), "jsType", null);
        setField(term332136, term332136.getClass(), "parent", null);
        setField(term332126, term332126.getClass(), "first", term332136);
        setField(term332126, term332126.getClass(), "last", null);
        setField(term332126, term332126.getClass(), "propListHead", null);
        setIntField(term332126, term332126.getClass(), "sourcePosition", 0);
        setField(term332126, term332126.getClass(), "jsType", null);
        setField(term332126, term332126.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term331546;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term331460, args);
        assertTrue(recursiveEquals(term331460, term332205));
        assertTrue(recursiveEquals(term331546, term332206));
        assertTrue(recursiveEquals(retValue, term332126));
    }

};


