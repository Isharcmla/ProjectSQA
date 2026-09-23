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

public class NodeUtil_evaluatesToLocalValue_744664708405 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34015;
     Object term34331;

    public NodeUtil_evaluatesToLocalValue_744664708405() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34015 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34015, term34015.getClass(), "type", 42);
        term34331 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34331, term34331.getClass(), "type", 42);
        setField(term34331, term34331.getClass(), "next", null);
        setField(term34331, term34331.getClass(), "first", null);
        setField(term34331, term34331.getClass(), "last", null);
        setField(term34331, term34331.getClass(), "propListHead", null);
        setIntField(term34331, term34331.getClass(), "sourcePosition", 0);
        setField(term34331, term34331.getClass(), "jsType", null);
        setField(term34331, term34331.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term34015;
        callMethod(klass, "evaluatesToLocalValue", argTypes, null, args);
        assertTrue(recursiveEquals(term34015, term34331));
    }

};


