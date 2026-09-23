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

public class ReferenceCollectingCallback_isBlockBoundary_684698721679 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179143;
     Object term179462;

    public ReferenceCollectingCallback_isBlockBoundary_684698721679() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term179143 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term179143, term179143.getClass(), "type", 114);
        term179462 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term179462, term179462.getClass(), "number", 0.0);
        setIntField(term179462, term179462.getClass(), "type", 114);
        setField(term179462, term179462.getClass(), "next", null);
        setField(term179462, term179462.getClass(), "first", null);
        setField(term179462, term179462.getClass(), "last", null);
        setField(term179462, term179462.getClass(), "propListHead", null);
        setIntField(term179462, term179462.getClass(), "sourcePosition", 0);
        setField(term179462, term179462.getClass(), "jsType", null);
        setField(term179462, term179462.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term179143;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term179143, null));
        assertTrue(recursiveEquals(retValue, true));
    }

};


