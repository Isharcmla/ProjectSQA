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

public class NodeUtil_isAssign_1955286018312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26230;
     Object term26317;

    public NodeUtil_isAssign_1955286018312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26230 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term26230, term26230.getClass(), "type", 86);
        term26317 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term26317, term26317.getClass(), "type", 86);
        setField(term26317, term26317.getClass(), "next", null);
        setField(term26317, term26317.getClass(), "first", null);
        setField(term26317, term26317.getClass(), "last", null);
        setField(term26317, term26317.getClass(), "propListHead", null);
        setIntField(term26317, term26317.getClass(), "sourcePosition", 0);
        setField(term26317, term26317.getClass(), "jsType", null);
        setField(term26317, term26317.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term26230;
        Object retValue = callMethod(klass, "isAssign", argTypes, null, args);
        assertTrue(recursiveEquals(term26230, term26317));
        assertTrue(recursiveEquals(retValue, true));
    }

};


