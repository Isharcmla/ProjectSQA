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

public class ReferenceCollectingCallback_shouldTraverse_422855684532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144047;
     Object term144133;
     Object term144219;
     Object term144250;
     Object term144251;
     Object term144252;

    public ReferenceCollectingCallback_shouldTraverse_422855684532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term144047 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term144133 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term144219 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term144219, term144219.getClass(), "type", 4);
        term144250 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term144250, term144250.getClass(), "referenceMap", null);
        setField(term144250, term144250.getClass(), "blockStack", null);
        setField(term144250, term144250.getClass(), "behavior", null);
        setField(term144250, term144250.getClass(), "compiler", null);
        setField(term144250, term144250.getClass(), "varFilter", null);
        term144251 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term144251, term144251.getClass(), "functionName", null);
        setBooleanField(term144251, term144251.getClass(), "itsNeedsActivation", false);
        setIntField(term144251, term144251.getClass(), "itsFunctionType", 0);
        setBooleanField(term144251, term144251.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term144251, term144251.getClass(), "encodedSourceStart", 0);
        setIntField(term144251, term144251.getClass(), "encodedSourceEnd", 0);
        setField(term144251, term144251.getClass(), "sourceName", null);
        setIntField(term144251, term144251.getClass(), "baseLineno", 0);
        setIntField(term144251, term144251.getClass(), "endLineno", 0);
        setField(term144251, term144251.getClass(), "functions", null);
        setField(term144251, term144251.getClass(), "regexps", null);
        setField(term144251, term144251.getClass(), "itsVariables", null);
        setField(term144251, term144251.getClass(), "itsConst", null);
        setField(term144251, term144251.getClass(), "itsVariableNames", null);
        setIntField(term144251, term144251.getClass(), "varStart", 0);
        setField(term144251, term144251.getClass(), "compilerData", null);
        setIntField(term144251, term144251.getClass(), "type", 4);
        setField(term144251, term144251.getClass(), "next", null);
        setField(term144251, term144251.getClass(), "first", null);
        setField(term144251, term144251.getClass(), "last", null);
        setField(term144251, term144251.getClass(), "propListHead", null);
        setIntField(term144251, term144251.getClass(), "sourcePosition", 0);
        setField(term144251, term144251.getClass(), "jsType", null);
        setField(term144251, term144251.getClass(), "parent", null);
        term144252 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term144252, term144252.getClass(), "functionName", null);
        setBooleanField(term144252, term144252.getClass(), "itsNeedsActivation", false);
        setIntField(term144252, term144252.getClass(), "itsFunctionType", 0);
        setBooleanField(term144252, term144252.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term144252, term144252.getClass(), "encodedSourceStart", 0);
        setIntField(term144252, term144252.getClass(), "encodedSourceEnd", 0);
        setField(term144252, term144252.getClass(), "sourceName", null);
        setIntField(term144252, term144252.getClass(), "baseLineno", 0);
        setIntField(term144252, term144252.getClass(), "endLineno", 0);
        setField(term144252, term144252.getClass(), "functions", null);
        setField(term144252, term144252.getClass(), "regexps", null);
        setField(term144252, term144252.getClass(), "itsVariables", null);
        setField(term144252, term144252.getClass(), "itsConst", null);
        setField(term144252, term144252.getClass(), "itsVariableNames", null);
        setIntField(term144252, term144252.getClass(), "varStart", 0);
        setField(term144252, term144252.getClass(), "compilerData", null);
        setIntField(term144252, term144252.getClass(), "type", 0);
        setField(term144252, term144252.getClass(), "next", null);
        setField(term144252, term144252.getClass(), "first", null);
        setField(term144252, term144252.getClass(), "last", null);
        setField(term144252, term144252.getClass(), "propListHead", null);
        setIntField(term144252, term144252.getClass(), "sourcePosition", 0);
        setField(term144252, term144252.getClass(), "jsType", null);
        setField(term144252, term144252.getClass(), "parent", null);
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
        args[1] = term144133;
        args[2] = term144219;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term144047, args);
        assertTrue(recursiveEquals(term144047, term144250));
        assertTrue(recursiveEquals(term144133, term144252));
        assertTrue(recursiveEquals(term144219, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


