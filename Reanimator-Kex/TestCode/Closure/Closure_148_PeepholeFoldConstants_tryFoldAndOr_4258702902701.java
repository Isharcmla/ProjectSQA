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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902701 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term773993;
     Object term774079;
     Object term774263;
     Object term774355;
     Object term774984;
     Object term774985;
     Object term774987;
     Object term774988;
     Object term774908;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902701() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term773993 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term774079 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term774171 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term774171, term774171.getClass(), "type", 108);
        setField(term774079, term774079.getClass(), "parent", term774171);
        setIntField(term774079, term774079.getClass(), "type", 0);
        term774263 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term774263, term774263.getClass(), "type", 116);
        term774355 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term774355, term774355.getClass(), "type", 63);
        term774984 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term774984, term774984.getClass(), "currentTraversal", null);
        term774985 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term774986 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term774985, term774985.getClass(), "functionName", null);
        setBooleanField(term774985, term774985.getClass(), "itsNeedsActivation", false);
        setIntField(term774985, term774985.getClass(), "itsFunctionType", 0);
        setBooleanField(term774985, term774985.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term774985, term774985.getClass(), "encodedSourceStart", 0);
        setIntField(term774985, term774985.getClass(), "encodedSourceEnd", 0);
        setField(term774985, term774985.getClass(), "sourceName", null);
        setIntField(term774985, term774985.getClass(), "baseLineno", 0);
        setIntField(term774985, term774985.getClass(), "endLineno", 0);
        setField(term774985, term774985.getClass(), "functions", null);
        setField(term774985, term774985.getClass(), "regexps", null);
        setField(term774985, term774985.getClass(), "itsVariables", null);
        setField(term774985, term774985.getClass(), "itsConst", null);
        setField(term774985, term774985.getClass(), "itsVariableNames", null);
        setIntField(term774985, term774985.getClass(), "varStart", 0);
        setField(term774985, term774985.getClass(), "compilerData", null);
        setIntField(term774985, term774985.getClass(), "type", 0);
        setField(term774985, term774985.getClass(), "next", null);
        setField(term774985, term774985.getClass(), "first", null);
        setField(term774985, term774985.getClass(), "last", null);
        setField(term774985, term774985.getClass(), "propListHead", null);
        setIntField(term774985, term774985.getClass(), "sourcePosition", 0);
        setField(term774985, term774985.getClass(), "jsType", null);
        setField(term774986, term774986.getClass(), "str", null);
        setIntField(term774986, term774986.getClass(), "type", 108);
        setField(term774986, term774986.getClass(), "next", null);
        setField(term774986, term774986.getClass(), "first", null);
        setField(term774986, term774986.getClass(), "last", null);
        setField(term774986, term774986.getClass(), "propListHead", null);
        setIntField(term774986, term774986.getClass(), "sourcePosition", 0);
        setField(term774986, term774986.getClass(), "jsType", null);
        setField(term774986, term774986.getClass(), "parent", null);
        setField(term774985, term774985.getClass(), "parent", term774986);
        term774987 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term774987, term774987.getClass(), "str", null);
        setIntField(term774987, term774987.getClass(), "type", 116);
        setField(term774987, term774987.getClass(), "next", null);
        setField(term774987, term774987.getClass(), "first", null);
        setField(term774987, term774987.getClass(), "last", null);
        setField(term774987, term774987.getClass(), "propListHead", null);
        setIntField(term774987, term774987.getClass(), "sourcePosition", 0);
        setField(term774987, term774987.getClass(), "jsType", null);
        setField(term774987, term774987.getClass(), "parent", null);
        term774988 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term774988, term774988.getClass(), "number", 0.0);
        setIntField(term774988, term774988.getClass(), "type", 63);
        setField(term774988, term774988.getClass(), "next", null);
        setField(term774988, term774988.getClass(), "first", null);
        setField(term774988, term774988.getClass(), "last", null);
        setField(term774988, term774988.getClass(), "propListHead", null);
        setIntField(term774988, term774988.getClass(), "sourcePosition", 0);
        setField(term774988, term774988.getClass(), "jsType", null);
        setField(term774988, term774988.getClass(), "parent", null);
        term774908 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term774919 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term774908, term774908.getClass(), "functionName", null);
        setBooleanField(term774908, term774908.getClass(), "itsNeedsActivation", false);
        setIntField(term774908, term774908.getClass(), "itsFunctionType", 0);
        setBooleanField(term774908, term774908.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term774908, term774908.getClass(), "encodedSourceStart", 0);
        setIntField(term774908, term774908.getClass(), "encodedSourceEnd", 0);
        setField(term774908, term774908.getClass(), "sourceName", null);
        setIntField(term774908, term774908.getClass(), "baseLineno", 0);
        setIntField(term774908, term774908.getClass(), "endLineno", 0);
        setField(term774908, term774908.getClass(), "functions", null);
        setField(term774908, term774908.getClass(), "regexps", null);
        setField(term774908, term774908.getClass(), "itsVariables", null);
        setField(term774908, term774908.getClass(), "itsConst", null);
        setField(term774908, term774908.getClass(), "itsVariableNames", null);
        setIntField(term774908, term774908.getClass(), "varStart", 0);
        setField(term774908, term774908.getClass(), "compilerData", null);
        setIntField(term774908, term774908.getClass(), "type", 0);
        setField(term774908, term774908.getClass(), "next", null);
        setField(term774908, term774908.getClass(), "first", null);
        setField(term774908, term774908.getClass(), "last", null);
        setField(term774908, term774908.getClass(), "propListHead", null);
        setIntField(term774908, term774908.getClass(), "sourcePosition", 0);
        setField(term774908, term774908.getClass(), "jsType", null);
        setField(term774919, term774919.getClass(), "str", null);
        setIntField(term774919, term774919.getClass(), "type", 108);
        setField(term774919, term774919.getClass(), "next", null);
        setField(term774919, term774919.getClass(), "first", null);
        setField(term774919, term774919.getClass(), "last", null);
        setField(term774919, term774919.getClass(), "propListHead", null);
        setIntField(term774919, term774919.getClass(), "sourcePosition", 0);
        setField(term774919, term774919.getClass(), "jsType", null);
        setField(term774919, term774919.getClass(), "parent", null);
        setField(term774908, term774908.getClass(), "parent", term774919);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term774079;
        args[1] = term774263;
        args[2] = term774355;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term773993, args);
        assertTrue(recursiveEquals(term773993, term774984));
        assertTrue(recursiveEquals(term774079, term774985));
        assertTrue(recursiveEquals(term774263, term774987));
        assertTrue(recursiveEquals(term774355, term774988));
        assertTrue(recursiveEquals(retValue, term774908));
    }

};


