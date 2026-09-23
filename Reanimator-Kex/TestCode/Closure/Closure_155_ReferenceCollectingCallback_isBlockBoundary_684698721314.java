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

public class ReferenceCollectingCallback_isBlockBoundary_684698721314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73176;
     Object term73246;
     Object term73552;
     Object term73554;

    public ReferenceCollectingCallback_isBlockBoundary_684698721314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73176 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term73246 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term73316 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term73246, term73246.getClass(), "type", 101);
        setField(term73246, term73246.getClass(), "first", term73316);
        term73552 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term73553 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term73552, term73552.getClass(), "type", 101);
        setField(term73552, term73552.getClass(), "next", null);
        setIntField(term73553, term73553.getClass(), "type", 0);
        setField(term73553, term73553.getClass(), "next", null);
        setField(term73553, term73553.getClass(), "first", null);
        setField(term73553, term73553.getClass(), "last", null);
        setField(term73553, term73553.getClass(), "propListHead", null);
        setIntField(term73553, term73553.getClass(), "sourcePosition", 0);
        setField(term73553, term73553.getClass(), "jsType", null);
        setField(term73553, term73553.getClass(), "parent", null);
        setField(term73552, term73552.getClass(), "first", term73553);
        setField(term73552, term73552.getClass(), "last", null);
        setField(term73552, term73552.getClass(), "propListHead", null);
        setIntField(term73552, term73552.getClass(), "sourcePosition", 0);
        setField(term73552, term73552.getClass(), "jsType", null);
        setField(term73552, term73552.getClass(), "parent", null);
        term73554 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term73554, term73554.getClass(), "type", 0);
        setField(term73554, term73554.getClass(), "next", null);
        setField(term73554, term73554.getClass(), "first", null);
        setField(term73554, term73554.getClass(), "last", null);
        setField(term73554, term73554.getClass(), "propListHead", null);
        setIntField(term73554, term73554.getClass(), "sourcePosition", 0);
        setField(term73554, term73554.getClass(), "jsType", null);
        setField(term73554, term73554.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term73176;
        args[1] = term73246;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term73176, term73552));
        assertTrue(recursiveEquals(term73246, term73554));
        assertTrue(recursiveEquals(retValue, true));
    }

};


