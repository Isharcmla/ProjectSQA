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
import java.util.LinkedList;
import java.lang.Object;

public class NodeTraversal_traverseRoots_205752039581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5132;

    public NodeTraversal_traverseRoots_205752039581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5135 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5137 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5139 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5142 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5146 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5148 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5151 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5135, term5135.getClass(), "type", 548228925);
        setIntField(term5137, term5137.getClass(), "type", -749861210);
        setIntField(term5139, term5139.getClass(), "type", 1694224101);
        setField(term5139, term5139.getClass(), "next", null);
        setField(term5139, term5139.getClass(), "first", null);
        setField(term5139, term5139.getClass(), "last", null);
        setField(term5139, term5139.getClass(), "propListHead", null);
        setIntField(term5139, term5139.getClass(), "sourcePosition", 0);
        setField(term5139, term5139.getClass(), "jsType", null);
        setField(term5139, term5139.getClass(), "parent", null);
        setField(term5137, term5137.getClass(), "next", term5139);
        setIntField(term5142, term5142.getClass(), "type", 982388293);
        setField(term5142, term5142.getClass(), "next", null);
        setField(term5142, term5142.getClass(), "first", null);
        setField(term5142, term5142.getClass(), "last", term5135);
        setField(term5142, term5142.getClass(), "propListHead", null);
        setIntField(term5142, term5142.getClass(), "sourcePosition", 0);
        setField(term5142, term5142.getClass(), "jsType", null);
        setField(term5142, term5142.getClass(), "parent", null);
        setField(term5137, term5137.getClass(), "first", term5142);
        setField(term5137, term5137.getClass(), "last", term5142);
        setField(term5137, term5137.getClass(), "propListHead", null);
        setIntField(term5137, term5137.getClass(), "sourcePosition", 0);
        setField(term5137, term5137.getClass(), "jsType", null);
        setField(term5137, term5137.getClass(), "parent", null);
        setField(term5135, term5135.getClass(), "next", term5137);
        setIntField(term5146, term5146.getClass(), "type", 937859191);
        setIntField(term5148, term5148.getClass(), "type", -916584829);
        setField(term5148, term5148.getClass(), "next", null);
        setField(term5148, term5148.getClass(), "first", term5142);
        setField(term5148, term5148.getClass(), "last", null);
        setField(term5148, term5148.getClass(), "propListHead", null);
        setIntField(term5148, term5148.getClass(), "sourcePosition", 0);
        setField(term5148, term5148.getClass(), "jsType", null);
        setField(term5148, term5148.getClass(), "parent", null);
        setField(term5146, term5146.getClass(), "next", term5148);
        setIntField(term5151, term5151.getClass(), "type", -2131181468);
        setField(term5151, term5151.getClass(), "next", null);
        setField(term5151, term5151.getClass(), "first", null);
        setField(term5151, term5151.getClass(), "last", term5148);
        setField(term5151, term5151.getClass(), "propListHead", null);
        setIntField(term5151, term5151.getClass(), "sourcePosition", 0);
        setField(term5151, term5151.getClass(), "jsType", null);
        setField(term5151, term5151.getClass(), "parent", null);
        setField(term5146, term5146.getClass(), "first", term5151);
        setField(term5146, term5146.getClass(), "last", term5139);
        setField(term5146, term5146.getClass(), "propListHead", null);
        setIntField(term5146, term5146.getClass(), "sourcePosition", 0);
        setField(term5146, term5146.getClass(), "jsType", null);
        setField(term5146, term5146.getClass(), "parent", null);
        setField(term5135, term5135.getClass(), "first", term5146);
        setField(term5135, term5135.getClass(), "last", term5148);
        setField(term5135, term5135.getClass(), "propListHead", null);
        setIntField(term5135, term5135.getClass(), "sourcePosition", 0);
        setField(term5135, term5135.getClass(), "jsType", null);
        setField(term5135, term5135.getClass(), "parent", null);
        term5132 = new LinkedList();
        ((LinkedList) term5132).add(term5135);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.NodeTraversal$Callback");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term5132;
        args[2] = null;
        try {
            callMethod(klass, "traverseRoots", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


