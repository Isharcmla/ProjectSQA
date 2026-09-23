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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term365679;
     Object term365765;
     Object term366009;
     Object term366010;
     Object term365955;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term365679 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term365765 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term365857 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term365765, term365765.getClass(), "first", term365765);
        setField(term365765, term365765.getClass(), "next", term365857);
        setIntField(term365765, term365765.getClass(), "type", 14);
        term366009 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term366009, term366009.getClass(), "currentTraversal", null);
        term366010 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term366011 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term366010, term366010.getClass(), "functionName", null);
        setBooleanField(term366010, term366010.getClass(), "itsNeedsActivation", false);
        setIntField(term366010, term366010.getClass(), "itsFunctionType", 0);
        setBooleanField(term366010, term366010.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term366010, term366010.getClass(), "encodedSourceStart", 0);
        setIntField(term366010, term366010.getClass(), "encodedSourceEnd", 0);
        setField(term366010, term366010.getClass(), "sourceName", null);
        setIntField(term366010, term366010.getClass(), "baseLineno", 0);
        setIntField(term366010, term366010.getClass(), "endLineno", 0);
        setField(term366010, term366010.getClass(), "functions", null);
        setField(term366010, term366010.getClass(), "regexps", null);
        setField(term366010, term366010.getClass(), "itsVariables", null);
        setField(term366010, term366010.getClass(), "itsConst", null);
        setField(term366010, term366010.getClass(), "itsVariableNames", null);
        setIntField(term366010, term366010.getClass(), "varStart", 0);
        setField(term366010, term366010.getClass(), "compilerData", null);
        setIntField(term366010, term366010.getClass(), "type", 14);
        setField(term366011, term366011.getClass(), "str", null);
        setIntField(term366011, term366011.getClass(), "type", 0);
        setField(term366011, term366011.getClass(), "next", null);
        setField(term366011, term366011.getClass(), "first", null);
        setField(term366011, term366011.getClass(), "last", null);
        setField(term366011, term366011.getClass(), "propListHead", null);
        setIntField(term366011, term366011.getClass(), "sourcePosition", 0);
        setField(term366011, term366011.getClass(), "jsType", null);
        setField(term366011, term366011.getClass(), "parent", null);
        setField(term366010, term366010.getClass(), "next", term366011);
        setField(term366010, term366010.getClass(), "first", term366010);
        setField(term366010, term366010.getClass(), "last", null);
        setField(term366010, term366010.getClass(), "propListHead", null);
        setIntField(term366010, term366010.getClass(), "sourcePosition", 0);
        setField(term366010, term366010.getClass(), "jsType", null);
        setField(term366010, term366010.getClass(), "parent", null);
        term365955 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term365965 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term365955, term365955.getClass(), "functionName", null);
        setBooleanField(term365955, term365955.getClass(), "itsNeedsActivation", false);
        setIntField(term365955, term365955.getClass(), "itsFunctionType", 0);
        setBooleanField(term365955, term365955.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term365955, term365955.getClass(), "encodedSourceStart", 0);
        setIntField(term365955, term365955.getClass(), "encodedSourceEnd", 0);
        setField(term365955, term365955.getClass(), "sourceName", null);
        setIntField(term365955, term365955.getClass(), "baseLineno", 0);
        setIntField(term365955, term365955.getClass(), "endLineno", 0);
        setField(term365955, term365955.getClass(), "functions", null);
        setField(term365955, term365955.getClass(), "regexps", null);
        setField(term365955, term365955.getClass(), "itsVariables", null);
        setField(term365955, term365955.getClass(), "itsConst", null);
        setField(term365955, term365955.getClass(), "itsVariableNames", null);
        setIntField(term365955, term365955.getClass(), "varStart", 0);
        setField(term365955, term365955.getClass(), "compilerData", null);
        setIntField(term365955, term365955.getClass(), "type", 14);
        setField(term365965, term365965.getClass(), "str", null);
        setIntField(term365965, term365965.getClass(), "type", 0);
        setField(term365965, term365965.getClass(), "next", null);
        setField(term365965, term365965.getClass(), "first", null);
        setField(term365965, term365965.getClass(), "last", null);
        setField(term365965, term365965.getClass(), "propListHead", null);
        setIntField(term365965, term365965.getClass(), "sourcePosition", 0);
        setField(term365965, term365965.getClass(), "jsType", null);
        setField(term365965, term365965.getClass(), "parent", null);
        setField(term365955, term365955.getClass(), "next", term365965);
        setField(term365955, term365955.getClass(), "first", term365955);
        setField(term365955, term365955.getClass(), "last", null);
        setField(term365955, term365955.getClass(), "propListHead", null);
        setIntField(term365955, term365955.getClass(), "sourcePosition", 0);
        setField(term365955, term365955.getClass(), "jsType", null);
        setField(term365955, term365955.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term365765;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term365679, args);
        assertTrue(recursiveEquals(term365679, term366009));
        assertTrue(recursiveEquals(term365765, term366010));
        assertTrue(recursiveEquals(retValue, term365955));
    }

};


