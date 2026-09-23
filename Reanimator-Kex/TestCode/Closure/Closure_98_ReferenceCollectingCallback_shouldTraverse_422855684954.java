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

public class ReferenceCollectingCallback_shouldTraverse_422855684954 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term258451;
     Object term258537;
     Object term258623;
     Object term258866;
     Object term258867;
     Object term258868;

    public ReferenceCollectingCallback_shouldTraverse_422855684954() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term258451 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term258537 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term258623 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term258623, term258623.getClass(), "type", 2);
        term258866 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term258866, term258866.getClass(), "referenceMap", null);
        setField(term258866, term258866.getClass(), "blockStack", null);
        setField(term258866, term258866.getClass(), "behavior", null);
        setField(term258866, term258866.getClass(), "compiler", null);
        setField(term258866, term258866.getClass(), "varFilter", null);
        term258867 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term258867, term258867.getClass(), "functionName", null);
        setBooleanField(term258867, term258867.getClass(), "itsNeedsActivation", false);
        setIntField(term258867, term258867.getClass(), "itsFunctionType", 0);
        setBooleanField(term258867, term258867.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term258867, term258867.getClass(), "encodedSourceStart", 0);
        setIntField(term258867, term258867.getClass(), "encodedSourceEnd", 0);
        setField(term258867, term258867.getClass(), "sourceName", null);
        setIntField(term258867, term258867.getClass(), "baseLineno", 0);
        setIntField(term258867, term258867.getClass(), "endLineno", 0);
        setField(term258867, term258867.getClass(), "functions", null);
        setField(term258867, term258867.getClass(), "regexps", null);
        setField(term258867, term258867.getClass(), "itsVariables", null);
        setField(term258867, term258867.getClass(), "itsConst", null);
        setField(term258867, term258867.getClass(), "itsVariableNames", null);
        setIntField(term258867, term258867.getClass(), "varStart", 0);
        setField(term258867, term258867.getClass(), "compilerData", null);
        setIntField(term258867, term258867.getClass(), "type", 2);
        setField(term258867, term258867.getClass(), "next", null);
        setField(term258867, term258867.getClass(), "first", null);
        setField(term258867, term258867.getClass(), "last", null);
        setField(term258867, term258867.getClass(), "propListHead", null);
        setIntField(term258867, term258867.getClass(), "sourcePosition", 0);
        setField(term258867, term258867.getClass(), "jsType", null);
        setField(term258867, term258867.getClass(), "parent", null);
        term258868 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term258868, term258868.getClass(), "functionName", null);
        setBooleanField(term258868, term258868.getClass(), "itsNeedsActivation", false);
        setIntField(term258868, term258868.getClass(), "itsFunctionType", 0);
        setBooleanField(term258868, term258868.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term258868, term258868.getClass(), "encodedSourceStart", 0);
        setIntField(term258868, term258868.getClass(), "encodedSourceEnd", 0);
        setField(term258868, term258868.getClass(), "sourceName", null);
        setIntField(term258868, term258868.getClass(), "baseLineno", 0);
        setIntField(term258868, term258868.getClass(), "endLineno", 0);
        setField(term258868, term258868.getClass(), "functions", null);
        setField(term258868, term258868.getClass(), "regexps", null);
        setField(term258868, term258868.getClass(), "itsVariables", null);
        setField(term258868, term258868.getClass(), "itsConst", null);
        setField(term258868, term258868.getClass(), "itsVariableNames", null);
        setIntField(term258868, term258868.getClass(), "varStart", 0);
        setField(term258868, term258868.getClass(), "compilerData", null);
        setIntField(term258868, term258868.getClass(), "type", 0);
        setField(term258868, term258868.getClass(), "next", null);
        setField(term258868, term258868.getClass(), "first", null);
        setField(term258868, term258868.getClass(), "last", null);
        setField(term258868, term258868.getClass(), "propListHead", null);
        setIntField(term258868, term258868.getClass(), "sourcePosition", 0);
        setField(term258868, term258868.getClass(), "jsType", null);
        setField(term258868, term258868.getClass(), "parent", null);
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
        args[1] = term258537;
        args[2] = term258623;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term258451, args);
        assertTrue(recursiveEquals(term258451, term258866));
        assertTrue(recursiveEquals(term258537, term258868));
        assertTrue(recursiveEquals(term258623, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


