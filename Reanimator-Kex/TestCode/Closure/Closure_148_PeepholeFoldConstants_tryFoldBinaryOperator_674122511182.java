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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34170;
     Object term34256;
     Object term34695;
     Object term34696;
     Object term34630;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34170 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term34256 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term34342 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term34256, term34256.getClass(), "first", term34256);
        setField(term34256, term34256.getClass(), "next", term34342);
        setIntField(term34256, term34256.getClass(), "type", 33);
        term34695 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term34695, term34695.getClass(), "currentTraversal", null);
        term34696 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term34697 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term34696, term34696.getClass(), "functionName", null);
        setBooleanField(term34696, term34696.getClass(), "itsNeedsActivation", false);
        setIntField(term34696, term34696.getClass(), "itsFunctionType", 0);
        setBooleanField(term34696, term34696.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term34696, term34696.getClass(), "encodedSourceStart", 0);
        setIntField(term34696, term34696.getClass(), "encodedSourceEnd", 0);
        setField(term34696, term34696.getClass(), "sourceName", null);
        setIntField(term34696, term34696.getClass(), "baseLineno", 0);
        setIntField(term34696, term34696.getClass(), "endLineno", 0);
        setField(term34696, term34696.getClass(), "functions", null);
        setField(term34696, term34696.getClass(), "regexps", null);
        setField(term34696, term34696.getClass(), "itsVariables", null);
        setField(term34696, term34696.getClass(), "itsConst", null);
        setField(term34696, term34696.getClass(), "itsVariableNames", null);
        setIntField(term34696, term34696.getClass(), "varStart", 0);
        setField(term34696, term34696.getClass(), "compilerData", null);
        setIntField(term34696, term34696.getClass(), "type", 33);
        setField(term34697, term34697.getClass(), "functionName", null);
        setBooleanField(term34697, term34697.getClass(), "itsNeedsActivation", false);
        setIntField(term34697, term34697.getClass(), "itsFunctionType", 0);
        setBooleanField(term34697, term34697.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term34697, term34697.getClass(), "encodedSourceStart", 0);
        setIntField(term34697, term34697.getClass(), "encodedSourceEnd", 0);
        setField(term34697, term34697.getClass(), "sourceName", null);
        setIntField(term34697, term34697.getClass(), "baseLineno", 0);
        setIntField(term34697, term34697.getClass(), "endLineno", 0);
        setField(term34697, term34697.getClass(), "functions", null);
        setField(term34697, term34697.getClass(), "regexps", null);
        setField(term34697, term34697.getClass(), "itsVariables", null);
        setField(term34697, term34697.getClass(), "itsConst", null);
        setField(term34697, term34697.getClass(), "itsVariableNames", null);
        setIntField(term34697, term34697.getClass(), "varStart", 0);
        setField(term34697, term34697.getClass(), "compilerData", null);
        setIntField(term34697, term34697.getClass(), "type", 0);
        setField(term34697, term34697.getClass(), "next", null);
        setField(term34697, term34697.getClass(), "first", null);
        setField(term34697, term34697.getClass(), "last", null);
        setField(term34697, term34697.getClass(), "propListHead", null);
        setIntField(term34697, term34697.getClass(), "sourcePosition", 0);
        setField(term34697, term34697.getClass(), "jsType", null);
        setField(term34697, term34697.getClass(), "parent", null);
        setField(term34696, term34696.getClass(), "next", term34697);
        setField(term34696, term34696.getClass(), "first", term34696);
        setField(term34696, term34696.getClass(), "last", null);
        setField(term34696, term34696.getClass(), "propListHead", null);
        setIntField(term34696, term34696.getClass(), "sourcePosition", 0);
        setField(term34696, term34696.getClass(), "jsType", null);
        setField(term34696, term34696.getClass(), "parent", null);
        term34630 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term34640 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term34630, term34630.getClass(), "functionName", null);
        setBooleanField(term34630, term34630.getClass(), "itsNeedsActivation", false);
        setIntField(term34630, term34630.getClass(), "itsFunctionType", 0);
        setBooleanField(term34630, term34630.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term34630, term34630.getClass(), "encodedSourceStart", 0);
        setIntField(term34630, term34630.getClass(), "encodedSourceEnd", 0);
        setField(term34630, term34630.getClass(), "sourceName", null);
        setIntField(term34630, term34630.getClass(), "baseLineno", 0);
        setIntField(term34630, term34630.getClass(), "endLineno", 0);
        setField(term34630, term34630.getClass(), "functions", null);
        setField(term34630, term34630.getClass(), "regexps", null);
        setField(term34630, term34630.getClass(), "itsVariables", null);
        setField(term34630, term34630.getClass(), "itsConst", null);
        setField(term34630, term34630.getClass(), "itsVariableNames", null);
        setIntField(term34630, term34630.getClass(), "varStart", 0);
        setField(term34630, term34630.getClass(), "compilerData", null);
        setIntField(term34630, term34630.getClass(), "type", 33);
        setField(term34640, term34640.getClass(), "functionName", null);
        setBooleanField(term34640, term34640.getClass(), "itsNeedsActivation", false);
        setIntField(term34640, term34640.getClass(), "itsFunctionType", 0);
        setBooleanField(term34640, term34640.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term34640, term34640.getClass(), "encodedSourceStart", 0);
        setIntField(term34640, term34640.getClass(), "encodedSourceEnd", 0);
        setField(term34640, term34640.getClass(), "sourceName", null);
        setIntField(term34640, term34640.getClass(), "baseLineno", 0);
        setIntField(term34640, term34640.getClass(), "endLineno", 0);
        setField(term34640, term34640.getClass(), "functions", null);
        setField(term34640, term34640.getClass(), "regexps", null);
        setField(term34640, term34640.getClass(), "itsVariables", null);
        setField(term34640, term34640.getClass(), "itsConst", null);
        setField(term34640, term34640.getClass(), "itsVariableNames", null);
        setIntField(term34640, term34640.getClass(), "varStart", 0);
        setField(term34640, term34640.getClass(), "compilerData", null);
        setIntField(term34640, term34640.getClass(), "type", 0);
        setField(term34640, term34640.getClass(), "next", null);
        setField(term34640, term34640.getClass(), "first", null);
        setField(term34640, term34640.getClass(), "last", null);
        setField(term34640, term34640.getClass(), "propListHead", null);
        setIntField(term34640, term34640.getClass(), "sourcePosition", 0);
        setField(term34640, term34640.getClass(), "jsType", null);
        setField(term34640, term34640.getClass(), "parent", null);
        setField(term34630, term34630.getClass(), "next", term34640);
        setField(term34630, term34630.getClass(), "first", term34630);
        setField(term34630, term34630.getClass(), "last", null);
        setField(term34630, term34630.getClass(), "propListHead", null);
        setIntField(term34630, term34630.getClass(), "sourcePosition", 0);
        setField(term34630, term34630.getClass(), "jsType", null);
        setField(term34630, term34630.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term34256;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term34170, args);
        assertTrue(recursiveEquals(term34170, term34695));
        assertTrue(recursiveEquals(term34256, term34696));
        assertTrue(recursiveEquals(retValue, term34630));
    }

};


