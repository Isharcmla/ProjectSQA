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
import java.lang.Integer;

public class CodeGenerator_addExpr_89705613748 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1408;
     Object term1419;
     Object term1440;

    public CodeGenerator_addExpr_89705613748() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1409 = new HashMap();
        term1408 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term1408, term1408.getClass(), "ESCAPED_JS_STRINGS", term1409);
        setField(term1408, term1408.getClass(), "cc", null);
        setField(term1408, term1408.getClass(), "outputCharsetEncoder", null);
        term1419 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1421 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1423 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1426 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1429 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1433 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1436 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1419, term1419.getClass(), "type", 1225272962);
        setIntField(term1421, term1421.getClass(), "type", -112921587);
        setIntField(term1423, term1423.getClass(), "type", 0);
        setField(term1423, term1423.getClass(), "next", null);
        setField(term1423, term1423.getClass(), "first", null);
        setField(term1423, term1423.getClass(), "last", null);
        setField(term1423, term1423.getClass(), "propListHead", null);
        setIntField(term1423, term1423.getClass(), "sourcePosition", 0);
        setField(term1423, term1423.getClass(), "jsType", null);
        setField(term1423, term1423.getClass(), "parent", null);
        setField(term1421, term1421.getClass(), "next", term1423);
        setIntField(term1426, term1426.getClass(), "type", 0);
        setField(term1426, term1426.getClass(), "next", null);
        setField(term1426, term1426.getClass(), "first", null);
        setField(term1426, term1426.getClass(), "last", null);
        setField(term1426, term1426.getClass(), "propListHead", null);
        setIntField(term1426, term1426.getClass(), "sourcePosition", 0);
        setField(term1426, term1426.getClass(), "jsType", null);
        setField(term1426, term1426.getClass(), "parent", null);
        setField(term1421, term1421.getClass(), "first", term1426);
        setIntField(term1429, term1429.getClass(), "type", 0);
        setField(term1429, term1429.getClass(), "next", null);
        setField(term1429, term1429.getClass(), "first", null);
        setField(term1429, term1429.getClass(), "last", null);
        setField(term1429, term1429.getClass(), "propListHead", null);
        setIntField(term1429, term1429.getClass(), "sourcePosition", 0);
        setField(term1429, term1429.getClass(), "jsType", null);
        setField(term1429, term1429.getClass(), "parent", null);
        setField(term1421, term1421.getClass(), "last", term1429);
        setField(term1421, term1421.getClass(), "propListHead", null);
        setIntField(term1421, term1421.getClass(), "sourcePosition", 0);
        setField(term1421, term1421.getClass(), "jsType", null);
        setField(term1421, term1421.getClass(), "parent", null);
        setField(term1419, term1419.getClass(), "next", term1421);
        setIntField(term1433, term1433.getClass(), "type", 0);
        setField(term1433, term1433.getClass(), "next", null);
        setField(term1433, term1433.getClass(), "first", null);
        setField(term1433, term1433.getClass(), "last", null);
        setField(term1433, term1433.getClass(), "propListHead", null);
        setIntField(term1433, term1433.getClass(), "sourcePosition", 0);
        setField(term1433, term1433.getClass(), "jsType", null);
        setField(term1433, term1433.getClass(), "parent", null);
        setField(term1419, term1419.getClass(), "first", term1433);
        setIntField(term1436, term1436.getClass(), "type", 0);
        setField(term1436, term1436.getClass(), "next", null);
        setField(term1436, term1436.getClass(), "first", null);
        setField(term1436, term1436.getClass(), "last", null);
        setField(term1436, term1436.getClass(), "propListHead", null);
        setIntField(term1436, term1436.getClass(), "sourcePosition", 0);
        setField(term1436, term1436.getClass(), "jsType", null);
        setField(term1436, term1436.getClass(), "parent", null);
        setField(term1419, term1419.getClass(), "last", term1436);
        setField(term1419, term1419.getClass(), "propListHead", null);
        setIntField(term1419, term1419.getClass(), "sourcePosition", 0);
        setField(term1419, term1419.getClass(), "jsType", null);
        setField(term1419, term1419.getClass(), "parent", null);
        term1440 = new Integer(962840079);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1419;
        args[1] = term1440;
        try {
            callMethod(klass, "addExpr", argTypes, term1408, args);
            assertTrue(false);
        }
        catch (Error e) {
        }

    }

};


