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

public class ReferenceCollectingCallback_isBlockBoundary_6846987211257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term345345;
     Object term346002;

    public ReferenceCollectingCallback_isBlockBoundary_6846987211257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term345345 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term345345, term345345.getClass(), "type", 98);
        term346002 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term346002, term346002.getClass(), "str", null);
        setIntField(term346002, term346002.getClass(), "type", 98);
        setField(term346002, term346002.getClass(), "next", null);
        setField(term346002, term346002.getClass(), "first", null);
        setField(term346002, term346002.getClass(), "last", null);
        setField(term346002, term346002.getClass(), "propListHead", null);
        setIntField(term346002, term346002.getClass(), "sourcePosition", 0);
        setField(term346002, term346002.getClass(), "jsType", null);
        setField(term346002, term346002.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term345345;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term345345, null));
        assertTrue(recursiveEquals(retValue, false));
    }

};


