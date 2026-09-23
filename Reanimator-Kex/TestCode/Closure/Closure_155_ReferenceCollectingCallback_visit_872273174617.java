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

public class ReferenceCollectingCallback_visit_872273174617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term161717;
     Object term161938;
     Object term161895;
     Object term162360;
     Object term162361;
     Object term162362;

    public ReferenceCollectingCallback_visit_872273174617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term161717 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term161938 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term161938, term161938.getClass(), "type", 0);
        term161895 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term161895, term161895.getClass(), "type", 100);
        setField(term161895, term161895.getClass(), "first", term161938);
        term162360 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term162360, term162360.getClass(), "referenceMap", null);
        setField(term162360, term162360.getClass(), "blockStack", null);
        setField(term162360, term162360.getClass(), "behavior", null);
        setField(term162360, term162360.getClass(), "compiler", null);
        setField(term162360, term162360.getClass(), "varFilter", null);
        term162361 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term162361, term162361.getClass(), "functionName", null);
        setBooleanField(term162361, term162361.getClass(), "itsNeedsActivation", false);
        setIntField(term162361, term162361.getClass(), "itsFunctionType", 0);
        setBooleanField(term162361, term162361.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term162361, term162361.getClass(), "encodedSourceStart", 0);
        setIntField(term162361, term162361.getClass(), "encodedSourceEnd", 0);
        setField(term162361, term162361.getClass(), "sourceName", null);
        setIntField(term162361, term162361.getClass(), "baseLineno", 0);
        setIntField(term162361, term162361.getClass(), "endLineno", 0);
        setField(term162361, term162361.getClass(), "functions", null);
        setField(term162361, term162361.getClass(), "regexps", null);
        setField(term162361, term162361.getClass(), "itsVariables", null);
        setField(term162361, term162361.getClass(), "itsConst", null);
        setField(term162361, term162361.getClass(), "itsVariableNames", null);
        setIntField(term162361, term162361.getClass(), "varStart", 0);
        setField(term162361, term162361.getClass(), "compilerData", null);
        setIntField(term162361, term162361.getClass(), "type", 0);
        setField(term162361, term162361.getClass(), "next", null);
        setField(term162361, term162361.getClass(), "first", null);
        setField(term162361, term162361.getClass(), "last", null);
        setField(term162361, term162361.getClass(), "propListHead", null);
        setIntField(term162361, term162361.getClass(), "sourcePosition", 0);
        setField(term162361, term162361.getClass(), "jsType", null);
        setField(term162361, term162361.getClass(), "parent", null);
        term162362 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term162363 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term162362, term162362.getClass(), "number", 0.0);
        setIntField(term162362, term162362.getClass(), "type", 100);
        setField(term162362, term162362.getClass(), "next", null);
        setField(term162363, term162363.getClass(), "functionName", null);
        setBooleanField(term162363, term162363.getClass(), "itsNeedsActivation", false);
        setIntField(term162363, term162363.getClass(), "itsFunctionType", 0);
        setBooleanField(term162363, term162363.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term162363, term162363.getClass(), "encodedSourceStart", 0);
        setIntField(term162363, term162363.getClass(), "encodedSourceEnd", 0);
        setField(term162363, term162363.getClass(), "sourceName", null);
        setIntField(term162363, term162363.getClass(), "baseLineno", 0);
        setIntField(term162363, term162363.getClass(), "endLineno", 0);
        setField(term162363, term162363.getClass(), "functions", null);
        setField(term162363, term162363.getClass(), "regexps", null);
        setField(term162363, term162363.getClass(), "itsVariables", null);
        setField(term162363, term162363.getClass(), "itsConst", null);
        setField(term162363, term162363.getClass(), "itsVariableNames", null);
        setIntField(term162363, term162363.getClass(), "varStart", 0);
        setField(term162363, term162363.getClass(), "compilerData", null);
        setIntField(term162363, term162363.getClass(), "type", 0);
        setField(term162363, term162363.getClass(), "next", null);
        setField(term162363, term162363.getClass(), "first", null);
        setField(term162363, term162363.getClass(), "last", null);
        setField(term162363, term162363.getClass(), "propListHead", null);
        setIntField(term162363, term162363.getClass(), "sourcePosition", 0);
        setField(term162363, term162363.getClass(), "jsType", null);
        setField(term162363, term162363.getClass(), "parent", null);
        setField(term162362, term162362.getClass(), "first", term162363);
        setField(term162362, term162362.getClass(), "last", null);
        setField(term162362, term162362.getClass(), "propListHead", null);
        setIntField(term162362, term162362.getClass(), "sourcePosition", 0);
        setField(term162362, term162362.getClass(), "jsType", null);
        setField(term162362, term162362.getClass(), "parent", null);
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
        args[1] = term161938;
        args[2] = term161895;
        callMethod(klass, "visit", argTypes, term161717, args);
        assertTrue(recursiveEquals(term161717, term162360));
        assertTrue(recursiveEquals(term161938, term162362));
        assertTrue(recursiveEquals(term161895, null));
    }

};


