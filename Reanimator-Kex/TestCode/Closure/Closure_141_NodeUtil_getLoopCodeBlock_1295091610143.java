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
     Object term7126;

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
        term7126 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7127 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7128 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7129 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7131 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7134 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term7136 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7138 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7140 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term7126, term7126.getClass(), "type", 499519708);
        setIntField(term7127, term7127.getClass(), "type", 200252898);
        setIntField(term7128, term7128.getClass(), "type", 0);
        setField(term7128, term7128.getClass(), "next", null);
        setField(term7128, term7128.getClass(), "first", null);
        setField(term7128, term7128.getClass(), "last", null);
        setField(term7128, term7128.getClass(), "propListHead", null);
        setIntField(term7128, term7128.getClass(), "sourcePosition", 0);
        setField(term7128, term7128.getClass(), "jsType", null);
        setField(term7128, term7128.getClass(), "parent", null);
        setField(term7127, term7127.getClass(), "next", term7128);
        setIntField(term7129, term7129.getClass(), "type", 0);
        setField(term7129, term7129.getClass(), "next", null);
        setField(term7129, term7129.getClass(), "first", null);
        setField(term7129, term7129.getClass(), "last", null);
        setField(term7129, term7129.getClass(), "propListHead", null);
        setIntField(term7129, term7129.getClass(), "sourcePosition", 0);
        setField(term7129, term7129.getClass(), "jsType", null);
        setField(term7129, term7129.getClass(), "parent", null);
        setField(term7127, term7127.getClass(), "first", term7129);
        setIntField(term7131, term7131.getClass(), "type", 0);
        setField(term7131, term7131.getClass(), "next", null);
        setField(term7131, term7131.getClass(), "first", null);
        setField(term7131, term7131.getClass(), "last", null);
        setField(term7131, term7131.getClass(), "propListHead", null);
        setIntField(term7131, term7131.getClass(), "sourcePosition", 0);
        setField(term7131, term7131.getClass(), "jsType", null);
        setField(term7131, term7131.getClass(), "parent", null);
        setField(term7127, term7127.getClass(), "last", term7131);
        setField(term7134, term7134.getClass(), "next", null);
        setIntField(term7134, term7134.getClass(), "type", 0);
        setIntField(term7134, term7134.getClass(), "intValue", 0);
        setField(term7134, term7134.getClass(), "objectValue", null);
        setField(term7127, term7127.getClass(), "propListHead", term7134);
        setIntField(term7127, term7127.getClass(), "sourcePosition", -1577069773);
        setField(term7127, term7127.getClass(), "jsType", null);
        setField(term7127, term7127.getClass(), "parent", null);
        setField(term7126, term7126.getClass(), "next", term7127);
        setIntField(term7136, term7136.getClass(), "type", 0);
        setField(term7136, term7136.getClass(), "next", null);
        setField(term7136, term7136.getClass(), "first", null);
        setField(term7136, term7136.getClass(), "last", null);
        setField(term7136, term7136.getClass(), "propListHead", null);
        setIntField(term7136, term7136.getClass(), "sourcePosition", 0);
        setField(term7136, term7136.getClass(), "jsType", null);
        setField(term7136, term7136.getClass(), "parent", null);
        setField(term7126, term7126.getClass(), "first", term7136);
        setIntField(term7138, term7138.getClass(), "type", 0);
        setField(term7138, term7138.getClass(), "next", null);
        setField(term7138, term7138.getClass(), "first", null);
        setField(term7138, term7138.getClass(), "last", null);
        setField(term7138, term7138.getClass(), "propListHead", null);
        setIntField(term7138, term7138.getClass(), "sourcePosition", 0);
        setField(term7138, term7138.getClass(), "jsType", null);
        setField(term7138, term7138.getClass(), "parent", null);
        setField(term7126, term7126.getClass(), "last", term7138);
        setField(term7140, term7140.getClass(), "next", null);
        setIntField(term7140, term7140.getClass(), "type", 0);
        setIntField(term7140, term7140.getClass(), "intValue", 0);
        setField(term7140, term7140.getClass(), "objectValue", null);
        setField(term7126, term7126.getClass(), "propListHead", term7140);
        setIntField(term7126, term7126.getClass(), "sourcePosition", -266625190);
        setField(term7126, term7126.getClass(), "jsType", null);
        setField(term7126, term7126.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1003;
        Object retValue = callMethod(klass, "getLoopCodeBlock", argTypes, null, args);
        assertTrue(recursiveEquals(term1003, term7126));
        assertTrue(recursiveEquals(retValue, null));
    }

};


