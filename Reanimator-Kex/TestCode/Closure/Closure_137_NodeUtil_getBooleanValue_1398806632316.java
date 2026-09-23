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

public class NodeUtil_getBooleanValue_1398806632316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24733;
     Object term25015;

    public NodeUtil_getBooleanValue_1398806632316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24733 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term24733, term24733.getClass(), "type", 64);
        term25015 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term25015, term25015.getClass(), "type", 64);
        setField(term25015, term25015.getClass(), "next", null);
        setField(term25015, term25015.getClass(), "first", null);
        setField(term25015, term25015.getClass(), "last", null);
        setField(term25015, term25015.getClass(), "propListHead", null);
        setIntField(term25015, term25015.getClass(), "sourcePosition", 0);
        setField(term25015, term25015.getClass(), "jsType", null);
        setField(term25015, term25015.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term24733;
        Object retValue = callMethod(klass, "getBooleanValue", argTypes, null, args);
        assertTrue(recursiveEquals(term24733, term25015));
        assertTrue(recursiveEquals(retValue, true));
    }

};


