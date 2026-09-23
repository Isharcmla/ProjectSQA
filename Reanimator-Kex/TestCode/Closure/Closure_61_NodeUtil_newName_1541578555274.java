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

public class NodeUtil_newName_1541578555274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2739;

    public NodeUtil_newName_1541578555274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2739 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2741 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2743 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2746 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2749 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2753 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2756 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2739, term2739.getClass(), "type", 47607734);
        setIntField(term2741, term2741.getClass(), "type", 1201413899);
        setIntField(term2743, term2743.getClass(), "type", 0);
        setField(term2743, term2743.getClass(), "next", null);
        setField(term2743, term2743.getClass(), "first", null);
        setField(term2743, term2743.getClass(), "last", null);
        setField(term2743, term2743.getClass(), "propListHead", null);
        setIntField(term2743, term2743.getClass(), "sourcePosition", 0);
        setField(term2743, term2743.getClass(), "jsType", null);
        setField(term2743, term2743.getClass(), "parent", null);
        setField(term2741, term2741.getClass(), "next", term2743);
        setIntField(term2746, term2746.getClass(), "type", 0);
        setField(term2746, term2746.getClass(), "next", null);
        setField(term2746, term2746.getClass(), "first", null);
        setField(term2746, term2746.getClass(), "last", null);
        setField(term2746, term2746.getClass(), "propListHead", null);
        setIntField(term2746, term2746.getClass(), "sourcePosition", 0);
        setField(term2746, term2746.getClass(), "jsType", null);
        setField(term2746, term2746.getClass(), "parent", null);
        setField(term2741, term2741.getClass(), "first", term2746);
        setIntField(term2749, term2749.getClass(), "type", 0);
        setField(term2749, term2749.getClass(), "next", null);
        setField(term2749, term2749.getClass(), "first", null);
        setField(term2749, term2749.getClass(), "last", null);
        setField(term2749, term2749.getClass(), "propListHead", null);
        setIntField(term2749, term2749.getClass(), "sourcePosition", 0);
        setField(term2749, term2749.getClass(), "jsType", null);
        setField(term2749, term2749.getClass(), "parent", null);
        setField(term2741, term2741.getClass(), "last", term2749);
        setField(term2741, term2741.getClass(), "propListHead", null);
        setIntField(term2741, term2741.getClass(), "sourcePosition", 0);
        setField(term2741, term2741.getClass(), "jsType", null);
        setField(term2741, term2741.getClass(), "parent", null);
        setField(term2739, term2739.getClass(), "next", term2741);
        setIntField(term2753, term2753.getClass(), "type", 0);
        setField(term2753, term2753.getClass(), "next", null);
        setField(term2753, term2753.getClass(), "first", null);
        setField(term2753, term2753.getClass(), "last", null);
        setField(term2753, term2753.getClass(), "propListHead", null);
        setIntField(term2753, term2753.getClass(), "sourcePosition", 0);
        setField(term2753, term2753.getClass(), "jsType", null);
        setField(term2753, term2753.getClass(), "parent", null);
        setField(term2739, term2739.getClass(), "first", term2753);
        setIntField(term2756, term2756.getClass(), "type", 0);
        setField(term2756, term2756.getClass(), "next", null);
        setField(term2756, term2756.getClass(), "first", null);
        setField(term2756, term2756.getClass(), "last", null);
        setField(term2756, term2756.getClass(), "propListHead", null);
        setIntField(term2756, term2756.getClass(), "sourcePosition", 0);
        setField(term2756, term2756.getClass(), "jsType", null);
        setField(term2756, term2756.getClass(), "parent", null);
        setField(term2739, term2739.getClass(), "last", term2756);
        setField(term2739, term2739.getClass(), "propListHead", null);
        setIntField(term2739, term2739.getClass(), "sourcePosition", 0);
        setField(term2739, term2739.getClass(), "jsType", null);
        setField(term2739, term2739.getClass(), "parent", null);
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
        args[1] = "RkybSrpybU";
        args[2] = term2739;
        args[3] = "xOEqzGAmDU";
        try {
            callMethod(klass, "newName", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


