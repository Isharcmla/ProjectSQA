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

public class CodeGenerator_addExpr_89705613747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1354;
     Object term1355;
     Object term1382;

    public CodeGenerator_addExpr_89705613747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1354 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term1354, term1354.getClass(), "cc", null);
        setField(term1354, term1354.getClass(), "outputCharsetEncoder", null);
        term1355 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1357 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1359 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1362 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1365 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1368 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1372 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1375 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1378 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1355, term1355.getClass(), "type", -2027534003);
        setIntField(term1357, term1357.getClass(), "type", 972867650);
        setIntField(term1359, term1359.getClass(), "type", 0);
        setField(term1359, term1359.getClass(), "next", null);
        setField(term1359, term1359.getClass(), "first", null);
        setField(term1359, term1359.getClass(), "last", null);
        setField(term1359, term1359.getClass(), "propListHead", null);
        setIntField(term1359, term1359.getClass(), "sourcePosition", 0);
        setField(term1359, term1359.getClass(), "jsType", null);
        setField(term1359, term1359.getClass(), "parent", null);
        setField(term1357, term1357.getClass(), "next", term1359);
        setIntField(term1362, term1362.getClass(), "type", 0);
        setField(term1362, term1362.getClass(), "next", null);
        setField(term1362, term1362.getClass(), "first", null);
        setField(term1362, term1362.getClass(), "last", null);
        setField(term1362, term1362.getClass(), "propListHead", null);
        setIntField(term1362, term1362.getClass(), "sourcePosition", 0);
        setField(term1362, term1362.getClass(), "jsType", null);
        setField(term1362, term1362.getClass(), "parent", null);
        setField(term1357, term1357.getClass(), "first", term1362);
        setIntField(term1365, term1365.getClass(), "type", 0);
        setField(term1365, term1365.getClass(), "next", null);
        setField(term1365, term1365.getClass(), "first", null);
        setField(term1365, term1365.getClass(), "last", null);
        setField(term1365, term1365.getClass(), "propListHead", null);
        setIntField(term1365, term1365.getClass(), "sourcePosition", 0);
        setField(term1365, term1365.getClass(), "jsType", null);
        setField(term1365, term1365.getClass(), "parent", null);
        setField(term1357, term1357.getClass(), "last", term1365);
        setField(term1368, term1368.getClass(), "next", null);
        setIntField(term1368, term1368.getClass(), "type", 0);
        setIntField(term1368, term1368.getClass(), "intValue", 0);
        setField(term1368, term1368.getClass(), "objectValue", null);
        setField(term1357, term1357.getClass(), "propListHead", term1368);
        setIntField(term1357, term1357.getClass(), "sourcePosition", 1240914516);
        setField(term1357, term1357.getClass(), "jsType", null);
        setField(term1357, term1357.getClass(), "parent", null);
        setField(term1355, term1355.getClass(), "next", term1357);
        setIntField(term1372, term1372.getClass(), "type", 0);
        setField(term1372, term1372.getClass(), "next", null);
        setField(term1372, term1372.getClass(), "first", null);
        setField(term1372, term1372.getClass(), "last", null);
        setField(term1372, term1372.getClass(), "propListHead", null);
        setIntField(term1372, term1372.getClass(), "sourcePosition", 0);
        setField(term1372, term1372.getClass(), "jsType", null);
        setField(term1372, term1372.getClass(), "parent", null);
        setField(term1355, term1355.getClass(), "first", term1372);
        setIntField(term1375, term1375.getClass(), "type", 0);
        setField(term1375, term1375.getClass(), "next", null);
        setField(term1375, term1375.getClass(), "first", null);
        setField(term1375, term1375.getClass(), "last", null);
        setField(term1375, term1375.getClass(), "propListHead", null);
        setIntField(term1375, term1375.getClass(), "sourcePosition", 0);
        setField(term1375, term1375.getClass(), "jsType", null);
        setField(term1375, term1375.getClass(), "parent", null);
        setField(term1355, term1355.getClass(), "last", term1375);
        setField(term1378, term1378.getClass(), "next", null);
        setIntField(term1378, term1378.getClass(), "type", 0);
        setIntField(term1378, term1378.getClass(), "intValue", 0);
        setField(term1378, term1378.getClass(), "objectValue", null);
        setField(term1355, term1355.getClass(), "propListHead", term1378);
        setIntField(term1355, term1355.getClass(), "sourcePosition", -1465035361);
        setField(term1355, term1355.getClass(), "jsType", null);
        setField(term1355, term1355.getClass(), "parent", null);
        term1382 = new Integer(1090617576);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1355;
        args[1] = term1382;
        try {
            callMethod(klass, "addExpr", argTypes, term1354, args);
            assertTrue(false);
        }
        catch (Error e) {
        }

    }

};


