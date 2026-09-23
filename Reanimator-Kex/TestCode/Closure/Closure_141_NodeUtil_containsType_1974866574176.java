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
import java.lang.Integer;

public class NodeUtil_containsType_1974866574176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1978;
     Object term2005;
     Object term11399;

    public NodeUtil_containsType_1974866574176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1978 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1980 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1982 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1985 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1988 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1991 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1995 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1998 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2001 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1978, term1978.getClass(), "type", -355376034);
        setIntField(term1980, term1980.getClass(), "type", -337504086);
        setIntField(term1982, term1982.getClass(), "type", 0);
        setField(term1982, term1982.getClass(), "next", null);
        setField(term1982, term1982.getClass(), "first", null);
        setField(term1982, term1982.getClass(), "last", null);
        setField(term1982, term1982.getClass(), "propListHead", null);
        setIntField(term1982, term1982.getClass(), "sourcePosition", 0);
        setField(term1982, term1982.getClass(), "jsType", null);
        setField(term1982, term1982.getClass(), "parent", null);
        setField(term1980, term1980.getClass(), "next", term1982);
        setIntField(term1985, term1985.getClass(), "type", 0);
        setField(term1985, term1985.getClass(), "next", null);
        setField(term1985, term1985.getClass(), "first", null);
        setField(term1985, term1985.getClass(), "last", null);
        setField(term1985, term1985.getClass(), "propListHead", null);
        setIntField(term1985, term1985.getClass(), "sourcePosition", 0);
        setField(term1985, term1985.getClass(), "jsType", null);
        setField(term1985, term1985.getClass(), "parent", null);
        setField(term1980, term1980.getClass(), "first", term1985);
        setIntField(term1988, term1988.getClass(), "type", 0);
        setField(term1988, term1988.getClass(), "next", null);
        setField(term1988, term1988.getClass(), "first", null);
        setField(term1988, term1988.getClass(), "last", null);
        setField(term1988, term1988.getClass(), "propListHead", null);
        setIntField(term1988, term1988.getClass(), "sourcePosition", 0);
        setField(term1988, term1988.getClass(), "jsType", null);
        setField(term1988, term1988.getClass(), "parent", null);
        setField(term1980, term1980.getClass(), "last", term1988);
        setField(term1991, term1991.getClass(), "next", null);
        setIntField(term1991, term1991.getClass(), "type", 0);
        setIntField(term1991, term1991.getClass(), "intValue", 0);
        setField(term1991, term1991.getClass(), "objectValue", null);
        setField(term1980, term1980.getClass(), "propListHead", term1991);
        setIntField(term1980, term1980.getClass(), "sourcePosition", -1286686332);
        setField(term1980, term1980.getClass(), "jsType", null);
        setField(term1980, term1980.getClass(), "parent", null);
        setField(term1978, term1978.getClass(), "next", term1980);
        setIntField(term1995, term1995.getClass(), "type", 0);
        setField(term1995, term1995.getClass(), "next", null);
        setField(term1995, term1995.getClass(), "first", null);
        setField(term1995, term1995.getClass(), "last", null);
        setField(term1995, term1995.getClass(), "propListHead", null);
        setIntField(term1995, term1995.getClass(), "sourcePosition", 0);
        setField(term1995, term1995.getClass(), "jsType", null);
        setField(term1995, term1995.getClass(), "parent", null);
        setField(term1978, term1978.getClass(), "first", term1995);
        setIntField(term1998, term1998.getClass(), "type", 0);
        setField(term1998, term1998.getClass(), "next", null);
        setField(term1998, term1998.getClass(), "first", null);
        setField(term1998, term1998.getClass(), "last", null);
        setField(term1998, term1998.getClass(), "propListHead", null);
        setIntField(term1998, term1998.getClass(), "sourcePosition", 0);
        setField(term1998, term1998.getClass(), "jsType", null);
        setField(term1998, term1998.getClass(), "parent", null);
        setField(term1978, term1978.getClass(), "last", term1998);
        setField(term2001, term2001.getClass(), "next", null);
        setIntField(term2001, term2001.getClass(), "type", 0);
        setIntField(term2001, term2001.getClass(), "intValue", 0);
        setField(term2001, term2001.getClass(), "objectValue", null);
        setField(term1978, term1978.getClass(), "propListHead", term2001);
        setIntField(term1978, term1978.getClass(), "sourcePosition", -284885486);
        setField(term1978, term1978.getClass(), "jsType", null);
        setField(term1978, term1978.getClass(), "parent", null);
        term2005 = new Integer(1791984446);
        term11399 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11400 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11401 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11402 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11403 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11404 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term11405 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11406 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11407 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term11399, term11399.getClass(), "type", -355376034);
        setIntField(term11400, term11400.getClass(), "type", -337504086);
        setIntField(term11401, term11401.getClass(), "type", 0);
        setField(term11401, term11401.getClass(), "next", null);
        setField(term11401, term11401.getClass(), "first", null);
        setField(term11401, term11401.getClass(), "last", null);
        setField(term11401, term11401.getClass(), "propListHead", null);
        setIntField(term11401, term11401.getClass(), "sourcePosition", 0);
        setField(term11401, term11401.getClass(), "jsType", null);
        setField(term11401, term11401.getClass(), "parent", null);
        setField(term11400, term11400.getClass(), "next", term11401);
        setIntField(term11402, term11402.getClass(), "type", 0);
        setField(term11402, term11402.getClass(), "next", null);
        setField(term11402, term11402.getClass(), "first", null);
        setField(term11402, term11402.getClass(), "last", null);
        setField(term11402, term11402.getClass(), "propListHead", null);
        setIntField(term11402, term11402.getClass(), "sourcePosition", 0);
        setField(term11402, term11402.getClass(), "jsType", null);
        setField(term11402, term11402.getClass(), "parent", null);
        setField(term11400, term11400.getClass(), "first", term11402);
        setIntField(term11403, term11403.getClass(), "type", 0);
        setField(term11403, term11403.getClass(), "next", null);
        setField(term11403, term11403.getClass(), "first", null);
        setField(term11403, term11403.getClass(), "last", null);
        setField(term11403, term11403.getClass(), "propListHead", null);
        setIntField(term11403, term11403.getClass(), "sourcePosition", 0);
        setField(term11403, term11403.getClass(), "jsType", null);
        setField(term11403, term11403.getClass(), "parent", null);
        setField(term11400, term11400.getClass(), "last", term11403);
        setField(term11404, term11404.getClass(), "next", null);
        setIntField(term11404, term11404.getClass(), "type", 0);
        setIntField(term11404, term11404.getClass(), "intValue", 0);
        setField(term11404, term11404.getClass(), "objectValue", null);
        setField(term11400, term11400.getClass(), "propListHead", term11404);
        setIntField(term11400, term11400.getClass(), "sourcePosition", -1286686332);
        setField(term11400, term11400.getClass(), "jsType", null);
        setField(term11400, term11400.getClass(), "parent", null);
        setField(term11399, term11399.getClass(), "next", term11400);
        setIntField(term11405, term11405.getClass(), "type", 0);
        setField(term11405, term11405.getClass(), "next", null);
        setField(term11405, term11405.getClass(), "first", null);
        setField(term11405, term11405.getClass(), "last", null);
        setField(term11405, term11405.getClass(), "propListHead", null);
        setIntField(term11405, term11405.getClass(), "sourcePosition", 0);
        setField(term11405, term11405.getClass(), "jsType", null);
        setField(term11405, term11405.getClass(), "parent", null);
        setField(term11399, term11399.getClass(), "first", term11405);
        setIntField(term11406, term11406.getClass(), "type", 0);
        setField(term11406, term11406.getClass(), "next", null);
        setField(term11406, term11406.getClass(), "first", null);
        setField(term11406, term11406.getClass(), "last", null);
        setField(term11406, term11406.getClass(), "propListHead", null);
        setIntField(term11406, term11406.getClass(), "sourcePosition", 0);
        setField(term11406, term11406.getClass(), "jsType", null);
        setField(term11406, term11406.getClass(), "parent", null);
        setField(term11399, term11399.getClass(), "last", term11406);
        setField(term11407, term11407.getClass(), "next", null);
        setIntField(term11407, term11407.getClass(), "type", 0);
        setIntField(term11407, term11407.getClass(), "intValue", 0);
        setField(term11407, term11407.getClass(), "objectValue", null);
        setField(term11399, term11399.getClass(), "propListHead", term11407);
        setIntField(term11399, term11399.getClass(), "sourcePosition", -284885486);
        setField(term11399, term11399.getClass(), "jsType", null);
        setField(term11399, term11399.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1978;
        args[1] = term2005;
        callMethod(klass, "containsType", argTypes, null, args);
        assertTrue(recursiveEquals(term1978, 1791984446));
        assertTrue(recursiveEquals(term2005, term11399));
    }

};


