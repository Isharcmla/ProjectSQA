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

public class NodeUtil_checkForStateChangeHelper_59481725453 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36994;
     Object term37002;

    public NodeUtil_checkForStateChangeHelper_59481725453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36994 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term36994, term36994.getClass(), "type", 44);
        term37002 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term37002, term37002.getClass(), "type", 44);
        setField(term37002, term37002.getClass(), "next", null);
        setField(term37002, term37002.getClass(), "first", null);
        setField(term37002, term37002.getClass(), "last", null);
        setField(term37002, term37002.getClass(), "propListHead", null);
        setIntField(term37002, term37002.getClass(), "sourcePosition", 0);
        setField(term37002, term37002.getClass(), "jsType", null);
        setField(term37002, term37002.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term36994;
        args[1] = false;
        Object retValue = callMethod(klass, "checkForStateChangeHelper", argTypes, null, args);
        assertTrue(recursiveEquals(term36994, term37002));
        assertTrue(recursiveEquals(retValue, false));
    }

};


