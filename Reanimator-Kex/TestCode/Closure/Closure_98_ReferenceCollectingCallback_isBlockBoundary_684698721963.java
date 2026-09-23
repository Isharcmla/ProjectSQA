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

public class ReferenceCollectingCallback_isBlockBoundary_684698721963 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term261050;
     Object term261059;

    public ReferenceCollectingCallback_isBlockBoundary_684698721963() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term261050 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term261059 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term261059, term261059.getClass(), "number", 0.0);
        setIntField(term261059, term261059.getClass(), "type", 0);
        setField(term261059, term261059.getClass(), "next", null);
        setField(term261059, term261059.getClass(), "first", null);
        setField(term261059, term261059.getClass(), "last", null);
        setField(term261059, term261059.getClass(), "propListHead", null);
        setIntField(term261059, term261059.getClass(), "sourcePosition", 0);
        setField(term261059, term261059.getClass(), "jsType", null);
        setField(term261059, term261059.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term261050;
        args[1] = null;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term261050, term261059));
        assertTrue(recursiveEquals(retValue, false));
    }

};


