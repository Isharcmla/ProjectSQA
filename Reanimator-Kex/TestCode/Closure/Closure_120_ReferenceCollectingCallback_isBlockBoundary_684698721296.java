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

public class ReferenceCollectingCallback_isBlockBoundary_684698721296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61559;
     Object term61577;

    public ReferenceCollectingCallback_isBlockBoundary_684698721296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61559 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term61559, term61559.getClass(), "type", 115);
        term61577 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term61577, term61577.getClass(), "number", 0.0);
        setIntField(term61577, term61577.getClass(), "type", 115);
        setField(term61577, term61577.getClass(), "next", null);
        setField(term61577, term61577.getClass(), "first", null);
        setField(term61577, term61577.getClass(), "last", null);
        setField(term61577, term61577.getClass(), "propListHead", null);
        setIntField(term61577, term61577.getClass(), "sourcePosition", 0);
        setField(term61577, term61577.getClass(), "jsType", null);
        setField(term61577, term61577.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term61559;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term61559, null));
        assertTrue(recursiveEquals(retValue, true));
    }

};


