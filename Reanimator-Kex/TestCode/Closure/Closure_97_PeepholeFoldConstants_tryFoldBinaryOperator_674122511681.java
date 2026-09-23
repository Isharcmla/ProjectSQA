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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511681 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175754;
     Object term175840;
     Object term176377;
     Object term176378;
     Object term176340;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511681() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175754 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term175840 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term175910 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term175840, term175840.getClass(), "first", term175840);
        setField(term175840, term175840.getClass(), "next", term175910);
        setIntField(term175840, term175840.getClass(), "type", 20);
        term176377 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term176377, term176377.getClass(), "currentTraversal", null);
        term176378 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term176379 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term176378, term176378.getClass(), "functionName", null);
        setBooleanField(term176378, term176378.getClass(), "itsNeedsActivation", false);
        setIntField(term176378, term176378.getClass(), "itsFunctionType", 0);
        setBooleanField(term176378, term176378.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term176378, term176378.getClass(), "encodedSourceStart", 0);
        setIntField(term176378, term176378.getClass(), "encodedSourceEnd", 0);
        setField(term176378, term176378.getClass(), "sourceName", null);
        setIntField(term176378, term176378.getClass(), "baseLineno", 0);
        setIntField(term176378, term176378.getClass(), "endLineno", 0);
        setField(term176378, term176378.getClass(), "functions", null);
        setField(term176378, term176378.getClass(), "regexps", null);
        setField(term176378, term176378.getClass(), "itsVariables", null);
        setField(term176378, term176378.getClass(), "itsConst", null);
        setField(term176378, term176378.getClass(), "itsVariableNames", null);
        setIntField(term176378, term176378.getClass(), "varStart", 0);
        setField(term176378, term176378.getClass(), "compilerData", null);
        setIntField(term176378, term176378.getClass(), "type", 20);
        setIntField(term176379, term176379.getClass(), "type", 0);
        setField(term176379, term176379.getClass(), "next", null);
        setField(term176379, term176379.getClass(), "first", null);
        setField(term176379, term176379.getClass(), "last", null);
        setField(term176379, term176379.getClass(), "propListHead", null);
        setIntField(term176379, term176379.getClass(), "sourcePosition", 0);
        setField(term176379, term176379.getClass(), "jsType", null);
        setField(term176379, term176379.getClass(), "parent", null);
        setField(term176378, term176378.getClass(), "next", term176379);
        setField(term176378, term176378.getClass(), "first", term176378);
        setField(term176378, term176378.getClass(), "last", null);
        setField(term176378, term176378.getClass(), "propListHead", null);
        setIntField(term176378, term176378.getClass(), "sourcePosition", 0);
        setField(term176378, term176378.getClass(), "jsType", null);
        setField(term176378, term176378.getClass(), "parent", null);
        term176340 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term176350 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term176340, term176340.getClass(), "functionName", null);
        setBooleanField(term176340, term176340.getClass(), "itsNeedsActivation", false);
        setIntField(term176340, term176340.getClass(), "itsFunctionType", 0);
        setBooleanField(term176340, term176340.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term176340, term176340.getClass(), "encodedSourceStart", 0);
        setIntField(term176340, term176340.getClass(), "encodedSourceEnd", 0);
        setField(term176340, term176340.getClass(), "sourceName", null);
        setIntField(term176340, term176340.getClass(), "baseLineno", 0);
        setIntField(term176340, term176340.getClass(), "endLineno", 0);
        setField(term176340, term176340.getClass(), "functions", null);
        setField(term176340, term176340.getClass(), "regexps", null);
        setField(term176340, term176340.getClass(), "itsVariables", null);
        setField(term176340, term176340.getClass(), "itsConst", null);
        setField(term176340, term176340.getClass(), "itsVariableNames", null);
        setIntField(term176340, term176340.getClass(), "varStart", 0);
        setField(term176340, term176340.getClass(), "compilerData", null);
        setIntField(term176340, term176340.getClass(), "type", 20);
        setIntField(term176350, term176350.getClass(), "type", 0);
        setField(term176350, term176350.getClass(), "next", null);
        setField(term176350, term176350.getClass(), "first", null);
        setField(term176350, term176350.getClass(), "last", null);
        setField(term176350, term176350.getClass(), "propListHead", null);
        setIntField(term176350, term176350.getClass(), "sourcePosition", 0);
        setField(term176350, term176350.getClass(), "jsType", null);
        setField(term176350, term176350.getClass(), "parent", null);
        setField(term176340, term176340.getClass(), "next", term176350);
        setField(term176340, term176340.getClass(), "first", term176340);
        setField(term176340, term176340.getClass(), "last", null);
        setField(term176340, term176340.getClass(), "propListHead", null);
        setIntField(term176340, term176340.getClass(), "sourcePosition", 0);
        setField(term176340, term176340.getClass(), "jsType", null);
        setField(term176340, term176340.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term175840;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term175754, args);
        assertTrue(recursiveEquals(term175754, term176377));
        assertTrue(recursiveEquals(term175840, term176378));
        assertTrue(recursiveEquals(retValue, term176340));
    }

};


