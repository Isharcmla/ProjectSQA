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

public class ReferenceCollectingCallback_shouldTraverse_422855684778 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term202095;
     Object term202187;
     Object term202273;
     Object term202603;
     Object term202604;
     Object term202605;

    public ReferenceCollectingCallback_shouldTraverse_422855684778() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term202095 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term202187 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term202273 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term202273, term202273.getClass(), "type", 12);
        term202603 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term202603, term202603.getClass(), "referenceMap", null);
        setField(term202603, term202603.getClass(), "blockStack", null);
        setField(term202603, term202603.getClass(), "behavior", null);
        setField(term202603, term202603.getClass(), "compiler", null);
        setField(term202603, term202603.getClass(), "varFilter", null);
        term202604 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term202604, term202604.getClass(), "functionName", null);
        setBooleanField(term202604, term202604.getClass(), "itsNeedsActivation", false);
        setIntField(term202604, term202604.getClass(), "itsFunctionType", 0);
        setBooleanField(term202604, term202604.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term202604, term202604.getClass(), "encodedSourceStart", 0);
        setIntField(term202604, term202604.getClass(), "encodedSourceEnd", 0);
        setField(term202604, term202604.getClass(), "sourceName", null);
        setIntField(term202604, term202604.getClass(), "baseLineno", 0);
        setIntField(term202604, term202604.getClass(), "endLineno", 0);
        setField(term202604, term202604.getClass(), "functions", null);
        setField(term202604, term202604.getClass(), "regexps", null);
        setField(term202604, term202604.getClass(), "itsVariables", null);
        setField(term202604, term202604.getClass(), "itsConst", null);
        setField(term202604, term202604.getClass(), "itsVariableNames", null);
        setIntField(term202604, term202604.getClass(), "varStart", 0);
        setField(term202604, term202604.getClass(), "compilerData", null);
        setIntField(term202604, term202604.getClass(), "type", 12);
        setField(term202604, term202604.getClass(), "next", null);
        setField(term202604, term202604.getClass(), "first", null);
        setField(term202604, term202604.getClass(), "last", null);
        setField(term202604, term202604.getClass(), "propListHead", null);
        setIntField(term202604, term202604.getClass(), "sourcePosition", 0);
        setField(term202604, term202604.getClass(), "jsType", null);
        setField(term202604, term202604.getClass(), "parent", null);
        term202605 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term202605, term202605.getClass(), "str", null);
        setIntField(term202605, term202605.getClass(), "type", 0);
        setField(term202605, term202605.getClass(), "next", null);
        setField(term202605, term202605.getClass(), "first", null);
        setField(term202605, term202605.getClass(), "last", null);
        setField(term202605, term202605.getClass(), "propListHead", null);
        setIntField(term202605, term202605.getClass(), "sourcePosition", 0);
        setField(term202605, term202605.getClass(), "jsType", null);
        setField(term202605, term202605.getClass(), "parent", null);
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
        args[1] = term202187;
        args[2] = term202273;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term202095, args);
        assertTrue(recursiveEquals(term202095, term202603));
        assertTrue(recursiveEquals(term202187, term202605));
        assertTrue(recursiveEquals(term202273, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


