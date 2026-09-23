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

public class NodeUtil_isForIn_1860155213164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1167;
     Object term9253;

    public NodeUtil_isForIn_1860155213164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1167 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1169 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1171 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1174 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1177 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1180 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1184 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1187 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1190 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1167, term1167.getClass(), "type", 1065595802);
        setIntField(term1169, term1169.getClass(), "type", -1097563716);
        setIntField(term1171, term1171.getClass(), "type", 0);
        setField(term1171, term1171.getClass(), "next", null);
        setField(term1171, term1171.getClass(), "first", null);
        setField(term1171, term1171.getClass(), "last", null);
        setField(term1171, term1171.getClass(), "propListHead", null);
        setIntField(term1171, term1171.getClass(), "sourcePosition", 0);
        setField(term1171, term1171.getClass(), "jsType", null);
        setField(term1171, term1171.getClass(), "parent", null);
        setField(term1169, term1169.getClass(), "next", term1171);
        setIntField(term1174, term1174.getClass(), "type", 0);
        setField(term1174, term1174.getClass(), "next", null);
        setField(term1174, term1174.getClass(), "first", null);
        setField(term1174, term1174.getClass(), "last", null);
        setField(term1174, term1174.getClass(), "propListHead", null);
        setIntField(term1174, term1174.getClass(), "sourcePosition", 0);
        setField(term1174, term1174.getClass(), "jsType", null);
        setField(term1174, term1174.getClass(), "parent", null);
        setField(term1169, term1169.getClass(), "first", term1174);
        setIntField(term1177, term1177.getClass(), "type", 0);
        setField(term1177, term1177.getClass(), "next", null);
        setField(term1177, term1177.getClass(), "first", null);
        setField(term1177, term1177.getClass(), "last", null);
        setField(term1177, term1177.getClass(), "propListHead", null);
        setIntField(term1177, term1177.getClass(), "sourcePosition", 0);
        setField(term1177, term1177.getClass(), "jsType", null);
        setField(term1177, term1177.getClass(), "parent", null);
        setField(term1169, term1169.getClass(), "last", term1177);
        setField(term1180, term1180.getClass(), "next", null);
        setIntField(term1180, term1180.getClass(), "type", 0);
        setIntField(term1180, term1180.getClass(), "intValue", 0);
        setField(term1180, term1180.getClass(), "objectValue", null);
        setField(term1169, term1169.getClass(), "propListHead", term1180);
        setIntField(term1169, term1169.getClass(), "sourcePosition", -516303035);
        setField(term1169, term1169.getClass(), "jsType", null);
        setField(term1169, term1169.getClass(), "parent", null);
        setField(term1167, term1167.getClass(), "next", term1169);
        setIntField(term1184, term1184.getClass(), "type", 0);
        setField(term1184, term1184.getClass(), "next", null);
        setField(term1184, term1184.getClass(), "first", null);
        setField(term1184, term1184.getClass(), "last", null);
        setField(term1184, term1184.getClass(), "propListHead", null);
        setIntField(term1184, term1184.getClass(), "sourcePosition", 0);
        setField(term1184, term1184.getClass(), "jsType", null);
        setField(term1184, term1184.getClass(), "parent", null);
        setField(term1167, term1167.getClass(), "first", term1184);
        setIntField(term1187, term1187.getClass(), "type", 0);
        setField(term1187, term1187.getClass(), "next", null);
        setField(term1187, term1187.getClass(), "first", null);
        setField(term1187, term1187.getClass(), "last", null);
        setField(term1187, term1187.getClass(), "propListHead", null);
        setIntField(term1187, term1187.getClass(), "sourcePosition", 0);
        setField(term1187, term1187.getClass(), "jsType", null);
        setField(term1187, term1187.getClass(), "parent", null);
        setField(term1167, term1167.getClass(), "last", term1187);
        setField(term1190, term1190.getClass(), "next", null);
        setIntField(term1190, term1190.getClass(), "type", 0);
        setIntField(term1190, term1190.getClass(), "intValue", 0);
        setField(term1190, term1190.getClass(), "objectValue", null);
        setField(term1167, term1167.getClass(), "propListHead", term1190);
        setIntField(term1167, term1167.getClass(), "sourcePosition", -2143043890);
        setField(term1167, term1167.getClass(), "jsType", null);
        setField(term1167, term1167.getClass(), "parent", null);
        term9253 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9254 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9255 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9256 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9257 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9258 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term9259 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9260 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9261 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term9253, term9253.getClass(), "type", 1065595802);
        setIntField(term9254, term9254.getClass(), "type", -1097563716);
        setIntField(term9255, term9255.getClass(), "type", 0);
        setField(term9255, term9255.getClass(), "next", null);
        setField(term9255, term9255.getClass(), "first", null);
        setField(term9255, term9255.getClass(), "last", null);
        setField(term9255, term9255.getClass(), "propListHead", null);
        setIntField(term9255, term9255.getClass(), "sourcePosition", 0);
        setField(term9255, term9255.getClass(), "jsType", null);
        setField(term9255, term9255.getClass(), "parent", null);
        setField(term9254, term9254.getClass(), "next", term9255);
        setIntField(term9256, term9256.getClass(), "type", 0);
        setField(term9256, term9256.getClass(), "next", null);
        setField(term9256, term9256.getClass(), "first", null);
        setField(term9256, term9256.getClass(), "last", null);
        setField(term9256, term9256.getClass(), "propListHead", null);
        setIntField(term9256, term9256.getClass(), "sourcePosition", 0);
        setField(term9256, term9256.getClass(), "jsType", null);
        setField(term9256, term9256.getClass(), "parent", null);
        setField(term9254, term9254.getClass(), "first", term9256);
        setIntField(term9257, term9257.getClass(), "type", 0);
        setField(term9257, term9257.getClass(), "next", null);
        setField(term9257, term9257.getClass(), "first", null);
        setField(term9257, term9257.getClass(), "last", null);
        setField(term9257, term9257.getClass(), "propListHead", null);
        setIntField(term9257, term9257.getClass(), "sourcePosition", 0);
        setField(term9257, term9257.getClass(), "jsType", null);
        setField(term9257, term9257.getClass(), "parent", null);
        setField(term9254, term9254.getClass(), "last", term9257);
        setField(term9258, term9258.getClass(), "next", null);
        setIntField(term9258, term9258.getClass(), "type", 0);
        setIntField(term9258, term9258.getClass(), "intValue", 0);
        setField(term9258, term9258.getClass(), "objectValue", null);
        setField(term9254, term9254.getClass(), "propListHead", term9258);
        setIntField(term9254, term9254.getClass(), "sourcePosition", -516303035);
        setField(term9254, term9254.getClass(), "jsType", null);
        setField(term9254, term9254.getClass(), "parent", null);
        setField(term9253, term9253.getClass(), "next", term9254);
        setIntField(term9259, term9259.getClass(), "type", 0);
        setField(term9259, term9259.getClass(), "next", null);
        setField(term9259, term9259.getClass(), "first", null);
        setField(term9259, term9259.getClass(), "last", null);
        setField(term9259, term9259.getClass(), "propListHead", null);
        setIntField(term9259, term9259.getClass(), "sourcePosition", 0);
        setField(term9259, term9259.getClass(), "jsType", null);
        setField(term9259, term9259.getClass(), "parent", null);
        setField(term9253, term9253.getClass(), "first", term9259);
        setIntField(term9260, term9260.getClass(), "type", 0);
        setField(term9260, term9260.getClass(), "next", null);
        setField(term9260, term9260.getClass(), "first", null);
        setField(term9260, term9260.getClass(), "last", null);
        setField(term9260, term9260.getClass(), "propListHead", null);
        setIntField(term9260, term9260.getClass(), "sourcePosition", 0);
        setField(term9260, term9260.getClass(), "jsType", null);
        setField(term9260, term9260.getClass(), "parent", null);
        setField(term9253, term9253.getClass(), "last", term9260);
        setField(term9261, term9261.getClass(), "next", null);
        setIntField(term9261, term9261.getClass(), "type", 0);
        setIntField(term9261, term9261.getClass(), "intValue", 0);
        setField(term9261, term9261.getClass(), "objectValue", null);
        setField(term9253, term9253.getClass(), "propListHead", term9261);
        setIntField(term9253, term9253.getClass(), "sourcePosition", -2143043890);
        setField(term9253, term9253.getClass(), "jsType", null);
        setField(term9253, term9253.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1167;
        Object retValue = callMethod(klass, "isForIn", argTypes, null, args);
        assertTrue(recursiveEquals(term1167, term9253));
        assertTrue(recursiveEquals(retValue, false));
    }

};


