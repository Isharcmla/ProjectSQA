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

public class NodeUtil_containsFunction_1761016032151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term816;
     Object term8394;

    public NodeUtil_containsFunction_1761016032151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term816 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term818 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term820 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term823 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term826 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term829 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term833 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term836 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term839 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term816, term816.getClass(), "type", 1048271679);
        setIntField(term818, term818.getClass(), "type", -2005784375);
        setIntField(term820, term820.getClass(), "type", 0);
        setField(term820, term820.getClass(), "next", null);
        setField(term820, term820.getClass(), "first", null);
        setField(term820, term820.getClass(), "last", null);
        setField(term820, term820.getClass(), "propListHead", null);
        setIntField(term820, term820.getClass(), "sourcePosition", 0);
        setField(term820, term820.getClass(), "jsType", null);
        setField(term820, term820.getClass(), "parent", null);
        setField(term818, term818.getClass(), "next", term820);
        setIntField(term823, term823.getClass(), "type", 0);
        setField(term823, term823.getClass(), "next", null);
        setField(term823, term823.getClass(), "first", null);
        setField(term823, term823.getClass(), "last", null);
        setField(term823, term823.getClass(), "propListHead", null);
        setIntField(term823, term823.getClass(), "sourcePosition", 0);
        setField(term823, term823.getClass(), "jsType", null);
        setField(term823, term823.getClass(), "parent", null);
        setField(term818, term818.getClass(), "first", term823);
        setIntField(term826, term826.getClass(), "type", 0);
        setField(term826, term826.getClass(), "next", null);
        setField(term826, term826.getClass(), "first", null);
        setField(term826, term826.getClass(), "last", null);
        setField(term826, term826.getClass(), "propListHead", null);
        setIntField(term826, term826.getClass(), "sourcePosition", 0);
        setField(term826, term826.getClass(), "jsType", null);
        setField(term826, term826.getClass(), "parent", null);
        setField(term818, term818.getClass(), "last", term826);
        setField(term829, term829.getClass(), "next", null);
        setIntField(term829, term829.getClass(), "type", 0);
        setIntField(term829, term829.getClass(), "intValue", 0);
        setField(term829, term829.getClass(), "objectValue", null);
        setField(term818, term818.getClass(), "propListHead", term829);
        setIntField(term818, term818.getClass(), "sourcePosition", 877649659);
        setField(term818, term818.getClass(), "jsType", null);
        setField(term818, term818.getClass(), "parent", null);
        setField(term816, term816.getClass(), "next", term818);
        setIntField(term833, term833.getClass(), "type", 0);
        setField(term833, term833.getClass(), "next", null);
        setField(term833, term833.getClass(), "first", null);
        setField(term833, term833.getClass(), "last", null);
        setField(term833, term833.getClass(), "propListHead", null);
        setIntField(term833, term833.getClass(), "sourcePosition", 0);
        setField(term833, term833.getClass(), "jsType", null);
        setField(term833, term833.getClass(), "parent", null);
        setField(term816, term816.getClass(), "first", term833);
        setIntField(term836, term836.getClass(), "type", 0);
        setField(term836, term836.getClass(), "next", null);
        setField(term836, term836.getClass(), "first", null);
        setField(term836, term836.getClass(), "last", null);
        setField(term836, term836.getClass(), "propListHead", null);
        setIntField(term836, term836.getClass(), "sourcePosition", 0);
        setField(term836, term836.getClass(), "jsType", null);
        setField(term836, term836.getClass(), "parent", null);
        setField(term816, term816.getClass(), "last", term836);
        setField(term839, term839.getClass(), "next", null);
        setIntField(term839, term839.getClass(), "type", 0);
        setIntField(term839, term839.getClass(), "intValue", 0);
        setField(term839, term839.getClass(), "objectValue", null);
        setField(term816, term816.getClass(), "propListHead", term839);
        setIntField(term816, term816.getClass(), "sourcePosition", -1332748804);
        setField(term816, term816.getClass(), "jsType", null);
        setField(term816, term816.getClass(), "parent", null);
        term8394 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8395 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8396 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8397 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8398 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8399 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term8400 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8401 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8402 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term8394, term8394.getClass(), "type", 1048271679);
        setIntField(term8395, term8395.getClass(), "type", -2005784375);
        setIntField(term8396, term8396.getClass(), "type", 0);
        setField(term8396, term8396.getClass(), "next", null);
        setField(term8396, term8396.getClass(), "first", null);
        setField(term8396, term8396.getClass(), "last", null);
        setField(term8396, term8396.getClass(), "propListHead", null);
        setIntField(term8396, term8396.getClass(), "sourcePosition", 0);
        setField(term8396, term8396.getClass(), "jsType", null);
        setField(term8396, term8396.getClass(), "parent", null);
        setField(term8395, term8395.getClass(), "next", term8396);
        setIntField(term8397, term8397.getClass(), "type", 0);
        setField(term8397, term8397.getClass(), "next", null);
        setField(term8397, term8397.getClass(), "first", null);
        setField(term8397, term8397.getClass(), "last", null);
        setField(term8397, term8397.getClass(), "propListHead", null);
        setIntField(term8397, term8397.getClass(), "sourcePosition", 0);
        setField(term8397, term8397.getClass(), "jsType", null);
        setField(term8397, term8397.getClass(), "parent", null);
        setField(term8395, term8395.getClass(), "first", term8397);
        setIntField(term8398, term8398.getClass(), "type", 0);
        setField(term8398, term8398.getClass(), "next", null);
        setField(term8398, term8398.getClass(), "first", null);
        setField(term8398, term8398.getClass(), "last", null);
        setField(term8398, term8398.getClass(), "propListHead", null);
        setIntField(term8398, term8398.getClass(), "sourcePosition", 0);
        setField(term8398, term8398.getClass(), "jsType", null);
        setField(term8398, term8398.getClass(), "parent", null);
        setField(term8395, term8395.getClass(), "last", term8398);
        setField(term8399, term8399.getClass(), "next", null);
        setIntField(term8399, term8399.getClass(), "type", 0);
        setIntField(term8399, term8399.getClass(), "intValue", 0);
        setField(term8399, term8399.getClass(), "objectValue", null);
        setField(term8395, term8395.getClass(), "propListHead", term8399);
        setIntField(term8395, term8395.getClass(), "sourcePosition", 877649659);
        setField(term8395, term8395.getClass(), "jsType", null);
        setField(term8395, term8395.getClass(), "parent", null);
        setField(term8394, term8394.getClass(), "next", term8395);
        setIntField(term8400, term8400.getClass(), "type", 0);
        setField(term8400, term8400.getClass(), "next", null);
        setField(term8400, term8400.getClass(), "first", null);
        setField(term8400, term8400.getClass(), "last", null);
        setField(term8400, term8400.getClass(), "propListHead", null);
        setIntField(term8400, term8400.getClass(), "sourcePosition", 0);
        setField(term8400, term8400.getClass(), "jsType", null);
        setField(term8400, term8400.getClass(), "parent", null);
        setField(term8394, term8394.getClass(), "first", term8400);
        setIntField(term8401, term8401.getClass(), "type", 0);
        setField(term8401, term8401.getClass(), "next", null);
        setField(term8401, term8401.getClass(), "first", null);
        setField(term8401, term8401.getClass(), "last", null);
        setField(term8401, term8401.getClass(), "propListHead", null);
        setIntField(term8401, term8401.getClass(), "sourcePosition", 0);
        setField(term8401, term8401.getClass(), "jsType", null);
        setField(term8401, term8401.getClass(), "parent", null);
        setField(term8394, term8394.getClass(), "last", term8401);
        setField(term8402, term8402.getClass(), "next", null);
        setIntField(term8402, term8402.getClass(), "type", 0);
        setIntField(term8402, term8402.getClass(), "intValue", 0);
        setField(term8402, term8402.getClass(), "objectValue", null);
        setField(term8394, term8394.getClass(), "propListHead", term8402);
        setIntField(term8394, term8394.getClass(), "sourcePosition", -1332748804);
        setField(term8394, term8394.getClass(), "jsType", null);
        setField(term8394, term8394.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term816;
        callMethod(klass, "containsFunction", argTypes, null, args);
        assertTrue(recursiveEquals(term816, term8394));
    }

};


