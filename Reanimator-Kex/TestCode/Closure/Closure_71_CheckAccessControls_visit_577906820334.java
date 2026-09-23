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

public class CheckAccessControls_visit_577906820334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107272;
     Object term107342;
     Object term107637;
     Object term107638;

    public CheckAccessControls_visit_577906820334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107272 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term107342 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term107442 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setIntField(term107342, term107342.getClass(), "type", 30);
        setField(term107342, term107342.getClass(), "jsType", term107442);
        term107637 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term107637, term107637.getClass(), "compiler", null);
        setField(term107637, term107637.getClass(), "validator", null);
        setIntField(term107637, term107637.getClass(), "deprecatedDepth", 0);
        setIntField(term107637, term107637.getClass(), "methodDepth", 0);
        setField(term107637, term107637.getClass(), "currentClass", null);
        setField(term107637, term107637.getClass(), "initializedConstantProperties", null);
        term107638 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term107639 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setIntField(term107638, term107638.getClass(), "type", 30);
        setField(term107638, term107638.getClass(), "next", null);
        setField(term107638, term107638.getClass(), "first", null);
        setField(term107638, term107638.getClass(), "last", null);
        setField(term107638, term107638.getClass(), "propListHead", null);
        setIntField(term107638, term107638.getClass(), "sourcePosition", 0);
        setField(term107639, term107639.getClass(), "call", null);
        setField(term107639, term107639.getClass(), "prototype", null);
        setField(term107639, term107639.getClass(), "kind", null);
        setField(term107639, term107639.getClass(), "typeOfThis", null);
        setField(term107639, term107639.getClass(), "source", null);
        setField(term107639, term107639.getClass(), "implementedInterfaces", null);
        setField(term107639, term107639.getClass(), "subTypes", null);
        setField(term107639, term107639.getClass(), "templateTypeName", null);
        setField(term107639, term107639.getClass(), "className", null);
        setField(term107639, term107639.getClass(), "properties", null);
        setBooleanField(term107639, term107639.getClass(), "nativeType", false);
        setField(term107639, term107639.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term107639, term107639.getClass(), "prettyPrint", false);
        setBooleanField(term107639, term107639.getClass(), "visited", false);
        setField(term107639, term107639.getClass(), "docInfo", null);
        setBooleanField(term107639, term107639.getClass(), "unknown", false);
        setBooleanField(term107639, term107639.getClass(), "resolved", false);
        setField(term107639, term107639.getClass(), "resolveResult", null);
        setField(term107639, term107639.getClass(), "registry", null);
        setField(term107638, term107638.getClass(), "jsType", term107639);
        setField(term107638, term107638.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term107342;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term107272, args);
        assertTrue(recursiveEquals(term107272, term107637));
        assertTrue(recursiveEquals(term107342, null));
    }

};


