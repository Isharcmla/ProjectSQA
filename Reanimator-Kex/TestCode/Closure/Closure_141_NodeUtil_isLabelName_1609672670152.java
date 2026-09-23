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

public class NodeUtil_isLabelName_1609672670152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1246;
     Object term8223;

    public NodeUtil_isLabelName_1609672670152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1246 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1248 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1250 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1253 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1256 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1259 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1263 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1266 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1269 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1246, term1246.getClass(), "type", 1692937831);
        setIntField(term1248, term1248.getClass(), "type", 1237549886);
        setIntField(term1250, term1250.getClass(), "type", 0);
        setField(term1250, term1250.getClass(), "next", null);
        setField(term1250, term1250.getClass(), "first", null);
        setField(term1250, term1250.getClass(), "last", null);
        setField(term1250, term1250.getClass(), "propListHead", null);
        setIntField(term1250, term1250.getClass(), "sourcePosition", 0);
        setField(term1250, term1250.getClass(), "jsType", null);
        setField(term1250, term1250.getClass(), "parent", null);
        setField(term1248, term1248.getClass(), "next", term1250);
        setIntField(term1253, term1253.getClass(), "type", 0);
        setField(term1253, term1253.getClass(), "next", null);
        setField(term1253, term1253.getClass(), "first", null);
        setField(term1253, term1253.getClass(), "last", null);
        setField(term1253, term1253.getClass(), "propListHead", null);
        setIntField(term1253, term1253.getClass(), "sourcePosition", 0);
        setField(term1253, term1253.getClass(), "jsType", null);
        setField(term1253, term1253.getClass(), "parent", null);
        setField(term1248, term1248.getClass(), "first", term1253);
        setIntField(term1256, term1256.getClass(), "type", 0);
        setField(term1256, term1256.getClass(), "next", null);
        setField(term1256, term1256.getClass(), "first", null);
        setField(term1256, term1256.getClass(), "last", null);
        setField(term1256, term1256.getClass(), "propListHead", null);
        setIntField(term1256, term1256.getClass(), "sourcePosition", 0);
        setField(term1256, term1256.getClass(), "jsType", null);
        setField(term1256, term1256.getClass(), "parent", null);
        setField(term1248, term1248.getClass(), "last", term1256);
        setField(term1259, term1259.getClass(), "next", null);
        setIntField(term1259, term1259.getClass(), "type", 0);
        setIntField(term1259, term1259.getClass(), "intValue", 0);
        setField(term1259, term1259.getClass(), "objectValue", null);
        setField(term1248, term1248.getClass(), "propListHead", term1259);
        setIntField(term1248, term1248.getClass(), "sourcePosition", 2068435279);
        setField(term1248, term1248.getClass(), "jsType", null);
        setField(term1248, term1248.getClass(), "parent", null);
        setField(term1246, term1246.getClass(), "next", term1248);
        setIntField(term1263, term1263.getClass(), "type", 0);
        setField(term1263, term1263.getClass(), "next", null);
        setField(term1263, term1263.getClass(), "first", null);
        setField(term1263, term1263.getClass(), "last", null);
        setField(term1263, term1263.getClass(), "propListHead", null);
        setIntField(term1263, term1263.getClass(), "sourcePosition", 0);
        setField(term1263, term1263.getClass(), "jsType", null);
        setField(term1263, term1263.getClass(), "parent", null);
        setField(term1246, term1246.getClass(), "first", term1263);
        setIntField(term1266, term1266.getClass(), "type", 0);
        setField(term1266, term1266.getClass(), "next", null);
        setField(term1266, term1266.getClass(), "first", null);
        setField(term1266, term1266.getClass(), "last", null);
        setField(term1266, term1266.getClass(), "propListHead", null);
        setIntField(term1266, term1266.getClass(), "sourcePosition", 0);
        setField(term1266, term1266.getClass(), "jsType", null);
        setField(term1266, term1266.getClass(), "parent", null);
        setField(term1246, term1246.getClass(), "last", term1266);
        setField(term1269, term1269.getClass(), "next", null);
        setIntField(term1269, term1269.getClass(), "type", 0);
        setIntField(term1269, term1269.getClass(), "intValue", 0);
        setField(term1269, term1269.getClass(), "objectValue", null);
        setField(term1246, term1246.getClass(), "propListHead", term1269);
        setIntField(term1246, term1246.getClass(), "sourcePosition", -1556527718);
        setField(term1246, term1246.getClass(), "jsType", null);
        setField(term1246, term1246.getClass(), "parent", null);
        term8223 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8224 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8225 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8226 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8227 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8228 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term8229 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8230 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8231 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term8223, term8223.getClass(), "type", 1692937831);
        setIntField(term8224, term8224.getClass(), "type", 1237549886);
        setIntField(term8225, term8225.getClass(), "type", 0);
        setField(term8225, term8225.getClass(), "next", null);
        setField(term8225, term8225.getClass(), "first", null);
        setField(term8225, term8225.getClass(), "last", null);
        setField(term8225, term8225.getClass(), "propListHead", null);
        setIntField(term8225, term8225.getClass(), "sourcePosition", 0);
        setField(term8225, term8225.getClass(), "jsType", null);
        setField(term8225, term8225.getClass(), "parent", null);
        setField(term8224, term8224.getClass(), "next", term8225);
        setIntField(term8226, term8226.getClass(), "type", 0);
        setField(term8226, term8226.getClass(), "next", null);
        setField(term8226, term8226.getClass(), "first", null);
        setField(term8226, term8226.getClass(), "last", null);
        setField(term8226, term8226.getClass(), "propListHead", null);
        setIntField(term8226, term8226.getClass(), "sourcePosition", 0);
        setField(term8226, term8226.getClass(), "jsType", null);
        setField(term8226, term8226.getClass(), "parent", null);
        setField(term8224, term8224.getClass(), "first", term8226);
        setIntField(term8227, term8227.getClass(), "type", 0);
        setField(term8227, term8227.getClass(), "next", null);
        setField(term8227, term8227.getClass(), "first", null);
        setField(term8227, term8227.getClass(), "last", null);
        setField(term8227, term8227.getClass(), "propListHead", null);
        setIntField(term8227, term8227.getClass(), "sourcePosition", 0);
        setField(term8227, term8227.getClass(), "jsType", null);
        setField(term8227, term8227.getClass(), "parent", null);
        setField(term8224, term8224.getClass(), "last", term8227);
        setField(term8228, term8228.getClass(), "next", null);
        setIntField(term8228, term8228.getClass(), "type", 0);
        setIntField(term8228, term8228.getClass(), "intValue", 0);
        setField(term8228, term8228.getClass(), "objectValue", null);
        setField(term8224, term8224.getClass(), "propListHead", term8228);
        setIntField(term8224, term8224.getClass(), "sourcePosition", 2068435279);
        setField(term8224, term8224.getClass(), "jsType", null);
        setField(term8224, term8224.getClass(), "parent", null);
        setField(term8223, term8223.getClass(), "next", term8224);
        setIntField(term8229, term8229.getClass(), "type", 0);
        setField(term8229, term8229.getClass(), "next", null);
        setField(term8229, term8229.getClass(), "first", null);
        setField(term8229, term8229.getClass(), "last", null);
        setField(term8229, term8229.getClass(), "propListHead", null);
        setIntField(term8229, term8229.getClass(), "sourcePosition", 0);
        setField(term8229, term8229.getClass(), "jsType", null);
        setField(term8229, term8229.getClass(), "parent", null);
        setField(term8223, term8223.getClass(), "first", term8229);
        setIntField(term8230, term8230.getClass(), "type", 0);
        setField(term8230, term8230.getClass(), "next", null);
        setField(term8230, term8230.getClass(), "first", null);
        setField(term8230, term8230.getClass(), "last", null);
        setField(term8230, term8230.getClass(), "propListHead", null);
        setIntField(term8230, term8230.getClass(), "sourcePosition", 0);
        setField(term8230, term8230.getClass(), "jsType", null);
        setField(term8230, term8230.getClass(), "parent", null);
        setField(term8223, term8223.getClass(), "last", term8230);
        setField(term8231, term8231.getClass(), "next", null);
        setIntField(term8231, term8231.getClass(), "type", 0);
        setIntField(term8231, term8231.getClass(), "intValue", 0);
        setField(term8231, term8231.getClass(), "objectValue", null);
        setField(term8223, term8223.getClass(), "propListHead", term8231);
        setIntField(term8223, term8223.getClass(), "sourcePosition", -1556527718);
        setField(term8223, term8223.getClass(), "jsType", null);
        setField(term8223, term8223.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1246;
        Object retValue = callMethod(klass, "isLabelName", argTypes, null, args);
        assertTrue(recursiveEquals(term1246, term8223));
        assertTrue(recursiveEquals(retValue, false));
    }

};


