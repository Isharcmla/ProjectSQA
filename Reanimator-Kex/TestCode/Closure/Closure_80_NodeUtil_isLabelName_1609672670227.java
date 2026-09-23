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

public class NodeUtil_isLabelName_1609672670227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1946;
     Object term14127;

    public NodeUtil_isLabelName_1609672670227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1946 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1948 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1950 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1953 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1956 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1959 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1963 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1966 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1969 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1946, term1946.getClass(), "type", -1576584269);
        setIntField(term1948, term1948.getClass(), "type", 722787672);
        setIntField(term1950, term1950.getClass(), "type", 0);
        setField(term1950, term1950.getClass(), "next", null);
        setField(term1950, term1950.getClass(), "first", null);
        setField(term1950, term1950.getClass(), "last", null);
        setField(term1950, term1950.getClass(), "propListHead", null);
        setIntField(term1950, term1950.getClass(), "sourcePosition", 0);
        setField(term1950, term1950.getClass(), "jsType", null);
        setField(term1950, term1950.getClass(), "parent", null);
        setField(term1948, term1948.getClass(), "next", term1950);
        setIntField(term1953, term1953.getClass(), "type", 0);
        setField(term1953, term1953.getClass(), "next", null);
        setField(term1953, term1953.getClass(), "first", null);
        setField(term1953, term1953.getClass(), "last", null);
        setField(term1953, term1953.getClass(), "propListHead", null);
        setIntField(term1953, term1953.getClass(), "sourcePosition", 0);
        setField(term1953, term1953.getClass(), "jsType", null);
        setField(term1953, term1953.getClass(), "parent", null);
        setField(term1948, term1948.getClass(), "first", term1953);
        setIntField(term1956, term1956.getClass(), "type", 0);
        setField(term1956, term1956.getClass(), "next", null);
        setField(term1956, term1956.getClass(), "first", null);
        setField(term1956, term1956.getClass(), "last", null);
        setField(term1956, term1956.getClass(), "propListHead", null);
        setIntField(term1956, term1956.getClass(), "sourcePosition", 0);
        setField(term1956, term1956.getClass(), "jsType", null);
        setField(term1956, term1956.getClass(), "parent", null);
        setField(term1948, term1948.getClass(), "last", term1956);
        setField(term1959, term1959.getClass(), "next", null);
        setIntField(term1959, term1959.getClass(), "type", 0);
        setIntField(term1959, term1959.getClass(), "intValue", 0);
        setField(term1959, term1959.getClass(), "objectValue", null);
        setField(term1948, term1948.getClass(), "propListHead", term1959);
        setIntField(term1948, term1948.getClass(), "sourcePosition", 47118909);
        setField(term1948, term1948.getClass(), "jsType", null);
        setField(term1948, term1948.getClass(), "parent", null);
        setField(term1946, term1946.getClass(), "next", term1948);
        setIntField(term1963, term1963.getClass(), "type", 0);
        setField(term1963, term1963.getClass(), "next", null);
        setField(term1963, term1963.getClass(), "first", null);
        setField(term1963, term1963.getClass(), "last", null);
        setField(term1963, term1963.getClass(), "propListHead", null);
        setIntField(term1963, term1963.getClass(), "sourcePosition", 0);
        setField(term1963, term1963.getClass(), "jsType", null);
        setField(term1963, term1963.getClass(), "parent", null);
        setField(term1946, term1946.getClass(), "first", term1963);
        setIntField(term1966, term1966.getClass(), "type", 0);
        setField(term1966, term1966.getClass(), "next", null);
        setField(term1966, term1966.getClass(), "first", null);
        setField(term1966, term1966.getClass(), "last", null);
        setField(term1966, term1966.getClass(), "propListHead", null);
        setIntField(term1966, term1966.getClass(), "sourcePosition", 0);
        setField(term1966, term1966.getClass(), "jsType", null);
        setField(term1966, term1966.getClass(), "parent", null);
        setField(term1946, term1946.getClass(), "last", term1966);
        setField(term1969, term1969.getClass(), "next", null);
        setIntField(term1969, term1969.getClass(), "type", 0);
        setIntField(term1969, term1969.getClass(), "intValue", 0);
        setField(term1969, term1969.getClass(), "objectValue", null);
        setField(term1946, term1946.getClass(), "propListHead", term1969);
        setIntField(term1946, term1946.getClass(), "sourcePosition", -2093707412);
        setField(term1946, term1946.getClass(), "jsType", null);
        setField(term1946, term1946.getClass(), "parent", null);
        term14127 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14128 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14129 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14130 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14131 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14132 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term14133 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14134 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14135 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term14127, term14127.getClass(), "type", -1576584269);
        setIntField(term14128, term14128.getClass(), "type", 722787672);
        setIntField(term14129, term14129.getClass(), "type", 0);
        setField(term14129, term14129.getClass(), "next", null);
        setField(term14129, term14129.getClass(), "first", null);
        setField(term14129, term14129.getClass(), "last", null);
        setField(term14129, term14129.getClass(), "propListHead", null);
        setIntField(term14129, term14129.getClass(), "sourcePosition", 0);
        setField(term14129, term14129.getClass(), "jsType", null);
        setField(term14129, term14129.getClass(), "parent", null);
        setField(term14128, term14128.getClass(), "next", term14129);
        setIntField(term14130, term14130.getClass(), "type", 0);
        setField(term14130, term14130.getClass(), "next", null);
        setField(term14130, term14130.getClass(), "first", null);
        setField(term14130, term14130.getClass(), "last", null);
        setField(term14130, term14130.getClass(), "propListHead", null);
        setIntField(term14130, term14130.getClass(), "sourcePosition", 0);
        setField(term14130, term14130.getClass(), "jsType", null);
        setField(term14130, term14130.getClass(), "parent", null);
        setField(term14128, term14128.getClass(), "first", term14130);
        setIntField(term14131, term14131.getClass(), "type", 0);
        setField(term14131, term14131.getClass(), "next", null);
        setField(term14131, term14131.getClass(), "first", null);
        setField(term14131, term14131.getClass(), "last", null);
        setField(term14131, term14131.getClass(), "propListHead", null);
        setIntField(term14131, term14131.getClass(), "sourcePosition", 0);
        setField(term14131, term14131.getClass(), "jsType", null);
        setField(term14131, term14131.getClass(), "parent", null);
        setField(term14128, term14128.getClass(), "last", term14131);
        setField(term14132, term14132.getClass(), "next", null);
        setIntField(term14132, term14132.getClass(), "type", 0);
        setIntField(term14132, term14132.getClass(), "intValue", 0);
        setField(term14132, term14132.getClass(), "objectValue", null);
        setField(term14128, term14128.getClass(), "propListHead", term14132);
        setIntField(term14128, term14128.getClass(), "sourcePosition", 47118909);
        setField(term14128, term14128.getClass(), "jsType", null);
        setField(term14128, term14128.getClass(), "parent", null);
        setField(term14127, term14127.getClass(), "next", term14128);
        setIntField(term14133, term14133.getClass(), "type", 0);
        setField(term14133, term14133.getClass(), "next", null);
        setField(term14133, term14133.getClass(), "first", null);
        setField(term14133, term14133.getClass(), "last", null);
        setField(term14133, term14133.getClass(), "propListHead", null);
        setIntField(term14133, term14133.getClass(), "sourcePosition", 0);
        setField(term14133, term14133.getClass(), "jsType", null);
        setField(term14133, term14133.getClass(), "parent", null);
        setField(term14127, term14127.getClass(), "first", term14133);
        setIntField(term14134, term14134.getClass(), "type", 0);
        setField(term14134, term14134.getClass(), "next", null);
        setField(term14134, term14134.getClass(), "first", null);
        setField(term14134, term14134.getClass(), "last", null);
        setField(term14134, term14134.getClass(), "propListHead", null);
        setIntField(term14134, term14134.getClass(), "sourcePosition", 0);
        setField(term14134, term14134.getClass(), "jsType", null);
        setField(term14134, term14134.getClass(), "parent", null);
        setField(term14127, term14127.getClass(), "last", term14134);
        setField(term14135, term14135.getClass(), "next", null);
        setIntField(term14135, term14135.getClass(), "type", 0);
        setIntField(term14135, term14135.getClass(), "intValue", 0);
        setField(term14135, term14135.getClass(), "objectValue", null);
        setField(term14127, term14127.getClass(), "propListHead", term14135);
        setIntField(term14127, term14127.getClass(), "sourcePosition", -2093707412);
        setField(term14127, term14127.getClass(), "jsType", null);
        setField(term14127, term14127.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1946;
        Object retValue = callMethod(klass, "isLabelName", argTypes, null, args);
        assertTrue(recursiveEquals(term1946, term14127));
        assertTrue(recursiveEquals(retValue, false));
    }

};


