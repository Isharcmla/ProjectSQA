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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112446 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term683299;
     Object term683369;
     Object term683872;
     Object term683873;
     Object term683775;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112446() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term683299 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term683369 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term683459 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term683549 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term683641 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term683549, term683549.getClass(), "type", 44);
        setField(term683459, term683459.getClass(), "next", term683549);
        setIntField(term683459, term683459.getClass(), "type", 0);
        setField(term683369, term683369.getClass(), "first", term683459);
        setIntField(term683369, term683369.getClass(), "type", 101);
        setField(term683369, term683369.getClass(), "parent", term683641);
        term683872 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term683872, term683872.getClass(), "currentTraversal", null);
        term683873 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term683874 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term683875 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term683876 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term683873, term683873.getClass(), "type", 101);
        setField(term683873, term683873.getClass(), "next", null);
        setIntField(term683874, term683874.getClass(), "encodedSourceStart", 0);
        setIntField(term683874, term683874.getClass(), "encodedSourceEnd", 0);
        setField(term683874, term683874.getClass(), "sourceName", null);
        setIntField(term683874, term683874.getClass(), "baseLineno", 0);
        setIntField(term683874, term683874.getClass(), "endLineno", 0);
        setField(term683874, term683874.getClass(), "functions", null);
        setField(term683874, term683874.getClass(), "regexps", null);
        setField(term683874, term683874.getClass(), "itsVariables", null);
        setField(term683874, term683874.getClass(), "itsConst", null);
        setField(term683874, term683874.getClass(), "itsVariableNames", null);
        setIntField(term683874, term683874.getClass(), "varStart", 0);
        setField(term683874, term683874.getClass(), "compilerData", null);
        setIntField(term683874, term683874.getClass(), "type", 0);
        setIntField(term683875, term683875.getClass(), "encodedSourceStart", 0);
        setIntField(term683875, term683875.getClass(), "encodedSourceEnd", 0);
        setField(term683875, term683875.getClass(), "sourceName", null);
        setIntField(term683875, term683875.getClass(), "baseLineno", 0);
        setIntField(term683875, term683875.getClass(), "endLineno", 0);
        setField(term683875, term683875.getClass(), "functions", null);
        setField(term683875, term683875.getClass(), "regexps", null);
        setField(term683875, term683875.getClass(), "itsVariables", null);
        setField(term683875, term683875.getClass(), "itsConst", null);
        setField(term683875, term683875.getClass(), "itsVariableNames", null);
        setIntField(term683875, term683875.getClass(), "varStart", 0);
        setField(term683875, term683875.getClass(), "compilerData", null);
        setIntField(term683875, term683875.getClass(), "type", 44);
        setField(term683875, term683875.getClass(), "next", null);
        setField(term683875, term683875.getClass(), "first", null);
        setField(term683875, term683875.getClass(), "last", null);
        setField(term683875, term683875.getClass(), "propListHead", null);
        setIntField(term683875, term683875.getClass(), "sourcePosition", 0);
        setField(term683875, term683875.getClass(), "jsType", null);
        setField(term683875, term683875.getClass(), "parent", null);
        setField(term683874, term683874.getClass(), "next", term683875);
        setField(term683874, term683874.getClass(), "first", null);
        setField(term683874, term683874.getClass(), "last", null);
        setField(term683874, term683874.getClass(), "propListHead", null);
        setIntField(term683874, term683874.getClass(), "sourcePosition", 0);
        setField(term683874, term683874.getClass(), "jsType", null);
        setField(term683874, term683874.getClass(), "parent", null);
        setField(term683873, term683873.getClass(), "first", term683874);
        setField(term683873, term683873.getClass(), "last", null);
        setField(term683873, term683873.getClass(), "propListHead", null);
        setIntField(term683873, term683873.getClass(), "sourcePosition", 0);
        setField(term683873, term683873.getClass(), "jsType", null);
        setDoubleField(term683876, term683876.getClass(), "number", 0.0);
        setIntField(term683876, term683876.getClass(), "type", 0);
        setField(term683876, term683876.getClass(), "next", null);
        setField(term683876, term683876.getClass(), "first", null);
        setField(term683876, term683876.getClass(), "last", null);
        setField(term683876, term683876.getClass(), "propListHead", null);
        setIntField(term683876, term683876.getClass(), "sourcePosition", 0);
        setField(term683876, term683876.getClass(), "jsType", null);
        setField(term683876, term683876.getClass(), "parent", null);
        setField(term683873, term683873.getClass(), "parent", term683876);
        term683775 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term683777 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term683784 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term683794 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term683775, term683775.getClass(), "type", 101);
        setField(term683775, term683775.getClass(), "next", null);
        setIntField(term683777, term683777.getClass(), "encodedSourceStart", 0);
        setIntField(term683777, term683777.getClass(), "encodedSourceEnd", 0);
        setField(term683777, term683777.getClass(), "sourceName", null);
        setIntField(term683777, term683777.getClass(), "baseLineno", 0);
        setIntField(term683777, term683777.getClass(), "endLineno", 0);
        setField(term683777, term683777.getClass(), "functions", null);
        setField(term683777, term683777.getClass(), "regexps", null);
        setField(term683777, term683777.getClass(), "itsVariables", null);
        setField(term683777, term683777.getClass(), "itsConst", null);
        setField(term683777, term683777.getClass(), "itsVariableNames", null);
        setIntField(term683777, term683777.getClass(), "varStart", 0);
        setField(term683777, term683777.getClass(), "compilerData", null);
        setIntField(term683777, term683777.getClass(), "type", 0);
        setIntField(term683784, term683784.getClass(), "encodedSourceStart", 0);
        setIntField(term683784, term683784.getClass(), "encodedSourceEnd", 0);
        setField(term683784, term683784.getClass(), "sourceName", null);
        setIntField(term683784, term683784.getClass(), "baseLineno", 0);
        setIntField(term683784, term683784.getClass(), "endLineno", 0);
        setField(term683784, term683784.getClass(), "functions", null);
        setField(term683784, term683784.getClass(), "regexps", null);
        setField(term683784, term683784.getClass(), "itsVariables", null);
        setField(term683784, term683784.getClass(), "itsConst", null);
        setField(term683784, term683784.getClass(), "itsVariableNames", null);
        setIntField(term683784, term683784.getClass(), "varStart", 0);
        setField(term683784, term683784.getClass(), "compilerData", null);
        setIntField(term683784, term683784.getClass(), "type", 44);
        setField(term683784, term683784.getClass(), "next", null);
        setField(term683784, term683784.getClass(), "first", null);
        setField(term683784, term683784.getClass(), "last", null);
        setField(term683784, term683784.getClass(), "propListHead", null);
        setIntField(term683784, term683784.getClass(), "sourcePosition", 0);
        setField(term683784, term683784.getClass(), "jsType", null);
        setField(term683784, term683784.getClass(), "parent", null);
        setField(term683777, term683777.getClass(), "next", term683784);
        setField(term683777, term683777.getClass(), "first", null);
        setField(term683777, term683777.getClass(), "last", null);
        setField(term683777, term683777.getClass(), "propListHead", null);
        setIntField(term683777, term683777.getClass(), "sourcePosition", 0);
        setField(term683777, term683777.getClass(), "jsType", null);
        setField(term683777, term683777.getClass(), "parent", null);
        setField(term683775, term683775.getClass(), "first", term683777);
        setField(term683775, term683775.getClass(), "last", null);
        setField(term683775, term683775.getClass(), "propListHead", null);
        setIntField(term683775, term683775.getClass(), "sourcePosition", 0);
        setField(term683775, term683775.getClass(), "jsType", null);
        setDoubleField(term683794, term683794.getClass(), "number", 0.0);
        setIntField(term683794, term683794.getClass(), "type", 0);
        setField(term683794, term683794.getClass(), "next", null);
        setField(term683794, term683794.getClass(), "first", null);
        setField(term683794, term683794.getClass(), "last", null);
        setField(term683794, term683794.getClass(), "propListHead", null);
        setIntField(term683794, term683794.getClass(), "sourcePosition", 0);
        setField(term683794, term683794.getClass(), "jsType", null);
        setField(term683794, term683794.getClass(), "parent", null);
        setField(term683775, term683775.getClass(), "parent", term683794);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term683369;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term683299, args);
        assertTrue(recursiveEquals(term683299, term683872));
        assertTrue(recursiveEquals(term683369, term683873));
        assertTrue(recursiveEquals(retValue, term683775));
    }

};


