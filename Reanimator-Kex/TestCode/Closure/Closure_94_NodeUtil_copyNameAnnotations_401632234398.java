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

public class NodeUtil_copyNameAnnotations_401632234398 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34636;
     Object term34727;

    public NodeUtil_copyNameAnnotations_401632234398() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34636 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term34636, term34636.getClass(), "propListHead", null);
        term34727 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34727, term34727.getClass(), "type", 0);
        setField(term34727, term34727.getClass(), "next", null);
        setField(term34727, term34727.getClass(), "first", null);
        setField(term34727, term34727.getClass(), "last", null);
        setField(term34727, term34727.getClass(), "propListHead", null);
        setIntField(term34727, term34727.getClass(), "sourcePosition", 0);
        setField(term34727, term34727.getClass(), "jsType", null);
        setField(term34727, term34727.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term34636;
        args[1] = null;
        callMethod(klass, "copyNameAnnotations", argTypes, null, args);
        assertTrue(recursiveEquals(term34636, term34727));
    }

};


