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

public class NodeUtil_isTryCatchNodeContainer_1030956546241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1952;

    public NodeUtil_isTryCatchNodeContainer_1030956546241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1952 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1954 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1956 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1958 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1960 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1963 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1967 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1969 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1974 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1952, term1952.getClass(), "type", 924127883);
        setIntField(term1954, term1954.getClass(), "type", -751079123);
        setIntField(term1956, term1956.getClass(), "type", -110837188);
        setIntField(term1958, term1958.getClass(), "type", -271094506);
        setIntField(term1960, term1960.getClass(), "type", 455632030);
        setField(term1960, term1960.getClass(), "next", null);
        setField(term1960, term1960.getClass(), "first", null);
        setField(term1960, term1960.getClass(), "last", null);
        setField(term1960, term1960.getClass(), "propListHead", null);
        setIntField(term1960, term1960.getClass(), "sourcePosition", 0);
        setField(term1960, term1960.getClass(), "jsType", null);
        setField(term1960, term1960.getClass(), "parent", null);
        setField(term1958, term1958.getClass(), "next", term1960);
        setIntField(term1963, term1963.getClass(), "type", -1632929393);
        setField(term1963, term1963.getClass(), "next", null);
        setField(term1963, term1963.getClass(), "first", null);
        setField(term1963, term1963.getClass(), "last", term1960);
        setField(term1963, term1963.getClass(), "propListHead", null);
        setIntField(term1963, term1963.getClass(), "sourcePosition", 0);
        setField(term1963, term1963.getClass(), "jsType", null);
        setField(term1963, term1963.getClass(), "parent", null);
        setField(term1958, term1958.getClass(), "first", term1963);
        setField(term1958, term1958.getClass(), "last", term1956);
        setField(term1958, term1958.getClass(), "propListHead", null);
        setIntField(term1958, term1958.getClass(), "sourcePosition", 0);
        setField(term1958, term1958.getClass(), "jsType", null);
        setField(term1958, term1958.getClass(), "parent", null);
        setField(term1956, term1956.getClass(), "next", term1958);
        setField(term1956, term1956.getClass(), "first", term1960);
        setIntField(term1967, term1967.getClass(), "type", -763576148);
        setIntField(term1969, term1969.getClass(), "type", 1568948514);
        setField(term1969, term1969.getClass(), "next", null);
        setField(term1969, term1969.getClass(), "first", term1963);
        setField(term1969, term1969.getClass(), "last", term1958);
        setField(term1969, term1969.getClass(), "propListHead", null);
        setIntField(term1969, term1969.getClass(), "sourcePosition", 0);
        setField(term1969, term1969.getClass(), "jsType", null);
        setField(term1969, term1969.getClass(), "parent", null);
        setField(term1967, term1967.getClass(), "next", term1969);
        setField(term1967, term1967.getClass(), "first", term1954);
        setField(term1967, term1967.getClass(), "last", term1954);
        setField(term1967, term1967.getClass(), "propListHead", null);
        setIntField(term1967, term1967.getClass(), "sourcePosition", 0);
        setField(term1967, term1967.getClass(), "jsType", null);
        setField(term1967, term1967.getClass(), "parent", null);
        setField(term1956, term1956.getClass(), "last", term1967);
        setField(term1956, term1956.getClass(), "propListHead", null);
        setIntField(term1956, term1956.getClass(), "sourcePosition", 0);
        setField(term1956, term1956.getClass(), "jsType", null);
        setField(term1956, term1956.getClass(), "parent", null);
        setField(term1954, term1954.getClass(), "next", term1956);
        setIntField(term1974, term1974.getClass(), "type", -1511130237);
        setField(term1974, term1974.getClass(), "next", term1967);
        setField(term1974, term1974.getClass(), "first", term1969);
        setField(term1974, term1974.getClass(), "last", term1952);
        setField(term1974, term1974.getClass(), "propListHead", null);
        setIntField(term1974, term1974.getClass(), "sourcePosition", 0);
        setField(term1974, term1974.getClass(), "jsType", null);
        setField(term1974, term1974.getClass(), "parent", null);
        setField(term1954, term1954.getClass(), "first", term1974);
        setField(term1954, term1954.getClass(), "last", term1974);
        setField(term1954, term1954.getClass(), "propListHead", null);
        setIntField(term1954, term1954.getClass(), "sourcePosition", 0);
        setField(term1954, term1954.getClass(), "jsType", null);
        setField(term1954, term1954.getClass(), "parent", null);
        setField(term1952, term1952.getClass(), "next", term1954);
        setField(term1952, term1952.getClass(), "first", term1958);
        setField(term1952, term1952.getClass(), "last", term1960);
        setField(term1952, term1952.getClass(), "propListHead", null);
        setIntField(term1952, term1952.getClass(), "sourcePosition", 0);
        setField(term1952, term1952.getClass(), "jsType", null);
        setField(term1952, term1952.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1952;
        try {
            callMethod(klass, "isTryCatchNodeContainer", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


