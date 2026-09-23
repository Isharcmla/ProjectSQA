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

public class NodeUtil_isEmptyBlock_2055709421167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term370;
     Object term7236;

    public NodeUtil_isEmptyBlock_2055709421167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term370 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term372 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term374 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term377 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term380 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term383 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term387 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term390 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term393 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term370, term370.getClass(), "type", 71190297);
        setIntField(term372, term372.getClass(), "type", -1222006000);
        setIntField(term374, term374.getClass(), "type", 0);
        setField(term374, term374.getClass(), "next", null);
        setField(term374, term374.getClass(), "first", null);
        setField(term374, term374.getClass(), "last", null);
        setField(term374, term374.getClass(), "propListHead", null);
        setIntField(term374, term374.getClass(), "sourcePosition", 0);
        setField(term374, term374.getClass(), "jsType", null);
        setField(term374, term374.getClass(), "parent", null);
        setField(term372, term372.getClass(), "next", term374);
        setIntField(term377, term377.getClass(), "type", 0);
        setField(term377, term377.getClass(), "next", null);
        setField(term377, term377.getClass(), "first", null);
        setField(term377, term377.getClass(), "last", null);
        setField(term377, term377.getClass(), "propListHead", null);
        setIntField(term377, term377.getClass(), "sourcePosition", 0);
        setField(term377, term377.getClass(), "jsType", null);
        setField(term377, term377.getClass(), "parent", null);
        setField(term372, term372.getClass(), "first", term377);
        setIntField(term380, term380.getClass(), "type", 0);
        setField(term380, term380.getClass(), "next", null);
        setField(term380, term380.getClass(), "first", null);
        setField(term380, term380.getClass(), "last", null);
        setField(term380, term380.getClass(), "propListHead", null);
        setIntField(term380, term380.getClass(), "sourcePosition", 0);
        setField(term380, term380.getClass(), "jsType", null);
        setField(term380, term380.getClass(), "parent", null);
        setField(term372, term372.getClass(), "last", term380);
        setField(term383, term383.getClass(), "next", null);
        setIntField(term383, term383.getClass(), "type", 0);
        setIntField(term383, term383.getClass(), "intValue", 0);
        setField(term383, term383.getClass(), "objectValue", null);
        setField(term372, term372.getClass(), "propListHead", term383);
        setIntField(term372, term372.getClass(), "sourcePosition", 344323424);
        setField(term372, term372.getClass(), "jsType", null);
        setField(term372, term372.getClass(), "parent", null);
        setField(term370, term370.getClass(), "next", term372);
        setIntField(term387, term387.getClass(), "type", 0);
        setField(term387, term387.getClass(), "next", null);
        setField(term387, term387.getClass(), "first", null);
        setField(term387, term387.getClass(), "last", null);
        setField(term387, term387.getClass(), "propListHead", null);
        setIntField(term387, term387.getClass(), "sourcePosition", 0);
        setField(term387, term387.getClass(), "jsType", null);
        setField(term387, term387.getClass(), "parent", null);
        setField(term370, term370.getClass(), "first", term387);
        setIntField(term390, term390.getClass(), "type", 0);
        setField(term390, term390.getClass(), "next", null);
        setField(term390, term390.getClass(), "first", null);
        setField(term390, term390.getClass(), "last", null);
        setField(term390, term390.getClass(), "propListHead", null);
        setIntField(term390, term390.getClass(), "sourcePosition", 0);
        setField(term390, term390.getClass(), "jsType", null);
        setField(term390, term390.getClass(), "parent", null);
        setField(term370, term370.getClass(), "last", term390);
        setField(term393, term393.getClass(), "next", null);
        setIntField(term393, term393.getClass(), "type", 0);
        setIntField(term393, term393.getClass(), "intValue", 0);
        setField(term393, term393.getClass(), "objectValue", null);
        setField(term370, term370.getClass(), "propListHead", term393);
        setIntField(term370, term370.getClass(), "sourcePosition", 9726679);
        setField(term370, term370.getClass(), "jsType", null);
        setField(term370, term370.getClass(), "parent", null);
        term7236 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7237 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7238 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7239 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7240 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7241 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term7242 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7243 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7244 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term7236, term7236.getClass(), "type", 71190297);
        setIntField(term7237, term7237.getClass(), "type", -1222006000);
        setIntField(term7238, term7238.getClass(), "type", 0);
        setField(term7238, term7238.getClass(), "next", null);
        setField(term7238, term7238.getClass(), "first", null);
        setField(term7238, term7238.getClass(), "last", null);
        setField(term7238, term7238.getClass(), "propListHead", null);
        setIntField(term7238, term7238.getClass(), "sourcePosition", 0);
        setField(term7238, term7238.getClass(), "jsType", null);
        setField(term7238, term7238.getClass(), "parent", null);
        setField(term7237, term7237.getClass(), "next", term7238);
        setIntField(term7239, term7239.getClass(), "type", 0);
        setField(term7239, term7239.getClass(), "next", null);
        setField(term7239, term7239.getClass(), "first", null);
        setField(term7239, term7239.getClass(), "last", null);
        setField(term7239, term7239.getClass(), "propListHead", null);
        setIntField(term7239, term7239.getClass(), "sourcePosition", 0);
        setField(term7239, term7239.getClass(), "jsType", null);
        setField(term7239, term7239.getClass(), "parent", null);
        setField(term7237, term7237.getClass(), "first", term7239);
        setIntField(term7240, term7240.getClass(), "type", 0);
        setField(term7240, term7240.getClass(), "next", null);
        setField(term7240, term7240.getClass(), "first", null);
        setField(term7240, term7240.getClass(), "last", null);
        setField(term7240, term7240.getClass(), "propListHead", null);
        setIntField(term7240, term7240.getClass(), "sourcePosition", 0);
        setField(term7240, term7240.getClass(), "jsType", null);
        setField(term7240, term7240.getClass(), "parent", null);
        setField(term7237, term7237.getClass(), "last", term7240);
        setField(term7241, term7241.getClass(), "next", null);
        setIntField(term7241, term7241.getClass(), "type", 0);
        setIntField(term7241, term7241.getClass(), "intValue", 0);
        setField(term7241, term7241.getClass(), "objectValue", null);
        setField(term7237, term7237.getClass(), "propListHead", term7241);
        setIntField(term7237, term7237.getClass(), "sourcePosition", 344323424);
        setField(term7237, term7237.getClass(), "jsType", null);
        setField(term7237, term7237.getClass(), "parent", null);
        setField(term7236, term7236.getClass(), "next", term7237);
        setIntField(term7242, term7242.getClass(), "type", 0);
        setField(term7242, term7242.getClass(), "next", null);
        setField(term7242, term7242.getClass(), "first", null);
        setField(term7242, term7242.getClass(), "last", null);
        setField(term7242, term7242.getClass(), "propListHead", null);
        setIntField(term7242, term7242.getClass(), "sourcePosition", 0);
        setField(term7242, term7242.getClass(), "jsType", null);
        setField(term7242, term7242.getClass(), "parent", null);
        setField(term7236, term7236.getClass(), "first", term7242);
        setIntField(term7243, term7243.getClass(), "type", 0);
        setField(term7243, term7243.getClass(), "next", null);
        setField(term7243, term7243.getClass(), "first", null);
        setField(term7243, term7243.getClass(), "last", null);
        setField(term7243, term7243.getClass(), "propListHead", null);
        setIntField(term7243, term7243.getClass(), "sourcePosition", 0);
        setField(term7243, term7243.getClass(), "jsType", null);
        setField(term7243, term7243.getClass(), "parent", null);
        setField(term7236, term7236.getClass(), "last", term7243);
        setField(term7244, term7244.getClass(), "next", null);
        setIntField(term7244, term7244.getClass(), "type", 0);
        setIntField(term7244, term7244.getClass(), "intValue", 0);
        setField(term7244, term7244.getClass(), "objectValue", null);
        setField(term7236, term7236.getClass(), "propListHead", term7244);
        setIntField(term7236, term7236.getClass(), "sourcePosition", 9726679);
        setField(term7236, term7236.getClass(), "jsType", null);
        setField(term7236, term7236.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term370;
        Object retValue = callMethod(klass, "isEmptyBlock", argTypes, null, args);
        assertTrue(recursiveEquals(term370, term7236));
        assertTrue(recursiveEquals(retValue, false));
    }

};


