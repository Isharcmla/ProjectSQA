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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111558 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term570377;
     Object term570463;
     Object term570693;
     Object term570694;
     Object term570634;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111558() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term570377 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term570463 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term570549 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term570619 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term570549, term570549.getClass(), "next", term570619);
        setField(term570463, term570463.getClass(), "first", term570549);
        setIntField(term570463, term570463.getClass(), "type", 18);
        term570693 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term570693, term570693.getClass(), "currentTraversal", null);
        term570694 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term570695 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term570696 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term570694, term570694.getClass(), "functionName", null);
        setBooleanField(term570694, term570694.getClass(), "itsNeedsActivation", false);
        setIntField(term570694, term570694.getClass(), "itsFunctionType", 0);
        setBooleanField(term570694, term570694.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term570694, term570694.getClass(), "encodedSourceStart", 0);
        setIntField(term570694, term570694.getClass(), "encodedSourceEnd", 0);
        setField(term570694, term570694.getClass(), "sourceName", null);
        setIntField(term570694, term570694.getClass(), "baseLineno", 0);
        setIntField(term570694, term570694.getClass(), "endLineno", 0);
        setField(term570694, term570694.getClass(), "functions", null);
        setField(term570694, term570694.getClass(), "regexps", null);
        setField(term570694, term570694.getClass(), "itsVariables", null);
        setField(term570694, term570694.getClass(), "itsConst", null);
        setField(term570694, term570694.getClass(), "itsVariableNames", null);
        setIntField(term570694, term570694.getClass(), "varStart", 0);
        setField(term570694, term570694.getClass(), "compilerData", null);
        setIntField(term570694, term570694.getClass(), "type", 18);
        setField(term570694, term570694.getClass(), "next", null);
        setField(term570695, term570695.getClass(), "functionName", null);
        setBooleanField(term570695, term570695.getClass(), "itsNeedsActivation", false);
        setIntField(term570695, term570695.getClass(), "itsFunctionType", 0);
        setBooleanField(term570695, term570695.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term570695, term570695.getClass(), "encodedSourceStart", 0);
        setIntField(term570695, term570695.getClass(), "encodedSourceEnd", 0);
        setField(term570695, term570695.getClass(), "sourceName", null);
        setIntField(term570695, term570695.getClass(), "baseLineno", 0);
        setIntField(term570695, term570695.getClass(), "endLineno", 0);
        setField(term570695, term570695.getClass(), "functions", null);
        setField(term570695, term570695.getClass(), "regexps", null);
        setField(term570695, term570695.getClass(), "itsVariables", null);
        setField(term570695, term570695.getClass(), "itsConst", null);
        setField(term570695, term570695.getClass(), "itsVariableNames", null);
        setIntField(term570695, term570695.getClass(), "varStart", 0);
        setField(term570695, term570695.getClass(), "compilerData", null);
        setIntField(term570695, term570695.getClass(), "type", 0);
        setIntField(term570696, term570696.getClass(), "type", 0);
        setField(term570696, term570696.getClass(), "next", null);
        setField(term570696, term570696.getClass(), "first", null);
        setField(term570696, term570696.getClass(), "last", null);
        setField(term570696, term570696.getClass(), "propListHead", null);
        setIntField(term570696, term570696.getClass(), "sourcePosition", 0);
        setField(term570696, term570696.getClass(), "jsType", null);
        setField(term570696, term570696.getClass(), "parent", null);
        setField(term570695, term570695.getClass(), "next", term570696);
        setField(term570695, term570695.getClass(), "first", null);
        setField(term570695, term570695.getClass(), "last", null);
        setField(term570695, term570695.getClass(), "propListHead", null);
        setIntField(term570695, term570695.getClass(), "sourcePosition", 0);
        setField(term570695, term570695.getClass(), "jsType", null);
        setField(term570695, term570695.getClass(), "parent", null);
        setField(term570694, term570694.getClass(), "first", term570695);
        setField(term570694, term570694.getClass(), "last", null);
        setField(term570694, term570694.getClass(), "propListHead", null);
        setIntField(term570694, term570694.getClass(), "sourcePosition", 0);
        setField(term570694, term570694.getClass(), "jsType", null);
        setField(term570694, term570694.getClass(), "parent", null);
        term570634 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term570644 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term570654 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term570634, term570634.getClass(), "functionName", null);
        setBooleanField(term570634, term570634.getClass(), "itsNeedsActivation", false);
        setIntField(term570634, term570634.getClass(), "itsFunctionType", 0);
        setBooleanField(term570634, term570634.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term570634, term570634.getClass(), "encodedSourceStart", 0);
        setIntField(term570634, term570634.getClass(), "encodedSourceEnd", 0);
        setField(term570634, term570634.getClass(), "sourceName", null);
        setIntField(term570634, term570634.getClass(), "baseLineno", 0);
        setIntField(term570634, term570634.getClass(), "endLineno", 0);
        setField(term570634, term570634.getClass(), "functions", null);
        setField(term570634, term570634.getClass(), "regexps", null);
        setField(term570634, term570634.getClass(), "itsVariables", null);
        setField(term570634, term570634.getClass(), "itsConst", null);
        setField(term570634, term570634.getClass(), "itsVariableNames", null);
        setIntField(term570634, term570634.getClass(), "varStart", 0);
        setField(term570634, term570634.getClass(), "compilerData", null);
        setIntField(term570634, term570634.getClass(), "type", 18);
        setField(term570634, term570634.getClass(), "next", null);
        setField(term570644, term570644.getClass(), "functionName", null);
        setBooleanField(term570644, term570644.getClass(), "itsNeedsActivation", false);
        setIntField(term570644, term570644.getClass(), "itsFunctionType", 0);
        setBooleanField(term570644, term570644.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term570644, term570644.getClass(), "encodedSourceStart", 0);
        setIntField(term570644, term570644.getClass(), "encodedSourceEnd", 0);
        setField(term570644, term570644.getClass(), "sourceName", null);
        setIntField(term570644, term570644.getClass(), "baseLineno", 0);
        setIntField(term570644, term570644.getClass(), "endLineno", 0);
        setField(term570644, term570644.getClass(), "functions", null);
        setField(term570644, term570644.getClass(), "regexps", null);
        setField(term570644, term570644.getClass(), "itsVariables", null);
        setField(term570644, term570644.getClass(), "itsConst", null);
        setField(term570644, term570644.getClass(), "itsVariableNames", null);
        setIntField(term570644, term570644.getClass(), "varStart", 0);
        setField(term570644, term570644.getClass(), "compilerData", null);
        setIntField(term570644, term570644.getClass(), "type", 0);
        setIntField(term570654, term570654.getClass(), "type", 0);
        setField(term570654, term570654.getClass(), "next", null);
        setField(term570654, term570654.getClass(), "first", null);
        setField(term570654, term570654.getClass(), "last", null);
        setField(term570654, term570654.getClass(), "propListHead", null);
        setIntField(term570654, term570654.getClass(), "sourcePosition", 0);
        setField(term570654, term570654.getClass(), "jsType", null);
        setField(term570654, term570654.getClass(), "parent", null);
        setField(term570644, term570644.getClass(), "next", term570654);
        setField(term570644, term570644.getClass(), "first", null);
        setField(term570644, term570644.getClass(), "last", null);
        setField(term570644, term570644.getClass(), "propListHead", null);
        setIntField(term570644, term570644.getClass(), "sourcePosition", 0);
        setField(term570644, term570644.getClass(), "jsType", null);
        setField(term570644, term570644.getClass(), "parent", null);
        setField(term570634, term570634.getClass(), "first", term570644);
        setField(term570634, term570634.getClass(), "last", null);
        setField(term570634, term570634.getClass(), "propListHead", null);
        setIntField(term570634, term570634.getClass(), "sourcePosition", 0);
        setField(term570634, term570634.getClass(), "jsType", null);
        setField(term570634, term570634.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term570463;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term570377, args);
        assertTrue(recursiveEquals(term570377, term570693));
        assertTrue(recursiveEquals(term570463, term570694));
        assertTrue(recursiveEquals(retValue, term570634));
    }

};


