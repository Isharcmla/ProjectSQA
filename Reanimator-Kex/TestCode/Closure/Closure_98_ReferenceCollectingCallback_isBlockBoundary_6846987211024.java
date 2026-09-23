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

public class ReferenceCollectingCallback_isBlockBoundary_6846987211024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term281926;
     Object term282018;
     Object term282042;
     Object term282043;

    public ReferenceCollectingCallback_isBlockBoundary_6846987211024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term281926 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term281926, term281926.getClass(), "type", 111);
        term282018 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term282018, term282018.getClass(), "type", 12);
        term282042 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term282042, term282042.getClass(), "number", 0.0);
        setIntField(term282042, term282042.getClass(), "type", 12);
        setField(term282042, term282042.getClass(), "next", null);
        setField(term282042, term282042.getClass(), "first", null);
        setField(term282042, term282042.getClass(), "last", null);
        setField(term282042, term282042.getClass(), "propListHead", null);
        setIntField(term282042, term282042.getClass(), "sourcePosition", 0);
        setField(term282042, term282042.getClass(), "jsType", null);
        setField(term282042, term282042.getClass(), "parent", null);
        term282043 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term282043, term282043.getClass(), "number", 0.0);
        setIntField(term282043, term282043.getClass(), "type", 111);
        setField(term282043, term282043.getClass(), "next", null);
        setField(term282043, term282043.getClass(), "first", null);
        setField(term282043, term282043.getClass(), "last", null);
        setField(term282043, term282043.getClass(), "propListHead", null);
        setIntField(term282043, term282043.getClass(), "sourcePosition", 0);
        setField(term282043, term282043.getClass(), "jsType", null);
        setField(term282043, term282043.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term281926;
        args[1] = term282018;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term281926, term282042));
        assertTrue(recursiveEquals(term282018, term282043));
        assertTrue(recursiveEquals(retValue, true));
    }

};


