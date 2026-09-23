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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82282;
     Object term82368;
     Object term82555;
     Object term82556;
     Object term82477;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82282 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term82368 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term82454 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term82368, term82368.getClass(), "first", term82368);
        setField(term82368, term82368.getClass(), "next", term82454);
        setIntField(term82368, term82368.getClass(), "type", 14);
        term82555 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term82555, term82555.getClass(), "currentTraversal", null);
        term82556 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term82557 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term82556, term82556.getClass(), "functionName", null);
        setBooleanField(term82556, term82556.getClass(), "itsNeedsActivation", false);
        setIntField(term82556, term82556.getClass(), "itsFunctionType", 0);
        setBooleanField(term82556, term82556.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term82556, term82556.getClass(), "encodedSourceStart", 0);
        setIntField(term82556, term82556.getClass(), "encodedSourceEnd", 0);
        setField(term82556, term82556.getClass(), "sourceName", null);
        setIntField(term82556, term82556.getClass(), "baseLineno", 0);
        setIntField(term82556, term82556.getClass(), "endLineno", 0);
        setField(term82556, term82556.getClass(), "functions", null);
        setField(term82556, term82556.getClass(), "regexps", null);
        setField(term82556, term82556.getClass(), "itsVariables", null);
        setField(term82556, term82556.getClass(), "itsConst", null);
        setField(term82556, term82556.getClass(), "itsVariableNames", null);
        setIntField(term82556, term82556.getClass(), "varStart", 0);
        setField(term82556, term82556.getClass(), "compilerData", null);
        setIntField(term82556, term82556.getClass(), "type", 14);
        setField(term82557, term82557.getClass(), "functionName", null);
        setBooleanField(term82557, term82557.getClass(), "itsNeedsActivation", false);
        setIntField(term82557, term82557.getClass(), "itsFunctionType", 0);
        setBooleanField(term82557, term82557.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term82557, term82557.getClass(), "encodedSourceStart", 0);
        setIntField(term82557, term82557.getClass(), "encodedSourceEnd", 0);
        setField(term82557, term82557.getClass(), "sourceName", null);
        setIntField(term82557, term82557.getClass(), "baseLineno", 0);
        setIntField(term82557, term82557.getClass(), "endLineno", 0);
        setField(term82557, term82557.getClass(), "functions", null);
        setField(term82557, term82557.getClass(), "regexps", null);
        setField(term82557, term82557.getClass(), "itsVariables", null);
        setField(term82557, term82557.getClass(), "itsConst", null);
        setField(term82557, term82557.getClass(), "itsVariableNames", null);
        setIntField(term82557, term82557.getClass(), "varStart", 0);
        setField(term82557, term82557.getClass(), "compilerData", null);
        setIntField(term82557, term82557.getClass(), "type", 0);
        setField(term82557, term82557.getClass(), "next", null);
        setField(term82557, term82557.getClass(), "first", null);
        setField(term82557, term82557.getClass(), "last", null);
        setField(term82557, term82557.getClass(), "propListHead", null);
        setIntField(term82557, term82557.getClass(), "sourcePosition", 0);
        setField(term82557, term82557.getClass(), "jsType", null);
        setField(term82557, term82557.getClass(), "parent", null);
        setField(term82556, term82556.getClass(), "next", term82557);
        setField(term82556, term82556.getClass(), "first", term82556);
        setField(term82556, term82556.getClass(), "last", null);
        setField(term82556, term82556.getClass(), "propListHead", null);
        setIntField(term82556, term82556.getClass(), "sourcePosition", 0);
        setField(term82556, term82556.getClass(), "jsType", null);
        setField(term82556, term82556.getClass(), "parent", null);
        term82477 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term82487 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term82477, term82477.getClass(), "functionName", null);
        setBooleanField(term82477, term82477.getClass(), "itsNeedsActivation", false);
        setIntField(term82477, term82477.getClass(), "itsFunctionType", 0);
        setBooleanField(term82477, term82477.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term82477, term82477.getClass(), "encodedSourceStart", 0);
        setIntField(term82477, term82477.getClass(), "encodedSourceEnd", 0);
        setField(term82477, term82477.getClass(), "sourceName", null);
        setIntField(term82477, term82477.getClass(), "baseLineno", 0);
        setIntField(term82477, term82477.getClass(), "endLineno", 0);
        setField(term82477, term82477.getClass(), "functions", null);
        setField(term82477, term82477.getClass(), "regexps", null);
        setField(term82477, term82477.getClass(), "itsVariables", null);
        setField(term82477, term82477.getClass(), "itsConst", null);
        setField(term82477, term82477.getClass(), "itsVariableNames", null);
        setIntField(term82477, term82477.getClass(), "varStart", 0);
        setField(term82477, term82477.getClass(), "compilerData", null);
        setIntField(term82477, term82477.getClass(), "type", 14);
        setField(term82487, term82487.getClass(), "functionName", null);
        setBooleanField(term82487, term82487.getClass(), "itsNeedsActivation", false);
        setIntField(term82487, term82487.getClass(), "itsFunctionType", 0);
        setBooleanField(term82487, term82487.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term82487, term82487.getClass(), "encodedSourceStart", 0);
        setIntField(term82487, term82487.getClass(), "encodedSourceEnd", 0);
        setField(term82487, term82487.getClass(), "sourceName", null);
        setIntField(term82487, term82487.getClass(), "baseLineno", 0);
        setIntField(term82487, term82487.getClass(), "endLineno", 0);
        setField(term82487, term82487.getClass(), "functions", null);
        setField(term82487, term82487.getClass(), "regexps", null);
        setField(term82487, term82487.getClass(), "itsVariables", null);
        setField(term82487, term82487.getClass(), "itsConst", null);
        setField(term82487, term82487.getClass(), "itsVariableNames", null);
        setIntField(term82487, term82487.getClass(), "varStart", 0);
        setField(term82487, term82487.getClass(), "compilerData", null);
        setIntField(term82487, term82487.getClass(), "type", 0);
        setField(term82487, term82487.getClass(), "next", null);
        setField(term82487, term82487.getClass(), "first", null);
        setField(term82487, term82487.getClass(), "last", null);
        setField(term82487, term82487.getClass(), "propListHead", null);
        setIntField(term82487, term82487.getClass(), "sourcePosition", 0);
        setField(term82487, term82487.getClass(), "jsType", null);
        setField(term82487, term82487.getClass(), "parent", null);
        setField(term82477, term82477.getClass(), "next", term82487);
        setField(term82477, term82477.getClass(), "first", term82477);
        setField(term82477, term82477.getClass(), "last", null);
        setField(term82477, term82477.getClass(), "propListHead", null);
        setIntField(term82477, term82477.getClass(), "sourcePosition", 0);
        setField(term82477, term82477.getClass(), "jsType", null);
        setField(term82477, term82477.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term82368;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term82282, args);
        assertTrue(recursiveEquals(term82282, term82555));
        assertTrue(recursiveEquals(term82368, term82556));
        assertTrue(recursiveEquals(retValue, term82477));
    }

};


