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

public class ReferenceCollectingCallback_visit_872273174481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119651;
     Object term119875;
     Object term119829;
     Object term120244;
     Object term120245;
     Object term120246;

    public ReferenceCollectingCallback_visit_872273174481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119651 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term119875 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term119875, term119875.getClass(), "type", 0);
        term119829 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term119829, term119829.getClass(), "type", 98);
        setField(term119829, term119829.getClass(), "first", term119875);
        term120244 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term120244, term120244.getClass(), "referenceMap", null);
        setField(term120244, term120244.getClass(), "blockStack", null);
        setField(term120244, term120244.getClass(), "behavior", null);
        setField(term120244, term120244.getClass(), "compiler", null);
        setField(term120244, term120244.getClass(), "varFilter", null);
        term120245 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term120245, term120245.getClass(), "str", null);
        setIntField(term120245, term120245.getClass(), "type", 0);
        setField(term120245, term120245.getClass(), "next", null);
        setField(term120245, term120245.getClass(), "first", null);
        setField(term120245, term120245.getClass(), "last", null);
        setField(term120245, term120245.getClass(), "propListHead", null);
        setIntField(term120245, term120245.getClass(), "sourcePosition", 0);
        setField(term120245, term120245.getClass(), "jsType", null);
        setField(term120245, term120245.getClass(), "parent", null);
        term120246 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term120247 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term120246, term120246.getClass(), "functionName", null);
        setBooleanField(term120246, term120246.getClass(), "itsNeedsActivation", false);
        setIntField(term120246, term120246.getClass(), "itsFunctionType", 0);
        setBooleanField(term120246, term120246.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term120246, term120246.getClass(), "encodedSourceStart", 0);
        setIntField(term120246, term120246.getClass(), "encodedSourceEnd", 0);
        setField(term120246, term120246.getClass(), "sourceName", null);
        setIntField(term120246, term120246.getClass(), "baseLineno", 0);
        setIntField(term120246, term120246.getClass(), "endLineno", 0);
        setField(term120246, term120246.getClass(), "functions", null);
        setField(term120246, term120246.getClass(), "regexps", null);
        setField(term120246, term120246.getClass(), "itsVariables", null);
        setField(term120246, term120246.getClass(), "itsConst", null);
        setField(term120246, term120246.getClass(), "itsVariableNames", null);
        setIntField(term120246, term120246.getClass(), "varStart", 0);
        setField(term120246, term120246.getClass(), "compilerData", null);
        setIntField(term120246, term120246.getClass(), "type", 98);
        setField(term120246, term120246.getClass(), "next", null);
        setField(term120247, term120247.getClass(), "str", null);
        setIntField(term120247, term120247.getClass(), "type", 0);
        setField(term120247, term120247.getClass(), "next", null);
        setField(term120247, term120247.getClass(), "first", null);
        setField(term120247, term120247.getClass(), "last", null);
        setField(term120247, term120247.getClass(), "propListHead", null);
        setIntField(term120247, term120247.getClass(), "sourcePosition", 0);
        setField(term120247, term120247.getClass(), "jsType", null);
        setField(term120247, term120247.getClass(), "parent", null);
        setField(term120246, term120246.getClass(), "first", term120247);
        setField(term120246, term120246.getClass(), "last", null);
        setField(term120246, term120246.getClass(), "propListHead", null);
        setIntField(term120246, term120246.getClass(), "sourcePosition", 0);
        setField(term120246, term120246.getClass(), "jsType", null);
        setField(term120246, term120246.getClass(), "parent", null);
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
        args[1] = term119875;
        args[2] = term119829;
        callMethod(klass, "visit", argTypes, term119651, args);
        assertTrue(recursiveEquals(term119651, term120244));
        assertTrue(recursiveEquals(term119875, term120246));
        assertTrue(recursiveEquals(term119829, null));
    }

};


