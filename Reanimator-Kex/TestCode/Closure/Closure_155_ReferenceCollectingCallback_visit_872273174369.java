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

public class ReferenceCollectingCallback_visit_872273174369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87109;
     Object term87333;
     Object term87287;
     Object term87641;
     Object term87642;
     Object term87643;

    public ReferenceCollectingCallback_visit_872273174369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87109 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term87333 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term87333, term87333.getClass(), "type", 0);
        term87287 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term87287, term87287.getClass(), "type", 108);
        setField(term87287, term87287.getClass(), "first", term87333);
        term87641 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term87641, term87641.getClass(), "referenceMap", null);
        setField(term87641, term87641.getClass(), "blockStack", null);
        setField(term87641, term87641.getClass(), "behavior", null);
        setField(term87641, term87641.getClass(), "compiler", null);
        setField(term87641, term87641.getClass(), "varFilter", null);
        term87642 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term87642, term87642.getClass(), "str", null);
        setIntField(term87642, term87642.getClass(), "type", 0);
        setField(term87642, term87642.getClass(), "next", null);
        setField(term87642, term87642.getClass(), "first", null);
        setField(term87642, term87642.getClass(), "last", null);
        setField(term87642, term87642.getClass(), "propListHead", null);
        setIntField(term87642, term87642.getClass(), "sourcePosition", 0);
        setField(term87642, term87642.getClass(), "jsType", null);
        setField(term87642, term87642.getClass(), "parent", null);
        term87643 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term87644 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term87643, term87643.getClass(), "functionName", null);
        setBooleanField(term87643, term87643.getClass(), "itsNeedsActivation", false);
        setIntField(term87643, term87643.getClass(), "itsFunctionType", 0);
        setBooleanField(term87643, term87643.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term87643, term87643.getClass(), "encodedSourceStart", 0);
        setIntField(term87643, term87643.getClass(), "encodedSourceEnd", 0);
        setField(term87643, term87643.getClass(), "sourceName", null);
        setIntField(term87643, term87643.getClass(), "baseLineno", 0);
        setIntField(term87643, term87643.getClass(), "endLineno", 0);
        setField(term87643, term87643.getClass(), "functions", null);
        setField(term87643, term87643.getClass(), "regexps", null);
        setField(term87643, term87643.getClass(), "itsVariables", null);
        setField(term87643, term87643.getClass(), "itsConst", null);
        setField(term87643, term87643.getClass(), "itsVariableNames", null);
        setIntField(term87643, term87643.getClass(), "varStart", 0);
        setField(term87643, term87643.getClass(), "compilerData", null);
        setIntField(term87643, term87643.getClass(), "type", 108);
        setField(term87643, term87643.getClass(), "next", null);
        setField(term87644, term87644.getClass(), "str", null);
        setIntField(term87644, term87644.getClass(), "type", 0);
        setField(term87644, term87644.getClass(), "next", null);
        setField(term87644, term87644.getClass(), "first", null);
        setField(term87644, term87644.getClass(), "last", null);
        setField(term87644, term87644.getClass(), "propListHead", null);
        setIntField(term87644, term87644.getClass(), "sourcePosition", 0);
        setField(term87644, term87644.getClass(), "jsType", null);
        setField(term87644, term87644.getClass(), "parent", null);
        setField(term87643, term87643.getClass(), "first", term87644);
        setField(term87643, term87643.getClass(), "last", null);
        setField(term87643, term87643.getClass(), "propListHead", null);
        setIntField(term87643, term87643.getClass(), "sourcePosition", 0);
        setField(term87643, term87643.getClass(), "jsType", null);
        setField(term87643, term87643.getClass(), "parent", null);
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
        args[1] = term87333;
        args[2] = term87287;
        callMethod(klass, "visit", argTypes, term87109, args);
        assertTrue(recursiveEquals(term87109, term87641));
        assertTrue(recursiveEquals(term87333, term87643));
        assertTrue(recursiveEquals(term87287, null));
    }

};


