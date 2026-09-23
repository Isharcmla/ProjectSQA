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

public class ReferenceCollectingCallback_isBlockBoundary_684698721118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16019;
     Object term18467;

    public ReferenceCollectingCallback_isBlockBoundary_684698721118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16019 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term16019, term16019.getClass(), "type", 98);
        term18467 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term18467, term18467.getClass(), "number", 0.0);
        setIntField(term18467, term18467.getClass(), "type", 98);
        setField(term18467, term18467.getClass(), "next", null);
        setField(term18467, term18467.getClass(), "first", null);
        setField(term18467, term18467.getClass(), "last", null);
        setField(term18467, term18467.getClass(), "propListHead", null);
        setIntField(term18467, term18467.getClass(), "sourcePosition", 0);
        setField(term18467, term18467.getClass(), "jsType", null);
        setField(term18467, term18467.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term16019;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term16019, null));
        assertTrue(recursiveEquals(retValue, false));
    }

};


