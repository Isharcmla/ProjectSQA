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

public class CheckAccessControls_checkConstructorDeprecation_498101069184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51655;
     Object term51725;
     Object term51898;
     Object term51899;

    public CheckAccessControls_checkConstructorDeprecation_498101069184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51655 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term51725 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51843 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term51725, term51725.getClass(), "jsType", term51843);
        term51898 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term51898, term51898.getClass(), "compiler", null);
        setField(term51898, term51898.getClass(), "validator", null);
        setIntField(term51898, term51898.getClass(), "deprecatedDepth", 0);
        setIntField(term51898, term51898.getClass(), "methodDepth", 0);
        setField(term51898, term51898.getClass(), "currentClass", null);
        setField(term51898, term51898.getClass(), "initializedConstantProperties", null);
        term51899 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51900 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term51899, term51899.getClass(), "type", 0);
        setField(term51899, term51899.getClass(), "next", null);
        setField(term51899, term51899.getClass(), "first", null);
        setField(term51899, term51899.getClass(), "last", null);
        setField(term51899, term51899.getClass(), "propListHead", null);
        setIntField(term51899, term51899.getClass(), "sourcePosition", 0);
        setField(term51900, term51900.getClass(), "ownerFunction", null);
        setField(term51900, term51900.getClass(), "className", null);
        setField(term51900, term51900.getClass(), "properties", null);
        setBooleanField(term51900, term51900.getClass(), "nativeType", false);
        setField(term51900, term51900.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term51900, term51900.getClass(), "prettyPrint", false);
        setBooleanField(term51900, term51900.getClass(), "visited", false);
        setField(term51900, term51900.getClass(), "docInfo", null);
        setBooleanField(term51900, term51900.getClass(), "unknown", false);
        setBooleanField(term51900, term51900.getClass(), "resolved", false);
        setField(term51900, term51900.getClass(), "resolveResult", null);
        setField(term51900, term51900.getClass(), "registry", null);
        setField(term51899, term51899.getClass(), "jsType", term51900);
        setField(term51899, term51899.getClass(), "parent", null);
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
        args[1] = term51725;
        args[2] = null;
        callMethod(klass, "checkConstructorDeprecation", argTypes, term51655, args);
        assertTrue(recursiveEquals(term51655, term51898));
        assertTrue(recursiveEquals(term51725, null));
    }

};


