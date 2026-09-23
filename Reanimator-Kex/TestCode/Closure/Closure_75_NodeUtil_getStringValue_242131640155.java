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

public class NodeUtil_getStringValue_242131640155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55;
     Object term5156;

    public NodeUtil_getStringValue_242131640155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term65 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term68 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term72 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term75 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term55, term55.getClass(), "type", 865208305);
        setIntField(term57, term57.getClass(), "type", -1179120542);
        setIntField(term59, term59.getClass(), "type", 0);
        setField(term59, term59.getClass(), "next", null);
        setField(term59, term59.getClass(), "first", null);
        setField(term59, term59.getClass(), "last", null);
        setField(term59, term59.getClass(), "propListHead", null);
        setIntField(term59, term59.getClass(), "sourcePosition", 0);
        setField(term59, term59.getClass(), "jsType", null);
        setField(term59, term59.getClass(), "parent", null);
        setField(term57, term57.getClass(), "next", term59);
        setIntField(term62, term62.getClass(), "type", 0);
        setField(term62, term62.getClass(), "next", null);
        setField(term62, term62.getClass(), "first", null);
        setField(term62, term62.getClass(), "last", null);
        setField(term62, term62.getClass(), "propListHead", null);
        setIntField(term62, term62.getClass(), "sourcePosition", 0);
        setField(term62, term62.getClass(), "jsType", null);
        setField(term62, term62.getClass(), "parent", null);
        setField(term57, term57.getClass(), "first", term62);
        setIntField(term65, term65.getClass(), "type", 0);
        setField(term65, term65.getClass(), "next", null);
        setField(term65, term65.getClass(), "first", null);
        setField(term65, term65.getClass(), "last", null);
        setField(term65, term65.getClass(), "propListHead", null);
        setIntField(term65, term65.getClass(), "sourcePosition", 0);
        setField(term65, term65.getClass(), "jsType", null);
        setField(term65, term65.getClass(), "parent", null);
        setField(term57, term57.getClass(), "last", term65);
        setField(term68, term68.getClass(), "next", null);
        setIntField(term68, term68.getClass(), "type", 0);
        setIntField(term68, term68.getClass(), "intValue", 0);
        setField(term68, term68.getClass(), "objectValue", null);
        setField(term57, term57.getClass(), "propListHead", term68);
        setIntField(term57, term57.getClass(), "sourcePosition", 1193880199);
        setField(term57, term57.getClass(), "jsType", null);
        setField(term57, term57.getClass(), "parent", null);
        setField(term55, term55.getClass(), "next", term57);
        setIntField(term72, term72.getClass(), "type", 0);
        setField(term72, term72.getClass(), "next", null);
        setField(term72, term72.getClass(), "first", null);
        setField(term72, term72.getClass(), "last", null);
        setField(term72, term72.getClass(), "propListHead", null);
        setIntField(term72, term72.getClass(), "sourcePosition", 0);
        setField(term72, term72.getClass(), "jsType", null);
        setField(term72, term72.getClass(), "parent", null);
        setField(term55, term55.getClass(), "first", term72);
        setIntField(term75, term75.getClass(), "type", 0);
        setField(term75, term75.getClass(), "next", null);
        setField(term75, term75.getClass(), "first", null);
        setField(term75, term75.getClass(), "last", null);
        setField(term75, term75.getClass(), "propListHead", null);
        setIntField(term75, term75.getClass(), "sourcePosition", 0);
        setField(term75, term75.getClass(), "jsType", null);
        setField(term75, term75.getClass(), "parent", null);
        setField(term55, term55.getClass(), "last", term75);
        setField(term78, term78.getClass(), "next", null);
        setIntField(term78, term78.getClass(), "type", 0);
        setIntField(term78, term78.getClass(), "intValue", 0);
        setField(term78, term78.getClass(), "objectValue", null);
        setField(term55, term55.getClass(), "propListHead", term78);
        setIntField(term55, term55.getClass(), "sourcePosition", -1087774327);
        setField(term55, term55.getClass(), "jsType", null);
        setField(term55, term55.getClass(), "parent", null);
        term5156 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5157 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5158 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5159 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5160 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5161 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term5162 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5163 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5164 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term5156, term5156.getClass(), "type", 865208305);
        setIntField(term5157, term5157.getClass(), "type", -1179120542);
        setIntField(term5158, term5158.getClass(), "type", 0);
        setField(term5158, term5158.getClass(), "next", null);
        setField(term5158, term5158.getClass(), "first", null);
        setField(term5158, term5158.getClass(), "last", null);
        setField(term5158, term5158.getClass(), "propListHead", null);
        setIntField(term5158, term5158.getClass(), "sourcePosition", 0);
        setField(term5158, term5158.getClass(), "jsType", null);
        setField(term5158, term5158.getClass(), "parent", null);
        setField(term5157, term5157.getClass(), "next", term5158);
        setIntField(term5159, term5159.getClass(), "type", 0);
        setField(term5159, term5159.getClass(), "next", null);
        setField(term5159, term5159.getClass(), "first", null);
        setField(term5159, term5159.getClass(), "last", null);
        setField(term5159, term5159.getClass(), "propListHead", null);
        setIntField(term5159, term5159.getClass(), "sourcePosition", 0);
        setField(term5159, term5159.getClass(), "jsType", null);
        setField(term5159, term5159.getClass(), "parent", null);
        setField(term5157, term5157.getClass(), "first", term5159);
        setIntField(term5160, term5160.getClass(), "type", 0);
        setField(term5160, term5160.getClass(), "next", null);
        setField(term5160, term5160.getClass(), "first", null);
        setField(term5160, term5160.getClass(), "last", null);
        setField(term5160, term5160.getClass(), "propListHead", null);
        setIntField(term5160, term5160.getClass(), "sourcePosition", 0);
        setField(term5160, term5160.getClass(), "jsType", null);
        setField(term5160, term5160.getClass(), "parent", null);
        setField(term5157, term5157.getClass(), "last", term5160);
        setField(term5161, term5161.getClass(), "next", null);
        setIntField(term5161, term5161.getClass(), "type", 0);
        setIntField(term5161, term5161.getClass(), "intValue", 0);
        setField(term5161, term5161.getClass(), "objectValue", null);
        setField(term5157, term5157.getClass(), "propListHead", term5161);
        setIntField(term5157, term5157.getClass(), "sourcePosition", 1193880199);
        setField(term5157, term5157.getClass(), "jsType", null);
        setField(term5157, term5157.getClass(), "parent", null);
        setField(term5156, term5156.getClass(), "next", term5157);
        setIntField(term5162, term5162.getClass(), "type", 0);
        setField(term5162, term5162.getClass(), "next", null);
        setField(term5162, term5162.getClass(), "first", null);
        setField(term5162, term5162.getClass(), "last", null);
        setField(term5162, term5162.getClass(), "propListHead", null);
        setIntField(term5162, term5162.getClass(), "sourcePosition", 0);
        setField(term5162, term5162.getClass(), "jsType", null);
        setField(term5162, term5162.getClass(), "parent", null);
        setField(term5156, term5156.getClass(), "first", term5162);
        setIntField(term5163, term5163.getClass(), "type", 0);
        setField(term5163, term5163.getClass(), "next", null);
        setField(term5163, term5163.getClass(), "first", null);
        setField(term5163, term5163.getClass(), "last", null);
        setField(term5163, term5163.getClass(), "propListHead", null);
        setIntField(term5163, term5163.getClass(), "sourcePosition", 0);
        setField(term5163, term5163.getClass(), "jsType", null);
        setField(term5163, term5163.getClass(), "parent", null);
        setField(term5156, term5156.getClass(), "last", term5163);
        setField(term5164, term5164.getClass(), "next", null);
        setIntField(term5164, term5164.getClass(), "type", 0);
        setIntField(term5164, term5164.getClass(), "intValue", 0);
        setField(term5164, term5164.getClass(), "objectValue", null);
        setField(term5156, term5156.getClass(), "propListHead", term5164);
        setIntField(term5156, term5156.getClass(), "sourcePosition", -1087774327);
        setField(term5156, term5156.getClass(), "jsType", null);
        setField(term5156, term5156.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term55;
        Object retValue = callMethod(klass, "getStringValue", argTypes, null, args);
        assertTrue(recursiveEquals(term55, term5156));
        assertTrue(recursiveEquals(retValue, null));
    }

};


