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

public class ReferenceCollectingCallback_isBlockBoundary_684698721509 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143371;
     Object term143463;
     Object term146554;
     Object term146555;

    public ReferenceCollectingCallback_isBlockBoundary_684698721509() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143371 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term143463 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term143463, term143463.getClass(), "type", 12);
        term146554 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term146554, term146554.getClass(), "str", null);
        setIntField(term146554, term146554.getClass(), "type", 12);
        setField(term146554, term146554.getClass(), "next", null);
        setField(term146554, term146554.getClass(), "first", null);
        setField(term146554, term146554.getClass(), "last", null);
        setField(term146554, term146554.getClass(), "propListHead", null);
        setIntField(term146554, term146554.getClass(), "sourcePosition", 0);
        setField(term146554, term146554.getClass(), "jsType", null);
        setField(term146554, term146554.getClass(), "parent", null);
        term146555 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term146555, term146555.getClass(), "str", null);
        setIntField(term146555, term146555.getClass(), "type", 0);
        setField(term146555, term146555.getClass(), "next", null);
        setField(term146555, term146555.getClass(), "first", null);
        setField(term146555, term146555.getClass(), "last", null);
        setField(term146555, term146555.getClass(), "propListHead", null);
        setIntField(term146555, term146555.getClass(), "sourcePosition", 0);
        setField(term146555, term146555.getClass(), "jsType", null);
        setField(term146555, term146555.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term143371;
        args[1] = term143463;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term143371, term146554));
        assertTrue(recursiveEquals(term143463, term146555));
        assertTrue(recursiveEquals(retValue, false));
    }

};


