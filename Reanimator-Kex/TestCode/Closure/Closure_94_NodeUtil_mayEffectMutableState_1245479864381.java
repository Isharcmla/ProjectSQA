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

public class NodeUtil_mayEffectMutableState_1245479864381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33976;
     Object term33985;

    public NodeUtil_mayEffectMutableState_1245479864381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33976 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term33976, term33976.getClass(), "type", 63);
        term33985 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term33985, term33985.getClass(), "type", 63);
        setField(term33985, term33985.getClass(), "next", null);
        setField(term33985, term33985.getClass(), "first", null);
        setField(term33985, term33985.getClass(), "last", null);
        setField(term33985, term33985.getClass(), "propListHead", null);
        setIntField(term33985, term33985.getClass(), "sourcePosition", 0);
        setField(term33985, term33985.getClass(), "jsType", null);
        setField(term33985, term33985.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[2];
        args[0] = term33976;
        args[1] = null;
        callMethod(klass, "mayEffectMutableState", argTypes, null, args);
        assertTrue(recursiveEquals(term33976, term33985));
    }

};


