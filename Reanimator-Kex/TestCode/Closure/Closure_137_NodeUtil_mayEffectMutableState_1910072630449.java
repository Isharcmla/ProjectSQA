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

public class NodeUtil_mayEffectMutableState_1910072630449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34613;
     Object term34628;

    public NodeUtil_mayEffectMutableState_1910072630449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34613 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34613, term34613.getClass(), "type", 107);
        term34628 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34628, term34628.getClass(), "type", 107);
        setField(term34628, term34628.getClass(), "next", null);
        setField(term34628, term34628.getClass(), "first", null);
        setField(term34628, term34628.getClass(), "last", null);
        setField(term34628, term34628.getClass(), "propListHead", null);
        setIntField(term34628, term34628.getClass(), "sourcePosition", 0);
        setField(term34628, term34628.getClass(), "jsType", null);
        setField(term34628, term34628.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term34613;
        callMethod(klass, "mayEffectMutableState", argTypes, null, args);
        assertTrue(recursiveEquals(term34613, term34628));
    }

};


