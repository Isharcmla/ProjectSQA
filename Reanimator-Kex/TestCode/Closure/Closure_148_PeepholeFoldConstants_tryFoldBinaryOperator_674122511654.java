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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511654 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144369;
     Object term144455;
     Object term144700;
     Object term144701;
     Object term144641;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511654() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term144369 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term144455 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term144541 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term144611 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term144541, term144541.getClass(), "next", term144611);
        setField(term144455, term144455.getClass(), "first", term144541);
        setIntField(term144455, term144455.getClass(), "type", 23);
        term144700 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term144700, term144700.getClass(), "currentTraversal", null);
        term144701 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term144702 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term144703 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term144701, term144701.getClass(), "functionName", null);
        setBooleanField(term144701, term144701.getClass(), "itsNeedsActivation", false);
        setIntField(term144701, term144701.getClass(), "itsFunctionType", 0);
        setBooleanField(term144701, term144701.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term144701, term144701.getClass(), "encodedSourceStart", 0);
        setIntField(term144701, term144701.getClass(), "encodedSourceEnd", 0);
        setField(term144701, term144701.getClass(), "sourceName", null);
        setIntField(term144701, term144701.getClass(), "baseLineno", 0);
        setIntField(term144701, term144701.getClass(), "endLineno", 0);
        setField(term144701, term144701.getClass(), "functions", null);
        setField(term144701, term144701.getClass(), "regexps", null);
        setField(term144701, term144701.getClass(), "itsVariables", null);
        setField(term144701, term144701.getClass(), "itsConst", null);
        setField(term144701, term144701.getClass(), "itsVariableNames", null);
        setIntField(term144701, term144701.getClass(), "varStart", 0);
        setField(term144701, term144701.getClass(), "compilerData", null);
        setIntField(term144701, term144701.getClass(), "type", 23);
        setField(term144701, term144701.getClass(), "next", null);
        setField(term144702, term144702.getClass(), "functionName", null);
        setBooleanField(term144702, term144702.getClass(), "itsNeedsActivation", false);
        setIntField(term144702, term144702.getClass(), "itsFunctionType", 0);
        setBooleanField(term144702, term144702.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term144702, term144702.getClass(), "encodedSourceStart", 0);
        setIntField(term144702, term144702.getClass(), "encodedSourceEnd", 0);
        setField(term144702, term144702.getClass(), "sourceName", null);
        setIntField(term144702, term144702.getClass(), "baseLineno", 0);
        setIntField(term144702, term144702.getClass(), "endLineno", 0);
        setField(term144702, term144702.getClass(), "functions", null);
        setField(term144702, term144702.getClass(), "regexps", null);
        setField(term144702, term144702.getClass(), "itsVariables", null);
        setField(term144702, term144702.getClass(), "itsConst", null);
        setField(term144702, term144702.getClass(), "itsVariableNames", null);
        setIntField(term144702, term144702.getClass(), "varStart", 0);
        setField(term144702, term144702.getClass(), "compilerData", null);
        setIntField(term144702, term144702.getClass(), "type", 0);
        setIntField(term144703, term144703.getClass(), "type", 0);
        setField(term144703, term144703.getClass(), "next", null);
        setField(term144703, term144703.getClass(), "first", null);
        setField(term144703, term144703.getClass(), "last", null);
        setField(term144703, term144703.getClass(), "propListHead", null);
        setIntField(term144703, term144703.getClass(), "sourcePosition", 0);
        setField(term144703, term144703.getClass(), "jsType", null);
        setField(term144703, term144703.getClass(), "parent", null);
        setField(term144702, term144702.getClass(), "next", term144703);
        setField(term144702, term144702.getClass(), "first", null);
        setField(term144702, term144702.getClass(), "last", null);
        setField(term144702, term144702.getClass(), "propListHead", null);
        setIntField(term144702, term144702.getClass(), "sourcePosition", 0);
        setField(term144702, term144702.getClass(), "jsType", null);
        setField(term144702, term144702.getClass(), "parent", null);
        setField(term144701, term144701.getClass(), "first", term144702);
        setField(term144701, term144701.getClass(), "last", null);
        setField(term144701, term144701.getClass(), "propListHead", null);
        setIntField(term144701, term144701.getClass(), "sourcePosition", 0);
        setField(term144701, term144701.getClass(), "jsType", null);
        setField(term144701, term144701.getClass(), "parent", null);
        term144641 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term144651 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term144661 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term144641, term144641.getClass(), "functionName", null);
        setBooleanField(term144641, term144641.getClass(), "itsNeedsActivation", false);
        setIntField(term144641, term144641.getClass(), "itsFunctionType", 0);
        setBooleanField(term144641, term144641.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term144641, term144641.getClass(), "encodedSourceStart", 0);
        setIntField(term144641, term144641.getClass(), "encodedSourceEnd", 0);
        setField(term144641, term144641.getClass(), "sourceName", null);
        setIntField(term144641, term144641.getClass(), "baseLineno", 0);
        setIntField(term144641, term144641.getClass(), "endLineno", 0);
        setField(term144641, term144641.getClass(), "functions", null);
        setField(term144641, term144641.getClass(), "regexps", null);
        setField(term144641, term144641.getClass(), "itsVariables", null);
        setField(term144641, term144641.getClass(), "itsConst", null);
        setField(term144641, term144641.getClass(), "itsVariableNames", null);
        setIntField(term144641, term144641.getClass(), "varStart", 0);
        setField(term144641, term144641.getClass(), "compilerData", null);
        setIntField(term144641, term144641.getClass(), "type", 23);
        setField(term144641, term144641.getClass(), "next", null);
        setField(term144651, term144651.getClass(), "functionName", null);
        setBooleanField(term144651, term144651.getClass(), "itsNeedsActivation", false);
        setIntField(term144651, term144651.getClass(), "itsFunctionType", 0);
        setBooleanField(term144651, term144651.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term144651, term144651.getClass(), "encodedSourceStart", 0);
        setIntField(term144651, term144651.getClass(), "encodedSourceEnd", 0);
        setField(term144651, term144651.getClass(), "sourceName", null);
        setIntField(term144651, term144651.getClass(), "baseLineno", 0);
        setIntField(term144651, term144651.getClass(), "endLineno", 0);
        setField(term144651, term144651.getClass(), "functions", null);
        setField(term144651, term144651.getClass(), "regexps", null);
        setField(term144651, term144651.getClass(), "itsVariables", null);
        setField(term144651, term144651.getClass(), "itsConst", null);
        setField(term144651, term144651.getClass(), "itsVariableNames", null);
        setIntField(term144651, term144651.getClass(), "varStart", 0);
        setField(term144651, term144651.getClass(), "compilerData", null);
        setIntField(term144651, term144651.getClass(), "type", 0);
        setIntField(term144661, term144661.getClass(), "type", 0);
        setField(term144661, term144661.getClass(), "next", null);
        setField(term144661, term144661.getClass(), "first", null);
        setField(term144661, term144661.getClass(), "last", null);
        setField(term144661, term144661.getClass(), "propListHead", null);
        setIntField(term144661, term144661.getClass(), "sourcePosition", 0);
        setField(term144661, term144661.getClass(), "jsType", null);
        setField(term144661, term144661.getClass(), "parent", null);
        setField(term144651, term144651.getClass(), "next", term144661);
        setField(term144651, term144651.getClass(), "first", null);
        setField(term144651, term144651.getClass(), "last", null);
        setField(term144651, term144651.getClass(), "propListHead", null);
        setIntField(term144651, term144651.getClass(), "sourcePosition", 0);
        setField(term144651, term144651.getClass(), "jsType", null);
        setField(term144651, term144651.getClass(), "parent", null);
        setField(term144641, term144641.getClass(), "first", term144651);
        setField(term144641, term144641.getClass(), "last", null);
        setField(term144641, term144641.getClass(), "propListHead", null);
        setIntField(term144641, term144641.getClass(), "sourcePosition", 0);
        setField(term144641, term144641.getClass(), "jsType", null);
        setField(term144641, term144641.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term144455;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term144369, args);
        assertTrue(recursiveEquals(term144369, term144700));
        assertTrue(recursiveEquals(term144455, term144701));
        assertTrue(recursiveEquals(retValue, term144641));
    }

};


