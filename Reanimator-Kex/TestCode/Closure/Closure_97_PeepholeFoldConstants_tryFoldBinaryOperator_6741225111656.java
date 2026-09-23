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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111656 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term661090;
     Object term661182;
     Object term661771;
     Object term661772;
     Object term661726;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term661090 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term661182 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term661268 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term661338 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term661268, term661268.getClass(), "next", term661338);
        setIntField(term661268, term661268.getClass(), "type", 39);
        setField(term661182, term661182.getClass(), "first", term661268);
        setIntField(term661182, term661182.getClass(), "type", 18);
        term661771 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term661771, term661771.getClass(), "currentTraversal", null);
        term661772 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term661773 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term661774 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term661772, term661772.getClass(), "str", null);
        setIntField(term661772, term661772.getClass(), "type", 18);
        setField(term661772, term661772.getClass(), "next", null);
        setField(term661773, term661773.getClass(), "functionName", null);
        setBooleanField(term661773, term661773.getClass(), "itsNeedsActivation", false);
        setIntField(term661773, term661773.getClass(), "itsFunctionType", 0);
        setBooleanField(term661773, term661773.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term661773, term661773.getClass(), "encodedSourceStart", 0);
        setIntField(term661773, term661773.getClass(), "encodedSourceEnd", 0);
        setField(term661773, term661773.getClass(), "sourceName", null);
        setIntField(term661773, term661773.getClass(), "baseLineno", 0);
        setIntField(term661773, term661773.getClass(), "endLineno", 0);
        setField(term661773, term661773.getClass(), "functions", null);
        setField(term661773, term661773.getClass(), "regexps", null);
        setField(term661773, term661773.getClass(), "itsVariables", null);
        setField(term661773, term661773.getClass(), "itsConst", null);
        setField(term661773, term661773.getClass(), "itsVariableNames", null);
        setIntField(term661773, term661773.getClass(), "varStart", 0);
        setField(term661773, term661773.getClass(), "compilerData", null);
        setIntField(term661773, term661773.getClass(), "type", 39);
        setIntField(term661774, term661774.getClass(), "type", 0);
        setField(term661774, term661774.getClass(), "next", null);
        setField(term661774, term661774.getClass(), "first", null);
        setField(term661774, term661774.getClass(), "last", null);
        setField(term661774, term661774.getClass(), "propListHead", null);
        setIntField(term661774, term661774.getClass(), "sourcePosition", 0);
        setField(term661774, term661774.getClass(), "jsType", null);
        setField(term661774, term661774.getClass(), "parent", null);
        setField(term661773, term661773.getClass(), "next", term661774);
        setField(term661773, term661773.getClass(), "first", null);
        setField(term661773, term661773.getClass(), "last", null);
        setField(term661773, term661773.getClass(), "propListHead", null);
        setIntField(term661773, term661773.getClass(), "sourcePosition", 0);
        setField(term661773, term661773.getClass(), "jsType", null);
        setField(term661773, term661773.getClass(), "parent", null);
        setField(term661772, term661772.getClass(), "first", term661773);
        setField(term661772, term661772.getClass(), "last", null);
        setField(term661772, term661772.getClass(), "propListHead", null);
        setIntField(term661772, term661772.getClass(), "sourcePosition", 0);
        setField(term661772, term661772.getClass(), "jsType", null);
        setField(term661772, term661772.getClass(), "parent", null);
        term661726 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term661728 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term661738 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term661726, term661726.getClass(), "str", null);
        setIntField(term661726, term661726.getClass(), "type", 18);
        setField(term661726, term661726.getClass(), "next", null);
        setField(term661728, term661728.getClass(), "functionName", null);
        setBooleanField(term661728, term661728.getClass(), "itsNeedsActivation", false);
        setIntField(term661728, term661728.getClass(), "itsFunctionType", 0);
        setBooleanField(term661728, term661728.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term661728, term661728.getClass(), "encodedSourceStart", 0);
        setIntField(term661728, term661728.getClass(), "encodedSourceEnd", 0);
        setField(term661728, term661728.getClass(), "sourceName", null);
        setIntField(term661728, term661728.getClass(), "baseLineno", 0);
        setIntField(term661728, term661728.getClass(), "endLineno", 0);
        setField(term661728, term661728.getClass(), "functions", null);
        setField(term661728, term661728.getClass(), "regexps", null);
        setField(term661728, term661728.getClass(), "itsVariables", null);
        setField(term661728, term661728.getClass(), "itsConst", null);
        setField(term661728, term661728.getClass(), "itsVariableNames", null);
        setIntField(term661728, term661728.getClass(), "varStart", 0);
        setField(term661728, term661728.getClass(), "compilerData", null);
        setIntField(term661728, term661728.getClass(), "type", 39);
        setIntField(term661738, term661738.getClass(), "type", 0);
        setField(term661738, term661738.getClass(), "next", null);
        setField(term661738, term661738.getClass(), "first", null);
        setField(term661738, term661738.getClass(), "last", null);
        setField(term661738, term661738.getClass(), "propListHead", null);
        setIntField(term661738, term661738.getClass(), "sourcePosition", 0);
        setField(term661738, term661738.getClass(), "jsType", null);
        setField(term661738, term661738.getClass(), "parent", null);
        setField(term661728, term661728.getClass(), "next", term661738);
        setField(term661728, term661728.getClass(), "first", null);
        setField(term661728, term661728.getClass(), "last", null);
        setField(term661728, term661728.getClass(), "propListHead", null);
        setIntField(term661728, term661728.getClass(), "sourcePosition", 0);
        setField(term661728, term661728.getClass(), "jsType", null);
        setField(term661728, term661728.getClass(), "parent", null);
        setField(term661726, term661726.getClass(), "first", term661728);
        setField(term661726, term661726.getClass(), "last", null);
        setField(term661726, term661726.getClass(), "propListHead", null);
        setIntField(term661726, term661726.getClass(), "sourcePosition", 0);
        setField(term661726, term661726.getClass(), "jsType", null);
        setField(term661726, term661726.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term661182;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term661090, args);
        assertTrue(recursiveEquals(term661090, term661771));
        assertTrue(recursiveEquals(term661182, term661772));
        assertTrue(recursiveEquals(retValue, term661726));
    }

};


