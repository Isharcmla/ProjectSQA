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

public class FoldConstants_hasBreakOrContinue_101110085680 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4612;
     Object term4613;
     Object term14460;
     Object term14461;

    public FoldConstants_hasBreakOrContinue_101110085680() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4612 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term4612, term4612.getClass(), "compiler", null);
        term4613 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4615 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4617 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4620 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4623 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4626 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term4630 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4633 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4636 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term4613, term4613.getClass(), "type", 695052304);
        setIntField(term4615, term4615.getClass(), "type", 1676254730);
        setIntField(term4617, term4617.getClass(), "type", 0);
        setField(term4617, term4617.getClass(), "next", null);
        setField(term4617, term4617.getClass(), "first", null);
        setField(term4617, term4617.getClass(), "last", null);
        setField(term4617, term4617.getClass(), "propListHead", null);
        setIntField(term4617, term4617.getClass(), "sourcePosition", 0);
        setField(term4617, term4617.getClass(), "jsType", null);
        setField(term4617, term4617.getClass(), "parent", null);
        setField(term4615, term4615.getClass(), "next", term4617);
        setIntField(term4620, term4620.getClass(), "type", 0);
        setField(term4620, term4620.getClass(), "next", null);
        setField(term4620, term4620.getClass(), "first", null);
        setField(term4620, term4620.getClass(), "last", null);
        setField(term4620, term4620.getClass(), "propListHead", null);
        setIntField(term4620, term4620.getClass(), "sourcePosition", 0);
        setField(term4620, term4620.getClass(), "jsType", null);
        setField(term4620, term4620.getClass(), "parent", null);
        setField(term4615, term4615.getClass(), "first", term4620);
        setIntField(term4623, term4623.getClass(), "type", 0);
        setField(term4623, term4623.getClass(), "next", null);
        setField(term4623, term4623.getClass(), "first", null);
        setField(term4623, term4623.getClass(), "last", null);
        setField(term4623, term4623.getClass(), "propListHead", null);
        setIntField(term4623, term4623.getClass(), "sourcePosition", 0);
        setField(term4623, term4623.getClass(), "jsType", null);
        setField(term4623, term4623.getClass(), "parent", null);
        setField(term4615, term4615.getClass(), "last", term4623);
        setField(term4626, term4626.getClass(), "next", null);
        setIntField(term4626, term4626.getClass(), "type", 0);
        setIntField(term4626, term4626.getClass(), "intValue", 0);
        setField(term4626, term4626.getClass(), "objectValue", null);
        setField(term4615, term4615.getClass(), "propListHead", term4626);
        setIntField(term4615, term4615.getClass(), "sourcePosition", -1414233013);
        setField(term4615, term4615.getClass(), "jsType", null);
        setField(term4615, term4615.getClass(), "parent", null);
        setField(term4613, term4613.getClass(), "next", term4615);
        setIntField(term4630, term4630.getClass(), "type", 0);
        setField(term4630, term4630.getClass(), "next", null);
        setField(term4630, term4630.getClass(), "first", null);
        setField(term4630, term4630.getClass(), "last", null);
        setField(term4630, term4630.getClass(), "propListHead", null);
        setIntField(term4630, term4630.getClass(), "sourcePosition", 0);
        setField(term4630, term4630.getClass(), "jsType", null);
        setField(term4630, term4630.getClass(), "parent", null);
        setField(term4613, term4613.getClass(), "first", term4630);
        setIntField(term4633, term4633.getClass(), "type", 0);
        setField(term4633, term4633.getClass(), "next", null);
        setField(term4633, term4633.getClass(), "first", null);
        setField(term4633, term4633.getClass(), "last", null);
        setField(term4633, term4633.getClass(), "propListHead", null);
        setIntField(term4633, term4633.getClass(), "sourcePosition", 0);
        setField(term4633, term4633.getClass(), "jsType", null);
        setField(term4633, term4633.getClass(), "parent", null);
        setField(term4613, term4613.getClass(), "last", term4633);
        setField(term4636, term4636.getClass(), "next", null);
        setIntField(term4636, term4636.getClass(), "type", 0);
        setIntField(term4636, term4636.getClass(), "intValue", 0);
        setField(term4636, term4636.getClass(), "objectValue", null);
        setField(term4613, term4613.getClass(), "propListHead", term4636);
        setIntField(term4613, term4613.getClass(), "sourcePosition", -1174440096);
        setField(term4613, term4613.getClass(), "jsType", null);
        setField(term4613, term4613.getClass(), "parent", null);
        term14460 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term14460, term14460.getClass(), "compiler", null);
        term14461 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14462 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14463 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14464 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14465 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14466 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term14467 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14468 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14469 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term14461, term14461.getClass(), "type", 695052304);
        setIntField(term14462, term14462.getClass(), "type", 1676254730);
        setIntField(term14463, term14463.getClass(), "type", 0);
        setField(term14463, term14463.getClass(), "next", null);
        setField(term14463, term14463.getClass(), "first", null);
        setField(term14463, term14463.getClass(), "last", null);
        setField(term14463, term14463.getClass(), "propListHead", null);
        setIntField(term14463, term14463.getClass(), "sourcePosition", 0);
        setField(term14463, term14463.getClass(), "jsType", null);
        setField(term14463, term14463.getClass(), "parent", null);
        setField(term14462, term14462.getClass(), "next", term14463);
        setIntField(term14464, term14464.getClass(), "type", 0);
        setField(term14464, term14464.getClass(), "next", null);
        setField(term14464, term14464.getClass(), "first", null);
        setField(term14464, term14464.getClass(), "last", null);
        setField(term14464, term14464.getClass(), "propListHead", null);
        setIntField(term14464, term14464.getClass(), "sourcePosition", 0);
        setField(term14464, term14464.getClass(), "jsType", null);
        setField(term14464, term14464.getClass(), "parent", null);
        setField(term14462, term14462.getClass(), "first", term14464);
        setIntField(term14465, term14465.getClass(), "type", 0);
        setField(term14465, term14465.getClass(), "next", null);
        setField(term14465, term14465.getClass(), "first", null);
        setField(term14465, term14465.getClass(), "last", null);
        setField(term14465, term14465.getClass(), "propListHead", null);
        setIntField(term14465, term14465.getClass(), "sourcePosition", 0);
        setField(term14465, term14465.getClass(), "jsType", null);
        setField(term14465, term14465.getClass(), "parent", null);
        setField(term14462, term14462.getClass(), "last", term14465);
        setField(term14466, term14466.getClass(), "next", null);
        setIntField(term14466, term14466.getClass(), "type", 0);
        setIntField(term14466, term14466.getClass(), "intValue", 0);
        setField(term14466, term14466.getClass(), "objectValue", null);
        setField(term14462, term14462.getClass(), "propListHead", term14466);
        setIntField(term14462, term14462.getClass(), "sourcePosition", -1414233013);
        setField(term14462, term14462.getClass(), "jsType", null);
        setField(term14462, term14462.getClass(), "parent", null);
        setField(term14461, term14461.getClass(), "next", term14462);
        setIntField(term14467, term14467.getClass(), "type", 0);
        setField(term14467, term14467.getClass(), "next", null);
        setField(term14467, term14467.getClass(), "first", null);
        setField(term14467, term14467.getClass(), "last", null);
        setField(term14467, term14467.getClass(), "propListHead", null);
        setIntField(term14467, term14467.getClass(), "sourcePosition", 0);
        setField(term14467, term14467.getClass(), "jsType", null);
        setField(term14467, term14467.getClass(), "parent", null);
        setField(term14461, term14461.getClass(), "first", term14467);
        setIntField(term14468, term14468.getClass(), "type", 0);
        setField(term14468, term14468.getClass(), "next", null);
        setField(term14468, term14468.getClass(), "first", null);
        setField(term14468, term14468.getClass(), "last", null);
        setField(term14468, term14468.getClass(), "propListHead", null);
        setIntField(term14468, term14468.getClass(), "sourcePosition", 0);
        setField(term14468, term14468.getClass(), "jsType", null);
        setField(term14468, term14468.getClass(), "parent", null);
        setField(term14461, term14461.getClass(), "last", term14468);
        setField(term14469, term14469.getClass(), "next", null);
        setIntField(term14469, term14469.getClass(), "type", 0);
        setIntField(term14469, term14469.getClass(), "intValue", 0);
        setField(term14469, term14469.getClass(), "objectValue", null);
        setField(term14461, term14461.getClass(), "propListHead", term14469);
        setIntField(term14461, term14461.getClass(), "sourcePosition", -1174440096);
        setField(term14461, term14461.getClass(), "jsType", null);
        setField(term14461, term14461.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4613;
        callMethod(klass, "hasBreakOrContinue", argTypes, term4612, args);
        assertTrue(recursiveEquals(term4612, term14460));
        assertTrue(recursiveEquals(term4613, term14461));
    }

};


