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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term585434;
     Object term585520;
     Object term585763;
     Object term585764;
     Object term585697;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term585434 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term585520 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term585606 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term585676 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term585606, term585606.getClass(), "next", term585676);
        setField(term585520, term585520.getClass(), "first", term585606);
        setIntField(term585520, term585520.getClass(), "type", 52);
        term585763 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term585763, term585763.getClass(), "currentTraversal", null);
        term585764 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term585765 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term585766 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term585764, term585764.getClass(), "functionName", null);
        setBooleanField(term585764, term585764.getClass(), "itsNeedsActivation", false);
        setIntField(term585764, term585764.getClass(), "itsFunctionType", 0);
        setBooleanField(term585764, term585764.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term585764, term585764.getClass(), "encodedSourceStart", 0);
        setIntField(term585764, term585764.getClass(), "encodedSourceEnd", 0);
        setField(term585764, term585764.getClass(), "sourceName", null);
        setIntField(term585764, term585764.getClass(), "baseLineno", 0);
        setIntField(term585764, term585764.getClass(), "endLineno", 0);
        setField(term585764, term585764.getClass(), "functions", null);
        setField(term585764, term585764.getClass(), "regexps", null);
        setField(term585764, term585764.getClass(), "itsVariables", null);
        setField(term585764, term585764.getClass(), "itsConst", null);
        setField(term585764, term585764.getClass(), "itsVariableNames", null);
        setIntField(term585764, term585764.getClass(), "varStart", 0);
        setField(term585764, term585764.getClass(), "compilerData", null);
        setIntField(term585764, term585764.getClass(), "type", 52);
        setField(term585764, term585764.getClass(), "next", null);
        setField(term585765, term585765.getClass(), "functionName", null);
        setBooleanField(term585765, term585765.getClass(), "itsNeedsActivation", false);
        setIntField(term585765, term585765.getClass(), "itsFunctionType", 0);
        setBooleanField(term585765, term585765.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term585765, term585765.getClass(), "encodedSourceStart", 0);
        setIntField(term585765, term585765.getClass(), "encodedSourceEnd", 0);
        setField(term585765, term585765.getClass(), "sourceName", null);
        setIntField(term585765, term585765.getClass(), "baseLineno", 0);
        setIntField(term585765, term585765.getClass(), "endLineno", 0);
        setField(term585765, term585765.getClass(), "functions", null);
        setField(term585765, term585765.getClass(), "regexps", null);
        setField(term585765, term585765.getClass(), "itsVariables", null);
        setField(term585765, term585765.getClass(), "itsConst", null);
        setField(term585765, term585765.getClass(), "itsVariableNames", null);
        setIntField(term585765, term585765.getClass(), "varStart", 0);
        setField(term585765, term585765.getClass(), "compilerData", null);
        setIntField(term585765, term585765.getClass(), "type", 0);
        setIntField(term585766, term585766.getClass(), "type", 0);
        setField(term585766, term585766.getClass(), "next", null);
        setField(term585766, term585766.getClass(), "first", null);
        setField(term585766, term585766.getClass(), "last", null);
        setField(term585766, term585766.getClass(), "propListHead", null);
        setIntField(term585766, term585766.getClass(), "sourcePosition", 0);
        setField(term585766, term585766.getClass(), "jsType", null);
        setField(term585766, term585766.getClass(), "parent", null);
        setField(term585765, term585765.getClass(), "next", term585766);
        setField(term585765, term585765.getClass(), "first", null);
        setField(term585765, term585765.getClass(), "last", null);
        setField(term585765, term585765.getClass(), "propListHead", null);
        setIntField(term585765, term585765.getClass(), "sourcePosition", 0);
        setField(term585765, term585765.getClass(), "jsType", null);
        setField(term585765, term585765.getClass(), "parent", null);
        setField(term585764, term585764.getClass(), "first", term585765);
        setField(term585764, term585764.getClass(), "last", null);
        setField(term585764, term585764.getClass(), "propListHead", null);
        setIntField(term585764, term585764.getClass(), "sourcePosition", 0);
        setField(term585764, term585764.getClass(), "jsType", null);
        setField(term585764, term585764.getClass(), "parent", null);
        term585697 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term585707 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term585717 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term585697, term585697.getClass(), "functionName", null);
        setBooleanField(term585697, term585697.getClass(), "itsNeedsActivation", false);
        setIntField(term585697, term585697.getClass(), "itsFunctionType", 0);
        setBooleanField(term585697, term585697.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term585697, term585697.getClass(), "encodedSourceStart", 0);
        setIntField(term585697, term585697.getClass(), "encodedSourceEnd", 0);
        setField(term585697, term585697.getClass(), "sourceName", null);
        setIntField(term585697, term585697.getClass(), "baseLineno", 0);
        setIntField(term585697, term585697.getClass(), "endLineno", 0);
        setField(term585697, term585697.getClass(), "functions", null);
        setField(term585697, term585697.getClass(), "regexps", null);
        setField(term585697, term585697.getClass(), "itsVariables", null);
        setField(term585697, term585697.getClass(), "itsConst", null);
        setField(term585697, term585697.getClass(), "itsVariableNames", null);
        setIntField(term585697, term585697.getClass(), "varStart", 0);
        setField(term585697, term585697.getClass(), "compilerData", null);
        setIntField(term585697, term585697.getClass(), "type", 52);
        setField(term585697, term585697.getClass(), "next", null);
        setField(term585707, term585707.getClass(), "functionName", null);
        setBooleanField(term585707, term585707.getClass(), "itsNeedsActivation", false);
        setIntField(term585707, term585707.getClass(), "itsFunctionType", 0);
        setBooleanField(term585707, term585707.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term585707, term585707.getClass(), "encodedSourceStart", 0);
        setIntField(term585707, term585707.getClass(), "encodedSourceEnd", 0);
        setField(term585707, term585707.getClass(), "sourceName", null);
        setIntField(term585707, term585707.getClass(), "baseLineno", 0);
        setIntField(term585707, term585707.getClass(), "endLineno", 0);
        setField(term585707, term585707.getClass(), "functions", null);
        setField(term585707, term585707.getClass(), "regexps", null);
        setField(term585707, term585707.getClass(), "itsVariables", null);
        setField(term585707, term585707.getClass(), "itsConst", null);
        setField(term585707, term585707.getClass(), "itsVariableNames", null);
        setIntField(term585707, term585707.getClass(), "varStart", 0);
        setField(term585707, term585707.getClass(), "compilerData", null);
        setIntField(term585707, term585707.getClass(), "type", 0);
        setIntField(term585717, term585717.getClass(), "type", 0);
        setField(term585717, term585717.getClass(), "next", null);
        setField(term585717, term585717.getClass(), "first", null);
        setField(term585717, term585717.getClass(), "last", null);
        setField(term585717, term585717.getClass(), "propListHead", null);
        setIntField(term585717, term585717.getClass(), "sourcePosition", 0);
        setField(term585717, term585717.getClass(), "jsType", null);
        setField(term585717, term585717.getClass(), "parent", null);
        setField(term585707, term585707.getClass(), "next", term585717);
        setField(term585707, term585707.getClass(), "first", null);
        setField(term585707, term585707.getClass(), "last", null);
        setField(term585707, term585707.getClass(), "propListHead", null);
        setIntField(term585707, term585707.getClass(), "sourcePosition", 0);
        setField(term585707, term585707.getClass(), "jsType", null);
        setField(term585707, term585707.getClass(), "parent", null);
        setField(term585697, term585697.getClass(), "first", term585707);
        setField(term585697, term585697.getClass(), "last", null);
        setField(term585697, term585697.getClass(), "propListHead", null);
        setIntField(term585697, term585697.getClass(), "sourcePosition", 0);
        setField(term585697, term585697.getClass(), "jsType", null);
        setField(term585697, term585697.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term585520;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term585434, args);
        assertTrue(recursiveEquals(term585434, term585763));
        assertTrue(recursiveEquals(term585520, term585764));
        assertTrue(recursiveEquals(retValue, term585697));
    }

};


