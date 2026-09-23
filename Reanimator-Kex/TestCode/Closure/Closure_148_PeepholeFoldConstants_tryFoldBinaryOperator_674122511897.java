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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511897 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term208006;
     Object term208098;
     Object term208806;
     Object term208807;
     Object term208756;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511897() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term208006 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term208098 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term208184 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term208254 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term208184, term208184.getClass(), "next", term208254);
        setField(term208098, term208098.getClass(), "first", term208184);
        setIntField(term208098, term208098.getClass(), "type", 12);
        term208806 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term208806, term208806.getClass(), "currentTraversal", null);
        term208807 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term208808 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term208809 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term208807, term208807.getClass(), "str", null);
        setIntField(term208807, term208807.getClass(), "type", 12);
        setField(term208807, term208807.getClass(), "next", null);
        setField(term208808, term208808.getClass(), "functionName", null);
        setBooleanField(term208808, term208808.getClass(), "itsNeedsActivation", false);
        setIntField(term208808, term208808.getClass(), "itsFunctionType", 0);
        setBooleanField(term208808, term208808.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term208808, term208808.getClass(), "encodedSourceStart", 0);
        setIntField(term208808, term208808.getClass(), "encodedSourceEnd", 0);
        setField(term208808, term208808.getClass(), "sourceName", null);
        setIntField(term208808, term208808.getClass(), "baseLineno", 0);
        setIntField(term208808, term208808.getClass(), "endLineno", 0);
        setField(term208808, term208808.getClass(), "functions", null);
        setField(term208808, term208808.getClass(), "regexps", null);
        setField(term208808, term208808.getClass(), "itsVariables", null);
        setField(term208808, term208808.getClass(), "itsConst", null);
        setField(term208808, term208808.getClass(), "itsVariableNames", null);
        setIntField(term208808, term208808.getClass(), "varStart", 0);
        setField(term208808, term208808.getClass(), "compilerData", null);
        setIntField(term208808, term208808.getClass(), "type", 0);
        setIntField(term208809, term208809.getClass(), "type", 0);
        setField(term208809, term208809.getClass(), "next", null);
        setField(term208809, term208809.getClass(), "first", null);
        setField(term208809, term208809.getClass(), "last", null);
        setField(term208809, term208809.getClass(), "propListHead", null);
        setIntField(term208809, term208809.getClass(), "sourcePosition", 0);
        setField(term208809, term208809.getClass(), "jsType", null);
        setField(term208809, term208809.getClass(), "parent", null);
        setField(term208808, term208808.getClass(), "next", term208809);
        setField(term208808, term208808.getClass(), "first", null);
        setField(term208808, term208808.getClass(), "last", null);
        setField(term208808, term208808.getClass(), "propListHead", null);
        setIntField(term208808, term208808.getClass(), "sourcePosition", 0);
        setField(term208808, term208808.getClass(), "jsType", null);
        setField(term208808, term208808.getClass(), "parent", null);
        setField(term208807, term208807.getClass(), "first", term208808);
        setField(term208807, term208807.getClass(), "last", null);
        setField(term208807, term208807.getClass(), "propListHead", null);
        setIntField(term208807, term208807.getClass(), "sourcePosition", 0);
        setField(term208807, term208807.getClass(), "jsType", null);
        setField(term208807, term208807.getClass(), "parent", null);
        term208756 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term208758 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term208768 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term208756, term208756.getClass(), "str", null);
        setIntField(term208756, term208756.getClass(), "type", 12);
        setField(term208756, term208756.getClass(), "next", null);
        setField(term208758, term208758.getClass(), "functionName", null);
        setBooleanField(term208758, term208758.getClass(), "itsNeedsActivation", false);
        setIntField(term208758, term208758.getClass(), "itsFunctionType", 0);
        setBooleanField(term208758, term208758.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term208758, term208758.getClass(), "encodedSourceStart", 0);
        setIntField(term208758, term208758.getClass(), "encodedSourceEnd", 0);
        setField(term208758, term208758.getClass(), "sourceName", null);
        setIntField(term208758, term208758.getClass(), "baseLineno", 0);
        setIntField(term208758, term208758.getClass(), "endLineno", 0);
        setField(term208758, term208758.getClass(), "functions", null);
        setField(term208758, term208758.getClass(), "regexps", null);
        setField(term208758, term208758.getClass(), "itsVariables", null);
        setField(term208758, term208758.getClass(), "itsConst", null);
        setField(term208758, term208758.getClass(), "itsVariableNames", null);
        setIntField(term208758, term208758.getClass(), "varStart", 0);
        setField(term208758, term208758.getClass(), "compilerData", null);
        setIntField(term208758, term208758.getClass(), "type", 0);
        setIntField(term208768, term208768.getClass(), "type", 0);
        setField(term208768, term208768.getClass(), "next", null);
        setField(term208768, term208768.getClass(), "first", null);
        setField(term208768, term208768.getClass(), "last", null);
        setField(term208768, term208768.getClass(), "propListHead", null);
        setIntField(term208768, term208768.getClass(), "sourcePosition", 0);
        setField(term208768, term208768.getClass(), "jsType", null);
        setField(term208768, term208768.getClass(), "parent", null);
        setField(term208758, term208758.getClass(), "next", term208768);
        setField(term208758, term208758.getClass(), "first", null);
        setField(term208758, term208758.getClass(), "last", null);
        setField(term208758, term208758.getClass(), "propListHead", null);
        setIntField(term208758, term208758.getClass(), "sourcePosition", 0);
        setField(term208758, term208758.getClass(), "jsType", null);
        setField(term208758, term208758.getClass(), "parent", null);
        setField(term208756, term208756.getClass(), "first", term208758);
        setField(term208756, term208756.getClass(), "last", null);
        setField(term208756, term208756.getClass(), "propListHead", null);
        setIntField(term208756, term208756.getClass(), "sourcePosition", 0);
        setField(term208756, term208756.getClass(), "jsType", null);
        setField(term208756, term208756.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term208098;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term208006, args);
        assertTrue(recursiveEquals(term208006, term208806));
        assertTrue(recursiveEquals(term208098, term208807));
        assertTrue(recursiveEquals(retValue, term208756));
    }

};


