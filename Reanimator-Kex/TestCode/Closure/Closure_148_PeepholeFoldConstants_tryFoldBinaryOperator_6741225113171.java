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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term940804;
     Object term940896;
     Object term941754;
     Object term941755;
     Object term941638;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term940804 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term940896 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term940986 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term941078 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term941164 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term941078, term941078.getClass(), "type", 64);
        setField(term940986, term940986.getClass(), "next", term941078);
        setIntField(term940986, term940986.getClass(), "type", 0);
        setField(term940896, term940896.getClass(), "first", term940986);
        setIntField(term940896, term940896.getClass(), "type", 101);
        setIntField(term941164, term941164.getClass(), "type", 98);
        setField(term940896, term940896.getClass(), "parent", term941164);
        term941754 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term941754, term941754.getClass(), "currentTraversal", null);
        term941755 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term941756 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term941757 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term941758 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term941755, term941755.getClass(), "number", 0.0);
        setIntField(term941755, term941755.getClass(), "type", 101);
        setField(term941755, term941755.getClass(), "next", null);
        setIntField(term941756, term941756.getClass(), "encodedSourceStart", 0);
        setIntField(term941756, term941756.getClass(), "encodedSourceEnd", 0);
        setField(term941756, term941756.getClass(), "sourceName", null);
        setIntField(term941756, term941756.getClass(), "baseLineno", 0);
        setIntField(term941756, term941756.getClass(), "endLineno", 0);
        setField(term941756, term941756.getClass(), "functions", null);
        setField(term941756, term941756.getClass(), "regexps", null);
        setField(term941756, term941756.getClass(), "itsVariables", null);
        setField(term941756, term941756.getClass(), "itsConst", null);
        setField(term941756, term941756.getClass(), "itsVariableNames", null);
        setIntField(term941756, term941756.getClass(), "varStart", 0);
        setField(term941756, term941756.getClass(), "compilerData", null);
        setIntField(term941756, term941756.getClass(), "type", 0);
        setDoubleField(term941757, term941757.getClass(), "number", 0.0);
        setIntField(term941757, term941757.getClass(), "type", 64);
        setField(term941757, term941757.getClass(), "next", null);
        setField(term941757, term941757.getClass(), "first", null);
        setField(term941757, term941757.getClass(), "last", null);
        setField(term941757, term941757.getClass(), "propListHead", null);
        setIntField(term941757, term941757.getClass(), "sourcePosition", 0);
        setField(term941757, term941757.getClass(), "jsType", null);
        setField(term941757, term941757.getClass(), "parent", null);
        setField(term941756, term941756.getClass(), "next", term941757);
        setField(term941756, term941756.getClass(), "first", null);
        setField(term941756, term941756.getClass(), "last", null);
        setField(term941756, term941756.getClass(), "propListHead", null);
        setIntField(term941756, term941756.getClass(), "sourcePosition", 0);
        setField(term941756, term941756.getClass(), "jsType", null);
        setField(term941756, term941756.getClass(), "parent", null);
        setField(term941755, term941755.getClass(), "first", term941756);
        setField(term941755, term941755.getClass(), "last", null);
        setField(term941755, term941755.getClass(), "propListHead", null);
        setIntField(term941755, term941755.getClass(), "sourcePosition", 0);
        setField(term941755, term941755.getClass(), "jsType", null);
        setField(term941758, term941758.getClass(), "functionName", null);
        setBooleanField(term941758, term941758.getClass(), "itsNeedsActivation", false);
        setIntField(term941758, term941758.getClass(), "itsFunctionType", 0);
        setBooleanField(term941758, term941758.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term941758, term941758.getClass(), "encodedSourceStart", 0);
        setIntField(term941758, term941758.getClass(), "encodedSourceEnd", 0);
        setField(term941758, term941758.getClass(), "sourceName", null);
        setIntField(term941758, term941758.getClass(), "baseLineno", 0);
        setIntField(term941758, term941758.getClass(), "endLineno", 0);
        setField(term941758, term941758.getClass(), "functions", null);
        setField(term941758, term941758.getClass(), "regexps", null);
        setField(term941758, term941758.getClass(), "itsVariables", null);
        setField(term941758, term941758.getClass(), "itsConst", null);
        setField(term941758, term941758.getClass(), "itsVariableNames", null);
        setIntField(term941758, term941758.getClass(), "varStart", 0);
        setField(term941758, term941758.getClass(), "compilerData", null);
        setIntField(term941758, term941758.getClass(), "type", 98);
        setField(term941758, term941758.getClass(), "next", null);
        setField(term941758, term941758.getClass(), "first", null);
        setField(term941758, term941758.getClass(), "last", null);
        setField(term941758, term941758.getClass(), "propListHead", null);
        setIntField(term941758, term941758.getClass(), "sourcePosition", 0);
        setField(term941758, term941758.getClass(), "jsType", null);
        setField(term941758, term941758.getClass(), "parent", null);
        setField(term941755, term941755.getClass(), "parent", term941758);
        term941638 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term941641 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term941648 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term941654 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term941638, term941638.getClass(), "number", 0.0);
        setIntField(term941638, term941638.getClass(), "type", 101);
        setField(term941638, term941638.getClass(), "next", null);
        setIntField(term941641, term941641.getClass(), "encodedSourceStart", 0);
        setIntField(term941641, term941641.getClass(), "encodedSourceEnd", 0);
        setField(term941641, term941641.getClass(), "sourceName", null);
        setIntField(term941641, term941641.getClass(), "baseLineno", 0);
        setIntField(term941641, term941641.getClass(), "endLineno", 0);
        setField(term941641, term941641.getClass(), "functions", null);
        setField(term941641, term941641.getClass(), "regexps", null);
        setField(term941641, term941641.getClass(), "itsVariables", null);
        setField(term941641, term941641.getClass(), "itsConst", null);
        setField(term941641, term941641.getClass(), "itsVariableNames", null);
        setIntField(term941641, term941641.getClass(), "varStart", 0);
        setField(term941641, term941641.getClass(), "compilerData", null);
        setIntField(term941641, term941641.getClass(), "type", 0);
        setDoubleField(term941648, term941648.getClass(), "number", 0.0);
        setIntField(term941648, term941648.getClass(), "type", 64);
        setField(term941648, term941648.getClass(), "next", null);
        setField(term941648, term941648.getClass(), "first", null);
        setField(term941648, term941648.getClass(), "last", null);
        setField(term941648, term941648.getClass(), "propListHead", null);
        setIntField(term941648, term941648.getClass(), "sourcePosition", 0);
        setField(term941648, term941648.getClass(), "jsType", null);
        setField(term941648, term941648.getClass(), "parent", null);
        setField(term941641, term941641.getClass(), "next", term941648);
        setField(term941641, term941641.getClass(), "first", null);
        setField(term941641, term941641.getClass(), "last", null);
        setField(term941641, term941641.getClass(), "propListHead", null);
        setIntField(term941641, term941641.getClass(), "sourcePosition", 0);
        setField(term941641, term941641.getClass(), "jsType", null);
        setField(term941641, term941641.getClass(), "parent", null);
        setField(term941638, term941638.getClass(), "first", term941641);
        setField(term941638, term941638.getClass(), "last", null);
        setField(term941638, term941638.getClass(), "propListHead", null);
        setIntField(term941638, term941638.getClass(), "sourcePosition", 0);
        setField(term941638, term941638.getClass(), "jsType", null);
        setField(term941654, term941654.getClass(), "functionName", null);
        setBooleanField(term941654, term941654.getClass(), "itsNeedsActivation", false);
        setIntField(term941654, term941654.getClass(), "itsFunctionType", 0);
        setBooleanField(term941654, term941654.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term941654, term941654.getClass(), "encodedSourceStart", 0);
        setIntField(term941654, term941654.getClass(), "encodedSourceEnd", 0);
        setField(term941654, term941654.getClass(), "sourceName", null);
        setIntField(term941654, term941654.getClass(), "baseLineno", 0);
        setIntField(term941654, term941654.getClass(), "endLineno", 0);
        setField(term941654, term941654.getClass(), "functions", null);
        setField(term941654, term941654.getClass(), "regexps", null);
        setField(term941654, term941654.getClass(), "itsVariables", null);
        setField(term941654, term941654.getClass(), "itsConst", null);
        setField(term941654, term941654.getClass(), "itsVariableNames", null);
        setIntField(term941654, term941654.getClass(), "varStart", 0);
        setField(term941654, term941654.getClass(), "compilerData", null);
        setIntField(term941654, term941654.getClass(), "type", 98);
        setField(term941654, term941654.getClass(), "next", null);
        setField(term941654, term941654.getClass(), "first", null);
        setField(term941654, term941654.getClass(), "last", null);
        setField(term941654, term941654.getClass(), "propListHead", null);
        setIntField(term941654, term941654.getClass(), "sourcePosition", 0);
        setField(term941654, term941654.getClass(), "jsType", null);
        setField(term941654, term941654.getClass(), "parent", null);
        setField(term941638, term941638.getClass(), "parent", term941654);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term940896;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term940804, args);
        assertTrue(recursiveEquals(term940804, term941754));
        assertTrue(recursiveEquals(term940896, term941755));
        assertTrue(recursiveEquals(retValue, term941638));
    }

};


