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

public class NodeUtil_mayEffectMutableState_1245479864344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34081;
     Object term34097;

    public NodeUtil_mayEffectMutableState_1245479864344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34081 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34081, term34081.getClass(), "type", 128);
        term34097 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34097, term34097.getClass(), "type", 128);
        setField(term34097, term34097.getClass(), "next", null);
        setField(term34097, term34097.getClass(), "first", null);
        setField(term34097, term34097.getClass(), "last", null);
        setField(term34097, term34097.getClass(), "propListHead", null);
        setIntField(term34097, term34097.getClass(), "sourcePosition", 0);
        setField(term34097, term34097.getClass(), "jsType", null);
        setField(term34097, term34097.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[2];
        args[0] = term34081;
        args[1] = null;
        callMethod(klass, "mayEffectMutableState", argTypes, null, args);
        assertTrue(recursiveEquals(term34081, term34097));
    }

};


