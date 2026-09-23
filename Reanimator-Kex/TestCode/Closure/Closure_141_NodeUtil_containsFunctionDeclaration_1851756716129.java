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

public class NodeUtil_containsFunctionDeclaration_1851756716129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term598;
     Object term6207;

    public NodeUtil_containsFunctionDeclaration_1851756716129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term598 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term600 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term602 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term605 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term608 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term611 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term615 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term618 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term621 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term598, term598.getClass(), "type", 252575029);
        setIntField(term600, term600.getClass(), "type", 842904495);
        setIntField(term602, term602.getClass(), "type", 0);
        setField(term602, term602.getClass(), "next", null);
        setField(term602, term602.getClass(), "first", null);
        setField(term602, term602.getClass(), "last", null);
        setField(term602, term602.getClass(), "propListHead", null);
        setIntField(term602, term602.getClass(), "sourcePosition", 0);
        setField(term602, term602.getClass(), "jsType", null);
        setField(term602, term602.getClass(), "parent", null);
        setField(term600, term600.getClass(), "next", term602);
        setIntField(term605, term605.getClass(), "type", 0);
        setField(term605, term605.getClass(), "next", null);
        setField(term605, term605.getClass(), "first", null);
        setField(term605, term605.getClass(), "last", null);
        setField(term605, term605.getClass(), "propListHead", null);
        setIntField(term605, term605.getClass(), "sourcePosition", 0);
        setField(term605, term605.getClass(), "jsType", null);
        setField(term605, term605.getClass(), "parent", null);
        setField(term600, term600.getClass(), "first", term605);
        setIntField(term608, term608.getClass(), "type", 0);
        setField(term608, term608.getClass(), "next", null);
        setField(term608, term608.getClass(), "first", null);
        setField(term608, term608.getClass(), "last", null);
        setField(term608, term608.getClass(), "propListHead", null);
        setIntField(term608, term608.getClass(), "sourcePosition", 0);
        setField(term608, term608.getClass(), "jsType", null);
        setField(term608, term608.getClass(), "parent", null);
        setField(term600, term600.getClass(), "last", term608);
        setField(term611, term611.getClass(), "next", null);
        setIntField(term611, term611.getClass(), "type", 0);
        setIntField(term611, term611.getClass(), "intValue", 0);
        setField(term611, term611.getClass(), "objectValue", null);
        setField(term600, term600.getClass(), "propListHead", term611);
        setIntField(term600, term600.getClass(), "sourcePosition", 1507074215);
        setField(term600, term600.getClass(), "jsType", null);
        setField(term600, term600.getClass(), "parent", null);
        setField(term598, term598.getClass(), "next", term600);
        setIntField(term615, term615.getClass(), "type", 0);
        setField(term615, term615.getClass(), "next", null);
        setField(term615, term615.getClass(), "first", null);
        setField(term615, term615.getClass(), "last", null);
        setField(term615, term615.getClass(), "propListHead", null);
        setIntField(term615, term615.getClass(), "sourcePosition", 0);
        setField(term615, term615.getClass(), "jsType", null);
        setField(term615, term615.getClass(), "parent", null);
        setField(term598, term598.getClass(), "first", term615);
        setIntField(term618, term618.getClass(), "type", 0);
        setField(term618, term618.getClass(), "next", null);
        setField(term618, term618.getClass(), "first", null);
        setField(term618, term618.getClass(), "last", null);
        setField(term618, term618.getClass(), "propListHead", null);
        setIntField(term618, term618.getClass(), "sourcePosition", 0);
        setField(term618, term618.getClass(), "jsType", null);
        setField(term618, term618.getClass(), "parent", null);
        setField(term598, term598.getClass(), "last", term618);
        setField(term621, term621.getClass(), "next", null);
        setIntField(term621, term621.getClass(), "type", 0);
        setIntField(term621, term621.getClass(), "intValue", 0);
        setField(term621, term621.getClass(), "objectValue", null);
        setField(term598, term598.getClass(), "propListHead", term621);
        setIntField(term598, term598.getClass(), "sourcePosition", -282881827);
        setField(term598, term598.getClass(), "jsType", null);
        setField(term598, term598.getClass(), "parent", null);
        term6207 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6208 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6209 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6210 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6211 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6212 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term6213 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6214 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6215 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term6207, term6207.getClass(), "type", 252575029);
        setIntField(term6208, term6208.getClass(), "type", 842904495);
        setIntField(term6209, term6209.getClass(), "type", 0);
        setField(term6209, term6209.getClass(), "next", null);
        setField(term6209, term6209.getClass(), "first", null);
        setField(term6209, term6209.getClass(), "last", null);
        setField(term6209, term6209.getClass(), "propListHead", null);
        setIntField(term6209, term6209.getClass(), "sourcePosition", 0);
        setField(term6209, term6209.getClass(), "jsType", null);
        setField(term6209, term6209.getClass(), "parent", null);
        setField(term6208, term6208.getClass(), "next", term6209);
        setIntField(term6210, term6210.getClass(), "type", 0);
        setField(term6210, term6210.getClass(), "next", null);
        setField(term6210, term6210.getClass(), "first", null);
        setField(term6210, term6210.getClass(), "last", null);
        setField(term6210, term6210.getClass(), "propListHead", null);
        setIntField(term6210, term6210.getClass(), "sourcePosition", 0);
        setField(term6210, term6210.getClass(), "jsType", null);
        setField(term6210, term6210.getClass(), "parent", null);
        setField(term6208, term6208.getClass(), "first", term6210);
        setIntField(term6211, term6211.getClass(), "type", 0);
        setField(term6211, term6211.getClass(), "next", null);
        setField(term6211, term6211.getClass(), "first", null);
        setField(term6211, term6211.getClass(), "last", null);
        setField(term6211, term6211.getClass(), "propListHead", null);
        setIntField(term6211, term6211.getClass(), "sourcePosition", 0);
        setField(term6211, term6211.getClass(), "jsType", null);
        setField(term6211, term6211.getClass(), "parent", null);
        setField(term6208, term6208.getClass(), "last", term6211);
        setField(term6212, term6212.getClass(), "next", null);
        setIntField(term6212, term6212.getClass(), "type", 0);
        setIntField(term6212, term6212.getClass(), "intValue", 0);
        setField(term6212, term6212.getClass(), "objectValue", null);
        setField(term6208, term6208.getClass(), "propListHead", term6212);
        setIntField(term6208, term6208.getClass(), "sourcePosition", 1507074215);
        setField(term6208, term6208.getClass(), "jsType", null);
        setField(term6208, term6208.getClass(), "parent", null);
        setField(term6207, term6207.getClass(), "next", term6208);
        setIntField(term6213, term6213.getClass(), "type", 0);
        setField(term6213, term6213.getClass(), "next", null);
        setField(term6213, term6213.getClass(), "first", null);
        setField(term6213, term6213.getClass(), "last", null);
        setField(term6213, term6213.getClass(), "propListHead", null);
        setIntField(term6213, term6213.getClass(), "sourcePosition", 0);
        setField(term6213, term6213.getClass(), "jsType", null);
        setField(term6213, term6213.getClass(), "parent", null);
        setField(term6207, term6207.getClass(), "first", term6213);
        setIntField(term6214, term6214.getClass(), "type", 0);
        setField(term6214, term6214.getClass(), "next", null);
        setField(term6214, term6214.getClass(), "first", null);
        setField(term6214, term6214.getClass(), "last", null);
        setField(term6214, term6214.getClass(), "propListHead", null);
        setIntField(term6214, term6214.getClass(), "sourcePosition", 0);
        setField(term6214, term6214.getClass(), "jsType", null);
        setField(term6214, term6214.getClass(), "parent", null);
        setField(term6207, term6207.getClass(), "last", term6214);
        setField(term6215, term6215.getClass(), "next", null);
        setIntField(term6215, term6215.getClass(), "type", 0);
        setIntField(term6215, term6215.getClass(), "intValue", 0);
        setField(term6215, term6215.getClass(), "objectValue", null);
        setField(term6207, term6207.getClass(), "propListHead", term6215);
        setIntField(term6207, term6207.getClass(), "sourcePosition", -282881827);
        setField(term6207, term6207.getClass(), "jsType", null);
        setField(term6207, term6207.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term598;
        callMethod(klass, "containsFunctionDeclaration", argTypes, null, args);
        assertTrue(recursiveEquals(term598, term6207));
    }

};


