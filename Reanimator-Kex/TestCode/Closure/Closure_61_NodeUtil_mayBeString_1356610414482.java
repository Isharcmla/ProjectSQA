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

public class NodeUtil_mayBeString_1356610414482 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40744;
     Object term40844;

    public NodeUtil_mayBeString_1356610414482() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40744 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term40744, term40744.getClass(), "type", 102);
        term40844 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term40844, term40844.getClass(), "type", 102);
        setField(term40844, term40844.getClass(), "next", null);
        setField(term40844, term40844.getClass(), "first", null);
        setField(term40844, term40844.getClass(), "last", null);
        setField(term40844, term40844.getClass(), "propListHead", null);
        setIntField(term40844, term40844.getClass(), "sourcePosition", 0);
        setField(term40844, term40844.getClass(), "jsType", null);
        setField(term40844, term40844.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term40744;
        args[1] = false;
        callMethod(klass, "mayBeString", argTypes, null, args);
        assertTrue(recursiveEquals(term40744, term40844));
    }

};


