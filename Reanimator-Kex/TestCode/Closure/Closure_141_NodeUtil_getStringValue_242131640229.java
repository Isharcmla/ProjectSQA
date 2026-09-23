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

public class NodeUtil_getStringValue_242131640229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18783;
     Object term19076;

    public NodeUtil_getStringValue_242131640229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18783 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18783, term18783.getClass(), "type", 122);
        term19076 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19076, term19076.getClass(), "type", 122);
        setField(term19076, term19076.getClass(), "next", null);
        setField(term19076, term19076.getClass(), "first", null);
        setField(term19076, term19076.getClass(), "last", null);
        setField(term19076, term19076.getClass(), "propListHead", null);
        setIntField(term19076, term19076.getClass(), "sourcePosition", 0);
        setField(term19076, term19076.getClass(), "jsType", null);
        setField(term19076, term19076.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term18783;
        Object retValue = callMethod(klass, "getStringValue", argTypes, null, args);
        assertTrue(recursiveEquals(term18783, term19076));
        assertTrue(recursiveEquals(retValue, "undefined"));
    }

};


