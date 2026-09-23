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

public class NodeUtil_isEmptyBlock_2055709421112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term213;
     Object term4114;

    public NodeUtil_isEmptyBlock_2055709421112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term213 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term215 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term217 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term220 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term223 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term226 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term230 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term233 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term236 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term213, term213.getClass(), "type", 1442160736);
        setIntField(term215, term215.getClass(), "type", -1845499264);
        setIntField(term217, term217.getClass(), "type", 0);
        setField(term217, term217.getClass(), "next", null);
        setField(term217, term217.getClass(), "first", null);
        setField(term217, term217.getClass(), "last", null);
        setField(term217, term217.getClass(), "propListHead", null);
        setIntField(term217, term217.getClass(), "sourcePosition", 0);
        setField(term217, term217.getClass(), "jsType", null);
        setField(term217, term217.getClass(), "parent", null);
        setField(term215, term215.getClass(), "next", term217);
        setIntField(term220, term220.getClass(), "type", 0);
        setField(term220, term220.getClass(), "next", null);
        setField(term220, term220.getClass(), "first", null);
        setField(term220, term220.getClass(), "last", null);
        setField(term220, term220.getClass(), "propListHead", null);
        setIntField(term220, term220.getClass(), "sourcePosition", 0);
        setField(term220, term220.getClass(), "jsType", null);
        setField(term220, term220.getClass(), "parent", null);
        setField(term215, term215.getClass(), "first", term220);
        setIntField(term223, term223.getClass(), "type", 0);
        setField(term223, term223.getClass(), "next", null);
        setField(term223, term223.getClass(), "first", null);
        setField(term223, term223.getClass(), "last", null);
        setField(term223, term223.getClass(), "propListHead", null);
        setIntField(term223, term223.getClass(), "sourcePosition", 0);
        setField(term223, term223.getClass(), "jsType", null);
        setField(term223, term223.getClass(), "parent", null);
        setField(term215, term215.getClass(), "last", term223);
        setField(term226, term226.getClass(), "next", null);
        setIntField(term226, term226.getClass(), "type", 0);
        setIntField(term226, term226.getClass(), "intValue", 0);
        setField(term226, term226.getClass(), "objectValue", null);
        setField(term215, term215.getClass(), "propListHead", term226);
        setIntField(term215, term215.getClass(), "sourcePosition", 941650513);
        setField(term215, term215.getClass(), "jsType", null);
        setField(term215, term215.getClass(), "parent", null);
        setField(term213, term213.getClass(), "next", term215);
        setIntField(term230, term230.getClass(), "type", 0);
        setField(term230, term230.getClass(), "next", null);
        setField(term230, term230.getClass(), "first", null);
        setField(term230, term230.getClass(), "last", null);
        setField(term230, term230.getClass(), "propListHead", null);
        setIntField(term230, term230.getClass(), "sourcePosition", 0);
        setField(term230, term230.getClass(), "jsType", null);
        setField(term230, term230.getClass(), "parent", null);
        setField(term213, term213.getClass(), "first", term230);
        setIntField(term233, term233.getClass(), "type", 0);
        setField(term233, term233.getClass(), "next", null);
        setField(term233, term233.getClass(), "first", null);
        setField(term233, term233.getClass(), "last", null);
        setField(term233, term233.getClass(), "propListHead", null);
        setIntField(term233, term233.getClass(), "sourcePosition", 0);
        setField(term233, term233.getClass(), "jsType", null);
        setField(term233, term233.getClass(), "parent", null);
        setField(term213, term213.getClass(), "last", term233);
        setField(term236, term236.getClass(), "next", null);
        setIntField(term236, term236.getClass(), "type", 0);
        setIntField(term236, term236.getClass(), "intValue", 0);
        setField(term236, term236.getClass(), "objectValue", null);
        setField(term213, term213.getClass(), "propListHead", term236);
        setIntField(term213, term213.getClass(), "sourcePosition", 444029505);
        setField(term213, term213.getClass(), "jsType", null);
        setField(term213, term213.getClass(), "parent", null);
        term4114 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4115 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4116 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4117 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4118 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4119 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term4120 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4121 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4122 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term4114, term4114.getClass(), "type", 1442160736);
        setIntField(term4115, term4115.getClass(), "type", -1845499264);
        setIntField(term4116, term4116.getClass(), "type", 0);
        setField(term4116, term4116.getClass(), "next", null);
        setField(term4116, term4116.getClass(), "first", null);
        setField(term4116, term4116.getClass(), "last", null);
        setField(term4116, term4116.getClass(), "propListHead", null);
        setIntField(term4116, term4116.getClass(), "sourcePosition", 0);
        setField(term4116, term4116.getClass(), "jsType", null);
        setField(term4116, term4116.getClass(), "parent", null);
        setField(term4115, term4115.getClass(), "next", term4116);
        setIntField(term4117, term4117.getClass(), "type", 0);
        setField(term4117, term4117.getClass(), "next", null);
        setField(term4117, term4117.getClass(), "first", null);
        setField(term4117, term4117.getClass(), "last", null);
        setField(term4117, term4117.getClass(), "propListHead", null);
        setIntField(term4117, term4117.getClass(), "sourcePosition", 0);
        setField(term4117, term4117.getClass(), "jsType", null);
        setField(term4117, term4117.getClass(), "parent", null);
        setField(term4115, term4115.getClass(), "first", term4117);
        setIntField(term4118, term4118.getClass(), "type", 0);
        setField(term4118, term4118.getClass(), "next", null);
        setField(term4118, term4118.getClass(), "first", null);
        setField(term4118, term4118.getClass(), "last", null);
        setField(term4118, term4118.getClass(), "propListHead", null);
        setIntField(term4118, term4118.getClass(), "sourcePosition", 0);
        setField(term4118, term4118.getClass(), "jsType", null);
        setField(term4118, term4118.getClass(), "parent", null);
        setField(term4115, term4115.getClass(), "last", term4118);
        setField(term4119, term4119.getClass(), "next", null);
        setIntField(term4119, term4119.getClass(), "type", 0);
        setIntField(term4119, term4119.getClass(), "intValue", 0);
        setField(term4119, term4119.getClass(), "objectValue", null);
        setField(term4115, term4115.getClass(), "propListHead", term4119);
        setIntField(term4115, term4115.getClass(), "sourcePosition", 941650513);
        setField(term4115, term4115.getClass(), "jsType", null);
        setField(term4115, term4115.getClass(), "parent", null);
        setField(term4114, term4114.getClass(), "next", term4115);
        setIntField(term4120, term4120.getClass(), "type", 0);
        setField(term4120, term4120.getClass(), "next", null);
        setField(term4120, term4120.getClass(), "first", null);
        setField(term4120, term4120.getClass(), "last", null);
        setField(term4120, term4120.getClass(), "propListHead", null);
        setIntField(term4120, term4120.getClass(), "sourcePosition", 0);
        setField(term4120, term4120.getClass(), "jsType", null);
        setField(term4120, term4120.getClass(), "parent", null);
        setField(term4114, term4114.getClass(), "first", term4120);
        setIntField(term4121, term4121.getClass(), "type", 0);
        setField(term4121, term4121.getClass(), "next", null);
        setField(term4121, term4121.getClass(), "first", null);
        setField(term4121, term4121.getClass(), "last", null);
        setField(term4121, term4121.getClass(), "propListHead", null);
        setIntField(term4121, term4121.getClass(), "sourcePosition", 0);
        setField(term4121, term4121.getClass(), "jsType", null);
        setField(term4121, term4121.getClass(), "parent", null);
        setField(term4114, term4114.getClass(), "last", term4121);
        setField(term4122, term4122.getClass(), "next", null);
        setIntField(term4122, term4122.getClass(), "type", 0);
        setIntField(term4122, term4122.getClass(), "intValue", 0);
        setField(term4122, term4122.getClass(), "objectValue", null);
        setField(term4114, term4114.getClass(), "propListHead", term4122);
        setIntField(term4114, term4114.getClass(), "sourcePosition", 444029505);
        setField(term4114, term4114.getClass(), "jsType", null);
        setField(term4114, term4114.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term213;
        Object retValue = callMethod(klass, "isEmptyBlock", argTypes, null, args);
        assertTrue(recursiveEquals(term213, term4114));
        assertTrue(recursiveEquals(retValue, false));
    }

};


