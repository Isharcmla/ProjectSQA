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

public class ReferenceCollectingCallback_shouldTraverse_422855684771 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200506;
     Object term200592;
     Object term201256;
     Object term201257;

    public ReferenceCollectingCallback_shouldTraverse_422855684771() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term200506 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term200592 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term200592, term200592.getClass(), "type", 101);
        term201256 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term201256, term201256.getClass(), "referenceMap", null);
        setField(term201256, term201256.getClass(), "blockStack", null);
        setField(term201256, term201256.getClass(), "behavior", null);
        setField(term201256, term201256.getClass(), "compiler", null);
        setField(term201256, term201256.getClass(), "varFilter", null);
        term201257 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term201257, term201257.getClass(), "functionName", null);
        setBooleanField(term201257, term201257.getClass(), "itsNeedsActivation", false);
        setIntField(term201257, term201257.getClass(), "itsFunctionType", 0);
        setBooleanField(term201257, term201257.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term201257, term201257.getClass(), "encodedSourceStart", 0);
        setIntField(term201257, term201257.getClass(), "encodedSourceEnd", 0);
        setField(term201257, term201257.getClass(), "sourceName", null);
        setIntField(term201257, term201257.getClass(), "baseLineno", 0);
        setIntField(term201257, term201257.getClass(), "endLineno", 0);
        setField(term201257, term201257.getClass(), "functions", null);
        setField(term201257, term201257.getClass(), "regexps", null);
        setField(term201257, term201257.getClass(), "itsVariables", null);
        setField(term201257, term201257.getClass(), "itsConst", null);
        setField(term201257, term201257.getClass(), "itsVariableNames", null);
        setIntField(term201257, term201257.getClass(), "varStart", 0);
        setField(term201257, term201257.getClass(), "compilerData", null);
        setIntField(term201257, term201257.getClass(), "type", 101);
        setField(term201257, term201257.getClass(), "next", null);
        setField(term201257, term201257.getClass(), "first", null);
        setField(term201257, term201257.getClass(), "last", null);
        setField(term201257, term201257.getClass(), "propListHead", null);
        setIntField(term201257, term201257.getClass(), "sourcePosition", 0);
        setField(term201257, term201257.getClass(), "jsType", null);
        setField(term201257, term201257.getClass(), "parent", null);
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
        args[2] = term200592;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term200506, args);
        assertTrue(recursiveEquals(term200506, term201256));
        assertTrue(recursiveEquals(term200592, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


