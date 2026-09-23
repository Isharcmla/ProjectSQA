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

public class NodeUtil_isBooleanResult_623087068190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term968;
     Object term10323;

    public NodeUtil_isBooleanResult_623087068190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term968 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term970 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term972 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term975 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term978 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term981 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term985 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term988 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term991 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term968, term968.getClass(), "type", -1702055571);
        setIntField(term970, term970.getClass(), "type", 2143282300);
        setIntField(term972, term972.getClass(), "type", 0);
        setField(term972, term972.getClass(), "next", null);
        setField(term972, term972.getClass(), "first", null);
        setField(term972, term972.getClass(), "last", null);
        setField(term972, term972.getClass(), "propListHead", null);
        setIntField(term972, term972.getClass(), "sourcePosition", 0);
        setField(term972, term972.getClass(), "jsType", null);
        setField(term972, term972.getClass(), "parent", null);
        setField(term970, term970.getClass(), "next", term972);
        setIntField(term975, term975.getClass(), "type", 0);
        setField(term975, term975.getClass(), "next", null);
        setField(term975, term975.getClass(), "first", null);
        setField(term975, term975.getClass(), "last", null);
        setField(term975, term975.getClass(), "propListHead", null);
        setIntField(term975, term975.getClass(), "sourcePosition", 0);
        setField(term975, term975.getClass(), "jsType", null);
        setField(term975, term975.getClass(), "parent", null);
        setField(term970, term970.getClass(), "first", term975);
        setIntField(term978, term978.getClass(), "type", 0);
        setField(term978, term978.getClass(), "next", null);
        setField(term978, term978.getClass(), "first", null);
        setField(term978, term978.getClass(), "last", null);
        setField(term978, term978.getClass(), "propListHead", null);
        setIntField(term978, term978.getClass(), "sourcePosition", 0);
        setField(term978, term978.getClass(), "jsType", null);
        setField(term978, term978.getClass(), "parent", null);
        setField(term970, term970.getClass(), "last", term978);
        setField(term981, term981.getClass(), "next", null);
        setIntField(term981, term981.getClass(), "type", 0);
        setIntField(term981, term981.getClass(), "intValue", 0);
        setField(term981, term981.getClass(), "objectValue", null);
        setField(term970, term970.getClass(), "propListHead", term981);
        setIntField(term970, term970.getClass(), "sourcePosition", 301401782);
        setField(term970, term970.getClass(), "jsType", null);
        setField(term970, term970.getClass(), "parent", null);
        setField(term968, term968.getClass(), "next", term970);
        setIntField(term985, term985.getClass(), "type", 0);
        setField(term985, term985.getClass(), "next", null);
        setField(term985, term985.getClass(), "first", null);
        setField(term985, term985.getClass(), "last", null);
        setField(term985, term985.getClass(), "propListHead", null);
        setIntField(term985, term985.getClass(), "sourcePosition", 0);
        setField(term985, term985.getClass(), "jsType", null);
        setField(term985, term985.getClass(), "parent", null);
        setField(term968, term968.getClass(), "first", term985);
        setIntField(term988, term988.getClass(), "type", 0);
        setField(term988, term988.getClass(), "next", null);
        setField(term988, term988.getClass(), "first", null);
        setField(term988, term988.getClass(), "last", null);
        setField(term988, term988.getClass(), "propListHead", null);
        setIntField(term988, term988.getClass(), "sourcePosition", 0);
        setField(term988, term988.getClass(), "jsType", null);
        setField(term988, term988.getClass(), "parent", null);
        setField(term968, term968.getClass(), "last", term988);
        setField(term991, term991.getClass(), "next", null);
        setIntField(term991, term991.getClass(), "type", 0);
        setIntField(term991, term991.getClass(), "intValue", 0);
        setField(term991, term991.getClass(), "objectValue", null);
        setField(term968, term968.getClass(), "propListHead", term991);
        setIntField(term968, term968.getClass(), "sourcePosition", 1988605357);
        setField(term968, term968.getClass(), "jsType", null);
        setField(term968, term968.getClass(), "parent", null);
        term10323 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10324 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10325 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10326 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10327 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10328 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term10329 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10330 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10331 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term10323, term10323.getClass(), "type", -1702055571);
        setIntField(term10324, term10324.getClass(), "type", 2143282300);
        setIntField(term10325, term10325.getClass(), "type", 0);
        setField(term10325, term10325.getClass(), "next", null);
        setField(term10325, term10325.getClass(), "first", null);
        setField(term10325, term10325.getClass(), "last", null);
        setField(term10325, term10325.getClass(), "propListHead", null);
        setIntField(term10325, term10325.getClass(), "sourcePosition", 0);
        setField(term10325, term10325.getClass(), "jsType", null);
        setField(term10325, term10325.getClass(), "parent", null);
        setField(term10324, term10324.getClass(), "next", term10325);
        setIntField(term10326, term10326.getClass(), "type", 0);
        setField(term10326, term10326.getClass(), "next", null);
        setField(term10326, term10326.getClass(), "first", null);
        setField(term10326, term10326.getClass(), "last", null);
        setField(term10326, term10326.getClass(), "propListHead", null);
        setIntField(term10326, term10326.getClass(), "sourcePosition", 0);
        setField(term10326, term10326.getClass(), "jsType", null);
        setField(term10326, term10326.getClass(), "parent", null);
        setField(term10324, term10324.getClass(), "first", term10326);
        setIntField(term10327, term10327.getClass(), "type", 0);
        setField(term10327, term10327.getClass(), "next", null);
        setField(term10327, term10327.getClass(), "first", null);
        setField(term10327, term10327.getClass(), "last", null);
        setField(term10327, term10327.getClass(), "propListHead", null);
        setIntField(term10327, term10327.getClass(), "sourcePosition", 0);
        setField(term10327, term10327.getClass(), "jsType", null);
        setField(term10327, term10327.getClass(), "parent", null);
        setField(term10324, term10324.getClass(), "last", term10327);
        setField(term10328, term10328.getClass(), "next", null);
        setIntField(term10328, term10328.getClass(), "type", 0);
        setIntField(term10328, term10328.getClass(), "intValue", 0);
        setField(term10328, term10328.getClass(), "objectValue", null);
        setField(term10324, term10324.getClass(), "propListHead", term10328);
        setIntField(term10324, term10324.getClass(), "sourcePosition", 301401782);
        setField(term10324, term10324.getClass(), "jsType", null);
        setField(term10324, term10324.getClass(), "parent", null);
        setField(term10323, term10323.getClass(), "next", term10324);
        setIntField(term10329, term10329.getClass(), "type", 0);
        setField(term10329, term10329.getClass(), "next", null);
        setField(term10329, term10329.getClass(), "first", null);
        setField(term10329, term10329.getClass(), "last", null);
        setField(term10329, term10329.getClass(), "propListHead", null);
        setIntField(term10329, term10329.getClass(), "sourcePosition", 0);
        setField(term10329, term10329.getClass(), "jsType", null);
        setField(term10329, term10329.getClass(), "parent", null);
        setField(term10323, term10323.getClass(), "first", term10329);
        setIntField(term10330, term10330.getClass(), "type", 0);
        setField(term10330, term10330.getClass(), "next", null);
        setField(term10330, term10330.getClass(), "first", null);
        setField(term10330, term10330.getClass(), "last", null);
        setField(term10330, term10330.getClass(), "propListHead", null);
        setIntField(term10330, term10330.getClass(), "sourcePosition", 0);
        setField(term10330, term10330.getClass(), "jsType", null);
        setField(term10330, term10330.getClass(), "parent", null);
        setField(term10323, term10323.getClass(), "last", term10330);
        setField(term10331, term10331.getClass(), "next", null);
        setIntField(term10331, term10331.getClass(), "type", 0);
        setIntField(term10331, term10331.getClass(), "intValue", 0);
        setField(term10331, term10331.getClass(), "objectValue", null);
        setField(term10323, term10323.getClass(), "propListHead", term10331);
        setIntField(term10323, term10323.getClass(), "sourcePosition", 1988605357);
        setField(term10323, term10323.getClass(), "jsType", null);
        setField(term10323, term10323.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term968;
        callMethod(klass, "isBooleanResult", argTypes, null, args);
        assertTrue(recursiveEquals(term968, term10323));
    }

};


