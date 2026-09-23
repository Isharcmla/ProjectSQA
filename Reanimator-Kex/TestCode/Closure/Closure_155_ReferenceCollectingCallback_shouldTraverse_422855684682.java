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

public class ReferenceCollectingCallback_shouldTraverse_422855684682 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179599;
     Object term179685;
     Object term179771;
     Object term180084;
     Object term180085;
     Object term180086;

    public ReferenceCollectingCallback_shouldTraverse_422855684682() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term179599 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term179685 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term179771 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term179771, term179771.getClass(), "type", 4);
        term180084 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term180084, term180084.getClass(), "referenceMap", null);
        setField(term180084, term180084.getClass(), "blockStack", null);
        setField(term180084, term180084.getClass(), "behavior", null);
        setField(term180084, term180084.getClass(), "compiler", null);
        setField(term180084, term180084.getClass(), "varFilter", null);
        term180085 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term180085, term180085.getClass(), "functionName", null);
        setBooleanField(term180085, term180085.getClass(), "itsNeedsActivation", false);
        setIntField(term180085, term180085.getClass(), "itsFunctionType", 0);
        setBooleanField(term180085, term180085.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term180085, term180085.getClass(), "encodedSourceStart", 0);
        setIntField(term180085, term180085.getClass(), "encodedSourceEnd", 0);
        setField(term180085, term180085.getClass(), "sourceName", null);
        setIntField(term180085, term180085.getClass(), "baseLineno", 0);
        setIntField(term180085, term180085.getClass(), "endLineno", 0);
        setField(term180085, term180085.getClass(), "functions", null);
        setField(term180085, term180085.getClass(), "regexps", null);
        setField(term180085, term180085.getClass(), "itsVariables", null);
        setField(term180085, term180085.getClass(), "itsConst", null);
        setField(term180085, term180085.getClass(), "itsVariableNames", null);
        setIntField(term180085, term180085.getClass(), "varStart", 0);
        setField(term180085, term180085.getClass(), "compilerData", null);
        setIntField(term180085, term180085.getClass(), "type", 4);
        setField(term180085, term180085.getClass(), "next", null);
        setField(term180085, term180085.getClass(), "first", null);
        setField(term180085, term180085.getClass(), "last", null);
        setField(term180085, term180085.getClass(), "propListHead", null);
        setIntField(term180085, term180085.getClass(), "sourcePosition", 0);
        setField(term180085, term180085.getClass(), "jsType", null);
        setField(term180085, term180085.getClass(), "parent", null);
        term180086 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term180086, term180086.getClass(), "functionName", null);
        setBooleanField(term180086, term180086.getClass(), "itsNeedsActivation", false);
        setIntField(term180086, term180086.getClass(), "itsFunctionType", 0);
        setBooleanField(term180086, term180086.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term180086, term180086.getClass(), "encodedSourceStart", 0);
        setIntField(term180086, term180086.getClass(), "encodedSourceEnd", 0);
        setField(term180086, term180086.getClass(), "sourceName", null);
        setIntField(term180086, term180086.getClass(), "baseLineno", 0);
        setIntField(term180086, term180086.getClass(), "endLineno", 0);
        setField(term180086, term180086.getClass(), "functions", null);
        setField(term180086, term180086.getClass(), "regexps", null);
        setField(term180086, term180086.getClass(), "itsVariables", null);
        setField(term180086, term180086.getClass(), "itsConst", null);
        setField(term180086, term180086.getClass(), "itsVariableNames", null);
        setIntField(term180086, term180086.getClass(), "varStart", 0);
        setField(term180086, term180086.getClass(), "compilerData", null);
        setIntField(term180086, term180086.getClass(), "type", 0);
        setField(term180086, term180086.getClass(), "next", null);
        setField(term180086, term180086.getClass(), "first", null);
        setField(term180086, term180086.getClass(), "last", null);
        setField(term180086, term180086.getClass(), "propListHead", null);
        setIntField(term180086, term180086.getClass(), "sourcePosition", 0);
        setField(term180086, term180086.getClass(), "jsType", null);
        setField(term180086, term180086.getClass(), "parent", null);
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
        args[1] = term179685;
        args[2] = term179771;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term179599, args);
        assertTrue(recursiveEquals(term179599, term180084));
        assertTrue(recursiveEquals(term179685, term180086));
        assertTrue(recursiveEquals(term179771, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


