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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111606 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term622231;
     Object term622323;
     Object term650815;
     Object term650816;
     Object term650764;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111606() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term622231 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term622323 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term622409 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term622479 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term622409, term622409.getClass(), "next", term622479);
        setField(term622323, term622323.getClass(), "first", term622409);
        setIntField(term622323, term622323.getClass(), "type", 9);
        term650815 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term650815, term650815.getClass(), "currentTraversal", null);
        term650816 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term650817 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term650818 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term650816, term650816.getClass(), "number", 0.0);
        setIntField(term650816, term650816.getClass(), "type", 9);
        setField(term650816, term650816.getClass(), "next", null);
        setField(term650817, term650817.getClass(), "functionName", null);
        setBooleanField(term650817, term650817.getClass(), "itsNeedsActivation", false);
        setIntField(term650817, term650817.getClass(), "itsFunctionType", 0);
        setBooleanField(term650817, term650817.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term650817, term650817.getClass(), "encodedSourceStart", 0);
        setIntField(term650817, term650817.getClass(), "encodedSourceEnd", 0);
        setField(term650817, term650817.getClass(), "sourceName", null);
        setIntField(term650817, term650817.getClass(), "baseLineno", 0);
        setIntField(term650817, term650817.getClass(), "endLineno", 0);
        setField(term650817, term650817.getClass(), "functions", null);
        setField(term650817, term650817.getClass(), "regexps", null);
        setField(term650817, term650817.getClass(), "itsVariables", null);
        setField(term650817, term650817.getClass(), "itsConst", null);
        setField(term650817, term650817.getClass(), "itsVariableNames", null);
        setIntField(term650817, term650817.getClass(), "varStart", 0);
        setField(term650817, term650817.getClass(), "compilerData", null);
        setIntField(term650817, term650817.getClass(), "type", 0);
        setIntField(term650818, term650818.getClass(), "type", 0);
        setField(term650818, term650818.getClass(), "next", null);
        setField(term650818, term650818.getClass(), "first", null);
        setField(term650818, term650818.getClass(), "last", null);
        setField(term650818, term650818.getClass(), "propListHead", null);
        setIntField(term650818, term650818.getClass(), "sourcePosition", 0);
        setField(term650818, term650818.getClass(), "jsType", null);
        setField(term650818, term650818.getClass(), "parent", null);
        setField(term650817, term650817.getClass(), "next", term650818);
        setField(term650817, term650817.getClass(), "first", null);
        setField(term650817, term650817.getClass(), "last", null);
        setField(term650817, term650817.getClass(), "propListHead", null);
        setIntField(term650817, term650817.getClass(), "sourcePosition", 0);
        setField(term650817, term650817.getClass(), "jsType", null);
        setField(term650817, term650817.getClass(), "parent", null);
        setField(term650816, term650816.getClass(), "first", term650817);
        setField(term650816, term650816.getClass(), "last", null);
        setField(term650816, term650816.getClass(), "propListHead", null);
        setIntField(term650816, term650816.getClass(), "sourcePosition", 0);
        setField(term650816, term650816.getClass(), "jsType", null);
        setField(term650816, term650816.getClass(), "parent", null);
        term650764 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term650767 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term650777 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term650764, term650764.getClass(), "number", 0.0);
        setIntField(term650764, term650764.getClass(), "type", 9);
        setField(term650764, term650764.getClass(), "next", null);
        setField(term650767, term650767.getClass(), "functionName", null);
        setBooleanField(term650767, term650767.getClass(), "itsNeedsActivation", false);
        setIntField(term650767, term650767.getClass(), "itsFunctionType", 0);
        setBooleanField(term650767, term650767.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term650767, term650767.getClass(), "encodedSourceStart", 0);
        setIntField(term650767, term650767.getClass(), "encodedSourceEnd", 0);
        setField(term650767, term650767.getClass(), "sourceName", null);
        setIntField(term650767, term650767.getClass(), "baseLineno", 0);
        setIntField(term650767, term650767.getClass(), "endLineno", 0);
        setField(term650767, term650767.getClass(), "functions", null);
        setField(term650767, term650767.getClass(), "regexps", null);
        setField(term650767, term650767.getClass(), "itsVariables", null);
        setField(term650767, term650767.getClass(), "itsConst", null);
        setField(term650767, term650767.getClass(), "itsVariableNames", null);
        setIntField(term650767, term650767.getClass(), "varStart", 0);
        setField(term650767, term650767.getClass(), "compilerData", null);
        setIntField(term650767, term650767.getClass(), "type", 0);
        setIntField(term650777, term650777.getClass(), "type", 0);
        setField(term650777, term650777.getClass(), "next", null);
        setField(term650777, term650777.getClass(), "first", null);
        setField(term650777, term650777.getClass(), "last", null);
        setField(term650777, term650777.getClass(), "propListHead", null);
        setIntField(term650777, term650777.getClass(), "sourcePosition", 0);
        setField(term650777, term650777.getClass(), "jsType", null);
        setField(term650777, term650777.getClass(), "parent", null);
        setField(term650767, term650767.getClass(), "next", term650777);
        setField(term650767, term650767.getClass(), "first", null);
        setField(term650767, term650767.getClass(), "last", null);
        setField(term650767, term650767.getClass(), "propListHead", null);
        setIntField(term650767, term650767.getClass(), "sourcePosition", 0);
        setField(term650767, term650767.getClass(), "jsType", null);
        setField(term650767, term650767.getClass(), "parent", null);
        setField(term650764, term650764.getClass(), "first", term650767);
        setField(term650764, term650764.getClass(), "last", null);
        setField(term650764, term650764.getClass(), "propListHead", null);
        setIntField(term650764, term650764.getClass(), "sourcePosition", 0);
        setField(term650764, term650764.getClass(), "jsType", null);
        setField(term650764, term650764.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term622323;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term622231, args);
        assertTrue(recursiveEquals(term622231, term650815));
        assertTrue(recursiveEquals(term622323, term650816));
        assertTrue(recursiveEquals(retValue, term650764));
    }

};


