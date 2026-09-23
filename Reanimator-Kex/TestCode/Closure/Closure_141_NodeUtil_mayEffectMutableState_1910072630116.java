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

public class NodeUtil_mayEffectMutableState_1910072630116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term269;
     Object term4512;

    public NodeUtil_mayEffectMutableState_1910072630116() {
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
        setIntField(term269, term269.getClass(), "type", -1801760683);
        setIntField(term271, term271.getClass(), "type", -893623680);
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
        setIntField(term271, term271.getClass(), "sourcePosition", 1045657203);
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
        setIntField(term269, term269.getClass(), "sourcePosition", 1386130016);
        setField(term269, term269.getClass(), "jsType", null);
        setField(term269, term269.getClass(), "parent", null);
        term4512 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4513 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4514 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4515 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4516 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4517 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term4518 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4519 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4520 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term4512, term4512.getClass(), "type", -1801760683);
        setIntField(term4513, term4513.getClass(), "type", -893623680);
        setIntField(term4514, term4514.getClass(), "type", 0);
        setField(term4514, term4514.getClass(), "next", null);
        setField(term4514, term4514.getClass(), "first", null);
        setField(term4514, term4514.getClass(), "last", null);
        setField(term4514, term4514.getClass(), "propListHead", null);
        setIntField(term4514, term4514.getClass(), "sourcePosition", 0);
        setField(term4514, term4514.getClass(), "jsType", null);
        setField(term4514, term4514.getClass(), "parent", null);
        setField(term4513, term4513.getClass(), "next", term4514);
        setIntField(term4515, term4515.getClass(), "type", 0);
        setField(term4515, term4515.getClass(), "next", null);
        setField(term4515, term4515.getClass(), "first", null);
        setField(term4515, term4515.getClass(), "last", null);
        setField(term4515, term4515.getClass(), "propListHead", null);
        setIntField(term4515, term4515.getClass(), "sourcePosition", 0);
        setField(term4515, term4515.getClass(), "jsType", null);
        setField(term4515, term4515.getClass(), "parent", null);
        setField(term4513, term4513.getClass(), "first", term4515);
        setIntField(term4516, term4516.getClass(), "type", 0);
        setField(term4516, term4516.getClass(), "next", null);
        setField(term4516, term4516.getClass(), "first", null);
        setField(term4516, term4516.getClass(), "last", null);
        setField(term4516, term4516.getClass(), "propListHead", null);
        setIntField(term4516, term4516.getClass(), "sourcePosition", 0);
        setField(term4516, term4516.getClass(), "jsType", null);
        setField(term4516, term4516.getClass(), "parent", null);
        setField(term4513, term4513.getClass(), "last", term4516);
        setField(term4517, term4517.getClass(), "next", null);
        setIntField(term4517, term4517.getClass(), "type", 0);
        setIntField(term4517, term4517.getClass(), "intValue", 0);
        setField(term4517, term4517.getClass(), "objectValue", null);
        setField(term4513, term4513.getClass(), "propListHead", term4517);
        setIntField(term4513, term4513.getClass(), "sourcePosition", 1045657203);
        setField(term4513, term4513.getClass(), "jsType", null);
        setField(term4513, term4513.getClass(), "parent", null);
        setField(term4512, term4512.getClass(), "next", term4513);
        setIntField(term4518, term4518.getClass(), "type", 0);
        setField(term4518, term4518.getClass(), "next", null);
        setField(term4518, term4518.getClass(), "first", null);
        setField(term4518, term4518.getClass(), "last", null);
        setField(term4518, term4518.getClass(), "propListHead", null);
        setIntField(term4518, term4518.getClass(), "sourcePosition", 0);
        setField(term4518, term4518.getClass(), "jsType", null);
        setField(term4518, term4518.getClass(), "parent", null);
        setField(term4512, term4512.getClass(), "first", term4518);
        setIntField(term4519, term4519.getClass(), "type", 0);
        setField(term4519, term4519.getClass(), "next", null);
        setField(term4519, term4519.getClass(), "first", null);
        setField(term4519, term4519.getClass(), "last", null);
        setField(term4519, term4519.getClass(), "propListHead", null);
        setIntField(term4519, term4519.getClass(), "sourcePosition", 0);
        setField(term4519, term4519.getClass(), "jsType", null);
        setField(term4519, term4519.getClass(), "parent", null);
        setField(term4512, term4512.getClass(), "last", term4519);
        setField(term4520, term4520.getClass(), "next", null);
        setIntField(term4520, term4520.getClass(), "type", 0);
        setIntField(term4520, term4520.getClass(), "intValue", 0);
        setField(term4520, term4520.getClass(), "objectValue", null);
        setField(term4512, term4512.getClass(), "propListHead", term4520);
        setIntField(term4512, term4512.getClass(), "sourcePosition", 1386130016);
        setField(term4512, term4512.getClass(), "jsType", null);
        setField(term4512, term4512.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term269;
        callMethod(klass, "mayEffectMutableState", argTypes, null, args);
        assertTrue(recursiveEquals(term269, term4512));
    }

};


