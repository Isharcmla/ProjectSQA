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

public class NodeUtil_nodeTypeMayHaveSideEffects_620236925479 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35401;
     Object term43525;

    public NodeUtil_nodeTypeMayHaveSideEffects_620236925479() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35401 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term35401, term35401.getClass(), "type", 92);
        term43525 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term43525, term43525.getClass(), "type", 92);
        setField(term43525, term43525.getClass(), "next", null);
        setField(term43525, term43525.getClass(), "first", null);
        setField(term43525, term43525.getClass(), "last", null);
        setField(term43525, term43525.getClass(), "propListHead", null);
        setIntField(term43525, term43525.getClass(), "sourcePosition", 0);
        setField(term43525, term43525.getClass(), "jsType", null);
        setField(term43525, term43525.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term35401;
        Object retValue = callMethod(klass, "nodeTypeMayHaveSideEffects", argTypes, null, args);
        assertTrue(recursiveEquals(term35401, term43525));
        assertTrue(recursiveEquals(retValue, true));
    }

};


