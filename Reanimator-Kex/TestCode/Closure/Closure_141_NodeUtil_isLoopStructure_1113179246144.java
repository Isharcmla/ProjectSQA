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

public class NodeUtil_isLoopStructure_1113179246144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term976;
     Object term7130;

    public NodeUtil_isLoopStructure_1113179246144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term976 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term978 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term980 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term983 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term986 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term989 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term993 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term996 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term999 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term976, term976.getClass(), "type", 765731371);
        setIntField(term978, term978.getClass(), "type", -1941343035);
        setIntField(term980, term980.getClass(), "type", 0);
        setField(term980, term980.getClass(), "next", null);
        setField(term980, term980.getClass(), "first", null);
        setField(term980, term980.getClass(), "last", null);
        setField(term980, term980.getClass(), "propListHead", null);
        setIntField(term980, term980.getClass(), "sourcePosition", 0);
        setField(term980, term980.getClass(), "jsType", null);
        setField(term980, term980.getClass(), "parent", null);
        setField(term978, term978.getClass(), "next", term980);
        setIntField(term983, term983.getClass(), "type", 0);
        setField(term983, term983.getClass(), "next", null);
        setField(term983, term983.getClass(), "first", null);
        setField(term983, term983.getClass(), "last", null);
        setField(term983, term983.getClass(), "propListHead", null);
        setIntField(term983, term983.getClass(), "sourcePosition", 0);
        setField(term983, term983.getClass(), "jsType", null);
        setField(term983, term983.getClass(), "parent", null);
        setField(term978, term978.getClass(), "first", term983);
        setIntField(term986, term986.getClass(), "type", 0);
        setField(term986, term986.getClass(), "next", null);
        setField(term986, term986.getClass(), "first", null);
        setField(term986, term986.getClass(), "last", null);
        setField(term986, term986.getClass(), "propListHead", null);
        setIntField(term986, term986.getClass(), "sourcePosition", 0);
        setField(term986, term986.getClass(), "jsType", null);
        setField(term986, term986.getClass(), "parent", null);
        setField(term978, term978.getClass(), "last", term986);
        setField(term989, term989.getClass(), "next", null);
        setIntField(term989, term989.getClass(), "type", 0);
        setIntField(term989, term989.getClass(), "intValue", 0);
        setField(term989, term989.getClass(), "objectValue", null);
        setField(term978, term978.getClass(), "propListHead", term989);
        setIntField(term978, term978.getClass(), "sourcePosition", -1748391876);
        setField(term978, term978.getClass(), "jsType", null);
        setField(term978, term978.getClass(), "parent", null);
        setField(term976, term976.getClass(), "next", term978);
        setIntField(term993, term993.getClass(), "type", 0);
        setField(term993, term993.getClass(), "next", null);
        setField(term993, term993.getClass(), "first", null);
        setField(term993, term993.getClass(), "last", null);
        setField(term993, term993.getClass(), "propListHead", null);
        setIntField(term993, term993.getClass(), "sourcePosition", 0);
        setField(term993, term993.getClass(), "jsType", null);
        setField(term993, term993.getClass(), "parent", null);
        setField(term976, term976.getClass(), "first", term993);
        setIntField(term996, term996.getClass(), "type", 0);
        setField(term996, term996.getClass(), "next", null);
        setField(term996, term996.getClass(), "first", null);
        setField(term996, term996.getClass(), "last", null);
        setField(term996, term996.getClass(), "propListHead", null);
        setIntField(term996, term996.getClass(), "sourcePosition", 0);
        setField(term996, term996.getClass(), "jsType", null);
        setField(term996, term996.getClass(), "parent", null);
        setField(term976, term976.getClass(), "last", term996);
        setField(term999, term999.getClass(), "next", null);
        setIntField(term999, term999.getClass(), "type", 0);
        setIntField(term999, term999.getClass(), "intValue", 0);
        setField(term999, term999.getClass(), "objectValue", null);
        setField(term976, term976.getClass(), "propListHead", term999);
        setIntField(term976, term976.getClass(), "sourcePosition", 43258317);
        setField(term976, term976.getClass(), "jsType", null);
        setField(term976, term976.getClass(), "parent", null);
        term7130 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7132 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7133 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7135 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7137 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7139 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term7141 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7142 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7143 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term7130, term7130.getClass(), "type", 765731371);
        setIntField(term7132, term7132.getClass(), "type", -1941343035);
        setIntField(term7133, term7133.getClass(), "type", 0);
        setField(term7133, term7133.getClass(), "next", null);
        setField(term7133, term7133.getClass(), "first", null);
        setField(term7133, term7133.getClass(), "last", null);
        setField(term7133, term7133.getClass(), "propListHead", null);
        setIntField(term7133, term7133.getClass(), "sourcePosition", 0);
        setField(term7133, term7133.getClass(), "jsType", null);
        setField(term7133, term7133.getClass(), "parent", null);
        setField(term7132, term7132.getClass(), "next", term7133);
        setIntField(term7135, term7135.getClass(), "type", 0);
        setField(term7135, term7135.getClass(), "next", null);
        setField(term7135, term7135.getClass(), "first", null);
        setField(term7135, term7135.getClass(), "last", null);
        setField(term7135, term7135.getClass(), "propListHead", null);
        setIntField(term7135, term7135.getClass(), "sourcePosition", 0);
        setField(term7135, term7135.getClass(), "jsType", null);
        setField(term7135, term7135.getClass(), "parent", null);
        setField(term7132, term7132.getClass(), "first", term7135);
        setIntField(term7137, term7137.getClass(), "type", 0);
        setField(term7137, term7137.getClass(), "next", null);
        setField(term7137, term7137.getClass(), "first", null);
        setField(term7137, term7137.getClass(), "last", null);
        setField(term7137, term7137.getClass(), "propListHead", null);
        setIntField(term7137, term7137.getClass(), "sourcePosition", 0);
        setField(term7137, term7137.getClass(), "jsType", null);
        setField(term7137, term7137.getClass(), "parent", null);
        setField(term7132, term7132.getClass(), "last", term7137);
        setField(term7139, term7139.getClass(), "next", null);
        setIntField(term7139, term7139.getClass(), "type", 0);
        setIntField(term7139, term7139.getClass(), "intValue", 0);
        setField(term7139, term7139.getClass(), "objectValue", null);
        setField(term7132, term7132.getClass(), "propListHead", term7139);
        setIntField(term7132, term7132.getClass(), "sourcePosition", -1748391876);
        setField(term7132, term7132.getClass(), "jsType", null);
        setField(term7132, term7132.getClass(), "parent", null);
        setField(term7130, term7130.getClass(), "next", term7132);
        setIntField(term7141, term7141.getClass(), "type", 0);
        setField(term7141, term7141.getClass(), "next", null);
        setField(term7141, term7141.getClass(), "first", null);
        setField(term7141, term7141.getClass(), "last", null);
        setField(term7141, term7141.getClass(), "propListHead", null);
        setIntField(term7141, term7141.getClass(), "sourcePosition", 0);
        setField(term7141, term7141.getClass(), "jsType", null);
        setField(term7141, term7141.getClass(), "parent", null);
        setField(term7130, term7130.getClass(), "first", term7141);
        setIntField(term7142, term7142.getClass(), "type", 0);
        setField(term7142, term7142.getClass(), "next", null);
        setField(term7142, term7142.getClass(), "first", null);
        setField(term7142, term7142.getClass(), "last", null);
        setField(term7142, term7142.getClass(), "propListHead", null);
        setIntField(term7142, term7142.getClass(), "sourcePosition", 0);
        setField(term7142, term7142.getClass(), "jsType", null);
        setField(term7142, term7142.getClass(), "parent", null);
        setField(term7130, term7130.getClass(), "last", term7142);
        setField(term7143, term7143.getClass(), "next", null);
        setIntField(term7143, term7143.getClass(), "type", 0);
        setIntField(term7143, term7143.getClass(), "intValue", 0);
        setField(term7143, term7143.getClass(), "objectValue", null);
        setField(term7130, term7130.getClass(), "propListHead", term7143);
        setIntField(term7130, term7130.getClass(), "sourcePosition", 43258317);
        setField(term7130, term7130.getClass(), "jsType", null);
        setField(term7130, term7130.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term976;
        Object retValue = callMethod(klass, "isLoopStructure", argTypes, null, args);
        assertTrue(recursiveEquals(term976, term7130));
        assertTrue(recursiveEquals(retValue, false));
    }

};


