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

public class NodeUtil_nodeTypeMayHaveSideEffects_620236925225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18685;
     Object term18699;

    public NodeUtil_nodeTypeMayHaveSideEffects_620236925225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18685 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        term18699 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term18699, term18699.getClass(), "encodedSourceStart", 0);
        setIntField(term18699, term18699.getClass(), "encodedSourceEnd", 0);
        setField(term18699, term18699.getClass(), "sourceName", null);
        setIntField(term18699, term18699.getClass(), "baseLineno", 0);
        setIntField(term18699, term18699.getClass(), "endLineno", 0);
        setField(term18699, term18699.getClass(), "functions", null);
        setField(term18699, term18699.getClass(), "regexps", null);
        setField(term18699, term18699.getClass(), "itsVariables", null);
        setField(term18699, term18699.getClass(), "itsConst", null);
        setField(term18699, term18699.getClass(), "itsVariableNames", null);
        setIntField(term18699, term18699.getClass(), "varStart", 0);
        setField(term18699, term18699.getClass(), "compilerData", null);
        setIntField(term18699, term18699.getClass(), "type", 0);
        setField(term18699, term18699.getClass(), "next", null);
        setField(term18699, term18699.getClass(), "first", null);
        setField(term18699, term18699.getClass(), "last", null);
        setField(term18699, term18699.getClass(), "propListHead", null);
        setIntField(term18699, term18699.getClass(), "sourcePosition", 0);
        setField(term18699, term18699.getClass(), "jsType", null);
        setField(term18699, term18699.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term18685;
        Object retValue = callMethod(klass, "nodeTypeMayHaveSideEffects", argTypes, null, args);
        assertTrue(recursiveEquals(term18685, term18699));
        assertTrue(recursiveEquals(retValue, false));
    }

};


