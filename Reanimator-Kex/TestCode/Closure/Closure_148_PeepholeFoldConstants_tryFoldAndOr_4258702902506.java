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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902506 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term704527;
     Object term704613;
     Object term704797;
     Object term704889;
     Object term704972;
     Object term704973;
     Object term704975;
     Object term704976;
     Object term704894;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902506() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term704527 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term704613 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term704705 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term704705, term704705.getClass(), "type", 108);
        setField(term704613, term704613.getClass(), "parent", term704705);
        setIntField(term704613, term704613.getClass(), "type", 0);
        term704797 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term704797, term704797.getClass(), "type", 104);
        term704889 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term704889, term704889.getClass(), "type", 44);
        term704972 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term704972, term704972.getClass(), "currentTraversal", null);
        term704973 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term704974 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term704973, term704973.getClass(), "functionName", null);
        setBooleanField(term704973, term704973.getClass(), "itsNeedsActivation", false);
        setIntField(term704973, term704973.getClass(), "itsFunctionType", 0);
        setBooleanField(term704973, term704973.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term704973, term704973.getClass(), "encodedSourceStart", 0);
        setIntField(term704973, term704973.getClass(), "encodedSourceEnd", 0);
        setField(term704973, term704973.getClass(), "sourceName", null);
        setIntField(term704973, term704973.getClass(), "baseLineno", 0);
        setIntField(term704973, term704973.getClass(), "endLineno", 0);
        setField(term704973, term704973.getClass(), "functions", null);
        setField(term704973, term704973.getClass(), "regexps", null);
        setField(term704973, term704973.getClass(), "itsVariables", null);
        setField(term704973, term704973.getClass(), "itsConst", null);
        setField(term704973, term704973.getClass(), "itsVariableNames", null);
        setIntField(term704973, term704973.getClass(), "varStart", 0);
        setField(term704973, term704973.getClass(), "compilerData", null);
        setIntField(term704973, term704973.getClass(), "type", 0);
        setField(term704973, term704973.getClass(), "next", null);
        setField(term704973, term704973.getClass(), "first", null);
        setField(term704973, term704973.getClass(), "last", null);
        setField(term704973, term704973.getClass(), "propListHead", null);
        setIntField(term704973, term704973.getClass(), "sourcePosition", 0);
        setField(term704973, term704973.getClass(), "jsType", null);
        setDoubleField(term704974, term704974.getClass(), "number", 0.0);
        setIntField(term704974, term704974.getClass(), "type", 108);
        setField(term704974, term704974.getClass(), "next", null);
        setField(term704974, term704974.getClass(), "first", null);
        setField(term704974, term704974.getClass(), "last", null);
        setField(term704974, term704974.getClass(), "propListHead", null);
        setIntField(term704974, term704974.getClass(), "sourcePosition", 0);
        setField(term704974, term704974.getClass(), "jsType", null);
        setField(term704974, term704974.getClass(), "parent", null);
        setField(term704973, term704973.getClass(), "parent", term704974);
        term704975 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term704975, term704975.getClass(), "number", 0.0);
        setIntField(term704975, term704975.getClass(), "type", 104);
        setField(term704975, term704975.getClass(), "next", null);
        setField(term704975, term704975.getClass(), "first", null);
        setField(term704975, term704975.getClass(), "last", null);
        setField(term704975, term704975.getClass(), "propListHead", null);
        setIntField(term704975, term704975.getClass(), "sourcePosition", 0);
        setField(term704975, term704975.getClass(), "jsType", null);
        setField(term704975, term704975.getClass(), "parent", null);
        term704976 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term704976, term704976.getClass(), "str", null);
        setIntField(term704976, term704976.getClass(), "type", 44);
        setField(term704976, term704976.getClass(), "next", null);
        setField(term704976, term704976.getClass(), "first", null);
        setField(term704976, term704976.getClass(), "last", null);
        setField(term704976, term704976.getClass(), "propListHead", null);
        setIntField(term704976, term704976.getClass(), "sourcePosition", 0);
        setField(term704976, term704976.getClass(), "jsType", null);
        setField(term704976, term704976.getClass(), "parent", null);
        term704894 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term704905 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term704894, term704894.getClass(), "functionName", null);
        setBooleanField(term704894, term704894.getClass(), "itsNeedsActivation", false);
        setIntField(term704894, term704894.getClass(), "itsFunctionType", 0);
        setBooleanField(term704894, term704894.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term704894, term704894.getClass(), "encodedSourceStart", 0);
        setIntField(term704894, term704894.getClass(), "encodedSourceEnd", 0);
        setField(term704894, term704894.getClass(), "sourceName", null);
        setIntField(term704894, term704894.getClass(), "baseLineno", 0);
        setIntField(term704894, term704894.getClass(), "endLineno", 0);
        setField(term704894, term704894.getClass(), "functions", null);
        setField(term704894, term704894.getClass(), "regexps", null);
        setField(term704894, term704894.getClass(), "itsVariables", null);
        setField(term704894, term704894.getClass(), "itsConst", null);
        setField(term704894, term704894.getClass(), "itsVariableNames", null);
        setIntField(term704894, term704894.getClass(), "varStart", 0);
        setField(term704894, term704894.getClass(), "compilerData", null);
        setIntField(term704894, term704894.getClass(), "type", 0);
        setField(term704894, term704894.getClass(), "next", null);
        setField(term704894, term704894.getClass(), "first", null);
        setField(term704894, term704894.getClass(), "last", null);
        setField(term704894, term704894.getClass(), "propListHead", null);
        setIntField(term704894, term704894.getClass(), "sourcePosition", 0);
        setField(term704894, term704894.getClass(), "jsType", null);
        setDoubleField(term704905, term704905.getClass(), "number", 0.0);
        setIntField(term704905, term704905.getClass(), "type", 108);
        setField(term704905, term704905.getClass(), "next", null);
        setField(term704905, term704905.getClass(), "first", null);
        setField(term704905, term704905.getClass(), "last", null);
        setField(term704905, term704905.getClass(), "propListHead", null);
        setIntField(term704905, term704905.getClass(), "sourcePosition", 0);
        setField(term704905, term704905.getClass(), "jsType", null);
        setField(term704905, term704905.getClass(), "parent", null);
        setField(term704894, term704894.getClass(), "parent", term704905);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term704613;
        args[1] = term704797;
        args[2] = term704889;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term704527, args);
        assertTrue(recursiveEquals(term704527, term704972));
        assertTrue(recursiveEquals(term704613, term704973));
        assertTrue(recursiveEquals(term704797, term704975));
        assertTrue(recursiveEquals(term704889, term704976));
        assertTrue(recursiveEquals(retValue, term704894));
    }

};


