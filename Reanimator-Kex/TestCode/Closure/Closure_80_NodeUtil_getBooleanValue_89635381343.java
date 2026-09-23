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

public class NodeUtil_getBooleanValue_89635381343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31207;
     Object term31220;
     Object enum3;

    public NodeUtil_getBooleanValue_89635381343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31207 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term31207, term31207.getClass(), "type", 64);
        term31220 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term31220, term31220.getClass(), "type", 64);
        setField(term31220, term31220.getClass(), "next", null);
        setField(term31220, term31220.getClass(), "first", null);
        setField(term31220, term31220.getClass(), "last", null);
        setField(term31220, term31220.getClass(), "propListHead", null);
        setIntField(term31220, term31220.getClass(), "sourcePosition", 0);
        setField(term31220, term31220.getClass(), "jsType", null);
        setField(term31220, term31220.getClass(), "parent", null);
        Class<? extends Object> term31222 = Class.forName((String) "com.google.javascript.rhino.jstype.TernaryValue");
        Field term31221 = ((Class) term31222).getDeclaredField((String) "TRUE");
        ((Field) term31221).setAccessible(true);
        enum3 = ((Field) term31221).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term31207;
        Object retValue = callMethod(klass, "getBooleanValue", argTypes, null, args);
        assertTrue(recursiveEquals(term31207, term31220));
        assertTrue(recursiveEquals(retValue, enum3));
    }

};


