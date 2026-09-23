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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term283997;
     Object term284089;
     Object term284694;
     Object term284695;
     Object term284651;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term283997 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term284089 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term284175 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term284245 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term284175, term284175.getClass(), "next", term284245);
        setField(term284089, term284089.getClass(), "first", term284175);
        setIntField(term284089, term284089.getClass(), "type", 20);
        term284694 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term284694, term284694.getClass(), "currentTraversal", null);
        term284695 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term284696 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term284697 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term284695, term284695.getClass(), "str", null);
        setIntField(term284695, term284695.getClass(), "type", 20);
        setField(term284695, term284695.getClass(), "next", null);
        setField(term284696, term284696.getClass(), "functionName", null);
        setBooleanField(term284696, term284696.getClass(), "itsNeedsActivation", false);
        setIntField(term284696, term284696.getClass(), "itsFunctionType", 0);
        setBooleanField(term284696, term284696.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term284696, term284696.getClass(), "encodedSourceStart", 0);
        setIntField(term284696, term284696.getClass(), "encodedSourceEnd", 0);
        setField(term284696, term284696.getClass(), "sourceName", null);
        setIntField(term284696, term284696.getClass(), "baseLineno", 0);
        setIntField(term284696, term284696.getClass(), "endLineno", 0);
        setField(term284696, term284696.getClass(), "functions", null);
        setField(term284696, term284696.getClass(), "regexps", null);
        setField(term284696, term284696.getClass(), "itsVariables", null);
        setField(term284696, term284696.getClass(), "itsConst", null);
        setField(term284696, term284696.getClass(), "itsVariableNames", null);
        setIntField(term284696, term284696.getClass(), "varStart", 0);
        setField(term284696, term284696.getClass(), "compilerData", null);
        setIntField(term284696, term284696.getClass(), "type", 0);
        setIntField(term284697, term284697.getClass(), "type", 0);
        setField(term284697, term284697.getClass(), "next", null);
        setField(term284697, term284697.getClass(), "first", null);
        setField(term284697, term284697.getClass(), "last", null);
        setField(term284697, term284697.getClass(), "propListHead", null);
        setIntField(term284697, term284697.getClass(), "sourcePosition", 0);
        setField(term284697, term284697.getClass(), "jsType", null);
        setField(term284697, term284697.getClass(), "parent", null);
        setField(term284696, term284696.getClass(), "next", term284697);
        setField(term284696, term284696.getClass(), "first", null);
        setField(term284696, term284696.getClass(), "last", null);
        setField(term284696, term284696.getClass(), "propListHead", null);
        setIntField(term284696, term284696.getClass(), "sourcePosition", 0);
        setField(term284696, term284696.getClass(), "jsType", null);
        setField(term284696, term284696.getClass(), "parent", null);
        setField(term284695, term284695.getClass(), "first", term284696);
        setField(term284695, term284695.getClass(), "last", null);
        setField(term284695, term284695.getClass(), "propListHead", null);
        setIntField(term284695, term284695.getClass(), "sourcePosition", 0);
        setField(term284695, term284695.getClass(), "jsType", null);
        setField(term284695, term284695.getClass(), "parent", null);
        term284651 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term284653 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term284663 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term284651, term284651.getClass(), "str", null);
        setIntField(term284651, term284651.getClass(), "type", 20);
        setField(term284651, term284651.getClass(), "next", null);
        setField(term284653, term284653.getClass(), "functionName", null);
        setBooleanField(term284653, term284653.getClass(), "itsNeedsActivation", false);
        setIntField(term284653, term284653.getClass(), "itsFunctionType", 0);
        setBooleanField(term284653, term284653.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term284653, term284653.getClass(), "encodedSourceStart", 0);
        setIntField(term284653, term284653.getClass(), "encodedSourceEnd", 0);
        setField(term284653, term284653.getClass(), "sourceName", null);
        setIntField(term284653, term284653.getClass(), "baseLineno", 0);
        setIntField(term284653, term284653.getClass(), "endLineno", 0);
        setField(term284653, term284653.getClass(), "functions", null);
        setField(term284653, term284653.getClass(), "regexps", null);
        setField(term284653, term284653.getClass(), "itsVariables", null);
        setField(term284653, term284653.getClass(), "itsConst", null);
        setField(term284653, term284653.getClass(), "itsVariableNames", null);
        setIntField(term284653, term284653.getClass(), "varStart", 0);
        setField(term284653, term284653.getClass(), "compilerData", null);
        setIntField(term284653, term284653.getClass(), "type", 0);
        setIntField(term284663, term284663.getClass(), "type", 0);
        setField(term284663, term284663.getClass(), "next", null);
        setField(term284663, term284663.getClass(), "first", null);
        setField(term284663, term284663.getClass(), "last", null);
        setField(term284663, term284663.getClass(), "propListHead", null);
        setIntField(term284663, term284663.getClass(), "sourcePosition", 0);
        setField(term284663, term284663.getClass(), "jsType", null);
        setField(term284663, term284663.getClass(), "parent", null);
        setField(term284653, term284653.getClass(), "next", term284663);
        setField(term284653, term284653.getClass(), "first", null);
        setField(term284653, term284653.getClass(), "last", null);
        setField(term284653, term284653.getClass(), "propListHead", null);
        setIntField(term284653, term284653.getClass(), "sourcePosition", 0);
        setField(term284653, term284653.getClass(), "jsType", null);
        setField(term284653, term284653.getClass(), "parent", null);
        setField(term284651, term284651.getClass(), "first", term284653);
        setField(term284651, term284651.getClass(), "last", null);
        setField(term284651, term284651.getClass(), "propListHead", null);
        setIntField(term284651, term284651.getClass(), "sourcePosition", 0);
        setField(term284651, term284651.getClass(), "jsType", null);
        setField(term284651, term284651.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term284089;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term283997, args);
        assertTrue(recursiveEquals(term283997, term284694));
        assertTrue(recursiveEquals(term284089, term284695));
        assertTrue(recursiveEquals(retValue, term284651));
    }

};


