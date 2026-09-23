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

public class NodeUtil_isSimpleOperator_1940912183129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term269;
     Object term5304;

    public NodeUtil_isSimpleOperator_1940912183129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term269 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term271 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term273 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term276 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term279 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term282 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term286 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term289 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term292 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term269, term269.getClass(), "type", 1532716628);
        setIntField(term271, term271.getClass(), "type", 691577392);
        setIntField(term273, term273.getClass(), "type", 0);
        setField(term273, term273.getClass(), "next", null);
        setField(term273, term273.getClass(), "first", null);
        setField(term273, term273.getClass(), "last", null);
        setField(term273, term273.getClass(), "propListHead", null);
        setIntField(term273, term273.getClass(), "sourcePosition", 0);
        setField(term273, term273.getClass(), "jsType", null);
        setField(term273, term273.getClass(), "parent", null);
        setField(term271, term271.getClass(), "next", term273);
        setIntField(term276, term276.getClass(), "type", 0);
        setField(term276, term276.getClass(), "next", null);
        setField(term276, term276.getClass(), "first", null);
        setField(term276, term276.getClass(), "last", null);
        setField(term276, term276.getClass(), "propListHead", null);
        setIntField(term276, term276.getClass(), "sourcePosition", 0);
        setField(term276, term276.getClass(), "jsType", null);
        setField(term276, term276.getClass(), "parent", null);
        setField(term271, term271.getClass(), "first", term276);
        setIntField(term279, term279.getClass(), "type", 0);
        setField(term279, term279.getClass(), "next", null);
        setField(term279, term279.getClass(), "first", null);
        setField(term279, term279.getClass(), "last", null);
        setField(term279, term279.getClass(), "propListHead", null);
        setIntField(term279, term279.getClass(), "sourcePosition", 0);
        setField(term279, term279.getClass(), "jsType", null);
        setField(term279, term279.getClass(), "parent", null);
        setField(term271, term271.getClass(), "last", term279);
        setField(term282, term282.getClass(), "next", null);
        setIntField(term282, term282.getClass(), "type", 0);
        setIntField(term282, term282.getClass(), "intValue", 0);
        setField(term282, term282.getClass(), "objectValue", null);
        setField(term271, term271.getClass(), "propListHead", term282);
        setIntField(term271, term271.getClass(), "sourcePosition", 906181092);
        setField(term271, term271.getClass(), "jsType", null);
        setField(term271, term271.getClass(), "parent", null);
        setField(term269, term269.getClass(), "next", term271);
        setIntField(term286, term286.getClass(), "type", 0);
        setField(term286, term286.getClass(), "next", null);
        setField(term286, term286.getClass(), "first", null);
        setField(term286, term286.getClass(), "last", null);
        setField(term286, term286.getClass(), "propListHead", null);
        setIntField(term286, term286.getClass(), "sourcePosition", 0);
        setField(term286, term286.getClass(), "jsType", null);
        setField(term286, term286.getClass(), "parent", null);
        setField(term269, term269.getClass(), "first", term286);
        setIntField(term289, term289.getClass(), "type", 0);
        setField(term289, term289.getClass(), "next", null);
        setField(term289, term289.getClass(), "first", null);
        setField(term289, term289.getClass(), "last", null);
        setField(term289, term289.getClass(), "propListHead", null);
        setIntField(term289, term289.getClass(), "sourcePosition", 0);
        setField(term289, term289.getClass(), "jsType", null);
        setField(term289, term289.getClass(), "parent", null);
        setField(term269, term269.getClass(), "last", term289);
        setField(term292, term292.getClass(), "next", null);
        setIntField(term292, term292.getClass(), "type", 0);
        setIntField(term292, term292.getClass(), "intValue", 0);
        setField(term292, term292.getClass(), "objectValue", null);
        setField(term269, term269.getClass(), "propListHead", term292);
        setIntField(term269, term269.getClass(), "sourcePosition", 1045657203);
        setField(term269, term269.getClass(), "jsType", null);
        setField(term269, term269.getClass(), "parent", null);
        term5304 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5305 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5306 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5307 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5308 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5309 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term5310 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5311 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5312 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term5304, term5304.getClass(), "type", 1532716628);
        setIntField(term5305, term5305.getClass(), "type", 691577392);
        setIntField(term5306, term5306.getClass(), "type", 0);
        setField(term5306, term5306.getClass(), "next", null);
        setField(term5306, term5306.getClass(), "first", null);
        setField(term5306, term5306.getClass(), "last", null);
        setField(term5306, term5306.getClass(), "propListHead", null);
        setIntField(term5306, term5306.getClass(), "sourcePosition", 0);
        setField(term5306, term5306.getClass(), "jsType", null);
        setField(term5306, term5306.getClass(), "parent", null);
        setField(term5305, term5305.getClass(), "next", term5306);
        setIntField(term5307, term5307.getClass(), "type", 0);
        setField(term5307, term5307.getClass(), "next", null);
        setField(term5307, term5307.getClass(), "first", null);
        setField(term5307, term5307.getClass(), "last", null);
        setField(term5307, term5307.getClass(), "propListHead", null);
        setIntField(term5307, term5307.getClass(), "sourcePosition", 0);
        setField(term5307, term5307.getClass(), "jsType", null);
        setField(term5307, term5307.getClass(), "parent", null);
        setField(term5305, term5305.getClass(), "first", term5307);
        setIntField(term5308, term5308.getClass(), "type", 0);
        setField(term5308, term5308.getClass(), "next", null);
        setField(term5308, term5308.getClass(), "first", null);
        setField(term5308, term5308.getClass(), "last", null);
        setField(term5308, term5308.getClass(), "propListHead", null);
        setIntField(term5308, term5308.getClass(), "sourcePosition", 0);
        setField(term5308, term5308.getClass(), "jsType", null);
        setField(term5308, term5308.getClass(), "parent", null);
        setField(term5305, term5305.getClass(), "last", term5308);
        setField(term5309, term5309.getClass(), "next", null);
        setIntField(term5309, term5309.getClass(), "type", 0);
        setIntField(term5309, term5309.getClass(), "intValue", 0);
        setField(term5309, term5309.getClass(), "objectValue", null);
        setField(term5305, term5305.getClass(), "propListHead", term5309);
        setIntField(term5305, term5305.getClass(), "sourcePosition", 906181092);
        setField(term5305, term5305.getClass(), "jsType", null);
        setField(term5305, term5305.getClass(), "parent", null);
        setField(term5304, term5304.getClass(), "next", term5305);
        setIntField(term5310, term5310.getClass(), "type", 0);
        setField(term5310, term5310.getClass(), "next", null);
        setField(term5310, term5310.getClass(), "first", null);
        setField(term5310, term5310.getClass(), "last", null);
        setField(term5310, term5310.getClass(), "propListHead", null);
        setIntField(term5310, term5310.getClass(), "sourcePosition", 0);
        setField(term5310, term5310.getClass(), "jsType", null);
        setField(term5310, term5310.getClass(), "parent", null);
        setField(term5304, term5304.getClass(), "first", term5310);
        setIntField(term5311, term5311.getClass(), "type", 0);
        setField(term5311, term5311.getClass(), "next", null);
        setField(term5311, term5311.getClass(), "first", null);
        setField(term5311, term5311.getClass(), "last", null);
        setField(term5311, term5311.getClass(), "propListHead", null);
        setIntField(term5311, term5311.getClass(), "sourcePosition", 0);
        setField(term5311, term5311.getClass(), "jsType", null);
        setField(term5311, term5311.getClass(), "parent", null);
        setField(term5304, term5304.getClass(), "last", term5311);
        setField(term5312, term5312.getClass(), "next", null);
        setIntField(term5312, term5312.getClass(), "type", 0);
        setIntField(term5312, term5312.getClass(), "intValue", 0);
        setField(term5312, term5312.getClass(), "objectValue", null);
        setField(term5304, term5304.getClass(), "propListHead", term5312);
        setIntField(term5304, term5304.getClass(), "sourcePosition", 1045657203);
        setField(term5304, term5304.getClass(), "jsType", null);
        setField(term5304, term5304.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term269;
        callMethod(klass, "isSimpleOperator", argTypes, null, args);
        assertTrue(recursiveEquals(term269, term5304));
    }

};


