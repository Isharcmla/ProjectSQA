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

public class ReferenceCollectingCallback_visit_872273174216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51066;
     Object term51158;
     Object term51244;
     Object term51966;
     Object term51967;
     Object term51968;

    public ReferenceCollectingCallback_visit_872273174216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51066 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term51158 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term51158, term51158.getClass(), "type", -39);
        term51244 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term51966 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term51966, term51966.getClass(), "referenceMap", null);
        setField(term51966, term51966.getClass(), "blockStack", null);
        setField(term51966, term51966.getClass(), "behavior", null);
        setField(term51966, term51966.getClass(), "compiler", null);
        setField(term51966, term51966.getClass(), "varFilter", null);
        term51967 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term51967, term51967.getClass(), "str", null);
        setIntField(term51967, term51967.getClass(), "type", -39);
        setField(term51967, term51967.getClass(), "next", null);
        setField(term51967, term51967.getClass(), "first", null);
        setField(term51967, term51967.getClass(), "last", null);
        setField(term51967, term51967.getClass(), "propListHead", null);
        setIntField(term51967, term51967.getClass(), "sourcePosition", 0);
        setField(term51967, term51967.getClass(), "jsType", null);
        setField(term51967, term51967.getClass(), "parent", null);
        term51968 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term51968, term51968.getClass(), "functionName", null);
        setBooleanField(term51968, term51968.getClass(), "itsNeedsActivation", false);
        setIntField(term51968, term51968.getClass(), "itsFunctionType", 0);
        setBooleanField(term51968, term51968.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term51968, term51968.getClass(), "encodedSourceStart", 0);
        setIntField(term51968, term51968.getClass(), "encodedSourceEnd", 0);
        setField(term51968, term51968.getClass(), "sourceName", null);
        setIntField(term51968, term51968.getClass(), "baseLineno", 0);
        setIntField(term51968, term51968.getClass(), "endLineno", 0);
        setField(term51968, term51968.getClass(), "functions", null);
        setField(term51968, term51968.getClass(), "regexps", null);
        setField(term51968, term51968.getClass(), "itsVariables", null);
        setField(term51968, term51968.getClass(), "itsConst", null);
        setField(term51968, term51968.getClass(), "itsVariableNames", null);
        setIntField(term51968, term51968.getClass(), "varStart", 0);
        setField(term51968, term51968.getClass(), "compilerData", null);
        setIntField(term51968, term51968.getClass(), "type", 0);
        setField(term51968, term51968.getClass(), "next", null);
        setField(term51968, term51968.getClass(), "first", null);
        setField(term51968, term51968.getClass(), "last", null);
        setField(term51968, term51968.getClass(), "propListHead", null);
        setIntField(term51968, term51968.getClass(), "sourcePosition", 0);
        setField(term51968, term51968.getClass(), "jsType", null);
        setField(term51968, term51968.getClass(), "parent", null);
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
        args[1] = term51158;
        args[2] = term51244;
        callMethod(klass, "visit", argTypes, term51066, args);
        assertTrue(recursiveEquals(term51066, term51966));
        assertTrue(recursiveEquals(term51158, term51968));
        assertTrue(recursiveEquals(term51244, null));
    }

};


