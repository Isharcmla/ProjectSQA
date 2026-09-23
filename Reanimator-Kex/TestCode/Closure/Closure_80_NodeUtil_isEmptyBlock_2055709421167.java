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
     Object term6942;

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
        term6942 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6943 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6944 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6945 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6946 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6947 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term6948 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6949 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6950 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term6942, term6942.getClass(), "type", 71190297);
        setIntField(term6943, term6943.getClass(), "type", -1222006000);
        setIntField(term6944, term6944.getClass(), "type", 0);
        setField(term6944, term6944.getClass(), "next", null);
        setField(term6944, term6944.getClass(), "first", null);
        setField(term6944, term6944.getClass(), "last", null);
        setField(term6944, term6944.getClass(), "propListHead", null);
        setIntField(term6944, term6944.getClass(), "sourcePosition", 0);
        setField(term6944, term6944.getClass(), "jsType", null);
        setField(term6944, term6944.getClass(), "parent", null);
        setField(term6943, term6943.getClass(), "next", term6944);
        setIntField(term6945, term6945.getClass(), "type", 0);
        setField(term6945, term6945.getClass(), "next", null);
        setField(term6945, term6945.getClass(), "first", null);
        setField(term6945, term6945.getClass(), "last", null);
        setField(term6945, term6945.getClass(), "propListHead", null);
        setIntField(term6945, term6945.getClass(), "sourcePosition", 0);
        setField(term6945, term6945.getClass(), "jsType", null);
        setField(term6945, term6945.getClass(), "parent", null);
        setField(term6943, term6943.getClass(), "first", term6945);
        setIntField(term6946, term6946.getClass(), "type", 0);
        setField(term6946, term6946.getClass(), "next", null);
        setField(term6946, term6946.getClass(), "first", null);
        setField(term6946, term6946.getClass(), "last", null);
        setField(term6946, term6946.getClass(), "propListHead", null);
        setIntField(term6946, term6946.getClass(), "sourcePosition", 0);
        setField(term6946, term6946.getClass(), "jsType", null);
        setField(term6946, term6946.getClass(), "parent", null);
        setField(term6943, term6943.getClass(), "last", term6946);
        setField(term6947, term6947.getClass(), "next", null);
        setIntField(term6947, term6947.getClass(), "type", 0);
        setIntField(term6947, term6947.getClass(), "intValue", 0);
        setField(term6947, term6947.getClass(), "objectValue", null);
        setField(term6943, term6943.getClass(), "propListHead", term6947);
        setIntField(term6943, term6943.getClass(), "sourcePosition", 344323424);
        setField(term6943, term6943.getClass(), "jsType", null);
        setField(term6943, term6943.getClass(), "parent", null);
        setField(term6942, term6942.getClass(), "next", term6943);
        setIntField(term6948, term6948.getClass(), "type", 0);
        setField(term6948, term6948.getClass(), "next", null);
        setField(term6948, term6948.getClass(), "first", null);
        setField(term6948, term6948.getClass(), "last", null);
        setField(term6948, term6948.getClass(), "propListHead", null);
        setIntField(term6948, term6948.getClass(), "sourcePosition", 0);
        setField(term6948, term6948.getClass(), "jsType", null);
        setField(term6948, term6948.getClass(), "parent", null);
        setField(term6942, term6942.getClass(), "first", term6948);
        setIntField(term6949, term6949.getClass(), "type", 0);
        setField(term6949, term6949.getClass(), "next", null);
        setField(term6949, term6949.getClass(), "first", null);
        setField(term6949, term6949.getClass(), "last", null);
        setField(term6949, term6949.getClass(), "propListHead", null);
        setIntField(term6949, term6949.getClass(), "sourcePosition", 0);
        setField(term6949, term6949.getClass(), "jsType", null);
        setField(term6949, term6949.getClass(), "parent", null);
        setField(term6942, term6942.getClass(), "last", term6949);
        setField(term6950, term6950.getClass(), "next", null);
        setIntField(term6950, term6950.getClass(), "type", 0);
        setIntField(term6950, term6950.getClass(), "intValue", 0);
        setField(term6950, term6950.getClass(), "objectValue", null);
        setField(term6942, term6942.getClass(), "propListHead", term6950);
        setIntField(term6942, term6942.getClass(), "sourcePosition", 9726679);
        setField(term6942, term6942.getClass(), "jsType", null);
        setField(term6942, term6942.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term370;
        Object retValue = callMethod(klass, "isEmptyBlock", argTypes, null, args);
        assertTrue(recursiveEquals(term370, term6942));
        assertTrue(recursiveEquals(retValue, false));
    }

};


