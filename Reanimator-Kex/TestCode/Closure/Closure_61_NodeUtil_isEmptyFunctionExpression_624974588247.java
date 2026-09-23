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

public class NodeUtil_isEmptyFunctionExpression_624974588247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1939;
     Object term14336;

    public NodeUtil_isEmptyFunctionExpression_624974588247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1939 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1941 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1943 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1946 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1949 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1953 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1956 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1939, term1939.getClass(), "type", 1615957955);
        setIntField(term1941, term1941.getClass(), "type", -252449812);
        setIntField(term1943, term1943.getClass(), "type", 0);
        setField(term1943, term1943.getClass(), "next", null);
        setField(term1943, term1943.getClass(), "first", null);
        setField(term1943, term1943.getClass(), "last", null);
        setField(term1943, term1943.getClass(), "propListHead", null);
        setIntField(term1943, term1943.getClass(), "sourcePosition", 0);
        setField(term1943, term1943.getClass(), "jsType", null);
        setField(term1943, term1943.getClass(), "parent", null);
        setField(term1941, term1941.getClass(), "next", term1943);
        setIntField(term1946, term1946.getClass(), "type", 0);
        setField(term1946, term1946.getClass(), "next", null);
        setField(term1946, term1946.getClass(), "first", null);
        setField(term1946, term1946.getClass(), "last", null);
        setField(term1946, term1946.getClass(), "propListHead", null);
        setIntField(term1946, term1946.getClass(), "sourcePosition", 0);
        setField(term1946, term1946.getClass(), "jsType", null);
        setField(term1946, term1946.getClass(), "parent", null);
        setField(term1941, term1941.getClass(), "first", term1946);
        setIntField(term1949, term1949.getClass(), "type", 0);
        setField(term1949, term1949.getClass(), "next", null);
        setField(term1949, term1949.getClass(), "first", null);
        setField(term1949, term1949.getClass(), "last", null);
        setField(term1949, term1949.getClass(), "propListHead", null);
        setIntField(term1949, term1949.getClass(), "sourcePosition", 0);
        setField(term1949, term1949.getClass(), "jsType", null);
        setField(term1949, term1949.getClass(), "parent", null);
        setField(term1941, term1941.getClass(), "last", term1949);
        setField(term1941, term1941.getClass(), "propListHead", null);
        setIntField(term1941, term1941.getClass(), "sourcePosition", 0);
        setField(term1941, term1941.getClass(), "jsType", null);
        setField(term1941, term1941.getClass(), "parent", null);
        setField(term1939, term1939.getClass(), "next", term1941);
        setIntField(term1953, term1953.getClass(), "type", 0);
        setField(term1953, term1953.getClass(), "next", null);
        setField(term1953, term1953.getClass(), "first", null);
        setField(term1953, term1953.getClass(), "last", null);
        setField(term1953, term1953.getClass(), "propListHead", null);
        setIntField(term1953, term1953.getClass(), "sourcePosition", 0);
        setField(term1953, term1953.getClass(), "jsType", null);
        setField(term1953, term1953.getClass(), "parent", null);
        setField(term1939, term1939.getClass(), "first", term1953);
        setIntField(term1956, term1956.getClass(), "type", 0);
        setField(term1956, term1956.getClass(), "next", null);
        setField(term1956, term1956.getClass(), "first", null);
        setField(term1956, term1956.getClass(), "last", null);
        setField(term1956, term1956.getClass(), "propListHead", null);
        setIntField(term1956, term1956.getClass(), "sourcePosition", 0);
        setField(term1956, term1956.getClass(), "jsType", null);
        setField(term1956, term1956.getClass(), "parent", null);
        setField(term1939, term1939.getClass(), "last", term1956);
        setField(term1939, term1939.getClass(), "propListHead", null);
        setIntField(term1939, term1939.getClass(), "sourcePosition", 0);
        setField(term1939, term1939.getClass(), "jsType", null);
        setField(term1939, term1939.getClass(), "parent", null);
        term14336 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14337 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14338 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14339 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14340 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14341 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14342 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14336, term14336.getClass(), "type", 1615957955);
        setIntField(term14337, term14337.getClass(), "type", -252449812);
        setIntField(term14338, term14338.getClass(), "type", 0);
        setField(term14338, term14338.getClass(), "next", null);
        setField(term14338, term14338.getClass(), "first", null);
        setField(term14338, term14338.getClass(), "last", null);
        setField(term14338, term14338.getClass(), "propListHead", null);
        setIntField(term14338, term14338.getClass(), "sourcePosition", 0);
        setField(term14338, term14338.getClass(), "jsType", null);
        setField(term14338, term14338.getClass(), "parent", null);
        setField(term14337, term14337.getClass(), "next", term14338);
        setIntField(term14339, term14339.getClass(), "type", 0);
        setField(term14339, term14339.getClass(), "next", null);
        setField(term14339, term14339.getClass(), "first", null);
        setField(term14339, term14339.getClass(), "last", null);
        setField(term14339, term14339.getClass(), "propListHead", null);
        setIntField(term14339, term14339.getClass(), "sourcePosition", 0);
        setField(term14339, term14339.getClass(), "jsType", null);
        setField(term14339, term14339.getClass(), "parent", null);
        setField(term14337, term14337.getClass(), "first", term14339);
        setIntField(term14340, term14340.getClass(), "type", 0);
        setField(term14340, term14340.getClass(), "next", null);
        setField(term14340, term14340.getClass(), "first", null);
        setField(term14340, term14340.getClass(), "last", null);
        setField(term14340, term14340.getClass(), "propListHead", null);
        setIntField(term14340, term14340.getClass(), "sourcePosition", 0);
        setField(term14340, term14340.getClass(), "jsType", null);
        setField(term14340, term14340.getClass(), "parent", null);
        setField(term14337, term14337.getClass(), "last", term14340);
        setField(term14337, term14337.getClass(), "propListHead", null);
        setIntField(term14337, term14337.getClass(), "sourcePosition", 0);
        setField(term14337, term14337.getClass(), "jsType", null);
        setField(term14337, term14337.getClass(), "parent", null);
        setField(term14336, term14336.getClass(), "next", term14337);
        setIntField(term14341, term14341.getClass(), "type", 0);
        setField(term14341, term14341.getClass(), "next", null);
        setField(term14341, term14341.getClass(), "first", null);
        setField(term14341, term14341.getClass(), "last", null);
        setField(term14341, term14341.getClass(), "propListHead", null);
        setIntField(term14341, term14341.getClass(), "sourcePosition", 0);
        setField(term14341, term14341.getClass(), "jsType", null);
        setField(term14341, term14341.getClass(), "parent", null);
        setField(term14336, term14336.getClass(), "first", term14341);
        setIntField(term14342, term14342.getClass(), "type", 0);
        setField(term14342, term14342.getClass(), "next", null);
        setField(term14342, term14342.getClass(), "first", null);
        setField(term14342, term14342.getClass(), "last", null);
        setField(term14342, term14342.getClass(), "propListHead", null);
        setIntField(term14342, term14342.getClass(), "sourcePosition", 0);
        setField(term14342, term14342.getClass(), "jsType", null);
        setField(term14342, term14342.getClass(), "parent", null);
        setField(term14336, term14336.getClass(), "last", term14342);
        setField(term14336, term14336.getClass(), "propListHead", null);
        setIntField(term14336, term14336.getClass(), "sourcePosition", 0);
        setField(term14336, term14336.getClass(), "jsType", null);
        setField(term14336, term14336.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1939;
        Object retValue = callMethod(klass, "isEmptyFunctionExpression", argTypes, null, args);
        assertTrue(recursiveEquals(term1939, term14336));
        assertTrue(recursiveEquals(retValue, false));
    }

};


