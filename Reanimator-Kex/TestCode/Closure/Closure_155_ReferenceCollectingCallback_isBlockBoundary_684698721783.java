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

public class ReferenceCollectingCallback_isBlockBoundary_684698721783 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term202869;
     Object term202877;

    public ReferenceCollectingCallback_isBlockBoundary_684698721783() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term202869 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term202869, term202869.getClass(), "type", 115);
        term202877 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term202877, term202877.getClass(), "number", 0.0);
        setIntField(term202877, term202877.getClass(), "type", 115);
        setField(term202877, term202877.getClass(), "next", null);
        setField(term202877, term202877.getClass(), "first", null);
        setField(term202877, term202877.getClass(), "last", null);
        setField(term202877, term202877.getClass(), "propListHead", null);
        setIntField(term202877, term202877.getClass(), "sourcePosition", 0);
        setField(term202877, term202877.getClass(), "jsType", null);
        setField(term202877, term202877.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term202869;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term202869, null));
        assertTrue(recursiveEquals(retValue, true));
    }

};


