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
import java.lang.String;
import java.lang.Object;

public class NodeUtil_getBooleanValue_89635381306 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27716;
     Object term27890;
     Object enum2;

    public NodeUtil_getBooleanValue_89635381306() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27716 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term27716, term27716.getClass(), "type", 44);
        term27890 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term27890, term27890.getClass(), "type", 44);
        setField(term27890, term27890.getClass(), "next", null);
        setField(term27890, term27890.getClass(), "first", null);
        setField(term27890, term27890.getClass(), "last", null);
        setField(term27890, term27890.getClass(), "propListHead", null);
        setIntField(term27890, term27890.getClass(), "sourcePosition", 0);
        setField(term27890, term27890.getClass(), "jsType", null);
        setField(term27890, term27890.getClass(), "parent", null);
        Class<? extends Object> term27892 = Class.forName((String) "com.google.javascript.rhino.jstype.TernaryValue");
        Field term27891 = ((Class) term27892).getDeclaredField((String) "TRUE");
        ((Field) term27891).setAccessible(true);
        enum2 = ((Field) term27891).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term27716;
        Object retValue = callMethod(klass, "getBooleanValue", argTypes, null, args);
        assertTrue(recursiveEquals(term27716, term27890));
        assertTrue(recursiveEquals(retValue, enum2));
    }

};


