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

public class NodeUtil_mayEffectMutableState_1910072630219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17907;
     Object term18005;

    public NodeUtil_mayEffectMutableState_1910072630219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17907 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17907, term17907.getClass(), "type", 80);
        term18005 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18005, term18005.getClass(), "type", 80);
        setField(term18005, term18005.getClass(), "next", null);
        setField(term18005, term18005.getClass(), "first", null);
        setField(term18005, term18005.getClass(), "last", null);
        setField(term18005, term18005.getClass(), "propListHead", null);
        setIntField(term18005, term18005.getClass(), "sourcePosition", 0);
        setField(term18005, term18005.getClass(), "jsType", null);
        setField(term18005, term18005.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term17907;
        callMethod(klass, "mayEffectMutableState", argTypes, null, args);
        assertTrue(recursiveEquals(term17907, term18005));
    }

};


