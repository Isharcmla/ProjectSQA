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

public class ReferenceCollectingCallback_isBlockBoundary_684698721465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120349;
     Object term120357;

    public ReferenceCollectingCallback_isBlockBoundary_684698721465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120349 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term120349, term120349.getClass(), "type", 101);
        term120357 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term120357, term120357.getClass(), "str", null);
        setIntField(term120357, term120357.getClass(), "type", 101);
        setField(term120357, term120357.getClass(), "next", null);
        setField(term120357, term120357.getClass(), "first", null);
        setField(term120357, term120357.getClass(), "last", null);
        setField(term120357, term120357.getClass(), "propListHead", null);
        setIntField(term120357, term120357.getClass(), "sourcePosition", 0);
        setField(term120357, term120357.getClass(), "jsType", null);
        setField(term120357, term120357.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term120349;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term120349, null));
        assertTrue(recursiveEquals(retValue, false));
    }

};


