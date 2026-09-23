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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term354050;
     Object term354142;
     Object term354816;
     Object term354817;
     Object term354766;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term354050 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term354142 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term354228 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term354298 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term354228, term354228.getClass(), "next", term354298);
        setField(term354142, term354142.getClass(), "first", term354228);
        setIntField(term354142, term354142.getClass(), "type", 46);
        term354816 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term354816, term354816.getClass(), "currentTraversal", null);
        term354817 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term354818 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term354819 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term354817, term354817.getClass(), "str", null);
        setIntField(term354817, term354817.getClass(), "type", 46);
        setField(term354817, term354817.getClass(), "next", null);
        setField(term354818, term354818.getClass(), "functionName", null);
        setBooleanField(term354818, term354818.getClass(), "itsNeedsActivation", false);
        setIntField(term354818, term354818.getClass(), "itsFunctionType", 0);
        setBooleanField(term354818, term354818.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term354818, term354818.getClass(), "encodedSourceStart", 0);
        setIntField(term354818, term354818.getClass(), "encodedSourceEnd", 0);
        setField(term354818, term354818.getClass(), "sourceName", null);
        setIntField(term354818, term354818.getClass(), "baseLineno", 0);
        setIntField(term354818, term354818.getClass(), "endLineno", 0);
        setField(term354818, term354818.getClass(), "functions", null);
        setField(term354818, term354818.getClass(), "regexps", null);
        setField(term354818, term354818.getClass(), "itsVariables", null);
        setField(term354818, term354818.getClass(), "itsConst", null);
        setField(term354818, term354818.getClass(), "itsVariableNames", null);
        setIntField(term354818, term354818.getClass(), "varStart", 0);
        setField(term354818, term354818.getClass(), "compilerData", null);
        setIntField(term354818, term354818.getClass(), "type", 0);
        setIntField(term354819, term354819.getClass(), "type", 0);
        setField(term354819, term354819.getClass(), "next", null);
        setField(term354819, term354819.getClass(), "first", null);
        setField(term354819, term354819.getClass(), "last", null);
        setField(term354819, term354819.getClass(), "propListHead", null);
        setIntField(term354819, term354819.getClass(), "sourcePosition", 0);
        setField(term354819, term354819.getClass(), "jsType", null);
        setField(term354819, term354819.getClass(), "parent", null);
        setField(term354818, term354818.getClass(), "next", term354819);
        setField(term354818, term354818.getClass(), "first", null);
        setField(term354818, term354818.getClass(), "last", null);
        setField(term354818, term354818.getClass(), "propListHead", null);
        setIntField(term354818, term354818.getClass(), "sourcePosition", 0);
        setField(term354818, term354818.getClass(), "jsType", null);
        setField(term354818, term354818.getClass(), "parent", null);
        setField(term354817, term354817.getClass(), "first", term354818);
        setField(term354817, term354817.getClass(), "last", null);
        setField(term354817, term354817.getClass(), "propListHead", null);
        setIntField(term354817, term354817.getClass(), "sourcePosition", 0);
        setField(term354817, term354817.getClass(), "jsType", null);
        setField(term354817, term354817.getClass(), "parent", null);
        term354766 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term354768 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term354778 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term354766, term354766.getClass(), "str", null);
        setIntField(term354766, term354766.getClass(), "type", 46);
        setField(term354766, term354766.getClass(), "next", null);
        setField(term354768, term354768.getClass(), "functionName", null);
        setBooleanField(term354768, term354768.getClass(), "itsNeedsActivation", false);
        setIntField(term354768, term354768.getClass(), "itsFunctionType", 0);
        setBooleanField(term354768, term354768.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term354768, term354768.getClass(), "encodedSourceStart", 0);
        setIntField(term354768, term354768.getClass(), "encodedSourceEnd", 0);
        setField(term354768, term354768.getClass(), "sourceName", null);
        setIntField(term354768, term354768.getClass(), "baseLineno", 0);
        setIntField(term354768, term354768.getClass(), "endLineno", 0);
        setField(term354768, term354768.getClass(), "functions", null);
        setField(term354768, term354768.getClass(), "regexps", null);
        setField(term354768, term354768.getClass(), "itsVariables", null);
        setField(term354768, term354768.getClass(), "itsConst", null);
        setField(term354768, term354768.getClass(), "itsVariableNames", null);
        setIntField(term354768, term354768.getClass(), "varStart", 0);
        setField(term354768, term354768.getClass(), "compilerData", null);
        setIntField(term354768, term354768.getClass(), "type", 0);
        setIntField(term354778, term354778.getClass(), "type", 0);
        setField(term354778, term354778.getClass(), "next", null);
        setField(term354778, term354778.getClass(), "first", null);
        setField(term354778, term354778.getClass(), "last", null);
        setField(term354778, term354778.getClass(), "propListHead", null);
        setIntField(term354778, term354778.getClass(), "sourcePosition", 0);
        setField(term354778, term354778.getClass(), "jsType", null);
        setField(term354778, term354778.getClass(), "parent", null);
        setField(term354768, term354768.getClass(), "next", term354778);
        setField(term354768, term354768.getClass(), "first", null);
        setField(term354768, term354768.getClass(), "last", null);
        setField(term354768, term354768.getClass(), "propListHead", null);
        setIntField(term354768, term354768.getClass(), "sourcePosition", 0);
        setField(term354768, term354768.getClass(), "jsType", null);
        setField(term354768, term354768.getClass(), "parent", null);
        setField(term354766, term354766.getClass(), "first", term354768);
        setField(term354766, term354766.getClass(), "last", null);
        setField(term354766, term354766.getClass(), "propListHead", null);
        setIntField(term354766, term354766.getClass(), "sourcePosition", 0);
        setField(term354766, term354766.getClass(), "jsType", null);
        setField(term354766, term354766.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term354142;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term354050, args);
        assertTrue(recursiveEquals(term354050, term354816));
        assertTrue(recursiveEquals(term354142, term354817));
        assertTrue(recursiveEquals(retValue, term354766));
    }

};


