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

public class NodeUtil_isImmutableValue_1118207454110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109;
     Object term4011;

    public NodeUtil_isImmutableValue_1118207454110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term111 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term113 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term116 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term119 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term122 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term126 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term129 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term132 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term109, term109.getClass(), "type", 454281060);
        setIntField(term111, term111.getClass(), "type", 292681826);
        setIntField(term113, term113.getClass(), "type", 0);
        setField(term113, term113.getClass(), "next", null);
        setField(term113, term113.getClass(), "first", null);
        setField(term113, term113.getClass(), "last", null);
        setField(term113, term113.getClass(), "propListHead", null);
        setIntField(term113, term113.getClass(), "sourcePosition", 0);
        setField(term113, term113.getClass(), "jsType", null);
        setField(term113, term113.getClass(), "parent", null);
        setField(term111, term111.getClass(), "next", term113);
        setIntField(term116, term116.getClass(), "type", 0);
        setField(term116, term116.getClass(), "next", null);
        setField(term116, term116.getClass(), "first", null);
        setField(term116, term116.getClass(), "last", null);
        setField(term116, term116.getClass(), "propListHead", null);
        setIntField(term116, term116.getClass(), "sourcePosition", 0);
        setField(term116, term116.getClass(), "jsType", null);
        setField(term116, term116.getClass(), "parent", null);
        setField(term111, term111.getClass(), "first", term116);
        setIntField(term119, term119.getClass(), "type", 0);
        setField(term119, term119.getClass(), "next", null);
        setField(term119, term119.getClass(), "first", null);
        setField(term119, term119.getClass(), "last", null);
        setField(term119, term119.getClass(), "propListHead", null);
        setIntField(term119, term119.getClass(), "sourcePosition", 0);
        setField(term119, term119.getClass(), "jsType", null);
        setField(term119, term119.getClass(), "parent", null);
        setField(term111, term111.getClass(), "last", term119);
        setField(term122, term122.getClass(), "next", null);
        setIntField(term122, term122.getClass(), "type", 0);
        setIntField(term122, term122.getClass(), "intValue", 0);
        setField(term122, term122.getClass(), "objectValue", null);
        setField(term111, term111.getClass(), "propListHead", term122);
        setIntField(term111, term111.getClass(), "sourcePosition", 493620644);
        setField(term111, term111.getClass(), "jsType", null);
        setField(term111, term111.getClass(), "parent", null);
        setField(term109, term109.getClass(), "next", term111);
        setIntField(term126, term126.getClass(), "type", 0);
        setField(term126, term126.getClass(), "next", null);
        setField(term126, term126.getClass(), "first", null);
        setField(term126, term126.getClass(), "last", null);
        setField(term126, term126.getClass(), "propListHead", null);
        setIntField(term126, term126.getClass(), "sourcePosition", 0);
        setField(term126, term126.getClass(), "jsType", null);
        setField(term126, term126.getClass(), "parent", null);
        setField(term109, term109.getClass(), "first", term126);
        setIntField(term129, term129.getClass(), "type", 0);
        setField(term129, term129.getClass(), "next", null);
        setField(term129, term129.getClass(), "first", null);
        setField(term129, term129.getClass(), "last", null);
        setField(term129, term129.getClass(), "propListHead", null);
        setIntField(term129, term129.getClass(), "sourcePosition", 0);
        setField(term129, term129.getClass(), "jsType", null);
        setField(term129, term129.getClass(), "parent", null);
        setField(term109, term109.getClass(), "last", term129);
        setField(term132, term132.getClass(), "next", null);
        setIntField(term132, term132.getClass(), "type", 0);
        setIntField(term132, term132.getClass(), "intValue", 0);
        setField(term132, term132.getClass(), "objectValue", null);
        setField(term109, term109.getClass(), "propListHead", term132);
        setIntField(term109, term109.getClass(), "sourcePosition", 1328271830);
        setField(term109, term109.getClass(), "jsType", null);
        setField(term109, term109.getClass(), "parent", null);
        term4011 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4012 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4013 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4014 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4015 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4016 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term4017 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4018 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4019 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term4011, term4011.getClass(), "type", 454281060);
        setIntField(term4012, term4012.getClass(), "type", 292681826);
        setIntField(term4013, term4013.getClass(), "type", 0);
        setField(term4013, term4013.getClass(), "next", null);
        setField(term4013, term4013.getClass(), "first", null);
        setField(term4013, term4013.getClass(), "last", null);
        setField(term4013, term4013.getClass(), "propListHead", null);
        setIntField(term4013, term4013.getClass(), "sourcePosition", 0);
        setField(term4013, term4013.getClass(), "jsType", null);
        setField(term4013, term4013.getClass(), "parent", null);
        setField(term4012, term4012.getClass(), "next", term4013);
        setIntField(term4014, term4014.getClass(), "type", 0);
        setField(term4014, term4014.getClass(), "next", null);
        setField(term4014, term4014.getClass(), "first", null);
        setField(term4014, term4014.getClass(), "last", null);
        setField(term4014, term4014.getClass(), "propListHead", null);
        setIntField(term4014, term4014.getClass(), "sourcePosition", 0);
        setField(term4014, term4014.getClass(), "jsType", null);
        setField(term4014, term4014.getClass(), "parent", null);
        setField(term4012, term4012.getClass(), "first", term4014);
        setIntField(term4015, term4015.getClass(), "type", 0);
        setField(term4015, term4015.getClass(), "next", null);
        setField(term4015, term4015.getClass(), "first", null);
        setField(term4015, term4015.getClass(), "last", null);
        setField(term4015, term4015.getClass(), "propListHead", null);
        setIntField(term4015, term4015.getClass(), "sourcePosition", 0);
        setField(term4015, term4015.getClass(), "jsType", null);
        setField(term4015, term4015.getClass(), "parent", null);
        setField(term4012, term4012.getClass(), "last", term4015);
        setField(term4016, term4016.getClass(), "next", null);
        setIntField(term4016, term4016.getClass(), "type", 0);
        setIntField(term4016, term4016.getClass(), "intValue", 0);
        setField(term4016, term4016.getClass(), "objectValue", null);
        setField(term4012, term4012.getClass(), "propListHead", term4016);
        setIntField(term4012, term4012.getClass(), "sourcePosition", 493620644);
        setField(term4012, term4012.getClass(), "jsType", null);
        setField(term4012, term4012.getClass(), "parent", null);
        setField(term4011, term4011.getClass(), "next", term4012);
        setIntField(term4017, term4017.getClass(), "type", 0);
        setField(term4017, term4017.getClass(), "next", null);
        setField(term4017, term4017.getClass(), "first", null);
        setField(term4017, term4017.getClass(), "last", null);
        setField(term4017, term4017.getClass(), "propListHead", null);
        setIntField(term4017, term4017.getClass(), "sourcePosition", 0);
        setField(term4017, term4017.getClass(), "jsType", null);
        setField(term4017, term4017.getClass(), "parent", null);
        setField(term4011, term4011.getClass(), "first", term4017);
        setIntField(term4018, term4018.getClass(), "type", 0);
        setField(term4018, term4018.getClass(), "next", null);
        setField(term4018, term4018.getClass(), "first", null);
        setField(term4018, term4018.getClass(), "last", null);
        setField(term4018, term4018.getClass(), "propListHead", null);
        setIntField(term4018, term4018.getClass(), "sourcePosition", 0);
        setField(term4018, term4018.getClass(), "jsType", null);
        setField(term4018, term4018.getClass(), "parent", null);
        setField(term4011, term4011.getClass(), "last", term4018);
        setField(term4019, term4019.getClass(), "next", null);
        setIntField(term4019, term4019.getClass(), "type", 0);
        setIntField(term4019, term4019.getClass(), "intValue", 0);
        setField(term4019, term4019.getClass(), "objectValue", null);
        setField(term4011, term4011.getClass(), "propListHead", term4019);
        setIntField(term4011, term4011.getClass(), "sourcePosition", 1328271830);
        setField(term4011, term4011.getClass(), "jsType", null);
        setField(term4011, term4011.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term109;
        Object retValue = callMethod(klass, "isImmutableValue", argTypes, null, args);
        assertTrue(recursiveEquals(term109, term4011));
        assertTrue(recursiveEquals(retValue, false));
    }

};


