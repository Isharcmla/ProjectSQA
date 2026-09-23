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

public class NodeTraversal_traverseRoots_20226881082 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5157;

    public NodeTraversal_traverseRoots_20226881082() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5157 = (Object[]) newArray("com.google.javascript.rhino.Node", 2);
        Object term5158 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5160 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5162 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5164 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5167 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5170 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5174 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5176 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5158, term5158.getClass(), "type", -159494544);
        setIntField(term5160, term5160.getClass(), "type", -75206835);
        setIntField(term5162, term5162.getClass(), "type", -1618206977);
        setIntField(term5164, term5164.getClass(), "type", -1747406163);
        setField(term5164, term5164.getClass(), "next", null);
        setField(term5164, term5164.getClass(), "first", null);
        setField(term5164, term5164.getClass(), "last", term5162);
        setField(term5164, term5164.getClass(), "propListHead", null);
        setIntField(term5164, term5164.getClass(), "sourcePosition", 0);
        setField(term5164, term5164.getClass(), "jsType", null);
        setField(term5164, term5164.getClass(), "parent", null);
        setField(term5162, term5162.getClass(), "next", term5164);
        setIntField(term5167, term5167.getClass(), "type", 388157121);
        setField(term5167, term5167.getClass(), "next", null);
        setField(term5167, term5167.getClass(), "first", null);
        setField(term5167, term5167.getClass(), "last", null);
        setField(term5167, term5167.getClass(), "propListHead", null);
        setIntField(term5167, term5167.getClass(), "sourcePosition", 0);
        setField(term5167, term5167.getClass(), "jsType", null);
        setField(term5167, term5167.getClass(), "parent", null);
        setField(term5162, term5162.getClass(), "first", term5167);
        setIntField(term5170, term5170.getClass(), "type", 1270666529);
        setField(term5170, term5170.getClass(), "next", null);
        setField(term5170, term5170.getClass(), "first", term5160);
        setField(term5170, term5170.getClass(), "last", term5160);
        setField(term5170, term5170.getClass(), "propListHead", null);
        setIntField(term5170, term5170.getClass(), "sourcePosition", 0);
        setField(term5170, term5170.getClass(), "jsType", null);
        setField(term5170, term5170.getClass(), "parent", null);
        setField(term5162, term5162.getClass(), "last", term5170);
        setField(term5162, term5162.getClass(), "propListHead", null);
        setIntField(term5162, term5162.getClass(), "sourcePosition", 0);
        setField(term5162, term5162.getClass(), "jsType", null);
        setField(term5162, term5162.getClass(), "parent", null);
        setField(term5160, term5160.getClass(), "next", term5162);
        setIntField(term5174, term5174.getClass(), "type", -860131894);
        setField(term5174, term5174.getClass(), "next", term5170);
        setIntField(term5176, term5176.getClass(), "type", -1146679443);
        setField(term5176, term5176.getClass(), "next", term5174);
        setField(term5176, term5176.getClass(), "first", null);
        setField(term5176, term5176.getClass(), "last", term5164);
        setField(term5176, term5176.getClass(), "propListHead", null);
        setIntField(term5176, term5176.getClass(), "sourcePosition", 0);
        setField(term5176, term5176.getClass(), "jsType", null);
        setField(term5176, term5176.getClass(), "parent", null);
        setField(term5174, term5174.getClass(), "first", term5176);
        setField(term5174, term5174.getClass(), "last", term5158);
        setField(term5174, term5174.getClass(), "propListHead", null);
        setIntField(term5174, term5174.getClass(), "sourcePosition", 0);
        setField(term5174, term5174.getClass(), "jsType", null);
        setField(term5174, term5174.getClass(), "parent", null);
        setField(term5160, term5160.getClass(), "first", term5174);
        setField(term5160, term5160.getClass(), "last", term5174);
        setField(term5160, term5160.getClass(), "propListHead", null);
        setIntField(term5160, term5160.getClass(), "sourcePosition", 0);
        setField(term5160, term5160.getClass(), "jsType", null);
        setField(term5160, term5160.getClass(), "parent", null);
        setField(term5158, term5158.getClass(), "next", term5160);
        setField(term5158, term5158.getClass(), "first", term5164);
        setField(term5158, term5158.getClass(), "last", term5167);
        setField(term5158, term5158.getClass(), "propListHead", null);
        setIntField(term5158, term5158.getClass(), "sourcePosition", 0);
        setField(term5158, term5158.getClass(), "jsType", null);
        setField(term5158, term5158.getClass(), "parent", null);
        setElement(term5157, 0, term5158);
        setElement(term5157, 1, term5167);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal$Callback");
        argTypes[2] = Array.newInstance(Class.forName("com.google.javascript.rhino.Node"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term5157;
        try {
            callMethod(klass, "traverseRoots", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


