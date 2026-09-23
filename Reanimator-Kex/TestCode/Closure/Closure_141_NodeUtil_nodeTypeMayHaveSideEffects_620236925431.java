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

public class NodeUtil_nodeTypeMayHaveSideEffects_620236925431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33797;
     Object term33813;

    public NodeUtil_nodeTypeMayHaveSideEffects_620236925431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33797 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term33797, term33797.getClass(), "type", 91);
        term33813 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term33813, term33813.getClass(), "functionName", null);
        setBooleanField(term33813, term33813.getClass(), "itsNeedsActivation", false);
        setIntField(term33813, term33813.getClass(), "itsFunctionType", 0);
        setBooleanField(term33813, term33813.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term33813, term33813.getClass(), "encodedSourceStart", 0);
        setIntField(term33813, term33813.getClass(), "encodedSourceEnd", 0);
        setField(term33813, term33813.getClass(), "sourceName", null);
        setIntField(term33813, term33813.getClass(), "baseLineno", 0);
        setIntField(term33813, term33813.getClass(), "endLineno", 0);
        setField(term33813, term33813.getClass(), "functions", null);
        setField(term33813, term33813.getClass(), "regexps", null);
        setField(term33813, term33813.getClass(), "itsVariables", null);
        setField(term33813, term33813.getClass(), "itsConst", null);
        setField(term33813, term33813.getClass(), "itsVariableNames", null);
        setIntField(term33813, term33813.getClass(), "varStart", 0);
        setField(term33813, term33813.getClass(), "compilerData", null);
        setIntField(term33813, term33813.getClass(), "type", 91);
        setField(term33813, term33813.getClass(), "next", null);
        setField(term33813, term33813.getClass(), "first", null);
        setField(term33813, term33813.getClass(), "last", null);
        setField(term33813, term33813.getClass(), "propListHead", null);
        setIntField(term33813, term33813.getClass(), "sourcePosition", 0);
        setField(term33813, term33813.getClass(), "jsType", null);
        setField(term33813, term33813.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term33797;
        Object retValue = callMethod(klass, "nodeTypeMayHaveSideEffects", argTypes, null, args);
        assertTrue(recursiveEquals(term33797, term33813));
        assertTrue(recursiveEquals(retValue, true));
    }

};


