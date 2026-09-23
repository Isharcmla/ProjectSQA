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

public class CheckAccessControls_isValidPrivateConstructorAccess_175164999837 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2044;
     Object term6952;

    public CheckAccessControls_isValidPrivateConstructorAccess_175164999837() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2044 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2046 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2048 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2051 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2054 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2057 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2061 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2064 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2067 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2044, term2044.getClass(), "type", 1774507971);
        setIntField(term2046, term2046.getClass(), "type", 1209799204);
        setIntField(term2048, term2048.getClass(), "type", 0);
        setField(term2048, term2048.getClass(), "next", null);
        setField(term2048, term2048.getClass(), "first", null);
        setField(term2048, term2048.getClass(), "last", null);
        setField(term2048, term2048.getClass(), "propListHead", null);
        setIntField(term2048, term2048.getClass(), "sourcePosition", 0);
        setField(term2048, term2048.getClass(), "jsType", null);
        setField(term2048, term2048.getClass(), "parent", null);
        setField(term2046, term2046.getClass(), "next", term2048);
        setIntField(term2051, term2051.getClass(), "type", 0);
        setField(term2051, term2051.getClass(), "next", null);
        setField(term2051, term2051.getClass(), "first", null);
        setField(term2051, term2051.getClass(), "last", null);
        setField(term2051, term2051.getClass(), "propListHead", null);
        setIntField(term2051, term2051.getClass(), "sourcePosition", 0);
        setField(term2051, term2051.getClass(), "jsType", null);
        setField(term2051, term2051.getClass(), "parent", null);
        setField(term2046, term2046.getClass(), "first", term2051);
        setIntField(term2054, term2054.getClass(), "type", 0);
        setField(term2054, term2054.getClass(), "next", null);
        setField(term2054, term2054.getClass(), "first", null);
        setField(term2054, term2054.getClass(), "last", null);
        setField(term2054, term2054.getClass(), "propListHead", null);
        setIntField(term2054, term2054.getClass(), "sourcePosition", 0);
        setField(term2054, term2054.getClass(), "jsType", null);
        setField(term2054, term2054.getClass(), "parent", null);
        setField(term2046, term2046.getClass(), "last", term2054);
        setField(term2057, term2057.getClass(), "next", null);
        setIntField(term2057, term2057.getClass(), "type", 0);
        setIntField(term2057, term2057.getClass(), "intValue", 0);
        setField(term2057, term2057.getClass(), "objectValue", null);
        setField(term2046, term2046.getClass(), "propListHead", term2057);
        setIntField(term2046, term2046.getClass(), "sourcePosition", -18216811);
        setField(term2046, term2046.getClass(), "jsType", null);
        setField(term2046, term2046.getClass(), "parent", null);
        setField(term2044, term2044.getClass(), "next", term2046);
        setIntField(term2061, term2061.getClass(), "type", 0);
        setField(term2061, term2061.getClass(), "next", null);
        setField(term2061, term2061.getClass(), "first", null);
        setField(term2061, term2061.getClass(), "last", null);
        setField(term2061, term2061.getClass(), "propListHead", null);
        setIntField(term2061, term2061.getClass(), "sourcePosition", 0);
        setField(term2061, term2061.getClass(), "jsType", null);
        setField(term2061, term2061.getClass(), "parent", null);
        setField(term2044, term2044.getClass(), "first", term2061);
        setIntField(term2064, term2064.getClass(), "type", 0);
        setField(term2064, term2064.getClass(), "next", null);
        setField(term2064, term2064.getClass(), "first", null);
        setField(term2064, term2064.getClass(), "last", null);
        setField(term2064, term2064.getClass(), "propListHead", null);
        setIntField(term2064, term2064.getClass(), "sourcePosition", 0);
        setField(term2064, term2064.getClass(), "jsType", null);
        setField(term2064, term2064.getClass(), "parent", null);
        setField(term2044, term2044.getClass(), "last", term2064);
        setField(term2067, term2067.getClass(), "next", null);
        setIntField(term2067, term2067.getClass(), "type", 0);
        setIntField(term2067, term2067.getClass(), "intValue", 0);
        setField(term2067, term2067.getClass(), "objectValue", null);
        setField(term2044, term2044.getClass(), "propListHead", term2067);
        setIntField(term2044, term2044.getClass(), "sourcePosition", -1813280137);
        setField(term2044, term2044.getClass(), "jsType", null);
        setField(term2044, term2044.getClass(), "parent", null);
        term6952 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6953 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6954 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6955 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6956 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6957 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term6958 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6959 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6960 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term6952, term6952.getClass(), "type", 1774507971);
        setIntField(term6953, term6953.getClass(), "type", 1209799204);
        setIntField(term6954, term6954.getClass(), "type", 0);
        setField(term6954, term6954.getClass(), "next", null);
        setField(term6954, term6954.getClass(), "first", null);
        setField(term6954, term6954.getClass(), "last", null);
        setField(term6954, term6954.getClass(), "propListHead", null);
        setIntField(term6954, term6954.getClass(), "sourcePosition", 0);
        setField(term6954, term6954.getClass(), "jsType", null);
        setField(term6954, term6954.getClass(), "parent", null);
        setField(term6953, term6953.getClass(), "next", term6954);
        setIntField(term6955, term6955.getClass(), "type", 0);
        setField(term6955, term6955.getClass(), "next", null);
        setField(term6955, term6955.getClass(), "first", null);
        setField(term6955, term6955.getClass(), "last", null);
        setField(term6955, term6955.getClass(), "propListHead", null);
        setIntField(term6955, term6955.getClass(), "sourcePosition", 0);
        setField(term6955, term6955.getClass(), "jsType", null);
        setField(term6955, term6955.getClass(), "parent", null);
        setField(term6953, term6953.getClass(), "first", term6955);
        setIntField(term6956, term6956.getClass(), "type", 0);
        setField(term6956, term6956.getClass(), "next", null);
        setField(term6956, term6956.getClass(), "first", null);
        setField(term6956, term6956.getClass(), "last", null);
        setField(term6956, term6956.getClass(), "propListHead", null);
        setIntField(term6956, term6956.getClass(), "sourcePosition", 0);
        setField(term6956, term6956.getClass(), "jsType", null);
        setField(term6956, term6956.getClass(), "parent", null);
        setField(term6953, term6953.getClass(), "last", term6956);
        setField(term6957, term6957.getClass(), "next", null);
        setIntField(term6957, term6957.getClass(), "type", 0);
        setIntField(term6957, term6957.getClass(), "intValue", 0);
        setField(term6957, term6957.getClass(), "objectValue", null);
        setField(term6953, term6953.getClass(), "propListHead", term6957);
        setIntField(term6953, term6953.getClass(), "sourcePosition", -18216811);
        setField(term6953, term6953.getClass(), "jsType", null);
        setField(term6953, term6953.getClass(), "parent", null);
        setField(term6952, term6952.getClass(), "next", term6953);
        setIntField(term6958, term6958.getClass(), "type", 0);
        setField(term6958, term6958.getClass(), "next", null);
        setField(term6958, term6958.getClass(), "first", null);
        setField(term6958, term6958.getClass(), "last", null);
        setField(term6958, term6958.getClass(), "propListHead", null);
        setIntField(term6958, term6958.getClass(), "sourcePosition", 0);
        setField(term6958, term6958.getClass(), "jsType", null);
        setField(term6958, term6958.getClass(), "parent", null);
        setField(term6952, term6952.getClass(), "first", term6958);
        setIntField(term6959, term6959.getClass(), "type", 0);
        setField(term6959, term6959.getClass(), "next", null);
        setField(term6959, term6959.getClass(), "first", null);
        setField(term6959, term6959.getClass(), "last", null);
        setField(term6959, term6959.getClass(), "propListHead", null);
        setIntField(term6959, term6959.getClass(), "sourcePosition", 0);
        setField(term6959, term6959.getClass(), "jsType", null);
        setField(term6959, term6959.getClass(), "parent", null);
        setField(term6952, term6952.getClass(), "last", term6959);
        setField(term6960, term6960.getClass(), "next", null);
        setIntField(term6960, term6960.getClass(), "type", 0);
        setIntField(term6960, term6960.getClass(), "intValue", 0);
        setField(term6960, term6960.getClass(), "objectValue", null);
        setField(term6952, term6952.getClass(), "propListHead", term6960);
        setIntField(term6952, term6952.getClass(), "sourcePosition", -1813280137);
        setField(term6952, term6952.getClass(), "jsType", null);
        setField(term6952, term6952.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2044;
        Object retValue = callMethod(klass, "isValidPrivateConstructorAccess", argTypes, null, args);
        assertTrue(recursiveEquals(term2044, term6952));
        assertTrue(recursiveEquals(retValue, true));
    }

};


