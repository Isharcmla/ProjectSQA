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

public class NodeUtil_getNumberValue_42027968158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136;
     Object term5297;

    public NodeUtil_getNumberValue_42027968158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term138 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term140 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term143 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term146 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term149 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term153 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term156 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term159 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term136, term136.getClass(), "type", -2095575670);
        setIntField(term138, term138.getClass(), "type", -93135961);
        setIntField(term140, term140.getClass(), "type", 0);
        setField(term140, term140.getClass(), "next", null);
        setField(term140, term140.getClass(), "first", null);
        setField(term140, term140.getClass(), "last", null);
        setField(term140, term140.getClass(), "propListHead", null);
        setIntField(term140, term140.getClass(), "sourcePosition", 0);
        setField(term140, term140.getClass(), "jsType", null);
        setField(term140, term140.getClass(), "parent", null);
        setField(term138, term138.getClass(), "next", term140);
        setIntField(term143, term143.getClass(), "type", 0);
        setField(term143, term143.getClass(), "next", null);
        setField(term143, term143.getClass(), "first", null);
        setField(term143, term143.getClass(), "last", null);
        setField(term143, term143.getClass(), "propListHead", null);
        setIntField(term143, term143.getClass(), "sourcePosition", 0);
        setField(term143, term143.getClass(), "jsType", null);
        setField(term143, term143.getClass(), "parent", null);
        setField(term138, term138.getClass(), "first", term143);
        setIntField(term146, term146.getClass(), "type", 0);
        setField(term146, term146.getClass(), "next", null);
        setField(term146, term146.getClass(), "first", null);
        setField(term146, term146.getClass(), "last", null);
        setField(term146, term146.getClass(), "propListHead", null);
        setIntField(term146, term146.getClass(), "sourcePosition", 0);
        setField(term146, term146.getClass(), "jsType", null);
        setField(term146, term146.getClass(), "parent", null);
        setField(term138, term138.getClass(), "last", term146);
        setField(term149, term149.getClass(), "next", null);
        setIntField(term149, term149.getClass(), "type", 0);
        setIntField(term149, term149.getClass(), "intValue", 0);
        setField(term149, term149.getClass(), "objectValue", null);
        setField(term138, term138.getClass(), "propListHead", term149);
        setIntField(term138, term138.getClass(), "sourcePosition", 287287233);
        setField(term138, term138.getClass(), "jsType", null);
        setField(term138, term138.getClass(), "parent", null);
        setField(term136, term136.getClass(), "next", term138);
        setIntField(term153, term153.getClass(), "type", 0);
        setField(term153, term153.getClass(), "next", null);
        setField(term153, term153.getClass(), "first", null);
        setField(term153, term153.getClass(), "last", null);
        setField(term153, term153.getClass(), "propListHead", null);
        setIntField(term153, term153.getClass(), "sourcePosition", 0);
        setField(term153, term153.getClass(), "jsType", null);
        setField(term153, term153.getClass(), "parent", null);
        setField(term136, term136.getClass(), "first", term153);
        setIntField(term156, term156.getClass(), "type", 0);
        setField(term156, term156.getClass(), "next", null);
        setField(term156, term156.getClass(), "first", null);
        setField(term156, term156.getClass(), "last", null);
        setField(term156, term156.getClass(), "propListHead", null);
        setIntField(term156, term156.getClass(), "sourcePosition", 0);
        setField(term156, term156.getClass(), "jsType", null);
        setField(term156, term156.getClass(), "parent", null);
        setField(term136, term136.getClass(), "last", term156);
        setField(term159, term159.getClass(), "next", null);
        setIntField(term159, term159.getClass(), "type", 0);
        setIntField(term159, term159.getClass(), "intValue", 0);
        setField(term159, term159.getClass(), "objectValue", null);
        setField(term136, term136.getClass(), "propListHead", term159);
        setIntField(term136, term136.getClass(), "sourcePosition", 962840079);
        setField(term136, term136.getClass(), "jsType", null);
        setField(term136, term136.getClass(), "parent", null);
        term5297 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5298 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5299 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5300 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5301 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5302 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term5303 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5304 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5305 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term5297, term5297.getClass(), "type", -2095575670);
        setIntField(term5298, term5298.getClass(), "type", -93135961);
        setIntField(term5299, term5299.getClass(), "type", 0);
        setField(term5299, term5299.getClass(), "next", null);
        setField(term5299, term5299.getClass(), "first", null);
        setField(term5299, term5299.getClass(), "last", null);
        setField(term5299, term5299.getClass(), "propListHead", null);
        setIntField(term5299, term5299.getClass(), "sourcePosition", 0);
        setField(term5299, term5299.getClass(), "jsType", null);
        setField(term5299, term5299.getClass(), "parent", null);
        setField(term5298, term5298.getClass(), "next", term5299);
        setIntField(term5300, term5300.getClass(), "type", 0);
        setField(term5300, term5300.getClass(), "next", null);
        setField(term5300, term5300.getClass(), "first", null);
        setField(term5300, term5300.getClass(), "last", null);
        setField(term5300, term5300.getClass(), "propListHead", null);
        setIntField(term5300, term5300.getClass(), "sourcePosition", 0);
        setField(term5300, term5300.getClass(), "jsType", null);
        setField(term5300, term5300.getClass(), "parent", null);
        setField(term5298, term5298.getClass(), "first", term5300);
        setIntField(term5301, term5301.getClass(), "type", 0);
        setField(term5301, term5301.getClass(), "next", null);
        setField(term5301, term5301.getClass(), "first", null);
        setField(term5301, term5301.getClass(), "last", null);
        setField(term5301, term5301.getClass(), "propListHead", null);
        setIntField(term5301, term5301.getClass(), "sourcePosition", 0);
        setField(term5301, term5301.getClass(), "jsType", null);
        setField(term5301, term5301.getClass(), "parent", null);
        setField(term5298, term5298.getClass(), "last", term5301);
        setField(term5302, term5302.getClass(), "next", null);
        setIntField(term5302, term5302.getClass(), "type", 0);
        setIntField(term5302, term5302.getClass(), "intValue", 0);
        setField(term5302, term5302.getClass(), "objectValue", null);
        setField(term5298, term5298.getClass(), "propListHead", term5302);
        setIntField(term5298, term5298.getClass(), "sourcePosition", 287287233);
        setField(term5298, term5298.getClass(), "jsType", null);
        setField(term5298, term5298.getClass(), "parent", null);
        setField(term5297, term5297.getClass(), "next", term5298);
        setIntField(term5303, term5303.getClass(), "type", 0);
        setField(term5303, term5303.getClass(), "next", null);
        setField(term5303, term5303.getClass(), "first", null);
        setField(term5303, term5303.getClass(), "last", null);
        setField(term5303, term5303.getClass(), "propListHead", null);
        setIntField(term5303, term5303.getClass(), "sourcePosition", 0);
        setField(term5303, term5303.getClass(), "jsType", null);
        setField(term5303, term5303.getClass(), "parent", null);
        setField(term5297, term5297.getClass(), "first", term5303);
        setIntField(term5304, term5304.getClass(), "type", 0);
        setField(term5304, term5304.getClass(), "next", null);
        setField(term5304, term5304.getClass(), "first", null);
        setField(term5304, term5304.getClass(), "last", null);
        setField(term5304, term5304.getClass(), "propListHead", null);
        setIntField(term5304, term5304.getClass(), "sourcePosition", 0);
        setField(term5304, term5304.getClass(), "jsType", null);
        setField(term5304, term5304.getClass(), "parent", null);
        setField(term5297, term5297.getClass(), "last", term5304);
        setField(term5305, term5305.getClass(), "next", null);
        setIntField(term5305, term5305.getClass(), "type", 0);
        setIntField(term5305, term5305.getClass(), "intValue", 0);
        setField(term5305, term5305.getClass(), "objectValue", null);
        setField(term5297, term5297.getClass(), "propListHead", term5305);
        setIntField(term5297, term5297.getClass(), "sourcePosition", 962840079);
        setField(term5297, term5297.getClass(), "jsType", null);
        setField(term5297, term5297.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term136;
        Object retValue = callMethod(klass, "getNumberValue", argTypes, null, args);
        assertTrue(recursiveEquals(term136, term5297));
        assertTrue(recursiveEquals(retValue, null));
    }

};


