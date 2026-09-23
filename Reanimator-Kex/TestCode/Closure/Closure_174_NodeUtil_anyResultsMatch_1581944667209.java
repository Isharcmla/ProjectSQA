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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodeUtil_anyResultsMatch_1581944667209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1082;

    public NodeUtil_anyResultsMatch_1581944667209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1082 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1084 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1086 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1088 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1090 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1093 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1097 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1099 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1104 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1082, term1082.getClass(), "type", -942194446);
        setIntField(term1084, term1084.getClass(), "type", -938508470);
        setIntField(term1086, term1086.getClass(), "type", 1242676024);
        setIntField(term1088, term1088.getClass(), "type", -1865023308);
        setIntField(term1090, term1090.getClass(), "type", 1698510819);
        setField(term1090, term1090.getClass(), "next", null);
        setField(term1090, term1090.getClass(), "first", null);
        setField(term1090, term1090.getClass(), "last", null);
        setField(term1090, term1090.getClass(), "propListHead", null);
        setIntField(term1090, term1090.getClass(), "sourcePosition", 0);
        setField(term1090, term1090.getClass(), "jsType", null);
        setField(term1090, term1090.getClass(), "parent", null);
        setField(term1088, term1088.getClass(), "next", term1090);
        setIntField(term1093, term1093.getClass(), "type", -1553893255);
        setField(term1093, term1093.getClass(), "next", null);
        setField(term1093, term1093.getClass(), "first", null);
        setField(term1093, term1093.getClass(), "last", term1090);
        setField(term1093, term1093.getClass(), "propListHead", null);
        setIntField(term1093, term1093.getClass(), "sourcePosition", 0);
        setField(term1093, term1093.getClass(), "jsType", null);
        setField(term1093, term1093.getClass(), "parent", null);
        setField(term1088, term1088.getClass(), "first", term1093);
        setField(term1088, term1088.getClass(), "last", term1086);
        setField(term1088, term1088.getClass(), "propListHead", null);
        setIntField(term1088, term1088.getClass(), "sourcePosition", 0);
        setField(term1088, term1088.getClass(), "jsType", null);
        setField(term1088, term1088.getClass(), "parent", null);
        setField(term1086, term1086.getClass(), "next", term1088);
        setField(term1086, term1086.getClass(), "first", term1090);
        setIntField(term1097, term1097.getClass(), "type", 794568325);
        setIntField(term1099, term1099.getClass(), "type", -434468428);
        setField(term1099, term1099.getClass(), "next", null);
        setField(term1099, term1099.getClass(), "first", term1093);
        setField(term1099, term1099.getClass(), "last", term1088);
        setField(term1099, term1099.getClass(), "propListHead", null);
        setIntField(term1099, term1099.getClass(), "sourcePosition", 0);
        setField(term1099, term1099.getClass(), "jsType", null);
        setField(term1099, term1099.getClass(), "parent", null);
        setField(term1097, term1097.getClass(), "next", term1099);
        setField(term1097, term1097.getClass(), "first", term1084);
        setField(term1097, term1097.getClass(), "last", term1084);
        setField(term1097, term1097.getClass(), "propListHead", null);
        setIntField(term1097, term1097.getClass(), "sourcePosition", 0);
        setField(term1097, term1097.getClass(), "jsType", null);
        setField(term1097, term1097.getClass(), "parent", null);
        setField(term1086, term1086.getClass(), "last", term1097);
        setField(term1086, term1086.getClass(), "propListHead", null);
        setIntField(term1086, term1086.getClass(), "sourcePosition", 0);
        setField(term1086, term1086.getClass(), "jsType", null);
        setField(term1086, term1086.getClass(), "parent", null);
        setField(term1084, term1084.getClass(), "next", term1086);
        setIntField(term1104, term1104.getClass(), "type", 1559605714);
        setField(term1104, term1104.getClass(), "next", term1097);
        setField(term1104, term1104.getClass(), "first", term1099);
        setField(term1104, term1104.getClass(), "last", term1082);
        setField(term1104, term1104.getClass(), "propListHead", null);
        setIntField(term1104, term1104.getClass(), "sourcePosition", 0);
        setField(term1104, term1104.getClass(), "jsType", null);
        setField(term1104, term1104.getClass(), "parent", null);
        setField(term1084, term1084.getClass(), "first", term1104);
        setField(term1084, term1084.getClass(), "last", term1104);
        setField(term1084, term1084.getClass(), "propListHead", null);
        setIntField(term1084, term1084.getClass(), "sourcePosition", 0);
        setField(term1084, term1084.getClass(), "jsType", null);
        setField(term1084, term1084.getClass(), "parent", null);
        setField(term1082, term1082.getClass(), "next", term1084);
        setField(term1082, term1082.getClass(), "first", term1088);
        setField(term1082, term1082.getClass(), "last", term1090);
        setField(term1082, term1082.getClass(), "propListHead", null);
        setIntField(term1082, term1082.getClass(), "sourcePosition", 0);
        setField(term1082, term1082.getClass(), "jsType", null);
        setField(term1082, term1082.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[2];
        args[0] = term1082;
        args[1] = null;
        try {
            callMethod(klass, "anyResultsMatch", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


