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

public class CheckAccessControls_checkConstructorDeprecation_498101069247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71599;
     Object term71669;
     Object term72689;
     Object term72690;

    public CheckAccessControls_checkConstructorDeprecation_498101069247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71599 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term71669 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term71787 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term71911 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term71787, term71787.getClass(), "docInfo", null);
        setField(term71787, term71787.getClass(), "implicitPrototypeFallback", term71911);
        setField(term71669, term71669.getClass(), "jsType", term71787);
        term72689 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term72689, term72689.getClass(), "compiler", null);
        setField(term72689, term72689.getClass(), "validator", null);
        setIntField(term72689, term72689.getClass(), "deprecatedDepth", 0);
        setIntField(term72689, term72689.getClass(), "methodDepth", 0);
        setField(term72689, term72689.getClass(), "currentClass", null);
        setField(term72689, term72689.getClass(), "initializedConstantProperties", null);
        term72690 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term72691 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term72692 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setIntField(term72690, term72690.getClass(), "type", 0);
        setField(term72690, term72690.getClass(), "next", null);
        setField(term72690, term72690.getClass(), "first", null);
        setField(term72690, term72690.getClass(), "last", null);
        setField(term72690, term72690.getClass(), "propListHead", null);
        setIntField(term72690, term72690.getClass(), "sourcePosition", 0);
        setField(term72691, term72691.getClass(), "ownerFunction", null);
        setField(term72691, term72691.getClass(), "className", null);
        setField(term72691, term72691.getClass(), "properties", null);
        setBooleanField(term72691, term72691.getClass(), "nativeType", false);
        setField(term72692, term72692.getClass(), "typeExpr", null);
        setField(term72692, term72692.getClass(), "sourceName", null);
        setBooleanField(term72692, term72692.getClass(), "isChecked", false);
        setBooleanField(term72692, term72692.getClass(), "visited", false);
        setField(term72692, term72692.getClass(), "docInfo", null);
        setBooleanField(term72692, term72692.getClass(), "unknown", false);
        setBooleanField(term72692, term72692.getClass(), "resolved", false);
        setField(term72692, term72692.getClass(), "resolveResult", null);
        setField(term72692, term72692.getClass(), "registry", null);
        setField(term72691, term72691.getClass(), "implicitPrototypeFallback", term72692);
        setBooleanField(term72691, term72691.getClass(), "prettyPrint", false);
        setBooleanField(term72691, term72691.getClass(), "visited", false);
        setField(term72691, term72691.getClass(), "docInfo", null);
        setBooleanField(term72691, term72691.getClass(), "unknown", false);
        setBooleanField(term72691, term72691.getClass(), "resolved", false);
        setField(term72691, term72691.getClass(), "resolveResult", null);
        setField(term72691, term72691.getClass(), "registry", null);
        setField(term72690, term72690.getClass(), "jsType", term72691);
        setField(term72690, term72690.getClass(), "parent", null);
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
        args[1] = term71669;
        args[2] = null;
        callMethod(klass, "checkConstructorDeprecation", argTypes, term71599, args);
        assertTrue(recursiveEquals(term71599, term72689));
        assertTrue(recursiveEquals(term71669, null));
    }

};


