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

public class ReferenceCollectingCallback_visit_872273174202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49961;
     Object term50136;
     Object term50101;
     Object term50448;
     Object term50449;
     Object term50450;

    public ReferenceCollectingCallback_visit_872273174202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49961 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term50136 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term50136, term50136.getClass(), "type", 108);
        term50101 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term50101, term50101.getClass(), "type", 108);
        setField(term50101, term50101.getClass(), "first", term50136);
        term50448 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term50448, term50448.getClass(), "referenceMap", null);
        setField(term50448, term50448.getClass(), "blockStack", null);
        setField(term50448, term50448.getClass(), "behavior", null);
        setField(term50448, term50448.getClass(), "compiler", null);
        setField(term50448, term50448.getClass(), "varFilter", null);
        term50449 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term50449, term50449.getClass(), "type", 108);
        setField(term50449, term50449.getClass(), "next", null);
        setField(term50449, term50449.getClass(), "first", null);
        setField(term50449, term50449.getClass(), "last", null);
        setField(term50449, term50449.getClass(), "propListHead", null);
        setIntField(term50449, term50449.getClass(), "sourcePosition", 0);
        setField(term50449, term50449.getClass(), "jsType", null);
        setField(term50449, term50449.getClass(), "parent", null);
        term50450 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50451 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term50450, term50450.getClass(), "type", 108);
        setField(term50450, term50450.getClass(), "next", null);
        setIntField(term50451, term50451.getClass(), "type", 108);
        setField(term50451, term50451.getClass(), "next", null);
        setField(term50451, term50451.getClass(), "first", null);
        setField(term50451, term50451.getClass(), "last", null);
        setField(term50451, term50451.getClass(), "propListHead", null);
        setIntField(term50451, term50451.getClass(), "sourcePosition", 0);
        setField(term50451, term50451.getClass(), "jsType", null);
        setField(term50451, term50451.getClass(), "parent", null);
        setField(term50450, term50450.getClass(), "first", term50451);
        setField(term50450, term50450.getClass(), "last", null);
        setField(term50450, term50450.getClass(), "propListHead", null);
        setIntField(term50450, term50450.getClass(), "sourcePosition", 0);
        setField(term50450, term50450.getClass(), "jsType", null);
        setField(term50450, term50450.getClass(), "parent", null);
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
        args[1] = term50136;
        args[2] = term50101;
        callMethod(klass, "visit", argTypes, term49961, args);
        assertTrue(recursiveEquals(term49961, term50448));
        assertTrue(recursiveEquals(term50136, term50450));
        assertTrue(recursiveEquals(term50101, null));
    }

};


