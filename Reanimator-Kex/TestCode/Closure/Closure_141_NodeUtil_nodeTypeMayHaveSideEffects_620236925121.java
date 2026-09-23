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

public class NodeUtil_nodeTypeMayHaveSideEffects_620236925121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term406;
     Object term5248;

    public NodeUtil_nodeTypeMayHaveSideEffects_620236925121() {
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
        term5248 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5249 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5250 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5251 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5252 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5253 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term5254 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5255 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5256 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term5248, term5248.getClass(), "type", 1041916673);
        setIntField(term5249, term5249.getClass(), "type", -2066804303);
        setIntField(term5250, term5250.getClass(), "type", 0);
        setField(term5250, term5250.getClass(), "next", null);
        setField(term5250, term5250.getClass(), "first", null);
        setField(term5250, term5250.getClass(), "last", null);
        setField(term5250, term5250.getClass(), "propListHead", null);
        setIntField(term5250, term5250.getClass(), "sourcePosition", 0);
        setField(term5250, term5250.getClass(), "jsType", null);
        setField(term5250, term5250.getClass(), "parent", null);
        setField(term5249, term5249.getClass(), "next", term5250);
        setIntField(term5251, term5251.getClass(), "type", 0);
        setField(term5251, term5251.getClass(), "next", null);
        setField(term5251, term5251.getClass(), "first", null);
        setField(term5251, term5251.getClass(), "last", null);
        setField(term5251, term5251.getClass(), "propListHead", null);
        setIntField(term5251, term5251.getClass(), "sourcePosition", 0);
        setField(term5251, term5251.getClass(), "jsType", null);
        setField(term5251, term5251.getClass(), "parent", null);
        setField(term5249, term5249.getClass(), "first", term5251);
        setIntField(term5252, term5252.getClass(), "type", 0);
        setField(term5252, term5252.getClass(), "next", null);
        setField(term5252, term5252.getClass(), "first", null);
        setField(term5252, term5252.getClass(), "last", null);
        setField(term5252, term5252.getClass(), "propListHead", null);
        setIntField(term5252, term5252.getClass(), "sourcePosition", 0);
        setField(term5252, term5252.getClass(), "jsType", null);
        setField(term5252, term5252.getClass(), "parent", null);
        setField(term5249, term5249.getClass(), "last", term5252);
        setField(term5253, term5253.getClass(), "next", null);
        setIntField(term5253, term5253.getClass(), "type", 0);
        setIntField(term5253, term5253.getClass(), "intValue", 0);
        setField(term5253, term5253.getClass(), "objectValue", null);
        setField(term5249, term5249.getClass(), "propListHead", term5253);
        setIntField(term5249, term5249.getClass(), "sourcePosition", -1239406390);
        setField(term5249, term5249.getClass(), "jsType", null);
        setField(term5249, term5249.getClass(), "parent", null);
        setField(term5248, term5248.getClass(), "next", term5249);
        setIntField(term5254, term5254.getClass(), "type", 0);
        setField(term5254, term5254.getClass(), "next", null);
        setField(term5254, term5254.getClass(), "first", null);
        setField(term5254, term5254.getClass(), "last", null);
        setField(term5254, term5254.getClass(), "propListHead", null);
        setIntField(term5254, term5254.getClass(), "sourcePosition", 0);
        setField(term5254, term5254.getClass(), "jsType", null);
        setField(term5254, term5254.getClass(), "parent", null);
        setField(term5248, term5248.getClass(), "first", term5254);
        setIntField(term5255, term5255.getClass(), "type", 0);
        setField(term5255, term5255.getClass(), "next", null);
        setField(term5255, term5255.getClass(), "first", null);
        setField(term5255, term5255.getClass(), "last", null);
        setField(term5255, term5255.getClass(), "propListHead", null);
        setIntField(term5255, term5255.getClass(), "sourcePosition", 0);
        setField(term5255, term5255.getClass(), "jsType", null);
        setField(term5255, term5255.getClass(), "parent", null);
        setField(term5248, term5248.getClass(), "last", term5255);
        setField(term5256, term5256.getClass(), "next", null);
        setIntField(term5256, term5256.getClass(), "type", 0);
        setIntField(term5256, term5256.getClass(), "intValue", 0);
        setField(term5256, term5256.getClass(), "objectValue", null);
        setField(term5248, term5248.getClass(), "propListHead", term5256);
        setIntField(term5248, term5248.getClass(), "sourcePosition", 1557431527);
        setField(term5248, term5248.getClass(), "jsType", null);
        setField(term5248, term5248.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term406;
        Object retValue = callMethod(klass, "nodeTypeMayHaveSideEffects", argTypes, null, args);
        assertTrue(recursiveEquals(term406, term5248));
        assertTrue(recursiveEquals(retValue, false));
    }

};


