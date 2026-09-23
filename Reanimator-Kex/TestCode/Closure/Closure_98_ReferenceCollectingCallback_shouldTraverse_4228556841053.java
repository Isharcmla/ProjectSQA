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

public class ReferenceCollectingCallback_shouldTraverse_4228556841053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term292582;
     Object term292668;
     Object term292760;
     Object term293213;
     Object term293214;
     Object term293215;

    public ReferenceCollectingCallback_shouldTraverse_4228556841053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term292582 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term292668 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term292760 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term292760, term292760.getClass(), "type", 12);
        term293213 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term293213, term293213.getClass(), "referenceMap", null);
        setField(term293213, term293213.getClass(), "blockStack", null);
        setField(term293213, term293213.getClass(), "behavior", null);
        setField(term293213, term293213.getClass(), "compiler", null);
        setField(term293213, term293213.getClass(), "varFilter", null);
        term293214 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term293214, term293214.getClass(), "number", 0.0);
        setIntField(term293214, term293214.getClass(), "type", 12);
        setField(term293214, term293214.getClass(), "next", null);
        setField(term293214, term293214.getClass(), "first", null);
        setField(term293214, term293214.getClass(), "last", null);
        setField(term293214, term293214.getClass(), "propListHead", null);
        setIntField(term293214, term293214.getClass(), "sourcePosition", 0);
        setField(term293214, term293214.getClass(), "jsType", null);
        setField(term293214, term293214.getClass(), "parent", null);
        term293215 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term293215, term293215.getClass(), "functionName", null);
        setBooleanField(term293215, term293215.getClass(), "itsNeedsActivation", false);
        setIntField(term293215, term293215.getClass(), "itsFunctionType", 0);
        setBooleanField(term293215, term293215.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term293215, term293215.getClass(), "encodedSourceStart", 0);
        setIntField(term293215, term293215.getClass(), "encodedSourceEnd", 0);
        setField(term293215, term293215.getClass(), "sourceName", null);
        setIntField(term293215, term293215.getClass(), "baseLineno", 0);
        setIntField(term293215, term293215.getClass(), "endLineno", 0);
        setField(term293215, term293215.getClass(), "functions", null);
        setField(term293215, term293215.getClass(), "regexps", null);
        setField(term293215, term293215.getClass(), "itsVariables", null);
        setField(term293215, term293215.getClass(), "itsConst", null);
        setField(term293215, term293215.getClass(), "itsVariableNames", null);
        setIntField(term293215, term293215.getClass(), "varStart", 0);
        setField(term293215, term293215.getClass(), "compilerData", null);
        setIntField(term293215, term293215.getClass(), "type", 0);
        setField(term293215, term293215.getClass(), "next", null);
        setField(term293215, term293215.getClass(), "first", null);
        setField(term293215, term293215.getClass(), "last", null);
        setField(term293215, term293215.getClass(), "propListHead", null);
        setIntField(term293215, term293215.getClass(), "sourcePosition", 0);
        setField(term293215, term293215.getClass(), "jsType", null);
        setField(term293215, term293215.getClass(), "parent", null);
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
        args[1] = term292668;
        args[2] = term292760;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term292582, args);
        assertTrue(recursiveEquals(term292582, term293213));
        assertTrue(recursiveEquals(term292668, term293215));
        assertTrue(recursiveEquals(term292760, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


