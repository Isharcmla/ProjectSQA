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

public class NodeUtil_isSimpleOperator_1940912183168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term397;
     Object term6983;

    public NodeUtil_isSimpleOperator_1940912183168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term397 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term399 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term401 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term404 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term407 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term410 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term414 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term417 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term420 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term397, term397.getClass(), "type", 158873461);
        setIntField(term399, term399.getClass(), "type", -1388471422);
        setIntField(term401, term401.getClass(), "type", 0);
        setField(term401, term401.getClass(), "next", null);
        setField(term401, term401.getClass(), "first", null);
        setField(term401, term401.getClass(), "last", null);
        setField(term401, term401.getClass(), "propListHead", null);
        setIntField(term401, term401.getClass(), "sourcePosition", 0);
        setField(term401, term401.getClass(), "jsType", null);
        setField(term401, term401.getClass(), "parent", null);
        setField(term399, term399.getClass(), "next", term401);
        setIntField(term404, term404.getClass(), "type", 0);
        setField(term404, term404.getClass(), "next", null);
        setField(term404, term404.getClass(), "first", null);
        setField(term404, term404.getClass(), "last", null);
        setField(term404, term404.getClass(), "propListHead", null);
        setIntField(term404, term404.getClass(), "sourcePosition", 0);
        setField(term404, term404.getClass(), "jsType", null);
        setField(term404, term404.getClass(), "parent", null);
        setField(term399, term399.getClass(), "first", term404);
        setIntField(term407, term407.getClass(), "type", 0);
        setField(term407, term407.getClass(), "next", null);
        setField(term407, term407.getClass(), "first", null);
        setField(term407, term407.getClass(), "last", null);
        setField(term407, term407.getClass(), "propListHead", null);
        setIntField(term407, term407.getClass(), "sourcePosition", 0);
        setField(term407, term407.getClass(), "jsType", null);
        setField(term407, term407.getClass(), "parent", null);
        setField(term399, term399.getClass(), "last", term407);
        setField(term410, term410.getClass(), "next", null);
        setIntField(term410, term410.getClass(), "type", 0);
        setIntField(term410, term410.getClass(), "intValue", 0);
        setField(term410, term410.getClass(), "objectValue", null);
        setField(term399, term399.getClass(), "propListHead", term410);
        setIntField(term399, term399.getClass(), "sourcePosition", 1598895173);
        setField(term399, term399.getClass(), "jsType", null);
        setField(term399, term399.getClass(), "parent", null);
        setField(term397, term397.getClass(), "next", term399);
        setIntField(term414, term414.getClass(), "type", 0);
        setField(term414, term414.getClass(), "next", null);
        setField(term414, term414.getClass(), "first", null);
        setField(term414, term414.getClass(), "last", null);
        setField(term414, term414.getClass(), "propListHead", null);
        setIntField(term414, term414.getClass(), "sourcePosition", 0);
        setField(term414, term414.getClass(), "jsType", null);
        setField(term414, term414.getClass(), "parent", null);
        setField(term397, term397.getClass(), "first", term414);
        setIntField(term417, term417.getClass(), "type", 0);
        setField(term417, term417.getClass(), "next", null);
        setField(term417, term417.getClass(), "first", null);
        setField(term417, term417.getClass(), "last", null);
        setField(term417, term417.getClass(), "propListHead", null);
        setIntField(term417, term417.getClass(), "sourcePosition", 0);
        setField(term417, term417.getClass(), "jsType", null);
        setField(term417, term417.getClass(), "parent", null);
        setField(term397, term397.getClass(), "last", term417);
        setField(term420, term420.getClass(), "next", null);
        setIntField(term420, term420.getClass(), "type", 0);
        setIntField(term420, term420.getClass(), "intValue", 0);
        setField(term420, term420.getClass(), "objectValue", null);
        setField(term397, term397.getClass(), "propListHead", term420);
        setIntField(term397, term397.getClass(), "sourcePosition", 1830648570);
        setField(term397, term397.getClass(), "jsType", null);
        setField(term397, term397.getClass(), "parent", null);
        term6983 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6984 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6985 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6986 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6987 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6988 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term6989 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6990 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6991 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term6983, term6983.getClass(), "type", 158873461);
        setIntField(term6984, term6984.getClass(), "type", -1388471422);
        setIntField(term6985, term6985.getClass(), "type", 0);
        setField(term6985, term6985.getClass(), "next", null);
        setField(term6985, term6985.getClass(), "first", null);
        setField(term6985, term6985.getClass(), "last", null);
        setField(term6985, term6985.getClass(), "propListHead", null);
        setIntField(term6985, term6985.getClass(), "sourcePosition", 0);
        setField(term6985, term6985.getClass(), "jsType", null);
        setField(term6985, term6985.getClass(), "parent", null);
        setField(term6984, term6984.getClass(), "next", term6985);
        setIntField(term6986, term6986.getClass(), "type", 0);
        setField(term6986, term6986.getClass(), "next", null);
        setField(term6986, term6986.getClass(), "first", null);
        setField(term6986, term6986.getClass(), "last", null);
        setField(term6986, term6986.getClass(), "propListHead", null);
        setIntField(term6986, term6986.getClass(), "sourcePosition", 0);
        setField(term6986, term6986.getClass(), "jsType", null);
        setField(term6986, term6986.getClass(), "parent", null);
        setField(term6984, term6984.getClass(), "first", term6986);
        setIntField(term6987, term6987.getClass(), "type", 0);
        setField(term6987, term6987.getClass(), "next", null);
        setField(term6987, term6987.getClass(), "first", null);
        setField(term6987, term6987.getClass(), "last", null);
        setField(term6987, term6987.getClass(), "propListHead", null);
        setIntField(term6987, term6987.getClass(), "sourcePosition", 0);
        setField(term6987, term6987.getClass(), "jsType", null);
        setField(term6987, term6987.getClass(), "parent", null);
        setField(term6984, term6984.getClass(), "last", term6987);
        setField(term6988, term6988.getClass(), "next", null);
        setIntField(term6988, term6988.getClass(), "type", 0);
        setIntField(term6988, term6988.getClass(), "intValue", 0);
        setField(term6988, term6988.getClass(), "objectValue", null);
        setField(term6984, term6984.getClass(), "propListHead", term6988);
        setIntField(term6984, term6984.getClass(), "sourcePosition", 1598895173);
        setField(term6984, term6984.getClass(), "jsType", null);
        setField(term6984, term6984.getClass(), "parent", null);
        setField(term6983, term6983.getClass(), "next", term6984);
        setIntField(term6989, term6989.getClass(), "type", 0);
        setField(term6989, term6989.getClass(), "next", null);
        setField(term6989, term6989.getClass(), "first", null);
        setField(term6989, term6989.getClass(), "last", null);
        setField(term6989, term6989.getClass(), "propListHead", null);
        setIntField(term6989, term6989.getClass(), "sourcePosition", 0);
        setField(term6989, term6989.getClass(), "jsType", null);
        setField(term6989, term6989.getClass(), "parent", null);
        setField(term6983, term6983.getClass(), "first", term6989);
        setIntField(term6990, term6990.getClass(), "type", 0);
        setField(term6990, term6990.getClass(), "next", null);
        setField(term6990, term6990.getClass(), "first", null);
        setField(term6990, term6990.getClass(), "last", null);
        setField(term6990, term6990.getClass(), "propListHead", null);
        setIntField(term6990, term6990.getClass(), "sourcePosition", 0);
        setField(term6990, term6990.getClass(), "jsType", null);
        setField(term6990, term6990.getClass(), "parent", null);
        setField(term6983, term6983.getClass(), "last", term6990);
        setField(term6991, term6991.getClass(), "next", null);
        setIntField(term6991, term6991.getClass(), "type", 0);
        setIntField(term6991, term6991.getClass(), "intValue", 0);
        setField(term6991, term6991.getClass(), "objectValue", null);
        setField(term6983, term6983.getClass(), "propListHead", term6991);
        setIntField(term6983, term6983.getClass(), "sourcePosition", 1830648570);
        setField(term6983, term6983.getClass(), "jsType", null);
        setField(term6983, term6983.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term397;
        callMethod(klass, "isSimpleOperator", argTypes, null, args);
        assertTrue(recursiveEquals(term397, term6983));
    }

};


