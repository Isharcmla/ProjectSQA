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

public class NodeUtil_isNumericResultHelper_1608168361189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term941;
     Object term10251;

    public NodeUtil_isNumericResultHelper_1608168361189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term941 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term943 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term945 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term948 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term951 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term954 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term958 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term961 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term964 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term941, term941.getClass(), "type", -100825168);
        setIntField(term943, term943.getClass(), "type", -233024044);
        setIntField(term945, term945.getClass(), "type", 0);
        setField(term945, term945.getClass(), "next", null);
        setField(term945, term945.getClass(), "first", null);
        setField(term945, term945.getClass(), "last", null);
        setField(term945, term945.getClass(), "propListHead", null);
        setIntField(term945, term945.getClass(), "sourcePosition", 0);
        setField(term945, term945.getClass(), "jsType", null);
        setField(term945, term945.getClass(), "parent", null);
        setField(term943, term943.getClass(), "next", term945);
        setIntField(term948, term948.getClass(), "type", 0);
        setField(term948, term948.getClass(), "next", null);
        setField(term948, term948.getClass(), "first", null);
        setField(term948, term948.getClass(), "last", null);
        setField(term948, term948.getClass(), "propListHead", null);
        setIntField(term948, term948.getClass(), "sourcePosition", 0);
        setField(term948, term948.getClass(), "jsType", null);
        setField(term948, term948.getClass(), "parent", null);
        setField(term943, term943.getClass(), "first", term948);
        setIntField(term951, term951.getClass(), "type", 0);
        setField(term951, term951.getClass(), "next", null);
        setField(term951, term951.getClass(), "first", null);
        setField(term951, term951.getClass(), "last", null);
        setField(term951, term951.getClass(), "propListHead", null);
        setIntField(term951, term951.getClass(), "sourcePosition", 0);
        setField(term951, term951.getClass(), "jsType", null);
        setField(term951, term951.getClass(), "parent", null);
        setField(term943, term943.getClass(), "last", term951);
        setField(term954, term954.getClass(), "next", null);
        setIntField(term954, term954.getClass(), "type", 0);
        setIntField(term954, term954.getClass(), "intValue", 0);
        setField(term954, term954.getClass(), "objectValue", null);
        setField(term943, term943.getClass(), "propListHead", term954);
        setIntField(term943, term943.getClass(), "sourcePosition", -828982065);
        setField(term943, term943.getClass(), "jsType", null);
        setField(term943, term943.getClass(), "parent", null);
        setField(term941, term941.getClass(), "next", term943);
        setIntField(term958, term958.getClass(), "type", 0);
        setField(term958, term958.getClass(), "next", null);
        setField(term958, term958.getClass(), "first", null);
        setField(term958, term958.getClass(), "last", null);
        setField(term958, term958.getClass(), "propListHead", null);
        setIntField(term958, term958.getClass(), "sourcePosition", 0);
        setField(term958, term958.getClass(), "jsType", null);
        setField(term958, term958.getClass(), "parent", null);
        setField(term941, term941.getClass(), "first", term958);
        setIntField(term961, term961.getClass(), "type", 0);
        setField(term961, term961.getClass(), "next", null);
        setField(term961, term961.getClass(), "first", null);
        setField(term961, term961.getClass(), "last", null);
        setField(term961, term961.getClass(), "propListHead", null);
        setIntField(term961, term961.getClass(), "sourcePosition", 0);
        setField(term961, term961.getClass(), "jsType", null);
        setField(term961, term961.getClass(), "parent", null);
        setField(term941, term941.getClass(), "last", term961);
        setField(term964, term964.getClass(), "next", null);
        setIntField(term964, term964.getClass(), "type", 0);
        setIntField(term964, term964.getClass(), "intValue", 0);
        setField(term964, term964.getClass(), "objectValue", null);
        setField(term941, term941.getClass(), "propListHead", term964);
        setIntField(term941, term941.getClass(), "sourcePosition", 1221443226);
        setField(term941, term941.getClass(), "jsType", null);
        setField(term941, term941.getClass(), "parent", null);
        term10251 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10252 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10253 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10254 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10255 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10256 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term10257 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10258 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10259 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term10251, term10251.getClass(), "type", -100825168);
        setIntField(term10252, term10252.getClass(), "type", -233024044);
        setIntField(term10253, term10253.getClass(), "type", 0);
        setField(term10253, term10253.getClass(), "next", null);
        setField(term10253, term10253.getClass(), "first", null);
        setField(term10253, term10253.getClass(), "last", null);
        setField(term10253, term10253.getClass(), "propListHead", null);
        setIntField(term10253, term10253.getClass(), "sourcePosition", 0);
        setField(term10253, term10253.getClass(), "jsType", null);
        setField(term10253, term10253.getClass(), "parent", null);
        setField(term10252, term10252.getClass(), "next", term10253);
        setIntField(term10254, term10254.getClass(), "type", 0);
        setField(term10254, term10254.getClass(), "next", null);
        setField(term10254, term10254.getClass(), "first", null);
        setField(term10254, term10254.getClass(), "last", null);
        setField(term10254, term10254.getClass(), "propListHead", null);
        setIntField(term10254, term10254.getClass(), "sourcePosition", 0);
        setField(term10254, term10254.getClass(), "jsType", null);
        setField(term10254, term10254.getClass(), "parent", null);
        setField(term10252, term10252.getClass(), "first", term10254);
        setIntField(term10255, term10255.getClass(), "type", 0);
        setField(term10255, term10255.getClass(), "next", null);
        setField(term10255, term10255.getClass(), "first", null);
        setField(term10255, term10255.getClass(), "last", null);
        setField(term10255, term10255.getClass(), "propListHead", null);
        setIntField(term10255, term10255.getClass(), "sourcePosition", 0);
        setField(term10255, term10255.getClass(), "jsType", null);
        setField(term10255, term10255.getClass(), "parent", null);
        setField(term10252, term10252.getClass(), "last", term10255);
        setField(term10256, term10256.getClass(), "next", null);
        setIntField(term10256, term10256.getClass(), "type", 0);
        setIntField(term10256, term10256.getClass(), "intValue", 0);
        setField(term10256, term10256.getClass(), "objectValue", null);
        setField(term10252, term10252.getClass(), "propListHead", term10256);
        setIntField(term10252, term10252.getClass(), "sourcePosition", -828982065);
        setField(term10252, term10252.getClass(), "jsType", null);
        setField(term10252, term10252.getClass(), "parent", null);
        setField(term10251, term10251.getClass(), "next", term10252);
        setIntField(term10257, term10257.getClass(), "type", 0);
        setField(term10257, term10257.getClass(), "next", null);
        setField(term10257, term10257.getClass(), "first", null);
        setField(term10257, term10257.getClass(), "last", null);
        setField(term10257, term10257.getClass(), "propListHead", null);
        setIntField(term10257, term10257.getClass(), "sourcePosition", 0);
        setField(term10257, term10257.getClass(), "jsType", null);
        setField(term10257, term10257.getClass(), "parent", null);
        setField(term10251, term10251.getClass(), "first", term10257);
        setIntField(term10258, term10258.getClass(), "type", 0);
        setField(term10258, term10258.getClass(), "next", null);
        setField(term10258, term10258.getClass(), "first", null);
        setField(term10258, term10258.getClass(), "last", null);
        setField(term10258, term10258.getClass(), "propListHead", null);
        setIntField(term10258, term10258.getClass(), "sourcePosition", 0);
        setField(term10258, term10258.getClass(), "jsType", null);
        setField(term10258, term10258.getClass(), "parent", null);
        setField(term10251, term10251.getClass(), "last", term10258);
        setField(term10259, term10259.getClass(), "next", null);
        setIntField(term10259, term10259.getClass(), "type", 0);
        setIntField(term10259, term10259.getClass(), "intValue", 0);
        setField(term10259, term10259.getClass(), "objectValue", null);
        setField(term10251, term10251.getClass(), "propListHead", term10259);
        setIntField(term10251, term10251.getClass(), "sourcePosition", 1221443226);
        setField(term10251, term10251.getClass(), "jsType", null);
        setField(term10251, term10251.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term941;
        Object retValue = callMethod(klass, "isNumericResultHelper", argTypes, null, args);
        assertTrue(recursiveEquals(term941, term10251));
        assertTrue(recursiveEquals(retValue, false));
    }

};


