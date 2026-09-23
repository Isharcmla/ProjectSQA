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
import java.lang.Boolean;

public class NodeUtil_booleanNode_1416214559321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5047;
     Object term31247;

    public NodeUtil_booleanNode_1416214559321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5047 = new Boolean(true);
        term31247 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term31247, term31247.getClass(), "type", 44);
        setField(term31247, term31247.getClass(), "next", null);
        setField(term31247, term31247.getClass(), "first", null);
        setField(term31247, term31247.getClass(), "last", null);
        setField(term31247, term31247.getClass(), "propListHead", null);
        setIntField(term31247, term31247.getClass(), "sourcePosition", -1);
        setField(term31247, term31247.getClass(), "jsType", null);
        setField(term31247, term31247.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term5047;
        Object retValue = callMethod(klass, "booleanNode", argTypes, null, args);
        assertTrue(recursiveEquals(term5047, true));
        assertTrue(recursiveEquals(retValue, term31247));
    }

};


