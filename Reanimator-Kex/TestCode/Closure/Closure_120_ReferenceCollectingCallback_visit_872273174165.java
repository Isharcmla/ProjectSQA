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

public class ReferenceCollectingCallback_visit_872273174165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28457;
     Object term28632;
     Object term28597;
     Object term29276;
     Object term29277;
     Object term29278;

    public ReferenceCollectingCallback_visit_872273174165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28457 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term28632 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28632, term28632.getClass(), "type", 100);
        term28597 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28597, term28597.getClass(), "type", 100);
        setField(term28597, term28597.getClass(), "first", term28632);
        term29276 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term29276, term29276.getClass(), "referenceMap", null);
        setField(term29276, term29276.getClass(), "blockStack", null);
        setField(term29276, term29276.getClass(), "behavior", null);
        setField(term29276, term29276.getClass(), "compiler", null);
        setField(term29276, term29276.getClass(), "varFilter", null);
        term29277 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29277, term29277.getClass(), "type", 100);
        setField(term29277, term29277.getClass(), "next", null);
        setField(term29277, term29277.getClass(), "first", null);
        setField(term29277, term29277.getClass(), "last", null);
        setField(term29277, term29277.getClass(), "propListHead", null);
        setIntField(term29277, term29277.getClass(), "sourcePosition", 0);
        setField(term29277, term29277.getClass(), "jsType", null);
        setField(term29277, term29277.getClass(), "parent", null);
        term29278 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29279 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29278, term29278.getClass(), "type", 100);
        setField(term29278, term29278.getClass(), "next", null);
        setIntField(term29279, term29279.getClass(), "type", 100);
        setField(term29279, term29279.getClass(), "next", null);
        setField(term29279, term29279.getClass(), "first", null);
        setField(term29279, term29279.getClass(), "last", null);
        setField(term29279, term29279.getClass(), "propListHead", null);
        setIntField(term29279, term29279.getClass(), "sourcePosition", 0);
        setField(term29279, term29279.getClass(), "jsType", null);
        setField(term29279, term29279.getClass(), "parent", null);
        setField(term29278, term29278.getClass(), "first", term29279);
        setField(term29278, term29278.getClass(), "last", null);
        setField(term29278, term29278.getClass(), "propListHead", null);
        setIntField(term29278, term29278.getClass(), "sourcePosition", 0);
        setField(term29278, term29278.getClass(), "jsType", null);
        setField(term29278, term29278.getClass(), "parent", null);
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
        args[1] = term28632;
        args[2] = term28597;
        callMethod(klass, "visit", argTypes, term28457, args);
        assertTrue(recursiveEquals(term28457, term29276));
        assertTrue(recursiveEquals(term28632, term29278));
        assertTrue(recursiveEquals(term28597, null));
    }

};


