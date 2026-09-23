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

public class NodeUtil_canBeSideEffected_2078426861484 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35903;
     Object term43857;

    public NodeUtil_canBeSideEffected_2078426861484() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35903 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term35903, term35903.getClass(), "type", 34);
        term43857 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term43857, term43857.getClass(), "type", 34);
        setField(term43857, term43857.getClass(), "next", null);
        setField(term43857, term43857.getClass(), "first", null);
        setField(term43857, term43857.getClass(), "last", null);
        setField(term43857, term43857.getClass(), "propListHead", null);
        setIntField(term43857, term43857.getClass(), "sourcePosition", 0);
        setField(term43857, term43857.getClass(), "jsType", null);
        setField(term43857, term43857.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term35903;
        args[1] = null;
        Object retValue = callMethod(klass, "canBeSideEffected", argTypes, null, args);
        assertTrue(recursiveEquals(term35903, term43857));
        assertTrue(recursiveEquals(retValue, false));
    }

};


