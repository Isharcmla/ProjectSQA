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

public class NodeUtil_mayBeStringHelper_1019295344505 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67092;
     Object term73837;

    public NodeUtil_mayBeStringHelper_1019295344505() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67092 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term67092, term67092.getClass(), "type", 25);
        term73837 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term73837, term73837.getClass(), "type", 25);
        setField(term73837, term73837.getClass(), "next", null);
        setField(term73837, term73837.getClass(), "first", null);
        setField(term73837, term73837.getClass(), "last", null);
        setField(term73837, term73837.getClass(), "propListHead", null);
        setIntField(term73837, term73837.getClass(), "sourcePosition", 0);
        setField(term73837, term73837.getClass(), "jsType", null);
        setField(term73837, term73837.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term67092;
        Object retValue = callMethod(klass, "mayBeStringHelper", argTypes, null, args);
        assertTrue(recursiveEquals(term67092, term73837));
        assertTrue(recursiveEquals(retValue, false));
    }

};


