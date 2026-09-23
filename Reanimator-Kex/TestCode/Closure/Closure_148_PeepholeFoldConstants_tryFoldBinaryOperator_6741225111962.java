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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111962 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term523062;
     Object term523154;
     Object term523550;
     Object term523551;
     Object term523435;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111962() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term523062 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term523154 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term523244 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term523336 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term523422 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term523336, term523336.getClass(), "type", 64);
        setField(term523244, term523244.getClass(), "next", term523336);
        setIntField(term523244, term523244.getClass(), "type", 0);
        setField(term523154, term523154.getClass(), "first", term523244);
        setIntField(term523154, term523154.getClass(), "type", 101);
        setField(term523154, term523154.getClass(), "parent", term523422);
        term523550 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term523550, term523550.getClass(), "currentTraversal", null);
        term523551 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term523552 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term523553 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term523554 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term523551, term523551.getClass(), "number", 0.0);
        setIntField(term523551, term523551.getClass(), "type", 101);
        setField(term523551, term523551.getClass(), "next", null);
        setIntField(term523552, term523552.getClass(), "encodedSourceStart", 0);
        setIntField(term523552, term523552.getClass(), "encodedSourceEnd", 0);
        setField(term523552, term523552.getClass(), "sourceName", null);
        setIntField(term523552, term523552.getClass(), "baseLineno", 0);
        setIntField(term523552, term523552.getClass(), "endLineno", 0);
        setField(term523552, term523552.getClass(), "functions", null);
        setField(term523552, term523552.getClass(), "regexps", null);
        setField(term523552, term523552.getClass(), "itsVariables", null);
        setField(term523552, term523552.getClass(), "itsConst", null);
        setField(term523552, term523552.getClass(), "itsVariableNames", null);
        setIntField(term523552, term523552.getClass(), "varStart", 0);
        setField(term523552, term523552.getClass(), "compilerData", null);
        setIntField(term523552, term523552.getClass(), "type", 0);
        setDoubleField(term523553, term523553.getClass(), "number", 0.0);
        setIntField(term523553, term523553.getClass(), "type", 64);
        setField(term523553, term523553.getClass(), "next", null);
        setField(term523553, term523553.getClass(), "first", null);
        setField(term523553, term523553.getClass(), "last", null);
        setField(term523553, term523553.getClass(), "propListHead", null);
        setIntField(term523553, term523553.getClass(), "sourcePosition", 0);
        setField(term523553, term523553.getClass(), "jsType", null);
        setField(term523553, term523553.getClass(), "parent", null);
        setField(term523552, term523552.getClass(), "next", term523553);
        setField(term523552, term523552.getClass(), "first", null);
        setField(term523552, term523552.getClass(), "last", null);
        setField(term523552, term523552.getClass(), "propListHead", null);
        setIntField(term523552, term523552.getClass(), "sourcePosition", 0);
        setField(term523552, term523552.getClass(), "jsType", null);
        setField(term523552, term523552.getClass(), "parent", null);
        setField(term523551, term523551.getClass(), "first", term523552);
        setField(term523551, term523551.getClass(), "last", null);
        setField(term523551, term523551.getClass(), "propListHead", null);
        setIntField(term523551, term523551.getClass(), "sourcePosition", 0);
        setField(term523551, term523551.getClass(), "jsType", null);
        setField(term523554, term523554.getClass(), "functionName", null);
        setBooleanField(term523554, term523554.getClass(), "itsNeedsActivation", false);
        setIntField(term523554, term523554.getClass(), "itsFunctionType", 0);
        setBooleanField(term523554, term523554.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term523554, term523554.getClass(), "encodedSourceStart", 0);
        setIntField(term523554, term523554.getClass(), "encodedSourceEnd", 0);
        setField(term523554, term523554.getClass(), "sourceName", null);
        setIntField(term523554, term523554.getClass(), "baseLineno", 0);
        setIntField(term523554, term523554.getClass(), "endLineno", 0);
        setField(term523554, term523554.getClass(), "functions", null);
        setField(term523554, term523554.getClass(), "regexps", null);
        setField(term523554, term523554.getClass(), "itsVariables", null);
        setField(term523554, term523554.getClass(), "itsConst", null);
        setField(term523554, term523554.getClass(), "itsVariableNames", null);
        setIntField(term523554, term523554.getClass(), "varStart", 0);
        setField(term523554, term523554.getClass(), "compilerData", null);
        setIntField(term523554, term523554.getClass(), "type", 0);
        setField(term523554, term523554.getClass(), "next", null);
        setField(term523554, term523554.getClass(), "first", null);
        setField(term523554, term523554.getClass(), "last", null);
        setField(term523554, term523554.getClass(), "propListHead", null);
        setIntField(term523554, term523554.getClass(), "sourcePosition", 0);
        setField(term523554, term523554.getClass(), "jsType", null);
        setField(term523554, term523554.getClass(), "parent", null);
        setField(term523551, term523551.getClass(), "parent", term523554);
        term523435 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term523438 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term523445 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term523451 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term523435, term523435.getClass(), "number", 0.0);
        setIntField(term523435, term523435.getClass(), "type", 101);
        setField(term523435, term523435.getClass(), "next", null);
        setIntField(term523438, term523438.getClass(), "encodedSourceStart", 0);
        setIntField(term523438, term523438.getClass(), "encodedSourceEnd", 0);
        setField(term523438, term523438.getClass(), "sourceName", null);
        setIntField(term523438, term523438.getClass(), "baseLineno", 0);
        setIntField(term523438, term523438.getClass(), "endLineno", 0);
        setField(term523438, term523438.getClass(), "functions", null);
        setField(term523438, term523438.getClass(), "regexps", null);
        setField(term523438, term523438.getClass(), "itsVariables", null);
        setField(term523438, term523438.getClass(), "itsConst", null);
        setField(term523438, term523438.getClass(), "itsVariableNames", null);
        setIntField(term523438, term523438.getClass(), "varStart", 0);
        setField(term523438, term523438.getClass(), "compilerData", null);
        setIntField(term523438, term523438.getClass(), "type", 0);
        setDoubleField(term523445, term523445.getClass(), "number", 0.0);
        setIntField(term523445, term523445.getClass(), "type", 64);
        setField(term523445, term523445.getClass(), "next", null);
        setField(term523445, term523445.getClass(), "first", null);
        setField(term523445, term523445.getClass(), "last", null);
        setField(term523445, term523445.getClass(), "propListHead", null);
        setIntField(term523445, term523445.getClass(), "sourcePosition", 0);
        setField(term523445, term523445.getClass(), "jsType", null);
        setField(term523445, term523445.getClass(), "parent", null);
        setField(term523438, term523438.getClass(), "next", term523445);
        setField(term523438, term523438.getClass(), "first", null);
        setField(term523438, term523438.getClass(), "last", null);
        setField(term523438, term523438.getClass(), "propListHead", null);
        setIntField(term523438, term523438.getClass(), "sourcePosition", 0);
        setField(term523438, term523438.getClass(), "jsType", null);
        setField(term523438, term523438.getClass(), "parent", null);
        setField(term523435, term523435.getClass(), "first", term523438);
        setField(term523435, term523435.getClass(), "last", null);
        setField(term523435, term523435.getClass(), "propListHead", null);
        setIntField(term523435, term523435.getClass(), "sourcePosition", 0);
        setField(term523435, term523435.getClass(), "jsType", null);
        setField(term523451, term523451.getClass(), "functionName", null);
        setBooleanField(term523451, term523451.getClass(), "itsNeedsActivation", false);
        setIntField(term523451, term523451.getClass(), "itsFunctionType", 0);
        setBooleanField(term523451, term523451.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term523451, term523451.getClass(), "encodedSourceStart", 0);
        setIntField(term523451, term523451.getClass(), "encodedSourceEnd", 0);
        setField(term523451, term523451.getClass(), "sourceName", null);
        setIntField(term523451, term523451.getClass(), "baseLineno", 0);
        setIntField(term523451, term523451.getClass(), "endLineno", 0);
        setField(term523451, term523451.getClass(), "functions", null);
        setField(term523451, term523451.getClass(), "regexps", null);
        setField(term523451, term523451.getClass(), "itsVariables", null);
        setField(term523451, term523451.getClass(), "itsConst", null);
        setField(term523451, term523451.getClass(), "itsVariableNames", null);
        setIntField(term523451, term523451.getClass(), "varStart", 0);
        setField(term523451, term523451.getClass(), "compilerData", null);
        setIntField(term523451, term523451.getClass(), "type", 0);
        setField(term523451, term523451.getClass(), "next", null);
        setField(term523451, term523451.getClass(), "first", null);
        setField(term523451, term523451.getClass(), "last", null);
        setField(term523451, term523451.getClass(), "propListHead", null);
        setIntField(term523451, term523451.getClass(), "sourcePosition", 0);
        setField(term523451, term523451.getClass(), "jsType", null);
        setField(term523451, term523451.getClass(), "parent", null);
        setField(term523435, term523435.getClass(), "parent", term523451);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term523154;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term523062, args);
        assertTrue(recursiveEquals(term523062, term523550));
        assertTrue(recursiveEquals(term523154, term523551));
        assertTrue(recursiveEquals(retValue, term523435));
    }

};


