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

public class NodeUtil_isReferenceName_334258165227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1946;
     Object term13782;

    public NodeUtil_isReferenceName_334258165227() {
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
        term13782 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13783 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13784 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13785 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13786 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13787 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term13788 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13789 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13790 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term13782, term13782.getClass(), "type", -1576584269);
        setIntField(term13783, term13783.getClass(), "type", 722787672);
        setIntField(term13784, term13784.getClass(), "type", 0);
        setField(term13784, term13784.getClass(), "next", null);
        setField(term13784, term13784.getClass(), "first", null);
        setField(term13784, term13784.getClass(), "last", null);
        setField(term13784, term13784.getClass(), "propListHead", null);
        setIntField(term13784, term13784.getClass(), "sourcePosition", 0);
        setField(term13784, term13784.getClass(), "jsType", null);
        setField(term13784, term13784.getClass(), "parent", null);
        setField(term13783, term13783.getClass(), "next", term13784);
        setIntField(term13785, term13785.getClass(), "type", 0);
        setField(term13785, term13785.getClass(), "next", null);
        setField(term13785, term13785.getClass(), "first", null);
        setField(term13785, term13785.getClass(), "last", null);
        setField(term13785, term13785.getClass(), "propListHead", null);
        setIntField(term13785, term13785.getClass(), "sourcePosition", 0);
        setField(term13785, term13785.getClass(), "jsType", null);
        setField(term13785, term13785.getClass(), "parent", null);
        setField(term13783, term13783.getClass(), "first", term13785);
        setIntField(term13786, term13786.getClass(), "type", 0);
        setField(term13786, term13786.getClass(), "next", null);
        setField(term13786, term13786.getClass(), "first", null);
        setField(term13786, term13786.getClass(), "last", null);
        setField(term13786, term13786.getClass(), "propListHead", null);
        setIntField(term13786, term13786.getClass(), "sourcePosition", 0);
        setField(term13786, term13786.getClass(), "jsType", null);
        setField(term13786, term13786.getClass(), "parent", null);
        setField(term13783, term13783.getClass(), "last", term13786);
        setField(term13787, term13787.getClass(), "next", null);
        setIntField(term13787, term13787.getClass(), "type", 0);
        setIntField(term13787, term13787.getClass(), "intValue", 0);
        setField(term13787, term13787.getClass(), "objectValue", null);
        setField(term13783, term13783.getClass(), "propListHead", term13787);
        setIntField(term13783, term13783.getClass(), "sourcePosition", 47118909);
        setField(term13783, term13783.getClass(), "jsType", null);
        setField(term13783, term13783.getClass(), "parent", null);
        setField(term13782, term13782.getClass(), "next", term13783);
        setIntField(term13788, term13788.getClass(), "type", 0);
        setField(term13788, term13788.getClass(), "next", null);
        setField(term13788, term13788.getClass(), "first", null);
        setField(term13788, term13788.getClass(), "last", null);
        setField(term13788, term13788.getClass(), "propListHead", null);
        setIntField(term13788, term13788.getClass(), "sourcePosition", 0);
        setField(term13788, term13788.getClass(), "jsType", null);
        setField(term13788, term13788.getClass(), "parent", null);
        setField(term13782, term13782.getClass(), "first", term13788);
        setIntField(term13789, term13789.getClass(), "type", 0);
        setField(term13789, term13789.getClass(), "next", null);
        setField(term13789, term13789.getClass(), "first", null);
        setField(term13789, term13789.getClass(), "last", null);
        setField(term13789, term13789.getClass(), "propListHead", null);
        setIntField(term13789, term13789.getClass(), "sourcePosition", 0);
        setField(term13789, term13789.getClass(), "jsType", null);
        setField(term13789, term13789.getClass(), "parent", null);
        setField(term13782, term13782.getClass(), "last", term13789);
        setField(term13790, term13790.getClass(), "next", null);
        setIntField(term13790, term13790.getClass(), "type", 0);
        setIntField(term13790, term13790.getClass(), "intValue", 0);
        setField(term13790, term13790.getClass(), "objectValue", null);
        setField(term13782, term13782.getClass(), "propListHead", term13790);
        setIntField(term13782, term13782.getClass(), "sourcePosition", -2093707412);
        setField(term13782, term13782.getClass(), "jsType", null);
        setField(term13782, term13782.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1946;
        Object retValue = callMethod(klass, "isReferenceName", argTypes, null, args);
        assertTrue(recursiveEquals(term1946, term13782));
        assertTrue(recursiveEquals(retValue, false));
    }

};


