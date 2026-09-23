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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodeUtil_getCatchBlock_1684668872289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4025;

    public NodeUtil_getCatchBlock_1684668872289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4025 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4027 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4029 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4032 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4035 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4038 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term4042 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4045 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4048 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term4025, term4025.getClass(), "type", 1626670889);
        setIntField(term4027, term4027.getClass(), "type", -1490696181);
        setIntField(term4029, term4029.getClass(), "type", 0);
        setField(term4029, term4029.getClass(), "next", null);
        setField(term4029, term4029.getClass(), "first", null);
        setField(term4029, term4029.getClass(), "last", null);
        setField(term4029, term4029.getClass(), "propListHead", null);
        setIntField(term4029, term4029.getClass(), "sourcePosition", 0);
        setField(term4029, term4029.getClass(), "jsType", null);
        setField(term4029, term4029.getClass(), "parent", null);
        setField(term4027, term4027.getClass(), "next", term4029);
        setIntField(term4032, term4032.getClass(), "type", 0);
        setField(term4032, term4032.getClass(), "next", null);
        setField(term4032, term4032.getClass(), "first", null);
        setField(term4032, term4032.getClass(), "last", null);
        setField(term4032, term4032.getClass(), "propListHead", null);
        setIntField(term4032, term4032.getClass(), "sourcePosition", 0);
        setField(term4032, term4032.getClass(), "jsType", null);
        setField(term4032, term4032.getClass(), "parent", null);
        setField(term4027, term4027.getClass(), "first", term4032);
        setIntField(term4035, term4035.getClass(), "type", 0);
        setField(term4035, term4035.getClass(), "next", null);
        setField(term4035, term4035.getClass(), "first", null);
        setField(term4035, term4035.getClass(), "last", null);
        setField(term4035, term4035.getClass(), "propListHead", null);
        setIntField(term4035, term4035.getClass(), "sourcePosition", 0);
        setField(term4035, term4035.getClass(), "jsType", null);
        setField(term4035, term4035.getClass(), "parent", null);
        setField(term4027, term4027.getClass(), "last", term4035);
        setField(term4038, term4038.getClass(), "next", null);
        setIntField(term4038, term4038.getClass(), "type", 0);
        setIntField(term4038, term4038.getClass(), "intValue", 0);
        setField(term4038, term4038.getClass(), "objectValue", null);
        setField(term4027, term4027.getClass(), "propListHead", term4038);
        setIntField(term4027, term4027.getClass(), "sourcePosition", 203264365);
        setField(term4027, term4027.getClass(), "jsType", null);
        setField(term4027, term4027.getClass(), "parent", null);
        setField(term4025, term4025.getClass(), "next", term4027);
        setIntField(term4042, term4042.getClass(), "type", 0);
        setField(term4042, term4042.getClass(), "next", null);
        setField(term4042, term4042.getClass(), "first", null);
        setField(term4042, term4042.getClass(), "last", null);
        setField(term4042, term4042.getClass(), "propListHead", null);
        setIntField(term4042, term4042.getClass(), "sourcePosition", 0);
        setField(term4042, term4042.getClass(), "jsType", null);
        setField(term4042, term4042.getClass(), "parent", null);
        setField(term4025, term4025.getClass(), "first", term4042);
        setIntField(term4045, term4045.getClass(), "type", 0);
        setField(term4045, term4045.getClass(), "next", null);
        setField(term4045, term4045.getClass(), "first", null);
        setField(term4045, term4045.getClass(), "last", null);
        setField(term4045, term4045.getClass(), "propListHead", null);
        setIntField(term4045, term4045.getClass(), "sourcePosition", 0);
        setField(term4045, term4045.getClass(), "jsType", null);
        setField(term4045, term4045.getClass(), "parent", null);
        setField(term4025, term4025.getClass(), "last", term4045);
        setField(term4048, term4048.getClass(), "next", null);
        setIntField(term4048, term4048.getClass(), "type", 0);
        setIntField(term4048, term4048.getClass(), "intValue", 0);
        setField(term4048, term4048.getClass(), "objectValue", null);
        setField(term4025, term4025.getClass(), "propListHead", term4048);
        setIntField(term4025, term4025.getClass(), "sourcePosition", -1066281036);
        setField(term4025, term4025.getClass(), "jsType", null);
        setField(term4025, term4025.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4025;
        try {
            callMethod(klass, "getCatchBlock", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


