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

public class NodeUtil_getStringValue_242131640108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28;
     Object term3585;

    public NodeUtil_getStringValue_242131640108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term38 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term41 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term45 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term28, term28.getClass(), "type", 597278769);
        setIntField(term30, term30.getClass(), "type", 1048535127);
        setIntField(term32, term32.getClass(), "type", 0);
        setField(term32, term32.getClass(), "next", null);
        setField(term32, term32.getClass(), "first", null);
        setField(term32, term32.getClass(), "last", null);
        setField(term32, term32.getClass(), "propListHead", null);
        setIntField(term32, term32.getClass(), "sourcePosition", 0);
        setField(term32, term32.getClass(), "jsType", null);
        setField(term32, term32.getClass(), "parent", null);
        setField(term30, term30.getClass(), "next", term32);
        setIntField(term35, term35.getClass(), "type", 0);
        setField(term35, term35.getClass(), "next", null);
        setField(term35, term35.getClass(), "first", null);
        setField(term35, term35.getClass(), "last", null);
        setField(term35, term35.getClass(), "propListHead", null);
        setIntField(term35, term35.getClass(), "sourcePosition", 0);
        setField(term35, term35.getClass(), "jsType", null);
        setField(term35, term35.getClass(), "parent", null);
        setField(term30, term30.getClass(), "first", term35);
        setIntField(term38, term38.getClass(), "type", 0);
        setField(term38, term38.getClass(), "next", null);
        setField(term38, term38.getClass(), "first", null);
        setField(term38, term38.getClass(), "last", null);
        setField(term38, term38.getClass(), "propListHead", null);
        setIntField(term38, term38.getClass(), "sourcePosition", 0);
        setField(term38, term38.getClass(), "jsType", null);
        setField(term38, term38.getClass(), "parent", null);
        setField(term30, term30.getClass(), "last", term38);
        setField(term41, term41.getClass(), "next", null);
        setIntField(term41, term41.getClass(), "type", 0);
        setIntField(term41, term41.getClass(), "intValue", 0);
        setField(term41, term41.getClass(), "objectValue", null);
        setField(term30, term30.getClass(), "propListHead", term41);
        setIntField(term30, term30.getClass(), "sourcePosition", -2068769794);
        setField(term30, term30.getClass(), "jsType", null);
        setField(term30, term30.getClass(), "parent", null);
        setField(term28, term28.getClass(), "next", term30);
        setIntField(term45, term45.getClass(), "type", 0);
        setField(term45, term45.getClass(), "next", null);
        setField(term45, term45.getClass(), "first", null);
        setField(term45, term45.getClass(), "last", null);
        setField(term45, term45.getClass(), "propListHead", null);
        setIntField(term45, term45.getClass(), "sourcePosition", 0);
        setField(term45, term45.getClass(), "jsType", null);
        setField(term45, term45.getClass(), "parent", null);
        setField(term28, term28.getClass(), "first", term45);
        setIntField(term48, term48.getClass(), "type", 0);
        setField(term48, term48.getClass(), "next", null);
        setField(term48, term48.getClass(), "first", null);
        setField(term48, term48.getClass(), "last", null);
        setField(term48, term48.getClass(), "propListHead", null);
        setIntField(term48, term48.getClass(), "sourcePosition", 0);
        setField(term48, term48.getClass(), "jsType", null);
        setField(term48, term48.getClass(), "parent", null);
        setField(term28, term28.getClass(), "last", term48);
        setField(term51, term51.getClass(), "next", null);
        setIntField(term51, term51.getClass(), "type", 0);
        setIntField(term51, term51.getClass(), "intValue", 0);
        setField(term51, term51.getClass(), "objectValue", null);
        setField(term28, term28.getClass(), "propListHead", term51);
        setIntField(term28, term28.getClass(), "sourcePosition", -117576464);
        setField(term28, term28.getClass(), "jsType", null);
        setField(term28, term28.getClass(), "parent", null);
        term3585 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3586 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3587 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3588 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3589 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3590 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3591 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3592 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3593 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3585, term3585.getClass(), "type", 597278769);
        setIntField(term3586, term3586.getClass(), "type", 1048535127);
        setIntField(term3587, term3587.getClass(), "type", 0);
        setField(term3587, term3587.getClass(), "next", null);
        setField(term3587, term3587.getClass(), "first", null);
        setField(term3587, term3587.getClass(), "last", null);
        setField(term3587, term3587.getClass(), "propListHead", null);
        setIntField(term3587, term3587.getClass(), "sourcePosition", 0);
        setField(term3587, term3587.getClass(), "jsType", null);
        setField(term3587, term3587.getClass(), "parent", null);
        setField(term3586, term3586.getClass(), "next", term3587);
        setIntField(term3588, term3588.getClass(), "type", 0);
        setField(term3588, term3588.getClass(), "next", null);
        setField(term3588, term3588.getClass(), "first", null);
        setField(term3588, term3588.getClass(), "last", null);
        setField(term3588, term3588.getClass(), "propListHead", null);
        setIntField(term3588, term3588.getClass(), "sourcePosition", 0);
        setField(term3588, term3588.getClass(), "jsType", null);
        setField(term3588, term3588.getClass(), "parent", null);
        setField(term3586, term3586.getClass(), "first", term3588);
        setIntField(term3589, term3589.getClass(), "type", 0);
        setField(term3589, term3589.getClass(), "next", null);
        setField(term3589, term3589.getClass(), "first", null);
        setField(term3589, term3589.getClass(), "last", null);
        setField(term3589, term3589.getClass(), "propListHead", null);
        setIntField(term3589, term3589.getClass(), "sourcePosition", 0);
        setField(term3589, term3589.getClass(), "jsType", null);
        setField(term3589, term3589.getClass(), "parent", null);
        setField(term3586, term3586.getClass(), "last", term3589);
        setField(term3590, term3590.getClass(), "next", null);
        setIntField(term3590, term3590.getClass(), "type", 0);
        setIntField(term3590, term3590.getClass(), "intValue", 0);
        setField(term3590, term3590.getClass(), "objectValue", null);
        setField(term3586, term3586.getClass(), "propListHead", term3590);
        setIntField(term3586, term3586.getClass(), "sourcePosition", -2068769794);
        setField(term3586, term3586.getClass(), "jsType", null);
        setField(term3586, term3586.getClass(), "parent", null);
        setField(term3585, term3585.getClass(), "next", term3586);
        setIntField(term3591, term3591.getClass(), "type", 0);
        setField(term3591, term3591.getClass(), "next", null);
        setField(term3591, term3591.getClass(), "first", null);
        setField(term3591, term3591.getClass(), "last", null);
        setField(term3591, term3591.getClass(), "propListHead", null);
        setIntField(term3591, term3591.getClass(), "sourcePosition", 0);
        setField(term3591, term3591.getClass(), "jsType", null);
        setField(term3591, term3591.getClass(), "parent", null);
        setField(term3585, term3585.getClass(), "first", term3591);
        setIntField(term3592, term3592.getClass(), "type", 0);
        setField(term3592, term3592.getClass(), "next", null);
        setField(term3592, term3592.getClass(), "first", null);
        setField(term3592, term3592.getClass(), "last", null);
        setField(term3592, term3592.getClass(), "propListHead", null);
        setIntField(term3592, term3592.getClass(), "sourcePosition", 0);
        setField(term3592, term3592.getClass(), "jsType", null);
        setField(term3592, term3592.getClass(), "parent", null);
        setField(term3585, term3585.getClass(), "last", term3592);
        setField(term3593, term3593.getClass(), "next", null);
        setIntField(term3593, term3593.getClass(), "type", 0);
        setIntField(term3593, term3593.getClass(), "intValue", 0);
        setField(term3593, term3593.getClass(), "objectValue", null);
        setField(term3585, term3585.getClass(), "propListHead", term3593);
        setIntField(term3585, term3585.getClass(), "sourcePosition", -117576464);
        setField(term3585, term3585.getClass(), "jsType", null);
        setField(term3585, term3585.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term28;
        Object retValue = callMethod(klass, "getStringValue", argTypes, null, args);
        assertTrue(recursiveEquals(term28, term3585));
        assertTrue(recursiveEquals(retValue, null));
    }

};


