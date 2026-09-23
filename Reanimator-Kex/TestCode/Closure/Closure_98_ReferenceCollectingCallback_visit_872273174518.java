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

public class ReferenceCollectingCallback_visit_872273174518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141088;
     Object term141263;
     Object term141228;
     Object term141554;
     Object term141555;
     Object term141556;

    public ReferenceCollectingCallback_visit_872273174518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141088 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term141263 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term141263, term141263.getClass(), "type", 101);
        term141228 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term141228, term141228.getClass(), "type", 101);
        setField(term141228, term141228.getClass(), "first", term141263);
        term141554 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term141554, term141554.getClass(), "referenceMap", null);
        setField(term141554, term141554.getClass(), "blockStack", null);
        setField(term141554, term141554.getClass(), "behavior", null);
        setField(term141554, term141554.getClass(), "compiler", null);
        setField(term141554, term141554.getClass(), "varFilter", null);
        term141555 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term141555, term141555.getClass(), "type", 101);
        setField(term141555, term141555.getClass(), "next", null);
        setField(term141555, term141555.getClass(), "first", null);
        setField(term141555, term141555.getClass(), "last", null);
        setField(term141555, term141555.getClass(), "propListHead", null);
        setIntField(term141555, term141555.getClass(), "sourcePosition", 0);
        setField(term141555, term141555.getClass(), "jsType", null);
        setField(term141555, term141555.getClass(), "parent", null);
        term141556 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term141557 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term141556, term141556.getClass(), "type", 101);
        setField(term141556, term141556.getClass(), "next", null);
        setIntField(term141557, term141557.getClass(), "type", 101);
        setField(term141557, term141557.getClass(), "next", null);
        setField(term141557, term141557.getClass(), "first", null);
        setField(term141557, term141557.getClass(), "last", null);
        setField(term141557, term141557.getClass(), "propListHead", null);
        setIntField(term141557, term141557.getClass(), "sourcePosition", 0);
        setField(term141557, term141557.getClass(), "jsType", null);
        setField(term141557, term141557.getClass(), "parent", null);
        setField(term141556, term141556.getClass(), "first", term141557);
        setField(term141556, term141556.getClass(), "last", null);
        setField(term141556, term141556.getClass(), "propListHead", null);
        setIntField(term141556, term141556.getClass(), "sourcePosition", 0);
        setField(term141556, term141556.getClass(), "jsType", null);
        setField(term141556, term141556.getClass(), "parent", null);
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
        args[1] = term141263;
        args[2] = term141228;
        callMethod(klass, "visit", argTypes, term141088, args);
        assertTrue(recursiveEquals(term141088, term141554));
        assertTrue(recursiveEquals(term141263, term141556));
        assertTrue(recursiveEquals(term141228, null));
    }

};


