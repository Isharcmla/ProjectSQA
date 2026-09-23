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
import java.lang.Integer;
import java.lang.String;

public class CodeGenerator_addExpr_50800799147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1751;
     Object term1762;
     Object term1789;
     Object enum13;

    public CodeGenerator_addExpr_50800799147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1752 = new HashMap();
        term1751 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term1751, term1751.getClass(), "ESCAPED_JS_STRINGS", term1752);
        setField(term1751, term1751.getClass(), "cc", null);
        setField(term1751, term1751.getClass(), "outputCharsetEncoder", null);
        term1762 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1764 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1766 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1768 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1770 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1773 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1777 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1779 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1784 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1762, term1762.getClass(), "type", -2095575670);
        setIntField(term1764, term1764.getClass(), "type", 1225272962);
        setIntField(term1766, term1766.getClass(), "type", 1324040357);
        setIntField(term1768, term1768.getClass(), "type", -1588772968);
        setIntField(term1770, term1770.getClass(), "type", -93135961);
        setField(term1770, term1770.getClass(), "next", null);
        setField(term1770, term1770.getClass(), "first", null);
        setField(term1770, term1770.getClass(), "last", null);
        setField(term1770, term1770.getClass(), "propListHead", null);
        setIntField(term1770, term1770.getClass(), "sourcePosition", 0);
        setField(term1770, term1770.getClass(), "jsType", null);
        setField(term1770, term1770.getClass(), "parent", null);
        setField(term1768, term1768.getClass(), "next", term1770);
        setIntField(term1773, term1773.getClass(), "type", -112921587);
        setField(term1773, term1773.getClass(), "next", null);
        setField(term1773, term1773.getClass(), "first", null);
        setField(term1773, term1773.getClass(), "last", term1770);
        setField(term1773, term1773.getClass(), "propListHead", null);
        setIntField(term1773, term1773.getClass(), "sourcePosition", 0);
        setField(term1773, term1773.getClass(), "jsType", null);
        setField(term1773, term1773.getClass(), "parent", null);
        setField(term1768, term1768.getClass(), "first", term1773);
        setField(term1768, term1768.getClass(), "last", term1766);
        setField(term1768, term1768.getClass(), "propListHead", null);
        setIntField(term1768, term1768.getClass(), "sourcePosition", 0);
        setField(term1768, term1768.getClass(), "jsType", null);
        setField(term1768, term1768.getClass(), "parent", null);
        setField(term1766, term1766.getClass(), "next", term1768);
        setField(term1766, term1766.getClass(), "first", term1770);
        setIntField(term1777, term1777.getClass(), "type", 287287233);
        setIntField(term1779, term1779.getClass(), "type", 962840079);
        setField(term1779, term1779.getClass(), "next", null);
        setField(term1779, term1779.getClass(), "first", term1773);
        setField(term1779, term1779.getClass(), "last", term1768);
        setField(term1779, term1779.getClass(), "propListHead", null);
        setIntField(term1779, term1779.getClass(), "sourcePosition", 0);
        setField(term1779, term1779.getClass(), "jsType", null);
        setField(term1779, term1779.getClass(), "parent", null);
        setField(term1777, term1777.getClass(), "next", term1779);
        setField(term1777, term1777.getClass(), "first", term1764);
        setField(term1777, term1777.getClass(), "last", term1764);
        setField(term1777, term1777.getClass(), "propListHead", null);
        setIntField(term1777, term1777.getClass(), "sourcePosition", 0);
        setField(term1777, term1777.getClass(), "jsType", null);
        setField(term1777, term1777.getClass(), "parent", null);
        setField(term1766, term1766.getClass(), "last", term1777);
        setField(term1766, term1766.getClass(), "propListHead", null);
        setIntField(term1766, term1766.getClass(), "sourcePosition", 0);
        setField(term1766, term1766.getClass(), "jsType", null);
        setField(term1766, term1766.getClass(), "parent", null);
        setField(term1764, term1764.getClass(), "next", term1766);
        setIntField(term1784, term1784.getClass(), "type", 1540719661);
        setField(term1784, term1784.getClass(), "next", term1777);
        setField(term1784, term1784.getClass(), "first", term1779);
        setField(term1784, term1784.getClass(), "last", term1762);
        setField(term1784, term1784.getClass(), "propListHead", null);
        setIntField(term1784, term1784.getClass(), "sourcePosition", 0);
        setField(term1784, term1784.getClass(), "jsType", null);
        setField(term1784, term1784.getClass(), "parent", null);
        setField(term1764, term1764.getClass(), "first", term1784);
        setField(term1764, term1764.getClass(), "last", term1784);
        setField(term1764, term1764.getClass(), "propListHead", null);
        setIntField(term1764, term1764.getClass(), "sourcePosition", 0);
        setField(term1764, term1764.getClass(), "jsType", null);
        setField(term1764, term1764.getClass(), "parent", null);
        setField(term1762, term1762.getClass(), "next", term1764);
        setField(term1762, term1762.getClass(), "first", term1768);
        setField(term1762, term1762.getClass(), "last", term1770);
        setField(term1762, term1762.getClass(), "propListHead", null);
        setIntField(term1762, term1762.getClass(), "sourcePosition", 0);
        setField(term1762, term1762.getClass(), "jsType", null);
        setField(term1762, term1762.getClass(), "parent", null);
        term1789 = new Integer(1265463001);
        Class<? extends Object> term7558 = Class.forName((String) "com.google.javascript.jscomp.CodeGenerator$Context");
        Field term7557 = ((Class) term7558).getDeclaredField((String) "PRESERVE_BLOCK");
        ((Field) term7557).setAccessible(true);
        enum13 = ((Field) term7557).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Object[] args = new Object[3];
        args[0] = term1762;
        args[1] = term1789;
        args[2] = enum13;
        try {
            callMethod(klass, "addExpr", argTypes, term1751, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


