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

public class NodeUtil_checkForStateChangeHelper_59481725299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23211;
     Object term23506;

    public NodeUtil_checkForStateChangeHelper_59481725299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23211 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23211, term23211.getClass(), "type", 46);
        term23506 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23506, term23506.getClass(), "type", 46);
        setField(term23506, term23506.getClass(), "next", null);
        setField(term23506, term23506.getClass(), "first", null);
        setField(term23506, term23506.getClass(), "last", null);
        setField(term23506, term23506.getClass(), "propListHead", null);
        setIntField(term23506, term23506.getClass(), "sourcePosition", 0);
        setField(term23506, term23506.getClass(), "jsType", null);
        setField(term23506, term23506.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term23211;
        args[1] = false;
        Object retValue = callMethod(klass, "checkForStateChangeHelper", argTypes, null, args);
        assertTrue(recursiveEquals(term23211, term23506));
        assertTrue(recursiveEquals(retValue, false));
    }

};


