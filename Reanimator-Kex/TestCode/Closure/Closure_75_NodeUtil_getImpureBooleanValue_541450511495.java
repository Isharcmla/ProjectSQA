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

public class NodeUtil_getImpureBooleanValue_541450511495 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38295;
     Object term75816;
     Object enum5;

    public NodeUtil_getImpureBooleanValue_541450511495() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38295 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term38295, term38295.getClass(), "type", 122);
        term75816 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term75816, term75816.getClass(), "type", 122);
        setField(term75816, term75816.getClass(), "next", null);
        setField(term75816, term75816.getClass(), "first", null);
        setField(term75816, term75816.getClass(), "last", null);
        setField(term75816, term75816.getClass(), "propListHead", null);
        setIntField(term75816, term75816.getClass(), "sourcePosition", 0);
        setField(term75816, term75816.getClass(), "jsType", null);
        setField(term75816, term75816.getClass(), "parent", null);
        Class<? extends Object> term75818 = Class.forName((String) "com.google.javascript.rhino.jstype.TernaryValue");
        Field term75817 = ((Class) term75818).getDeclaredField((String) "FALSE");
        ((Field) term75817).setAccessible(true);
        enum5 = ((Field) term75817).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term38295;
        Object retValue = callMethod(klass, "getImpureBooleanValue", argTypes, null, args);
        assertTrue(recursiveEquals(term38295, term75816));
        assertTrue(recursiveEquals(retValue, enum5));
    }

};


