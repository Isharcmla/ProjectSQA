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

public class NodeUtil_callHasLocalResult_370414859529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56588;
     Object term56612;

    public NodeUtil_callHasLocalResult_370414859529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56588 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term56588, term56588.getClass(), "type", 37);
        term56612 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term56612, term56612.getClass(), "type", 37);
        setField(term56612, term56612.getClass(), "next", null);
        setField(term56612, term56612.getClass(), "first", null);
        setField(term56612, term56612.getClass(), "last", null);
        setField(term56612, term56612.getClass(), "propListHead", null);
        setIntField(term56612, term56612.getClass(), "sourcePosition", 0);
        setField(term56612, term56612.getClass(), "jsType", null);
        setField(term56612, term56612.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term56588;
        Object retValue = callMethod(klass, "callHasLocalResult", argTypes, null, args);
        assertTrue(recursiveEquals(term56588, term56612));
        assertTrue(recursiveEquals(retValue, false));
    }

};


