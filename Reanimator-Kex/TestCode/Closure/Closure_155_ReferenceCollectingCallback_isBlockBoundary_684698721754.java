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

public class ReferenceCollectingCallback_isBlockBoundary_684698721754 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196359;
     Object term196366;

    public ReferenceCollectingCallback_isBlockBoundary_684698721754() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term196359 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term196359, term196359.getClass(), "type", 113);
        term196366 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term196366, term196366.getClass(), "str", null);
        setIntField(term196366, term196366.getClass(), "type", 113);
        setField(term196366, term196366.getClass(), "next", null);
        setField(term196366, term196366.getClass(), "first", null);
        setField(term196366, term196366.getClass(), "last", null);
        setField(term196366, term196366.getClass(), "propListHead", null);
        setIntField(term196366, term196366.getClass(), "sourcePosition", 0);
        setField(term196366, term196366.getClass(), "jsType", null);
        setField(term196366, term196366.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term196359;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term196359, null));
        assertTrue(recursiveEquals(retValue, true));
    }

};


