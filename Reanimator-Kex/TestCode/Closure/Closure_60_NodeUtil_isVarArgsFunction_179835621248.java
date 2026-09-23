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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodeUtil_isVarArgsFunction_179835621248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1960;

    public NodeUtil_isVarArgsFunction_179835621248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1960 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1962 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1964 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1967 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1970 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1974 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1977 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1960, term1960.getClass(), "type", -1422131197);
        setIntField(term1962, term1962.getClass(), "type", -1592093430);
        setIntField(term1964, term1964.getClass(), "type", 0);
        setField(term1964, term1964.getClass(), "next", null);
        setField(term1964, term1964.getClass(), "first", null);
        setField(term1964, term1964.getClass(), "last", null);
        setField(term1964, term1964.getClass(), "propListHead", null);
        setIntField(term1964, term1964.getClass(), "sourcePosition", 0);
        setField(term1964, term1964.getClass(), "jsType", null);
        setField(term1964, term1964.getClass(), "parent", null);
        setField(term1962, term1962.getClass(), "next", term1964);
        setIntField(term1967, term1967.getClass(), "type", 0);
        setField(term1967, term1967.getClass(), "next", null);
        setField(term1967, term1967.getClass(), "first", null);
        setField(term1967, term1967.getClass(), "last", null);
        setField(term1967, term1967.getClass(), "propListHead", null);
        setIntField(term1967, term1967.getClass(), "sourcePosition", 0);
        setField(term1967, term1967.getClass(), "jsType", null);
        setField(term1967, term1967.getClass(), "parent", null);
        setField(term1962, term1962.getClass(), "first", term1967);
        setIntField(term1970, term1970.getClass(), "type", 0);
        setField(term1970, term1970.getClass(), "next", null);
        setField(term1970, term1970.getClass(), "first", null);
        setField(term1970, term1970.getClass(), "last", null);
        setField(term1970, term1970.getClass(), "propListHead", null);
        setIntField(term1970, term1970.getClass(), "sourcePosition", 0);
        setField(term1970, term1970.getClass(), "jsType", null);
        setField(term1970, term1970.getClass(), "parent", null);
        setField(term1962, term1962.getClass(), "last", term1970);
        setField(term1962, term1962.getClass(), "propListHead", null);
        setIntField(term1962, term1962.getClass(), "sourcePosition", 0);
        setField(term1962, term1962.getClass(), "jsType", null);
        setField(term1962, term1962.getClass(), "parent", null);
        setField(term1960, term1960.getClass(), "next", term1962);
        setIntField(term1974, term1974.getClass(), "type", 0);
        setField(term1974, term1974.getClass(), "next", null);
        setField(term1974, term1974.getClass(), "first", null);
        setField(term1974, term1974.getClass(), "last", null);
        setField(term1974, term1974.getClass(), "propListHead", null);
        setIntField(term1974, term1974.getClass(), "sourcePosition", 0);
        setField(term1974, term1974.getClass(), "jsType", null);
        setField(term1974, term1974.getClass(), "parent", null);
        setField(term1960, term1960.getClass(), "first", term1974);
        setIntField(term1977, term1977.getClass(), "type", 0);
        setField(term1977, term1977.getClass(), "next", null);
        setField(term1977, term1977.getClass(), "first", null);
        setField(term1977, term1977.getClass(), "last", null);
        setField(term1977, term1977.getClass(), "propListHead", null);
        setIntField(term1977, term1977.getClass(), "sourcePosition", 0);
        setField(term1977, term1977.getClass(), "jsType", null);
        setField(term1977, term1977.getClass(), "parent", null);
        setField(term1960, term1960.getClass(), "last", term1977);
        setField(term1960, term1960.getClass(), "propListHead", null);
        setIntField(term1960, term1960.getClass(), "sourcePosition", 0);
        setField(term1960, term1960.getClass(), "jsType", null);
        setField(term1960, term1960.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1960;
        try {
            callMethod(klass, "isVarArgsFunction", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


