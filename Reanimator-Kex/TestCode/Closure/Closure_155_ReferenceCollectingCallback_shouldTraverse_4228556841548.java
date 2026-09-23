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

public class ReferenceCollectingCallback_shouldTraverse_4228556841548 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term465669;
     Object term465755;
     Object term465841;
     Object term466446;
     Object term466447;
     Object term466448;

    public ReferenceCollectingCallback_shouldTraverse_4228556841548() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term465669 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term465755 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term465841 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term465841, term465841.getClass(), "type", 4);
        term466446 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term466446, term466446.getClass(), "referenceMap", null);
        setField(term466446, term466446.getClass(), "blockStack", null);
        setField(term466446, term466446.getClass(), "behavior", null);
        setField(term466446, term466446.getClass(), "compiler", null);
        setField(term466446, term466446.getClass(), "varFilter", null);
        term466447 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term466447, term466447.getClass(), "functionName", null);
        setBooleanField(term466447, term466447.getClass(), "itsNeedsActivation", false);
        setIntField(term466447, term466447.getClass(), "itsFunctionType", 0);
        setBooleanField(term466447, term466447.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term466447, term466447.getClass(), "encodedSourceStart", 0);
        setIntField(term466447, term466447.getClass(), "encodedSourceEnd", 0);
        setField(term466447, term466447.getClass(), "sourceName", null);
        setIntField(term466447, term466447.getClass(), "baseLineno", 0);
        setIntField(term466447, term466447.getClass(), "endLineno", 0);
        setField(term466447, term466447.getClass(), "functions", null);
        setField(term466447, term466447.getClass(), "regexps", null);
        setField(term466447, term466447.getClass(), "itsVariables", null);
        setField(term466447, term466447.getClass(), "itsConst", null);
        setField(term466447, term466447.getClass(), "itsVariableNames", null);
        setIntField(term466447, term466447.getClass(), "varStart", 0);
        setField(term466447, term466447.getClass(), "compilerData", null);
        setIntField(term466447, term466447.getClass(), "type", 4);
        setField(term466447, term466447.getClass(), "next", null);
        setField(term466447, term466447.getClass(), "first", null);
        setField(term466447, term466447.getClass(), "last", null);
        setField(term466447, term466447.getClass(), "propListHead", null);
        setIntField(term466447, term466447.getClass(), "sourcePosition", 0);
        setField(term466447, term466447.getClass(), "jsType", null);
        setField(term466447, term466447.getClass(), "parent", null);
        term466448 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term466448, term466448.getClass(), "functionName", null);
        setBooleanField(term466448, term466448.getClass(), "itsNeedsActivation", false);
        setIntField(term466448, term466448.getClass(), "itsFunctionType", 0);
        setBooleanField(term466448, term466448.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term466448, term466448.getClass(), "encodedSourceStart", 0);
        setIntField(term466448, term466448.getClass(), "encodedSourceEnd", 0);
        setField(term466448, term466448.getClass(), "sourceName", null);
        setIntField(term466448, term466448.getClass(), "baseLineno", 0);
        setIntField(term466448, term466448.getClass(), "endLineno", 0);
        setField(term466448, term466448.getClass(), "functions", null);
        setField(term466448, term466448.getClass(), "regexps", null);
        setField(term466448, term466448.getClass(), "itsVariables", null);
        setField(term466448, term466448.getClass(), "itsConst", null);
        setField(term466448, term466448.getClass(), "itsVariableNames", null);
        setIntField(term466448, term466448.getClass(), "varStart", 0);
        setField(term466448, term466448.getClass(), "compilerData", null);
        setIntField(term466448, term466448.getClass(), "type", 0);
        setField(term466448, term466448.getClass(), "next", null);
        setField(term466448, term466448.getClass(), "first", null);
        setField(term466448, term466448.getClass(), "last", null);
        setField(term466448, term466448.getClass(), "propListHead", null);
        setIntField(term466448, term466448.getClass(), "sourcePosition", 0);
        setField(term466448, term466448.getClass(), "jsType", null);
        setField(term466448, term466448.getClass(), "parent", null);
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
        args[1] = term465755;
        args[2] = term465841;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term465669, args);
        assertTrue(recursiveEquals(term465669, term466446));
        assertTrue(recursiveEquals(term465755, term466448));
        assertTrue(recursiveEquals(term465841, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


