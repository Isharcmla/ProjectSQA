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

public class NodeUtil_getFunctionJSDocInfo_80008384302 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4503;

    public NodeUtil_getFunctionJSDocInfo_80008384302() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4503 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4505 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4507 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4509 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4511 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4514 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4518 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4520 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4525 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4503, term4503.getClass(), "type", 12581312);
        setIntField(term4505, term4505.getClass(), "type", 2087383644);
        setIntField(term4507, term4507.getClass(), "type", 405527523);
        setIntField(term4509, term4509.getClass(), "type", -1123526433);
        setIntField(term4511, term4511.getClass(), "type", 910269225);
        setField(term4511, term4511.getClass(), "next", null);
        setField(term4511, term4511.getClass(), "first", null);
        setField(term4511, term4511.getClass(), "last", null);
        setField(term4511, term4511.getClass(), "propListHead", null);
        setIntField(term4511, term4511.getClass(), "sourcePosition", 0);
        setField(term4511, term4511.getClass(), "jsType", null);
        setField(term4511, term4511.getClass(), "parent", null);
        setField(term4509, term4509.getClass(), "next", term4511);
        setIntField(term4514, term4514.getClass(), "type", -298852874);
        setField(term4514, term4514.getClass(), "next", null);
        setField(term4514, term4514.getClass(), "first", null);
        setField(term4514, term4514.getClass(), "last", term4511);
        setField(term4514, term4514.getClass(), "propListHead", null);
        setIntField(term4514, term4514.getClass(), "sourcePosition", 0);
        setField(term4514, term4514.getClass(), "jsType", null);
        setField(term4514, term4514.getClass(), "parent", null);
        setField(term4509, term4509.getClass(), "first", term4514);
        setField(term4509, term4509.getClass(), "last", term4507);
        setField(term4509, term4509.getClass(), "propListHead", null);
        setIntField(term4509, term4509.getClass(), "sourcePosition", 0);
        setField(term4509, term4509.getClass(), "jsType", null);
        setField(term4509, term4509.getClass(), "parent", null);
        setField(term4507, term4507.getClass(), "next", term4509);
        setField(term4507, term4507.getClass(), "first", term4511);
        setIntField(term4518, term4518.getClass(), "type", -329141819);
        setIntField(term4520, term4520.getClass(), "type", -963204620);
        setField(term4520, term4520.getClass(), "next", null);
        setField(term4520, term4520.getClass(), "first", term4514);
        setField(term4520, term4520.getClass(), "last", term4509);
        setField(term4520, term4520.getClass(), "propListHead", null);
        setIntField(term4520, term4520.getClass(), "sourcePosition", 0);
        setField(term4520, term4520.getClass(), "jsType", null);
        setField(term4520, term4520.getClass(), "parent", null);
        setField(term4518, term4518.getClass(), "next", term4520);
        setField(term4518, term4518.getClass(), "first", term4505);
        setField(term4518, term4518.getClass(), "last", term4505);
        setField(term4518, term4518.getClass(), "propListHead", null);
        setIntField(term4518, term4518.getClass(), "sourcePosition", 0);
        setField(term4518, term4518.getClass(), "jsType", null);
        setField(term4518, term4518.getClass(), "parent", null);
        setField(term4507, term4507.getClass(), "last", term4518);
        setField(term4507, term4507.getClass(), "propListHead", null);
        setIntField(term4507, term4507.getClass(), "sourcePosition", 0);
        setField(term4507, term4507.getClass(), "jsType", null);
        setField(term4507, term4507.getClass(), "parent", null);
        setField(term4505, term4505.getClass(), "next", term4507);
        setIntField(term4525, term4525.getClass(), "type", 172898580);
        setField(term4525, term4525.getClass(), "next", term4518);
        setField(term4525, term4525.getClass(), "first", term4520);
        setField(term4525, term4525.getClass(), "last", term4503);
        setField(term4525, term4525.getClass(), "propListHead", null);
        setIntField(term4525, term4525.getClass(), "sourcePosition", 0);
        setField(term4525, term4525.getClass(), "jsType", null);
        setField(term4525, term4525.getClass(), "parent", null);
        setField(term4505, term4505.getClass(), "first", term4525);
        setField(term4505, term4505.getClass(), "last", term4525);
        setField(term4505, term4505.getClass(), "propListHead", null);
        setIntField(term4505, term4505.getClass(), "sourcePosition", 0);
        setField(term4505, term4505.getClass(), "jsType", null);
        setField(term4505, term4505.getClass(), "parent", null);
        setField(term4503, term4503.getClass(), "next", term4505);
        setField(term4503, term4503.getClass(), "first", term4509);
        setField(term4503, term4503.getClass(), "last", term4511);
        setField(term4503, term4503.getClass(), "propListHead", null);
        setIntField(term4503, term4503.getClass(), "sourcePosition", 0);
        setField(term4503, term4503.getClass(), "jsType", null);
        setField(term4503, term4503.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4503;
        try {
            callMethod(klass, "getFunctionJSDocInfo", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


