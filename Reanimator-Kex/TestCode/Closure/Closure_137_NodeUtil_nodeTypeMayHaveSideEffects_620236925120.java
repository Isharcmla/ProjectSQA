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

public class NodeUtil_nodeTypeMayHaveSideEffects_620236925120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term406;
     Object term5221;

    public NodeUtil_nodeTypeMayHaveSideEffects_620236925120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term406 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term408 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term410 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term413 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term416 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term419 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term423 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term426 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term429 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term406, term406.getClass(), "type", 1041916673);
        setIntField(term408, term408.getClass(), "type", -2066804303);
        setIntField(term410, term410.getClass(), "type", 0);
        setField(term410, term410.getClass(), "next", null);
        setField(term410, term410.getClass(), "first", null);
        setField(term410, term410.getClass(), "last", null);
        setField(term410, term410.getClass(), "propListHead", null);
        setIntField(term410, term410.getClass(), "sourcePosition", 0);
        setField(term410, term410.getClass(), "jsType", null);
        setField(term410, term410.getClass(), "parent", null);
        setField(term408, term408.getClass(), "next", term410);
        setIntField(term413, term413.getClass(), "type", 0);
        setField(term413, term413.getClass(), "next", null);
        setField(term413, term413.getClass(), "first", null);
        setField(term413, term413.getClass(), "last", null);
        setField(term413, term413.getClass(), "propListHead", null);
        setIntField(term413, term413.getClass(), "sourcePosition", 0);
        setField(term413, term413.getClass(), "jsType", null);
        setField(term413, term413.getClass(), "parent", null);
        setField(term408, term408.getClass(), "first", term413);
        setIntField(term416, term416.getClass(), "type", 0);
        setField(term416, term416.getClass(), "next", null);
        setField(term416, term416.getClass(), "first", null);
        setField(term416, term416.getClass(), "last", null);
        setField(term416, term416.getClass(), "propListHead", null);
        setIntField(term416, term416.getClass(), "sourcePosition", 0);
        setField(term416, term416.getClass(), "jsType", null);
        setField(term416, term416.getClass(), "parent", null);
        setField(term408, term408.getClass(), "last", term416);
        setField(term419, term419.getClass(), "next", null);
        setIntField(term419, term419.getClass(), "type", 0);
        setIntField(term419, term419.getClass(), "intValue", 0);
        setField(term419, term419.getClass(), "objectValue", null);
        setField(term408, term408.getClass(), "propListHead", term419);
        setIntField(term408, term408.getClass(), "sourcePosition", -1239406390);
        setField(term408, term408.getClass(), "jsType", null);
        setField(term408, term408.getClass(), "parent", null);
        setField(term406, term406.getClass(), "next", term408);
        setIntField(term423, term423.getClass(), "type", 0);
        setField(term423, term423.getClass(), "next", null);
        setField(term423, term423.getClass(), "first", null);
        setField(term423, term423.getClass(), "last", null);
        setField(term423, term423.getClass(), "propListHead", null);
        setIntField(term423, term423.getClass(), "sourcePosition", 0);
        setField(term423, term423.getClass(), "jsType", null);
        setField(term423, term423.getClass(), "parent", null);
        setField(term406, term406.getClass(), "first", term423);
        setIntField(term426, term426.getClass(), "type", 0);
        setField(term426, term426.getClass(), "next", null);
        setField(term426, term426.getClass(), "first", null);
        setField(term426, term426.getClass(), "last", null);
        setField(term426, term426.getClass(), "propListHead", null);
        setIntField(term426, term426.getClass(), "sourcePosition", 0);
        setField(term426, term426.getClass(), "jsType", null);
        setField(term426, term426.getClass(), "parent", null);
        setField(term406, term406.getClass(), "last", term426);
        setField(term429, term429.getClass(), "next", null);
        setIntField(term429, term429.getClass(), "type", 0);
        setIntField(term429, term429.getClass(), "intValue", 0);
        setField(term429, term429.getClass(), "objectValue", null);
        setField(term406, term406.getClass(), "propListHead", term429);
        setIntField(term406, term406.getClass(), "sourcePosition", 1557431527);
        setField(term406, term406.getClass(), "jsType", null);
        setField(term406, term406.getClass(), "parent", null);
        term5221 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5222 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5223 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5224 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5225 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5226 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term5227 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5228 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5229 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term5221, term5221.getClass(), "type", 1041916673);
        setIntField(term5222, term5222.getClass(), "type", -2066804303);
        setIntField(term5223, term5223.getClass(), "type", 0);
        setField(term5223, term5223.getClass(), "next", null);
        setField(term5223, term5223.getClass(), "first", null);
        setField(term5223, term5223.getClass(), "last", null);
        setField(term5223, term5223.getClass(), "propListHead", null);
        setIntField(term5223, term5223.getClass(), "sourcePosition", 0);
        setField(term5223, term5223.getClass(), "jsType", null);
        setField(term5223, term5223.getClass(), "parent", null);
        setField(term5222, term5222.getClass(), "next", term5223);
        setIntField(term5224, term5224.getClass(), "type", 0);
        setField(term5224, term5224.getClass(), "next", null);
        setField(term5224, term5224.getClass(), "first", null);
        setField(term5224, term5224.getClass(), "last", null);
        setField(term5224, term5224.getClass(), "propListHead", null);
        setIntField(term5224, term5224.getClass(), "sourcePosition", 0);
        setField(term5224, term5224.getClass(), "jsType", null);
        setField(term5224, term5224.getClass(), "parent", null);
        setField(term5222, term5222.getClass(), "first", term5224);
        setIntField(term5225, term5225.getClass(), "type", 0);
        setField(term5225, term5225.getClass(), "next", null);
        setField(term5225, term5225.getClass(), "first", null);
        setField(term5225, term5225.getClass(), "last", null);
        setField(term5225, term5225.getClass(), "propListHead", null);
        setIntField(term5225, term5225.getClass(), "sourcePosition", 0);
        setField(term5225, term5225.getClass(), "jsType", null);
        setField(term5225, term5225.getClass(), "parent", null);
        setField(term5222, term5222.getClass(), "last", term5225);
        setField(term5226, term5226.getClass(), "next", null);
        setIntField(term5226, term5226.getClass(), "type", 0);
        setIntField(term5226, term5226.getClass(), "intValue", 0);
        setField(term5226, term5226.getClass(), "objectValue", null);
        setField(term5222, term5222.getClass(), "propListHead", term5226);
        setIntField(term5222, term5222.getClass(), "sourcePosition", -1239406390);
        setField(term5222, term5222.getClass(), "jsType", null);
        setField(term5222, term5222.getClass(), "parent", null);
        setField(term5221, term5221.getClass(), "next", term5222);
        setIntField(term5227, term5227.getClass(), "type", 0);
        setField(term5227, term5227.getClass(), "next", null);
        setField(term5227, term5227.getClass(), "first", null);
        setField(term5227, term5227.getClass(), "last", null);
        setField(term5227, term5227.getClass(), "propListHead", null);
        setIntField(term5227, term5227.getClass(), "sourcePosition", 0);
        setField(term5227, term5227.getClass(), "jsType", null);
        setField(term5227, term5227.getClass(), "parent", null);
        setField(term5221, term5221.getClass(), "first", term5227);
        setIntField(term5228, term5228.getClass(), "type", 0);
        setField(term5228, term5228.getClass(), "next", null);
        setField(term5228, term5228.getClass(), "first", null);
        setField(term5228, term5228.getClass(), "last", null);
        setField(term5228, term5228.getClass(), "propListHead", null);
        setIntField(term5228, term5228.getClass(), "sourcePosition", 0);
        setField(term5228, term5228.getClass(), "jsType", null);
        setField(term5228, term5228.getClass(), "parent", null);
        setField(term5221, term5221.getClass(), "last", term5228);
        setField(term5229, term5229.getClass(), "next", null);
        setIntField(term5229, term5229.getClass(), "type", 0);
        setIntField(term5229, term5229.getClass(), "intValue", 0);
        setField(term5229, term5229.getClass(), "objectValue", null);
        setField(term5221, term5221.getClass(), "propListHead", term5229);
        setIntField(term5221, term5221.getClass(), "sourcePosition", 1557431527);
        setField(term5221, term5221.getClass(), "jsType", null);
        setField(term5221, term5221.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term406;
        Object retValue = callMethod(klass, "nodeTypeMayHaveSideEffects", argTypes, null, args);
        assertTrue(recursiveEquals(term406, term5221));
        assertTrue(recursiveEquals(retValue, false));
    }

};


