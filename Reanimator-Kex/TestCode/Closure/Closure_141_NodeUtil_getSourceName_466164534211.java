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

public class NodeUtil_getSourceName_466164534211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3224;
     Object term17591;

    public NodeUtil_getSourceName_466164534211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3224 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3226 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3228 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3231 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3234 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3237 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3241 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3244 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3247 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3224, term3224.getClass(), "type", -1062027102);
        setIntField(term3226, term3226.getClass(), "type", 522440332);
        setIntField(term3228, term3228.getClass(), "type", 0);
        setField(term3228, term3228.getClass(), "next", null);
        setField(term3228, term3228.getClass(), "first", null);
        setField(term3228, term3228.getClass(), "last", null);
        setField(term3228, term3228.getClass(), "propListHead", null);
        setIntField(term3228, term3228.getClass(), "sourcePosition", 0);
        setField(term3228, term3228.getClass(), "jsType", null);
        setField(term3228, term3228.getClass(), "parent", null);
        setField(term3226, term3226.getClass(), "next", term3228);
        setIntField(term3231, term3231.getClass(), "type", 0);
        setField(term3231, term3231.getClass(), "next", null);
        setField(term3231, term3231.getClass(), "first", null);
        setField(term3231, term3231.getClass(), "last", null);
        setField(term3231, term3231.getClass(), "propListHead", null);
        setIntField(term3231, term3231.getClass(), "sourcePosition", 0);
        setField(term3231, term3231.getClass(), "jsType", null);
        setField(term3231, term3231.getClass(), "parent", null);
        setField(term3226, term3226.getClass(), "first", term3231);
        setIntField(term3234, term3234.getClass(), "type", 0);
        setField(term3234, term3234.getClass(), "next", null);
        setField(term3234, term3234.getClass(), "first", null);
        setField(term3234, term3234.getClass(), "last", null);
        setField(term3234, term3234.getClass(), "propListHead", null);
        setIntField(term3234, term3234.getClass(), "sourcePosition", 0);
        setField(term3234, term3234.getClass(), "jsType", null);
        setField(term3234, term3234.getClass(), "parent", null);
        setField(term3226, term3226.getClass(), "last", term3234);
        setField(term3237, term3237.getClass(), "next", null);
        setIntField(term3237, term3237.getClass(), "type", 0);
        setIntField(term3237, term3237.getClass(), "intValue", 0);
        setField(term3237, term3237.getClass(), "objectValue", null);
        setField(term3226, term3226.getClass(), "propListHead", term3237);
        setIntField(term3226, term3226.getClass(), "sourcePosition", -758778797);
        setField(term3226, term3226.getClass(), "jsType", null);
        setField(term3226, term3226.getClass(), "parent", null);
        setField(term3224, term3224.getClass(), "next", term3226);
        setIntField(term3241, term3241.getClass(), "type", 0);
        setField(term3241, term3241.getClass(), "next", null);
        setField(term3241, term3241.getClass(), "first", null);
        setField(term3241, term3241.getClass(), "last", null);
        setField(term3241, term3241.getClass(), "propListHead", null);
        setIntField(term3241, term3241.getClass(), "sourcePosition", 0);
        setField(term3241, term3241.getClass(), "jsType", null);
        setField(term3241, term3241.getClass(), "parent", null);
        setField(term3224, term3224.getClass(), "first", term3241);
        setIntField(term3244, term3244.getClass(), "type", 0);
        setField(term3244, term3244.getClass(), "next", null);
        setField(term3244, term3244.getClass(), "first", null);
        setField(term3244, term3244.getClass(), "last", null);
        setField(term3244, term3244.getClass(), "propListHead", null);
        setIntField(term3244, term3244.getClass(), "sourcePosition", 0);
        setField(term3244, term3244.getClass(), "jsType", null);
        setField(term3244, term3244.getClass(), "parent", null);
        setField(term3224, term3224.getClass(), "last", term3244);
        setField(term3247, term3247.getClass(), "next", null);
        setIntField(term3247, term3247.getClass(), "type", 0);
        setIntField(term3247, term3247.getClass(), "intValue", 0);
        setField(term3247, term3247.getClass(), "objectValue", null);
        setField(term3224, term3224.getClass(), "propListHead", term3247);
        setIntField(term3224, term3224.getClass(), "sourcePosition", 765680355);
        setField(term3224, term3224.getClass(), "jsType", null);
        setField(term3224, term3224.getClass(), "parent", null);
        term17591 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17592 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17593 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17594 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17595 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17596 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term17597 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17598 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17599 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term17591, term17591.getClass(), "type", -1062027102);
        setIntField(term17592, term17592.getClass(), "type", 522440332);
        setIntField(term17593, term17593.getClass(), "type", 0);
        setField(term17593, term17593.getClass(), "next", null);
        setField(term17593, term17593.getClass(), "first", null);
        setField(term17593, term17593.getClass(), "last", null);
        setField(term17593, term17593.getClass(), "propListHead", null);
        setIntField(term17593, term17593.getClass(), "sourcePosition", 0);
        setField(term17593, term17593.getClass(), "jsType", null);
        setField(term17593, term17593.getClass(), "parent", null);
        setField(term17592, term17592.getClass(), "next", term17593);
        setIntField(term17594, term17594.getClass(), "type", 0);
        setField(term17594, term17594.getClass(), "next", null);
        setField(term17594, term17594.getClass(), "first", null);
        setField(term17594, term17594.getClass(), "last", null);
        setField(term17594, term17594.getClass(), "propListHead", null);
        setIntField(term17594, term17594.getClass(), "sourcePosition", 0);
        setField(term17594, term17594.getClass(), "jsType", null);
        setField(term17594, term17594.getClass(), "parent", null);
        setField(term17592, term17592.getClass(), "first", term17594);
        setIntField(term17595, term17595.getClass(), "type", 0);
        setField(term17595, term17595.getClass(), "next", null);
        setField(term17595, term17595.getClass(), "first", null);
        setField(term17595, term17595.getClass(), "last", null);
        setField(term17595, term17595.getClass(), "propListHead", null);
        setIntField(term17595, term17595.getClass(), "sourcePosition", 0);
        setField(term17595, term17595.getClass(), "jsType", null);
        setField(term17595, term17595.getClass(), "parent", null);
        setField(term17592, term17592.getClass(), "last", term17595);
        setField(term17596, term17596.getClass(), "next", null);
        setIntField(term17596, term17596.getClass(), "type", 0);
        setIntField(term17596, term17596.getClass(), "intValue", 0);
        setField(term17596, term17596.getClass(), "objectValue", null);
        setField(term17592, term17592.getClass(), "propListHead", term17596);
        setIntField(term17592, term17592.getClass(), "sourcePosition", -758778797);
        setField(term17592, term17592.getClass(), "jsType", null);
        setField(term17592, term17592.getClass(), "parent", null);
        setField(term17591, term17591.getClass(), "next", term17592);
        setIntField(term17597, term17597.getClass(), "type", 0);
        setField(term17597, term17597.getClass(), "next", null);
        setField(term17597, term17597.getClass(), "first", null);
        setField(term17597, term17597.getClass(), "last", null);
        setField(term17597, term17597.getClass(), "propListHead", null);
        setIntField(term17597, term17597.getClass(), "sourcePosition", 0);
        setField(term17597, term17597.getClass(), "jsType", null);
        setField(term17597, term17597.getClass(), "parent", null);
        setField(term17591, term17591.getClass(), "first", term17597);
        setIntField(term17598, term17598.getClass(), "type", 0);
        setField(term17598, term17598.getClass(), "next", null);
        setField(term17598, term17598.getClass(), "first", null);
        setField(term17598, term17598.getClass(), "last", null);
        setField(term17598, term17598.getClass(), "propListHead", null);
        setIntField(term17598, term17598.getClass(), "sourcePosition", 0);
        setField(term17598, term17598.getClass(), "jsType", null);
        setField(term17598, term17598.getClass(), "parent", null);
        setField(term17591, term17591.getClass(), "last", term17598);
        setField(term17599, term17599.getClass(), "next", null);
        setIntField(term17599, term17599.getClass(), "type", 0);
        setIntField(term17599, term17599.getClass(), "intValue", 0);
        setField(term17599, term17599.getClass(), "objectValue", null);
        setField(term17591, term17591.getClass(), "propListHead", term17599);
        setIntField(term17591, term17591.getClass(), "sourcePosition", 765680355);
        setField(term17591, term17591.getClass(), "jsType", null);
        setField(term17591, term17591.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3224;
        callMethod(klass, "getSourceName", argTypes, null, args);
        assertTrue(recursiveEquals(term3224, term17591));
    }

};


