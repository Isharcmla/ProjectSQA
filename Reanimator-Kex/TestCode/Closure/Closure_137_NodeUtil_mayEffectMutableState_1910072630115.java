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

public class NodeUtil_mayEffectMutableState_1910072630115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term269;
     Object term4485;

    public NodeUtil_mayEffectMutableState_1910072630115() {
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
        term4485 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4486 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4487 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4488 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4489 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4490 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term4491 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4492 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4493 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term4485, term4485.getClass(), "type", -1801760683);
        setIntField(term4486, term4486.getClass(), "type", -893623680);
        setIntField(term4487, term4487.getClass(), "type", 0);
        setField(term4487, term4487.getClass(), "next", null);
        setField(term4487, term4487.getClass(), "first", null);
        setField(term4487, term4487.getClass(), "last", null);
        setField(term4487, term4487.getClass(), "propListHead", null);
        setIntField(term4487, term4487.getClass(), "sourcePosition", 0);
        setField(term4487, term4487.getClass(), "jsType", null);
        setField(term4487, term4487.getClass(), "parent", null);
        setField(term4486, term4486.getClass(), "next", term4487);
        setIntField(term4488, term4488.getClass(), "type", 0);
        setField(term4488, term4488.getClass(), "next", null);
        setField(term4488, term4488.getClass(), "first", null);
        setField(term4488, term4488.getClass(), "last", null);
        setField(term4488, term4488.getClass(), "propListHead", null);
        setIntField(term4488, term4488.getClass(), "sourcePosition", 0);
        setField(term4488, term4488.getClass(), "jsType", null);
        setField(term4488, term4488.getClass(), "parent", null);
        setField(term4486, term4486.getClass(), "first", term4488);
        setIntField(term4489, term4489.getClass(), "type", 0);
        setField(term4489, term4489.getClass(), "next", null);
        setField(term4489, term4489.getClass(), "first", null);
        setField(term4489, term4489.getClass(), "last", null);
        setField(term4489, term4489.getClass(), "propListHead", null);
        setIntField(term4489, term4489.getClass(), "sourcePosition", 0);
        setField(term4489, term4489.getClass(), "jsType", null);
        setField(term4489, term4489.getClass(), "parent", null);
        setField(term4486, term4486.getClass(), "last", term4489);
        setField(term4490, term4490.getClass(), "next", null);
        setIntField(term4490, term4490.getClass(), "type", 0);
        setIntField(term4490, term4490.getClass(), "intValue", 0);
        setField(term4490, term4490.getClass(), "objectValue", null);
        setField(term4486, term4486.getClass(), "propListHead", term4490);
        setIntField(term4486, term4486.getClass(), "sourcePosition", 1045657203);
        setField(term4486, term4486.getClass(), "jsType", null);
        setField(term4486, term4486.getClass(), "parent", null);
        setField(term4485, term4485.getClass(), "next", term4486);
        setIntField(term4491, term4491.getClass(), "type", 0);
        setField(term4491, term4491.getClass(), "next", null);
        setField(term4491, term4491.getClass(), "first", null);
        setField(term4491, term4491.getClass(), "last", null);
        setField(term4491, term4491.getClass(), "propListHead", null);
        setIntField(term4491, term4491.getClass(), "sourcePosition", 0);
        setField(term4491, term4491.getClass(), "jsType", null);
        setField(term4491, term4491.getClass(), "parent", null);
        setField(term4485, term4485.getClass(), "first", term4491);
        setIntField(term4492, term4492.getClass(), "type", 0);
        setField(term4492, term4492.getClass(), "next", null);
        setField(term4492, term4492.getClass(), "first", null);
        setField(term4492, term4492.getClass(), "last", null);
        setField(term4492, term4492.getClass(), "propListHead", null);
        setIntField(term4492, term4492.getClass(), "sourcePosition", 0);
        setField(term4492, term4492.getClass(), "jsType", null);
        setField(term4492, term4492.getClass(), "parent", null);
        setField(term4485, term4485.getClass(), "last", term4492);
        setField(term4493, term4493.getClass(), "next", null);
        setIntField(term4493, term4493.getClass(), "type", 0);
        setIntField(term4493, term4493.getClass(), "intValue", 0);
        setField(term4493, term4493.getClass(), "objectValue", null);
        setField(term4485, term4485.getClass(), "propListHead", term4493);
        setIntField(term4485, term4485.getClass(), "sourcePosition", 1386130016);
        setField(term4485, term4485.getClass(), "jsType", null);
        setField(term4485, term4485.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term269;
        callMethod(klass, "mayEffectMutableState", argTypes, null, args);
        assertTrue(recursiveEquals(term269, term4485));
    }

};


