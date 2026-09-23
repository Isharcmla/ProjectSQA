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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902698 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term773174;
     Object term773260;
     Object term773444;
     Object term773536;
     Object term773755;
     Object term773756;
     Object term773758;
     Object term773759;
     Object term773677;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902698() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term773174 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term773260 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term773352 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term773352, term773352.getClass(), "type", 108);
        setField(term773260, term773260.getClass(), "parent", term773352);
        setIntField(term773260, term773260.getClass(), "type", 0);
        term773444 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term773444, term773444.getClass(), "type", 119);
        term773536 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term773536, term773536.getClass(), "type", 44);
        term773755 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term773755, term773755.getClass(), "currentTraversal", null);
        term773756 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term773757 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term773756, term773756.getClass(), "functionName", null);
        setBooleanField(term773756, term773756.getClass(), "itsNeedsActivation", false);
        setIntField(term773756, term773756.getClass(), "itsFunctionType", 0);
        setBooleanField(term773756, term773756.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term773756, term773756.getClass(), "encodedSourceStart", 0);
        setIntField(term773756, term773756.getClass(), "encodedSourceEnd", 0);
        setField(term773756, term773756.getClass(), "sourceName", null);
        setIntField(term773756, term773756.getClass(), "baseLineno", 0);
        setIntField(term773756, term773756.getClass(), "endLineno", 0);
        setField(term773756, term773756.getClass(), "functions", null);
        setField(term773756, term773756.getClass(), "regexps", null);
        setField(term773756, term773756.getClass(), "itsVariables", null);
        setField(term773756, term773756.getClass(), "itsConst", null);
        setField(term773756, term773756.getClass(), "itsVariableNames", null);
        setIntField(term773756, term773756.getClass(), "varStart", 0);
        setField(term773756, term773756.getClass(), "compilerData", null);
        setIntField(term773756, term773756.getClass(), "type", 0);
        setField(term773756, term773756.getClass(), "next", null);
        setField(term773756, term773756.getClass(), "first", null);
        setField(term773756, term773756.getClass(), "last", null);
        setField(term773756, term773756.getClass(), "propListHead", null);
        setIntField(term773756, term773756.getClass(), "sourcePosition", 0);
        setField(term773756, term773756.getClass(), "jsType", null);
        setDoubleField(term773757, term773757.getClass(), "number", 0.0);
        setIntField(term773757, term773757.getClass(), "type", 108);
        setField(term773757, term773757.getClass(), "next", null);
        setField(term773757, term773757.getClass(), "first", null);
        setField(term773757, term773757.getClass(), "last", null);
        setField(term773757, term773757.getClass(), "propListHead", null);
        setIntField(term773757, term773757.getClass(), "sourcePosition", 0);
        setField(term773757, term773757.getClass(), "jsType", null);
        setField(term773757, term773757.getClass(), "parent", null);
        setField(term773756, term773756.getClass(), "parent", term773757);
        term773758 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term773758, term773758.getClass(), "number", 0.0);
        setIntField(term773758, term773758.getClass(), "type", 119);
        setField(term773758, term773758.getClass(), "next", null);
        setField(term773758, term773758.getClass(), "first", null);
        setField(term773758, term773758.getClass(), "last", null);
        setField(term773758, term773758.getClass(), "propListHead", null);
        setIntField(term773758, term773758.getClass(), "sourcePosition", 0);
        setField(term773758, term773758.getClass(), "jsType", null);
        setField(term773758, term773758.getClass(), "parent", null);
        term773759 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term773759, term773759.getClass(), "str", null);
        setIntField(term773759, term773759.getClass(), "type", 44);
        setField(term773759, term773759.getClass(), "next", null);
        setField(term773759, term773759.getClass(), "first", null);
        setField(term773759, term773759.getClass(), "last", null);
        setField(term773759, term773759.getClass(), "propListHead", null);
        setIntField(term773759, term773759.getClass(), "sourcePosition", 0);
        setField(term773759, term773759.getClass(), "jsType", null);
        setField(term773759, term773759.getClass(), "parent", null);
        term773677 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term773688 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term773677, term773677.getClass(), "functionName", null);
        setBooleanField(term773677, term773677.getClass(), "itsNeedsActivation", false);
        setIntField(term773677, term773677.getClass(), "itsFunctionType", 0);
        setBooleanField(term773677, term773677.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term773677, term773677.getClass(), "encodedSourceStart", 0);
        setIntField(term773677, term773677.getClass(), "encodedSourceEnd", 0);
        setField(term773677, term773677.getClass(), "sourceName", null);
        setIntField(term773677, term773677.getClass(), "baseLineno", 0);
        setIntField(term773677, term773677.getClass(), "endLineno", 0);
        setField(term773677, term773677.getClass(), "functions", null);
        setField(term773677, term773677.getClass(), "regexps", null);
        setField(term773677, term773677.getClass(), "itsVariables", null);
        setField(term773677, term773677.getClass(), "itsConst", null);
        setField(term773677, term773677.getClass(), "itsVariableNames", null);
        setIntField(term773677, term773677.getClass(), "varStart", 0);
        setField(term773677, term773677.getClass(), "compilerData", null);
        setIntField(term773677, term773677.getClass(), "type", 0);
        setField(term773677, term773677.getClass(), "next", null);
        setField(term773677, term773677.getClass(), "first", null);
        setField(term773677, term773677.getClass(), "last", null);
        setField(term773677, term773677.getClass(), "propListHead", null);
        setIntField(term773677, term773677.getClass(), "sourcePosition", 0);
        setField(term773677, term773677.getClass(), "jsType", null);
        setDoubleField(term773688, term773688.getClass(), "number", 0.0);
        setIntField(term773688, term773688.getClass(), "type", 108);
        setField(term773688, term773688.getClass(), "next", null);
        setField(term773688, term773688.getClass(), "first", null);
        setField(term773688, term773688.getClass(), "last", null);
        setField(term773688, term773688.getClass(), "propListHead", null);
        setIntField(term773688, term773688.getClass(), "sourcePosition", 0);
        setField(term773688, term773688.getClass(), "jsType", null);
        setField(term773688, term773688.getClass(), "parent", null);
        setField(term773677, term773677.getClass(), "parent", term773688);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term773260;
        args[1] = term773444;
        args[2] = term773536;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term773174, args);
        assertTrue(recursiveEquals(term773174, term773755));
        assertTrue(recursiveEquals(term773260, term773756));
        assertTrue(recursiveEquals(term773444, term773758));
        assertTrue(recursiveEquals(term773536, term773759));
        assertTrue(recursiveEquals(retValue, term773677));
    }

};


