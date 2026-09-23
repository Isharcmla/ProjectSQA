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

public class ReferenceCollectingCallback_shouldTraverse_422855684660 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178402;
     Object term178488;
     Object term178997;
     Object term178998;

    public ReferenceCollectingCallback_shouldTraverse_422855684660() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term178402 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term178488 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term178488, term178488.getClass(), "type", 108);
        term178997 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term178997, term178997.getClass(), "referenceMap", null);
        setField(term178997, term178997.getClass(), "blockStack", null);
        setField(term178997, term178997.getClass(), "behavior", null);
        setField(term178997, term178997.getClass(), "compiler", null);
        setField(term178997, term178997.getClass(), "varFilter", null);
        term178998 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term178998, term178998.getClass(), "functionName", null);
        setBooleanField(term178998, term178998.getClass(), "itsNeedsActivation", false);
        setIntField(term178998, term178998.getClass(), "itsFunctionType", 0);
        setBooleanField(term178998, term178998.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term178998, term178998.getClass(), "encodedSourceStart", 0);
        setIntField(term178998, term178998.getClass(), "encodedSourceEnd", 0);
        setField(term178998, term178998.getClass(), "sourceName", null);
        setIntField(term178998, term178998.getClass(), "baseLineno", 0);
        setIntField(term178998, term178998.getClass(), "endLineno", 0);
        setField(term178998, term178998.getClass(), "functions", null);
        setField(term178998, term178998.getClass(), "regexps", null);
        setField(term178998, term178998.getClass(), "itsVariables", null);
        setField(term178998, term178998.getClass(), "itsConst", null);
        setField(term178998, term178998.getClass(), "itsVariableNames", null);
        setIntField(term178998, term178998.getClass(), "varStart", 0);
        setField(term178998, term178998.getClass(), "compilerData", null);
        setIntField(term178998, term178998.getClass(), "type", 108);
        setField(term178998, term178998.getClass(), "next", null);
        setField(term178998, term178998.getClass(), "first", null);
        setField(term178998, term178998.getClass(), "last", null);
        setField(term178998, term178998.getClass(), "propListHead", null);
        setIntField(term178998, term178998.getClass(), "sourcePosition", 0);
        setField(term178998, term178998.getClass(), "jsType", null);
        setField(term178998, term178998.getClass(), "parent", null);
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
        args[2] = term178488;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term178402, args);
        assertTrue(recursiveEquals(term178402, term178997));
        assertTrue(recursiveEquals(term178488, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


