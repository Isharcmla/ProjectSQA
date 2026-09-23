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

public class NodeUtil_mayEffectMutableState_1910072630435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37610;
     Object term37669;

    public NodeUtil_mayEffectMutableState_1910072630435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37610 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term37610, term37610.getClass(), "type", 57);
        term37669 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term37669, term37669.getClass(), "type", 57);
        setField(term37669, term37669.getClass(), "next", null);
        setField(term37669, term37669.getClass(), "first", null);
        setField(term37669, term37669.getClass(), "last", null);
        setField(term37669, term37669.getClass(), "propListHead", null);
        setIntField(term37669, term37669.getClass(), "sourcePosition", 0);
        setField(term37669, term37669.getClass(), "jsType", null);
        setField(term37669, term37669.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term37610;
        callMethod(klass, "mayEffectMutableState", argTypes, null, args);
        assertTrue(recursiveEquals(term37610, term37669));
    }

};


