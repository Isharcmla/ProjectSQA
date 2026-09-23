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

public class ReferenceCollectingCallback_shouldTraverse_422855684779 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term202408;
     Object term202494;
     Object term202580;
     Object term202639;
     Object term202640;
     Object term202641;

    public ReferenceCollectingCallback_shouldTraverse_422855684779() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term202408 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term202494 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term202580 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term202580, term202580.getClass(), "type", 4);
        term202639 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term202639, term202639.getClass(), "referenceMap", null);
        setField(term202639, term202639.getClass(), "blockStack", null);
        setField(term202639, term202639.getClass(), "behavior", null);
        setField(term202639, term202639.getClass(), "compiler", null);
        setField(term202639, term202639.getClass(), "varFilter", null);
        term202640 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term202640, term202640.getClass(), "functionName", null);
        setBooleanField(term202640, term202640.getClass(), "itsNeedsActivation", false);
        setIntField(term202640, term202640.getClass(), "itsFunctionType", 0);
        setBooleanField(term202640, term202640.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term202640, term202640.getClass(), "encodedSourceStart", 0);
        setIntField(term202640, term202640.getClass(), "encodedSourceEnd", 0);
        setField(term202640, term202640.getClass(), "sourceName", null);
        setIntField(term202640, term202640.getClass(), "baseLineno", 0);
        setIntField(term202640, term202640.getClass(), "endLineno", 0);
        setField(term202640, term202640.getClass(), "functions", null);
        setField(term202640, term202640.getClass(), "regexps", null);
        setField(term202640, term202640.getClass(), "itsVariables", null);
        setField(term202640, term202640.getClass(), "itsConst", null);
        setField(term202640, term202640.getClass(), "itsVariableNames", null);
        setIntField(term202640, term202640.getClass(), "varStart", 0);
        setField(term202640, term202640.getClass(), "compilerData", null);
        setIntField(term202640, term202640.getClass(), "type", 4);
        setField(term202640, term202640.getClass(), "next", null);
        setField(term202640, term202640.getClass(), "first", null);
        setField(term202640, term202640.getClass(), "last", null);
        setField(term202640, term202640.getClass(), "propListHead", null);
        setIntField(term202640, term202640.getClass(), "sourcePosition", 0);
        setField(term202640, term202640.getClass(), "jsType", null);
        setField(term202640, term202640.getClass(), "parent", null);
        term202641 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term202641, term202641.getClass(), "functionName", null);
        setBooleanField(term202641, term202641.getClass(), "itsNeedsActivation", false);
        setIntField(term202641, term202641.getClass(), "itsFunctionType", 0);
        setBooleanField(term202641, term202641.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term202641, term202641.getClass(), "encodedSourceStart", 0);
        setIntField(term202641, term202641.getClass(), "encodedSourceEnd", 0);
        setField(term202641, term202641.getClass(), "sourceName", null);
        setIntField(term202641, term202641.getClass(), "baseLineno", 0);
        setIntField(term202641, term202641.getClass(), "endLineno", 0);
        setField(term202641, term202641.getClass(), "functions", null);
        setField(term202641, term202641.getClass(), "regexps", null);
        setField(term202641, term202641.getClass(), "itsVariables", null);
        setField(term202641, term202641.getClass(), "itsConst", null);
        setField(term202641, term202641.getClass(), "itsVariableNames", null);
        setIntField(term202641, term202641.getClass(), "varStart", 0);
        setField(term202641, term202641.getClass(), "compilerData", null);
        setIntField(term202641, term202641.getClass(), "type", 0);
        setField(term202641, term202641.getClass(), "next", null);
        setField(term202641, term202641.getClass(), "first", null);
        setField(term202641, term202641.getClass(), "last", null);
        setField(term202641, term202641.getClass(), "propListHead", null);
        setIntField(term202641, term202641.getClass(), "sourcePosition", 0);
        setField(term202641, term202641.getClass(), "jsType", null);
        setField(term202641, term202641.getClass(), "parent", null);
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
        args[1] = term202494;
        args[2] = term202580;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term202408, args);
        assertTrue(recursiveEquals(term202408, term202639));
        assertTrue(recursiveEquals(term202494, term202641));
        assertTrue(recursiveEquals(term202580, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


