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

public class NodeUtil_getLoopCodeBlock_1295091610143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1003;
     Object term7100;

    public NodeUtil_getLoopCodeBlock_1295091610143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1003 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1005 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1007 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1010 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1013 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1016 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1020 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1023 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1026 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1003, term1003.getClass(), "type", 499519708);
        setIntField(term1005, term1005.getClass(), "type", 200252898);
        setIntField(term1007, term1007.getClass(), "type", 0);
        setField(term1007, term1007.getClass(), "next", null);
        setField(term1007, term1007.getClass(), "first", null);
        setField(term1007, term1007.getClass(), "last", null);
        setField(term1007, term1007.getClass(), "propListHead", null);
        setIntField(term1007, term1007.getClass(), "sourcePosition", 0);
        setField(term1007, term1007.getClass(), "jsType", null);
        setField(term1007, term1007.getClass(), "parent", null);
        setField(term1005, term1005.getClass(), "next", term1007);
        setIntField(term1010, term1010.getClass(), "type", 0);
        setField(term1010, term1010.getClass(), "next", null);
        setField(term1010, term1010.getClass(), "first", null);
        setField(term1010, term1010.getClass(), "last", null);
        setField(term1010, term1010.getClass(), "propListHead", null);
        setIntField(term1010, term1010.getClass(), "sourcePosition", 0);
        setField(term1010, term1010.getClass(), "jsType", null);
        setField(term1010, term1010.getClass(), "parent", null);
        setField(term1005, term1005.getClass(), "first", term1010);
        setIntField(term1013, term1013.getClass(), "type", 0);
        setField(term1013, term1013.getClass(), "next", null);
        setField(term1013, term1013.getClass(), "first", null);
        setField(term1013, term1013.getClass(), "last", null);
        setField(term1013, term1013.getClass(), "propListHead", null);
        setIntField(term1013, term1013.getClass(), "sourcePosition", 0);
        setField(term1013, term1013.getClass(), "jsType", null);
        setField(term1013, term1013.getClass(), "parent", null);
        setField(term1005, term1005.getClass(), "last", term1013);
        setField(term1016, term1016.getClass(), "next", null);
        setIntField(term1016, term1016.getClass(), "type", 0);
        setIntField(term1016, term1016.getClass(), "intValue", 0);
        setField(term1016, term1016.getClass(), "objectValue", null);
        setField(term1005, term1005.getClass(), "propListHead", term1016);
        setIntField(term1005, term1005.getClass(), "sourcePosition", -1577069773);
        setField(term1005, term1005.getClass(), "jsType", null);
        setField(term1005, term1005.getClass(), "parent", null);
        setField(term1003, term1003.getClass(), "next", term1005);
        setIntField(term1020, term1020.getClass(), "type", 0);
        setField(term1020, term1020.getClass(), "next", null);
        setField(term1020, term1020.getClass(), "first", null);
        setField(term1020, term1020.getClass(), "last", null);
        setField(term1020, term1020.getClass(), "propListHead", null);
        setIntField(term1020, term1020.getClass(), "sourcePosition", 0);
        setField(term1020, term1020.getClass(), "jsType", null);
        setField(term1020, term1020.getClass(), "parent", null);
        setField(term1003, term1003.getClass(), "first", term1020);
        setIntField(term1023, term1023.getClass(), "type", 0);
        setField(term1023, term1023.getClass(), "next", null);
        setField(term1023, term1023.getClass(), "first", null);
        setField(term1023, term1023.getClass(), "last", null);
        setField(term1023, term1023.getClass(), "propListHead", null);
        setIntField(term1023, term1023.getClass(), "sourcePosition", 0);
        setField(term1023, term1023.getClass(), "jsType", null);
        setField(term1023, term1023.getClass(), "parent", null);
        setField(term1003, term1003.getClass(), "last", term1023);
        setField(term1026, term1026.getClass(), "next", null);
        setIntField(term1026, term1026.getClass(), "type", 0);
        setIntField(term1026, term1026.getClass(), "intValue", 0);
        setField(term1026, term1026.getClass(), "objectValue", null);
        setField(term1003, term1003.getClass(), "propListHead", term1026);
        setIntField(term1003, term1003.getClass(), "sourcePosition", -266625190);
        setField(term1003, term1003.getClass(), "jsType", null);
        setField(term1003, term1003.getClass(), "parent", null);
        term7100 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7101 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7102 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7103 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7104 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7105 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term7106 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7107 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7108 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term7100, term7100.getClass(), "type", 499519708);
        setIntField(term7101, term7101.getClass(), "type", 200252898);
        setIntField(term7102, term7102.getClass(), "type", 0);
        setField(term7102, term7102.getClass(), "next", null);
        setField(term7102, term7102.getClass(), "first", null);
        setField(term7102, term7102.getClass(), "last", null);
        setField(term7102, term7102.getClass(), "propListHead", null);
        setIntField(term7102, term7102.getClass(), "sourcePosition", 0);
        setField(term7102, term7102.getClass(), "jsType", null);
        setField(term7102, term7102.getClass(), "parent", null);
        setField(term7101, term7101.getClass(), "next", term7102);
        setIntField(term7103, term7103.getClass(), "type", 0);
        setField(term7103, term7103.getClass(), "next", null);
        setField(term7103, term7103.getClass(), "first", null);
        setField(term7103, term7103.getClass(), "last", null);
        setField(term7103, term7103.getClass(), "propListHead", null);
        setIntField(term7103, term7103.getClass(), "sourcePosition", 0);
        setField(term7103, term7103.getClass(), "jsType", null);
        setField(term7103, term7103.getClass(), "parent", null);
        setField(term7101, term7101.getClass(), "first", term7103);
        setIntField(term7104, term7104.getClass(), "type", 0);
        setField(term7104, term7104.getClass(), "next", null);
        setField(term7104, term7104.getClass(), "first", null);
        setField(term7104, term7104.getClass(), "last", null);
        setField(term7104, term7104.getClass(), "propListHead", null);
        setIntField(term7104, term7104.getClass(), "sourcePosition", 0);
        setField(term7104, term7104.getClass(), "jsType", null);
        setField(term7104, term7104.getClass(), "parent", null);
        setField(term7101, term7101.getClass(), "last", term7104);
        setField(term7105, term7105.getClass(), "next", null);
        setIntField(term7105, term7105.getClass(), "type", 0);
        setIntField(term7105, term7105.getClass(), "intValue", 0);
        setField(term7105, term7105.getClass(), "objectValue", null);
        setField(term7101, term7101.getClass(), "propListHead", term7105);
        setIntField(term7101, term7101.getClass(), "sourcePosition", -1577069773);
        setField(term7101, term7101.getClass(), "jsType", null);
        setField(term7101, term7101.getClass(), "parent", null);
        setField(term7100, term7100.getClass(), "next", term7101);
        setIntField(term7106, term7106.getClass(), "type", 0);
        setField(term7106, term7106.getClass(), "next", null);
        setField(term7106, term7106.getClass(), "first", null);
        setField(term7106, term7106.getClass(), "last", null);
        setField(term7106, term7106.getClass(), "propListHead", null);
        setIntField(term7106, term7106.getClass(), "sourcePosition", 0);
        setField(term7106, term7106.getClass(), "jsType", null);
        setField(term7106, term7106.getClass(), "parent", null);
        setField(term7100, term7100.getClass(), "first", term7106);
        setIntField(term7107, term7107.getClass(), "type", 0);
        setField(term7107, term7107.getClass(), "next", null);
        setField(term7107, term7107.getClass(), "first", null);
        setField(term7107, term7107.getClass(), "last", null);
        setField(term7107, term7107.getClass(), "propListHead", null);
        setIntField(term7107, term7107.getClass(), "sourcePosition", 0);
        setField(term7107, term7107.getClass(), "jsType", null);
        setField(term7107, term7107.getClass(), "parent", null);
        setField(term7100, term7100.getClass(), "last", term7107);
        setField(term7108, term7108.getClass(), "next", null);
        setIntField(term7108, term7108.getClass(), "type", 0);
        setIntField(term7108, term7108.getClass(), "intValue", 0);
        setField(term7108, term7108.getClass(), "objectValue", null);
        setField(term7100, term7100.getClass(), "propListHead", term7108);
        setIntField(term7100, term7100.getClass(), "sourcePosition", -266625190);
        setField(term7100, term7100.getClass(), "jsType", null);
        setField(term7100, term7100.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1003;
        Object retValue = callMethod(klass, "getLoopCodeBlock", argTypes, null, args);
        assertTrue(recursiveEquals(term1003, term7100));
        assertTrue(recursiveEquals(retValue, null));
    }

};


