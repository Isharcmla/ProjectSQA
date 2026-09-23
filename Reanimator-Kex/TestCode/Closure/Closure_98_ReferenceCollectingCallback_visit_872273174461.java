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

public class ReferenceCollectingCallback_visit_872273174461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124237;
     Object term124329;
     Object term124421;
     Object term124890;
     Object term124891;
     Object term124892;

    public ReferenceCollectingCallback_visit_872273174461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124237 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term124329 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term124329, term124329.getClass(), "type", -39);
        term124421 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term124890 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term124890, term124890.getClass(), "referenceMap", null);
        setField(term124890, term124890.getClass(), "blockStack", null);
        setField(term124890, term124890.getClass(), "behavior", null);
        setField(term124890, term124890.getClass(), "compiler", null);
        setField(term124890, term124890.getClass(), "varFilter", null);
        term124891 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term124891, term124891.getClass(), "number", 0.0);
        setIntField(term124891, term124891.getClass(), "type", -39);
        setField(term124891, term124891.getClass(), "next", null);
        setField(term124891, term124891.getClass(), "first", null);
        setField(term124891, term124891.getClass(), "last", null);
        setField(term124891, term124891.getClass(), "propListHead", null);
        setIntField(term124891, term124891.getClass(), "sourcePosition", 0);
        setField(term124891, term124891.getClass(), "jsType", null);
        setField(term124891, term124891.getClass(), "parent", null);
        term124892 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term124892, term124892.getClass(), "str", null);
        setIntField(term124892, term124892.getClass(), "type", 0);
        setField(term124892, term124892.getClass(), "next", null);
        setField(term124892, term124892.getClass(), "first", null);
        setField(term124892, term124892.getClass(), "last", null);
        setField(term124892, term124892.getClass(), "propListHead", null);
        setIntField(term124892, term124892.getClass(), "sourcePosition", 0);
        setField(term124892, term124892.getClass(), "jsType", null);
        setField(term124892, term124892.getClass(), "parent", null);
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
        args[1] = term124329;
        args[2] = term124421;
        callMethod(klass, "visit", argTypes, term124237, args);
        assertTrue(recursiveEquals(term124237, term124890));
        assertTrue(recursiveEquals(term124329, term124892));
        assertTrue(recursiveEquals(term124421, null));
    }

};


