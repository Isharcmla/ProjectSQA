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

public class ReferenceCollectingCallback_isBlockBoundary_684698721846 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223400;
     Object term223470;
     Object term223482;
     Object term223483;

    public ReferenceCollectingCallback_isBlockBoundary_684698721846() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term223400 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term223400, term223400.getClass(), "type", 111);
        term223470 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term223470, term223470.getClass(), "type", 12);
        term223482 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term223482, term223482.getClass(), "type", 12);
        setField(term223482, term223482.getClass(), "next", null);
        setField(term223482, term223482.getClass(), "first", null);
        setField(term223482, term223482.getClass(), "last", null);
        setField(term223482, term223482.getClass(), "propListHead", null);
        setIntField(term223482, term223482.getClass(), "sourcePosition", 0);
        setField(term223482, term223482.getClass(), "jsType", null);
        setField(term223482, term223482.getClass(), "parent", null);
        term223483 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term223483, term223483.getClass(), "type", 111);
        setField(term223483, term223483.getClass(), "next", null);
        setField(term223483, term223483.getClass(), "first", null);
        setField(term223483, term223483.getClass(), "last", null);
        setField(term223483, term223483.getClass(), "propListHead", null);
        setIntField(term223483, term223483.getClass(), "sourcePosition", 0);
        setField(term223483, term223483.getClass(), "jsType", null);
        setField(term223483, term223483.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term223400;
        args[1] = term223470;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term223400, term223482));
        assertTrue(recursiveEquals(term223470, term223483));
        assertTrue(recursiveEquals(retValue, true));
    }

};


