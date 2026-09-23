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

public class NodeUtil_mayEffectMutableState_1910072630379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46786;
     Object term46803;

    public NodeUtil_mayEffectMutableState_1910072630379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46786 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term46786, term46786.getClass(), "type", 117);
        term46803 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term46803, term46803.getClass(), "type", 117);
        setField(term46803, term46803.getClass(), "next", null);
        setField(term46803, term46803.getClass(), "first", null);
        setField(term46803, term46803.getClass(), "last", null);
        setField(term46803, term46803.getClass(), "propListHead", null);
        setIntField(term46803, term46803.getClass(), "sourcePosition", 0);
        setField(term46803, term46803.getClass(), "jsType", null);
        setField(term46803, term46803.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term46786;
        callMethod(klass, "mayEffectMutableState", argTypes, null, args);
        assertTrue(recursiveEquals(term46786, term46803));
    }

};


