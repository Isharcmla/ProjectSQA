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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111672 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term429541;
     Object term429633;
     Object term430239;
     Object term430240;
     Object term430189;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111672() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term429541 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term429633 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term429719 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term429789 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term429719, term429719.getClass(), "next", term429789);
        setField(term429633, term429633.getClass(), "first", term429719);
        setIntField(term429633, term429633.getClass(), "type", 52);
        term430239 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term430239, term430239.getClass(), "currentTraversal", null);
        term430240 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term430241 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term430242 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term430240, term430240.getClass(), "str", null);
        setIntField(term430240, term430240.getClass(), "type", 52);
        setField(term430240, term430240.getClass(), "next", null);
        setField(term430241, term430241.getClass(), "functionName", null);
        setBooleanField(term430241, term430241.getClass(), "itsNeedsActivation", false);
        setIntField(term430241, term430241.getClass(), "itsFunctionType", 0);
        setBooleanField(term430241, term430241.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term430241, term430241.getClass(), "encodedSourceStart", 0);
        setIntField(term430241, term430241.getClass(), "encodedSourceEnd", 0);
        setField(term430241, term430241.getClass(), "sourceName", null);
        setIntField(term430241, term430241.getClass(), "baseLineno", 0);
        setIntField(term430241, term430241.getClass(), "endLineno", 0);
        setField(term430241, term430241.getClass(), "functions", null);
        setField(term430241, term430241.getClass(), "regexps", null);
        setField(term430241, term430241.getClass(), "itsVariables", null);
        setField(term430241, term430241.getClass(), "itsConst", null);
        setField(term430241, term430241.getClass(), "itsVariableNames", null);
        setIntField(term430241, term430241.getClass(), "varStart", 0);
        setField(term430241, term430241.getClass(), "compilerData", null);
        setIntField(term430241, term430241.getClass(), "type", 0);
        setIntField(term430242, term430242.getClass(), "type", 0);
        setField(term430242, term430242.getClass(), "next", null);
        setField(term430242, term430242.getClass(), "first", null);
        setField(term430242, term430242.getClass(), "last", null);
        setField(term430242, term430242.getClass(), "propListHead", null);
        setIntField(term430242, term430242.getClass(), "sourcePosition", 0);
        setField(term430242, term430242.getClass(), "jsType", null);
        setField(term430242, term430242.getClass(), "parent", null);
        setField(term430241, term430241.getClass(), "next", term430242);
        setField(term430241, term430241.getClass(), "first", null);
        setField(term430241, term430241.getClass(), "last", null);
        setField(term430241, term430241.getClass(), "propListHead", null);
        setIntField(term430241, term430241.getClass(), "sourcePosition", 0);
        setField(term430241, term430241.getClass(), "jsType", null);
        setField(term430241, term430241.getClass(), "parent", null);
        setField(term430240, term430240.getClass(), "first", term430241);
        setField(term430240, term430240.getClass(), "last", null);
        setField(term430240, term430240.getClass(), "propListHead", null);
        setIntField(term430240, term430240.getClass(), "sourcePosition", 0);
        setField(term430240, term430240.getClass(), "jsType", null);
        setField(term430240, term430240.getClass(), "parent", null);
        term430189 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term430191 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term430201 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term430189, term430189.getClass(), "str", null);
        setIntField(term430189, term430189.getClass(), "type", 52);
        setField(term430189, term430189.getClass(), "next", null);
        setField(term430191, term430191.getClass(), "functionName", null);
        setBooleanField(term430191, term430191.getClass(), "itsNeedsActivation", false);
        setIntField(term430191, term430191.getClass(), "itsFunctionType", 0);
        setBooleanField(term430191, term430191.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term430191, term430191.getClass(), "encodedSourceStart", 0);
        setIntField(term430191, term430191.getClass(), "encodedSourceEnd", 0);
        setField(term430191, term430191.getClass(), "sourceName", null);
        setIntField(term430191, term430191.getClass(), "baseLineno", 0);
        setIntField(term430191, term430191.getClass(), "endLineno", 0);
        setField(term430191, term430191.getClass(), "functions", null);
        setField(term430191, term430191.getClass(), "regexps", null);
        setField(term430191, term430191.getClass(), "itsVariables", null);
        setField(term430191, term430191.getClass(), "itsConst", null);
        setField(term430191, term430191.getClass(), "itsVariableNames", null);
        setIntField(term430191, term430191.getClass(), "varStart", 0);
        setField(term430191, term430191.getClass(), "compilerData", null);
        setIntField(term430191, term430191.getClass(), "type", 0);
        setIntField(term430201, term430201.getClass(), "type", 0);
        setField(term430201, term430201.getClass(), "next", null);
        setField(term430201, term430201.getClass(), "first", null);
        setField(term430201, term430201.getClass(), "last", null);
        setField(term430201, term430201.getClass(), "propListHead", null);
        setIntField(term430201, term430201.getClass(), "sourcePosition", 0);
        setField(term430201, term430201.getClass(), "jsType", null);
        setField(term430201, term430201.getClass(), "parent", null);
        setField(term430191, term430191.getClass(), "next", term430201);
        setField(term430191, term430191.getClass(), "first", null);
        setField(term430191, term430191.getClass(), "last", null);
        setField(term430191, term430191.getClass(), "propListHead", null);
        setIntField(term430191, term430191.getClass(), "sourcePosition", 0);
        setField(term430191, term430191.getClass(), "jsType", null);
        setField(term430191, term430191.getClass(), "parent", null);
        setField(term430189, term430189.getClass(), "first", term430191);
        setField(term430189, term430189.getClass(), "last", null);
        setField(term430189, term430189.getClass(), "propListHead", null);
        setIntField(term430189, term430189.getClass(), "sourcePosition", 0);
        setField(term430189, term430189.getClass(), "jsType", null);
        setField(term430189, term430189.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term429633;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term429541, args);
        assertTrue(recursiveEquals(term429541, term430239));
        assertTrue(recursiveEquals(term429633, term430240));
        assertTrue(recursiveEquals(retValue, term430189));
    }

};


