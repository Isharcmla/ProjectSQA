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

public class NodeUtil_getNameReferenceCount_213060949221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3117;
     Object term17401;

    public NodeUtil_getNameReferenceCount_213060949221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3117 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3119 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3121 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3124 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3127 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3130 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3134 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3137 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3140 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3117, term3117.getClass(), "type", -359675864);
        setIntField(term3119, term3119.getClass(), "type", 1267740164);
        setIntField(term3121, term3121.getClass(), "type", 0);
        setField(term3121, term3121.getClass(), "next", null);
        setField(term3121, term3121.getClass(), "first", null);
        setField(term3121, term3121.getClass(), "last", null);
        setField(term3121, term3121.getClass(), "propListHead", null);
        setIntField(term3121, term3121.getClass(), "sourcePosition", 0);
        setField(term3121, term3121.getClass(), "jsType", null);
        setField(term3121, term3121.getClass(), "parent", null);
        setField(term3119, term3119.getClass(), "next", term3121);
        setIntField(term3124, term3124.getClass(), "type", 0);
        setField(term3124, term3124.getClass(), "next", null);
        setField(term3124, term3124.getClass(), "first", null);
        setField(term3124, term3124.getClass(), "last", null);
        setField(term3124, term3124.getClass(), "propListHead", null);
        setIntField(term3124, term3124.getClass(), "sourcePosition", 0);
        setField(term3124, term3124.getClass(), "jsType", null);
        setField(term3124, term3124.getClass(), "parent", null);
        setField(term3119, term3119.getClass(), "first", term3124);
        setIntField(term3127, term3127.getClass(), "type", 0);
        setField(term3127, term3127.getClass(), "next", null);
        setField(term3127, term3127.getClass(), "first", null);
        setField(term3127, term3127.getClass(), "last", null);
        setField(term3127, term3127.getClass(), "propListHead", null);
        setIntField(term3127, term3127.getClass(), "sourcePosition", 0);
        setField(term3127, term3127.getClass(), "jsType", null);
        setField(term3127, term3127.getClass(), "parent", null);
        setField(term3119, term3119.getClass(), "last", term3127);
        setField(term3130, term3130.getClass(), "next", null);
        setIntField(term3130, term3130.getClass(), "type", 0);
        setIntField(term3130, term3130.getClass(), "intValue", 0);
        setField(term3130, term3130.getClass(), "objectValue", null);
        setField(term3119, term3119.getClass(), "propListHead", term3130);
        setIntField(term3119, term3119.getClass(), "sourcePosition", 852281447);
        setField(term3119, term3119.getClass(), "jsType", null);
        setField(term3119, term3119.getClass(), "parent", null);
        setField(term3117, term3117.getClass(), "next", term3119);
        setIntField(term3134, term3134.getClass(), "type", 0);
        setField(term3134, term3134.getClass(), "next", null);
        setField(term3134, term3134.getClass(), "first", null);
        setField(term3134, term3134.getClass(), "last", null);
        setField(term3134, term3134.getClass(), "propListHead", null);
        setIntField(term3134, term3134.getClass(), "sourcePosition", 0);
        setField(term3134, term3134.getClass(), "jsType", null);
        setField(term3134, term3134.getClass(), "parent", null);
        setField(term3117, term3117.getClass(), "first", term3134);
        setIntField(term3137, term3137.getClass(), "type", 0);
        setField(term3137, term3137.getClass(), "next", null);
        setField(term3137, term3137.getClass(), "first", null);
        setField(term3137, term3137.getClass(), "last", null);
        setField(term3137, term3137.getClass(), "propListHead", null);
        setIntField(term3137, term3137.getClass(), "sourcePosition", 0);
        setField(term3137, term3137.getClass(), "jsType", null);
        setField(term3137, term3137.getClass(), "parent", null);
        setField(term3117, term3117.getClass(), "last", term3137);
        setField(term3140, term3140.getClass(), "next", null);
        setIntField(term3140, term3140.getClass(), "type", 0);
        setIntField(term3140, term3140.getClass(), "intValue", 0);
        setField(term3140, term3140.getClass(), "objectValue", null);
        setField(term3117, term3117.getClass(), "propListHead", term3140);
        setIntField(term3117, term3117.getClass(), "sourcePosition", 1248430530);
        setField(term3117, term3117.getClass(), "jsType", null);
        setField(term3117, term3117.getClass(), "parent", null);
        term17401 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17402 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17403 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17404 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17405 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17406 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term17407 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17408 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17409 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term17401, term17401.getClass(), "type", -359675864);
        setIntField(term17402, term17402.getClass(), "type", 1267740164);
        setIntField(term17403, term17403.getClass(), "type", 0);
        setField(term17403, term17403.getClass(), "next", null);
        setField(term17403, term17403.getClass(), "first", null);
        setField(term17403, term17403.getClass(), "last", null);
        setField(term17403, term17403.getClass(), "propListHead", null);
        setIntField(term17403, term17403.getClass(), "sourcePosition", 0);
        setField(term17403, term17403.getClass(), "jsType", null);
        setField(term17403, term17403.getClass(), "parent", null);
        setField(term17402, term17402.getClass(), "next", term17403);
        setIntField(term17404, term17404.getClass(), "type", 0);
        setField(term17404, term17404.getClass(), "next", null);
        setField(term17404, term17404.getClass(), "first", null);
        setField(term17404, term17404.getClass(), "last", null);
        setField(term17404, term17404.getClass(), "propListHead", null);
        setIntField(term17404, term17404.getClass(), "sourcePosition", 0);
        setField(term17404, term17404.getClass(), "jsType", null);
        setField(term17404, term17404.getClass(), "parent", null);
        setField(term17402, term17402.getClass(), "first", term17404);
        setIntField(term17405, term17405.getClass(), "type", 0);
        setField(term17405, term17405.getClass(), "next", null);
        setField(term17405, term17405.getClass(), "first", null);
        setField(term17405, term17405.getClass(), "last", null);
        setField(term17405, term17405.getClass(), "propListHead", null);
        setIntField(term17405, term17405.getClass(), "sourcePosition", 0);
        setField(term17405, term17405.getClass(), "jsType", null);
        setField(term17405, term17405.getClass(), "parent", null);
        setField(term17402, term17402.getClass(), "last", term17405);
        setField(term17406, term17406.getClass(), "next", null);
        setIntField(term17406, term17406.getClass(), "type", 0);
        setIntField(term17406, term17406.getClass(), "intValue", 0);
        setField(term17406, term17406.getClass(), "objectValue", null);
        setField(term17402, term17402.getClass(), "propListHead", term17406);
        setIntField(term17402, term17402.getClass(), "sourcePosition", 852281447);
        setField(term17402, term17402.getClass(), "jsType", null);
        setField(term17402, term17402.getClass(), "parent", null);
        setField(term17401, term17401.getClass(), "next", term17402);
        setIntField(term17407, term17407.getClass(), "type", 0);
        setField(term17407, term17407.getClass(), "next", null);
        setField(term17407, term17407.getClass(), "first", null);
        setField(term17407, term17407.getClass(), "last", null);
        setField(term17407, term17407.getClass(), "propListHead", null);
        setIntField(term17407, term17407.getClass(), "sourcePosition", 0);
        setField(term17407, term17407.getClass(), "jsType", null);
        setField(term17407, term17407.getClass(), "parent", null);
        setField(term17401, term17401.getClass(), "first", term17407);
        setIntField(term17408, term17408.getClass(), "type", 0);
        setField(term17408, term17408.getClass(), "next", null);
        setField(term17408, term17408.getClass(), "first", null);
        setField(term17408, term17408.getClass(), "last", null);
        setField(term17408, term17408.getClass(), "propListHead", null);
        setIntField(term17408, term17408.getClass(), "sourcePosition", 0);
        setField(term17408, term17408.getClass(), "jsType", null);
        setField(term17408, term17408.getClass(), "parent", null);
        setField(term17401, term17401.getClass(), "last", term17408);
        setField(term17409, term17409.getClass(), "next", null);
        setIntField(term17409, term17409.getClass(), "type", 0);
        setIntField(term17409, term17409.getClass(), "intValue", 0);
        setField(term17409, term17409.getClass(), "objectValue", null);
        setField(term17401, term17401.getClass(), "propListHead", term17409);
        setIntField(term17401, term17401.getClass(), "sourcePosition", 1248430530);
        setField(term17401, term17401.getClass(), "jsType", null);
        setField(term17401, term17401.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term3117;
        args[1] = "vrQLuWIDJX";
        Object retValue = callMethod(klass, "getNameReferenceCount", argTypes, null, args);
        assertTrue(recursiveEquals(term3117, "vrQLuWIDJX"));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


