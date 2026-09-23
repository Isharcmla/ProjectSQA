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
import java.lang.Integer;

public class NodeUtil_isNodeTypeReferenced_1716925395196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2749;
     Object term2776;

    public NodeUtil_isNodeTypeReferenced_1716925395196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2749 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2751 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2753 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2756 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2759 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2762 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2766 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2769 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2772 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2749, term2749.getClass(), "type", -2078879114);
        setIntField(term2751, term2751.getClass(), "type", -1584779593);
        setIntField(term2753, term2753.getClass(), "type", 0);
        setField(term2753, term2753.getClass(), "next", null);
        setField(term2753, term2753.getClass(), "first", null);
        setField(term2753, term2753.getClass(), "last", null);
        setField(term2753, term2753.getClass(), "propListHead", null);
        setIntField(term2753, term2753.getClass(), "sourcePosition", 0);
        setField(term2753, term2753.getClass(), "jsType", null);
        setField(term2753, term2753.getClass(), "parent", null);
        setField(term2751, term2751.getClass(), "next", term2753);
        setIntField(term2756, term2756.getClass(), "type", 0);
        setField(term2756, term2756.getClass(), "next", null);
        setField(term2756, term2756.getClass(), "first", null);
        setField(term2756, term2756.getClass(), "last", null);
        setField(term2756, term2756.getClass(), "propListHead", null);
        setIntField(term2756, term2756.getClass(), "sourcePosition", 0);
        setField(term2756, term2756.getClass(), "jsType", null);
        setField(term2756, term2756.getClass(), "parent", null);
        setField(term2751, term2751.getClass(), "first", term2756);
        setIntField(term2759, term2759.getClass(), "type", 0);
        setField(term2759, term2759.getClass(), "next", null);
        setField(term2759, term2759.getClass(), "first", null);
        setField(term2759, term2759.getClass(), "last", null);
        setField(term2759, term2759.getClass(), "propListHead", null);
        setIntField(term2759, term2759.getClass(), "sourcePosition", 0);
        setField(term2759, term2759.getClass(), "jsType", null);
        setField(term2759, term2759.getClass(), "parent", null);
        setField(term2751, term2751.getClass(), "last", term2759);
        setField(term2762, term2762.getClass(), "next", null);
        setIntField(term2762, term2762.getClass(), "type", 0);
        setIntField(term2762, term2762.getClass(), "intValue", 0);
        setField(term2762, term2762.getClass(), "objectValue", null);
        setField(term2751, term2751.getClass(), "propListHead", term2762);
        setIntField(term2751, term2751.getClass(), "sourcePosition", -1635571857);
        setField(term2751, term2751.getClass(), "jsType", null);
        setField(term2751, term2751.getClass(), "parent", null);
        setField(term2749, term2749.getClass(), "next", term2751);
        setIntField(term2766, term2766.getClass(), "type", 0);
        setField(term2766, term2766.getClass(), "next", null);
        setField(term2766, term2766.getClass(), "first", null);
        setField(term2766, term2766.getClass(), "last", null);
        setField(term2766, term2766.getClass(), "propListHead", null);
        setIntField(term2766, term2766.getClass(), "sourcePosition", 0);
        setField(term2766, term2766.getClass(), "jsType", null);
        setField(term2766, term2766.getClass(), "parent", null);
        setField(term2749, term2749.getClass(), "first", term2766);
        setIntField(term2769, term2769.getClass(), "type", 0);
        setField(term2769, term2769.getClass(), "next", null);
        setField(term2769, term2769.getClass(), "first", null);
        setField(term2769, term2769.getClass(), "last", null);
        setField(term2769, term2769.getClass(), "propListHead", null);
        setIntField(term2769, term2769.getClass(), "sourcePosition", 0);
        setField(term2769, term2769.getClass(), "jsType", null);
        setField(term2769, term2769.getClass(), "parent", null);
        setField(term2749, term2749.getClass(), "last", term2769);
        setField(term2772, term2772.getClass(), "next", null);
        setIntField(term2772, term2772.getClass(), "type", 0);
        setIntField(term2772, term2772.getClass(), "intValue", 0);
        setField(term2772, term2772.getClass(), "objectValue", null);
        setField(term2749, term2749.getClass(), "propListHead", term2772);
        setIntField(term2749, term2749.getClass(), "sourcePosition", 1407309162);
        setField(term2749, term2749.getClass(), "jsType", null);
        setField(term2749, term2749.getClass(), "parent", null);
        term2776 = new Integer(-534033672);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term2749;
        args[1] = term2776;
        args[2] = null;
        try {
            callMethod(klass, "isNodeTypeReferenced", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


