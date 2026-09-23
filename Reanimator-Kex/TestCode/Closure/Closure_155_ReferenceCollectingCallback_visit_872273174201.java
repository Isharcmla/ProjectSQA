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

public class ReferenceCollectingCallback_visit_872273174201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46868;
     Object term47043;
     Object term47008;
     Object term47665;
     Object term47666;
     Object term47667;

    public ReferenceCollectingCallback_visit_872273174201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46868 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term47043 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term47043, term47043.getClass(), "type", 98);
        term47008 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term47008, term47008.getClass(), "type", 98);
        setField(term47008, term47008.getClass(), "first", term47043);
        term47665 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term47665, term47665.getClass(), "referenceMap", null);
        setField(term47665, term47665.getClass(), "blockStack", null);
        setField(term47665, term47665.getClass(), "behavior", null);
        setField(term47665, term47665.getClass(), "compiler", null);
        setField(term47665, term47665.getClass(), "varFilter", null);
        term47666 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term47666, term47666.getClass(), "type", 98);
        setField(term47666, term47666.getClass(), "next", null);
        setField(term47666, term47666.getClass(), "first", null);
        setField(term47666, term47666.getClass(), "last", null);
        setField(term47666, term47666.getClass(), "propListHead", null);
        setIntField(term47666, term47666.getClass(), "sourcePosition", 0);
        setField(term47666, term47666.getClass(), "jsType", null);
        setField(term47666, term47666.getClass(), "parent", null);
        term47667 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47668 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term47667, term47667.getClass(), "type", 98);
        setField(term47667, term47667.getClass(), "next", null);
        setIntField(term47668, term47668.getClass(), "type", 98);
        setField(term47668, term47668.getClass(), "next", null);
        setField(term47668, term47668.getClass(), "first", null);
        setField(term47668, term47668.getClass(), "last", null);
        setField(term47668, term47668.getClass(), "propListHead", null);
        setIntField(term47668, term47668.getClass(), "sourcePosition", 0);
        setField(term47668, term47668.getClass(), "jsType", null);
        setField(term47668, term47668.getClass(), "parent", null);
        setField(term47667, term47667.getClass(), "first", term47668);
        setField(term47667, term47667.getClass(), "last", null);
        setField(term47667, term47667.getClass(), "propListHead", null);
        setIntField(term47667, term47667.getClass(), "sourcePosition", 0);
        setField(term47667, term47667.getClass(), "jsType", null);
        setField(term47667, term47667.getClass(), "parent", null);
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
        args[1] = term47043;
        args[2] = term47008;
        callMethod(klass, "visit", argTypes, term46868, args);
        assertTrue(recursiveEquals(term46868, term47665));
        assertTrue(recursiveEquals(term47043, term47667));
        assertTrue(recursiveEquals(term47008, null));
    }

};


