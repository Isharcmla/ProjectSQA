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

public class NodeUtil_newQualifiedNameNode_128645923257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2770;

    public NodeUtil_newQualifiedNameNode_128645923257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2770 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2772 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2774 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2776 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2778 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2781 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2785 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2787 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2792 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2770, term2770.getClass(), "type", 1013801066);
        setIntField(term2772, term2772.getClass(), "type", 1512541853);
        setIntField(term2774, term2774.getClass(), "type", -965421502);
        setIntField(term2776, term2776.getClass(), "type", 1319026002);
        setIntField(term2778, term2778.getClass(), "type", -1368173231);
        setField(term2778, term2778.getClass(), "next", null);
        setField(term2778, term2778.getClass(), "first", null);
        setField(term2778, term2778.getClass(), "last", null);
        setField(term2778, term2778.getClass(), "propListHead", null);
        setIntField(term2778, term2778.getClass(), "sourcePosition", 0);
        setField(term2778, term2778.getClass(), "jsType", null);
        setField(term2778, term2778.getClass(), "parent", null);
        setField(term2776, term2776.getClass(), "next", term2778);
        setIntField(term2781, term2781.getClass(), "type", 1956006038);
        setField(term2781, term2781.getClass(), "next", null);
        setField(term2781, term2781.getClass(), "first", null);
        setField(term2781, term2781.getClass(), "last", term2778);
        setField(term2781, term2781.getClass(), "propListHead", null);
        setIntField(term2781, term2781.getClass(), "sourcePosition", 0);
        setField(term2781, term2781.getClass(), "jsType", null);
        setField(term2781, term2781.getClass(), "parent", null);
        setField(term2776, term2776.getClass(), "first", term2781);
        setField(term2776, term2776.getClass(), "last", term2774);
        setField(term2776, term2776.getClass(), "propListHead", null);
        setIntField(term2776, term2776.getClass(), "sourcePosition", 0);
        setField(term2776, term2776.getClass(), "jsType", null);
        setField(term2776, term2776.getClass(), "parent", null);
        setField(term2774, term2774.getClass(), "next", term2776);
        setField(term2774, term2774.getClass(), "first", term2778);
        setIntField(term2785, term2785.getClass(), "type", -1377876610);
        setIntField(term2787, term2787.getClass(), "type", -1456184732);
        setField(term2787, term2787.getClass(), "next", null);
        setField(term2787, term2787.getClass(), "first", term2781);
        setField(term2787, term2787.getClass(), "last", term2776);
        setField(term2787, term2787.getClass(), "propListHead", null);
        setIntField(term2787, term2787.getClass(), "sourcePosition", 0);
        setField(term2787, term2787.getClass(), "jsType", null);
        setField(term2787, term2787.getClass(), "parent", null);
        setField(term2785, term2785.getClass(), "next", term2787);
        setField(term2785, term2785.getClass(), "first", term2772);
        setField(term2785, term2785.getClass(), "last", term2772);
        setField(term2785, term2785.getClass(), "propListHead", null);
        setIntField(term2785, term2785.getClass(), "sourcePosition", 0);
        setField(term2785, term2785.getClass(), "jsType", null);
        setField(term2785, term2785.getClass(), "parent", null);
        setField(term2774, term2774.getClass(), "last", term2785);
        setField(term2774, term2774.getClass(), "propListHead", null);
        setIntField(term2774, term2774.getClass(), "sourcePosition", 0);
        setField(term2774, term2774.getClass(), "jsType", null);
        setField(term2774, term2774.getClass(), "parent", null);
        setField(term2772, term2772.getClass(), "next", term2774);
        setIntField(term2792, term2792.getClass(), "type", 1689228897);
        setField(term2792, term2792.getClass(), "next", term2785);
        setField(term2792, term2792.getClass(), "first", term2787);
        setField(term2792, term2792.getClass(), "last", term2770);
        setField(term2792, term2792.getClass(), "propListHead", null);
        setIntField(term2792, term2792.getClass(), "sourcePosition", 0);
        setField(term2792, term2792.getClass(), "jsType", null);
        setField(term2792, term2792.getClass(), "parent", null);
        setField(term2772, term2772.getClass(), "first", term2792);
        setField(term2772, term2772.getClass(), "last", term2792);
        setField(term2772, term2772.getClass(), "propListHead", null);
        setIntField(term2772, term2772.getClass(), "sourcePosition", 0);
        setField(term2772, term2772.getClass(), "jsType", null);
        setField(term2772, term2772.getClass(), "parent", null);
        setField(term2770, term2770.getClass(), "next", term2772);
        setField(term2770, term2770.getClass(), "first", term2776);
        setField(term2770, term2770.getClass(), "last", term2778);
        setField(term2770, term2770.getClass(), "propListHead", null);
        setIntField(term2770, term2770.getClass(), "sourcePosition", 0);
        setField(term2770, term2770.getClass(), "jsType", null);
        setField(term2770, term2770.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.CodingConvention");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = "aJlieCFVtF";
        args[2] = term2770;
        args[3] = "ZiaGIbnzTs";
        try {
            callMethod(klass, "newQualifiedNameNode", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


