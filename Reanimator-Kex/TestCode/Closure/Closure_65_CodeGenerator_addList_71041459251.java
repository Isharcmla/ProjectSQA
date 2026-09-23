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

public class CodeGenerator_addList_71041459251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1843;
     Object term1854;
     Object term1881;

    public CodeGenerator_addList_71041459251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1844 = new HashMap();
        term1843 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term1843, term1843.getClass(), "ESCAPED_JS_STRINGS", term1844);
        setField(term1843, term1843.getClass(), "cc", null);
        setField(term1843, term1843.getClass(), "outputCharsetEncoder", null);
        term1854 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1856 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1858 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1861 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1864 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1867 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1871 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1874 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1877 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1854, term1854.getClass(), "type", 890669485);
        setIntField(term1856, term1856.getClass(), "type", 906181092);
        setIntField(term1858, term1858.getClass(), "type", 0);
        setField(term1858, term1858.getClass(), "next", null);
        setField(term1858, term1858.getClass(), "first", null);
        setField(term1858, term1858.getClass(), "last", null);
        setField(term1858, term1858.getClass(), "propListHead", null);
        setIntField(term1858, term1858.getClass(), "sourcePosition", 0);
        setField(term1858, term1858.getClass(), "jsType", null);
        setField(term1858, term1858.getClass(), "parent", null);
        setField(term1856, term1856.getClass(), "next", term1858);
        setIntField(term1861, term1861.getClass(), "type", 0);
        setField(term1861, term1861.getClass(), "next", null);
        setField(term1861, term1861.getClass(), "first", null);
        setField(term1861, term1861.getClass(), "last", null);
        setField(term1861, term1861.getClass(), "propListHead", null);
        setIntField(term1861, term1861.getClass(), "sourcePosition", 0);
        setField(term1861, term1861.getClass(), "jsType", null);
        setField(term1861, term1861.getClass(), "parent", null);
        setField(term1856, term1856.getClass(), "first", term1861);
        setIntField(term1864, term1864.getClass(), "type", 0);
        setField(term1864, term1864.getClass(), "next", null);
        setField(term1864, term1864.getClass(), "first", null);
        setField(term1864, term1864.getClass(), "last", null);
        setField(term1864, term1864.getClass(), "propListHead", null);
        setIntField(term1864, term1864.getClass(), "sourcePosition", 0);
        setField(term1864, term1864.getClass(), "jsType", null);
        setField(term1864, term1864.getClass(), "parent", null);
        setField(term1856, term1856.getClass(), "last", term1864);
        setField(term1867, term1867.getClass(), "next", null);
        setIntField(term1867, term1867.getClass(), "type", 0);
        setIntField(term1867, term1867.getClass(), "intValue", 0);
        setField(term1867, term1867.getClass(), "objectValue", null);
        setField(term1856, term1856.getClass(), "propListHead", term1867);
        setIntField(term1856, term1856.getClass(), "sourcePosition", 1072005683);
        setField(term1856, term1856.getClass(), "jsType", null);
        setField(term1856, term1856.getClass(), "parent", null);
        setField(term1854, term1854.getClass(), "next", term1856);
        setIntField(term1871, term1871.getClass(), "type", 0);
        setField(term1871, term1871.getClass(), "next", null);
        setField(term1871, term1871.getClass(), "first", null);
        setField(term1871, term1871.getClass(), "last", null);
        setField(term1871, term1871.getClass(), "propListHead", null);
        setIntField(term1871, term1871.getClass(), "sourcePosition", 0);
        setField(term1871, term1871.getClass(), "jsType", null);
        setField(term1871, term1871.getClass(), "parent", null);
        setField(term1854, term1854.getClass(), "first", term1871);
        setIntField(term1874, term1874.getClass(), "type", 0);
        setField(term1874, term1874.getClass(), "next", null);
        setField(term1874, term1874.getClass(), "first", null);
        setField(term1874, term1874.getClass(), "last", null);
        setField(term1874, term1874.getClass(), "propListHead", null);
        setIntField(term1874, term1874.getClass(), "sourcePosition", 0);
        setField(term1874, term1874.getClass(), "jsType", null);
        setField(term1874, term1874.getClass(), "parent", null);
        setField(term1854, term1854.getClass(), "last", term1874);
        setField(term1877, term1877.getClass(), "next", null);
        setIntField(term1877, term1877.getClass(), "type", 0);
        setIntField(term1877, term1877.getClass(), "intValue", 0);
        setField(term1877, term1877.getClass(), "objectValue", null);
        setField(term1854, term1854.getClass(), "propListHead", term1877);
        setIntField(term1854, term1854.getClass(), "sourcePosition", 1861318859);
        setField(term1854, term1854.getClass(), "jsType", null);
        setField(term1854, term1854.getClass(), "parent", null);
        term1881 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term1854;
        args[1] = term1881;
        try {
            callMethod(klass, "addList", argTypes, term1843, args);
            assertTrue(false);
        }
        catch (Error e) {
        }

    }

};


