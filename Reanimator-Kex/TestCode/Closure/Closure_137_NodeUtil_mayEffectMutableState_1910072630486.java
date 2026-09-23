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

public class NodeUtil_mayEffectMutableState_1910072630486 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36063;
     Object term44135;

    public NodeUtil_mayEffectMutableState_1910072630486() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36063 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term36063, term36063.getClass(), "type", 58);
        term44135 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term44135, term44135.getClass(), "type", 58);
        setField(term44135, term44135.getClass(), "next", null);
        setField(term44135, term44135.getClass(), "first", null);
        setField(term44135, term44135.getClass(), "last", null);
        setField(term44135, term44135.getClass(), "propListHead", null);
        setIntField(term44135, term44135.getClass(), "sourcePosition", 0);
        setField(term44135, term44135.getClass(), "jsType", null);
        setField(term44135, term44135.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term36063;
        callMethod(klass, "mayEffectMutableState", argTypes, null, args);
        assertTrue(recursiveEquals(term36063, term44135));
    }

};


