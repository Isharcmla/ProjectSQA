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

public class NodeUtil_isLiteralValue_214218539245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19540;
     Object term19555;

    public NodeUtil_isLiteralValue_214218539245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19540 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19540, term19540.getClass(), "type", 41);
        term19555 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19555, term19555.getClass(), "type", 41);
        setField(term19555, term19555.getClass(), "next", null);
        setField(term19555, term19555.getClass(), "first", null);
        setField(term19555, term19555.getClass(), "last", null);
        setField(term19555, term19555.getClass(), "propListHead", null);
        setIntField(term19555, term19555.getClass(), "sourcePosition", 0);
        setField(term19555, term19555.getClass(), "jsType", null);
        setField(term19555, term19555.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term19540;
        Object retValue = callMethod(klass, "isLiteralValue", argTypes, null, args);
        assertTrue(recursiveEquals(term19540, term19555));
        assertTrue(recursiveEquals(retValue, true));
    }

};


