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

public class NodeUtil_mayHaveSideEffects_109682951471 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50492;
     Object term50508;

    public NodeUtil_mayHaveSideEffects_109682951471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50492 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term50492, term50492.getClass(), "type", 109);
        term50508 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term50508, term50508.getClass(), "type", 109);
        setField(term50508, term50508.getClass(), "next", null);
        setField(term50508, term50508.getClass(), "first", null);
        setField(term50508, term50508.getClass(), "last", null);
        setField(term50508, term50508.getClass(), "propListHead", null);
        setIntField(term50508, term50508.getClass(), "sourcePosition", 0);
        setField(term50508, term50508.getClass(), "jsType", null);
        setField(term50508, term50508.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term50492;
        callMethod(klass, "mayHaveSideEffects", argTypes, null, args);
        assertTrue(recursiveEquals(term50492, term50508));
    }

};


