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
import java.lang.String;
import java.lang.Object;

public class NodeUtil_getBooleanValue_89635381267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23027;
     Object term23040;
     Object enum2;

    public NodeUtil_getBooleanValue_89635381267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23027 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23027, term23027.getClass(), "type", 47);
        term23040 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23040, term23040.getClass(), "type", 47);
        setField(term23040, term23040.getClass(), "next", null);
        setField(term23040, term23040.getClass(), "first", null);
        setField(term23040, term23040.getClass(), "last", null);
        setField(term23040, term23040.getClass(), "propListHead", null);
        setIntField(term23040, term23040.getClass(), "sourcePosition", 0);
        setField(term23040, term23040.getClass(), "jsType", null);
        setField(term23040, term23040.getClass(), "parent", null);
        Class<? extends Object> term23042 = Class.forName((String) "com.google.javascript.rhino.jstype.TernaryValue");
        Field term23041 = ((Class) term23042).getDeclaredField((String) "TRUE");
        ((Field) term23041).setAccessible(true);
        enum2 = ((Field) term23041).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term23027;
        Object retValue = callMethod(klass, "getBooleanValue", argTypes, null, args);
        assertTrue(recursiveEquals(term23027, term23040));
        assertTrue(recursiveEquals(retValue, enum2));
    }

};


