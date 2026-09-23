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

public class NodeUtil_isImmutableValue_1118207454251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20059;
     Object term20075;

    public NodeUtil_isImmutableValue_1118207454251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20059 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20059, term20059.getClass(), "type", 41);
        term20075 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20075, term20075.getClass(), "type", 41);
        setField(term20075, term20075.getClass(), "next", null);
        setField(term20075, term20075.getClass(), "first", null);
        setField(term20075, term20075.getClass(), "last", null);
        setField(term20075, term20075.getClass(), "propListHead", null);
        setIntField(term20075, term20075.getClass(), "sourcePosition", 0);
        setField(term20075, term20075.getClass(), "jsType", null);
        setField(term20075, term20075.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term20059;
        Object retValue = callMethod(klass, "isImmutableValue", argTypes, null, args);
        assertTrue(recursiveEquals(term20059, term20075));
        assertTrue(recursiveEquals(retValue, true));
    }

};


