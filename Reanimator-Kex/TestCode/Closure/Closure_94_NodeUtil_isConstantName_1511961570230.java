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

public class NodeUtil_isConstantName_1511961570230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3382;
     Object term19614;

    public NodeUtil_isConstantName_1511961570230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3382 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3384 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3386 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3389 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3392 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3395 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3399 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3402 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3405 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3382, term3382.getClass(), "type", 1101385603);
        setIntField(term3384, term3384.getClass(), "type", -165487736);
        setIntField(term3386, term3386.getClass(), "type", 0);
        setField(term3386, term3386.getClass(), "next", null);
        setField(term3386, term3386.getClass(), "first", null);
        setField(term3386, term3386.getClass(), "last", null);
        setField(term3386, term3386.getClass(), "propListHead", null);
        setIntField(term3386, term3386.getClass(), "sourcePosition", 0);
        setField(term3386, term3386.getClass(), "jsType", null);
        setField(term3386, term3386.getClass(), "parent", null);
        setField(term3384, term3384.getClass(), "next", term3386);
        setIntField(term3389, term3389.getClass(), "type", 0);
        setField(term3389, term3389.getClass(), "next", null);
        setField(term3389, term3389.getClass(), "first", null);
        setField(term3389, term3389.getClass(), "last", null);
        setField(term3389, term3389.getClass(), "propListHead", null);
        setIntField(term3389, term3389.getClass(), "sourcePosition", 0);
        setField(term3389, term3389.getClass(), "jsType", null);
        setField(term3389, term3389.getClass(), "parent", null);
        setField(term3384, term3384.getClass(), "first", term3389);
        setIntField(term3392, term3392.getClass(), "type", 0);
        setField(term3392, term3392.getClass(), "next", null);
        setField(term3392, term3392.getClass(), "first", null);
        setField(term3392, term3392.getClass(), "last", null);
        setField(term3392, term3392.getClass(), "propListHead", null);
        setIntField(term3392, term3392.getClass(), "sourcePosition", 0);
        setField(term3392, term3392.getClass(), "jsType", null);
        setField(term3392, term3392.getClass(), "parent", null);
        setField(term3384, term3384.getClass(), "last", term3392);
        setField(term3395, term3395.getClass(), "next", null);
        setIntField(term3395, term3395.getClass(), "type", 0);
        setIntField(term3395, term3395.getClass(), "intValue", 0);
        setField(term3395, term3395.getClass(), "objectValue", null);
        setField(term3384, term3384.getClass(), "propListHead", term3395);
        setIntField(term3384, term3384.getClass(), "sourcePosition", -1494372780);
        setField(term3384, term3384.getClass(), "jsType", null);
        setField(term3384, term3384.getClass(), "parent", null);
        setField(term3382, term3382.getClass(), "next", term3384);
        setIntField(term3399, term3399.getClass(), "type", 0);
        setField(term3399, term3399.getClass(), "next", null);
        setField(term3399, term3399.getClass(), "first", null);
        setField(term3399, term3399.getClass(), "last", null);
        setField(term3399, term3399.getClass(), "propListHead", null);
        setIntField(term3399, term3399.getClass(), "sourcePosition", 0);
        setField(term3399, term3399.getClass(), "jsType", null);
        setField(term3399, term3399.getClass(), "parent", null);
        setField(term3382, term3382.getClass(), "first", term3399);
        setIntField(term3402, term3402.getClass(), "type", 0);
        setField(term3402, term3402.getClass(), "next", null);
        setField(term3402, term3402.getClass(), "first", null);
        setField(term3402, term3402.getClass(), "last", null);
        setField(term3402, term3402.getClass(), "propListHead", null);
        setIntField(term3402, term3402.getClass(), "sourcePosition", 0);
        setField(term3402, term3402.getClass(), "jsType", null);
        setField(term3402, term3402.getClass(), "parent", null);
        setField(term3382, term3382.getClass(), "last", term3402);
        setField(term3405, term3405.getClass(), "next", null);
        setIntField(term3405, term3405.getClass(), "type", 0);
        setIntField(term3405, term3405.getClass(), "intValue", 0);
        setField(term3405, term3405.getClass(), "objectValue", null);
        setField(term3382, term3382.getClass(), "propListHead", term3405);
        setIntField(term3382, term3382.getClass(), "sourcePosition", 703799187);
        setField(term3382, term3382.getClass(), "jsType", null);
        setField(term3382, term3382.getClass(), "parent", null);
        term19614 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19615 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19616 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19617 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19618 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19619 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term19620 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19621 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19622 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term19614, term19614.getClass(), "type", 1101385603);
        setIntField(term19615, term19615.getClass(), "type", -165487736);
        setIntField(term19616, term19616.getClass(), "type", 0);
        setField(term19616, term19616.getClass(), "next", null);
        setField(term19616, term19616.getClass(), "first", null);
        setField(term19616, term19616.getClass(), "last", null);
        setField(term19616, term19616.getClass(), "propListHead", null);
        setIntField(term19616, term19616.getClass(), "sourcePosition", 0);
        setField(term19616, term19616.getClass(), "jsType", null);
        setField(term19616, term19616.getClass(), "parent", null);
        setField(term19615, term19615.getClass(), "next", term19616);
        setIntField(term19617, term19617.getClass(), "type", 0);
        setField(term19617, term19617.getClass(), "next", null);
        setField(term19617, term19617.getClass(), "first", null);
        setField(term19617, term19617.getClass(), "last", null);
        setField(term19617, term19617.getClass(), "propListHead", null);
        setIntField(term19617, term19617.getClass(), "sourcePosition", 0);
        setField(term19617, term19617.getClass(), "jsType", null);
        setField(term19617, term19617.getClass(), "parent", null);
        setField(term19615, term19615.getClass(), "first", term19617);
        setIntField(term19618, term19618.getClass(), "type", 0);
        setField(term19618, term19618.getClass(), "next", null);
        setField(term19618, term19618.getClass(), "first", null);
        setField(term19618, term19618.getClass(), "last", null);
        setField(term19618, term19618.getClass(), "propListHead", null);
        setIntField(term19618, term19618.getClass(), "sourcePosition", 0);
        setField(term19618, term19618.getClass(), "jsType", null);
        setField(term19618, term19618.getClass(), "parent", null);
        setField(term19615, term19615.getClass(), "last", term19618);
        setField(term19619, term19619.getClass(), "next", null);
        setIntField(term19619, term19619.getClass(), "type", 0);
        setIntField(term19619, term19619.getClass(), "intValue", 0);
        setField(term19619, term19619.getClass(), "objectValue", null);
        setField(term19615, term19615.getClass(), "propListHead", term19619);
        setIntField(term19615, term19615.getClass(), "sourcePosition", -1494372780);
        setField(term19615, term19615.getClass(), "jsType", null);
        setField(term19615, term19615.getClass(), "parent", null);
        setField(term19614, term19614.getClass(), "next", term19615);
        setIntField(term19620, term19620.getClass(), "type", 0);
        setField(term19620, term19620.getClass(), "next", null);
        setField(term19620, term19620.getClass(), "first", null);
        setField(term19620, term19620.getClass(), "last", null);
        setField(term19620, term19620.getClass(), "propListHead", null);
        setIntField(term19620, term19620.getClass(), "sourcePosition", 0);
        setField(term19620, term19620.getClass(), "jsType", null);
        setField(term19620, term19620.getClass(), "parent", null);
        setField(term19614, term19614.getClass(), "first", term19620);
        setIntField(term19621, term19621.getClass(), "type", 0);
        setField(term19621, term19621.getClass(), "next", null);
        setField(term19621, term19621.getClass(), "first", null);
        setField(term19621, term19621.getClass(), "last", null);
        setField(term19621, term19621.getClass(), "propListHead", null);
        setIntField(term19621, term19621.getClass(), "sourcePosition", 0);
        setField(term19621, term19621.getClass(), "jsType", null);
        setField(term19621, term19621.getClass(), "parent", null);
        setField(term19614, term19614.getClass(), "last", term19621);
        setField(term19622, term19622.getClass(), "next", null);
        setIntField(term19622, term19622.getClass(), "type", 0);
        setIntField(term19622, term19622.getClass(), "intValue", 0);
        setField(term19622, term19622.getClass(), "objectValue", null);
        setField(term19614, term19614.getClass(), "propListHead", term19622);
        setIntField(term19614, term19614.getClass(), "sourcePosition", 703799187);
        setField(term19614, term19614.getClass(), "jsType", null);
        setField(term19614, term19614.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3382;
        callMethod(klass, "isConstantName", argTypes, null, args);
        assertTrue(recursiveEquals(term3382, term19614));
    }

};


