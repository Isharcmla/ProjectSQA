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

public class NodeUtil_getSourceName_466164534209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3197;
     Object term17525;

    public NodeUtil_getSourceName_466164534209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3197 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3199 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3201 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3204 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3207 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3210 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3214 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3217 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3220 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3197, term3197.getClass(), "type", 1979044375);
        setIntField(term3199, term3199.getClass(), "type", 923905351);
        setIntField(term3201, term3201.getClass(), "type", 0);
        setField(term3201, term3201.getClass(), "next", null);
        setField(term3201, term3201.getClass(), "first", null);
        setField(term3201, term3201.getClass(), "last", null);
        setField(term3201, term3201.getClass(), "propListHead", null);
        setIntField(term3201, term3201.getClass(), "sourcePosition", 0);
        setField(term3201, term3201.getClass(), "jsType", null);
        setField(term3201, term3201.getClass(), "parent", null);
        setField(term3199, term3199.getClass(), "next", term3201);
        setIntField(term3204, term3204.getClass(), "type", 0);
        setField(term3204, term3204.getClass(), "next", null);
        setField(term3204, term3204.getClass(), "first", null);
        setField(term3204, term3204.getClass(), "last", null);
        setField(term3204, term3204.getClass(), "propListHead", null);
        setIntField(term3204, term3204.getClass(), "sourcePosition", 0);
        setField(term3204, term3204.getClass(), "jsType", null);
        setField(term3204, term3204.getClass(), "parent", null);
        setField(term3199, term3199.getClass(), "first", term3204);
        setIntField(term3207, term3207.getClass(), "type", 0);
        setField(term3207, term3207.getClass(), "next", null);
        setField(term3207, term3207.getClass(), "first", null);
        setField(term3207, term3207.getClass(), "last", null);
        setField(term3207, term3207.getClass(), "propListHead", null);
        setIntField(term3207, term3207.getClass(), "sourcePosition", 0);
        setField(term3207, term3207.getClass(), "jsType", null);
        setField(term3207, term3207.getClass(), "parent", null);
        setField(term3199, term3199.getClass(), "last", term3207);
        setField(term3210, term3210.getClass(), "next", null);
        setIntField(term3210, term3210.getClass(), "type", 0);
        setIntField(term3210, term3210.getClass(), "intValue", 0);
        setField(term3210, term3210.getClass(), "objectValue", null);
        setField(term3199, term3199.getClass(), "propListHead", term3210);
        setIntField(term3199, term3199.getClass(), "sourcePosition", -1652091834);
        setField(term3199, term3199.getClass(), "jsType", null);
        setField(term3199, term3199.getClass(), "parent", null);
        setField(term3197, term3197.getClass(), "next", term3199);
        setIntField(term3214, term3214.getClass(), "type", 0);
        setField(term3214, term3214.getClass(), "next", null);
        setField(term3214, term3214.getClass(), "first", null);
        setField(term3214, term3214.getClass(), "last", null);
        setField(term3214, term3214.getClass(), "propListHead", null);
        setIntField(term3214, term3214.getClass(), "sourcePosition", 0);
        setField(term3214, term3214.getClass(), "jsType", null);
        setField(term3214, term3214.getClass(), "parent", null);
        setField(term3197, term3197.getClass(), "first", term3214);
        setIntField(term3217, term3217.getClass(), "type", 0);
        setField(term3217, term3217.getClass(), "next", null);
        setField(term3217, term3217.getClass(), "first", null);
        setField(term3217, term3217.getClass(), "last", null);
        setField(term3217, term3217.getClass(), "propListHead", null);
        setIntField(term3217, term3217.getClass(), "sourcePosition", 0);
        setField(term3217, term3217.getClass(), "jsType", null);
        setField(term3217, term3217.getClass(), "parent", null);
        setField(term3197, term3197.getClass(), "last", term3217);
        setField(term3220, term3220.getClass(), "next", null);
        setIntField(term3220, term3220.getClass(), "type", 0);
        setIntField(term3220, term3220.getClass(), "intValue", 0);
        setField(term3220, term3220.getClass(), "objectValue", null);
        setField(term3197, term3197.getClass(), "propListHead", term3220);
        setIntField(term3197, term3197.getClass(), "sourcePosition", -282021579);
        setField(term3197, term3197.getClass(), "jsType", null);
        setField(term3197, term3197.getClass(), "parent", null);
        term17525 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17526 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17527 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17528 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17529 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17530 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term17531 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17532 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17533 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term17525, term17525.getClass(), "type", 1979044375);
        setIntField(term17526, term17526.getClass(), "type", 923905351);
        setIntField(term17527, term17527.getClass(), "type", 0);
        setField(term17527, term17527.getClass(), "next", null);
        setField(term17527, term17527.getClass(), "first", null);
        setField(term17527, term17527.getClass(), "last", null);
        setField(term17527, term17527.getClass(), "propListHead", null);
        setIntField(term17527, term17527.getClass(), "sourcePosition", 0);
        setField(term17527, term17527.getClass(), "jsType", null);
        setField(term17527, term17527.getClass(), "parent", null);
        setField(term17526, term17526.getClass(), "next", term17527);
        setIntField(term17528, term17528.getClass(), "type", 0);
        setField(term17528, term17528.getClass(), "next", null);
        setField(term17528, term17528.getClass(), "first", null);
        setField(term17528, term17528.getClass(), "last", null);
        setField(term17528, term17528.getClass(), "propListHead", null);
        setIntField(term17528, term17528.getClass(), "sourcePosition", 0);
        setField(term17528, term17528.getClass(), "jsType", null);
        setField(term17528, term17528.getClass(), "parent", null);
        setField(term17526, term17526.getClass(), "first", term17528);
        setIntField(term17529, term17529.getClass(), "type", 0);
        setField(term17529, term17529.getClass(), "next", null);
        setField(term17529, term17529.getClass(), "first", null);
        setField(term17529, term17529.getClass(), "last", null);
        setField(term17529, term17529.getClass(), "propListHead", null);
        setIntField(term17529, term17529.getClass(), "sourcePosition", 0);
        setField(term17529, term17529.getClass(), "jsType", null);
        setField(term17529, term17529.getClass(), "parent", null);
        setField(term17526, term17526.getClass(), "last", term17529);
        setField(term17530, term17530.getClass(), "next", null);
        setIntField(term17530, term17530.getClass(), "type", 0);
        setIntField(term17530, term17530.getClass(), "intValue", 0);
        setField(term17530, term17530.getClass(), "objectValue", null);
        setField(term17526, term17526.getClass(), "propListHead", term17530);
        setIntField(term17526, term17526.getClass(), "sourcePosition", -1652091834);
        setField(term17526, term17526.getClass(), "jsType", null);
        setField(term17526, term17526.getClass(), "parent", null);
        setField(term17525, term17525.getClass(), "next", term17526);
        setIntField(term17531, term17531.getClass(), "type", 0);
        setField(term17531, term17531.getClass(), "next", null);
        setField(term17531, term17531.getClass(), "first", null);
        setField(term17531, term17531.getClass(), "last", null);
        setField(term17531, term17531.getClass(), "propListHead", null);
        setIntField(term17531, term17531.getClass(), "sourcePosition", 0);
        setField(term17531, term17531.getClass(), "jsType", null);
        setField(term17531, term17531.getClass(), "parent", null);
        setField(term17525, term17525.getClass(), "first", term17531);
        setIntField(term17532, term17532.getClass(), "type", 0);
        setField(term17532, term17532.getClass(), "next", null);
        setField(term17532, term17532.getClass(), "first", null);
        setField(term17532, term17532.getClass(), "last", null);
        setField(term17532, term17532.getClass(), "propListHead", null);
        setIntField(term17532, term17532.getClass(), "sourcePosition", 0);
        setField(term17532, term17532.getClass(), "jsType", null);
        setField(term17532, term17532.getClass(), "parent", null);
        setField(term17525, term17525.getClass(), "last", term17532);
        setField(term17533, term17533.getClass(), "next", null);
        setIntField(term17533, term17533.getClass(), "type", 0);
        setIntField(term17533, term17533.getClass(), "intValue", 0);
        setField(term17533, term17533.getClass(), "objectValue", null);
        setField(term17525, term17525.getClass(), "propListHead", term17533);
        setIntField(term17525, term17525.getClass(), "sourcePosition", -282021579);
        setField(term17525, term17525.getClass(), "jsType", null);
        setField(term17525, term17525.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3197;
        callMethod(klass, "getSourceName", argTypes, null, args);
        assertTrue(recursiveEquals(term3197, term17525));
    }

};


