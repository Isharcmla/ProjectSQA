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

public class ReferenceCollectingCallback_isBlockBoundary_6846987211351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term382555;
     Object term383835;

    public ReferenceCollectingCallback_isBlockBoundary_6846987211351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term382555 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term382555, term382555.getClass(), "type", 111);
        term383835 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term383835, term383835.getClass(), "str", null);
        setIntField(term383835, term383835.getClass(), "type", 111);
        setField(term383835, term383835.getClass(), "next", null);
        setField(term383835, term383835.getClass(), "first", null);
        setField(term383835, term383835.getClass(), "last", null);
        setField(term383835, term383835.getClass(), "propListHead", null);
        setIntField(term383835, term383835.getClass(), "sourcePosition", 0);
        setField(term383835, term383835.getClass(), "jsType", null);
        setField(term383835, term383835.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term382555;
        args[1] = null;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term382555, term383835));
        assertTrue(recursiveEquals(retValue, true));
    }

};


