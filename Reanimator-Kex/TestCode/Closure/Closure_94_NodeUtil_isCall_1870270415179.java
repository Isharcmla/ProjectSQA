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

public class NodeUtil_isCall_1870270415179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1653;
     Object term11237;

    public NodeUtil_isCall_1870270415179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1653 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1655 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1657 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1660 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1663 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1666 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1670 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1673 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1676 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1653, term1653.getClass(), "type", 1059930704);
        setIntField(term1655, term1655.getClass(), "type", 405295896);
        setIntField(term1657, term1657.getClass(), "type", 0);
        setField(term1657, term1657.getClass(), "next", null);
        setField(term1657, term1657.getClass(), "first", null);
        setField(term1657, term1657.getClass(), "last", null);
        setField(term1657, term1657.getClass(), "propListHead", null);
        setIntField(term1657, term1657.getClass(), "sourcePosition", 0);
        setField(term1657, term1657.getClass(), "jsType", null);
        setField(term1657, term1657.getClass(), "parent", null);
        setField(term1655, term1655.getClass(), "next", term1657);
        setIntField(term1660, term1660.getClass(), "type", 0);
        setField(term1660, term1660.getClass(), "next", null);
        setField(term1660, term1660.getClass(), "first", null);
        setField(term1660, term1660.getClass(), "last", null);
        setField(term1660, term1660.getClass(), "propListHead", null);
        setIntField(term1660, term1660.getClass(), "sourcePosition", 0);
        setField(term1660, term1660.getClass(), "jsType", null);
        setField(term1660, term1660.getClass(), "parent", null);
        setField(term1655, term1655.getClass(), "first", term1660);
        setIntField(term1663, term1663.getClass(), "type", 0);
        setField(term1663, term1663.getClass(), "next", null);
        setField(term1663, term1663.getClass(), "first", null);
        setField(term1663, term1663.getClass(), "last", null);
        setField(term1663, term1663.getClass(), "propListHead", null);
        setIntField(term1663, term1663.getClass(), "sourcePosition", 0);
        setField(term1663, term1663.getClass(), "jsType", null);
        setField(term1663, term1663.getClass(), "parent", null);
        setField(term1655, term1655.getClass(), "last", term1663);
        setField(term1666, term1666.getClass(), "next", null);
        setIntField(term1666, term1666.getClass(), "type", 0);
        setIntField(term1666, term1666.getClass(), "intValue", 0);
        setField(term1666, term1666.getClass(), "objectValue", null);
        setField(term1655, term1655.getClass(), "propListHead", term1666);
        setIntField(term1655, term1655.getClass(), "sourcePosition", 1611734632);
        setField(term1655, term1655.getClass(), "jsType", null);
        setField(term1655, term1655.getClass(), "parent", null);
        setField(term1653, term1653.getClass(), "next", term1655);
        setIntField(term1670, term1670.getClass(), "type", 0);
        setField(term1670, term1670.getClass(), "next", null);
        setField(term1670, term1670.getClass(), "first", null);
        setField(term1670, term1670.getClass(), "last", null);
        setField(term1670, term1670.getClass(), "propListHead", null);
        setIntField(term1670, term1670.getClass(), "sourcePosition", 0);
        setField(term1670, term1670.getClass(), "jsType", null);
        setField(term1670, term1670.getClass(), "parent", null);
        setField(term1653, term1653.getClass(), "first", term1670);
        setIntField(term1673, term1673.getClass(), "type", 0);
        setField(term1673, term1673.getClass(), "next", null);
        setField(term1673, term1673.getClass(), "first", null);
        setField(term1673, term1673.getClass(), "last", null);
        setField(term1673, term1673.getClass(), "propListHead", null);
        setIntField(term1673, term1673.getClass(), "sourcePosition", 0);
        setField(term1673, term1673.getClass(), "jsType", null);
        setField(term1673, term1673.getClass(), "parent", null);
        setField(term1653, term1653.getClass(), "last", term1673);
        setField(term1676, term1676.getClass(), "next", null);
        setIntField(term1676, term1676.getClass(), "type", 0);
        setIntField(term1676, term1676.getClass(), "intValue", 0);
        setField(term1676, term1676.getClass(), "objectValue", null);
        setField(term1653, term1653.getClass(), "propListHead", term1676);
        setIntField(term1653, term1653.getClass(), "sourcePosition", 868908117);
        setField(term1653, term1653.getClass(), "jsType", null);
        setField(term1653, term1653.getClass(), "parent", null);
        term11237 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11238 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11239 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11240 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11241 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11242 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term11243 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11244 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11245 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term11237, term11237.getClass(), "type", 1059930704);
        setIntField(term11238, term11238.getClass(), "type", 405295896);
        setIntField(term11239, term11239.getClass(), "type", 0);
        setField(term11239, term11239.getClass(), "next", null);
        setField(term11239, term11239.getClass(), "first", null);
        setField(term11239, term11239.getClass(), "last", null);
        setField(term11239, term11239.getClass(), "propListHead", null);
        setIntField(term11239, term11239.getClass(), "sourcePosition", 0);
        setField(term11239, term11239.getClass(), "jsType", null);
        setField(term11239, term11239.getClass(), "parent", null);
        setField(term11238, term11238.getClass(), "next", term11239);
        setIntField(term11240, term11240.getClass(), "type", 0);
        setField(term11240, term11240.getClass(), "next", null);
        setField(term11240, term11240.getClass(), "first", null);
        setField(term11240, term11240.getClass(), "last", null);
        setField(term11240, term11240.getClass(), "propListHead", null);
        setIntField(term11240, term11240.getClass(), "sourcePosition", 0);
        setField(term11240, term11240.getClass(), "jsType", null);
        setField(term11240, term11240.getClass(), "parent", null);
        setField(term11238, term11238.getClass(), "first", term11240);
        setIntField(term11241, term11241.getClass(), "type", 0);
        setField(term11241, term11241.getClass(), "next", null);
        setField(term11241, term11241.getClass(), "first", null);
        setField(term11241, term11241.getClass(), "last", null);
        setField(term11241, term11241.getClass(), "propListHead", null);
        setIntField(term11241, term11241.getClass(), "sourcePosition", 0);
        setField(term11241, term11241.getClass(), "jsType", null);
        setField(term11241, term11241.getClass(), "parent", null);
        setField(term11238, term11238.getClass(), "last", term11241);
        setField(term11242, term11242.getClass(), "next", null);
        setIntField(term11242, term11242.getClass(), "type", 0);
        setIntField(term11242, term11242.getClass(), "intValue", 0);
        setField(term11242, term11242.getClass(), "objectValue", null);
        setField(term11238, term11238.getClass(), "propListHead", term11242);
        setIntField(term11238, term11238.getClass(), "sourcePosition", 1611734632);
        setField(term11238, term11238.getClass(), "jsType", null);
        setField(term11238, term11238.getClass(), "parent", null);
        setField(term11237, term11237.getClass(), "next", term11238);
        setIntField(term11243, term11243.getClass(), "type", 0);
        setField(term11243, term11243.getClass(), "next", null);
        setField(term11243, term11243.getClass(), "first", null);
        setField(term11243, term11243.getClass(), "last", null);
        setField(term11243, term11243.getClass(), "propListHead", null);
        setIntField(term11243, term11243.getClass(), "sourcePosition", 0);
        setField(term11243, term11243.getClass(), "jsType", null);
        setField(term11243, term11243.getClass(), "parent", null);
        setField(term11237, term11237.getClass(), "first", term11243);
        setIntField(term11244, term11244.getClass(), "type", 0);
        setField(term11244, term11244.getClass(), "next", null);
        setField(term11244, term11244.getClass(), "first", null);
        setField(term11244, term11244.getClass(), "last", null);
        setField(term11244, term11244.getClass(), "propListHead", null);
        setIntField(term11244, term11244.getClass(), "sourcePosition", 0);
        setField(term11244, term11244.getClass(), "jsType", null);
        setField(term11244, term11244.getClass(), "parent", null);
        setField(term11237, term11237.getClass(), "last", term11244);
        setField(term11245, term11245.getClass(), "next", null);
        setIntField(term11245, term11245.getClass(), "type", 0);
        setIntField(term11245, term11245.getClass(), "intValue", 0);
        setField(term11245, term11245.getClass(), "objectValue", null);
        setField(term11237, term11237.getClass(), "propListHead", term11245);
        setIntField(term11237, term11237.getClass(), "sourcePosition", 868908117);
        setField(term11237, term11237.getClass(), "jsType", null);
        setField(term11237, term11237.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1653;
        Object retValue = callMethod(klass, "isCall", argTypes, null, args);
        assertTrue(recursiveEquals(term1653, term11237));
        assertTrue(recursiveEquals(retValue, false));
    }

};


