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

public class NodeUtil_getFunctionBody_1855640240477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39565;
     Object term39580;

    public NodeUtil_getFunctionBody_1855640240477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39565 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term39565, term39565.getClass(), "type", 105);
        term39580 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term39580, term39580.getClass(), "type", 105);
        setField(term39580, term39580.getClass(), "next", null);
        setField(term39580, term39580.getClass(), "first", null);
        setField(term39580, term39580.getClass(), "last", null);
        setField(term39580, term39580.getClass(), "propListHead", null);
        setIntField(term39580, term39580.getClass(), "sourcePosition", 0);
        setField(term39580, term39580.getClass(), "jsType", null);
        setField(term39580, term39580.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term39565;
        Object retValue = callMethod(klass, "getFunctionBody", argTypes, null, args);
        assertTrue(recursiveEquals(term39565, term39580));
        assertTrue(recursiveEquals(retValue, null));
    }

};


