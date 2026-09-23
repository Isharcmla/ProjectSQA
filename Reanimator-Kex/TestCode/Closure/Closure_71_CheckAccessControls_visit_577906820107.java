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

public class CheckAccessControls_visit_577906820107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28630;
     Object term28700;
     Object term29266;
     Object term29267;

    public CheckAccessControls_visit_577906820107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28630 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term28700 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28700, term28700.getClass(), "type", 30);
        term29266 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term29266, term29266.getClass(), "compiler", null);
        setField(term29266, term29266.getClass(), "validator", null);
        setIntField(term29266, term29266.getClass(), "deprecatedDepth", 0);
        setIntField(term29266, term29266.getClass(), "methodDepth", 0);
        setField(term29266, term29266.getClass(), "currentClass", null);
        setField(term29266, term29266.getClass(), "initializedConstantProperties", null);
        term29267 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29267, term29267.getClass(), "type", 30);
        setField(term29267, term29267.getClass(), "next", null);
        setField(term29267, term29267.getClass(), "first", null);
        setField(term29267, term29267.getClass(), "last", null);
        setField(term29267, term29267.getClass(), "propListHead", null);
        setIntField(term29267, term29267.getClass(), "sourcePosition", 0);
        setField(term29267, term29267.getClass(), "jsType", null);
        setField(term29267, term29267.getClass(), "parent", null);
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
        args[1] = term28700;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term28630, args);
        assertTrue(recursiveEquals(term28630, term29266));
        assertTrue(recursiveEquals(term28700, null));
    }

};


