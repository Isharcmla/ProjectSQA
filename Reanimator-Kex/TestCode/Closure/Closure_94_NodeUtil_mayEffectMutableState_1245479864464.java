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

public class NodeUtil_mayEffectMutableState_1245479864464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39523;
     Object term39616;

    public NodeUtil_mayEffectMutableState_1245479864464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39523 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term39523, term39523.getClass(), "type", 33);
        term39616 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term39616, term39616.getClass(), "type", 33);
        setField(term39616, term39616.getClass(), "next", null);
        setField(term39616, term39616.getClass(), "first", null);
        setField(term39616, term39616.getClass(), "last", null);
        setField(term39616, term39616.getClass(), "propListHead", null);
        setIntField(term39616, term39616.getClass(), "sourcePosition", 0);
        setField(term39616, term39616.getClass(), "jsType", null);
        setField(term39616, term39616.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[2];
        args[0] = term39523;
        args[1] = null;
        callMethod(klass, "mayEffectMutableState", argTypes, null, args);
        assertTrue(recursiveEquals(term39523, term39616));
    }

};


