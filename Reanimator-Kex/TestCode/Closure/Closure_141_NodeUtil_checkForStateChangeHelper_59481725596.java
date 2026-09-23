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

public class NodeUtil_checkForStateChangeHelper_59481725596 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51844;
     Object term52209;

    public NodeUtil_checkForStateChangeHelper_59481725596() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51844 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term51844, term51844.getClass(), "type", 100);
        term52209 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term52209, term52209.getClass(), "type", 100);
        setField(term52209, term52209.getClass(), "next", null);
        setField(term52209, term52209.getClass(), "first", null);
        setField(term52209, term52209.getClass(), "last", null);
        setField(term52209, term52209.getClass(), "propListHead", null);
        setIntField(term52209, term52209.getClass(), "sourcePosition", 0);
        setField(term52209, term52209.getClass(), "jsType", null);
        setField(term52209, term52209.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term51844;
        args[1] = false;
        Object retValue = callMethod(klass, "checkForStateChangeHelper", argTypes, null, args);
        assertTrue(recursiveEquals(term51844, term52209));
        assertTrue(recursiveEquals(retValue, false));
    }

};


