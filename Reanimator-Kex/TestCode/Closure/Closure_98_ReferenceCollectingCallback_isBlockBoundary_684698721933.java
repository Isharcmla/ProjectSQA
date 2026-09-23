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

public class ReferenceCollectingCallback_isBlockBoundary_684698721933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term250778;
     Object term250870;
     Object term251624;
     Object term251625;

    public ReferenceCollectingCallback_isBlockBoundary_684698721933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term250778 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term250870 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term250870, term250870.getClass(), "type", 12);
        term251624 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term251624, term251624.getClass(), "str", null);
        setIntField(term251624, term251624.getClass(), "type", 12);
        setField(term251624, term251624.getClass(), "next", null);
        setField(term251624, term251624.getClass(), "first", null);
        setField(term251624, term251624.getClass(), "last", null);
        setField(term251624, term251624.getClass(), "propListHead", null);
        setIntField(term251624, term251624.getClass(), "sourcePosition", 0);
        setField(term251624, term251624.getClass(), "jsType", null);
        setField(term251624, term251624.getClass(), "parent", null);
        term251625 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term251625, term251625.getClass(), "number", 0.0);
        setIntField(term251625, term251625.getClass(), "type", 0);
        setField(term251625, term251625.getClass(), "next", null);
        setField(term251625, term251625.getClass(), "first", null);
        setField(term251625, term251625.getClass(), "last", null);
        setField(term251625, term251625.getClass(), "propListHead", null);
        setIntField(term251625, term251625.getClass(), "sourcePosition", 0);
        setField(term251625, term251625.getClass(), "jsType", null);
        setField(term251625, term251625.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term250778;
        args[1] = term250870;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term250778, term251624));
        assertTrue(recursiveEquals(term250870, term251625));
        assertTrue(recursiveEquals(retValue, false));
    }

};


