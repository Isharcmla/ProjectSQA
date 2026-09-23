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

public class NodeUtil_isImmutableValue_1118207454109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109;
     Object term3984;

    public NodeUtil_isImmutableValue_1118207454109() {
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
        term3984 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3985 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3986 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3987 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3988 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3989 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3990 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3991 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3992 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3984, term3984.getClass(), "type", 454281060);
        setIntField(term3985, term3985.getClass(), "type", 292681826);
        setIntField(term3986, term3986.getClass(), "type", 0);
        setField(term3986, term3986.getClass(), "next", null);
        setField(term3986, term3986.getClass(), "first", null);
        setField(term3986, term3986.getClass(), "last", null);
        setField(term3986, term3986.getClass(), "propListHead", null);
        setIntField(term3986, term3986.getClass(), "sourcePosition", 0);
        setField(term3986, term3986.getClass(), "jsType", null);
        setField(term3986, term3986.getClass(), "parent", null);
        setField(term3985, term3985.getClass(), "next", term3986);
        setIntField(term3987, term3987.getClass(), "type", 0);
        setField(term3987, term3987.getClass(), "next", null);
        setField(term3987, term3987.getClass(), "first", null);
        setField(term3987, term3987.getClass(), "last", null);
        setField(term3987, term3987.getClass(), "propListHead", null);
        setIntField(term3987, term3987.getClass(), "sourcePosition", 0);
        setField(term3987, term3987.getClass(), "jsType", null);
        setField(term3987, term3987.getClass(), "parent", null);
        setField(term3985, term3985.getClass(), "first", term3987);
        setIntField(term3988, term3988.getClass(), "type", 0);
        setField(term3988, term3988.getClass(), "next", null);
        setField(term3988, term3988.getClass(), "first", null);
        setField(term3988, term3988.getClass(), "last", null);
        setField(term3988, term3988.getClass(), "propListHead", null);
        setIntField(term3988, term3988.getClass(), "sourcePosition", 0);
        setField(term3988, term3988.getClass(), "jsType", null);
        setField(term3988, term3988.getClass(), "parent", null);
        setField(term3985, term3985.getClass(), "last", term3988);
        setField(term3989, term3989.getClass(), "next", null);
        setIntField(term3989, term3989.getClass(), "type", 0);
        setIntField(term3989, term3989.getClass(), "intValue", 0);
        setField(term3989, term3989.getClass(), "objectValue", null);
        setField(term3985, term3985.getClass(), "propListHead", term3989);
        setIntField(term3985, term3985.getClass(), "sourcePosition", 493620644);
        setField(term3985, term3985.getClass(), "jsType", null);
        setField(term3985, term3985.getClass(), "parent", null);
        setField(term3984, term3984.getClass(), "next", term3985);
        setIntField(term3990, term3990.getClass(), "type", 0);
        setField(term3990, term3990.getClass(), "next", null);
        setField(term3990, term3990.getClass(), "first", null);
        setField(term3990, term3990.getClass(), "last", null);
        setField(term3990, term3990.getClass(), "propListHead", null);
        setIntField(term3990, term3990.getClass(), "sourcePosition", 0);
        setField(term3990, term3990.getClass(), "jsType", null);
        setField(term3990, term3990.getClass(), "parent", null);
        setField(term3984, term3984.getClass(), "first", term3990);
        setIntField(term3991, term3991.getClass(), "type", 0);
        setField(term3991, term3991.getClass(), "next", null);
        setField(term3991, term3991.getClass(), "first", null);
        setField(term3991, term3991.getClass(), "last", null);
        setField(term3991, term3991.getClass(), "propListHead", null);
        setIntField(term3991, term3991.getClass(), "sourcePosition", 0);
        setField(term3991, term3991.getClass(), "jsType", null);
        setField(term3991, term3991.getClass(), "parent", null);
        setField(term3984, term3984.getClass(), "last", term3991);
        setField(term3992, term3992.getClass(), "next", null);
        setIntField(term3992, term3992.getClass(), "type", 0);
        setIntField(term3992, term3992.getClass(), "intValue", 0);
        setField(term3992, term3992.getClass(), "objectValue", null);
        setField(term3984, term3984.getClass(), "propListHead", term3992);
        setIntField(term3984, term3984.getClass(), "sourcePosition", 1328271830);
        setField(term3984, term3984.getClass(), "jsType", null);
        setField(term3984, term3984.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term109;
        Object retValue = callMethod(klass, "isImmutableValue", argTypes, null, args);
        assertTrue(recursiveEquals(term109, term3984));
        assertTrue(recursiveEquals(retValue, false));
    }

};


