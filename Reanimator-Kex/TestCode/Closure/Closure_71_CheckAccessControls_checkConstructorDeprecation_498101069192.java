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

public class CheckAccessControls_checkConstructorDeprecation_498101069192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53912;
     Object term53982;
     Object term54232;
     Object term54233;

    public CheckAccessControls_checkConstructorDeprecation_498101069192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53912 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term53982 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term54088 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term53982, term53982.getClass(), "jsType", term54088);
        term54232 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term54232, term54232.getClass(), "compiler", null);
        setField(term54232, term54232.getClass(), "validator", null);
        setIntField(term54232, term54232.getClass(), "deprecatedDepth", 0);
        setIntField(term54232, term54232.getClass(), "methodDepth", 0);
        setField(term54232, term54232.getClass(), "currentClass", null);
        setField(term54232, term54232.getClass(), "initializedConstantProperties", null);
        term54233 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term54234 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setIntField(term54233, term54233.getClass(), "type", 0);
        setField(term54233, term54233.getClass(), "next", null);
        setField(term54233, term54233.getClass(), "first", null);
        setField(term54233, term54233.getClass(), "last", null);
        setField(term54233, term54233.getClass(), "propListHead", null);
        setIntField(term54233, term54233.getClass(), "sourcePosition", 0);
        setField(term54234, term54234.getClass(), "primitiveType", null);
        setField(term54234, term54234.getClass(), "primitiveObjectType", null);
        setField(term54234, term54234.getClass(), "name", null);
        setBooleanField(term54234, term54234.getClass(), "visited", false);
        setField(term54234, term54234.getClass(), "docInfo", null);
        setBooleanField(term54234, term54234.getClass(), "unknown", false);
        setBooleanField(term54234, term54234.getClass(), "resolved", false);
        setField(term54234, term54234.getClass(), "resolveResult", null);
        setField(term54234, term54234.getClass(), "registry", null);
        setField(term54233, term54233.getClass(), "jsType", term54234);
        setField(term54233, term54233.getClass(), "parent", null);
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
        args[1] = term53982;
        args[2] = null;
        callMethod(klass, "checkConstructorDeprecation", argTypes, term53912, args);
        assertTrue(recursiveEquals(term53912, term54232));
        assertTrue(recursiveEquals(term53982, null));
    }

};


