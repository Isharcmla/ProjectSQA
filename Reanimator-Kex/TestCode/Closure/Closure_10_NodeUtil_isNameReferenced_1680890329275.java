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

public class NodeUtil_isNameReferenced_1680890329275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3402;

    public NodeUtil_isNameReferenced_1680890329275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3402 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3404 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3406 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3408 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3410 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3413 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3417 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3419 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3424 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3402, term3402.getClass(), "type", -1549603566);
        setIntField(term3404, term3404.getClass(), "type", 1077223540);
        setIntField(term3406, term3406.getClass(), "type", -1823813592);
        setIntField(term3408, term3408.getClass(), "type", -1644358555);
        setIntField(term3410, term3410.getClass(), "type", -388591034);
        setField(term3410, term3410.getClass(), "next", null);
        setField(term3410, term3410.getClass(), "first", null);
        setField(term3410, term3410.getClass(), "last", null);
        setField(term3410, term3410.getClass(), "propListHead", null);
        setIntField(term3410, term3410.getClass(), "sourcePosition", 0);
        setField(term3410, term3410.getClass(), "jsType", null);
        setField(term3410, term3410.getClass(), "parent", null);
        setField(term3408, term3408.getClass(), "next", term3410);
        setIntField(term3413, term3413.getClass(), "type", -1270258033);
        setField(term3413, term3413.getClass(), "next", null);
        setField(term3413, term3413.getClass(), "first", null);
        setField(term3413, term3413.getClass(), "last", term3410);
        setField(term3413, term3413.getClass(), "propListHead", null);
        setIntField(term3413, term3413.getClass(), "sourcePosition", 0);
        setField(term3413, term3413.getClass(), "jsType", null);
        setField(term3413, term3413.getClass(), "parent", null);
        setField(term3408, term3408.getClass(), "first", term3413);
        setField(term3408, term3408.getClass(), "last", term3406);
        setField(term3408, term3408.getClass(), "propListHead", null);
        setIntField(term3408, term3408.getClass(), "sourcePosition", 0);
        setField(term3408, term3408.getClass(), "jsType", null);
        setField(term3408, term3408.getClass(), "parent", null);
        setField(term3406, term3406.getClass(), "next", term3408);
        setField(term3406, term3406.getClass(), "first", term3410);
        setIntField(term3417, term3417.getClass(), "type", -439999692);
        setIntField(term3419, term3419.getClass(), "type", 924095007);
        setField(term3419, term3419.getClass(), "next", null);
        setField(term3419, term3419.getClass(), "first", term3413);
        setField(term3419, term3419.getClass(), "last", term3408);
        setField(term3419, term3419.getClass(), "propListHead", null);
        setIntField(term3419, term3419.getClass(), "sourcePosition", 0);
        setField(term3419, term3419.getClass(), "jsType", null);
        setField(term3419, term3419.getClass(), "parent", null);
        setField(term3417, term3417.getClass(), "next", term3419);
        setField(term3417, term3417.getClass(), "first", term3404);
        setField(term3417, term3417.getClass(), "last", term3404);
        setField(term3417, term3417.getClass(), "propListHead", null);
        setIntField(term3417, term3417.getClass(), "sourcePosition", 0);
        setField(term3417, term3417.getClass(), "jsType", null);
        setField(term3417, term3417.getClass(), "parent", null);
        setField(term3406, term3406.getClass(), "last", term3417);
        setField(term3406, term3406.getClass(), "propListHead", null);
        setIntField(term3406, term3406.getClass(), "sourcePosition", 0);
        setField(term3406, term3406.getClass(), "jsType", null);
        setField(term3406, term3406.getClass(), "parent", null);
        setField(term3404, term3404.getClass(), "next", term3406);
        setIntField(term3424, term3424.getClass(), "type", 1302110708);
        setField(term3424, term3424.getClass(), "next", term3417);
        setField(term3424, term3424.getClass(), "first", term3419);
        setField(term3424, term3424.getClass(), "last", term3402);
        setField(term3424, term3424.getClass(), "propListHead", null);
        setIntField(term3424, term3424.getClass(), "sourcePosition", 0);
        setField(term3424, term3424.getClass(), "jsType", null);
        setField(term3424, term3424.getClass(), "parent", null);
        setField(term3404, term3404.getClass(), "first", term3424);
        setField(term3404, term3404.getClass(), "last", term3424);
        setField(term3404, term3404.getClass(), "propListHead", null);
        setIntField(term3404, term3404.getClass(), "sourcePosition", 0);
        setField(term3404, term3404.getClass(), "jsType", null);
        setField(term3404, term3404.getClass(), "parent", null);
        setField(term3402, term3402.getClass(), "next", term3404);
        setField(term3402, term3402.getClass(), "first", term3408);
        setField(term3402, term3402.getClass(), "last", term3410);
        setField(term3402, term3402.getClass(), "propListHead", null);
        setIntField(term3402, term3402.getClass(), "sourcePosition", 0);
        setField(term3402, term3402.getClass(), "jsType", null);
        setField(term3402, term3402.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term3402;
        args[1] = "OclPbYPkcH";
        args[2] = null;
        try {
            callMethod(klass, "isNameReferenced", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


