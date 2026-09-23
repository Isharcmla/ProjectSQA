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

public class NodeUtil_isAnonymousFunction_1888138276163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1597;
     Object term9877;

    public NodeUtil_isAnonymousFunction_1888138276163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1597 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1599 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1601 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1604 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1607 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1610 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1614 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1617 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1620 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1597, term1597.getClass(), "type", -271094506);
        setIntField(term1599, term1599.getClass(), "type", -763576148);
        setIntField(term1601, term1601.getClass(), "type", 0);
        setField(term1601, term1601.getClass(), "next", null);
        setField(term1601, term1601.getClass(), "first", null);
        setField(term1601, term1601.getClass(), "last", null);
        setField(term1601, term1601.getClass(), "propListHead", null);
        setIntField(term1601, term1601.getClass(), "sourcePosition", 0);
        setField(term1601, term1601.getClass(), "jsType", null);
        setField(term1601, term1601.getClass(), "parent", null);
        setField(term1599, term1599.getClass(), "next", term1601);
        setIntField(term1604, term1604.getClass(), "type", 0);
        setField(term1604, term1604.getClass(), "next", null);
        setField(term1604, term1604.getClass(), "first", null);
        setField(term1604, term1604.getClass(), "last", null);
        setField(term1604, term1604.getClass(), "propListHead", null);
        setIntField(term1604, term1604.getClass(), "sourcePosition", 0);
        setField(term1604, term1604.getClass(), "jsType", null);
        setField(term1604, term1604.getClass(), "parent", null);
        setField(term1599, term1599.getClass(), "first", term1604);
        setIntField(term1607, term1607.getClass(), "type", 0);
        setField(term1607, term1607.getClass(), "next", null);
        setField(term1607, term1607.getClass(), "first", null);
        setField(term1607, term1607.getClass(), "last", null);
        setField(term1607, term1607.getClass(), "propListHead", null);
        setIntField(term1607, term1607.getClass(), "sourcePosition", 0);
        setField(term1607, term1607.getClass(), "jsType", null);
        setField(term1607, term1607.getClass(), "parent", null);
        setField(term1599, term1599.getClass(), "last", term1607);
        setField(term1610, term1610.getClass(), "next", null);
        setIntField(term1610, term1610.getClass(), "type", 0);
        setIntField(term1610, term1610.getClass(), "intValue", 0);
        setField(term1610, term1610.getClass(), "objectValue", null);
        setField(term1599, term1599.getClass(), "propListHead", term1610);
        setIntField(term1599, term1599.getClass(), "sourcePosition", 452088587);
        setField(term1599, term1599.getClass(), "jsType", null);
        setField(term1599, term1599.getClass(), "parent", null);
        setField(term1597, term1597.getClass(), "next", term1599);
        setIntField(term1614, term1614.getClass(), "type", 0);
        setField(term1614, term1614.getClass(), "next", null);
        setField(term1614, term1614.getClass(), "first", null);
        setField(term1614, term1614.getClass(), "last", null);
        setField(term1614, term1614.getClass(), "propListHead", null);
        setIntField(term1614, term1614.getClass(), "sourcePosition", 0);
        setField(term1614, term1614.getClass(), "jsType", null);
        setField(term1614, term1614.getClass(), "parent", null);
        setField(term1597, term1597.getClass(), "first", term1614);
        setIntField(term1617, term1617.getClass(), "type", 0);
        setField(term1617, term1617.getClass(), "next", null);
        setField(term1617, term1617.getClass(), "first", null);
        setField(term1617, term1617.getClass(), "last", null);
        setField(term1617, term1617.getClass(), "propListHead", null);
        setIntField(term1617, term1617.getClass(), "sourcePosition", 0);
        setField(term1617, term1617.getClass(), "jsType", null);
        setField(term1617, term1617.getClass(), "parent", null);
        setField(term1597, term1597.getClass(), "last", term1617);
        setField(term1620, term1620.getClass(), "next", null);
        setIntField(term1620, term1620.getClass(), "type", 0);
        setIntField(term1620, term1620.getClass(), "intValue", 0);
        setField(term1620, term1620.getClass(), "objectValue", null);
        setField(term1597, term1597.getClass(), "propListHead", term1620);
        setIntField(term1597, term1597.getClass(), "sourcePosition", -1630069454);
        setField(term1597, term1597.getClass(), "jsType", null);
        setField(term1597, term1597.getClass(), "parent", null);
        term9877 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9878 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9879 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9880 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9881 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9882 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term9883 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9884 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9885 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term9877, term9877.getClass(), "type", -271094506);
        setIntField(term9878, term9878.getClass(), "type", -763576148);
        setIntField(term9879, term9879.getClass(), "type", 0);
        setField(term9879, term9879.getClass(), "next", null);
        setField(term9879, term9879.getClass(), "first", null);
        setField(term9879, term9879.getClass(), "last", null);
        setField(term9879, term9879.getClass(), "propListHead", null);
        setIntField(term9879, term9879.getClass(), "sourcePosition", 0);
        setField(term9879, term9879.getClass(), "jsType", null);
        setField(term9879, term9879.getClass(), "parent", null);
        setField(term9878, term9878.getClass(), "next", term9879);
        setIntField(term9880, term9880.getClass(), "type", 0);
        setField(term9880, term9880.getClass(), "next", null);
        setField(term9880, term9880.getClass(), "first", null);
        setField(term9880, term9880.getClass(), "last", null);
        setField(term9880, term9880.getClass(), "propListHead", null);
        setIntField(term9880, term9880.getClass(), "sourcePosition", 0);
        setField(term9880, term9880.getClass(), "jsType", null);
        setField(term9880, term9880.getClass(), "parent", null);
        setField(term9878, term9878.getClass(), "first", term9880);
        setIntField(term9881, term9881.getClass(), "type", 0);
        setField(term9881, term9881.getClass(), "next", null);
        setField(term9881, term9881.getClass(), "first", null);
        setField(term9881, term9881.getClass(), "last", null);
        setField(term9881, term9881.getClass(), "propListHead", null);
        setIntField(term9881, term9881.getClass(), "sourcePosition", 0);
        setField(term9881, term9881.getClass(), "jsType", null);
        setField(term9881, term9881.getClass(), "parent", null);
        setField(term9878, term9878.getClass(), "last", term9881);
        setField(term9882, term9882.getClass(), "next", null);
        setIntField(term9882, term9882.getClass(), "type", 0);
        setIntField(term9882, term9882.getClass(), "intValue", 0);
        setField(term9882, term9882.getClass(), "objectValue", null);
        setField(term9878, term9878.getClass(), "propListHead", term9882);
        setIntField(term9878, term9878.getClass(), "sourcePosition", 452088587);
        setField(term9878, term9878.getClass(), "jsType", null);
        setField(term9878, term9878.getClass(), "parent", null);
        setField(term9877, term9877.getClass(), "next", term9878);
        setIntField(term9883, term9883.getClass(), "type", 0);
        setField(term9883, term9883.getClass(), "next", null);
        setField(term9883, term9883.getClass(), "first", null);
        setField(term9883, term9883.getClass(), "last", null);
        setField(term9883, term9883.getClass(), "propListHead", null);
        setIntField(term9883, term9883.getClass(), "sourcePosition", 0);
        setField(term9883, term9883.getClass(), "jsType", null);
        setField(term9883, term9883.getClass(), "parent", null);
        setField(term9877, term9877.getClass(), "first", term9883);
        setIntField(term9884, term9884.getClass(), "type", 0);
        setField(term9884, term9884.getClass(), "next", null);
        setField(term9884, term9884.getClass(), "first", null);
        setField(term9884, term9884.getClass(), "last", null);
        setField(term9884, term9884.getClass(), "propListHead", null);
        setIntField(term9884, term9884.getClass(), "sourcePosition", 0);
        setField(term9884, term9884.getClass(), "jsType", null);
        setField(term9884, term9884.getClass(), "parent", null);
        setField(term9877, term9877.getClass(), "last", term9884);
        setField(term9885, term9885.getClass(), "next", null);
        setIntField(term9885, term9885.getClass(), "type", 0);
        setIntField(term9885, term9885.getClass(), "intValue", 0);
        setField(term9885, term9885.getClass(), "objectValue", null);
        setField(term9877, term9877.getClass(), "propListHead", term9885);
        setIntField(term9877, term9877.getClass(), "sourcePosition", -1630069454);
        setField(term9877, term9877.getClass(), "jsType", null);
        setField(term9877, term9877.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1597;
        Object retValue = callMethod(klass, "isAnonymousFunction", argTypes, null, args);
        assertTrue(recursiveEquals(term1597, term9877));
        assertTrue(recursiveEquals(retValue, false));
    }

};


