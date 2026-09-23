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

public class NodeUtil_isGet_883122773131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term652;
     Object term6369;

    public NodeUtil_isGet_883122773131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term652 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term654 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term656 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term659 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term662 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term665 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term669 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term672 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term675 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term652, term652.getClass(), "type", 199287428);
        setIntField(term654, term654.getClass(), "type", 1745276158);
        setIntField(term656, term656.getClass(), "type", 0);
        setField(term656, term656.getClass(), "next", null);
        setField(term656, term656.getClass(), "first", null);
        setField(term656, term656.getClass(), "last", null);
        setField(term656, term656.getClass(), "propListHead", null);
        setIntField(term656, term656.getClass(), "sourcePosition", 0);
        setField(term656, term656.getClass(), "jsType", null);
        setField(term656, term656.getClass(), "parent", null);
        setField(term654, term654.getClass(), "next", term656);
        setIntField(term659, term659.getClass(), "type", 0);
        setField(term659, term659.getClass(), "next", null);
        setField(term659, term659.getClass(), "first", null);
        setField(term659, term659.getClass(), "last", null);
        setField(term659, term659.getClass(), "propListHead", null);
        setIntField(term659, term659.getClass(), "sourcePosition", 0);
        setField(term659, term659.getClass(), "jsType", null);
        setField(term659, term659.getClass(), "parent", null);
        setField(term654, term654.getClass(), "first", term659);
        setIntField(term662, term662.getClass(), "type", 0);
        setField(term662, term662.getClass(), "next", null);
        setField(term662, term662.getClass(), "first", null);
        setField(term662, term662.getClass(), "last", null);
        setField(term662, term662.getClass(), "propListHead", null);
        setIntField(term662, term662.getClass(), "sourcePosition", 0);
        setField(term662, term662.getClass(), "jsType", null);
        setField(term662, term662.getClass(), "parent", null);
        setField(term654, term654.getClass(), "last", term662);
        setField(term665, term665.getClass(), "next", null);
        setIntField(term665, term665.getClass(), "type", 0);
        setIntField(term665, term665.getClass(), "intValue", 0);
        setField(term665, term665.getClass(), "objectValue", null);
        setField(term654, term654.getClass(), "propListHead", term665);
        setIntField(term654, term654.getClass(), "sourcePosition", 1236004505);
        setField(term654, term654.getClass(), "jsType", null);
        setField(term654, term654.getClass(), "parent", null);
        setField(term652, term652.getClass(), "next", term654);
        setIntField(term669, term669.getClass(), "type", 0);
        setField(term669, term669.getClass(), "next", null);
        setField(term669, term669.getClass(), "first", null);
        setField(term669, term669.getClass(), "last", null);
        setField(term669, term669.getClass(), "propListHead", null);
        setIntField(term669, term669.getClass(), "sourcePosition", 0);
        setField(term669, term669.getClass(), "jsType", null);
        setField(term669, term669.getClass(), "parent", null);
        setField(term652, term652.getClass(), "first", term669);
        setIntField(term672, term672.getClass(), "type", 0);
        setField(term672, term672.getClass(), "next", null);
        setField(term672, term672.getClass(), "first", null);
        setField(term672, term672.getClass(), "last", null);
        setField(term672, term672.getClass(), "propListHead", null);
        setIntField(term672, term672.getClass(), "sourcePosition", 0);
        setField(term672, term672.getClass(), "jsType", null);
        setField(term672, term672.getClass(), "parent", null);
        setField(term652, term652.getClass(), "last", term672);
        setField(term675, term675.getClass(), "next", null);
        setIntField(term675, term675.getClass(), "type", 0);
        setIntField(term675, term675.getClass(), "intValue", 0);
        setField(term675, term675.getClass(), "objectValue", null);
        setField(term652, term652.getClass(), "propListHead", term675);
        setIntField(term652, term652.getClass(), "sourcePosition", 1050765721);
        setField(term652, term652.getClass(), "jsType", null);
        setField(term652, term652.getClass(), "parent", null);
        term6369 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6370 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6371 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6372 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6373 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6374 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term6375 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6376 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6377 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term6369, term6369.getClass(), "type", 199287428);
        setIntField(term6370, term6370.getClass(), "type", 1745276158);
        setIntField(term6371, term6371.getClass(), "type", 0);
        setField(term6371, term6371.getClass(), "next", null);
        setField(term6371, term6371.getClass(), "first", null);
        setField(term6371, term6371.getClass(), "last", null);
        setField(term6371, term6371.getClass(), "propListHead", null);
        setIntField(term6371, term6371.getClass(), "sourcePosition", 0);
        setField(term6371, term6371.getClass(), "jsType", null);
        setField(term6371, term6371.getClass(), "parent", null);
        setField(term6370, term6370.getClass(), "next", term6371);
        setIntField(term6372, term6372.getClass(), "type", 0);
        setField(term6372, term6372.getClass(), "next", null);
        setField(term6372, term6372.getClass(), "first", null);
        setField(term6372, term6372.getClass(), "last", null);
        setField(term6372, term6372.getClass(), "propListHead", null);
        setIntField(term6372, term6372.getClass(), "sourcePosition", 0);
        setField(term6372, term6372.getClass(), "jsType", null);
        setField(term6372, term6372.getClass(), "parent", null);
        setField(term6370, term6370.getClass(), "first", term6372);
        setIntField(term6373, term6373.getClass(), "type", 0);
        setField(term6373, term6373.getClass(), "next", null);
        setField(term6373, term6373.getClass(), "first", null);
        setField(term6373, term6373.getClass(), "last", null);
        setField(term6373, term6373.getClass(), "propListHead", null);
        setIntField(term6373, term6373.getClass(), "sourcePosition", 0);
        setField(term6373, term6373.getClass(), "jsType", null);
        setField(term6373, term6373.getClass(), "parent", null);
        setField(term6370, term6370.getClass(), "last", term6373);
        setField(term6374, term6374.getClass(), "next", null);
        setIntField(term6374, term6374.getClass(), "type", 0);
        setIntField(term6374, term6374.getClass(), "intValue", 0);
        setField(term6374, term6374.getClass(), "objectValue", null);
        setField(term6370, term6370.getClass(), "propListHead", term6374);
        setIntField(term6370, term6370.getClass(), "sourcePosition", 1236004505);
        setField(term6370, term6370.getClass(), "jsType", null);
        setField(term6370, term6370.getClass(), "parent", null);
        setField(term6369, term6369.getClass(), "next", term6370);
        setIntField(term6375, term6375.getClass(), "type", 0);
        setField(term6375, term6375.getClass(), "next", null);
        setField(term6375, term6375.getClass(), "first", null);
        setField(term6375, term6375.getClass(), "last", null);
        setField(term6375, term6375.getClass(), "propListHead", null);
        setIntField(term6375, term6375.getClass(), "sourcePosition", 0);
        setField(term6375, term6375.getClass(), "jsType", null);
        setField(term6375, term6375.getClass(), "parent", null);
        setField(term6369, term6369.getClass(), "first", term6375);
        setIntField(term6376, term6376.getClass(), "type", 0);
        setField(term6376, term6376.getClass(), "next", null);
        setField(term6376, term6376.getClass(), "first", null);
        setField(term6376, term6376.getClass(), "last", null);
        setField(term6376, term6376.getClass(), "propListHead", null);
        setIntField(term6376, term6376.getClass(), "sourcePosition", 0);
        setField(term6376, term6376.getClass(), "jsType", null);
        setField(term6376, term6376.getClass(), "parent", null);
        setField(term6369, term6369.getClass(), "last", term6376);
        setField(term6377, term6377.getClass(), "next", null);
        setIntField(term6377, term6377.getClass(), "type", 0);
        setIntField(term6377, term6377.getClass(), "intValue", 0);
        setField(term6377, term6377.getClass(), "objectValue", null);
        setField(term6369, term6369.getClass(), "propListHead", term6377);
        setIntField(term6369, term6369.getClass(), "sourcePosition", 1050765721);
        setField(term6369, term6369.getClass(), "jsType", null);
        setField(term6369, term6369.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term652;
        Object retValue = callMethod(klass, "isGet", argTypes, null, args);
        assertTrue(recursiveEquals(term652, term6369));
        assertTrue(recursiveEquals(retValue, false));
    }

};


