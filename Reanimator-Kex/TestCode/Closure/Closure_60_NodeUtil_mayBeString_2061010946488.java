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

public class NodeUtil_mayBeString_2061010946488 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79978;
     Object term80099;

    public NodeUtil_mayBeString_2061010946488() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79978 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term79978, term79978.getClass(), "type", 14);
        term80099 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term80099, term80099.getClass(), "type", 14);
        setField(term80099, term80099.getClass(), "next", null);
        setField(term80099, term80099.getClass(), "first", null);
        setField(term80099, term80099.getClass(), "last", null);
        setField(term80099, term80099.getClass(), "propListHead", null);
        setIntField(term80099, term80099.getClass(), "sourcePosition", 0);
        setField(term80099, term80099.getClass(), "jsType", null);
        setField(term80099, term80099.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term79978;
        callMethod(klass, "mayBeString", argTypes, null, args);
        assertTrue(recursiveEquals(term79978, term80099));
    }

};


