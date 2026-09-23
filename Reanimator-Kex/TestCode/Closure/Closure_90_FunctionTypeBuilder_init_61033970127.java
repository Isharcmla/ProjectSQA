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
import java.lang.Object;
import java.util.HashMap;

public class FunctionTypeBuilder_init_61033970127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13;
     Object term52;

    public FunctionTypeBuilder_init_61033970127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term30 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term13, term13.getClass(), "type", 391863371);
        setIntField(term15, term15.getClass(), "type", -2038273078);
        setIntField(term17, term17.getClass(), "type", 0);
        setField(term17, term17.getClass(), "next", null);
        setField(term17, term17.getClass(), "first", null);
        setField(term17, term17.getClass(), "last", null);
        setField(term17, term17.getClass(), "propListHead", null);
        setIntField(term17, term17.getClass(), "sourcePosition", 0);
        setField(term17, term17.getClass(), "jsType", null);
        setField(term17, term17.getClass(), "parent", null);
        setField(term15, term15.getClass(), "next", term17);
        setIntField(term20, term20.getClass(), "type", 0);
        setField(term20, term20.getClass(), "next", null);
        setField(term20, term20.getClass(), "first", null);
        setField(term20, term20.getClass(), "last", null);
        setField(term20, term20.getClass(), "propListHead", null);
        setIntField(term20, term20.getClass(), "sourcePosition", 0);
        setField(term20, term20.getClass(), "jsType", null);
        setField(term20, term20.getClass(), "parent", null);
        setField(term15, term15.getClass(), "first", term20);
        setIntField(term23, term23.getClass(), "type", 0);
        setField(term23, term23.getClass(), "next", null);
        setField(term23, term23.getClass(), "first", null);
        setField(term23, term23.getClass(), "last", null);
        setField(term23, term23.getClass(), "propListHead", null);
        setIntField(term23, term23.getClass(), "sourcePosition", 0);
        setField(term23, term23.getClass(), "jsType", null);
        setField(term23, term23.getClass(), "parent", null);
        setField(term15, term15.getClass(), "last", term23);
        setField(term26, term26.getClass(), "next", null);
        setIntField(term26, term26.getClass(), "type", 0);
        setIntField(term26, term26.getClass(), "intValue", 0);
        setField(term26, term26.getClass(), "objectValue", null);
        setField(term15, term15.getClass(), "propListHead", term26);
        setIntField(term15, term15.getClass(), "sourcePosition", 1725571209);
        setField(term15, term15.getClass(), "jsType", null);
        setField(term15, term15.getClass(), "parent", null);
        setField(term13, term13.getClass(), "next", term15);
        setIntField(term30, term30.getClass(), "type", 0);
        setField(term30, term30.getClass(), "next", null);
        setField(term30, term30.getClass(), "first", null);
        setField(term30, term30.getClass(), "last", null);
        setField(term30, term30.getClass(), "propListHead", null);
        setIntField(term30, term30.getClass(), "sourcePosition", 0);
        setField(term30, term30.getClass(), "jsType", null);
        setField(term30, term30.getClass(), "parent", null);
        setField(term13, term13.getClass(), "first", term30);
        setIntField(term33, term33.getClass(), "type", 0);
        setField(term33, term33.getClass(), "next", null);
        setField(term33, term33.getClass(), "first", null);
        setField(term33, term33.getClass(), "last", null);
        setField(term33, term33.getClass(), "propListHead", null);
        setIntField(term33, term33.getClass(), "sourcePosition", 0);
        setField(term33, term33.getClass(), "jsType", null);
        setField(term33, term33.getClass(), "parent", null);
        setField(term13, term13.getClass(), "last", term33);
        setField(term36, term36.getClass(), "next", null);
        setIntField(term36, term36.getClass(), "type", 0);
        setIntField(term36, term36.getClass(), "intValue", 0);
        setField(term36, term36.getClass(), "objectValue", null);
        setField(term13, term13.getClass(), "propListHead", term36);
        setIntField(term13, term13.getClass(), "sourcePosition", -522618178);
        setField(term13, term13.getClass(), "jsType", null);
        setField(term13, term13.getClass(), "parent", null);
        HashMap term53 = new HashMap();
        term52 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term66 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term68 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term52, term52.getClass(), "vars", term53);
        setField(term66, term66.getClass(), "vars", null);
        setField(term66, term66.getClass(), "parent", null);
        setField(term66, term66.getClass(), "rootNode", null);
        setField(term66, term66.getClass(), "thisType", null);
        setBooleanField(term66, term66.getClass(), "isBottom", false);
        setField(term52, term52.getClass(), "parent", term66);
        setIntField(term68, term68.getClass(), "type", 0);
        setField(term68, term68.getClass(), "next", null);
        setField(term68, term68.getClass(), "first", null);
        setField(term68, term68.getClass(), "last", null);
        setField(term68, term68.getClass(), "propListHead", null);
        setIntField(term68, term68.getClass(), "sourcePosition", 0);
        setField(term68, term68.getClass(), "jsType", null);
        setField(term68, term68.getClass(), "parent", null);
        setField(term52, term52.getClass(), "rootNode", term68);
        setField(term52, term52.getClass(), "thisType", null);
        setBooleanField(term52, term52.getClass(), "isBottom", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[5];
        args[0] = "PAEBtnZtTD";
        args[1] = null;
        args[2] = term13;
        args[3] = "sjlJAEtRrb";
        args[4] = term52;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


