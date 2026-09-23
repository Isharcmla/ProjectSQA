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

public class NodeUtil_isNumericResult_476998665191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term736;
     Object term9449;

    public NodeUtil_isNumericResult_476998665191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term736 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term738 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term740 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term743 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term746 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term750 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term753 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term736, term736.getClass(), "type", 803925431);
        setIntField(term738, term738.getClass(), "type", -1835839814);
        setIntField(term740, term740.getClass(), "type", 0);
        setField(term740, term740.getClass(), "next", null);
        setField(term740, term740.getClass(), "first", null);
        setField(term740, term740.getClass(), "last", null);
        setField(term740, term740.getClass(), "propListHead", null);
        setIntField(term740, term740.getClass(), "sourcePosition", 0);
        setField(term740, term740.getClass(), "jsType", null);
        setField(term740, term740.getClass(), "parent", null);
        setField(term738, term738.getClass(), "next", term740);
        setIntField(term743, term743.getClass(), "type", 0);
        setField(term743, term743.getClass(), "next", null);
        setField(term743, term743.getClass(), "first", null);
        setField(term743, term743.getClass(), "last", null);
        setField(term743, term743.getClass(), "propListHead", null);
        setIntField(term743, term743.getClass(), "sourcePosition", 0);
        setField(term743, term743.getClass(), "jsType", null);
        setField(term743, term743.getClass(), "parent", null);
        setField(term738, term738.getClass(), "first", term743);
        setIntField(term746, term746.getClass(), "type", 0);
        setField(term746, term746.getClass(), "next", null);
        setField(term746, term746.getClass(), "first", null);
        setField(term746, term746.getClass(), "last", null);
        setField(term746, term746.getClass(), "propListHead", null);
        setIntField(term746, term746.getClass(), "sourcePosition", 0);
        setField(term746, term746.getClass(), "jsType", null);
        setField(term746, term746.getClass(), "parent", null);
        setField(term738, term738.getClass(), "last", term746);
        setField(term738, term738.getClass(), "propListHead", null);
        setIntField(term738, term738.getClass(), "sourcePosition", 0);
        setField(term738, term738.getClass(), "jsType", null);
        setField(term738, term738.getClass(), "parent", null);
        setField(term736, term736.getClass(), "next", term738);
        setIntField(term750, term750.getClass(), "type", 0);
        setField(term750, term750.getClass(), "next", null);
        setField(term750, term750.getClass(), "first", null);
        setField(term750, term750.getClass(), "last", null);
        setField(term750, term750.getClass(), "propListHead", null);
        setIntField(term750, term750.getClass(), "sourcePosition", 0);
        setField(term750, term750.getClass(), "jsType", null);
        setField(term750, term750.getClass(), "parent", null);
        setField(term736, term736.getClass(), "first", term750);
        setIntField(term753, term753.getClass(), "type", 0);
        setField(term753, term753.getClass(), "next", null);
        setField(term753, term753.getClass(), "first", null);
        setField(term753, term753.getClass(), "last", null);
        setField(term753, term753.getClass(), "propListHead", null);
        setIntField(term753, term753.getClass(), "sourcePosition", 0);
        setField(term753, term753.getClass(), "jsType", null);
        setField(term753, term753.getClass(), "parent", null);
        setField(term736, term736.getClass(), "last", term753);
        setField(term736, term736.getClass(), "propListHead", null);
        setIntField(term736, term736.getClass(), "sourcePosition", 0);
        setField(term736, term736.getClass(), "jsType", null);
        setField(term736, term736.getClass(), "parent", null);
        term9449 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9450 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9451 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9452 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9453 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9454 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9455 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9449, term9449.getClass(), "type", 803925431);
        setIntField(term9450, term9450.getClass(), "type", -1835839814);
        setIntField(term9451, term9451.getClass(), "type", 0);
        setField(term9451, term9451.getClass(), "next", null);
        setField(term9451, term9451.getClass(), "first", null);
        setField(term9451, term9451.getClass(), "last", null);
        setField(term9451, term9451.getClass(), "propListHead", null);
        setIntField(term9451, term9451.getClass(), "sourcePosition", 0);
        setField(term9451, term9451.getClass(), "jsType", null);
        setField(term9451, term9451.getClass(), "parent", null);
        setField(term9450, term9450.getClass(), "next", term9451);
        setIntField(term9452, term9452.getClass(), "type", 0);
        setField(term9452, term9452.getClass(), "next", null);
        setField(term9452, term9452.getClass(), "first", null);
        setField(term9452, term9452.getClass(), "last", null);
        setField(term9452, term9452.getClass(), "propListHead", null);
        setIntField(term9452, term9452.getClass(), "sourcePosition", 0);
        setField(term9452, term9452.getClass(), "jsType", null);
        setField(term9452, term9452.getClass(), "parent", null);
        setField(term9450, term9450.getClass(), "first", term9452);
        setIntField(term9453, term9453.getClass(), "type", 0);
        setField(term9453, term9453.getClass(), "next", null);
        setField(term9453, term9453.getClass(), "first", null);
        setField(term9453, term9453.getClass(), "last", null);
        setField(term9453, term9453.getClass(), "propListHead", null);
        setIntField(term9453, term9453.getClass(), "sourcePosition", 0);
        setField(term9453, term9453.getClass(), "jsType", null);
        setField(term9453, term9453.getClass(), "parent", null);
        setField(term9450, term9450.getClass(), "last", term9453);
        setField(term9450, term9450.getClass(), "propListHead", null);
        setIntField(term9450, term9450.getClass(), "sourcePosition", 0);
        setField(term9450, term9450.getClass(), "jsType", null);
        setField(term9450, term9450.getClass(), "parent", null);
        setField(term9449, term9449.getClass(), "next", term9450);
        setIntField(term9454, term9454.getClass(), "type", 0);
        setField(term9454, term9454.getClass(), "next", null);
        setField(term9454, term9454.getClass(), "first", null);
        setField(term9454, term9454.getClass(), "last", null);
        setField(term9454, term9454.getClass(), "propListHead", null);
        setIntField(term9454, term9454.getClass(), "sourcePosition", 0);
        setField(term9454, term9454.getClass(), "jsType", null);
        setField(term9454, term9454.getClass(), "parent", null);
        setField(term9449, term9449.getClass(), "first", term9454);
        setIntField(term9455, term9455.getClass(), "type", 0);
        setField(term9455, term9455.getClass(), "next", null);
        setField(term9455, term9455.getClass(), "first", null);
        setField(term9455, term9455.getClass(), "last", null);
        setField(term9455, term9455.getClass(), "propListHead", null);
        setIntField(term9455, term9455.getClass(), "sourcePosition", 0);
        setField(term9455, term9455.getClass(), "jsType", null);
        setField(term9455, term9455.getClass(), "parent", null);
        setField(term9449, term9449.getClass(), "last", term9455);
        setField(term9449, term9449.getClass(), "propListHead", null);
        setIntField(term9449, term9449.getClass(), "sourcePosition", 0);
        setField(term9449, term9449.getClass(), "jsType", null);
        setField(term9449, term9449.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term736;
        callMethod(klass, "isNumericResult", argTypes, null, args);
        assertTrue(recursiveEquals(term736, term9449));
    }

};


