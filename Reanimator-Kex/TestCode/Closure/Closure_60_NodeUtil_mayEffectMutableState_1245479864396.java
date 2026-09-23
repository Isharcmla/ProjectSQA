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

public class NodeUtil_mayEffectMutableState_1245479864396 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46602;
     Object term46776;

    public NodeUtil_mayEffectMutableState_1245479864396() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46602 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term46602, term46602.getClass(), "type", 35);
        term46776 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term46776, term46776.getClass(), "type", 35);
        setField(term46776, term46776.getClass(), "next", null);
        setField(term46776, term46776.getClass(), "first", null);
        setField(term46776, term46776.getClass(), "last", null);
        setField(term46776, term46776.getClass(), "propListHead", null);
        setIntField(term46776, term46776.getClass(), "sourcePosition", 0);
        setField(term46776, term46776.getClass(), "jsType", null);
        setField(term46776, term46776.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[2];
        args[0] = term46602;
        args[1] = null;
        callMethod(klass, "mayEffectMutableState", argTypes, null, args);
        assertTrue(recursiveEquals(term46602, term46776));
    }

};


