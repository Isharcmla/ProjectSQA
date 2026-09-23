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
import java.lang.Integer;

public class NodeUtil_containsType_1974866574174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1951;
     Object term1978;
     Object term11333;

    public NodeUtil_containsType_1974866574174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1951 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1953 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1955 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1958 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1961 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1964 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1968 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1971 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1974 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1951, term1951.getClass(), "type", 848428785);
        setIntField(term1953, term1953.getClass(), "type", -752378450);
        setIntField(term1955, term1955.getClass(), "type", 0);
        setField(term1955, term1955.getClass(), "next", null);
        setField(term1955, term1955.getClass(), "first", null);
        setField(term1955, term1955.getClass(), "last", null);
        setField(term1955, term1955.getClass(), "propListHead", null);
        setIntField(term1955, term1955.getClass(), "sourcePosition", 0);
        setField(term1955, term1955.getClass(), "jsType", null);
        setField(term1955, term1955.getClass(), "parent", null);
        setField(term1953, term1953.getClass(), "next", term1955);
        setIntField(term1958, term1958.getClass(), "type", 0);
        setField(term1958, term1958.getClass(), "next", null);
        setField(term1958, term1958.getClass(), "first", null);
        setField(term1958, term1958.getClass(), "last", null);
        setField(term1958, term1958.getClass(), "propListHead", null);
        setIntField(term1958, term1958.getClass(), "sourcePosition", 0);
        setField(term1958, term1958.getClass(), "jsType", null);
        setField(term1958, term1958.getClass(), "parent", null);
        setField(term1953, term1953.getClass(), "first", term1958);
        setIntField(term1961, term1961.getClass(), "type", 0);
        setField(term1961, term1961.getClass(), "next", null);
        setField(term1961, term1961.getClass(), "first", null);
        setField(term1961, term1961.getClass(), "last", null);
        setField(term1961, term1961.getClass(), "propListHead", null);
        setIntField(term1961, term1961.getClass(), "sourcePosition", 0);
        setField(term1961, term1961.getClass(), "jsType", null);
        setField(term1961, term1961.getClass(), "parent", null);
        setField(term1953, term1953.getClass(), "last", term1961);
        setField(term1964, term1964.getClass(), "next", null);
        setIntField(term1964, term1964.getClass(), "type", 0);
        setIntField(term1964, term1964.getClass(), "intValue", 0);
        setField(term1964, term1964.getClass(), "objectValue", null);
        setField(term1953, term1953.getClass(), "propListHead", term1964);
        setIntField(term1953, term1953.getClass(), "sourcePosition", 1904515443);
        setField(term1953, term1953.getClass(), "jsType", null);
        setField(term1953, term1953.getClass(), "parent", null);
        setField(term1951, term1951.getClass(), "next", term1953);
        setIntField(term1968, term1968.getClass(), "type", 0);
        setField(term1968, term1968.getClass(), "next", null);
        setField(term1968, term1968.getClass(), "first", null);
        setField(term1968, term1968.getClass(), "last", null);
        setField(term1968, term1968.getClass(), "propListHead", null);
        setIntField(term1968, term1968.getClass(), "sourcePosition", 0);
        setField(term1968, term1968.getClass(), "jsType", null);
        setField(term1968, term1968.getClass(), "parent", null);
        setField(term1951, term1951.getClass(), "first", term1968);
        setIntField(term1971, term1971.getClass(), "type", 0);
        setField(term1971, term1971.getClass(), "next", null);
        setField(term1971, term1971.getClass(), "first", null);
        setField(term1971, term1971.getClass(), "last", null);
        setField(term1971, term1971.getClass(), "propListHead", null);
        setIntField(term1971, term1971.getClass(), "sourcePosition", 0);
        setField(term1971, term1971.getClass(), "jsType", null);
        setField(term1971, term1971.getClass(), "parent", null);
        setField(term1951, term1951.getClass(), "last", term1971);
        setField(term1974, term1974.getClass(), "next", null);
        setIntField(term1974, term1974.getClass(), "type", 0);
        setIntField(term1974, term1974.getClass(), "intValue", 0);
        setField(term1974, term1974.getClass(), "objectValue", null);
        setField(term1951, term1951.getClass(), "propListHead", term1974);
        setIntField(term1951, term1951.getClass(), "sourcePosition", 1361126430);
        setField(term1951, term1951.getClass(), "jsType", null);
        setField(term1951, term1951.getClass(), "parent", null);
        term1978 = new Integer(1728588701);
        term11333 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11334 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11335 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11336 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11337 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11338 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term11339 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11340 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11341 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term11333, term11333.getClass(), "type", 848428785);
        setIntField(term11334, term11334.getClass(), "type", -752378450);
        setIntField(term11335, term11335.getClass(), "type", 0);
        setField(term11335, term11335.getClass(), "next", null);
        setField(term11335, term11335.getClass(), "first", null);
        setField(term11335, term11335.getClass(), "last", null);
        setField(term11335, term11335.getClass(), "propListHead", null);
        setIntField(term11335, term11335.getClass(), "sourcePosition", 0);
        setField(term11335, term11335.getClass(), "jsType", null);
        setField(term11335, term11335.getClass(), "parent", null);
        setField(term11334, term11334.getClass(), "next", term11335);
        setIntField(term11336, term11336.getClass(), "type", 0);
        setField(term11336, term11336.getClass(), "next", null);
        setField(term11336, term11336.getClass(), "first", null);
        setField(term11336, term11336.getClass(), "last", null);
        setField(term11336, term11336.getClass(), "propListHead", null);
        setIntField(term11336, term11336.getClass(), "sourcePosition", 0);
        setField(term11336, term11336.getClass(), "jsType", null);
        setField(term11336, term11336.getClass(), "parent", null);
        setField(term11334, term11334.getClass(), "first", term11336);
        setIntField(term11337, term11337.getClass(), "type", 0);
        setField(term11337, term11337.getClass(), "next", null);
        setField(term11337, term11337.getClass(), "first", null);
        setField(term11337, term11337.getClass(), "last", null);
        setField(term11337, term11337.getClass(), "propListHead", null);
        setIntField(term11337, term11337.getClass(), "sourcePosition", 0);
        setField(term11337, term11337.getClass(), "jsType", null);
        setField(term11337, term11337.getClass(), "parent", null);
        setField(term11334, term11334.getClass(), "last", term11337);
        setField(term11338, term11338.getClass(), "next", null);
        setIntField(term11338, term11338.getClass(), "type", 0);
        setIntField(term11338, term11338.getClass(), "intValue", 0);
        setField(term11338, term11338.getClass(), "objectValue", null);
        setField(term11334, term11334.getClass(), "propListHead", term11338);
        setIntField(term11334, term11334.getClass(), "sourcePosition", 1904515443);
        setField(term11334, term11334.getClass(), "jsType", null);
        setField(term11334, term11334.getClass(), "parent", null);
        setField(term11333, term11333.getClass(), "next", term11334);
        setIntField(term11339, term11339.getClass(), "type", 0);
        setField(term11339, term11339.getClass(), "next", null);
        setField(term11339, term11339.getClass(), "first", null);
        setField(term11339, term11339.getClass(), "last", null);
        setField(term11339, term11339.getClass(), "propListHead", null);
        setIntField(term11339, term11339.getClass(), "sourcePosition", 0);
        setField(term11339, term11339.getClass(), "jsType", null);
        setField(term11339, term11339.getClass(), "parent", null);
        setField(term11333, term11333.getClass(), "first", term11339);
        setIntField(term11340, term11340.getClass(), "type", 0);
        setField(term11340, term11340.getClass(), "next", null);
        setField(term11340, term11340.getClass(), "first", null);
        setField(term11340, term11340.getClass(), "last", null);
        setField(term11340, term11340.getClass(), "propListHead", null);
        setIntField(term11340, term11340.getClass(), "sourcePosition", 0);
        setField(term11340, term11340.getClass(), "jsType", null);
        setField(term11340, term11340.getClass(), "parent", null);
        setField(term11333, term11333.getClass(), "last", term11340);
        setField(term11341, term11341.getClass(), "next", null);
        setIntField(term11341, term11341.getClass(), "type", 0);
        setIntField(term11341, term11341.getClass(), "intValue", 0);
        setField(term11341, term11341.getClass(), "objectValue", null);
        setField(term11333, term11333.getClass(), "propListHead", term11341);
        setIntField(term11333, term11333.getClass(), "sourcePosition", 1361126430);
        setField(term11333, term11333.getClass(), "jsType", null);
        setField(term11333, term11333.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1951;
        args[1] = term1978;
        callMethod(klass, "containsType", argTypes, null, args);
        assertTrue(recursiveEquals(term1951, 1728588701));
        assertTrue(recursiveEquals(term1978, term11333));
    }

};


