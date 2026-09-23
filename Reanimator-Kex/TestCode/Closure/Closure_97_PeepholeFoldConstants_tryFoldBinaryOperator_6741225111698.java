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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111698 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term672143;
     Object term672235;
     Object term672458;
     Object term672459;
     Object term672406;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111698() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term672143 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term672235 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term672321 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term672391 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term672321, term672321.getClass(), "next", term672391);
        setField(term672235, term672235.getClass(), "first", term672321);
        setIntField(term672235, term672235.getClass(), "type", 52);
        term672458 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term672458, term672458.getClass(), "currentTraversal", null);
        term672459 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term672460 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term672461 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term672459, term672459.getClass(), "number", 0.0);
        setIntField(term672459, term672459.getClass(), "type", 52);
        setField(term672459, term672459.getClass(), "next", null);
        setField(term672460, term672460.getClass(), "functionName", null);
        setBooleanField(term672460, term672460.getClass(), "itsNeedsActivation", false);
        setIntField(term672460, term672460.getClass(), "itsFunctionType", 0);
        setBooleanField(term672460, term672460.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term672460, term672460.getClass(), "encodedSourceStart", 0);
        setIntField(term672460, term672460.getClass(), "encodedSourceEnd", 0);
        setField(term672460, term672460.getClass(), "sourceName", null);
        setIntField(term672460, term672460.getClass(), "baseLineno", 0);
        setIntField(term672460, term672460.getClass(), "endLineno", 0);
        setField(term672460, term672460.getClass(), "functions", null);
        setField(term672460, term672460.getClass(), "regexps", null);
        setField(term672460, term672460.getClass(), "itsVariables", null);
        setField(term672460, term672460.getClass(), "itsConst", null);
        setField(term672460, term672460.getClass(), "itsVariableNames", null);
        setIntField(term672460, term672460.getClass(), "varStart", 0);
        setField(term672460, term672460.getClass(), "compilerData", null);
        setIntField(term672460, term672460.getClass(), "type", 0);
        setIntField(term672461, term672461.getClass(), "type", 0);
        setField(term672461, term672461.getClass(), "next", null);
        setField(term672461, term672461.getClass(), "first", null);
        setField(term672461, term672461.getClass(), "last", null);
        setField(term672461, term672461.getClass(), "propListHead", null);
        setIntField(term672461, term672461.getClass(), "sourcePosition", 0);
        setField(term672461, term672461.getClass(), "jsType", null);
        setField(term672461, term672461.getClass(), "parent", null);
        setField(term672460, term672460.getClass(), "next", term672461);
        setField(term672460, term672460.getClass(), "first", null);
        setField(term672460, term672460.getClass(), "last", null);
        setField(term672460, term672460.getClass(), "propListHead", null);
        setIntField(term672460, term672460.getClass(), "sourcePosition", 0);
        setField(term672460, term672460.getClass(), "jsType", null);
        setField(term672460, term672460.getClass(), "parent", null);
        setField(term672459, term672459.getClass(), "first", term672460);
        setField(term672459, term672459.getClass(), "last", null);
        setField(term672459, term672459.getClass(), "propListHead", null);
        setIntField(term672459, term672459.getClass(), "sourcePosition", 0);
        setField(term672459, term672459.getClass(), "jsType", null);
        setField(term672459, term672459.getClass(), "parent", null);
        term672406 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term672409 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term672419 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term672406, term672406.getClass(), "number", 0.0);
        setIntField(term672406, term672406.getClass(), "type", 52);
        setField(term672406, term672406.getClass(), "next", null);
        setField(term672409, term672409.getClass(), "functionName", null);
        setBooleanField(term672409, term672409.getClass(), "itsNeedsActivation", false);
        setIntField(term672409, term672409.getClass(), "itsFunctionType", 0);
        setBooleanField(term672409, term672409.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term672409, term672409.getClass(), "encodedSourceStart", 0);
        setIntField(term672409, term672409.getClass(), "encodedSourceEnd", 0);
        setField(term672409, term672409.getClass(), "sourceName", null);
        setIntField(term672409, term672409.getClass(), "baseLineno", 0);
        setIntField(term672409, term672409.getClass(), "endLineno", 0);
        setField(term672409, term672409.getClass(), "functions", null);
        setField(term672409, term672409.getClass(), "regexps", null);
        setField(term672409, term672409.getClass(), "itsVariables", null);
        setField(term672409, term672409.getClass(), "itsConst", null);
        setField(term672409, term672409.getClass(), "itsVariableNames", null);
        setIntField(term672409, term672409.getClass(), "varStart", 0);
        setField(term672409, term672409.getClass(), "compilerData", null);
        setIntField(term672409, term672409.getClass(), "type", 0);
        setIntField(term672419, term672419.getClass(), "type", 0);
        setField(term672419, term672419.getClass(), "next", null);
        setField(term672419, term672419.getClass(), "first", null);
        setField(term672419, term672419.getClass(), "last", null);
        setField(term672419, term672419.getClass(), "propListHead", null);
        setIntField(term672419, term672419.getClass(), "sourcePosition", 0);
        setField(term672419, term672419.getClass(), "jsType", null);
        setField(term672419, term672419.getClass(), "parent", null);
        setField(term672409, term672409.getClass(), "next", term672419);
        setField(term672409, term672409.getClass(), "first", null);
        setField(term672409, term672409.getClass(), "last", null);
        setField(term672409, term672409.getClass(), "propListHead", null);
        setIntField(term672409, term672409.getClass(), "sourcePosition", 0);
        setField(term672409, term672409.getClass(), "jsType", null);
        setField(term672409, term672409.getClass(), "parent", null);
        setField(term672406, term672406.getClass(), "first", term672409);
        setField(term672406, term672406.getClass(), "last", null);
        setField(term672406, term672406.getClass(), "propListHead", null);
        setIntField(term672406, term672406.getClass(), "sourcePosition", 0);
        setField(term672406, term672406.getClass(), "jsType", null);
        setField(term672406, term672406.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term672235;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term672143, args);
        assertTrue(recursiveEquals(term672143, term672458));
        assertTrue(recursiveEquals(term672235, term672459));
        assertTrue(recursiveEquals(retValue, term672406));
    }

};


