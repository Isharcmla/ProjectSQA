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
import java.lang.Boolean;
import java.lang.String;

public class CodeGenerator_addList_69461977652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1823;
     Object term1834;
     Object term1855;
     Object enum12;

    public CodeGenerator_addList_69461977652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1824 = new HashMap();
        term1823 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term1823, term1823.getClass(), "ESCAPED_JS_STRINGS", term1824);
        setField(term1823, term1823.getClass(), "cc", null);
        setField(term1823, term1823.getClass(), "outputCharsetEncoder", null);
        term1834 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1836 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1838 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1841 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1844 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1848 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1851 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1834, term1834.getClass(), "type", -663691365);
        setIntField(term1836, term1836.getClass(), "type", -341962980);
        setIntField(term1838, term1838.getClass(), "type", 0);
        setField(term1838, term1838.getClass(), "next", null);
        setField(term1838, term1838.getClass(), "first", null);
        setField(term1838, term1838.getClass(), "last", null);
        setField(term1838, term1838.getClass(), "propListHead", null);
        setIntField(term1838, term1838.getClass(), "sourcePosition", 0);
        setField(term1838, term1838.getClass(), "jsType", null);
        setField(term1838, term1838.getClass(), "parent", null);
        setField(term1836, term1836.getClass(), "next", term1838);
        setIntField(term1841, term1841.getClass(), "type", 0);
        setField(term1841, term1841.getClass(), "next", null);
        setField(term1841, term1841.getClass(), "first", null);
        setField(term1841, term1841.getClass(), "last", null);
        setField(term1841, term1841.getClass(), "propListHead", null);
        setIntField(term1841, term1841.getClass(), "sourcePosition", 0);
        setField(term1841, term1841.getClass(), "jsType", null);
        setField(term1841, term1841.getClass(), "parent", null);
        setField(term1836, term1836.getClass(), "first", term1841);
        setIntField(term1844, term1844.getClass(), "type", 0);
        setField(term1844, term1844.getClass(), "next", null);
        setField(term1844, term1844.getClass(), "first", null);
        setField(term1844, term1844.getClass(), "last", null);
        setField(term1844, term1844.getClass(), "propListHead", null);
        setIntField(term1844, term1844.getClass(), "sourcePosition", 0);
        setField(term1844, term1844.getClass(), "jsType", null);
        setField(term1844, term1844.getClass(), "parent", null);
        setField(term1836, term1836.getClass(), "last", term1844);
        setField(term1836, term1836.getClass(), "propListHead", null);
        setIntField(term1836, term1836.getClass(), "sourcePosition", 0);
        setField(term1836, term1836.getClass(), "jsType", null);
        setField(term1836, term1836.getClass(), "parent", null);
        setField(term1834, term1834.getClass(), "next", term1836);
        setIntField(term1848, term1848.getClass(), "type", 0);
        setField(term1848, term1848.getClass(), "next", null);
        setField(term1848, term1848.getClass(), "first", null);
        setField(term1848, term1848.getClass(), "last", null);
        setField(term1848, term1848.getClass(), "propListHead", null);
        setIntField(term1848, term1848.getClass(), "sourcePosition", 0);
        setField(term1848, term1848.getClass(), "jsType", null);
        setField(term1848, term1848.getClass(), "parent", null);
        setField(term1834, term1834.getClass(), "first", term1848);
        setIntField(term1851, term1851.getClass(), "type", 0);
        setField(term1851, term1851.getClass(), "next", null);
        setField(term1851, term1851.getClass(), "first", null);
        setField(term1851, term1851.getClass(), "last", null);
        setField(term1851, term1851.getClass(), "propListHead", null);
        setIntField(term1851, term1851.getClass(), "sourcePosition", 0);
        setField(term1851, term1851.getClass(), "jsType", null);
        setField(term1851, term1851.getClass(), "parent", null);
        setField(term1834, term1834.getClass(), "last", term1851);
        setField(term1834, term1834.getClass(), "propListHead", null);
        setIntField(term1834, term1834.getClass(), "sourcePosition", 0);
        setField(term1834, term1834.getClass(), "jsType", null);
        setField(term1834, term1834.getClass(), "parent", null);
        term1855 = new Boolean(false);
        Class<? extends Object> term8663 = Class.forName((String) "com.google.javascript.jscomp.CodeGenerator$Context");
        Field term8662 = ((Class) term8663).getDeclaredField((String) "PRESERVE_BLOCK");
        ((Field) term8662).setAccessible(true);
        enum12 = ((Field) term8662).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Object[] args = new Object[3];
        args[0] = term1834;
        args[1] = term1855;
        args[2] = enum12;
        try {
            callMethod(klass, "addList", argTypes, term1823, args);
            assertTrue(false);
        }
        catch (Error e) {
        }

    }

};


