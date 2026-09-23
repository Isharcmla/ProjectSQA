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

public class NodeUtil_mayEffectMutableState_1910072630317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28788;
     Object term28807;

    public NodeUtil_mayEffectMutableState_1910072630317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28788 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28788, term28788.getClass(), "type", 63);
        term28807 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28807, term28807.getClass(), "type", 63);
        setField(term28807, term28807.getClass(), "next", null);
        setField(term28807, term28807.getClass(), "first", null);
        setField(term28807, term28807.getClass(), "last", null);
        setField(term28807, term28807.getClass(), "propListHead", null);
        setIntField(term28807, term28807.getClass(), "sourcePosition", 0);
        setField(term28807, term28807.getClass(), "jsType", null);
        setField(term28807, term28807.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term28788;
        callMethod(klass, "mayEffectMutableState", argTypes, null, args);
        assertTrue(recursiveEquals(term28788, term28807));
    }

};


