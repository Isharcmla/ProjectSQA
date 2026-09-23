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

public class ReferenceCollectingCallback_visit_872273174600 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163123;
     Object term163347;
     Object term163301;
     Object term164098;
     Object term164099;
     Object term164100;

    public ReferenceCollectingCallback_visit_872273174600() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term163123 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term163347 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term163347, term163347.getClass(), "type", 0);
        term163301 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term163301, term163301.getClass(), "type", 101);
        setField(term163301, term163301.getClass(), "first", term163347);
        term164098 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term164098, term164098.getClass(), "referenceMap", null);
        setField(term164098, term164098.getClass(), "blockStack", null);
        setField(term164098, term164098.getClass(), "behavior", null);
        setField(term164098, term164098.getClass(), "compiler", null);
        setField(term164098, term164098.getClass(), "varFilter", null);
        term164099 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term164099, term164099.getClass(), "number", 0.0);
        setIntField(term164099, term164099.getClass(), "type", 0);
        setField(term164099, term164099.getClass(), "next", null);
        setField(term164099, term164099.getClass(), "first", null);
        setField(term164099, term164099.getClass(), "last", null);
        setField(term164099, term164099.getClass(), "propListHead", null);
        setIntField(term164099, term164099.getClass(), "sourcePosition", 0);
        setField(term164099, term164099.getClass(), "jsType", null);
        setField(term164099, term164099.getClass(), "parent", null);
        term164100 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term164101 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term164100, term164100.getClass(), "functionName", null);
        setBooleanField(term164100, term164100.getClass(), "itsNeedsActivation", false);
        setIntField(term164100, term164100.getClass(), "itsFunctionType", 0);
        setBooleanField(term164100, term164100.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term164100, term164100.getClass(), "encodedSourceStart", 0);
        setIntField(term164100, term164100.getClass(), "encodedSourceEnd", 0);
        setField(term164100, term164100.getClass(), "sourceName", null);
        setIntField(term164100, term164100.getClass(), "baseLineno", 0);
        setIntField(term164100, term164100.getClass(), "endLineno", 0);
        setField(term164100, term164100.getClass(), "functions", null);
        setField(term164100, term164100.getClass(), "regexps", null);
        setField(term164100, term164100.getClass(), "itsVariables", null);
        setField(term164100, term164100.getClass(), "itsConst", null);
        setField(term164100, term164100.getClass(), "itsVariableNames", null);
        setIntField(term164100, term164100.getClass(), "varStart", 0);
        setField(term164100, term164100.getClass(), "compilerData", null);
        setIntField(term164100, term164100.getClass(), "type", 101);
        setField(term164100, term164100.getClass(), "next", null);
        setDoubleField(term164101, term164101.getClass(), "number", 0.0);
        setIntField(term164101, term164101.getClass(), "type", 0);
        setField(term164101, term164101.getClass(), "next", null);
        setField(term164101, term164101.getClass(), "first", null);
        setField(term164101, term164101.getClass(), "last", null);
        setField(term164101, term164101.getClass(), "propListHead", null);
        setIntField(term164101, term164101.getClass(), "sourcePosition", 0);
        setField(term164101, term164101.getClass(), "jsType", null);
        setField(term164101, term164101.getClass(), "parent", null);
        setField(term164100, term164100.getClass(), "first", term164101);
        setField(term164100, term164100.getClass(), "last", null);
        setField(term164100, term164100.getClass(), "propListHead", null);
        setIntField(term164100, term164100.getClass(), "sourcePosition", 0);
        setField(term164100, term164100.getClass(), "jsType", null);
        setField(term164100, term164100.getClass(), "parent", null);
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
        args[1] = term163347;
        args[2] = term163301;
        callMethod(klass, "visit", argTypes, term163123, args);
        assertTrue(recursiveEquals(term163123, term164098));
        assertTrue(recursiveEquals(term163347, term164100));
        assertTrue(recursiveEquals(term163301, null));
    }

};


