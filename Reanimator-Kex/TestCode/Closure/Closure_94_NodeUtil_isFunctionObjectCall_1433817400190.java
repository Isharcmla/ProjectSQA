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

public class NodeUtil_isFunctionObjectCall_1433817400190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1972;
     Object term12302;

    public NodeUtil_isFunctionObjectCall_1433817400190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1972 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1974 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1976 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1979 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1982 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1985 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1989 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1992 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1995 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1972, term1972.getClass(), "type", 1361126430);
        setIntField(term1974, term1974.getClass(), "type", -355376034);
        setIntField(term1976, term1976.getClass(), "type", 0);
        setField(term1976, term1976.getClass(), "next", null);
        setField(term1976, term1976.getClass(), "first", null);
        setField(term1976, term1976.getClass(), "last", null);
        setField(term1976, term1976.getClass(), "propListHead", null);
        setIntField(term1976, term1976.getClass(), "sourcePosition", 0);
        setField(term1976, term1976.getClass(), "jsType", null);
        setField(term1976, term1976.getClass(), "parent", null);
        setField(term1974, term1974.getClass(), "next", term1976);
        setIntField(term1979, term1979.getClass(), "type", 0);
        setField(term1979, term1979.getClass(), "next", null);
        setField(term1979, term1979.getClass(), "first", null);
        setField(term1979, term1979.getClass(), "last", null);
        setField(term1979, term1979.getClass(), "propListHead", null);
        setIntField(term1979, term1979.getClass(), "sourcePosition", 0);
        setField(term1979, term1979.getClass(), "jsType", null);
        setField(term1979, term1979.getClass(), "parent", null);
        setField(term1974, term1974.getClass(), "first", term1979);
        setIntField(term1982, term1982.getClass(), "type", 0);
        setField(term1982, term1982.getClass(), "next", null);
        setField(term1982, term1982.getClass(), "first", null);
        setField(term1982, term1982.getClass(), "last", null);
        setField(term1982, term1982.getClass(), "propListHead", null);
        setIntField(term1982, term1982.getClass(), "sourcePosition", 0);
        setField(term1982, term1982.getClass(), "jsType", null);
        setField(term1982, term1982.getClass(), "parent", null);
        setField(term1974, term1974.getClass(), "last", term1982);
        setField(term1985, term1985.getClass(), "next", null);
        setIntField(term1985, term1985.getClass(), "type", 0);
        setIntField(term1985, term1985.getClass(), "intValue", 0);
        setField(term1985, term1985.getClass(), "objectValue", null);
        setField(term1974, term1974.getClass(), "propListHead", term1985);
        setIntField(term1974, term1974.getClass(), "sourcePosition", -68615285);
        setField(term1974, term1974.getClass(), "jsType", null);
        setField(term1974, term1974.getClass(), "parent", null);
        setField(term1972, term1972.getClass(), "next", term1974);
        setIntField(term1989, term1989.getClass(), "type", 0);
        setField(term1989, term1989.getClass(), "next", null);
        setField(term1989, term1989.getClass(), "first", null);
        setField(term1989, term1989.getClass(), "last", null);
        setField(term1989, term1989.getClass(), "propListHead", null);
        setIntField(term1989, term1989.getClass(), "sourcePosition", 0);
        setField(term1989, term1989.getClass(), "jsType", null);
        setField(term1989, term1989.getClass(), "parent", null);
        setField(term1972, term1972.getClass(), "first", term1989);
        setIntField(term1992, term1992.getClass(), "type", 0);
        setField(term1992, term1992.getClass(), "next", null);
        setField(term1992, term1992.getClass(), "first", null);
        setField(term1992, term1992.getClass(), "last", null);
        setField(term1992, term1992.getClass(), "propListHead", null);
        setIntField(term1992, term1992.getClass(), "sourcePosition", 0);
        setField(term1992, term1992.getClass(), "jsType", null);
        setField(term1992, term1992.getClass(), "parent", null);
        setField(term1972, term1972.getClass(), "last", term1992);
        setField(term1995, term1995.getClass(), "next", null);
        setIntField(term1995, term1995.getClass(), "type", 0);
        setIntField(term1995, term1995.getClass(), "intValue", 0);
        setField(term1995, term1995.getClass(), "objectValue", null);
        setField(term1972, term1972.getClass(), "propListHead", term1995);
        setIntField(term1972, term1972.getClass(), "sourcePosition", -337504086);
        setField(term1972, term1972.getClass(), "jsType", null);
        setField(term1972, term1972.getClass(), "parent", null);
        term12302 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12303 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12304 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12305 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12306 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12307 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term12308 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12309 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12310 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term12302, term12302.getClass(), "type", 1361126430);
        setIntField(term12303, term12303.getClass(), "type", -355376034);
        setIntField(term12304, term12304.getClass(), "type", 0);
        setField(term12304, term12304.getClass(), "next", null);
        setField(term12304, term12304.getClass(), "first", null);
        setField(term12304, term12304.getClass(), "last", null);
        setField(term12304, term12304.getClass(), "propListHead", null);
        setIntField(term12304, term12304.getClass(), "sourcePosition", 0);
        setField(term12304, term12304.getClass(), "jsType", null);
        setField(term12304, term12304.getClass(), "parent", null);
        setField(term12303, term12303.getClass(), "next", term12304);
        setIntField(term12305, term12305.getClass(), "type", 0);
        setField(term12305, term12305.getClass(), "next", null);
        setField(term12305, term12305.getClass(), "first", null);
        setField(term12305, term12305.getClass(), "last", null);
        setField(term12305, term12305.getClass(), "propListHead", null);
        setIntField(term12305, term12305.getClass(), "sourcePosition", 0);
        setField(term12305, term12305.getClass(), "jsType", null);
        setField(term12305, term12305.getClass(), "parent", null);
        setField(term12303, term12303.getClass(), "first", term12305);
        setIntField(term12306, term12306.getClass(), "type", 0);
        setField(term12306, term12306.getClass(), "next", null);
        setField(term12306, term12306.getClass(), "first", null);
        setField(term12306, term12306.getClass(), "last", null);
        setField(term12306, term12306.getClass(), "propListHead", null);
        setIntField(term12306, term12306.getClass(), "sourcePosition", 0);
        setField(term12306, term12306.getClass(), "jsType", null);
        setField(term12306, term12306.getClass(), "parent", null);
        setField(term12303, term12303.getClass(), "last", term12306);
        setField(term12307, term12307.getClass(), "next", null);
        setIntField(term12307, term12307.getClass(), "type", 0);
        setIntField(term12307, term12307.getClass(), "intValue", 0);
        setField(term12307, term12307.getClass(), "objectValue", null);
        setField(term12303, term12303.getClass(), "propListHead", term12307);
        setIntField(term12303, term12303.getClass(), "sourcePosition", -68615285);
        setField(term12303, term12303.getClass(), "jsType", null);
        setField(term12303, term12303.getClass(), "parent", null);
        setField(term12302, term12302.getClass(), "next", term12303);
        setIntField(term12308, term12308.getClass(), "type", 0);
        setField(term12308, term12308.getClass(), "next", null);
        setField(term12308, term12308.getClass(), "first", null);
        setField(term12308, term12308.getClass(), "last", null);
        setField(term12308, term12308.getClass(), "propListHead", null);
        setIntField(term12308, term12308.getClass(), "sourcePosition", 0);
        setField(term12308, term12308.getClass(), "jsType", null);
        setField(term12308, term12308.getClass(), "parent", null);
        setField(term12302, term12302.getClass(), "first", term12308);
        setIntField(term12309, term12309.getClass(), "type", 0);
        setField(term12309, term12309.getClass(), "next", null);
        setField(term12309, term12309.getClass(), "first", null);
        setField(term12309, term12309.getClass(), "last", null);
        setField(term12309, term12309.getClass(), "propListHead", null);
        setIntField(term12309, term12309.getClass(), "sourcePosition", 0);
        setField(term12309, term12309.getClass(), "jsType", null);
        setField(term12309, term12309.getClass(), "parent", null);
        setField(term12302, term12302.getClass(), "last", term12309);
        setField(term12310, term12310.getClass(), "next", null);
        setIntField(term12310, term12310.getClass(), "type", 0);
        setIntField(term12310, term12310.getClass(), "intValue", 0);
        setField(term12310, term12310.getClass(), "objectValue", null);
        setField(term12302, term12302.getClass(), "propListHead", term12310);
        setIntField(term12302, term12302.getClass(), "sourcePosition", -337504086);
        setField(term12302, term12302.getClass(), "jsType", null);
        setField(term12302, term12302.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1972;
        callMethod(klass, "isFunctionObjectCall", argTypes, null, args);
        assertTrue(recursiveEquals(term1972, term12302));
    }

};


