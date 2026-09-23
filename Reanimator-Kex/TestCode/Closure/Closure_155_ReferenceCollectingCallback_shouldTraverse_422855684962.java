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
import java.util.ArrayDeque;

public class ReferenceCollectingCallback_shouldTraverse_422855684962 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245421;
     Object term245561;
     Object term245647;
     Object term245964;
     Object term245968;
     Object term245969;

    public ReferenceCollectingCallback_shouldTraverse_422855684962() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term245475 = new ArrayDeque();
        term245421 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term245421, term245421.getClass(), "blockStack", term245475);
        term245561 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term245561, term245561.getClass(), "type", 111);
        term245647 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term245647, term245647.getClass(), "type", 111);
        ArrayDeque term245965 = new ArrayDeque();
        term245964 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term245964, term245964.getClass(), "referenceMap", null);
        setField(term245964, term245964.getClass(), "blockStack", term245965);
        setField(term245964, term245964.getClass(), "behavior", null);
        setField(term245964, term245964.getClass(), "compiler", null);
        setField(term245964, term245964.getClass(), "varFilter", null);
        term245968 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term245968, term245968.getClass(), "functionName", null);
        setBooleanField(term245968, term245968.getClass(), "itsNeedsActivation", false);
        setIntField(term245968, term245968.getClass(), "itsFunctionType", 0);
        setBooleanField(term245968, term245968.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term245968, term245968.getClass(), "encodedSourceStart", 0);
        setIntField(term245968, term245968.getClass(), "encodedSourceEnd", 0);
        setField(term245968, term245968.getClass(), "sourceName", null);
        setIntField(term245968, term245968.getClass(), "baseLineno", 0);
        setIntField(term245968, term245968.getClass(), "endLineno", 0);
        setField(term245968, term245968.getClass(), "functions", null);
        setField(term245968, term245968.getClass(), "regexps", null);
        setField(term245968, term245968.getClass(), "itsVariables", null);
        setField(term245968, term245968.getClass(), "itsConst", null);
        setField(term245968, term245968.getClass(), "itsVariableNames", null);
        setIntField(term245968, term245968.getClass(), "varStart", 0);
        setField(term245968, term245968.getClass(), "compilerData", null);
        setIntField(term245968, term245968.getClass(), "type", 111);
        setField(term245968, term245968.getClass(), "next", null);
        setField(term245968, term245968.getClass(), "first", null);
        setField(term245968, term245968.getClass(), "last", null);
        setField(term245968, term245968.getClass(), "propListHead", null);
        setIntField(term245968, term245968.getClass(), "sourcePosition", 0);
        setField(term245968, term245968.getClass(), "jsType", null);
        setField(term245968, term245968.getClass(), "parent", null);
        term245969 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term245969, term245969.getClass(), "functionName", null);
        setBooleanField(term245969, term245969.getClass(), "itsNeedsActivation", false);
        setIntField(term245969, term245969.getClass(), "itsFunctionType", 0);
        setBooleanField(term245969, term245969.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term245969, term245969.getClass(), "encodedSourceStart", 0);
        setIntField(term245969, term245969.getClass(), "encodedSourceEnd", 0);
        setField(term245969, term245969.getClass(), "sourceName", null);
        setIntField(term245969, term245969.getClass(), "baseLineno", 0);
        setIntField(term245969, term245969.getClass(), "endLineno", 0);
        setField(term245969, term245969.getClass(), "functions", null);
        setField(term245969, term245969.getClass(), "regexps", null);
        setField(term245969, term245969.getClass(), "itsVariables", null);
        setField(term245969, term245969.getClass(), "itsConst", null);
        setField(term245969, term245969.getClass(), "itsVariableNames", null);
        setIntField(term245969, term245969.getClass(), "varStart", 0);
        setField(term245969, term245969.getClass(), "compilerData", null);
        setIntField(term245969, term245969.getClass(), "type", 111);
        setField(term245969, term245969.getClass(), "next", null);
        setField(term245969, term245969.getClass(), "first", null);
        setField(term245969, term245969.getClass(), "last", null);
        setField(term245969, term245969.getClass(), "propListHead", null);
        setIntField(term245969, term245969.getClass(), "sourcePosition", 0);
        setField(term245969, term245969.getClass(), "jsType", null);
        setField(term245969, term245969.getClass(), "parent", null);
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
        args[1] = term245561;
        args[2] = term245647;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term245421, args);
        assertTrue(recursiveEquals(term245421, term245964));
        assertTrue(recursiveEquals(term245561, term245969));
        assertTrue(recursiveEquals(term245647, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


