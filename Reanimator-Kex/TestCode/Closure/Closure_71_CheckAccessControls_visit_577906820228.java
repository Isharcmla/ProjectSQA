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

public class CheckAccessControls_visit_577906820228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66268;
     Object term66338;
     Object term66510;
     Object term66511;

    public CheckAccessControls_visit_577906820228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66268 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term66338 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term66448 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setIntField(term66338, term66338.getClass(), "type", 30);
        setField(term66338, term66338.getClass(), "jsType", term66448);
        term66510 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term66510, term66510.getClass(), "compiler", null);
        setField(term66510, term66510.getClass(), "validator", null);
        setIntField(term66510, term66510.getClass(), "deprecatedDepth", 0);
        setIntField(term66510, term66510.getClass(), "methodDepth", 0);
        setField(term66510, term66510.getClass(), "currentClass", null);
        setField(term66510, term66510.getClass(), "initializedConstantProperties", null);
        term66511 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term66512 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setIntField(term66511, term66511.getClass(), "type", 30);
        setField(term66511, term66511.getClass(), "next", null);
        setField(term66511, term66511.getClass(), "first", null);
        setField(term66511, term66511.getClass(), "last", null);
        setField(term66511, term66511.getClass(), "propListHead", null);
        setIntField(term66511, term66511.getClass(), "sourcePosition", 0);
        setField(term66512, term66512.getClass(), "call", null);
        setField(term66512, term66512.getClass(), "prototype", null);
        setField(term66512, term66512.getClass(), "kind", null);
        setField(term66512, term66512.getClass(), "typeOfThis", null);
        setField(term66512, term66512.getClass(), "source", null);
        setField(term66512, term66512.getClass(), "implementedInterfaces", null);
        setField(term66512, term66512.getClass(), "subTypes", null);
        setField(term66512, term66512.getClass(), "templateTypeName", null);
        setField(term66512, term66512.getClass(), "className", null);
        setField(term66512, term66512.getClass(), "properties", null);
        setBooleanField(term66512, term66512.getClass(), "nativeType", false);
        setField(term66512, term66512.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term66512, term66512.getClass(), "prettyPrint", false);
        setBooleanField(term66512, term66512.getClass(), "visited", false);
        setField(term66512, term66512.getClass(), "docInfo", null);
        setBooleanField(term66512, term66512.getClass(), "unknown", false);
        setBooleanField(term66512, term66512.getClass(), "resolved", false);
        setField(term66512, term66512.getClass(), "resolveResult", null);
        setField(term66512, term66512.getClass(), "registry", null);
        setField(term66511, term66511.getClass(), "jsType", term66512);
        setField(term66511, term66511.getClass(), "parent", null);
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
        args[1] = term66338;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term66268, args);
        assertTrue(recursiveEquals(term66268, term66510));
        assertTrue(recursiveEquals(term66338, null));
    }

};


