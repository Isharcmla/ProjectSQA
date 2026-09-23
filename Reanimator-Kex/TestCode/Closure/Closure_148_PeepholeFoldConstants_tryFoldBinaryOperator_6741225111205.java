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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term285853;
     Object term285945;
     Object term286617;
     Object term286618;
     Object term286574;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term285853 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term285945 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term286031 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term286101 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term286031, term286031.getClass(), "next", term286101);
        setField(term285945, term285945.getClass(), "first", term286031);
        setIntField(term285945, term285945.getClass(), "type", 20);
        term286617 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term286617, term286617.getClass(), "currentTraversal", null);
        term286618 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term286619 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term286620 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term286618, term286618.getClass(), "str", null);
        setIntField(term286618, term286618.getClass(), "type", 20);
        setField(term286618, term286618.getClass(), "next", null);
        setField(term286619, term286619.getClass(), "functionName", null);
        setBooleanField(term286619, term286619.getClass(), "itsNeedsActivation", false);
        setIntField(term286619, term286619.getClass(), "itsFunctionType", 0);
        setBooleanField(term286619, term286619.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term286619, term286619.getClass(), "encodedSourceStart", 0);
        setIntField(term286619, term286619.getClass(), "encodedSourceEnd", 0);
        setField(term286619, term286619.getClass(), "sourceName", null);
        setIntField(term286619, term286619.getClass(), "baseLineno", 0);
        setIntField(term286619, term286619.getClass(), "endLineno", 0);
        setField(term286619, term286619.getClass(), "functions", null);
        setField(term286619, term286619.getClass(), "regexps", null);
        setField(term286619, term286619.getClass(), "itsVariables", null);
        setField(term286619, term286619.getClass(), "itsConst", null);
        setField(term286619, term286619.getClass(), "itsVariableNames", null);
        setIntField(term286619, term286619.getClass(), "varStart", 0);
        setField(term286619, term286619.getClass(), "compilerData", null);
        setIntField(term286619, term286619.getClass(), "type", 0);
        setIntField(term286620, term286620.getClass(), "type", 0);
        setField(term286620, term286620.getClass(), "next", null);
        setField(term286620, term286620.getClass(), "first", null);
        setField(term286620, term286620.getClass(), "last", null);
        setField(term286620, term286620.getClass(), "propListHead", null);
        setIntField(term286620, term286620.getClass(), "sourcePosition", 0);
        setField(term286620, term286620.getClass(), "jsType", null);
        setField(term286620, term286620.getClass(), "parent", null);
        setField(term286619, term286619.getClass(), "next", term286620);
        setField(term286619, term286619.getClass(), "first", null);
        setField(term286619, term286619.getClass(), "last", null);
        setField(term286619, term286619.getClass(), "propListHead", null);
        setIntField(term286619, term286619.getClass(), "sourcePosition", 0);
        setField(term286619, term286619.getClass(), "jsType", null);
        setField(term286619, term286619.getClass(), "parent", null);
        setField(term286618, term286618.getClass(), "first", term286619);
        setField(term286618, term286618.getClass(), "last", null);
        setField(term286618, term286618.getClass(), "propListHead", null);
        setIntField(term286618, term286618.getClass(), "sourcePosition", 0);
        setField(term286618, term286618.getClass(), "jsType", null);
        setField(term286618, term286618.getClass(), "parent", null);
        term286574 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term286576 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term286586 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term286574, term286574.getClass(), "str", null);
        setIntField(term286574, term286574.getClass(), "type", 20);
        setField(term286574, term286574.getClass(), "next", null);
        setField(term286576, term286576.getClass(), "functionName", null);
        setBooleanField(term286576, term286576.getClass(), "itsNeedsActivation", false);
        setIntField(term286576, term286576.getClass(), "itsFunctionType", 0);
        setBooleanField(term286576, term286576.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term286576, term286576.getClass(), "encodedSourceStart", 0);
        setIntField(term286576, term286576.getClass(), "encodedSourceEnd", 0);
        setField(term286576, term286576.getClass(), "sourceName", null);
        setIntField(term286576, term286576.getClass(), "baseLineno", 0);
        setIntField(term286576, term286576.getClass(), "endLineno", 0);
        setField(term286576, term286576.getClass(), "functions", null);
        setField(term286576, term286576.getClass(), "regexps", null);
        setField(term286576, term286576.getClass(), "itsVariables", null);
        setField(term286576, term286576.getClass(), "itsConst", null);
        setField(term286576, term286576.getClass(), "itsVariableNames", null);
        setIntField(term286576, term286576.getClass(), "varStart", 0);
        setField(term286576, term286576.getClass(), "compilerData", null);
        setIntField(term286576, term286576.getClass(), "type", 0);
        setIntField(term286586, term286586.getClass(), "type", 0);
        setField(term286586, term286586.getClass(), "next", null);
        setField(term286586, term286586.getClass(), "first", null);
        setField(term286586, term286586.getClass(), "last", null);
        setField(term286586, term286586.getClass(), "propListHead", null);
        setIntField(term286586, term286586.getClass(), "sourcePosition", 0);
        setField(term286586, term286586.getClass(), "jsType", null);
        setField(term286586, term286586.getClass(), "parent", null);
        setField(term286576, term286576.getClass(), "next", term286586);
        setField(term286576, term286576.getClass(), "first", null);
        setField(term286576, term286576.getClass(), "last", null);
        setField(term286576, term286576.getClass(), "propListHead", null);
        setIntField(term286576, term286576.getClass(), "sourcePosition", 0);
        setField(term286576, term286576.getClass(), "jsType", null);
        setField(term286576, term286576.getClass(), "parent", null);
        setField(term286574, term286574.getClass(), "first", term286576);
        setField(term286574, term286574.getClass(), "last", null);
        setField(term286574, term286574.getClass(), "propListHead", null);
        setIntField(term286574, term286574.getClass(), "sourcePosition", 0);
        setField(term286574, term286574.getClass(), "jsType", null);
        setField(term286574, term286574.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term285945;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term285853, args);
        assertTrue(recursiveEquals(term285853, term286617));
        assertTrue(recursiveEquals(term285945, term286618));
        assertTrue(recursiveEquals(retValue, term286574));
    }

};


