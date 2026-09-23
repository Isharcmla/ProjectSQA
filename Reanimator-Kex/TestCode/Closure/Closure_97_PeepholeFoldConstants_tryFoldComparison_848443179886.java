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

public class PeepholeFoldConstants_tryFoldComparison_848443179886 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term250640;
     Object term250726;
     Object term250812;
     Object term250904;
     Object term250986;
     Object term250987;
     Object term250988;
     Object term250989;
     Object term250958;

    public PeepholeFoldConstants_tryFoldComparison_848443179886() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term250640 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term250726 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term250726, term250726.getClass(), "type", 14);
        term250812 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term250812, term250812.getClass(), "type", 14);
        term250904 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term250986 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term250986, term250986.getClass(), "currentTraversal", null);
        term250987 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term250987, term250987.getClass(), "functionName", null);
        setBooleanField(term250987, term250987.getClass(), "itsNeedsActivation", false);
        setIntField(term250987, term250987.getClass(), "itsFunctionType", 0);
        setBooleanField(term250987, term250987.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term250987, term250987.getClass(), "encodedSourceStart", 0);
        setIntField(term250987, term250987.getClass(), "encodedSourceEnd", 0);
        setField(term250987, term250987.getClass(), "sourceName", null);
        setIntField(term250987, term250987.getClass(), "baseLineno", 0);
        setIntField(term250987, term250987.getClass(), "endLineno", 0);
        setField(term250987, term250987.getClass(), "functions", null);
        setField(term250987, term250987.getClass(), "regexps", null);
        setField(term250987, term250987.getClass(), "itsVariables", null);
        setField(term250987, term250987.getClass(), "itsConst", null);
        setField(term250987, term250987.getClass(), "itsVariableNames", null);
        setIntField(term250987, term250987.getClass(), "varStart", 0);
        setField(term250987, term250987.getClass(), "compilerData", null);
        setIntField(term250987, term250987.getClass(), "type", 14);
        setField(term250987, term250987.getClass(), "next", null);
        setField(term250987, term250987.getClass(), "first", null);
        setField(term250987, term250987.getClass(), "last", null);
        setField(term250987, term250987.getClass(), "propListHead", null);
        setIntField(term250987, term250987.getClass(), "sourcePosition", 0);
        setField(term250987, term250987.getClass(), "jsType", null);
        setField(term250987, term250987.getClass(), "parent", null);
        term250988 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term250988, term250988.getClass(), "functionName", null);
        setBooleanField(term250988, term250988.getClass(), "itsNeedsActivation", false);
        setIntField(term250988, term250988.getClass(), "itsFunctionType", 0);
        setBooleanField(term250988, term250988.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term250988, term250988.getClass(), "encodedSourceStart", 0);
        setIntField(term250988, term250988.getClass(), "encodedSourceEnd", 0);
        setField(term250988, term250988.getClass(), "sourceName", null);
        setIntField(term250988, term250988.getClass(), "baseLineno", 0);
        setIntField(term250988, term250988.getClass(), "endLineno", 0);
        setField(term250988, term250988.getClass(), "functions", null);
        setField(term250988, term250988.getClass(), "regexps", null);
        setField(term250988, term250988.getClass(), "itsVariables", null);
        setField(term250988, term250988.getClass(), "itsConst", null);
        setField(term250988, term250988.getClass(), "itsVariableNames", null);
        setIntField(term250988, term250988.getClass(), "varStart", 0);
        setField(term250988, term250988.getClass(), "compilerData", null);
        setIntField(term250988, term250988.getClass(), "type", 14);
        setField(term250988, term250988.getClass(), "next", null);
        setField(term250988, term250988.getClass(), "first", null);
        setField(term250988, term250988.getClass(), "last", null);
        setField(term250988, term250988.getClass(), "propListHead", null);
        setIntField(term250988, term250988.getClass(), "sourcePosition", 0);
        setField(term250988, term250988.getClass(), "jsType", null);
        setField(term250988, term250988.getClass(), "parent", null);
        term250989 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term250989, term250989.getClass(), "str", null);
        setIntField(term250989, term250989.getClass(), "type", 0);
        setField(term250989, term250989.getClass(), "next", null);
        setField(term250989, term250989.getClass(), "first", null);
        setField(term250989, term250989.getClass(), "last", null);
        setField(term250989, term250989.getClass(), "propListHead", null);
        setIntField(term250989, term250989.getClass(), "sourcePosition", 0);
        setField(term250989, term250989.getClass(), "jsType", null);
        setField(term250989, term250989.getClass(), "parent", null);
        term250958 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term250958, term250958.getClass(), "functionName", null);
        setBooleanField(term250958, term250958.getClass(), "itsNeedsActivation", false);
        setIntField(term250958, term250958.getClass(), "itsFunctionType", 0);
        setBooleanField(term250958, term250958.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term250958, term250958.getClass(), "encodedSourceStart", 0);
        setIntField(term250958, term250958.getClass(), "encodedSourceEnd", 0);
        setField(term250958, term250958.getClass(), "sourceName", null);
        setIntField(term250958, term250958.getClass(), "baseLineno", 0);
        setIntField(term250958, term250958.getClass(), "endLineno", 0);
        setField(term250958, term250958.getClass(), "functions", null);
        setField(term250958, term250958.getClass(), "regexps", null);
        setField(term250958, term250958.getClass(), "itsVariables", null);
        setField(term250958, term250958.getClass(), "itsConst", null);
        setField(term250958, term250958.getClass(), "itsVariableNames", null);
        setIntField(term250958, term250958.getClass(), "varStart", 0);
        setField(term250958, term250958.getClass(), "compilerData", null);
        setIntField(term250958, term250958.getClass(), "type", 14);
        setField(term250958, term250958.getClass(), "next", null);
        setField(term250958, term250958.getClass(), "first", null);
        setField(term250958, term250958.getClass(), "last", null);
        setField(term250958, term250958.getClass(), "propListHead", null);
        setIntField(term250958, term250958.getClass(), "sourcePosition", 0);
        setField(term250958, term250958.getClass(), "jsType", null);
        setField(term250958, term250958.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term250726;
        args[1] = term250812;
        args[2] = term250904;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term250640, args);
        assertTrue(recursiveEquals(term250640, term250986));
        assertTrue(recursiveEquals(term250726, term250987));
        assertTrue(recursiveEquals(term250812, term250988));
        assertTrue(recursiveEquals(term250904, term250989));
        assertTrue(recursiveEquals(retValue, term250958));
    }

};


