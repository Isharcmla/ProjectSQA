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
     Object term1883;
     Object term1894;
     Object term1921;
     Object enum12;

    public CodeGenerator_addList_69461977652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1884 = new HashMap();
        term1883 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term1883, term1883.getClass(), "ESCAPED_JS_STRINGS", term1884);
        setField(term1883, term1883.getClass(), "cc", null);
        setField(term1883, term1883.getClass(), "outputCharsetEncoder", null);
        term1894 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1896 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1898 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1901 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1904 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1907 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1911 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1914 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1917 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1894, term1894.getClass(), "type", -375014958);
        setIntField(term1896, term1896.getClass(), "type", -2015854073);
        setIntField(term1898, term1898.getClass(), "type", 0);
        setField(term1898, term1898.getClass(), "next", null);
        setField(term1898, term1898.getClass(), "first", null);
        setField(term1898, term1898.getClass(), "last", null);
        setField(term1898, term1898.getClass(), "propListHead", null);
        setIntField(term1898, term1898.getClass(), "sourcePosition", 0);
        setField(term1898, term1898.getClass(), "jsType", null);
        setField(term1898, term1898.getClass(), "parent", null);
        setField(term1896, term1896.getClass(), "next", term1898);
        setIntField(term1901, term1901.getClass(), "type", 0);
        setField(term1901, term1901.getClass(), "next", null);
        setField(term1901, term1901.getClass(), "first", null);
        setField(term1901, term1901.getClass(), "last", null);
        setField(term1901, term1901.getClass(), "propListHead", null);
        setIntField(term1901, term1901.getClass(), "sourcePosition", 0);
        setField(term1901, term1901.getClass(), "jsType", null);
        setField(term1901, term1901.getClass(), "parent", null);
        setField(term1896, term1896.getClass(), "first", term1901);
        setIntField(term1904, term1904.getClass(), "type", 0);
        setField(term1904, term1904.getClass(), "next", null);
        setField(term1904, term1904.getClass(), "first", null);
        setField(term1904, term1904.getClass(), "last", null);
        setField(term1904, term1904.getClass(), "propListHead", null);
        setIntField(term1904, term1904.getClass(), "sourcePosition", 0);
        setField(term1904, term1904.getClass(), "jsType", null);
        setField(term1904, term1904.getClass(), "parent", null);
        setField(term1896, term1896.getClass(), "last", term1904);
        setField(term1907, term1907.getClass(), "next", null);
        setIntField(term1907, term1907.getClass(), "type", 0);
        setIntField(term1907, term1907.getClass(), "intValue", 0);
        setField(term1907, term1907.getClass(), "objectValue", null);
        setField(term1896, term1896.getClass(), "propListHead", term1907);
        setIntField(term1896, term1896.getClass(), "sourcePosition", -343325701);
        setField(term1896, term1896.getClass(), "jsType", null);
        setField(term1896, term1896.getClass(), "parent", null);
        setField(term1894, term1894.getClass(), "next", term1896);
        setIntField(term1911, term1911.getClass(), "type", 0);
        setField(term1911, term1911.getClass(), "next", null);
        setField(term1911, term1911.getClass(), "first", null);
        setField(term1911, term1911.getClass(), "last", null);
        setField(term1911, term1911.getClass(), "propListHead", null);
        setIntField(term1911, term1911.getClass(), "sourcePosition", 0);
        setField(term1911, term1911.getClass(), "jsType", null);
        setField(term1911, term1911.getClass(), "parent", null);
        setField(term1894, term1894.getClass(), "first", term1911);
        setIntField(term1914, term1914.getClass(), "type", 0);
        setField(term1914, term1914.getClass(), "next", null);
        setField(term1914, term1914.getClass(), "first", null);
        setField(term1914, term1914.getClass(), "last", null);
        setField(term1914, term1914.getClass(), "propListHead", null);
        setIntField(term1914, term1914.getClass(), "sourcePosition", 0);
        setField(term1914, term1914.getClass(), "jsType", null);
        setField(term1914, term1914.getClass(), "parent", null);
        setField(term1894, term1894.getClass(), "last", term1914);
        setField(term1917, term1917.getClass(), "next", null);
        setIntField(term1917, term1917.getClass(), "type", 0);
        setIntField(term1917, term1917.getClass(), "intValue", 0);
        setField(term1917, term1917.getClass(), "objectValue", null);
        setField(term1894, term1894.getClass(), "propListHead", term1917);
        setIntField(term1894, term1894.getClass(), "sourcePosition", 107945604);
        setField(term1894, term1894.getClass(), "jsType", null);
        setField(term1894, term1894.getClass(), "parent", null);
        term1921 = new Boolean(false);
        Class<? extends Object> term8836 = Class.forName((String) "com.google.javascript.jscomp.CodeGenerator$Context");
        Field term8835 = ((Class) term8836).getDeclaredField((String) "PRESERVE_BLOCK");
        ((Field) term8835).setAccessible(true);
        enum12 = ((Field) term8835).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Object[] args = new Object[3];
        args[0] = term1894;
        args[1] = term1921;
        args[2] = enum12;
        try {
            callMethod(klass, "addList", argTypes, term1883, args);
            assertTrue(false);
        }
        catch (Error e) {
        }

    }

};


