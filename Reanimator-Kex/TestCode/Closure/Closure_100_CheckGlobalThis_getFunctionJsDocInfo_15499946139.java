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
import java.lang.String;
import java.lang.Object;

public class CheckGlobalThis_getFunctionJsDocInfo_15499946139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1311;
     Object term1348;

    public CheckGlobalThis_getFunctionJsDocInfo_15499946139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4433 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term4432 = ((Class) term4433).getDeclaredField((String) "ERROR");
        ((Field) term4432).setAccessible(true);
        Object enum14 = ((Field) term4432).get((Object) null);
        term1311 = newInstance(Class.forName("com.google.javascript.jscomp.CheckGlobalThis"));
        Object term1321 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1323 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1325 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1328 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1331 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1334 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1338 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1341 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1344 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setField(term1311, term1311.getClass(), "compiler", null);
        setField(term1311, term1311.getClass(), "level", enum14);
        setIntField(term1321, term1321.getClass(), "type", 1072005683);
        setIntField(term1323, term1323.getClass(), "type", 53410913);
        setIntField(term1325, term1325.getClass(), "type", 0);
        setField(term1325, term1325.getClass(), "next", null);
        setField(term1325, term1325.getClass(), "first", null);
        setField(term1325, term1325.getClass(), "last", null);
        setField(term1325, term1325.getClass(), "propListHead", null);
        setIntField(term1325, term1325.getClass(), "sourcePosition", 0);
        setField(term1325, term1325.getClass(), "jsType", null);
        setField(term1325, term1325.getClass(), "parent", null);
        setField(term1323, term1323.getClass(), "next", term1325);
        setIntField(term1328, term1328.getClass(), "type", 0);
        setField(term1328, term1328.getClass(), "next", null);
        setField(term1328, term1328.getClass(), "first", null);
        setField(term1328, term1328.getClass(), "last", null);
        setField(term1328, term1328.getClass(), "propListHead", null);
        setIntField(term1328, term1328.getClass(), "sourcePosition", 0);
        setField(term1328, term1328.getClass(), "jsType", null);
        setField(term1328, term1328.getClass(), "parent", null);
        setField(term1323, term1323.getClass(), "first", term1328);
        setIntField(term1331, term1331.getClass(), "type", 0);
        setField(term1331, term1331.getClass(), "next", null);
        setField(term1331, term1331.getClass(), "first", null);
        setField(term1331, term1331.getClass(), "last", null);
        setField(term1331, term1331.getClass(), "propListHead", null);
        setIntField(term1331, term1331.getClass(), "sourcePosition", 0);
        setField(term1331, term1331.getClass(), "jsType", null);
        setField(term1331, term1331.getClass(), "parent", null);
        setField(term1323, term1323.getClass(), "last", term1331);
        setField(term1334, term1334.getClass(), "next", null);
        setIntField(term1334, term1334.getClass(), "type", 0);
        setIntField(term1334, term1334.getClass(), "intValue", 0);
        setField(term1334, term1334.getClass(), "objectValue", null);
        setField(term1323, term1323.getClass(), "propListHead", term1334);
        setIntField(term1323, term1323.getClass(), "sourcePosition", -375014958);
        setField(term1323, term1323.getClass(), "jsType", null);
        setField(term1323, term1323.getClass(), "parent", null);
        setField(term1321, term1321.getClass(), "next", term1323);
        setIntField(term1338, term1338.getClass(), "type", 0);
        setField(term1338, term1338.getClass(), "next", null);
        setField(term1338, term1338.getClass(), "first", null);
        setField(term1338, term1338.getClass(), "last", null);
        setField(term1338, term1338.getClass(), "propListHead", null);
        setIntField(term1338, term1338.getClass(), "sourcePosition", 0);
        setField(term1338, term1338.getClass(), "jsType", null);
        setField(term1338, term1338.getClass(), "parent", null);
        setField(term1321, term1321.getClass(), "first", term1338);
        setIntField(term1341, term1341.getClass(), "type", 0);
        setField(term1341, term1341.getClass(), "next", null);
        setField(term1341, term1341.getClass(), "first", null);
        setField(term1341, term1341.getClass(), "last", null);
        setField(term1341, term1341.getClass(), "propListHead", null);
        setIntField(term1341, term1341.getClass(), "sourcePosition", 0);
        setField(term1341, term1341.getClass(), "jsType", null);
        setField(term1341, term1341.getClass(), "parent", null);
        setField(term1321, term1321.getClass(), "last", term1341);
        setField(term1344, term1344.getClass(), "next", null);
        setIntField(term1344, term1344.getClass(), "type", 0);
        setIntField(term1344, term1344.getClass(), "intValue", 0);
        setField(term1344, term1344.getClass(), "objectValue", null);
        setField(term1321, term1321.getClass(), "propListHead", term1344);
        setIntField(term1321, term1321.getClass(), "sourcePosition", 1107176718);
        setField(term1321, term1321.getClass(), "jsType", null);
        setField(term1321, term1321.getClass(), "parent", null);
        setField(term1311, term1311.getClass(), "assignLhsChild", term1321);
        term1348 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1350 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1352 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1355 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1358 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1361 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1365 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1368 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1371 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1348, term1348.getClass(), "type", 538259104);
        setIntField(term1350, term1350.getClass(), "type", -1963464809);
        setIntField(term1352, term1352.getClass(), "type", 0);
        setField(term1352, term1352.getClass(), "next", null);
        setField(term1352, term1352.getClass(), "first", null);
        setField(term1352, term1352.getClass(), "last", null);
        setField(term1352, term1352.getClass(), "propListHead", null);
        setIntField(term1352, term1352.getClass(), "sourcePosition", 0);
        setField(term1352, term1352.getClass(), "jsType", null);
        setField(term1352, term1352.getClass(), "parent", null);
        setField(term1350, term1350.getClass(), "next", term1352);
        setIntField(term1355, term1355.getClass(), "type", 0);
        setField(term1355, term1355.getClass(), "next", null);
        setField(term1355, term1355.getClass(), "first", null);
        setField(term1355, term1355.getClass(), "last", null);
        setField(term1355, term1355.getClass(), "propListHead", null);
        setIntField(term1355, term1355.getClass(), "sourcePosition", 0);
        setField(term1355, term1355.getClass(), "jsType", null);
        setField(term1355, term1355.getClass(), "parent", null);
        setField(term1350, term1350.getClass(), "first", term1355);
        setIntField(term1358, term1358.getClass(), "type", 0);
        setField(term1358, term1358.getClass(), "next", null);
        setField(term1358, term1358.getClass(), "first", null);
        setField(term1358, term1358.getClass(), "last", null);
        setField(term1358, term1358.getClass(), "propListHead", null);
        setIntField(term1358, term1358.getClass(), "sourcePosition", 0);
        setField(term1358, term1358.getClass(), "jsType", null);
        setField(term1358, term1358.getClass(), "parent", null);
        setField(term1350, term1350.getClass(), "last", term1358);
        setField(term1361, term1361.getClass(), "next", null);
        setIntField(term1361, term1361.getClass(), "type", 0);
        setIntField(term1361, term1361.getClass(), "intValue", 0);
        setField(term1361, term1361.getClass(), "objectValue", null);
        setField(term1350, term1350.getClass(), "propListHead", term1361);
        setIntField(term1350, term1350.getClass(), "sourcePosition", -2015048153);
        setField(term1350, term1350.getClass(), "jsType", null);
        setField(term1350, term1350.getClass(), "parent", null);
        setField(term1348, term1348.getClass(), "next", term1350);
        setIntField(term1365, term1365.getClass(), "type", 0);
        setField(term1365, term1365.getClass(), "next", null);
        setField(term1365, term1365.getClass(), "first", null);
        setField(term1365, term1365.getClass(), "last", null);
        setField(term1365, term1365.getClass(), "propListHead", null);
        setIntField(term1365, term1365.getClass(), "sourcePosition", 0);
        setField(term1365, term1365.getClass(), "jsType", null);
        setField(term1365, term1365.getClass(), "parent", null);
        setField(term1348, term1348.getClass(), "first", term1365);
        setIntField(term1368, term1368.getClass(), "type", 0);
        setField(term1368, term1368.getClass(), "next", null);
        setField(term1368, term1368.getClass(), "first", null);
        setField(term1368, term1368.getClass(), "last", null);
        setField(term1368, term1368.getClass(), "propListHead", null);
        setIntField(term1368, term1368.getClass(), "sourcePosition", 0);
        setField(term1368, term1368.getClass(), "jsType", null);
        setField(term1368, term1368.getClass(), "parent", null);
        setField(term1348, term1348.getClass(), "last", term1368);
        setField(term1371, term1371.getClass(), "next", null);
        setIntField(term1371, term1371.getClass(), "type", 0);
        setIntField(term1371, term1371.getClass(), "intValue", 0);
        setField(term1371, term1371.getClass(), "objectValue", null);
        setField(term1348, term1348.getClass(), "propListHead", term1371);
        setIntField(term1348, term1348.getClass(), "sourcePosition", -2063457669);
        setField(term1348, term1348.getClass(), "jsType", null);
        setField(term1348, term1348.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckGlobalThis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1348;
        try {
            callMethod(klass, "getFunctionJsDocInfo", argTypes, term1311, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


