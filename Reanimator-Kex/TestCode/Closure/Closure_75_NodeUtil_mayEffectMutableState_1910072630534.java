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

public class NodeUtil_mayEffectMutableState_1910072630534 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41472;
     Object term80717;

    public NodeUtil_mayEffectMutableState_1910072630534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41472 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term41472, term41472.getClass(), "type", 50);
        term80717 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term80717, term80717.getClass(), "type", 50);
        setField(term80717, term80717.getClass(), "next", null);
        setField(term80717, term80717.getClass(), "first", null);
        setField(term80717, term80717.getClass(), "last", null);
        setField(term80717, term80717.getClass(), "propListHead", null);
        setIntField(term80717, term80717.getClass(), "sourcePosition", 0);
        setField(term80717, term80717.getClass(), "jsType", null);
        setField(term80717, term80717.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term41472;
        callMethod(klass, "mayEffectMutableState", argTypes, null, args);
        assertTrue(recursiveEquals(term41472, term80717));
    }

};


