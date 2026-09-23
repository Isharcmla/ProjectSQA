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

public class NodeUtil_arrayToString_1073419571465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49359;
     Object term50163;

    public NodeUtil_arrayToString_1073419571465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49359 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49455 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setField(term49359, term49359.getClass(), "first", term49359);
        setIntField(term49455, term49455.getClass(), "type", -31);
        setField(term49455, term49455.getClass(), "next", null);
        setField(term49359, term49359.getClass(), "propListHead", term49455);
        setIntField(term49359, term49359.getClass(), "type", 64);
        term50163 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50164 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term50163, term50163.getClass(), "type", 64);
        setField(term50163, term50163.getClass(), "next", null);
        setField(term50163, term50163.getClass(), "first", term50163);
        setField(term50163, term50163.getClass(), "last", null);
        setField(term50164, term50164.getClass(), "next", null);
        setIntField(term50164, term50164.getClass(), "type", -31);
        setIntField(term50164, term50164.getClass(), "intValue", 0);
        setField(term50164, term50164.getClass(), "objectValue", null);
        setField(term50163, term50163.getClass(), "propListHead", term50164);
        setIntField(term50163, term50163.getClass(), "sourcePosition", 0);
        setField(term50163, term50163.getClass(), "jsType", null);
        setField(term50163, term50163.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term49359;
        Object retValue = callMethod(klass, "arrayToString", argTypes, null, args);
        assertTrue(recursiveEquals(term49359, term50163));
        assertTrue(recursiveEquals(retValue, "[object Object]"));
    }

};


