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

public class ReferenceCollectingCallback_shouldTraverse_422855684759 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term197911;
     Object term197997;
     Object term198117;
     Object term198118;

    public ReferenceCollectingCallback_shouldTraverse_422855684759() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term197911 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term197997 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term197997, term197997.getClass(), "type", 98);
        term198117 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term198117, term198117.getClass(), "referenceMap", null);
        setField(term198117, term198117.getClass(), "blockStack", null);
        setField(term198117, term198117.getClass(), "behavior", null);
        setField(term198117, term198117.getClass(), "compiler", null);
        setField(term198117, term198117.getClass(), "varFilter", null);
        term198118 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term198118, term198118.getClass(), "functionName", null);
        setBooleanField(term198118, term198118.getClass(), "itsNeedsActivation", false);
        setIntField(term198118, term198118.getClass(), "itsFunctionType", 0);
        setBooleanField(term198118, term198118.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term198118, term198118.getClass(), "encodedSourceStart", 0);
        setIntField(term198118, term198118.getClass(), "encodedSourceEnd", 0);
        setField(term198118, term198118.getClass(), "sourceName", null);
        setIntField(term198118, term198118.getClass(), "baseLineno", 0);
        setIntField(term198118, term198118.getClass(), "endLineno", 0);
        setField(term198118, term198118.getClass(), "functions", null);
        setField(term198118, term198118.getClass(), "regexps", null);
        setField(term198118, term198118.getClass(), "itsVariables", null);
        setField(term198118, term198118.getClass(), "itsConst", null);
        setField(term198118, term198118.getClass(), "itsVariableNames", null);
        setIntField(term198118, term198118.getClass(), "varStart", 0);
        setField(term198118, term198118.getClass(), "compilerData", null);
        setIntField(term198118, term198118.getClass(), "type", 98);
        setField(term198118, term198118.getClass(), "next", null);
        setField(term198118, term198118.getClass(), "first", null);
        setField(term198118, term198118.getClass(), "last", null);
        setField(term198118, term198118.getClass(), "propListHead", null);
        setIntField(term198118, term198118.getClass(), "sourcePosition", 0);
        setField(term198118, term198118.getClass(), "jsType", null);
        setField(term198118, term198118.getClass(), "parent", null);
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
        args[1] = null;
        args[2] = term197997;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term197911, args);
        assertTrue(recursiveEquals(term197911, term198117));
        assertTrue(recursiveEquals(term197997, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


