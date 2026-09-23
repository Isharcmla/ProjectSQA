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

public class NodeUtil_mayEffectMutableState_1910072630374 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33300;
     Object term33396;

    public NodeUtil_mayEffectMutableState_1910072630374() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33300 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term33300, term33300.getClass(), "type", 129);
        term33396 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term33396, term33396.getClass(), "type", 129);
        setField(term33396, term33396.getClass(), "next", null);
        setField(term33396, term33396.getClass(), "first", null);
        setField(term33396, term33396.getClass(), "last", null);
        setField(term33396, term33396.getClass(), "propListHead", null);
        setIntField(term33396, term33396.getClass(), "sourcePosition", 0);
        setField(term33396, term33396.getClass(), "jsType", null);
        setField(term33396, term33396.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term33300;
        callMethod(klass, "mayEffectMutableState", argTypes, null, args);
        assertTrue(recursiveEquals(term33300, term33396));
    }

};


