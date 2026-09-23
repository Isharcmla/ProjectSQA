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
import java.util.HashMap;
import java.lang.Object;

public class CodeGenerator_isIndirectEval_82913146710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1354;
     Object term1365;

    public CodeGenerator_isIndirectEval_82913146710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1355 = new HashMap();
        term1354 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term1354, term1354.getClass(), "ESCAPED_JS_STRINGS", term1355);
        setField(term1354, term1354.getClass(), "cc", null);
        setField(term1354, term1354.getClass(), "outputCharsetEncoder", null);
        term1365 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1367 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1369 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1371 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1373 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1376 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1380 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1382 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1387 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1365, term1365.getClass(), "type", -226514366);
        setIntField(term1367, term1367.getClass(), "type", 1193880199);
        setIntField(term1369, term1369.getClass(), "type", -1087774327);
        setIntField(term1371, term1371.getClass(), "type", -1530420153);
        setIntField(term1373, term1373.getClass(), "type", -469968304);
        setField(term1373, term1373.getClass(), "next", null);
        setField(term1373, term1373.getClass(), "first", null);
        setField(term1373, term1373.getClass(), "last", null);
        setField(term1373, term1373.getClass(), "propListHead", null);
        setIntField(term1373, term1373.getClass(), "sourcePosition", 0);
        setField(term1373, term1373.getClass(), "jsType", null);
        setField(term1373, term1373.getClass(), "parent", null);
        setField(term1371, term1371.getClass(), "next", term1373);
        setIntField(term1376, term1376.getClass(), "type", -1145578966);
        setField(term1376, term1376.getClass(), "next", null);
        setField(term1376, term1376.getClass(), "first", null);
        setField(term1376, term1376.getClass(), "last", term1373);
        setField(term1376, term1376.getClass(), "propListHead", null);
        setIntField(term1376, term1376.getClass(), "sourcePosition", 0);
        setField(term1376, term1376.getClass(), "jsType", null);
        setField(term1376, term1376.getClass(), "parent", null);
        setField(term1371, term1371.getClass(), "first", term1376);
        setField(term1371, term1371.getClass(), "last", term1369);
        setField(term1371, term1371.getClass(), "propListHead", null);
        setIntField(term1371, term1371.getClass(), "sourcePosition", 0);
        setField(term1371, term1371.getClass(), "jsType", null);
        setField(term1371, term1371.getClass(), "parent", null);
        setField(term1369, term1369.getClass(), "next", term1371);
        setField(term1369, term1369.getClass(), "first", term1373);
        setIntField(term1380, term1380.getClass(), "type", 1962444399);
        setIntField(term1382, term1382.getClass(), "type", 767834723);
        setField(term1382, term1382.getClass(), "next", null);
        setField(term1382, term1382.getClass(), "first", term1376);
        setField(term1382, term1382.getClass(), "last", term1371);
        setField(term1382, term1382.getClass(), "propListHead", null);
        setIntField(term1382, term1382.getClass(), "sourcePosition", 0);
        setField(term1382, term1382.getClass(), "jsType", null);
        setField(term1382, term1382.getClass(), "parent", null);
        setField(term1380, term1380.getClass(), "next", term1382);
        setField(term1380, term1380.getClass(), "first", term1367);
        setField(term1380, term1380.getClass(), "last", term1367);
        setField(term1380, term1380.getClass(), "propListHead", null);
        setIntField(term1380, term1380.getClass(), "sourcePosition", 0);
        setField(term1380, term1380.getClass(), "jsType", null);
        setField(term1380, term1380.getClass(), "parent", null);
        setField(term1369, term1369.getClass(), "last", term1380);
        setField(term1369, term1369.getClass(), "propListHead", null);
        setIntField(term1369, term1369.getClass(), "sourcePosition", 0);
        setField(term1369, term1369.getClass(), "jsType", null);
        setField(term1369, term1369.getClass(), "parent", null);
        setField(term1367, term1367.getClass(), "next", term1369);
        setIntField(term1387, term1387.getClass(), "type", -602026508);
        setField(term1387, term1387.getClass(), "next", term1380);
        setField(term1387, term1387.getClass(), "first", term1382);
        setField(term1387, term1387.getClass(), "last", term1365);
        setField(term1387, term1387.getClass(), "propListHead", null);
        setIntField(term1387, term1387.getClass(), "sourcePosition", 0);
        setField(term1387, term1387.getClass(), "jsType", null);
        setField(term1387, term1387.getClass(), "parent", null);
        setField(term1367, term1367.getClass(), "first", term1387);
        setField(term1367, term1367.getClass(), "last", term1387);
        setField(term1367, term1367.getClass(), "propListHead", null);
        setIntField(term1367, term1367.getClass(), "sourcePosition", 0);
        setField(term1367, term1367.getClass(), "jsType", null);
        setField(term1367, term1367.getClass(), "parent", null);
        setField(term1365, term1365.getClass(), "next", term1367);
        setField(term1365, term1365.getClass(), "first", term1371);
        setField(term1365, term1365.getClass(), "last", term1373);
        setField(term1365, term1365.getClass(), "propListHead", null);
        setIntField(term1365, term1365.getClass(), "sourcePosition", 0);
        setField(term1365, term1365.getClass(), "jsType", null);
        setField(term1365, term1365.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1365;
        callMethod(klass, "isIndirectEval", argTypes, term1354, args);
    }

};


