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

public class ReferenceCollectingCallback_visit_872273174557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142753;
     Object term142974;
     Object term142931;
     Object term143736;
     Object term143737;
     Object term143738;

    public ReferenceCollectingCallback_visit_872273174557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142753 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term142974 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term142974, term142974.getClass(), "type", 0);
        term142931 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term142931, term142931.getClass(), "type", 98);
        setField(term142931, term142931.getClass(), "first", term142974);
        term143736 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term143736, term143736.getClass(), "referenceMap", null);
        setField(term143736, term143736.getClass(), "blockStack", null);
        setField(term143736, term143736.getClass(), "behavior", null);
        setField(term143736, term143736.getClass(), "compiler", null);
        setField(term143736, term143736.getClass(), "varFilter", null);
        term143737 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term143737, term143737.getClass(), "functionName", null);
        setBooleanField(term143737, term143737.getClass(), "itsNeedsActivation", false);
        setIntField(term143737, term143737.getClass(), "itsFunctionType", 0);
        setBooleanField(term143737, term143737.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term143737, term143737.getClass(), "encodedSourceStart", 0);
        setIntField(term143737, term143737.getClass(), "encodedSourceEnd", 0);
        setField(term143737, term143737.getClass(), "sourceName", null);
        setIntField(term143737, term143737.getClass(), "baseLineno", 0);
        setIntField(term143737, term143737.getClass(), "endLineno", 0);
        setField(term143737, term143737.getClass(), "functions", null);
        setField(term143737, term143737.getClass(), "regexps", null);
        setField(term143737, term143737.getClass(), "itsVariables", null);
        setField(term143737, term143737.getClass(), "itsConst", null);
        setField(term143737, term143737.getClass(), "itsVariableNames", null);
        setIntField(term143737, term143737.getClass(), "varStart", 0);
        setField(term143737, term143737.getClass(), "compilerData", null);
        setIntField(term143737, term143737.getClass(), "type", 0);
        setField(term143737, term143737.getClass(), "next", null);
        setField(term143737, term143737.getClass(), "first", null);
        setField(term143737, term143737.getClass(), "last", null);
        setField(term143737, term143737.getClass(), "propListHead", null);
        setIntField(term143737, term143737.getClass(), "sourcePosition", 0);
        setField(term143737, term143737.getClass(), "jsType", null);
        setField(term143737, term143737.getClass(), "parent", null);
        term143738 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term143739 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term143738, term143738.getClass(), "number", 0.0);
        setIntField(term143738, term143738.getClass(), "type", 98);
        setField(term143738, term143738.getClass(), "next", null);
        setField(term143739, term143739.getClass(), "functionName", null);
        setBooleanField(term143739, term143739.getClass(), "itsNeedsActivation", false);
        setIntField(term143739, term143739.getClass(), "itsFunctionType", 0);
        setBooleanField(term143739, term143739.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term143739, term143739.getClass(), "encodedSourceStart", 0);
        setIntField(term143739, term143739.getClass(), "encodedSourceEnd", 0);
        setField(term143739, term143739.getClass(), "sourceName", null);
        setIntField(term143739, term143739.getClass(), "baseLineno", 0);
        setIntField(term143739, term143739.getClass(), "endLineno", 0);
        setField(term143739, term143739.getClass(), "functions", null);
        setField(term143739, term143739.getClass(), "regexps", null);
        setField(term143739, term143739.getClass(), "itsVariables", null);
        setField(term143739, term143739.getClass(), "itsConst", null);
        setField(term143739, term143739.getClass(), "itsVariableNames", null);
        setIntField(term143739, term143739.getClass(), "varStart", 0);
        setField(term143739, term143739.getClass(), "compilerData", null);
        setIntField(term143739, term143739.getClass(), "type", 0);
        setField(term143739, term143739.getClass(), "next", null);
        setField(term143739, term143739.getClass(), "first", null);
        setField(term143739, term143739.getClass(), "last", null);
        setField(term143739, term143739.getClass(), "propListHead", null);
        setIntField(term143739, term143739.getClass(), "sourcePosition", 0);
        setField(term143739, term143739.getClass(), "jsType", null);
        setField(term143739, term143739.getClass(), "parent", null);
        setField(term143738, term143738.getClass(), "first", term143739);
        setField(term143738, term143738.getClass(), "last", null);
        setField(term143738, term143738.getClass(), "propListHead", null);
        setIntField(term143738, term143738.getClass(), "sourcePosition", 0);
        setField(term143738, term143738.getClass(), "jsType", null);
        setField(term143738, term143738.getClass(), "parent", null);
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
        args[1] = term142974;
        args[2] = term142931;
        callMethod(klass, "visit", argTypes, term142753, args);
        assertTrue(recursiveEquals(term142753, term143736));
        assertTrue(recursiveEquals(term142974, term143738));
        assertTrue(recursiveEquals(term142931, null));
    }

};


