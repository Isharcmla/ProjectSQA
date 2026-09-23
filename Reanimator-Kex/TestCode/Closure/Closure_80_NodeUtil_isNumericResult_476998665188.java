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

public class NodeUtil_isNumericResult_476998665188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term914;
     Object term10213;

    public NodeUtil_isNumericResult_476998665188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term914 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term916 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term918 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term921 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term924 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term927 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term931 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term934 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term937 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term914, term914.getClass(), "type", -938508470);
        setIntField(term916, term916.getClass(), "type", -1553893255);
        setIntField(term918, term918.getClass(), "type", 0);
        setField(term918, term918.getClass(), "next", null);
        setField(term918, term918.getClass(), "first", null);
        setField(term918, term918.getClass(), "last", null);
        setField(term918, term918.getClass(), "propListHead", null);
        setIntField(term918, term918.getClass(), "sourcePosition", 0);
        setField(term918, term918.getClass(), "jsType", null);
        setField(term918, term918.getClass(), "parent", null);
        setField(term916, term916.getClass(), "next", term918);
        setIntField(term921, term921.getClass(), "type", 0);
        setField(term921, term921.getClass(), "next", null);
        setField(term921, term921.getClass(), "first", null);
        setField(term921, term921.getClass(), "last", null);
        setField(term921, term921.getClass(), "propListHead", null);
        setIntField(term921, term921.getClass(), "sourcePosition", 0);
        setField(term921, term921.getClass(), "jsType", null);
        setField(term921, term921.getClass(), "parent", null);
        setField(term916, term916.getClass(), "first", term921);
        setIntField(term924, term924.getClass(), "type", 0);
        setField(term924, term924.getClass(), "next", null);
        setField(term924, term924.getClass(), "first", null);
        setField(term924, term924.getClass(), "last", null);
        setField(term924, term924.getClass(), "propListHead", null);
        setIntField(term924, term924.getClass(), "sourcePosition", 0);
        setField(term924, term924.getClass(), "jsType", null);
        setField(term924, term924.getClass(), "parent", null);
        setField(term916, term916.getClass(), "last", term924);
        setField(term927, term927.getClass(), "next", null);
        setIntField(term927, term927.getClass(), "type", 0);
        setIntField(term927, term927.getClass(), "intValue", 0);
        setField(term927, term927.getClass(), "objectValue", null);
        setField(term916, term916.getClass(), "propListHead", term927);
        setIntField(term916, term916.getClass(), "sourcePosition", -434468428);
        setField(term916, term916.getClass(), "jsType", null);
        setField(term916, term916.getClass(), "parent", null);
        setField(term914, term914.getClass(), "next", term916);
        setIntField(term931, term931.getClass(), "type", 0);
        setField(term931, term931.getClass(), "next", null);
        setField(term931, term931.getClass(), "first", null);
        setField(term931, term931.getClass(), "last", null);
        setField(term931, term931.getClass(), "propListHead", null);
        setIntField(term931, term931.getClass(), "sourcePosition", 0);
        setField(term931, term931.getClass(), "jsType", null);
        setField(term931, term931.getClass(), "parent", null);
        setField(term914, term914.getClass(), "first", term931);
        setIntField(term934, term934.getClass(), "type", 0);
        setField(term934, term934.getClass(), "next", null);
        setField(term934, term934.getClass(), "first", null);
        setField(term934, term934.getClass(), "last", null);
        setField(term934, term934.getClass(), "propListHead", null);
        setIntField(term934, term934.getClass(), "sourcePosition", 0);
        setField(term934, term934.getClass(), "jsType", null);
        setField(term934, term934.getClass(), "parent", null);
        setField(term914, term914.getClass(), "last", term934);
        setField(term937, term937.getClass(), "next", null);
        setIntField(term937, term937.getClass(), "type", 0);
        setIntField(term937, term937.getClass(), "intValue", 0);
        setField(term937, term937.getClass(), "objectValue", null);
        setField(term914, term914.getClass(), "propListHead", term937);
        setIntField(term914, term914.getClass(), "sourcePosition", 1559605714);
        setField(term914, term914.getClass(), "jsType", null);
        setField(term914, term914.getClass(), "parent", null);
        term10213 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10214 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10215 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10216 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10217 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10218 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term10219 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10220 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10221 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term10213, term10213.getClass(), "type", -938508470);
        setIntField(term10214, term10214.getClass(), "type", -1553893255);
        setIntField(term10215, term10215.getClass(), "type", 0);
        setField(term10215, term10215.getClass(), "next", null);
        setField(term10215, term10215.getClass(), "first", null);
        setField(term10215, term10215.getClass(), "last", null);
        setField(term10215, term10215.getClass(), "propListHead", null);
        setIntField(term10215, term10215.getClass(), "sourcePosition", 0);
        setField(term10215, term10215.getClass(), "jsType", null);
        setField(term10215, term10215.getClass(), "parent", null);
        setField(term10214, term10214.getClass(), "next", term10215);
        setIntField(term10216, term10216.getClass(), "type", 0);
        setField(term10216, term10216.getClass(), "next", null);
        setField(term10216, term10216.getClass(), "first", null);
        setField(term10216, term10216.getClass(), "last", null);
        setField(term10216, term10216.getClass(), "propListHead", null);
        setIntField(term10216, term10216.getClass(), "sourcePosition", 0);
        setField(term10216, term10216.getClass(), "jsType", null);
        setField(term10216, term10216.getClass(), "parent", null);
        setField(term10214, term10214.getClass(), "first", term10216);
        setIntField(term10217, term10217.getClass(), "type", 0);
        setField(term10217, term10217.getClass(), "next", null);
        setField(term10217, term10217.getClass(), "first", null);
        setField(term10217, term10217.getClass(), "last", null);
        setField(term10217, term10217.getClass(), "propListHead", null);
        setIntField(term10217, term10217.getClass(), "sourcePosition", 0);
        setField(term10217, term10217.getClass(), "jsType", null);
        setField(term10217, term10217.getClass(), "parent", null);
        setField(term10214, term10214.getClass(), "last", term10217);
        setField(term10218, term10218.getClass(), "next", null);
        setIntField(term10218, term10218.getClass(), "type", 0);
        setIntField(term10218, term10218.getClass(), "intValue", 0);
        setField(term10218, term10218.getClass(), "objectValue", null);
        setField(term10214, term10214.getClass(), "propListHead", term10218);
        setIntField(term10214, term10214.getClass(), "sourcePosition", -434468428);
        setField(term10214, term10214.getClass(), "jsType", null);
        setField(term10214, term10214.getClass(), "parent", null);
        setField(term10213, term10213.getClass(), "next", term10214);
        setIntField(term10219, term10219.getClass(), "type", 0);
        setField(term10219, term10219.getClass(), "next", null);
        setField(term10219, term10219.getClass(), "first", null);
        setField(term10219, term10219.getClass(), "last", null);
        setField(term10219, term10219.getClass(), "propListHead", null);
        setIntField(term10219, term10219.getClass(), "sourcePosition", 0);
        setField(term10219, term10219.getClass(), "jsType", null);
        setField(term10219, term10219.getClass(), "parent", null);
        setField(term10213, term10213.getClass(), "first", term10219);
        setIntField(term10220, term10220.getClass(), "type", 0);
        setField(term10220, term10220.getClass(), "next", null);
        setField(term10220, term10220.getClass(), "first", null);
        setField(term10220, term10220.getClass(), "last", null);
        setField(term10220, term10220.getClass(), "propListHead", null);
        setIntField(term10220, term10220.getClass(), "sourcePosition", 0);
        setField(term10220, term10220.getClass(), "jsType", null);
        setField(term10220, term10220.getClass(), "parent", null);
        setField(term10213, term10213.getClass(), "last", term10220);
        setField(term10221, term10221.getClass(), "next", null);
        setIntField(term10221, term10221.getClass(), "type", 0);
        setIntField(term10221, term10221.getClass(), "intValue", 0);
        setField(term10221, term10221.getClass(), "objectValue", null);
        setField(term10213, term10213.getClass(), "propListHead", term10221);
        setIntField(term10213, term10213.getClass(), "sourcePosition", 1559605714);
        setField(term10213, term10213.getClass(), "jsType", null);
        setField(term10213, term10213.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term914;
        callMethod(klass, "isNumericResult", argTypes, null, args);
        assertTrue(recursiveEquals(term914, term10213));
    }

};


