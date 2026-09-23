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
import java.lang.Error;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;
import java.lang.String;

public class CodeGenerator_addExpr_50800799148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1384;
     Object term1385;
     Object term1412;
     Object enum11;

    public CodeGenerator_addExpr_50800799148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1384 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term1384, term1384.getClass(), "cc", null);
        setField(term1384, term1384.getClass(), "outputCharsetEncoder", null);
        term1385 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1387 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1389 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1392 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1395 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1398 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1402 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1405 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1408 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1385, term1385.getClass(), "type", -556405712);
        setIntField(term1387, term1387.getClass(), "type", -344842608);
        setIntField(term1389, term1389.getClass(), "type", 0);
        setField(term1389, term1389.getClass(), "next", null);
        setField(term1389, term1389.getClass(), "first", null);
        setField(term1389, term1389.getClass(), "last", null);
        setField(term1389, term1389.getClass(), "propListHead", null);
        setIntField(term1389, term1389.getClass(), "sourcePosition", 0);
        setField(term1389, term1389.getClass(), "jsType", null);
        setField(term1389, term1389.getClass(), "parent", null);
        setField(term1387, term1387.getClass(), "next", term1389);
        setIntField(term1392, term1392.getClass(), "type", 0);
        setField(term1392, term1392.getClass(), "next", null);
        setField(term1392, term1392.getClass(), "first", null);
        setField(term1392, term1392.getClass(), "last", null);
        setField(term1392, term1392.getClass(), "propListHead", null);
        setIntField(term1392, term1392.getClass(), "sourcePosition", 0);
        setField(term1392, term1392.getClass(), "jsType", null);
        setField(term1392, term1392.getClass(), "parent", null);
        setField(term1387, term1387.getClass(), "first", term1392);
        setIntField(term1395, term1395.getClass(), "type", 0);
        setField(term1395, term1395.getClass(), "next", null);
        setField(term1395, term1395.getClass(), "first", null);
        setField(term1395, term1395.getClass(), "last", null);
        setField(term1395, term1395.getClass(), "propListHead", null);
        setIntField(term1395, term1395.getClass(), "sourcePosition", 0);
        setField(term1395, term1395.getClass(), "jsType", null);
        setField(term1395, term1395.getClass(), "parent", null);
        setField(term1387, term1387.getClass(), "last", term1395);
        setField(term1398, term1398.getClass(), "next", null);
        setIntField(term1398, term1398.getClass(), "type", 0);
        setIntField(term1398, term1398.getClass(), "intValue", 0);
        setField(term1398, term1398.getClass(), "objectValue", null);
        setField(term1387, term1387.getClass(), "propListHead", term1398);
        setIntField(term1387, term1387.getClass(), "sourcePosition", -1034506028);
        setField(term1387, term1387.getClass(), "jsType", null);
        setField(term1387, term1387.getClass(), "parent", null);
        setField(term1385, term1385.getClass(), "next", term1387);
        setIntField(term1402, term1402.getClass(), "type", 0);
        setField(term1402, term1402.getClass(), "next", null);
        setField(term1402, term1402.getClass(), "first", null);
        setField(term1402, term1402.getClass(), "last", null);
        setField(term1402, term1402.getClass(), "propListHead", null);
        setIntField(term1402, term1402.getClass(), "sourcePosition", 0);
        setField(term1402, term1402.getClass(), "jsType", null);
        setField(term1402, term1402.getClass(), "parent", null);
        setField(term1385, term1385.getClass(), "first", term1402);
        setIntField(term1405, term1405.getClass(), "type", 0);
        setField(term1405, term1405.getClass(), "next", null);
        setField(term1405, term1405.getClass(), "first", null);
        setField(term1405, term1405.getClass(), "last", null);
        setField(term1405, term1405.getClass(), "propListHead", null);
        setIntField(term1405, term1405.getClass(), "sourcePosition", 0);
        setField(term1405, term1405.getClass(), "jsType", null);
        setField(term1405, term1405.getClass(), "parent", null);
        setField(term1385, term1385.getClass(), "last", term1405);
        setField(term1408, term1408.getClass(), "next", null);
        setIntField(term1408, term1408.getClass(), "type", 0);
        setIntField(term1408, term1408.getClass(), "intValue", 0);
        setField(term1408, term1408.getClass(), "objectValue", null);
        setField(term1385, term1385.getClass(), "propListHead", term1408);
        setIntField(term1385, term1385.getClass(), "sourcePosition", -1263114719);
        setField(term1385, term1385.getClass(), "jsType", null);
        setField(term1385, term1385.getClass(), "parent", null);
        term1412 = new Integer(-894662986);
        Class<? extends Object> term7243 = Class.forName((String) "com.google.javascript.jscomp.CodeGenerator$Context");
        Field term7242 = ((Class) term7243).getDeclaredField((String) "OTHER");
        ((Field) term7242).setAccessible(true);
        enum11 = ((Field) term7242).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Object[] args = new Object[3];
        args[0] = term1385;
        args[1] = term1412;
        args[2] = enum11;
        try {
            callMethod(klass, "addExpr", argTypes, term1384, args);
            assertTrue(false);
        }
        catch (Error e) {
        }

    }

};


