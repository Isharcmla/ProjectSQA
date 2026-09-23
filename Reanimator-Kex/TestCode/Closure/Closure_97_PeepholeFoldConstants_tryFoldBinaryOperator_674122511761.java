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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511761 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term218065;
     Object term218157;
     Object term218855;
     Object term218856;
     Object term218801;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511761() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term218065 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term218157 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term218249 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term218339 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term218249, term218249.getClass(), "next", term218339);
        setIntField(term218249, term218249.getClass(), "type", 39);
        setField(term218157, term218157.getClass(), "first", term218249);
        setIntField(term218157, term218157.getClass(), "type", 9);
        term218855 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term218855, term218855.getClass(), "currentTraversal", null);
        term218856 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term218857 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term218858 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setDoubleField(term218856, term218856.getClass(), "number", 0.0);
        setIntField(term218856, term218856.getClass(), "type", 9);
        setField(term218856, term218856.getClass(), "next", null);
        setDoubleField(term218857, term218857.getClass(), "number", 0.0);
        setIntField(term218857, term218857.getClass(), "type", 39);
        setIntField(term218858, term218858.getClass(), "encodedSourceStart", 0);
        setIntField(term218858, term218858.getClass(), "encodedSourceEnd", 0);
        setField(term218858, term218858.getClass(), "sourceName", null);
        setIntField(term218858, term218858.getClass(), "baseLineno", 0);
        setIntField(term218858, term218858.getClass(), "endLineno", 0);
        setField(term218858, term218858.getClass(), "functions", null);
        setField(term218858, term218858.getClass(), "regexps", null);
        setField(term218858, term218858.getClass(), "itsVariables", null);
        setField(term218858, term218858.getClass(), "itsConst", null);
        setField(term218858, term218858.getClass(), "itsVariableNames", null);
        setIntField(term218858, term218858.getClass(), "varStart", 0);
        setField(term218858, term218858.getClass(), "compilerData", null);
        setIntField(term218858, term218858.getClass(), "type", 0);
        setField(term218858, term218858.getClass(), "next", null);
        setField(term218858, term218858.getClass(), "first", null);
        setField(term218858, term218858.getClass(), "last", null);
        setField(term218858, term218858.getClass(), "propListHead", null);
        setIntField(term218858, term218858.getClass(), "sourcePosition", 0);
        setField(term218858, term218858.getClass(), "jsType", null);
        setField(term218858, term218858.getClass(), "parent", null);
        setField(term218857, term218857.getClass(), "next", term218858);
        setField(term218857, term218857.getClass(), "first", null);
        setField(term218857, term218857.getClass(), "last", null);
        setField(term218857, term218857.getClass(), "propListHead", null);
        setIntField(term218857, term218857.getClass(), "sourcePosition", 0);
        setField(term218857, term218857.getClass(), "jsType", null);
        setField(term218857, term218857.getClass(), "parent", null);
        setField(term218856, term218856.getClass(), "first", term218857);
        setField(term218856, term218856.getClass(), "last", null);
        setField(term218856, term218856.getClass(), "propListHead", null);
        setIntField(term218856, term218856.getClass(), "sourcePosition", 0);
        setField(term218856, term218856.getClass(), "jsType", null);
        setField(term218856, term218856.getClass(), "parent", null);
        term218801 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term218804 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term218807 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setDoubleField(term218801, term218801.getClass(), "number", 0.0);
        setIntField(term218801, term218801.getClass(), "type", 9);
        setField(term218801, term218801.getClass(), "next", null);
        setDoubleField(term218804, term218804.getClass(), "number", 0.0);
        setIntField(term218804, term218804.getClass(), "type", 39);
        setIntField(term218807, term218807.getClass(), "encodedSourceStart", 0);
        setIntField(term218807, term218807.getClass(), "encodedSourceEnd", 0);
        setField(term218807, term218807.getClass(), "sourceName", null);
        setIntField(term218807, term218807.getClass(), "baseLineno", 0);
        setIntField(term218807, term218807.getClass(), "endLineno", 0);
        setField(term218807, term218807.getClass(), "functions", null);
        setField(term218807, term218807.getClass(), "regexps", null);
        setField(term218807, term218807.getClass(), "itsVariables", null);
        setField(term218807, term218807.getClass(), "itsConst", null);
        setField(term218807, term218807.getClass(), "itsVariableNames", null);
        setIntField(term218807, term218807.getClass(), "varStart", 0);
        setField(term218807, term218807.getClass(), "compilerData", null);
        setIntField(term218807, term218807.getClass(), "type", 0);
        setField(term218807, term218807.getClass(), "next", null);
        setField(term218807, term218807.getClass(), "first", null);
        setField(term218807, term218807.getClass(), "last", null);
        setField(term218807, term218807.getClass(), "propListHead", null);
        setIntField(term218807, term218807.getClass(), "sourcePosition", 0);
        setField(term218807, term218807.getClass(), "jsType", null);
        setField(term218807, term218807.getClass(), "parent", null);
        setField(term218804, term218804.getClass(), "next", term218807);
        setField(term218804, term218804.getClass(), "first", null);
        setField(term218804, term218804.getClass(), "last", null);
        setField(term218804, term218804.getClass(), "propListHead", null);
        setIntField(term218804, term218804.getClass(), "sourcePosition", 0);
        setField(term218804, term218804.getClass(), "jsType", null);
        setField(term218804, term218804.getClass(), "parent", null);
        setField(term218801, term218801.getClass(), "first", term218804);
        setField(term218801, term218801.getClass(), "last", null);
        setField(term218801, term218801.getClass(), "propListHead", null);
        setIntField(term218801, term218801.getClass(), "sourcePosition", 0);
        setField(term218801, term218801.getClass(), "jsType", null);
        setField(term218801, term218801.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term218157;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term218065, args);
        assertTrue(recursiveEquals(term218065, term218855));
        assertTrue(recursiveEquals(term218157, term218856));
        assertTrue(recursiveEquals(retValue, term218801));
    }

};


