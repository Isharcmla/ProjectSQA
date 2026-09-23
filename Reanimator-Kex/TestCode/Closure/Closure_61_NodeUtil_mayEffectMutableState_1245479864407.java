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

public class NodeUtil_mayEffectMutableState_1245479864407 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34411;
     Object term34420;

    public NodeUtil_mayEffectMutableState_1245479864407() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34411 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34411, term34411.getClass(), "type", 108);
        term34420 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34420, term34420.getClass(), "type", 108);
        setField(term34420, term34420.getClass(), "next", null);
        setField(term34420, term34420.getClass(), "first", null);
        setField(term34420, term34420.getClass(), "last", null);
        setField(term34420, term34420.getClass(), "propListHead", null);
        setIntField(term34420, term34420.getClass(), "sourcePosition", 0);
        setField(term34420, term34420.getClass(), "jsType", null);
        setField(term34420, term34420.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[2];
        args[0] = term34411;
        args[1] = null;
        callMethod(klass, "mayEffectMutableState", argTypes, null, args);
        assertTrue(recursiveEquals(term34411, term34420));
    }

};


