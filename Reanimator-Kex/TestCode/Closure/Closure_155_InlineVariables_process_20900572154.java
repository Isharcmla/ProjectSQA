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
        Class<? extends Object> term2591 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term2590 = ((Class) term2591).getDeclaredField((String) "ALL");
        ((Field) term2590).setAccessible(true);
        Object enum6 = ((Field) term2590).get((Object) null);
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
        Object term360 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term363 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term366 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term370 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term373 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term376 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term353, term353.getClass(), "type", 391863371);
        setIntField(term355, term355.getClass(), "type", -2038273078);
        setIntField(term357, term357.getClass(), "type", 0);
        setField(term357, term357.getClass(), "next", null);
        setField(term357, term357.getClass(), "first", null);
        setField(term357, term357.getClass(), "last", null);
        setField(term357, term357.getClass(), "propListHead", null);
        setIntField(term357, term357.getClass(), "sourcePosition", 0);
        setField(term357, term357.getClass(), "jsType", null);
        setField(term357, term357.getClass(), "parent", null);
        setField(term355, term355.getClass(), "next", term357);
        setIntField(term360, term360.getClass(), "type", 0);
        setField(term360, term360.getClass(), "next", null);
        setField(term360, term360.getClass(), "first", null);
        setField(term360, term360.getClass(), "last", null);
        setField(term360, term360.getClass(), "propListHead", null);
        setIntField(term360, term360.getClass(), "sourcePosition", 0);
        setField(term360, term360.getClass(), "jsType", null);
        setField(term360, term360.getClass(), "parent", null);
        setField(term355, term355.getClass(), "first", term360);
        setIntField(term363, term363.getClass(), "type", 0);
        setField(term363, term363.getClass(), "next", null);
        setField(term363, term363.getClass(), "first", null);
        setField(term363, term363.getClass(), "last", null);
        setField(term363, term363.getClass(), "propListHead", null);
        setIntField(term363, term363.getClass(), "sourcePosition", 0);
        setField(term363, term363.getClass(), "jsType", null);
        setField(term363, term363.getClass(), "parent", null);
        setField(term355, term355.getClass(), "last", term363);
        setField(term366, term366.getClass(), "next", null);
        setIntField(term366, term366.getClass(), "type", 0);
        setIntField(term366, term366.getClass(), "intValue", 0);
        setField(term366, term366.getClass(), "objectValue", null);
        setField(term355, term355.getClass(), "propListHead", term366);
        setIntField(term355, term355.getClass(), "sourcePosition", 1725571209);
        setField(term355, term355.getClass(), "jsType", null);
        setField(term355, term355.getClass(), "parent", null);
        setField(term353, term353.getClass(), "next", term355);
        setIntField(term370, term370.getClass(), "type", 0);
        setField(term370, term370.getClass(), "next", null);
        setField(term370, term370.getClass(), "first", null);
        setField(term370, term370.getClass(), "last", null);
        setField(term370, term370.getClass(), "propListHead", null);
        setIntField(term370, term370.getClass(), "sourcePosition", 0);
        setField(term370, term370.getClass(), "jsType", null);
        setField(term370, term370.getClass(), "parent", null);
        setField(term353, term353.getClass(), "first", term370);
        setIntField(term373, term373.getClass(), "type", 0);
        setField(term373, term373.getClass(), "next", null);
        setField(term373, term373.getClass(), "first", null);
        setField(term373, term373.getClass(), "last", null);
        setField(term373, term373.getClass(), "propListHead", null);
        setIntField(term373, term373.getClass(), "sourcePosition", 0);
        setField(term373, term373.getClass(), "jsType", null);
        setField(term373, term373.getClass(), "parent", null);
        setField(term353, term353.getClass(), "last", term373);
        setField(term376, term376.getClass(), "next", null);
        setIntField(term376, term376.getClass(), "type", 0);
        setIntField(term376, term376.getClass(), "intValue", 0);
        setField(term376, term376.getClass(), "objectValue", null);
        setField(term353, term353.getClass(), "propListHead", term376);
        setIntField(term353, term353.getClass(), "sourcePosition", -522618178);
        setField(term353, term353.getClass(), "jsType", null);
        setField(term353, term353.getClass(), "parent", null);
        term380 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term382 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term384 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term387 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term390 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term393 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term397 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term400 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term403 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term380, term380.getClass(), "type", 597278769);
        setIntField(term382, term382.getClass(), "type", 1048535127);
        setIntField(term384, term384.getClass(), "type", 0);
        setField(term384, term384.getClass(), "next", null);
        setField(term384, term384.getClass(), "first", null);
        setField(term384, term384.getClass(), "last", null);
        setField(term384, term384.getClass(), "propListHead", null);
        setIntField(term384, term384.getClass(), "sourcePosition", 0);
        setField(term384, term384.getClass(), "jsType", null);
        setField(term384, term384.getClass(), "parent", null);
        setField(term382, term382.getClass(), "next", term384);
        setIntField(term387, term387.getClass(), "type", 0);
        setField(term387, term387.getClass(), "next", null);
        setField(term387, term387.getClass(), "first", null);
        setField(term387, term387.getClass(), "last", null);
        setField(term387, term387.getClass(), "propListHead", null);
        setIntField(term387, term387.getClass(), "sourcePosition", 0);
        setField(term387, term387.getClass(), "jsType", null);
        setField(term387, term387.getClass(), "parent", null);
        setField(term382, term382.getClass(), "first", term387);
        setIntField(term390, term390.getClass(), "type", 0);
        setField(term390, term390.getClass(), "next", null);
        setField(term390, term390.getClass(), "first", null);
        setField(term390, term390.getClass(), "last", null);
        setField(term390, term390.getClass(), "propListHead", null);
        setIntField(term390, term390.getClass(), "sourcePosition", 0);
        setField(term390, term390.getClass(), "jsType", null);
        setField(term390, term390.getClass(), "parent", null);
        setField(term382, term382.getClass(), "last", term390);
        setField(term393, term393.getClass(), "next", null);
        setIntField(term393, term393.getClass(), "type", 0);
        setIntField(term393, term393.getClass(), "intValue", 0);
        setField(term393, term393.getClass(), "objectValue", null);
        setField(term382, term382.getClass(), "propListHead", term393);
        setIntField(term382, term382.getClass(), "sourcePosition", -2068769794);
        setField(term382, term382.getClass(), "jsType", null);
        setField(term382, term382.getClass(), "parent", null);
        setField(term380, term380.getClass(), "next", term382);
        setIntField(term397, term397.getClass(), "type", 0);
        setField(term397, term397.getClass(), "next", null);
        setField(term397, term397.getClass(), "first", null);
        setField(term397, term397.getClass(), "last", null);
        setField(term397, term397.getClass(), "propListHead", null);
        setIntField(term397, term397.getClass(), "sourcePosition", 0);
        setField(term397, term397.getClass(), "jsType", null);
        setField(term397, term397.getClass(), "parent", null);
        setField(term380, term380.getClass(), "first", term397);
        setIntField(term400, term400.getClass(), "type", 0);
        setField(term400, term400.getClass(), "next", null);
        setField(term400, term400.getClass(), "first", null);
        setField(term400, term400.getClass(), "last", null);
        setField(term400, term400.getClass(), "propListHead", null);
        setIntField(term400, term400.getClass(), "sourcePosition", 0);
        setField(term400, term400.getClass(), "jsType", null);
        setField(term400, term400.getClass(), "parent", null);
        setField(term380, term380.getClass(), "last", term400);
        setField(term403, term403.getClass(), "next", null);
        setIntField(term403, term403.getClass(), "type", 0);
        setIntField(term403, term403.getClass(), "intValue", 0);
        setField(term403, term403.getClass(), "objectValue", null);
        setField(term380, term380.getClass(), "propListHead", term403);
        setIntField(term380, term380.getClass(), "sourcePosition", -117576464);
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


