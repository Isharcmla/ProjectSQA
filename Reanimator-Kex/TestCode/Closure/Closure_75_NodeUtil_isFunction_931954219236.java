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

public class NodeUtil_isFunction_931954219236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2243;
     Object term15213;

    public NodeUtil_isFunction_931954219236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2243 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2245 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2247 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2250 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2253 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2256 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2260 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2263 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2266 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2243, term2243.getClass(), "type", -1452324619);
        setIntField(term2245, term2245.getClass(), "type", 1737876343);
        setIntField(term2247, term2247.getClass(), "type", 0);
        setField(term2247, term2247.getClass(), "next", null);
        setField(term2247, term2247.getClass(), "first", null);
        setField(term2247, term2247.getClass(), "last", null);
        setField(term2247, term2247.getClass(), "propListHead", null);
        setIntField(term2247, term2247.getClass(), "sourcePosition", 0);
        setField(term2247, term2247.getClass(), "jsType", null);
        setField(term2247, term2247.getClass(), "parent", null);
        setField(term2245, term2245.getClass(), "next", term2247);
        setIntField(term2250, term2250.getClass(), "type", 0);
        setField(term2250, term2250.getClass(), "next", null);
        setField(term2250, term2250.getClass(), "first", null);
        setField(term2250, term2250.getClass(), "last", null);
        setField(term2250, term2250.getClass(), "propListHead", null);
        setIntField(term2250, term2250.getClass(), "sourcePosition", 0);
        setField(term2250, term2250.getClass(), "jsType", null);
        setField(term2250, term2250.getClass(), "parent", null);
        setField(term2245, term2245.getClass(), "first", term2250);
        setIntField(term2253, term2253.getClass(), "type", 0);
        setField(term2253, term2253.getClass(), "next", null);
        setField(term2253, term2253.getClass(), "first", null);
        setField(term2253, term2253.getClass(), "last", null);
        setField(term2253, term2253.getClass(), "propListHead", null);
        setIntField(term2253, term2253.getClass(), "sourcePosition", 0);
        setField(term2253, term2253.getClass(), "jsType", null);
        setField(term2253, term2253.getClass(), "parent", null);
        setField(term2245, term2245.getClass(), "last", term2253);
        setField(term2256, term2256.getClass(), "next", null);
        setIntField(term2256, term2256.getClass(), "type", 0);
        setIntField(term2256, term2256.getClass(), "intValue", 0);
        setField(term2256, term2256.getClass(), "objectValue", null);
        setField(term2245, term2245.getClass(), "propListHead", term2256);
        setIntField(term2245, term2245.getClass(), "sourcePosition", -428988337);
        setField(term2245, term2245.getClass(), "jsType", null);
        setField(term2245, term2245.getClass(), "parent", null);
        setField(term2243, term2243.getClass(), "next", term2245);
        setIntField(term2260, term2260.getClass(), "type", 0);
        setField(term2260, term2260.getClass(), "next", null);
        setField(term2260, term2260.getClass(), "first", null);
        setField(term2260, term2260.getClass(), "last", null);
        setField(term2260, term2260.getClass(), "propListHead", null);
        setIntField(term2260, term2260.getClass(), "sourcePosition", 0);
        setField(term2260, term2260.getClass(), "jsType", null);
        setField(term2260, term2260.getClass(), "parent", null);
        setField(term2243, term2243.getClass(), "first", term2260);
        setIntField(term2263, term2263.getClass(), "type", 0);
        setField(term2263, term2263.getClass(), "next", null);
        setField(term2263, term2263.getClass(), "first", null);
        setField(term2263, term2263.getClass(), "last", null);
        setField(term2263, term2263.getClass(), "propListHead", null);
        setIntField(term2263, term2263.getClass(), "sourcePosition", 0);
        setField(term2263, term2263.getClass(), "jsType", null);
        setField(term2263, term2263.getClass(), "parent", null);
        setField(term2243, term2243.getClass(), "last", term2263);
        setField(term2266, term2266.getClass(), "next", null);
        setIntField(term2266, term2266.getClass(), "type", 0);
        setIntField(term2266, term2266.getClass(), "intValue", 0);
        setField(term2266, term2266.getClass(), "objectValue", null);
        setField(term2243, term2243.getClass(), "propListHead", term2266);
        setIntField(term2243, term2243.getClass(), "sourcePosition", 48047085);
        setField(term2243, term2243.getClass(), "jsType", null);
        setField(term2243, term2243.getClass(), "parent", null);
        term15213 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15214 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15215 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15216 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15217 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15218 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term15219 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15220 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15221 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term15213, term15213.getClass(), "type", -1452324619);
        setIntField(term15214, term15214.getClass(), "type", 1737876343);
        setIntField(term15215, term15215.getClass(), "type", 0);
        setField(term15215, term15215.getClass(), "next", null);
        setField(term15215, term15215.getClass(), "first", null);
        setField(term15215, term15215.getClass(), "last", null);
        setField(term15215, term15215.getClass(), "propListHead", null);
        setIntField(term15215, term15215.getClass(), "sourcePosition", 0);
        setField(term15215, term15215.getClass(), "jsType", null);
        setField(term15215, term15215.getClass(), "parent", null);
        setField(term15214, term15214.getClass(), "next", term15215);
        setIntField(term15216, term15216.getClass(), "type", 0);
        setField(term15216, term15216.getClass(), "next", null);
        setField(term15216, term15216.getClass(), "first", null);
        setField(term15216, term15216.getClass(), "last", null);
        setField(term15216, term15216.getClass(), "propListHead", null);
        setIntField(term15216, term15216.getClass(), "sourcePosition", 0);
        setField(term15216, term15216.getClass(), "jsType", null);
        setField(term15216, term15216.getClass(), "parent", null);
        setField(term15214, term15214.getClass(), "first", term15216);
        setIntField(term15217, term15217.getClass(), "type", 0);
        setField(term15217, term15217.getClass(), "next", null);
        setField(term15217, term15217.getClass(), "first", null);
        setField(term15217, term15217.getClass(), "last", null);
        setField(term15217, term15217.getClass(), "propListHead", null);
        setIntField(term15217, term15217.getClass(), "sourcePosition", 0);
        setField(term15217, term15217.getClass(), "jsType", null);
        setField(term15217, term15217.getClass(), "parent", null);
        setField(term15214, term15214.getClass(), "last", term15217);
        setField(term15218, term15218.getClass(), "next", null);
        setIntField(term15218, term15218.getClass(), "type", 0);
        setIntField(term15218, term15218.getClass(), "intValue", 0);
        setField(term15218, term15218.getClass(), "objectValue", null);
        setField(term15214, term15214.getClass(), "propListHead", term15218);
        setIntField(term15214, term15214.getClass(), "sourcePosition", -428988337);
        setField(term15214, term15214.getClass(), "jsType", null);
        setField(term15214, term15214.getClass(), "parent", null);
        setField(term15213, term15213.getClass(), "next", term15214);
        setIntField(term15219, term15219.getClass(), "type", 0);
        setField(term15219, term15219.getClass(), "next", null);
        setField(term15219, term15219.getClass(), "first", null);
        setField(term15219, term15219.getClass(), "last", null);
        setField(term15219, term15219.getClass(), "propListHead", null);
        setIntField(term15219, term15219.getClass(), "sourcePosition", 0);
        setField(term15219, term15219.getClass(), "jsType", null);
        setField(term15219, term15219.getClass(), "parent", null);
        setField(term15213, term15213.getClass(), "first", term15219);
        setIntField(term15220, term15220.getClass(), "type", 0);
        setField(term15220, term15220.getClass(), "next", null);
        setField(term15220, term15220.getClass(), "first", null);
        setField(term15220, term15220.getClass(), "last", null);
        setField(term15220, term15220.getClass(), "propListHead", null);
        setIntField(term15220, term15220.getClass(), "sourcePosition", 0);
        setField(term15220, term15220.getClass(), "jsType", null);
        setField(term15220, term15220.getClass(), "parent", null);
        setField(term15213, term15213.getClass(), "last", term15220);
        setField(term15221, term15221.getClass(), "next", null);
        setIntField(term15221, term15221.getClass(), "type", 0);
        setIntField(term15221, term15221.getClass(), "intValue", 0);
        setField(term15221, term15221.getClass(), "objectValue", null);
        setField(term15213, term15213.getClass(), "propListHead", term15221);
        setIntField(term15213, term15213.getClass(), "sourcePosition", 48047085);
        setField(term15213, term15213.getClass(), "jsType", null);
        setField(term15213, term15213.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2243;
        Object retValue = callMethod(klass, "isFunction", argTypes, null, args);
        assertTrue(recursiveEquals(term2243, term15213));
        assertTrue(recursiveEquals(retValue, false));
    }

};


