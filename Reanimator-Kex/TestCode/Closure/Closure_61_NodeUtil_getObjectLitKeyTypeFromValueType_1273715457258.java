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

public class NodeUtil_getObjectLitKeyTypeFromValueType_1273715457258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2234;
     Object term15584;

    public NodeUtil_getObjectLitKeyTypeFromValueType_1273715457258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2234 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2236 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2238 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2241 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2244 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2248 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2251 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2234, term2234.getClass(), "type", 360972386);
        setIntField(term2236, term2236.getClass(), "type", 1734759369);
        setIntField(term2238, term2238.getClass(), "type", 0);
        setField(term2238, term2238.getClass(), "next", null);
        setField(term2238, term2238.getClass(), "first", null);
        setField(term2238, term2238.getClass(), "last", null);
        setField(term2238, term2238.getClass(), "propListHead", null);
        setIntField(term2238, term2238.getClass(), "sourcePosition", 0);
        setField(term2238, term2238.getClass(), "jsType", null);
        setField(term2238, term2238.getClass(), "parent", null);
        setField(term2236, term2236.getClass(), "next", term2238);
        setIntField(term2241, term2241.getClass(), "type", 0);
        setField(term2241, term2241.getClass(), "next", null);
        setField(term2241, term2241.getClass(), "first", null);
        setField(term2241, term2241.getClass(), "last", null);
        setField(term2241, term2241.getClass(), "propListHead", null);
        setIntField(term2241, term2241.getClass(), "sourcePosition", 0);
        setField(term2241, term2241.getClass(), "jsType", null);
        setField(term2241, term2241.getClass(), "parent", null);
        setField(term2236, term2236.getClass(), "first", term2241);
        setIntField(term2244, term2244.getClass(), "type", 0);
        setField(term2244, term2244.getClass(), "next", null);
        setField(term2244, term2244.getClass(), "first", null);
        setField(term2244, term2244.getClass(), "last", null);
        setField(term2244, term2244.getClass(), "propListHead", null);
        setIntField(term2244, term2244.getClass(), "sourcePosition", 0);
        setField(term2244, term2244.getClass(), "jsType", null);
        setField(term2244, term2244.getClass(), "parent", null);
        setField(term2236, term2236.getClass(), "last", term2244);
        setField(term2236, term2236.getClass(), "propListHead", null);
        setIntField(term2236, term2236.getClass(), "sourcePosition", 0);
        setField(term2236, term2236.getClass(), "jsType", null);
        setField(term2236, term2236.getClass(), "parent", null);
        setField(term2234, term2234.getClass(), "next", term2236);
        setIntField(term2248, term2248.getClass(), "type", 0);
        setField(term2248, term2248.getClass(), "next", null);
        setField(term2248, term2248.getClass(), "first", null);
        setField(term2248, term2248.getClass(), "last", null);
        setField(term2248, term2248.getClass(), "propListHead", null);
        setIntField(term2248, term2248.getClass(), "sourcePosition", 0);
        setField(term2248, term2248.getClass(), "jsType", null);
        setField(term2248, term2248.getClass(), "parent", null);
        setField(term2234, term2234.getClass(), "first", term2248);
        setIntField(term2251, term2251.getClass(), "type", 0);
        setField(term2251, term2251.getClass(), "next", null);
        setField(term2251, term2251.getClass(), "first", null);
        setField(term2251, term2251.getClass(), "last", null);
        setField(term2251, term2251.getClass(), "propListHead", null);
        setIntField(term2251, term2251.getClass(), "sourcePosition", 0);
        setField(term2251, term2251.getClass(), "jsType", null);
        setField(term2251, term2251.getClass(), "parent", null);
        setField(term2234, term2234.getClass(), "last", term2251);
        setField(term2234, term2234.getClass(), "propListHead", null);
        setIntField(term2234, term2234.getClass(), "sourcePosition", 0);
        setField(term2234, term2234.getClass(), "jsType", null);
        setField(term2234, term2234.getClass(), "parent", null);
        term15584 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15585 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15586 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15587 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15588 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15589 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15590 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15584, term15584.getClass(), "type", 360972386);
        setIntField(term15585, term15585.getClass(), "type", 1734759369);
        setIntField(term15586, term15586.getClass(), "type", 0);
        setField(term15586, term15586.getClass(), "next", null);
        setField(term15586, term15586.getClass(), "first", null);
        setField(term15586, term15586.getClass(), "last", null);
        setField(term15586, term15586.getClass(), "propListHead", null);
        setIntField(term15586, term15586.getClass(), "sourcePosition", 0);
        setField(term15586, term15586.getClass(), "jsType", null);
        setField(term15586, term15586.getClass(), "parent", null);
        setField(term15585, term15585.getClass(), "next", term15586);
        setIntField(term15587, term15587.getClass(), "type", 0);
        setField(term15587, term15587.getClass(), "next", null);
        setField(term15587, term15587.getClass(), "first", null);
        setField(term15587, term15587.getClass(), "last", null);
        setField(term15587, term15587.getClass(), "propListHead", null);
        setIntField(term15587, term15587.getClass(), "sourcePosition", 0);
        setField(term15587, term15587.getClass(), "jsType", null);
        setField(term15587, term15587.getClass(), "parent", null);
        setField(term15585, term15585.getClass(), "first", term15587);
        setIntField(term15588, term15588.getClass(), "type", 0);
        setField(term15588, term15588.getClass(), "next", null);
        setField(term15588, term15588.getClass(), "first", null);
        setField(term15588, term15588.getClass(), "last", null);
        setField(term15588, term15588.getClass(), "propListHead", null);
        setIntField(term15588, term15588.getClass(), "sourcePosition", 0);
        setField(term15588, term15588.getClass(), "jsType", null);
        setField(term15588, term15588.getClass(), "parent", null);
        setField(term15585, term15585.getClass(), "last", term15588);
        setField(term15585, term15585.getClass(), "propListHead", null);
        setIntField(term15585, term15585.getClass(), "sourcePosition", 0);
        setField(term15585, term15585.getClass(), "jsType", null);
        setField(term15585, term15585.getClass(), "parent", null);
        setField(term15584, term15584.getClass(), "next", term15585);
        setIntField(term15589, term15589.getClass(), "type", 0);
        setField(term15589, term15589.getClass(), "next", null);
        setField(term15589, term15589.getClass(), "first", null);
        setField(term15589, term15589.getClass(), "last", null);
        setField(term15589, term15589.getClass(), "propListHead", null);
        setIntField(term15589, term15589.getClass(), "sourcePosition", 0);
        setField(term15589, term15589.getClass(), "jsType", null);
        setField(term15589, term15589.getClass(), "parent", null);
        setField(term15584, term15584.getClass(), "first", term15589);
        setIntField(term15590, term15590.getClass(), "type", 0);
        setField(term15590, term15590.getClass(), "next", null);
        setField(term15590, term15590.getClass(), "first", null);
        setField(term15590, term15590.getClass(), "last", null);
        setField(term15590, term15590.getClass(), "propListHead", null);
        setIntField(term15590, term15590.getClass(), "sourcePosition", 0);
        setField(term15590, term15590.getClass(), "jsType", null);
        setField(term15590, term15590.getClass(), "parent", null);
        setField(term15584, term15584.getClass(), "last", term15590);
        setField(term15584, term15584.getClass(), "propListHead", null);
        setIntField(term15584, term15584.getClass(), "sourcePosition", 0);
        setField(term15584, term15584.getClass(), "jsType", null);
        setField(term15584, term15584.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term2234;
        args[1] = null;
        Object retValue = callMethod(klass, "getObjectLitKeyTypeFromValueType", argTypes, null, args);
        assertTrue(recursiveEquals(term2234, term15584));
        assertTrue(recursiveEquals(retValue, null));
    }

};


