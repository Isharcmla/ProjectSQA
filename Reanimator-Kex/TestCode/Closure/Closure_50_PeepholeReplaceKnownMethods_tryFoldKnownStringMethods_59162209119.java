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
import java.util.ArrayDeque;

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_59162209119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183;
     Object term246;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_59162209119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term199 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term199, term199.getClass(), "vars", null);
        setField(term199, term199.getClass(), "parent", null);
        setIntField(term199, term199.getClass(), "depth", 0);
        setField(term199, term199.getClass(), "rootNode", null);
        setField(term199, term199.getClass(), "thisType", null);
        setBooleanField(term199, term199.getClass(), "isBottom", false);
        setField(term199, term199.getClass(), "arguments", null);
        Object term202 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term202, term202.getClass(), "vars", null);
        setField(term202, term202.getClass(), "parent", null);
        setIntField(term202, term202.getClass(), "depth", 0);
        setField(term202, term202.getClass(), "rootNode", null);
        setField(term202, term202.getClass(), "thisType", null);
        setBooleanField(term202, term202.getClass(), "isBottom", false);
        setField(term202, term202.getClass(), "arguments", null);
        ArrayDeque term197 = new ArrayDeque();
        ((ArrayDeque) term197).add(term199);
        ((ArrayDeque) term197).add(term202);
        Object term209 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term209, term209.getClass(), "type", 0);
        setField(term209, term209.getClass(), "next", null);
        setField(term209, term209.getClass(), "first", null);
        setField(term209, term209.getClass(), "last", null);
        setField(term209, term209.getClass(), "propListHead", null);
        setIntField(term209, term209.getClass(), "sourcePosition", 0);
        setField(term209, term209.getClass(), "jsType", null);
        setField(term209, term209.getClass(), "parent", null);
        Object term212 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term212, term212.getClass(), "type", 0);
        setField(term212, term212.getClass(), "next", null);
        setField(term212, term212.getClass(), "first", null);
        setField(term212, term212.getClass(), "last", null);
        setField(term212, term212.getClass(), "propListHead", null);
        setIntField(term212, term212.getClass(), "sourcePosition", 0);
        setField(term212, term212.getClass(), "jsType", null);
        setField(term212, term212.getClass(), "parent", null);
        Object term215 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term215, term215.getClass(), "type", 0);
        setField(term215, term215.getClass(), "next", null);
        setField(term215, term215.getClass(), "first", null);
        setField(term215, term215.getClass(), "last", null);
        setField(term215, term215.getClass(), "propListHead", null);
        setIntField(term215, term215.getClass(), "sourcePosition", 0);
        setField(term215, term215.getClass(), "jsType", null);
        setField(term215, term215.getClass(), "parent", null);
        Object term218 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term218, term218.getClass(), "type", 0);
        setField(term218, term218.getClass(), "next", null);
        setField(term218, term218.getClass(), "first", null);
        setField(term218, term218.getClass(), "last", null);
        setField(term218, term218.getClass(), "propListHead", null);
        setIntField(term218, term218.getClass(), "sourcePosition", 0);
        setField(term218, term218.getClass(), "jsType", null);
        setField(term218, term218.getClass(), "parent", null);
        Object term221 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term221, term221.getClass(), "type", 0);
        setField(term221, term221.getClass(), "next", null);
        setField(term221, term221.getClass(), "first", null);
        setField(term221, term221.getClass(), "last", null);
        setField(term221, term221.getClass(), "propListHead", null);
        setIntField(term221, term221.getClass(), "sourcePosition", 0);
        setField(term221, term221.getClass(), "jsType", null);
        setField(term221, term221.getClass(), "parent", null);
        Object term224 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term224, term224.getClass(), "type", 0);
        setField(term224, term224.getClass(), "next", null);
        setField(term224, term224.getClass(), "first", null);
        setField(term224, term224.getClass(), "last", null);
        setField(term224, term224.getClass(), "propListHead", null);
        setIntField(term224, term224.getClass(), "sourcePosition", 0);
        setField(term224, term224.getClass(), "jsType", null);
        setField(term224, term224.getClass(), "parent", null);
        ArrayDeque term207 = new ArrayDeque();
        ((ArrayDeque) term207).add(term209);
        ((ArrayDeque) term207).add(term212);
        ((ArrayDeque) term207).add(term215);
        ((ArrayDeque) term207).add(term218);
        ((ArrayDeque) term207).add(term221);
        ((ArrayDeque) term207).add(term224);
        ArrayDeque term229 = new ArrayDeque();
        term183 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        Object term184 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        Object term185 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term187 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term190 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term193 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term245 = newInstance(Class.forName("com.google.javascript.rhino.InputId"));
        setField(term184, term184.getClass(), "compiler", null);
        setField(term184, term184.getClass(), "callback", null);
        setIntField(term185, term185.getClass(), "type", -1087774327);
        setIntField(term187, term187.getClass(), "type", 0);
        setField(term187, term187.getClass(), "next", null);
        setField(term187, term187.getClass(), "first", null);
        setField(term187, term187.getClass(), "last", null);
        setField(term187, term187.getClass(), "propListHead", null);
        setIntField(term187, term187.getClass(), "sourcePosition", 0);
        setField(term187, term187.getClass(), "jsType", null);
        setField(term187, term187.getClass(), "parent", null);
        setField(term185, term185.getClass(), "next", term187);
        setIntField(term190, term190.getClass(), "type", 0);
        setField(term190, term190.getClass(), "next", null);
        setField(term190, term190.getClass(), "first", null);
        setField(term190, term190.getClass(), "last", null);
        setField(term190, term190.getClass(), "propListHead", null);
        setIntField(term190, term190.getClass(), "sourcePosition", 0);
        setField(term190, term190.getClass(), "jsType", null);
        setField(term190, term190.getClass(), "parent", null);
        setField(term185, term185.getClass(), "first", term190);
        setIntField(term193, term193.getClass(), "type", 0);
        setField(term193, term193.getClass(), "next", null);
        setField(term193, term193.getClass(), "first", null);
        setField(term193, term193.getClass(), "last", null);
        setField(term193, term193.getClass(), "propListHead", null);
        setIntField(term193, term193.getClass(), "sourcePosition", 0);
        setField(term193, term193.getClass(), "jsType", null);
        setField(term193, term193.getClass(), "parent", null);
        setField(term185, term185.getClass(), "last", term193);
        setField(term185, term185.getClass(), "propListHead", null);
        setIntField(term185, term185.getClass(), "sourcePosition", 0);
        setField(term185, term185.getClass(), "jsType", null);
        setField(term185, term185.getClass(), "parent", null);
        setField(term184, term184.getClass(), "curNode", term185);
        setField(term184, term184.getClass(), "scopes", term197);
        setField(term184, term184.getClass(), "scopeRoots", term207);
        setField(term184, term184.getClass(), "cfgs", term229);
        setField(term184, term184.getClass(), "sourceName", "MuLcgQHgqz");
        setField(term245, term245.getClass(), "id", null);
        setField(term184, term184.getClass(), "inputId", term245);
        setField(term184, term184.getClass(), "scopeCreator", null);
        setField(term184, term184.getClass(), "scopeCallback", null);
        setField(term183, term183.getClass(), "currentTraversal", term184);
        term246 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term248 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term250 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term253 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term256 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term260 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term263 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term246, term246.getClass(), "type", 767834723);
        setIntField(term248, term248.getClass(), "type", -817164822);
        setIntField(term250, term250.getClass(), "type", 0);
        setField(term250, term250.getClass(), "next", null);
        setField(term250, term250.getClass(), "first", null);
        setField(term250, term250.getClass(), "last", null);
        setField(term250, term250.getClass(), "propListHead", null);
        setIntField(term250, term250.getClass(), "sourcePosition", 0);
        setField(term250, term250.getClass(), "jsType", null);
        setField(term250, term250.getClass(), "parent", null);
        setField(term248, term248.getClass(), "next", term250);
        setIntField(term253, term253.getClass(), "type", 0);
        setField(term253, term253.getClass(), "next", null);
        setField(term253, term253.getClass(), "first", null);
        setField(term253, term253.getClass(), "last", null);
        setField(term253, term253.getClass(), "propListHead", null);
        setIntField(term253, term253.getClass(), "sourcePosition", 0);
        setField(term253, term253.getClass(), "jsType", null);
        setField(term253, term253.getClass(), "parent", null);
        setField(term248, term248.getClass(), "first", term253);
        setIntField(term256, term256.getClass(), "type", 0);
        setField(term256, term256.getClass(), "next", null);
        setField(term256, term256.getClass(), "first", null);
        setField(term256, term256.getClass(), "last", null);
        setField(term256, term256.getClass(), "propListHead", null);
        setIntField(term256, term256.getClass(), "sourcePosition", 0);
        setField(term256, term256.getClass(), "jsType", null);
        setField(term256, term256.getClass(), "parent", null);
        setField(term248, term248.getClass(), "last", term256);
        setField(term248, term248.getClass(), "propListHead", null);
        setIntField(term248, term248.getClass(), "sourcePosition", 0);
        setField(term248, term248.getClass(), "jsType", null);
        setField(term248, term248.getClass(), "parent", null);
        setField(term246, term246.getClass(), "next", term248);
        setIntField(term260, term260.getClass(), "type", 0);
        setField(term260, term260.getClass(), "next", null);
        setField(term260, term260.getClass(), "first", null);
        setField(term260, term260.getClass(), "last", null);
        setField(term260, term260.getClass(), "propListHead", null);
        setIntField(term260, term260.getClass(), "sourcePosition", 0);
        setField(term260, term260.getClass(), "jsType", null);
        setField(term260, term260.getClass(), "parent", null);
        setField(term246, term246.getClass(), "first", term260);
        setIntField(term263, term263.getClass(), "type", 0);
        setField(term263, term263.getClass(), "next", null);
        setField(term263, term263.getClass(), "first", null);
        setField(term263, term263.getClass(), "last", null);
        setField(term263, term263.getClass(), "propListHead", null);
        setIntField(term263, term263.getClass(), "sourcePosition", 0);
        setField(term263, term263.getClass(), "jsType", null);
        setField(term263, term263.getClass(), "parent", null);
        setField(term246, term246.getClass(), "last", term263);
        setField(term246, term246.getClass(), "propListHead", null);
        setIntField(term246, term246.getClass(), "sourcePosition", 0);
        setField(term246, term246.getClass(), "jsType", null);
        setField(term246, term246.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term246;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term183, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


