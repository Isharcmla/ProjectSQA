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

public class ReferenceCollectingCallback_visit_872273174394 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103428;
     Object term103658;
     Object term103612;
     Object term104756;
     Object term104757;
     Object term104758;

    public ReferenceCollectingCallback_visit_872273174394() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103428 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term103658 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term103658, term103658.getClass(), "type", 100);
        term103612 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term103612, term103612.getClass(), "type", 100);
        setField(term103612, term103612.getClass(), "first", term103658);
        term104756 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term104756, term104756.getClass(), "referenceMap", null);
        setField(term104756, term104756.getClass(), "blockStack", null);
        setField(term104756, term104756.getClass(), "behavior", null);
        setField(term104756, term104756.getClass(), "compiler", null);
        setField(term104756, term104756.getClass(), "varFilter", null);
        term104757 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term104757, term104757.getClass(), "number", 0.0);
        setIntField(term104757, term104757.getClass(), "type", 100);
        setField(term104757, term104757.getClass(), "next", null);
        setField(term104757, term104757.getClass(), "first", null);
        setField(term104757, term104757.getClass(), "last", null);
        setField(term104757, term104757.getClass(), "propListHead", null);
        setIntField(term104757, term104757.getClass(), "sourcePosition", 0);
        setField(term104757, term104757.getClass(), "jsType", null);
        setField(term104757, term104757.getClass(), "parent", null);
        term104758 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term104759 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term104758, term104758.getClass(), "number", 0.0);
        setIntField(term104758, term104758.getClass(), "type", 100);
        setField(term104758, term104758.getClass(), "next", null);
        setDoubleField(term104759, term104759.getClass(), "number", 0.0);
        setIntField(term104759, term104759.getClass(), "type", 100);
        setField(term104759, term104759.getClass(), "next", null);
        setField(term104759, term104759.getClass(), "first", null);
        setField(term104759, term104759.getClass(), "last", null);
        setField(term104759, term104759.getClass(), "propListHead", null);
        setIntField(term104759, term104759.getClass(), "sourcePosition", 0);
        setField(term104759, term104759.getClass(), "jsType", null);
        setField(term104759, term104759.getClass(), "parent", null);
        setField(term104758, term104758.getClass(), "first", term104759);
        setField(term104758, term104758.getClass(), "last", null);
        setField(term104758, term104758.getClass(), "propListHead", null);
        setIntField(term104758, term104758.getClass(), "sourcePosition", 0);
        setField(term104758, term104758.getClass(), "jsType", null);
        setField(term104758, term104758.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term103658;
        args[2] = term103612;
        callMethod(klass, "visit", argTypes, term103428, args);
        assertTrue(recursiveEquals(term103428, term104756));
        assertTrue(recursiveEquals(term103658, term104758));
        assertTrue(recursiveEquals(term103612, null));
    }

};


