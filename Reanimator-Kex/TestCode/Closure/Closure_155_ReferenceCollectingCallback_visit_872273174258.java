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

public class ReferenceCollectingCallback_visit_872273174258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62181;
     Object term62273;
     Object term62359;
     Object term62450;
     Object term62451;
     Object term62452;

    public ReferenceCollectingCallback_visit_872273174258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62181 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term62273 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term62273, term62273.getClass(), "type", -39);
        term62359 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term62450 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term62450, term62450.getClass(), "referenceMap", null);
        setField(term62450, term62450.getClass(), "blockStack", null);
        setField(term62450, term62450.getClass(), "behavior", null);
        setField(term62450, term62450.getClass(), "compiler", null);
        setField(term62450, term62450.getClass(), "varFilter", null);
        term62451 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term62451, term62451.getClass(), "number", 0.0);
        setIntField(term62451, term62451.getClass(), "type", -39);
        setField(term62451, term62451.getClass(), "next", null);
        setField(term62451, term62451.getClass(), "first", null);
        setField(term62451, term62451.getClass(), "last", null);
        setField(term62451, term62451.getClass(), "propListHead", null);
        setIntField(term62451, term62451.getClass(), "sourcePosition", 0);
        setField(term62451, term62451.getClass(), "jsType", null);
        setField(term62451, term62451.getClass(), "parent", null);
        term62452 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term62452, term62452.getClass(), "functionName", null);
        setBooleanField(term62452, term62452.getClass(), "itsNeedsActivation", false);
        setIntField(term62452, term62452.getClass(), "itsFunctionType", 0);
        setBooleanField(term62452, term62452.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term62452, term62452.getClass(), "encodedSourceStart", 0);
        setIntField(term62452, term62452.getClass(), "encodedSourceEnd", 0);
        setField(term62452, term62452.getClass(), "sourceName", null);
        setIntField(term62452, term62452.getClass(), "baseLineno", 0);
        setIntField(term62452, term62452.getClass(), "endLineno", 0);
        setField(term62452, term62452.getClass(), "functions", null);
        setField(term62452, term62452.getClass(), "regexps", null);
        setField(term62452, term62452.getClass(), "itsVariables", null);
        setField(term62452, term62452.getClass(), "itsConst", null);
        setField(term62452, term62452.getClass(), "itsVariableNames", null);
        setIntField(term62452, term62452.getClass(), "varStart", 0);
        setField(term62452, term62452.getClass(), "compilerData", null);
        setIntField(term62452, term62452.getClass(), "type", 0);
        setField(term62452, term62452.getClass(), "next", null);
        setField(term62452, term62452.getClass(), "first", null);
        setField(term62452, term62452.getClass(), "last", null);
        setField(term62452, term62452.getClass(), "propListHead", null);
        setIntField(term62452, term62452.getClass(), "sourcePosition", 0);
        setField(term62452, term62452.getClass(), "jsType", null);
        setField(term62452, term62452.getClass(), "parent", null);
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
        args[1] = term62273;
        args[2] = term62359;
        callMethod(klass, "visit", argTypes, term62181, args);
        assertTrue(recursiveEquals(term62181, term62450));
        assertTrue(recursiveEquals(term62273, term62452));
        assertTrue(recursiveEquals(term62359, null));
    }

};


