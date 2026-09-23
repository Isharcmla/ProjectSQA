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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511968 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term307354;
     Object term307440;
     Object term307685;
     Object term307686;
     Object term307611;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511968() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term307354 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term307440 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term307526 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term307596 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term307526, term307526.getClass(), "next", term307596);
        setField(term307440, term307440.getClass(), "first", term307526);
        setIntField(term307440, term307440.getClass(), "type", 16);
        term307685 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term307685, term307685.getClass(), "currentTraversal", null);
        term307686 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term307687 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term307688 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term307686, term307686.getClass(), "functionName", null);
        setBooleanField(term307686, term307686.getClass(), "itsNeedsActivation", false);
        setIntField(term307686, term307686.getClass(), "itsFunctionType", 0);
        setBooleanField(term307686, term307686.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term307686, term307686.getClass(), "encodedSourceStart", 0);
        setIntField(term307686, term307686.getClass(), "encodedSourceEnd", 0);
        setField(term307686, term307686.getClass(), "sourceName", null);
        setIntField(term307686, term307686.getClass(), "baseLineno", 0);
        setIntField(term307686, term307686.getClass(), "endLineno", 0);
        setField(term307686, term307686.getClass(), "functions", null);
        setField(term307686, term307686.getClass(), "regexps", null);
        setField(term307686, term307686.getClass(), "itsVariables", null);
        setField(term307686, term307686.getClass(), "itsConst", null);
        setField(term307686, term307686.getClass(), "itsVariableNames", null);
        setIntField(term307686, term307686.getClass(), "varStart", 0);
        setField(term307686, term307686.getClass(), "compilerData", null);
        setIntField(term307686, term307686.getClass(), "type", 16);
        setField(term307686, term307686.getClass(), "next", null);
        setField(term307687, term307687.getClass(), "functionName", null);
        setBooleanField(term307687, term307687.getClass(), "itsNeedsActivation", false);
        setIntField(term307687, term307687.getClass(), "itsFunctionType", 0);
        setBooleanField(term307687, term307687.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term307687, term307687.getClass(), "encodedSourceStart", 0);
        setIntField(term307687, term307687.getClass(), "encodedSourceEnd", 0);
        setField(term307687, term307687.getClass(), "sourceName", null);
        setIntField(term307687, term307687.getClass(), "baseLineno", 0);
        setIntField(term307687, term307687.getClass(), "endLineno", 0);
        setField(term307687, term307687.getClass(), "functions", null);
        setField(term307687, term307687.getClass(), "regexps", null);
        setField(term307687, term307687.getClass(), "itsVariables", null);
        setField(term307687, term307687.getClass(), "itsConst", null);
        setField(term307687, term307687.getClass(), "itsVariableNames", null);
        setIntField(term307687, term307687.getClass(), "varStart", 0);
        setField(term307687, term307687.getClass(), "compilerData", null);
        setIntField(term307687, term307687.getClass(), "type", 0);
        setIntField(term307688, term307688.getClass(), "type", 0);
        setField(term307688, term307688.getClass(), "next", null);
        setField(term307688, term307688.getClass(), "first", null);
        setField(term307688, term307688.getClass(), "last", null);
        setField(term307688, term307688.getClass(), "propListHead", null);
        setIntField(term307688, term307688.getClass(), "sourcePosition", 0);
        setField(term307688, term307688.getClass(), "jsType", null);
        setField(term307688, term307688.getClass(), "parent", null);
        setField(term307687, term307687.getClass(), "next", term307688);
        setField(term307687, term307687.getClass(), "first", null);
        setField(term307687, term307687.getClass(), "last", null);
        setField(term307687, term307687.getClass(), "propListHead", null);
        setIntField(term307687, term307687.getClass(), "sourcePosition", 0);
        setField(term307687, term307687.getClass(), "jsType", null);
        setField(term307687, term307687.getClass(), "parent", null);
        setField(term307686, term307686.getClass(), "first", term307687);
        setField(term307686, term307686.getClass(), "last", null);
        setField(term307686, term307686.getClass(), "propListHead", null);
        setIntField(term307686, term307686.getClass(), "sourcePosition", 0);
        setField(term307686, term307686.getClass(), "jsType", null);
        setField(term307686, term307686.getClass(), "parent", null);
        term307611 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term307621 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term307631 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term307611, term307611.getClass(), "functionName", null);
        setBooleanField(term307611, term307611.getClass(), "itsNeedsActivation", false);
        setIntField(term307611, term307611.getClass(), "itsFunctionType", 0);
        setBooleanField(term307611, term307611.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term307611, term307611.getClass(), "encodedSourceStart", 0);
        setIntField(term307611, term307611.getClass(), "encodedSourceEnd", 0);
        setField(term307611, term307611.getClass(), "sourceName", null);
        setIntField(term307611, term307611.getClass(), "baseLineno", 0);
        setIntField(term307611, term307611.getClass(), "endLineno", 0);
        setField(term307611, term307611.getClass(), "functions", null);
        setField(term307611, term307611.getClass(), "regexps", null);
        setField(term307611, term307611.getClass(), "itsVariables", null);
        setField(term307611, term307611.getClass(), "itsConst", null);
        setField(term307611, term307611.getClass(), "itsVariableNames", null);
        setIntField(term307611, term307611.getClass(), "varStart", 0);
        setField(term307611, term307611.getClass(), "compilerData", null);
        setIntField(term307611, term307611.getClass(), "type", 16);
        setField(term307611, term307611.getClass(), "next", null);
        setField(term307621, term307621.getClass(), "functionName", null);
        setBooleanField(term307621, term307621.getClass(), "itsNeedsActivation", false);
        setIntField(term307621, term307621.getClass(), "itsFunctionType", 0);
        setBooleanField(term307621, term307621.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term307621, term307621.getClass(), "encodedSourceStart", 0);
        setIntField(term307621, term307621.getClass(), "encodedSourceEnd", 0);
        setField(term307621, term307621.getClass(), "sourceName", null);
        setIntField(term307621, term307621.getClass(), "baseLineno", 0);
        setIntField(term307621, term307621.getClass(), "endLineno", 0);
        setField(term307621, term307621.getClass(), "functions", null);
        setField(term307621, term307621.getClass(), "regexps", null);
        setField(term307621, term307621.getClass(), "itsVariables", null);
        setField(term307621, term307621.getClass(), "itsConst", null);
        setField(term307621, term307621.getClass(), "itsVariableNames", null);
        setIntField(term307621, term307621.getClass(), "varStart", 0);
        setField(term307621, term307621.getClass(), "compilerData", null);
        setIntField(term307621, term307621.getClass(), "type", 0);
        setIntField(term307631, term307631.getClass(), "type", 0);
        setField(term307631, term307631.getClass(), "next", null);
        setField(term307631, term307631.getClass(), "first", null);
        setField(term307631, term307631.getClass(), "last", null);
        setField(term307631, term307631.getClass(), "propListHead", null);
        setIntField(term307631, term307631.getClass(), "sourcePosition", 0);
        setField(term307631, term307631.getClass(), "jsType", null);
        setField(term307631, term307631.getClass(), "parent", null);
        setField(term307621, term307621.getClass(), "next", term307631);
        setField(term307621, term307621.getClass(), "first", null);
        setField(term307621, term307621.getClass(), "last", null);
        setField(term307621, term307621.getClass(), "propListHead", null);
        setIntField(term307621, term307621.getClass(), "sourcePosition", 0);
        setField(term307621, term307621.getClass(), "jsType", null);
        setField(term307621, term307621.getClass(), "parent", null);
        setField(term307611, term307611.getClass(), "first", term307621);
        setField(term307611, term307611.getClass(), "last", null);
        setField(term307611, term307611.getClass(), "propListHead", null);
        setIntField(term307611, term307611.getClass(), "sourcePosition", 0);
        setField(term307611, term307611.getClass(), "jsType", null);
        setField(term307611, term307611.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term307440;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term307354, args);
        assertTrue(recursiveEquals(term307354, term307685));
        assertTrue(recursiveEquals(term307440, term307686));
        assertTrue(recursiveEquals(retValue, term307611));
    }

};


