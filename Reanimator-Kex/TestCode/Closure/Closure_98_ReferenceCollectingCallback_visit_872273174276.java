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

public class ReferenceCollectingCallback_visit_872273174276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71193;
     Object term71279;
     Object term71461;
     Object term71462;

    public ReferenceCollectingCallback_visit_872273174276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71193 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term71279 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term71461 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term71461, term71461.getClass(), "referenceMap", null);
        setField(term71461, term71461.getClass(), "blockStack", null);
        setField(term71461, term71461.getClass(), "behavior", null);
        setField(term71461, term71461.getClass(), "compiler", null);
        setField(term71461, term71461.getClass(), "varFilter", null);
        term71462 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term71462, term71462.getClass(), "functionName", null);
        setBooleanField(term71462, term71462.getClass(), "itsNeedsActivation", false);
        setIntField(term71462, term71462.getClass(), "itsFunctionType", 0);
        setBooleanField(term71462, term71462.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term71462, term71462.getClass(), "encodedSourceStart", 0);
        setIntField(term71462, term71462.getClass(), "encodedSourceEnd", 0);
        setField(term71462, term71462.getClass(), "sourceName", null);
        setIntField(term71462, term71462.getClass(), "baseLineno", 0);
        setIntField(term71462, term71462.getClass(), "endLineno", 0);
        setField(term71462, term71462.getClass(), "functions", null);
        setField(term71462, term71462.getClass(), "regexps", null);
        setField(term71462, term71462.getClass(), "itsVariables", null);
        setField(term71462, term71462.getClass(), "itsConst", null);
        setField(term71462, term71462.getClass(), "itsVariableNames", null);
        setIntField(term71462, term71462.getClass(), "varStart", 0);
        setField(term71462, term71462.getClass(), "compilerData", null);
        setIntField(term71462, term71462.getClass(), "type", 0);
        setField(term71462, term71462.getClass(), "next", null);
        setField(term71462, term71462.getClass(), "first", null);
        setField(term71462, term71462.getClass(), "last", null);
        setField(term71462, term71462.getClass(), "propListHead", null);
        setIntField(term71462, term71462.getClass(), "sourcePosition", 0);
        setField(term71462, term71462.getClass(), "jsType", null);
        setField(term71462, term71462.getClass(), "parent", null);
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
        args[1] = term71279;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term71193, args);
        assertTrue(recursiveEquals(term71193, term71461));
        assertTrue(recursiveEquals(term71279, null));
    }

};


