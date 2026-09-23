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

public class NodeUtil_isWithinLoop_46295102219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1703;
     Object term12398;

    public NodeUtil_isWithinLoop_46295102219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1703 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1705 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1707 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1710 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1713 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1716 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1720 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1723 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1726 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1703, term1703.getClass(), "type", -1397251956);
        setIntField(term1705, term1705.getClass(), "type", 808614267);
        setIntField(term1707, term1707.getClass(), "type", 0);
        setField(term1707, term1707.getClass(), "next", null);
        setField(term1707, term1707.getClass(), "first", null);
        setField(term1707, term1707.getClass(), "last", null);
        setField(term1707, term1707.getClass(), "propListHead", null);
        setIntField(term1707, term1707.getClass(), "sourcePosition", 0);
        setField(term1707, term1707.getClass(), "jsType", null);
        setField(term1707, term1707.getClass(), "parent", null);
        setField(term1705, term1705.getClass(), "next", term1707);
        setIntField(term1710, term1710.getClass(), "type", 0);
        setField(term1710, term1710.getClass(), "next", null);
        setField(term1710, term1710.getClass(), "first", null);
        setField(term1710, term1710.getClass(), "last", null);
        setField(term1710, term1710.getClass(), "propListHead", null);
        setIntField(term1710, term1710.getClass(), "sourcePosition", 0);
        setField(term1710, term1710.getClass(), "jsType", null);
        setField(term1710, term1710.getClass(), "parent", null);
        setField(term1705, term1705.getClass(), "first", term1710);
        setIntField(term1713, term1713.getClass(), "type", 0);
        setField(term1713, term1713.getClass(), "next", null);
        setField(term1713, term1713.getClass(), "first", null);
        setField(term1713, term1713.getClass(), "last", null);
        setField(term1713, term1713.getClass(), "propListHead", null);
        setIntField(term1713, term1713.getClass(), "sourcePosition", 0);
        setField(term1713, term1713.getClass(), "jsType", null);
        setField(term1713, term1713.getClass(), "parent", null);
        setField(term1705, term1705.getClass(), "last", term1713);
        setField(term1716, term1716.getClass(), "next", null);
        setIntField(term1716, term1716.getClass(), "type", 0);
        setIntField(term1716, term1716.getClass(), "intValue", 0);
        setField(term1716, term1716.getClass(), "objectValue", null);
        setField(term1705, term1705.getClass(), "propListHead", term1716);
        setIntField(term1705, term1705.getClass(), "sourcePosition", 1789351397);
        setField(term1705, term1705.getClass(), "jsType", null);
        setField(term1705, term1705.getClass(), "parent", null);
        setField(term1703, term1703.getClass(), "next", term1705);
        setIntField(term1720, term1720.getClass(), "type", 0);
        setField(term1720, term1720.getClass(), "next", null);
        setField(term1720, term1720.getClass(), "first", null);
        setField(term1720, term1720.getClass(), "last", null);
        setField(term1720, term1720.getClass(), "propListHead", null);
        setIntField(term1720, term1720.getClass(), "sourcePosition", 0);
        setField(term1720, term1720.getClass(), "jsType", null);
        setField(term1720, term1720.getClass(), "parent", null);
        setField(term1703, term1703.getClass(), "first", term1720);
        setIntField(term1723, term1723.getClass(), "type", 0);
        setField(term1723, term1723.getClass(), "next", null);
        setField(term1723, term1723.getClass(), "first", null);
        setField(term1723, term1723.getClass(), "last", null);
        setField(term1723, term1723.getClass(), "propListHead", null);
        setIntField(term1723, term1723.getClass(), "sourcePosition", 0);
        setField(term1723, term1723.getClass(), "jsType", null);
        setField(term1723, term1723.getClass(), "parent", null);
        setField(term1703, term1703.getClass(), "last", term1723);
        setField(term1726, term1726.getClass(), "next", null);
        setIntField(term1726, term1726.getClass(), "type", 0);
        setIntField(term1726, term1726.getClass(), "intValue", 0);
        setField(term1726, term1726.getClass(), "objectValue", null);
        setField(term1703, term1703.getClass(), "propListHead", term1726);
        setIntField(term1703, term1703.getClass(), "sourcePosition", 2145528170);
        setField(term1703, term1703.getClass(), "jsType", null);
        setField(term1703, term1703.getClass(), "parent", null);
        term12398 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12399 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12400 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12401 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12402 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12403 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term12404 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12405 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12406 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term12398, term12398.getClass(), "type", -1397251956);
        setIntField(term12399, term12399.getClass(), "type", 808614267);
        setIntField(term12400, term12400.getClass(), "type", 0);
        setField(term12400, term12400.getClass(), "next", null);
        setField(term12400, term12400.getClass(), "first", null);
        setField(term12400, term12400.getClass(), "last", null);
        setField(term12400, term12400.getClass(), "propListHead", null);
        setIntField(term12400, term12400.getClass(), "sourcePosition", 0);
        setField(term12400, term12400.getClass(), "jsType", null);
        setField(term12400, term12400.getClass(), "parent", null);
        setField(term12399, term12399.getClass(), "next", term12400);
        setIntField(term12401, term12401.getClass(), "type", 0);
        setField(term12401, term12401.getClass(), "next", null);
        setField(term12401, term12401.getClass(), "first", null);
        setField(term12401, term12401.getClass(), "last", null);
        setField(term12401, term12401.getClass(), "propListHead", null);
        setIntField(term12401, term12401.getClass(), "sourcePosition", 0);
        setField(term12401, term12401.getClass(), "jsType", null);
        setField(term12401, term12401.getClass(), "parent", null);
        setField(term12399, term12399.getClass(), "first", term12401);
        setIntField(term12402, term12402.getClass(), "type", 0);
        setField(term12402, term12402.getClass(), "next", null);
        setField(term12402, term12402.getClass(), "first", null);
        setField(term12402, term12402.getClass(), "last", null);
        setField(term12402, term12402.getClass(), "propListHead", null);
        setIntField(term12402, term12402.getClass(), "sourcePosition", 0);
        setField(term12402, term12402.getClass(), "jsType", null);
        setField(term12402, term12402.getClass(), "parent", null);
        setField(term12399, term12399.getClass(), "last", term12402);
        setField(term12403, term12403.getClass(), "next", null);
        setIntField(term12403, term12403.getClass(), "type", 0);
        setIntField(term12403, term12403.getClass(), "intValue", 0);
        setField(term12403, term12403.getClass(), "objectValue", null);
        setField(term12399, term12399.getClass(), "propListHead", term12403);
        setIntField(term12399, term12399.getClass(), "sourcePosition", 1789351397);
        setField(term12399, term12399.getClass(), "jsType", null);
        setField(term12399, term12399.getClass(), "parent", null);
        setField(term12398, term12398.getClass(), "next", term12399);
        setIntField(term12404, term12404.getClass(), "type", 0);
        setField(term12404, term12404.getClass(), "next", null);
        setField(term12404, term12404.getClass(), "first", null);
        setField(term12404, term12404.getClass(), "last", null);
        setField(term12404, term12404.getClass(), "propListHead", null);
        setIntField(term12404, term12404.getClass(), "sourcePosition", 0);
        setField(term12404, term12404.getClass(), "jsType", null);
        setField(term12404, term12404.getClass(), "parent", null);
        setField(term12398, term12398.getClass(), "first", term12404);
        setIntField(term12405, term12405.getClass(), "type", 0);
        setField(term12405, term12405.getClass(), "next", null);
        setField(term12405, term12405.getClass(), "first", null);
        setField(term12405, term12405.getClass(), "last", null);
        setField(term12405, term12405.getClass(), "propListHead", null);
        setIntField(term12405, term12405.getClass(), "sourcePosition", 0);
        setField(term12405, term12405.getClass(), "jsType", null);
        setField(term12405, term12405.getClass(), "parent", null);
        setField(term12398, term12398.getClass(), "last", term12405);
        setField(term12406, term12406.getClass(), "next", null);
        setIntField(term12406, term12406.getClass(), "type", 0);
        setIntField(term12406, term12406.getClass(), "intValue", 0);
        setField(term12406, term12406.getClass(), "objectValue", null);
        setField(term12398, term12398.getClass(), "propListHead", term12406);
        setIntField(term12398, term12398.getClass(), "sourcePosition", 2145528170);
        setField(term12398, term12398.getClass(), "jsType", null);
        setField(term12398, term12398.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1703;
        Object retValue = callMethod(klass, "isWithinLoop", argTypes, null, args);
        assertTrue(recursiveEquals(term1703, term12398));
        assertTrue(recursiveEquals(retValue, false));
    }

};


