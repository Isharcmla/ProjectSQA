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

public class NodeUtil_mayEffectMutableState_1910072630403 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34823;
     Object term35139;

    public NodeUtil_mayEffectMutableState_1910072630403() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34823 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34823, term34823.getClass(), "type", 71);
        term35139 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term35139, term35139.getClass(), "type", 71);
        setField(term35139, term35139.getClass(), "next", null);
        setField(term35139, term35139.getClass(), "first", null);
        setField(term35139, term35139.getClass(), "last", null);
        setField(term35139, term35139.getClass(), "propListHead", null);
        setIntField(term35139, term35139.getClass(), "sourcePosition", 0);
        setField(term35139, term35139.getClass(), "jsType", null);
        setField(term35139, term35139.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term34823;
        callMethod(klass, "mayEffectMutableState", argTypes, null, args);
        assertTrue(recursiveEquals(term34823, term35139));
    }

};


