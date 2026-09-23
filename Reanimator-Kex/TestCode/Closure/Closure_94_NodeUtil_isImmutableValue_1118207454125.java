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

public class NodeUtil_isImmutableValue_1118207454125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136;
     Object term5132;

    public NodeUtil_isImmutableValue_1118207454125() {
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
        term5132 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5133 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5134 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5135 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5136 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5137 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term5138 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5139 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5140 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term5132, term5132.getClass(), "type", -2095575670);
        setIntField(term5133, term5133.getClass(), "type", -93135961);
        setIntField(term5134, term5134.getClass(), "type", 0);
        setField(term5134, term5134.getClass(), "next", null);
        setField(term5134, term5134.getClass(), "first", null);
        setField(term5134, term5134.getClass(), "last", null);
        setField(term5134, term5134.getClass(), "propListHead", null);
        setIntField(term5134, term5134.getClass(), "sourcePosition", 0);
        setField(term5134, term5134.getClass(), "jsType", null);
        setField(term5134, term5134.getClass(), "parent", null);
        setField(term5133, term5133.getClass(), "next", term5134);
        setIntField(term5135, term5135.getClass(), "type", 0);
        setField(term5135, term5135.getClass(), "next", null);
        setField(term5135, term5135.getClass(), "first", null);
        setField(term5135, term5135.getClass(), "last", null);
        setField(term5135, term5135.getClass(), "propListHead", null);
        setIntField(term5135, term5135.getClass(), "sourcePosition", 0);
        setField(term5135, term5135.getClass(), "jsType", null);
        setField(term5135, term5135.getClass(), "parent", null);
        setField(term5133, term5133.getClass(), "first", term5135);
        setIntField(term5136, term5136.getClass(), "type", 0);
        setField(term5136, term5136.getClass(), "next", null);
        setField(term5136, term5136.getClass(), "first", null);
        setField(term5136, term5136.getClass(), "last", null);
        setField(term5136, term5136.getClass(), "propListHead", null);
        setIntField(term5136, term5136.getClass(), "sourcePosition", 0);
        setField(term5136, term5136.getClass(), "jsType", null);
        setField(term5136, term5136.getClass(), "parent", null);
        setField(term5133, term5133.getClass(), "last", term5136);
        setField(term5137, term5137.getClass(), "next", null);
        setIntField(term5137, term5137.getClass(), "type", 0);
        setIntField(term5137, term5137.getClass(), "intValue", 0);
        setField(term5137, term5137.getClass(), "objectValue", null);
        setField(term5133, term5133.getClass(), "propListHead", term5137);
        setIntField(term5133, term5133.getClass(), "sourcePosition", 287287233);
        setField(term5133, term5133.getClass(), "jsType", null);
        setField(term5133, term5133.getClass(), "parent", null);
        setField(term5132, term5132.getClass(), "next", term5133);
        setIntField(term5138, term5138.getClass(), "type", 0);
        setField(term5138, term5138.getClass(), "next", null);
        setField(term5138, term5138.getClass(), "first", null);
        setField(term5138, term5138.getClass(), "last", null);
        setField(term5138, term5138.getClass(), "propListHead", null);
        setIntField(term5138, term5138.getClass(), "sourcePosition", 0);
        setField(term5138, term5138.getClass(), "jsType", null);
        setField(term5138, term5138.getClass(), "parent", null);
        setField(term5132, term5132.getClass(), "first", term5138);
        setIntField(term5139, term5139.getClass(), "type", 0);
        setField(term5139, term5139.getClass(), "next", null);
        setField(term5139, term5139.getClass(), "first", null);
        setField(term5139, term5139.getClass(), "last", null);
        setField(term5139, term5139.getClass(), "propListHead", null);
        setIntField(term5139, term5139.getClass(), "sourcePosition", 0);
        setField(term5139, term5139.getClass(), "jsType", null);
        setField(term5139, term5139.getClass(), "parent", null);
        setField(term5132, term5132.getClass(), "last", term5139);
        setField(term5140, term5140.getClass(), "next", null);
        setIntField(term5140, term5140.getClass(), "type", 0);
        setIntField(term5140, term5140.getClass(), "intValue", 0);
        setField(term5140, term5140.getClass(), "objectValue", null);
        setField(term5132, term5132.getClass(), "propListHead", term5140);
        setIntField(term5132, term5132.getClass(), "sourcePosition", 962840079);
        setField(term5132, term5132.getClass(), "jsType", null);
        setField(term5132, term5132.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term136;
        Object retValue = callMethod(klass, "isImmutableValue", argTypes, null, args);
        assertTrue(recursiveEquals(term136, term5132));
        assertTrue(recursiveEquals(retValue, false));
    }

};


