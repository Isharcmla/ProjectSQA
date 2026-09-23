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

public class ReferenceCollectingCallback_visit_872273174234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56333;
     Object term56419;
     Object term56511;
     Object term56807;
     Object term56808;
     Object term56809;

    public ReferenceCollectingCallback_visit_872273174234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56333 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term56419 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term56419, term56419.getClass(), "type", -39);
        term56511 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term56807 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term56807, term56807.getClass(), "referenceMap", null);
        setField(term56807, term56807.getClass(), "blockStack", null);
        setField(term56807, term56807.getClass(), "behavior", null);
        setField(term56807, term56807.getClass(), "compiler", null);
        setField(term56807, term56807.getClass(), "varFilter", null);
        term56808 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term56808, term56808.getClass(), "functionName", null);
        setBooleanField(term56808, term56808.getClass(), "itsNeedsActivation", false);
        setIntField(term56808, term56808.getClass(), "itsFunctionType", 0);
        setBooleanField(term56808, term56808.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term56808, term56808.getClass(), "encodedSourceStart", 0);
        setIntField(term56808, term56808.getClass(), "encodedSourceEnd", 0);
        setField(term56808, term56808.getClass(), "sourceName", null);
        setIntField(term56808, term56808.getClass(), "baseLineno", 0);
        setIntField(term56808, term56808.getClass(), "endLineno", 0);
        setField(term56808, term56808.getClass(), "functions", null);
        setField(term56808, term56808.getClass(), "regexps", null);
        setField(term56808, term56808.getClass(), "itsVariables", null);
        setField(term56808, term56808.getClass(), "itsConst", null);
        setField(term56808, term56808.getClass(), "itsVariableNames", null);
        setIntField(term56808, term56808.getClass(), "varStart", 0);
        setField(term56808, term56808.getClass(), "compilerData", null);
        setIntField(term56808, term56808.getClass(), "type", -39);
        setField(term56808, term56808.getClass(), "next", null);
        setField(term56808, term56808.getClass(), "first", null);
        setField(term56808, term56808.getClass(), "last", null);
        setField(term56808, term56808.getClass(), "propListHead", null);
        setIntField(term56808, term56808.getClass(), "sourcePosition", 0);
        setField(term56808, term56808.getClass(), "jsType", null);
        setField(term56808, term56808.getClass(), "parent", null);
        term56809 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term56809, term56809.getClass(), "str", null);
        setIntField(term56809, term56809.getClass(), "type", 0);
        setField(term56809, term56809.getClass(), "next", null);
        setField(term56809, term56809.getClass(), "first", null);
        setField(term56809, term56809.getClass(), "last", null);
        setField(term56809, term56809.getClass(), "propListHead", null);
        setIntField(term56809, term56809.getClass(), "sourcePosition", 0);
        setField(term56809, term56809.getClass(), "jsType", null);
        setField(term56809, term56809.getClass(), "parent", null);
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
        args[1] = term56419;
        args[2] = term56511;
        callMethod(klass, "visit", argTypes, term56333, args);
        assertTrue(recursiveEquals(term56333, term56807));
        assertTrue(recursiveEquals(term56419, term56809));
        assertTrue(recursiveEquals(term56511, null));
    }

};


