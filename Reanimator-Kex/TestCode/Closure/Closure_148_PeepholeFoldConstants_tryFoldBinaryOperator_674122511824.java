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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511824 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term187037;
     Object term187123;
     Object term187648;
     Object term187649;
     Object term187563;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511824() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term187037 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term187123 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term187209 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term187279 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term187209, term187209.getClass(), "next", term187279);
        setField(term187123, term187123.getClass(), "first", term187209);
        setIntField(term187123, term187123.getClass(), "type", 100);
        term187648 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term187648, term187648.getClass(), "currentTraversal", null);
        term187649 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term187650 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term187651 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term187649, term187649.getClass(), "functionName", null);
        setBooleanField(term187649, term187649.getClass(), "itsNeedsActivation", false);
        setIntField(term187649, term187649.getClass(), "itsFunctionType", 0);
        setBooleanField(term187649, term187649.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term187649, term187649.getClass(), "encodedSourceStart", 0);
        setIntField(term187649, term187649.getClass(), "encodedSourceEnd", 0);
        setField(term187649, term187649.getClass(), "sourceName", null);
        setIntField(term187649, term187649.getClass(), "baseLineno", 0);
        setIntField(term187649, term187649.getClass(), "endLineno", 0);
        setField(term187649, term187649.getClass(), "functions", null);
        setField(term187649, term187649.getClass(), "regexps", null);
        setField(term187649, term187649.getClass(), "itsVariables", null);
        setField(term187649, term187649.getClass(), "itsConst", null);
        setField(term187649, term187649.getClass(), "itsVariableNames", null);
        setIntField(term187649, term187649.getClass(), "varStart", 0);
        setField(term187649, term187649.getClass(), "compilerData", null);
        setIntField(term187649, term187649.getClass(), "type", 100);
        setField(term187649, term187649.getClass(), "next", null);
        setField(term187650, term187650.getClass(), "functionName", null);
        setBooleanField(term187650, term187650.getClass(), "itsNeedsActivation", false);
        setIntField(term187650, term187650.getClass(), "itsFunctionType", 0);
        setBooleanField(term187650, term187650.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term187650, term187650.getClass(), "encodedSourceStart", 0);
        setIntField(term187650, term187650.getClass(), "encodedSourceEnd", 0);
        setField(term187650, term187650.getClass(), "sourceName", null);
        setIntField(term187650, term187650.getClass(), "baseLineno", 0);
        setIntField(term187650, term187650.getClass(), "endLineno", 0);
        setField(term187650, term187650.getClass(), "functions", null);
        setField(term187650, term187650.getClass(), "regexps", null);
        setField(term187650, term187650.getClass(), "itsVariables", null);
        setField(term187650, term187650.getClass(), "itsConst", null);
        setField(term187650, term187650.getClass(), "itsVariableNames", null);
        setIntField(term187650, term187650.getClass(), "varStart", 0);
        setField(term187650, term187650.getClass(), "compilerData", null);
        setIntField(term187650, term187650.getClass(), "type", 0);
        setIntField(term187651, term187651.getClass(), "type", 0);
        setField(term187651, term187651.getClass(), "next", null);
        setField(term187651, term187651.getClass(), "first", null);
        setField(term187651, term187651.getClass(), "last", null);
        setField(term187651, term187651.getClass(), "propListHead", null);
        setIntField(term187651, term187651.getClass(), "sourcePosition", 0);
        setField(term187651, term187651.getClass(), "jsType", null);
        setField(term187651, term187651.getClass(), "parent", null);
        setField(term187650, term187650.getClass(), "next", term187651);
        setField(term187650, term187650.getClass(), "first", null);
        setField(term187650, term187650.getClass(), "last", null);
        setField(term187650, term187650.getClass(), "propListHead", null);
        setIntField(term187650, term187650.getClass(), "sourcePosition", 0);
        setField(term187650, term187650.getClass(), "jsType", null);
        setField(term187650, term187650.getClass(), "parent", null);
        setField(term187649, term187649.getClass(), "first", term187650);
        setField(term187649, term187649.getClass(), "last", null);
        setField(term187649, term187649.getClass(), "propListHead", null);
        setIntField(term187649, term187649.getClass(), "sourcePosition", 0);
        setField(term187649, term187649.getClass(), "jsType", null);
        setField(term187649, term187649.getClass(), "parent", null);
        term187563 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term187573 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term187583 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term187563, term187563.getClass(), "functionName", null);
        setBooleanField(term187563, term187563.getClass(), "itsNeedsActivation", false);
        setIntField(term187563, term187563.getClass(), "itsFunctionType", 0);
        setBooleanField(term187563, term187563.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term187563, term187563.getClass(), "encodedSourceStart", 0);
        setIntField(term187563, term187563.getClass(), "encodedSourceEnd", 0);
        setField(term187563, term187563.getClass(), "sourceName", null);
        setIntField(term187563, term187563.getClass(), "baseLineno", 0);
        setIntField(term187563, term187563.getClass(), "endLineno", 0);
        setField(term187563, term187563.getClass(), "functions", null);
        setField(term187563, term187563.getClass(), "regexps", null);
        setField(term187563, term187563.getClass(), "itsVariables", null);
        setField(term187563, term187563.getClass(), "itsConst", null);
        setField(term187563, term187563.getClass(), "itsVariableNames", null);
        setIntField(term187563, term187563.getClass(), "varStart", 0);
        setField(term187563, term187563.getClass(), "compilerData", null);
        setIntField(term187563, term187563.getClass(), "type", 100);
        setField(term187563, term187563.getClass(), "next", null);
        setField(term187573, term187573.getClass(), "functionName", null);
        setBooleanField(term187573, term187573.getClass(), "itsNeedsActivation", false);
        setIntField(term187573, term187573.getClass(), "itsFunctionType", 0);
        setBooleanField(term187573, term187573.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term187573, term187573.getClass(), "encodedSourceStart", 0);
        setIntField(term187573, term187573.getClass(), "encodedSourceEnd", 0);
        setField(term187573, term187573.getClass(), "sourceName", null);
        setIntField(term187573, term187573.getClass(), "baseLineno", 0);
        setIntField(term187573, term187573.getClass(), "endLineno", 0);
        setField(term187573, term187573.getClass(), "functions", null);
        setField(term187573, term187573.getClass(), "regexps", null);
        setField(term187573, term187573.getClass(), "itsVariables", null);
        setField(term187573, term187573.getClass(), "itsConst", null);
        setField(term187573, term187573.getClass(), "itsVariableNames", null);
        setIntField(term187573, term187573.getClass(), "varStart", 0);
        setField(term187573, term187573.getClass(), "compilerData", null);
        setIntField(term187573, term187573.getClass(), "type", 0);
        setIntField(term187583, term187583.getClass(), "type", 0);
        setField(term187583, term187583.getClass(), "next", null);
        setField(term187583, term187583.getClass(), "first", null);
        setField(term187583, term187583.getClass(), "last", null);
        setField(term187583, term187583.getClass(), "propListHead", null);
        setIntField(term187583, term187583.getClass(), "sourcePosition", 0);
        setField(term187583, term187583.getClass(), "jsType", null);
        setField(term187583, term187583.getClass(), "parent", null);
        setField(term187573, term187573.getClass(), "next", term187583);
        setField(term187573, term187573.getClass(), "first", null);
        setField(term187573, term187573.getClass(), "last", null);
        setField(term187573, term187573.getClass(), "propListHead", null);
        setIntField(term187573, term187573.getClass(), "sourcePosition", 0);
        setField(term187573, term187573.getClass(), "jsType", null);
        setField(term187573, term187573.getClass(), "parent", null);
        setField(term187563, term187563.getClass(), "first", term187573);
        setField(term187563, term187563.getClass(), "last", null);
        setField(term187563, term187563.getClass(), "propListHead", null);
        setIntField(term187563, term187563.getClass(), "sourcePosition", 0);
        setField(term187563, term187563.getClass(), "jsType", null);
        setField(term187563, term187563.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term187123;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term187037, args);
        assertTrue(recursiveEquals(term187037, term187648));
        assertTrue(recursiveEquals(term187123, term187649));
        assertTrue(recursiveEquals(retValue, term187563));
    }

};


