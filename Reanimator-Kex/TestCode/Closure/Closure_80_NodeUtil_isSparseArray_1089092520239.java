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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodeUtil_isSparseArray_1089092520239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2324;

    public NodeUtil_isSparseArray_1089092520239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2324 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2326 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2328 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2331 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2334 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2337 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2341 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2344 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2347 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2324, term2324.getClass(), "type", -2027012650);
        setIntField(term2326, term2326.getClass(), "type", 2060027076);
        setIntField(term2328, term2328.getClass(), "type", 0);
        setField(term2328, term2328.getClass(), "next", null);
        setField(term2328, term2328.getClass(), "first", null);
        setField(term2328, term2328.getClass(), "last", null);
        setField(term2328, term2328.getClass(), "propListHead", null);
        setIntField(term2328, term2328.getClass(), "sourcePosition", 0);
        setField(term2328, term2328.getClass(), "jsType", null);
        setField(term2328, term2328.getClass(), "parent", null);
        setField(term2326, term2326.getClass(), "next", term2328);
        setIntField(term2331, term2331.getClass(), "type", 0);
        setField(term2331, term2331.getClass(), "next", null);
        setField(term2331, term2331.getClass(), "first", null);
        setField(term2331, term2331.getClass(), "last", null);
        setField(term2331, term2331.getClass(), "propListHead", null);
        setIntField(term2331, term2331.getClass(), "sourcePosition", 0);
        setField(term2331, term2331.getClass(), "jsType", null);
        setField(term2331, term2331.getClass(), "parent", null);
        setField(term2326, term2326.getClass(), "first", term2331);
        setIntField(term2334, term2334.getClass(), "type", 0);
        setField(term2334, term2334.getClass(), "next", null);
        setField(term2334, term2334.getClass(), "first", null);
        setField(term2334, term2334.getClass(), "last", null);
        setField(term2334, term2334.getClass(), "propListHead", null);
        setIntField(term2334, term2334.getClass(), "sourcePosition", 0);
        setField(term2334, term2334.getClass(), "jsType", null);
        setField(term2334, term2334.getClass(), "parent", null);
        setField(term2326, term2326.getClass(), "last", term2334);
        setField(term2337, term2337.getClass(), "next", null);
        setIntField(term2337, term2337.getClass(), "type", 0);
        setIntField(term2337, term2337.getClass(), "intValue", 0);
        setField(term2337, term2337.getClass(), "objectValue", null);
        setField(term2326, term2326.getClass(), "propListHead", term2337);
        setIntField(term2326, term2326.getClass(), "sourcePosition", 1425342686);
        setField(term2326, term2326.getClass(), "jsType", null);
        setField(term2326, term2326.getClass(), "parent", null);
        setField(term2324, term2324.getClass(), "next", term2326);
        setIntField(term2341, term2341.getClass(), "type", 0);
        setField(term2341, term2341.getClass(), "next", null);
        setField(term2341, term2341.getClass(), "first", null);
        setField(term2341, term2341.getClass(), "last", null);
        setField(term2341, term2341.getClass(), "propListHead", null);
        setIntField(term2341, term2341.getClass(), "sourcePosition", 0);
        setField(term2341, term2341.getClass(), "jsType", null);
        setField(term2341, term2341.getClass(), "parent", null);
        setField(term2324, term2324.getClass(), "first", term2341);
        setIntField(term2344, term2344.getClass(), "type", 0);
        setField(term2344, term2344.getClass(), "next", null);
        setField(term2344, term2344.getClass(), "first", null);
        setField(term2344, term2344.getClass(), "last", null);
        setField(term2344, term2344.getClass(), "propListHead", null);
        setIntField(term2344, term2344.getClass(), "sourcePosition", 0);
        setField(term2344, term2344.getClass(), "jsType", null);
        setField(term2344, term2344.getClass(), "parent", null);
        setField(term2324, term2324.getClass(), "last", term2344);
        setField(term2347, term2347.getClass(), "next", null);
        setIntField(term2347, term2347.getClass(), "type", 0);
        setIntField(term2347, term2347.getClass(), "intValue", 0);
        setField(term2347, term2347.getClass(), "objectValue", null);
        setField(term2324, term2324.getClass(), "propListHead", term2347);
        setIntField(term2324, term2324.getClass(), "sourcePosition", -1042470635);
        setField(term2324, term2324.getClass(), "jsType", null);
        setField(term2324, term2324.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2324;
        try {
            callMethod(klass, "isSparseArray", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


