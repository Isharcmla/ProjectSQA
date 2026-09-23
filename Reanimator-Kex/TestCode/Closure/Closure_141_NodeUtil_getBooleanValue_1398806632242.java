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

public class NodeUtil_getBooleanValue_1398806632242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19989;
     Object term20250;

    public NodeUtil_getBooleanValue_1398806632242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19989 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19989, term19989.getClass(), "type", 122);
        term20250 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20250, term20250.getClass(), "type", 122);
        setField(term20250, term20250.getClass(), "next", null);
        setField(term20250, term20250.getClass(), "first", null);
        setField(term20250, term20250.getClass(), "last", null);
        setField(term20250, term20250.getClass(), "propListHead", null);
        setIntField(term20250, term20250.getClass(), "sourcePosition", 0);
        setField(term20250, term20250.getClass(), "jsType", null);
        setField(term20250, term20250.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term19989;
        Object retValue = callMethod(klass, "getBooleanValue", argTypes, null, args);
        assertTrue(recursiveEquals(term19989, term20250));
        assertTrue(recursiveEquals(retValue, false));
    }

};


