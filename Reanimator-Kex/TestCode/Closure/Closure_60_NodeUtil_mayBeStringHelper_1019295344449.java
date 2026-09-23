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

public class NodeUtil_mayBeStringHelper_1019295344449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65715;
     Object term66688;

    public NodeUtil_mayBeStringHelper_1019295344449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65715 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term65715, term65715.getClass(), "type", 49);
        term66688 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term66688, term66688.getClass(), "type", 49);
        setField(term66688, term66688.getClass(), "next", null);
        setField(term66688, term66688.getClass(), "first", null);
        setField(term66688, term66688.getClass(), "last", null);
        setField(term66688, term66688.getClass(), "propListHead", null);
        setIntField(term66688, term66688.getClass(), "sourcePosition", 0);
        setField(term66688, term66688.getClass(), "jsType", null);
        setField(term66688, term66688.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term65715;
        Object retValue = callMethod(klass, "mayBeStringHelper", argTypes, null, args);
        assertTrue(recursiveEquals(term65715, term66688));
        assertTrue(recursiveEquals(retValue, true));
    }

};


