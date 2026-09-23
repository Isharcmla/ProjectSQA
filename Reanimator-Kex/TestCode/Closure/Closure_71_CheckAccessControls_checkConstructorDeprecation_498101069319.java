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

public class CheckAccessControls_checkConstructorDeprecation_498101069319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101514;
     Object term101584;
     Object term102600;
     Object term102601;

    public CheckAccessControls_checkConstructorDeprecation_498101069319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101514 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term101584 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term101702 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term101820 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term101702, term101702.getClass(), "docInfo", null);
        setField(term101702, term101702.getClass(), "implicitPrototypeFallback", term101820);
        setField(term101584, term101584.getClass(), "jsType", term101702);
        term102600 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term102600, term102600.getClass(), "compiler", null);
        setField(term102600, term102600.getClass(), "validator", null);
        setIntField(term102600, term102600.getClass(), "deprecatedDepth", 0);
        setIntField(term102600, term102600.getClass(), "methodDepth", 0);
        setField(term102600, term102600.getClass(), "currentClass", null);
        setField(term102600, term102600.getClass(), "initializedConstantProperties", null);
        term102601 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term102602 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term102603 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term102601, term102601.getClass(), "type", 0);
        setField(term102601, term102601.getClass(), "next", null);
        setField(term102601, term102601.getClass(), "first", null);
        setField(term102601, term102601.getClass(), "last", null);
        setField(term102601, term102601.getClass(), "propListHead", null);
        setIntField(term102601, term102601.getClass(), "sourcePosition", 0);
        setField(term102602, term102602.getClass(), "ownerFunction", null);
        setField(term102602, term102602.getClass(), "className", null);
        setField(term102602, term102602.getClass(), "properties", null);
        setBooleanField(term102602, term102602.getClass(), "nativeType", false);
        setField(term102603, term102603.getClass(), "ownerFunction", null);
        setField(term102603, term102603.getClass(), "className", null);
        setField(term102603, term102603.getClass(), "properties", null);
        setBooleanField(term102603, term102603.getClass(), "nativeType", false);
        setField(term102603, term102603.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term102603, term102603.getClass(), "prettyPrint", false);
        setBooleanField(term102603, term102603.getClass(), "visited", false);
        setField(term102603, term102603.getClass(), "docInfo", null);
        setBooleanField(term102603, term102603.getClass(), "unknown", false);
        setBooleanField(term102603, term102603.getClass(), "resolved", false);
        setField(term102603, term102603.getClass(), "resolveResult", null);
        setField(term102603, term102603.getClass(), "registry", null);
        setField(term102602, term102602.getClass(), "implicitPrototypeFallback", term102603);
        setBooleanField(term102602, term102602.getClass(), "prettyPrint", false);
        setBooleanField(term102602, term102602.getClass(), "visited", false);
        setField(term102602, term102602.getClass(), "docInfo", null);
        setBooleanField(term102602, term102602.getClass(), "unknown", false);
        setBooleanField(term102602, term102602.getClass(), "resolved", false);
        setField(term102602, term102602.getClass(), "resolveResult", null);
        setField(term102602, term102602.getClass(), "registry", null);
        setField(term102601, term102601.getClass(), "jsType", term102602);
        setField(term102601, term102601.getClass(), "parent", null);
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
        args[1] = term101584;
        args[2] = null;
        callMethod(klass, "checkConstructorDeprecation", argTypes, term101514, args);
        assertTrue(recursiveEquals(term101514, term102600));
        assertTrue(recursiveEquals(term101584, null));
    }

};


