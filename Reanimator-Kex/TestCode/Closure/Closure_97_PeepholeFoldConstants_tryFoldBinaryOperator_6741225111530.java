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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term563611;
     Object term563703;
     Object term563997;
     Object term563998;
     Object term563949;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term563611 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term563703 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term563789 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term563881 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term563789, term563789.getClass(), "next", term563881);
        setIntField(term563789, term563789.getClass(), "type", 39);
        setField(term563703, term563703.getClass(), "first", term563789);
        setIntField(term563703, term563703.getClass(), "type", 22);
        term563997 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term563997, term563997.getClass(), "currentTraversal", null);
        term563998 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term563999 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term564000 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term563998, term563998.getClass(), "str", null);
        setIntField(term563998, term563998.getClass(), "type", 22);
        setField(term563998, term563998.getClass(), "next", null);
        setField(term563999, term563999.getClass(), "functionName", null);
        setBooleanField(term563999, term563999.getClass(), "itsNeedsActivation", false);
        setIntField(term563999, term563999.getClass(), "itsFunctionType", 0);
        setBooleanField(term563999, term563999.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term563999, term563999.getClass(), "encodedSourceStart", 0);
        setIntField(term563999, term563999.getClass(), "encodedSourceEnd", 0);
        setField(term563999, term563999.getClass(), "sourceName", null);
        setIntField(term563999, term563999.getClass(), "baseLineno", 0);
        setIntField(term563999, term563999.getClass(), "endLineno", 0);
        setField(term563999, term563999.getClass(), "functions", null);
        setField(term563999, term563999.getClass(), "regexps", null);
        setField(term563999, term563999.getClass(), "itsVariables", null);
        setField(term563999, term563999.getClass(), "itsConst", null);
        setField(term563999, term563999.getClass(), "itsVariableNames", null);
        setIntField(term563999, term563999.getClass(), "varStart", 0);
        setField(term563999, term563999.getClass(), "compilerData", null);
        setIntField(term563999, term563999.getClass(), "type", 39);
        setDoubleField(term564000, term564000.getClass(), "number", 0.0);
        setIntField(term564000, term564000.getClass(), "type", 0);
        setField(term564000, term564000.getClass(), "next", null);
        setField(term564000, term564000.getClass(), "first", null);
        setField(term564000, term564000.getClass(), "last", null);
        setField(term564000, term564000.getClass(), "propListHead", null);
        setIntField(term564000, term564000.getClass(), "sourcePosition", 0);
        setField(term564000, term564000.getClass(), "jsType", null);
        setField(term564000, term564000.getClass(), "parent", null);
        setField(term563999, term563999.getClass(), "next", term564000);
        setField(term563999, term563999.getClass(), "first", null);
        setField(term563999, term563999.getClass(), "last", null);
        setField(term563999, term563999.getClass(), "propListHead", null);
        setIntField(term563999, term563999.getClass(), "sourcePosition", 0);
        setField(term563999, term563999.getClass(), "jsType", null);
        setField(term563999, term563999.getClass(), "parent", null);
        setField(term563998, term563998.getClass(), "first", term563999);
        setField(term563998, term563998.getClass(), "last", null);
        setField(term563998, term563998.getClass(), "propListHead", null);
        setIntField(term563998, term563998.getClass(), "sourcePosition", 0);
        setField(term563998, term563998.getClass(), "jsType", null);
        setField(term563998, term563998.getClass(), "parent", null);
        term563949 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term563951 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term563961 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term563949, term563949.getClass(), "str", null);
        setIntField(term563949, term563949.getClass(), "type", 22);
        setField(term563949, term563949.getClass(), "next", null);
        setField(term563951, term563951.getClass(), "functionName", null);
        setBooleanField(term563951, term563951.getClass(), "itsNeedsActivation", false);
        setIntField(term563951, term563951.getClass(), "itsFunctionType", 0);
        setBooleanField(term563951, term563951.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term563951, term563951.getClass(), "encodedSourceStart", 0);
        setIntField(term563951, term563951.getClass(), "encodedSourceEnd", 0);
        setField(term563951, term563951.getClass(), "sourceName", null);
        setIntField(term563951, term563951.getClass(), "baseLineno", 0);
        setIntField(term563951, term563951.getClass(), "endLineno", 0);
        setField(term563951, term563951.getClass(), "functions", null);
        setField(term563951, term563951.getClass(), "regexps", null);
        setField(term563951, term563951.getClass(), "itsVariables", null);
        setField(term563951, term563951.getClass(), "itsConst", null);
        setField(term563951, term563951.getClass(), "itsVariableNames", null);
        setIntField(term563951, term563951.getClass(), "varStart", 0);
        setField(term563951, term563951.getClass(), "compilerData", null);
        setIntField(term563951, term563951.getClass(), "type", 39);
        setDoubleField(term563961, term563961.getClass(), "number", 0.0);
        setIntField(term563961, term563961.getClass(), "type", 0);
        setField(term563961, term563961.getClass(), "next", null);
        setField(term563961, term563961.getClass(), "first", null);
        setField(term563961, term563961.getClass(), "last", null);
        setField(term563961, term563961.getClass(), "propListHead", null);
        setIntField(term563961, term563961.getClass(), "sourcePosition", 0);
        setField(term563961, term563961.getClass(), "jsType", null);
        setField(term563961, term563961.getClass(), "parent", null);
        setField(term563951, term563951.getClass(), "next", term563961);
        setField(term563951, term563951.getClass(), "first", null);
        setField(term563951, term563951.getClass(), "last", null);
        setField(term563951, term563951.getClass(), "propListHead", null);
        setIntField(term563951, term563951.getClass(), "sourcePosition", 0);
        setField(term563951, term563951.getClass(), "jsType", null);
        setField(term563951, term563951.getClass(), "parent", null);
        setField(term563949, term563949.getClass(), "first", term563951);
        setField(term563949, term563949.getClass(), "last", null);
        setField(term563949, term563949.getClass(), "propListHead", null);
        setIntField(term563949, term563949.getClass(), "sourcePosition", 0);
        setField(term563949, term563949.getClass(), "jsType", null);
        setField(term563949, term563949.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term563703;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term563611, args);
        assertTrue(recursiveEquals(term563611, term563997));
        assertTrue(recursiveEquals(term563703, term563998));
        assertTrue(recursiveEquals(retValue, term563949));
    }

};


