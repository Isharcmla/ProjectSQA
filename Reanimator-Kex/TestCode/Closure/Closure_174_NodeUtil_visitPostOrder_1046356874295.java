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

public class NodeUtil_visitPostOrder_1046356874295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4287;

    public NodeUtil_visitPostOrder_1046356874295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4287 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4289 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4291 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4293 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4295 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4298 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4302 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4304 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4309 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4287, term4287.getClass(), "type", -1855819749);
        setIntField(term4289, term4289.getClass(), "type", 1059048043);
        setIntField(term4291, term4291.getClass(), "type", 537273345);
        setIntField(term4293, term4293.getClass(), "type", -346107257);
        setIntField(term4295, term4295.getClass(), "type", -1577393360);
        setField(term4295, term4295.getClass(), "next", null);
        setField(term4295, term4295.getClass(), "first", null);
        setField(term4295, term4295.getClass(), "last", null);
        setField(term4295, term4295.getClass(), "propListHead", null);
        setIntField(term4295, term4295.getClass(), "sourcePosition", 0);
        setField(term4295, term4295.getClass(), "jsType", null);
        setField(term4295, term4295.getClass(), "parent", null);
        setField(term4293, term4293.getClass(), "next", term4295);
        setIntField(term4298, term4298.getClass(), "type", 1112256038);
        setField(term4298, term4298.getClass(), "next", null);
        setField(term4298, term4298.getClass(), "first", null);
        setField(term4298, term4298.getClass(), "last", term4295);
        setField(term4298, term4298.getClass(), "propListHead", null);
        setIntField(term4298, term4298.getClass(), "sourcePosition", 0);
        setField(term4298, term4298.getClass(), "jsType", null);
        setField(term4298, term4298.getClass(), "parent", null);
        setField(term4293, term4293.getClass(), "first", term4298);
        setField(term4293, term4293.getClass(), "last", term4291);
        setField(term4293, term4293.getClass(), "propListHead", null);
        setIntField(term4293, term4293.getClass(), "sourcePosition", 0);
        setField(term4293, term4293.getClass(), "jsType", null);
        setField(term4293, term4293.getClass(), "parent", null);
        setField(term4291, term4291.getClass(), "next", term4293);
        setField(term4291, term4291.getClass(), "first", term4295);
        setIntField(term4302, term4302.getClass(), "type", 1504698817);
        setIntField(term4304, term4304.getClass(), "type", -2018333791);
        setField(term4304, term4304.getClass(), "next", null);
        setField(term4304, term4304.getClass(), "first", term4298);
        setField(term4304, term4304.getClass(), "last", term4293);
        setField(term4304, term4304.getClass(), "propListHead", null);
        setIntField(term4304, term4304.getClass(), "sourcePosition", 0);
        setField(term4304, term4304.getClass(), "jsType", null);
        setField(term4304, term4304.getClass(), "parent", null);
        setField(term4302, term4302.getClass(), "next", term4304);
        setField(term4302, term4302.getClass(), "first", term4289);
        setField(term4302, term4302.getClass(), "last", term4289);
        setField(term4302, term4302.getClass(), "propListHead", null);
        setIntField(term4302, term4302.getClass(), "sourcePosition", 0);
        setField(term4302, term4302.getClass(), "jsType", null);
        setField(term4302, term4302.getClass(), "parent", null);
        setField(term4291, term4291.getClass(), "last", term4302);
        setField(term4291, term4291.getClass(), "propListHead", null);
        setIntField(term4291, term4291.getClass(), "sourcePosition", 0);
        setField(term4291, term4291.getClass(), "jsType", null);
        setField(term4291, term4291.getClass(), "parent", null);
        setField(term4289, term4289.getClass(), "next", term4291);
        setIntField(term4309, term4309.getClass(), "type", -742476678);
        setField(term4309, term4309.getClass(), "next", term4302);
        setField(term4309, term4309.getClass(), "first", term4304);
        setField(term4309, term4309.getClass(), "last", term4287);
        setField(term4309, term4309.getClass(), "propListHead", null);
        setIntField(term4309, term4309.getClass(), "sourcePosition", 0);
        setField(term4309, term4309.getClass(), "jsType", null);
        setField(term4309, term4309.getClass(), "parent", null);
        setField(term4289, term4289.getClass(), "first", term4309);
        setField(term4289, term4289.getClass(), "last", term4309);
        setField(term4289, term4289.getClass(), "propListHead", null);
        setIntField(term4289, term4289.getClass(), "sourcePosition", 0);
        setField(term4289, term4289.getClass(), "jsType", null);
        setField(term4289, term4289.getClass(), "parent", null);
        setField(term4287, term4287.getClass(), "next", term4289);
        setField(term4287, term4287.getClass(), "first", term4293);
        setField(term4287, term4287.getClass(), "last", term4295);
        setField(term4287, term4287.getClass(), "propListHead", null);
        setIntField(term4287, term4287.getClass(), "sourcePosition", 0);
        setField(term4287, term4287.getClass(), "jsType", null);
        setField(term4287, term4287.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeUtil$Visitor");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term4287;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "visitPostOrder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


