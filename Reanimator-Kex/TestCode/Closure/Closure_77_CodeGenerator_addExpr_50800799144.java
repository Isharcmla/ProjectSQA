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

public class CodeGenerator_addExpr_50800799144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1340;
     Object term1341;
     Object term1368;
     Object enum11;

    public CodeGenerator_addExpr_50800799144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1340 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term1340, term1340.getClass(), "cc", null);
        setField(term1340, term1340.getClass(), "outputCharsetEncoder", null);
        term1341 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1343 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1345 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1348 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1351 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1354 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1358 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1361 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1364 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1341, term1341.getClass(), "type", -556405712);
        setIntField(term1343, term1343.getClass(), "type", -344842608);
        setIntField(term1345, term1345.getClass(), "type", 0);
        setField(term1345, term1345.getClass(), "next", null);
        setField(term1345, term1345.getClass(), "first", null);
        setField(term1345, term1345.getClass(), "last", null);
        setField(term1345, term1345.getClass(), "propListHead", null);
        setIntField(term1345, term1345.getClass(), "sourcePosition", 0);
        setField(term1345, term1345.getClass(), "jsType", null);
        setField(term1345, term1345.getClass(), "parent", null);
        setField(term1343, term1343.getClass(), "next", term1345);
        setIntField(term1348, term1348.getClass(), "type", 0);
        setField(term1348, term1348.getClass(), "next", null);
        setField(term1348, term1348.getClass(), "first", null);
        setField(term1348, term1348.getClass(), "last", null);
        setField(term1348, term1348.getClass(), "propListHead", null);
        setIntField(term1348, term1348.getClass(), "sourcePosition", 0);
        setField(term1348, term1348.getClass(), "jsType", null);
        setField(term1348, term1348.getClass(), "parent", null);
        setField(term1343, term1343.getClass(), "first", term1348);
        setIntField(term1351, term1351.getClass(), "type", 0);
        setField(term1351, term1351.getClass(), "next", null);
        setField(term1351, term1351.getClass(), "first", null);
        setField(term1351, term1351.getClass(), "last", null);
        setField(term1351, term1351.getClass(), "propListHead", null);
        setIntField(term1351, term1351.getClass(), "sourcePosition", 0);
        setField(term1351, term1351.getClass(), "jsType", null);
        setField(term1351, term1351.getClass(), "parent", null);
        setField(term1343, term1343.getClass(), "last", term1351);
        setField(term1354, term1354.getClass(), "next", null);
        setIntField(term1354, term1354.getClass(), "type", 0);
        setIntField(term1354, term1354.getClass(), "intValue", 0);
        setField(term1354, term1354.getClass(), "objectValue", null);
        setField(term1343, term1343.getClass(), "propListHead", term1354);
        setIntField(term1343, term1343.getClass(), "sourcePosition", -1034506028);
        setField(term1343, term1343.getClass(), "jsType", null);
        setField(term1343, term1343.getClass(), "parent", null);
        setField(term1341, term1341.getClass(), "next", term1343);
        setIntField(term1358, term1358.getClass(), "type", 0);
        setField(term1358, term1358.getClass(), "next", null);
        setField(term1358, term1358.getClass(), "first", null);
        setField(term1358, term1358.getClass(), "last", null);
        setField(term1358, term1358.getClass(), "propListHead", null);
        setIntField(term1358, term1358.getClass(), "sourcePosition", 0);
        setField(term1358, term1358.getClass(), "jsType", null);
        setField(term1358, term1358.getClass(), "parent", null);
        setField(term1341, term1341.getClass(), "first", term1358);
        setIntField(term1361, term1361.getClass(), "type", 0);
        setField(term1361, term1361.getClass(), "next", null);
        setField(term1361, term1361.getClass(), "first", null);
        setField(term1361, term1361.getClass(), "last", null);
        setField(term1361, term1361.getClass(), "propListHead", null);
        setIntField(term1361, term1361.getClass(), "sourcePosition", 0);
        setField(term1361, term1361.getClass(), "jsType", null);
        setField(term1361, term1361.getClass(), "parent", null);
        setField(term1341, term1341.getClass(), "last", term1361);
        setField(term1364, term1364.getClass(), "next", null);
        setIntField(term1364, term1364.getClass(), "type", 0);
        setIntField(term1364, term1364.getClass(), "intValue", 0);
        setField(term1364, term1364.getClass(), "objectValue", null);
        setField(term1341, term1341.getClass(), "propListHead", term1364);
        setIntField(term1341, term1341.getClass(), "sourcePosition", -1263114719);
        setField(term1341, term1341.getClass(), "jsType", null);
        setField(term1341, term1341.getClass(), "parent", null);
        term1368 = new Integer(-894662986);
        Class<? extends Object> term7132 = Class.forName((String) "com.google.javascript.jscomp.CodeGenerator$Context");
        Field term7131 = ((Class) term7132).getDeclaredField((String) "OTHER");
        ((Field) term7131).setAccessible(true);
        enum11 = ((Field) term7131).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Object[] args = new Object[3];
        args[0] = term1341;
        args[1] = term1368;
        args[2] = enum11;
        try {
            callMethod(klass, "addExpr", argTypes, term1340, args);
            assertTrue(false);
        }
        catch (Error e) {
        }

    }

};


