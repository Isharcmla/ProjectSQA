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

public class NodeUtil_containsType_951752563175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1949;
     Object term1976;

    public NodeUtil_containsType_951752563175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1949 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1951 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1953 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1956 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1959 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1962 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1966 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1969 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1972 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1949, term1949.getClass(), "type", 1050853183);
        setIntField(term1951, term1951.getClass(), "type", 1190753616);
        setIntField(term1953, term1953.getClass(), "type", 0);
        setField(term1953, term1953.getClass(), "next", null);
        setField(term1953, term1953.getClass(), "first", null);
        setField(term1953, term1953.getClass(), "last", null);
        setField(term1953, term1953.getClass(), "propListHead", null);
        setIntField(term1953, term1953.getClass(), "sourcePosition", 0);
        setField(term1953, term1953.getClass(), "jsType", null);
        setField(term1953, term1953.getClass(), "parent", null);
        setField(term1951, term1951.getClass(), "next", term1953);
        setIntField(term1956, term1956.getClass(), "type", 0);
        setField(term1956, term1956.getClass(), "next", null);
        setField(term1956, term1956.getClass(), "first", null);
        setField(term1956, term1956.getClass(), "last", null);
        setField(term1956, term1956.getClass(), "propListHead", null);
        setIntField(term1956, term1956.getClass(), "sourcePosition", 0);
        setField(term1956, term1956.getClass(), "jsType", null);
        setField(term1956, term1956.getClass(), "parent", null);
        setField(term1951, term1951.getClass(), "first", term1956);
        setIntField(term1959, term1959.getClass(), "type", 0);
        setField(term1959, term1959.getClass(), "next", null);
        setField(term1959, term1959.getClass(), "first", null);
        setField(term1959, term1959.getClass(), "last", null);
        setField(term1959, term1959.getClass(), "propListHead", null);
        setIntField(term1959, term1959.getClass(), "sourcePosition", 0);
        setField(term1959, term1959.getClass(), "jsType", null);
        setField(term1959, term1959.getClass(), "parent", null);
        setField(term1951, term1951.getClass(), "last", term1959);
        setField(term1962, term1962.getClass(), "next", null);
        setIntField(term1962, term1962.getClass(), "type", 0);
        setIntField(term1962, term1962.getClass(), "intValue", 0);
        setField(term1962, term1962.getClass(), "objectValue", null);
        setField(term1951, term1951.getClass(), "propListHead", term1962);
        setIntField(term1951, term1951.getClass(), "sourcePosition", 1865070548);
        setField(term1951, term1951.getClass(), "jsType", null);
        setField(term1951, term1951.getClass(), "parent", null);
        setField(term1949, term1949.getClass(), "next", term1951);
        setIntField(term1966, term1966.getClass(), "type", 0);
        setField(term1966, term1966.getClass(), "next", null);
        setField(term1966, term1966.getClass(), "first", null);
        setField(term1966, term1966.getClass(), "last", null);
        setField(term1966, term1966.getClass(), "propListHead", null);
        setIntField(term1966, term1966.getClass(), "sourcePosition", 0);
        setField(term1966, term1966.getClass(), "jsType", null);
        setField(term1966, term1966.getClass(), "parent", null);
        setField(term1949, term1949.getClass(), "first", term1966);
        setIntField(term1969, term1969.getClass(), "type", 0);
        setField(term1969, term1969.getClass(), "next", null);
        setField(term1969, term1969.getClass(), "first", null);
        setField(term1969, term1969.getClass(), "last", null);
        setField(term1969, term1969.getClass(), "propListHead", null);
        setIntField(term1969, term1969.getClass(), "sourcePosition", 0);
        setField(term1969, term1969.getClass(), "jsType", null);
        setField(term1969, term1969.getClass(), "parent", null);
        setField(term1949, term1949.getClass(), "last", term1969);
        setField(term1972, term1972.getClass(), "next", null);
        setIntField(term1972, term1972.getClass(), "type", 0);
        setIntField(term1972, term1972.getClass(), "intValue", 0);
        setField(term1972, term1972.getClass(), "objectValue", null);
        setField(term1949, term1949.getClass(), "propListHead", term1972);
        setIntField(term1949, term1949.getClass(), "sourcePosition", 1904515443);
        setField(term1949, term1949.getClass(), "jsType", null);
        setField(term1949, term1949.getClass(), "parent", null);
        term1976 = new Integer(1361126430);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term1949;
        args[1] = term1976;
        args[2] = null;
        try {
            callMethod(klass, "containsType", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


