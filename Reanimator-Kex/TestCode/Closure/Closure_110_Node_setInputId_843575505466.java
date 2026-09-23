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

public class Node_setInputId_843575505466 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35783;
     Object term35792;

    public Node_setInputId_843575505466() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35783 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term35792 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term35792, term35792.getClass(), "number", 0.0);
        setIntField(term35792, term35792.getClass(), "type", 0);
        setField(term35792, term35792.getClass(), "next", null);
        setField(term35792, term35792.getClass(), "first", null);
        setField(term35792, term35792.getClass(), "last", null);
        setField(term35792, term35792.getClass(), "propListHead", null);
        setIntField(term35792, term35792.getClass(), "sourcePosition", 0);
        setField(term35792, term35792.getClass(), "jsType", null);
        setField(term35792, term35792.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.InputId");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setInputId", argTypes, term35783, args);
        assertTrue(recursiveEquals(term35783, term35792));
    }

};


