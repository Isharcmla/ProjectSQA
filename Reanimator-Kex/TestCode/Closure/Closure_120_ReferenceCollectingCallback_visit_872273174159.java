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

public class ReferenceCollectingCallback_visit_872273174159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26897;
     Object term27072;
     Object term27037;
     Object term27775;
     Object term27776;
     Object term27777;

    public ReferenceCollectingCallback_visit_872273174159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26897 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term27072 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term27072, term27072.getClass(), "type", 98);
        term27037 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term27037, term27037.getClass(), "type", 98);
        setField(term27037, term27037.getClass(), "first", term27072);
        term27775 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term27775, term27775.getClass(), "referenceMap", null);
        setField(term27775, term27775.getClass(), "blockStack", null);
        setField(term27775, term27775.getClass(), "behavior", null);
        setField(term27775, term27775.getClass(), "compiler", null);
        setField(term27775, term27775.getClass(), "varFilter", null);
        term27776 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term27776, term27776.getClass(), "type", 98);
        setField(term27776, term27776.getClass(), "next", null);
        setField(term27776, term27776.getClass(), "first", null);
        setField(term27776, term27776.getClass(), "last", null);
        setField(term27776, term27776.getClass(), "propListHead", null);
        setIntField(term27776, term27776.getClass(), "sourcePosition", 0);
        setField(term27776, term27776.getClass(), "jsType", null);
        setField(term27776, term27776.getClass(), "parent", null);
        term27777 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27778 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term27777, term27777.getClass(), "type", 98);
        setField(term27777, term27777.getClass(), "next", null);
        setIntField(term27778, term27778.getClass(), "type", 98);
        setField(term27778, term27778.getClass(), "next", null);
        setField(term27778, term27778.getClass(), "first", null);
        setField(term27778, term27778.getClass(), "last", null);
        setField(term27778, term27778.getClass(), "propListHead", null);
        setIntField(term27778, term27778.getClass(), "sourcePosition", 0);
        setField(term27778, term27778.getClass(), "jsType", null);
        setField(term27778, term27778.getClass(), "parent", null);
        setField(term27777, term27777.getClass(), "first", term27778);
        setField(term27777, term27777.getClass(), "last", null);
        setField(term27777, term27777.getClass(), "propListHead", null);
        setIntField(term27777, term27777.getClass(), "sourcePosition", 0);
        setField(term27777, term27777.getClass(), "jsType", null);
        setField(term27777, term27777.getClass(), "parent", null);
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
        args[1] = term27072;
        args[2] = term27037;
        callMethod(klass, "visit", argTypes, term26897, args);
        assertTrue(recursiveEquals(term26897, term27775));
        assertTrue(recursiveEquals(term27072, term27777));
        assertTrue(recursiveEquals(term27037, null));
    }

};


