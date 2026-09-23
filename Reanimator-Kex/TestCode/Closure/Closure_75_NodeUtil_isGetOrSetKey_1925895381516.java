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

public class NodeUtil_isGetOrSetKey_1925895381516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39902;
     Object term77894;

    public NodeUtil_isGetOrSetKey_1925895381516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39902 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term39902, term39902.getClass(), "type", 148);
        term77894 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term77894, term77894.getClass(), "type", 148);
        setField(term77894, term77894.getClass(), "next", null);
        setField(term77894, term77894.getClass(), "first", null);
        setField(term77894, term77894.getClass(), "last", null);
        setField(term77894, term77894.getClass(), "propListHead", null);
        setIntField(term77894, term77894.getClass(), "sourcePosition", 0);
        setField(term77894, term77894.getClass(), "jsType", null);
        setField(term77894, term77894.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term39902;
        Object retValue = callMethod(klass, "isGetOrSetKey", argTypes, null, args);
        assertTrue(recursiveEquals(term39902, term77894));
        assertTrue(recursiveEquals(retValue, true));
    }

};


