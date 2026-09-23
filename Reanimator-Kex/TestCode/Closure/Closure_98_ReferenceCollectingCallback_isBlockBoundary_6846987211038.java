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

public class ReferenceCollectingCallback_isBlockBoundary_6846987211038 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term287565;
     Object term287635;
     Object term288150;
     Object term288152;

    public ReferenceCollectingCallback_isBlockBoundary_6846987211038() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term287565 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term287635 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term287705 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term287635, term287635.getClass(), "type", 101);
        setField(term287635, term287635.getClass(), "first", term287705);
        term288150 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term288151 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term288150, term288150.getClass(), "type", 101);
        setField(term288150, term288150.getClass(), "next", null);
        setIntField(term288151, term288151.getClass(), "type", 0);
        setField(term288151, term288151.getClass(), "next", null);
        setField(term288151, term288151.getClass(), "first", null);
        setField(term288151, term288151.getClass(), "last", null);
        setField(term288151, term288151.getClass(), "propListHead", null);
        setIntField(term288151, term288151.getClass(), "sourcePosition", 0);
        setField(term288151, term288151.getClass(), "jsType", null);
        setField(term288151, term288151.getClass(), "parent", null);
        setField(term288150, term288150.getClass(), "first", term288151);
        setField(term288150, term288150.getClass(), "last", null);
        setField(term288150, term288150.getClass(), "propListHead", null);
        setIntField(term288150, term288150.getClass(), "sourcePosition", 0);
        setField(term288150, term288150.getClass(), "jsType", null);
        setField(term288150, term288150.getClass(), "parent", null);
        term288152 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term288152, term288152.getClass(), "type", 0);
        setField(term288152, term288152.getClass(), "next", null);
        setField(term288152, term288152.getClass(), "first", null);
        setField(term288152, term288152.getClass(), "last", null);
        setField(term288152, term288152.getClass(), "propListHead", null);
        setIntField(term288152, term288152.getClass(), "sourcePosition", 0);
        setField(term288152, term288152.getClass(), "jsType", null);
        setField(term288152, term288152.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term287565;
        args[1] = term287635;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term287565, term288150));
        assertTrue(recursiveEquals(term287635, term288152));
        assertTrue(recursiveEquals(retValue, true));
    }

};


