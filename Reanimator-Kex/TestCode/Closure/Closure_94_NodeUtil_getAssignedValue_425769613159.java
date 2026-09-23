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
import java.lang.Object;

public class NodeUtil_getAssignedValue_425769613159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1032;

    public NodeUtil_getAssignedValue_425769613159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1032 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1034 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1036 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1039 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1042 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1045 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1049 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1052 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1055 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1032, term1032.getClass(), "type", -941356098);
        setIntField(term1034, term1034.getClass(), "type", 1374790203);
        setIntField(term1036, term1036.getClass(), "type", 0);
        setField(term1036, term1036.getClass(), "next", null);
        setField(term1036, term1036.getClass(), "first", null);
        setField(term1036, term1036.getClass(), "last", null);
        setField(term1036, term1036.getClass(), "propListHead", null);
        setIntField(term1036, term1036.getClass(), "sourcePosition", 0);
        setField(term1036, term1036.getClass(), "jsType", null);
        setField(term1036, term1036.getClass(), "parent", null);
        setField(term1034, term1034.getClass(), "next", term1036);
        setIntField(term1039, term1039.getClass(), "type", 0);
        setField(term1039, term1039.getClass(), "next", null);
        setField(term1039, term1039.getClass(), "first", null);
        setField(term1039, term1039.getClass(), "last", null);
        setField(term1039, term1039.getClass(), "propListHead", null);
        setIntField(term1039, term1039.getClass(), "sourcePosition", 0);
        setField(term1039, term1039.getClass(), "jsType", null);
        setField(term1039, term1039.getClass(), "parent", null);
        setField(term1034, term1034.getClass(), "first", term1039);
        setIntField(term1042, term1042.getClass(), "type", 0);
        setField(term1042, term1042.getClass(), "next", null);
        setField(term1042, term1042.getClass(), "first", null);
        setField(term1042, term1042.getClass(), "last", null);
        setField(term1042, term1042.getClass(), "propListHead", null);
        setIntField(term1042, term1042.getClass(), "sourcePosition", 0);
        setField(term1042, term1042.getClass(), "jsType", null);
        setField(term1042, term1042.getClass(), "parent", null);
        setField(term1034, term1034.getClass(), "last", term1042);
        setField(term1045, term1045.getClass(), "next", null);
        setIntField(term1045, term1045.getClass(), "type", 0);
        setIntField(term1045, term1045.getClass(), "intValue", 0);
        setField(term1045, term1045.getClass(), "objectValue", null);
        setField(term1034, term1034.getClass(), "propListHead", term1045);
        setIntField(term1034, term1034.getClass(), "sourcePosition", -525570815);
        setField(term1034, term1034.getClass(), "jsType", null);
        setField(term1034, term1034.getClass(), "parent", null);
        setField(term1032, term1032.getClass(), "next", term1034);
        setIntField(term1049, term1049.getClass(), "type", 0);
        setField(term1049, term1049.getClass(), "next", null);
        setField(term1049, term1049.getClass(), "first", null);
        setField(term1049, term1049.getClass(), "last", null);
        setField(term1049, term1049.getClass(), "propListHead", null);
        setIntField(term1049, term1049.getClass(), "sourcePosition", 0);
        setField(term1049, term1049.getClass(), "jsType", null);
        setField(term1049, term1049.getClass(), "parent", null);
        setField(term1032, term1032.getClass(), "first", term1049);
        setIntField(term1052, term1052.getClass(), "type", 0);
        setField(term1052, term1052.getClass(), "next", null);
        setField(term1052, term1052.getClass(), "first", null);
        setField(term1052, term1052.getClass(), "last", null);
        setField(term1052, term1052.getClass(), "propListHead", null);
        setIntField(term1052, term1052.getClass(), "sourcePosition", 0);
        setField(term1052, term1052.getClass(), "jsType", null);
        setField(term1052, term1052.getClass(), "parent", null);
        setField(term1032, term1032.getClass(), "last", term1052);
        setField(term1055, term1055.getClass(), "next", null);
        setIntField(term1055, term1055.getClass(), "type", 0);
        setIntField(term1055, term1055.getClass(), "intValue", 0);
        setField(term1055, term1055.getClass(), "objectValue", null);
        setField(term1032, term1032.getClass(), "propListHead", term1055);
        setIntField(term1032, term1032.getClass(), "sourcePosition", 754055848);
        setField(term1032, term1032.getClass(), "jsType", null);
        setField(term1032, term1032.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1032;
        try {
            callMethod(klass, "getAssignedValue", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


