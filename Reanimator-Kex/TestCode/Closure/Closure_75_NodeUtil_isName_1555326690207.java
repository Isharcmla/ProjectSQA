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

public class NodeUtil_isName_1555326690207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1379;
     Object term11959;

    public NodeUtil_isName_1555326690207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1379 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1381 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1383 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1386 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1389 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1392 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1396 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1399 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1402 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1379, term1379.getClass(), "type", -355469363);
        setIntField(term1381, term1381.getClass(), "type", -1415256843);
        setIntField(term1383, term1383.getClass(), "type", 0);
        setField(term1383, term1383.getClass(), "next", null);
        setField(term1383, term1383.getClass(), "first", null);
        setField(term1383, term1383.getClass(), "last", null);
        setField(term1383, term1383.getClass(), "propListHead", null);
        setIntField(term1383, term1383.getClass(), "sourcePosition", 0);
        setField(term1383, term1383.getClass(), "jsType", null);
        setField(term1383, term1383.getClass(), "parent", null);
        setField(term1381, term1381.getClass(), "next", term1383);
        setIntField(term1386, term1386.getClass(), "type", 0);
        setField(term1386, term1386.getClass(), "next", null);
        setField(term1386, term1386.getClass(), "first", null);
        setField(term1386, term1386.getClass(), "last", null);
        setField(term1386, term1386.getClass(), "propListHead", null);
        setIntField(term1386, term1386.getClass(), "sourcePosition", 0);
        setField(term1386, term1386.getClass(), "jsType", null);
        setField(term1386, term1386.getClass(), "parent", null);
        setField(term1381, term1381.getClass(), "first", term1386);
        setIntField(term1389, term1389.getClass(), "type", 0);
        setField(term1389, term1389.getClass(), "next", null);
        setField(term1389, term1389.getClass(), "first", null);
        setField(term1389, term1389.getClass(), "last", null);
        setField(term1389, term1389.getClass(), "propListHead", null);
        setIntField(term1389, term1389.getClass(), "sourcePosition", 0);
        setField(term1389, term1389.getClass(), "jsType", null);
        setField(term1389, term1389.getClass(), "parent", null);
        setField(term1381, term1381.getClass(), "last", term1389);
        setField(term1392, term1392.getClass(), "next", null);
        setIntField(term1392, term1392.getClass(), "type", 0);
        setIntField(term1392, term1392.getClass(), "intValue", 0);
        setField(term1392, term1392.getClass(), "objectValue", null);
        setField(term1381, term1381.getClass(), "propListHead", term1392);
        setIntField(term1381, term1381.getClass(), "sourcePosition", 173952451);
        setField(term1381, term1381.getClass(), "jsType", null);
        setField(term1381, term1381.getClass(), "parent", null);
        setField(term1379, term1379.getClass(), "next", term1381);
        setIntField(term1396, term1396.getClass(), "type", 0);
        setField(term1396, term1396.getClass(), "next", null);
        setField(term1396, term1396.getClass(), "first", null);
        setField(term1396, term1396.getClass(), "last", null);
        setField(term1396, term1396.getClass(), "propListHead", null);
        setIntField(term1396, term1396.getClass(), "sourcePosition", 0);
        setField(term1396, term1396.getClass(), "jsType", null);
        setField(term1396, term1396.getClass(), "parent", null);
        setField(term1379, term1379.getClass(), "first", term1396);
        setIntField(term1399, term1399.getClass(), "type", 0);
        setField(term1399, term1399.getClass(), "next", null);
        setField(term1399, term1399.getClass(), "first", null);
        setField(term1399, term1399.getClass(), "last", null);
        setField(term1399, term1399.getClass(), "propListHead", null);
        setIntField(term1399, term1399.getClass(), "sourcePosition", 0);
        setField(term1399, term1399.getClass(), "jsType", null);
        setField(term1399, term1399.getClass(), "parent", null);
        setField(term1379, term1379.getClass(), "last", term1399);
        setField(term1402, term1402.getClass(), "next", null);
        setIntField(term1402, term1402.getClass(), "type", 0);
        setIntField(term1402, term1402.getClass(), "intValue", 0);
        setField(term1402, term1402.getClass(), "objectValue", null);
        setField(term1379, term1379.getClass(), "propListHead", term1402);
        setIntField(term1379, term1379.getClass(), "sourcePosition", -1972033388);
        setField(term1379, term1379.getClass(), "jsType", null);
        setField(term1379, term1379.getClass(), "parent", null);
        term11959 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11960 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11961 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11962 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11963 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11964 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term11965 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11966 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11967 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term11959, term11959.getClass(), "type", -355469363);
        setIntField(term11960, term11960.getClass(), "type", -1415256843);
        setIntField(term11961, term11961.getClass(), "type", 0);
        setField(term11961, term11961.getClass(), "next", null);
        setField(term11961, term11961.getClass(), "first", null);
        setField(term11961, term11961.getClass(), "last", null);
        setField(term11961, term11961.getClass(), "propListHead", null);
        setIntField(term11961, term11961.getClass(), "sourcePosition", 0);
        setField(term11961, term11961.getClass(), "jsType", null);
        setField(term11961, term11961.getClass(), "parent", null);
        setField(term11960, term11960.getClass(), "next", term11961);
        setIntField(term11962, term11962.getClass(), "type", 0);
        setField(term11962, term11962.getClass(), "next", null);
        setField(term11962, term11962.getClass(), "first", null);
        setField(term11962, term11962.getClass(), "last", null);
        setField(term11962, term11962.getClass(), "propListHead", null);
        setIntField(term11962, term11962.getClass(), "sourcePosition", 0);
        setField(term11962, term11962.getClass(), "jsType", null);
        setField(term11962, term11962.getClass(), "parent", null);
        setField(term11960, term11960.getClass(), "first", term11962);
        setIntField(term11963, term11963.getClass(), "type", 0);
        setField(term11963, term11963.getClass(), "next", null);
        setField(term11963, term11963.getClass(), "first", null);
        setField(term11963, term11963.getClass(), "last", null);
        setField(term11963, term11963.getClass(), "propListHead", null);
        setIntField(term11963, term11963.getClass(), "sourcePosition", 0);
        setField(term11963, term11963.getClass(), "jsType", null);
        setField(term11963, term11963.getClass(), "parent", null);
        setField(term11960, term11960.getClass(), "last", term11963);
        setField(term11964, term11964.getClass(), "next", null);
        setIntField(term11964, term11964.getClass(), "type", 0);
        setIntField(term11964, term11964.getClass(), "intValue", 0);
        setField(term11964, term11964.getClass(), "objectValue", null);
        setField(term11960, term11960.getClass(), "propListHead", term11964);
        setIntField(term11960, term11960.getClass(), "sourcePosition", 173952451);
        setField(term11960, term11960.getClass(), "jsType", null);
        setField(term11960, term11960.getClass(), "parent", null);
        setField(term11959, term11959.getClass(), "next", term11960);
        setIntField(term11965, term11965.getClass(), "type", 0);
        setField(term11965, term11965.getClass(), "next", null);
        setField(term11965, term11965.getClass(), "first", null);
        setField(term11965, term11965.getClass(), "last", null);
        setField(term11965, term11965.getClass(), "propListHead", null);
        setIntField(term11965, term11965.getClass(), "sourcePosition", 0);
        setField(term11965, term11965.getClass(), "jsType", null);
        setField(term11965, term11965.getClass(), "parent", null);
        setField(term11959, term11959.getClass(), "first", term11965);
        setIntField(term11966, term11966.getClass(), "type", 0);
        setField(term11966, term11966.getClass(), "next", null);
        setField(term11966, term11966.getClass(), "first", null);
        setField(term11966, term11966.getClass(), "last", null);
        setField(term11966, term11966.getClass(), "propListHead", null);
        setIntField(term11966, term11966.getClass(), "sourcePosition", 0);
        setField(term11966, term11966.getClass(), "jsType", null);
        setField(term11966, term11966.getClass(), "parent", null);
        setField(term11959, term11959.getClass(), "last", term11966);
        setField(term11967, term11967.getClass(), "next", null);
        setIntField(term11967, term11967.getClass(), "type", 0);
        setIntField(term11967, term11967.getClass(), "intValue", 0);
        setField(term11967, term11967.getClass(), "objectValue", null);
        setField(term11959, term11959.getClass(), "propListHead", term11967);
        setIntField(term11959, term11959.getClass(), "sourcePosition", -1972033388);
        setField(term11959, term11959.getClass(), "jsType", null);
        setField(term11959, term11959.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1379;
        Object retValue = callMethod(klass, "isName", argTypes, null, args);
        assertTrue(recursiveEquals(term1379, term11959));
        assertTrue(recursiveEquals(retValue, false));
    }

};


