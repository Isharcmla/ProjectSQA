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

public class NodeUtil_checkForStateChangeHelper_856076007353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34591;
     Object term34696;

    public NodeUtil_checkForStateChangeHelper_856076007353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34591 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34591, term34591.getClass(), "type", 130);
        term34696 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34696, term34696.getClass(), "type", 130);
        setField(term34696, term34696.getClass(), "next", null);
        setField(term34696, term34696.getClass(), "first", null);
        setField(term34696, term34696.getClass(), "last", null);
        setField(term34696, term34696.getClass(), "propListHead", null);
        setIntField(term34696, term34696.getClass(), "sourcePosition", 0);
        setField(term34696, term34696.getClass(), "jsType", null);
        setField(term34696, term34696.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[3];
        args[0] = term34591;
        args[1] = false;
        args[2] = null;
        Object retValue = callMethod(klass, "checkForStateChangeHelper", argTypes, null, args);
        assertTrue(recursiveEquals(term34591, term34696));
        assertTrue(recursiveEquals(retValue, false));
    }

};


