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

public class NodeUtil_mayEffectMutableState_1245479864546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43877;
     Object term60245;

    public NodeUtil_mayEffectMutableState_1245479864546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43877 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term43877, term43877.getClass(), "type", 58);
        term60245 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term60245, term60245.getClass(), "type", 58);
        setField(term60245, term60245.getClass(), "next", null);
        setField(term60245, term60245.getClass(), "first", null);
        setField(term60245, term60245.getClass(), "last", null);
        setField(term60245, term60245.getClass(), "propListHead", null);
        setIntField(term60245, term60245.getClass(), "sourcePosition", 0);
        setField(term60245, term60245.getClass(), "jsType", null);
        setField(term60245, term60245.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[2];
        args[0] = term43877;
        args[1] = null;
        callMethod(klass, "mayEffectMutableState", argTypes, null, args);
        assertTrue(recursiveEquals(term43877, term60245));
    }

};


