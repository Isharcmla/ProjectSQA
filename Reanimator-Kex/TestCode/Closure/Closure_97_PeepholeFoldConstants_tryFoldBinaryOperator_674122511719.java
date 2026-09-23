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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184026;
     Object term184112;
     Object term184747;
     Object term184748;
     Object term184681;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term184026 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term184112 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term184198 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term184268 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term184198, term184198.getClass(), "next", term184268);
        setField(term184112, term184112.getClass(), "first", term184198);
        setIntField(term184112, term184112.getClass(), "type", 45);
        term184747 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term184747, term184747.getClass(), "currentTraversal", null);
        term184748 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term184749 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term184750 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term184748, term184748.getClass(), "functionName", null);
        setBooleanField(term184748, term184748.getClass(), "itsNeedsActivation", false);
        setIntField(term184748, term184748.getClass(), "itsFunctionType", 0);
        setBooleanField(term184748, term184748.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term184748, term184748.getClass(), "encodedSourceStart", 0);
        setIntField(term184748, term184748.getClass(), "encodedSourceEnd", 0);
        setField(term184748, term184748.getClass(), "sourceName", null);
        setIntField(term184748, term184748.getClass(), "baseLineno", 0);
        setIntField(term184748, term184748.getClass(), "endLineno", 0);
        setField(term184748, term184748.getClass(), "functions", null);
        setField(term184748, term184748.getClass(), "regexps", null);
        setField(term184748, term184748.getClass(), "itsVariables", null);
        setField(term184748, term184748.getClass(), "itsConst", null);
        setField(term184748, term184748.getClass(), "itsVariableNames", null);
        setIntField(term184748, term184748.getClass(), "varStart", 0);
        setField(term184748, term184748.getClass(), "compilerData", null);
        setIntField(term184748, term184748.getClass(), "type", 45);
        setField(term184748, term184748.getClass(), "next", null);
        setField(term184749, term184749.getClass(), "functionName", null);
        setBooleanField(term184749, term184749.getClass(), "itsNeedsActivation", false);
        setIntField(term184749, term184749.getClass(), "itsFunctionType", 0);
        setBooleanField(term184749, term184749.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term184749, term184749.getClass(), "encodedSourceStart", 0);
        setIntField(term184749, term184749.getClass(), "encodedSourceEnd", 0);
        setField(term184749, term184749.getClass(), "sourceName", null);
        setIntField(term184749, term184749.getClass(), "baseLineno", 0);
        setIntField(term184749, term184749.getClass(), "endLineno", 0);
        setField(term184749, term184749.getClass(), "functions", null);
        setField(term184749, term184749.getClass(), "regexps", null);
        setField(term184749, term184749.getClass(), "itsVariables", null);
        setField(term184749, term184749.getClass(), "itsConst", null);
        setField(term184749, term184749.getClass(), "itsVariableNames", null);
        setIntField(term184749, term184749.getClass(), "varStart", 0);
        setField(term184749, term184749.getClass(), "compilerData", null);
        setIntField(term184749, term184749.getClass(), "type", 0);
        setIntField(term184750, term184750.getClass(), "type", 0);
        setField(term184750, term184750.getClass(), "next", null);
        setField(term184750, term184750.getClass(), "first", null);
        setField(term184750, term184750.getClass(), "last", null);
        setField(term184750, term184750.getClass(), "propListHead", null);
        setIntField(term184750, term184750.getClass(), "sourcePosition", 0);
        setField(term184750, term184750.getClass(), "jsType", null);
        setField(term184750, term184750.getClass(), "parent", null);
        setField(term184749, term184749.getClass(), "next", term184750);
        setField(term184749, term184749.getClass(), "first", null);
        setField(term184749, term184749.getClass(), "last", null);
        setField(term184749, term184749.getClass(), "propListHead", null);
        setIntField(term184749, term184749.getClass(), "sourcePosition", 0);
        setField(term184749, term184749.getClass(), "jsType", null);
        setField(term184749, term184749.getClass(), "parent", null);
        setField(term184748, term184748.getClass(), "first", term184749);
        setField(term184748, term184748.getClass(), "last", null);
        setField(term184748, term184748.getClass(), "propListHead", null);
        setIntField(term184748, term184748.getClass(), "sourcePosition", 0);
        setField(term184748, term184748.getClass(), "jsType", null);
        setField(term184748, term184748.getClass(), "parent", null);
        term184681 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term184691 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term184701 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term184681, term184681.getClass(), "functionName", null);
        setBooleanField(term184681, term184681.getClass(), "itsNeedsActivation", false);
        setIntField(term184681, term184681.getClass(), "itsFunctionType", 0);
        setBooleanField(term184681, term184681.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term184681, term184681.getClass(), "encodedSourceStart", 0);
        setIntField(term184681, term184681.getClass(), "encodedSourceEnd", 0);
        setField(term184681, term184681.getClass(), "sourceName", null);
        setIntField(term184681, term184681.getClass(), "baseLineno", 0);
        setIntField(term184681, term184681.getClass(), "endLineno", 0);
        setField(term184681, term184681.getClass(), "functions", null);
        setField(term184681, term184681.getClass(), "regexps", null);
        setField(term184681, term184681.getClass(), "itsVariables", null);
        setField(term184681, term184681.getClass(), "itsConst", null);
        setField(term184681, term184681.getClass(), "itsVariableNames", null);
        setIntField(term184681, term184681.getClass(), "varStart", 0);
        setField(term184681, term184681.getClass(), "compilerData", null);
        setIntField(term184681, term184681.getClass(), "type", 45);
        setField(term184681, term184681.getClass(), "next", null);
        setField(term184691, term184691.getClass(), "functionName", null);
        setBooleanField(term184691, term184691.getClass(), "itsNeedsActivation", false);
        setIntField(term184691, term184691.getClass(), "itsFunctionType", 0);
        setBooleanField(term184691, term184691.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term184691, term184691.getClass(), "encodedSourceStart", 0);
        setIntField(term184691, term184691.getClass(), "encodedSourceEnd", 0);
        setField(term184691, term184691.getClass(), "sourceName", null);
        setIntField(term184691, term184691.getClass(), "baseLineno", 0);
        setIntField(term184691, term184691.getClass(), "endLineno", 0);
        setField(term184691, term184691.getClass(), "functions", null);
        setField(term184691, term184691.getClass(), "regexps", null);
        setField(term184691, term184691.getClass(), "itsVariables", null);
        setField(term184691, term184691.getClass(), "itsConst", null);
        setField(term184691, term184691.getClass(), "itsVariableNames", null);
        setIntField(term184691, term184691.getClass(), "varStart", 0);
        setField(term184691, term184691.getClass(), "compilerData", null);
        setIntField(term184691, term184691.getClass(), "type", 0);
        setIntField(term184701, term184701.getClass(), "type", 0);
        setField(term184701, term184701.getClass(), "next", null);
        setField(term184701, term184701.getClass(), "first", null);
        setField(term184701, term184701.getClass(), "last", null);
        setField(term184701, term184701.getClass(), "propListHead", null);
        setIntField(term184701, term184701.getClass(), "sourcePosition", 0);
        setField(term184701, term184701.getClass(), "jsType", null);
        setField(term184701, term184701.getClass(), "parent", null);
        setField(term184691, term184691.getClass(), "next", term184701);
        setField(term184691, term184691.getClass(), "first", null);
        setField(term184691, term184691.getClass(), "last", null);
        setField(term184691, term184691.getClass(), "propListHead", null);
        setIntField(term184691, term184691.getClass(), "sourcePosition", 0);
        setField(term184691, term184691.getClass(), "jsType", null);
        setField(term184691, term184691.getClass(), "parent", null);
        setField(term184681, term184681.getClass(), "first", term184691);
        setField(term184681, term184681.getClass(), "last", null);
        setField(term184681, term184681.getClass(), "propListHead", null);
        setIntField(term184681, term184681.getClass(), "sourcePosition", 0);
        setField(term184681, term184681.getClass(), "jsType", null);
        setField(term184681, term184681.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term184112;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term184026, args);
        assertTrue(recursiveEquals(term184026, term184747));
        assertTrue(recursiveEquals(term184112, term184748));
        assertTrue(recursiveEquals(retValue, term184681));
    }

};


