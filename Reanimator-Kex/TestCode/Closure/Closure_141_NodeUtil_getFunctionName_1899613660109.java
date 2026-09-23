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
import java.lang.UnsupportedOperationException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodeUtil_getFunctionName_1899613660109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55;
     Object term82;

    public NodeUtil_getFunctionName_1899613660109() {
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
        term82 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term84 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term86 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term92 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term95 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term99 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term102 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term105 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term82, term82.getClass(), "type", 679763016);
        setIntField(term84, term84.getClass(), "type", -157887805);
        setIntField(term86, term86.getClass(), "type", 0);
        setField(term86, term86.getClass(), "next", null);
        setField(term86, term86.getClass(), "first", null);
        setField(term86, term86.getClass(), "last", null);
        setField(term86, term86.getClass(), "propListHead", null);
        setIntField(term86, term86.getClass(), "sourcePosition", 0);
        setField(term86, term86.getClass(), "jsType", null);
        setField(term86, term86.getClass(), "parent", null);
        setField(term84, term84.getClass(), "next", term86);
        setIntField(term89, term89.getClass(), "type", 0);
        setField(term89, term89.getClass(), "next", null);
        setField(term89, term89.getClass(), "first", null);
        setField(term89, term89.getClass(), "last", null);
        setField(term89, term89.getClass(), "propListHead", null);
        setIntField(term89, term89.getClass(), "sourcePosition", 0);
        setField(term89, term89.getClass(), "jsType", null);
        setField(term89, term89.getClass(), "parent", null);
        setField(term84, term84.getClass(), "first", term89);
        setIntField(term92, term92.getClass(), "type", 0);
        setField(term92, term92.getClass(), "next", null);
        setField(term92, term92.getClass(), "first", null);
        setField(term92, term92.getClass(), "last", null);
        setField(term92, term92.getClass(), "propListHead", null);
        setIntField(term92, term92.getClass(), "sourcePosition", 0);
        setField(term92, term92.getClass(), "jsType", null);
        setField(term92, term92.getClass(), "parent", null);
        setField(term84, term84.getClass(), "last", term92);
        setField(term95, term95.getClass(), "next", null);
        setIntField(term95, term95.getClass(), "type", 0);
        setIntField(term95, term95.getClass(), "intValue", 0);
        setField(term95, term95.getClass(), "objectValue", null);
        setField(term84, term84.getClass(), "propListHead", term95);
        setIntField(term84, term84.getClass(), "sourcePosition", -1016503459);
        setField(term84, term84.getClass(), "jsType", null);
        setField(term84, term84.getClass(), "parent", null);
        setField(term82, term82.getClass(), "next", term84);
        setIntField(term99, term99.getClass(), "type", 0);
        setField(term99, term99.getClass(), "next", null);
        setField(term99, term99.getClass(), "first", null);
        setField(term99, term99.getClass(), "last", null);
        setField(term99, term99.getClass(), "propListHead", null);
        setIntField(term99, term99.getClass(), "sourcePosition", 0);
        setField(term99, term99.getClass(), "jsType", null);
        setField(term99, term99.getClass(), "parent", null);
        setField(term82, term82.getClass(), "first", term99);
        setIntField(term102, term102.getClass(), "type", 0);
        setField(term102, term102.getClass(), "next", null);
        setField(term102, term102.getClass(), "first", null);
        setField(term102, term102.getClass(), "last", null);
        setField(term102, term102.getClass(), "propListHead", null);
        setIntField(term102, term102.getClass(), "sourcePosition", 0);
        setField(term102, term102.getClass(), "jsType", null);
        setField(term102, term102.getClass(), "parent", null);
        setField(term82, term82.getClass(), "last", term102);
        setField(term105, term105.getClass(), "next", null);
        setIntField(term105, term105.getClass(), "type", 0);
        setIntField(term105, term105.getClass(), "intValue", 0);
        setField(term105, term105.getClass(), "objectValue", null);
        setField(term82, term82.getClass(), "propListHead", term105);
        setIntField(term82, term82.getClass(), "sourcePosition", -1968847291);
        setField(term82, term82.getClass(), "jsType", null);
        setField(term82, term82.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term55;
        args[1] = term82;
        try {
            callMethod(klass, "getFunctionName", argTypes, null, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


