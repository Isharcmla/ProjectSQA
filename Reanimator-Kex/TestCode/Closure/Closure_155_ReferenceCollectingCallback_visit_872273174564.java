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

public class ReferenceCollectingCallback_visit_872273174564 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144818;
     Object term145042;
     Object term144996;
     Object term145907;
     Object term145908;
     Object term145909;

    public ReferenceCollectingCallback_visit_872273174564() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term144818 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term145042 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term145042, term145042.getClass(), "type", 0);
        term144996 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term144996, term144996.getClass(), "type", 100);
        setField(term144996, term144996.getClass(), "first", term145042);
        term145907 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term145907, term145907.getClass(), "referenceMap", null);
        setField(term145907, term145907.getClass(), "blockStack", null);
        setField(term145907, term145907.getClass(), "behavior", null);
        setField(term145907, term145907.getClass(), "compiler", null);
        setField(term145907, term145907.getClass(), "varFilter", null);
        term145908 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term145908, term145908.getClass(), "number", 0.0);
        setIntField(term145908, term145908.getClass(), "type", 0);
        setField(term145908, term145908.getClass(), "next", null);
        setField(term145908, term145908.getClass(), "first", null);
        setField(term145908, term145908.getClass(), "last", null);
        setField(term145908, term145908.getClass(), "propListHead", null);
        setIntField(term145908, term145908.getClass(), "sourcePosition", 0);
        setField(term145908, term145908.getClass(), "jsType", null);
        setField(term145908, term145908.getClass(), "parent", null);
        term145909 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term145910 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term145909, term145909.getClass(), "functionName", null);
        setBooleanField(term145909, term145909.getClass(), "itsNeedsActivation", false);
        setIntField(term145909, term145909.getClass(), "itsFunctionType", 0);
        setBooleanField(term145909, term145909.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term145909, term145909.getClass(), "encodedSourceStart", 0);
        setIntField(term145909, term145909.getClass(), "encodedSourceEnd", 0);
        setField(term145909, term145909.getClass(), "sourceName", null);
        setIntField(term145909, term145909.getClass(), "baseLineno", 0);
        setIntField(term145909, term145909.getClass(), "endLineno", 0);
        setField(term145909, term145909.getClass(), "functions", null);
        setField(term145909, term145909.getClass(), "regexps", null);
        setField(term145909, term145909.getClass(), "itsVariables", null);
        setField(term145909, term145909.getClass(), "itsConst", null);
        setField(term145909, term145909.getClass(), "itsVariableNames", null);
        setIntField(term145909, term145909.getClass(), "varStart", 0);
        setField(term145909, term145909.getClass(), "compilerData", null);
        setIntField(term145909, term145909.getClass(), "type", 100);
        setField(term145909, term145909.getClass(), "next", null);
        setDoubleField(term145910, term145910.getClass(), "number", 0.0);
        setIntField(term145910, term145910.getClass(), "type", 0);
        setField(term145910, term145910.getClass(), "next", null);
        setField(term145910, term145910.getClass(), "first", null);
        setField(term145910, term145910.getClass(), "last", null);
        setField(term145910, term145910.getClass(), "propListHead", null);
        setIntField(term145910, term145910.getClass(), "sourcePosition", 0);
        setField(term145910, term145910.getClass(), "jsType", null);
        setField(term145910, term145910.getClass(), "parent", null);
        setField(term145909, term145909.getClass(), "first", term145910);
        setField(term145909, term145909.getClass(), "last", null);
        setField(term145909, term145909.getClass(), "propListHead", null);
        setIntField(term145909, term145909.getClass(), "sourcePosition", 0);
        setField(term145909, term145909.getClass(), "jsType", null);
        setField(term145909, term145909.getClass(), "parent", null);
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
        args[1] = term145042;
        args[2] = term144996;
        callMethod(klass, "visit", argTypes, term144818, args);
        assertTrue(recursiveEquals(term144818, term145907));
        assertTrue(recursiveEquals(term145042, term145909));
        assertTrue(recursiveEquals(term144996, null));
    }

};


