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

public class NodeUtil_nodeTypeMayHaveSideEffects_620236925461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37998;
     Object term38014;

    public NodeUtil_nodeTypeMayHaveSideEffects_620236925461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37998 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term37998, term37998.getClass(), "type", 97);
        term38014 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term38014, term38014.getClass(), "functionName", null);
        setBooleanField(term38014, term38014.getClass(), "itsNeedsActivation", false);
        setIntField(term38014, term38014.getClass(), "itsFunctionType", 0);
        setBooleanField(term38014, term38014.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term38014, term38014.getClass(), "encodedSourceStart", 0);
        setIntField(term38014, term38014.getClass(), "encodedSourceEnd", 0);
        setField(term38014, term38014.getClass(), "sourceName", null);
        setIntField(term38014, term38014.getClass(), "baseLineno", 0);
        setIntField(term38014, term38014.getClass(), "endLineno", 0);
        setField(term38014, term38014.getClass(), "functions", null);
        setField(term38014, term38014.getClass(), "regexps", null);
        setField(term38014, term38014.getClass(), "itsVariables", null);
        setField(term38014, term38014.getClass(), "itsConst", null);
        setField(term38014, term38014.getClass(), "itsVariableNames", null);
        setIntField(term38014, term38014.getClass(), "varStart", 0);
        setField(term38014, term38014.getClass(), "compilerData", null);
        setIntField(term38014, term38014.getClass(), "type", 97);
        setField(term38014, term38014.getClass(), "next", null);
        setField(term38014, term38014.getClass(), "first", null);
        setField(term38014, term38014.getClass(), "last", null);
        setField(term38014, term38014.getClass(), "propListHead", null);
        setIntField(term38014, term38014.getClass(), "sourcePosition", 0);
        setField(term38014, term38014.getClass(), "jsType", null);
        setField(term38014, term38014.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term37998;
        Object retValue = callMethod(klass, "nodeTypeMayHaveSideEffects", argTypes, null, args);
        assertTrue(recursiveEquals(term37998, term38014));
        assertTrue(recursiveEquals(retValue, true));
    }

};


