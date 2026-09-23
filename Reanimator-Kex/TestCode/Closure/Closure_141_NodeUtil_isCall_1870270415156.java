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

public class NodeUtil_isCall_1870270415156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1408;
     Object term8985;

    public NodeUtil_isCall_1870270415156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1408 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1410 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1412 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1415 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1418 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1421 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1425 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1428 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1431 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1408, term1408.getClass(), "type", 1470349147);
        setIntField(term1410, term1410.getClass(), "type", -728760750);
        setIntField(term1412, term1412.getClass(), "type", 0);
        setField(term1412, term1412.getClass(), "next", null);
        setField(term1412, term1412.getClass(), "first", null);
        setField(term1412, term1412.getClass(), "last", null);
        setField(term1412, term1412.getClass(), "propListHead", null);
        setIntField(term1412, term1412.getClass(), "sourcePosition", 0);
        setField(term1412, term1412.getClass(), "jsType", null);
        setField(term1412, term1412.getClass(), "parent", null);
        setField(term1410, term1410.getClass(), "next", term1412);
        setIntField(term1415, term1415.getClass(), "type", 0);
        setField(term1415, term1415.getClass(), "next", null);
        setField(term1415, term1415.getClass(), "first", null);
        setField(term1415, term1415.getClass(), "last", null);
        setField(term1415, term1415.getClass(), "propListHead", null);
        setIntField(term1415, term1415.getClass(), "sourcePosition", 0);
        setField(term1415, term1415.getClass(), "jsType", null);
        setField(term1415, term1415.getClass(), "parent", null);
        setField(term1410, term1410.getClass(), "first", term1415);
        setIntField(term1418, term1418.getClass(), "type", 0);
        setField(term1418, term1418.getClass(), "next", null);
        setField(term1418, term1418.getClass(), "first", null);
        setField(term1418, term1418.getClass(), "last", null);
        setField(term1418, term1418.getClass(), "propListHead", null);
        setIntField(term1418, term1418.getClass(), "sourcePosition", 0);
        setField(term1418, term1418.getClass(), "jsType", null);
        setField(term1418, term1418.getClass(), "parent", null);
        setField(term1410, term1410.getClass(), "last", term1418);
        setField(term1421, term1421.getClass(), "next", null);
        setIntField(term1421, term1421.getClass(), "type", 0);
        setIntField(term1421, term1421.getClass(), "intValue", 0);
        setField(term1421, term1421.getClass(), "objectValue", null);
        setField(term1410, term1410.getClass(), "propListHead", term1421);
        setIntField(term1410, term1410.getClass(), "sourcePosition", -885788574);
        setField(term1410, term1410.getClass(), "jsType", null);
        setField(term1410, term1410.getClass(), "parent", null);
        setField(term1408, term1408.getClass(), "next", term1410);
        setIntField(term1425, term1425.getClass(), "type", 0);
        setField(term1425, term1425.getClass(), "next", null);
        setField(term1425, term1425.getClass(), "first", null);
        setField(term1425, term1425.getClass(), "last", null);
        setField(term1425, term1425.getClass(), "propListHead", null);
        setIntField(term1425, term1425.getClass(), "sourcePosition", 0);
        setField(term1425, term1425.getClass(), "jsType", null);
        setField(term1425, term1425.getClass(), "parent", null);
        setField(term1408, term1408.getClass(), "first", term1425);
        setIntField(term1428, term1428.getClass(), "type", 0);
        setField(term1428, term1428.getClass(), "next", null);
        setField(term1428, term1428.getClass(), "first", null);
        setField(term1428, term1428.getClass(), "last", null);
        setField(term1428, term1428.getClass(), "propListHead", null);
        setIntField(term1428, term1428.getClass(), "sourcePosition", 0);
        setField(term1428, term1428.getClass(), "jsType", null);
        setField(term1428, term1428.getClass(), "parent", null);
        setField(term1408, term1408.getClass(), "last", term1428);
        setField(term1431, term1431.getClass(), "next", null);
        setIntField(term1431, term1431.getClass(), "type", 0);
        setIntField(term1431, term1431.getClass(), "intValue", 0);
        setField(term1431, term1431.getClass(), "objectValue", null);
        setField(term1408, term1408.getClass(), "propListHead", term1431);
        setIntField(term1408, term1408.getClass(), "sourcePosition", -865722613);
        setField(term1408, term1408.getClass(), "jsType", null);
        setField(term1408, term1408.getClass(), "parent", null);
        term8985 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8986 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8987 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8988 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8989 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8990 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term8991 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8992 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8993 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term8985, term8985.getClass(), "type", 1470349147);
        setIntField(term8986, term8986.getClass(), "type", -728760750);
        setIntField(term8987, term8987.getClass(), "type", 0);
        setField(term8987, term8987.getClass(), "next", null);
        setField(term8987, term8987.getClass(), "first", null);
        setField(term8987, term8987.getClass(), "last", null);
        setField(term8987, term8987.getClass(), "propListHead", null);
        setIntField(term8987, term8987.getClass(), "sourcePosition", 0);
        setField(term8987, term8987.getClass(), "jsType", null);
        setField(term8987, term8987.getClass(), "parent", null);
        setField(term8986, term8986.getClass(), "next", term8987);
        setIntField(term8988, term8988.getClass(), "type", 0);
        setField(term8988, term8988.getClass(), "next", null);
        setField(term8988, term8988.getClass(), "first", null);
        setField(term8988, term8988.getClass(), "last", null);
        setField(term8988, term8988.getClass(), "propListHead", null);
        setIntField(term8988, term8988.getClass(), "sourcePosition", 0);
        setField(term8988, term8988.getClass(), "jsType", null);
        setField(term8988, term8988.getClass(), "parent", null);
        setField(term8986, term8986.getClass(), "first", term8988);
        setIntField(term8989, term8989.getClass(), "type", 0);
        setField(term8989, term8989.getClass(), "next", null);
        setField(term8989, term8989.getClass(), "first", null);
        setField(term8989, term8989.getClass(), "last", null);
        setField(term8989, term8989.getClass(), "propListHead", null);
        setIntField(term8989, term8989.getClass(), "sourcePosition", 0);
        setField(term8989, term8989.getClass(), "jsType", null);
        setField(term8989, term8989.getClass(), "parent", null);
        setField(term8986, term8986.getClass(), "last", term8989);
        setField(term8990, term8990.getClass(), "next", null);
        setIntField(term8990, term8990.getClass(), "type", 0);
        setIntField(term8990, term8990.getClass(), "intValue", 0);
        setField(term8990, term8990.getClass(), "objectValue", null);
        setField(term8986, term8986.getClass(), "propListHead", term8990);
        setIntField(term8986, term8986.getClass(), "sourcePosition", -885788574);
        setField(term8986, term8986.getClass(), "jsType", null);
        setField(term8986, term8986.getClass(), "parent", null);
        setField(term8985, term8985.getClass(), "next", term8986);
        setIntField(term8991, term8991.getClass(), "type", 0);
        setField(term8991, term8991.getClass(), "next", null);
        setField(term8991, term8991.getClass(), "first", null);
        setField(term8991, term8991.getClass(), "last", null);
        setField(term8991, term8991.getClass(), "propListHead", null);
        setIntField(term8991, term8991.getClass(), "sourcePosition", 0);
        setField(term8991, term8991.getClass(), "jsType", null);
        setField(term8991, term8991.getClass(), "parent", null);
        setField(term8985, term8985.getClass(), "first", term8991);
        setIntField(term8992, term8992.getClass(), "type", 0);
        setField(term8992, term8992.getClass(), "next", null);
        setField(term8992, term8992.getClass(), "first", null);
        setField(term8992, term8992.getClass(), "last", null);
        setField(term8992, term8992.getClass(), "propListHead", null);
        setIntField(term8992, term8992.getClass(), "sourcePosition", 0);
        setField(term8992, term8992.getClass(), "jsType", null);
        setField(term8992, term8992.getClass(), "parent", null);
        setField(term8985, term8985.getClass(), "last", term8992);
        setField(term8993, term8993.getClass(), "next", null);
        setIntField(term8993, term8993.getClass(), "type", 0);
        setIntField(term8993, term8993.getClass(), "intValue", 0);
        setField(term8993, term8993.getClass(), "objectValue", null);
        setField(term8985, term8985.getClass(), "propListHead", term8993);
        setIntField(term8985, term8985.getClass(), "sourcePosition", -865722613);
        setField(term8985, term8985.getClass(), "jsType", null);
        setField(term8985, term8985.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1408;
        Object retValue = callMethod(klass, "isCall", argTypes, null, args);
        assertTrue(recursiveEquals(term1408, term8985));
        assertTrue(recursiveEquals(retValue, false));
    }

};


