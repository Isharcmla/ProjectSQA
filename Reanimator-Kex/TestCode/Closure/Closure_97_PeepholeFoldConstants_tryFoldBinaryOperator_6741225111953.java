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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111953 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term741087;
     Object term741179;
     Object term741725;
     Object term741726;
     Object term741654;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111953() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term741087 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term741179 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term741265 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term741357 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term741265, term741265.getClass(), "next", term741357);
        setIntField(term741265, term741265.getClass(), "type", 0);
        setField(term741179, term741179.getClass(), "first", term741265);
        setIntField(term741179, term741179.getClass(), "type", 100);
        setField(term741179, term741179.getClass(), "parent", null);
        term741725 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term741725, term741725.getClass(), "currentTraversal", null);
        term741726 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term741727 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term741728 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term741726, term741726.getClass(), "number", 0.0);
        setIntField(term741726, term741726.getClass(), "type", 100);
        setField(term741726, term741726.getClass(), "next", null);
        setField(term741727, term741727.getClass(), "functionName", null);
        setBooleanField(term741727, term741727.getClass(), "itsNeedsActivation", false);
        setIntField(term741727, term741727.getClass(), "itsFunctionType", 0);
        setBooleanField(term741727, term741727.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term741727, term741727.getClass(), "encodedSourceStart", 0);
        setIntField(term741727, term741727.getClass(), "encodedSourceEnd", 0);
        setField(term741727, term741727.getClass(), "sourceName", null);
        setIntField(term741727, term741727.getClass(), "baseLineno", 0);
        setIntField(term741727, term741727.getClass(), "endLineno", 0);
        setField(term741727, term741727.getClass(), "functions", null);
        setField(term741727, term741727.getClass(), "regexps", null);
        setField(term741727, term741727.getClass(), "itsVariables", null);
        setField(term741727, term741727.getClass(), "itsConst", null);
        setField(term741727, term741727.getClass(), "itsVariableNames", null);
        setIntField(term741727, term741727.getClass(), "varStart", 0);
        setField(term741727, term741727.getClass(), "compilerData", null);
        setIntField(term741727, term741727.getClass(), "type", 0);
        setField(term741728, term741728.getClass(), "str", null);
        setIntField(term741728, term741728.getClass(), "type", 0);
        setField(term741728, term741728.getClass(), "next", null);
        setField(term741728, term741728.getClass(), "first", null);
        setField(term741728, term741728.getClass(), "last", null);
        setField(term741728, term741728.getClass(), "propListHead", null);
        setIntField(term741728, term741728.getClass(), "sourcePosition", 0);
        setField(term741728, term741728.getClass(), "jsType", null);
        setField(term741728, term741728.getClass(), "parent", null);
        setField(term741727, term741727.getClass(), "next", term741728);
        setField(term741727, term741727.getClass(), "first", null);
        setField(term741727, term741727.getClass(), "last", null);
        setField(term741727, term741727.getClass(), "propListHead", null);
        setIntField(term741727, term741727.getClass(), "sourcePosition", 0);
        setField(term741727, term741727.getClass(), "jsType", null);
        setField(term741727, term741727.getClass(), "parent", null);
        setField(term741726, term741726.getClass(), "first", term741727);
        setField(term741726, term741726.getClass(), "last", null);
        setField(term741726, term741726.getClass(), "propListHead", null);
        setIntField(term741726, term741726.getClass(), "sourcePosition", 0);
        setField(term741726, term741726.getClass(), "jsType", null);
        setField(term741726, term741726.getClass(), "parent", null);
        term741654 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term741657 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term741667 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term741654, term741654.getClass(), "number", 0.0);
        setIntField(term741654, term741654.getClass(), "type", 100);
        setField(term741654, term741654.getClass(), "next", null);
        setField(term741657, term741657.getClass(), "functionName", null);
        setBooleanField(term741657, term741657.getClass(), "itsNeedsActivation", false);
        setIntField(term741657, term741657.getClass(), "itsFunctionType", 0);
        setBooleanField(term741657, term741657.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term741657, term741657.getClass(), "encodedSourceStart", 0);
        setIntField(term741657, term741657.getClass(), "encodedSourceEnd", 0);
        setField(term741657, term741657.getClass(), "sourceName", null);
        setIntField(term741657, term741657.getClass(), "baseLineno", 0);
        setIntField(term741657, term741657.getClass(), "endLineno", 0);
        setField(term741657, term741657.getClass(), "functions", null);
        setField(term741657, term741657.getClass(), "regexps", null);
        setField(term741657, term741657.getClass(), "itsVariables", null);
        setField(term741657, term741657.getClass(), "itsConst", null);
        setField(term741657, term741657.getClass(), "itsVariableNames", null);
        setIntField(term741657, term741657.getClass(), "varStart", 0);
        setField(term741657, term741657.getClass(), "compilerData", null);
        setIntField(term741657, term741657.getClass(), "type", 0);
        setField(term741667, term741667.getClass(), "str", null);
        setIntField(term741667, term741667.getClass(), "type", 0);
        setField(term741667, term741667.getClass(), "next", null);
        setField(term741667, term741667.getClass(), "first", null);
        setField(term741667, term741667.getClass(), "last", null);
        setField(term741667, term741667.getClass(), "propListHead", null);
        setIntField(term741667, term741667.getClass(), "sourcePosition", 0);
        setField(term741667, term741667.getClass(), "jsType", null);
        setField(term741667, term741667.getClass(), "parent", null);
        setField(term741657, term741657.getClass(), "next", term741667);
        setField(term741657, term741657.getClass(), "first", null);
        setField(term741657, term741657.getClass(), "last", null);
        setField(term741657, term741657.getClass(), "propListHead", null);
        setIntField(term741657, term741657.getClass(), "sourcePosition", 0);
        setField(term741657, term741657.getClass(), "jsType", null);
        setField(term741657, term741657.getClass(), "parent", null);
        setField(term741654, term741654.getClass(), "first", term741657);
        setField(term741654, term741654.getClass(), "last", null);
        setField(term741654, term741654.getClass(), "propListHead", null);
        setIntField(term741654, term741654.getClass(), "sourcePosition", 0);
        setField(term741654, term741654.getClass(), "jsType", null);
        setField(term741654, term741654.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term741179;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term741087, args);
        assertTrue(recursiveEquals(term741087, term741725));
        assertTrue(recursiveEquals(term741179, term741726));
        assertTrue(recursiveEquals(retValue, term741654));
    }

};


