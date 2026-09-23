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

public class CheckAccessControls_checkConstructorDeprecation_498101069390 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198927;
     Object term198997;
     Object term199983;
     Object term199984;

    public CheckAccessControls_checkConstructorDeprecation_498101069390() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term198927 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term198997 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term199115 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term199233 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term199351 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term199115, term199115.getClass(), "docInfo", null);
        setField(term199233, term199233.getClass(), "docInfo", null);
        setField(term199233, term199233.getClass(), "implicitPrototypeFallback", term199351);
        setField(term199115, term199115.getClass(), "implicitPrototypeFallback", term199233);
        setField(term198997, term198997.getClass(), "jsType", term199115);
        term199983 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term199983, term199983.getClass(), "compiler", null);
        setField(term199983, term199983.getClass(), "validator", null);
        setIntField(term199983, term199983.getClass(), "deprecatedDepth", 0);
        setIntField(term199983, term199983.getClass(), "methodDepth", 0);
        setField(term199983, term199983.getClass(), "currentClass", null);
        setField(term199983, term199983.getClass(), "initializedConstantProperties", null);
        term199984 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term199985 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term199986 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term199987 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term199984, term199984.getClass(), "type", 0);
        setField(term199984, term199984.getClass(), "next", null);
        setField(term199984, term199984.getClass(), "first", null);
        setField(term199984, term199984.getClass(), "last", null);
        setField(term199984, term199984.getClass(), "propListHead", null);
        setIntField(term199984, term199984.getClass(), "sourcePosition", 0);
        setField(term199985, term199985.getClass(), "ownerFunction", null);
        setField(term199985, term199985.getClass(), "className", null);
        setField(term199985, term199985.getClass(), "properties", null);
        setBooleanField(term199985, term199985.getClass(), "nativeType", false);
        setField(term199986, term199986.getClass(), "ownerFunction", null);
        setField(term199986, term199986.getClass(), "className", null);
        setField(term199986, term199986.getClass(), "properties", null);
        setBooleanField(term199986, term199986.getClass(), "nativeType", false);
        setField(term199987, term199987.getClass(), "ownerFunction", null);
        setField(term199987, term199987.getClass(), "className", null);
        setField(term199987, term199987.getClass(), "properties", null);
        setBooleanField(term199987, term199987.getClass(), "nativeType", false);
        setField(term199987, term199987.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term199987, term199987.getClass(), "prettyPrint", false);
        setBooleanField(term199987, term199987.getClass(), "visited", false);
        setField(term199987, term199987.getClass(), "docInfo", null);
        setBooleanField(term199987, term199987.getClass(), "unknown", false);
        setBooleanField(term199987, term199987.getClass(), "resolved", false);
        setField(term199987, term199987.getClass(), "resolveResult", null);
        setField(term199987, term199987.getClass(), "registry", null);
        setField(term199986, term199986.getClass(), "implicitPrototypeFallback", term199987);
        setBooleanField(term199986, term199986.getClass(), "prettyPrint", false);
        setBooleanField(term199986, term199986.getClass(), "visited", false);
        setField(term199986, term199986.getClass(), "docInfo", null);
        setBooleanField(term199986, term199986.getClass(), "unknown", false);
        setBooleanField(term199986, term199986.getClass(), "resolved", false);
        setField(term199986, term199986.getClass(), "resolveResult", null);
        setField(term199986, term199986.getClass(), "registry", null);
        setField(term199985, term199985.getClass(), "implicitPrototypeFallback", term199986);
        setBooleanField(term199985, term199985.getClass(), "prettyPrint", false);
        setBooleanField(term199985, term199985.getClass(), "visited", false);
        setField(term199985, term199985.getClass(), "docInfo", null);
        setBooleanField(term199985, term199985.getClass(), "unknown", false);
        setBooleanField(term199985, term199985.getClass(), "resolved", false);
        setField(term199985, term199985.getClass(), "resolveResult", null);
        setField(term199985, term199985.getClass(), "registry", null);
        setField(term199984, term199984.getClass(), "jsType", term199985);
        setField(term199984, term199984.getClass(), "parent", null);
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
        args[1] = term198997;
        args[2] = null;
        callMethod(klass, "checkConstructorDeprecation", argTypes, term198927, args);
        assertTrue(recursiveEquals(term198927, term199983));
        assertTrue(recursiveEquals(term198997, null));
    }

};


