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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class FunctionInjector_maybePrepareCall_143439966230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1221;
     Object term1246;

    public FunctionInjector_maybePrepareCall_143439966230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1224 = new HashMap();
        Set<Object> term5335 =  ((Map) term1224).keySet();
        HashSet term1223 = new HashSet((Collection<? extends Object>) term5335);
        term1221 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionInjector"));
        setField(term1221, term1221.getClass(), "compiler", null);
        setField(term1221, term1221.getClass(), "safeNameIdSupplier", null);
        setBooleanField(term1221, term1221.getClass(), "allowDecomposition", false);
        setField(term1221, term1221.getClass(), "knownConstants", term1223);
        setBooleanField(term1221, term1221.getClass(), "assumeStrictThis", false);
        setBooleanField(term1221, term1221.getClass(), "assumeMinimumCapture", true);
        term1246 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1248 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1250 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1252 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1254 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1257 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1261 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1263 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1268 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1246, term1246.getClass(), "type", -1263114719);
        setIntField(term1248, term1248.getClass(), "type", -894662986);
        setIntField(term1250, term1250.getClass(), "type", 304775596);
        setIntField(term1252, term1252.getClass(), "type", -1347665717);
        setIntField(term1254, term1254.getClass(), "type", -1888585309);
        setField(term1254, term1254.getClass(), "next", null);
        setField(term1254, term1254.getClass(), "first", null);
        setField(term1254, term1254.getClass(), "last", null);
        setField(term1254, term1254.getClass(), "propListHead", null);
        setIntField(term1254, term1254.getClass(), "sourcePosition", 0);
        setField(term1254, term1254.getClass(), "jsType", null);
        setField(term1254, term1254.getClass(), "parent", null);
        setField(term1252, term1252.getClass(), "next", term1254);
        setIntField(term1257, term1257.getClass(), "type", 683666002);
        setField(term1257, term1257.getClass(), "next", null);
        setField(term1257, term1257.getClass(), "first", null);
        setField(term1257, term1257.getClass(), "last", term1254);
        setField(term1257, term1257.getClass(), "propListHead", null);
        setIntField(term1257, term1257.getClass(), "sourcePosition", 0);
        setField(term1257, term1257.getClass(), "jsType", null);
        setField(term1257, term1257.getClass(), "parent", null);
        setField(term1252, term1252.getClass(), "first", term1257);
        setField(term1252, term1252.getClass(), "last", term1250);
        setField(term1252, term1252.getClass(), "propListHead", null);
        setIntField(term1252, term1252.getClass(), "sourcePosition", 0);
        setField(term1252, term1252.getClass(), "jsType", null);
        setField(term1252, term1252.getClass(), "parent", null);
        setField(term1250, term1250.getClass(), "next", term1252);
        setField(term1250, term1250.getClass(), "first", term1254);
        setIntField(term1261, term1261.getClass(), "type", -268815336);
        setIntField(term1263, term1263.getClass(), "type", -1210583429);
        setField(term1263, term1263.getClass(), "next", null);
        setField(term1263, term1263.getClass(), "first", term1257);
        setField(term1263, term1263.getClass(), "last", term1252);
        setField(term1263, term1263.getClass(), "propListHead", null);
        setIntField(term1263, term1263.getClass(), "sourcePosition", 0);
        setField(term1263, term1263.getClass(), "jsType", null);
        setField(term1263, term1263.getClass(), "parent", null);
        setField(term1261, term1261.getClass(), "next", term1263);
        setField(term1261, term1261.getClass(), "first", term1248);
        setField(term1261, term1261.getClass(), "last", term1248);
        setField(term1261, term1261.getClass(), "propListHead", null);
        setIntField(term1261, term1261.getClass(), "sourcePosition", 0);
        setField(term1261, term1261.getClass(), "jsType", null);
        setField(term1261, term1261.getClass(), "parent", null);
        setField(term1250, term1250.getClass(), "last", term1261);
        setField(term1250, term1250.getClass(), "propListHead", null);
        setIntField(term1250, term1250.getClass(), "sourcePosition", 0);
        setField(term1250, term1250.getClass(), "jsType", null);
        setField(term1250, term1250.getClass(), "parent", null);
        setField(term1248, term1248.getClass(), "next", term1250);
        setIntField(term1268, term1268.getClass(), "type", -663691365);
        setField(term1268, term1268.getClass(), "next", term1261);
        setField(term1268, term1268.getClass(), "first", term1263);
        setField(term1268, term1268.getClass(), "last", term1246);
        setField(term1268, term1268.getClass(), "propListHead", null);
        setIntField(term1268, term1268.getClass(), "sourcePosition", 0);
        setField(term1268, term1268.getClass(), "jsType", null);
        setField(term1268, term1268.getClass(), "parent", null);
        setField(term1248, term1248.getClass(), "first", term1268);
        setField(term1248, term1248.getClass(), "last", term1268);
        setField(term1248, term1248.getClass(), "propListHead", null);
        setIntField(term1248, term1248.getClass(), "sourcePosition", 0);
        setField(term1248, term1248.getClass(), "jsType", null);
        setField(term1248, term1248.getClass(), "parent", null);
        setField(term1246, term1246.getClass(), "next", term1248);
        setField(term1246, term1246.getClass(), "first", term1252);
        setField(term1246, term1246.getClass(), "last", term1254);
        setField(term1246, term1246.getClass(), "propListHead", null);
        setIntField(term1246, term1246.getClass(), "sourcePosition", 0);
        setField(term1246, term1246.getClass(), "jsType", null);
        setField(term1246, term1246.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1246;
        try {
            callMethod(klass, "maybePrepareCall", argTypes, term1221, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


