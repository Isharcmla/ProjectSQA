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

public class NodeUtil_isVar_896854502251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21958;
     Object term21982;

    public NodeUtil_isVar_896854502251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21958 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term21958, term21958.getClass(), "type", 118);
        term21982 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term21982, term21982.getClass(), "type", 118);
        setField(term21982, term21982.getClass(), "next", null);
        setField(term21982, term21982.getClass(), "first", null);
        setField(term21982, term21982.getClass(), "last", null);
        setField(term21982, term21982.getClass(), "propListHead", null);
        setIntField(term21982, term21982.getClass(), "sourcePosition", 0);
        setField(term21982, term21982.getClass(), "jsType", null);
        setField(term21982, term21982.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term21958;
        Object retValue = callMethod(klass, "isVar", argTypes, null, args);
        assertTrue(recursiveEquals(term21958, term21982));
        assertTrue(recursiveEquals(retValue, true));
    }

};


