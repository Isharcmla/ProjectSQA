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

public class NodeUtil_mayEffectMutableState_1910072630311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27953;
     Object term28002;

    public NodeUtil_mayEffectMutableState_1910072630311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27953 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term27953, term27953.getClass(), "type", 41);
        term28002 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28002, term28002.getClass(), "type", 41);
        setField(term28002, term28002.getClass(), "next", null);
        setField(term28002, term28002.getClass(), "first", null);
        setField(term28002, term28002.getClass(), "last", null);
        setField(term28002, term28002.getClass(), "propListHead", null);
        setIntField(term28002, term28002.getClass(), "sourcePosition", 0);
        setField(term28002, term28002.getClass(), "jsType", null);
        setField(term28002, term28002.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term27953;
        callMethod(klass, "mayEffectMutableState", argTypes, null, args);
        assertTrue(recursiveEquals(term27953, term28002));
    }

};


