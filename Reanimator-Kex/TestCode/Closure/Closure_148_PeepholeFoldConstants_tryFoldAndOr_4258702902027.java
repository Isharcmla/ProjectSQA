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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term544153;
     Object term544239;
     Object term544417;
     Object term544509;
     Object term545054;
     Object term545055;
     Object term545057;
     Object term545058;
     Object term544960;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term544153 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term544239 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term544325 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term544325, term544325.getClass(), "type", 113);
        setField(term544239, term544239.getClass(), "parent", term544325);
        setIntField(term544239, term544239.getClass(), "type", 113);
        term544417 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term544417, term544417.getClass(), "type", 0);
        term544509 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term544509, term544509.getClass(), "type", 63);
        term545054 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term545054, term545054.getClass(), "currentTraversal", null);
        term545055 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term545056 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term545055, term545055.getClass(), "functionName", null);
        setBooleanField(term545055, term545055.getClass(), "itsNeedsActivation", false);
        setIntField(term545055, term545055.getClass(), "itsFunctionType", 0);
        setBooleanField(term545055, term545055.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term545055, term545055.getClass(), "encodedSourceStart", 0);
        setIntField(term545055, term545055.getClass(), "encodedSourceEnd", 0);
        setField(term545055, term545055.getClass(), "sourceName", null);
        setIntField(term545055, term545055.getClass(), "baseLineno", 0);
        setIntField(term545055, term545055.getClass(), "endLineno", 0);
        setField(term545055, term545055.getClass(), "functions", null);
        setField(term545055, term545055.getClass(), "regexps", null);
        setField(term545055, term545055.getClass(), "itsVariables", null);
        setField(term545055, term545055.getClass(), "itsConst", null);
        setField(term545055, term545055.getClass(), "itsVariableNames", null);
        setIntField(term545055, term545055.getClass(), "varStart", 0);
        setField(term545055, term545055.getClass(), "compilerData", null);
        setIntField(term545055, term545055.getClass(), "type", 113);
        setField(term545055, term545055.getClass(), "next", null);
        setField(term545055, term545055.getClass(), "first", null);
        setField(term545055, term545055.getClass(), "last", null);
        setField(term545055, term545055.getClass(), "propListHead", null);
        setIntField(term545055, term545055.getClass(), "sourcePosition", 0);
        setField(term545055, term545055.getClass(), "jsType", null);
        setField(term545056, term545056.getClass(), "functionName", null);
        setBooleanField(term545056, term545056.getClass(), "itsNeedsActivation", false);
        setIntField(term545056, term545056.getClass(), "itsFunctionType", 0);
        setBooleanField(term545056, term545056.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term545056, term545056.getClass(), "encodedSourceStart", 0);
        setIntField(term545056, term545056.getClass(), "encodedSourceEnd", 0);
        setField(term545056, term545056.getClass(), "sourceName", null);
        setIntField(term545056, term545056.getClass(), "baseLineno", 0);
        setIntField(term545056, term545056.getClass(), "endLineno", 0);
        setField(term545056, term545056.getClass(), "functions", null);
        setField(term545056, term545056.getClass(), "regexps", null);
        setField(term545056, term545056.getClass(), "itsVariables", null);
        setField(term545056, term545056.getClass(), "itsConst", null);
        setField(term545056, term545056.getClass(), "itsVariableNames", null);
        setIntField(term545056, term545056.getClass(), "varStart", 0);
        setField(term545056, term545056.getClass(), "compilerData", null);
        setIntField(term545056, term545056.getClass(), "type", 113);
        setField(term545056, term545056.getClass(), "next", null);
        setField(term545056, term545056.getClass(), "first", null);
        setField(term545056, term545056.getClass(), "last", null);
        setField(term545056, term545056.getClass(), "propListHead", null);
        setIntField(term545056, term545056.getClass(), "sourcePosition", 0);
        setField(term545056, term545056.getClass(), "jsType", null);
        setField(term545056, term545056.getClass(), "parent", null);
        setField(term545055, term545055.getClass(), "parent", term545056);
        term545057 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term545057, term545057.getClass(), "number", 0.0);
        setIntField(term545057, term545057.getClass(), "type", 0);
        setField(term545057, term545057.getClass(), "next", null);
        setField(term545057, term545057.getClass(), "first", null);
        setField(term545057, term545057.getClass(), "last", null);
        setField(term545057, term545057.getClass(), "propListHead", null);
        setIntField(term545057, term545057.getClass(), "sourcePosition", 0);
        setField(term545057, term545057.getClass(), "jsType", null);
        setField(term545057, term545057.getClass(), "parent", null);
        term545058 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term545058, term545058.getClass(), "number", 0.0);
        setIntField(term545058, term545058.getClass(), "type", 63);
        setField(term545058, term545058.getClass(), "next", null);
        setField(term545058, term545058.getClass(), "first", null);
        setField(term545058, term545058.getClass(), "last", null);
        setField(term545058, term545058.getClass(), "propListHead", null);
        setIntField(term545058, term545058.getClass(), "sourcePosition", 0);
        setField(term545058, term545058.getClass(), "jsType", null);
        setField(term545058, term545058.getClass(), "parent", null);
        term544960 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term544971 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term544960, term544960.getClass(), "functionName", null);
        setBooleanField(term544960, term544960.getClass(), "itsNeedsActivation", false);
        setIntField(term544960, term544960.getClass(), "itsFunctionType", 0);
        setBooleanField(term544960, term544960.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term544960, term544960.getClass(), "encodedSourceStart", 0);
        setIntField(term544960, term544960.getClass(), "encodedSourceEnd", 0);
        setField(term544960, term544960.getClass(), "sourceName", null);
        setIntField(term544960, term544960.getClass(), "baseLineno", 0);
        setIntField(term544960, term544960.getClass(), "endLineno", 0);
        setField(term544960, term544960.getClass(), "functions", null);
        setField(term544960, term544960.getClass(), "regexps", null);
        setField(term544960, term544960.getClass(), "itsVariables", null);
        setField(term544960, term544960.getClass(), "itsConst", null);
        setField(term544960, term544960.getClass(), "itsVariableNames", null);
        setIntField(term544960, term544960.getClass(), "varStart", 0);
        setField(term544960, term544960.getClass(), "compilerData", null);
        setIntField(term544960, term544960.getClass(), "type", 113);
        setField(term544960, term544960.getClass(), "next", null);
        setField(term544960, term544960.getClass(), "first", null);
        setField(term544960, term544960.getClass(), "last", null);
        setField(term544960, term544960.getClass(), "propListHead", null);
        setIntField(term544960, term544960.getClass(), "sourcePosition", 0);
        setField(term544960, term544960.getClass(), "jsType", null);
        setField(term544971, term544971.getClass(), "functionName", null);
        setBooleanField(term544971, term544971.getClass(), "itsNeedsActivation", false);
        setIntField(term544971, term544971.getClass(), "itsFunctionType", 0);
        setBooleanField(term544971, term544971.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term544971, term544971.getClass(), "encodedSourceStart", 0);
        setIntField(term544971, term544971.getClass(), "encodedSourceEnd", 0);
        setField(term544971, term544971.getClass(), "sourceName", null);
        setIntField(term544971, term544971.getClass(), "baseLineno", 0);
        setIntField(term544971, term544971.getClass(), "endLineno", 0);
        setField(term544971, term544971.getClass(), "functions", null);
        setField(term544971, term544971.getClass(), "regexps", null);
        setField(term544971, term544971.getClass(), "itsVariables", null);
        setField(term544971, term544971.getClass(), "itsConst", null);
        setField(term544971, term544971.getClass(), "itsVariableNames", null);
        setIntField(term544971, term544971.getClass(), "varStart", 0);
        setField(term544971, term544971.getClass(), "compilerData", null);
        setIntField(term544971, term544971.getClass(), "type", 113);
        setField(term544971, term544971.getClass(), "next", null);
        setField(term544971, term544971.getClass(), "first", null);
        setField(term544971, term544971.getClass(), "last", null);
        setField(term544971, term544971.getClass(), "propListHead", null);
        setIntField(term544971, term544971.getClass(), "sourcePosition", 0);
        setField(term544971, term544971.getClass(), "jsType", null);
        setField(term544971, term544971.getClass(), "parent", null);
        setField(term544960, term544960.getClass(), "parent", term544971);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term544239;
        args[1] = term544417;
        args[2] = term544509;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term544153, args);
        assertTrue(recursiveEquals(term544153, term545054));
        assertTrue(recursiveEquals(term544239, term545055));
        assertTrue(recursiveEquals(term544417, term545057));
        assertTrue(recursiveEquals(term544509, term545058));
        assertTrue(recursiveEquals(retValue, term544960));
    }

};


