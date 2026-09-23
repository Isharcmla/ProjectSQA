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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class NodeUtil_isValidDefineValue_788085673169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term261;
     Object term282;
     Object term6291;
     Object term6298;

    public NodeUtil_isValidDefineValue_788085673169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term261 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term263 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term265 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term268 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term271 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term275 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term278 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term261, term261.getClass(), "type", -268815336);
        setIntField(term263, term263.getClass(), "type", -615654495);
        setIntField(term265, term265.getClass(), "type", 0);
        setField(term265, term265.getClass(), "next", null);
        setField(term265, term265.getClass(), "first", null);
        setField(term265, term265.getClass(), "last", null);
        setField(term265, term265.getClass(), "propListHead", null);
        setIntField(term265, term265.getClass(), "sourcePosition", 0);
        setField(term265, term265.getClass(), "jsType", null);
        setField(term265, term265.getClass(), "parent", null);
        setField(term263, term263.getClass(), "next", term265);
        setIntField(term268, term268.getClass(), "type", 0);
        setField(term268, term268.getClass(), "next", null);
        setField(term268, term268.getClass(), "first", null);
        setField(term268, term268.getClass(), "last", null);
        setField(term268, term268.getClass(), "propListHead", null);
        setIntField(term268, term268.getClass(), "sourcePosition", 0);
        setField(term268, term268.getClass(), "jsType", null);
        setField(term268, term268.getClass(), "parent", null);
        setField(term263, term263.getClass(), "first", term268);
        setIntField(term271, term271.getClass(), "type", 0);
        setField(term271, term271.getClass(), "next", null);
        setField(term271, term271.getClass(), "first", null);
        setField(term271, term271.getClass(), "last", null);
        setField(term271, term271.getClass(), "propListHead", null);
        setIntField(term271, term271.getClass(), "sourcePosition", 0);
        setField(term271, term271.getClass(), "jsType", null);
        setField(term271, term271.getClass(), "parent", null);
        setField(term263, term263.getClass(), "last", term271);
        setField(term263, term263.getClass(), "propListHead", null);
        setIntField(term263, term263.getClass(), "sourcePosition", 0);
        setField(term263, term263.getClass(), "jsType", null);
        setField(term263, term263.getClass(), "parent", null);
        setField(term261, term261.getClass(), "next", term263);
        setIntField(term275, term275.getClass(), "type", 0);
        setField(term275, term275.getClass(), "next", null);
        setField(term275, term275.getClass(), "first", null);
        setField(term275, term275.getClass(), "last", null);
        setField(term275, term275.getClass(), "propListHead", null);
        setIntField(term275, term275.getClass(), "sourcePosition", 0);
        setField(term275, term275.getClass(), "jsType", null);
        setField(term275, term275.getClass(), "parent", null);
        setField(term261, term261.getClass(), "first", term275);
        setIntField(term278, term278.getClass(), "type", 0);
        setField(term278, term278.getClass(), "next", null);
        setField(term278, term278.getClass(), "first", null);
        setField(term278, term278.getClass(), "last", null);
        setField(term278, term278.getClass(), "propListHead", null);
        setIntField(term278, term278.getClass(), "sourcePosition", 0);
        setField(term278, term278.getClass(), "jsType", null);
        setField(term278, term278.getClass(), "parent", null);
        setField(term261, term261.getClass(), "last", term278);
        setField(term261, term261.getClass(), "propListHead", null);
        setIntField(term261, term261.getClass(), "sourcePosition", 0);
        setField(term261, term261.getClass(), "jsType", null);
        setField(term261, term261.getClass(), "parent", null);
        HashMap term283 = new HashMap();
        Set<Object> term6301 =  ((Map) term283).keySet();
        term282 = new HashSet((Collection<? extends Object>) term6301);
        term6291 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6292 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6293 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6294 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6295 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6296 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6297 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6291, term6291.getClass(), "type", -268815336);
        setIntField(term6292, term6292.getClass(), "type", -615654495);
        setIntField(term6293, term6293.getClass(), "type", 0);
        setField(term6293, term6293.getClass(), "next", null);
        setField(term6293, term6293.getClass(), "first", null);
        setField(term6293, term6293.getClass(), "last", null);
        setField(term6293, term6293.getClass(), "propListHead", null);
        setIntField(term6293, term6293.getClass(), "sourcePosition", 0);
        setField(term6293, term6293.getClass(), "jsType", null);
        setField(term6293, term6293.getClass(), "parent", null);
        setField(term6292, term6292.getClass(), "next", term6293);
        setIntField(term6294, term6294.getClass(), "type", 0);
        setField(term6294, term6294.getClass(), "next", null);
        setField(term6294, term6294.getClass(), "first", null);
        setField(term6294, term6294.getClass(), "last", null);
        setField(term6294, term6294.getClass(), "propListHead", null);
        setIntField(term6294, term6294.getClass(), "sourcePosition", 0);
        setField(term6294, term6294.getClass(), "jsType", null);
        setField(term6294, term6294.getClass(), "parent", null);
        setField(term6292, term6292.getClass(), "first", term6294);
        setIntField(term6295, term6295.getClass(), "type", 0);
        setField(term6295, term6295.getClass(), "next", null);
        setField(term6295, term6295.getClass(), "first", null);
        setField(term6295, term6295.getClass(), "last", null);
        setField(term6295, term6295.getClass(), "propListHead", null);
        setIntField(term6295, term6295.getClass(), "sourcePosition", 0);
        setField(term6295, term6295.getClass(), "jsType", null);
        setField(term6295, term6295.getClass(), "parent", null);
        setField(term6292, term6292.getClass(), "last", term6295);
        setField(term6292, term6292.getClass(), "propListHead", null);
        setIntField(term6292, term6292.getClass(), "sourcePosition", 0);
        setField(term6292, term6292.getClass(), "jsType", null);
        setField(term6292, term6292.getClass(), "parent", null);
        setField(term6291, term6291.getClass(), "next", term6292);
        setIntField(term6296, term6296.getClass(), "type", 0);
        setField(term6296, term6296.getClass(), "next", null);
        setField(term6296, term6296.getClass(), "first", null);
        setField(term6296, term6296.getClass(), "last", null);
        setField(term6296, term6296.getClass(), "propListHead", null);
        setIntField(term6296, term6296.getClass(), "sourcePosition", 0);
        setField(term6296, term6296.getClass(), "jsType", null);
        setField(term6296, term6296.getClass(), "parent", null);
        setField(term6291, term6291.getClass(), "first", term6296);
        setIntField(term6297, term6297.getClass(), "type", 0);
        setField(term6297, term6297.getClass(), "next", null);
        setField(term6297, term6297.getClass(), "first", null);
        setField(term6297, term6297.getClass(), "last", null);
        setField(term6297, term6297.getClass(), "propListHead", null);
        setIntField(term6297, term6297.getClass(), "sourcePosition", 0);
        setField(term6297, term6297.getClass(), "jsType", null);
        setField(term6297, term6297.getClass(), "parent", null);
        setField(term6291, term6291.getClass(), "last", term6297);
        setField(term6291, term6291.getClass(), "propListHead", null);
        setIntField(term6291, term6291.getClass(), "sourcePosition", 0);
        setField(term6291, term6291.getClass(), "jsType", null);
        setField(term6291, term6291.getClass(), "parent", null);
        HashMap term6299 = new HashMap();
        Set<Object> term6302 =  ((Map) term6299).keySet();
        term6298 = new HashSet((Collection<? extends Object>) term6302);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term261;
        args[1] = term282;
        Object retValue = callMethod(klass, "isValidDefineValue", argTypes, null, args);
        assertTrue(recursiveEquals(term261, term6291));
        assertTrue(recursiveEquals(term282, term6298));
        assertTrue(recursiveEquals(retValue, false));
    }

};


