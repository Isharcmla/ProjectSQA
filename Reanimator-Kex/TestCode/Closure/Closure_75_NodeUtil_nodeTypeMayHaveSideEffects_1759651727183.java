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
     Object term9700;

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
        term9700 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9701 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9702 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9703 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9704 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9705 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term9706 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9707 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9708 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term9700, term9700.getClass(), "type", 1843268026);
        setIntField(term9701, term9701.getClass(), "type", -310648604);
        setIntField(term9702, term9702.getClass(), "type", 0);
        setField(term9702, term9702.getClass(), "next", null);
        setField(term9702, term9702.getClass(), "first", null);
        setField(term9702, term9702.getClass(), "last", null);
        setField(term9702, term9702.getClass(), "propListHead", null);
        setIntField(term9702, term9702.getClass(), "sourcePosition", 0);
        setField(term9702, term9702.getClass(), "jsType", null);
        setField(term9702, term9702.getClass(), "parent", null);
        setField(term9701, term9701.getClass(), "next", term9702);
        setIntField(term9703, term9703.getClass(), "type", 0);
        setField(term9703, term9703.getClass(), "next", null);
        setField(term9703, term9703.getClass(), "first", null);
        setField(term9703, term9703.getClass(), "last", null);
        setField(term9703, term9703.getClass(), "propListHead", null);
        setIntField(term9703, term9703.getClass(), "sourcePosition", 0);
        setField(term9703, term9703.getClass(), "jsType", null);
        setField(term9703, term9703.getClass(), "parent", null);
        setField(term9701, term9701.getClass(), "first", term9703);
        setIntField(term9704, term9704.getClass(), "type", 0);
        setField(term9704, term9704.getClass(), "next", null);
        setField(term9704, term9704.getClass(), "first", null);
        setField(term9704, term9704.getClass(), "last", null);
        setField(term9704, term9704.getClass(), "propListHead", null);
        setIntField(term9704, term9704.getClass(), "sourcePosition", 0);
        setField(term9704, term9704.getClass(), "jsType", null);
        setField(term9704, term9704.getClass(), "parent", null);
        setField(term9701, term9701.getClass(), "last", term9704);
        setField(term9705, term9705.getClass(), "next", null);
        setIntField(term9705, term9705.getClass(), "type", 0);
        setIntField(term9705, term9705.getClass(), "intValue", 0);
        setField(term9705, term9705.getClass(), "objectValue", null);
        setField(term9701, term9701.getClass(), "propListHead", term9705);
        setIntField(term9701, term9701.getClass(), "sourcePosition", 993388358);
        setField(term9701, term9701.getClass(), "jsType", null);
        setField(term9701, term9701.getClass(), "parent", null);
        setField(term9700, term9700.getClass(), "next", term9701);
        setIntField(term9706, term9706.getClass(), "type", 0);
        setField(term9706, term9706.getClass(), "next", null);
        setField(term9706, term9706.getClass(), "first", null);
        setField(term9706, term9706.getClass(), "last", null);
        setField(term9706, term9706.getClass(), "propListHead", null);
        setIntField(term9706, term9706.getClass(), "sourcePosition", 0);
        setField(term9706, term9706.getClass(), "jsType", null);
        setField(term9706, term9706.getClass(), "parent", null);
        setField(term9700, term9700.getClass(), "first", term9706);
        setIntField(term9707, term9707.getClass(), "type", 0);
        setField(term9707, term9707.getClass(), "next", null);
        setField(term9707, term9707.getClass(), "first", null);
        setField(term9707, term9707.getClass(), "last", null);
        setField(term9707, term9707.getClass(), "propListHead", null);
        setIntField(term9707, term9707.getClass(), "sourcePosition", 0);
        setField(term9707, term9707.getClass(), "jsType", null);
        setField(term9707, term9707.getClass(), "parent", null);
        setField(term9700, term9700.getClass(), "last", term9707);
        setField(term9708, term9708.getClass(), "next", null);
        setIntField(term9708, term9708.getClass(), "type", 0);
        setIntField(term9708, term9708.getClass(), "intValue", 0);
        setField(term9708, term9708.getClass(), "objectValue", null);
        setField(term9700, term9700.getClass(), "propListHead", term9708);
        setIntField(term9700, term9700.getClass(), "sourcePosition", -765191335);
        setField(term9700, term9700.getClass(), "jsType", null);
        setField(term9700, term9700.getClass(), "parent", null);
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
        assertTrue(recursiveEquals(term779, term9700));
        assertTrue(recursiveEquals(retValue, false));
    }

};


