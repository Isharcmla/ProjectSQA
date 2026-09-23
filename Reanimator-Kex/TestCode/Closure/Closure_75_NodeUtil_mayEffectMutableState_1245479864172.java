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

public class NodeUtil_mayEffectMutableState_1245479864172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term480;
     Object term7695;

    public NodeUtil_mayEffectMutableState_1245479864172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term480 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term482 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term484 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term487 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term490 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term493 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term497 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term500 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term503 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term480, term480.getClass(), "type", -507387516);
        setIntField(term482, term482.getClass(), "type", 114754804);
        setIntField(term484, term484.getClass(), "type", 0);
        setField(term484, term484.getClass(), "next", null);
        setField(term484, term484.getClass(), "first", null);
        setField(term484, term484.getClass(), "last", null);
        setField(term484, term484.getClass(), "propListHead", null);
        setIntField(term484, term484.getClass(), "sourcePosition", 0);
        setField(term484, term484.getClass(), "jsType", null);
        setField(term484, term484.getClass(), "parent", null);
        setField(term482, term482.getClass(), "next", term484);
        setIntField(term487, term487.getClass(), "type", 0);
        setField(term487, term487.getClass(), "next", null);
        setField(term487, term487.getClass(), "first", null);
        setField(term487, term487.getClass(), "last", null);
        setField(term487, term487.getClass(), "propListHead", null);
        setIntField(term487, term487.getClass(), "sourcePosition", 0);
        setField(term487, term487.getClass(), "jsType", null);
        setField(term487, term487.getClass(), "parent", null);
        setField(term482, term482.getClass(), "first", term487);
        setIntField(term490, term490.getClass(), "type", 0);
        setField(term490, term490.getClass(), "next", null);
        setField(term490, term490.getClass(), "first", null);
        setField(term490, term490.getClass(), "last", null);
        setField(term490, term490.getClass(), "propListHead", null);
        setIntField(term490, term490.getClass(), "sourcePosition", 0);
        setField(term490, term490.getClass(), "jsType", null);
        setField(term490, term490.getClass(), "parent", null);
        setField(term482, term482.getClass(), "last", term490);
        setField(term493, term493.getClass(), "next", null);
        setIntField(term493, term493.getClass(), "type", 0);
        setIntField(term493, term493.getClass(), "intValue", 0);
        setField(term493, term493.getClass(), "objectValue", null);
        setField(term482, term482.getClass(), "propListHead", term493);
        setIntField(term482, term482.getClass(), "sourcePosition", 497269071);
        setField(term482, term482.getClass(), "jsType", null);
        setField(term482, term482.getClass(), "parent", null);
        setField(term480, term480.getClass(), "next", term482);
        setIntField(term497, term497.getClass(), "type", 0);
        setField(term497, term497.getClass(), "next", null);
        setField(term497, term497.getClass(), "first", null);
        setField(term497, term497.getClass(), "last", null);
        setField(term497, term497.getClass(), "propListHead", null);
        setIntField(term497, term497.getClass(), "sourcePosition", 0);
        setField(term497, term497.getClass(), "jsType", null);
        setField(term497, term497.getClass(), "parent", null);
        setField(term480, term480.getClass(), "first", term497);
        setIntField(term500, term500.getClass(), "type", 0);
        setField(term500, term500.getClass(), "next", null);
        setField(term500, term500.getClass(), "first", null);
        setField(term500, term500.getClass(), "last", null);
        setField(term500, term500.getClass(), "propListHead", null);
        setIntField(term500, term500.getClass(), "sourcePosition", 0);
        setField(term500, term500.getClass(), "jsType", null);
        setField(term500, term500.getClass(), "parent", null);
        setField(term480, term480.getClass(), "last", term500);
        setField(term503, term503.getClass(), "next", null);
        setIntField(term503, term503.getClass(), "type", 0);
        setIntField(term503, term503.getClass(), "intValue", 0);
        setField(term503, term503.getClass(), "objectValue", null);
        setField(term480, term480.getClass(), "propListHead", term503);
        setIntField(term480, term480.getClass(), "sourcePosition", -1899301124);
        setField(term480, term480.getClass(), "jsType", null);
        setField(term480, term480.getClass(), "parent", null);
        term7695 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7696 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7697 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7698 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7699 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7700 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term7701 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7702 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7703 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term7695, term7695.getClass(), "type", -507387516);
        setIntField(term7696, term7696.getClass(), "type", 114754804);
        setIntField(term7697, term7697.getClass(), "type", 0);
        setField(term7697, term7697.getClass(), "next", null);
        setField(term7697, term7697.getClass(), "first", null);
        setField(term7697, term7697.getClass(), "last", null);
        setField(term7697, term7697.getClass(), "propListHead", null);
        setIntField(term7697, term7697.getClass(), "sourcePosition", 0);
        setField(term7697, term7697.getClass(), "jsType", null);
        setField(term7697, term7697.getClass(), "parent", null);
        setField(term7696, term7696.getClass(), "next", term7697);
        setIntField(term7698, term7698.getClass(), "type", 0);
        setField(term7698, term7698.getClass(), "next", null);
        setField(term7698, term7698.getClass(), "first", null);
        setField(term7698, term7698.getClass(), "last", null);
        setField(term7698, term7698.getClass(), "propListHead", null);
        setIntField(term7698, term7698.getClass(), "sourcePosition", 0);
        setField(term7698, term7698.getClass(), "jsType", null);
        setField(term7698, term7698.getClass(), "parent", null);
        setField(term7696, term7696.getClass(), "first", term7698);
        setIntField(term7699, term7699.getClass(), "type", 0);
        setField(term7699, term7699.getClass(), "next", null);
        setField(term7699, term7699.getClass(), "first", null);
        setField(term7699, term7699.getClass(), "last", null);
        setField(term7699, term7699.getClass(), "propListHead", null);
        setIntField(term7699, term7699.getClass(), "sourcePosition", 0);
        setField(term7699, term7699.getClass(), "jsType", null);
        setField(term7699, term7699.getClass(), "parent", null);
        setField(term7696, term7696.getClass(), "last", term7699);
        setField(term7700, term7700.getClass(), "next", null);
        setIntField(term7700, term7700.getClass(), "type", 0);
        setIntField(term7700, term7700.getClass(), "intValue", 0);
        setField(term7700, term7700.getClass(), "objectValue", null);
        setField(term7696, term7696.getClass(), "propListHead", term7700);
        setIntField(term7696, term7696.getClass(), "sourcePosition", 497269071);
        setField(term7696, term7696.getClass(), "jsType", null);
        setField(term7696, term7696.getClass(), "parent", null);
        setField(term7695, term7695.getClass(), "next", term7696);
        setIntField(term7701, term7701.getClass(), "type", 0);
        setField(term7701, term7701.getClass(), "next", null);
        setField(term7701, term7701.getClass(), "first", null);
        setField(term7701, term7701.getClass(), "last", null);
        setField(term7701, term7701.getClass(), "propListHead", null);
        setIntField(term7701, term7701.getClass(), "sourcePosition", 0);
        setField(term7701, term7701.getClass(), "jsType", null);
        setField(term7701, term7701.getClass(), "parent", null);
        setField(term7695, term7695.getClass(), "first", term7701);
        setIntField(term7702, term7702.getClass(), "type", 0);
        setField(term7702, term7702.getClass(), "next", null);
        setField(term7702, term7702.getClass(), "first", null);
        setField(term7702, term7702.getClass(), "last", null);
        setField(term7702, term7702.getClass(), "propListHead", null);
        setIntField(term7702, term7702.getClass(), "sourcePosition", 0);
        setField(term7702, term7702.getClass(), "jsType", null);
        setField(term7702, term7702.getClass(), "parent", null);
        setField(term7695, term7695.getClass(), "last", term7702);
        setField(term7703, term7703.getClass(), "next", null);
        setIntField(term7703, term7703.getClass(), "type", 0);
        setIntField(term7703, term7703.getClass(), "intValue", 0);
        setField(term7703, term7703.getClass(), "objectValue", null);
        setField(term7695, term7695.getClass(), "propListHead", term7703);
        setIntField(term7695, term7695.getClass(), "sourcePosition", -1899301124);
        setField(term7695, term7695.getClass(), "jsType", null);
        setField(term7695, term7695.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[2];
        args[0] = term480;
        args[1] = null;
        callMethod(klass, "mayEffectMutableState", argTypes, null, args);
        assertTrue(recursiveEquals(term480, term7695));
    }

};


