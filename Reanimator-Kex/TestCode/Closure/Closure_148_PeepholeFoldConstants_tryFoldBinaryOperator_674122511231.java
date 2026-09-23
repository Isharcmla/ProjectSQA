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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43634;
     Object term43720;
     Object term44144;
     Object term44145;
     Object term44107;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43634 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term43720 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term43790 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term43720, term43720.getClass(), "first", term43720);
        setField(term43720, term43720.getClass(), "next", term43790);
        setIntField(term43720, term43720.getClass(), "type", 18);
        term44144 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term44144, term44144.getClass(), "currentTraversal", null);
        term44145 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term44146 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term44145, term44145.getClass(), "functionName", null);
        setBooleanField(term44145, term44145.getClass(), "itsNeedsActivation", false);
        setIntField(term44145, term44145.getClass(), "itsFunctionType", 0);
        setBooleanField(term44145, term44145.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term44145, term44145.getClass(), "encodedSourceStart", 0);
        setIntField(term44145, term44145.getClass(), "encodedSourceEnd", 0);
        setField(term44145, term44145.getClass(), "sourceName", null);
        setIntField(term44145, term44145.getClass(), "baseLineno", 0);
        setIntField(term44145, term44145.getClass(), "endLineno", 0);
        setField(term44145, term44145.getClass(), "functions", null);
        setField(term44145, term44145.getClass(), "regexps", null);
        setField(term44145, term44145.getClass(), "itsVariables", null);
        setField(term44145, term44145.getClass(), "itsConst", null);
        setField(term44145, term44145.getClass(), "itsVariableNames", null);
        setIntField(term44145, term44145.getClass(), "varStart", 0);
        setField(term44145, term44145.getClass(), "compilerData", null);
        setIntField(term44145, term44145.getClass(), "type", 18);
        setIntField(term44146, term44146.getClass(), "type", 0);
        setField(term44146, term44146.getClass(), "next", null);
        setField(term44146, term44146.getClass(), "first", null);
        setField(term44146, term44146.getClass(), "last", null);
        setField(term44146, term44146.getClass(), "propListHead", null);
        setIntField(term44146, term44146.getClass(), "sourcePosition", 0);
        setField(term44146, term44146.getClass(), "jsType", null);
        setField(term44146, term44146.getClass(), "parent", null);
        setField(term44145, term44145.getClass(), "next", term44146);
        setField(term44145, term44145.getClass(), "first", term44145);
        setField(term44145, term44145.getClass(), "last", null);
        setField(term44145, term44145.getClass(), "propListHead", null);
        setIntField(term44145, term44145.getClass(), "sourcePosition", 0);
        setField(term44145, term44145.getClass(), "jsType", null);
        setField(term44145, term44145.getClass(), "parent", null);
        term44107 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term44117 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term44107, term44107.getClass(), "functionName", null);
        setBooleanField(term44107, term44107.getClass(), "itsNeedsActivation", false);
        setIntField(term44107, term44107.getClass(), "itsFunctionType", 0);
        setBooleanField(term44107, term44107.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term44107, term44107.getClass(), "encodedSourceStart", 0);
        setIntField(term44107, term44107.getClass(), "encodedSourceEnd", 0);
        setField(term44107, term44107.getClass(), "sourceName", null);
        setIntField(term44107, term44107.getClass(), "baseLineno", 0);
        setIntField(term44107, term44107.getClass(), "endLineno", 0);
        setField(term44107, term44107.getClass(), "functions", null);
        setField(term44107, term44107.getClass(), "regexps", null);
        setField(term44107, term44107.getClass(), "itsVariables", null);
        setField(term44107, term44107.getClass(), "itsConst", null);
        setField(term44107, term44107.getClass(), "itsVariableNames", null);
        setIntField(term44107, term44107.getClass(), "varStart", 0);
        setField(term44107, term44107.getClass(), "compilerData", null);
        setIntField(term44107, term44107.getClass(), "type", 18);
        setIntField(term44117, term44117.getClass(), "type", 0);
        setField(term44117, term44117.getClass(), "next", null);
        setField(term44117, term44117.getClass(), "first", null);
        setField(term44117, term44117.getClass(), "last", null);
        setField(term44117, term44117.getClass(), "propListHead", null);
        setIntField(term44117, term44117.getClass(), "sourcePosition", 0);
        setField(term44117, term44117.getClass(), "jsType", null);
        setField(term44117, term44117.getClass(), "parent", null);
        setField(term44107, term44107.getClass(), "next", term44117);
        setField(term44107, term44107.getClass(), "first", term44107);
        setField(term44107, term44107.getClass(), "last", null);
        setField(term44107, term44107.getClass(), "propListHead", null);
        setIntField(term44107, term44107.getClass(), "sourcePosition", 0);
        setField(term44107, term44107.getClass(), "jsType", null);
        setField(term44107, term44107.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term43720;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term43634, args);
        assertTrue(recursiveEquals(term43634, term44144));
        assertTrue(recursiveEquals(term43720, term44145));
        assertTrue(recursiveEquals(retValue, term44107));
    }

};


