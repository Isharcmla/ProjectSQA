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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511594 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129435;
     Object term129521;
     Object term129779;
     Object term129780;
     Object term129715;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511594() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term129435 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term129521 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term129607 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term129699 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term129607, term129607.getClass(), "next", term129699);
        setIntField(term129607, term129607.getClass(), "type", 39);
        setField(term129521, term129521.getClass(), "first", term129607);
        setIntField(term129521, term129521.getClass(), "type", 22);
        term129779 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term129779, term129779.getClass(), "currentTraversal", null);
        term129780 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term129781 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term129782 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term129780, term129780.getClass(), "functionName", null);
        setBooleanField(term129780, term129780.getClass(), "itsNeedsActivation", false);
        setIntField(term129780, term129780.getClass(), "itsFunctionType", 0);
        setBooleanField(term129780, term129780.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term129780, term129780.getClass(), "encodedSourceStart", 0);
        setIntField(term129780, term129780.getClass(), "encodedSourceEnd", 0);
        setField(term129780, term129780.getClass(), "sourceName", null);
        setIntField(term129780, term129780.getClass(), "baseLineno", 0);
        setIntField(term129780, term129780.getClass(), "endLineno", 0);
        setField(term129780, term129780.getClass(), "functions", null);
        setField(term129780, term129780.getClass(), "regexps", null);
        setField(term129780, term129780.getClass(), "itsVariables", null);
        setField(term129780, term129780.getClass(), "itsConst", null);
        setField(term129780, term129780.getClass(), "itsVariableNames", null);
        setIntField(term129780, term129780.getClass(), "varStart", 0);
        setField(term129780, term129780.getClass(), "compilerData", null);
        setIntField(term129780, term129780.getClass(), "type", 22);
        setField(term129780, term129780.getClass(), "next", null);
        setField(term129781, term129781.getClass(), "functionName", null);
        setBooleanField(term129781, term129781.getClass(), "itsNeedsActivation", false);
        setIntField(term129781, term129781.getClass(), "itsFunctionType", 0);
        setBooleanField(term129781, term129781.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term129781, term129781.getClass(), "encodedSourceStart", 0);
        setIntField(term129781, term129781.getClass(), "encodedSourceEnd", 0);
        setField(term129781, term129781.getClass(), "sourceName", null);
        setIntField(term129781, term129781.getClass(), "baseLineno", 0);
        setIntField(term129781, term129781.getClass(), "endLineno", 0);
        setField(term129781, term129781.getClass(), "functions", null);
        setField(term129781, term129781.getClass(), "regexps", null);
        setField(term129781, term129781.getClass(), "itsVariables", null);
        setField(term129781, term129781.getClass(), "itsConst", null);
        setField(term129781, term129781.getClass(), "itsVariableNames", null);
        setIntField(term129781, term129781.getClass(), "varStart", 0);
        setField(term129781, term129781.getClass(), "compilerData", null);
        setIntField(term129781, term129781.getClass(), "type", 39);
        setDoubleField(term129782, term129782.getClass(), "number", 0.0);
        setIntField(term129782, term129782.getClass(), "type", 0);
        setField(term129782, term129782.getClass(), "next", null);
        setField(term129782, term129782.getClass(), "first", null);
        setField(term129782, term129782.getClass(), "last", null);
        setField(term129782, term129782.getClass(), "propListHead", null);
        setIntField(term129782, term129782.getClass(), "sourcePosition", 0);
        setField(term129782, term129782.getClass(), "jsType", null);
        setField(term129782, term129782.getClass(), "parent", null);
        setField(term129781, term129781.getClass(), "next", term129782);
        setField(term129781, term129781.getClass(), "first", null);
        setField(term129781, term129781.getClass(), "last", null);
        setField(term129781, term129781.getClass(), "propListHead", null);
        setIntField(term129781, term129781.getClass(), "sourcePosition", 0);
        setField(term129781, term129781.getClass(), "jsType", null);
        setField(term129781, term129781.getClass(), "parent", null);
        setField(term129780, term129780.getClass(), "first", term129781);
        setField(term129780, term129780.getClass(), "last", null);
        setField(term129780, term129780.getClass(), "propListHead", null);
        setIntField(term129780, term129780.getClass(), "sourcePosition", 0);
        setField(term129780, term129780.getClass(), "jsType", null);
        setField(term129780, term129780.getClass(), "parent", null);
        term129715 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term129725 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term129735 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term129715, term129715.getClass(), "functionName", null);
        setBooleanField(term129715, term129715.getClass(), "itsNeedsActivation", false);
        setIntField(term129715, term129715.getClass(), "itsFunctionType", 0);
        setBooleanField(term129715, term129715.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term129715, term129715.getClass(), "encodedSourceStart", 0);
        setIntField(term129715, term129715.getClass(), "encodedSourceEnd", 0);
        setField(term129715, term129715.getClass(), "sourceName", null);
        setIntField(term129715, term129715.getClass(), "baseLineno", 0);
        setIntField(term129715, term129715.getClass(), "endLineno", 0);
        setField(term129715, term129715.getClass(), "functions", null);
        setField(term129715, term129715.getClass(), "regexps", null);
        setField(term129715, term129715.getClass(), "itsVariables", null);
        setField(term129715, term129715.getClass(), "itsConst", null);
        setField(term129715, term129715.getClass(), "itsVariableNames", null);
        setIntField(term129715, term129715.getClass(), "varStart", 0);
        setField(term129715, term129715.getClass(), "compilerData", null);
        setIntField(term129715, term129715.getClass(), "type", 22);
        setField(term129715, term129715.getClass(), "next", null);
        setField(term129725, term129725.getClass(), "functionName", null);
        setBooleanField(term129725, term129725.getClass(), "itsNeedsActivation", false);
        setIntField(term129725, term129725.getClass(), "itsFunctionType", 0);
        setBooleanField(term129725, term129725.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term129725, term129725.getClass(), "encodedSourceStart", 0);
        setIntField(term129725, term129725.getClass(), "encodedSourceEnd", 0);
        setField(term129725, term129725.getClass(), "sourceName", null);
        setIntField(term129725, term129725.getClass(), "baseLineno", 0);
        setIntField(term129725, term129725.getClass(), "endLineno", 0);
        setField(term129725, term129725.getClass(), "functions", null);
        setField(term129725, term129725.getClass(), "regexps", null);
        setField(term129725, term129725.getClass(), "itsVariables", null);
        setField(term129725, term129725.getClass(), "itsConst", null);
        setField(term129725, term129725.getClass(), "itsVariableNames", null);
        setIntField(term129725, term129725.getClass(), "varStart", 0);
        setField(term129725, term129725.getClass(), "compilerData", null);
        setIntField(term129725, term129725.getClass(), "type", 39);
        setDoubleField(term129735, term129735.getClass(), "number", 0.0);
        setIntField(term129735, term129735.getClass(), "type", 0);
        setField(term129735, term129735.getClass(), "next", null);
        setField(term129735, term129735.getClass(), "first", null);
        setField(term129735, term129735.getClass(), "last", null);
        setField(term129735, term129735.getClass(), "propListHead", null);
        setIntField(term129735, term129735.getClass(), "sourcePosition", 0);
        setField(term129735, term129735.getClass(), "jsType", null);
        setField(term129735, term129735.getClass(), "parent", null);
        setField(term129725, term129725.getClass(), "next", term129735);
        setField(term129725, term129725.getClass(), "first", null);
        setField(term129725, term129725.getClass(), "last", null);
        setField(term129725, term129725.getClass(), "propListHead", null);
        setIntField(term129725, term129725.getClass(), "sourcePosition", 0);
        setField(term129725, term129725.getClass(), "jsType", null);
        setField(term129725, term129725.getClass(), "parent", null);
        setField(term129715, term129715.getClass(), "first", term129725);
        setField(term129715, term129715.getClass(), "last", null);
        setField(term129715, term129715.getClass(), "propListHead", null);
        setIntField(term129715, term129715.getClass(), "sourcePosition", 0);
        setField(term129715, term129715.getClass(), "jsType", null);
        setField(term129715, term129715.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term129521;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term129435, args);
        assertTrue(recursiveEquals(term129435, term129779));
        assertTrue(recursiveEquals(term129521, term129780));
        assertTrue(recursiveEquals(retValue, term129715));
    }

};


