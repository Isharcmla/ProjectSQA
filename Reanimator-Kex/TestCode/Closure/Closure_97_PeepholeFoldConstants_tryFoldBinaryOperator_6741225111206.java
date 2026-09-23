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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term367651;
     Object term367743;
     Object term367957;
     Object term367958;
     Object term367914;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term367651 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term367743 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term367829 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term367899 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term367829, term367829.getClass(), "next", term367899);
        setField(term367743, term367743.getClass(), "first", term367829);
        setIntField(term367743, term367743.getClass(), "type", 22);
        term367957 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term367957, term367957.getClass(), "currentTraversal", null);
        term367958 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term367959 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term367960 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term367958, term367958.getClass(), "str", null);
        setIntField(term367958, term367958.getClass(), "type", 22);
        setField(term367958, term367958.getClass(), "next", null);
        setField(term367959, term367959.getClass(), "functionName", null);
        setBooleanField(term367959, term367959.getClass(), "itsNeedsActivation", false);
        setIntField(term367959, term367959.getClass(), "itsFunctionType", 0);
        setBooleanField(term367959, term367959.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term367959, term367959.getClass(), "encodedSourceStart", 0);
        setIntField(term367959, term367959.getClass(), "encodedSourceEnd", 0);
        setField(term367959, term367959.getClass(), "sourceName", null);
        setIntField(term367959, term367959.getClass(), "baseLineno", 0);
        setIntField(term367959, term367959.getClass(), "endLineno", 0);
        setField(term367959, term367959.getClass(), "functions", null);
        setField(term367959, term367959.getClass(), "regexps", null);
        setField(term367959, term367959.getClass(), "itsVariables", null);
        setField(term367959, term367959.getClass(), "itsConst", null);
        setField(term367959, term367959.getClass(), "itsVariableNames", null);
        setIntField(term367959, term367959.getClass(), "varStart", 0);
        setField(term367959, term367959.getClass(), "compilerData", null);
        setIntField(term367959, term367959.getClass(), "type", 0);
        setIntField(term367960, term367960.getClass(), "type", 0);
        setField(term367960, term367960.getClass(), "next", null);
        setField(term367960, term367960.getClass(), "first", null);
        setField(term367960, term367960.getClass(), "last", null);
        setField(term367960, term367960.getClass(), "propListHead", null);
        setIntField(term367960, term367960.getClass(), "sourcePosition", 0);
        setField(term367960, term367960.getClass(), "jsType", null);
        setField(term367960, term367960.getClass(), "parent", null);
        setField(term367959, term367959.getClass(), "next", term367960);
        setField(term367959, term367959.getClass(), "first", null);
        setField(term367959, term367959.getClass(), "last", null);
        setField(term367959, term367959.getClass(), "propListHead", null);
        setIntField(term367959, term367959.getClass(), "sourcePosition", 0);
        setField(term367959, term367959.getClass(), "jsType", null);
        setField(term367959, term367959.getClass(), "parent", null);
        setField(term367958, term367958.getClass(), "first", term367959);
        setField(term367958, term367958.getClass(), "last", null);
        setField(term367958, term367958.getClass(), "propListHead", null);
        setIntField(term367958, term367958.getClass(), "sourcePosition", 0);
        setField(term367958, term367958.getClass(), "jsType", null);
        setField(term367958, term367958.getClass(), "parent", null);
        term367914 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term367916 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term367926 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term367914, term367914.getClass(), "str", null);
        setIntField(term367914, term367914.getClass(), "type", 22);
        setField(term367914, term367914.getClass(), "next", null);
        setField(term367916, term367916.getClass(), "functionName", null);
        setBooleanField(term367916, term367916.getClass(), "itsNeedsActivation", false);
        setIntField(term367916, term367916.getClass(), "itsFunctionType", 0);
        setBooleanField(term367916, term367916.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term367916, term367916.getClass(), "encodedSourceStart", 0);
        setIntField(term367916, term367916.getClass(), "encodedSourceEnd", 0);
        setField(term367916, term367916.getClass(), "sourceName", null);
        setIntField(term367916, term367916.getClass(), "baseLineno", 0);
        setIntField(term367916, term367916.getClass(), "endLineno", 0);
        setField(term367916, term367916.getClass(), "functions", null);
        setField(term367916, term367916.getClass(), "regexps", null);
        setField(term367916, term367916.getClass(), "itsVariables", null);
        setField(term367916, term367916.getClass(), "itsConst", null);
        setField(term367916, term367916.getClass(), "itsVariableNames", null);
        setIntField(term367916, term367916.getClass(), "varStart", 0);
        setField(term367916, term367916.getClass(), "compilerData", null);
        setIntField(term367916, term367916.getClass(), "type", 0);
        setIntField(term367926, term367926.getClass(), "type", 0);
        setField(term367926, term367926.getClass(), "next", null);
        setField(term367926, term367926.getClass(), "first", null);
        setField(term367926, term367926.getClass(), "last", null);
        setField(term367926, term367926.getClass(), "propListHead", null);
        setIntField(term367926, term367926.getClass(), "sourcePosition", 0);
        setField(term367926, term367926.getClass(), "jsType", null);
        setField(term367926, term367926.getClass(), "parent", null);
        setField(term367916, term367916.getClass(), "next", term367926);
        setField(term367916, term367916.getClass(), "first", null);
        setField(term367916, term367916.getClass(), "last", null);
        setField(term367916, term367916.getClass(), "propListHead", null);
        setIntField(term367916, term367916.getClass(), "sourcePosition", 0);
        setField(term367916, term367916.getClass(), "jsType", null);
        setField(term367916, term367916.getClass(), "parent", null);
        setField(term367914, term367914.getClass(), "first", term367916);
        setField(term367914, term367914.getClass(), "last", null);
        setField(term367914, term367914.getClass(), "propListHead", null);
        setIntField(term367914, term367914.getClass(), "sourcePosition", 0);
        setField(term367914, term367914.getClass(), "jsType", null);
        setField(term367914, term367914.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term367743;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term367651, args);
        assertTrue(recursiveEquals(term367651, term367957));
        assertTrue(recursiveEquals(term367743, term367958));
        assertTrue(recursiveEquals(retValue, term367914));
    }

};


