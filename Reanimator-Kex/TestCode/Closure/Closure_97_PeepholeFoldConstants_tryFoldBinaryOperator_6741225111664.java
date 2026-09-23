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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111664 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term663508;
     Object term663600;
     Object term663933;
     Object term663934;
     Object term663886;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111664() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term663508 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term663600 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term663686 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term663756 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term663686, term663686.getClass(), "next", term663756);
        setField(term663600, term663600.getClass(), "first", term663686);
        setIntField(term663600, term663600.getClass(), "type", 33);
        term663933 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term663933, term663933.getClass(), "currentTraversal", null);
        term663934 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term663935 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term663936 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term663934, term663934.getClass(), "str", null);
        setIntField(term663934, term663934.getClass(), "type", 33);
        setField(term663934, term663934.getClass(), "next", null);
        setField(term663935, term663935.getClass(), "functionName", null);
        setBooleanField(term663935, term663935.getClass(), "itsNeedsActivation", false);
        setIntField(term663935, term663935.getClass(), "itsFunctionType", 0);
        setBooleanField(term663935, term663935.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term663935, term663935.getClass(), "encodedSourceStart", 0);
        setIntField(term663935, term663935.getClass(), "encodedSourceEnd", 0);
        setField(term663935, term663935.getClass(), "sourceName", null);
        setIntField(term663935, term663935.getClass(), "baseLineno", 0);
        setIntField(term663935, term663935.getClass(), "endLineno", 0);
        setField(term663935, term663935.getClass(), "functions", null);
        setField(term663935, term663935.getClass(), "regexps", null);
        setField(term663935, term663935.getClass(), "itsVariables", null);
        setField(term663935, term663935.getClass(), "itsConst", null);
        setField(term663935, term663935.getClass(), "itsVariableNames", null);
        setIntField(term663935, term663935.getClass(), "varStart", 0);
        setField(term663935, term663935.getClass(), "compilerData", null);
        setIntField(term663935, term663935.getClass(), "type", 0);
        setIntField(term663936, term663936.getClass(), "type", 0);
        setField(term663936, term663936.getClass(), "next", null);
        setField(term663936, term663936.getClass(), "first", null);
        setField(term663936, term663936.getClass(), "last", null);
        setField(term663936, term663936.getClass(), "propListHead", null);
        setIntField(term663936, term663936.getClass(), "sourcePosition", 0);
        setField(term663936, term663936.getClass(), "jsType", null);
        setField(term663936, term663936.getClass(), "parent", null);
        setField(term663935, term663935.getClass(), "next", term663936);
        setField(term663935, term663935.getClass(), "first", null);
        setField(term663935, term663935.getClass(), "last", null);
        setField(term663935, term663935.getClass(), "propListHead", null);
        setIntField(term663935, term663935.getClass(), "sourcePosition", 0);
        setField(term663935, term663935.getClass(), "jsType", null);
        setField(term663935, term663935.getClass(), "parent", null);
        setField(term663934, term663934.getClass(), "first", term663935);
        setField(term663934, term663934.getClass(), "last", null);
        setField(term663934, term663934.getClass(), "propListHead", null);
        setIntField(term663934, term663934.getClass(), "sourcePosition", 0);
        setField(term663934, term663934.getClass(), "jsType", null);
        setField(term663934, term663934.getClass(), "parent", null);
        term663886 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term663888 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term663898 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term663886, term663886.getClass(), "str", null);
        setIntField(term663886, term663886.getClass(), "type", 33);
        setField(term663886, term663886.getClass(), "next", null);
        setField(term663888, term663888.getClass(), "functionName", null);
        setBooleanField(term663888, term663888.getClass(), "itsNeedsActivation", false);
        setIntField(term663888, term663888.getClass(), "itsFunctionType", 0);
        setBooleanField(term663888, term663888.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term663888, term663888.getClass(), "encodedSourceStart", 0);
        setIntField(term663888, term663888.getClass(), "encodedSourceEnd", 0);
        setField(term663888, term663888.getClass(), "sourceName", null);
        setIntField(term663888, term663888.getClass(), "baseLineno", 0);
        setIntField(term663888, term663888.getClass(), "endLineno", 0);
        setField(term663888, term663888.getClass(), "functions", null);
        setField(term663888, term663888.getClass(), "regexps", null);
        setField(term663888, term663888.getClass(), "itsVariables", null);
        setField(term663888, term663888.getClass(), "itsConst", null);
        setField(term663888, term663888.getClass(), "itsVariableNames", null);
        setIntField(term663888, term663888.getClass(), "varStart", 0);
        setField(term663888, term663888.getClass(), "compilerData", null);
        setIntField(term663888, term663888.getClass(), "type", 0);
        setIntField(term663898, term663898.getClass(), "type", 0);
        setField(term663898, term663898.getClass(), "next", null);
        setField(term663898, term663898.getClass(), "first", null);
        setField(term663898, term663898.getClass(), "last", null);
        setField(term663898, term663898.getClass(), "propListHead", null);
        setIntField(term663898, term663898.getClass(), "sourcePosition", 0);
        setField(term663898, term663898.getClass(), "jsType", null);
        setField(term663898, term663898.getClass(), "parent", null);
        setField(term663888, term663888.getClass(), "next", term663898);
        setField(term663888, term663888.getClass(), "first", null);
        setField(term663888, term663888.getClass(), "last", null);
        setField(term663888, term663888.getClass(), "propListHead", null);
        setIntField(term663888, term663888.getClass(), "sourcePosition", 0);
        setField(term663888, term663888.getClass(), "jsType", null);
        setField(term663888, term663888.getClass(), "parent", null);
        setField(term663886, term663886.getClass(), "first", term663888);
        setField(term663886, term663886.getClass(), "last", null);
        setField(term663886, term663886.getClass(), "propListHead", null);
        setIntField(term663886, term663886.getClass(), "sourcePosition", 0);
        setField(term663886, term663886.getClass(), "jsType", null);
        setField(term663886, term663886.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term663600;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term663508, args);
        assertTrue(recursiveEquals(term663508, term663933));
        assertTrue(recursiveEquals(term663600, term663934));
        assertTrue(recursiveEquals(retValue, term663886));
    }

};


