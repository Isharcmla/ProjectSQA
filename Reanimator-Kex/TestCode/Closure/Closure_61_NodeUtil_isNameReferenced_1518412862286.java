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

public class NodeUtil_isNameReferenced_1518412862286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3071;
     Object term20958;

    public NodeUtil_isNameReferenced_1518412862286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3071 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3073 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3075 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3078 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3081 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3085 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3088 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3071, term3071.getClass(), "type", -2017073245);
        setIntField(term3073, term3073.getClass(), "type", -758778797);
        setIntField(term3075, term3075.getClass(), "type", 0);
        setField(term3075, term3075.getClass(), "next", null);
        setField(term3075, term3075.getClass(), "first", null);
        setField(term3075, term3075.getClass(), "last", null);
        setField(term3075, term3075.getClass(), "propListHead", null);
        setIntField(term3075, term3075.getClass(), "sourcePosition", 0);
        setField(term3075, term3075.getClass(), "jsType", null);
        setField(term3075, term3075.getClass(), "parent", null);
        setField(term3073, term3073.getClass(), "next", term3075);
        setIntField(term3078, term3078.getClass(), "type", 0);
        setField(term3078, term3078.getClass(), "next", null);
        setField(term3078, term3078.getClass(), "first", null);
        setField(term3078, term3078.getClass(), "last", null);
        setField(term3078, term3078.getClass(), "propListHead", null);
        setIntField(term3078, term3078.getClass(), "sourcePosition", 0);
        setField(term3078, term3078.getClass(), "jsType", null);
        setField(term3078, term3078.getClass(), "parent", null);
        setField(term3073, term3073.getClass(), "first", term3078);
        setIntField(term3081, term3081.getClass(), "type", 0);
        setField(term3081, term3081.getClass(), "next", null);
        setField(term3081, term3081.getClass(), "first", null);
        setField(term3081, term3081.getClass(), "last", null);
        setField(term3081, term3081.getClass(), "propListHead", null);
        setIntField(term3081, term3081.getClass(), "sourcePosition", 0);
        setField(term3081, term3081.getClass(), "jsType", null);
        setField(term3081, term3081.getClass(), "parent", null);
        setField(term3073, term3073.getClass(), "last", term3081);
        setField(term3073, term3073.getClass(), "propListHead", null);
        setIntField(term3073, term3073.getClass(), "sourcePosition", 0);
        setField(term3073, term3073.getClass(), "jsType", null);
        setField(term3073, term3073.getClass(), "parent", null);
        setField(term3071, term3071.getClass(), "next", term3073);
        setIntField(term3085, term3085.getClass(), "type", 0);
        setField(term3085, term3085.getClass(), "next", null);
        setField(term3085, term3085.getClass(), "first", null);
        setField(term3085, term3085.getClass(), "last", null);
        setField(term3085, term3085.getClass(), "propListHead", null);
        setIntField(term3085, term3085.getClass(), "sourcePosition", 0);
        setField(term3085, term3085.getClass(), "jsType", null);
        setField(term3085, term3085.getClass(), "parent", null);
        setField(term3071, term3071.getClass(), "first", term3085);
        setIntField(term3088, term3088.getClass(), "type", 0);
        setField(term3088, term3088.getClass(), "next", null);
        setField(term3088, term3088.getClass(), "first", null);
        setField(term3088, term3088.getClass(), "last", null);
        setField(term3088, term3088.getClass(), "propListHead", null);
        setIntField(term3088, term3088.getClass(), "sourcePosition", 0);
        setField(term3088, term3088.getClass(), "jsType", null);
        setField(term3088, term3088.getClass(), "parent", null);
        setField(term3071, term3071.getClass(), "last", term3088);
        setField(term3071, term3071.getClass(), "propListHead", null);
        setIntField(term3071, term3071.getClass(), "sourcePosition", 0);
        setField(term3071, term3071.getClass(), "jsType", null);
        setField(term3071, term3071.getClass(), "parent", null);
        term20958 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20959 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20960 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20961 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20962 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20963 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20964 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20958, term20958.getClass(), "type", -2017073245);
        setIntField(term20959, term20959.getClass(), "type", -758778797);
        setIntField(term20960, term20960.getClass(), "type", 0);
        setField(term20960, term20960.getClass(), "next", null);
        setField(term20960, term20960.getClass(), "first", null);
        setField(term20960, term20960.getClass(), "last", null);
        setField(term20960, term20960.getClass(), "propListHead", null);
        setIntField(term20960, term20960.getClass(), "sourcePosition", 0);
        setField(term20960, term20960.getClass(), "jsType", null);
        setField(term20960, term20960.getClass(), "parent", null);
        setField(term20959, term20959.getClass(), "next", term20960);
        setIntField(term20961, term20961.getClass(), "type", 0);
        setField(term20961, term20961.getClass(), "next", null);
        setField(term20961, term20961.getClass(), "first", null);
        setField(term20961, term20961.getClass(), "last", null);
        setField(term20961, term20961.getClass(), "propListHead", null);
        setIntField(term20961, term20961.getClass(), "sourcePosition", 0);
        setField(term20961, term20961.getClass(), "jsType", null);
        setField(term20961, term20961.getClass(), "parent", null);
        setField(term20959, term20959.getClass(), "first", term20961);
        setIntField(term20962, term20962.getClass(), "type", 0);
        setField(term20962, term20962.getClass(), "next", null);
        setField(term20962, term20962.getClass(), "first", null);
        setField(term20962, term20962.getClass(), "last", null);
        setField(term20962, term20962.getClass(), "propListHead", null);
        setIntField(term20962, term20962.getClass(), "sourcePosition", 0);
        setField(term20962, term20962.getClass(), "jsType", null);
        setField(term20962, term20962.getClass(), "parent", null);
        setField(term20959, term20959.getClass(), "last", term20962);
        setField(term20959, term20959.getClass(), "propListHead", null);
        setIntField(term20959, term20959.getClass(), "sourcePosition", 0);
        setField(term20959, term20959.getClass(), "jsType", null);
        setField(term20959, term20959.getClass(), "parent", null);
        setField(term20958, term20958.getClass(), "next", term20959);
        setIntField(term20963, term20963.getClass(), "type", 0);
        setField(term20963, term20963.getClass(), "next", null);
        setField(term20963, term20963.getClass(), "first", null);
        setField(term20963, term20963.getClass(), "last", null);
        setField(term20963, term20963.getClass(), "propListHead", null);
        setIntField(term20963, term20963.getClass(), "sourcePosition", 0);
        setField(term20963, term20963.getClass(), "jsType", null);
        setField(term20963, term20963.getClass(), "parent", null);
        setField(term20958, term20958.getClass(), "first", term20963);
        setIntField(term20964, term20964.getClass(), "type", 0);
        setField(term20964, term20964.getClass(), "next", null);
        setField(term20964, term20964.getClass(), "first", null);
        setField(term20964, term20964.getClass(), "last", null);
        setField(term20964, term20964.getClass(), "propListHead", null);
        setIntField(term20964, term20964.getClass(), "sourcePosition", 0);
        setField(term20964, term20964.getClass(), "jsType", null);
        setField(term20964, term20964.getClass(), "parent", null);
        setField(term20958, term20958.getClass(), "last", term20964);
        setField(term20958, term20958.getClass(), "propListHead", null);
        setIntField(term20958, term20958.getClass(), "sourcePosition", 0);
        setField(term20958, term20958.getClass(), "jsType", null);
        setField(term20958, term20958.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term3071;
        args[1] = "OclPbYPkcH";
        callMethod(klass, "isNameReferenced", argTypes, null, args);
        assertTrue(recursiveEquals(term3071, "OclPbYPkcH"));
    }

};


