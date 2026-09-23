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

public class CheckAccessControls_checkConstructorDeprecation_498101069333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106850;
     Object term106920;
     Object term107580;
     Object term107581;

    public CheckAccessControls_checkConstructorDeprecation_498101069333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106850 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term106920 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term107038 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term107144 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term107038, term107038.getClass(), "docInfo", null);
        setField(term107038, term107038.getClass(), "implicitPrototypeFallback", term107144);
        setField(term106920, term106920.getClass(), "jsType", term107038);
        term107580 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term107580, term107580.getClass(), "compiler", null);
        setField(term107580, term107580.getClass(), "validator", null);
        setIntField(term107580, term107580.getClass(), "deprecatedDepth", 0);
        setIntField(term107580, term107580.getClass(), "methodDepth", 0);
        setField(term107580, term107580.getClass(), "currentClass", null);
        setField(term107580, term107580.getClass(), "initializedConstantProperties", null);
        term107581 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term107582 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term107583 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setIntField(term107581, term107581.getClass(), "type", 0);
        setField(term107581, term107581.getClass(), "next", null);
        setField(term107581, term107581.getClass(), "first", null);
        setField(term107581, term107581.getClass(), "last", null);
        setField(term107581, term107581.getClass(), "propListHead", null);
        setIntField(term107581, term107581.getClass(), "sourcePosition", 0);
        setField(term107582, term107582.getClass(), "ownerFunction", null);
        setField(term107582, term107582.getClass(), "className", null);
        setField(term107582, term107582.getClass(), "properties", null);
        setBooleanField(term107582, term107582.getClass(), "nativeType", false);
        setField(term107583, term107583.getClass(), "primitiveType", null);
        setField(term107583, term107583.getClass(), "primitiveObjectType", null);
        setField(term107583, term107583.getClass(), "name", null);
        setBooleanField(term107583, term107583.getClass(), "visited", false);
        setField(term107583, term107583.getClass(), "docInfo", null);
        setBooleanField(term107583, term107583.getClass(), "unknown", false);
        setBooleanField(term107583, term107583.getClass(), "resolved", false);
        setField(term107583, term107583.getClass(), "resolveResult", null);
        setField(term107583, term107583.getClass(), "registry", null);
        setField(term107582, term107582.getClass(), "implicitPrototypeFallback", term107583);
        setBooleanField(term107582, term107582.getClass(), "prettyPrint", false);
        setBooleanField(term107582, term107582.getClass(), "visited", false);
        setField(term107582, term107582.getClass(), "docInfo", null);
        setBooleanField(term107582, term107582.getClass(), "unknown", false);
        setBooleanField(term107582, term107582.getClass(), "resolved", false);
        setField(term107582, term107582.getClass(), "resolveResult", null);
        setField(term107582, term107582.getClass(), "registry", null);
        setField(term107581, term107581.getClass(), "jsType", term107582);
        setField(term107581, term107581.getClass(), "parent", null);
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
        args[1] = term106920;
        args[2] = null;
        callMethod(klass, "checkConstructorDeprecation", argTypes, term106850, args);
        assertTrue(recursiveEquals(term106850, term107580));
        assertTrue(recursiveEquals(term106920, null));
    }

};


