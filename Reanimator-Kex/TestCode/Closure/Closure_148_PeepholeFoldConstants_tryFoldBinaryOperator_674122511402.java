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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511402 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81510;
     Object term81596;
     Object term81722;
     Object term81723;
     Object term81681;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511402() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81510 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term81596 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term81666 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term81596, term81596.getClass(), "first", term81596);
        setField(term81596, term81596.getClass(), "next", term81666);
        setIntField(term81596, term81596.getClass(), "type", 35);
        term81722 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term81722, term81722.getClass(), "currentTraversal", null);
        term81723 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term81724 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term81723, term81723.getClass(), "functionName", null);
        setBooleanField(term81723, term81723.getClass(), "itsNeedsActivation", false);
        setIntField(term81723, term81723.getClass(), "itsFunctionType", 0);
        setBooleanField(term81723, term81723.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term81723, term81723.getClass(), "encodedSourceStart", 0);
        setIntField(term81723, term81723.getClass(), "encodedSourceEnd", 0);
        setField(term81723, term81723.getClass(), "sourceName", null);
        setIntField(term81723, term81723.getClass(), "baseLineno", 0);
        setIntField(term81723, term81723.getClass(), "endLineno", 0);
        setField(term81723, term81723.getClass(), "functions", null);
        setField(term81723, term81723.getClass(), "regexps", null);
        setField(term81723, term81723.getClass(), "itsVariables", null);
        setField(term81723, term81723.getClass(), "itsConst", null);
        setField(term81723, term81723.getClass(), "itsVariableNames", null);
        setIntField(term81723, term81723.getClass(), "varStart", 0);
        setField(term81723, term81723.getClass(), "compilerData", null);
        setIntField(term81723, term81723.getClass(), "type", 35);
        setIntField(term81724, term81724.getClass(), "type", 0);
        setField(term81724, term81724.getClass(), "next", null);
        setField(term81724, term81724.getClass(), "first", null);
        setField(term81724, term81724.getClass(), "last", null);
        setField(term81724, term81724.getClass(), "propListHead", null);
        setIntField(term81724, term81724.getClass(), "sourcePosition", 0);
        setField(term81724, term81724.getClass(), "jsType", null);
        setField(term81724, term81724.getClass(), "parent", null);
        setField(term81723, term81723.getClass(), "next", term81724);
        setField(term81723, term81723.getClass(), "first", term81723);
        setField(term81723, term81723.getClass(), "last", null);
        setField(term81723, term81723.getClass(), "propListHead", null);
        setIntField(term81723, term81723.getClass(), "sourcePosition", 0);
        setField(term81723, term81723.getClass(), "jsType", null);
        setField(term81723, term81723.getClass(), "parent", null);
        term81681 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term81691 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term81681, term81681.getClass(), "functionName", null);
        setBooleanField(term81681, term81681.getClass(), "itsNeedsActivation", false);
        setIntField(term81681, term81681.getClass(), "itsFunctionType", 0);
        setBooleanField(term81681, term81681.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term81681, term81681.getClass(), "encodedSourceStart", 0);
        setIntField(term81681, term81681.getClass(), "encodedSourceEnd", 0);
        setField(term81681, term81681.getClass(), "sourceName", null);
        setIntField(term81681, term81681.getClass(), "baseLineno", 0);
        setIntField(term81681, term81681.getClass(), "endLineno", 0);
        setField(term81681, term81681.getClass(), "functions", null);
        setField(term81681, term81681.getClass(), "regexps", null);
        setField(term81681, term81681.getClass(), "itsVariables", null);
        setField(term81681, term81681.getClass(), "itsConst", null);
        setField(term81681, term81681.getClass(), "itsVariableNames", null);
        setIntField(term81681, term81681.getClass(), "varStart", 0);
        setField(term81681, term81681.getClass(), "compilerData", null);
        setIntField(term81681, term81681.getClass(), "type", 35);
        setIntField(term81691, term81691.getClass(), "type", 0);
        setField(term81691, term81691.getClass(), "next", null);
        setField(term81691, term81691.getClass(), "first", null);
        setField(term81691, term81691.getClass(), "last", null);
        setField(term81691, term81691.getClass(), "propListHead", null);
        setIntField(term81691, term81691.getClass(), "sourcePosition", 0);
        setField(term81691, term81691.getClass(), "jsType", null);
        setField(term81691, term81691.getClass(), "parent", null);
        setField(term81681, term81681.getClass(), "next", term81691);
        setField(term81681, term81681.getClass(), "first", term81681);
        setField(term81681, term81681.getClass(), "last", null);
        setField(term81681, term81681.getClass(), "propListHead", null);
        setIntField(term81681, term81681.getClass(), "sourcePosition", 0);
        setField(term81681, term81681.getClass(), "jsType", null);
        setField(term81681, term81681.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term81596;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term81510, args);
        assertTrue(recursiveEquals(term81510, term81722));
        assertTrue(recursiveEquals(term81596, term81723));
        assertTrue(recursiveEquals(retValue, term81681));
    }

};


