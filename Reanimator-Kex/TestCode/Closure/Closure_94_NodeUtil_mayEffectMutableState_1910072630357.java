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

public class NodeUtil_mayEffectMutableState_1910072630357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31739;
     Object term32029;

    public NodeUtil_mayEffectMutableState_1910072630357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31739 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term31739, term31739.getClass(), "type", 46);
        term32029 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32029, term32029.getClass(), "type", 46);
        setField(term32029, term32029.getClass(), "next", null);
        setField(term32029, term32029.getClass(), "first", null);
        setField(term32029, term32029.getClass(), "last", null);
        setField(term32029, term32029.getClass(), "propListHead", null);
        setIntField(term32029, term32029.getClass(), "sourcePosition", 0);
        setField(term32029, term32029.getClass(), "jsType", null);
        setField(term32029, term32029.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term31739;
        callMethod(klass, "mayEffectMutableState", argTypes, null, args);
        assertTrue(recursiveEquals(term31739, term32029));
    }

};


