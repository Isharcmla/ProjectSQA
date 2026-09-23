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

public class NodeUtil_mayEffectMutableState_1910072630476 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40199;
     Object term40297;

    public NodeUtil_mayEffectMutableState_1910072630476() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40199 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term40199, term40199.getClass(), "type", 55);
        term40297 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term40297, term40297.getClass(), "type", 55);
        setField(term40297, term40297.getClass(), "next", null);
        setField(term40297, term40297.getClass(), "first", null);
        setField(term40297, term40297.getClass(), "last", null);
        setField(term40297, term40297.getClass(), "propListHead", null);
        setIntField(term40297, term40297.getClass(), "sourcePosition", 0);
        setField(term40297, term40297.getClass(), "jsType", null);
        setField(term40297, term40297.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term40199;
        callMethod(klass, "mayEffectMutableState", argTypes, null, args);
        assertTrue(recursiveEquals(term40199, term40297));
    }

};


