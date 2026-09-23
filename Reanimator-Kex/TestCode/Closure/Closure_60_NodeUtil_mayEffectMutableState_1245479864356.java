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

public class NodeUtil_mayEffectMutableState_1245479864356 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31693;
     Object term38546;

    public NodeUtil_mayEffectMutableState_1245479864356() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31693 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term31693, term31693.getClass(), "type", 34);
        term38546 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term38546, term38546.getClass(), "type", 34);
        setField(term38546, term38546.getClass(), "next", null);
        setField(term38546, term38546.getClass(), "first", null);
        setField(term38546, term38546.getClass(), "last", null);
        setField(term38546, term38546.getClass(), "propListHead", null);
        setIntField(term38546, term38546.getClass(), "sourcePosition", 0);
        setField(term38546, term38546.getClass(), "jsType", null);
        setField(term38546, term38546.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[2];
        args[0] = term31693;
        args[1] = null;
        callMethod(klass, "mayEffectMutableState", argTypes, null, args);
        assertTrue(recursiveEquals(term31693, term38546));
    }

};


