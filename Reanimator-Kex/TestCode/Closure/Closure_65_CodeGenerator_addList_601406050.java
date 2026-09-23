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

public class CodeGenerator_addList_601406050 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1805;
     Object term1816;

    public CodeGenerator_addList_601406050() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1806 = new HashMap();
        term1805 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term1805, term1805.getClass(), "ESCAPED_JS_STRINGS", term1806);
        setField(term1805, term1805.getClass(), "cc", null);
        setField(term1805, term1805.getClass(), "outputCharsetEncoder", null);
        term1816 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1818 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1820 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1823 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1826 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1829 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1833 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1836 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1839 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1816, term1816.getClass(), "type", 683666002);
        setIntField(term1818, term1818.getClass(), "type", -663691365);
        setIntField(term1820, term1820.getClass(), "type", 0);
        setField(term1820, term1820.getClass(), "next", null);
        setField(term1820, term1820.getClass(), "first", null);
        setField(term1820, term1820.getClass(), "last", null);
        setField(term1820, term1820.getClass(), "propListHead", null);
        setIntField(term1820, term1820.getClass(), "sourcePosition", 0);
        setField(term1820, term1820.getClass(), "jsType", null);
        setField(term1820, term1820.getClass(), "parent", null);
        setField(term1818, term1818.getClass(), "next", term1820);
        setIntField(term1823, term1823.getClass(), "type", 0);
        setField(term1823, term1823.getClass(), "next", null);
        setField(term1823, term1823.getClass(), "first", null);
        setField(term1823, term1823.getClass(), "last", null);
        setField(term1823, term1823.getClass(), "propListHead", null);
        setIntField(term1823, term1823.getClass(), "sourcePosition", 0);
        setField(term1823, term1823.getClass(), "jsType", null);
        setField(term1823, term1823.getClass(), "parent", null);
        setField(term1818, term1818.getClass(), "first", term1823);
        setIntField(term1826, term1826.getClass(), "type", 0);
        setField(term1826, term1826.getClass(), "next", null);
        setField(term1826, term1826.getClass(), "first", null);
        setField(term1826, term1826.getClass(), "last", null);
        setField(term1826, term1826.getClass(), "propListHead", null);
        setIntField(term1826, term1826.getClass(), "sourcePosition", 0);
        setField(term1826, term1826.getClass(), "jsType", null);
        setField(term1826, term1826.getClass(), "parent", null);
        setField(term1818, term1818.getClass(), "last", term1826);
        setField(term1829, term1829.getClass(), "next", null);
        setIntField(term1829, term1829.getClass(), "type", 0);
        setIntField(term1829, term1829.getClass(), "intValue", 0);
        setField(term1829, term1829.getClass(), "objectValue", null);
        setField(term1818, term1818.getClass(), "propListHead", term1829);
        setIntField(term1818, term1818.getClass(), "sourcePosition", -1476117762);
        setField(term1818, term1818.getClass(), "jsType", null);
        setField(term1818, term1818.getClass(), "parent", null);
        setField(term1816, term1816.getClass(), "next", term1818);
        setIntField(term1833, term1833.getClass(), "type", 0);
        setField(term1833, term1833.getClass(), "next", null);
        setField(term1833, term1833.getClass(), "first", null);
        setField(term1833, term1833.getClass(), "last", null);
        setField(term1833, term1833.getClass(), "propListHead", null);
        setIntField(term1833, term1833.getClass(), "sourcePosition", 0);
        setField(term1833, term1833.getClass(), "jsType", null);
        setField(term1833, term1833.getClass(), "parent", null);
        setField(term1816, term1816.getClass(), "first", term1833);
        setIntField(term1836, term1836.getClass(), "type", 0);
        setField(term1836, term1836.getClass(), "next", null);
        setField(term1836, term1836.getClass(), "first", null);
        setField(term1836, term1836.getClass(), "last", null);
        setField(term1836, term1836.getClass(), "propListHead", null);
        setIntField(term1836, term1836.getClass(), "sourcePosition", 0);
        setField(term1836, term1836.getClass(), "jsType", null);
        setField(term1836, term1836.getClass(), "parent", null);
        setField(term1816, term1816.getClass(), "last", term1836);
        setField(term1839, term1839.getClass(), "next", null);
        setIntField(term1839, term1839.getClass(), "type", 0);
        setIntField(term1839, term1839.getClass(), "intValue", 0);
        setField(term1839, term1839.getClass(), "objectValue", null);
        setField(term1816, term1816.getClass(), "propListHead", term1839);
        setIntField(term1816, term1816.getClass(), "sourcePosition", -341962980);
        setField(term1816, term1816.getClass(), "jsType", null);
        setField(term1816, term1816.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1816;
        try {
            callMethod(klass, "addList", argTypes, term1805, args);
            assertTrue(false);
        }
        catch (Error e) {
        }

    }

};


