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

public class ReferenceCollectingCallback_visit_872273174100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19625;
     Object term19717;
     Object term19809;
     Object term20359;
     Object term20360;
     Object term20361;

    public ReferenceCollectingCallback_visit_872273174100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19625 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term19717 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term19717, term19717.getClass(), "type", -39);
        term19809 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term20359 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term20359, term20359.getClass(), "referenceMap", null);
        setField(term20359, term20359.getClass(), "blockStack", null);
        setField(term20359, term20359.getClass(), "behavior", null);
        setField(term20359, term20359.getClass(), "compiler", null);
        setField(term20359, term20359.getClass(), "varFilter", null);
        term20360 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term20360, term20360.getClass(), "number", 0.0);
        setIntField(term20360, term20360.getClass(), "type", -39);
        setField(term20360, term20360.getClass(), "next", null);
        setField(term20360, term20360.getClass(), "first", null);
        setField(term20360, term20360.getClass(), "last", null);
        setField(term20360, term20360.getClass(), "propListHead", null);
        setIntField(term20360, term20360.getClass(), "sourcePosition", 0);
        setField(term20360, term20360.getClass(), "jsType", null);
        setField(term20360, term20360.getClass(), "parent", null);
        term20361 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term20361, term20361.getClass(), "number", 0.0);
        setIntField(term20361, term20361.getClass(), "type", 0);
        setField(term20361, term20361.getClass(), "next", null);
        setField(term20361, term20361.getClass(), "first", null);
        setField(term20361, term20361.getClass(), "last", null);
        setField(term20361, term20361.getClass(), "propListHead", null);
        setIntField(term20361, term20361.getClass(), "sourcePosition", 0);
        setField(term20361, term20361.getClass(), "jsType", null);
        setField(term20361, term20361.getClass(), "parent", null);
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
        args[1] = term19717;
        args[2] = term19809;
        callMethod(klass, "visit", argTypes, term19625, args);
        assertTrue(recursiveEquals(term19625, term20359));
        assertTrue(recursiveEquals(term19717, term20361));
        assertTrue(recursiveEquals(term19809, null));
    }

};


