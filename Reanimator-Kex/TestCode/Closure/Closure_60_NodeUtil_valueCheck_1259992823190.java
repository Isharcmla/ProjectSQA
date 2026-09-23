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

public class NodeUtil_valueCheck_1259992823190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term715;

    public NodeUtil_valueCheck_1259992823190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term715 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term717 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term719 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term722 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term725 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term729 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term732 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term715, term715.getClass(), "type", 32185364);
        setIntField(term717, term717.getClass(), "type", -310528004);
        setIntField(term719, term719.getClass(), "type", 0);
        setField(term719, term719.getClass(), "next", null);
        setField(term719, term719.getClass(), "first", null);
        setField(term719, term719.getClass(), "last", null);
        setField(term719, term719.getClass(), "propListHead", null);
        setIntField(term719, term719.getClass(), "sourcePosition", 0);
        setField(term719, term719.getClass(), "jsType", null);
        setField(term719, term719.getClass(), "parent", null);
        setField(term717, term717.getClass(), "next", term719);
        setIntField(term722, term722.getClass(), "type", 0);
        setField(term722, term722.getClass(), "next", null);
        setField(term722, term722.getClass(), "first", null);
        setField(term722, term722.getClass(), "last", null);
        setField(term722, term722.getClass(), "propListHead", null);
        setIntField(term722, term722.getClass(), "sourcePosition", 0);
        setField(term722, term722.getClass(), "jsType", null);
        setField(term722, term722.getClass(), "parent", null);
        setField(term717, term717.getClass(), "first", term722);
        setIntField(term725, term725.getClass(), "type", 0);
        setField(term725, term725.getClass(), "next", null);
        setField(term725, term725.getClass(), "first", null);
        setField(term725, term725.getClass(), "last", null);
        setField(term725, term725.getClass(), "propListHead", null);
        setIntField(term725, term725.getClass(), "sourcePosition", 0);
        setField(term725, term725.getClass(), "jsType", null);
        setField(term725, term725.getClass(), "parent", null);
        setField(term717, term717.getClass(), "last", term725);
        setField(term717, term717.getClass(), "propListHead", null);
        setIntField(term717, term717.getClass(), "sourcePosition", 0);
        setField(term717, term717.getClass(), "jsType", null);
        setField(term717, term717.getClass(), "parent", null);
        setField(term715, term715.getClass(), "next", term717);
        setIntField(term729, term729.getClass(), "type", 0);
        setField(term729, term729.getClass(), "next", null);
        setField(term729, term729.getClass(), "first", null);
        setField(term729, term729.getClass(), "last", null);
        setField(term729, term729.getClass(), "propListHead", null);
        setIntField(term729, term729.getClass(), "sourcePosition", 0);
        setField(term729, term729.getClass(), "jsType", null);
        setField(term729, term729.getClass(), "parent", null);
        setField(term715, term715.getClass(), "first", term729);
        setIntField(term732, term732.getClass(), "type", 0);
        setField(term732, term732.getClass(), "next", null);
        setField(term732, term732.getClass(), "first", null);
        setField(term732, term732.getClass(), "last", null);
        setField(term732, term732.getClass(), "propListHead", null);
        setIntField(term732, term732.getClass(), "sourcePosition", 0);
        setField(term732, term732.getClass(), "jsType", null);
        setField(term732, term732.getClass(), "parent", null);
        setField(term715, term715.getClass(), "last", term732);
        setField(term715, term715.getClass(), "propListHead", null);
        setIntField(term715, term715.getClass(), "sourcePosition", 0);
        setField(term715, term715.getClass(), "jsType", null);
        setField(term715, term715.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[2];
        args[0] = term715;
        args[1] = null;
        try {
            callMethod(klass, "valueCheck", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


