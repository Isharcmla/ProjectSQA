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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term309755;
     Object term309847;
     Object term310552;
     Object term310553;
     Object term310507;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term309755 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term309847 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term309933 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term310003 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term309933, term309933.getClass(), "next", term310003);
        setField(term309847, term309847.getClass(), "first", term309933);
        setIntField(term309847, term309847.getClass(), "type", 19);
        term310552 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term310552, term310552.getClass(), "currentTraversal", null);
        term310553 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term310554 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term310555 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term310553, term310553.getClass(), "number", 0.0);
        setIntField(term310553, term310553.getClass(), "type", 19);
        setField(term310553, term310553.getClass(), "next", null);
        setField(term310554, term310554.getClass(), "functionName", null);
        setBooleanField(term310554, term310554.getClass(), "itsNeedsActivation", false);
        setIntField(term310554, term310554.getClass(), "itsFunctionType", 0);
        setBooleanField(term310554, term310554.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term310554, term310554.getClass(), "encodedSourceStart", 0);
        setIntField(term310554, term310554.getClass(), "encodedSourceEnd", 0);
        setField(term310554, term310554.getClass(), "sourceName", null);
        setIntField(term310554, term310554.getClass(), "baseLineno", 0);
        setIntField(term310554, term310554.getClass(), "endLineno", 0);
        setField(term310554, term310554.getClass(), "functions", null);
        setField(term310554, term310554.getClass(), "regexps", null);
        setField(term310554, term310554.getClass(), "itsVariables", null);
        setField(term310554, term310554.getClass(), "itsConst", null);
        setField(term310554, term310554.getClass(), "itsVariableNames", null);
        setIntField(term310554, term310554.getClass(), "varStart", 0);
        setField(term310554, term310554.getClass(), "compilerData", null);
        setIntField(term310554, term310554.getClass(), "type", 0);
        setIntField(term310555, term310555.getClass(), "type", 0);
        setField(term310555, term310555.getClass(), "next", null);
        setField(term310555, term310555.getClass(), "first", null);
        setField(term310555, term310555.getClass(), "last", null);
        setField(term310555, term310555.getClass(), "propListHead", null);
        setIntField(term310555, term310555.getClass(), "sourcePosition", 0);
        setField(term310555, term310555.getClass(), "jsType", null);
        setField(term310555, term310555.getClass(), "parent", null);
        setField(term310554, term310554.getClass(), "next", term310555);
        setField(term310554, term310554.getClass(), "first", null);
        setField(term310554, term310554.getClass(), "last", null);
        setField(term310554, term310554.getClass(), "propListHead", null);
        setIntField(term310554, term310554.getClass(), "sourcePosition", 0);
        setField(term310554, term310554.getClass(), "jsType", null);
        setField(term310554, term310554.getClass(), "parent", null);
        setField(term310553, term310553.getClass(), "first", term310554);
        setField(term310553, term310553.getClass(), "last", null);
        setField(term310553, term310553.getClass(), "propListHead", null);
        setIntField(term310553, term310553.getClass(), "sourcePosition", 0);
        setField(term310553, term310553.getClass(), "jsType", null);
        setField(term310553, term310553.getClass(), "parent", null);
        term310507 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term310510 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term310520 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term310507, term310507.getClass(), "number", 0.0);
        setIntField(term310507, term310507.getClass(), "type", 19);
        setField(term310507, term310507.getClass(), "next", null);
        setField(term310510, term310510.getClass(), "functionName", null);
        setBooleanField(term310510, term310510.getClass(), "itsNeedsActivation", false);
        setIntField(term310510, term310510.getClass(), "itsFunctionType", 0);
        setBooleanField(term310510, term310510.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term310510, term310510.getClass(), "encodedSourceStart", 0);
        setIntField(term310510, term310510.getClass(), "encodedSourceEnd", 0);
        setField(term310510, term310510.getClass(), "sourceName", null);
        setIntField(term310510, term310510.getClass(), "baseLineno", 0);
        setIntField(term310510, term310510.getClass(), "endLineno", 0);
        setField(term310510, term310510.getClass(), "functions", null);
        setField(term310510, term310510.getClass(), "regexps", null);
        setField(term310510, term310510.getClass(), "itsVariables", null);
        setField(term310510, term310510.getClass(), "itsConst", null);
        setField(term310510, term310510.getClass(), "itsVariableNames", null);
        setIntField(term310510, term310510.getClass(), "varStart", 0);
        setField(term310510, term310510.getClass(), "compilerData", null);
        setIntField(term310510, term310510.getClass(), "type", 0);
        setIntField(term310520, term310520.getClass(), "type", 0);
        setField(term310520, term310520.getClass(), "next", null);
        setField(term310520, term310520.getClass(), "first", null);
        setField(term310520, term310520.getClass(), "last", null);
        setField(term310520, term310520.getClass(), "propListHead", null);
        setIntField(term310520, term310520.getClass(), "sourcePosition", 0);
        setField(term310520, term310520.getClass(), "jsType", null);
        setField(term310520, term310520.getClass(), "parent", null);
        setField(term310510, term310510.getClass(), "next", term310520);
        setField(term310510, term310510.getClass(), "first", null);
        setField(term310510, term310510.getClass(), "last", null);
        setField(term310510, term310510.getClass(), "propListHead", null);
        setIntField(term310510, term310510.getClass(), "sourcePosition", 0);
        setField(term310510, term310510.getClass(), "jsType", null);
        setField(term310510, term310510.getClass(), "parent", null);
        setField(term310507, term310507.getClass(), "first", term310510);
        setField(term310507, term310507.getClass(), "last", null);
        setField(term310507, term310507.getClass(), "propListHead", null);
        setIntField(term310507, term310507.getClass(), "sourcePosition", 0);
        setField(term310507, term310507.getClass(), "jsType", null);
        setField(term310507, term310507.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term309847;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term309755, args);
        assertTrue(recursiveEquals(term309755, term310552));
        assertTrue(recursiveEquals(term309847, term310553));
        assertTrue(recursiveEquals(retValue, term310507));
    }

};


