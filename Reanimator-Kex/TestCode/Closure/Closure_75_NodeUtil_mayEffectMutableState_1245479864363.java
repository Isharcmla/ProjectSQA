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

public class NodeUtil_mayEffectMutableState_1245479864363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32048;
     Object term32238;

    public NodeUtil_mayEffectMutableState_1245479864363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32048 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32048, term32048.getClass(), "type", 46);
        term32238 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32238, term32238.getClass(), "type", 46);
        setField(term32238, term32238.getClass(), "next", null);
        setField(term32238, term32238.getClass(), "first", null);
        setField(term32238, term32238.getClass(), "last", null);
        setField(term32238, term32238.getClass(), "propListHead", null);
        setIntField(term32238, term32238.getClass(), "sourcePosition", 0);
        setField(term32238, term32238.getClass(), "jsType", null);
        setField(term32238, term32238.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[2];
        args[0] = term32048;
        args[1] = null;
        callMethod(klass, "mayEffectMutableState", argTypes, null, args);
        assertTrue(recursiveEquals(term32048, term32238));
    }

};


