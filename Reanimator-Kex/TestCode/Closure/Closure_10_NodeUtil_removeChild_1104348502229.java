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

public class NodeUtil_removeChild_1104348502229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1923;
     Object term1950;

    public NodeUtil_removeChild_1104348502229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1923 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1925 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1927 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1929 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1931 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1934 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1938 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1940 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1945 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1923, term1923.getClass(), "type", -1677599962);
        setIntField(term1925, term1925.getClass(), "type", -1790275458);
        setIntField(term1927, term1927.getClass(), "type", -497534255);
        setIntField(term1929, term1929.getClass(), "type", 1588942911);
        setIntField(term1931, term1931.getClass(), "type", -2129828854);
        setField(term1931, term1931.getClass(), "next", null);
        setField(term1931, term1931.getClass(), "first", null);
        setField(term1931, term1931.getClass(), "last", null);
        setField(term1931, term1931.getClass(), "propListHead", null);
        setIntField(term1931, term1931.getClass(), "sourcePosition", 0);
        setField(term1931, term1931.getClass(), "jsType", null);
        setField(term1931, term1931.getClass(), "parent", null);
        setField(term1929, term1929.getClass(), "next", term1931);
        setIntField(term1934, term1934.getClass(), "type", -47438786);
        setField(term1934, term1934.getClass(), "next", null);
        setField(term1934, term1934.getClass(), "first", null);
        setField(term1934, term1934.getClass(), "last", term1931);
        setField(term1934, term1934.getClass(), "propListHead", null);
        setIntField(term1934, term1934.getClass(), "sourcePosition", 0);
        setField(term1934, term1934.getClass(), "jsType", null);
        setField(term1934, term1934.getClass(), "parent", null);
        setField(term1929, term1929.getClass(), "first", term1934);
        setField(term1929, term1929.getClass(), "last", term1927);
        setField(term1929, term1929.getClass(), "propListHead", null);
        setIntField(term1929, term1929.getClass(), "sourcePosition", 0);
        setField(term1929, term1929.getClass(), "jsType", null);
        setField(term1929, term1929.getClass(), "parent", null);
        setField(term1927, term1927.getClass(), "next", term1929);
        setField(term1927, term1927.getClass(), "first", term1931);
        setIntField(term1938, term1938.getClass(), "type", 626179200);
        setIntField(term1940, term1940.getClass(), "type", -511077684);
        setField(term1940, term1940.getClass(), "next", null);
        setField(term1940, term1940.getClass(), "first", term1934);
        setField(term1940, term1940.getClass(), "last", term1929);
        setField(term1940, term1940.getClass(), "propListHead", null);
        setIntField(term1940, term1940.getClass(), "sourcePosition", 0);
        setField(term1940, term1940.getClass(), "jsType", null);
        setField(term1940, term1940.getClass(), "parent", null);
        setField(term1938, term1938.getClass(), "next", term1940);
        setField(term1938, term1938.getClass(), "first", term1925);
        setField(term1938, term1938.getClass(), "last", term1925);
        setField(term1938, term1938.getClass(), "propListHead", null);
        setIntField(term1938, term1938.getClass(), "sourcePosition", 0);
        setField(term1938, term1938.getClass(), "jsType", null);
        setField(term1938, term1938.getClass(), "parent", null);
        setField(term1927, term1927.getClass(), "last", term1938);
        setField(term1927, term1927.getClass(), "propListHead", null);
        setIntField(term1927, term1927.getClass(), "sourcePosition", 0);
        setField(term1927, term1927.getClass(), "jsType", null);
        setField(term1927, term1927.getClass(), "parent", null);
        setField(term1925, term1925.getClass(), "next", term1927);
        setIntField(term1945, term1945.getClass(), "type", -711507760);
        setField(term1945, term1945.getClass(), "next", term1938);
        setField(term1945, term1945.getClass(), "first", term1940);
        setField(term1945, term1945.getClass(), "last", term1923);
        setField(term1945, term1945.getClass(), "propListHead", null);
        setIntField(term1945, term1945.getClass(), "sourcePosition", 0);
        setField(term1945, term1945.getClass(), "jsType", null);
        setField(term1945, term1945.getClass(), "parent", null);
        setField(term1925, term1925.getClass(), "first", term1945);
        setField(term1925, term1925.getClass(), "last", term1945);
        setField(term1925, term1925.getClass(), "propListHead", null);
        setIntField(term1925, term1925.getClass(), "sourcePosition", 0);
        setField(term1925, term1925.getClass(), "jsType", null);
        setField(term1925, term1925.getClass(), "parent", null);
        setField(term1923, term1923.getClass(), "next", term1925);
        setField(term1923, term1923.getClass(), "first", term1929);
        setField(term1923, term1923.getClass(), "last", term1931);
        setField(term1923, term1923.getClass(), "propListHead", null);
        setIntField(term1923, term1923.getClass(), "sourcePosition", 0);
        setField(term1923, term1923.getClass(), "jsType", null);
        setField(term1923, term1923.getClass(), "parent", null);
        term1950 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1952 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1954 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1956 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1958 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1961 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1965 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1967 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1972 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1950, term1950.getClass(), "type", 1053773809);
        setIntField(term1952, term1952.getClass(), "type", 924127883);
        setIntField(term1954, term1954.getClass(), "type", -751079123);
        setIntField(term1956, term1956.getClass(), "type", -110837188);
        setIntField(term1958, term1958.getClass(), "type", -271094506);
        setField(term1958, term1958.getClass(), "next", null);
        setField(term1958, term1958.getClass(), "first", null);
        setField(term1958, term1958.getClass(), "last", null);
        setField(term1958, term1958.getClass(), "propListHead", null);
        setIntField(term1958, term1958.getClass(), "sourcePosition", 0);
        setField(term1958, term1958.getClass(), "jsType", null);
        setField(term1958, term1958.getClass(), "parent", null);
        setField(term1956, term1956.getClass(), "next", term1958);
        setIntField(term1961, term1961.getClass(), "type", 455632030);
        setField(term1961, term1961.getClass(), "next", null);
        setField(term1961, term1961.getClass(), "first", null);
        setField(term1961, term1961.getClass(), "last", term1958);
        setField(term1961, term1961.getClass(), "propListHead", null);
        setIntField(term1961, term1961.getClass(), "sourcePosition", 0);
        setField(term1961, term1961.getClass(), "jsType", null);
        setField(term1961, term1961.getClass(), "parent", null);
        setField(term1956, term1956.getClass(), "first", term1961);
        setField(term1956, term1956.getClass(), "last", term1954);
        setField(term1956, term1956.getClass(), "propListHead", null);
        setIntField(term1956, term1956.getClass(), "sourcePosition", 0);
        setField(term1956, term1956.getClass(), "jsType", null);
        setField(term1956, term1956.getClass(), "parent", null);
        setField(term1954, term1954.getClass(), "next", term1956);
        setField(term1954, term1954.getClass(), "first", term1958);
        setIntField(term1965, term1965.getClass(), "type", -431440129);
        setIntField(term1967, term1967.getClass(), "type", -763576148);
        setField(term1967, term1967.getClass(), "next", null);
        setField(term1967, term1967.getClass(), "first", term1961);
        setField(term1967, term1967.getClass(), "last", term1956);
        setField(term1967, term1967.getClass(), "propListHead", null);
        setIntField(term1967, term1967.getClass(), "sourcePosition", 0);
        setField(term1967, term1967.getClass(), "jsType", null);
        setField(term1967, term1967.getClass(), "parent", null);
        setField(term1965, term1965.getClass(), "next", term1967);
        setField(term1965, term1965.getClass(), "first", term1952);
        setField(term1965, term1965.getClass(), "last", term1952);
        setField(term1965, term1965.getClass(), "propListHead", null);
        setIntField(term1965, term1965.getClass(), "sourcePosition", 0);
        setField(term1965, term1965.getClass(), "jsType", null);
        setField(term1965, term1965.getClass(), "parent", null);
        setField(term1954, term1954.getClass(), "last", term1965);
        setField(term1954, term1954.getClass(), "propListHead", null);
        setIntField(term1954, term1954.getClass(), "sourcePosition", 0);
        setField(term1954, term1954.getClass(), "jsType", null);
        setField(term1954, term1954.getClass(), "parent", null);
        setField(term1952, term1952.getClass(), "next", term1954);
        setIntField(term1972, term1972.getClass(), "type", 1568948514);
        setField(term1972, term1972.getClass(), "next", term1965);
        setField(term1972, term1972.getClass(), "first", term1967);
        setField(term1972, term1972.getClass(), "last", term1950);
        setField(term1972, term1972.getClass(), "propListHead", null);
        setIntField(term1972, term1972.getClass(), "sourcePosition", 0);
        setField(term1972, term1972.getClass(), "jsType", null);
        setField(term1972, term1972.getClass(), "parent", null);
        setField(term1952, term1952.getClass(), "first", term1972);
        setField(term1952, term1952.getClass(), "last", term1972);
        setField(term1952, term1952.getClass(), "propListHead", null);
        setIntField(term1952, term1952.getClass(), "sourcePosition", 0);
        setField(term1952, term1952.getClass(), "jsType", null);
        setField(term1952, term1952.getClass(), "parent", null);
        setField(term1950, term1950.getClass(), "next", term1952);
        setField(term1950, term1950.getClass(), "first", term1956);
        setField(term1950, term1950.getClass(), "last", term1958);
        setField(term1950, term1950.getClass(), "propListHead", null);
        setIntField(term1950, term1950.getClass(), "sourcePosition", 0);
        setField(term1950, term1950.getClass(), "jsType", null);
        setField(term1950, term1950.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term1923;
        args[1] = term1950;
        try {
            callMethod(klass, "removeChild", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


