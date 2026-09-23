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

public class NodeUtil_mayEffectMutableState_1245479864485 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41779;
     Object term41804;

    public NodeUtil_mayEffectMutableState_1245479864485() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41779 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term41779, term41779.getClass(), "type", 115);
        term41804 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term41804, term41804.getClass(), "type", 115);
        setField(term41804, term41804.getClass(), "next", null);
        setField(term41804, term41804.getClass(), "first", null);
        setField(term41804, term41804.getClass(), "last", null);
        setField(term41804, term41804.getClass(), "propListHead", null);
        setIntField(term41804, term41804.getClass(), "sourcePosition", 0);
        setField(term41804, term41804.getClass(), "jsType", null);
        setField(term41804, term41804.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[2];
        args[0] = term41779;
        args[1] = null;
        callMethod(klass, "mayEffectMutableState", argTypes, null, args);
        assertTrue(recursiveEquals(term41779, term41804));
    }

};


