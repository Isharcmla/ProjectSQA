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

public class NodeUtil_nodeTypeMayHaveSideEffects_1759651727183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term779;
     Object term9406;

    public NodeUtil_nodeTypeMayHaveSideEffects_1759651727183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term779 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term781 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term783 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term786 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term789 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term792 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term796 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term799 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term802 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term779, term779.getClass(), "type", 1843268026);
        setIntField(term781, term781.getClass(), "type", -310648604);
        setIntField(term783, term783.getClass(), "type", 0);
        setField(term783, term783.getClass(), "next", null);
        setField(term783, term783.getClass(), "first", null);
        setField(term783, term783.getClass(), "last", null);
        setField(term783, term783.getClass(), "propListHead", null);
        setIntField(term783, term783.getClass(), "sourcePosition", 0);
        setField(term783, term783.getClass(), "jsType", null);
        setField(term783, term783.getClass(), "parent", null);
        setField(term781, term781.getClass(), "next", term783);
        setIntField(term786, term786.getClass(), "type", 0);
        setField(term786, term786.getClass(), "next", null);
        setField(term786, term786.getClass(), "first", null);
        setField(term786, term786.getClass(), "last", null);
        setField(term786, term786.getClass(), "propListHead", null);
        setIntField(term786, term786.getClass(), "sourcePosition", 0);
        setField(term786, term786.getClass(), "jsType", null);
        setField(term786, term786.getClass(), "parent", null);
        setField(term781, term781.getClass(), "first", term786);
        setIntField(term789, term789.getClass(), "type", 0);
        setField(term789, term789.getClass(), "next", null);
        setField(term789, term789.getClass(), "first", null);
        setField(term789, term789.getClass(), "last", null);
        setField(term789, term789.getClass(), "propListHead", null);
        setIntField(term789, term789.getClass(), "sourcePosition", 0);
        setField(term789, term789.getClass(), "jsType", null);
        setField(term789, term789.getClass(), "parent", null);
        setField(term781, term781.getClass(), "last", term789);
        setField(term792, term792.getClass(), "next", null);
        setIntField(term792, term792.getClass(), "type", 0);
        setIntField(term792, term792.getClass(), "intValue", 0);
        setField(term792, term792.getClass(), "objectValue", null);
        setField(term781, term781.getClass(), "propListHead", term792);
        setIntField(term781, term781.getClass(), "sourcePosition", 993388358);
        setField(term781, term781.getClass(), "jsType", null);
        setField(term781, term781.getClass(), "parent", null);
        setField(term779, term779.getClass(), "next", term781);
        setIntField(term796, term796.getClass(), "type", 0);
        setField(term796, term796.getClass(), "next", null);
        setField(term796, term796.getClass(), "first", null);
        setField(term796, term796.getClass(), "last", null);
        setField(term796, term796.getClass(), "propListHead", null);
        setIntField(term796, term796.getClass(), "sourcePosition", 0);
        setField(term796, term796.getClass(), "jsType", null);
        setField(term796, term796.getClass(), "parent", null);
        setField(term779, term779.getClass(), "first", term796);
        setIntField(term799, term799.getClass(), "type", 0);
        setField(term799, term799.getClass(), "next", null);
        setField(term799, term799.getClass(), "first", null);
        setField(term799, term799.getClass(), "last", null);
        setField(term799, term799.getClass(), "propListHead", null);
        setIntField(term799, term799.getClass(), "sourcePosition", 0);
        setField(term799, term799.getClass(), "jsType", null);
        setField(term799, term799.getClass(), "parent", null);
        setField(term779, term779.getClass(), "last", term799);
        setField(term802, term802.getClass(), "next", null);
        setIntField(term802, term802.getClass(), "type", 0);
        setIntField(term802, term802.getClass(), "intValue", 0);
        setField(term802, term802.getClass(), "objectValue", null);
        setField(term779, term779.getClass(), "propListHead", term802);
        setIntField(term779, term779.getClass(), "sourcePosition", -765191335);
        setField(term779, term779.getClass(), "jsType", null);
        setField(term779, term779.getClass(), "parent", null);
        term9406 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9407 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9408 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9409 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9410 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9411 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term9412 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9413 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9414 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term9406, term9406.getClass(), "type", 1843268026);
        setIntField(term9407, term9407.getClass(), "type", -310648604);
        setIntField(term9408, term9408.getClass(), "type", 0);
        setField(term9408, term9408.getClass(), "next", null);
        setField(term9408, term9408.getClass(), "first", null);
        setField(term9408, term9408.getClass(), "last", null);
        setField(term9408, term9408.getClass(), "propListHead", null);
        setIntField(term9408, term9408.getClass(), "sourcePosition", 0);
        setField(term9408, term9408.getClass(), "jsType", null);
        setField(term9408, term9408.getClass(), "parent", null);
        setField(term9407, term9407.getClass(), "next", term9408);
        setIntField(term9409, term9409.getClass(), "type", 0);
        setField(term9409, term9409.getClass(), "next", null);
        setField(term9409, term9409.getClass(), "first", null);
        setField(term9409, term9409.getClass(), "last", null);
        setField(term9409, term9409.getClass(), "propListHead", null);
        setIntField(term9409, term9409.getClass(), "sourcePosition", 0);
        setField(term9409, term9409.getClass(), "jsType", null);
        setField(term9409, term9409.getClass(), "parent", null);
        setField(term9407, term9407.getClass(), "first", term9409);
        setIntField(term9410, term9410.getClass(), "type", 0);
        setField(term9410, term9410.getClass(), "next", null);
        setField(term9410, term9410.getClass(), "first", null);
        setField(term9410, term9410.getClass(), "last", null);
        setField(term9410, term9410.getClass(), "propListHead", null);
        setIntField(term9410, term9410.getClass(), "sourcePosition", 0);
        setField(term9410, term9410.getClass(), "jsType", null);
        setField(term9410, term9410.getClass(), "parent", null);
        setField(term9407, term9407.getClass(), "last", term9410);
        setField(term9411, term9411.getClass(), "next", null);
        setIntField(term9411, term9411.getClass(), "type", 0);
        setIntField(term9411, term9411.getClass(), "intValue", 0);
        setField(term9411, term9411.getClass(), "objectValue", null);
        setField(term9407, term9407.getClass(), "propListHead", term9411);
        setIntField(term9407, term9407.getClass(), "sourcePosition", 993388358);
        setField(term9407, term9407.getClass(), "jsType", null);
        setField(term9407, term9407.getClass(), "parent", null);
        setField(term9406, term9406.getClass(), "next", term9407);
        setIntField(term9412, term9412.getClass(), "type", 0);
        setField(term9412, term9412.getClass(), "next", null);
        setField(term9412, term9412.getClass(), "first", null);
        setField(term9412, term9412.getClass(), "last", null);
        setField(term9412, term9412.getClass(), "propListHead", null);
        setIntField(term9412, term9412.getClass(), "sourcePosition", 0);
        setField(term9412, term9412.getClass(), "jsType", null);
        setField(term9412, term9412.getClass(), "parent", null);
        setField(term9406, term9406.getClass(), "first", term9412);
        setIntField(term9413, term9413.getClass(), "type", 0);
        setField(term9413, term9413.getClass(), "next", null);
        setField(term9413, term9413.getClass(), "first", null);
        setField(term9413, term9413.getClass(), "last", null);
        setField(term9413, term9413.getClass(), "propListHead", null);
        setIntField(term9413, term9413.getClass(), "sourcePosition", 0);
        setField(term9413, term9413.getClass(), "jsType", null);
        setField(term9413, term9413.getClass(), "parent", null);
        setField(term9406, term9406.getClass(), "last", term9413);
        setField(term9414, term9414.getClass(), "next", null);
        setIntField(term9414, term9414.getClass(), "type", 0);
        setIntField(term9414, term9414.getClass(), "intValue", 0);
        setField(term9414, term9414.getClass(), "objectValue", null);
        setField(term9406, term9406.getClass(), "propListHead", term9414);
        setIntField(term9406, term9406.getClass(), "sourcePosition", -765191335);
        setField(term9406, term9406.getClass(), "jsType", null);
        setField(term9406, term9406.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[2];
        args[0] = term779;
        args[1] = null;
        Object retValue = callMethod(klass, "nodeTypeMayHaveSideEffects", argTypes, null, args);
        assertTrue(recursiveEquals(term779, term9406));
        assertTrue(recursiveEquals(retValue, false));
    }

};


