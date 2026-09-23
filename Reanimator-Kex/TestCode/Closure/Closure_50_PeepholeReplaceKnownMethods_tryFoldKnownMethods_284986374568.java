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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374568 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3528694;
     Object term3528786;
     Object term3529738;
     Object term3529739;
     Object term3529549;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374568() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3528694 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3528786 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3528878 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3528970 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3529062 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3529192 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3528878, term3528878.getClass(), "type", 35);
        setIntField(term3529062, term3529062.getClass(), "type", 40);
        setField(term3529062, term3529062.getClass(), "str", "");
        setField(term3528970, term3528970.getClass(), "next", term3529062);
        setIntField(term3528970, term3528970.getClass(), "type", 40);
        setField(term3528878, term3528878.getClass(), "first", term3528970);
        setIntField(term3529192, term3529192.getClass(), "type", 40);
        setField(term3528878, term3528878.getClass(), "next", term3529192);
        setField(term3528786, term3528786.getClass(), "first", term3528878);
        setIntField(term3528786, term3528786.getClass(), "type", 37);
        term3529738 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3529738, term3529738.getClass(), "currentTraversal", null);
        term3529739 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3529740 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3529741 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3529742 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3529743 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3529739, term3529739.getClass(), "str", null);
        setIntField(term3529739, term3529739.getClass(), "type", 37);
        setField(term3529739, term3529739.getClass(), "next", null);
        setField(term3529740, term3529740.getClass(), "str", null);
        setIntField(term3529740, term3529740.getClass(), "type", 35);
        setField(term3529741, term3529741.getClass(), "str", null);
        setIntField(term3529741, term3529741.getClass(), "type", 40);
        setField(term3529741, term3529741.getClass(), "next", null);
        setField(term3529741, term3529741.getClass(), "first", null);
        setField(term3529741, term3529741.getClass(), "last", null);
        setField(term3529741, term3529741.getClass(), "propListHead", null);
        setIntField(term3529741, term3529741.getClass(), "sourcePosition", 0);
        setField(term3529741, term3529741.getClass(), "jsType", null);
        setField(term3529741, term3529741.getClass(), "parent", null);
        setField(term3529740, term3529740.getClass(), "next", term3529741);
        setField(term3529742, term3529742.getClass(), "str", null);
        setIntField(term3529742, term3529742.getClass(), "type", 40);
        setField(term3529743, term3529743.getClass(), "str", "");
        setIntField(term3529743, term3529743.getClass(), "type", 40);
        setField(term3529743, term3529743.getClass(), "next", null);
        setField(term3529743, term3529743.getClass(), "first", null);
        setField(term3529743, term3529743.getClass(), "last", null);
        setField(term3529743, term3529743.getClass(), "propListHead", null);
        setIntField(term3529743, term3529743.getClass(), "sourcePosition", 0);
        setField(term3529743, term3529743.getClass(), "jsType", null);
        setField(term3529743, term3529743.getClass(), "parent", null);
        setField(term3529742, term3529742.getClass(), "next", term3529743);
        setField(term3529742, term3529742.getClass(), "first", null);
        setField(term3529742, term3529742.getClass(), "last", null);
        setField(term3529742, term3529742.getClass(), "propListHead", null);
        setIntField(term3529742, term3529742.getClass(), "sourcePosition", 0);
        setField(term3529742, term3529742.getClass(), "jsType", null);
        setField(term3529742, term3529742.getClass(), "parent", null);
        setField(term3529740, term3529740.getClass(), "first", term3529742);
        setField(term3529740, term3529740.getClass(), "last", null);
        setField(term3529740, term3529740.getClass(), "propListHead", null);
        setIntField(term3529740, term3529740.getClass(), "sourcePosition", 0);
        setField(term3529740, term3529740.getClass(), "jsType", null);
        setField(term3529740, term3529740.getClass(), "parent", null);
        setField(term3529739, term3529739.getClass(), "first", term3529740);
        setField(term3529739, term3529739.getClass(), "last", null);
        setField(term3529739, term3529739.getClass(), "propListHead", null);
        setIntField(term3529739, term3529739.getClass(), "sourcePosition", 0);
        setField(term3529739, term3529739.getClass(), "jsType", null);
        setField(term3529739, term3529739.getClass(), "parent", null);
        term3529549 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3529551 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3529553 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3529556 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3529558 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3529549, term3529549.getClass(), "str", null);
        setIntField(term3529549, term3529549.getClass(), "type", 37);
        setField(term3529549, term3529549.getClass(), "next", null);
        setField(term3529551, term3529551.getClass(), "str", null);
        setIntField(term3529551, term3529551.getClass(), "type", 35);
        setField(term3529553, term3529553.getClass(), "str", null);
        setIntField(term3529553, term3529553.getClass(), "type", 40);
        setField(term3529553, term3529553.getClass(), "next", null);
        setField(term3529553, term3529553.getClass(), "first", null);
        setField(term3529553, term3529553.getClass(), "last", null);
        setField(term3529553, term3529553.getClass(), "propListHead", null);
        setIntField(term3529553, term3529553.getClass(), "sourcePosition", 0);
        setField(term3529553, term3529553.getClass(), "jsType", null);
        setField(term3529553, term3529553.getClass(), "parent", null);
        setField(term3529551, term3529551.getClass(), "next", term3529553);
        setField(term3529556, term3529556.getClass(), "str", null);
        setIntField(term3529556, term3529556.getClass(), "type", 40);
        setField(term3529558, term3529558.getClass(), "str", "");
        setIntField(term3529558, term3529558.getClass(), "type", 40);
        setField(term3529558, term3529558.getClass(), "next", null);
        setField(term3529558, term3529558.getClass(), "first", null);
        setField(term3529558, term3529558.getClass(), "last", null);
        setField(term3529558, term3529558.getClass(), "propListHead", null);
        setIntField(term3529558, term3529558.getClass(), "sourcePosition", 0);
        setField(term3529558, term3529558.getClass(), "jsType", null);
        setField(term3529558, term3529558.getClass(), "parent", null);
        setField(term3529556, term3529556.getClass(), "next", term3529558);
        setField(term3529556, term3529556.getClass(), "first", null);
        setField(term3529556, term3529556.getClass(), "last", null);
        setField(term3529556, term3529556.getClass(), "propListHead", null);
        setIntField(term3529556, term3529556.getClass(), "sourcePosition", 0);
        setField(term3529556, term3529556.getClass(), "jsType", null);
        setField(term3529556, term3529556.getClass(), "parent", null);
        setField(term3529551, term3529551.getClass(), "first", term3529556);
        setField(term3529551, term3529551.getClass(), "last", null);
        setField(term3529551, term3529551.getClass(), "propListHead", null);
        setIntField(term3529551, term3529551.getClass(), "sourcePosition", 0);
        setField(term3529551, term3529551.getClass(), "jsType", null);
        setField(term3529551, term3529551.getClass(), "parent", null);
        setField(term3529549, term3529549.getClass(), "first", term3529551);
        setField(term3529549, term3529549.getClass(), "last", null);
        setField(term3529549, term3529549.getClass(), "propListHead", null);
        setIntField(term3529549, term3529549.getClass(), "sourcePosition", 0);
        setField(term3529549, term3529549.getClass(), "jsType", null);
        setField(term3529549, term3529549.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3528786;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3528694, args);
        assertTrue(recursiveEquals(term3528694, term3529738));
        assertTrue(recursiveEquals(term3528786, term3529739));
        assertTrue(recursiveEquals(retValue, term3529549));
    }

};


