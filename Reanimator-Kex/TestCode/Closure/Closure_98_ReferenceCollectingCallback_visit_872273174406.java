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

public class ReferenceCollectingCallback_visit_872273174406 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107751;
     Object term107972;
     Object term107929;
     Object term108681;
     Object term108682;
     Object term108683;

    public ReferenceCollectingCallback_visit_872273174406() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107751 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term107972 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term107972, term107972.getClass(), "type", 0);
        term107929 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term107929, term107929.getClass(), "type", 100);
        setField(term107929, term107929.getClass(), "first", term107972);
        term108681 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term108681, term108681.getClass(), "referenceMap", null);
        setField(term108681, term108681.getClass(), "blockStack", null);
        setField(term108681, term108681.getClass(), "behavior", null);
        setField(term108681, term108681.getClass(), "compiler", null);
        setField(term108681, term108681.getClass(), "varFilter", null);
        term108682 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term108682, term108682.getClass(), "functionName", null);
        setBooleanField(term108682, term108682.getClass(), "itsNeedsActivation", false);
        setIntField(term108682, term108682.getClass(), "itsFunctionType", 0);
        setBooleanField(term108682, term108682.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term108682, term108682.getClass(), "encodedSourceStart", 0);
        setIntField(term108682, term108682.getClass(), "encodedSourceEnd", 0);
        setField(term108682, term108682.getClass(), "sourceName", null);
        setIntField(term108682, term108682.getClass(), "baseLineno", 0);
        setIntField(term108682, term108682.getClass(), "endLineno", 0);
        setField(term108682, term108682.getClass(), "functions", null);
        setField(term108682, term108682.getClass(), "regexps", null);
        setField(term108682, term108682.getClass(), "itsVariables", null);
        setField(term108682, term108682.getClass(), "itsConst", null);
        setField(term108682, term108682.getClass(), "itsVariableNames", null);
        setIntField(term108682, term108682.getClass(), "varStart", 0);
        setField(term108682, term108682.getClass(), "compilerData", null);
        setIntField(term108682, term108682.getClass(), "type", 0);
        setField(term108682, term108682.getClass(), "next", null);
        setField(term108682, term108682.getClass(), "first", null);
        setField(term108682, term108682.getClass(), "last", null);
        setField(term108682, term108682.getClass(), "propListHead", null);
        setIntField(term108682, term108682.getClass(), "sourcePosition", 0);
        setField(term108682, term108682.getClass(), "jsType", null);
        setField(term108682, term108682.getClass(), "parent", null);
        term108683 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term108684 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term108683, term108683.getClass(), "number", 0.0);
        setIntField(term108683, term108683.getClass(), "type", 100);
        setField(term108683, term108683.getClass(), "next", null);
        setField(term108684, term108684.getClass(), "functionName", null);
        setBooleanField(term108684, term108684.getClass(), "itsNeedsActivation", false);
        setIntField(term108684, term108684.getClass(), "itsFunctionType", 0);
        setBooleanField(term108684, term108684.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term108684, term108684.getClass(), "encodedSourceStart", 0);
        setIntField(term108684, term108684.getClass(), "encodedSourceEnd", 0);
        setField(term108684, term108684.getClass(), "sourceName", null);
        setIntField(term108684, term108684.getClass(), "baseLineno", 0);
        setIntField(term108684, term108684.getClass(), "endLineno", 0);
        setField(term108684, term108684.getClass(), "functions", null);
        setField(term108684, term108684.getClass(), "regexps", null);
        setField(term108684, term108684.getClass(), "itsVariables", null);
        setField(term108684, term108684.getClass(), "itsConst", null);
        setField(term108684, term108684.getClass(), "itsVariableNames", null);
        setIntField(term108684, term108684.getClass(), "varStart", 0);
        setField(term108684, term108684.getClass(), "compilerData", null);
        setIntField(term108684, term108684.getClass(), "type", 0);
        setField(term108684, term108684.getClass(), "next", null);
        setField(term108684, term108684.getClass(), "first", null);
        setField(term108684, term108684.getClass(), "last", null);
        setField(term108684, term108684.getClass(), "propListHead", null);
        setIntField(term108684, term108684.getClass(), "sourcePosition", 0);
        setField(term108684, term108684.getClass(), "jsType", null);
        setField(term108684, term108684.getClass(), "parent", null);
        setField(term108683, term108683.getClass(), "first", term108684);
        setField(term108683, term108683.getClass(), "last", null);
        setField(term108683, term108683.getClass(), "propListHead", null);
        setIntField(term108683, term108683.getClass(), "sourcePosition", 0);
        setField(term108683, term108683.getClass(), "jsType", null);
        setField(term108683, term108683.getClass(), "parent", null);
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
        args[1] = term107972;
        args[2] = term107929;
        callMethod(klass, "visit", argTypes, term107751, args);
        assertTrue(recursiveEquals(term107751, term108681));
        assertTrue(recursiveEquals(term107972, term108683));
        assertTrue(recursiveEquals(term107929, null));
    }

};


