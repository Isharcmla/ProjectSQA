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

public class CheckAccessControls_checkNameDeprecation_942014578123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33624;
     Object term33694;
     Object term34013;
     Object term34014;

    public CheckAccessControls_checkNameDeprecation_942014578123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33624 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term33694 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term33694, term33694.getClass(), "type", 105);
        term34013 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term34013, term34013.getClass(), "compiler", null);
        setField(term34013, term34013.getClass(), "validator", null);
        setIntField(term34013, term34013.getClass(), "deprecatedDepth", 0);
        setIntField(term34013, term34013.getClass(), "methodDepth", 0);
        setField(term34013, term34013.getClass(), "currentClass", null);
        setField(term34013, term34013.getClass(), "initializedConstantProperties", null);
        term34014 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34014, term34014.getClass(), "type", 105);
        setField(term34014, term34014.getClass(), "next", null);
        setField(term34014, term34014.getClass(), "first", null);
        setField(term34014, term34014.getClass(), "last", null);
        setField(term34014, term34014.getClass(), "propListHead", null);
        setIntField(term34014, term34014.getClass(), "sourcePosition", 0);
        setField(term34014, term34014.getClass(), "jsType", null);
        setField(term34014, term34014.getClass(), "parent", null);
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
        args[1] = null;
        args[2] = term33694;
        callMethod(klass, "checkNameDeprecation", argTypes, term33624, args);
        assertTrue(recursiveEquals(term33624, term34013));
        assertTrue(recursiveEquals(term33694, null));
    }

};


