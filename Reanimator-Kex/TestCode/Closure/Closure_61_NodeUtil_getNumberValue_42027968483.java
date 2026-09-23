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
import java.lang.Double;

public class NodeUtil_getNumberValue_42027968483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40824;
     Object term40851;
     Object term40849;

    public NodeUtil_getNumberValue_42027968483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40824 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term40824, term40824.getClass(), "type", 44);
        term40851 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term40851, term40851.getClass(), "type", 44);
        setField(term40851, term40851.getClass(), "next", null);
        setField(term40851, term40851.getClass(), "first", null);
        setField(term40851, term40851.getClass(), "last", null);
        setField(term40851, term40851.getClass(), "propListHead", null);
        setIntField(term40851, term40851.getClass(), "sourcePosition", 0);
        setField(term40851, term40851.getClass(), "jsType", null);
        setField(term40851, term40851.getClass(), "parent", null);
        term40849 = new Double(1.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term40824;
        Object retValue = callMethod(klass, "getNumberValue", argTypes, null, args);
        assertTrue(recursiveEquals(term40824, term40851));
        assertTrue(recursiveEquals(retValue, term40849));
    }

};


