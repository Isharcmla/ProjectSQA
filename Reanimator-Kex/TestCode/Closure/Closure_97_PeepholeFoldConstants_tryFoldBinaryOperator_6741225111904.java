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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111904 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term727434;
     Object term727526;
     Object term727777;
     Object term727778;
     Object term727720;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111904() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term727434 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term727526 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term727618 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term727704 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term727618, term727618.getClass(), "next", term727704);
        setIntField(term727618, term727618.getClass(), "type", 39);
        setField(term727526, term727526.getClass(), "first", term727618);
        setIntField(term727526, term727526.getClass(), "type", 22);
        term727777 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term727777, term727777.getClass(), "currentTraversal", null);
        term727778 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term727779 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term727780 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term727778, term727778.getClass(), "number", 0.0);
        setIntField(term727778, term727778.getClass(), "type", 22);
        setField(term727778, term727778.getClass(), "next", null);
        setDoubleField(term727779, term727779.getClass(), "number", 0.0);
        setIntField(term727779, term727779.getClass(), "type", 39);
        setField(term727780, term727780.getClass(), "functionName", null);
        setBooleanField(term727780, term727780.getClass(), "itsNeedsActivation", false);
        setIntField(term727780, term727780.getClass(), "itsFunctionType", 0);
        setBooleanField(term727780, term727780.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term727780, term727780.getClass(), "encodedSourceStart", 0);
        setIntField(term727780, term727780.getClass(), "encodedSourceEnd", 0);
        setField(term727780, term727780.getClass(), "sourceName", null);
        setIntField(term727780, term727780.getClass(), "baseLineno", 0);
        setIntField(term727780, term727780.getClass(), "endLineno", 0);
        setField(term727780, term727780.getClass(), "functions", null);
        setField(term727780, term727780.getClass(), "regexps", null);
        setField(term727780, term727780.getClass(), "itsVariables", null);
        setField(term727780, term727780.getClass(), "itsConst", null);
        setField(term727780, term727780.getClass(), "itsVariableNames", null);
        setIntField(term727780, term727780.getClass(), "varStart", 0);
        setField(term727780, term727780.getClass(), "compilerData", null);
        setIntField(term727780, term727780.getClass(), "type", 0);
        setField(term727780, term727780.getClass(), "next", null);
        setField(term727780, term727780.getClass(), "first", null);
        setField(term727780, term727780.getClass(), "last", null);
        setField(term727780, term727780.getClass(), "propListHead", null);
        setIntField(term727780, term727780.getClass(), "sourcePosition", 0);
        setField(term727780, term727780.getClass(), "jsType", null);
        setField(term727780, term727780.getClass(), "parent", null);
        setField(term727779, term727779.getClass(), "next", term727780);
        setField(term727779, term727779.getClass(), "first", null);
        setField(term727779, term727779.getClass(), "last", null);
        setField(term727779, term727779.getClass(), "propListHead", null);
        setIntField(term727779, term727779.getClass(), "sourcePosition", 0);
        setField(term727779, term727779.getClass(), "jsType", null);
        setField(term727779, term727779.getClass(), "parent", null);
        setField(term727778, term727778.getClass(), "first", term727779);
        setField(term727778, term727778.getClass(), "last", null);
        setField(term727778, term727778.getClass(), "propListHead", null);
        setIntField(term727778, term727778.getClass(), "sourcePosition", 0);
        setField(term727778, term727778.getClass(), "jsType", null);
        setField(term727778, term727778.getClass(), "parent", null);
        term727720 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term727723 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term727726 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term727720, term727720.getClass(), "number", 0.0);
        setIntField(term727720, term727720.getClass(), "type", 22);
        setField(term727720, term727720.getClass(), "next", null);
        setDoubleField(term727723, term727723.getClass(), "number", 0.0);
        setIntField(term727723, term727723.getClass(), "type", 39);
        setField(term727726, term727726.getClass(), "functionName", null);
        setBooleanField(term727726, term727726.getClass(), "itsNeedsActivation", false);
        setIntField(term727726, term727726.getClass(), "itsFunctionType", 0);
        setBooleanField(term727726, term727726.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term727726, term727726.getClass(), "encodedSourceStart", 0);
        setIntField(term727726, term727726.getClass(), "encodedSourceEnd", 0);
        setField(term727726, term727726.getClass(), "sourceName", null);
        setIntField(term727726, term727726.getClass(), "baseLineno", 0);
        setIntField(term727726, term727726.getClass(), "endLineno", 0);
        setField(term727726, term727726.getClass(), "functions", null);
        setField(term727726, term727726.getClass(), "regexps", null);
        setField(term727726, term727726.getClass(), "itsVariables", null);
        setField(term727726, term727726.getClass(), "itsConst", null);
        setField(term727726, term727726.getClass(), "itsVariableNames", null);
        setIntField(term727726, term727726.getClass(), "varStart", 0);
        setField(term727726, term727726.getClass(), "compilerData", null);
        setIntField(term727726, term727726.getClass(), "type", 0);
        setField(term727726, term727726.getClass(), "next", null);
        setField(term727726, term727726.getClass(), "first", null);
        setField(term727726, term727726.getClass(), "last", null);
        setField(term727726, term727726.getClass(), "propListHead", null);
        setIntField(term727726, term727726.getClass(), "sourcePosition", 0);
        setField(term727726, term727726.getClass(), "jsType", null);
        setField(term727726, term727726.getClass(), "parent", null);
        setField(term727723, term727723.getClass(), "next", term727726);
        setField(term727723, term727723.getClass(), "first", null);
        setField(term727723, term727723.getClass(), "last", null);
        setField(term727723, term727723.getClass(), "propListHead", null);
        setIntField(term727723, term727723.getClass(), "sourcePosition", 0);
        setField(term727723, term727723.getClass(), "jsType", null);
        setField(term727723, term727723.getClass(), "parent", null);
        setField(term727720, term727720.getClass(), "first", term727723);
        setField(term727720, term727720.getClass(), "last", null);
        setField(term727720, term727720.getClass(), "propListHead", null);
        setIntField(term727720, term727720.getClass(), "sourcePosition", 0);
        setField(term727720, term727720.getClass(), "jsType", null);
        setField(term727720, term727720.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term727526;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term727434, args);
        assertTrue(recursiveEquals(term727434, term727777));
        assertTrue(recursiveEquals(term727526, term727778));
        assertTrue(recursiveEquals(retValue, term727720));
    }

};


