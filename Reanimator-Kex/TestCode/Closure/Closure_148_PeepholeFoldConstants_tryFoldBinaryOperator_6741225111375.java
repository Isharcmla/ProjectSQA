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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term336094;
     Object term336186;
     Object term336719;
     Object term336720;
     Object term336667;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term336094 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term336186 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term336272 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term336342 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term336272, term336272.getClass(), "next", term336342);
        setField(term336186, term336186.getClass(), "first", term336272);
        setIntField(term336186, term336186.getClass(), "type", 52);
        term336719 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term336719, term336719.getClass(), "currentTraversal", null);
        term336720 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term336721 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term336722 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term336720, term336720.getClass(), "number", 0.0);
        setIntField(term336720, term336720.getClass(), "type", 52);
        setField(term336720, term336720.getClass(), "next", null);
        setField(term336721, term336721.getClass(), "functionName", null);
        setBooleanField(term336721, term336721.getClass(), "itsNeedsActivation", false);
        setIntField(term336721, term336721.getClass(), "itsFunctionType", 0);
        setBooleanField(term336721, term336721.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term336721, term336721.getClass(), "encodedSourceStart", 0);
        setIntField(term336721, term336721.getClass(), "encodedSourceEnd", 0);
        setField(term336721, term336721.getClass(), "sourceName", null);
        setIntField(term336721, term336721.getClass(), "baseLineno", 0);
        setIntField(term336721, term336721.getClass(), "endLineno", 0);
        setField(term336721, term336721.getClass(), "functions", null);
        setField(term336721, term336721.getClass(), "regexps", null);
        setField(term336721, term336721.getClass(), "itsVariables", null);
        setField(term336721, term336721.getClass(), "itsConst", null);
        setField(term336721, term336721.getClass(), "itsVariableNames", null);
        setIntField(term336721, term336721.getClass(), "varStart", 0);
        setField(term336721, term336721.getClass(), "compilerData", null);
        setIntField(term336721, term336721.getClass(), "type", 0);
        setIntField(term336722, term336722.getClass(), "type", 0);
        setField(term336722, term336722.getClass(), "next", null);
        setField(term336722, term336722.getClass(), "first", null);
        setField(term336722, term336722.getClass(), "last", null);
        setField(term336722, term336722.getClass(), "propListHead", null);
        setIntField(term336722, term336722.getClass(), "sourcePosition", 0);
        setField(term336722, term336722.getClass(), "jsType", null);
        setField(term336722, term336722.getClass(), "parent", null);
        setField(term336721, term336721.getClass(), "next", term336722);
        setField(term336721, term336721.getClass(), "first", null);
        setField(term336721, term336721.getClass(), "last", null);
        setField(term336721, term336721.getClass(), "propListHead", null);
        setIntField(term336721, term336721.getClass(), "sourcePosition", 0);
        setField(term336721, term336721.getClass(), "jsType", null);
        setField(term336721, term336721.getClass(), "parent", null);
        setField(term336720, term336720.getClass(), "first", term336721);
        setField(term336720, term336720.getClass(), "last", null);
        setField(term336720, term336720.getClass(), "propListHead", null);
        setIntField(term336720, term336720.getClass(), "sourcePosition", 0);
        setField(term336720, term336720.getClass(), "jsType", null);
        setField(term336720, term336720.getClass(), "parent", null);
        term336667 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term336670 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term336680 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term336667, term336667.getClass(), "number", 0.0);
        setIntField(term336667, term336667.getClass(), "type", 52);
        setField(term336667, term336667.getClass(), "next", null);
        setField(term336670, term336670.getClass(), "functionName", null);
        setBooleanField(term336670, term336670.getClass(), "itsNeedsActivation", false);
        setIntField(term336670, term336670.getClass(), "itsFunctionType", 0);
        setBooleanField(term336670, term336670.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term336670, term336670.getClass(), "encodedSourceStart", 0);
        setIntField(term336670, term336670.getClass(), "encodedSourceEnd", 0);
        setField(term336670, term336670.getClass(), "sourceName", null);
        setIntField(term336670, term336670.getClass(), "baseLineno", 0);
        setIntField(term336670, term336670.getClass(), "endLineno", 0);
        setField(term336670, term336670.getClass(), "functions", null);
        setField(term336670, term336670.getClass(), "regexps", null);
        setField(term336670, term336670.getClass(), "itsVariables", null);
        setField(term336670, term336670.getClass(), "itsConst", null);
        setField(term336670, term336670.getClass(), "itsVariableNames", null);
        setIntField(term336670, term336670.getClass(), "varStart", 0);
        setField(term336670, term336670.getClass(), "compilerData", null);
        setIntField(term336670, term336670.getClass(), "type", 0);
        setIntField(term336680, term336680.getClass(), "type", 0);
        setField(term336680, term336680.getClass(), "next", null);
        setField(term336680, term336680.getClass(), "first", null);
        setField(term336680, term336680.getClass(), "last", null);
        setField(term336680, term336680.getClass(), "propListHead", null);
        setIntField(term336680, term336680.getClass(), "sourcePosition", 0);
        setField(term336680, term336680.getClass(), "jsType", null);
        setField(term336680, term336680.getClass(), "parent", null);
        setField(term336670, term336670.getClass(), "next", term336680);
        setField(term336670, term336670.getClass(), "first", null);
        setField(term336670, term336670.getClass(), "last", null);
        setField(term336670, term336670.getClass(), "propListHead", null);
        setIntField(term336670, term336670.getClass(), "sourcePosition", 0);
        setField(term336670, term336670.getClass(), "jsType", null);
        setField(term336670, term336670.getClass(), "parent", null);
        setField(term336667, term336667.getClass(), "first", term336670);
        setField(term336667, term336667.getClass(), "last", null);
        setField(term336667, term336667.getClass(), "propListHead", null);
        setIntField(term336667, term336667.getClass(), "sourcePosition", 0);
        setField(term336667, term336667.getClass(), "jsType", null);
        setField(term336667, term336667.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term336186;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term336094, args);
        assertTrue(recursiveEquals(term336094, term336719));
        assertTrue(recursiveEquals(term336186, term336720));
        assertTrue(recursiveEquals(retValue, term336667));
    }

};


