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
import java.lang.Object;

public class RuntimeTypeCheck_jsCode_2813180068 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1356;

    public RuntimeTypeCheck_jsCode_2813180068() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1356 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1358 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1360 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term1375 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term1385 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term1356, term1356.getClass(), "type", 33);
        setField(term1356, term1356.getClass(), "next", null);
        setIntField(term1358, term1358.getClass(), "type", 33);
        setField(term1360, term1360.getClass(), "str", "xxtlPwDYFs");
        setIntField(term1360, term1360.getClass(), "type", 40);
        setField(term1360, term1360.getClass(), "next", null);
        setField(term1360, term1360.getClass(), "first", null);
        setField(term1360, term1360.getClass(), "last", null);
        setField(term1360, term1360.getClass(), "propListHead", null);
        setIntField(term1360, term1360.getClass(), "sourcePosition", -1);
        setField(term1360, term1360.getClass(), "jsType", null);
        setField(term1360, term1360.getClass(), "parent", term1356);
        setField(term1358, term1358.getClass(), "next", term1360);
        setField(term1375, term1375.getClass(), "str", "jscomp");
        setIntField(term1375, term1375.getClass(), "type", 38);
        setField(term1385, term1385.getClass(), "str", "");
        setIntField(term1385, term1385.getClass(), "type", 40);
        setField(term1385, term1385.getClass(), "next", null);
        setField(term1385, term1385.getClass(), "first", null);
        setField(term1385, term1385.getClass(), "last", null);
        setField(term1385, term1385.getClass(), "propListHead", null);
        setIntField(term1385, term1385.getClass(), "sourcePosition", -1);
        setField(term1385, term1385.getClass(), "jsType", null);
        setField(term1385, term1385.getClass(), "parent", term1358);
        setField(term1375, term1375.getClass(), "next", term1385);
        setField(term1375, term1375.getClass(), "first", null);
        setField(term1375, term1375.getClass(), "last", null);
        setField(term1375, term1375.getClass(), "propListHead", null);
        setIntField(term1375, term1375.getClass(), "sourcePosition", -1);
        setField(term1375, term1375.getClass(), "jsType", null);
        setField(term1375, term1375.getClass(), "parent", term1358);
        setField(term1358, term1358.getClass(), "first", term1375);
        setField(term1358, term1358.getClass(), "last", term1385);
        setField(term1358, term1358.getClass(), "propListHead", null);
        setIntField(term1358, term1358.getClass(), "sourcePosition", -1);
        setField(term1358, term1358.getClass(), "jsType", null);
        setField(term1358, term1358.getClass(), "parent", term1356);
        setField(term1356, term1356.getClass(), "first", term1358);
        setField(term1356, term1356.getClass(), "last", term1360);
        setField(term1356, term1356.getClass(), "propListHead", null);
        setIntField(term1356, term1356.getClass(), "sourcePosition", -1);
        setField(term1356, term1356.getClass(), "jsType", null);
        setField(term1356, term1356.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RuntimeTypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xxtlPwDYFs";
        Object retValue = callMethod(klass, "jsCode", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term1356));
    }

};


