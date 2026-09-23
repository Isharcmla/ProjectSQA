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

public class ReferenceCollectingCallback_shouldTraverse_422855684910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233692;
     Object term233778;
     Object term233870;
     Object term234837;
     Object term234838;
     Object term234839;

    public ReferenceCollectingCallback_shouldTraverse_422855684910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term233692 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term233778 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term233870 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term233870, term233870.getClass(), "type", 12);
        term234837 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term234837, term234837.getClass(), "referenceMap", null);
        setField(term234837, term234837.getClass(), "blockStack", null);
        setField(term234837, term234837.getClass(), "behavior", null);
        setField(term234837, term234837.getClass(), "compiler", null);
        setField(term234837, term234837.getClass(), "varFilter", null);
        term234838 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term234838, term234838.getClass(), "number", 0.0);
        setIntField(term234838, term234838.getClass(), "type", 12);
        setField(term234838, term234838.getClass(), "next", null);
        setField(term234838, term234838.getClass(), "first", null);
        setField(term234838, term234838.getClass(), "last", null);
        setField(term234838, term234838.getClass(), "propListHead", null);
        setIntField(term234838, term234838.getClass(), "sourcePosition", 0);
        setField(term234838, term234838.getClass(), "jsType", null);
        setField(term234838, term234838.getClass(), "parent", null);
        term234839 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term234839, term234839.getClass(), "functionName", null);
        setBooleanField(term234839, term234839.getClass(), "itsNeedsActivation", false);
        setIntField(term234839, term234839.getClass(), "itsFunctionType", 0);
        setBooleanField(term234839, term234839.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term234839, term234839.getClass(), "encodedSourceStart", 0);
        setIntField(term234839, term234839.getClass(), "encodedSourceEnd", 0);
        setField(term234839, term234839.getClass(), "sourceName", null);
        setIntField(term234839, term234839.getClass(), "baseLineno", 0);
        setIntField(term234839, term234839.getClass(), "endLineno", 0);
        setField(term234839, term234839.getClass(), "functions", null);
        setField(term234839, term234839.getClass(), "regexps", null);
        setField(term234839, term234839.getClass(), "itsVariables", null);
        setField(term234839, term234839.getClass(), "itsConst", null);
        setField(term234839, term234839.getClass(), "itsVariableNames", null);
        setIntField(term234839, term234839.getClass(), "varStart", 0);
        setField(term234839, term234839.getClass(), "compilerData", null);
        setIntField(term234839, term234839.getClass(), "type", 0);
        setField(term234839, term234839.getClass(), "next", null);
        setField(term234839, term234839.getClass(), "first", null);
        setField(term234839, term234839.getClass(), "last", null);
        setField(term234839, term234839.getClass(), "propListHead", null);
        setIntField(term234839, term234839.getClass(), "sourcePosition", 0);
        setField(term234839, term234839.getClass(), "jsType", null);
        setField(term234839, term234839.getClass(), "parent", null);
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
        args[1] = term233778;
        args[2] = term233870;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term233692, args);
        assertTrue(recursiveEquals(term233692, term234837));
        assertTrue(recursiveEquals(term233778, term234839));
        assertTrue(recursiveEquals(term233870, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


