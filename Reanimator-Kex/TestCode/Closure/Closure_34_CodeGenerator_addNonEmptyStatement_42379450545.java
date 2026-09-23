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
import java.util.HashMap;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class CodeGenerator_addNonEmptyStatement_42379450545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1392;
     Object term1403;
     Object enum12;
     Object term1439;

    public CodeGenerator_addNonEmptyStatement_42379450545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1393 = new HashMap();
        term1392 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term1392, term1392.getClass(), "ESCAPED_JS_STRINGS", term1393);
        setField(term1392, term1392.getClass(), "cc", null);
        setField(term1392, term1392.getClass(), "outputCharsetEncoder", null);
        term1403 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1405 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1407 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1409 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1411 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1414 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1418 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1420 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1425 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1403, term1403.getClass(), "type", -157887805);
        setIntField(term1405, term1405.getClass(), "type", 1876565163);
        setIntField(term1407, term1407.getClass(), "type", -817164822);
        setIntField(term1409, term1409.getClass(), "type", -1016503459);
        setIntField(term1411, term1411.getClass(), "type", -1968847291);
        setField(term1411, term1411.getClass(), "next", null);
        setField(term1411, term1411.getClass(), "first", null);
        setField(term1411, term1411.getClass(), "last", null);
        setField(term1411, term1411.getClass(), "propListHead", null);
        setIntField(term1411, term1411.getClass(), "sourcePosition", 0);
        setField(term1411, term1411.getClass(), "jsType", null);
        setField(term1411, term1411.getClass(), "parent", null);
        setField(term1409, term1409.getClass(), "next", term1411);
        setIntField(term1414, term1414.getClass(), "type", 579005622);
        setField(term1414, term1414.getClass(), "next", null);
        setField(term1414, term1414.getClass(), "first", null);
        setField(term1414, term1414.getClass(), "last", term1411);
        setField(term1414, term1414.getClass(), "propListHead", null);
        setIntField(term1414, term1414.getClass(), "sourcePosition", 0);
        setField(term1414, term1414.getClass(), "jsType", null);
        setField(term1414, term1414.getClass(), "parent", null);
        setField(term1409, term1409.getClass(), "first", term1414);
        setField(term1409, term1409.getClass(), "last", term1407);
        setField(term1409, term1409.getClass(), "propListHead", null);
        setIntField(term1409, term1409.getClass(), "sourcePosition", 0);
        setField(term1409, term1409.getClass(), "jsType", null);
        setField(term1409, term1409.getClass(), "parent", null);
        setField(term1407, term1407.getClass(), "next", term1409);
        setField(term1407, term1407.getClass(), "first", term1411);
        setIntField(term1418, term1418.getClass(), "type", 1632125673);
        setIntField(term1420, term1420.getClass(), "type", 454281060);
        setField(term1420, term1420.getClass(), "next", null);
        setField(term1420, term1420.getClass(), "first", term1414);
        setField(term1420, term1420.getClass(), "last", term1409);
        setField(term1420, term1420.getClass(), "propListHead", null);
        setIntField(term1420, term1420.getClass(), "sourcePosition", 0);
        setField(term1420, term1420.getClass(), "jsType", null);
        setField(term1420, term1420.getClass(), "parent", null);
        setField(term1418, term1418.getClass(), "next", term1420);
        setField(term1418, term1418.getClass(), "first", term1405);
        setField(term1418, term1418.getClass(), "last", term1405);
        setField(term1418, term1418.getClass(), "propListHead", null);
        setIntField(term1418, term1418.getClass(), "sourcePosition", 0);
        setField(term1418, term1418.getClass(), "jsType", null);
        setField(term1418, term1418.getClass(), "parent", null);
        setField(term1407, term1407.getClass(), "last", term1418);
        setField(term1407, term1407.getClass(), "propListHead", null);
        setIntField(term1407, term1407.getClass(), "sourcePosition", 0);
        setField(term1407, term1407.getClass(), "jsType", null);
        setField(term1407, term1407.getClass(), "parent", null);
        setField(term1405, term1405.getClass(), "next", term1407);
        setIntField(term1425, term1425.getClass(), "type", -1786399638);
        setField(term1425, term1425.getClass(), "next", term1418);
        setField(term1425, term1425.getClass(), "first", term1420);
        setField(term1425, term1425.getClass(), "last", term1403);
        setField(term1425, term1425.getClass(), "propListHead", null);
        setIntField(term1425, term1425.getClass(), "sourcePosition", 0);
        setField(term1425, term1425.getClass(), "jsType", null);
        setField(term1425, term1425.getClass(), "parent", null);
        setField(term1405, term1405.getClass(), "first", term1425);
        setField(term1405, term1405.getClass(), "last", term1425);
        setField(term1405, term1405.getClass(), "propListHead", null);
        setIntField(term1405, term1405.getClass(), "sourcePosition", 0);
        setField(term1405, term1405.getClass(), "jsType", null);
        setField(term1405, term1405.getClass(), "parent", null);
        setField(term1403, term1403.getClass(), "next", term1405);
        setField(term1403, term1403.getClass(), "first", term1409);
        setField(term1403, term1403.getClass(), "last", term1411);
        setField(term1403, term1403.getClass(), "propListHead", null);
        setIntField(term1403, term1403.getClass(), "sourcePosition", 0);
        setField(term1403, term1403.getClass(), "jsType", null);
        setField(term1403, term1403.getClass(), "parent", null);
        Class<? extends Object> term6939 = Class.forName((String) "com.google.javascript.jscomp.CodeGenerator$Context");
        Field term6938 = ((Class) term6939).getDeclaredField((String) "OTHER");
        ((Field) term6938).setAccessible(true);
        enum12 = ((Field) term6938).get((Object) null);
        term1439 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term1403;
        args[1] = enum12;
        args[2] = term1439;
        try {
            callMethod(klass, "addNonEmptyStatement", argTypes, term1392, args);
            assertTrue(false);
        }
        catch (Error e) {
        }

    }

};


