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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137830;
     Object term137900;
     Object term138298;
     Object term138299;
     Object term138220;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137830 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term137900 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term137990 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term138080 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term137990, term137990.getClass(), "next", term138080);
        setIntField(term137990, term137990.getClass(), "type", 0);
        setField(term137900, term137900.getClass(), "first", term137990);
        setIntField(term137900, term137900.getClass(), "type", 101);
        setField(term137900, term137900.getClass(), "parent", null);
        term138298 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term138298, term138298.getClass(), "currentTraversal", null);
        term138299 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term138300 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term138301 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term138299, term138299.getClass(), "type", 101);
        setField(term138299, term138299.getClass(), "next", null);
        setIntField(term138300, term138300.getClass(), "encodedSourceStart", 0);
        setIntField(term138300, term138300.getClass(), "encodedSourceEnd", 0);
        setField(term138300, term138300.getClass(), "sourceName", null);
        setIntField(term138300, term138300.getClass(), "baseLineno", 0);
        setIntField(term138300, term138300.getClass(), "endLineno", 0);
        setField(term138300, term138300.getClass(), "functions", null);
        setField(term138300, term138300.getClass(), "regexps", null);
        setField(term138300, term138300.getClass(), "itsVariables", null);
        setField(term138300, term138300.getClass(), "itsConst", null);
        setField(term138300, term138300.getClass(), "itsVariableNames", null);
        setIntField(term138300, term138300.getClass(), "varStart", 0);
        setField(term138300, term138300.getClass(), "compilerData", null);
        setIntField(term138300, term138300.getClass(), "type", 0);
        setIntField(term138301, term138301.getClass(), "encodedSourceStart", 0);
        setIntField(term138301, term138301.getClass(), "encodedSourceEnd", 0);
        setField(term138301, term138301.getClass(), "sourceName", null);
        setIntField(term138301, term138301.getClass(), "baseLineno", 0);
        setIntField(term138301, term138301.getClass(), "endLineno", 0);
        setField(term138301, term138301.getClass(), "functions", null);
        setField(term138301, term138301.getClass(), "regexps", null);
        setField(term138301, term138301.getClass(), "itsVariables", null);
        setField(term138301, term138301.getClass(), "itsConst", null);
        setField(term138301, term138301.getClass(), "itsVariableNames", null);
        setIntField(term138301, term138301.getClass(), "varStart", 0);
        setField(term138301, term138301.getClass(), "compilerData", null);
        setIntField(term138301, term138301.getClass(), "type", 0);
        setField(term138301, term138301.getClass(), "next", null);
        setField(term138301, term138301.getClass(), "first", null);
        setField(term138301, term138301.getClass(), "last", null);
        setField(term138301, term138301.getClass(), "propListHead", null);
        setIntField(term138301, term138301.getClass(), "sourcePosition", 0);
        setField(term138301, term138301.getClass(), "jsType", null);
        setField(term138301, term138301.getClass(), "parent", null);
        setField(term138300, term138300.getClass(), "next", term138301);
        setField(term138300, term138300.getClass(), "first", null);
        setField(term138300, term138300.getClass(), "last", null);
        setField(term138300, term138300.getClass(), "propListHead", null);
        setIntField(term138300, term138300.getClass(), "sourcePosition", 0);
        setField(term138300, term138300.getClass(), "jsType", null);
        setField(term138300, term138300.getClass(), "parent", null);
        setField(term138299, term138299.getClass(), "first", term138300);
        setField(term138299, term138299.getClass(), "last", null);
        setField(term138299, term138299.getClass(), "propListHead", null);
        setIntField(term138299, term138299.getClass(), "sourcePosition", 0);
        setField(term138299, term138299.getClass(), "jsType", null);
        setField(term138299, term138299.getClass(), "parent", null);
        term138220 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term138222 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term138229 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term138220, term138220.getClass(), "type", 101);
        setField(term138220, term138220.getClass(), "next", null);
        setIntField(term138222, term138222.getClass(), "encodedSourceStart", 0);
        setIntField(term138222, term138222.getClass(), "encodedSourceEnd", 0);
        setField(term138222, term138222.getClass(), "sourceName", null);
        setIntField(term138222, term138222.getClass(), "baseLineno", 0);
        setIntField(term138222, term138222.getClass(), "endLineno", 0);
        setField(term138222, term138222.getClass(), "functions", null);
        setField(term138222, term138222.getClass(), "regexps", null);
        setField(term138222, term138222.getClass(), "itsVariables", null);
        setField(term138222, term138222.getClass(), "itsConst", null);
        setField(term138222, term138222.getClass(), "itsVariableNames", null);
        setIntField(term138222, term138222.getClass(), "varStart", 0);
        setField(term138222, term138222.getClass(), "compilerData", null);
        setIntField(term138222, term138222.getClass(), "type", 0);
        setIntField(term138229, term138229.getClass(), "encodedSourceStart", 0);
        setIntField(term138229, term138229.getClass(), "encodedSourceEnd", 0);
        setField(term138229, term138229.getClass(), "sourceName", null);
        setIntField(term138229, term138229.getClass(), "baseLineno", 0);
        setIntField(term138229, term138229.getClass(), "endLineno", 0);
        setField(term138229, term138229.getClass(), "functions", null);
        setField(term138229, term138229.getClass(), "regexps", null);
        setField(term138229, term138229.getClass(), "itsVariables", null);
        setField(term138229, term138229.getClass(), "itsConst", null);
        setField(term138229, term138229.getClass(), "itsVariableNames", null);
        setIntField(term138229, term138229.getClass(), "varStart", 0);
        setField(term138229, term138229.getClass(), "compilerData", null);
        setIntField(term138229, term138229.getClass(), "type", 0);
        setField(term138229, term138229.getClass(), "next", null);
        setField(term138229, term138229.getClass(), "first", null);
        setField(term138229, term138229.getClass(), "last", null);
        setField(term138229, term138229.getClass(), "propListHead", null);
        setIntField(term138229, term138229.getClass(), "sourcePosition", 0);
        setField(term138229, term138229.getClass(), "jsType", null);
        setField(term138229, term138229.getClass(), "parent", null);
        setField(term138222, term138222.getClass(), "next", term138229);
        setField(term138222, term138222.getClass(), "first", null);
        setField(term138222, term138222.getClass(), "last", null);
        setField(term138222, term138222.getClass(), "propListHead", null);
        setIntField(term138222, term138222.getClass(), "sourcePosition", 0);
        setField(term138222, term138222.getClass(), "jsType", null);
        setField(term138222, term138222.getClass(), "parent", null);
        setField(term138220, term138220.getClass(), "first", term138222);
        setField(term138220, term138220.getClass(), "last", null);
        setField(term138220, term138220.getClass(), "propListHead", null);
        setIntField(term138220, term138220.getClass(), "sourcePosition", 0);
        setField(term138220, term138220.getClass(), "jsType", null);
        setField(term138220, term138220.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term137900;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term137830, args);
        assertTrue(recursiveEquals(term137830, term138298));
        assertTrue(recursiveEquals(term137900, term138299));
        assertTrue(recursiveEquals(retValue, term138220));
    }

};


