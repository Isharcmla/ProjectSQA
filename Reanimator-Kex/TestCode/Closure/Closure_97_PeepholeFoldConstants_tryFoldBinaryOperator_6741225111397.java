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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term528639;
     Object term528731;
     Object term529613;
     Object term529614;
     Object term529566;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term528639 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term528731 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term528817 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term528887 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term528817, term528817.getClass(), "next", term528887);
        setField(term528731, term528731.getClass(), "first", term528817);
        setIntField(term528731, term528731.getClass(), "type", 11);
        term529613 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term529613, term529613.getClass(), "currentTraversal", null);
        term529614 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term529615 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term529616 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term529614, term529614.getClass(), "str", null);
        setIntField(term529614, term529614.getClass(), "type", 11);
        setField(term529614, term529614.getClass(), "next", null);
        setField(term529615, term529615.getClass(), "functionName", null);
        setBooleanField(term529615, term529615.getClass(), "itsNeedsActivation", false);
        setIntField(term529615, term529615.getClass(), "itsFunctionType", 0);
        setBooleanField(term529615, term529615.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term529615, term529615.getClass(), "encodedSourceStart", 0);
        setIntField(term529615, term529615.getClass(), "encodedSourceEnd", 0);
        setField(term529615, term529615.getClass(), "sourceName", null);
        setIntField(term529615, term529615.getClass(), "baseLineno", 0);
        setIntField(term529615, term529615.getClass(), "endLineno", 0);
        setField(term529615, term529615.getClass(), "functions", null);
        setField(term529615, term529615.getClass(), "regexps", null);
        setField(term529615, term529615.getClass(), "itsVariables", null);
        setField(term529615, term529615.getClass(), "itsConst", null);
        setField(term529615, term529615.getClass(), "itsVariableNames", null);
        setIntField(term529615, term529615.getClass(), "varStart", 0);
        setField(term529615, term529615.getClass(), "compilerData", null);
        setIntField(term529615, term529615.getClass(), "type", 0);
        setIntField(term529616, term529616.getClass(), "type", 0);
        setField(term529616, term529616.getClass(), "next", null);
        setField(term529616, term529616.getClass(), "first", null);
        setField(term529616, term529616.getClass(), "last", null);
        setField(term529616, term529616.getClass(), "propListHead", null);
        setIntField(term529616, term529616.getClass(), "sourcePosition", 0);
        setField(term529616, term529616.getClass(), "jsType", null);
        setField(term529616, term529616.getClass(), "parent", null);
        setField(term529615, term529615.getClass(), "next", term529616);
        setField(term529615, term529615.getClass(), "first", null);
        setField(term529615, term529615.getClass(), "last", null);
        setField(term529615, term529615.getClass(), "propListHead", null);
        setIntField(term529615, term529615.getClass(), "sourcePosition", 0);
        setField(term529615, term529615.getClass(), "jsType", null);
        setField(term529615, term529615.getClass(), "parent", null);
        setField(term529614, term529614.getClass(), "first", term529615);
        setField(term529614, term529614.getClass(), "last", null);
        setField(term529614, term529614.getClass(), "propListHead", null);
        setIntField(term529614, term529614.getClass(), "sourcePosition", 0);
        setField(term529614, term529614.getClass(), "jsType", null);
        setField(term529614, term529614.getClass(), "parent", null);
        term529566 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term529568 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term529578 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term529566, term529566.getClass(), "str", null);
        setIntField(term529566, term529566.getClass(), "type", 11);
        setField(term529566, term529566.getClass(), "next", null);
        setField(term529568, term529568.getClass(), "functionName", null);
        setBooleanField(term529568, term529568.getClass(), "itsNeedsActivation", false);
        setIntField(term529568, term529568.getClass(), "itsFunctionType", 0);
        setBooleanField(term529568, term529568.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term529568, term529568.getClass(), "encodedSourceStart", 0);
        setIntField(term529568, term529568.getClass(), "encodedSourceEnd", 0);
        setField(term529568, term529568.getClass(), "sourceName", null);
        setIntField(term529568, term529568.getClass(), "baseLineno", 0);
        setIntField(term529568, term529568.getClass(), "endLineno", 0);
        setField(term529568, term529568.getClass(), "functions", null);
        setField(term529568, term529568.getClass(), "regexps", null);
        setField(term529568, term529568.getClass(), "itsVariables", null);
        setField(term529568, term529568.getClass(), "itsConst", null);
        setField(term529568, term529568.getClass(), "itsVariableNames", null);
        setIntField(term529568, term529568.getClass(), "varStart", 0);
        setField(term529568, term529568.getClass(), "compilerData", null);
        setIntField(term529568, term529568.getClass(), "type", 0);
        setIntField(term529578, term529578.getClass(), "type", 0);
        setField(term529578, term529578.getClass(), "next", null);
        setField(term529578, term529578.getClass(), "first", null);
        setField(term529578, term529578.getClass(), "last", null);
        setField(term529578, term529578.getClass(), "propListHead", null);
        setIntField(term529578, term529578.getClass(), "sourcePosition", 0);
        setField(term529578, term529578.getClass(), "jsType", null);
        setField(term529578, term529578.getClass(), "parent", null);
        setField(term529568, term529568.getClass(), "next", term529578);
        setField(term529568, term529568.getClass(), "first", null);
        setField(term529568, term529568.getClass(), "last", null);
        setField(term529568, term529568.getClass(), "propListHead", null);
        setIntField(term529568, term529568.getClass(), "sourcePosition", 0);
        setField(term529568, term529568.getClass(), "jsType", null);
        setField(term529568, term529568.getClass(), "parent", null);
        setField(term529566, term529566.getClass(), "first", term529568);
        setField(term529566, term529566.getClass(), "last", null);
        setField(term529566, term529566.getClass(), "propListHead", null);
        setIntField(term529566, term529566.getClass(), "sourcePosition", 0);
        setField(term529566, term529566.getClass(), "jsType", null);
        setField(term529566, term529566.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term528731;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term528639, args);
        assertTrue(recursiveEquals(term528639, term529613));
        assertTrue(recursiveEquals(term528731, term529614));
        assertTrue(recursiveEquals(retValue, term529566));
    }

};


