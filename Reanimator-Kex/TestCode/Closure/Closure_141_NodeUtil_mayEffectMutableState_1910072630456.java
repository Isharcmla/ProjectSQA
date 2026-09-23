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

public class NodeUtil_mayEffectMutableState_1910072630456 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37083;
     Object term37241;

    public NodeUtil_mayEffectMutableState_1910072630456() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37083 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term37083, term37083.getClass(), "type", 51);
        term37241 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term37241, term37241.getClass(), "type", 51);
        setField(term37241, term37241.getClass(), "next", null);
        setField(term37241, term37241.getClass(), "first", null);
        setField(term37241, term37241.getClass(), "last", null);
        setField(term37241, term37241.getClass(), "propListHead", null);
        setIntField(term37241, term37241.getClass(), "sourcePosition", 0);
        setField(term37241, term37241.getClass(), "jsType", null);
        setField(term37241, term37241.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term37083;
        callMethod(klass, "mayEffectMutableState", argTypes, null, args);
        assertTrue(recursiveEquals(term37083, term37241));
    }

};


