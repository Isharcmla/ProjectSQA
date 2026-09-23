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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111064 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term249392;
     Object term249478;
     Object term249751;
     Object term249752;
     Object term249672;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111064() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term249392 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term249478 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term249564 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term249656 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term249564, term249564.getClass(), "next", term249656);
        setIntField(term249564, term249564.getClass(), "type", 14);
        setField(term249478, term249478.getClass(), "first", term249564);
        setIntField(term249478, term249478.getClass(), "type", 14);
        term249751 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term249751, term249751.getClass(), "currentTraversal", null);
        term249752 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term249753 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term249754 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term249752, term249752.getClass(), "functionName", null);
        setBooleanField(term249752, term249752.getClass(), "itsNeedsActivation", false);
        setIntField(term249752, term249752.getClass(), "itsFunctionType", 0);
        setBooleanField(term249752, term249752.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term249752, term249752.getClass(), "encodedSourceStart", 0);
        setIntField(term249752, term249752.getClass(), "encodedSourceEnd", 0);
        setField(term249752, term249752.getClass(), "sourceName", null);
        setIntField(term249752, term249752.getClass(), "baseLineno", 0);
        setIntField(term249752, term249752.getClass(), "endLineno", 0);
        setField(term249752, term249752.getClass(), "functions", null);
        setField(term249752, term249752.getClass(), "regexps", null);
        setField(term249752, term249752.getClass(), "itsVariables", null);
        setField(term249752, term249752.getClass(), "itsConst", null);
        setField(term249752, term249752.getClass(), "itsVariableNames", null);
        setIntField(term249752, term249752.getClass(), "varStart", 0);
        setField(term249752, term249752.getClass(), "compilerData", null);
        setIntField(term249752, term249752.getClass(), "type", 14);
        setField(term249752, term249752.getClass(), "next", null);
        setField(term249753, term249753.getClass(), "functionName", null);
        setBooleanField(term249753, term249753.getClass(), "itsNeedsActivation", false);
        setIntField(term249753, term249753.getClass(), "itsFunctionType", 0);
        setBooleanField(term249753, term249753.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term249753, term249753.getClass(), "encodedSourceStart", 0);
        setIntField(term249753, term249753.getClass(), "encodedSourceEnd", 0);
        setField(term249753, term249753.getClass(), "sourceName", null);
        setIntField(term249753, term249753.getClass(), "baseLineno", 0);
        setIntField(term249753, term249753.getClass(), "endLineno", 0);
        setField(term249753, term249753.getClass(), "functions", null);
        setField(term249753, term249753.getClass(), "regexps", null);
        setField(term249753, term249753.getClass(), "itsVariables", null);
        setField(term249753, term249753.getClass(), "itsConst", null);
        setField(term249753, term249753.getClass(), "itsVariableNames", null);
        setIntField(term249753, term249753.getClass(), "varStart", 0);
        setField(term249753, term249753.getClass(), "compilerData", null);
        setIntField(term249753, term249753.getClass(), "type", 14);
        setDoubleField(term249754, term249754.getClass(), "number", 0.0);
        setIntField(term249754, term249754.getClass(), "type", 0);
        setField(term249754, term249754.getClass(), "next", null);
        setField(term249754, term249754.getClass(), "first", null);
        setField(term249754, term249754.getClass(), "last", null);
        setField(term249754, term249754.getClass(), "propListHead", null);
        setIntField(term249754, term249754.getClass(), "sourcePosition", 0);
        setField(term249754, term249754.getClass(), "jsType", null);
        setField(term249754, term249754.getClass(), "parent", null);
        setField(term249753, term249753.getClass(), "next", term249754);
        setField(term249753, term249753.getClass(), "first", null);
        setField(term249753, term249753.getClass(), "last", null);
        setField(term249753, term249753.getClass(), "propListHead", null);
        setIntField(term249753, term249753.getClass(), "sourcePosition", 0);
        setField(term249753, term249753.getClass(), "jsType", null);
        setField(term249753, term249753.getClass(), "parent", null);
        setField(term249752, term249752.getClass(), "first", term249753);
        setField(term249752, term249752.getClass(), "last", null);
        setField(term249752, term249752.getClass(), "propListHead", null);
        setIntField(term249752, term249752.getClass(), "sourcePosition", 0);
        setField(term249752, term249752.getClass(), "jsType", null);
        setField(term249752, term249752.getClass(), "parent", null);
        term249672 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term249682 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term249692 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term249672, term249672.getClass(), "functionName", null);
        setBooleanField(term249672, term249672.getClass(), "itsNeedsActivation", false);
        setIntField(term249672, term249672.getClass(), "itsFunctionType", 0);
        setBooleanField(term249672, term249672.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term249672, term249672.getClass(), "encodedSourceStart", 0);
        setIntField(term249672, term249672.getClass(), "encodedSourceEnd", 0);
        setField(term249672, term249672.getClass(), "sourceName", null);
        setIntField(term249672, term249672.getClass(), "baseLineno", 0);
        setIntField(term249672, term249672.getClass(), "endLineno", 0);
        setField(term249672, term249672.getClass(), "functions", null);
        setField(term249672, term249672.getClass(), "regexps", null);
        setField(term249672, term249672.getClass(), "itsVariables", null);
        setField(term249672, term249672.getClass(), "itsConst", null);
        setField(term249672, term249672.getClass(), "itsVariableNames", null);
        setIntField(term249672, term249672.getClass(), "varStart", 0);
        setField(term249672, term249672.getClass(), "compilerData", null);
        setIntField(term249672, term249672.getClass(), "type", 14);
        setField(term249672, term249672.getClass(), "next", null);
        setField(term249682, term249682.getClass(), "functionName", null);
        setBooleanField(term249682, term249682.getClass(), "itsNeedsActivation", false);
        setIntField(term249682, term249682.getClass(), "itsFunctionType", 0);
        setBooleanField(term249682, term249682.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term249682, term249682.getClass(), "encodedSourceStart", 0);
        setIntField(term249682, term249682.getClass(), "encodedSourceEnd", 0);
        setField(term249682, term249682.getClass(), "sourceName", null);
        setIntField(term249682, term249682.getClass(), "baseLineno", 0);
        setIntField(term249682, term249682.getClass(), "endLineno", 0);
        setField(term249682, term249682.getClass(), "functions", null);
        setField(term249682, term249682.getClass(), "regexps", null);
        setField(term249682, term249682.getClass(), "itsVariables", null);
        setField(term249682, term249682.getClass(), "itsConst", null);
        setField(term249682, term249682.getClass(), "itsVariableNames", null);
        setIntField(term249682, term249682.getClass(), "varStart", 0);
        setField(term249682, term249682.getClass(), "compilerData", null);
        setIntField(term249682, term249682.getClass(), "type", 14);
        setDoubleField(term249692, term249692.getClass(), "number", 0.0);
        setIntField(term249692, term249692.getClass(), "type", 0);
        setField(term249692, term249692.getClass(), "next", null);
        setField(term249692, term249692.getClass(), "first", null);
        setField(term249692, term249692.getClass(), "last", null);
        setField(term249692, term249692.getClass(), "propListHead", null);
        setIntField(term249692, term249692.getClass(), "sourcePosition", 0);
        setField(term249692, term249692.getClass(), "jsType", null);
        setField(term249692, term249692.getClass(), "parent", null);
        setField(term249682, term249682.getClass(), "next", term249692);
        setField(term249682, term249682.getClass(), "first", null);
        setField(term249682, term249682.getClass(), "last", null);
        setField(term249682, term249682.getClass(), "propListHead", null);
        setIntField(term249682, term249682.getClass(), "sourcePosition", 0);
        setField(term249682, term249682.getClass(), "jsType", null);
        setField(term249682, term249682.getClass(), "parent", null);
        setField(term249672, term249672.getClass(), "first", term249682);
        setField(term249672, term249672.getClass(), "last", null);
        setField(term249672, term249672.getClass(), "propListHead", null);
        setIntField(term249672, term249672.getClass(), "sourcePosition", 0);
        setField(term249672, term249672.getClass(), "jsType", null);
        setField(term249672, term249672.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term249478;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term249392, args);
        assertTrue(recursiveEquals(term249392, term249751));
        assertTrue(recursiveEquals(term249478, term249752));
        assertTrue(recursiveEquals(retValue, term249672));
    }

};


