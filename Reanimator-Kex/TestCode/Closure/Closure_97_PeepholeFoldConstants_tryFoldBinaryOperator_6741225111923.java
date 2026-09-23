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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term732259;
     Object term732351;
     Object term733003;
     Object term733004;
     Object term732958;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term732259 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term732351 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term732437 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term732529 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term732437, term732437.getClass(), "next", term732529);
        setIntField(term732437, term732437.getClass(), "type", 39);
        setField(term732351, term732351.getClass(), "first", term732437);
        setIntField(term732351, term732351.getClass(), "type", 18);
        term733003 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term733003, term733003.getClass(), "currentTraversal", null);
        term733004 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term733005 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term733006 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term733004, term733004.getClass(), "str", null);
        setIntField(term733004, term733004.getClass(), "type", 18);
        setField(term733004, term733004.getClass(), "next", null);
        setField(term733005, term733005.getClass(), "functionName", null);
        setBooleanField(term733005, term733005.getClass(), "itsNeedsActivation", false);
        setIntField(term733005, term733005.getClass(), "itsFunctionType", 0);
        setBooleanField(term733005, term733005.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term733005, term733005.getClass(), "encodedSourceStart", 0);
        setIntField(term733005, term733005.getClass(), "encodedSourceEnd", 0);
        setField(term733005, term733005.getClass(), "sourceName", null);
        setIntField(term733005, term733005.getClass(), "baseLineno", 0);
        setIntField(term733005, term733005.getClass(), "endLineno", 0);
        setField(term733005, term733005.getClass(), "functions", null);
        setField(term733005, term733005.getClass(), "regexps", null);
        setField(term733005, term733005.getClass(), "itsVariables", null);
        setField(term733005, term733005.getClass(), "itsConst", null);
        setField(term733005, term733005.getClass(), "itsVariableNames", null);
        setIntField(term733005, term733005.getClass(), "varStart", 0);
        setField(term733005, term733005.getClass(), "compilerData", null);
        setIntField(term733005, term733005.getClass(), "type", 39);
        setField(term733006, term733006.getClass(), "str", null);
        setIntField(term733006, term733006.getClass(), "type", 0);
        setField(term733006, term733006.getClass(), "next", null);
        setField(term733006, term733006.getClass(), "first", null);
        setField(term733006, term733006.getClass(), "last", null);
        setField(term733006, term733006.getClass(), "propListHead", null);
        setIntField(term733006, term733006.getClass(), "sourcePosition", 0);
        setField(term733006, term733006.getClass(), "jsType", null);
        setField(term733006, term733006.getClass(), "parent", null);
        setField(term733005, term733005.getClass(), "next", term733006);
        setField(term733005, term733005.getClass(), "first", null);
        setField(term733005, term733005.getClass(), "last", null);
        setField(term733005, term733005.getClass(), "propListHead", null);
        setIntField(term733005, term733005.getClass(), "sourcePosition", 0);
        setField(term733005, term733005.getClass(), "jsType", null);
        setField(term733005, term733005.getClass(), "parent", null);
        setField(term733004, term733004.getClass(), "first", term733005);
        setField(term733004, term733004.getClass(), "last", null);
        setField(term733004, term733004.getClass(), "propListHead", null);
        setIntField(term733004, term733004.getClass(), "sourcePosition", 0);
        setField(term733004, term733004.getClass(), "jsType", null);
        setField(term733004, term733004.getClass(), "parent", null);
        term732958 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term732960 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term732970 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term732958, term732958.getClass(), "str", null);
        setIntField(term732958, term732958.getClass(), "type", 18);
        setField(term732958, term732958.getClass(), "next", null);
        setField(term732960, term732960.getClass(), "functionName", null);
        setBooleanField(term732960, term732960.getClass(), "itsNeedsActivation", false);
        setIntField(term732960, term732960.getClass(), "itsFunctionType", 0);
        setBooleanField(term732960, term732960.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term732960, term732960.getClass(), "encodedSourceStart", 0);
        setIntField(term732960, term732960.getClass(), "encodedSourceEnd", 0);
        setField(term732960, term732960.getClass(), "sourceName", null);
        setIntField(term732960, term732960.getClass(), "baseLineno", 0);
        setIntField(term732960, term732960.getClass(), "endLineno", 0);
        setField(term732960, term732960.getClass(), "functions", null);
        setField(term732960, term732960.getClass(), "regexps", null);
        setField(term732960, term732960.getClass(), "itsVariables", null);
        setField(term732960, term732960.getClass(), "itsConst", null);
        setField(term732960, term732960.getClass(), "itsVariableNames", null);
        setIntField(term732960, term732960.getClass(), "varStart", 0);
        setField(term732960, term732960.getClass(), "compilerData", null);
        setIntField(term732960, term732960.getClass(), "type", 39);
        setField(term732970, term732970.getClass(), "str", null);
        setIntField(term732970, term732970.getClass(), "type", 0);
        setField(term732970, term732970.getClass(), "next", null);
        setField(term732970, term732970.getClass(), "first", null);
        setField(term732970, term732970.getClass(), "last", null);
        setField(term732970, term732970.getClass(), "propListHead", null);
        setIntField(term732970, term732970.getClass(), "sourcePosition", 0);
        setField(term732970, term732970.getClass(), "jsType", null);
        setField(term732970, term732970.getClass(), "parent", null);
        setField(term732960, term732960.getClass(), "next", term732970);
        setField(term732960, term732960.getClass(), "first", null);
        setField(term732960, term732960.getClass(), "last", null);
        setField(term732960, term732960.getClass(), "propListHead", null);
        setIntField(term732960, term732960.getClass(), "sourcePosition", 0);
        setField(term732960, term732960.getClass(), "jsType", null);
        setField(term732960, term732960.getClass(), "parent", null);
        setField(term732958, term732958.getClass(), "first", term732960);
        setField(term732958, term732958.getClass(), "last", null);
        setField(term732958, term732958.getClass(), "propListHead", null);
        setIntField(term732958, term732958.getClass(), "sourcePosition", 0);
        setField(term732958, term732958.getClass(), "jsType", null);
        setField(term732958, term732958.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term732351;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term732259, args);
        assertTrue(recursiveEquals(term732259, term733003));
        assertTrue(recursiveEquals(term732351, term733004));
        assertTrue(recursiveEquals(retValue, term732958));
    }

};


