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

public class ReferenceCollectingCallback_shouldTraverse_4228556841189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term319249;
     Object term319335;
     Object term319427;
     Object term319555;
     Object term319556;
     Object term319557;

    public ReferenceCollectingCallback_shouldTraverse_4228556841189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term319249 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term319335 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term319427 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term319427, term319427.getClass(), "type", 12);
        term319555 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term319555, term319555.getClass(), "referenceMap", null);
        setField(term319555, term319555.getClass(), "blockStack", null);
        setField(term319555, term319555.getClass(), "behavior", null);
        setField(term319555, term319555.getClass(), "compiler", null);
        setField(term319555, term319555.getClass(), "varFilter", null);
        term319556 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term319556, term319556.getClass(), "str", null);
        setIntField(term319556, term319556.getClass(), "type", 12);
        setField(term319556, term319556.getClass(), "next", null);
        setField(term319556, term319556.getClass(), "first", null);
        setField(term319556, term319556.getClass(), "last", null);
        setField(term319556, term319556.getClass(), "propListHead", null);
        setIntField(term319556, term319556.getClass(), "sourcePosition", 0);
        setField(term319556, term319556.getClass(), "jsType", null);
        setField(term319556, term319556.getClass(), "parent", null);
        term319557 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term319557, term319557.getClass(), "functionName", null);
        setBooleanField(term319557, term319557.getClass(), "itsNeedsActivation", false);
        setIntField(term319557, term319557.getClass(), "itsFunctionType", 0);
        setBooleanField(term319557, term319557.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term319557, term319557.getClass(), "encodedSourceStart", 0);
        setIntField(term319557, term319557.getClass(), "encodedSourceEnd", 0);
        setField(term319557, term319557.getClass(), "sourceName", null);
        setIntField(term319557, term319557.getClass(), "baseLineno", 0);
        setIntField(term319557, term319557.getClass(), "endLineno", 0);
        setField(term319557, term319557.getClass(), "functions", null);
        setField(term319557, term319557.getClass(), "regexps", null);
        setField(term319557, term319557.getClass(), "itsVariables", null);
        setField(term319557, term319557.getClass(), "itsConst", null);
        setField(term319557, term319557.getClass(), "itsVariableNames", null);
        setIntField(term319557, term319557.getClass(), "varStart", 0);
        setField(term319557, term319557.getClass(), "compilerData", null);
        setIntField(term319557, term319557.getClass(), "type", 0);
        setField(term319557, term319557.getClass(), "next", null);
        setField(term319557, term319557.getClass(), "first", null);
        setField(term319557, term319557.getClass(), "last", null);
        setField(term319557, term319557.getClass(), "propListHead", null);
        setIntField(term319557, term319557.getClass(), "sourcePosition", 0);
        setField(term319557, term319557.getClass(), "jsType", null);
        setField(term319557, term319557.getClass(), "parent", null);
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
        args[1] = term319335;
        args[2] = term319427;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term319249, args);
        assertTrue(recursiveEquals(term319249, term319555));
        assertTrue(recursiveEquals(term319335, term319557));
        assertTrue(recursiveEquals(term319427, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


