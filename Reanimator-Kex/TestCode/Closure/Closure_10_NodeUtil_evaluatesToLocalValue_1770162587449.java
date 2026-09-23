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

public class NodeUtil_evaluatesToLocalValue_1770162587449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58626;
     Object term58632;

    public NodeUtil_evaluatesToLocalValue_1770162587449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58626 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term58626, term58626.getClass(), "type", 64);
        term58632 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term58632, term58632.getClass(), "type", 64);
        setField(term58632, term58632.getClass(), "next", null);
        setField(term58632, term58632.getClass(), "first", null);
        setField(term58632, term58632.getClass(), "last", null);
        setField(term58632, term58632.getClass(), "propListHead", null);
        setIntField(term58632, term58632.getClass(), "sourcePosition", 0);
        setField(term58632, term58632.getClass(), "jsType", null);
        setField(term58632, term58632.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[2];
        args[0] = term58626;
        args[1] = null;
        Object retValue = callMethod(klass, "evaluatesToLocalValue", argTypes, null, args);
        assertTrue(recursiveEquals(term58626, term58632));
        assertTrue(recursiveEquals(retValue, true));
    }

};


