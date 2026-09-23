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

public class ReferenceCollectingCallback_isBlockBoundary_684698721727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term191770;
     Object term191862;
     Object term191885;
     Object term191886;

    public ReferenceCollectingCallback_isBlockBoundary_684698721727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term191770 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term191862 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term191862, term191862.getClass(), "type", 12);
        term191885 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term191885, term191885.getClass(), "number", 0.0);
        setIntField(term191885, term191885.getClass(), "type", 12);
        setField(term191885, term191885.getClass(), "next", null);
        setField(term191885, term191885.getClass(), "first", null);
        setField(term191885, term191885.getClass(), "last", null);
        setField(term191885, term191885.getClass(), "propListHead", null);
        setIntField(term191885, term191885.getClass(), "sourcePosition", 0);
        setField(term191885, term191885.getClass(), "jsType", null);
        setField(term191885, term191885.getClass(), "parent", null);
        term191886 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term191886, term191886.getClass(), "number", 0.0);
        setIntField(term191886, term191886.getClass(), "type", 0);
        setField(term191886, term191886.getClass(), "next", null);
        setField(term191886, term191886.getClass(), "first", null);
        setField(term191886, term191886.getClass(), "last", null);
        setField(term191886, term191886.getClass(), "propListHead", null);
        setIntField(term191886, term191886.getClass(), "sourcePosition", 0);
        setField(term191886, term191886.getClass(), "jsType", null);
        setField(term191886, term191886.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term191770;
        args[1] = term191862;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term191770, term191885));
        assertTrue(recursiveEquals(term191862, term191886));
        assertTrue(recursiveEquals(retValue, false));
    }

};


