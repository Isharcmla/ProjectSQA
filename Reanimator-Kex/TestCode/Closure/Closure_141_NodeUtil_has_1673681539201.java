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

public class NodeUtil_has_1673681539201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2954;

    public NodeUtil_has_1673681539201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2954 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2956 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2958 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2961 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2964 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2967 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2971 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2974 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2977 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2954, term2954.getClass(), "type", 1833713431);
        setIntField(term2956, term2956.getClass(), "type", 695052304);
        setIntField(term2958, term2958.getClass(), "type", 0);
        setField(term2958, term2958.getClass(), "next", null);
        setField(term2958, term2958.getClass(), "first", null);
        setField(term2958, term2958.getClass(), "last", null);
        setField(term2958, term2958.getClass(), "propListHead", null);
        setIntField(term2958, term2958.getClass(), "sourcePosition", 0);
        setField(term2958, term2958.getClass(), "jsType", null);
        setField(term2958, term2958.getClass(), "parent", null);
        setField(term2956, term2956.getClass(), "next", term2958);
        setIntField(term2961, term2961.getClass(), "type", 0);
        setField(term2961, term2961.getClass(), "next", null);
        setField(term2961, term2961.getClass(), "first", null);
        setField(term2961, term2961.getClass(), "last", null);
        setField(term2961, term2961.getClass(), "propListHead", null);
        setIntField(term2961, term2961.getClass(), "sourcePosition", 0);
        setField(term2961, term2961.getClass(), "jsType", null);
        setField(term2961, term2961.getClass(), "parent", null);
        setField(term2956, term2956.getClass(), "first", term2961);
        setIntField(term2964, term2964.getClass(), "type", 0);
        setField(term2964, term2964.getClass(), "next", null);
        setField(term2964, term2964.getClass(), "first", null);
        setField(term2964, term2964.getClass(), "last", null);
        setField(term2964, term2964.getClass(), "propListHead", null);
        setIntField(term2964, term2964.getClass(), "sourcePosition", 0);
        setField(term2964, term2964.getClass(), "jsType", null);
        setField(term2964, term2964.getClass(), "parent", null);
        setField(term2956, term2956.getClass(), "last", term2964);
        setField(term2967, term2967.getClass(), "next", null);
        setIntField(term2967, term2967.getClass(), "type", 0);
        setIntField(term2967, term2967.getClass(), "intValue", 0);
        setField(term2967, term2967.getClass(), "objectValue", null);
        setField(term2956, term2956.getClass(), "propListHead", term2967);
        setIntField(term2956, term2956.getClass(), "sourcePosition", -1156002984);
        setField(term2956, term2956.getClass(), "jsType", null);
        setField(term2956, term2956.getClass(), "parent", null);
        setField(term2954, term2954.getClass(), "next", term2956);
        setIntField(term2971, term2971.getClass(), "type", 0);
        setField(term2971, term2971.getClass(), "next", null);
        setField(term2971, term2971.getClass(), "first", null);
        setField(term2971, term2971.getClass(), "last", null);
        setField(term2971, term2971.getClass(), "propListHead", null);
        setIntField(term2971, term2971.getClass(), "sourcePosition", 0);
        setField(term2971, term2971.getClass(), "jsType", null);
        setField(term2971, term2971.getClass(), "parent", null);
        setField(term2954, term2954.getClass(), "first", term2971);
        setIntField(term2974, term2974.getClass(), "type", 0);
        setField(term2974, term2974.getClass(), "next", null);
        setField(term2974, term2974.getClass(), "first", null);
        setField(term2974, term2974.getClass(), "last", null);
        setField(term2974, term2974.getClass(), "propListHead", null);
        setIntField(term2974, term2974.getClass(), "sourcePosition", 0);
        setField(term2974, term2974.getClass(), "jsType", null);
        setField(term2974, term2974.getClass(), "parent", null);
        setField(term2954, term2954.getClass(), "last", term2974);
        setField(term2977, term2977.getClass(), "next", null);
        setIntField(term2977, term2977.getClass(), "type", 0);
        setIntField(term2977, term2977.getClass(), "intValue", 0);
        setField(term2977, term2977.getClass(), "objectValue", null);
        setField(term2954, term2954.getClass(), "propListHead", term2977);
        setIntField(term2954, term2954.getClass(), "sourcePosition", 1676254730);
        setField(term2954, term2954.getClass(), "jsType", null);
        setField(term2954, term2954.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.common.base.Predicate");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term2954;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "has", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


