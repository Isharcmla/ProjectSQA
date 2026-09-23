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

public class NodeUtil_isExpressionNode_1382466317150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term789;
     Object term8272;

    public NodeUtil_isExpressionNode_1382466317150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term789 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term791 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term793 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term796 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term799 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term802 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term806 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term809 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term812 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term789, term789.getClass(), "type", 1215150180);
        setIntField(term791, term791.getClass(), "type", -220791533);
        setIntField(term793, term793.getClass(), "type", 0);
        setField(term793, term793.getClass(), "next", null);
        setField(term793, term793.getClass(), "first", null);
        setField(term793, term793.getClass(), "last", null);
        setField(term793, term793.getClass(), "propListHead", null);
        setIntField(term793, term793.getClass(), "sourcePosition", 0);
        setField(term793, term793.getClass(), "jsType", null);
        setField(term793, term793.getClass(), "parent", null);
        setField(term791, term791.getClass(), "next", term793);
        setIntField(term796, term796.getClass(), "type", 0);
        setField(term796, term796.getClass(), "next", null);
        setField(term796, term796.getClass(), "first", null);
        setField(term796, term796.getClass(), "last", null);
        setField(term796, term796.getClass(), "propListHead", null);
        setIntField(term796, term796.getClass(), "sourcePosition", 0);
        setField(term796, term796.getClass(), "jsType", null);
        setField(term796, term796.getClass(), "parent", null);
        setField(term791, term791.getClass(), "first", term796);
        setIntField(term799, term799.getClass(), "type", 0);
        setField(term799, term799.getClass(), "next", null);
        setField(term799, term799.getClass(), "first", null);
        setField(term799, term799.getClass(), "last", null);
        setField(term799, term799.getClass(), "propListHead", null);
        setIntField(term799, term799.getClass(), "sourcePosition", 0);
        setField(term799, term799.getClass(), "jsType", null);
        setField(term799, term799.getClass(), "parent", null);
        setField(term791, term791.getClass(), "last", term799);
        setField(term802, term802.getClass(), "next", null);
        setIntField(term802, term802.getClass(), "type", 0);
        setIntField(term802, term802.getClass(), "intValue", 0);
        setField(term802, term802.getClass(), "objectValue", null);
        setField(term791, term791.getClass(), "propListHead", term802);
        setIntField(term791, term791.getClass(), "sourcePosition", -1127721881);
        setField(term791, term791.getClass(), "jsType", null);
        setField(term791, term791.getClass(), "parent", null);
        setField(term789, term789.getClass(), "next", term791);
        setIntField(term806, term806.getClass(), "type", 0);
        setField(term806, term806.getClass(), "next", null);
        setField(term806, term806.getClass(), "first", null);
        setField(term806, term806.getClass(), "last", null);
        setField(term806, term806.getClass(), "propListHead", null);
        setIntField(term806, term806.getClass(), "sourcePosition", 0);
        setField(term806, term806.getClass(), "jsType", null);
        setField(term806, term806.getClass(), "parent", null);
        setField(term789, term789.getClass(), "first", term806);
        setIntField(term809, term809.getClass(), "type", 0);
        setField(term809, term809.getClass(), "next", null);
        setField(term809, term809.getClass(), "first", null);
        setField(term809, term809.getClass(), "last", null);
        setField(term809, term809.getClass(), "propListHead", null);
        setIntField(term809, term809.getClass(), "sourcePosition", 0);
        setField(term809, term809.getClass(), "jsType", null);
        setField(term809, term809.getClass(), "parent", null);
        setField(term789, term789.getClass(), "last", term809);
        setField(term812, term812.getClass(), "next", null);
        setIntField(term812, term812.getClass(), "type", 0);
        setIntField(term812, term812.getClass(), "intValue", 0);
        setField(term812, term812.getClass(), "objectValue", null);
        setField(term789, term789.getClass(), "propListHead", term812);
        setIntField(term789, term789.getClass(), "sourcePosition", 1074848808);
        setField(term789, term789.getClass(), "jsType", null);
        setField(term789, term789.getClass(), "parent", null);
        term8272 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8273 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8274 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8275 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8276 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8277 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term8278 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8279 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8280 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term8272, term8272.getClass(), "type", 1215150180);
        setIntField(term8273, term8273.getClass(), "type", -220791533);
        setIntField(term8274, term8274.getClass(), "type", 0);
        setField(term8274, term8274.getClass(), "next", null);
        setField(term8274, term8274.getClass(), "first", null);
        setField(term8274, term8274.getClass(), "last", null);
        setField(term8274, term8274.getClass(), "propListHead", null);
        setIntField(term8274, term8274.getClass(), "sourcePosition", 0);
        setField(term8274, term8274.getClass(), "jsType", null);
        setField(term8274, term8274.getClass(), "parent", null);
        setField(term8273, term8273.getClass(), "next", term8274);
        setIntField(term8275, term8275.getClass(), "type", 0);
        setField(term8275, term8275.getClass(), "next", null);
        setField(term8275, term8275.getClass(), "first", null);
        setField(term8275, term8275.getClass(), "last", null);
        setField(term8275, term8275.getClass(), "propListHead", null);
        setIntField(term8275, term8275.getClass(), "sourcePosition", 0);
        setField(term8275, term8275.getClass(), "jsType", null);
        setField(term8275, term8275.getClass(), "parent", null);
        setField(term8273, term8273.getClass(), "first", term8275);
        setIntField(term8276, term8276.getClass(), "type", 0);
        setField(term8276, term8276.getClass(), "next", null);
        setField(term8276, term8276.getClass(), "first", null);
        setField(term8276, term8276.getClass(), "last", null);
        setField(term8276, term8276.getClass(), "propListHead", null);
        setIntField(term8276, term8276.getClass(), "sourcePosition", 0);
        setField(term8276, term8276.getClass(), "jsType", null);
        setField(term8276, term8276.getClass(), "parent", null);
        setField(term8273, term8273.getClass(), "last", term8276);
        setField(term8277, term8277.getClass(), "next", null);
        setIntField(term8277, term8277.getClass(), "type", 0);
        setIntField(term8277, term8277.getClass(), "intValue", 0);
        setField(term8277, term8277.getClass(), "objectValue", null);
        setField(term8273, term8273.getClass(), "propListHead", term8277);
        setIntField(term8273, term8273.getClass(), "sourcePosition", -1127721881);
        setField(term8273, term8273.getClass(), "jsType", null);
        setField(term8273, term8273.getClass(), "parent", null);
        setField(term8272, term8272.getClass(), "next", term8273);
        setIntField(term8278, term8278.getClass(), "type", 0);
        setField(term8278, term8278.getClass(), "next", null);
        setField(term8278, term8278.getClass(), "first", null);
        setField(term8278, term8278.getClass(), "last", null);
        setField(term8278, term8278.getClass(), "propListHead", null);
        setIntField(term8278, term8278.getClass(), "sourcePosition", 0);
        setField(term8278, term8278.getClass(), "jsType", null);
        setField(term8278, term8278.getClass(), "parent", null);
        setField(term8272, term8272.getClass(), "first", term8278);
        setIntField(term8279, term8279.getClass(), "type", 0);
        setField(term8279, term8279.getClass(), "next", null);
        setField(term8279, term8279.getClass(), "first", null);
        setField(term8279, term8279.getClass(), "last", null);
        setField(term8279, term8279.getClass(), "propListHead", null);
        setIntField(term8279, term8279.getClass(), "sourcePosition", 0);
        setField(term8279, term8279.getClass(), "jsType", null);
        setField(term8279, term8279.getClass(), "parent", null);
        setField(term8272, term8272.getClass(), "last", term8279);
        setField(term8280, term8280.getClass(), "next", null);
        setIntField(term8280, term8280.getClass(), "type", 0);
        setIntField(term8280, term8280.getClass(), "intValue", 0);
        setField(term8280, term8280.getClass(), "objectValue", null);
        setField(term8272, term8272.getClass(), "propListHead", term8280);
        setIntField(term8272, term8272.getClass(), "sourcePosition", 1074848808);
        setField(term8272, term8272.getClass(), "jsType", null);
        setField(term8272, term8272.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term789;
        Object retValue = callMethod(klass, "isExpressionNode", argTypes, null, args);
        assertTrue(recursiveEquals(term789, term8272));
        assertTrue(recursiveEquals(retValue, false));
    }

};


