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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term676906;
     Object term676998;
     Object term677695;
     Object term677696;
     Object term677643;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term676906 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term676998 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term677084 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term677154 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term677084, term677084.getClass(), "next", term677154);
        setField(term676998, term676998.getClass(), "first", term677084);
        setIntField(term676998, term676998.getClass(), "type", 12);
        term677695 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term677695, term677695.getClass(), "currentTraversal", null);
        term677696 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term677697 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term677698 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term677696, term677696.getClass(), "number", 0.0);
        setIntField(term677696, term677696.getClass(), "type", 12);
        setField(term677696, term677696.getClass(), "next", null);
        setField(term677697, term677697.getClass(), "functionName", null);
        setBooleanField(term677697, term677697.getClass(), "itsNeedsActivation", false);
        setIntField(term677697, term677697.getClass(), "itsFunctionType", 0);
        setBooleanField(term677697, term677697.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term677697, term677697.getClass(), "encodedSourceStart", 0);
        setIntField(term677697, term677697.getClass(), "encodedSourceEnd", 0);
        setField(term677697, term677697.getClass(), "sourceName", null);
        setIntField(term677697, term677697.getClass(), "baseLineno", 0);
        setIntField(term677697, term677697.getClass(), "endLineno", 0);
        setField(term677697, term677697.getClass(), "functions", null);
        setField(term677697, term677697.getClass(), "regexps", null);
        setField(term677697, term677697.getClass(), "itsVariables", null);
        setField(term677697, term677697.getClass(), "itsConst", null);
        setField(term677697, term677697.getClass(), "itsVariableNames", null);
        setIntField(term677697, term677697.getClass(), "varStart", 0);
        setField(term677697, term677697.getClass(), "compilerData", null);
        setIntField(term677697, term677697.getClass(), "type", 0);
        setIntField(term677698, term677698.getClass(), "type", 0);
        setField(term677698, term677698.getClass(), "next", null);
        setField(term677698, term677698.getClass(), "first", null);
        setField(term677698, term677698.getClass(), "last", null);
        setField(term677698, term677698.getClass(), "propListHead", null);
        setIntField(term677698, term677698.getClass(), "sourcePosition", 0);
        setField(term677698, term677698.getClass(), "jsType", null);
        setField(term677698, term677698.getClass(), "parent", null);
        setField(term677697, term677697.getClass(), "next", term677698);
        setField(term677697, term677697.getClass(), "first", null);
        setField(term677697, term677697.getClass(), "last", null);
        setField(term677697, term677697.getClass(), "propListHead", null);
        setIntField(term677697, term677697.getClass(), "sourcePosition", 0);
        setField(term677697, term677697.getClass(), "jsType", null);
        setField(term677697, term677697.getClass(), "parent", null);
        setField(term677696, term677696.getClass(), "first", term677697);
        setField(term677696, term677696.getClass(), "last", null);
        setField(term677696, term677696.getClass(), "propListHead", null);
        setIntField(term677696, term677696.getClass(), "sourcePosition", 0);
        setField(term677696, term677696.getClass(), "jsType", null);
        setField(term677696, term677696.getClass(), "parent", null);
        term677643 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term677646 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term677656 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term677643, term677643.getClass(), "number", 0.0);
        setIntField(term677643, term677643.getClass(), "type", 12);
        setField(term677643, term677643.getClass(), "next", null);
        setField(term677646, term677646.getClass(), "functionName", null);
        setBooleanField(term677646, term677646.getClass(), "itsNeedsActivation", false);
        setIntField(term677646, term677646.getClass(), "itsFunctionType", 0);
        setBooleanField(term677646, term677646.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term677646, term677646.getClass(), "encodedSourceStart", 0);
        setIntField(term677646, term677646.getClass(), "encodedSourceEnd", 0);
        setField(term677646, term677646.getClass(), "sourceName", null);
        setIntField(term677646, term677646.getClass(), "baseLineno", 0);
        setIntField(term677646, term677646.getClass(), "endLineno", 0);
        setField(term677646, term677646.getClass(), "functions", null);
        setField(term677646, term677646.getClass(), "regexps", null);
        setField(term677646, term677646.getClass(), "itsVariables", null);
        setField(term677646, term677646.getClass(), "itsConst", null);
        setField(term677646, term677646.getClass(), "itsVariableNames", null);
        setIntField(term677646, term677646.getClass(), "varStart", 0);
        setField(term677646, term677646.getClass(), "compilerData", null);
        setIntField(term677646, term677646.getClass(), "type", 0);
        setIntField(term677656, term677656.getClass(), "type", 0);
        setField(term677656, term677656.getClass(), "next", null);
        setField(term677656, term677656.getClass(), "first", null);
        setField(term677656, term677656.getClass(), "last", null);
        setField(term677656, term677656.getClass(), "propListHead", null);
        setIntField(term677656, term677656.getClass(), "sourcePosition", 0);
        setField(term677656, term677656.getClass(), "jsType", null);
        setField(term677656, term677656.getClass(), "parent", null);
        setField(term677646, term677646.getClass(), "next", term677656);
        setField(term677646, term677646.getClass(), "first", null);
        setField(term677646, term677646.getClass(), "last", null);
        setField(term677646, term677646.getClass(), "propListHead", null);
        setIntField(term677646, term677646.getClass(), "sourcePosition", 0);
        setField(term677646, term677646.getClass(), "jsType", null);
        setField(term677646, term677646.getClass(), "parent", null);
        setField(term677643, term677643.getClass(), "first", term677646);
        setField(term677643, term677643.getClass(), "last", null);
        setField(term677643, term677643.getClass(), "propListHead", null);
        setIntField(term677643, term677643.getClass(), "sourcePosition", 0);
        setField(term677643, term677643.getClass(), "jsType", null);
        setField(term677643, term677643.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term676998;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term676906, args);
        assertTrue(recursiveEquals(term676906, term677695));
        assertTrue(recursiveEquals(term676998, term677696));
        assertTrue(recursiveEquals(retValue, term677643));
    }

};


