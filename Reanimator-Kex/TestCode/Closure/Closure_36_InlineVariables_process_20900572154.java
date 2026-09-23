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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class InlineVariables_process_20900572154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term343;
     Object term353;
     Object term380;

    public InlineVariables_process_20900572154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2567 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term2566 = ((Class) term2567).getDeclaredField((String) "ALL");
        ((Field) term2566).setAccessible(true);
        Object enum6 = ((Field) term2566).get((Object) null);
        term343 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        Object term352 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables$IdentifyConstants"));
        setField(term343, term343.getClass(), "compiler", null);
        setField(term343, term343.getClass(), "mode", enum6);
        setBooleanField(term343, term343.getClass(), "inlineAllStrings", false);
        setField(term352, term352.getClass(), "this$0", null);
        setField(term343, term343.getClass(), "identifyConstants", term352);
        term353 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term355 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term357 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term359 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term361 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term364 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term368 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term370 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term375 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term353, term353.getClass(), "type", 568599855);
        setIntField(term355, term355.getClass(), "type", 1162663216);
        setIntField(term357, term357.getClass(), "type", 1484323161);
        setIntField(term359, term359.getClass(), "type", 391863371);
        setIntField(term361, term361.getClass(), "type", -1922583790);
        setField(term361, term361.getClass(), "next", null);
        setField(term361, term361.getClass(), "first", null);
        setField(term361, term361.getClass(), "last", null);
        setField(term361, term361.getClass(), "propListHead", null);
        setIntField(term361, term361.getClass(), "sourcePosition", 0);
        setField(term361, term361.getClass(), "jsType", null);
        setField(term361, term361.getClass(), "parent", null);
        setField(term359, term359.getClass(), "next", term361);
        setIntField(term364, term364.getClass(), "type", -616727354);
        setField(term364, term364.getClass(), "next", null);
        setField(term364, term364.getClass(), "first", null);
        setField(term364, term364.getClass(), "last", term361);
        setField(term364, term364.getClass(), "propListHead", null);
        setIntField(term364, term364.getClass(), "sourcePosition", 0);
        setField(term364, term364.getClass(), "jsType", null);
        setField(term364, term364.getClass(), "parent", null);
        setField(term359, term359.getClass(), "first", term364);
        setField(term359, term359.getClass(), "last", term357);
        setField(term359, term359.getClass(), "propListHead", null);
        setIntField(term359, term359.getClass(), "sourcePosition", 0);
        setField(term359, term359.getClass(), "jsType", null);
        setField(term359, term359.getClass(), "parent", null);
        setField(term357, term357.getClass(), "next", term359);
        setField(term357, term357.getClass(), "first", term361);
        setIntField(term368, term368.getClass(), "type", -2038273078);
        setIntField(term370, term370.getClass(), "type", 1227103734);
        setField(term370, term370.getClass(), "next", null);
        setField(term370, term370.getClass(), "first", term364);
        setField(term370, term370.getClass(), "last", term359);
        setField(term370, term370.getClass(), "propListHead", null);
        setIntField(term370, term370.getClass(), "sourcePosition", 0);
        setField(term370, term370.getClass(), "jsType", null);
        setField(term370, term370.getClass(), "parent", null);
        setField(term368, term368.getClass(), "next", term370);
        setField(term368, term368.getClass(), "first", term355);
        setField(term368, term368.getClass(), "last", term355);
        setField(term368, term368.getClass(), "propListHead", null);
        setIntField(term368, term368.getClass(), "sourcePosition", 0);
        setField(term368, term368.getClass(), "jsType", null);
        setField(term368, term368.getClass(), "parent", null);
        setField(term357, term357.getClass(), "last", term368);
        setField(term357, term357.getClass(), "propListHead", null);
        setIntField(term357, term357.getClass(), "sourcePosition", 0);
        setField(term357, term357.getClass(), "jsType", null);
        setField(term357, term357.getClass(), "parent", null);
        setField(term355, term355.getClass(), "next", term357);
        setIntField(term375, term375.getClass(), "type", -1339778481);
        setField(term375, term375.getClass(), "next", term368);
        setField(term375, term375.getClass(), "first", term370);
        setField(term375, term375.getClass(), "last", term353);
        setField(term375, term375.getClass(), "propListHead", null);
        setIntField(term375, term375.getClass(), "sourcePosition", 0);
        setField(term375, term375.getClass(), "jsType", null);
        setField(term375, term375.getClass(), "parent", null);
        setField(term355, term355.getClass(), "first", term375);
        setField(term355, term355.getClass(), "last", term375);
        setField(term355, term355.getClass(), "propListHead", null);
        setIntField(term355, term355.getClass(), "sourcePosition", 0);
        setField(term355, term355.getClass(), "jsType", null);
        setField(term355, term355.getClass(), "parent", null);
        setField(term353, term353.getClass(), "next", term355);
        setField(term353, term353.getClass(), "first", term359);
        setField(term353, term353.getClass(), "last", term361);
        setField(term353, term353.getClass(), "propListHead", null);
        setIntField(term353, term353.getClass(), "sourcePosition", 0);
        setField(term353, term353.getClass(), "jsType", null);
        setField(term353, term353.getClass(), "parent", null);
        term380 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term382 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term384 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term386 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term388 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term391 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term395 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term397 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term402 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term380, term380.getClass(), "type", 1725571209);
        setIntField(term382, term382.getClass(), "type", -522618178);
        setIntField(term384, term384.getClass(), "type", 1134449235);
        setIntField(term386, term386.getClass(), "type", -883034806);
        setIntField(term388, term388.getClass(), "type", 1585847225);
        setField(term388, term388.getClass(), "next", null);
        setField(term388, term388.getClass(), "first", null);
        setField(term388, term388.getClass(), "last", null);
        setField(term388, term388.getClass(), "propListHead", null);
        setIntField(term388, term388.getClass(), "sourcePosition", 0);
        setField(term388, term388.getClass(), "jsType", null);
        setField(term388, term388.getClass(), "parent", null);
        setField(term386, term386.getClass(), "next", term388);
        setIntField(term391, term391.getClass(), "type", 597278769);
        setField(term391, term391.getClass(), "next", null);
        setField(term391, term391.getClass(), "first", null);
        setField(term391, term391.getClass(), "last", term388);
        setField(term391, term391.getClass(), "propListHead", null);
        setIntField(term391, term391.getClass(), "sourcePosition", 0);
        setField(term391, term391.getClass(), "jsType", null);
        setField(term391, term391.getClass(), "parent", null);
        setField(term386, term386.getClass(), "first", term391);
        setField(term386, term386.getClass(), "last", term384);
        setField(term386, term386.getClass(), "propListHead", null);
        setIntField(term386, term386.getClass(), "sourcePosition", 0);
        setField(term386, term386.getClass(), "jsType", null);
        setField(term386, term386.getClass(), "parent", null);
        setField(term384, term384.getClass(), "next", term386);
        setField(term384, term384.getClass(), "first", term388);
        setIntField(term395, term395.getClass(), "type", -1456670397);
        setIntField(term397, term397.getClass(), "type", 1622346318);
        setField(term397, term397.getClass(), "next", null);
        setField(term397, term397.getClass(), "first", term391);
        setField(term397, term397.getClass(), "last", term386);
        setField(term397, term397.getClass(), "propListHead", null);
        setIntField(term397, term397.getClass(), "sourcePosition", 0);
        setField(term397, term397.getClass(), "jsType", null);
        setField(term397, term397.getClass(), "parent", null);
        setField(term395, term395.getClass(), "next", term397);
        setField(term395, term395.getClass(), "first", term382);
        setField(term395, term395.getClass(), "last", term382);
        setField(term395, term395.getClass(), "propListHead", null);
        setIntField(term395, term395.getClass(), "sourcePosition", 0);
        setField(term395, term395.getClass(), "jsType", null);
        setField(term395, term395.getClass(), "parent", null);
        setField(term384, term384.getClass(), "last", term395);
        setField(term384, term384.getClass(), "propListHead", null);
        setIntField(term384, term384.getClass(), "sourcePosition", 0);
        setField(term384, term384.getClass(), "jsType", null);
        setField(term384, term384.getClass(), "parent", null);
        setField(term382, term382.getClass(), "next", term384);
        setIntField(term402, term402.getClass(), "type", 1048535127);
        setField(term402, term402.getClass(), "next", term395);
        setField(term402, term402.getClass(), "first", term397);
        setField(term402, term402.getClass(), "last", term380);
        setField(term402, term402.getClass(), "propListHead", null);
        setIntField(term402, term402.getClass(), "sourcePosition", 0);
        setField(term402, term402.getClass(), "jsType", null);
        setField(term402, term402.getClass(), "parent", null);
        setField(term382, term382.getClass(), "first", term402);
        setField(term382, term382.getClass(), "last", term402);
        setField(term382, term382.getClass(), "propListHead", null);
        setIntField(term382, term382.getClass(), "sourcePosition", 0);
        setField(term382, term382.getClass(), "jsType", null);
        setField(term382, term382.getClass(), "parent", null);
        setField(term380, term380.getClass(), "next", term382);
        setField(term380, term380.getClass(), "first", term386);
        setField(term380, term380.getClass(), "last", term388);
        setField(term380, term380.getClass(), "propListHead", null);
        setIntField(term380, term380.getClass(), "sourcePosition", 0);
        setField(term380, term380.getClass(), "jsType", null);
        setField(term380, term380.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineVariables");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term353;
        args[1] = term380;
        try {
            callMethod(klass, "process", argTypes, term343, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


