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
import java.util.ArrayDeque;

public class ReferenceCollectingCallback_shouldTraverse_4228556841209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term360129;
     Object term360269;
     Object term360361;
     Object term361402;
     Object term361406;
     Object term361407;

    public ReferenceCollectingCallback_shouldTraverse_4228556841209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term360183 = new ArrayDeque();
        term360129 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term360129, term360129.getClass(), "blockStack", term360183);
        term360269 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term360269, term360269.getClass(), "type", 111);
        term360361 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term360361, term360361.getClass(), "type", 0);
        ArrayDeque term361403 = new ArrayDeque();
        term361402 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term361402, term361402.getClass(), "referenceMap", null);
        setField(term361402, term361402.getClass(), "blockStack", term361403);
        setField(term361402, term361402.getClass(), "behavior", null);
        setField(term361402, term361402.getClass(), "compiler", null);
        setField(term361402, term361402.getClass(), "varFilter", null);
        term361406 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term361406, term361406.getClass(), "str", null);
        setIntField(term361406, term361406.getClass(), "type", 0);
        setField(term361406, term361406.getClass(), "next", null);
        setField(term361406, term361406.getClass(), "first", null);
        setField(term361406, term361406.getClass(), "last", null);
        setField(term361406, term361406.getClass(), "propListHead", null);
        setIntField(term361406, term361406.getClass(), "sourcePosition", 0);
        setField(term361406, term361406.getClass(), "jsType", null);
        setField(term361406, term361406.getClass(), "parent", null);
        term361407 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term361407, term361407.getClass(), "functionName", null);
        setBooleanField(term361407, term361407.getClass(), "itsNeedsActivation", false);
        setIntField(term361407, term361407.getClass(), "itsFunctionType", 0);
        setBooleanField(term361407, term361407.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term361407, term361407.getClass(), "encodedSourceStart", 0);
        setIntField(term361407, term361407.getClass(), "encodedSourceEnd", 0);
        setField(term361407, term361407.getClass(), "sourceName", null);
        setIntField(term361407, term361407.getClass(), "baseLineno", 0);
        setIntField(term361407, term361407.getClass(), "endLineno", 0);
        setField(term361407, term361407.getClass(), "functions", null);
        setField(term361407, term361407.getClass(), "regexps", null);
        setField(term361407, term361407.getClass(), "itsVariables", null);
        setField(term361407, term361407.getClass(), "itsConst", null);
        setField(term361407, term361407.getClass(), "itsVariableNames", null);
        setIntField(term361407, term361407.getClass(), "varStart", 0);
        setField(term361407, term361407.getClass(), "compilerData", null);
        setIntField(term361407, term361407.getClass(), "type", 111);
        setField(term361407, term361407.getClass(), "next", null);
        setField(term361407, term361407.getClass(), "first", null);
        setField(term361407, term361407.getClass(), "last", null);
        setField(term361407, term361407.getClass(), "propListHead", null);
        setIntField(term361407, term361407.getClass(), "sourcePosition", 0);
        setField(term361407, term361407.getClass(), "jsType", null);
        setField(term361407, term361407.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term360269;
        args[2] = term360361;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term360129, args);
        assertTrue(recursiveEquals(term360129, term361402));
        assertTrue(recursiveEquals(term360269, term361407));
        assertTrue(recursiveEquals(term360361, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


