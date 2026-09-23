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
import java.lang.Object;

public class NodeUtil_getConditionExpression_1686829277221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1680;

    public NodeUtil_getConditionExpression_1686829277221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1680 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1682 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1684 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1686 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1688 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1691 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1695 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1697 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1702 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1680, term1680.getClass(), "type", 313459791);
        setIntField(term1682, term1682.getClass(), "type", 752615112);
        setIntField(term1684, term1684.getClass(), "type", -1674430871);
        setIntField(term1686, term1686.getClass(), "type", 794352120);
        setIntField(term1688, term1688.getClass(), "type", 340719678);
        setField(term1688, term1688.getClass(), "next", null);
        setField(term1688, term1688.getClass(), "first", null);
        setField(term1688, term1688.getClass(), "last", null);
        setField(term1688, term1688.getClass(), "propListHead", null);
        setIntField(term1688, term1688.getClass(), "sourcePosition", 0);
        setField(term1688, term1688.getClass(), "jsType", null);
        setField(term1688, term1688.getClass(), "parent", null);
        setField(term1686, term1686.getClass(), "next", term1688);
        setIntField(term1691, term1691.getClass(), "type", 299791142);
        setField(term1691, term1691.getClass(), "next", null);
        setField(term1691, term1691.getClass(), "first", null);
        setField(term1691, term1691.getClass(), "last", term1688);
        setField(term1691, term1691.getClass(), "propListHead", null);
        setIntField(term1691, term1691.getClass(), "sourcePosition", 0);
        setField(term1691, term1691.getClass(), "jsType", null);
        setField(term1691, term1691.getClass(), "parent", null);
        setField(term1686, term1686.getClass(), "first", term1691);
        setField(term1686, term1686.getClass(), "last", term1684);
        setField(term1686, term1686.getClass(), "propListHead", null);
        setIntField(term1686, term1686.getClass(), "sourcePosition", 0);
        setField(term1686, term1686.getClass(), "jsType", null);
        setField(term1686, term1686.getClass(), "parent", null);
        setField(term1684, term1684.getClass(), "next", term1686);
        setField(term1684, term1684.getClass(), "first", term1688);
        setIntField(term1695, term1695.getClass(), "type", 1131398807);
        setIntField(term1697, term1697.getClass(), "type", -344907703);
        setField(term1697, term1697.getClass(), "next", null);
        setField(term1697, term1697.getClass(), "first", term1691);
        setField(term1697, term1697.getClass(), "last", term1686);
        setField(term1697, term1697.getClass(), "propListHead", null);
        setIntField(term1697, term1697.getClass(), "sourcePosition", 0);
        setField(term1697, term1697.getClass(), "jsType", null);
        setField(term1697, term1697.getClass(), "parent", null);
        setField(term1695, term1695.getClass(), "next", term1697);
        setField(term1695, term1695.getClass(), "first", term1682);
        setField(term1695, term1695.getClass(), "last", term1682);
        setField(term1695, term1695.getClass(), "propListHead", null);
        setIntField(term1695, term1695.getClass(), "sourcePosition", 0);
        setField(term1695, term1695.getClass(), "jsType", null);
        setField(term1695, term1695.getClass(), "parent", null);
        setField(term1684, term1684.getClass(), "last", term1695);
        setField(term1684, term1684.getClass(), "propListHead", null);
        setIntField(term1684, term1684.getClass(), "sourcePosition", 0);
        setField(term1684, term1684.getClass(), "jsType", null);
        setField(term1684, term1684.getClass(), "parent", null);
        setField(term1682, term1682.getClass(), "next", term1684);
        setIntField(term1702, term1702.getClass(), "type", 824341437);
        setField(term1702, term1702.getClass(), "next", term1695);
        setField(term1702, term1702.getClass(), "first", term1697);
        setField(term1702, term1702.getClass(), "last", term1680);
        setField(term1702, term1702.getClass(), "propListHead", null);
        setIntField(term1702, term1702.getClass(), "sourcePosition", 0);
        setField(term1702, term1702.getClass(), "jsType", null);
        setField(term1702, term1702.getClass(), "parent", null);
        setField(term1682, term1682.getClass(), "first", term1702);
        setField(term1682, term1682.getClass(), "last", term1702);
        setField(term1682, term1682.getClass(), "propListHead", null);
        setIntField(term1682, term1682.getClass(), "sourcePosition", 0);
        setField(term1682, term1682.getClass(), "jsType", null);
        setField(term1682, term1682.getClass(), "parent", null);
        setField(term1680, term1680.getClass(), "next", term1682);
        setField(term1680, term1680.getClass(), "first", term1686);
        setField(term1680, term1680.getClass(), "last", term1688);
        setField(term1680, term1680.getClass(), "propListHead", null);
        setIntField(term1680, term1680.getClass(), "sourcePosition", 0);
        setField(term1680, term1680.getClass(), "jsType", null);
        setField(term1680, term1680.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1680;
        try {
            callMethod(klass, "getConditionExpression", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


