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

public class ReferenceCollectingCallback_visit_872273174421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111996;
     Object term112220;
     Object term112174;
     Object term112618;
     Object term112619;
     Object term112620;

    public ReferenceCollectingCallback_visit_872273174421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111996 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term112220 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term112220, term112220.getClass(), "type", 0);
        term112174 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term112174, term112174.getClass(), "type", 98);
        setField(term112174, term112174.getClass(), "first", term112220);
        term112618 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term112618, term112618.getClass(), "referenceMap", null);
        setField(term112618, term112618.getClass(), "blockStack", null);
        setField(term112618, term112618.getClass(), "behavior", null);
        setField(term112618, term112618.getClass(), "compiler", null);
        setField(term112618, term112618.getClass(), "varFilter", null);
        term112619 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term112619, term112619.getClass(), "str", null);
        setIntField(term112619, term112619.getClass(), "type", 0);
        setField(term112619, term112619.getClass(), "next", null);
        setField(term112619, term112619.getClass(), "first", null);
        setField(term112619, term112619.getClass(), "last", null);
        setField(term112619, term112619.getClass(), "propListHead", null);
        setIntField(term112619, term112619.getClass(), "sourcePosition", 0);
        setField(term112619, term112619.getClass(), "jsType", null);
        setField(term112619, term112619.getClass(), "parent", null);
        term112620 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term112621 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term112620, term112620.getClass(), "functionName", null);
        setBooleanField(term112620, term112620.getClass(), "itsNeedsActivation", false);
        setIntField(term112620, term112620.getClass(), "itsFunctionType", 0);
        setBooleanField(term112620, term112620.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term112620, term112620.getClass(), "encodedSourceStart", 0);
        setIntField(term112620, term112620.getClass(), "encodedSourceEnd", 0);
        setField(term112620, term112620.getClass(), "sourceName", null);
        setIntField(term112620, term112620.getClass(), "baseLineno", 0);
        setIntField(term112620, term112620.getClass(), "endLineno", 0);
        setField(term112620, term112620.getClass(), "functions", null);
        setField(term112620, term112620.getClass(), "regexps", null);
        setField(term112620, term112620.getClass(), "itsVariables", null);
        setField(term112620, term112620.getClass(), "itsConst", null);
        setField(term112620, term112620.getClass(), "itsVariableNames", null);
        setIntField(term112620, term112620.getClass(), "varStart", 0);
        setField(term112620, term112620.getClass(), "compilerData", null);
        setIntField(term112620, term112620.getClass(), "type", 98);
        setField(term112620, term112620.getClass(), "next", null);
        setField(term112621, term112621.getClass(), "str", null);
        setIntField(term112621, term112621.getClass(), "type", 0);
        setField(term112621, term112621.getClass(), "next", null);
        setField(term112621, term112621.getClass(), "first", null);
        setField(term112621, term112621.getClass(), "last", null);
        setField(term112621, term112621.getClass(), "propListHead", null);
        setIntField(term112621, term112621.getClass(), "sourcePosition", 0);
        setField(term112621, term112621.getClass(), "jsType", null);
        setField(term112621, term112621.getClass(), "parent", null);
        setField(term112620, term112620.getClass(), "first", term112621);
        setField(term112620, term112620.getClass(), "last", null);
        setField(term112620, term112620.getClass(), "propListHead", null);
        setIntField(term112620, term112620.getClass(), "sourcePosition", 0);
        setField(term112620, term112620.getClass(), "jsType", null);
        setField(term112620, term112620.getClass(), "parent", null);
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
        args[1] = term112220;
        args[2] = term112174;
        callMethod(klass, "visit", argTypes, term111996, args);
        assertTrue(recursiveEquals(term111996, term112618));
        assertTrue(recursiveEquals(term112220, term112620));
        assertTrue(recursiveEquals(term112174, null));
    }

};


