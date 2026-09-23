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

public class ReferenceCollectingCallback_visit_87227317448 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9040;
     Object term9132;
     Object term9218;
     Object term9525;
     Object term9526;
     Object term9527;

    public ReferenceCollectingCallback_visit_87227317448() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9040 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term9132 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term9132, term9132.getClass(), "type", -39);
        term9218 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term9525 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term9525, term9525.getClass(), "referenceMap", null);
        setField(term9525, term9525.getClass(), "blockStack", null);
        setField(term9525, term9525.getClass(), "behavior", null);
        setField(term9525, term9525.getClass(), "compiler", null);
        setField(term9525, term9525.getClass(), "varFilter", null);
        term9526 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term9526, term9526.getClass(), "str", null);
        setIntField(term9526, term9526.getClass(), "type", -39);
        setField(term9526, term9526.getClass(), "next", null);
        setField(term9526, term9526.getClass(), "first", null);
        setField(term9526, term9526.getClass(), "last", null);
        setField(term9526, term9526.getClass(), "propListHead", null);
        setIntField(term9526, term9526.getClass(), "sourcePosition", 0);
        setField(term9526, term9526.getClass(), "jsType", null);
        setField(term9526, term9526.getClass(), "parent", null);
        term9527 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term9527, term9527.getClass(), "functionName", null);
        setBooleanField(term9527, term9527.getClass(), "itsNeedsActivation", false);
        setIntField(term9527, term9527.getClass(), "itsFunctionType", 0);
        setBooleanField(term9527, term9527.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term9527, term9527.getClass(), "encodedSourceStart", 0);
        setIntField(term9527, term9527.getClass(), "encodedSourceEnd", 0);
        setField(term9527, term9527.getClass(), "sourceName", null);
        setIntField(term9527, term9527.getClass(), "baseLineno", 0);
        setIntField(term9527, term9527.getClass(), "endLineno", 0);
        setField(term9527, term9527.getClass(), "functions", null);
        setField(term9527, term9527.getClass(), "regexps", null);
        setField(term9527, term9527.getClass(), "itsVariables", null);
        setField(term9527, term9527.getClass(), "itsConst", null);
        setField(term9527, term9527.getClass(), "itsVariableNames", null);
        setIntField(term9527, term9527.getClass(), "varStart", 0);
        setField(term9527, term9527.getClass(), "compilerData", null);
        setIntField(term9527, term9527.getClass(), "type", 0);
        setField(term9527, term9527.getClass(), "next", null);
        setField(term9527, term9527.getClass(), "first", null);
        setField(term9527, term9527.getClass(), "last", null);
        setField(term9527, term9527.getClass(), "propListHead", null);
        setIntField(term9527, term9527.getClass(), "sourcePosition", 0);
        setField(term9527, term9527.getClass(), "jsType", null);
        setField(term9527, term9527.getClass(), "parent", null);
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
        args[1] = term9132;
        args[2] = term9218;
        callMethod(klass, "visit", argTypes, term9040, args);
        assertTrue(recursiveEquals(term9040, term9525));
        assertTrue(recursiveEquals(term9132, term9527));
        assertTrue(recursiveEquals(term9218, null));
    }

};


