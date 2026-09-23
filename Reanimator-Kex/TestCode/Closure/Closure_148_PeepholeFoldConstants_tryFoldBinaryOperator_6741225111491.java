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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term371061;
     Object term371153;
     Object term371819;
     Object term371820;
     Object term371751;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term371061 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term371153 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term371243 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term371335 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term371243, term371243.getClass(), "next", term371335);
        setIntField(term371243, term371243.getClass(), "type", 0);
        setField(term371153, term371153.getClass(), "first", term371243);
        setIntField(term371153, term371153.getClass(), "type", 101);
        setField(term371153, term371153.getClass(), "parent", null);
        term371819 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term371819, term371819.getClass(), "currentTraversal", null);
        term371820 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term371821 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term371822 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term371820, term371820.getClass(), "number", 0.0);
        setIntField(term371820, term371820.getClass(), "type", 101);
        setField(term371820, term371820.getClass(), "next", null);
        setIntField(term371821, term371821.getClass(), "encodedSourceStart", 0);
        setIntField(term371821, term371821.getClass(), "encodedSourceEnd", 0);
        setField(term371821, term371821.getClass(), "sourceName", null);
        setIntField(term371821, term371821.getClass(), "baseLineno", 0);
        setIntField(term371821, term371821.getClass(), "endLineno", 0);
        setField(term371821, term371821.getClass(), "functions", null);
        setField(term371821, term371821.getClass(), "regexps", null);
        setField(term371821, term371821.getClass(), "itsVariables", null);
        setField(term371821, term371821.getClass(), "itsConst", null);
        setField(term371821, term371821.getClass(), "itsVariableNames", null);
        setIntField(term371821, term371821.getClass(), "varStart", 0);
        setField(term371821, term371821.getClass(), "compilerData", null);
        setIntField(term371821, term371821.getClass(), "type", 0);
        setDoubleField(term371822, term371822.getClass(), "number", 0.0);
        setIntField(term371822, term371822.getClass(), "type", 0);
        setField(term371822, term371822.getClass(), "next", null);
        setField(term371822, term371822.getClass(), "first", null);
        setField(term371822, term371822.getClass(), "last", null);
        setField(term371822, term371822.getClass(), "propListHead", null);
        setIntField(term371822, term371822.getClass(), "sourcePosition", 0);
        setField(term371822, term371822.getClass(), "jsType", null);
        setField(term371822, term371822.getClass(), "parent", null);
        setField(term371821, term371821.getClass(), "next", term371822);
        setField(term371821, term371821.getClass(), "first", null);
        setField(term371821, term371821.getClass(), "last", null);
        setField(term371821, term371821.getClass(), "propListHead", null);
        setIntField(term371821, term371821.getClass(), "sourcePosition", 0);
        setField(term371821, term371821.getClass(), "jsType", null);
        setField(term371821, term371821.getClass(), "parent", null);
        setField(term371820, term371820.getClass(), "first", term371821);
        setField(term371820, term371820.getClass(), "last", null);
        setField(term371820, term371820.getClass(), "propListHead", null);
        setIntField(term371820, term371820.getClass(), "sourcePosition", 0);
        setField(term371820, term371820.getClass(), "jsType", null);
        setField(term371820, term371820.getClass(), "parent", null);
        term371751 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term371754 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term371761 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term371751, term371751.getClass(), "number", 0.0);
        setIntField(term371751, term371751.getClass(), "type", 101);
        setField(term371751, term371751.getClass(), "next", null);
        setIntField(term371754, term371754.getClass(), "encodedSourceStart", 0);
        setIntField(term371754, term371754.getClass(), "encodedSourceEnd", 0);
        setField(term371754, term371754.getClass(), "sourceName", null);
        setIntField(term371754, term371754.getClass(), "baseLineno", 0);
        setIntField(term371754, term371754.getClass(), "endLineno", 0);
        setField(term371754, term371754.getClass(), "functions", null);
        setField(term371754, term371754.getClass(), "regexps", null);
        setField(term371754, term371754.getClass(), "itsVariables", null);
        setField(term371754, term371754.getClass(), "itsConst", null);
        setField(term371754, term371754.getClass(), "itsVariableNames", null);
        setIntField(term371754, term371754.getClass(), "varStart", 0);
        setField(term371754, term371754.getClass(), "compilerData", null);
        setIntField(term371754, term371754.getClass(), "type", 0);
        setDoubleField(term371761, term371761.getClass(), "number", 0.0);
        setIntField(term371761, term371761.getClass(), "type", 0);
        setField(term371761, term371761.getClass(), "next", null);
        setField(term371761, term371761.getClass(), "first", null);
        setField(term371761, term371761.getClass(), "last", null);
        setField(term371761, term371761.getClass(), "propListHead", null);
        setIntField(term371761, term371761.getClass(), "sourcePosition", 0);
        setField(term371761, term371761.getClass(), "jsType", null);
        setField(term371761, term371761.getClass(), "parent", null);
        setField(term371754, term371754.getClass(), "next", term371761);
        setField(term371754, term371754.getClass(), "first", null);
        setField(term371754, term371754.getClass(), "last", null);
        setField(term371754, term371754.getClass(), "propListHead", null);
        setIntField(term371754, term371754.getClass(), "sourcePosition", 0);
        setField(term371754, term371754.getClass(), "jsType", null);
        setField(term371754, term371754.getClass(), "parent", null);
        setField(term371751, term371751.getClass(), "first", term371754);
        setField(term371751, term371751.getClass(), "last", null);
        setField(term371751, term371751.getClass(), "propListHead", null);
        setIntField(term371751, term371751.getClass(), "sourcePosition", 0);
        setField(term371751, term371751.getClass(), "jsType", null);
        setField(term371751, term371751.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term371153;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term371061, args);
        assertTrue(recursiveEquals(term371061, term371819));
        assertTrue(recursiveEquals(term371153, term371820));
        assertTrue(recursiveEquals(retValue, term371751));
    }

};


