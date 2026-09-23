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

public class NodeUtil_mayEffectMutableState_1245479864386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34068;
     Object term34163;

    public NodeUtil_mayEffectMutableState_1245479864386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34068 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34068, term34068.getClass(), "type", 122);
        term34163 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34163, term34163.getClass(), "type", 122);
        setField(term34163, term34163.getClass(), "next", null);
        setField(term34163, term34163.getClass(), "first", null);
        setField(term34163, term34163.getClass(), "last", null);
        setField(term34163, term34163.getClass(), "propListHead", null);
        setIntField(term34163, term34163.getClass(), "sourcePosition", 0);
        setField(term34163, term34163.getClass(), "jsType", null);
        setField(term34163, term34163.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[2];
        args[0] = term34068;
        args[1] = null;
        callMethod(klass, "mayEffectMutableState", argTypes, null, args);
        assertTrue(recursiveEquals(term34068, term34163));
    }

};


