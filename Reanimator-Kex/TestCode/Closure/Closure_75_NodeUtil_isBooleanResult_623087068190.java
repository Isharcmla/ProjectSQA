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
     Object term10617;

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
        term10617 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10618 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10619 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10620 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10621 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10622 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term10623 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10624 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10625 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term10617, term10617.getClass(), "type", -1702055571);
        setIntField(term10618, term10618.getClass(), "type", 2143282300);
        setIntField(term10619, term10619.getClass(), "type", 0);
        setField(term10619, term10619.getClass(), "next", null);
        setField(term10619, term10619.getClass(), "first", null);
        setField(term10619, term10619.getClass(), "last", null);
        setField(term10619, term10619.getClass(), "propListHead", null);
        setIntField(term10619, term10619.getClass(), "sourcePosition", 0);
        setField(term10619, term10619.getClass(), "jsType", null);
        setField(term10619, term10619.getClass(), "parent", null);
        setField(term10618, term10618.getClass(), "next", term10619);
        setIntField(term10620, term10620.getClass(), "type", 0);
        setField(term10620, term10620.getClass(), "next", null);
        setField(term10620, term10620.getClass(), "first", null);
        setField(term10620, term10620.getClass(), "last", null);
        setField(term10620, term10620.getClass(), "propListHead", null);
        setIntField(term10620, term10620.getClass(), "sourcePosition", 0);
        setField(term10620, term10620.getClass(), "jsType", null);
        setField(term10620, term10620.getClass(), "parent", null);
        setField(term10618, term10618.getClass(), "first", term10620);
        setIntField(term10621, term10621.getClass(), "type", 0);
        setField(term10621, term10621.getClass(), "next", null);
        setField(term10621, term10621.getClass(), "first", null);
        setField(term10621, term10621.getClass(), "last", null);
        setField(term10621, term10621.getClass(), "propListHead", null);
        setIntField(term10621, term10621.getClass(), "sourcePosition", 0);
        setField(term10621, term10621.getClass(), "jsType", null);
        setField(term10621, term10621.getClass(), "parent", null);
        setField(term10618, term10618.getClass(), "last", term10621);
        setField(term10622, term10622.getClass(), "next", null);
        setIntField(term10622, term10622.getClass(), "type", 0);
        setIntField(term10622, term10622.getClass(), "intValue", 0);
        setField(term10622, term10622.getClass(), "objectValue", null);
        setField(term10618, term10618.getClass(), "propListHead", term10622);
        setIntField(term10618, term10618.getClass(), "sourcePosition", 301401782);
        setField(term10618, term10618.getClass(), "jsType", null);
        setField(term10618, term10618.getClass(), "parent", null);
        setField(term10617, term10617.getClass(), "next", term10618);
        setIntField(term10623, term10623.getClass(), "type", 0);
        setField(term10623, term10623.getClass(), "next", null);
        setField(term10623, term10623.getClass(), "first", null);
        setField(term10623, term10623.getClass(), "last", null);
        setField(term10623, term10623.getClass(), "propListHead", null);
        setIntField(term10623, term10623.getClass(), "sourcePosition", 0);
        setField(term10623, term10623.getClass(), "jsType", null);
        setField(term10623, term10623.getClass(), "parent", null);
        setField(term10617, term10617.getClass(), "first", term10623);
        setIntField(term10624, term10624.getClass(), "type", 0);
        setField(term10624, term10624.getClass(), "next", null);
        setField(term10624, term10624.getClass(), "first", null);
        setField(term10624, term10624.getClass(), "last", null);
        setField(term10624, term10624.getClass(), "propListHead", null);
        setIntField(term10624, term10624.getClass(), "sourcePosition", 0);
        setField(term10624, term10624.getClass(), "jsType", null);
        setField(term10624, term10624.getClass(), "parent", null);
        setField(term10617, term10617.getClass(), "last", term10624);
        setField(term10625, term10625.getClass(), "next", null);
        setIntField(term10625, term10625.getClass(), "type", 0);
        setIntField(term10625, term10625.getClass(), "intValue", 0);
        setField(term10625, term10625.getClass(), "objectValue", null);
        setField(term10617, term10617.getClass(), "propListHead", term10625);
        setIntField(term10617, term10617.getClass(), "sourcePosition", 1988605357);
        setField(term10617, term10617.getClass(), "jsType", null);
        setField(term10617, term10617.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term968;
        callMethod(klass, "isBooleanResult", argTypes, null, args);
        assertTrue(recursiveEquals(term968, term10617));
    }

};


