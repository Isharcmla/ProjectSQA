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

public class ReferenceCollectingCallback_isBlockBoundary_6846987211297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term394679;
     Object term394771;
     Object term395220;
     Object term395221;

    public ReferenceCollectingCallback_isBlockBoundary_6846987211297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term394679 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term394771 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term394771, term394771.getClass(), "type", 12);
        term395220 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term395220, term395220.getClass(), "number", 0.0);
        setIntField(term395220, term395220.getClass(), "type", 12);
        setField(term395220, term395220.getClass(), "next", null);
        setField(term395220, term395220.getClass(), "first", null);
        setField(term395220, term395220.getClass(), "last", null);
        setField(term395220, term395220.getClass(), "propListHead", null);
        setIntField(term395220, term395220.getClass(), "sourcePosition", 0);
        setField(term395220, term395220.getClass(), "jsType", null);
        setField(term395220, term395220.getClass(), "parent", null);
        term395221 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term395221, term395221.getClass(), "number", 0.0);
        setIntField(term395221, term395221.getClass(), "type", 0);
        setField(term395221, term395221.getClass(), "next", null);
        setField(term395221, term395221.getClass(), "first", null);
        setField(term395221, term395221.getClass(), "last", null);
        setField(term395221, term395221.getClass(), "propListHead", null);
        setIntField(term395221, term395221.getClass(), "sourcePosition", 0);
        setField(term395221, term395221.getClass(), "jsType", null);
        setField(term395221, term395221.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term394679;
        args[1] = term394771;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term394679, term395220));
        assertTrue(recursiveEquals(term394771, term395221));
        assertTrue(recursiveEquals(retValue, false));
    }

};


