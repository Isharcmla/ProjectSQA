package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class Node_init_767641296211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34;
     Object term36;
     Object term63;

    public Node_init_767641296211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34 = new Integer(-883034806);
        term36 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term38 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term53 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term58 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term36, term36.getClass(), "type", 1585847225);
        setIntField(term38, term38.getClass(), "type", 597278769);
        setIntField(term40, term40.getClass(), "type", -1685132342);
        setIntField(term42, term42.getClass(), "type", -1456670397);
        setIntField(term44, term44.getClass(), "type", 1622346318);
        setField(term44, term44.getClass(), "next", null);
        setField(term44, term44.getClass(), "first", null);
        setField(term44, term44.getClass(), "last", null);
        setField(term44, term44.getClass(), "propListHead", null);
        setIntField(term44, term44.getClass(), "sourcePosition", 0);
        setField(term44, term44.getClass(), "jsType", null);
        setField(term44, term44.getClass(), "parent", null);
        setField(term42, term42.getClass(), "next", term44);
        setIntField(term47, term47.getClass(), "type", 1048535127);
        setField(term47, term47.getClass(), "next", null);
        setField(term47, term47.getClass(), "first", null);
        setField(term47, term47.getClass(), "last", term44);
        setField(term47, term47.getClass(), "propListHead", null);
        setIntField(term47, term47.getClass(), "sourcePosition", 0);
        setField(term47, term47.getClass(), "jsType", null);
        setField(term47, term47.getClass(), "parent", null);
        setField(term42, term42.getClass(), "first", term47);
        setField(term42, term42.getClass(), "last", term40);
        setField(term42, term42.getClass(), "propListHead", null);
        setIntField(term42, term42.getClass(), "sourcePosition", 0);
        setField(term42, term42.getClass(), "jsType", null);
        setField(term42, term42.getClass(), "parent", null);
        setField(term40, term40.getClass(), "next", term42);
        setField(term40, term40.getClass(), "first", term44);
        setIntField(term51, term51.getClass(), "type", -6029667);
        setIntField(term53, term53.getClass(), "type", -2068769794);
        setField(term53, term53.getClass(), "next", null);
        setField(term53, term53.getClass(), "first", term47);
        setField(term53, term53.getClass(), "last", term42);
        setField(term53, term53.getClass(), "propListHead", null);
        setIntField(term53, term53.getClass(), "sourcePosition", 0);
        setField(term53, term53.getClass(), "jsType", null);
        setField(term53, term53.getClass(), "parent", null);
        setField(term51, term51.getClass(), "next", term53);
        setField(term51, term51.getClass(), "first", term38);
        setField(term51, term51.getClass(), "last", term38);
        setField(term51, term51.getClass(), "propListHead", null);
        setIntField(term51, term51.getClass(), "sourcePosition", 0);
        setField(term51, term51.getClass(), "jsType", null);
        setField(term51, term51.getClass(), "parent", null);
        setField(term40, term40.getClass(), "last", term51);
        setField(term40, term40.getClass(), "propListHead", null);
        setIntField(term40, term40.getClass(), "sourcePosition", 0);
        setField(term40, term40.getClass(), "jsType", null);
        setField(term40, term40.getClass(), "parent", null);
        setField(term38, term38.getClass(), "next", term40);
        setIntField(term58, term58.getClass(), "type", -117576464);
        setField(term58, term58.getClass(), "next", term51);
        setField(term58, term58.getClass(), "first", term53);
        setField(term58, term58.getClass(), "last", term36);
        setField(term58, term58.getClass(), "propListHead", null);
        setIntField(term58, term58.getClass(), "sourcePosition", 0);
        setField(term58, term58.getClass(), "jsType", null);
        setField(term58, term58.getClass(), "parent", null);
        setField(term38, term38.getClass(), "first", term58);
        setField(term38, term38.getClass(), "last", term58);
        setField(term38, term38.getClass(), "propListHead", null);
        setIntField(term38, term38.getClass(), "sourcePosition", 0);
        setField(term38, term38.getClass(), "jsType", null);
        setField(term38, term38.getClass(), "parent", null);
        setField(term36, term36.getClass(), "next", term38);
        setField(term36, term36.getClass(), "first", term42);
        setField(term36, term36.getClass(), "last", term44);
        setField(term36, term36.getClass(), "propListHead", null);
        setIntField(term36, term36.getClass(), "sourcePosition", 0);
        setField(term36, term36.getClass(), "jsType", null);
        setField(term36, term36.getClass(), "parent", null);
        term63 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term65 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term67 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term69 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term71 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term74 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term85 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term63, term63.getClass(), "type", -1007160944);
        setIntField(term65, term65.getClass(), "type", 1135664017);
        setIntField(term67, term67.getClass(), "type", 590364439);
        setIntField(term69, term69.getClass(), "type", 865208305);
        setIntField(term71, term71.getClass(), "type", -1275173084);
        setField(term71, term71.getClass(), "next", null);
        setField(term71, term71.getClass(), "first", null);
        setField(term71, term71.getClass(), "last", null);
        setField(term71, term71.getClass(), "propListHead", null);
        setIntField(term71, term71.getClass(), "sourcePosition", 0);
        setField(term71, term71.getClass(), "jsType", null);
        setField(term71, term71.getClass(), "parent", null);
        setField(term69, term69.getClass(), "next", term71);
        setIntField(term74, term74.getClass(), "type", -244121226);
        setField(term74, term74.getClass(), "next", null);
        setField(term74, term74.getClass(), "first", null);
        setField(term74, term74.getClass(), "last", term71);
        setField(term74, term74.getClass(), "propListHead", null);
        setIntField(term74, term74.getClass(), "sourcePosition", 0);
        setField(term74, term74.getClass(), "jsType", null);
        setField(term74, term74.getClass(), "parent", null);
        setField(term69, term69.getClass(), "first", term74);
        setField(term69, term69.getClass(), "last", term67);
        setField(term69, term69.getClass(), "propListHead", null);
        setIntField(term69, term69.getClass(), "sourcePosition", 0);
        setField(term69, term69.getClass(), "jsType", null);
        setField(term69, term69.getClass(), "parent", null);
        setField(term67, term67.getClass(), "next", term69);
        setField(term67, term67.getClass(), "first", term71);
        setIntField(term78, term78.getClass(), "type", -1179120542);
        setIntField(term80, term80.getClass(), "type", -73683645);
        setField(term80, term80.getClass(), "next", null);
        setField(term80, term80.getClass(), "first", term74);
        setField(term80, term80.getClass(), "last", term69);
        setField(term80, term80.getClass(), "propListHead", null);
        setIntField(term80, term80.getClass(), "sourcePosition", 0);
        setField(term80, term80.getClass(), "jsType", null);
        setField(term80, term80.getClass(), "parent", null);
        setField(term78, term78.getClass(), "next", term80);
        setField(term78, term78.getClass(), "first", term65);
        setField(term78, term78.getClass(), "last", term65);
        setField(term78, term78.getClass(), "propListHead", null);
        setIntField(term78, term78.getClass(), "sourcePosition", 0);
        setField(term78, term78.getClass(), "jsType", null);
        setField(term78, term78.getClass(), "parent", null);
        setField(term67, term67.getClass(), "last", term78);
        setField(term67, term67.getClass(), "propListHead", null);
        setIntField(term67, term67.getClass(), "sourcePosition", 0);
        setField(term67, term67.getClass(), "jsType", null);
        setField(term67, term67.getClass(), "parent", null);
        setField(term65, term65.getClass(), "next", term67);
        setIntField(term85, term85.getClass(), "type", -226514366);
        setField(term85, term85.getClass(), "next", term78);
        setField(term85, term85.getClass(), "first", term80);
        setField(term85, term85.getClass(), "last", term63);
        setField(term85, term85.getClass(), "propListHead", null);
        setIntField(term85, term85.getClass(), "sourcePosition", 0);
        setField(term85, term85.getClass(), "jsType", null);
        setField(term85, term85.getClass(), "parent", null);
        setField(term65, term65.getClass(), "first", term85);
        setField(term65, term65.getClass(), "last", term85);
        setField(term65, term65.getClass(), "propListHead", null);
        setIntField(term65, term65.getClass(), "sourcePosition", 0);
        setField(term65, term65.getClass(), "jsType", null);
        setField(term65, term65.getClass(), "parent", null);
        setField(term63, term63.getClass(), "next", term65);
        setField(term63, term63.getClass(), "first", term69);
        setField(term63, term63.getClass(), "last", term71);
        setField(term63, term63.getClass(), "propListHead", null);
        setIntField(term63, term63.getClass(), "sourcePosition", 0);
        setField(term63, term63.getClass(), "jsType", null);
        setField(term63, term63.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term34;
        args[1] = term36;
        args[2] = term63;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


