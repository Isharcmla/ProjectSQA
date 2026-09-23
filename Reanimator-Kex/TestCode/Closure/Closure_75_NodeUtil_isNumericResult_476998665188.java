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
     Object term10507;

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
        term10507 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10508 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10509 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10510 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10511 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10512 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term10513 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10514 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10515 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term10507, term10507.getClass(), "type", -938508470);
        setIntField(term10508, term10508.getClass(), "type", -1553893255);
        setIntField(term10509, term10509.getClass(), "type", 0);
        setField(term10509, term10509.getClass(), "next", null);
        setField(term10509, term10509.getClass(), "first", null);
        setField(term10509, term10509.getClass(), "last", null);
        setField(term10509, term10509.getClass(), "propListHead", null);
        setIntField(term10509, term10509.getClass(), "sourcePosition", 0);
        setField(term10509, term10509.getClass(), "jsType", null);
        setField(term10509, term10509.getClass(), "parent", null);
        setField(term10508, term10508.getClass(), "next", term10509);
        setIntField(term10510, term10510.getClass(), "type", 0);
        setField(term10510, term10510.getClass(), "next", null);
        setField(term10510, term10510.getClass(), "first", null);
        setField(term10510, term10510.getClass(), "last", null);
        setField(term10510, term10510.getClass(), "propListHead", null);
        setIntField(term10510, term10510.getClass(), "sourcePosition", 0);
        setField(term10510, term10510.getClass(), "jsType", null);
        setField(term10510, term10510.getClass(), "parent", null);
        setField(term10508, term10508.getClass(), "first", term10510);
        setIntField(term10511, term10511.getClass(), "type", 0);
        setField(term10511, term10511.getClass(), "next", null);
        setField(term10511, term10511.getClass(), "first", null);
        setField(term10511, term10511.getClass(), "last", null);
        setField(term10511, term10511.getClass(), "propListHead", null);
        setIntField(term10511, term10511.getClass(), "sourcePosition", 0);
        setField(term10511, term10511.getClass(), "jsType", null);
        setField(term10511, term10511.getClass(), "parent", null);
        setField(term10508, term10508.getClass(), "last", term10511);
        setField(term10512, term10512.getClass(), "next", null);
        setIntField(term10512, term10512.getClass(), "type", 0);
        setIntField(term10512, term10512.getClass(), "intValue", 0);
        setField(term10512, term10512.getClass(), "objectValue", null);
        setField(term10508, term10508.getClass(), "propListHead", term10512);
        setIntField(term10508, term10508.getClass(), "sourcePosition", -434468428);
        setField(term10508, term10508.getClass(), "jsType", null);
        setField(term10508, term10508.getClass(), "parent", null);
        setField(term10507, term10507.getClass(), "next", term10508);
        setIntField(term10513, term10513.getClass(), "type", 0);
        setField(term10513, term10513.getClass(), "next", null);
        setField(term10513, term10513.getClass(), "first", null);
        setField(term10513, term10513.getClass(), "last", null);
        setField(term10513, term10513.getClass(), "propListHead", null);
        setIntField(term10513, term10513.getClass(), "sourcePosition", 0);
        setField(term10513, term10513.getClass(), "jsType", null);
        setField(term10513, term10513.getClass(), "parent", null);
        setField(term10507, term10507.getClass(), "first", term10513);
        setIntField(term10514, term10514.getClass(), "type", 0);
        setField(term10514, term10514.getClass(), "next", null);
        setField(term10514, term10514.getClass(), "first", null);
        setField(term10514, term10514.getClass(), "last", null);
        setField(term10514, term10514.getClass(), "propListHead", null);
        setIntField(term10514, term10514.getClass(), "sourcePosition", 0);
        setField(term10514, term10514.getClass(), "jsType", null);
        setField(term10514, term10514.getClass(), "parent", null);
        setField(term10507, term10507.getClass(), "last", term10514);
        setField(term10515, term10515.getClass(), "next", null);
        setIntField(term10515, term10515.getClass(), "type", 0);
        setIntField(term10515, term10515.getClass(), "intValue", 0);
        setField(term10515, term10515.getClass(), "objectValue", null);
        setField(term10507, term10507.getClass(), "propListHead", term10515);
        setIntField(term10507, term10507.getClass(), "sourcePosition", 1559605714);
        setField(term10507, term10507.getClass(), "jsType", null);
        setField(term10507, term10507.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term914;
        callMethod(klass, "isNumericResult", argTypes, null, args);
        assertTrue(recursiveEquals(term914, term10507));
    }

};


