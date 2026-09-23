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

public class NodeUtil_isLiteralValue_918619071482 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34854;
     Object term67832;

    public NodeUtil_isLiteralValue_918619071482() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34854 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34854, term34854.getClass(), "type", 64);
        term67832 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term67832, term67832.getClass(), "type", 64);
        setField(term67832, term67832.getClass(), "next", null);
        setField(term67832, term67832.getClass(), "first", null);
        setField(term67832, term67832.getClass(), "last", null);
        setField(term67832, term67832.getClass(), "propListHead", null);
        setIntField(term67832, term67832.getClass(), "sourcePosition", 0);
        setField(term67832, term67832.getClass(), "jsType", null);
        setField(term67832, term67832.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term34854;
        args[1] = false;
        Object retValue = callMethod(klass, "isLiteralValue", argTypes, null, args);
        assertTrue(recursiveEquals(term34854, term67832));
        assertTrue(recursiveEquals(retValue, true));
    }

};


