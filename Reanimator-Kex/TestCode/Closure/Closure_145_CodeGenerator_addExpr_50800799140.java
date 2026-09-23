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

public class CodeGenerator_addExpr_50800799140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1311;
     Object term1312;
     Object term1339;
     Object enum11;

    public CodeGenerator_addExpr_50800799140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1311 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term1311, term1311.getClass(), "cc", null);
        setField(term1311, term1311.getClass(), "outputCharsetEncoder", null);
        term1312 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1314 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1316 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1319 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1322 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1325 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1329 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1332 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1335 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1312, term1312.getClass(), "type", 1063420942);
        setIntField(term1314, term1314.getClass(), "type", 1655935355);
        setIntField(term1316, term1316.getClass(), "type", 0);
        setField(term1316, term1316.getClass(), "next", null);
        setField(term1316, term1316.getClass(), "first", null);
        setField(term1316, term1316.getClass(), "last", null);
        setField(term1316, term1316.getClass(), "propListHead", null);
        setIntField(term1316, term1316.getClass(), "sourcePosition", 0);
        setField(term1316, term1316.getClass(), "jsType", null);
        setField(term1316, term1316.getClass(), "parent", null);
        setField(term1314, term1314.getClass(), "next", term1316);
        setIntField(term1319, term1319.getClass(), "type", 0);
        setField(term1319, term1319.getClass(), "next", null);
        setField(term1319, term1319.getClass(), "first", null);
        setField(term1319, term1319.getClass(), "last", null);
        setField(term1319, term1319.getClass(), "propListHead", null);
        setIntField(term1319, term1319.getClass(), "sourcePosition", 0);
        setField(term1319, term1319.getClass(), "jsType", null);
        setField(term1319, term1319.getClass(), "parent", null);
        setField(term1314, term1314.getClass(), "first", term1319);
        setIntField(term1322, term1322.getClass(), "type", 0);
        setField(term1322, term1322.getClass(), "next", null);
        setField(term1322, term1322.getClass(), "first", null);
        setField(term1322, term1322.getClass(), "last", null);
        setField(term1322, term1322.getClass(), "propListHead", null);
        setIntField(term1322, term1322.getClass(), "sourcePosition", 0);
        setField(term1322, term1322.getClass(), "jsType", null);
        setField(term1322, term1322.getClass(), "parent", null);
        setField(term1314, term1314.getClass(), "last", term1322);
        setField(term1325, term1325.getClass(), "next", null);
        setIntField(term1325, term1325.getClass(), "type", 0);
        setIntField(term1325, term1325.getClass(), "intValue", 0);
        setField(term1325, term1325.getClass(), "objectValue", null);
        setField(term1314, term1314.getClass(), "propListHead", term1325);
        setIntField(term1314, term1314.getClass(), "sourcePosition", -1465035361);
        setField(term1314, term1314.getClass(), "jsType", null);
        setField(term1314, term1314.getClass(), "parent", null);
        setField(term1312, term1312.getClass(), "next", term1314);
        setIntField(term1329, term1329.getClass(), "type", 0);
        setField(term1329, term1329.getClass(), "next", null);
        setField(term1329, term1329.getClass(), "first", null);
        setField(term1329, term1329.getClass(), "last", null);
        setField(term1329, term1329.getClass(), "propListHead", null);
        setIntField(term1329, term1329.getClass(), "sourcePosition", 0);
        setField(term1329, term1329.getClass(), "jsType", null);
        setField(term1329, term1329.getClass(), "parent", null);
        setField(term1312, term1312.getClass(), "first", term1329);
        setIntField(term1332, term1332.getClass(), "type", 0);
        setField(term1332, term1332.getClass(), "next", null);
        setField(term1332, term1332.getClass(), "first", null);
        setField(term1332, term1332.getClass(), "last", null);
        setField(term1332, term1332.getClass(), "propListHead", null);
        setIntField(term1332, term1332.getClass(), "sourcePosition", 0);
        setField(term1332, term1332.getClass(), "jsType", null);
        setField(term1332, term1332.getClass(), "parent", null);
        setField(term1312, term1312.getClass(), "last", term1332);
        setField(term1335, term1335.getClass(), "next", null);
        setIntField(term1335, term1335.getClass(), "type", 0);
        setIntField(term1335, term1335.getClass(), "intValue", 0);
        setField(term1335, term1335.getClass(), "objectValue", null);
        setField(term1312, term1312.getClass(), "propListHead", term1335);
        setIntField(term1312, term1312.getClass(), "sourcePosition", 1090617576);
        setField(term1312, term1312.getClass(), "jsType", null);
        setField(term1312, term1312.getClass(), "parent", null);
        term1339 = new Integer(-1547384488);
        Class<? extends Object> term6838 = Class.forName((String) "com.google.javascript.jscomp.CodeGenerator$Context");
        Field term6837 = ((Class) term6838).getDeclaredField((String) "OTHER");
        ((Field) term6837).setAccessible(true);
        enum11 = ((Field) term6837).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Object[] args = new Object[3];
        args[0] = term1312;
        args[1] = term1339;
        args[2] = enum11;
        try {
            callMethod(klass, "addExpr", argTypes, term1311, args);
            assertTrue(false);
        }
        catch (Error e) {
        }

    }

};


