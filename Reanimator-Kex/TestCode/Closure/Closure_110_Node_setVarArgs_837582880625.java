package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.EqualityUtils.*;

public class Node_setVarArgs_837582880625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55233;
     Object term55431;

    public Node_setVarArgs_837582880625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55233 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term55431 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term55431, term55431.getClass(), "type", 0);
        setField(term55431, term55431.getClass(), "next", null);
        setField(term55431, term55431.getClass(), "first", null);
        setField(term55431, term55431.getClass(), "last", null);
        setField(term55431, term55431.getClass(), "propListHead", null);
        setIntField(term55431, term55431.getClass(), "sourcePosition", 0);
        setField(term55431, term55431.getClass(), "jsType", null);
        setField(term55431, term55431.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = false;
        callMethod(klass, "setVarArgs", argTypes, term55233, args);
        assertTrue(recursiveEquals(term55233, term55431));
    }

};


