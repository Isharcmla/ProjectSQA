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

public class NodeUtil_getPureBooleanValue_1302448051492 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38054;
     Object term75507;
     Object enum4;

    public NodeUtil_getPureBooleanValue_1302448051492() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38054 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term38054, term38054.getClass(), "type", 47);
        term75507 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term75507, term75507.getClass(), "type", 47);
        setField(term75507, term75507.getClass(), "next", null);
        setField(term75507, term75507.getClass(), "first", null);
        setField(term75507, term75507.getClass(), "last", null);
        setField(term75507, term75507.getClass(), "propListHead", null);
        setIntField(term75507, term75507.getClass(), "sourcePosition", 0);
        setField(term75507, term75507.getClass(), "jsType", null);
        setField(term75507, term75507.getClass(), "parent", null);
        Class<? extends Object> term75509 = Class.forName((String) "com.google.javascript.rhino.jstype.TernaryValue");
        Field term75508 = ((Class) term75509).getDeclaredField((String) "TRUE");
        ((Field) term75508).setAccessible(true);
        enum4 = ((Field) term75508).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term38054;
        Object retValue = callMethod(klass, "getPureBooleanValue", argTypes, null, args);
        assertTrue(recursiveEquals(term38054, term75507));
        assertTrue(recursiveEquals(retValue, enum4));
    }

};


