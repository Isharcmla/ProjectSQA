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

public class NodeUtil_isSimpleFunctionObjectCall_1501140966192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2026;
     Object term12397;

    public NodeUtil_isSimpleFunctionObjectCall_1501140966192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2026 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2028 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2030 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2033 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2036 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2039 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2043 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2046 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2049 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2026, term2026.getClass(), "type", 797015478);
        setIntField(term2028, term2028.getClass(), "type", 43200329);
        setIntField(term2030, term2030.getClass(), "type", 0);
        setField(term2030, term2030.getClass(), "next", null);
        setField(term2030, term2030.getClass(), "first", null);
        setField(term2030, term2030.getClass(), "last", null);
        setField(term2030, term2030.getClass(), "propListHead", null);
        setIntField(term2030, term2030.getClass(), "sourcePosition", 0);
        setField(term2030, term2030.getClass(), "jsType", null);
        setField(term2030, term2030.getClass(), "parent", null);
        setField(term2028, term2028.getClass(), "next", term2030);
        setIntField(term2033, term2033.getClass(), "type", 0);
        setField(term2033, term2033.getClass(), "next", null);
        setField(term2033, term2033.getClass(), "first", null);
        setField(term2033, term2033.getClass(), "last", null);
        setField(term2033, term2033.getClass(), "propListHead", null);
        setIntField(term2033, term2033.getClass(), "sourcePosition", 0);
        setField(term2033, term2033.getClass(), "jsType", null);
        setField(term2033, term2033.getClass(), "parent", null);
        setField(term2028, term2028.getClass(), "first", term2033);
        setIntField(term2036, term2036.getClass(), "type", 0);
        setField(term2036, term2036.getClass(), "next", null);
        setField(term2036, term2036.getClass(), "first", null);
        setField(term2036, term2036.getClass(), "last", null);
        setField(term2036, term2036.getClass(), "propListHead", null);
        setIntField(term2036, term2036.getClass(), "sourcePosition", 0);
        setField(term2036, term2036.getClass(), "jsType", null);
        setField(term2036, term2036.getClass(), "parent", null);
        setField(term2028, term2028.getClass(), "last", term2036);
        setField(term2039, term2039.getClass(), "next", null);
        setIntField(term2039, term2039.getClass(), "type", 0);
        setIntField(term2039, term2039.getClass(), "intValue", 0);
        setField(term2039, term2039.getClass(), "objectValue", null);
        setField(term2028, term2028.getClass(), "propListHead", term2039);
        setIntField(term2028, term2028.getClass(), "sourcePosition", 1389452261);
        setField(term2028, term2028.getClass(), "jsType", null);
        setField(term2028, term2028.getClass(), "parent", null);
        setField(term2026, term2026.getClass(), "next", term2028);
        setIntField(term2043, term2043.getClass(), "type", 0);
        setField(term2043, term2043.getClass(), "next", null);
        setField(term2043, term2043.getClass(), "first", null);
        setField(term2043, term2043.getClass(), "last", null);
        setField(term2043, term2043.getClass(), "propListHead", null);
        setIntField(term2043, term2043.getClass(), "sourcePosition", 0);
        setField(term2043, term2043.getClass(), "jsType", null);
        setField(term2043, term2043.getClass(), "parent", null);
        setField(term2026, term2026.getClass(), "first", term2043);
        setIntField(term2046, term2046.getClass(), "type", 0);
        setField(term2046, term2046.getClass(), "next", null);
        setField(term2046, term2046.getClass(), "first", null);
        setField(term2046, term2046.getClass(), "last", null);
        setField(term2046, term2046.getClass(), "propListHead", null);
        setIntField(term2046, term2046.getClass(), "sourcePosition", 0);
        setField(term2046, term2046.getClass(), "jsType", null);
        setField(term2046, term2046.getClass(), "parent", null);
        setField(term2026, term2026.getClass(), "last", term2046);
        setField(term2049, term2049.getClass(), "next", null);
        setIntField(term2049, term2049.getClass(), "type", 0);
        setIntField(term2049, term2049.getClass(), "intValue", 0);
        setField(term2049, term2049.getClass(), "objectValue", null);
        setField(term2026, term2026.getClass(), "propListHead", term2049);
        setIntField(term2026, term2026.getClass(), "sourcePosition", 1615957955);
        setField(term2026, term2026.getClass(), "jsType", null);
        setField(term2026, term2026.getClass(), "parent", null);
        term12397 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12398 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12399 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12400 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12401 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12402 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term12403 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12404 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12405 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term12397, term12397.getClass(), "type", 797015478);
        setIntField(term12398, term12398.getClass(), "type", 43200329);
        setIntField(term12399, term12399.getClass(), "type", 0);
        setField(term12399, term12399.getClass(), "next", null);
        setField(term12399, term12399.getClass(), "first", null);
        setField(term12399, term12399.getClass(), "last", null);
        setField(term12399, term12399.getClass(), "propListHead", null);
        setIntField(term12399, term12399.getClass(), "sourcePosition", 0);
        setField(term12399, term12399.getClass(), "jsType", null);
        setField(term12399, term12399.getClass(), "parent", null);
        setField(term12398, term12398.getClass(), "next", term12399);
        setIntField(term12400, term12400.getClass(), "type", 0);
        setField(term12400, term12400.getClass(), "next", null);
        setField(term12400, term12400.getClass(), "first", null);
        setField(term12400, term12400.getClass(), "last", null);
        setField(term12400, term12400.getClass(), "propListHead", null);
        setIntField(term12400, term12400.getClass(), "sourcePosition", 0);
        setField(term12400, term12400.getClass(), "jsType", null);
        setField(term12400, term12400.getClass(), "parent", null);
        setField(term12398, term12398.getClass(), "first", term12400);
        setIntField(term12401, term12401.getClass(), "type", 0);
        setField(term12401, term12401.getClass(), "next", null);
        setField(term12401, term12401.getClass(), "first", null);
        setField(term12401, term12401.getClass(), "last", null);
        setField(term12401, term12401.getClass(), "propListHead", null);
        setIntField(term12401, term12401.getClass(), "sourcePosition", 0);
        setField(term12401, term12401.getClass(), "jsType", null);
        setField(term12401, term12401.getClass(), "parent", null);
        setField(term12398, term12398.getClass(), "last", term12401);
        setField(term12402, term12402.getClass(), "next", null);
        setIntField(term12402, term12402.getClass(), "type", 0);
        setIntField(term12402, term12402.getClass(), "intValue", 0);
        setField(term12402, term12402.getClass(), "objectValue", null);
        setField(term12398, term12398.getClass(), "propListHead", term12402);
        setIntField(term12398, term12398.getClass(), "sourcePosition", 1389452261);
        setField(term12398, term12398.getClass(), "jsType", null);
        setField(term12398, term12398.getClass(), "parent", null);
        setField(term12397, term12397.getClass(), "next", term12398);
        setIntField(term12403, term12403.getClass(), "type", 0);
        setField(term12403, term12403.getClass(), "next", null);
        setField(term12403, term12403.getClass(), "first", null);
        setField(term12403, term12403.getClass(), "last", null);
        setField(term12403, term12403.getClass(), "propListHead", null);
        setIntField(term12403, term12403.getClass(), "sourcePosition", 0);
        setField(term12403, term12403.getClass(), "jsType", null);
        setField(term12403, term12403.getClass(), "parent", null);
        setField(term12397, term12397.getClass(), "first", term12403);
        setIntField(term12404, term12404.getClass(), "type", 0);
        setField(term12404, term12404.getClass(), "next", null);
        setField(term12404, term12404.getClass(), "first", null);
        setField(term12404, term12404.getClass(), "last", null);
        setField(term12404, term12404.getClass(), "propListHead", null);
        setIntField(term12404, term12404.getClass(), "sourcePosition", 0);
        setField(term12404, term12404.getClass(), "jsType", null);
        setField(term12404, term12404.getClass(), "parent", null);
        setField(term12397, term12397.getClass(), "last", term12404);
        setField(term12405, term12405.getClass(), "next", null);
        setIntField(term12405, term12405.getClass(), "type", 0);
        setIntField(term12405, term12405.getClass(), "intValue", 0);
        setField(term12405, term12405.getClass(), "objectValue", null);
        setField(term12397, term12397.getClass(), "propListHead", term12405);
        setIntField(term12397, term12397.getClass(), "sourcePosition", 1615957955);
        setField(term12397, term12397.getClass(), "jsType", null);
        setField(term12397, term12397.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2026;
        Object retValue = callMethod(klass, "isSimpleFunctionObjectCall", argTypes, null, args);
        assertTrue(recursiveEquals(term2026, term12397));
        assertTrue(recursiveEquals(retValue, false));
    }

};


