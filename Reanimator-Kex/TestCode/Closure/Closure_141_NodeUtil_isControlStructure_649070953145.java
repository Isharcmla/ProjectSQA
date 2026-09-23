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

public class NodeUtil_isControlStructure_649070953145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1030;
     Object term7174;

    public NodeUtil_isControlStructure_649070953145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1030 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1032 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1034 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1037 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1040 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1043 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1047 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1050 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1053 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1030, term1030.getClass(), "type", -941356098);
        setIntField(term1032, term1032.getClass(), "type", 1374790203);
        setIntField(term1034, term1034.getClass(), "type", 0);
        setField(term1034, term1034.getClass(), "next", null);
        setField(term1034, term1034.getClass(), "first", null);
        setField(term1034, term1034.getClass(), "last", null);
        setField(term1034, term1034.getClass(), "propListHead", null);
        setIntField(term1034, term1034.getClass(), "sourcePosition", 0);
        setField(term1034, term1034.getClass(), "jsType", null);
        setField(term1034, term1034.getClass(), "parent", null);
        setField(term1032, term1032.getClass(), "next", term1034);
        setIntField(term1037, term1037.getClass(), "type", 0);
        setField(term1037, term1037.getClass(), "next", null);
        setField(term1037, term1037.getClass(), "first", null);
        setField(term1037, term1037.getClass(), "last", null);
        setField(term1037, term1037.getClass(), "propListHead", null);
        setIntField(term1037, term1037.getClass(), "sourcePosition", 0);
        setField(term1037, term1037.getClass(), "jsType", null);
        setField(term1037, term1037.getClass(), "parent", null);
        setField(term1032, term1032.getClass(), "first", term1037);
        setIntField(term1040, term1040.getClass(), "type", 0);
        setField(term1040, term1040.getClass(), "next", null);
        setField(term1040, term1040.getClass(), "first", null);
        setField(term1040, term1040.getClass(), "last", null);
        setField(term1040, term1040.getClass(), "propListHead", null);
        setIntField(term1040, term1040.getClass(), "sourcePosition", 0);
        setField(term1040, term1040.getClass(), "jsType", null);
        setField(term1040, term1040.getClass(), "parent", null);
        setField(term1032, term1032.getClass(), "last", term1040);
        setField(term1043, term1043.getClass(), "next", null);
        setIntField(term1043, term1043.getClass(), "type", 0);
        setIntField(term1043, term1043.getClass(), "intValue", 0);
        setField(term1043, term1043.getClass(), "objectValue", null);
        setField(term1032, term1032.getClass(), "propListHead", term1043);
        setIntField(term1032, term1032.getClass(), "sourcePosition", -525570815);
        setField(term1032, term1032.getClass(), "jsType", null);
        setField(term1032, term1032.getClass(), "parent", null);
        setField(term1030, term1030.getClass(), "next", term1032);
        setIntField(term1047, term1047.getClass(), "type", 0);
        setField(term1047, term1047.getClass(), "next", null);
        setField(term1047, term1047.getClass(), "first", null);
        setField(term1047, term1047.getClass(), "last", null);
        setField(term1047, term1047.getClass(), "propListHead", null);
        setIntField(term1047, term1047.getClass(), "sourcePosition", 0);
        setField(term1047, term1047.getClass(), "jsType", null);
        setField(term1047, term1047.getClass(), "parent", null);
        setField(term1030, term1030.getClass(), "first", term1047);
        setIntField(term1050, term1050.getClass(), "type", 0);
        setField(term1050, term1050.getClass(), "next", null);
        setField(term1050, term1050.getClass(), "first", null);
        setField(term1050, term1050.getClass(), "last", null);
        setField(term1050, term1050.getClass(), "propListHead", null);
        setIntField(term1050, term1050.getClass(), "sourcePosition", 0);
        setField(term1050, term1050.getClass(), "jsType", null);
        setField(term1050, term1050.getClass(), "parent", null);
        setField(term1030, term1030.getClass(), "last", term1050);
        setField(term1053, term1053.getClass(), "next", null);
        setIntField(term1053, term1053.getClass(), "type", 0);
        setIntField(term1053, term1053.getClass(), "intValue", 0);
        setField(term1053, term1053.getClass(), "objectValue", null);
        setField(term1030, term1030.getClass(), "propListHead", term1053);
        setIntField(term1030, term1030.getClass(), "sourcePosition", 754055848);
        setField(term1030, term1030.getClass(), "jsType", null);
        setField(term1030, term1030.getClass(), "parent", null);
        term7174 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7175 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7176 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7177 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7178 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7179 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term7180 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7181 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7182 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term7174, term7174.getClass(), "type", -941356098);
        setIntField(term7175, term7175.getClass(), "type", 1374790203);
        setIntField(term7176, term7176.getClass(), "type", 0);
        setField(term7176, term7176.getClass(), "next", null);
        setField(term7176, term7176.getClass(), "first", null);
        setField(term7176, term7176.getClass(), "last", null);
        setField(term7176, term7176.getClass(), "propListHead", null);
        setIntField(term7176, term7176.getClass(), "sourcePosition", 0);
        setField(term7176, term7176.getClass(), "jsType", null);
        setField(term7176, term7176.getClass(), "parent", null);
        setField(term7175, term7175.getClass(), "next", term7176);
        setIntField(term7177, term7177.getClass(), "type", 0);
        setField(term7177, term7177.getClass(), "next", null);
        setField(term7177, term7177.getClass(), "first", null);
        setField(term7177, term7177.getClass(), "last", null);
        setField(term7177, term7177.getClass(), "propListHead", null);
        setIntField(term7177, term7177.getClass(), "sourcePosition", 0);
        setField(term7177, term7177.getClass(), "jsType", null);
        setField(term7177, term7177.getClass(), "parent", null);
        setField(term7175, term7175.getClass(), "first", term7177);
        setIntField(term7178, term7178.getClass(), "type", 0);
        setField(term7178, term7178.getClass(), "next", null);
        setField(term7178, term7178.getClass(), "first", null);
        setField(term7178, term7178.getClass(), "last", null);
        setField(term7178, term7178.getClass(), "propListHead", null);
        setIntField(term7178, term7178.getClass(), "sourcePosition", 0);
        setField(term7178, term7178.getClass(), "jsType", null);
        setField(term7178, term7178.getClass(), "parent", null);
        setField(term7175, term7175.getClass(), "last", term7178);
        setField(term7179, term7179.getClass(), "next", null);
        setIntField(term7179, term7179.getClass(), "type", 0);
        setIntField(term7179, term7179.getClass(), "intValue", 0);
        setField(term7179, term7179.getClass(), "objectValue", null);
        setField(term7175, term7175.getClass(), "propListHead", term7179);
        setIntField(term7175, term7175.getClass(), "sourcePosition", -525570815);
        setField(term7175, term7175.getClass(), "jsType", null);
        setField(term7175, term7175.getClass(), "parent", null);
        setField(term7174, term7174.getClass(), "next", term7175);
        setIntField(term7180, term7180.getClass(), "type", 0);
        setField(term7180, term7180.getClass(), "next", null);
        setField(term7180, term7180.getClass(), "first", null);
        setField(term7180, term7180.getClass(), "last", null);
        setField(term7180, term7180.getClass(), "propListHead", null);
        setIntField(term7180, term7180.getClass(), "sourcePosition", 0);
        setField(term7180, term7180.getClass(), "jsType", null);
        setField(term7180, term7180.getClass(), "parent", null);
        setField(term7174, term7174.getClass(), "first", term7180);
        setIntField(term7181, term7181.getClass(), "type", 0);
        setField(term7181, term7181.getClass(), "next", null);
        setField(term7181, term7181.getClass(), "first", null);
        setField(term7181, term7181.getClass(), "last", null);
        setField(term7181, term7181.getClass(), "propListHead", null);
        setIntField(term7181, term7181.getClass(), "sourcePosition", 0);
        setField(term7181, term7181.getClass(), "jsType", null);
        setField(term7181, term7181.getClass(), "parent", null);
        setField(term7174, term7174.getClass(), "last", term7181);
        setField(term7182, term7182.getClass(), "next", null);
        setIntField(term7182, term7182.getClass(), "type", 0);
        setIntField(term7182, term7182.getClass(), "intValue", 0);
        setField(term7182, term7182.getClass(), "objectValue", null);
        setField(term7174, term7174.getClass(), "propListHead", term7182);
        setIntField(term7174, term7174.getClass(), "sourcePosition", 754055848);
        setField(term7174, term7174.getClass(), "jsType", null);
        setField(term7174, term7174.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1030;
        Object retValue = callMethod(klass, "isControlStructure", argTypes, null, args);
        assertTrue(recursiveEquals(term1030, term7174));
        assertTrue(recursiveEquals(retValue, false));
    }

};


