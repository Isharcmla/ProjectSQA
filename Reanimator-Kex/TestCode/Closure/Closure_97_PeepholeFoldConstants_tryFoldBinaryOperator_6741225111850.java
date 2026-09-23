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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111850 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term713563;
     Object term713655;
     Object term713961;
     Object term713962;
     Object term713887;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111850() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term713563 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term713655 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term713741 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term713833 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term713741, term713741.getClass(), "next", term713833);
        setIntField(term713741, term713741.getClass(), "type", 0);
        setField(term713655, term713655.getClass(), "first", term713741);
        setIntField(term713655, term713655.getClass(), "type", 100);
        setField(term713655, term713655.getClass(), "parent", null);
        term713961 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term713961, term713961.getClass(), "currentTraversal", null);
        term713962 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term713963 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term713964 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term713962, term713962.getClass(), "number", 0.0);
        setIntField(term713962, term713962.getClass(), "type", 100);
        setField(term713962, term713962.getClass(), "next", null);
        setField(term713963, term713963.getClass(), "functionName", null);
        setBooleanField(term713963, term713963.getClass(), "itsNeedsActivation", false);
        setIntField(term713963, term713963.getClass(), "itsFunctionType", 0);
        setBooleanField(term713963, term713963.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term713963, term713963.getClass(), "encodedSourceStart", 0);
        setIntField(term713963, term713963.getClass(), "encodedSourceEnd", 0);
        setField(term713963, term713963.getClass(), "sourceName", null);
        setIntField(term713963, term713963.getClass(), "baseLineno", 0);
        setIntField(term713963, term713963.getClass(), "endLineno", 0);
        setField(term713963, term713963.getClass(), "functions", null);
        setField(term713963, term713963.getClass(), "regexps", null);
        setField(term713963, term713963.getClass(), "itsVariables", null);
        setField(term713963, term713963.getClass(), "itsConst", null);
        setField(term713963, term713963.getClass(), "itsVariableNames", null);
        setIntField(term713963, term713963.getClass(), "varStart", 0);
        setField(term713963, term713963.getClass(), "compilerData", null);
        setIntField(term713963, term713963.getClass(), "type", 0);
        setDoubleField(term713964, term713964.getClass(), "number", 0.0);
        setIntField(term713964, term713964.getClass(), "type", 0);
        setField(term713964, term713964.getClass(), "next", null);
        setField(term713964, term713964.getClass(), "first", null);
        setField(term713964, term713964.getClass(), "last", null);
        setField(term713964, term713964.getClass(), "propListHead", null);
        setIntField(term713964, term713964.getClass(), "sourcePosition", 0);
        setField(term713964, term713964.getClass(), "jsType", null);
        setField(term713964, term713964.getClass(), "parent", null);
        setField(term713963, term713963.getClass(), "next", term713964);
        setField(term713963, term713963.getClass(), "first", null);
        setField(term713963, term713963.getClass(), "last", null);
        setField(term713963, term713963.getClass(), "propListHead", null);
        setIntField(term713963, term713963.getClass(), "sourcePosition", 0);
        setField(term713963, term713963.getClass(), "jsType", null);
        setField(term713963, term713963.getClass(), "parent", null);
        setField(term713962, term713962.getClass(), "first", term713963);
        setField(term713962, term713962.getClass(), "last", null);
        setField(term713962, term713962.getClass(), "propListHead", null);
        setIntField(term713962, term713962.getClass(), "sourcePosition", 0);
        setField(term713962, term713962.getClass(), "jsType", null);
        setField(term713962, term713962.getClass(), "parent", null);
        term713887 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term713890 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term713900 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term713887, term713887.getClass(), "number", 0.0);
        setIntField(term713887, term713887.getClass(), "type", 100);
        setField(term713887, term713887.getClass(), "next", null);
        setField(term713890, term713890.getClass(), "functionName", null);
        setBooleanField(term713890, term713890.getClass(), "itsNeedsActivation", false);
        setIntField(term713890, term713890.getClass(), "itsFunctionType", 0);
        setBooleanField(term713890, term713890.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term713890, term713890.getClass(), "encodedSourceStart", 0);
        setIntField(term713890, term713890.getClass(), "encodedSourceEnd", 0);
        setField(term713890, term713890.getClass(), "sourceName", null);
        setIntField(term713890, term713890.getClass(), "baseLineno", 0);
        setIntField(term713890, term713890.getClass(), "endLineno", 0);
        setField(term713890, term713890.getClass(), "functions", null);
        setField(term713890, term713890.getClass(), "regexps", null);
        setField(term713890, term713890.getClass(), "itsVariables", null);
        setField(term713890, term713890.getClass(), "itsConst", null);
        setField(term713890, term713890.getClass(), "itsVariableNames", null);
        setIntField(term713890, term713890.getClass(), "varStart", 0);
        setField(term713890, term713890.getClass(), "compilerData", null);
        setIntField(term713890, term713890.getClass(), "type", 0);
        setDoubleField(term713900, term713900.getClass(), "number", 0.0);
        setIntField(term713900, term713900.getClass(), "type", 0);
        setField(term713900, term713900.getClass(), "next", null);
        setField(term713900, term713900.getClass(), "first", null);
        setField(term713900, term713900.getClass(), "last", null);
        setField(term713900, term713900.getClass(), "propListHead", null);
        setIntField(term713900, term713900.getClass(), "sourcePosition", 0);
        setField(term713900, term713900.getClass(), "jsType", null);
        setField(term713900, term713900.getClass(), "parent", null);
        setField(term713890, term713890.getClass(), "next", term713900);
        setField(term713890, term713890.getClass(), "first", null);
        setField(term713890, term713890.getClass(), "last", null);
        setField(term713890, term713890.getClass(), "propListHead", null);
        setIntField(term713890, term713890.getClass(), "sourcePosition", 0);
        setField(term713890, term713890.getClass(), "jsType", null);
        setField(term713890, term713890.getClass(), "parent", null);
        setField(term713887, term713887.getClass(), "first", term713890);
        setField(term713887, term713887.getClass(), "last", null);
        setField(term713887, term713887.getClass(), "propListHead", null);
        setIntField(term713887, term713887.getClass(), "sourcePosition", 0);
        setField(term713887, term713887.getClass(), "jsType", null);
        setField(term713887, term713887.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term713655;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term713563, args);
        assertTrue(recursiveEquals(term713563, term713961));
        assertTrue(recursiveEquals(term713655, term713962));
        assertTrue(recursiveEquals(retValue, term713887));
    }

};


