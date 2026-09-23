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

public class NodeUtil_isCallOrNew_67539262392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35908;
     Object term36089;

    public NodeUtil_isCallOrNew_67539262392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35908 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term35908, term35908.getClass(), "type", 30);
        term36089 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term36089, term36089.getClass(), "type", 30);
        setField(term36089, term36089.getClass(), "next", null);
        setField(term36089, term36089.getClass(), "first", null);
        setField(term36089, term36089.getClass(), "last", null);
        setField(term36089, term36089.getClass(), "propListHead", null);
        setIntField(term36089, term36089.getClass(), "sourcePosition", 0);
        setField(term36089, term36089.getClass(), "jsType", null);
        setField(term36089, term36089.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term35908;
        Object retValue = callMethod(klass, "isCallOrNew", argTypes, null, args);
        assertTrue(recursiveEquals(term35908, term36089));
        assertTrue(recursiveEquals(retValue, true));
    }

};


