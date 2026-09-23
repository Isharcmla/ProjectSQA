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

public class NodeUtil_mayEffectMutableState_1245479864555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44412;
     Object term60782;

    public NodeUtil_mayEffectMutableState_1245479864555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44412 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term44412, term44412.getClass(), "type", 55);
        term60782 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term60782, term60782.getClass(), "type", 55);
        setField(term60782, term60782.getClass(), "next", null);
        setField(term60782, term60782.getClass(), "first", null);
        setField(term60782, term60782.getClass(), "last", null);
        setField(term60782, term60782.getClass(), "propListHead", null);
        setIntField(term60782, term60782.getClass(), "sourcePosition", 0);
        setField(term60782, term60782.getClass(), "jsType", null);
        setField(term60782, term60782.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[2];
        args[0] = term44412;
        args[1] = null;
        callMethod(klass, "mayEffectMutableState", argTypes, null, args);
        assertTrue(recursiveEquals(term44412, term60782));
    }

};


