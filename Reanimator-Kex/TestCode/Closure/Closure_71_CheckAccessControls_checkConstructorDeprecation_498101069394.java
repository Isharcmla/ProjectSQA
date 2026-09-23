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

public class CheckAccessControls_checkConstructorDeprecation_498101069394 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200470;
     Object term200540;
     Object term200933;
     Object term200934;

    public CheckAccessControls_checkConstructorDeprecation_498101069394() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term200470 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term200540 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term200658 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term200758 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term200658, term200658.getClass(), "docInfo", null);
        setField(term200658, term200658.getClass(), "implicitPrototypeFallback", term200758);
        setField(term200540, term200540.getClass(), "jsType", term200658);
        term200933 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term200933, term200933.getClass(), "compiler", null);
        setField(term200933, term200933.getClass(), "validator", null);
        setIntField(term200933, term200933.getClass(), "deprecatedDepth", 0);
        setIntField(term200933, term200933.getClass(), "methodDepth", 0);
        setField(term200933, term200933.getClass(), "currentClass", null);
        setField(term200933, term200933.getClass(), "initializedConstantProperties", null);
        term200934 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term200935 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term200936 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setIntField(term200934, term200934.getClass(), "type", 0);
        setField(term200934, term200934.getClass(), "next", null);
        setField(term200934, term200934.getClass(), "first", null);
        setField(term200934, term200934.getClass(), "last", null);
        setField(term200934, term200934.getClass(), "propListHead", null);
        setIntField(term200934, term200934.getClass(), "sourcePosition", 0);
        setField(term200935, term200935.getClass(), "ownerFunction", null);
        setField(term200935, term200935.getClass(), "className", null);
        setField(term200935, term200935.getClass(), "properties", null);
        setBooleanField(term200935, term200935.getClass(), "nativeType", false);
        setField(term200936, term200936.getClass(), "call", null);
        setField(term200936, term200936.getClass(), "prototype", null);
        setField(term200936, term200936.getClass(), "kind", null);
        setField(term200936, term200936.getClass(), "typeOfThis", null);
        setField(term200936, term200936.getClass(), "source", null);
        setField(term200936, term200936.getClass(), "implementedInterfaces", null);
        setField(term200936, term200936.getClass(), "subTypes", null);
        setField(term200936, term200936.getClass(), "templateTypeName", null);
        setField(term200936, term200936.getClass(), "className", null);
        setField(term200936, term200936.getClass(), "properties", null);
        setBooleanField(term200936, term200936.getClass(), "nativeType", false);
        setField(term200936, term200936.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term200936, term200936.getClass(), "prettyPrint", false);
        setBooleanField(term200936, term200936.getClass(), "visited", false);
        setField(term200936, term200936.getClass(), "docInfo", null);
        setBooleanField(term200936, term200936.getClass(), "unknown", false);
        setBooleanField(term200936, term200936.getClass(), "resolved", false);
        setField(term200936, term200936.getClass(), "resolveResult", null);
        setField(term200936, term200936.getClass(), "registry", null);
        setField(term200935, term200935.getClass(), "implicitPrototypeFallback", term200936);
        setBooleanField(term200935, term200935.getClass(), "prettyPrint", false);
        setBooleanField(term200935, term200935.getClass(), "visited", false);
        setField(term200935, term200935.getClass(), "docInfo", null);
        setBooleanField(term200935, term200935.getClass(), "unknown", false);
        setBooleanField(term200935, term200935.getClass(), "resolved", false);
        setField(term200935, term200935.getClass(), "resolveResult", null);
        setField(term200935, term200935.getClass(), "registry", null);
        setField(term200934, term200934.getClass(), "jsType", term200935);
        setField(term200934, term200934.getClass(), "parent", null);
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
        args[1] = term200540;
        args[2] = null;
        callMethod(klass, "checkConstructorDeprecation", argTypes, term200470, args);
        assertTrue(recursiveEquals(term200470, term200933));
        assertTrue(recursiveEquals(term200540, null));
    }

};


