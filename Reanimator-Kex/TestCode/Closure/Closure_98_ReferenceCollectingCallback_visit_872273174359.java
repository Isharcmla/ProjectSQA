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

public class ReferenceCollectingCallback_visit_872273174359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92906;
     Object term93136;
     Object term93090;
     Object term94037;
     Object term94038;
     Object term94039;

    public ReferenceCollectingCallback_visit_872273174359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92906 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term93136 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term93136, term93136.getClass(), "type", 0);
        term93090 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term93090, term93090.getClass(), "type", 101);
        setField(term93090, term93090.getClass(), "first", term93136);
        term94037 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term94037, term94037.getClass(), "referenceMap", null);
        setField(term94037, term94037.getClass(), "blockStack", null);
        setField(term94037, term94037.getClass(), "behavior", null);
        setField(term94037, term94037.getClass(), "compiler", null);
        setField(term94037, term94037.getClass(), "varFilter", null);
        term94038 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term94038, term94038.getClass(), "str", null);
        setIntField(term94038, term94038.getClass(), "type", 0);
        setField(term94038, term94038.getClass(), "next", null);
        setField(term94038, term94038.getClass(), "first", null);
        setField(term94038, term94038.getClass(), "last", null);
        setField(term94038, term94038.getClass(), "propListHead", null);
        setIntField(term94038, term94038.getClass(), "sourcePosition", 0);
        setField(term94038, term94038.getClass(), "jsType", null);
        setField(term94038, term94038.getClass(), "parent", null);
        term94039 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term94040 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term94039, term94039.getClass(), "number", 0.0);
        setIntField(term94039, term94039.getClass(), "type", 101);
        setField(term94039, term94039.getClass(), "next", null);
        setField(term94040, term94040.getClass(), "str", null);
        setIntField(term94040, term94040.getClass(), "type", 0);
        setField(term94040, term94040.getClass(), "next", null);
        setField(term94040, term94040.getClass(), "first", null);
        setField(term94040, term94040.getClass(), "last", null);
        setField(term94040, term94040.getClass(), "propListHead", null);
        setIntField(term94040, term94040.getClass(), "sourcePosition", 0);
        setField(term94040, term94040.getClass(), "jsType", null);
        setField(term94040, term94040.getClass(), "parent", null);
        setField(term94039, term94039.getClass(), "first", term94040);
        setField(term94039, term94039.getClass(), "last", null);
        setField(term94039, term94039.getClass(), "propListHead", null);
        setIntField(term94039, term94039.getClass(), "sourcePosition", 0);
        setField(term94039, term94039.getClass(), "jsType", null);
        setField(term94039, term94039.getClass(), "parent", null);
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
        args[1] = term93136;
        args[2] = term93090;
        callMethod(klass, "visit", argTypes, term92906, args);
        assertTrue(recursiveEquals(term92906, term94037));
        assertTrue(recursiveEquals(term93136, term94039));
        assertTrue(recursiveEquals(term93090, null));
    }

};


