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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112871 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term836189;
     Object term836281;
     Object term836693;
     Object term836694;
     Object term836641;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112871() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term836189 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term836281 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term836367 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term836437 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term836367, term836367.getClass(), "next", term836437);
        setField(term836281, term836281.getClass(), "first", term836367);
        setIntField(term836281, term836281.getClass(), "type", 17);
        term836693 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term836693, term836693.getClass(), "currentTraversal", null);
        term836694 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term836695 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term836696 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term836694, term836694.getClass(), "number", 0.0);
        setIntField(term836694, term836694.getClass(), "type", 17);
        setField(term836694, term836694.getClass(), "next", null);
        setField(term836695, term836695.getClass(), "functionName", null);
        setBooleanField(term836695, term836695.getClass(), "itsNeedsActivation", false);
        setIntField(term836695, term836695.getClass(), "itsFunctionType", 0);
        setBooleanField(term836695, term836695.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term836695, term836695.getClass(), "encodedSourceStart", 0);
        setIntField(term836695, term836695.getClass(), "encodedSourceEnd", 0);
        setField(term836695, term836695.getClass(), "sourceName", null);
        setIntField(term836695, term836695.getClass(), "baseLineno", 0);
        setIntField(term836695, term836695.getClass(), "endLineno", 0);
        setField(term836695, term836695.getClass(), "functions", null);
        setField(term836695, term836695.getClass(), "regexps", null);
        setField(term836695, term836695.getClass(), "itsVariables", null);
        setField(term836695, term836695.getClass(), "itsConst", null);
        setField(term836695, term836695.getClass(), "itsVariableNames", null);
        setIntField(term836695, term836695.getClass(), "varStart", 0);
        setField(term836695, term836695.getClass(), "compilerData", null);
        setIntField(term836695, term836695.getClass(), "type", 0);
        setIntField(term836696, term836696.getClass(), "type", 0);
        setField(term836696, term836696.getClass(), "next", null);
        setField(term836696, term836696.getClass(), "first", null);
        setField(term836696, term836696.getClass(), "last", null);
        setField(term836696, term836696.getClass(), "propListHead", null);
        setIntField(term836696, term836696.getClass(), "sourcePosition", 0);
        setField(term836696, term836696.getClass(), "jsType", null);
        setField(term836696, term836696.getClass(), "parent", null);
        setField(term836695, term836695.getClass(), "next", term836696);
        setField(term836695, term836695.getClass(), "first", null);
        setField(term836695, term836695.getClass(), "last", null);
        setField(term836695, term836695.getClass(), "propListHead", null);
        setIntField(term836695, term836695.getClass(), "sourcePosition", 0);
        setField(term836695, term836695.getClass(), "jsType", null);
        setField(term836695, term836695.getClass(), "parent", null);
        setField(term836694, term836694.getClass(), "first", term836695);
        setField(term836694, term836694.getClass(), "last", null);
        setField(term836694, term836694.getClass(), "propListHead", null);
        setIntField(term836694, term836694.getClass(), "sourcePosition", 0);
        setField(term836694, term836694.getClass(), "jsType", null);
        setField(term836694, term836694.getClass(), "parent", null);
        term836641 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term836644 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term836654 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term836641, term836641.getClass(), "number", 0.0);
        setIntField(term836641, term836641.getClass(), "type", 17);
        setField(term836641, term836641.getClass(), "next", null);
        setField(term836644, term836644.getClass(), "functionName", null);
        setBooleanField(term836644, term836644.getClass(), "itsNeedsActivation", false);
        setIntField(term836644, term836644.getClass(), "itsFunctionType", 0);
        setBooleanField(term836644, term836644.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term836644, term836644.getClass(), "encodedSourceStart", 0);
        setIntField(term836644, term836644.getClass(), "encodedSourceEnd", 0);
        setField(term836644, term836644.getClass(), "sourceName", null);
        setIntField(term836644, term836644.getClass(), "baseLineno", 0);
        setIntField(term836644, term836644.getClass(), "endLineno", 0);
        setField(term836644, term836644.getClass(), "functions", null);
        setField(term836644, term836644.getClass(), "regexps", null);
        setField(term836644, term836644.getClass(), "itsVariables", null);
        setField(term836644, term836644.getClass(), "itsConst", null);
        setField(term836644, term836644.getClass(), "itsVariableNames", null);
        setIntField(term836644, term836644.getClass(), "varStart", 0);
        setField(term836644, term836644.getClass(), "compilerData", null);
        setIntField(term836644, term836644.getClass(), "type", 0);
        setIntField(term836654, term836654.getClass(), "type", 0);
        setField(term836654, term836654.getClass(), "next", null);
        setField(term836654, term836654.getClass(), "first", null);
        setField(term836654, term836654.getClass(), "last", null);
        setField(term836654, term836654.getClass(), "propListHead", null);
        setIntField(term836654, term836654.getClass(), "sourcePosition", 0);
        setField(term836654, term836654.getClass(), "jsType", null);
        setField(term836654, term836654.getClass(), "parent", null);
        setField(term836644, term836644.getClass(), "next", term836654);
        setField(term836644, term836644.getClass(), "first", null);
        setField(term836644, term836644.getClass(), "last", null);
        setField(term836644, term836644.getClass(), "propListHead", null);
        setIntField(term836644, term836644.getClass(), "sourcePosition", 0);
        setField(term836644, term836644.getClass(), "jsType", null);
        setField(term836644, term836644.getClass(), "parent", null);
        setField(term836641, term836641.getClass(), "first", term836644);
        setField(term836641, term836641.getClass(), "last", null);
        setField(term836641, term836641.getClass(), "propListHead", null);
        setIntField(term836641, term836641.getClass(), "sourcePosition", 0);
        setField(term836641, term836641.getClass(), "jsType", null);
        setField(term836641, term836641.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term836281;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term836189, args);
        assertTrue(recursiveEquals(term836189, term836693));
        assertTrue(recursiveEquals(term836281, term836694));
        assertTrue(recursiveEquals(retValue, term836641));
    }

};


