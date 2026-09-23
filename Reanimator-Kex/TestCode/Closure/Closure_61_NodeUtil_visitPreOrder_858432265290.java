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
import java.lang.Object;

public class NodeUtil_visitPreOrder_858432265290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3199;

    public NodeUtil_visitPreOrder_858432265290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3199 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3201 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3203 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3206 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3209 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3213 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3216 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3199, term3199.getClass(), "type", 1766479154);
        setIntField(term3201, term3201.getClass(), "type", -134324004);
        setIntField(term3203, term3203.getClass(), "type", 0);
        setField(term3203, term3203.getClass(), "next", null);
        setField(term3203, term3203.getClass(), "first", null);
        setField(term3203, term3203.getClass(), "last", null);
        setField(term3203, term3203.getClass(), "propListHead", null);
        setIntField(term3203, term3203.getClass(), "sourcePosition", 0);
        setField(term3203, term3203.getClass(), "jsType", null);
        setField(term3203, term3203.getClass(), "parent", null);
        setField(term3201, term3201.getClass(), "next", term3203);
        setIntField(term3206, term3206.getClass(), "type", 0);
        setField(term3206, term3206.getClass(), "next", null);
        setField(term3206, term3206.getClass(), "first", null);
        setField(term3206, term3206.getClass(), "last", null);
        setField(term3206, term3206.getClass(), "propListHead", null);
        setIntField(term3206, term3206.getClass(), "sourcePosition", 0);
        setField(term3206, term3206.getClass(), "jsType", null);
        setField(term3206, term3206.getClass(), "parent", null);
        setField(term3201, term3201.getClass(), "first", term3206);
        setIntField(term3209, term3209.getClass(), "type", 0);
        setField(term3209, term3209.getClass(), "next", null);
        setField(term3209, term3209.getClass(), "first", null);
        setField(term3209, term3209.getClass(), "last", null);
        setField(term3209, term3209.getClass(), "propListHead", null);
        setIntField(term3209, term3209.getClass(), "sourcePosition", 0);
        setField(term3209, term3209.getClass(), "jsType", null);
        setField(term3209, term3209.getClass(), "parent", null);
        setField(term3201, term3201.getClass(), "last", term3209);
        setField(term3201, term3201.getClass(), "propListHead", null);
        setIntField(term3201, term3201.getClass(), "sourcePosition", 0);
        setField(term3201, term3201.getClass(), "jsType", null);
        setField(term3201, term3201.getClass(), "parent", null);
        setField(term3199, term3199.getClass(), "next", term3201);
        setIntField(term3213, term3213.getClass(), "type", 0);
        setField(term3213, term3213.getClass(), "next", null);
        setField(term3213, term3213.getClass(), "first", null);
        setField(term3213, term3213.getClass(), "last", null);
        setField(term3213, term3213.getClass(), "propListHead", null);
        setIntField(term3213, term3213.getClass(), "sourcePosition", 0);
        setField(term3213, term3213.getClass(), "jsType", null);
        setField(term3213, term3213.getClass(), "parent", null);
        setField(term3199, term3199.getClass(), "first", term3213);
        setIntField(term3216, term3216.getClass(), "type", 0);
        setField(term3216, term3216.getClass(), "next", null);
        setField(term3216, term3216.getClass(), "first", null);
        setField(term3216, term3216.getClass(), "last", null);
        setField(term3216, term3216.getClass(), "propListHead", null);
        setIntField(term3216, term3216.getClass(), "sourcePosition", 0);
        setField(term3216, term3216.getClass(), "jsType", null);
        setField(term3216, term3216.getClass(), "parent", null);
        setField(term3199, term3199.getClass(), "last", term3216);
        setField(term3199, term3199.getClass(), "propListHead", null);
        setIntField(term3199, term3199.getClass(), "sourcePosition", 0);
        setField(term3199, term3199.getClass(), "jsType", null);
        setField(term3199, term3199.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeUtil$Visitor");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term3199;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "visitPreOrder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


